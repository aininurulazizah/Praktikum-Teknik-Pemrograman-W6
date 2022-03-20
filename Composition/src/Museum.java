/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program Museum
 * Sebagai Parent Class dari Class Collection
 * Collection 'part of' Museum
 */

import java.util.List;

public class Museum {
	private String museumName;
	private String address;
	private final List<Collection> collections;
	
	/**
	 * Constructor
	 */
	public Museum(String name, String address, List<Collection> collections) {
		this.museumName = name;
		this.address = address;
		this.collections = collections;
	}
	
	// Getter Nama Museum
	public String getMuseumName() {
		return this.museumName;
	}
	
	// Method Menampilkan Collection Berdasarkan Category
	public void showByCategory(String Category) {
		System.out.println("\nOur " + Category + " Collections : ");
		for(Collection coll : collections) {
			if(Category.equals(coll.getCategoty())) {
				System.out.println(" " + coll.getCollName());
			}
		}
	}
	
	// Methon Menampilkan Semua Collection Museum
	public void showAll() {
		System.out.println("\nOur Collections : ");
		for(Collection coll : collections) {
			System.out.println("\n " + coll.getCollName());
			System.out.println(" Category : " + coll.getCategoty());
		}	
	}
}
