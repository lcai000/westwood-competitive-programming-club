import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++){
            int currSum = 0;
            for (int j = 0; j < 3; j++){
                currSum+=scanner.nextInt();
            }
            if (currSum>=2){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
