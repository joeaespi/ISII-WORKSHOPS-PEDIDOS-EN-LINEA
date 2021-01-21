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
		LOG.info("The insurance company");
		Customer customer = new Customer(edad, sexo, state);
		if (customer.getSex().equals("M") && customer.getAge() < 25 
				&& customer.getState().equalsIgnoreCase("not married")) {
			customer.setPrima(customer.getPrima() + 1500);
			LOG.info(String.valueOf(customer.getPrima()));
		}
		if (customer.getSex().equals("M") && customer.getState().equalsIgnoreCase("married")
				&& customer.getAge() < 45) {
			if(customer.getAge() > 25) {
				customer.setPrima(customer.getPrima() - 100);
				LOG.info(String.valueOf(customer.getPrima()));
			}
			customer.setPrima(customer.getPrima() - 200);
			LOG.info(String.valueOf(customer.getPrima()));
		}
		if (customer.getAge() > 45 && customer.getAge() < 65) {
			customer.setPrima(customer.getPrima() - 100);
			LOG.info(String.valueOf(customer.getPrima()));
		}
		if (customer.getSex().equals("M") && customer.getAge() < 45 
				&& customer.getAge() > 25 && customer.getState().equalsIgnoreCase("not married")) {
			customer.setPrima(customer.getPrima() - 100);
			LOG.info(String.valueOf(customer.getPrima()));
		}
		return customer.getPrima();		
	} 
} //terminación de la clase