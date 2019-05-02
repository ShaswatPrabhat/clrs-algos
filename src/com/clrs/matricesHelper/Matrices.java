package com.clrs.matricesHelper;

import org.jetbrains.annotations.NotNull;

public class Matrices {
    private int[][] matrix;

    public Matrices(int[][] matrix){
        setMatrix(matrix);
    }
    public Matrices(String s){
        setMatrix(s);
    }
    public int[][] getMatrix() {
        return matrix;
    }

    private void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    private  void setMatrix(String s) {
        matrix = new int[s.split("\n").length][];
        int i = 0;
        for (String word : s.split("\n")) {
            System.out.println(word);
            int j = 0;
            matrix[i] = new int[word.split(" ").length];
            for (String elem: word.split(" ")){
                System.out.println(Integer.parseInt(elem));

                matrix[i][j]= Integer.parseInt(elem);
                j++;
            }
            i++;
        }
    }
    public int getNumberOfRows(){
        return matrix.length;
    }

    public  int getNumberOfColumns(){
        return matrix[0].length;
    }

    public Matrices multiplication (@NotNull Matrices matrixB) throws Exception {
        int m = this.getNumberOfRows();
        int n = this.getNumberOfColumns();
        int p = matrixB.getNumberOfRows();
        int q = matrixB.getNumberOfColumns();
        if (n == p){
            int [][] res = new int[m][q];
            for(int i = 0; i<m; i++)
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < p; k++) {
                        res[i][j] += (this.matrix[i][k] * matrixB.matrix[k][j]);
                    }
                }
            return new Matrices(res);
        }
        else{
            throw new Exception("Number of Columns not equal to Number of Rows");
        }
    }

    public boolean checkSquare(){
        return this.matrix.length == this.matrix[0].length;
    }
    public Matrices generateID(){
        int len = this.matrix.length;
        int [][]res = new int[len][len];
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len ; j++) {
                res[i][j] = (i==j)?1:0;
            }
        }
        return new Matrices(res);
    }
    public Matrices exponentiation(int num) throws Exception {
        if (checkSquare()) {
            Matrices result = generateID();
            while (num > 0) {
                if (num % 2 == 0)
                    result = result.multiplication(this);

                this.matrix = this.multiplication(this).matrix;
                num = num / 2;
            }
            return result;
        }
        else{
            throw new Exception("Matrix should be a square Matrix for Exponentiation");
        }
    }
    public String toString(){
        StringBuilder res= new StringBuilder();
        for (int[] line:matrix){
            for (int elem:line) res.append(elem + " ");
            res.append("\n");
        }
        return res.toString();
    }
}
