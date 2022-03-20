/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program MainMuseum
 * Sebagai Main Program
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMuseum {

	public static void main(String[] args) {
		
		// Membuat objek - objek koleksi baru dari class Collection 
		Collection c1 = new Collection("Beach View", "Painting", 2004);
		Collection c2 = new Collection("Magic Robot", "Toy", 2001);
		Collection c3 = new Collection("Rare Wooden Spoon", "Cutlery", 2010);
		Collection c4 = new Collection("Rattan Doll", "Toy", 1998);
		Collection c5 = new Collection("Pretty Woman", "Painting", 2014);
		Collection c6 = new Collection("Unknown Bone", "Discovery", 1995);
		
		// Membuat list berisi objek koleksi
		List<Collection> collections = new ArrayList<Collection>();
		collections.add(c1);
		collections.add(c2);
		collections.add(c3);
		collections.add(c4);
		collections.add(c5);
		collections.add(c6);
		
		// Membuat objek museum baru melalui class Museum
		Museum newMuseum = new Museum("Hicks Side", "London", collections);
		
		// Menampilkan User Interface
		System.out.println(" === WELCOME TO " + newMuseum.getMuseumName() + " !! ===\n");
		System.out.println("1. Show All Collections");
		System.out.println("2. Show Collections By Category");
		System.out.println("3. Quit");
		System.out.println(" Your Choice : ");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if(i == 1) {							// Jika user memilih 1 maka
			newMuseum.showAll();				// panggil method showAll dari objek museum
		} else if(i == 2) {						// Jika user memilih 2 maka	
			System.out.println("\nCATEGORY :");
			System.out.println("1. Painting");
			System.out.println("2. Discovery");
			System.out.println("3. Cutlery");
			System.out.println("4. Toy");
			System.out.println(" Input Category : ");	
			String c = input.next();			// User memasukkan kategori
			newMuseum.showByCategory(c);		// Panggil methos showByCategory dari objek museum
		}
		
		System.out.println("\n\n === THANK YOU ===");
	}

}

