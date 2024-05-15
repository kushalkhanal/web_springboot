package com.example.futsalmanagementsystem.controller;

import com.example.futsalmanagementsystem.entity.Booking;
import com.example.futsalmanagementsystem.pojo.BookingPojo;
import com.example.futsalmanagementsystem.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
@AllArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/get")
    public ResponseEntity<List<Booking>> getAllBookings(){
        List<Booking> bookings = bookingService.findAllBookings();
        return ResponseEntity.ok(bookings);
    }

    @PostMapping("/save")
    public ResponseEntity<Booking> saveBooking(@RequestBody BookingPojo bookingPojo){
        Booking bookingAdded = bookingService.addBooking(bookingPojo);
        return ResponseEntity.ok(bookingAdded);
    }

}
