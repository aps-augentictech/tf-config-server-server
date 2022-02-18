package pt.dnxt.techfridays.configserver.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer.class, args);
	}

	@Bean
	MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
		return registry -> registry.config().commonTags("application", "Config Service");
	}
}
