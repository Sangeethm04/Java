// Sangeeth Menachery
// Exercise 2.3
// Pizza Creation


/*This wouldn't make sense if somebody only 7 pizzas for example where it would not say there is not a full pizza so it would not 
count it but I added 7 to the total number of slices in case there was 9 slices and made numPizzas an int so it's always a whole number*/


public class PizzaRunMenachery
{
   // instance (class) variables
  // private double costPerPizza;cost per pizza slice - Uneeded
   private int slicesPerPizza = 8;
   private int sum;  // total slices for the order
   private int numPizzas;  // total pizzas being ordered
   private double totalCost;  // total cost for the order
   private int extra;  // amount of slices that will be left over
   
   // constructor (creates a PizzaRun object)
   //person1,2,3,4 is amount of slices ate by each
   public PizzaRunMenachery(double cost, int person1, int person2, int person3, int person4)
   {
   // costPerPizza = cost / slicesPerPizza; - Uneeded
    sum = person1 + person2 + person3 + person4;
    numPizzas = (int)((sum + 7)/slicesPerPizza);
    totalCost = cost * numPizzas;
    extra = (numPizzas * slicesPerPizza) - (sum);     
    }
   
   //Accessor Method
   public int getPizzas()
   {
      return numPizzas;
   }

   //Accessor Method
   public double getCost()
   {
      return totalCost;
   }

   //Accessor Method
   public int getExtra()
   {
      return extra;
   }
   
   // Main Method
   public static void main (String[] args)
   {
      /* Create two objects and print the number of pizzas for the order, the cost for each order,
         and the number of extra slices that will be left over once everyone eats their slices.
      */
      PizzaRunMenachery pizza1 = new PizzaRunMenachery(35.0, 8, 8, 8, 7);
      PizzaRunMenachery pizza2 = new PizzaRunMenachery(50.0, 17, 8, 8, 8);
      System.out.println("Pizza #1 - \n Total Pizza - " + pizza1.getPizzas() + " \n Total Cost - " + pizza1.getCost() + "\n Extra Slices - " + pizza1.getExtra());
      System.out.println("Pizza #2 - \n Total Pizza - " + pizza2.getPizzas() + " \n Total Cost - " + pizza2.getCost() + "\n Extra Slices - " + pizza2.getExtra());
   }
}

