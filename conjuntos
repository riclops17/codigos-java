public static void main (String [] args){
    //
    int n,i, r;
    String cadena ,acum , acum2;
    System.out.println("ingrese la cantidad de elementos del conjunto A");
    n = TecladoIn.readLineInt();
    acum = "";
    acum2 ="";
    for ( i= n; i>0;i--){
        System.out.println("ingrese un elemento");
        cadena = TecladoIn.readLine();
        acum =  acum +cadena;
        
        
    }
     System.out.println("ingrese la cantidad de elementos del conjunto B");
    r = TecladoIn.readLineInt();
    for ( i= n; i>0;i--){
        System.out.println("ingrese un elemento");
        cadena = TecladoIn.readLine();
        acum2 =  acum2 +cadena;
    
    }
    
  System.out.println(acum);
  System.out.println(acum2);
  if (verifica(acum,acum2)){
      System.out.println( "los conjuntos son correctos");
      
      
  }else {
      System.out.println("los conjuntos son incorrectos");
  }
      }

   

public static boolean verifica( String conjunto1 ,String conjunto2){
    //
    int i , j;
    char letra;
    boolean res;
    res = true;
    for (i = conjunto1.length() ; i > 0;i--){
        letra = conjunto1.charAt(i);
        for (j = conjunto2.length(); j>0;i--){
            if (letra == conjunto2.charAt(j)){
               res = false; 
            }
        }
}
    return res;
 }
