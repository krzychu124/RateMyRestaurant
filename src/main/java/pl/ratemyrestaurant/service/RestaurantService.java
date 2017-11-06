package pl.ratemyrestaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ratemyrestaurant.dto.RestaurantDTO;
import pl.ratemyrestaurant.dto.RestaurantPIN;
import pl.ratemyrestaurant.model.Restaurant;
import pl.ratemyrestaurant.repository.RestaurantRepository;

@Service
public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void addRestaurant(RestaurantDTO restaurantDTO) {
        //todo: add body
    }

    public RestaurantDTO getRestaurantDTOById(String id) {
        return transformRestaurantToDTO(restaurantRepository.findOne(id));
    }

    private RestaurantDTO transformRestaurantToDTO(Restaurant restaurant) {
        RestaurantDTO restaurantDTO = new RestaurantDTO(restaurant);
        return restaurantDTO;
    }

    public RestaurantPIN getRestaurantPINById(String id) {
        return transformRestaurantToPIN(restaurantRepository.findOne(id));
    }

    private RestaurantPIN transformRestaurantToPIN(Restaurant restaurant) {
        RestaurantPIN restaurantPIN = new RestaurantPIN(restaurant);
        return restaurantPIN;
    }

}
