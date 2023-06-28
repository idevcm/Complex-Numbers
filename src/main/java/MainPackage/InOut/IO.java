package MainPackage.InOut;

import MainPackage.Complex.Complexes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class in charge of program input and output methods
 */
public class IO {

    private Scanner sc = new Scanner(System.in);
    Double realPart;
    Double imaginaryPart;


    /**
     * Getters
     */
    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    public Double getRealPart() {
        return realPart;
    }

    /**
     *
     * Method in charge of entering the name of a number for the creation of the consequent complex,
     * both for the real and the imaginary part.
     *
     * @param counter - Number counter
     */
    public void enterNumber(int counter) {

        while (true) {
            System.out.printf("Introducir parte real [a] del %s número complejo (parte entera a dos " +
                    "decimales y parte flotante con 3 decimales): ", (counter == 1) ? "primer" : "segundo" );
            String realPart = sc.next();
            if (checkNumber(realPart)) {
                realPart = realPart.replace(",",".");
                this.realPart = Double.parseDouble(realPart);
                break;
            }else{
                System.out.println("--> [!] Detectado valor con formato no válido. Ejemplo de inserción: 12,345");
            }
        }

        while (true) {
            System.out.printf("Introducir parte imaginaria [b] del %s número complejo (parte entera a dos " +
                    "decimales y parte flotante con 3 decimales): ", (counter == 1) ? "primer" : "segundo" );
            String imaginaryPart = sc.next();
            if (checkNumber(imaginaryPart)) {
                imaginaryPart = imaginaryPart.replace(",",".");
                this.imaginaryPart = Double.parseDouble(imaginaryPart);
                break;
            }else{
                System.out.println("--> [!] Detectado valor con formato no válido. Ejemplo de inserción: 12,345");
            }
        }
    }

    /**
     *
     * Check that the number entered by the user meets the required format
     *
     * @param entrada - Name entered
     * @return True if the name meets the condition
     */
    public boolean checkNumber(String entrada) {
        String regex = "^\\-?\\d{2}(\\,\\d{3})$";

        Pattern pattern = Pattern.compile(regex);
        entrada.trim();
        Matcher matcher = pattern.matcher(entrada);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }

    }

    /**
     *
     * Prints the complex number passed as parameter
     *
     * @param counter - Identifier of the number to be processed with
     * @param number - Object Complexes representing a complex number
     */
    public void printNumber(int counter, Object number){
        System.out.println("[i] Numero complejo nº " + counter + " " + number + " introducido");
    }

    /**
     *
     * Method in charge of printing the result of the operations performed
     *
     * @param lista - ArrayList of Complexes objects gnerated
     */
    public void printOperations(ArrayList<Complexes> lista){
        Complexes firstNumber = lista.get(0);
        Complexes secondNumber = lista.get(1);
        System.out.println("\n----- MUESTRA DE OPERACIONES -----");
        System.out.println("--> (" + firstNumber + ") + (" + secondNumber + ") = " + lista.get(2));
        lista.remove(lista.get(2));
        System.out.println("--> (" + firstNumber + ") - (" + secondNumber + ") = " + lista.get(2));
        lista.remove(lista.get(2));
        System.out.println("--> (" + firstNumber + ") * (" + secondNumber + ") = " + lista.get(2));
        lista.remove(lista.get(2));
        System.out.println("--> (" + firstNumber + ") / (" + secondNumber + ") = " + lista.get(2));
        lista.remove(lista.get(2));
        System.out.println("--> |" + firstNumber + "| = "  + firstNumber.getAbsoluteValue());
        System.out.println("--> |" + secondNumber + "| = "  + secondNumber.getAbsoluteValue());

        System.out.printf("[i] Número complejo nº3 generado:" +
                " (%.3f , %.3fi)\n", lista.get(2).getReal(),
                lista.get(2).getImaginary());

        System.out.printf("[i] Se autogenera el número complejo nº 4 que tiene con parte real %.3f " +
                        "y parte imaginaria %.3f\n",lista.get(3).getReal(),
                lista.get(3).getImaginary());
    }


    /**
     *
     * Method that prints an ordered list of the complex numbers generated without counting
     * those generated after the result of the operations.
     *
     * @param list - ArrayList de números complejos
     */
    public void printSortedList(ArrayList<Complexes> list){
        System.out.println("\n--- LISTADO ORDENADO ---");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i != list.size() - 1){
                System.out.print(list.get(i) + ", ");
            }else{
                System.out.print(list.get(i));
            }
        }
        System.out.print("]");
    }




}
