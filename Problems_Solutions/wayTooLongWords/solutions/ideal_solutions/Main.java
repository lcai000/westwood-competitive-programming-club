import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String [] words = new String[num];
        for (int i = 0; i<num; i++){
            String currWord = scanner.next();
            if (currWord.length()>10){
                words[i]=currWord.substring(0,1)+(currWord.length()-2)+currWord.substring(currWord.length()-1);
            }
            else{
                words[i]=currWord;
            }
            System.out.println(words[i]);
        }
    }
}
