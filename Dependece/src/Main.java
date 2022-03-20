
public class Main {
	
	public static void main(String[] args) {
		
		// Membuat objek produk
		Product p1 = new Product("Milk", "Drink", 5000);
		Product p2 = new Product("Cereal", "Meal", 22000);
		Product p3 = new Product("Egg", "Meal", 3500);
		
		// Membuat objek seller
		Seller s1 = new Seller("Aini");
		
		// Seller mengisi stok produk
		s1.inputStok(p1, 10);
		s1.inputStok(p2, 7);
		s1.inputStok(p3, 50);
		
		// Menampilkan produk
		p1.printProduct();
		p2.printProduct();
		p3.printProduct();
	}
}

