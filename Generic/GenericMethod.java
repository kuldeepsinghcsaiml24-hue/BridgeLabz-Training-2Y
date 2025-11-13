public class GenericMethod {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
