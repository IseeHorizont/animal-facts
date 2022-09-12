package ru.training.animalfacts.repository;

import org.springframework.data.repository.CrudRepository;
import ru.training.animalfacts.model.Animal;

import java.util.List;
import java.util.Optional;


public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
