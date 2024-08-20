public class InsertionSort
{
    public void sort(int array[])
    {
        int k;

        for(int i=1; i<array.length; i++)
        {
            k=i;

            for(int j=k-1; j>-1; j--)
            {
                if(array[k]<array[j])
                {
                    int temp = array[k];
                    array[k] = array[j];
                    array[j] = temp;
                    k--;
                }
            }
        }
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
        InsertionSort obj = new InsertionSort();

        System.out.print("Unsorted Array: ");
        obj.printArray(array);

        obj.sort(array);
        
        System.out.print("Sorted Array: ");
        obj.printArray(array);
    }
}
