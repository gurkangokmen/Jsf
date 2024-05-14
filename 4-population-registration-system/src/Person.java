
public class Person {
	private Long id;
	private String name;
	private String surname;
	private String gender;
	private String birthday;
	private String birth_place_country;
	private String birth_place_city;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirth_place_country() {
		return birth_place_country;
	}
	public void setBirth_place_country(String birth_place_country) {
		this.birth_place_country = birth_place_country;
	}
	public String getBirth_place_city() {
		return birth_place_city;
	}
	public void setBirth_place_city(String birth_place_city) {
		this.birth_place_city = birth_place_city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
