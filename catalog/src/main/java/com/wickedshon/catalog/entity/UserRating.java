package com.wickedshon.catalog.entity;

import java.util.List;

/**
 * @date: 7/17/2021
 * @author: wickedShon
 * Program description:
 * @param: Constraint:
 * Status: Incomplete
 * Solution time complexity:
 */

public class UserRating {
   private String userId;
   private List<Rating> ratings;

   public UserRating() {

   }

   public UserRating(String userId, List<Rating> ratings) {
      this.userId = userId;
      this.ratings = ratings;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public List<Rating> getRatings() {
      return ratings;
   }

   public void setRatings(List<Rating> ratings) {
      this.ratings = ratings;
   }
}
