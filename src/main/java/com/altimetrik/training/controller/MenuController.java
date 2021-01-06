package com.altimetrik.training.controller;

import com.altimetrik.training.model.Menu;
import com.altimetrik.training.model.Restaurant;
import com.altimetrik.training.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.altimetrik.training.Constants.BASE_MENU_URI;
import static com.altimetrik.training.Constants.GET_MENU_BY_TYPE_URI;
import static com.altimetrik.training.Constants.UPDATE_AND_DELETE_MENU_URI;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping(BASE_MENU_URI)
    public List<Menu> getAllMenus(@PathVariable Long restaurantId) {
        return menuService.getAllMenus(restaurantId);
    }

    @GetMapping(GET_MENU_BY_TYPE_URI)
    public Optional<Menu> getMenu(@PathVariable String menuType) {
        return menuService.getMenu(menuType);
    }

    @PostMapping(BASE_MENU_URI)
    @ResponseStatus(HttpStatus.CREATED)
    public void addMenu(@RequestBody Menu menu, @PathVariable Long restaurantId) {
        menu.setRestaurant(new Restaurant(restaurantId, "", ""));
        menuService.addOrUpdateMenu(menu);
    }

    @PutMapping(UPDATE_AND_DELETE_MENU_URI)
    @ResponseStatus(HttpStatus.OK)
    public void updateMenu(@RequestBody Menu menu, @PathVariable Long restaurantId) {
        menu.setRestaurant(new Restaurant(restaurantId, "", ""));
        menuService.addOrUpdateMenu(menu);
    }

    @DeleteMapping(UPDATE_AND_DELETE_MENU_URI)
    @ResponseStatus(HttpStatus.OK)
    public void deleteMenu(@PathVariable Long menuId) {
        menuService.deleteMenu(menuId);
    }
}
