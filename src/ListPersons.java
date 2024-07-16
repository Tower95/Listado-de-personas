import java.util.*;

public class ListPersons {

  public static List<Person> persons = new ArrayList<>();

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean live = true;

    while (live) {

      printMenu();

      try {
        int imput = Integer.parseInt(scanner.nextLine());

        switch (imput) {
          case 1:
            addPerson();
            break;
          case 2:
            listPersons();
            break;
          case 3:
            live = exit(live);
          default:
            System.out.println("Opcion erronea: " + imput);
            break;
        }
      }catch (Exception e){
        System.out.println("Ocurrio un error:" + e.getMessage());
      }

    }

  }

  private static void printMenu() {
    System.out.print(
            "**** Listado de personas ****\n" +
            "1.Agregar\n" +
            "2.Listar\n" +
            "3.Salir\n"  +
            "Proporciona La opcion : "
    );
    System.out.println();
  }

  private static void addPerson(){
    String name,email,tel;
    Scanner scanner = new Scanner(System.in);

    System.out.println("**** Agregando nueva Persona ****");
    System.out.println("Ingrese el nombre de la persona");
    name = scanner.nextLine();
    System.out.println("Ingrese el email de la persona");
    email = scanner.nextLine();
    System.out.println("Ingrese el telefono de la persona");
    tel = scanner.nextLine();

    Person person = new Person(name,email,tel);
    persons.add(person);

    System.out.println("Se agrego la persona: " + person.getName());
  }

  private static void listPersons(){

    System.out.println("Personas: ");
    persons.forEach(System.out::println);
    System.out.println();
  }

  private static boolean exit(boolean live){
    System.out.println("saliste");
    return false;
  }

}
