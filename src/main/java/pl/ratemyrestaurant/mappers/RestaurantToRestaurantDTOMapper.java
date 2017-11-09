package pl.ratemyrestaurant.mappers;

import pl.ratemyrestaurant.dto.IngredientDTO;
import pl.ratemyrestaurant.dto.RestaurantDTO;
import pl.ratemyrestaurant.model.Ingredient;
import pl.ratemyrestaurant.model.Restaurant;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RestaurantToRestaurantDTOMapper {

    public static RestaurantDTO mapToRestaurantDto(Restaurant restaurant){
        RestaurantDTO restaurantDTO = new RestaurantDTO();
        restaurantDTO.setId(restaurant.getId());
        restaurantDTO.setName(restaurant.getName());
        restaurantDTO.setLocation(restaurant.getLocation());
        restaurantDTO.setFoodTypes(restaurant.getFoodTypes());
        return restaurantDTO;
    }

    public static Restaurant mapToRestaurant(RestaurantDTO restaurantDTO){
        Restaurant restaurant = new Restaurant();
        restaurant.setId(restaurantDTO.getId());
        restaurant.setName(restaurantDTO.getName());
        restaurant.setLocation(restaurantDTO.getLocation());
        restaurant.setFoodTypes(restaurantDTO.getFoodTypes());
        return restaurant;
    }

}
