package com.altimetrik.training.controller;

import com.altimetrik.training.model.Menu;
import com.altimetrik.training.model.MenuItem;
import com.altimetrik.training.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.altimetrik.training.Constants.*;

@RestController
public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @GetMapping(BASE_MENU_ITEM_URI)
    public List<MenuItem> getAllMenuItems(@PathVariable String menuType) {
        return menuItemService.getAllMenuItems(menuType);
    }

    @GetMapping(GET_MENU_ITEM_BY_NAME_URI)
    public Optional<MenuItem> getMenuItem(@PathVariable String itemName) {
        return menuItemService.getMenuItem(itemName);
    }

    @PostMapping(POST_MENU_ITEM_URI)
    public void addMenuItem(@RequestBody MenuItem menuItem, @PathVariable Long menuId) {
        menuItem.setMenu(new Menu(menuId, "", ""));
        menuItemService.addOrUpdateMenuItem(menuItem);
    }

    @PutMapping(UPDATE_MENU_ITEM_URI)
    public void updateMenuItem(@RequestBody MenuItem menuItem, @PathVariable Long menuId) {
        menuItem.setMenu(new Menu(menuId, "", ""));
        menuItemService.addOrUpdateMenuItem(menuItem);
    }

    @DeleteMapping(DELETE_MENU_ITEM_URI)
    public void deleteMenuItem(@PathVariable Long itemId) {
        menuItemService.deleteMenuItem(itemId);
    }


}
