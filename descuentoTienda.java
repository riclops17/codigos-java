public static double porcentaje(int p ,int valorTotal) {
    double res;

    res = (p*valorTotal)/100.0;

    return res;
}


public static double calculardto(boolean esalumno,char genero,int valorprenda) {
    double rest;

    if (esalumno) {
        if (genero == 'h')
            rest = valorprenda - (porcentaje(20,valorprenda));
        else
            rest = valorprenda - (porcentaje(25,valorprenda));
    } else {
        rest = valorprenda - (porcentaje(10,valorprenda));
    }

    return rest;    
}
    
public static void main (String [] args) {
        boolean esalumno;
        char genero;
        int valorprenda;

        System.out.println("Ingrese el valor de la prenda: ");
        valorprenda = TecladoIn.readLineInt();
        System.out.println("Ingrese si es alumno(true/false): ");
        esalumno = TecladoIn.readLineBoolean();
        System.out.println("Ingrese el género (h/m):");
        genero = TecladoIn.readLineNonwhiteChar();

        System.out.println("El valor para esa persona es " +(calculardto(esalumno,genero,valorprenda)));
}