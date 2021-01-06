package com.altimetrik.training;

public class Constants {

    public static final String BASE_RESTAURANT_URI = "/restaurants";

    public static final String GET_RESTAURANT_BY_ID_URI = "/restaurants/{restaurantId}";

    public static final String BASE_MENU_URI = "/restaurants/{restaurantId}/menus";

    public static final String GET_MENU_BY_TYPE_URI = "/restaurants/{restaurantId}/menus/{menuType}";

    public static final String UPDATE_AND_DELETE_MENU_URI = "/restaurants/{restaurantId}/menus/{menuId}";

    public static final String BASE_MENU_ITEM_URI = "/restaurants/{restaurantId}/menus/{menuType}/menuItems";

    public static final String GET_MENU_ITEM_BY_NAME_URI = "/restaurants/{restaurantId}/menus/{menuId}/menuItems/{itemName}";

    public static final String UPDATE_AND_DELETE_MENU_ITEM_URI = "/restaurants/{restaurantId}/menus/{menuType}/menuItems/{itemId}";
}
