import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = 0;
        for (int i = 0; i < num; i++){
            String currOperation = scanner.next();
            if (currOperation.substring(1).equals("++") || currOperation.substring(0,2).equals("++")){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
    }
}