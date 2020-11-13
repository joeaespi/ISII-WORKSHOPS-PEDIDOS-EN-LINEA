package ec.edu.espol.workshops.second;
import java.util.Scanner;

public class CarInsurance {
	public static void main(String[] args) {
		int prima =500;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("The insurance company");
		
		System.out.print("Su sexo: M/F");
		String sexo = entrada.nextLine();
		System.out.print("Estad civil: married/not married");
		String state = entrada.nextLine();
		System.out.print("Ingrese su edad");
		int edad = entrada.nextInt();
		
		Customer customer = new Customer(edad,sexo,state);

		if(customer.getSex().equals('M')&& customer.getAge() < 25 && customer.getState().equalsIgnoreCase("not married")) {
			customer.setPrima(customer.getPrima()+1500);
			System.out.print(customer.getPrima());
		}
		if(sexo.equals('M') || state.equalsIgnoreCase("married") ) {
			customer.setPrima(customer.getPrima()-200);
			System.out.print(customer.getPrima());
		}
		
		if(edad > 45 && edad<65) {
			customer.setPrima(customer.getPrima()-100);
			prima-=100;
			System.out.print(customer.getPrima());
		}
		
		
	}
	
	

}
