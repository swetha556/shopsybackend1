package com.dxc.controller;

import com.dxc.model.Payment;
import com.dxc.service.PaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/pay")
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	@PostMapping("/payment")
	public void createPayment(@RequestBody Payment payment) {
		service.addPayment(payment);
	
	}
	
	
	
	@GetMapping("/payment")
	public List<Payment> getPayments(){    
       return service.getAllPayments();
	}
}
	
	
	