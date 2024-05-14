import java.util.ArrayList;
import java.util.List;

public class StudentBean {
	private Student student = new Student();
	private List<Student> studentList = new ArrayList<Student>();
	
	public void save() {
		System.out.println(getStudent().getName());
		System.out.println(getStudent().getSurname());
		System.out.println(getStudent().getAge());
		studentList.add(getStudent());
		setStudent(new Student());
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}
