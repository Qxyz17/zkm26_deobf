/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cd;
import com.zelix.ce;
import com.zelix.ci;
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

public class wo
extends wm {
    ci B;
    cd g;
    ce M;
    private static final long a;
    private static final String[] c;
    private static final String[] h;
    private static final Map l;

    public wo(byte by, JFrame jFrame, String string, int n, int n2, sn sn2, int n3, e_ e_2) {
        long l = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ a;
        long l2 = l ^ 0x6BC3D6FBB5AL;
        super(jFrame, string, sn2, n3, l2, e_2);
    }

    void M(Object[] objectArray) {
        boolean bl;
        CallSite callSite;
        wo wo2;
        cd cd2;
        cd cd3;
        wo wo3;
        long l = (Long)objectArray[0];
        long l2 = l;
        long l3 = l2 ^ 0x41AC19A5F305L;
        long l4 = l2 ^ 0x77860B03681EL;
        long l5 = l2 ^ 0x2D13569448B6L;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        long l6 = l2 ^ 0xA58B8243141L;
        try {
            cd cd4;
            wo3 = this;
            cd3 = cd4;
            cd2 = cd4;
            wo2 = this;
            callSite = m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l);
            bl = m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l) == true;
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)((Object)n92), (long)-5690312248628810178L, (long)l);
        }
        cd3((JFrame)((Object)wo2), (sn)callSite, l4, bl, (int)m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l));
        m44.a("w", (Object)((Object)wo3), (cd)cd2, (long)-5489532590839203972L, (long)l);
        CallSite callSite2 = m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l);
        boolean bl2 = m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l) != 3;
        CallSite callSite3 = m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l);
        wo wo4 = this;
        m44.a("w", (Object)((Object)this), (ce)new cs(l6, (JFrame)((Object)wo4), (sn)callSite3, bl2, (int)callSite2), (long)-5647111061919464391L, (long)l);
        m44.a("w", (Object)((Object)this), (ci)new ci((char)n, (char)n2, (JFrame)((Object)this), (sn)m44.a("u", (Object)((Object)this), (long)-6037544844648994508L, (long)l), (int)m44.a("u", (Object)((Object)this), (long)-5605966519382023429L, (long)l), n3), (long)-5842220495865018193L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = wo.c("v", (int)563, (long)(0x127544D42F6DAB2L ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wo.c("v", (int)10691, (long)(0x3F0AA2419D13F145L ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-5489532590839203972L, (long)l), (Object)m44.a("k", (Object)objectArray2, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = wo.c("v", (int)24639, (long)(0x3126BBEA2C71B8BFL ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wo.c("v", (int)3217, (long)(0x691F8B46BA31D416L ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-5647111061919464391L, (long)l), (Object)m44.a("k", (Object)objectArray3, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l3;
        objectArray4[0] = wo.c("v", (int)3343, (long)(0xAD333EFE537D58DL ^ l));
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)wo.c("v", (int)23592, (long)(0x16316EB8EEA104ACL ^ l)), null, (Object)m44.a("u", (Object)((Object)this), (long)-5842220495865018193L, (long)l), (Object)m44.a("k", (Object)objectArray4, (long)-5196677285636477633L, (long)l), (long)-5614158834116553654L, (long)l);
        m44.a("t", (Object)m44.a("u", (Object)((Object)this), (long)-5667220898314359664L, (long)l), (Object)m44.a("u", (Object)((Object)this), (long)-5842220495865018193L, (long)l), (long)-5285646393501745479L, (long)l);
    }

    protected final void Z(Object[] objectArray) {
        block17: {
            int n;
            CallSite callSite;
            long l;
            long l2;
            block18: {
                CallSite callSite2;
                block15: {
                    l2 = (Long)objectArray[0];
                    l = l2 ^ 0x7C444B220507L;
                    callSite2 = m44.a("m", (long)7518783055696240296L, (long)l2);
                    try {
                        block16: {
                            try {
                                try {
                                    callSite = m44.a("s", (Object)((Object)this), (long)8195950146899583349L, (long)l2);
                                    n = 1;
                                    if (callSite2 != null) break block15;
                                    if (callSite != n) break block16;
                                }
                                catch (n9 n92) {
                                    throw m44.a("m", (Object)((Object)n92), (long)8253327020569537968L, (long)l2);
                                }
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = wo.c("v", (int)4758, (long)(0x501462F16E900996L ^ l2));
                                objectArray2[0] = l;
                                m44.a("m", (Object)objectArray2, (long)8157000709015404428L, (long)l2);
                                if (callSite2 == null) break block17;
                            }
                            catch (n9 n93) {
                                throw m44.a("m", (Object)((Object)n93), (long)8253327020569537968L, (long)l2);
                            }
                        }
                        callSite = m44.a("s", (Object)((Object)this), (long)8195950146899583349L, (long)l2);
                        n = 2;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)((Object)n94), (long)8253327020569537968L, (long)l2);
                    }
                }
                try {
                    block19: {
                        try {
                            try {
                                if (l2 < 0L || callSite2 != null) break block18;
                                if (callSite != n) break block19;
                            }
                            catch (n9 n95) {
                                throw m44.a("m", (Object)((Object)n95), (long)8253327020569537968L, (long)l2);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = wo.c("v", (int)26163, (long)(0x475724342241FD3EL ^ l2));
                            objectArray3[0] = l;
                            m44.a("m", (Object)objectArray3, (long)8157000709015404428L, (long)l2);
                            if (callSite2 == null) break block17;
                        }
                        catch (n9 n96) {
                            throw m44.a("m", (Object)((Object)n96), (long)8253327020569537968L, (long)l2);
                        }
                    }
                    callSite = m44.a("s", (Object)((Object)this), (long)8195950146899583349L, (long)l2);
                    n = 3;
                }
                catch (n9 n97) {
                    throw m44.a("m", (Object)((Object)n97), (long)8253327020569537968L, (long)l2);
                }
            }
            try {
                if (callSite == n) {
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = wo.c("v", (int)3499, (long)(0x267EBA526D9996A0L ^ l2));
                    objectArray4[0] = l;
                    m44.a("m", (Object)objectArray4, (long)8157000709015404428L, (long)l2);
                }
            }
            catch (n9 n98) {
                throw m44.a("m", (Object)((Object)n98), (long)8253327020569537968L, (long)l2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                wo.a = prr.a((long)8617369093633047022L, (long)-8503769144399436930L, MethodHandles.lookup().lookupClass()).a(265142057188672L);
                wo.l = new HashMap<K, V>(13);
                var0 = wo.a ^ 94633796253749L;
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
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "H\u00fa%\u0001\u00dd\u0088|x\u00bb\u00c2kI\u0099l\tQ\u00d0*/\u00e6\u0000*M\u009ep\u0082</\u0014\t$\u00ac\u0097\u0010\u0019%\u00f0]\u00ddw(\u00cf4Q#\u009b\u00b2F\u00d9)]\u00e5,\u0080\u00d9\u00f4\u0019e\u001c\u00ef8\u00b1\u00afvN\u0089\u00c3\u00cb\u00a9HW\u0094\u00a8A\u00be^\u000b\u000b?\u00a7\u00e3\u0010\u00c6>v\u00bb\u00ed\u0091\u00fa\u00b5rvjS4&\u0082\u00ce\u0010*\u0007J\u00c5\u00f7\u00ab\u00ecw[\u00bc\r\u00fa<\u0082o#(\u00d0F\u009f\u00b1\u00ce^\u00dbF\u00ab\u0012\"\u0092D\u00b8\u008f\u00f8\u00ea\u0015\u00eb|eg(O\u00b5\u00ce*2p\u00ab\u0095I\u00d8\u00b9\u00aaC\u0015\u00eb\u00c9\u00c4\u0010\u000f|\u00e1\u00b7\u00c3\u00d2ss`\u008aN\u00fe\u0018I\u0002\u00ef8\u00ae\u00ae\u0015\u00e9z8C\u00ed`\u00e5\u00e5\u000f\u00cam]5\u008b\u00c8I\u001a0\u00b2\u0089V\u00c1/\u0003\u00ab\u008f\u00b1&E\u000bL\u00f1\u008am\u00b3\u0004\u0084ke%\u0019\u00fc\"\u00ac\u00f2\u00036\u00bc\u0081w\u0019\u00d9\u0003";
                var8_6 = "H\u00fa%\u0001\u00dd\u0088|x\u00bb\u00c2kI\u0099l\tQ\u00d0*/\u00e6\u0000*M\u009ep\u0082</\u0014\t$\u00ac\u0097\u0010\u0019%\u00f0]\u00ddw(\u00cf4Q#\u009b\u00b2F\u00d9)]\u00e5,\u0080\u00d9\u00f4\u0019e\u001c\u00ef8\u00b1\u00afvN\u0089\u00c3\u00cb\u00a9HW\u0094\u00a8A\u00be^\u000b\u000b?\u00a7\u00e3\u0010\u00c6>v\u00bb\u00ed\u0091\u00fa\u00b5rvjS4&\u0082\u00ce\u0010*\u0007J\u00c5\u00f7\u00ab\u00ecw[\u00bc\r\u00fa<\u0082o#(\u00d0F\u009f\u00b1\u00ce^\u00dbF\u00ab\u0012\"\u0092D\u00b8\u008f\u00f8\u00ea\u0015\u00eb|eg(O\u00b5\u00ce*2p\u00ab\u0095I\u00d8\u00b9\u00aaC\u0015\u00eb\u00c9\u00c4\u0010\u000f|\u00e1\u00b7\u00c3\u00d2ss`\u008aN\u00fe\u0018I\u0002\u00ef8\u00ae\u00ae\u0015\u00e9z8C\u00ed`\u00e5\u00e5\u000f\u00cam]5\u008b\u00c8I\u001a0\u00b2\u0089V\u00c1/\u0003\u00ab\u008f\u00b1&E\u000bL\u00f1\u008am\u00b3\u0004\u0084ke%\u0019\u00fc\"\u00ac\u00f2\u00036\u00bc\u0081w\u0019\u00d9\u0003".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = wo.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008a\u008b\u00f4u^\u0096\u00c3N20\u00b1\u0092\u009ds|m\\\u0099T\"\u0096\u00d1\u00ab\u00169\u00fc\u0016yY\u00a5*\u009aX\u00df\u00e9D\u0004\u008f\u00ab\u00a9\u00ea~\u00adv\u0012\u00e1\u00db\u000143hoj[\u00e6/\u000b\u009b\u00a2\u00bd\u00a8\u00e9\u0010\u0090\u0010\u00a6W2W\u00fa\u00db]\u00d9V\u00a4\u0000f/d=V";
                    var8_6 = "\u008a\u008b\u00f4u^\u0096\u00c3N20\u00b1\u0092\u009ds|m\\\u0099T\"\u0096\u00d1\u00ab\u00169\u00fc\u0016yY\u00a5*\u009aX\u00df\u00e9D\u0004\u008f\u00ab\u00a9\u00ea~\u00adv\u0012\u00e1\u00db\u000143hoj[\u00e6/\u000b\u009b\u00a2\u00bd\u00a8\u00e9\u0010\u0090\u0010\u00a6W2W\u00fa\u00db]\u00d9V\u00a4\u0000f/d=V".length();
                    var5_7 = 64;
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
                    var9_3[var7_4++] = wo.c(var10_9).intern();
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
        wo.c = var9_3;
        wo.h = new String[9];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7ADA;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])wo.l.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    wo.l.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/wo", exception);
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
            wo.h[n2] = wo.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = wo.c(n, l);
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
            throw new RuntimeException("com/zelix/wo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wo.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
