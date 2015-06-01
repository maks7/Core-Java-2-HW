package com.hackbulgaria.oopfun8.matrix;

public class GrayscaleOperation implements MatrixOperation {

    @Override
    public Pixel withPixel(int x, int y, Pixel[][] matrix) {
        
        Pixel pixelRef = matrix[x][y];
        
        float red = pixelRef.getRed();
        float green = pixelRef.getGreen();
        float blue = pixelRef.getBlue();
      
        float newpixel = (float)(red*0.299) + (float)(blue*0.587) + (float)(green*0.114);
        pixelRef = new Pixel(newpixel, newpixel, newpixel);
        
        return pixelRef;
    }

  
    
}
