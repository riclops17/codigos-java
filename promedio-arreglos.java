public static void main(String[] args) {
        //
        double [] temp = { 4,6,7,8,23,40,23.8,21.7,31,13.2};
        double promedio;
        int cant ;
        double acum;
        cant = 0;
        acum = 0;
        while (cant < temp.length){
            acum = (int)  (acum + temp[cant]);
            cant++;
        }
        promedio = ((acum)/cant);
            
            
       System.out.println("el promedio de las temperaturas es "+promedio);  
                    
       
        
       
                 
        
    
               
                
              
              
    }
