import java.util.Arrays;

class BubbleSort {
    //perform the bubble sort
    static void bubbleSort(int array[]) {
        int size = array.length;
    // loop to access each array element
    for (int i= 0; i < size - 1; i++)
        //loop to compare array elements
        for (int j = 0; j< size - 1; j++ )
            //compare two adjacent elements
            //change > to < to sort in descending order
            if (array[j] > array[j + 1]) {
                //swapping occurs if elements are not in the intended order
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
    }

    public static void main(String[] args) {
        int arrOne[] = {4, 1, 3, 9, 7};
        int arrTwo[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        BubbleSort.bubbleSort(arrOne);
        BubbleSort.bubbleSort(arrTwo);


        System.out.println("Sorted Array in Ascending order: ");
        System.out.println(Arrays.toString(arrOne));
        System.out.println(Arrays.toString(arrTwo));
    }
 }