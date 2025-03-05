package com.restful.booker.utils;

import java.util.Properties;

//A singleton class for loading properties
public class DataLoader {
    private final Properties properties;
    private static DataLoader dataLoader;

    //Constructor is create private
    private DataLoader() {
        properties = PropertyUtils.propertyLoader("src/test/resources/data.properties");
    }

    public static DataLoader getInstance() {
        if (dataLoader == null) {
            dataLoader = new DataLoader();

        } return dataLoader;
    }

    public int getCreateStatusCode () {
        String prop = properties.getProperty("createStatusCode");
        if (prop !=null) {
            try {
                return Integer.parseInt(prop);
            }catch (NumberFormatException e){
               throw new RuntimeException("Invalid integer value for createStatusCode: " + prop, e);
               //Exception thrown as a return Statement
            }
        }
        else throw new RuntimeException("No value found for createStatusCode");
        //Exception thrown as a return Statement
    }
    public int getSuccessStatusCode () {
        String prop = properties.getProperty("successStatusCode");
        if (prop !=null) {
            try {
                return Integer.parseInt(prop);
            }catch (NumberFormatException e){
                throw new RuntimeException("Invalid integer value for successStatusCode: " + prop, e);
                //Exception thrown as a return Statement
            }
        }
        else throw new RuntimeException("No value found for successStatusCode");
    }
}
