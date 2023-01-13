package com.cts.java;

import java.io.IOException;

public class LambdaExceptionExample {
    public static void main(String[] args) {
        handleCheckedException(() -> {
            throw new IOException("I/O Exception in lambda expression");
        });
    }

    private static void handleCheckedException(CheckedExceptionLambda lambda) {
        try {
            lambda.call();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}

interface CheckedExceptionLambda {
    void call() throws IOException;
}



