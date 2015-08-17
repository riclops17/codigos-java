 public static void main (String [] args) {
        // calcula raices reales de un polinomio de grado 2
        int a , b ,c  ,x  ;
        double res , res2;
        System.out.println("ingrese los coeficientes de un polinomio de grado 2");
        a = TecladoIn.readLineInt();
        b = TecladoIn.readLineInt();
        c = TecladoIn.readLineInt();
        x = (b*b -4*a*c);
        if (x >= 0){
            res =  ((-b + (Math.sqrt(x)))/(2*a));
            res2 = ((-b - (Math.sqrt(x)))/(2*a));
            System.out.println (+res+"y"+res2);
            
                    
        }else
        {
            System.out.println(" las raices son complejas");
        }
      }
