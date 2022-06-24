package com.projection;

import com.entity.Order;
import com.entity.OrderItem;
import com.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OrderItem.class)
public interface CustomOrderItem {
    Long getId();

    Product getProduct();

    Integer getCount();

    Order getOrder();
}
