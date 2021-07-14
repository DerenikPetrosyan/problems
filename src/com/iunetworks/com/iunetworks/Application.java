package com.iunetworks;


import java.util.Arrays;

public class Application  {
    public static void main(String[] args) {
  Matrix matrix=new Matrix(4,2);
  Matrix matrix2=new Matrix(2,3);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                matrix.matrtix[i][j]=1;

            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                matrix2.matrtix[i][j]=2;
            }
        }
// matrix.printMatrix();
//
// matrix2.printMatrix();
//  matrix.multiplicationMatrix(matrix2).printMatrix();

//        matrix.multiplicConstMatrix(5).printMatrix();


    }
}
