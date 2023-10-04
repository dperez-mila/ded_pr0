package edu.uoc.ds.adt;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class PR0Main {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PR0TestSuit.class);

        System.out.println("########## RESULTS ##########");
        System.out.println("# Number of tests performed: " + result.getRunCount());
        System.out.println("# Number of failures: " + result.getFailureCount());
        System.out.println("# Rune time: " + result.getRunTime() + "ms");
        System.out.println("#############################");
    }
}
