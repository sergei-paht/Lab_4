import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        int c = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int m = in.nextInt();
        int b = m * m+1;
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = c + (int) (Math.random() * b);
            System.out.println(nums[i]);
        }
        System.out.println("_____________________________");

        for(int i = 0; i< nums.length; i++)  {
            if (nums[i] == Math.pow(m,2)) {
                System.out.printf("%d index = %d = m*m\n", i+1, nums[i]);
            }
        }
        in.close();
    }
}

