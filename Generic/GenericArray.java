public class GenericArray {
    public static <T> void display(T[] array) {
        for (T item : array)
            System.out.println(item);
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] strs = {"A", "B", "C"};
        display(nums);
        display(strs);
    }
}
