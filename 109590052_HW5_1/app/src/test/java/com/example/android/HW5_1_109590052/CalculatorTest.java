/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.HW5_1_109590052;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * JUnit4 unit tests for the calculator logic.
 * These are local unit tests; no device needed.
 */
@RunWith(JUnit4.class)
@SmallTest
public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Sets up the environment for testing.
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Tests for simple addition.
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }
    /**
     * Tests for addition with a negative operand.
     */
    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }
    /**
     * Tests for addition where the result is negative.
     */
    @Test
    public void addTwoNumbersWorksWithNegativeResult() {
        double resultAdd = mCalculator.add(-1d, -17d);
        assertThat(resultAdd, is(equalTo(-18d)));
    }
    /**
     * Tests for floating-point addition.
     */
    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111d, 1.111d);
        assertThat(resultAdd, is(equalTo(2.222)));
    }

    /**
     * Tests for especially large numbers.
     */
    @Test
    public void addTwoNumbersBignums() {
        double resultAdd = mCalculator.add(123456781d, 111111111d);
        assertThat(resultAdd, is(equalTo(234567892d)));
    }
    /**
     * Tests for simple subtraction.
     */
    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }

    /**
     * Tests for simple subtraction with a negative result.
     */
    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }

    /**
     * Tests for simple division.
     */
    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }

    /**
     * Tests for divide by zero; must throw IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void divByZeroThrows() {
        mCalculator.div(32d,0d);
    }

    /**
     * Tests for divide by zero; always fails, so removed.
     */
    /*@Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }*/


    /**
     * Tests for simple multiplication.
     */
    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }

    @Test
    public void powPostiveNumber() {
        double resultPow = mCalculator.pow(4d,3);
        assertThat(resultPow, is(equalTo(64d)));
    }
    @Test
    public void powNegativeOne() {
        double resultPow = mCalculator.pow(-2d,3d);
        assertThat(resultPow,is(equalTo(-8d)));
    }
    @Test
    public void powNegativeTwo() {
        double resultPow = mCalculator.pow(2d,-3d);
        assertThat(resultPow,is(equalTo(1d/8)));
    }
    @Test
    public void powZeroOne() {
        double resultPow = mCalculator.pow(0d,3d);
        assertThat(resultPow,is(equalTo(0d)));
    }
    @Test
    public void powZeroTwo() {
        double resultPow = mCalculator.pow(3d,0d);
        assertThat(resultPow,is(1d));
    }
    @Test(expected = IllegalArgumentException.class)
    public void powZeroNegative() { mCalculator.pow(0d,-1d);
    }
    @Test(expected = IllegalArgumentException.class)
    public void powZeroEvery() { mCalculator.pow(-0d,-5d);
    }
}