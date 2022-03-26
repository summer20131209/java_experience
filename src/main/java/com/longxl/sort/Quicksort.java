package com.longxl.sort;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
//        int a = 5;
//        System.out.print(a/2);
        int[] arrays = new int[]{15, 63, 97, 12, 235, 66};
        System.out.println("排序前："+Arrays.toString(arrays));
        sort(arrays, 0, arrays.length - 1);
        System.out.println("排序后："+Arrays.toString(arrays));
    }

    public static void sort(int[] arrays, int left, int right) {
        int l = left;
        int r = right;

        int leftRightVar = (left + right);
        System.out.println("leftRightVar:"+leftRightVar);

        int a = leftRightVar/ 2;
        System.out.println("a:"+a);
        int pivot = arrays[a];
        System.out.println("pivot:"+pivot);
        int temp = 0;
        while (l < r) {

            //在左边查找小于中间值的
            while (arrays[l] < pivot) {
                l++;
            }
            //查询右边小于中间值
            while (arrays[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            temp = arrays[l];
            arrays[l] = arrays[r];
            arrays[r] = temp;

            //            交换完数据arrays[l] = pivot
            if (arrays[l] == pivot) {
                r--;
            }
            if (arrays[r] == pivot) {
                l++;
            }
            if (r == l) {
                l++;
                r--;
            }
            if (left < r) {
                sort(arrays, left, r);
            }
            if (right > l) {
                sort(arrays, l, right);
            }
        }
    }
}
