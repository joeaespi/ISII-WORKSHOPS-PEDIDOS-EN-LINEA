package ec.edu.espol.workshops.second;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import java.util.Random;

public class StepsDefs {
	private int age;
	private String sex;
	private String state;
	private int prima = 500 ;
	
	@Given("Customer is Female and married")
	public void Male_married_valid() {
		sex = "M";
		state = "married";
	}

	@When("Calculate the premium")
	public void calculate_premiun() {
		if(sex.equals('M') || state.equalsIgnoreCase("married") ) {
			prima=prima-200;
			
		}
	}
	
	@Then("Prima is 300")
	public void show_prima() {
		System.out.print(prima);
	}
	
	@Given("The customer age is between 44 and 65 years old")
	public void age_valid() {
		Random rn = new Random();
		int range = 65 - 44 + 1;
		age =  rn.nextInt(range) + 44;
	}

	@When("Calculate the calcule premiun for age")
	public void calculate_premiun_age() {
		if(age > 45 && age<65) {
			prima=prima-100;
		}
	}
	
	@Then("Prima is 400")
	public void show_prima_age() {
		System.out.print(prima);
	}	
	
}