package com.jatinc.traderino;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Properties;

public final class Config {
    private static final Properties PROPERTIES;
    private static final File PROP_FILE = new File("app.config");

    private Config(){}

    static {
        PROPERTIES = new Properties();
        try{
            FileReader reader = new FileReader(PROP_FILE);
            PROPERTIES.load(reader);
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(final String name){
        return PROPERTIES.getProperty(name);
    }
}
