package MainPackage.Execution;

import MainPackage.Complex.Complexes;
import MainPackage.InOut.IO;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class that runs the program
 */
public class Execution {

    /**
     * Method that runs the program
     */
    public void start() {
        IO io = new IO();
        ArrayList<Complexes> numberList = new ArrayList<>();

        io.enterNumber(1);
        Complexes firstComplexNumber = new Complexes(io.getRealPart(), io.getImaginaryPart());
        numberList.add(firstComplexNumber);
        io.printNumber(1,numberList.get(0));

        io.enterNumber(2);
        Complexes secondComplexNumber = new Complexes(io.getRealPart(),io.getImaginaryPart());
        numberList.add(secondComplexNumber);
        io.printNumber(2,numberList.get(1));

        Operations op = new Operations(firstComplexNumber, secondComplexNumber);

        numberList.add(op.sum());
        numberList.add(op.subtract());
        numberList.add(op.multiplication());
        numberList.add(op.division());
        numberList.add(new Complexes(firstComplexNumber.getAbsoluteValue(), secondComplexNumber.getAbsoluteValue()));

        Complexes lastNumber = numberList.get(numberList.size() -1);
        numberList.add(cloneNumber(lastNumber));
        io.printOperations(numberList);

        Collections.sort(numberList);
        io.printSortedList(numberList);
    }

    /**
     *
     * Method to clone an object of type Complexes
     *
     * @param lastNumber Complexes type object
     * @return Complexes type object
     */
    private Complexes cloneNumber(Complexes lastNumber){
        try{
           return (Complexes) lastNumber.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
