import java.util.Scanner;
class lcai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        int mostLeft = Math.min(Math.min(x1,x2),Math.min(x3,x4));
        int mostRight = Math.max(Math.max(x1,x2),Math.max(x3,x4));
        int mostUp = Math.max(Math.max(y1,y2),Math.max(y3,y4));
        int mostDown = Math.min(Math.min(y1,y2),Math.min(y3,y4));
        int largestSide = Math.max(Math.abs(mostLeft-mostRight),Math.abs(mostUp-mostDown));
        System.out.println(largestSide*largestSide);
        scanner.close();
    }
}