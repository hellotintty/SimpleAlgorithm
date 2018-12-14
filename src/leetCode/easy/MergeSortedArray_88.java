package leetCode.easy;

import java.util.Arrays;

/**
 * @author tianqi
 * @date 2018/7/30
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m;i<m+n;i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] arge){

    }
}