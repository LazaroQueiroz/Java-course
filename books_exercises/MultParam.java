import java.util.Scanner;

public class MultParam{
    public static void method(int... param){
        for(int p : param){
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] params = new int[10];
        for(int i=0; i<10; i++){
            params[i] = sc.nextInt();
        }
        method(params);
        sc.close();
    }
}
