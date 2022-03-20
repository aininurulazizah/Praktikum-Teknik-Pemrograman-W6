/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program Product
 * Seller 'uses a' Product
 */

public class Product {
	private String name;
	private String category;
	private int price;
	private int stok;
	
	// Constructor
	public Product(String name, String category, int price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	// Mengisi stok produk
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	// Menampilkan detail produk
	public void printProduct() {
		System.out.println("\n Product Name : " + this.name);
		System.out.println(" Category     : " + this.category);
		System.out.println(" Price        : " + this.price);
		System.out.println(" Stok         : " + this.stok);
	}
}

