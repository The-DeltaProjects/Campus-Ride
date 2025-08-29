package za.ca.cput.service;

import za.ca.cput.domain.Booking;

import java.util.List;

public interface IBookingService extends IService<Booking, Long>{
    List<Booking> getALBookings();
}
