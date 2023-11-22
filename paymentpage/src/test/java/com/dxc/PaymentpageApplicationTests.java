package com.dxc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dxc.repository.PaymentRepository;
import com.dxc.service.PaymentService;
import com.dxc.model.Payment;


@SpringBootTest
public class PaymentpageApplicationTests {
	
	@Autowired
	private PaymentService service;
	
	@MockBean
	private PaymentRepository repo;

	@Test
    public void createPaymentTest() {
		Payment payment =new Payment(1,"03-08-2023", "card");
		when(repo.save(payment)).thenReturn(payment);
		assertEquals(payment,service.addPayment(payment));
		
	}
	
	@Test
	public void getAllPayment() {
		when(repo.findAll()).thenReturn(Stream.of
				(new Payment(2,"08-08-2023","card"),new Payment(3,"09-08-2023","card")).collect(Collectors.toList()));
		 assertEquals(2,service.getAllPayments().size());
	}

}
