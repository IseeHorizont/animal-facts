package ru.training.animalfacts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.training.animalfacts.model.Animal;
import ru.training.animalfacts.repository.AnimalRepository;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Animal findById(Long id) {
        // TODO how to work with Optional & null
        // TODO validation input data
        return animalRepository.findById(id).orElse(null);
    }

    public List<Animal> findAllAnimal() {
        // TODO what is Iterable<Animal> ?
        // TODO validation input data (if list == null)
        return (List<Animal>) animalRepository.findAll();
    }

    public Animal saveAnimal(Animal animal) {
        // TODO validation input data
        return animalRepository.save(animal);
    }

    public void deleteAnimalById(Long id) {
        // TODO validation input data
        animalRepository.deleteById(id);
    }
}
