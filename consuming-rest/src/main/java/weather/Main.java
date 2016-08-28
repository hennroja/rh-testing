package weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Created by domann on 28.08.2016.
 */
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static final String YAHOOA_WEATHER_API = "https://query.yahooapis.com/v1/public/yql?q=";
    public static final String FORMAT_JSON = "&format=json";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String query = "select wind from weather.forecast where woeid in (select woeid from geo.places(1) where text=" +
                "\"Berlin\")";
        Weather weather = restTemplate.getForObject(YAHOOA_WEATHER_API + query + FORMAT_JSON, Weather.class);
        log.info(weather.getQuery().getResults().getChannel().getWind().toString());
    }

}
