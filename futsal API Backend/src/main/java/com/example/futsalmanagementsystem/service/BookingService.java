package com.example.futsalmanagementsystem.service;

import com.example.futsalmanagementsystem.entity.Booking;
import com.example.futsalmanagementsystem.pojo.BookingPojo;

import java.util.List;

public interface BookingService {
    List<Booking> findAllBookings();
    Booking findBookingById(int id);
    Booking addBooking(BookingPojo bookingPojo);
    void deleteBooking(int id);
}
