package drivers;

import com.codeborne.selenide.WebDriverProvider;
import configs.AuthConfig;
import configs.ConfigReader;
import configs.WebDriverConfig;
import helpers.Browserstack;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackDriver implements WebDriverProvider {

    private static final Logger logger = LoggerFactory.getLogger(BrowserStackDriver.class);

    private final WebDriverConfig config = ConfigReader.INSTANCE.readWebDriverConfig();
    private final AuthConfig authConfig = ConfigReader.INSTANCE.readAuthConfig();
    private final Browserstack browserstack = new Browserstack();

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        logger.info("Setting up capabilities for BrowserStack driver...");

        MutableCapabilities caps = setupCapabilities();

        try {
            logger.info("Creating RemoteWebDriver with URL: {}", config.getRemoteUrl());
            return new RemoteWebDriver(new URL(config.getRemoteUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Failed to create RemoteWebDriver with URL: " + config.getRemoteUrl(), e);
        }
    }

    private MutableCapabilities setupCapabilities() {
        MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("browserstack.user", authConfig.getBrowserstackUser());
        caps.setCapability("browserstack.key", authConfig.getBrowserstackKey());
        caps.setCapability("app", browserstack.checkUploadedAppsList());
        caps.setCapability("device", config.getDevice());
        caps.setCapability("os_version", config.getOsVersion());

        logger.info("Capabilities configured: Device={}, OS version={}", config.getDevice(), config.getOsVersion());
        return caps;
    }
}
