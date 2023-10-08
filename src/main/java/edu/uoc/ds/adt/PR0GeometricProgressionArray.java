package edu.uoc.ds.adt;

import java.util.ArrayList;

public class PR0GeometricProgressionArray {

    private int[] geoProArray;
    private final int arraySize;
    private final int initialValue;
    private final int progressionRate;

    public PR0GeometricProgressionArray(int initialValue, int progressionRate, int arraySize) {
        this.initialValue = initialValue;
        this.progressionRate = progressionRate;
        this.arraySize = arraySize;
        newGeoProArray();
    }

    public void newGeoProArray() {
        this.geoProArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            this.geoProArray[i] = initialValue * (int) Math.pow(progressionRate, i);
        }
    }

    public int[] getArray() {
        return this.geoProArray;
    }

    public int getIndexOf(int value) { // Sequential Search
        for (int i = 0; i < this.geoProArray.length; i++) {
            if (this.geoProArray[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int value) { // Binary Search
        int leftPos = 0;
        int rightPos = this.arraySize - 1;
        int medianPos = (leftPos + rightPos) / 2;

        while (leftPos <= rightPos) {
            if (value == this.geoProArray[medianPos]) {
                return medianPos;
            } else if (this.geoProArray[medianPos] < value) {
                leftPos = medianPos + 1;
            } else {
                rightPos = medianPos - 1;
            }

            medianPos = (leftPos + rightPos) / 2;
        }
        return -1;
    }

}
