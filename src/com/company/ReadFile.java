package com.company;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static ArrayList<double[]> readEntries(String fileName) {
        ArrayList<double[]> entries = new ArrayList<double[]>();
        ArrayList<String> expectedOutputs = new ArrayList<String>();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] dataSet = data.split(",");

                entries.add(new double[]{
                    Double.parseDouble(dataSet[0]),
                    Double.parseDouble(dataSet[1]),
                    Double.parseDouble(dataSet[2]),
                    Double.parseDouble(dataSet[3]),
                });

                expectedOutputs.add( dataSet[4] );
            }
            myReader.close();
            return entries;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Double> readExpectedOutputs(String fileName) {
        ArrayList<Double> expectedOutputs = new ArrayList<Double>();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);
                String[] dataSet = data.split(",");
                expectedOutputs.add( ReadFile.mapOutputs(dataSet[4]) );
            }
            myReader.close();
            return expectedOutputs;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public static double mapOutputs(String flowerName) {
        switch (flowerName) {
            case "Iris-virginica":
                return 0.5;
            case "Iris-versicolor":
                return 1;
            case "Iris-setosa":
                return 0;
            default:
                return 0;
        }
    }

}
