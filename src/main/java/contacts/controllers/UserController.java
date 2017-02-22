package contacts.controllers;

import contacts.types.ContactId;
import contacts.types.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value="/user/{userid}", method=RequestMethod.GET, produces="application/json")
    @ResponseBody
    public User getUserById(@PathVariable("userid") ContactId userId) {
        // TODO: add proper logging
        System.out.println(String.format("Got user=(%s)", userId));

        // TODO: retrieve this from the databases
        return new User(userId);
    }
}
