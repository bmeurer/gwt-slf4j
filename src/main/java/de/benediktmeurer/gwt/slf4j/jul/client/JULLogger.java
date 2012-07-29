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

package de.benediktmeurer.gwt.slf4j.jul.client;

import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

/**
 * JDK 1.4+ implementation of the {@link Logger} interface.
 * 
 * @author Benedikt Meurer
 * @see Logger
 */
public class JULLogger extends MarkerIgnoringBase implements Logger {
    /** The serial version UID of this class. */
    private static final long serialVersionUID = 1L;

    /** The JDK 1.4 logger. */
    private final transient java.util.logging.Logger logger;

    /**
     * Constructs a new {@link JULLogger} with the specified parameters.
     * 
     * @param logger the JDK 1.4 {@link java.util.logging.Logger}.
     */
    public JULLogger(java.util.logging.Logger logger) {
        this.logger = logger;
    }

    /**
     * @see Logger#getName()
     */
    @Override
    public String getName() {
        return this.logger.getName();
    }

    /**
     * @see Logger#isTraceEnabled()
     */
    @Override
    public boolean isTraceEnabled() {
        return this.logger.isLoggable(Level.FINEST);
    }

    /**
     * @see Logger#trace(String)
     */
    @Override
    public void trace(String msg) {
        if (this.logger.isLoggable(Level.FINEST)) {
            log(Level.FINEST, msg, null);
        }
    }

    /**
     * @see Logger#trace(String, Object)
     */
    @Override
    public void trace(String format, Object arg) {
        if (this.logger.isLoggable(Level.FINEST)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log(Level.FINEST, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#trace(String, Object, Object)
     */
    @Override
    public void trace(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.FINEST)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log(Level.FINEST, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#trace(String, Object[])
     */
    @Override
    public void trace(String format, Object[] argArray) {
        if (this.logger.isLoggable(Level.FINEST)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log(Level.FINEST, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#trace(String, Throwable)
     */
    @Override
    public void trace(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.FINEST)) {
            log(Level.FINEST, msg, t);
        }
    }

    /**
     * @see Logger#isDebugEnabled()
     */
    @Override
    public boolean isDebugEnabled() {
        return this.logger.isLoggable(Level.FINE);
    }

    /**
     * @see Logger#debug(String)
     */
    @Override
    public void debug(String msg) {
        if (this.logger.isLoggable(Level.FINE)) {
            log(Level.FINE, msg, null);
        }
    }

    /**
     * @see Logger#debug(String, Object)
     */
    @Override
    public void debug(String format, Object arg) {
        if (this.logger.isLoggable(Level.FINE)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log(Level.FINE, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#debug(String, Object, Object)
     */
    @Override
    public void debug(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.FINE)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log(Level.FINE, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#debug(String, Object[])
     */
    @Override
    public void debug(String format, Object[] argArray) {
        if (this.logger.isLoggable(Level.FINE)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log(Level.FINE, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#debug(String, Throwable)
     */
    @Override
    public void debug(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.FINE)) {
            log(Level.FINE, msg, t);
        }
    }

    /**
     * @see Logger#isInfoEnabled()
     */
    @Override
    public boolean isInfoEnabled() {
        return this.logger.isLoggable(Level.INFO);
    }

    /**
     * @see Logger#info(String)
     */
    @Override
    public void info(String msg) {
        if (this.logger.isLoggable(Level.INFO)) {
            log(Level.INFO, msg, null);
        }
    }

    /**
     * @see Logger#info(String, Object)
     */
    @Override
    public void info(String format, Object arg) {
        if (this.logger.isLoggable(Level.INFO)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log(Level.INFO, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#info(String, Object, Object)
     */
    @Override
    public void info(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.INFO)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log(Level.INFO, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#info(String, Object[])
     */
    @Override
    public void info(String format, Object[] argArray) {
        if (this.logger.isLoggable(Level.INFO)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log(Level.INFO, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#info(String, Throwable)
     */
    @Override
    public void info(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.INFO)) {
            log(Level.INFO, msg, t);
        }
    }

    /**
     * @see Logger#isWarnEnabled()
     */
    @Override
    public boolean isWarnEnabled() {
        return this.logger.isLoggable(Level.WARNING);
    }

    /**
     * @see Logger#warn(String)
     */
    @Override
    public void warn(String msg) {
        if (this.logger.isLoggable(Level.WARNING)) {
            log(Level.WARNING, msg, null);
        }
    }

    /**
     * @see Logger#warn(String, Object)
     */
    @Override
    public void warn(String format, Object arg) {
        if (this.logger.isLoggable(Level.WARNING)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log(Level.WARNING, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#warn(String, Object[])
     */
    @Override
    public void warn(String format, Object[] argArray) {
        if (this.logger.isLoggable(Level.WARNING)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log(Level.WARNING, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#warn(String, Object, Object)
     */
    @Override
    public void warn(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.WARNING)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log(Level.WARNING, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#warn(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void warn(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.WARNING)) {
            log(Level.WARNING, msg, t);
        }
    }

    /**
     * @see Logger#isErrorEnabled()
     */
    @Override
    public boolean isErrorEnabled() {
        return this.logger.isLoggable(Level.SEVERE);
    }

    /**
     * @see Logger#error(String)
     */
    @Override
    public void error(String msg) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            log(Level.SEVERE, msg, null);
        }
    }

    /**
     * @see Logger#error(String, Object)
     */
    @Override
    public void error(String format, Object arg) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            log(Level.SEVERE, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#error(String, Object, Object)
     */
    @Override
    public void error(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            log(Level.SEVERE, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#error(String, Object[])
     */
    @Override
    public void error(String format, Object[] argArray) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            log(Level.SEVERE, ft.getMessage(), ft.getThrowable());
        }
    }

    /**
     * @see Logger#error(String, Throwable)
     */
    @Override
    public void error(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            log(Level.SEVERE, msg, t);
        }
    }

    /**
     * @see java.util.logging.Logger#log(Level, String, Throwable)
     */
    private void log(Level level, String msg, Throwable thrown) {
        this.logger.log(level, msg, thrown);
    }
}
