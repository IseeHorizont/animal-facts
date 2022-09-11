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
    private String animal_type;

    @Column(name = "animal_habitat")
    private String animal_habitat;

    @Column(name = "diet")
    private String animal_diet;

    @Column(name = "geo_range")
    private String geo_range;

    @Column(name = "image-reference")
    private String image_reference;
}
