package com.borlok;


public class FastSort {
    private int [] arr;
    public FastSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        fastSort(0, arr.length - 1);
    }

    private void fastSort(int left, int right) {
        int length = right - left + 1;
        if (right - left <= 0)
            return;
        if (length < 10)
            insertSort(left,right);
        else {
            int pivot = arr[right];
            int center = centerIt(left, right, pivot);
            fastSort(left, center - 1);
            fastSort(center + 1, right);
        }
    }

    private void insertSort(int left, int right) {
        for (int i = left + 1; i < right; i++) {
            int in = i;
            int temp = arr[in];
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
    }

    private int centerIt(int left, int right, int pivot) {
        int leftCentr = left - 1;
        int rightCentr = right;
        while (true) {
            while (arr[++leftCentr] < pivot) ;
            while (rightCentr > 0 && arr[--rightCentr] > pivot) ;
            if (leftCentr >= rightCentr)
                break;
            else
                turn(leftCentr, rightCentr);
        }
        turn(leftCentr, right);
        return leftCentr;
    }

    private void turn(int leftCentr, int rightCentr) {
        int temp = arr[leftCentr];
        arr[leftCentr] = arr[rightCentr];
        arr[rightCentr] = temp;
    }
}
