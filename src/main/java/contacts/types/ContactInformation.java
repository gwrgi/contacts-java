package contacts.types;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.DateTime;

public class ContactInformation {
    @Getter @Setter
    private ContactId contactId;

    @Getter @Setter
    private Map<String, String> emailAddresses;

    @Getter @Setter
    private Map<String, String> phoneNumbers;

    @Getter @Setter
    private Map<String, Address> addresses;

    @Getter @Setter
    private Map<String, DateTime> events;

    @Getter @Setter
    private Map<ContactId, List<String>> relationships;
}
