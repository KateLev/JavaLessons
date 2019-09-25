public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] BubbleSort={1,3,5,2,0,8,9,10,1,15,89,44,11};
        int count=0;
        int n=BubbleSort.length;
        boolean checker=true; //chech array for sorted
        System.out.println("Unsorted:");//print unsorted
        for (int i=0;i<n;i++)
        {
            System.out.print(BubbleSort[i]+" ");
        }
        System.out.println();
        
        for (int i=1; i<n&&checker==true; i++, count++)
        {
            checker=false;
            for (int j=0; j<n-i; j++,count++)
            {
                if (BubbleSort[j]>BubbleSort[j+1])
                {
                    int a=BubbleSort[j];
                    BubbleSort[j]=BubbleSort[j+1];
                    BubbleSort[j+1]=a;
                    checker=true;
                    
                }
            }
        }
        
        System.out.println("Sorted:");
        for (int i=0;i<n;i++)
        {
            System.out.print(BubbleSort[i]+" ");
        }
        System.out.println();
        System.out.println("Operation count="+count);//operation number-difficulty
    }
    
}
