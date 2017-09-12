package com.bakerbeach.market.payment.api.service;

import com.bakerbeach.market.commons.Message;
import com.bakerbeach.market.commons.ServiceException;

@SuppressWarnings("serial")
public class PaymentServiceException extends ServiceException {

	public PaymentServiceException(){
		super();
	}
	
	public PaymentServiceException(Message message){
		super();
		messages.add(message);
	}

	public static class PaymentRedirectException extends PaymentServiceException{
		
		private String url;
		
		public PaymentRedirectException(Message message) {
			super(message);
		}
		
		public PaymentRedirectException(String url) {
			super();
			//super(new MessageImpl(""));
			this.url = url;
		}

		/**
		 * @return the url
		 */
		public String getUrl() {
			return url;
		}

		/**
		 * @param url the url to set
		 */
		public void setUrl(String url) {
			this.url = url;
		}
		
	}

}
