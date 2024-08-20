public class QuickSort
{
    public void sort(int array[], int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(array, low, high);

            sort(array, low, pivot-1);
            sort(array, pivot+1, high);
        }
    }

    public int partition(int array[], int low, int high)
    {
        int pivot = array[high];
        int i = low-1; 

        for(int j=low; j<high; j++)
        {
            if(array[j]<pivot)
            {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i;
    }

    public void printArray(int array[])
    {
        System.out.print("\n[");

        for(int i:array)
        {
            System.out.print(i+", ");
        }

        System.out.println("\b\b]\n");
    }

    public static void main(String [] args)
    {
        int array[] = {12, 45, 23, 51, 19, 8};
        QuickSort obj = new QuickSort();

        System.out.print("Unsorted Array: ");
        obj.printArray(array);

        obj.sort(array, 0, array.length-1);
        
        System.out.print("Sorted Array: ");
        obj.printArray(array);
    }
}
