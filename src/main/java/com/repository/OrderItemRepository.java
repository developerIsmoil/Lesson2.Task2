package com.repository;

import com.entity.User;
import com.projection.CustomOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", collectionResourceRel = "list", excerptProjection = CustomOrderItem.class)
public interface OrderItemRepository extends JpaRepository<User, Long> {
}
