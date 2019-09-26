/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */

public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] InsertionSort={1,3,5,2,0,8,9,10,1,15,89,44,11};
        int count=0;
        int n=InsertionSort.length;
       
        System.out.println("Unsorted:");
        for (int i=0;i<n;i++)
        {
            System.out.print(InsertionSort[i]+" ");
        }
        System.out.println();
        
         for (int i=1; i<n; i++, count++)
         {
             int m=i;// because we shuffle in the Array, but we need to save i to create new circle            
             for (int j=i-1; j>=0; j--,count++)
             {
                if (InsertionSort[j]<InsertionSort[m]) break; //if the element was already sorted, then break
                if (InsertionSort[j]>InsertionSort[m])
                {
                    int a=InsertionSort[j];
                    InsertionSort[j]=InsertionSort[m];
                    InsertionSort[m]=a;
                    m--;                       
                }                
             }                 
         }
        System.out.println("Sorted:");
        for (int i=0;i<n;i++)
        {
            System.out.print(InsertionSort[i]+" ");
        }
        System.out.println();
        System.out.println("Operation count="+count);
    }
    
}
