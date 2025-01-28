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

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackDriver implements WebDriverProvider {

    private final WebDriverConfig config = ConfigReader.INSTANCE.readWebDriverConfig();
    private final AuthConfig authConfig = ConfigReader.INSTANCE.readAuthConfig();
    private final Browserstack browserstack = new Browserstack();

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
