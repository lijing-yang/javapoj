package algorithm;

/**
 * Created by mengjia on 16/7/4.
 */
public class HeapTest {
    public static void main(String[] args){
        HeapSort heap = new HeapSort(10);
        heap.print();
        heap.makeHeap();
        heap.sortHeap();
        heap.print();
        heap.insertNumber(77);
        heap.print();
        heap.sortHeap();
        heap.print();
    }
}
