/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program Collection
 * Sebagai Child Class dari Class Museum
 * Collection 'part of' Museum
 */

public class Collection {
	private String collName;
	private String category;
	private int arrivalYear;
	
	/**
	 * Constructor
	 */
	public Collection(String name, String category, int year) {
		this.collName = name;
		this.category = category;
		this.arrivalYear = year;
	}
	
	/**
	 * Getter Atribut
	 */
	public String getCollName() {
		return this.collName;
	}
	public String getCategoty() {
		return this.category;
	}
	public int getArrivalYear() {
		return this.arrivalYear;
	}
}

