package drivers;

import com.codeborne.selenide.WebDriverProvider;
import configs.AuthConfig;
import configs.WebDriverConfig;
import helpers.Browserstack;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackDriver implements WebDriverProvider {

    WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    AuthConfig authConfig =ConfigFactory.create(AuthConfig.class,System.getProperties());

    public Browserstack browserstack = new Browserstack();


    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("browserstack.user", authConfig.getBrowserstackUser());
        caps.setCapability("browserstack.key", authConfig.getBrowserstackKey());

        caps.setCapability("app", browserstack.checkUploadedAppsList());

        caps.setCapability("device", config.getDevice());
        caps.setCapability("os_version", config.getOsVersion());
        try {
            return new RemoteWebDriver(
                    new URL(config.getRemoteUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
