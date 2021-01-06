package com.altimetrik.training.repository;

import com.altimetrik.training.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

    List<MenuItem> findByMenuType(String menuType);

    Optional<MenuItem> findByName(String itemName);
}
