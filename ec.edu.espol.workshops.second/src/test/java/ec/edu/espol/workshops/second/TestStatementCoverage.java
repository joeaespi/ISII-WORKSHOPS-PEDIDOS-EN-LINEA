package ec.edu.espol.workshops.second;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStatementCoverage {

	 @Test
	 public void testFirst() {
	      int prima = 2000;
	      String sexo = "M";
	      int edad = 20;
	      String casado = "not married";
	      CarInsurance carinsurence = new CarInsurance();
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testSecond() {
	     int prima = 300;;
	      String sexo = "M";
	      int edad = 25;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 
	 @Test
	 public void testThird() {
		  int prima = 400;
	      String sexo = "F";
	      int edad = 55;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 
	 @Test
	 public void testFourth() {
		  int prima = -1;
	      String sexo = "M";
	      int edad = 90;
	      String casado = "not married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
}
