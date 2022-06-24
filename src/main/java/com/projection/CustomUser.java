package com.projection;

import com.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface CustomUser {
    Long getId();

    String getUserName();

    String getPassword();

    String getRole();

    boolean getEnable();

    String getFullName();
}
