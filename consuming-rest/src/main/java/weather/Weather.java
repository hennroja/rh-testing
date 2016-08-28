package weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by domann on 28.08.2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "query=" + query +
                '}';
    }
}
