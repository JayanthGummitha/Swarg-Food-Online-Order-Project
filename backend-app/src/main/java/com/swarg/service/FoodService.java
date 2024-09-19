package com.swarg.service;

import com.swarg.modal.Category;
import com.swarg.modal.Food;
import com.swarg.modal.Restaurant;
import com.swarg.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId)throws Exception;

    public List<Food> getRestaurantsFood(Long restaurantsId,
                                         boolean isVegitarain,
                                         boolean isNonveg,
                                         boolean isSeasonal,
                                         String foodCategory);

    public List<Food> searchFood(String keyword);
    public Food findFoodById(Long foodId)throws Exception;

    public Food updateAvailibilityStatus(Long foodId)throws Exception;


}
