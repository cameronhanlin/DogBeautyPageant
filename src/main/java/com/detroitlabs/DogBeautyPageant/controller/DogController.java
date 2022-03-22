package com.detroitlabs.DogBeautyPageant.controller;

import com.detroitlabs.DogBeautyPageant.data.DogRepository;
import com.detroitlabs.DogBeautyPageant.model.DogModel;
import com.detroitlabs.DogBeautyPageant.service.DogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class DogController {

    DogRepository dogRepository = new DogRepository();
    private ArrayList<Integer> allUserChoices = new ArrayList<>();


    @RequestMapping("/")
    public String displayDog(ModelMap modelMap){
        //DogModel dogModel = dogService.fetchDogModel();
        modelMap.put("firstRowDog", dogRepository.getDogRepository().get(0));
        return "home";
    }

    @RequestMapping("/secondRowDog/{firstRow}")
    public String displaySecond(@PathVariable int firstRow, ModelMap modelMap) {
        //DogModel dogModel = dogService.fetchDogModel();
        modelMap.put("secondRowDog", dogRepository.getDogRepository().get(1));
        allUserChoices.add(firstRow);
        return "secondchoice";
    }

    @RequestMapping("/thirdRowDog/{secondRow}")
    public String displayThird(@PathVariable int secondRow, ModelMap modelMap) {
        //DogModel dogModel = dogService.fetchDogModel();
        modelMap.put("thirdRowDog", dogRepository.getDogRepository().get(2));
        allUserChoices.add(secondRow);
        return "thirdchoice";
    }

    @RequestMapping("/finaloutput/{thirdRow}")
    public String displayFinal(@PathVariable int thirdRow, ModelMap modelMap) {
        //DogModel dogModel = dogService.fetchDogModel();
        allUserChoices.add(thirdRow);
        ArrayList<DogModel> userChoiceDogModels = new ArrayList<>();
        userChoiceDogModels.add(dogRepository.getDogRepository().get(0).get(allUserChoices.get(0)));
        userChoiceDogModels.add(dogRepository.getDogRepository().get(1).get(allUserChoices.get(1)));
        userChoiceDogModels.add(dogRepository.getDogRepository().get(2).get(allUserChoices.get(2)));
        modelMap.put("userChoiceKey", userChoiceDogModels);
        return "finaloutput";
    }
}
