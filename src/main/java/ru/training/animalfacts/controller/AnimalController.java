package ru.training.animalfacts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import ru.training.animalfacts.model.Animal;
import ru.training.animalfacts.service.AnimalService;

import java.util.List;

@Controller
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping(value = "/animals")
    public String findAllAnimal(Model model) {
        List<Animal> animals = animalService.findAllAnimal();
        // TODO validation input data
        model.addAttribute("animals", animals);
        return "animal-list";
    }

    @GetMapping(value = "/create")
    public String createUserFormForSaveNewAnimal(Animal animal) {
        return "create";
    }

    @PostMapping (value = "/create")
    public String createAnimal(Animal animal) {
        // TODO validation input data
        animalService.saveAnimal(animal);
        return "redirect:/animals";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteAnimalById(@PathVariable("id") Long id) {
        // TODO validation input data
        animalService.deleteAnimalById(id);
        return "redirect:/animals";
    }
}
