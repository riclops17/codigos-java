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

ublic static int binarySearch(int []a,int k){
        //
        int l,m,r,res;
        m= 0;
        l =0;
        r = a.length-1;
        res = -1;
        while ((l<=r )&&(k != a [m])){
            m = (l + r )/2;
            if (k == a [m]){
                res = m;
            }else{
                if (k< a [m]){
                    r = m -1;
                    
                }else{
                    l = m + 1;
                    
                }
            }
        }
        return res;
    }
public static void bubbleSort(int []a){
        //
        int i, j,x;
        for (i=0;i<=a.length-2;i++){
            for ( j=0;j<= a.length-2 -i;j++){
                if ( a[j +1]< a[j]){
                    x = a[j];
                    a[j]= a[j+1];
                    a [j+1] = x;
                }
            }
        }
        
}
