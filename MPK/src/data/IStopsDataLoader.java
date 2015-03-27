/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Collection;
import model.Stop;

/**
 *
 * @author Adrian
 *
 * We don't need generics now but just in case
 * http://stackoverflow.com/questions/450807/how-do-i-make-the-method-return-type-generic
 */
public interface IStopsDataLoader {

    public Collection<Stop> LoadData();
}
