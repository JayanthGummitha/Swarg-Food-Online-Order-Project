package com.swarg.service;

import com.swarg.modal.Order;
import com.swarg.modal.User;
import com.swarg.request.OrderRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface OrderServices {

    public Order createOrder(OrderRequest order, User user) throws Exception;

    public Order updateOrder(Long orderId, String orderStatus)throws Exception;

    public void cancelOrder(Long orderId)throws Exception;

    public List<Order> getUsersOrder(Long userId)throws Exception;

    public List<Order> getRestaurantOrder(Long restaurantId,String orderStatus)throws Exception;

    public Order findOrderById(Long orderId) throws Exception;

}
