import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class program{
  // this is the start of the program
  public static void main(String[] args){
    System.out.println("Welcome to the program!");
    System.out.printf("Would you like to CREATE a file or write to an existing one(type in lowercase): " );
    Scanner myObj = new Scanner(System.in);
    String choice = myObj.nextLine();
    switch(choice){
      case "create":
        fileHandling.createfile();
      break;
      case "write":
        fileHandling.selectFile();
      break;
    }
  }
}


class fileHandling extends program{
  
 public static String fileWrite;
 public static String texttowrite;
  public static void createfile(){
      System.out.printf("Name the new file: ");
      Scanner myFilename = new Scanner(System.in);
      String filename = myFilename.nextLine();
    try{
      File filetocreate = new File(filename);
      if(filetocreate.createNewFile()){
        System.out.println("File created!");
        
      } else {
        System.out.println("File exists");
      }
      } catch (IOException e){
        System.out.println("An error has occured");
        e.printStackTrace();
      }
  }


  public static void selectFile(){
    System.out.printf("Selcect file to write: ");
    Scanner myFilename = new Scanner(System.in);
    fileWrite = myFilename.nextLine();
    File myFile = new File(fileWrite);
        if(myFile.exists()){
          fileHandling.writeFile();
        } else {
          System.out.println("Create the file, or you misstyped the name");
        }
    
      }
     public static void writeFile(){
        System.out.println("Type text to write");
         Scanner myText = new Scanner(System.in);
         texttowrite = myText.nextLine();
         try{
           File myObj =  new File(fileWrite);
           
         }
      }
    }
  
 
