public class CookieOrderMenachery {
  /* Instance variables go here.*/
  private String variety;
  private int boxes;


  /** Constructs a new CookieOrder object. */
  public CookieOrderMenachery(String variety, int numBoxes) {
    this.variety = variety;
    this.boxes = numBoxes;
  }

  /** Method to get the variety of cookie being ordered.
   *  @return the variety of cookie being ordered
   */
  public String getVariety() {
    return variety;
  }

  /** Method to get the number of boxes being ordered.
   *  @return the number of boxes being ordered
   */
  public int getNumBoxes() {
    return boxes;
  }

  /** The toString method should return a formatted string that gives
   *  the variety and the number of boxes being ordered.
   */
  public String toString() {
    return variety + " - " + boxes + " boxes";
  }
}