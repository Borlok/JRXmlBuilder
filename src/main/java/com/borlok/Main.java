package com.borlok;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int [] arr = new int[100000];
        int [] arr2;
        fill(arr);
        arr2 = arr.clone();

        long start = System.nanoTime();
        Arrays.sort(arr);
        long stop = System.nanoTime();
        long result = stop - start;
        System.out.println("Standart sort " + result);

        start = System.nanoTime();
        new FastSort(arr2).sort();
        stop = System.nanoTime();
        long result2 = stop - start;
        System.out.println("Fast sort " + result2);

        System.out.println(result2 / 1000000 - result / 1000000);
    }

    private static void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length + 1);
        }
    }
}
