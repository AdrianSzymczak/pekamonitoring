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
public class Stop implements Comparable<Stop> {

    private Collection<Line> lines;
    private String symbol;

    public Stop(String symbol) {
        this.symbol = symbol;
    }

    public Collection<Line> getLines() {
        return lines;
    }

    public void setLines(Collection<Line> lines) {
        this.lines = lines;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int compareTo(Stop o) {
        return this.symbol.compareTo(o.symbol);
    }
}
