package com.altimetrik.training.service;

import com.altimetrik.training.model.MenuItem;
import com.altimetrik.training.model.Order;
import com.altimetrik.training.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    public String getOrder(Long orderId) {
        double totalPrice = computeOrderPrice(orderId);
        return orderRepository.findById(orderId).toString() + "\nTotal Price: " + totalPrice;
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }

    private double computeOrderPrice(Long orderId) {
        double price = 0d;
        List<MenuItem> itemsList;
        Optional<Order> orderDescription = orderRepository.findById(orderId);
        if(orderDescription.isPresent()) {
            Order order = orderDescription.get();
            itemsList = order.getMenuItems();
            for (MenuItem item : itemsList) {
                price += item.getPrice();
            }
        }
        return price;
    }

}
