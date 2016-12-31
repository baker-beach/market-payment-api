package com.bakerbeach.market.payment.api.service;

import com.bakerbeach.market.commons.MessageImpl;
import com.bakerbeach.market.commons.ServiceException;
import com.bakerbeach.market.core.api.model.Message;
import com.bakerbeach.market.core.api.model.Messages;

@SuppressWarnings("serial")
public class PaymentServiceException extends ServiceException {

	public PaymentServiceException(){
		super();
	}
	
	public PaymentServiceException(Message message){
		super();
		messages.add(message);
	}

	/**
	 * @return the messages
	 */
	public Messages getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(Messages messages) {
		this.messages = messages;
	}

	public static class PaymentRedirectException extends PaymentServiceException{
		
		private String url;
		
		public PaymentRedirectException(Message message) {
			super(message);
		}
		
		public PaymentRedirectException(String url) {
			super(new MessageImpl(""));
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
