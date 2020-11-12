package fshahy.delifery.deliveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeliferyDeliveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliferyDeliveryServiceApplication.class, args);
	}

}
