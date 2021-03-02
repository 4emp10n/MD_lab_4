public class Demo {
    public static void main(String[] args) {
        MyClass vec1 = new MyClass();
        System.out.println(vec1.reverse(1234));

        int[] arr = new int [100];
        vec1.fillrand(arr);

        System.out.println("MAX number is " + vec1.min(arr));
        System.out.println("MAX number is " + vec1.max(arr));
        System.out.println("MIDDLE number is " + vec1.middle(arr));
    }
}
