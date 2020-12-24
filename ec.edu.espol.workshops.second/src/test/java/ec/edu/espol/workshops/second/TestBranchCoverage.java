package ec.edu.espol.workshops.second;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBranchCoverage {

	 @Test
	 public void testFirst() {
		 TestPathCoverage tesfirst= new TestPathCoverage();
		 tesfirst.testFirst();
	 }
	 @Test
	 public void testSecond() {
		 TestPathCoverage tesfirst= new TestPathCoverage();
		 
		 tesfirst.testSecond();
	 }
	 
	 @Test
	 public void testThird() {
		 TestPathCoverage tesfirst= new TestPathCoverage();
		 tesfirst.testThird();
	 }
	 
	 @Test
	 public void testFourth() {
		 TestPathCoverage tesfirst= new TestPathCoverage();
		 tesfirst.testFourth();
	 }
	 
	 @Test
	 public void testFith() {
		 TestPathCoverage tesfirst= new TestPathCoverage();
		 tesfirst.testFith();
	 }
	 
	 @Test
	 public void testSixth() {
		 int prima = 500;
	      String sexo = "F";
	      int edad = 20;
	      String casado = "not married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }

}
