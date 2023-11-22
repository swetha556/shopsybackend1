package com.dxc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dxc.model.Payment;
import com.dxc.repository.PaymentRepository;

@Service
public class PaymentServiceImp implements PaymentService {

	@Autowired
	private PaymentRepository repo;

	@Override
	public List<Payment> getAllPayments() {
		List<Payment> pay = repo.findAll();
        if(pay.size()>0)
            return pay;
        else
            return null;
	}

	//@Override
	//public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		//int id = payment.getPaymentId();
		//Optional<Payment> p = repo.findById(id);
	//	if(p.isEmpty()) {
		//	repo.save(p.get());
			//System.out.println("\n Payment Successfull\n");
			//return;
		//}
		
		@Override
		public Payment addPayment(Payment payment) {
			// TODO Auto-generated method stub
			return repo.save(payment);
		}
		
	}
