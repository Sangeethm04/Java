// Sangeeth Menachery
// Exercise 7.2
// College upodates

import java.util.ArrayList;

public class CollegeGroupMenachery {
   private ArrayList < CollegeMenachery > myColleges;

   /**
   @param
   */
   public CollegeGroupMenachery(ArrayList < CollegeMenachery > colleges) {
      myColleges = colleges;
   }

   /**
   @param 
   @param
   */
   public void updateTuition(String collegeName, int newTuition) {
      for (CollegeMenachery c: myColleges) {
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
   public ArrayList < CollegeMenachery > getCollegeList(String region, int low, int high) {
      ArrayList < CollegeMenachery > criteria = new ArrayList < CollegeMenachery > ();
      for (CollegeMenachery c: myColleges) {
         if (c.getRegion().equals(region) && c.getTuition() >= low && c.getTuition() <= high) {
            criteria.add(c);
         }
      }
      return criteria;
   }

   /**
    */
   public void printColleges() {
      for (CollegeMenachery c: myColleges) {
         System.out.println(c.getName() + " - " + c.getRegion() + " - " + c.getTuition());
      }
   }
}