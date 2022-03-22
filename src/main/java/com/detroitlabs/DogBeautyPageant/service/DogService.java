package com.detroitlabs.DogBeautyPageant.service;


import com.detroitlabs.DogBeautyPageant.model.DogModel;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DogService {


    public DogModel fetchDogModel(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://random.dog/woof.json"
                , DogModel.class);
    }

}
