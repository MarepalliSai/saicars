package com.centum.TripDetails.service;

import com.centum.TripDetails.entity.TripDetails;
import com.centum.TripDetails.repository.TripDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TripDetailsService {
    @Autowired
    private TripDetailsRepo tripDetailsRepository;

    public List<TripDetails> getAllTripDetails() {
        return tripDetailsRepository.findAll();
    }

    public TripDetails createTripDetails(TripDetails tripDetails) {
        return tripDetailsRepository.save(tripDetails);
    }
}
