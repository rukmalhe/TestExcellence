package com.restful.booker.simplepojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Auth {
    @JsonInclude(JsonInclude.Include.NON_NULL) //ignoring null property when sending
    private static String username;
    private static String password;

}
