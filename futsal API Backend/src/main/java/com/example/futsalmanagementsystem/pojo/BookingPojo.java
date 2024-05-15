package com.example.futsalmanagementsystem.pojo;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookingPojo {
    private Integer id;
    private LocalDate bookingDate;
    private LocalTime startTime;
    private LocalTime endTime;
}
