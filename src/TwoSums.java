import java.util.Scanner;

public class TwoSums {
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);

        System.out.println("Enter target:");
        int target = count.nextInt();
        System.out.println("Enter length of massive: ");

        int[] massive = new int[count.nextInt()];

        System.out.println("Enter value: ");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = count.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < massive.length && !found; i++) {
            for (int j = i+1; j < massive.length; j++) {
                if (massive[i] + massive[j] == target) {
                    System.out.println(massive[i] + " " + massive[j]);
                    found = true;
                }
            }
        }
    }
}
