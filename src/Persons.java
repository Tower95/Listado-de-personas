public class Persons {
  private int id;
  private  String name;
  private String email;
  private String tel;
  private static int numeroDePerosnas = 0;

  
  public Persons (){
    this.id = ++numeroDePerosnas;
  }

  public Persons (String name, String email, String tel){
    this();
    this.name = name;
    this.email = email;
    this.tel = tel;
  }
}
