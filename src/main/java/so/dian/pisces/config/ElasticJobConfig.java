package so.dian.pisces.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:elastic-job-config.xml")
public class ElasticJobConfig {
}
