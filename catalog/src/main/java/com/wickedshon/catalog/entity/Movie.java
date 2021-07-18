package com.wickedshon.catalog.entity;

/**
 * @date: 7/17/2021
 * @author: wickedShon
 * Program description:
 * @param: Constraint:
 * Status: Incomplete
 * Solution time complexity:
 */

public class Movie {
   private int movieId;
   private String name;
   private String description;


   public Movie() {

   }

   public Movie(int movieId, String name, String description) {
      this.movieId = movieId;
      this.name = name;
      this.description = description;
   }

   public int getMovieId() {
      return movieId;
   }

   public void setMovieId(int movieId) {
      this.movieId = movieId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}
