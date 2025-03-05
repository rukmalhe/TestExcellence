package com.restful.booker.herokuapp;


import com.restful.booker.simplepojo.Bookingdates;
import com.restful.booker.simplepojo.CreateBooking;

public class HerokuAppBuilder {


    public CreateBooking createBookingBuilder (String firstName, String lastName, double totalPrice,
                                               boolean depositPaid, Bookingdates bookingDates, String additionalNeeds ){
        return CreateBooking.builder().
                firstname(firstName).
                lastname(lastName).
                totalprice(totalPrice).
                depositpaid(depositPaid).
                bookingdates(bookingDates).
                additionalneeds(additionalNeeds).build();
    }

    public Bookingdates bookingDatesBuilder (String checkin, String checkout) {
        return Bookingdates.builder().
                checkin(checkin).
                checkout(checkout).build();
    }
}
