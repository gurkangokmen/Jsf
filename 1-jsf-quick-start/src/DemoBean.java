
public class DemoBean {
	private Demo demo = new Demo();
	
	public void save() {
		System.out.println(demo.getUsername());
		System.out.println(demo.getPassword());
		
	}

	public Demo getDemo() {
		return demo;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}
}
