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
