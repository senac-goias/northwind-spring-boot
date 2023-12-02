package br.senac.go.northwind.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

//FORMA 03
@Entity
@Table(name = "order_details")
public class OrderDetail {

    @EmbeddedId
    OrderProductKey id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    Order order;

    @Column(name = "unity_price")
    private BigDecimal unityPrice;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "discount")
    private BigDecimal discount;

}
