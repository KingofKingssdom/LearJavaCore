package Contructor;

public class Contructor {
	// Constructor là một khối mã đặc biệt được gọi khi một đối tượng được tạo
	// Công việc chính của nó là khởi tạo đối tượng
	// Quá trình này diễn ra tự động khi chúng ta sử dụng từ khóa "new" để tạo đối tượng.
	// Mỗi lần một đối tượng được tạo bằng từ khóa new() , ít nhất một hàm tạo (có thể là hàm tạo mặc định)
	
	// Các loại contructor 
	// + Contructor không tham số
	// + Contructor có tham số
	// + Contructor kế thừa
	private String name;
	private int age;
	public Contructor(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// Vi dụ về contructor copy
	public Contructor(Contructor obj2) {
		this.name = obj2.name;
		this.age = obj2.age;
		
	}
	public static void main(String[] args) {
		Contructor obj1  = new Contructor("Huy", 23);
		Contructor obj2 = new Contructor(obj1);
		System.out.println(obj2.name);
	}
}
