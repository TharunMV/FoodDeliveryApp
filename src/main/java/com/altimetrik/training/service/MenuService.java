package com.altimetrik.training.service;

import com.altimetrik.training.model.Menu;
import com.altimetrik.training.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAllMenus(Long restaurantId) {
        return menuRepository.findByRestaurantId(restaurantId);
    }

    public Optional<Menu> getMenu(String menuType) {
        return menuRepository.findByType(menuType);
    }

    public void addOrUpdateMenu(Menu menu) {
        menuRepository.save(menu);
    }

    public void deleteMenu(Long menuId) {
        menuRepository.deleteById(menuId);
    }

}
