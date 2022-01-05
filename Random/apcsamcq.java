public class apcsamcq {
   public static void main(String[] args) {
  int n = 2;
  int a = 0;
  while (n>0) {
     a += n % 10;
     n /= 10;
  }
  System.out.println(a);

}
}