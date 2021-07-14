package com.iunetworks;

public class Matrix {
    private final int m;
    private final int n;
    protected int[][] matrtix;

    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;

        matrixInteger();
    }

    private void matrixInteger() {
        this.matrtix = new int[this.m][this.n];

    }

    protected void setIndex(int i, int j, int value) {
        if (i >= 0 && i < this.n && j >= 0 && j < this.m) {
            matrtix[i][j] = value;
        }
    }

    protected Matrix sumMatrix(Matrix operand) {
        Matrix sum;
        if (operand.m == this.m && operand.n == this.n) {
            sum = new Matrix(this.m, this.n);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sum.matrtix[i][j] = matrtix[i][j] + operand.matrtix[i][j];
                }
            }
        } else {
            throw new RuntimeException(" Matrices are not of the same order ");
        }
        return sum;
    }

    protected Matrix multiplicConstMatrix(int operand) {
        Matrix multiplicConst = new Matrix(this.m, this.n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                multiplicConst.matrtix[i][j] = matrtix[i][j] * operand;
            }
        }
        return multiplicConst;
    }

    protected Matrix multiplicationMatrix(Matrix operand) {
        Matrix multiplication;
        if (this.n == operand.m ) {
            multiplication = new Matrix(this.m, operand.n);
            for (int i = 0; i < this.m; i++) {
                for (int j = 0; j < operand.n; j++) {
                    for (int k = 0; k < n; k++) {
                        multiplication.matrtix[i][j] = multiplication.matrtix[i][j] +matrtix[i][k] * operand.matrtix[k][j];
                    }

                }
            }
        } else {
            throw new RuntimeException(" Matrices are not of the same order ");
        }
        return multiplication;
    }


    protected void printMatrix() {
        System.out.println("[ ");
        for (int i = 0; i < m; i++) {
            System.out.print("[ ");
            for (int j = 0; j < n; j++) {
                System.out.print(matrtix[i][j]);
                if (n - 1 > j) {
                    System.out.print(" , ");
                }
            }
            System.out.println(" ] ");
        }
        System.out.print("]");
    }


}


