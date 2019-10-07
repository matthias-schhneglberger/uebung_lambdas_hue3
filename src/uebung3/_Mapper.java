/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3;

import java.util.List;

/**
 *
 * @author matth
 */
public interface _Mapper<S, T> {
    public T map(S from);
    
    public List<T> mapAll(List<S> from);
}
