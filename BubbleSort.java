public class BubbleSort
{
    public void sort(int array[])
    {
        for(int i=0; i<array.length-1; i++)
        {
            for(int j=i+1; j<array.length; j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
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
        BubbleSort obj = new BubbleSort();

        System.out.print("Unsorted Array: ");
        obj.printArray(array);

        obj.sort(array);
        
        System.out.print("Sorted Array: ");
        obj.printArray(array);
    }
}
