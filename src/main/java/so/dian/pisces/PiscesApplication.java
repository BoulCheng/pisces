package so.dian.pisces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@ServletComponentScan
@EnableHystrix
@EnableCircuitBreaker
@EnableScheduling
public class PiscesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiscesApplication.class, args);
	}

}
