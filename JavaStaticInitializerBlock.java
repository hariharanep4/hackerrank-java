import java.util.Scanner;

public class Solution {
    public static Scanner input = new Scanner(System.in);
    public static int B = input.nextInt();
    public static int H = input.nextInt();
    public static boolean flag = true;
    
    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}