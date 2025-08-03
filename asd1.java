public class asd1 {
    public static void useArray() {

        int[] marks = new int[10];

        for (int i = 0; i < 10; i++) {

            marks[i] = i + 1;
        }

        System.out.println("Printing numbers from the array:");
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);
        }
    }

    public static void main(String[] args) {
        useArray();
    }
}