public class loopsandstrings {
    public static void main(String[] args) {
        int count = 0;
        String name = "Sangeeth";
        for(int x = 0; x < name.length(); x++) {
        String let = name.substring(x, x+1);
        if(let.equals("e"))
        count++;
        }
        System.out.println(count);
    }
    
}

