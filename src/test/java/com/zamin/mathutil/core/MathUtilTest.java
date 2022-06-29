/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zamin.mathutil.core;

import static com.zamin.mathutil.core.MathUtil.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


/**
 *
 * @author giama
 */
public class MathUtilTest {
    
    public static Object[][] initData(){
        return new Integer[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24}
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgumentReturnsWell(int input, long expected){
        assertEquals(expected, getFactorial(input));
    }
    
    @Test
    public void testGetFactorialGivenWrongArgThrowException(){
        assertThrows(IllegalArgumentException.class, () -> 
            getFactorial(-1)
        );
    }
    
}
