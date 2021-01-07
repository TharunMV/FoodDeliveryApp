package com.altimetrik.training;

public class Constants {

    public static final String BASE_RESTAURANT_URI = "/restaurants";

    public static final String GET_RESTAURANT_BY_ID_URI = "/restaurants/{restaurantId}";

    public static final String BASE_MENU_URI = "/restaurants/{restaurantId}/menus";

    public static final String GET_MENU_BY_TYPE_URI = "/restaurants/{restaurantId}/menus/{menuType}";

    public static final String UPDATE_AND_DELETE_MENU_URI = "/restaurants/{restaurantId}/menus/{menuId}";

    public static final String BASE_MENU_ITEM_URI = "/restaurants/{restaurantId}/menus/{menuType}/menuItems";

    public static final String GET_MENU_ITEM_BY_NAME_URI = "/restaurants/{restaurantId}/menus/{menuId}/menuItems/{itemName}";

    public static final String POST_MENU_ITEM_URI = "/restaurants/{restaurantId}/menus/{menuId}/menuItems";

    public static final String UPDATE_MENU_ITEM_URI = "/restaurants/{restaurantId}/menus/{menuId}/menuItems/{itemId}";

    public static final String DELETE_MENU_ITEM_URI = "/restaurants/{restaurantId}/menus/{menuType}/menuItems/{itemId}";

    public static final String BASE_CUSTOMER_URI = "/customers";

    public static final String GET_CUSTOMER_BY_ID_URI = "/customers/{customerId}";

    public static final String BASE_ORDER_URI = "/customers/{customerId}/orders";

    public static final String GET_ORDER_BY_ORDER_ID_URI = "/customers/{customerId}/orders/{orderId}";
}
