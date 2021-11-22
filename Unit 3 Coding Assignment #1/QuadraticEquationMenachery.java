/*
Sangeeth Menachery
Exercise 3.3
Solutions using discriminant
*/

public class QuadraticEquationMenachery {
    private double a;
    private double b;
    private double c;
    private double solution1;
    private double solution2;
    private double discriminant;

    public QuadraticEquationMenachery(double anew, double bnew, double cnew) {
       a = anew;
       b = bnew;
       c = cnew;
    }

    public boolean hasSolutions() {
        discriminant = ((Math.pow(b, 2)) - (4 * a * c));
        if (discriminant >= 0) {
        return true;
        }
        else {
        return false;
        }
        
    }


    public void findSolutions() {
        if (discriminant == 0) {
            double x1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            solution1 = x1;
        } else if (discriminant > 0){
            double x1s = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            double x2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
            solution1 = x1s;
            solution2 = x2;
        }
    }

    public String getSolutions() {
        hasSolutions();
        findSolutions();
        System.out.println(discriminant);
        if(discriminant > 0){
            String anss1 = "x1 = " + solution1 + " and x2 = " + solution2;
            return anss1;
        }
        else if(discriminant == 0){
            String anss2 = "x1 = " + solution1;
            return anss2;
        }
        else{
            String anss2 = "No real solutions";
            return anss2;
        }
    }

    
    public static void main(String[] args) {
        QuadraticEquationMenachery equation = new QuadraticEquationMenachery(2.0, -11.0, 5.0);
        QuadraticEquationMenachery equation2 = new QuadraticEquationMenachery(1.0, 4.0, 4.0);
        QuadraticEquationMenachery equation3 = new QuadraticEquationMenachery(1.0, 4.0, 7.0);

        equation.getSolutions();
        equation2.getSolutions();
        equation3.getSolutions();
    }
}
