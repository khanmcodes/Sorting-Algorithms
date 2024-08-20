public class MergeSort
{
    public void divide(int array[], int si, int ei)
    {
        //  si = Starting Index     ,       ei = Ending Index

        if(si >= ei)
        {
            return;
        }

        int mid = si + (ei - si)/2;       // Calculating Mid

        divide(array, si, mid);      // For Left Side
        divide(array, mid+1, ei);    // For Right Side

        conquer(array, si, mid, ei);
    }

    public void conquer(int array[], int si, int mid, int ei)
    {
        int merged[] = new int[ei - si + 1];

        int leftArrTracker = si;
        int rightArrTracker = mid+1;
        int mergedArrTracker = 0;

        while(leftArrTracker <= mid && rightArrTracker <= ei)       // Sorts 2 arrays into new array
        {
            if(array[leftArrTracker] <= array[rightArrTracker])
            {
                merged[mergedArrTracker] = array[leftArrTracker];
                mergedArrTracker++;
                leftArrTracker++;
            }

            else
            {
                merged[mergedArrTracker] = array[rightArrTracker];
                mergedArrTracker++;
                rightArrTracker++;
            }
        }

        while(leftArrTracker <= mid)                               // Inserts rest of the LEFT elements
        {
            merged[mergedArrTracker] = array[leftArrTracker];
            mergedArrTracker++;
            leftArrTracker++;
        }

        while(rightArrTracker <= ei)                                // Inserts rest of the RIGHT elements
        {
            merged[mergedArrTracker] = array[rightArrTracker];
            mergedArrTracker++;
            rightArrTracker++;
        }

        // Now copying merged elements into the original array

        for(int i=0, j=si; i<merged.length; i++, j++)
        {
            array[j] = merged[i];
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
        MergeSort obj = new MergeSort();

        System.out.print("Unsorted Array: ");
        obj.printArray(array);

        obj.divide(array, 0, array.length-1);
        
        System.out.print("Sorted Array: ");
        obj.printArray(array);
    }
}
