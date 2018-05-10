package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Person;

/**
 * @author: blissolee
 * @date:2018年5月3日 上午11:17:32
 * @version :
 * 
 */
public class Register extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;// 在前端struts 2 tag 标签标注的form->
								// name声明一致，可以使用。运算符setter getter，在form 声明对应
								// 的action

	public String execute() throws Exception {
		// call service class to store personBean's state in database
		System.out.println("============" + personBean.getName());
		return SUCCESS;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person person) {
		personBean = person;
	}

	/*public void validate() {
		if (personBean.getName().length() == 0) {
			addFieldError("personBean.firstName", "First name is required.");
		}

		if (personBean.getEmail().length() == 0) {
			addFieldError("personBean.email", "Email is required.");
		}

		if (personBean.getAge() < 18) {
			addFieldError("personBean.age", "Age is required and must be 18 or older");
		}
	}*/

}