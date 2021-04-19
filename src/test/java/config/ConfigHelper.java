package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {
    public static String getBrowserstackUser() {
        return getMobileConfig().browserstackUser();
    }

    public static String getBrowserstackKey() {
        return getMobileConfig().browserstackKey();
    }

    public static String getApp(){
        return getMobileConfig().app();
    }

    private static MobileConfig getMobileConfig() {
        return ConfigFactory.newInstance().create(MobileConfig.class, System.getProperties());
    }
}
