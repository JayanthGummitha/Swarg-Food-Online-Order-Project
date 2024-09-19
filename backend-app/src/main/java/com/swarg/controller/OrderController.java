package com.swarg.controller;

import com.swarg.modal.CartItem;
import com.swarg.modal.Order;
import com.swarg.modal.User;
import com.swarg.request.AddCartItemRequest;
import com.swarg.request.OrderRequest;
import com.swarg.response.PaymentResponse;
import com.swarg.service.OrderServices;
import com.swarg.service.PaymentService;
import com.swarg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderServices orderServices;

    @Autowired
    private UserService userService;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/order")
    public ResponseEntity<PaymentResponse> createOrder(@RequestBody OrderRequest req,
                                                       @RequestHeader("Authorization")String jwt)throws Exception{

        User user=userService.findUserByJwtToken(jwt);
        Order order=orderServices.createOrder(req,user);
        PaymentResponse res=paymentService.createPaymentLink(order);
         return new ResponseEntity<>(res, HttpStatus.OK);
    }


    @GetMapping("/order/user")
    public ResponseEntity<List<Order>> getOrderHistory( @RequestHeader("Authorization")String jwt)throws Exception{

        User user=userService.findUserByJwtToken(jwt);
        List<Order> order=orderServices.getUsersOrder(user.getId());
        return new ResponseEntity<>(order, HttpStatus.OK);
    }


}

