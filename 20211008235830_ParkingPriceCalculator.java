
package parkingpricecalculator;
import java.util.Scanner;
/**
 * @author Eden Kendo-Pindi
 */
public class ParkingPriceCalculator {

    
    public static void main(String[] args) {
    Scanner info = new Scanner(System.in);
      System.out.printf("Please input the number of minutes your car has parked:  ");
       int ppMin = info.nextInt();
       int ppHour = ppMin/60;
       
       int pricepHour = 2;
       double price = ppHour * pricepHour;
       int priceInt = (int)price;
       System.out.println("Parking time (minutes) :"+ppMin);
       System.out.println("Parking time (hour)    :"+((int)Math.ceil(ppMin / 60.0)));
       System.out.println("Price                  :"+priceInt);
    }
    
}
