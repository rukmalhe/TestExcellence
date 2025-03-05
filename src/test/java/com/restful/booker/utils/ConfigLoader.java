package com.restful.booker.utils;

import java.util.Properties;

//A singleton class for loading properties
public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configloader;

    //Constructor is create private
    private ConfigLoader () {
        properties = PropertyUtils.propertyLoader("src/test/resources/config.properties");
    }

    public static ConfigLoader getInstance() {
        if (configloader == null) {
            configloader = new ConfigLoader();

        } return configloader;
    }

    public String getUserName () {
        String prop = properties.getProperty("userName");
        if (prop !=null) { return prop;}
        else throw new RuntimeException("No value found for userName");
    }
    public String getPassword () {
        String prop = properties.getProperty("password");
        if (prop !=null) { return prop;}
        else throw new RuntimeException("No value found for password");
    }
    public String getBaseUrl () {
        String env = System.getProperty("env", properties.getProperty("environment"));
        //Default to the property file, but allow an override via the command line.

        if (env !=null & env.equalsIgnoreCase("stating") ) { return properties.getProperty("baseUrlStage");}
        else if (env !=null & env.equalsIgnoreCase("dev") ) { return properties.getProperty("baseUrlDev");}
        else if (env !=null & env.equalsIgnoreCase("qa") ) { return properties.getProperty("baseUrlQA");}
        else throw new RuntimeException("No value found for baseUrl");
    }
    public String getResourcePathPin () {
        String prop = properties.getProperty("resourcePathPin");
        if (prop !=null) { return prop;}
        else throw new RuntimeException("No value found for resourcePathPin");
    }
}
