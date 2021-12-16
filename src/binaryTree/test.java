package binaryTree;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        System.out.println("输入数组大小");
        size = scanner.nextInt();
        int[] nums = new int[size+1];
        for (int i = 1;i <= size;i++){
            nums[i] = i;
        }
        int sum = 0;
        for (int i:nums){
            sum += i;
        }
        System.out.print(sum);
    }
}