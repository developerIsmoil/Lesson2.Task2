package com.projection;

import com.entity.Order;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = Order.class)
public interface CustomOrder {
    Long getId();

    Integer getCount();

    Long getPrice();

    boolean getSaled();

    Date getDate();

    Long getUserId();
}
