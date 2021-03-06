package com.repository;

import com.entity.User;
import com.projection.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<User, Long> {
}
