/*-
 * Copyright (c) 2012 Benedikt Meurer
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.benediktmeurer.gwt.slf4j.sample.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point for the sample.
 * 
 * @author Benedikt Meurer
 */
public class SampleEntryPoint implements EntryPoint {
    /** The logger for this class. */
    private static final Logger logger = LoggerFactory.getLogger(SampleEntryPoint.class);

    /**
     * @see EntryPoint#onModuleLoad()
     */
    @Override
    public void onModuleLoad() {
        System.err.println(logger);
        logger.trace("This is a {} message", "TRACE");
        logger.debug("This is a {} message", "DEBUG");
        logger.info("This is an {} message", "INFO");
        logger.warn("This is a {} message", "WARN");
        logger.error("This is an {} message", "ERROR");
    }
}
