import java.util.Scanner;

public class linearSearch {
    public static int linearsearching(int marks[],int target) {
        for(int i = 0 ; i<marks.length;i++){
            if(marks[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = {2,43,53,64,64,64,7,476,4,46,75,75,3};
        int target = sc.nextInt();
        int index = linearsearching(marks,target);
         if (index == -1){
             System.out.println("not in index");

         }else{
            System.out.println("Found in index" + index);
            
             

         }

    }
}