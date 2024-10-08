package com.swarg.controller;

import com.swarg.modal.Order;
import com.swarg.modal.User;
import com.swarg.request.OrderRequest;
import com.swarg.service.OrderServices;
import com.swarg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminOrderController {
    @Autowired
    private OrderServices orderServices;

    @Autowired
    private UserService userService;




    @GetMapping("/order/restaurant/{id}")
    public ResponseEntity<List<Order>> getOrderHistory(@PathVariable Long id,
            @RequestParam(required = false) String order_status,
            @RequestHeader("Authorization")String jwt)throws Exception{

        User user=userService.findUserByJwtToken(jwt);
        List<Order> order=orderServices.getRestaurantOrder(id,order_status);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PutMapping("/order/{Id}/{orderStatus}")
    public ResponseEntity<Order> updateOrderStatus(@PathVariable Long id,
                                                       @PathVariable String orderStatus,
                                                       @RequestHeader("Authorization")String jwt)throws Exception{

        User user=userService.findUserByJwtToken(jwt);
        Order order=orderServices.updateOrder(id,orderStatus);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
