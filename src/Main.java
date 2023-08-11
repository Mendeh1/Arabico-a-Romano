import java.util.*;

public class Main{
    //entrada de usuario
    static Scanner sca = new Scanner(System.in);

    public static void main(String[] args) {
        AR();
    }
    static public void AR() {

        String un = "", de = "", ce = "", mi = "";
        int u, d, c, m, num;

        System.out.print("Ingrese numero en Arabigo: ");
        num = sca.nextInt();
        //cálculos para descomponer el número en sus dígitos individuales (m, c, d, u) usando diviciones y modulos

        m = num / 1000; //millares
        c = (num % 1000) / 100; //centenas
        d = ((num % 1000) % 100) / 10; //decenas
        u = (((num % 1000) % 100) % 10); //unidades

//Se utilizan los switchs para convertir cada dígito en su equivalente  romano
// Cada caso dentro de los bloques switch agrega los caracteres romanos correspondientes según el valor de los dígitos.

        //validacion de numeros permitidos
        if (num <= 3999 && num >= 1) {

            //switch de millares
            switch (m) {
                case 1:
                    mi += "M";
                    break;//se usa break para salir y pasar al siguiente switch
                case 2:
                    mi += "MM";
                    break;
                case 3:
                    mi += "MMM";
                    break;
            }
            //switch de centenas
            switch (c) {
                case 1:
                    ce += "C";
                    break;
                case 2:
                    ce += "CC";
                    break;
                case 3:
                    ce += "CCC";
                    break;
                case 4:
                    ce += "CD";
                    break;
                case 5:
                    ce += "D";
                    break;
                case 6:
                    ce += "DC";
                    break;
                case 7:
                    ce += "DCC";
                    break;
                case 8:
                    ce += "DCCC";
                    break;
                case 9:
                    ce += "CM";
                    break;
            }
            //switch de decenas
            switch (d) {
                case 1:
                    de += "X";
                    break;
                case 2:
                    de += "XX";
                    break;
                case 3:
                    de += "XXX";
                    break;
                case 4:
                    de += "XL";
                    break;
                case 5:
                    de += "L";
                    break;
                case 6:
                    de += "LX";
                    break;
                case 7:
                    de += "LXX";
                    break;
                case 8:
                    de += "LXXX";
                    break;
                case 9:
                    de += "XC";
                    break;
            }
            //switch de unidades
            switch (u) {
                case 1:
                    un += "I";
                    break;
                case 2:
                    un += "II";
                    break;
                case 3:
                    un += "III";
                    break;
                case 4:
                    un += "IV";
                    break;
                case 5:
                    un += "V";
                    break;
                case 6:
                    un += "VI";
                    break;
                case 7:
                    un += "VII";
                    break;
                case 8:
                    un += "VIII";
                    break;
                case 9:
                    un += "IX";
                    break;
            }

            System.out.println("El numero " + num + " en romano es: " + mi + ce + de + un);

        }
        else if (num > 3999){

            System.out.println("El valor se sale de la capacidad del programa");

        }
        else {

            System.out.println("Los numeros negativos no tienen equivalentes en romanos");

        }
    }
}