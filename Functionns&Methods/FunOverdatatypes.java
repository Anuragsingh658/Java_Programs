public class FunOverdatatypes {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(23, 34));
        System.out.println(sum(4.5f, 5.6f));
    }
}
