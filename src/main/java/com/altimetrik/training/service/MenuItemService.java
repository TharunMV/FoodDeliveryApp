package com.altimetrik.training.service;

import com.altimetrik.training.model.MenuItem;
import com.altimetrik.training.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItems(String menuType) {
        return menuItemRepository.findByMenuType(menuType);
    }

    public Optional<MenuItem> getMenuItem(String itemName) {
        return menuItemRepository.findByName(itemName);
    }

    public void addOrUpdateMenuItem(MenuItem menuItem) {
        menuItemRepository.save(menuItem);
    }

    public void deleteMenuItem(Long itemId) {
        menuItemRepository.deleteById(itemId);
    }
}
