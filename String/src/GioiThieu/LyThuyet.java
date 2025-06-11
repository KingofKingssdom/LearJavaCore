package GioiThieu;

public class LyThuyet {
	/*
	 * String s = new String("Hello");
	 * 
	 * Điều gì xảy ra?

📦 Bộ nhớ Stack:
Biến s nằm trên stack — nó chỉ là một tham chiếu (reference) trỏ đến một đối tượng String ở heap.

📦 Bộ nhớ Heap:
new String("Hello") tạo một đối tượng String mới trên heap, luôn luôn là mới, dù String pool có hay không.

Giá trị "Hello" trong lệnh này chính là string literal và sẽ được đặt vào String Pool (một vùng đặc biệt trong heap).

📦 String Pool:
Khi trình biên dịch gặp "Hello" (là string literal), nó sẽ kiểm tra trong String Pool xem đã có "Hello" chưa:

Nếu chưa có thì tạo mới trong pool.

Nếu đã có thì giữ nguyên.

Sau đó, đối tượng new String("Hello") không lấy trực tiếp từ String Pool, mà nó sẽ copy lại giá trị từ String Pool vào một vùng nhớ mới trên Heap.
	 * */
}
