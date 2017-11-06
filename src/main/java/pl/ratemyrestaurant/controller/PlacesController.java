package pl.ratemyrestaurant.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacesController {

    @GetMapping(value = "/getPlacesInRadius",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPlacesInRadius(@RequestParam double lng,@RequestParam double lat,@RequestParam double radius, @RequestParam String type){
        return lng+" "+lat+" "+radius+" "+type;
    }
}