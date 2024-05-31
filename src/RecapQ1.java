import java.util.Scanner;
public class RecapQ1 {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter Mark: ");
      int mark=scan.nextInt();

      if(mark>0 && mark<100){
          System.out.println("Valid mark");
          if(mark>=75 && mark<=100){
              System.out.println("A");
          }
          else if(mark>=65 && mark<=75){
              System.out.println("B");
          }
          else if(mark>=55 && mark<=65){
              System.out.println("C");
          }
          else if(mark>=40 && mark<=55){
              System.out.println("D");
          }
          else if(mark>=30 && mark<=55){
              System.out.println("F");
          }
      }
      else{
          System.out.println("Invalid mark");
      }
    }
}
