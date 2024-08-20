public class SelectionSort
{
    public void printArray(int array[])
    {
        System.out.print("\n[");

        for(int i:array)
        {
            System.out.print(i+", ");
        }

        System.out.println("\b\b]\n");
    }

    public void sort(int array[])
    {
        int min;

        for(int i=0; i<array.length-1; i++)
        {
            min = i;

            for(int j=i+1; j<array.length; j++)                                                                                                
            {
                if(array[j]<array[min])
                {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String [] args)
    {
        int array[] = {23, 78, 45, 8, 32, 46};
        SelectionSort obj = new SelectionSort();

        System.out.print("Unsorted Array: ");
        obj.printArray(array);

        obj.sort(array);
        
        System.out.print("Sorted Array: ");
        obj.printArray(array);
    }
}
