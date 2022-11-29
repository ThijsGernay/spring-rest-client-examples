package guru.springframework.api.domain;

import lombok.Data;

import javax.smartcardio.Card;
import java.io.Serializable;

@Data
public class Billing implements Serializable {

    private Card card;

}
