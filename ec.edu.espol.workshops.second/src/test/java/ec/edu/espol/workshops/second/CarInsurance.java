package ec.edu.espol.workshops.second;
import  java.util.Scanner;
import java.util.logging.Logger;

public class CarInsurance {
  /**Aquí se realizan las pruebas.
   * @author: Joel Espinoza - Dario Triviño
   * @version: 20/01/2021/A
   * @see A
   */
	private static final Logger LOG = Logger.getLogger("CarInsurance");
	public static int carInsurance(String sexo,String state,int edad) {
		Customer customer = new Customer(edad, sexo, state);
		if (customer.getSex().equals("M") && customer.getAge() < 25 
				&& customer.getState().equalsIgnoreCase("not married")) {
			customer.setPrima(customer.getPrima() + 1500);
		}
		if (customer.getAge() > 45 && customer.getAge() < 65) {
			customer.setPrima(customer.getPrima() - 100);
		}
		if (customer.getSex().equals("M") && customer.getAge() < 45 
				&& customer.getAge() > 25 ) {
			customer.setPrima(customer.getPrima() - 100);
		}
		return customer.getPrima();		
	} 
	public static void main(String args[]) {
		System.out.println("The insurance company");
		System.out.print("Ingrese su edad:");
	    	String entradaTeclado = "";
	    	Scanner entradaEscaner = new Scanner(System.in);
	    	entradaTeclado = entradaEscaner.nextLine();
	    	int edad = Integer.parseInt(entradaTeclado);
	    	System.out.print("Ingrese su sexo(M/F):");
	    	String sexo = entradaEscaner.nextLine();
	    	entradaTeclado = "";
	    	System.out.print("Ingrese si esta casado o no(married/not married):");
	    	String casado = entradaEscaner.nextLine();
	    	entradaTeclado = "";
	    	int prima=0;
	    	prima = carInsurance(sexo,casado,edad);
	    	System.out.println("El valor de la prima es "+prima);
		
	}
} //terminación de la clase
