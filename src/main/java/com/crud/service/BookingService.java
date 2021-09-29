package com.crud.service;

import java.util.List;

import com.crud.model.Booking;

public interface BookingService {

	List<Booking> getAllBookings();

	void saveBooking(Booking booking);

	Booking getBookingById(long id);

	void deleteBookingById(long id);
}
