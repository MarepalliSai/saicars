package com.centum.TripDetails.service;

import com.centum.TripDetails.entity.Payment;
import com.centum.TripDetails.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentService {
    @Autowired
    private PaymentRepo paymentRepository;

    public List<Payment> getAllPaymentDetails() {
        return paymentRepository.findAll();
    }

    public Payment createPaymentDetails(Payment paymentDetails) {
        return paymentRepository.save(paymentDetails);
    }
}
