package br.senac.go.northwind.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(
            mappedBy = "employee",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<Order> orders = new ArrayList<>();

    @OneToMany(
            mappedBy = "employee",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<Employee> employees = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    //FORMA 02
    @ManyToMany
    @JoinTable(
            name = "employee_territories",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "territory_id")
    )
    Set<Territory> territories = new HashSet<>();
}
