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
    private static final long a = prr.a((long)-7756024822637681193L, (long)74653596428512078L, MethodHandles.lookup().lookupClass()).a(229019717933304L);
    private static final long b;

    public boolean o(byte by, long l) {
        int n;
        block4: {
            block5: {
                long l2 = ((long)by << 56 | l << 8 >>> 8) ^ a;
                CallSite callSite = m44.a("j", (long)7907265098218136975L, (long)l2);
                try {
                    try {
                        n = this.l;
                        if (callSite != false) break block4;
                        if (n <= (int)b) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)8581684872791299563L, (long)l2);
                    }
                    n = 1;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)8581684872791299563L, (long)l2);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    public void j(Object[] objectArray) {
        this.N = false;
    }

    public int x(int n) {
        int n2 = this.l;
        this.l = n;
        return n2;
    }

    public void v() {
        this.N = true;
    }

    public az(int n, int n2) {
        this.l = n;
        this.R = n2;
    }

    public boolean R(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                long l = (Long)objectArray[0];
                CallSite callSite = m44.a("n", (long)5418089773181075692L, (long)l);
                try {
                    object = m44.a("p", (Object)this, (long)5589068708928958837L, (long)l);
                    if (callSite == false) break block2;
                    if (object == false) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("n", (Object)((Object)n92), (long)5639758343718874295L, (long)l);
                }
                object = true;
                break block2;
            }
            object = false;
        }
        return (boolean)object;
    }

    public int n() {
        return this.l;
    }

    public az(int n, boolean bl, boolean bl2) {
        this(n, bl, bl2, 0);
    }

    public void Z(Object[] objectArray) {
        this.J = false;
    }

    public boolean J() {
        return this.J;
    }

    public az(int n) {
        this(n, 0);
    }

    public boolean y() {
        return this.N;
    }

    public void f() {
        this.J = true;
    }

    public az(int n, boolean bl, boolean bl2, int n2) {
        this.l = n;
        this.R = n2;
        this.N = bl;
        this.J = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x63CF275228C2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -4941285948401968483L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
