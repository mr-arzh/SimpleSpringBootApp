package org.simplespringbootapp.simplespringbootapp.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "country", schema = "world")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String region;


}
