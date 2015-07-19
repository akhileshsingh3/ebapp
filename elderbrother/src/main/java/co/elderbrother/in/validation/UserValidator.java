package co.elderbrother.in.validation;

import co.elderbrother.in.dao.impl.RegistrationUserDto;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return RegistrationUserDto.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "message.firstName", "Firstname is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "message.lastName", "LastName is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "message.password", "LastName is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "message.username", "UserName is required.");
    }

}
