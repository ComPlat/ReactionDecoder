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
package uk.ac.ebi.reactionblast.signature;

import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import org.openscience.cdk.interfaces.IAtomContainer;
import signature.AbstractGraphSignature;
import signature.AbstractVertexSignature;

/**
 *
 * @author maclean
 *
 */
public class BaseMoleculeSignature extends AbstractGraphSignature {
    private static final Logger LOG = getLogger(BaseMoleculeSignature.class.getName());

    /**
     *
     */
    protected IAtomContainer atomContainer;

    /**
     *
     * @param atomContainer
     */
    public BaseMoleculeSignature(IAtomContainer atomContainer) {
        this.atomContainer = atomContainer;
    }

    /**
     *
     * @param atomIndex
     * @return
     */
    @Override
    public AbstractVertexSignature signatureForVertex(int atomIndex) {
        return new RBlastAtomSignature(atomIndex, atomContainer);
    }

    /**
     *
     * @param atomIndex
     * @return
     */
    @Override
    public String signatureStringForVertex(int atomIndex) {
        return new RBlastAtomSignature(
                atomIndex, atomContainer).toCanonicalString();
    }

    /**
     *
     * @param atomIndex
     * @param height
     * @return
     */
    @Override
    public String signatureStringForVertex(int atomIndex, int height) {
        return new RBlastAtomSignature(
                atomIndex, atomContainer, height).toCanonicalString();
    }

    /**
     *
     * @return
     */
    @Override
    protected int getVertexCount() {
        return atomContainer.getAtomCount();
    }

}
