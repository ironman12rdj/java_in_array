import java.util.Scanner;

public class smallestNumber {
    public static int small(int marks[]) {
        int value = Integer.MAX_VALUE;
        for(int i = 0 ; i <marks.length;i++){
            if(marks[i]<value){
                value = marks[i];
            }
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int marks[] = {12,32,452,54,6,6576,768,87,876876,876,876,87,-12};
        int result = small(marks);
        System.out.println(result);
    }    
}
