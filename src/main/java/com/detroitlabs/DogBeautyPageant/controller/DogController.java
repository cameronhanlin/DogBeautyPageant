package com.detroitlabs.DogBeautyPageant.controller;

import com.detroitlabs.DogBeautyPageant.data.DogRepository;
import com.detroitlabs.DogBeautyPageant.model.DogModel;
import com.detroitlabs.DogBeautyPageant.service.DogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DogController {

    DogRepository dogRepository = new DogRepository();

    @RequestMapping("/")
    public String displayDog(ModelMap modelMap){
        //DogModel dogModel = dogService.fetchDogModel();
        modelMap.put("fiveDogModels", dogRepository.getDogRepository());
        return "home";
    }

}
