package com.jdb.fraction;

/**
 * Created by shashi on 16/11/15.
 */
public class Fraction {

    // numerator of fraction
    private int numerator;
    // denominator of fraction
    private int denominator;

    /**
     * Single argument constructor of Fraction
     * expects a integer Numerator/Denominator form of fraction
     * extracts the numerator and denominator from it and saves in instance variables
     *
     * @param fraction
     */
    public Fraction(String fraction){
        if(fraction.contains("/")){
            String[] numbers = fraction.split("/");

            this.numerator = Integer.parseInt(numbers[0]);
            this.denominator = Integer.parseInt(numbers[1]);
        }else{
            this.numerator = Integer.parseInt(fraction);
            this.denominator = 1;
        }
    }

    /**
     * Two argument constructor of Fraction class
     * expects an integer numerator and denominator
     * saves them in instance variables
     *
     * @param numerator numerator of fraction
     * @param denominator denominator of fraction
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * No argument constructor of Fraction class
     * creates a new instance with numerator as 0 and denominator as one to avoid Divide by Zero errors
     */
    public Fraction(){
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * Prettify the Fraction in String format, also shows the double value of fraction as well
     *
     * @return formatted String created from Fraction
     */
    public String toPrettyString(){
        double fraction = ((double)this.numerator)
                                    / (this.denominator);

        return this.numerator + " / " + this.denominator + " [ " + fraction + " ]";
    }

    /**
     * Prettify the Fraction in String format along with the Title, also shows the double value of fraction as well
     *
     * @return formatted String along with Title created from Fraction
     */
    public String toPrettyString(String title){
        double fraction = ((double)this.numerator)
                / (this.denominator);

        return String.format("%-25s : %d / %d [ %.2f ]" , title, this.numerator, this.denominator, fraction);
    }

    /**
     * converts the Numerator/Denominator format to decimal format
     *
     * @return the result obtained from fraction in decimal format
     */
    public Double toDecimal(){
        return (double)this.numerator / this.denominator;
    }
}
