package sort;

import java.util.Arrays;

/**
 * 递归快排
 * 思路：在待排序的数组中随便找出一个数作为基准元素，然后对数组进行分区，把比基准元素大的元素放右边，小的放左边
 * 经过不断的比较交换后最后再把基准元素归位。然后再将基准元素左边和右边的元素进行同样的操作，不断递归
 * 直到待排序数组只有一个元素的情况
 * 时间复杂度：最好O(nlog2n)、最差O(n^2)、平均O(nlog2n)
 * 空间复杂度: 最好O(nlog2n)
 * 稳定性：不稳定
 */
public class QuickSort {
    public static void quickSort(int[] nums, int left, int right) {
        int _left = left;
        int _right = right;
        if (_left < _right) {
            int temp = nums[_left];
            while (_left != _right) {
                while (_left < _right && nums[_right] >= temp) {
                    _right--;
                }
                nums[_left] = nums[_right];
                while (_left < _right && nums[_left] <= temp) {
                    _left++;
                }
                nums[_right] = nums[_left];
            }
            nums[right] = temp;
            quickSort(nums, left, _left - 1);
            quickSort(nums, _right + 1, right);
        }
        System.out.println(Arrays.toString(nums));
    }


    
    public static void main(String[] args) {
        int[] nums = new int[]{10, 5, 2, 11, 2, 1, 4, 5, 4, 5, 1};
        quickSort(nums, 0, nums.length - 1);
    }
}
