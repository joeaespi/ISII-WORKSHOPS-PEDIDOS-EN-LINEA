package ec.edu.espol.workshops.second;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPathCoverage {

	 @Test
	 public void testFirst() {
		 TestStatementCoverage tesfirst= new TestStatementCoverage();
		 tesfirst.testFirst();
	 }
	 @Test
	 public void testSecond() {
		 TestStatementCoverage tesfirst= new TestStatementCoverage();
		 tesfirst.testSecond();
	 }
	 
	 @Test
	 public void testThird() {
		  int prima = 500;
	      String sexo = "F";
	      int edad = 25;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 
	 @Test
	 public void testFourth() {
		 TestStatementCoverage tesfirst= new TestStatementCoverage();
		 tesfirst.testThird();
	 }
	 
	 @Test
	 public void testFith() {
		 TestStatementCoverage tesfirst= new TestStatementCoverage();
		 tesfirst.testFourth();
	 }
}
