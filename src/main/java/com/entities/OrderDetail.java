package com.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the order_detail database table.
 * 
 */
@Entity
@Table(name = "order_detail")
@NamedQuery(name = "OrderDetail.findAll", query = "SELECT o FROM OrderDetail o")
public class OrderDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderDetailPK orderDetailPKID;

	public OrderDetailPK getOrderDetailPKID() {
		return orderDetailPKID;
	}

	public void setOrderDetailPKID(OrderDetailPK orderDetailPKID) {
		this.orderDetailPKID = orderDetailPKID;
	}

	private double price;

	private int quantity;

	// bi-directional many-to-one association to Product
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id", insertable = false, updatable = false)
	private Product product;

	// bi-directional many-to-one association to Order
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id", insertable = false, updatable = false)
	private Order order;

	public OrderDetail() {
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}