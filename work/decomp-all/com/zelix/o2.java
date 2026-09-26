/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.fb;
import com.zelix.hz;
import com.zelix.loj;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.oz;
import com.zelix.prr;
import com.zelix.v7;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class o2
extends oz {
    v7 n;
    private static final long a = prr.a((long)4840818480451523924L, (long)4532019636874420176L, MethodHandles.lookup().lookupClass()).a(116350145195308L);
    private static final long c;

    public boolean S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean T(long l) {
        return false;
    }

    public hz n(hz hz2, boolean bl, char c, int n, boolean bl2, loj loj2, char c2, String string) {
        long l;
        long l2 = l = (long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48;
        long l3 = l2 ^ 0x7B6853B1BEA8L;
        long l4 = l2 ^ 0x5A73015BC1DL;
        long l5 = l2 ^ 0x67D45B4239BAL;
        long l6 = l2 ^ 0x4D53AB9156L;
        v7[] v7Array = hz2.T();
        v7[] v7Array2 = hz2.X();
        int n2 = v7Array2.length;
        fb fb2 = hz2.j();
        v7[] v7Array3 = v7.I((int)(n2 - 1), (long)l6);
        System.arraycopy(v7Array2, 0, v7Array3, 0, n2 - 1);
        m44.a("p", (Object)((Object)this), (v7)v7Array2[v7Array2.length - 1], (long)-4498795856233464406L, (long)l);
        hz hz3 = new hz(v7Array3, v7Array, l5, fb2, hz2.k(l4));
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = hz3;
        m44.a("s", (Object)((Object)this), (Object)objectArray, (long)-4303016110419702343L, (long)l);
        return hz3;
    }

    public v7 J(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("v", (Object)((Object)this), (long)-6377899460216939706L, (long)l);
    }

    abstract void u(Object[] var1);

    public final void h(Object[] objectArray) {
        block4: {
            StringBuilder stringBuilder;
            PrintWriter printWriter;
            block5: {
                long l = (Long)objectArray[0];
                printWriter = (PrintWriter)objectArray[1];
                StringBuilder stringBuilder2 = (StringBuilder)objectArray[2];
                long l2 = l;
                long l3 = l2 ^ 0x7B7D8DE1E476L;
                long l4 = l2 ^ 0x8A9056647FBL;
                int n = (int)(l4 >>> 32);
                int n2 = (int)(l4 << 32 >>> 56);
                int n3 = (int)(l4 << 40 >>> 40);
                stringBuilder = new StringBuilder((int)c);
                CallSite callSite = m44.a("h", (long)-1155528826364025814L, (long)l);
                m44.a("w", (Object)stringBuilder, (Object)stringBuilder2, (long)-1446051688896854452L, (long)l);
                m44.a("w", (Object)stringBuilder, (Object)stringBuilder2, (long)-1446051688896854452L, (long)l);
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = n3;
                objectArray2[1] = (int)((byte)n2);
                objectArray2[0] = n;
                stringBuilder.append((String)((Object)m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)-636251684499120046L, (long)l)));
                Object[] objectArray3 = new Object[2];
                objectArray3[1] = this.X;
                objectArray3[0] = l3;
                CallSite callSite2 = m44.a("h", (Object)objectArray3, (long)-1509257710096725591L, (long)l);
                try {
                    try {
                        if (callSite == false) break block4;
                        if (((String)((Object)callSite2)).length() <= 0) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)((Object)n92), (long)-623429630579824675L, (long)l);
                    }
                    stringBuilder.append("\t" + (String)((Object)callSite2));
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)((Object)n93), (long)-623429630579824675L, (long)l);
                }
            }
            printWriter.println(stringBuilder.toString());
        }
    }

    public boolean t() {
        return true;
    }

    public o2(int n) {
        super(n);
    }

    public String l(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x3926A82327E7L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 56);
        int n3 = (int)(l2 << 40 >>> 40);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = n3;
        objectArray2[1] = (int)((byte)n2);
        objectArray2[0] = n;
        return m44.a("s", (Object)((Object)this), (Object)objectArray2, (long)-7550383759637692338L, (long)l);
    }

    public boolean L(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean v(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        v7 v72 = (v7)objectArray[1];
        long l = (Long)objectArray[2];
        int n2 = (Integer)objectArray[3];
        return false;
    }

    public boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    public boolean Y(long l, int n, int n2) {
        boolean bl;
        block5: {
            block6: {
                CallSite callSite = m44.a("k", (long)6173625216586931614L, (long)l);
                try {
                    try {
                        bl = n;
                        Object object = callSite;
                        if (l > 0L) {
                            if (object != false) break block5;
                            object = n2;
                        }
                        if (bl < object) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("k", (Object)((Object)n92), (long)5967941548992135766L, (long)l);
                    }
                    bl = true;
                    break block5;
                }
                catch (n9 n93) {
                    throw m44.a("k", (Object)((Object)n93), (long)5967941548992135766L, (long)l);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean e(long l, int n) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0xD291C3EC0B0L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -3263475198089986215L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
