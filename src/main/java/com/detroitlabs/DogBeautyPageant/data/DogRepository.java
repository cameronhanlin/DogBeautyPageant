package com.detroitlabs.DogBeautyPageant.data;

import com.detroitlabs.DogBeautyPageant.model.DogModel;
import com.detroitlabs.DogBeautyPageant.service.DogService;

import java.util.ArrayList;
import java.util.List;

public class DogRepository {

    private DogService dogService = new DogService();
    private ArrayList<ArrayList<DogModel>> dogRepository = new ArrayList<>();
    private int place = 0;


    public DogRepository() {

        for (int i = 0; i < 3; i++) {
            ArrayList<DogModel> choices = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                DogModel woof;
                do {
                    woof = (dogService.fetchDogModel());
                } while(!woof.getUrl().substring(woof.getUrl().length()-4).equals(".jpg"));
                 woof.setPlace(place);
                 place ++;
                 choices.add(woof);
            }
            dogRepository.add(choices);
            place = 0;
        }
    }

    public ArrayList<ArrayList<DogModel>> getDogRepository() {
        return dogRepository;
    }

}
