public class MultiplierMenachery {
    int num1;
    int num2;
    int product;
    public MultiplierMenachery(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getProduct() {
        if (num2 == 0) {
            return num2;
        } else {
            product += num1;
            num2--;
            getProduct();
        }
        return product;
    }
    public static void main(String[] args) {
        MultiplierMenachery test = new MultiplierMenachery(1, 7);
        System.out.println(test.getProduct());
        MultiplierMenachery test2 = new MultiplierMenachery(7, 1);
        System.out.println(test2.getProduct());
        MultiplierMenachery test3 = new MultiplierMenachery(4, 9);
        System.out.println(test3.getProduct());
        MultiplierMenachery test4 = new MultiplierMenachery(9, 4);
        System.out.println(test4.getProduct());
    }
}