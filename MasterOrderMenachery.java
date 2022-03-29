// Sangeeth Menachery
// Exercise 7.1
// Coookies

import java.util.List;
import java.util.ArrayList;
public class MasterOrderMenachery {
    private List < CookieOrderMenachery > orders;
    public MasterOrderMenachery() {
        orders = new ArrayList < CookieOrderMenachery > ();
    }
    public void addOrder(CookieOrderMenachery theOrder) {
        orders.add(theOrder);
    }
    public int getTotalBoxes() {
        int totalBoxes = 0;
        for (CookieOrderMenachery order: orders) {
            totalBoxes += order.getNumBoxes();
        }
        return totalBoxes;
    }
    public int removeVariety(String cookieVar) {
        int totalBoxes = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getVariety().equals(cookieVar)) {
                totalBoxes += orders.get(i).getNumBoxes();
                orders.remove(i);
            }
        }
        return totalBoxes;
    }
    public String toString() {
        String result = "";
        for (CookieOrderMenachery order: orders) {
            result += order.toString() + "\n";
        }
        return result;
    }
}