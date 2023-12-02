package br.senac.go.northwind.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.security.AllPermission;

@Entity
@Table(name = "territories")
public class Territory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @NotBlank
    @Column(name = "territory_description")
    private String description;

    //ManytoOne
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Region region;
}
