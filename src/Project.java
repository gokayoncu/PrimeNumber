import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        int num=0;

        for (int i=1; i<=100; i++){
            for (int j=1; j<=i; j++){
                if(i % j ==0){
                    num++;
                }
            }
            if(num ==2){
                System.out.print(","+i);
            }
            num =0;
        }
        System.out.println(" prime number.");
    }
}
