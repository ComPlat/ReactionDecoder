/* $Revision$ $Author$ $Date$
 *
 * Copyright (C) 2011-2017       Syed Asad Rahman <asad @ ebi.ac.uk>
 *           
 *
 * Contact: cdk-devel@lists.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * All we ask is that proper credit is given for our work, which includes
 * - but is not limited to - adding the above copyright notice to the beginning
 * of your source code files, and to any copyright notice that you may distribute
 * with programs based on this work.
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
package uk.ac.ebi.reactionblast.fingerprints;

import java.io.Serializable;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.RandomGenerator;

/**
 * @contact Syed Asad Rahman, EMBL-EBI, Cambridge, UK.
 * @author Syed Asad Rahman <asad @ ebi.ac.uk>
 */
public class RandomNumber implements Serializable {

    private static final long serialVersionUID = 23345464573453571L;
    private static final Logger LOG = getLogger(RandomNumber.class.getName());
    private transient final RandomGenerator rg = new RandomAdaptor(new MersenneTwister());

    /**
     * Mersenne Twister Random Number
     *
     * @param maximum
     * @return
     */
    public long generateMersenneTwisterRandomNumber(int maximum) {
        return rg.nextInt(maximum);
    }

    /**
     * Mersenne Twister Random Number for a hashcode within a range between 0 to
     * n.
     *
     * @param n the maximum value the
     * @param seed the seed for the next pseudorandom number
     * @return next pseudorandom number
     */
    public int generateMersenneTwisterRandomNumber(int n, long seed) {
        rg.setSeed(seed);
        return rg.nextInt(n);
    }
}
