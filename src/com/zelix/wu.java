/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cd;
import com.zelix.ce;
import com.zelix.cs;
import com.zelix.e_;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sn;
import com.zelix.wm;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JFrame;

public class wu
extends wm {
    cd X;
    ce r;
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    void M(Object[] objectArray) {
        boolean bl;
        CallSite callSite;
        wu wu2;
        cd cd2;
        cd cd3;
        wu wu3;
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x41AC19A5F305L;
        long l4 = l2 ^ 0x77860B03681EL;
        long l5 = l2 ^ 0xA58B8243141L;
        try {
            cd cd4;
            wu3 = this;
            cd3 = cd4;
            cd2 = cd4;
            wu2 = this;
            callSite = m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l);
            bl = m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l) == true;
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)((Object)n92), (long)-5331751629526037571L, (long)l);
        }
        cd3((JFrame)((Object)wu2), (sn)callSite, l4, bl, (int)m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l));
        m44.a("w", (Object)((Object)wu3), (cd)cd2, (long)-5259059104406727149L, (long)l);
        m44.a("w", (Object)((Object)this), (ce)new cs(l5, (JFrame)((Object)this), (sn)m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l), false, (int)m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l)), (long)-5888154815467127156L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = wu.c("e", (int)16837, (long)(0x6B1F0DA04443D1D7L ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wu.c("e", (int)5891, (long)(0xF91EEA6AC340715L ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-5259059104406727149L, (long)l), (Object)m44.a("k", (Object)objectArray2, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = wu.c("e", (int)21839, (long)(0x38E70E5C709BC55FL ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wu.c("e", (int)16860, (long)(0x7A8EF7FB3C1DD1CDL ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-5888154815467127156L, (long)l), (Object)m44.a("k", (Object)objectArray3, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)m44.a("u", (Object)((Object)this), (long)-5888154815467127156L, (long)l), (long)-5285646393501745479L, (long)l);
    }

    public wu(JFrame jFrame, String string, sn sn2, int n, e_ e_2, long l) {
        long l2 = (l = a ^ l) ^ 0x4329403C2C83L;
        super(jFrame, string, sn2, n, l2, e_2);
    }

    /*
     * Unable to fully structure code
     */
    protected final void Z(Object[] var1_1) {
        block10: {
            block9: {
                var2_2 = (Long)var1_1[0];
                var4_3 = var2_2 ^ 136632760141063L;
                var6_4 = m44.a("m", (long)7518783055696240296L, (long)var2_2);
                try {
                    try {
                        if (var6_4 != null) break block9;
                        if (m44.a("s", (Object)this, (long)8195950146899583349L, (long)var2_2) == true) {
                        }
                        ** GOTO lbl28
                    }
                    catch (n9 v0) {
                        throw m44.a("m", (Object)v0, (long)8471154620230486067L, (long)var2_2);
                    }
                    v1 = new Object[2];
                    v1[1] = wu.c("e", (int)14634, (long)(8866577808640109235L ^ var2_2));
                    v1[0] = var4_3;
                    m44.a("m", (Object)v1, (long)8157000709015404428L, (long)var2_2);
                }
                catch (n9 v2) {
                    throw m44.a("m", (Object)v2, (long)8471154620230486067L, (long)var2_2);
                }
            }
            try {
                block11: {
                    v3 = var6_4;
                    if (var2_2 >= 0L) {
                        if (v3 == null) break block10;
                    }
                    break block11;
lbl28:
                    // 2 sources

                    v4 = new Object[2];
                    v4[1] = wu.c("e", (int)11314, (long)(8914052387029254063L ^ var2_2));
                    v3 = v4;
                    v4[0] = var4_3;
                }
                m44.a("m", (Object)v3, (long)8157000709015404428L, (long)var2_2);
            }
            catch (n9 v5) {
                throw m44.a("m", (Object)v5, (long)8471154620230486067L, (long)var2_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                wu.a = prr.a((long)7675410593170471025L, (long)3428648616950116129L, MethodHandles.lookup().lookupClass()).a(99243284834961L);
                wu.h = new HashMap<K, V>(13);
                var0 = wu.a ^ 130670158325985L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "k\u00d2E\u00d3l\u00b97D\u0010\u00a8\u00ea\u00c7\u0006\u00ecZ\u00c7H\u00f7?\u00e7V\u00c7\u00f4d\u00b5\u00ed[+\u0084\u001e\u00f2\u00ef\u0092\u0005$Ll\n\u0088K@\u0002Q\u00c2K\u00d8\u008d\u00c7\t{\u00e7\u00a3\u008c\u001b\u00cf\u00d4\u00c2\u00eb\u00fb\u00ca6\u00dc8\u0092\u0005}\u000b\u00a0\u00ed;\u00ce\u001f\\p~%\u001c\u00dfQh\t\u001f\u001e\u00f7\u008c\u000e\u00d1~\u00fe\u0010\u008e\u0007sr\u00ae\u009d\u00c5\u00ad\u00f0A\u00a7lD\u00f6\u00a6V(\u00af2\u00fb_C|\u0086~N\u00f90\u00e4\u00d3z\u00d8\u00c6\u009d\u00a7\u0001\rz\u00f68\u00f4\u0090\u000e\u00b1\u0092\u0090\u001f&\u00c0\u0084\u001d\u00c0\u00b7\u008e\u0093z\u000f";
                var8_6 = "k\u00d2E\u00d3l\u00b97D\u0010\u00a8\u00ea\u00c7\u0006\u00ecZ\u00c7H\u00f7?\u00e7V\u00c7\u00f4d\u00b5\u00ed[+\u0084\u001e\u00f2\u00ef\u0092\u0005$Ll\n\u0088K@\u0002Q\u00c2K\u00d8\u008d\u00c7\t{\u00e7\u00a3\u008c\u001b\u00cf\u00d4\u00c2\u00eb\u00fb\u00ca6\u00dc8\u0092\u0005}\u000b\u00a0\u00ed;\u00ce\u001f\\p~%\u001c\u00dfQh\t\u001f\u001e\u00f7\u008c\u000e\u00d1~\u00fe\u0010\u008e\u0007sr\u00ae\u009d\u00c5\u00ad\u00f0A\u00a7lD\u00f6\u00a6V(\u00af2\u00fb_C|\u0086~N\u00f90\u00e4\u00d3z\u00d8\u00c6\u009d\u00a7\u0001\rz\u00f68\u00f4\u0090\u000e\u00b1\u0092\u0090\u001f&\u00c0\u0084\u001d\u00c0\u00b7\u008e\u0093z\u000f".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = wu.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "NF\u00bfv}\u0019\u00ddO\u0098\u00a6\u00ef\u0081\u00b7\u00a5\f4(mv\u0003\u0096\u00baZ\u00a1T\u000f[\u0014\u009cu\u00f8C*>R\u00ac\u008b\u00a6$\u0007\u0088Z\u00e5y\u00c9#b\u00c2\u00ae-;Jg\u00af\u00adS,";
                    var8_6 = "NF\u00bfv}\u0019\u00ddO\u0098\u00a6\u00ef\u0081\u00b7\u00a5\f4(mv\u0003\u0096\u00baZ\u00a1T\u000f[\u0014\u009cu\u00f8C*>R\u00ac\u008b\u00a6$\u0007\u0088Z\u00e5y\u00c9#b\u00c2\u00ae-;Jg\u00af\u00adS,".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = wu.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        wu.c = var9_3;
        wu.g = new String[6];
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String c(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x324F;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/wu", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            wu.g[n2] = wu.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = wu.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/wu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wu.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
