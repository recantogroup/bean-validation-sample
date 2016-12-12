package sample.jersey;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IntellistreamValidator implements ConstraintValidator<ProvidedIntellistream, Intellistream> {

	@Override
	public void initialize(ProvidedIntellistream stream) {
		
	}

	@Override
	public boolean isValid(Intellistream stream, ConstraintValidatorContext context) {
		boolean isValid = true;
		
		if (stream.getAge() != null) {
			if (stream.getNumber() < stream.getAge()) {
				context.disableDefaultConstraintViolation();
				context.buildConstraintViolationWithTemplate("{number.must.be.greater.than.age}")
					.addPropertyNode("number")
					.addConstraintViolation();
				
				isValid = false;
			}
		}
		
		if (stream.getId().length() != 2) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate("{id.must.have.two.chars}")
				.addPropertyNode("id")
				.addConstraintViolation();
			
			isValid = false;
		}
		
		return isValid;
	}

}
