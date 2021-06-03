package com.company;

import java.util.ArrayList;

public class NeuralNetworkReporting {

    public boolean hasConverged;
    public int numberOfSteps;
    public String mlpName;
    public int numberOfAssertions;
    public int numberOfFails;

    public MultiLayerPerceptron multiLayerPerceptron;

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static final String UNICODE_CHECK = "\u2714";
    public static final String UNICODE_FAIL = "\u2718";


    double[] receivedOutputs;
    double[][] testEntries;
    double[] testOutputs;

    public NeuralNetworkReporting( MultiLayerPerceptron mlp ) {
        this.multiLayerPerceptron = mlp;
        this.mlpName = multiLayerPerceptron.name;

        this.numberOfAssertions = 0;
        this.numberOfFails = 0;

        this.receivedOutputs = multiLayerPerceptron.submitTests();
        this.testEntries = multiLayerPerceptron.getTestEntries();
        this.testOutputs = multiLayerPerceptron.getTestOutputs();
        this.hasConverged = multiLayerPerceptron.hasConverged();
        this.numberOfSteps = multiLayerPerceptron.step;
    }


    boolean isOutputCloseTo(int inputIndex, double threshold) {
        return Math.abs(testOutputs[inputIndex] - receivedOutputs[inputIndex]) < threshold;
    }

    void generateTrainingReports() {
        System.out.print("\n");
        System.out.println("Total de etapas: " + numberOfSteps);
        System.out.println("Convergiu? " + (hasConverged ?
                ANSI_GREEN_BACKGROUND + " Sim " + ANSI_RESET :
                ANSI_RED_BACKGROUND + " Não " + ANSI_RESET ));

    }

    void generateTestingReports() {
        System.out.print("\n");
        for (int i = 0; i < receivedOutputs.length; i++) {

            System.out.printf("%.1f %.1f %.1f %.1f = ",
                    testEntries[i][0],
                    testEntries[i][1],
                    testEntries[i][2],
                    testEntries[i][3]
            );

            if (isOutputCloseTo( i, 0.1)) {
                System.out.print(ANSI_GREEN);
            } else {
                System.out.print(ANSI_RED);
            }

            System.out.printf("%.4f\n", receivedOutputs[i]);
            System.out.print(ANSI_RESET);
        }

        numberOfAssertions = 0;
        numberOfFails = 0;

        for (int i = 0; i < this.testOutputs.length; i++) {
            if (isOutputCloseTo(i, 0.1))
                numberOfAssertions++;
            else
                numberOfFails++;
        }

        System.out.print("\n");
        System.out.println( UNICODE_CHECK + " Acertos: " + numberOfAssertions + "/" + testOutputs.length);
        System.out.println( UNICODE_FAIL + " Erros: " +  numberOfFails + "/" + testOutputs.length);
        System.out.print("\n");


    }

    public void log() {
        System.out.println("Resultados da rede " + mlpName);
        generateTrainingReports();
        generateTestingReports();
    }

    private static ArrayList<NeuralNetworkReporting> convertToReportsArrayList (NeuralNetworkReporting[] reports) {
        ArrayList<NeuralNetworkReporting> reportsStack = new ArrayList<NeuralNetworkReporting>();

        for (int i = 0; i < reports.length; i++)
            reportsStack.add(reports[i]);

        return reportsStack;
    }

    private static void filterNotConvergedNetworks(ArrayList<NeuralNetworkReporting> reports) {
        reports.removeIf(report -> !report.hasConverged);
    }

    private static NeuralNetworkReporting findMoreAssertiveReport(ArrayList<NeuralNetworkReporting> reports) {
        NeuralNetworkReporting mostAssertiveReport = reports.remove(0);

        for(NeuralNetworkReporting report: reports) {
            if(report.numberOfAssertions > mostAssertiveReport.numberOfAssertions)
                mostAssertiveReport = report;
        }

        return mostAssertiveReport;
    }

    public static NeuralNetworkReporting findBestResult(NeuralNetworkReporting[] reports) {

        ArrayList<NeuralNetworkReporting> reportsStack = convertToReportsArrayList(reports);
        filterNotConvergedNetworks(reportsStack);

        return findMoreAssertiveReport(reportsStack);
    }

    public static void countNetworksConversions(NeuralNetworkReporting[] reports) {
        int numberOfConverged = 0;
        int numberOfNonConverged = 0;
        for (int i = 0; i < reports.length; i++){
            if(reports[i].hasConverged)
                numberOfConverged++;
            else
                numberOfNonConverged++;
        }

        System.out.print(ANSI_BLUE);
        System.out.println("Total de redes que convergiram: " + numberOfConverged);
        System.out.println("Total de redes que não convergiram: " + numberOfNonConverged);
        System.out.print(ANSI_RESET);

    }
}
