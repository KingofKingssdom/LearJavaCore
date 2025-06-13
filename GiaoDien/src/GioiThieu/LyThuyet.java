package GioiThieu;

public class LyThuyet {
	// Thuộc  tính của giao diện
	/*
	 Giao diện trong Java là một cơ chế để đạt được sự trừu tượng .
	Theo mặc định, các biến trong giao diện là public, static và final.
	Nó được sử dụng để đạt được tính trừu tượng và kế thừa đa dạng trong Java.
	Nó hỗ trợ liên kết lỏng lẻo (các lớp phụ thuộc vào hành vi chứ không phải vào việc triển khai).
	Nói cách khác, giao diện chủ yếu xác định các phương thức mà các lớp khác phải triển khai.
	Giao diện trong Java định nghĩa một tập hợp các hành vi mà một lớp có thể triển khai, thường biểu thị mối quan hệ IS-A, 
	nhưng không phải lúc nào cũng đúng trong mọi trường hợp.
	 * */
	
	// Các tính năng được thêm vào trong giao diện JDK 8
	/*
	 - Phương thức default: Giao diện có thể xác định các phương thức với triển khai mặc định
	 
	 Ví dụ 
	 interface TestInterface {
		final int a = 10;
		default void display() {
		System.out.println("hello");
			    }}

	 - Phương thức static: Giao diện hiện có thể bao gồm các phương thức tĩnh
	 - Phương thức private: 
	 	Giao diện hiện có thể bao gồm các phương thức riêng tư.
		Các phương thức riêng tư được định nghĩa trong giao diện nhưng các lớp triển khai không thể truy cập được.
		Các phương thức riêng tư không thể bị ghi đè bằng cách triển khai các lớp vì chúng không được kế thừa.
		
	- Giao diện chức năng: là giao diện chỉ có một phuognw thức trừu  tượng duy nhất
	
	 * */
}
