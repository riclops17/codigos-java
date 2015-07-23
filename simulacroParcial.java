/**
 * Recibe un entero y devuelve verdadero si es par, falso en caso contrario.
 *
 * @param n un entero positivo ingresado por el usuario
 * @return verdadero si el número es par
 */
public static boolean paridad(int n) {
    boolean res;
    res = true;

    if ((n%2) == 0)
        res = true;
    else
		res = false;

    return res;
}

public static void main(String[] args) {
    int num, acum, cant, cantp, sucesor;
    char respuesta;
    acum = 0;
    cant = 0;
    cantp = 0;
    sucesor = 0;

    do {
        System.out.println("Ingrese un número: ");
        num = TecladoIn.readLineInt();

        if (paridad(num)) {
            System.out.println("Es un número par.");
            acum = acum +1;
            sucesor = sucesor + (num+1);
        } else {
            System.out.println("Es un número impar.");
            cant = cant +1;  
        }
        
        cantp = cantp +1;
        System.out.println("¿Desea ingresar otro número? s/n");
        respuesta = TecladoIn.readLineNonwhiteChar();
               
    } while (respuesta != 'n' || respuesta != 'N');

    System.out.println("La cantidad de números pares es " +acum);
    System.out.println("La cantidad de números impares es " +cant);
    System.out.println("La sumatoria de los numeros sucesores de pares es " +sucesor);
    System.out.println("La cantidad de numeros procesados es " +cantp);
}