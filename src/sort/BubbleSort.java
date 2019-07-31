package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 思路：元素之间两两比较，每次把最大的元素放在最后,n个元素只要比较n-1趟，第i趟 只用比较前n - i + 1 个元素
 * 时间复杂度：最好O(n),最坏O(n^2),平均O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */


public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        bubbleSort(new int[]{10, 5, 2, 11, 2, 1, 4, 5, 4, 5, 1});
    }
}
