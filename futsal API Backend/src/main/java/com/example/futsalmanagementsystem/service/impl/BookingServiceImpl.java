package com.example.futsalmanagementsystem.service.impl;

import com.example.futsalmanagementsystem.entity.Booking;
import com.example.futsalmanagementsystem.pojo.BookingPojo;
import com.example.futsalmanagementsystem.repository.BookingRepository;
import com.example.futsalmanagementsystem.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;
    @Override
    public List<Booking> findAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking findBookingById(int id) {
        return bookingRepository.findById(id).orElse(null);
    }

    @Override
    public Booking addBooking(BookingPojo bookingPojo) {
        Booking booking = new Booking();
        booking.setId(bookingPojo.getId());
        booking.setBookingDate(bookingPojo.getBookingDate());
        booking.setStartTime(bookingPojo.getStartTime());
        booking.setEndTime(bookingPojo.getEndTime());
        return bookingRepository.save(booking);
    }

    @Override
    public void deleteBooking(int id) {
        bookingRepository.deleteById(id);

    }


}
