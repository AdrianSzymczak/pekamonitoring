/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;

/**
 *
 * @author Adrian
 */
public class Line {

    private int number;
    private int delay;
    private Collection<Stop> stops;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public Collection<Stop> getStops() {
        return stops;
    }

    public void setStops(Collection<Stop> stops) {
        this.stops = stops;
    }

}
