package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.oopfun8.matrix.Matrix;
import com.hackbulgaria.oopfun8.matrix.Pixel;

public class OOPFun8Matrix {

    Matrix matrix;
    
    @Before
    public void before() {
        matrix = new Matrix(2,3);
    }
    
    @Test
    public void test_toStirng() {
        
        Pixel p = new Pixel(10, 15, 17);
        
        for (int y = 0; y < 2; y++) {
            for (int x = 0; x < 3; x++) {
                matrix.addValue(y, x, p);
            }
        }
        
        System.out.println(matrix.toString());
        
//        for (y = 0; y < 3; y++) {
//            for (int x = 0; x < 4; x++)
//            
//        }
        
    }

}
