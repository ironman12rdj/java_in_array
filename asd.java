import java.util.Scanner;

public class asd {

    public static void main(String[] args) {
        // System.out.println("asd");
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        for(int i = 1 ; i<=10 ;i++){
            marks[i] = sc.nextInt();
        }
        for(int j = 1 ;j<=10;j++){
            System.out.print(marks[j]+",");
        }
    }
}