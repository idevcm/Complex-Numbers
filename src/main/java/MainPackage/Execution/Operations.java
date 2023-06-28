package MainPackage.Execution;

import MainPackage.Complex.Complexes;

/**
 * Class in charge of performing the operations with the complex numbers
 */
public class Operations {
    Complexes first;
    Complexes second;

    /**
     * Builder class
     * @param first - Complex object
     * @param second - Complex object
     */
    public Operations(Complexes first, Complexes second){
        this.first = first;
        this.second = second;
    }

    /**
     *
     * Method that performs a sum of two complex numbers
     *
     * @return New object Complexes sum result
     */
    public Complexes sum(){
        return new Complexes(
                (first.getReal() + second.getReal()),
                (first.getImaginary() + second.getImaginary())
        );
    }

    /**
     *
     * Method that performs a subtraction of two complex numbers
     *
     * @return New object Complex subtraction result
     */
    public Complexes subtract(){
        return new Complexes(
                (first.getReal() - second.getReal()),
                (first.getImaginary() - second.getImaginary())
        );
    }

    /**
     *
     * Method that performs a multiplication of two complex numbers
     *
     * @return New object Complexes multiplication result
     */
    public Complexes multiplication() {
        return new Complexes(
                (first.getReal() *  second.getReal()) - (first.getImaginary() * second.getImaginary()),
                (first.getImaginary() * second.getReal()) + (first.getReal() * second.getImaginary())
        );
    }

    /**
     *
     * Method that performs a division of two complex numbers
     *
     * @return New object Complexes division result
     */
    public Complexes division() {
        return new Complexes(
                (((first.getReal() * second.getReal()) + (first.getImaginary() * second.getImaginary())) /
                ((Math.pow(second.getReal(), 2)) + (Math.pow(second.getImaginary(), 2)))),
                (((first.getImaginary() * second.getReal()) - (first.getReal() * second.getImaginary())) /
                ((Math.pow(second.getReal(), 2)) + (Math.pow(second.getImaginary(), 2)))));
    }
}
