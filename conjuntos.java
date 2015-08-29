public static void main(String[] args) {
        //
        int n, i, r;
        String cadena, acum, acum2;
        System.out.println("ingrese la cantidad de elementos del conjunto A Y B");
        n = TecladoIn.readLineInt();
        acum = "";
        acum2 = "";
        for (i = n; i > 0; i--) {
            System.out.print("ingrese un elemento ");
            cadena = TecladoIn.readLine();
            acum = acum + cadena;

        }
        System.out.println("ingrese los elementos del conjunto B");
        
        for (i = n; i > 0; i--) {
            System.out.print("ingrese un elemento ");
            cadena = TecladoIn.readLine();
            acum2 = acum2 + cadena;

        }

        System.out.println(acum);
        System.out.println(acum2);
        if (verifica(acum) && verifica(acum2)){
       

            System.out.println("la union es " + union(acum, acum2));
            System.out.println("la interseccion es " + interseccion(acum, acum2));
            System.out.println("la diferencia es " + diferencia(acum, acum2));
        
    }
    }

    public static boolean verifica(String conjunto1) {
        //
        int i, j;
        char letra;
        boolean res;
        res = true;
        for (i = conjunto1.length() - 1; i >= 0; i--) {
            letra = conjunto1.charAt(i);
            for (j = i - 1; j >= 0; j--) {
                if (letra == conjunto1.charAt(j)) {
                    res = false;
                }
            }
        }
        return res;
    }

    public static String union(String conjuntoA, String conjuntoB) {
        String union;
        int longitud;
        
        union = conjuntoA;
        longitud = conjuntoA.length();
        
        for (int i = 0; i < longitud; i++) {
            
            if (conjuntoA.indexOf(conjuntoB.charAt(i)) == -1) {
                union += conjuntoB.charAt(i);
            }
        }
        
        return union;
    }

    public static String interseccion(String cad, String cad1) {
        //
        String rest;
        rest = "";
        int i;
        for (i = 0; i < cad.length(); i++) {
            if (cad.indexOf(cad1.charAt(i)) != -1) {
                rest = rest + cad1.charAt(i);
            }

        }
        return rest;
    }

    public static String diferencia(String conjunto1, String conjunto2) {
        //
        String acum;
        int i;

        char letra;
        acum = "";
        for (i = conjunto1.length() - 1; i >= 0; i--) {
            letra = conjunto1.charAt(i);
            if (conjunto2.indexOf(letra) != -1) {

                acum = acum + letra;
            }

        }
        return acum;
    }

}

