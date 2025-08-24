import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter target:");
        int target = sc.nextInt();
        System.out.println("Enter length of array: ");
        int[] massive = new int[sc.nextInt()];

        System.out.println("Enter values: ");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = sc.nextInt();
        }

        twoSum(massive, target);
    }

    private static void twoSum(int[] nums, int target) {
        Set<Integer> firstPair = new HashSet<>();

        boolean found = false;
        for(int num : nums) {
            int complement = target - num;//7
            if(firstPair.contains(complement)) {
                System.out.println(complement + " + " + num);
                found = true;
                break;
            }
            firstPair.add(num);
        }
        if(!found) {
            System.out.println("Not found");
        }
    }
}