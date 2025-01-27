package configs;

import org.aeonbits.owner.ConfigFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum ConfigReader {
    INSTANCE;

    private static final Logger logger = LoggerFactory.getLogger(ConfigReader.class);

    private static final WebDriverConfig config;
    private static final AuthConfig authConfig;

    static {
        try {
            logger.info("Initializing WebDriverConfig...");
            config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
            logger.info("WebDriverConfig initialized successfully.");

            logger.info("Initializing AuthConfig...");
            authConfig = ConfigFactory.create(AuthConfig.class, System.getProperties());
            logger.info("AuthConfig initialized successfully.");
        } catch (Exception e) {
            logger.error("Failed to initialize configurations", e);
            throw new IllegalStateException("Configuration initialization error", e);
        }
    }

    public WebDriverConfig getWebDriverConfig() {
        return config;
    }

    public AuthConfig getAuthConfig() {
        return authConfig;
    }
}
