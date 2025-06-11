package Variable;

public class InstanceVariable {
	// Biến thể hiện được gọi là biến không tĩnh và được khai báo trong một lớp bên ngoài bất kỳ phương thức, hàm tạo hoặc khối nào
	// Biến thể hiện được tạo ra khi một đối tượng của lớp được tạo ra và bị hủy khi đối tượng bị hủy.
	// Không giống như các biến cục bộ, chúng ta có thể sử dụng các chỉ định truy cập cho các biến thể hiện. Nếu chúng ta không chỉ định bất kỳ chỉ định truy cập nào, thì chỉ định truy cập mặc định sẽ được sử dụng.
	// Việc khởi tạo một biến thể hiện không bắt buộc. Giá trị mặc định của nó phụ thuộc vào kiểu dữ liệu của biến. Đối với String , nó là null, đối với float , nó là 0.0f, đối với int, nó là 0, đối với các lớp Wrapper như Integer , nó là null,
	// Phạm vi của các biến thể hiện nằm trong toàn bộ lớp ngoại trừ các ngữ cảnh tĩnh.
	// Biến thể hiện chỉ có thể được truy cập bằng cách tạo đối tượng.
	// Chúng ta khởi tạo các biến thể hiện bằng cách sử dụng các hàm tạo trong khi tạo một đối tượng. Chúng ta cũng có thể sử dụng các khối thể hiện để khởi tạo các biến thể hiện
	
	public static void main(String[] args) {
		StudentInstance studentInstance = new StudentInstance();
		studentInstance.setName("Huy");
		studentInstance.setAge(24);
		System.out.println(studentInstance.getName());
		System.out.println(studentInstance.getAge());
	}
}
