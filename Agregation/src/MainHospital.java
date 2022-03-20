/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program MainHospital
 * Sebagai Main Program
 */

import java.util.ArrayList;
import java.util.List;

public class MainHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Membuat objek-objek specialist baru dengan parameter nama, id, dan division
		 */
		Specialist sp1 = new Specialist("Aini", "001", "Ophthalmologist");
		Specialist sp2 = new Specialist("Nurul", "002", "Anesthetic");
		Specialist sp3 = new Specialist("Azizah", "003", "General Practitioner");
		Specialist sp4 = new Specialist("Nurin", "004", "Radiologist");
		Specialist sp5 = new Specialist("Rusyida", "005", "Ophthalmologist");
		Specialist sp6 = new Specialist("Hamidah", "006", "General Practitioner");
		
		/**
		 * Menambahkan objek-objek specialist ke dalam array list division sesuai division-nya
		 */
		List<Specialist> ophthalmologist = new ArrayList<Specialist>();	
		ophthalmologist.add(sp1);									
		ophthalmologist.add(sp5);
		
		List<Specialist> anesthetic = new ArrayList<Specialist>();
		anesthetic.add(sp2);
		
		List<Specialist> general = new ArrayList<Specialist>();
		general.add(sp3);
		general.add(sp6);
		
		List<Specialist> radiologist = new ArrayList<Specialist>();
		radiologist.add(sp4);
		
		/**
		 * Membuat objek-objek division dengan paramater nama divisi, kode divisi, dan list specialist
		 */
		Division Ophthalmologist = new Division("Ophthalmologist", "oph", ophthalmologist);
		Division Anesthetic = new Division("Anesthetic", "ans", anesthetic);
		Division GeneralPractitioner = new Division("General Practitioner", "genp", general);
		Division Radiologist = new Division("Radiologist", "rad", radiologist);
		
		/**
		 * Menambahkan objek-objek division ke dalam array list division
		 */
		List<Division> divisions = new ArrayList<Division>();
		divisions.add(Ophthalmologist);
		divisions.add(GeneralPractitioner);
		divisions.add(Anesthetic);
		divisions.add(Radiologist);
		
		// Membuat objek hospital baru
		Hospital hospital = new Hospital("WELLNESS CENTER", divisions);
		
		// Menampilkan semua layanan dengan memanggil method print dari objek hospital
		hospital.printHospitalService();
	}

}
