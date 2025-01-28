package configs;

import org.aeonbits.owner.ConfigFactory;

public enum ConfigReader {
    INSTANCE;


    private static final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    private static final AuthConfig authConfig = ConfigFactory.create(AuthConfig.class, System.getProperties());

    public WebDriverConfig readWebDriverConfig() {
        return config;
    }

    public AuthConfig readAuthConfig() {
        return authConfig;
    }
}