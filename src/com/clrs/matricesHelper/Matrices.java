package com.clrs.matricesHelper;

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
    public String toString(){
        StringBuilder res= new StringBuilder();
        for (int[] line:matrix){
            for (int elem:line) res.append(elem + " ");
            res.append("\n");
        }
        return res.toString();
    }
}
