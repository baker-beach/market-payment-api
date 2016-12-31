package com.bakerbeach.market.payment.api.model;

import java.util.Map;

public interface PaymentInfo {
	
	String getPaymentContextId();
	
	Map<String,Map<String,Object>> getPaymentDataMap();
	
	String getCurrentPaymentMethodCode();
	
	Boolean isPaymentValid();
	
	

}
