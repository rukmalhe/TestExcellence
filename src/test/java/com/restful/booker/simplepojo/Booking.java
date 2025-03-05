package com.restful.booker.simplepojo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public
class Booking {
    private String firstname;
    private String lastname;
    private Date checkin;
    private Date checkout;


}
