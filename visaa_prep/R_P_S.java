import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char vigneshThrow = sc.next().charAt(0);
        char charanThrow = sc.next().charAt(0);
        if (vigneshThrow == 'S' && charanThrow == 'P'|| vigneshThrow == 'P' && charanThrow == 'R' || vigneshThrow == 'R' && charanThrow == 'S') {
            System.out.println("Vignesh");
        } else if (charanThrow == 'S' && vigneshThrow == 'P' || charanThrow == 'P' && vigneshThrow == 'R' || charanThrow == 'R' && vigneshThrow == 'S'){
          System.out.println("Charan");
        } else { 
          System.out.println("NULL");
        }
   }
}
