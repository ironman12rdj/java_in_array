import java.util.Scanner;

public class largestNumber {
    public static int largestvalue(int marks[]) {
         int value =Integer.MIN_VALUE;
         for(int i = 0 ; i<marks.length;i++){
            if (marks[i]> value) {
                value =marks[i];
            }
         }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = {12,34,51,5,52,643,63,6436,536,63,64};
        int result = largestvalue(marks);
        System.out.println(result);


    }    
}
