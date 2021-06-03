package com.company;

import java.util.ArrayList;

/**
 * Rede neural (Neural Network)
 * perceptron de multicamadas (MLP - Multi Layer Perceptron)
 *
 * Feito por:
 *
 * Gabriel Dutra Nascimento RA: 578266
 * Samuel dos Santos Silva RA: 577588
 * Victor Turra Florêncio RA: 580899
 * Vinicius Lucas dos Santos RA: 580694
 *
 */
public class Main {
    public static void main(String[] args) {

        NeuralNetworks networks = new NeuralNetworks(10);
        networks.runAll();

    }
}
