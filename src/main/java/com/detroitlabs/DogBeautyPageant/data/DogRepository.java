package com.detroitlabs.DogBeautyPageant.data;

import com.detroitlabs.DogBeautyPageant.model.DogModel;
import com.detroitlabs.DogBeautyPageant.service.DogService;

import java.util.ArrayList;
import java.util.List;

public class DogRepository {

    private DogService dogService = new DogService();
    private ArrayList<ArrayList<DogModel>> dogRepository = new ArrayList<>();


    public DogRepository() {

        for (int i = 0; i < 3; i++) {
            ArrayList<DogModel> choices = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                choices.add(dogService.fetchDogModel());
            }
            dogRepository.add(choices);
        }
    }

    public ArrayList<ArrayList<DogModel>> getDogRepository() {
        return dogRepository;
    }

}
