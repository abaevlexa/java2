package homework5;

public class CalcThreadss extends Thread {
    private final float[] arr;
    private int offset;
    public int returnedValue;

    public CalcThreadss(float[] arr,int offset) {
        this.arr = arr;
        this.offset = offset;
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + "started");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i + offset) / 5) * Math.cos(0.2f + (i + offset) / 5) * Math.cos(0.4f + (i + offset) / 2));
            System.out.println(getName() + "stopped");
            returnedValue = 10;
        }
    }

}
