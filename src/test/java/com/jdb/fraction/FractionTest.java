package com.jdb.fraction;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by shashi on 16/11/15.
 */
public class FractionTest {

    /**
     *
     */
    private static Fraction fraction;

    /**
     * Setup function
     * Runs when the first test of the class is executed and setups the environment needed
     *
     * @return none
     */
    @BeforeClass
    public static final void setUp(){
        fraction = new Fraction();
    }

    /**
     * creates an empty Fraction object
     *
     * @result creates an empty Fraction object with numerator 0 and denominator 1
     */
    @Test
    public void emptyFraction_CreatesAnEmptyFraction_ReturnsZeroByOneForm(){
        Fraction emptyFraction = new Fraction();

        System.out.println( emptyFraction.toPrettyString("Empty Fraction Test") );
        assertTrue(0.0 == emptyFraction.toDecimal());
    }

    /**
     * creates a Half Fraction object
     *
     * @result creates a Fraction object with numerator 1 and denominator 2
     */
    @Test
    public void halfFractionTest_CreatesHalfFraction_ReturnsHalfFractionObject(){
        Fraction halfFraction = new Fraction("1/2");
        System.out.println( halfFraction.toPrettyString("Half Fraction Test") );
        assertTrue(0.5 == halfFraction.toDecimal());
    }

    /**
     * creates a Negative Half Fraction object
     *
     * @result creates a Fraction object with numerator -1 and denominator 2
     */
    @Test
    public void negativeHalfFractionTest_CreatesNegativeHalfFraction_ReturnsNegativeHalfFractionObject(){
        Fraction minusHalfFraction = new Fraction("-1/2");
        System.out.println( minusHalfFraction.toPrettyString("Negative Half Fraction Test") );
        assertTrue(-0.5 == minusHalfFraction.toDecimal());
    }

    /**
     * creates an Infinite Fraction object
     *
     * @result creates a Fraction object with numerator 1 and denominator 0
     */
    @Test
    public void infiniteFractionTest_CreatesInfiniteFraction_ReturnsInfiniteFractionObject(){
        Fraction infinityFraction = new Fraction("1/0");
        System.out.println( infinityFraction.toPrettyString("Infinity Fraction Test") );
        assertTrue(Double.POSITIVE_INFINITY == infinityFraction.toDecimal());
    }

    /**
     * creates a Negative Infinite Fraction object
     *
     * @result creates a Fraction object with numerator -1 and denominator 0
     */
    @Test
    public void NegativeInfiniteFractionTest_CreatesNegativeInfiniteFraction_ReturnsNegativeInfiniteFractionObject(){
        Fraction minusInfinityFraction = new Fraction("-1/0");
        System.out.println( minusInfinityFraction.toPrettyString("Negative Infinity Fraction Test") );
        assertTrue(Double.NEGATIVE_INFINITY == minusInfinityFraction.toDecimal());
    }

    /**
     * creates a NaN Fraction object
     *
     * @result creates a Fraction object with numerator 0 and denominator 0
     */
    @Test
    public void nanFractionTest_CreatesNANFraction_ReturnsNANFractionObject(){
        Fraction nanFraction = new Fraction("0/0");
        System.out.println(nanFraction.toPrettyString("NAN Fraction Test"));
        assertTrue(Double.isNaN(nanFraction.toDecimal()));                // Remember why NAN is different than other asserts
    }

    /**
     * creates a NaN Fraction object
     *
     * @result creates a Fraction object with numerator -0 and denominator 0
     */
    @Test
    public void negativeNANFractionTest_CreatesNegativeNANFraction_ReturnsNegativeNANFractionObject(){
        Fraction minusNANFraction = new Fraction("-0/0");
        System.out.println(minusNANFraction.toPrettyString("Negative NAN Fraction Test"));
        assertTrue( Double.isNaN(minusNANFraction.toDecimal()) );                // Remember why NAN is different than other asserts
    }
}
