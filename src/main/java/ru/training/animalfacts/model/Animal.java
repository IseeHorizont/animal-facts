package ru.training.animalfacts.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "animals")
@Data
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "animal_name")
    private String animalName;

    @Column(name = "animal_type")
    private String animalType;

    @Column(name = "animal_habitat")
    private String animalHabitat;

    @Column(name = "animal_diet")
    private String animalDiet;

    @Column(name = "geo_range")
    private String geoRange;

    @Column(name = "image_reference")
    private String imageReference;
}
