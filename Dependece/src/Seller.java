/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program Seller
 * Seller 'uses a' Product
 */

public class Seller {
	private String name;
	
	/**
	 * Constructor
	 * @param name
	 */
	public Seller(String name) {
		this.name = name;
	}
	
	/**
	 * Method menginput stok produk
	 * @param product
	 * @param stok
	 */
	public void inputStok(Product product, int stok) {
		product.setStok(stok);
	}
}

