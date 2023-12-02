package br.senac.go.northwind.model;

import jakarta.persistence.*;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
