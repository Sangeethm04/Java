public class ArrayAssignmentAnswersTesterMenachery {
    public static void main(String[] args) {
        ArrayAssignmentMenachery a = new ArrayAssignmentMenachery();
        System.out.println(a.findNumber(1));
        System.out.println(a.findMax());
        System.out.println(a.findMin());
        System.out.println(a.findAvergage());
        a.swap(0, 1);
        a.reverse();
        a.numericOrder();
    }
}