public static void main(String[] args) {
        //
        int[] conjunto = {4, 6, 7, 8, 9};
        int num;
        char op;
        do {
            System.out.println("Escriba  un numero ");
            num = TecladoIn.readLineInt();
            if (verificarElementos(conjunto, num)) {
                System.out.println("el elemento es parte del conjunto");
            } else {
                System.out.println("no es parte del conjunto");

            }
            System.out.println("¿desea ingresar otro numero ? s/n");
            op = TecladoIn.readLineNonwhiteChar();
        } while (op != 'n');

    }

    public static boolean verificarElementos(int[] arreglo, int x) {
        //
        int i;
        i = 0;
        boolean res = false;
        while (i < arreglo.length && !res) {

            if (x == arreglo[i]) {
                res = true;

            }
            i++;
        }
        return res;

    }
}
