import java.util.*;
public class Sidesquare {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side value");
        int side= sc.nextInt();
        int area= side*side;
        System.out.println("area of the square is:"+area);
    }
}