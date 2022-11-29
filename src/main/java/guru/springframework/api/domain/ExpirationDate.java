package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ExpirationDate implements Serializable {

    private LocalDate date;
    private Integer timezoneType;
    private String timezone;

}
