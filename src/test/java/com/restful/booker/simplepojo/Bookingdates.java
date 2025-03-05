package com.restful.booker.simplepojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Setter
@Getter
@Jacksonized //this will enabling the Jackson Annotations with lombok builder patterns
public
class Bookingdates {
    @JsonProperty("checkin")
    private String checkin;
    @JsonProperty("checkout")
    private String checkout;

    Bookingdates(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public static BookingdatesBuilder builder() {
        return new BookingdatesBuilder();
    }

    public static class BookingdatesBuilder {
        private String checkin;
        private String checkout;

        BookingdatesBuilder() {
        }

        public BookingdatesBuilder checkin(String checkin) {
            this.checkin = checkin;
            return this;
        }

        public BookingdatesBuilder checkout(String checkout) {
            this.checkout = checkout;
            return this;
        }

        public Bookingdates build() {
            return new Bookingdates(checkin, checkout);
        }

        public String toString() {
            return "Bookingdates.BookingdatesBuilder(checkin=" + this.checkin + ", checkout=" + this.checkout + ")";
        }
    }
}
