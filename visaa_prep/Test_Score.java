import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        if (Y % X == 0 && Y <= N * X) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
