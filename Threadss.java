package homework5;

import java.util.Arrays;

public class Threadss {
    static final int size = 10000000;
    static final int h = size / 2;
    private static final float[] arr1 = new float[size];
    private static final float[] arr2 = new float[size];

    public static void main(String[] args) {
        Arrays.fill(arr1,1f);
        Arrays.fill(arr2,1f);

        long firstTime = System.nanoTime();
        calcArr(arr1);
        long newTime = System.nanoTime() - firstTime;
        System.out.println("1 поток по времени: " + newTime * 1e-9f);

        firstTime = System.nanoTime();
        calcTwoArr(arr2);
        newTime = System.nanoTime() - firstTime;
        System.out.println("2 поток по времени: " + newTime * 1e-9f);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


    }

    private static void calcArr(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
    private static void calcTwoArr(float[] arr) {
        final float[] a1 = new float[h];
        final float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        CalcThreadss threadOne = new CalcThreadss(a1,0);
        CalcThreadss threadTwo = new CalcThreadss(a2,h);

        try {
            threadOne.join();
            threadTwo.join();
            System.out.println(threadOne.returnedValue);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
    }


}
