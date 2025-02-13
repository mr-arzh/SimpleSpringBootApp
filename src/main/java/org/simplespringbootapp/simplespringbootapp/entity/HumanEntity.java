package org.simplespringbootapp.simplespringbootapp.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "humans", schema = "simple_dimple")
public class HumanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    private int age;


}
