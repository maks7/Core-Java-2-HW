package com.hackbulgaria.oopfun8.matrix;

public class Pixel {

    private float red;
    private float green;
    private float blue;
    
    Pixel() {
        red = 0;
        green = 0;
        blue = 0;
    }
    
    public Pixel(float red, float green, float blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public float getRed() {
        return red;
    }

    public void setRed(float red) {
        this.red = red;
    }

    public float getGreen() {
        return green;
    }

    public void setGreen(float green) {
        this.green = green;
    }

    public float getBlue() {
        return blue;
    }

    public void setBlue(float blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "Pixel [red=" + red + ", green=" + green + ", blue=" + blue + "]";
    }
}
