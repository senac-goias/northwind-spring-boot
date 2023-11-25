package br.senac.go.northwind.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @NotBlank
    @Column(name = "product_name", length = 40)
    private String name;

    //Relacionamento supplier

    //Relacionalmento category
    //para estudar: https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/


    @Column(length = 20)
    private String quantity_per_unit;

    private BigDecimal unit_price;

    private int units_in_stock;

    private int units_on_order;

    private int reorder_level;

    private boolean discontinued;
}

