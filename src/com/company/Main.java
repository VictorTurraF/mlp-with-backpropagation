package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<double[]> entries = ReadFile.readEntries("/home/victorturra/IdeaProjects/BackPropagation/src/com/company/iris_train.txt");
        ArrayList<Double> outs = ReadFile.readExpectedOutputs("/home/victorturra/IdeaProjects/BackPropagation/src/com/company/iris_train.txt");

        double [][] e = new double[entries.size()][4];
        double [] o = new double[outs.size()];

        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                e[i][j] = entries.get(i)[j];
            }
        }

        for (int i = 0; i < o.length; i++)
            o[i] = outs.get(i);

        BackPropagation backPropagation = new BackPropagation( e, o );
        backPropagation.trainNeuralNetwork(2, 0.2);
    }
}
