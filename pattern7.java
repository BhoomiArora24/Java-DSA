import java.util.Scanner;
public class pattern7 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star=1;
        int space=0;
        for(int i=1;i<=n;i++){
            // System.out.println(space+", "+ star );
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=star; j++){
                System.out.println("*\t");
            }
            space++;
            System.out.println();
        }
        scn.close();
    }
}
