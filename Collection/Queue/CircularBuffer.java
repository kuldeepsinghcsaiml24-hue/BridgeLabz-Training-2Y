import java.util.*;
public class CircularBuffer {
    int[] buffer; int size; int index = 0; int count = 0;
    CircularBuffer(int size) { this.size = size; buffer = new int[size]; }
    void add(int val) { buffer[index] = val; index = (index + 1) % size; if (count < size) count++; }
    void display() { for (int i = 0; i < count; i++) System.out.print(buffer[(index + i) % size] + " "); }
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1); cb.add(2); cb.add(3); cb.add(4);
        cb.display();
    }
}
