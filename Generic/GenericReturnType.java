class ReturnGeneric {
    static <T> T getElement(T[] arr, int index) {
        return arr[index];
    }
}

public class GenericReturnType {
    public static void main(String[] args) {
        Integer[] nums = {10, 20, 30};
        String[] words = {"Hello", "World"};
        System.out.println(getElement(nums, 1));
        System.out.println(getElement(words, 0));
    }
}
