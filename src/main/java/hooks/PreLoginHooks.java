package hooks;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.testng.annotations.BeforeMethod;

import pages.AutoWiredPages;
import utils.ExtentReporter;

@Configuration
@PropertySource("classpath:application.properties")
public class PreLoginHooks extends TestNgHooks {
	
	@Value(value = "${spring.password}")
	private String password;

	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod();
		loginPage.doLogin(username, password);
	}

}
