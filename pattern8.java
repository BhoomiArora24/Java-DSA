import java.util.Scanner;
class pattern8{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int star=1;
        // int space=n-1;
        // for(int i=1;i<=n;i++){
        //     // System.out.println(space+", "+ star );
        //     for(int j=1; j<=space; j++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1; j<=star; j++){
        //         System.out.println("*\t");
        //     }
        //     space--;
        //     System.out.println();
        // }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j==n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

        }
        System.out.println();
        scn.close();
    }
}
}