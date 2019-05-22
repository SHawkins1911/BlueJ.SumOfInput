/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        System.out.println("Please give me a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i=0; i < n; i++){
            sum += i;
        
        };
   
        
        System.out.print(sum);
    }
}
