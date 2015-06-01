package com.hackbulgaria.oopfun8.matrix;

public class Matrix {

    int height;
    int width;
    
    Pixel[][] matrix;
    
    public Matrix(int row, int col) {
        height = row;
        width = col;
        matrix = new Pixel[height][width];
    }
    
    public void addValue(int h, int w, Pixel p) {
        matrix[h][w] = p;
    }
    
    public void operate(MatrixOperation op) {
       
        for(int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                matrix[x][y] = op.withPixel(x, y, matrix);
            }
        }
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x < (width - 1))  {
                    sb.append(matrix[y][x].toString()).append(", ");
                } else {
                    sb.append(matrix[y][x].toString());
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
