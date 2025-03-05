package com.restful.booker.simplepojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Setter @Getter
@Jacksonized // this will enabling the Jackson Annotations with lombok builder patterns
public class CreateBooking {
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("totalprice")
    private double totalprice;
    @JsonProperty("depositpaid")
    private boolean depositpaid;
    @JsonProperty("bookingdates")
    private Bookingdates bookingdates;
    @JsonProperty("additionalneeds") @JsonInclude(JsonInclude.Include.NON_NULL)
    private String additionalneeds;

    CreateBooking(String firstname, String lastname, double totalprice, boolean depositpaid, Bookingdates bookingdates, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bookingdates = bookingdates;
        this.additionalneeds = additionalneeds;
    }

    public static CreateBookingBuilder builder() {
        return new CreateBookingBuilder();
    }

    public static class CreateBookingBuilder {
        private String firstname;
        private String lastname;
        private double totalprice;
        private boolean depositpaid;
        private Bookingdates bookingdates;
        private String additionalneeds;

        CreateBookingBuilder() {
        }

        public CreateBookingBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public CreateBookingBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public CreateBookingBuilder totalprice(double totalprice) {
            this.totalprice = totalprice;
            return this;
        }

        public CreateBookingBuilder depositpaid(boolean depositpaid) {
            this.depositpaid = depositpaid;
            return this;
        }

        public CreateBookingBuilder bookingdates(Bookingdates bookingdates) {
            this.bookingdates = bookingdates;
            return this;
        }

        public CreateBookingBuilder additionalneeds(String additionalneeds) {
            this.additionalneeds = additionalneeds;
            return this;
        }

        public CreateBooking build() {
            return new CreateBooking(firstname, lastname, totalprice, depositpaid, bookingdates, additionalneeds);
        }

        public String toString() {
            return "CreateBooking.CreateBookingBuilder(firstname=" + this.firstname + ", lastname=" + this.lastname + ", totalprice=" + this.totalprice + ", depositpaid=" + this.depositpaid + ", bookingdates=" + this.bookingdates + ", additionalneeds=" + this.additionalneeds + ")";
        }
    }
}
