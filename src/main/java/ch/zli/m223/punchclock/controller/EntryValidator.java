package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class EntryValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return Entry.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Entry entry = (Entry) target;

        if(!entry.getCheckIn().isBefore(entry.getCheckOut())){
            errors.rejectValue("checkOut", "validation.toEarlyCheckout", "The Checkout is before Checkin");
        }
    }
}
