package contacts.types;

import java.util.List;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class User {
    @Getter @Setter @NonNull
    private ContactId userId;

    @Getter @Setter
    private ContactInformation contactInfo;

    @Getter @Setter
    private List<ContactId> contacts;
}
