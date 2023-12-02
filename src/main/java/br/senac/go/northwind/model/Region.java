package br.senac.go.northwind.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    @NotNull
    @Column(name = "region_description")
    private String description;

    @OneToMany(
            mappedBy = "region",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Territory> territories = new ArrayList<>();
}
