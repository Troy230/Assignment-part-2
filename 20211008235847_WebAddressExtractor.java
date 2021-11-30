
package webaddressextractor;
import java.util.Scanner;
 /**
 * @author Eden Kendo-Pindi
 */
public class WebAddressExtractor {

       public static void main(String[] arg){
         // asks to type a web adress
         Scanner info = new Scanner(System.in);
         System.out.printf("Please input a web adress:");
         String address =info.nextLine(); 
         
         // splits the web adress
         String split[] = address.split("\\.");
         String part1 = split[0];
         String part2 = split[1]; 
         String part3 = split[2]; 
         
        //outputs web adress in 3 parts 
       System.out.println("Adress:   :" +address);
       System.out.println("Heading   :" +part1);
       System.out.println("Company   :" +part2);
       System.out.println("Extension :" +part3);
        
    }
}
