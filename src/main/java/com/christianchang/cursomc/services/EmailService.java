package com.christianchang.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.christianchang.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	
}
