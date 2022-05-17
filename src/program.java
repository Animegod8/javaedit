import java.util.Scanner;


class program{
  // this is the start of the program
  public static void main(String[] args){
    System.out.println("Welcome to the program!");
    System.out.printf("Would you like to CREATE a file or write to an existing one(type in lowercase): " );
    Scanner myObj = new Scanner(System.in);
    String choice = myObj.nextLine();
    switch(choice){
      case "create":
        System.out.println("Test1");
      break;
      case "write":
        System.out.println("Not implemented");
      break;
    }
  }
}