package Variable;

public class LocalVariable {
	// Một biến được định nghĩa trong một khối, phương thức hoặc hàm tạo được gọi là biến cục bộ. 
	// Biến cục bộ được tạo tại thời điểm khai báo và bị hủy khi hàm hoàn tất quá trình thực thi.
	// Phạm vi của biến cục bộ chỉ tồn tại trong khối mà chúng được khai báo.
	// Đầu tiên chúng ta cần khởi tạo biến cục bộ trước khi sử dụng nó trong phạm vi của nó
	public static void main(String[] args) {
		{
			int localVariable = 10;
			System.out.println(localVariable); // truy cập đc biến trong phạm vi
		}
		// System.out.println(localVariable); // Nếu đưa ra ngoài này lỗi kh truy cập dc biến
	}
}
