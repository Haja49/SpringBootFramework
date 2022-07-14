package hooks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@Configuration
@PropertySource("classpath:application.properties")
public class PropertyValues extends AbstractTestNGSpringContextTests{
	
	@Value("${spring.username}")
	protected String username;

}
