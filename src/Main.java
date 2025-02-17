public class Main {
    public static void main(String[] args) throws Exception {
        String n = "9";

        for (int i = 0; i < 100; i++) {
            n+="9";
        }

        System.out.println(sumaUno(n));

        /* PARA SUMAR MAS DE UNO:
         * Primer parámetro el número a sumar en una cadena.
         * Segundo parámetro cantidad a sumar en un int.
         */
        
        //System.out.println(calculaSuma("10000000000000000000000000", 2000));
    }

    static String sumaUno(String num){

        String suma = "";

        int posicion = num.length()-1;
        int digito = -1;
        boolean sumado = false;
        
        
        while (posicion >= 0) {
            digito = Integer.parseInt(String.valueOf(num.charAt(posicion)));

            if (sumado){
                suma = digito + suma;
                posicion--;
                continue;
            }

            if (digito == 9) {
                suma = 0 + suma;
            }else{
                suma = digito+1 + suma;
                sumado = true;
            }
            
            if (posicion == 0 && digito == 9) {
                suma = 1+suma;
            }
            posicion--;
        }

        return suma;
    }

    static String calculaSuma(String num, int suma){
        String numeroSumado = num;
        for(int i = 0; i < suma; i++){
            numeroSumado = sumaUno(numeroSumado);
        }
        return numeroSumado;
    }
}
