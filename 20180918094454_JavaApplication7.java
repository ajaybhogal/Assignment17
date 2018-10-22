
package javaapplication7;
import java.util.Scanner;


public class JavaApplication7 {

  
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       int n;
      
       System.out.print("Enter the value of n :");
       n = console.nextInt();
       for(int i=0;i<n;i++){
           for(int j=n;j>i;j--){
               System.out.print(" *");
           }
           System.out.println(" ");
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
           
       }
       console.close();
    }
    
}
