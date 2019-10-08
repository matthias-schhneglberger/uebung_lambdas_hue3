/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author matth
 */
public interface Mapper<S, T> {
    public T map(S from);
    
    public default List<T> mapAll(List<S> from){
        List<T> returnList = new ArrayList<>();
        from.stream()
            .forEach(n -> returnList.add(map(n)));
        return returnList;
    }
    

}
