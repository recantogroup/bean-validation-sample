package sample.jersey;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

public class ConstraintViolationResponse {

	private List<ConstraintViolationMessage> errors;
	
	public ConstraintViolationResponse(Set<ConstraintViolation<?>> violations) {
		this.errors = new ArrayList<>();
		
		for (ConstraintViolation<?> violation : violations) {
			errors.add(new ConstraintViolationMessage(getTargetField(violation.getPropertyPath().toString()), violation.getMessage()));
		}
	}
	
	public List<ConstraintViolationMessage> getErrors() {
		return errors;
	}
	
	
	private String getTargetField(String path) {
		return path.substring(path.lastIndexOf('.') + 1);
	}
	
}