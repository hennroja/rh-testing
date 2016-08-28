package weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			String query = "select wind from weather.forecast where woeid in (select woeid from geo.places(1) where text=" +
					"\"Berlin, BE, DE\")";
			Weather weather = restTemplate.getForObject(Main.YAHOOA_WEATHER_API + query + Main.FORMAT_JSON, Weather.class);
			log.info(weather.getQuery().getResults().getChannel().getWind().toString());
		};
	}
}