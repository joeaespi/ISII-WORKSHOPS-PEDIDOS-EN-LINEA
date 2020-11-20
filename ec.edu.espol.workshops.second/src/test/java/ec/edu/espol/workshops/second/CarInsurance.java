package ec.edu.espol.workshops.second;
import  java.util.Scanner;
import java.util.logging.Logger;

public class CarInsurance {
  /**Aquí se realizan las pruebas.

   * @author: Joel Espinoza - Dario Triviño

   * @version: 08/11/2020/A

   * @see a

   */
	private static final Logger LOG = Logger.getLogger("CarInsurance");
	public static void main(String[] args) {
		int prima = 500;
		Scanner entrada = new Scanner(System.in);
		LOG.info("The insurance company");
		LOG.info("Su sexo: M/F");
		String sexo = entrada.nextLine();
		LOG.info("Estad civil: married/not married");
		String state = entrada.nextLine();
		LOG.info("Ingrese su edad:");
		int edad = entrada.nextInt();
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
			prima -= 100;
			LOG.info(String.valueOf(customer.getPrima()));
		}
	}
} //terminación de la clase