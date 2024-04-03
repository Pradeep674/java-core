package com.learning.core.day1session1;

public class D02P02 {
	// Test class to demonstrate polymorphic behavior
	    public static void main(String[] args) {
	        // Declare medicine instances
	        MedicineInfo tablet = new Tablet();
	        MedicineInfo syrup = new Syrup();
	        MedicineInfo ointment = new Ointment();

	        // Check the polymorphic behavior of the displayLabel() method
	        tablet.displayLabel();
	        syrup.displayLabel();
	        ointment.displayLabel();
	    }
	}
	// Define the MedicineInfo interface
	interface MedicineInfo {
	    void displayLabel();
	}

	// Implement MedicineInfo with the Tablet class
	class Tablet implements MedicineInfo {
	    @Override
	    public void displayLabel() {
	        System.out.println("Store Tablets in cool dry place.");
	    }
	}

	// Implement MedicineInfo with the Syrup class
	class Syrup implements MedicineInfo {
	    @Override
	    public void displayLabel() {
	        System.out.println("Syrup is consumable only on prescription.");
	    }
	}

	// Implement MedicineInfo with the Ointment class
	class Ointment implements MedicineInfo {
	    @Override
	    public void displayLabel() {
	        System.out.println("Ointment is for external use only.");
	    }
}
