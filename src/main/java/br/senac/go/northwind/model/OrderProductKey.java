package br.senac.go.northwind.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data //para implementar o hascode e equals
@Embeddable
//FORMA 03
public class OrderProductKey implements Serializable {

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "order_id")
    private Integer orderId;
}
