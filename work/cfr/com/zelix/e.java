/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lou;
import com.zelix.lqp;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class e
implements List {
    private final List Y;
    private static final long a = prr.a(6576393360672471885L, -6441892453685253636L, MethodHandles.lookup().lookupClass()).a(83007943786524L);
    private static final String b;

    public ListIterator listIterator(int n10) {
        long l10 = a ^ 0x7E6E68454E66L;
        long l11 = l10 ^ 0x2D107758FC34L;
        return new lqp(this, n10, l11);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        long l10 = a ^ 0x3B2562E57030L;
        return (boolean)m44.a("r", (Object)this.Y, (Object)collection, (long)2937469588501456508L, (long)l10);
    }

    @Override
    public final boolean contains(Object object) {
        return this.Y.contains(object);
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int lastIndexOf(Object object) {
        long l10 = a ^ 0x3E4CFF340F39L;
        return (int)m44.a("s", (Object)this.Y, (Object)object, (long)5555938082019524917L, (long)l10);
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public List subList(int n10, int n11) {
        long l10 = a ^ 0x7322F0323BC6L;
        long l11 = l10 ^ 0x8793EF8714DL;
        return new e(l11, (List)((Object)m44.a("t", (Object)this.Y, (int)n10, (int)n11, (long)8940232642275536132L, (long)l10)));
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        return this.Y.toArray(objectArray);
    }

    public Object remove(int n10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ List F(Object[] objectArray) {
        e e10 = (e)objectArray[0];
        return e10.Y;
    }

    @Override
    public Iterator iterator() {
        long l10 = a ^ 0x2EC6DD7C4F4DL;
        long l11 = l10 ^ 0x7FAEFDCBB80L;
        return new lou(this, l11);
    }

    public Object get(int n10) {
        return this.Y.get(n10);
    }

    @Override
    public Object[] toArray() {
        long l10 = a ^ 0x3B7D3A31C22CL;
        return m44.a("v", (Object)this.Y, (long)-9106438413007250646L, (long)l10);
    }

    public e(long l10, List list) {
        block4: {
            block5: {
                l10 = a ^ l10;
                CallSite callSite = m44.a("l", (long)4956872437748554492L, (long)l10);
                CallSite callSite2 = callSite;
                try {
                    try {
                        if (callSite2 != null) break block4;
                        if (list != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)5065537412052444097L, (long)l10);
                    }
                    throw new IllegalArgumentException(b);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)5065537412052444097L, (long)l10);
                }
            }
            this.Y = list;
        }
    }

    public ListIterator listIterator() {
        long l10 = a ^ 0x4D9F20AA21AFL;
        long l11 = l10 ^ 0x15161DE26E8FL;
        return new lqp(l11, this);
    }

    @Override
    public final int size() {
        return this.Y.size();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int n10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int indexOf(Object object) {
        long l10 = a ^ 0x2F037D41CB6DL;
        return (int)m44.a("w", (Object)this.Y, (Object)object, (long)-8293417665368643237L, (long)l10);
    }

    @Override
    public final boolean isEmpty() {
        return this.Y.isEmpty();
    }

    public void add(int n10, Object object) {
        throw new UnsupportedOperationException();
    }

    public Object set(int n10, Object object) {
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x151EE4A85B2DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0083\u0014\u00b8s\u00f2\u00fa@\u0083}\u008bd/oh\u00f5\u00c5\u00f3\u00d2\u000b\u00b5\u00e7\u0084\u00ed\u00d4\u0005\u00bf\u00d1\u00f3\u00dc\u00ff\u00aaD".getBytes("ISO-8859-1"));
                b = e.a(byArray3).intern();
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

