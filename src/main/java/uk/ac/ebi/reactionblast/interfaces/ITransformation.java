/*
 * Copyright (C) 2007-2017 Syed Asad Rahman <asad @ ebi.ac.uk>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

package uk.ac.ebi.reactionblast.interfaces;


/**
 * A generic transformation of a reaction or molecule.
 * 
 * @author maclean
 * @param <T>
 *
 */
public interface ITransformation<T> {
    
    /**
     * The object type to transform
     *
     */
    public enum TargetType {

        /**
         *
         */
        MOLECULE,

        /**
         *
         */
        REACTION
    }
    
    /**
     *
     * @return
     */
    TargetType getTargetType();
    
    /**
     *
     * @param obj
     * @return
     */
    T transform(T obj);
}
