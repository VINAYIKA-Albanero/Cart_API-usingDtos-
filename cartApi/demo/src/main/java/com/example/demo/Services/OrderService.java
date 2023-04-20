package com.example.demo.Services;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {

        orderRepository.save(order);
        return order;
    }

    public Order getOrderById(String id) {

        if(orderRepository.existsById(id)){
            return orderRepository.findById(id).get();
        }
        return null;
    }

    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    public void deleteOrder(String id) {

        orderRepository.deleteById(id);
    }

    public void updateOrder(Order order) {

        orderRepository.save(order);
    }



}
