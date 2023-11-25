package br.senac.go.northwind.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "category_id")
    private Integer id;

    @Column(name = "category_name",
            length = 15)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private byte[] picture;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Product> products = new ArrayList<>();

}
