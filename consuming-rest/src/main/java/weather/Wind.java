package weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {

    // "wind":{"chill":"93","direction":"245","speed":"14"}

    private String chill;
    private String direction;
    private String speed;

    public String getChill() {
        return chill;
    }

    public void setChill(String chill) {
        this.chill = chill;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "chill='" + chill + '\'' +
                ", direction='" + direction + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
