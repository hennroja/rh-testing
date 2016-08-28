package weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// {"count":1,"created":"2016-08-28T16:12:56Z","lang":"de-DE","results":{"channel":{"wind":{"chill":"93","direction":"245","speed":"14"}}}}
@JsonIgnoreProperties(ignoreUnknown = true)
public class Query {

    int count;
    String created;
    String lang;
    Results results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Query{" +
                "count=" + count +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", results=" + results +
                '}';
    }
}
