public class MyClass {
    private double x;
    public static int[]fillrand(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 99);
        }
        return arr;
    }
    public static int max(int[] array) {
        int s = array[0];
        for (int i = 0; i < array.length; i++) {
            if (s < array[i]) {
                s = array[i];
            }
        }
        return s;
    }

    public static int min(int[] array) {
        int s = array[0];
        for (int i = 0; i < array.length; i++) {
            if (s > array[i]) {
                s = array[i];
            }
        }
        return s;
    }

    public static int middle(int[] array) {
        return (min(array) + max(array)) / 2;
    }


    public static long reverse(int x){
        long r = 0;
        while (x != 0) {
            r *= 10;
            r += (x % 10);
            x /= 10;
        }
        return r;
    }
}






