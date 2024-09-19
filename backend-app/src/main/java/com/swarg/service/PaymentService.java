package com.swarg.service;

import com.stripe.exception.StripeException;
import com.swarg.modal.Order;
import com.swarg.response.PaymentResponse;

public interface PaymentService {
    public PaymentResponse createPaymentLink(Order order) throws StripeException;
}
