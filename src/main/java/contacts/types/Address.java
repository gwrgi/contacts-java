package contacts.types;

import lombok.Getter;
import lombok.Setter;

public class Address {
    @Getter @Setter
    private String streetAddress;

    @Getter @Setter
    private String city;

    @Getter @Setter
    private String state;

    @Getter @Setter
    private String postalCode;

    @Getter @Setter
    private String country;
}
