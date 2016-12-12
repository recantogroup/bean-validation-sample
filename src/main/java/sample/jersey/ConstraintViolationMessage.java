package sample.jersey;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConstraintViolationMessage {

	private final String field;
	private final String message;

	@JsonCreator
    public ConstraintViolationMessage(@JsonProperty("field") String field, 
    								  @JsonProperty("message") String message) {
		this.field = field;
        this.message = message;
    }

	@JsonProperty("field")
	public String getField() {
		return field;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@Override
	public int hashCode() {
		return Objects.hash(field, message);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		ConstraintViolationMessage other = (ConstraintViolationMessage) obj;
		
		return Objects.equals(field, other.field)
                && Objects.equals(message, other.message);
	}
	
	@Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
        		.add("field", field)
                .add("message", message)
                .toString();
    }
	
}
