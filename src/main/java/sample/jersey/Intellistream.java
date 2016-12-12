package sample.jersey;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@ProvidedIntellistream
public class Intellistream extends Entity {
	
	private String id;
	
	@Min(value = 18)
	@Max(value = 65)
	private int number;
	
	@Age(message = "{age}")
	private Integer age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
