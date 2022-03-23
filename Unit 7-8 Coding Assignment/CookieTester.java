public class CookieTester {
  public static void main(String[] args) {
    MasterOrder goodies = new MasterOrder();
    //initialize CookieOrder object with same data as in 2010 question A1.
    goodies.addOrder(new CookieOrder("Samoas", 5));
    goodies.addOrder(new CookieOrder("Shortbread", 5));
    goodies.addOrder(new CookieOrder("Thin Mints", 2));
    goodies.addOrder(new CookieOrder("Tagalongs", 3));
    goodies.addOrder(new CookieOrder("Thin Mints", 3));
    goodies.addOrder(new CookieOrder("Samoas", 3));
    System.out.println("*** Initialized cookie list ***");
    System.out.println(goodies);

    System.out.println("Total Boxes: " + goodies.getTotalBoxes());
    System.out.println();

    // remove chocolate chip instances from the list
    System.out.print("Shortbread cookie boxes removed = ");
    System.out.println(goodies.removeVariety("Shortbread"));
    System.out.println("*** After Shortbread cookie deletion ***");
    System.out.println(goodies);
    System.out.println("Total Boxes: " + goodies.getTotalBoxes());
    System.out.println();

    // remove brownie instances from the list (none available, do not alter the list)
    System.out.print("Samoas cookie boxes removed = ");
    System.out.println(goodies.removeVariety("Samoas"));
    System.out.println("*** After Samoas cookie deletion ***");
    System.out.println(goodies);
    System.out.println("Total Boxes: " + goodies.getTotalBoxes());
  }
}