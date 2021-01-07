package com.altimetrik.training.controller;

import com.altimetrik.training.model.Customer;
import com.altimetrik.training.model.Order;
import com.altimetrik.training.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.altimetrik.training.Constants.*;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(BASE_ORDER_URI)
    public List<Order> getAllOrders(@PathVariable Long customerId) {
        return orderService.getAllOrders(customerId);
    }

    @GetMapping(GET_ORDER_BY_ORDER_ID_URI)
    public String getOrder(@PathVariable Long orderId) {
        return orderService.getOrder(orderId);
    }

    @PostMapping(BASE_ORDER_URI)
    public void addOrder(@RequestBody Order order, @PathVariable Long customerId) {
        order.setCustomer(new Customer(customerId, "", "", ""));
        orderService.addOrder(order);
    }

    @DeleteMapping(GET_ORDER_BY_ORDER_ID_URI)
    public void deleteOrder(@PathVariable Long orderId) {
        orderService.deleteOrder(orderId);
    }
}
