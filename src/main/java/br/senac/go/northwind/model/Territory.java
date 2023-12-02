package br.senac.go.northwind.model;

import jakarta.persistence.*;

@Entity
@Table(name = "territories")
public class Territory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
