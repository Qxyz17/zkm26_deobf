/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix._v;
import com.zelix.gm;
import com.zelix.gu;
import com.zelix.jr;
import com.zelix.jv;
import com.zelix.l62;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ni;
import com.zelix.prr;
import com.zelix.to;
import com.zelix.va;
import com.zelix.x8;
import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jf
extends jv
implements gm,
ni {
    x8 m;
    static final va h;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    jf(jr jr2, x8 x82, l6q l6q2, long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x2F70171848ADL;
        super(jr2.t, jr2.l);
        this.m = x82;
        l6q2.t(x82, this, l11);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                jf.a = prr.a(-4187204755898432684L, -4569653669588711184L, MethodHandles.lookup().lookupClass()).a(18919164611104L);
                jf.d = new HashMap<K, V>(13);
                var0 = jf.a ^ 40236301276733L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00bd(\u0094\u00fc\u00de!\u000b\u00865\u00dd\u00eb\u00d3%k\u00d4|\u00b0f\u0002v\u007f\u009b\u0083\u001c";
                var7_6 = "\u00bd(\u0094\u00fc\u00de!\u000b\u00865\u00dd\u00eb\u00d3%k\u00d4|\u00b0f\u0002v\u007f\u009b\u0083\u001c".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00a1\u009b\u0097yK4\u001dZ\u000b\u00bc\u0017\u0007\u0019\u00c7\u0014\u00ab";
                    var7_6 = "\u00a1\u009b\u0097yK4\u001dZ\u000b\u00bc\u0017\u0007\u0019\u00c7\u0014\u00ab".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        jf.b = var8_3;
        jf.c = new Integer[5];
        jf.h = va.Q;
    }

    @Override
    public va A(long l10) {
        return h;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    void w(long var1_1, DataOutputStream var3_2, Map var4_3) {
        block9: {
            block8: {
                v0 = m44.a("h", (long)7191396267850401064L, (long)var1_1);
                var3_2.writeByte(jf.h.g());
                var5_4 = v0;
                var6_5 = (x8)var4_3.get(this.m);
                try {
                    try {
                        v1 = var5_4;
                        if (var1_1 <= 0L) ** GOTO lbl23
                        if (v1 != false) break block8;
                        if (var6_5 != null) {
                        }
                        ** GOTO lbl24
                    }
                    catch (n9 v2) {
                        throw m44.a("h", (Object)v2, (long)9150374959265722010L, (long)var1_1);
                    }
                    var3_2.writeShort(var6_5.E());
                }
                catch (n9 v3) {
                    throw m44.a("h", (Object)v3, (long)9150374959265722010L, (long)var1_1);
                }
            }
            try {
                if (var1_1 <= 0L) break block9;
                v1 = var5_4;
lbl23:
                // 2 sources

                if (v1 == false) break block9;
lbl24:
                // 2 sources

                var3_2.writeShort(this.m.E());
            }
            catch (n9 v4) {
                throw m44.a("h", (Object)v4, (long)9150374959265722010L, (long)var1_1);
            }
        }
    }

    @Override
    void O(DataOutputStream dataOutputStream, long l10) {
        dataOutputStream.writeByte(h.g());
        dataOutputStream.writeShort(this.m.E());
    }

    jf(int n10, to to2, long l10, x8 x82) {
        long l11 = (l10 = a ^ l10) ^ 0x53F45F564D11L;
        this(n10, to2, l11, x82, null);
    }

    @Override
    public void q(x8 x82, long l10, x8 x83) {
        block5: {
            block4: {
                CallSite callSite = m44.a("n", (long)-5906177365838858378L, (long)l10);
                try {
                    jf jf2;
                    try {
                        jf2 = this;
                        if (callSite == false) break block4;
                        if (jf2.m != x82) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)n92, (long)-5912497112593236588L, (long)l10);
                    }
                    jf2 = this;
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)n93, (long)-5912497112593236588L, (long)l10);
                }
            }
            jf2.m = x83;
        }
    }

    @Override
    public String z(char c10, int n10, short s10) {
        long l10 = (long)c10 << 48 | (long)n10 << 32 >>> 16 | (long)s10 << 48 >>> 48;
        long l11 = l10 ^ 0x5D4EE126DDD2L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        return m44.a("r", (Object)this, (Object)objectArray, (long)-769804561390226470L, (long)l10);
    }

    @Override
    public String N(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        return this.m.V().replace((char)jf.b("a", (int)12116, (long)(0x2611BC598AD544E5L ^ l10)), (char)jf.b("a", (int)22027, (long)(0x22A33BDD2F37BDBEL ^ l10)));
    }

    public boolean v(String string, int n10, short s10, short s11) {
        long l10 = ((long)n10 << 32 | (long)s10 << 48 >>> 32 | (long)s11 << 48 >>> 48) ^ a;
        long l11 = l10 ^ 0x4E4A315F6E2CL;
        return this.g(l11).equals(string);
    }

    public _f m(Object[] objectArray) {
        block3: {
            CallSite callSite;
            long l10;
            block2: {
                long l11 = (Long)objectArray[0];
                long l12 = l11 = a ^ l11;
                l10 = l12 ^ 0x476BC73DC7DEL;
                long l13 = l12 ^ 0x5E5051A47C29L;
                long l14 = l12 ^ 0x30658298B31L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = this.g(l14);
                objectArray2[0] = l13;
                CallSite callSite2 = m44.a("j", (Object)objectArray2, (long)7332418153517746149L, (long)l11);
                CallSite callSite3 = m44.a("j", (long)7444160617677324714L, (long)l11);
                try {
                    callSite = callSite2;
                    if (callSite3 != false) break block2;
                    if (callSite == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("j", (Object)n92, (long)8826679110831876632L, (long)l11);
                }
                callSite = callSite2;
            }
            return l62.B((String)((Object)callSite), l10);
        }
        return null;
    }

    @Override
    public void r(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l10 = (Long)objectArray[1];
        this.m.A(string);
    }

    public void I(Object[] objectArray) {
        block20: {
            boolean bl2;
            Object object;
            long l10;
            block19: {
                String string;
                block17: {
                    String string2;
                    long l11;
                    HashMap hashMap;
                    block18: {
                        jf jf2;
                        CallSite callSite;
                        block15: {
                            block16: {
                                hashMap = (HashMap)objectArray[0];
                                l10 = (Long)objectArray[1];
                                long l12 = l10 = a ^ l10;
                                long l13 = l12 ^ 0x6BE4C40BB8EBL;
                                l11 = l12 ^ 0xFEA1EDFEF29L;
                                callSite = m44.a("h", (long)7694127715738268600L, (long)l10);
                                try {
                                    try {
                                        jf2 = this;
                                        if (callSite == false) break block15;
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l13;
                                        if (m44.a("w", (Object)jf2.l, (Object)objectArray2, (long)7966040393389664741L, (long)l10) != this) break block16;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("h", (Object)n92, (long)7583100445631101274L, (long)l10);
                                    }
                                    return;
                                }
                                catch (n9 n93) {
                                    throw m44.a("h", (Object)n93, (long)7583100445631101274L, (long)l10);
                                }
                            }
                            jf2 = this;
                        }
                        string2 = jf2.m.V();
                        object = (String)hashMap.get(string2);
                        try {
                            try {
                                try {
                                    try {
                                        string = object;
                                        if (callSite == false) break block17;
                                        if (string == null) break block18;
                                    }
                                    catch (n9 n94) {
                                        throw m44.a("h", (Object)n94, (long)7583100445631101274L, (long)l10);
                                    }
                                    bl2 = ((String)object).equals(string2);
                                    if (l10 <= 0L || callSite == false) break block19;
                                }
                                catch (n9 n95) {
                                    throw m44.a("h", (Object)n95, (long)7583100445631101274L, (long)l10);
                                }
                                if (bl2) break block18;
                            }
                            catch (n9 n96) {
                                throw m44.a("h", (Object)n96, (long)7583100445631101274L, (long)l10);
                            }
                            this.m.A((String)object);
                            if (callSite != false) break block20;
                        }
                        catch (n9 n97) {
                            throw m44.a("h", (Object)n97, (long)7583100445631101274L, (long)l10);
                        }
                    }
                    object = m44.a("h", string2, (Object)hashMap, (long)l11, (long)8156723526458453280L, (long)l10);
                    string = string2;
                }
                bl2 = string.equals(object);
            }
            try {
                if (!bl2) {
                    this.m.A((String)object);
                }
            }
            catch (n9 n98) {
                throw m44.a("h", (Object)n98, (long)7583100445631101274L, (long)l10);
            }
        }
    }

    public boolean N(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x47A9B05A9825L;
        return this.g(l11).startsWith("[");
    }

    jf(int n10, to to2, long l10, x8 x82, l6q l6q2) {
        block3: {
            l6q l6q3;
            long l11;
            block2: {
                l11 = (l10 = a ^ l10) ^ 0x72C39A24FD7FL;
                super(n10, to2);
                this.m = x82;
                CallSite callSite = m44.a("h", (long)-7724554392139271640L, (long)l10);
                try {
                    l6q3 = l6q2;
                    if (callSite != false) break block2;
                    if (l6q3 == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("h", (Object)n92, (long)-8503763725483222630L, (long)l10);
                }
                l6q3 = l6q2;
            }
            l6q3.t(x82, this, l11);
        }
    }

    public String h(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x6ADFDD734102L;
        String string = this.m.V();
        return jf.R(l11, string);
    }

    @Override
    public String g(long l10) {
        String string;
        block3: {
            String string2;
            block4: {
                string2 = this.m.V();
                CallSite callSite = m44.a("k", (long)-1405127884242842981L, (long)l10);
                try {
                    string = string2;
                    CallSite callSite2 = callSite;
                    if (l10 > 0L) {
                        if (callSite2 != false) break block3;
                        callSite2 = jf.b("a", (int)23965, (long)(0x13FBD8F66C546D9DL ^ l10));
                    }
                    if (string.indexOf((int)callSite2) == -1) break block4;
                }
                catch (n9 n92) {
                    throw m44.a("k", (Object)n92, (long)-1058439487231155927L, (long)l10);
                }
                string2 = string2.replace((char)jf.b("a", (int)22027, (long)(0x22A308007DFB660AL ^ l10)), (char)jf.b("a", (int)30645, (long)(0x63BB41CCCDDA47B6L ^ l10)));
            }
            string = string2;
        }
        return string;
    }

    /*
     * Exception decompiling
     */
    private static String R(long var0, String var2_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public _v E(Object[] objectArray) {
        block3: {
            CallSite callSite;
            long l10;
            block2: {
                long l11 = (Long)objectArray[0];
                long l12 = l11 = a ^ l11;
                l10 = l12 ^ 0x19787CB85B7EL;
                long l13 = l12 ^ 0x9599446D00CL;
                long l14 = l12 ^ 0x540F9DCB2714L;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = this.g(l14);
                objectArray2[0] = l13;
                CallSite callSite2 = m44.a("o", (Object)objectArray2, (long)-3898801711691617344L, (long)l11);
                CallSite callSite3 = m44.a("o", (long)-3788741500339311217L, (long)l11);
                try {
                    callSite = callSite2;
                    if (callSite3 != false) break block2;
                    if (callSite == null) break block3;
                }
                catch (n9 n92) {
                    throw m44.a("o", (Object)n92, (long)-3000524439451597251L, (long)l11);
                }
                callSite = callSite2;
            }
            return l62.G(l10, (String)((Object)callSite));
        }
        return null;
    }

    @Override
    public boolean e(long l10, gu gu2, Object object, Object object2) {
        long l11 = l10 ^ 0xB1C2A58BC7CL;
        return gu2.K(this, object, l11, object2);
    }

    public x8 F() {
        return this.m;
    }

    public static jf C(String string, long l10, Collection collection) {
        long l11 = (l10 = a ^ l10) ^ 0xFB2A3508CFFL;
        Iterator iterator = collection.iterator();
        CallSite callSite = m44.a("l", (long)6953826178124023396L, (long)l10);
        while (iterator.hasNext()) {
            Object object;
            block6: {
                block7: {
                    jf jf2;
                    block5: {
                        jf jf3 = (jf)iterator.next();
                        try {
                            try {
                                jf2 = jf3;
                                if (callSite != false) break block5;
                                object = jf2.g(l11).equals(string);
                                if (l10 <= 0L) break block6;
                                if (!object) break block7;
                            }
                            catch (n9 n92) {
                                throw m44.a("l", (Object)n92, (long)9056920640636300758L, (long)l10);
                            }
                            jf2 = jf3;
                        }
                        catch (n9 n93) {
                            throw m44.a("l", (Object)n93, (long)9056920640636300758L, (long)l10);
                        }
                    }
                    return jf2;
                }
                object = callSite;
            }
            if (!object) continue;
        }
        return null;
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x48C5;
        if (c[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/jf", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jf.c[n11] = n12;
        }
        return c[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = jf.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/jf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jf.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

