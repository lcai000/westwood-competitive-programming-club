import java.util.Scanner;
public class lcai{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int currLength = 0;
        for (int i = 0; i < N; i++){
            String currWord = scanner.next();
            if (currLength+currWord.length()<=K){
                if (currLength!=0){
                    System.out.print(" ");
                }
                currLength+=currWord.length();
            }
            else{
                System.out.println();
                currLength=currWord.length();
            }
            System.out.print(currWord);
        }
        scanner.close();
    }
}
//hello my name is Bessie and this is my essay