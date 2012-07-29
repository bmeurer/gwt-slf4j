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

package de.benediktmeurer.gwt.slf4j.client;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 * JDK 1.4+ implementation of the {@link ILoggerFactory} interface.
 * 
 * @author Benedikt Meurer
 * @see ILoggerFactory
 */
final class JDK14LoggerFactory implements ILoggerFactory {
    /** The map of active loggers. */
    private final Map<String, Logger> loggers = new HashMap<String, Logger>();

    /**
     * @see ILoggerFactory#getLogger(String)
     */
    @Override
    public Logger getLogger(String name) {
        Logger logger = this.loggers.get(name);
        if (logger == null) {
            logger = new JDK14Logger(java.util.logging.Logger.getLogger(name));
            this.loggers.put(logger.getName(), logger);
        }
        return logger;
    }
}
