package com.swarg.controller;

import com.swarg.modal.Food;
import com.swarg.modal.Restaurant;
import com.swarg.modal.User;
import com.swarg.request.CreateFoodRequest;
import com.swarg.response.MessageResponse;
import com.swarg.service.FoodService;
import com.swarg.service.RestaurantService;
import com.swarg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/food")
public class AdminFoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("")
    public ResponseEntity<Food> createFood(@RequestBody CreateFoodRequest req,
                                           @RequestHeader("Authorization") String jwt)throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        Restaurant restaurant=restaurantService.getRestaurantByUserId(user.getId());
        Food food=foodService.createFood(req,req.getCategory(),restaurant);

        return  new ResponseEntity<>(food, HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageResponse> deleteFood(@PathVariable Long id,
                                           @RequestHeader("Authorization") String jwt)throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        foodService.deleteFood(id);
        MessageResponse messageResponse=new MessageResponse();
        messageResponse.setMessage("Food is deleted Successfully");

        return  new ResponseEntity<>(messageResponse, HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFoodAvailabilityStatus(@PathVariable Long id,
                                           @RequestHeader("Authorization") String jwt)throws Exception{
        User user=userService.findUserByJwtToken(jwt);
        Food food =foodService.updateAvailibilityStatus(id);

        return  new ResponseEntity<>(food, HttpStatus.CREATED);

    }
}
