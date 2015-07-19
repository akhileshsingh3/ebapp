package co.elderbrother.in.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import co.elderbrother.in.dao.impl.RegistrationUserDto;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        RegistrationUserDto user = (RegistrationUserDto) obj;
        return user.getPassword().equals(user.getMatchpassword());
        
    }
}