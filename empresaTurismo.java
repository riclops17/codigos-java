# codigos-java 
public static double promedio ( int sumaEdad , int cantE) {
       //
       double res;
       res = sumaEdad / cantE;
       return res;
       
   }
   
   
   public static boolean sorteo (char estado1 , int edad1 ){
       //
       boolean res1; 
       res1 = ((estado1 ==  's' )) && (45<= edad1 )&& ( edad1 <= 62);  
       
       return res1;
    }
   
   
   public static void main (String [] args ){
       //
       int edad ,cantp , cantper,cant,maxp, acum;
       char estado;
       String  nombre , apellido ,maxApellido = null;
       System.out.println("ingrese la cantidad de personas ");
       cantper = TecladoIn.readLineInt();
       cant = 1;
       acum = 0;
       maxp = 0;
       
       while (cant <= cantper){
           System.out.println("ingrese el nombre y apellido de la persona");
           nombre = TecladoIn.readLine();
           apellido = TecladoIn.readLine();
           System.out.println("ingrese la edad de la persona");
           edad = TecladoIn.readLineInt();
           System.out.println("ingrese la cantidad de paises visitados ");
           cantp = TecladoIn.readLineInt();
           System.out.println("ingrese el estado civil de la persona , s: soltero , c ; casado");
           estado = TecladoIn.readLineNonwhiteChar();
           acum = acum + edad;
           cant = cant + 1;
           if (cantp > maxp){
               maxApellido = apellido;
               maxp = cantp;
           }
           if (sorteo(estado,edad)){
               System.out.println ("puede participar en el sorteo");
           }else {
               System.out.println("no puede participar en el sorteo");
           }
       }
       System.out.println("promedio edad de los encuestados : " +promedio(acum,cantper));
       System.out.println("la persona que mas paises visito es : " +maxApellido+ " " +maxp);
   }
}
