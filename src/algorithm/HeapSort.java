package algorithm;

import java.util.Random;

/**
 * Created by mengjia on 16/7/4.
 */
public class HeapSort {
    private int[] myList;
    private int num;

    HeapSort(int n){
        num = n;
        myList = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            myList[i] = random.nextInt(100);
        }
    }

    public void print(){
        for(int a : myList){
            System.out.print(a + " ");
        }
        System.out.print("\n");
    }

    public void maxHeapFixDown(int i, int n){
        int temp = myList[i];
        int j = i*2 +1;

        while(j<n){
            if(j+1 < n && myList[j] < myList[j+1]){
                j++;
            }
            if(myList[j] <= temp){
                break;
            }

            myList[i] = myList[j];
            i = j;
            j = i*2 + 1;
        }

        myList[i] = temp;
    }

    public void makeHeap(){
        for(int i = num/2 - 1; i >= 0; i--){
            maxHeapFixDown(i,num);
        }
    }

    public void sortHeap(){
        for(int i = num-1; i>=0; i--){
            swap(0,i);
            maxHeapFixDown(0,i);
        }
    }

    private void swap(int i, int j) {
        myList[i] = myList[i] + myList[j];
        myList[j] = myList[i] - myList[j];
        myList[i] = myList[i] - myList[j];
    }
}
