package com.wickedshon.catalog.controller;

import com.wickedshon.catalog.entity.Item;
import com.wickedshon.catalog.entity.Movie;
import com.wickedshon.catalog.entity.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @date: 7/17/2021
 * @author: wickedShon
 * Program description:
 * @param: Constraint:
 * Status: Incomplete
 * Solution time complexity:
 */

@RestController
@RequestMapping("/catalog")
public class CatalogController {


   @Autowired
   private RestTemplate restTemplate;

   @RequestMapping("/{userId}")
   public List<Item> getCatalog(@PathVariable("userId") int userId) {
      UserRating userRating = restTemplate.getForObject("http://ratings" +
         "/ratingsdata/user/" + userId, UserRating.class);

      return userRating
         .getRatings()
         .stream()
         .map(rating -> {
            Movie movie = restTemplate.getForObject("http://info/movies/" +
               rating.getMovieId(), Movie.class);
            return new Item(movie.getName(), movie.getDescription(), rating.getRating());
         })
         .collect(Collectors.toList());
   }
}
