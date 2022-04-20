package lab.workshop.util;

import java.util.Scanner;

public class BookUtil {
   public static String getUserInput() {
	   Scanner input = new Scanner(System.in);	   
	   return input.nextLine();
   }
   public static void printHeader() {
	   System.out.println("-----------------------------------------------도서정보------------------------------------------------");
   }
   public static void printTail() {
	   System.out.println("------------------------------------------------------------------------------------------------------");
   }
}
