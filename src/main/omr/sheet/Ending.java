//------------------------------------------------------------------------------------------------//
//                                                                                                //
//                                          E n d i n g                                           //
//                                                                                                //
//------------------------------------------------------------------------------------------------//
// <editor-fold defaultstate="collapsed" desc="hdr">
//  Copyright © Hervé Bitteur and others 2000-2014. All rights reserved.
//  This software is released under the GNU General Public License.
//  Goto http://kenai.com/projects/audiveris to report bugs or suggestions.
//------------------------------------------------------------------------------------------------//
// </editor-fold>
package omr.sheet;

import omr.glyph.facets.Glyph;

/**
 * Class {@code Ending} is a physical {@link Dash} that is the
 * horizontal part of an alternate ending.
 *
 * @author Hervé Bitteur
 */
public class Ending
        extends Dash
{

    //~ Constructors -------------------------------------------------------------------------------

    /**
     * Create an Ending entity, with its underlying horizontal stick.
     *
     * @param stick the underlying stick
     * @param staff the related staff
     */
    public Ending (Glyph stick,
                   Staff staff)
    {
        super(stick, staff);
    }
}
