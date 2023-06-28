package MainPackage.Complex;

/**
 * class representing a complex type number
 */
public class Complexes implements Cloneable, Comparable{
    private double real;
    private double imaginary;
    private double absoluteValue;

    /**
     * Getters
     */
    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getAbsoluteValue() {
        return absoluteValue;
    }

    /**
     *
     * Class builder
     *
     * @param real - number belonging to the real part
     * @param imaginary - number belonging to the imaginary part
     */
    public Complexes(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
        this.absoluteValue = Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    /**
     *
     * Clone method overwrite belonging to Cloneable interface
     *
     * @return Object to clone
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     *
     * Overwrite of the toString method
     *
     * @return Complex type object content
     */
    @Override
    public String toString() {

        if(imaginary == 0){
            return real + "";
        }else {
            return real + " + " + imaginary + "i";
        }
    }


    /**
     *
     * Overwriting of the compareTo method belonging to the Comparable interface
     *
     * @param o the object to be compared.
     * @return 0 if both values are equal and - 1 | 1 depending on the larger value
     */
    @Override
    public int compareTo(Object o) {

        Complexes numero = (Complexes) o;

        if(this.absoluteValue == numero.getAbsoluteValue()){
            return 0;
        } else if (this.absoluteValue < numero.getAbsoluteValue()) {
            return -1;
        }else {
            return 1;
        }
    }
}
