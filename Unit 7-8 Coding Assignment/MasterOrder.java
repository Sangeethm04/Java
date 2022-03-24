import java.util.List;
import java.util.ArrayList;
public class MasterOrder {
    private List < CookieOrder > orders;
    public MasterOrder() {
        orders = new ArrayList < CookieOrder > ();
    }
    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }
    public int getTotalBoxes() {
        int totalBoxes = 0;
        for (CookieOrder order: orders) {
            totalBoxes = order.getNumBoxes();
        }
        return totalBoxes;
    }
    public int removeVariety(String cookieVar) {
        int totalBoxes = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getVariety().equals(cookieVar)) {
                totalBoxes = orders.get(i).getNumBoxes();
                orders.remove(i);
                i--;
            }
        }
        return totalBoxes;
    }
    public String toString() {
        String result = "";
        for (CookieOrder order: orders) {
            result = order.toString() + "\n";
        }
        return result;
    }
}