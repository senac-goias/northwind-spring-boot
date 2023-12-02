package br.senac.go.northwind.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer_demographics")
public class CustomerDemographic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "customer_desc")
    private String description;

    //FORMA 02 /bi-direcional
    @ManyToMany(mappedBy = "customerDemographics")
    Set<Customer> customers = new HashSet<>();

}
