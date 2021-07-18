package com.wickedshon.catalog.entity;

/**
 * @date: 7/17/2021
 * @author: wickedShon
 * Program description:
 * @param: Constraint:
 * Status: Incomplete
 * Solution time complexity:
 */

public class Item {
   private String name;
   private String description;
   private int rating;

   public Item() {

   }

   public Item(String name, String description, int rating) {
      this.name = name;
      this.description = description;
      this.rating = rating;
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

   public int getRating() {
      return rating;
   }

   public void setRating(int rating) {
      this.rating = rating;
   }
}
