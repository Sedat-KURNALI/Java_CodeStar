package ytb_java1;

import java.util.ArrayList;
import java.util.List;

public class MethodsAlgortym {
    public static void main(String[] args) {

    }

    public int[] bubbleSort(int[] list) {
        int i, j, temp = 0;
        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }// using Array

    public int[] insertionSort(int[] list) {
        int i, j, key, temp;
        for (i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && key < list[j]) {
                temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
                j--;
            }
        }
        return list;
    }

    // using ArrayList
    public List<Integer> insertionSort(ArrayList<Integer> list) {
        int i, j, key, temp;
        for (i = 1; i < list.size(); i++) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0 && key < list.get(j)) {
                temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                j--;
            }
        }
        return list;
    }

    public void mergeSort(int[] list, int lowIndex, int highIndex) {
        if (lowIndex == highIndex)
            return;
        else {
            int midIndex = (lowIndex + highIndex) / 2;
            mergeSort(list, lowIndex, midIndex);
            mergeSort(list, midIndex + 1, highIndex);
            merge(list, lowIndex, midIndex, highIndex);
        }
    }

    public void merge(int[] list, int lowIndex, int midIndex, int highIndex) {
        int[] L = new int[midIndex - lowIndex + 2];

        for (int i = lowIndex; i <= midIndex; i++) {
            L[i - lowIndex] = list[i];
        }
        L[midIndex - lowIndex + 1] = Integer.MAX_VALUE;
        int[] R = new int[highIndex - midIndex + 1];

        for (int i = midIndex + 1; i <= highIndex; i++) {
            R[i - midIndex - 1] = list[i];
        }
        R[highIndex - midIndex] = Integer.MAX_VALUE;
        int i = 0, j = 0;

        for (int k = lowIndex; k <= highIndex; k++) {
            if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
            } else {
                list[k] = R[j];
                j++;
            }
        }
    }

    public int[] selectionSort(int[] list) {
        int i, j, minValue, minIndex, temp = 0;
        for (i = 0; i < list.length; i++) {
            minValue = list[i];
            minIndex = i;
            for (j = i; j < list.length; j++) {
                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            if (minValue < list[i]) {
                temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
        return list;
    }


}