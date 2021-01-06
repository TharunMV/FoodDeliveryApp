package com.altimetrik.training.controller;

import com.altimetrik.training.model.Restaurant;
import com.altimetrik.training.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.altimetrik.training.Constants.*;


@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping(BASE_RESTAURANT_URI)
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping(GET_RESTAURANT_BY_ID_URI)
    public Optional<Restaurant> getRestaurant(@PathVariable Long restaurantId) {
        return restaurantService.getRestaurant(restaurantId);
    }

    @PostMapping(BASE_RESTAURANT_URI)
    @ResponseStatus(HttpStatus.CREATED)
    public void addRestaurant(@RequestBody Restaurant restaurant) {
        restaurantService.addOrUpdateRestaurant(restaurant);
    }

    @PutMapping(GET_RESTAURANT_BY_ID_URI)
    @ResponseStatus(HttpStatus.OK)
    public void updateRestaurant(@RequestBody Restaurant restaurant) {
        restaurantService.addOrUpdateRestaurant(restaurant);
    }

    @DeleteMapping(GET_RESTAURANT_BY_ID_URI)
    @ResponseStatus(HttpStatus.OK)
    public void deleteRestaurant(@PathVariable Long restaurantId) {
        restaurantService.deleteRestaurant(restaurantId);
    }
}
