public class Customer {

  private int id;
  private String name;
  private char gender;

  public Customer(int id, String name, char gender) {
    this.id = id;
    this.name = name;
    this.gender = gender;
  }

  public int getID() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return name + "(" + id + ")";
  }
}
