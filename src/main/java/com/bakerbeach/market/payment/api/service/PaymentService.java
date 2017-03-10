package com.bakerbeach.market.payment.api.service;

import java.math.BigDecimal;
import java.util.Map;

import com.bakerbeach.market.core.api.model.Customer;
import com.bakerbeach.market.core.api.model.Order;
import com.bakerbeach.market.core.api.model.ShopContext;
import com.bakerbeach.market.core.api.model.XCart;
import com.bakerbeach.market.payment.api.model.PaymentInfo;

public interface PaymentService {
	
	PaymentInfo initPayment(ShopContext shopContext, Customer customer, XCart cart) throws PaymentServiceException;
	
	PaymentInfo configPaymentMethod(ShopContext shopContext, Map<String,String> parameters) throws PaymentServiceException;
	
	PaymentInfo processReturn(ShopContext shopContext, Map<String,String> parameters) throws PaymentServiceException;
	
	PaymentInfo getPaymentInfo(ShopContext shopContext);
	
	PaymentInfo doPreOrder(XCart cart, ShopContext shopContext) throws PaymentServiceException;
	
	PaymentInfo doOrder(Order order) throws PaymentServiceException;
	
	PaymentInfo doCancel(Order order) throws PaymentServiceException;

	PaymentInfo doCapture(Order order, BigDecimal amount) throws PaymentServiceException;

}