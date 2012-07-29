/*-
 * Copyright (c) 2004-2011 QOS.ch
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

package org.slf4j.helpers;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.Marker;

/**
 * This class serves as base for adapters or native implementations of logging systems lacking
 * Marker support. In this implementation, methods taking marker data simply invoke the
 * corresponding method without the Marker argument, discarding any marker data passed as argument.
 * 
 * @author Ceki Gulcu
 * @author Benedikt Meurer
 */
public abstract class MarkerIgnoringBase implements Logger, Serializable {
    /** The serial version UID of this class. */
    private static final long serialVersionUID = 1L;

    /**
     * @see Logger#isTraceEnabled(Marker)
     */
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    /**
     * @see Logger#trace(Marker, String)
     */
    public void trace(Marker marker, String msg) {
        trace(msg);
    }

    /**
     * @see Logger#trace(Marker, String, Object)
     */
    public void trace(Marker marker, String format, Object arg) {
        trace(format, arg);
    }

    /**
     * @see Logger#trace(Marker, String, Object, Object)
     */
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        trace(format, arg1, arg2);
    }

    /**
     * @see Logger#trace(Marker, String, Object[])
     */
    public void trace(Marker marker, String format, Object[] argArray) {
        trace(format, argArray);
    }

    /**
     * @see Logger#trace(Marker, String, Throwable)
     */
    public void trace(Marker marker, String msg, Throwable t) {
        trace(msg, t);
    }

    /**
     * @see Logger#isDebugEnabled(Marker)
     */
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    /**
     * @see Logger#debug(Marker, String)
     */
    public void debug(Marker marker, String msg) {
        debug(msg);
    }

    /**
     * @see Logger#debug(Marker, String, Object)
     */
    public void debug(Marker marker, String format, Object arg) {
        debug(format, arg);
    }

    /**
     * @see Logger#debug(Marker, String, Object, Object)
     */
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        debug(format, arg1, arg2);
    }

    /**
     * @see Logger#debug(Marker, String, Object[])
     */
    public void debug(Marker marker, String format, Object[] argArray) {
        debug(format, argArray);
    }

    /**
     * @see Logger#debug(Marker, String, Throwable)
     */
    public void debug(Marker marker, String msg, Throwable t) {
        debug(msg, t);
    }

    /**
     * @see Logger#isInfoEnabled(Marker)
     */
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    /**
     * @see Logger#info(Marker, String)
     */
    public void info(Marker marker, String msg) {
        info(msg);
    }

    /**
     * @see Logger#info(Marker, String, Object)
     */
    public void info(Marker marker, String format, Object arg) {
        info(format, arg);
    }

    /**
     * @see Logger#info(Marker, String, Object, Object)
     */
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        info(format, arg1, arg2);
    }

    /**
     * @see Logger#info(Marker, String, Object[])
     */
    public void info(Marker marker, String format, Object[] argArray) {
        info(format, argArray);
    }

    /**
     * @see Logger#info(Marker, String, Throwable)
     */
    public void info(Marker marker, String msg, Throwable t) {
        info(msg, t);
    }

    /**
     * @see Logger#isWarnEnabled(Marker)
     */
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    /**
     * @see Logger#warn(Marker, String)
     */
    public void warn(Marker marker, String msg) {
        warn(msg);
    }

    /**
     * @see Logger#warn(Marker, String, Object)
     */
    public void warn(Marker marker, String format, Object arg) {
        warn(format, arg);
    }

    /**
     * @see Logger#warn(Marker, String, Object, Object)
     */
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        warn(format, arg1, arg2);
    }

    /**
     * @see Logger#warn(Marker, String, Object[])
     */
    public void warn(Marker marker, String format, Object[] argArray) {
        warn(format, argArray);
    }

    /**
     * @see Logger#warn(Marker, String, Throwable)
     */
    public void warn(Marker marker, String msg, Throwable t) {
        warn(msg, t);
    }

    /**
     * @see Logger#isErrorEnabled(Marker)
     */
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }

    /**
     * @see Logger#error(Marker, String)
     */
    public void error(Marker marker, String msg) {
        error(msg);
    }

    /**
     * @see Logger#error(Marker, String, Object)
     */
    public void error(Marker marker, String format, Object arg) {
        error(format, arg);
    }

    /**
     * @see Logger#error(Marker, String, Object, Object)
     */
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        error(format, arg1, arg2);
    }

    /**
     * @see Logger#error(Marker, String, Object[])
     */
    public void error(Marker marker, String format, Object[] argArray) {
        error(format, argArray);
    }

    /**
     * @see Logger#error(Marker, String, Throwable)
     */
    public void error(Marker marker, String msg, Throwable t) {
        error(msg, t);
    }

    /**
     * @see Logger#
     */
    public String toString() {
        return this.getClass().getName() + "(" + getName() + ")";
    }
}
