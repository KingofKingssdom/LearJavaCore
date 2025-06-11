package Variable;


public class StudentInstance {
	private String name; // đây là 2 biến instance
	private int age; // kh cần thiets phải khởi tạo giá trị
	 // chỉ định đc truy cập
	// Truy cập thông qua getter và setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
