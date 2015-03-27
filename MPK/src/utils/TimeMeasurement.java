/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class TimeMeasurement {

    private long[] times;
    private int maxMeasurements;
    private int maxIndex;
    private int lastIndex;

    public TimeMeasurement(int maxMeasurements) {
        this.maxMeasurements = maxMeasurements;
        maxIndex = maxMeasurements - 1;
        times = new long[maxMeasurements];
        lastIndex = -1;
    }

    public boolean AddMeasurement() {         
        return AddMeasurement(System.currentTimeMillis());
    }

    public boolean AddMeasurement(long measurement) {
        if (++lastIndex <= maxIndex) {
            times[lastIndex] = measurement;
            return true;
        }
        return false;
    }

    public long[] GetPartialDifferences() {
        long[] result = null;
        if (lastIndex >= 1) {
            result = new long[lastIndex];
            for (int i = 0; i < lastIndex - 1; i++) {
                result[i] = times[i + 1] - times[i];
            }
        }
        return result;
    }

    public long GetTotalDifference() {
        if (lastIndex >= 1) {
            return times[lastIndex] - times[0];
        }
        return 0;
    }
}
