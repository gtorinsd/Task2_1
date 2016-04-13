package Task2;

import java.util.Random;

public class Main {
    private static final int ARRAY_LENGTH = 10;

    private static int[] GetArray(int maxValue) {
        int[] arr = new int[ARRAY_LENGTH];

        Random rand = new Random();
        for(int i = 0; i < ARRAY_LENGTH; i++)
        {
            arr[i] = rand.nextInt((maxValue) + 1);
        }
        return arr;
    }

    private static void ShowArray(int[] arr) {
        for(int i = 0; i < ARRAY_LENGTH; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private static int GetMaxItemIndex(int[] arr, int fromIndex, int toIndex) {
        int index = fromIndex;
        int max = arr[fromIndex];

        for(int i = fromIndex; i < toIndex + 1; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }

    private static int[] Sort(int[] arr )
    {
        int[] newArray = arr;

        int i = ARRAY_LENGTH - 1;
        while (i > 1) {
            int maxIndex = GetMaxItemIndex(arr, 0, i);
            int value = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = value;
            i--;
        }

        return newArray;
    }


    public static void main(String[] args) {
        int[] arr = GetArray(9);
        ShowArray(arr);
        arr = Sort(arr);
        ShowArray(arr);
    }


}
