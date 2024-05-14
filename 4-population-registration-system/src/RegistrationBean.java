import java.util.ArrayList;
import java.util.List;

public class RegistrationBean {
	private Person person = new Person();
	private List<Person> personList = new ArrayList<Person>();
	
	public void savePerson() {
		personList.add(person);
		person = new Person();
	}
	
	public void updatePerson() {
		person = new Person();
	}
	
	public void deletePerson() {
		personList.remove(person);
		person = new Person();
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
	
}
