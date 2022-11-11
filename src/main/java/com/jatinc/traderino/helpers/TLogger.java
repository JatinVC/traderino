package com.jatinc.traderino.helpers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TLogger {
    private static Logger T_LOGGER = null;

    public static void LOG_INFO(Class<?> cls, String message){
        T_LOGGER = LogManager.getLogger(cls);
        T_LOGGER.info(message);
    }

    public static void LOG_DEBUG(Class<?> cls, String message){
        T_LOGGER = LogManager.getLogger(cls);
        T_LOGGER.debug(message);
    }

    public static void LOG_ERROR(Class<?> cls, String message) {
        T_LOGGER = LogManager.getLogger(cls);
        T_LOGGER.error(message);
    }
}