/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class lmm
implements Enumeration {
    public final Object nextElement() {
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasMoreElements() {
        return false;
    }
}

