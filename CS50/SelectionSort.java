public class SelectionSort  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] BubbleSort={1,3,5,2,0,8,9,10,1,15,89,44,11};
        int count=0;
        int n=BubbleSort.length;
        System.out.println("Unsorted:");
        for (int i=0;i<n;i++)
        {
            System.out.print(BubbleSort[i]+" ");
        }
        System.out.println();
        for (int i=0; i<n; i++, count++)
        {
            for (int j=i+1; j<n; j++,count++)
            {
                if (BubbleSort[i]>BubbleSort[j])
                {
                    int a=BubbleSort[i];
                    BubbleSort[i]=BubbleSort[j];
                    BubbleSort[j]=a;
                }
            }
        }
        System.out.println("Sorted:");
        for (int i=0;i<n;i++)
        {
            System.out.print(BubbleSort[i]+" ");
        }
        System.out.println();
        System.out.println("Operation count="+count);
    }
    
}
