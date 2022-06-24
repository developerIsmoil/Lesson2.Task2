package com.projection;

import com.entity.Category;
import com.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Long getId();

    String getName();

    String getColor();

    Long getPrice();

    boolean getDeliver();

    Category getCategory();
}
