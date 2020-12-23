package ec.edu.espol.workshops.second;
import  java.util.Scanner;
import java.util.logging.Logger;
/**Aquí se realizan las pruebas.

 * @author: Joel Espinoza - Dario Triviño

 * @version: 08/11/2020/A

 * @see a

 */
public class CarInsurance {
	private static final Logger LOG = Logger.getLogger("CarInsurance");
	public static int carInsurance(String sexo,String state,int edad) {
		Customer customer = new Customer(edad, sexo, state);
		if (customer.getSex().equals("M") && customer.getAge() < 25 
				&& customer.getState().equalsIgnoreCase("not married")) {
			customer.setPrima(customer.getPrima() + 1500);
			LOG.info(String.valueOf(customer.getPrima()));
		}
		if (sexo.equals("M") && state.equalsIgnoreCase("married")) {
			customer.setPrima(customer.getPrima() - 200);
			LOG.info(String.valueOf(customer.getPrima()));
		}
		if (edad > 45 && edad < 65) {
			customer.setPrima(customer.getPrima() - 100);
			LOG.info(String.valueOf(customer.getPrima()));
		}
		if(edad >=80) {
			customer.setPrima(-1);
		}
	    return customer.getPrima();		
	}
} //terminación de la clase