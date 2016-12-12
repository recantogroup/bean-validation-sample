package sample.jersey;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	@Override
	public void initialize(Age age) {
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		return age != null && age >= 18;
	}

}
