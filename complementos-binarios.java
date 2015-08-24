public static String complemento1 (String cadena){
    //
    int i ;
   String salida;
    salida = "";
    
    for ( i = cadena.length()-1; i >=0;i--){
        if (cadena.charAt(i)== '1'){
            salida = salida + "0";
        } else 
        {
            salida = salida + "1";
        }
    }
    return salida;
   
}
public static void main (String [] args){
    //
    double valor;
    String cadena, x;
    System.out.println("ingrese un numero binario");
    cadena = TecladoIn.readLine();
    x = complemento1 (cadena);
    System.out.println(x);
}


}
public static double procesar(String cadena){
    //
    int i , j;
    double res;
    boolean parar;
    res = 0;
    i = cadena.length()-1;
    j= 0;
    parar = false;
    while (i >= 0 && !parar){
        if (cadena.charAt(i)=='1'){
            res = res + (1 * Math.pow(2,j));
            
        }else{
            if (cadena.charAt(i)== '0'){
                res = res + (0 * Math.pow(2,j));
            }else{
                parar = true ;
                res = -1;
            }
                
        }
        i = i-1;
        j = j+1;
    }
    return res;
    
}
