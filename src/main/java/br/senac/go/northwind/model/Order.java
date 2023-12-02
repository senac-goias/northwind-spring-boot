package br.senac.go.northwind.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    private Shipper shipper;

    //Forma 01
   // @ManyToMany
   // Set<Product> products = new HashSet<>();

    //FORMA 02
    /*@ManyToMany
    @JoinTable(
            name = "orders_products",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    Set<Product> products = new HashSet<>();*/

    //FORMA 03
    @OneToMany(mappedBy = "order")
    Set<OrderDetail> discounts = new HashSet<>();

}
