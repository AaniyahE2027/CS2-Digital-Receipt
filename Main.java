public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");
      // RECEIPT PRINTOUT SECTION
     
     String highSchoolName = "Birch Wathen Lenox";
     double drinkPrice = 1.50;
     double candyPrice = 1.25;
     double hotDogPrice = 2.75;
     double hamburgerPrice = 3.50;  
     //random number
     double orderNumber = (int)(Math.random() * 100) + 1;
     System.out.println(orderNumber);



     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName+ " Snack Bar   *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice + "           *");                      
     System.out.println("*     Candy ..........$" + candyPrice +"          *");     
     System.out.println("*     Hot Dog ........$" + hotDogPrice + "          *");     
     System.out.println("*     Hamburger ......$" + hamburgerPrice + "           *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");

   }
}
