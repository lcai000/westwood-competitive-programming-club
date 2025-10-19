import java.util.Scanner;
public class lcai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = scanner.nextInt();
        int cutOffPlace = scanner.nextInt();
        int count = 0;
        int cutOffScore;
        int[] scores = new int[numPeople];
        for (int i = 0; i < numPeople; i++){
            scores[i]=scanner.nextInt();
        }
        cutOffScore=scores[cutOffPlace-1];
        for (int j = 0; j < numPeople; j++){
            if (scores[j]>=cutOffScore&&scores[j]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}