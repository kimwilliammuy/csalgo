import java.util.*;
public class Strassen {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A00;
        int A01;
        int A10; 
        int A11; 
        int B00; 
        int B01; 
        int B10;
        int B11;
        int M1, M2, M3, M4, M5, M6, M7;
        int C00, C01, C10, C11;
        A00 = input.nextInt();
        A01 = input.nextInt();
        A10 = input.nextInt();
        A11 = input.nextInt();
        B00 = input.nextInt();
        B01 = input.nextInt();
        B10 = input.nextInt();
        B11 = input.nextInt();
        
        M1 = (A00 + A11) * (B00 + B11);
        M2 = (A10 + A11) * B00;
        M3 = A00 * (B01 - B11);
        M4 = A11 * (B10 - B00);
        M5 = (A00 + A01) * B11;
        M6 = (A10 - A00) * (B00 + B01);
        M7 = (A01 - A11) * (B10 + B11);
        
        C00 = M1 + M4 - M5 + M7;
        C01 = M3 + M5;
        C10 = M2 + M4;
        C11 = M1 + M3 - M2 + M6;
        System.out.print(C00 + "  " + C01 + "\n");
        System.out.print(C10 + "  " + C11);
   
    }
    
}