/**
 */

import java.util.List;
import java.util.ArrayList;

public class CollegeGroup {
   private ArrayList < College > myColleges;

   /**
   @param
   */
   public CollegeGroup(ArrayList < College > colleges) {
      myColleges = colleges;
   }

   /**
   @param 
   @param
   */
   public void updateTuition(String collegeName, int newTuition) {
      for (College c: myColleges) {
         if (c.getName().equals(collegeName)) {
            c.setTuition(newTuition);
         }
      }
   }

   /**
   @param   
   @param
   @param
   */
   public ArrayList < College > getCollegeList(String region, int low, int high) {
      ArrayList < College > criteria = new ArrayList < College > ();
      for (College c: myColleges) {
         if (c.getRegion().equals(region) && c.getTuition() >= low && c.getTuition() <= high) {
            criteria.add(c);
         }
      }
      return criteria;
   }

   /**
    */
   public void printColleges() {
      for (College c: myColleges) {
         System.out.println(c.getName() + " - " + c.getRegion() + " - " + c.getTuition());
      }
   }
}