/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.d1;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class az
implements d1 {
    private boolean J;
    private boolean N;
    private int l = -1;
    private final int R;
    private static final long a = prr.a(-7756024822637681193L, 74653596428512078L, MethodHandles.lookup().lookupClass()).a(229019717933304L);
    private static final long b;

    public boolean o(byte by2, long l10) {
        int n10;
        block4: {
            block5: {
                long l11 = ((long)by2 << 56 | l10 << 8 >>> 8) ^ a;
                CallSite callSite = m44.a("j", (long)7907265098218136975L, (long)l11);
                try {
                    try {
                        n10 = this.l;
                        if (callSite != false) break block4;
                        if (n10 <= (int)b) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)n92, (long)8581684872791299563L, (long)l11);
                    }
                    n10 = 1;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)n93, (long)8581684872791299563L, (long)l11);
                }
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    public void j(Object[] objectArray) {
        this.N = false;
    }

    @Override
    public int x(int n10) {
        int n11 = this.l;
        this.l = n10;
        return n11;
    }

    public void v() {
        this.N = true;
    }

    public az(int n10, int n11) {
        this.l = n10;
        this.R = n11;
    }

    @Override
    public boolean R(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                long l10 = (Long)objectArray[0];
                CallSite callSite = m44.a("n", (long)5418089773181075692L, (long)l10);
                try {
                    object = m44.a("p", (Object)this, (long)5589068708928958837L, (long)l10);
                    if (callSite == false) break block2;
                    if (object == false) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)n92, (long)5639758343718874295L, (long)l10);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    @Override
    public int n() {
        return this.l;
    }

    public az(int n10, boolean bl2, boolean bl3) {
        this(n10, bl2, bl3, 0);
    }

    public void Z(Object[] objectArray) {
        this.J = false;
    }

    @Override
    public boolean J() {
        return this.J;
    }

    public az(int n10) {
        this(n10, 0);
    }

    @Override
    public boolean y() {
        return this.N;
    }

    public void f() {
        this.J = true;
    }

    public az(int n10, boolean bl2, boolean bl3, int n11) {
        this.l = n10;
        this.R = n11;
        this.N = bl2;
        this.J = bl3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x63CF275228C2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n10 = 1;
        while (true) {
            if (n10 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -4941285948401968483L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n10] = (byte)(l10 << n10 * 8 >>> 56);
            ++n10;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

