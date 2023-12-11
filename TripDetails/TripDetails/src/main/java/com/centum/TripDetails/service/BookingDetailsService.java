package com.centum.TripDetails.service;

import com.centum.TripDetails.entity.BookingDetails;
import com.centum.TripDetails.repository.BookingDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookingDetailsService {
    @Autowired
    private BookingDetailsRepo bookingDetailsRepository;

    public List<BookingDetails> getAllBookingDetails() {
        return bookingDetailsRepository.findAll();
    }

    public BookingDetails createBookingDetails(BookingDetails bookingDetails) {
        return bookingDetailsRepository.save(bookingDetails);
    }
}
