/**
 */
public class College {
   private String name;
   private String region;
   private int tuition;

   /**Constructs a college with three parameters
      @ param
      @ param
      @ param
   */
   public College(String name, String region, int tuition) {
      this.name = name;
      this.region = region;
      this.tuition = tuition;
   }
         

   /**
   @return the college name
   */
   public String getName() {
      return name;
   }

   /**
   @return the region in which the college resides
   */
   public String getRegion() {
      return region;
   }

   /**
   @return the tuition for the college
   */
   public int getTuition() {
      return tuition;
   }

   /**
   Sets the college's tuition to the new tuition
   @param newTuition - new tuition amount
   */
   public void setTuition(int newTuition) {
      tuition = newTuition;
   }
}