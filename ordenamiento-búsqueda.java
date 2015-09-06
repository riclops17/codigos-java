public static void main(String[] args) {
        //
        int[] conjunto = {34, 9, 8, 12, 5};
        
       
           selectionSort(conjunto);
           
         for (int i = 0; i < conjunto.length; i++) {
            System.out.print(conjunto[i] + " ");
        }

   }
   public static void selectionSort(int[] a) {
        int i, j, min, x;
        
        for (i = 0; i < a.length-1; i++) {
            min = i;
            
            for (j  = i+1; j <= a.length; j++) {
                if (a[j] <= a[min]) {
                    min = j;
                }
            }
            
            x = a[min];
            a[min] = a[i];
            a[i] = x;
        }
    } 
