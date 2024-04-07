package com.learning.core.day1session1;


//Interface representing Medicine Info
interface MedicineInfo {
void displayLabel();
}

//Tablet class implementing MedicineInfo interface
class Tablet implements MedicineInfo {
@Override
public void displayLabel() {
 System.out.println("Store Tablets in a cool dry place.");
}
}

//Syrup class implementing MedicineInfo interface
class Syrup implements MedicineInfo {
@Override
public void displayLabel() {
 System.out.println("Syrup is consumable only on prescription.");
}
}

//Ointment class implementing MedicineInfo interface
class Ointment implements MedicineInfo {
@Override
public void displayLabel() {
 System.out.println("Ointment is for external use only.");
}
}

//D01PO2 class to test the polymorphic behavior
public class D01PO2 {
public static void main(String[] args) {
 // Declare Medicine instances
 MedicineInfo medicine1 = new Tablet();
 MedicineInfo medicine2 = new Syrup();
 MedicineInfo medicine3 = new Ointment();
 
 // Check the polymorphic behavior of displayLabel() method
 medicine1.displayLabel();
 medicine2.displayLabel();
 medicine3.displayLabel();
}
}
