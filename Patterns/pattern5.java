import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int space = n / 2;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            // Printing stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            // Moving to the next line
            System.out.println();
            
            // Adjusting space and star count for next row
            if (i < n / 2 + 1) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
        }
        
        scn.close();
    }
}
