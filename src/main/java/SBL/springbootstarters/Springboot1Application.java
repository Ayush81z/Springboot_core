package SBL.springbootstarters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//if we want the @SpringBootApplication to scan some other package also then we use @SpringBootApplication(scanBasePackages = "packagename")
//@EnableAutoConfiguration : managed by spring and used on the beans which is also created by spring itself , we should not use these the only two way to create a bean is still @Component and @bean , so spring has a lot of files which has beans which are already made only for important files , dependencies (WebMvc , mockito)
@SpringBootApplication
public class Springboot1Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springboot1Application.class, args);

//		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//		paymentGateway.print();

//		paymentGateway.setType("Crypto");
//		paymentGateway.setRetryCount(5);
	}
}
