package com.crud.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Booking;
import com.crud.repository.BookingRepository;
import com.crud.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookingrepo;

	@Override
	public void saveBooking(Booking booking) {
		this.bookingrepo.save(booking);
	}

	@Override
	public Booking getBookingById(long id) {
		Optional<Booking> optional = bookingrepo.findById(id);
		Booking booking = null;

		if (optional.isPresent()) {
			booking = optional.get();
		} else {
			throw new RuntimeException("Booking not found for id::" + id);
		}
		return booking;
	}

	@Override
	public void deleteBookingById(long id) {
		this.bookingrepo.deleteById(id);

	}

	@Override
	public List<Booking> getAllBookings() {
		return bookingrepo.findAll();
	}

}
