public class GenericSwap {
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        swap(arr, 0, 2);
        for (int num : arr)
            System.out.println(num);
    }
}
