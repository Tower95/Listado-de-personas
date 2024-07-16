public class Person {
  private int id;
  private  String name;
  private String email;
  private String tel;
  private static int numeroDePerosnas = 0;

  // Constructors
  public Person(){
    this.id = ++numeroDePerosnas;
  }

  // Constructor Overload
  public Person(String name, String email, String tel){
    this();
    this.name = name;
    this.email = email;
    this.tel = tel;
  }

  // getters and setters

  public int getId() {
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setId(int id){
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTel(){
    return this.tel;
  }

  public void setTel(String tel){
    this.tel = tel;
  }
  // Override method toString


  @Override
  public String toString() {
    return "Persons{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", tel='" + tel + '\'' +
             ", Memory Address: '" + super.toString() + "\'" +
            "}";
  }

  public static void main(String[] args) {
   Person person = new Person("Ismael", "torrestmi3@gmail.com", "55563122812");
    System.out.println(person);
  }
}
