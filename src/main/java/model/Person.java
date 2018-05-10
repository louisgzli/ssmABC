package model;

/**
 * @author: blissolee
 * @date:2018��5��4�� ����3:50:52
 * @version :
 * 
 */
public class Person {
	private Integer id;
	private String name;
	private Integer age;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + "email="+email+'}';
	}
}