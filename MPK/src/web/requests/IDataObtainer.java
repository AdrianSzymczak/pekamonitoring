/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.requests;

import java.io.IOException;
import java.util.Collection;
import model.Stop;

/**
 *
 * @author Adrian
 */
public interface IDataObtainer {

    public Collection<String> ObtainData(Collection<Stop> stops) throws IOException;
}
