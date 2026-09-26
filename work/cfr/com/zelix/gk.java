/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.e7;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gk
implements Set {
    private Set W;
    private static final long a = prr.a(-1077364736258335233L, 7905257515373430923L, MethodHandles.lookup().lookupClass()).a(55529323810237L);
    private static final String b;

    @Override
    public Iterator iterator() {
        long l10 = a ^ 0x2A257D8FBC9L;
        long l11 = l10 ^ 0x1EA45BDAC01AL;
        return new e7(l11, this);
    }

    public gk(int n10, Set set, int n11, byte by2) {
        block4: {
            block5: {
                long l10 = ((long)n10 << 32 | (long)n11 << 40 >>> 32 | (long)by2 << 56 >>> 56) ^ a;
                CallSite callSite = m44.a("l", (long)-8943486192672465452L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (set != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)-9144448763496509365L, (long)l10);
                    }
                    throw new IllegalArgumentException(b);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)-9144448763496509365L, (long)l10);
                }
            }
            this.W = set;
        }
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        long l10 = a ^ 0x717C0597AD2L;
        return m44.a("p", (Object)this.W, (long)-1858277612289043879L, (long)l10);
    }

    @Override
    public final int size() {
        return this.W.size();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object object) {
        return this.W.contains(object);
    }

    @Override
    public final boolean isEmpty() {
        long l10 = a ^ 0x692092735623L;
        return (boolean)m44.a("q", (Object)this.W, (long)-3499937647219905255L, (long)l10);
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        long l10 = a ^ 0x7F3B5161D92EL;
        return m44.a("t", (Object)this.W, (Object)objectArray, (long)4925466883084976935L, (long)l10);
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Set j(Object[] objectArray) {
        gk gk2 = (gk)objectArray[0];
        return gk2.W;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsAll(Collection collection) {
        long l10 = a ^ 0x38479D4CECCAL;
        return (boolean)m44.a("p", (Object)this.W, (Object)collection, (long)7976509719446765308L, (long)l10);
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x1892130732E9L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ab\u0007\u00cbx\u007f\u00e9\u00fe\u0084#t\u00c4\u00aa\u0016\u00b7\u00e5\u00fa^y!\u009f\u00ac\u00bb\u00b3\u00abL\u00eb\u00d3\u00bf\u00c1\u0095\u0011\u00ff".getBytes("ISO-8859-1"));
                b = gk.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String a(byte[] byArray) {
        int n10 = 0;
        int n11 = byArray.length;
        char[] cArray = new char[n11];
        for (int i10 = 0; i10 < n11; ++i10) {
            char c10;
            int n12 = 0xFF & byArray[i10];
            if (n12 < 192) {
                cArray[n10++] = (char)n12;
                continue;
            }
            if (n12 < 224) {
                c10 = (char)((char)(n12 & 0x1F) << 6);
                n12 = byArray[++i10];
                c10 = (char)(c10 | (char)(n12 & 0x3F));
                cArray[n10++] = c10;
                continue;
            }
            if (i10 >= n11 - 2) continue;
            c10 = (char)((char)(n12 & 0xF) << 12);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F) << 6);
            n12 = byArray[++i10];
            c10 = (char)(c10 | (char)(n12 & 0x3F));
            cArray[n10++] = c10;
        }
        return new String(cArray, 0, n10);
    }
}

