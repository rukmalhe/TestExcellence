package com.restful.booker.api;

import com.restful.booker.utils.ConfigLoader;
import com.restful.booker.utils.DataLoader;
import com.test.rest.assured.Test;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import com.restful.booker.utils.ConfigLoader;
import com.restful.booker.utils.DataLoader;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SpecificationBuilder {

    private static String BASE_URL;



    private static final Logger LOGGER = LogManager.getLogger(SpecificationBuilder.class);

    public static void setup () {
        ConfigLoader config = ConfigLoader.getInstance();
        BASE_URL = config.getBaseUrl();

    }

    public static RequestSpecification getRequestSpecification () {

        setup();
        // Logging configuration values
        LOGGER.info("BASE_URL: {}", BASE_URL);


        // Set RestAssured Base URL for all requests via given method
        RestAssured.baseURI = BASE_URL;

        // initializing request headers inside the setup
        return new RequestSpecBuilder().
                setBaseUri(BASE_URL).
                setContentType(ContentType.JSON).
                build();
    }


}
