package ec.edu.espol.workshops.second;

public class Customer {
  private int age;
  private String sex;
  private String state;
  private int prima;

  /**
   * Esta clase es customer.
   * @author: Joel
   * @author: Joel
   * @version: 1
   * @see CarInsurance
   */
  public Customer(int age, String sex, String state) {
    this.age = age;
    this.sex = sex;
    this.state = state;
    this.prima = 500;
  }

  public int getAge() {
    return this.age;
  }

  public String getSex() {
    return this.sex;
  }

  public String getState() {
    return this.state;
  }

  public int getPrima() {
    return this.prima;
  }

  public void setPrima(int prima) {
    this.prima = prima;
  }
}
