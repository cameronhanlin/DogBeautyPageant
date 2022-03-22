package com.detroitlabs.DogBeautyPageant.data;

import com.detroitlabs.DogBeautyPageant.model.DogModel;
import com.detroitlabs.DogBeautyPageant.service.DogService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DogRepository {

    private DogService dogService = new DogService();
    private List<DogModel> dogRepository = Arrays.asList(
            dogService.fetchDogModel(),
            dogService.fetchDogModel(),
            dogService.fetchDogModel(),
            dogService.fetchDogModel(),
            dogService.fetchDogModel());


    /*public DogRepository(){
        dogRepository.add(dogService.fetchDogModel());
        dogRepository.add(dogService.fetchDogModel());
    }

     */

    public List<DogModel> getDogRepository(){
        return dogRepository;
    }

}
