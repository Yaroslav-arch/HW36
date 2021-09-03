package lysenko;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Visit {
    private String name;
    private String date;
    private String city;

    @Override
    public String toString() {
        return "Visit{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", from='" + city + '\'' +
                '}';
    }
}
