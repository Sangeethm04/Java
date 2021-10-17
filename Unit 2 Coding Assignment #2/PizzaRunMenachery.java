// Sangeeth Menachery
// Exercise 2.3
// Pizza Creation

public class PizzaRunMenachery
{
   // instance (class) variables
   private double costPerPizza;
   private int slicesPerPizza = 8;
   private int sum;  // total slices for the order
   private int numPizzas;  // total pizzas being ordered
   private double totalCost;  // total cost for the order
   private int extra;  // amount of slices that will be left over
   
   // constructor (creates a PizzaRun object)
   public PizzaRun(double cost, int person1, int person2, int person3, int person4)
   {
      
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
      PizzaRunMenachery pizza1 = new PizzaRunMenachery(35.0, 5, 5, 5, 5);
      PizzaRunMenachery pizza2 = new PizzaRunMenachery(35.0, 5, 5, 5, 2);
      System.out.println(pizza1.getPizzas() + pizza1.getCost());
      System.out.println(pizza2.getPizzas() + pizza2.getCost());
   }
}

