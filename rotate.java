import java.util.Scanner;
public class rotate {
    
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scn.nextInt();
        System.out.println("Enter no of times it needs to be rotated");
        int rotate= scn.nextInt();
        int temp=n;
        int nod=0;
        while(temp>0){
            temp=temp/10;
            nod++;
        }
        if(rotate>nod){
        rotate=rotate%nod;
        }
        if(rotate<0){
            rotate=rotate+nod;
        }
        int div=1;
        int mult=1;
        for(int i=1;i<=nod; i++){
            if(i<=rotate){
                div=div*10;
            }
            else{
                mult=mult*10;
            }
        }
        int q=n/div;
        int r=n%div;
        int rem=r*mult+q;
        System.out.println(rem);
        scn.close();
    }
}
