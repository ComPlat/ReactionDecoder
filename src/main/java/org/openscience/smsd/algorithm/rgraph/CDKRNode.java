/* $Revision$ $Author$ $Date$
 *
 * Copyright (C) 2002-2007  Stephane Werner <mail@ixelis.net>
 *               2009-2017  Syed Asad Rahman <asad@ebi.ac.uk>
 *
 * This code has been kindly provided by Stephane Werner
 * and Thierry Hanser from IXELIS mail@ixelis.net.
 *
 * IXELIS sarl - Semantic Information Systems
 *               17 rue des C?dres 67200 Strasbourg, France
 *               Tel/Fax : +33(0)3 88 27 81 39 Email: mail@ixelis.net
 *
 * CDK Contact: cdk-devel@lists.sf.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.openscience.smsd.algorithm.rgraph;

import java.util.BitSet;

/**
 *  Node of the resolution graphe (RGraph) An CDKRNode represents an association
 *  betwwen two edges of the source graphs G1 and G2 that are compared. Two
 *  edges may be associated if they have at least one common feature. The
 *  association is defined outside this class. The node keeps tracks of the ID
 *  of the mapped edges (in an CDKRMap), of its neighbours in the RGraph it belongs
 *  to and of the set of incompatible nodes (nodes that may not be along with
 *  this node in the same solution)
 *
 * @author      Stephane Werner from IXELIS mail@ixelis.net
 * 2002-07-17
 *   smsd
 * 
 */
public class CDKRNode {
    // G1/G2 mapping

    private CDKRMap rMap = null;
    // set of neighbour nodes in the RGraph
    private BitSet extension = null;
    // set of incompatible nodes in the RGraph
    private BitSet forbidden = null;

    /**
     *  Constructor for the RNode object
     *
     *@param  id1  number of the bond in the graphe 1
     *@param  id2  number of the bond in the graphe 2
     */
    public CDKRNode(int id1, int id2) {
        rMap = new CDKRMap(id1, id2);
        extension = new BitSet();
        forbidden = new BitSet();
    }

    /**
     *  Sets the rMap attribute of the RNode object
     *
     *@param  rMap  The new rMap value
     */
    public synchronized void setRMap(CDKRMap rMap) {
        this.setrMap(rMap);
    }

    /**
     *  Sets the extension attribute of the RNode object
     *
     *@param  extension  The new extension value
     */
    public synchronized void setExtension(BitSet extension) {
        this.extension = extension;
    }

    /**
     *  Sets the forbidden attribute of the RNode object
     *
     *@param  forbidden  The new forbidden value
     */
    public synchronized void setForbidden(BitSet forbidden) {
        this.forbidden = forbidden;
    }

    /**
     *  Gets the rMap attribute of the RNode object
     *
     *@return    The rMap value
     */
    public synchronized CDKRMap getRMap() {
        return getrMap();
    }

    /**
     *  Gets the extension attribute of the RNode object
     *
     *@return    The extension value
     */
    public synchronized BitSet getExtension() {
        return extension;
    }

    /**
     *  Gets the forbidden attribute of the RNode object
     *
     *@return    The forbidden value
     */
    public synchronized BitSet getForbidden() {
        return forbidden;
    }

    /**
     *  Returns a string representation of the RNode
     *
     *@return    the string representation of the RNode
     */
    @Override
    public synchronized String toString() {
        return ("id1 : " + getrMap().getId1() + ", id2 : " + getrMap().getId2() + "\n" + "extension : " + getExtension() + "\n" + "forbiden : " + getForbidden());
    }

    /**
     * Returns resolution Map
     * @return the rMap
     */
    public synchronized CDKRMap getrMap() {
        return rMap;
    }

    /**
     * Sets resolution map/graph
     * @param rMap the rMap to set
     */
    public synchronized void setrMap(CDKRMap rMap) {
        this.rMap = rMap;
    }
}
