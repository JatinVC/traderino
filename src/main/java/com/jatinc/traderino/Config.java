package com.jatinc.traderino;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public final class Config {
    private static final Properties PROPERTIES;
    private static final String PROP_FILE = "app.config";

    private Config(){}

    static {
        PROPERTIES = new Properties();
        final URL props = ClassLoader.getSystemResource(PROP_FILE);
        try{
            PROPERTIES.load(props.openStream());
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(final String name){
        return PROPERTIES.getProperty(name);
    }
}