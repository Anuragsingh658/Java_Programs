import java.util.*;
public class age {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if (age>=18) {
            System.out.println("Adult:Vote:Drive");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}