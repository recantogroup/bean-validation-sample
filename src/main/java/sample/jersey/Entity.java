package sample.jersey;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Entity {
	
	@NotEmpty(message = "{should.not.be.empty}")
	private String name;
	
	@NotNull(message = "{should.not.be.null}")
	private String lastname;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
