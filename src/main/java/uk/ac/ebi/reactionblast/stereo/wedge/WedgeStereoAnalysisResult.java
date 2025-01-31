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
package uk.ac.ebi.reactionblast.stereo.wedge;

/**
 *
 * @author Gilleain Torrance
 */
public enum WedgeStereoAnalysisResult {

    /**
     *
     */
    CHIRAL_R, // an R-chirality at the atom

    /**
     *
     */
    CHIRAL_S, // an S-chirality at the atom

    /**
     *
     */
    MISSING, // 4 different neighbours, but missing wedges 

    /**
     *
     */
    UNKNOWN, // combination of wedges unknown

    /**
     *
     */
    ERROR, // wedges around a non-stereo center

    /**
     *
     */
    NONE,           // not-chiral
}
