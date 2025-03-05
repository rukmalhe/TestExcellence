package com.restful.booker.simplepojo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public
class UpdateBooking {
    private String firstname;
    private String lastname;
    private double totalprice;
    private boolean depositpaid;
    Bookingdates bookingdates;
    private String additionalneeds;

}
