package ec.edu.espol.workshops.second;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarInsuranceTest {

	 @Test
	 public void testFirst() {
		 System.out.print("First Test");
	      int prima = 2000;
	      String sexo = "M";
	      int edad = 20;
	      String casado = "not married";
	      CarInsurance carinsurence = new CarInsurance();
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testSecond() {
		 System.out.print("Second Test");
	     int prima = 300;;
	      String sexo = "M";
	      int edad = 25;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 
	 @Test
	 public void testThird() {
		 System.out.print("Third Test");
		  int prima = 400;
	      String sexo = "M";
	      int edad = 40;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 
	 
	 @Test
	 public void testFourth() {
		 System.out.print("Fourth Test");
		  int prima = 400;
	      String sexo = "F";
	      int edad = 55;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 
	 @Test
	 public void testFith() {
		 System.out.print("Fith Test");
		  int prima = 500;
	      String sexo = "M";
	      int edad = 90;
	      String casado = "not married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
}
