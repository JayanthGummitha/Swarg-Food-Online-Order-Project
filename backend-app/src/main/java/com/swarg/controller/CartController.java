package com.swarg.controller;


import com.swarg.modal.Cart;
import com.swarg.modal.CartItem;
import com.swarg.modal.User;
import com.swarg.request.AddCartItemRequest;
import com.swarg.request.UpdateCartItemRequest;
import com.swarg.service.CartServices;
import com.swarg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CartController {

    @Autowired
    private CartServices cartServices;

    @Autowired
    private UserService userService;

    @PutMapping("/cart/add")
    public ResponseEntity<CartItem> addItemToCart(@RequestBody AddCartItemRequest req,
                                                  @RequestHeader("Authorization")String jwt)throws Exception{
        CartItem cartItem=cartServices.addItemToCart(req,jwt);
        return new ResponseEntity<>(cartItem, HttpStatus.OK);
    }

    @PutMapping("/cart-item/update")
    public ResponseEntity<CartItem> updateCartItemQuantity(@RequestBody UpdateCartItemRequest req,
                                                           @RequestHeader("Authorization")String jwt)throws Exception{
        CartItem cartItem=cartServices.updateCartItemQuantity(req.getCartItemId(),req.getQuantity());

        return new ResponseEntity<>(cartItem, HttpStatus.OK);
    }

    @DeleteMapping("/cart-item/{id}/remove")
    public ResponseEntity<Cart> removeCartItem(@PathVariable Long id,
                                               @RequestHeader("Authorization")String jwt)throws Exception{
        Cart cart=cartServices.removeITemFromCart(id, jwt);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @PutMapping("/cart/clear")
    public ResponseEntity<Cart> updateCartItemQuantity(
            @RequestHeader("Authorization")String jwt)throws Exception{
        User user=userService.findUserByJwtToken(jwt);

        Cart cartItem=cartServices.clearCart(user.getId());
        return new ResponseEntity<>(cartItem, HttpStatus.OK);
    }

    @GetMapping("/cart")
    public ResponseEntity<Cart> findUserCart(@RequestHeader("Authorization")String jwt)throws Exception{

        User user=userService.findUserByJwtToken(jwt);
        Cart cartItem=cartServices.findCartByUserId(user.getId());
        return new ResponseEntity<>(cartItem, HttpStatus.OK);
    }

}
