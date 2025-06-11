package ThisAndSuperInContructor;

import java.security.PublicKey;

public class KeyThis {
	// Từ khóa this có 6 cách sử dụng sau:
	public static void main(String[] args) {
		// 1. Từ khóa this trong java có thể được dùng để tham chiếu tới biến instance của lớp hiện tại.
		// 2. Tham chiếu đến phường thức của lớp hiện tại, nếu không có từ khóa this, trình biên dịch sẽ từ thêm
		// Ví dụ 
		//  private int id;
		/*
		 * public void print() {
        		System.out.println("Id = " + this.id);
        		this.printWebsite();
        		this.printSubject();
    		}
		 * */
		
		// 3. Gọi đến contructor của lớp hiện tại 
		// Ví dụ
		/*
		 * public UsingThisExample(String website ) {
        this(); // Bắt buộc phải dòng lệnh đầu tiên trong constructor
        this.website = website ;
    	}
 
    	public UsingThisExample(String website, String subject) {
        this(website); // Bắt buộc phải dòng lệnh đầu tiên trong constructor
        this.subject = subject;
    	}
		 * */ 
		// 4. Tham chiếu đến biến instance của lớp hiện tại 
		// Ví dụ trong hàm contructor có 
		// public Contructor(String name){
		// this.name = name   => name ở biến this sẽ là tham chiếu ở trên xuống
		
		// 5. Sử dụng là làm tham số cho một phương thức 
		/*
		 * public class Helper {
     
    		public void print(UsingThisExample ex) {
        		System.out.println("Id = " + ex.getId());
        		System.out.println("Website = " + ex.getWebsite());
    		}
    		
    	public class UsingThisExample {
    		private int id;
    		private String website;
     
		    UsingThisExample () {
		        this.id = 1;
		        this.website = "gpcoder";
		    }
     
		    public void print() {
		        Helper helper = new Helper();
		        helper.print(this); 
		    }
     	}
		 * */
		
		// 6. Tương tự như phương thức cũng có thể truyền làm tham số cho contructor
	}
}
