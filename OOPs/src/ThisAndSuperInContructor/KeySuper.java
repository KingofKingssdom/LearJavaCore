package ThisAndSuperInContructor;

public class KeySuper {
	// Có 3 cách sử dụng
	
	// Gọi trực tiếp hàm dựng (constructor) của lớp cha gần nhất
	// Ví dụ
	/*
	 * public class Parent {
     
    private String website;
     
    public Parent() {
        System.out.println("This is parent");
        print();
    }
     
    public Parent(String website) {
        this.website = website;
        System.out.println("This is parent");
        print();
    }
     
    public void print() {
        System.out.println("Website = " + website);
    }
}
	 * 
	 * 
	 * public class Child extends Parent {
 
    public Child() {
        System.out.println("This is child");
    }
 
    public Child(String website) {
        super(website);
        System.out.println("This is child");
    }
     
    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println("---");
        Child child2 = new Child("gpcoder.com");
    }
}

 // 2. GỌi đến biến của lớp Cha gần nhất
  *  super.bienLopCha
  
  // 3. GỌi đến phương thức của lớp cha
   * 
   *  super.methodParent();
	 * */
}
