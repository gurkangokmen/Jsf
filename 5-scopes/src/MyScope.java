
public class MyScope {
	private Integer number=0;
	public void increase() {
		System.out.println("It is here! - increase");
		setNumber(getNumber() + 1);
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}

}
