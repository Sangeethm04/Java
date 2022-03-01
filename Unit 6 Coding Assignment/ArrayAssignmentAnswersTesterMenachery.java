import Chapt5.ArrayAverageMenachery;

public class ArrayAssignmentAnswersTesterMenachery {
    public static void main(String[] args) {
        ArrayAverageMenachery a = new ArrayAverageMenachery();
        System.out.println(a.findNumber(1));
        System.out.println(a.findMax());
        System.out.println(a.findMax());
        System.out.println(a.findAvergage());
        a.swap(0, 1);
        System.out.println(a.reverse());
        a.numericOrder();
    }
}