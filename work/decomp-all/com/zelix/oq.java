/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.cf;
import com.zelix.e_;
import com.zelix.ff;
import com.zelix.lbc;
import com.zelix.lm2;
import com.zelix.lqu;
import com.zelix.m44;
import com.zelix.mh;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.sp;
import com.zelix.tr;
import com.zelix.u2;
import com.zelix.u3;
import com.zelix.wa;
import com.zelix.wc;
import java.awt.Frame;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class oq
implements ff {
    final wc j;
    sp T;
    wa W;
    lqu c;
    mh s;
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    abstract void A(Object[] var1);

    abstract String L(Object[] var1);

    void C(Object[] objectArray) {
        block5: {
            long l;
            long l2;
            e_ e_2;
            long l3;
            block4: {
                Integer n = (Integer)objectArray[0];
                l3 = (Long)objectArray[1];
                e_2 = (e_)objectArray[2];
                long l4 = l3 = a ^ l3;
                long l5 = l4 ^ 0x42767915292EL;
                l2 = l4 ^ 0x1DF211916CB7L;
                l = l4 ^ 0x7D9275974D16L;
                long l6 = l4 ^ 0x2A92E1869626L;
                int n2 = n;
                CallSite callSite = m44.a("i", (long)4844835772236707276L, (long)l3);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (n2 != 1) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)((Object)n92), (long)5013157237289515689L, (long)l3);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l5;
                    m44.a("u", (Object)this, (sp)new sp((String)((Object)m44.a("m", (long)4903476772426912305L, (long)l3)), (String)((Object)m44.a("v", (Object)this, (Object)objectArray2, (long)5092995403960779937L, (long)l3))), (long)6516379156450517934L, (long)l3);
                    Object[] objectArray3 = new Object[3];
                    objectArray3[2] = oq.a("l", (int)17547, (long)(0x6E5AC5FCBF0D9CA6L ^ l3));
                    objectArray3[1] = m44.a("m", (long)4903476772426912305L, (long)l3);
                    objectArray3[0] = l6;
                    m44.a("v", (Object)m44.a("w", (Object)this, (long)6432901381150140620L, (long)l3), (Object)objectArray3, (long)6575041361815217412L, (long)l3);
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)((Object)n93), (long)5013157237289515689L, (long)l3);
                }
            }
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l2;
            Object[] objectArray5 = new Object[5];
            objectArray5[4] = e_2;
            objectArray5[3] = m44.a("w", (Object)this, (long)6516379156450517934L, (long)l3);
            objectArray5[2] = m44.a("w", (Object)this, (long)4663576342307166871L, (long)l3);
            objectArray5[1] = l;
            objectArray5[0] = (String)((Object)oq.a("l", (int)7710, (long)(0x6AFF212A10BFC639L ^ l3))) + (String)((Object)m44.a("v", (Object)this, (Object)objectArray4, (long)6693861437389021863L, (long)l3)) + (String)((Object)oq.a("l", (int)5398, (long)(0x230E539C96254D32L ^ l3)));
            m44.a("v", (Object)this, (Object)objectArray5, (long)6795598880740933070L, (long)l3);
        }
    }

    abstract void v(Object[] var1);

    abstract String m(Object[] var1);

    public final void K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = a ^ l) ^ 0x7BF19C294437L;
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-5530405002684552849L, (long)l), (boolean)true, (long)-5424795226137413254L, (long)l);
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-5530405002684552849L, (long)l), (long)-6274082374985334182L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = false;
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-5530405002684552849L, (long)l), (Object)objectArray2, (long)-6080203568311472692L, (long)l);
    }

    final void h(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x671D8EB74007L;
        long l4 = l2 ^ 0x353C1B2355D1L;
        long l5 = l2 ^ 0x5F793511E467L;
        long l6 = l2 ^ 0x3650F2B7B858L;
        long l7 = l2 ^ 0x6D2B18C5D1C8L;
        lm2 lm22 = new lm2(this);
        CallSite callSite = null;
        try {
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            callSite = m44.a("q", (Object)m44.a("p", (Object)this, (long)-7757606096327111048L, (long)l), (Object)objectArray2, (long)-8328802506303662434L, (long)l);
        }
        catch (u3 u32) {
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l5;
            new lbc((Frame)((Object)m44.a("p", (Object)this, (long)-7757606096327111048L, (long)l)), (String)((Object)oq.a("l", (int)9325, (long)(0xF59DDF9CA8CA8ACL ^ l))), l3, (String)((Object)oq.a("l", (int)20166, (long)(0x16AF78C93FDEC201L ^ l))) + cf.a((String)((Object)m44.a("q", (Object)((Object)u32), (Object)objectArray3, (long)-7501618294460739393L, (long)l))) + (String)((Object)oq.a("l", (int)6204, (long)(0x39CF4591DBBB14FAL ^ l))));
        }
        catch (u2 u22) {
            new lbc((Frame)((Object)m44.a("p", (Object)this, (long)-7757606096327111048L, (long)l)), (String)((Object)oq.a("l", (int)17958, (long)(0x618A18D5EFD74AE5L ^ l))), l3, (String)((Object)oq.a("l", (int)6423, (long)(0x34452FBBC33F15D7L ^ l))) + (String)((Object)m44.a("q", (Object)((Object)u22), (long)-7838279641254777377L, (long)l)) + "'");
        }
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l6;
        new tr((String)((Object)oq.a("l", (int)19468, (long)(0x11EB7201546140C5L ^ l))) + (String)((Object)m44.a("q", (Object)this, (Object)objectArray4, (long)-8643968853520091576L, (long)l)) + (String)((Object)oq.a("l", (int)7880, (long)(0x19AA532C3F34920CL ^ l))), (wa)m44.a("p", (Object)this, (long)-7757606096327111048L, (long)l), (wc)m44.a("p", (Object)this, (long)-8238937375851135965L, (long)l), (mh)m44.a("p", (Object)this, (long)-8388631081025273597L, (long)l), l7, (List)((Object)callSite), (lqu)m44.a("p", (Object)this, (long)-8437069974083462763L, (long)l), (e_)lm22);
    }

    public oq(wa wa2, mh mh2, long l, lqu lqu2) {
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x8534468E9E9L;
        long l4 = l2 ^ 0x3FDDF1CADA9FL;
        m44.a("s", (Object)this, (wa)wa2, (long)2206339755269948593L, (long)l);
        m44.a("s", (Object)this, (mh)mh2, (long)98116501458160586L, (long)l);
        m44.a("s", (Object)this, (lqu)lqu2, (long)9162803068834652L, (long)l);
        m44.a("p", (Object)wa2, (boolean)false, (long)1831050631471273124L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = true;
        m44.a("p", (Object)wa2, (Object)objectArray, (long)450558645726003218L, (long)l);
        this.j = m44.a("o", (Object)m44.a("k", (long)1885461839894072343L, (long)l), (Object)oq.a("l", (int)13172, (long)(0x533AB2700C8BB578L ^ l)), (long)1848118696627080643L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        m44.a("p", (Object)this, (Object)objectArray2, (long)1996028855629455080L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                oq.a = prr.a((long)2917271474100014271L, (long)-6596247275331476823L, MethodHandles.lookup().lookupClass()).a(256130324678551L);
                oq.f = new HashMap<K, V>(13);
                var0 = oq.a ^ 22480767492560L;
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
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "\u007f8\u00df\u00d7\u00ab\u0007{J\u00d5\u00bfVHX\u00baD\u001a\u001f\u0017\n\u00d5\u00a8\u0097\u00d7\u00b1`\u0080\u00dbo\u0017\u00de\u00e2\u00e9(\u00b3\u00d9l1\u00b5\u009c\u00cf\u00c9\u00d1\u00dc\u008dO\u00ad\u00b0\u001cj5\u0012\u00da\u00cb7\u00838+\u0016\u0005\u00fa_1\u00ea\u00ac\u00c3<|~\u0002\u001a\r\u0000\u0091tQ\u00ff\u00e0\u001e\u00c3\u009c-<\u0091l\u000ez\u00fe\u00ce\u0089\r-\u0088)\u00c4\u000bX\u00d1\u008d\u0010\u00b2%\u0000\u009bX\":\u008a\u0096Q\u00b4P\u00d2\u00dfX?\u0017p\rhH\u00c0\u0018\u00a1\u0098y`\u00f6\r\u00f4\u00dd\u00e3C\u001e\u00ad/\u00bf\u0019\u00d3j\u00d3\u00e3|<\u00c3\u00fd\u00ad\u0018\u00b5\u009c\u00ca\u00f8\u0088\u00f4\"\u00febC\u00e9\u00f3g\u00f0uMQ`HpC\u0085\u00cc\" \u00fer\u0089\u0093\u0083/c`^\f\u001c\u00af\u000b\u0088\u00b4\u00d1\u00e4\u0095\u00e2\u008c\u0005\u00a6\u00f0/!\u00f7a\u0006\u00ba\u00868U(\t\u00f4\u0096\u00d0\u008a\u0096\u00c5\u0085q(Y\u0017\u001e\u0002h`\f\u00c0\u00c4\u00d9\u0082|\u001b\u00bd\u00c6[\u00d8\u00ae\u00f3\u00e0\u00e1\u001d\u00a6\u00de\u00b5Z\u0091\u00eb\u0011\bX\u00875\u00c1\nx\u00ea\u00dd\u00b3\u00aa\n\u00a1;\u00c0\u00b2\u0004Xe(>\u00e5iV\u00a0p\u008c\u00f1\u0005t\nU\u00ffT\u00c1\n~o\u0088\u00bc1G\u00dcya=\u00cd\u00de?(\u0004\u00ac\u008d=\u00014\u009bh\u0085\u0001\u00a1l\u0097<\u0001z\u00c1\u000f\u0013'\u00b4a\u0002\u00dcw\u001aE\u009e\u00d6j\u00bd\u001c\u00aa@\u00f67\u00cb{\u0001\u00ff \u00f4\u00b7\u0085\u00ac\u0006i\u00fcU$\u00cd\u000f\u0094\u0017\u00ca?uH\u009e\u00b4\u008e.0]\u00d5\u0082\u00d3~\u00ff\u00cc.\u0004\u00e3(]\u00ec*\u00ad\r\u00ec\u00b6g\u00ecA\u0089\u00dc}\nAIDp\u00a2\u008d\u00aeo@\u00d6\u00adUA\u0091VO]-\nS\u00a8\u0017m\u00fc\u00f3\u00ac";
                var8_6 = "\u007f8\u00df\u00d7\u00ab\u0007{J\u00d5\u00bfVHX\u00baD\u001a\u001f\u0017\n\u00d5\u00a8\u0097\u00d7\u00b1`\u0080\u00dbo\u0017\u00de\u00e2\u00e9(\u00b3\u00d9l1\u00b5\u009c\u00cf\u00c9\u00d1\u00dc\u008dO\u00ad\u00b0\u001cj5\u0012\u00da\u00cb7\u00838+\u0016\u0005\u00fa_1\u00ea\u00ac\u00c3<|~\u0002\u001a\r\u0000\u0091tQ\u00ff\u00e0\u001e\u00c3\u009c-<\u0091l\u000ez\u00fe\u00ce\u0089\r-\u0088)\u00c4\u000bX\u00d1\u008d\u0010\u00b2%\u0000\u009bX\":\u008a\u0096Q\u00b4P\u00d2\u00dfX?\u0017p\rhH\u00c0\u0018\u00a1\u0098y`\u00f6\r\u00f4\u00dd\u00e3C\u001e\u00ad/\u00bf\u0019\u00d3j\u00d3\u00e3|<\u00c3\u00fd\u00ad\u0018\u00b5\u009c\u00ca\u00f8\u0088\u00f4\"\u00febC\u00e9\u00f3g\u00f0uMQ`HpC\u0085\u00cc\" \u00fer\u0089\u0093\u0083/c`^\f\u001c\u00af\u000b\u0088\u00b4\u00d1\u00e4\u0095\u00e2\u008c\u0005\u00a6\u00f0/!\u00f7a\u0006\u00ba\u00868U(\t\u00f4\u0096\u00d0\u008a\u0096\u00c5\u0085q(Y\u0017\u001e\u0002h`\f\u00c0\u00c4\u00d9\u0082|\u001b\u00bd\u00c6[\u00d8\u00ae\u00f3\u00e0\u00e1\u001d\u00a6\u00de\u00b5Z\u0091\u00eb\u0011\bX\u00875\u00c1\nx\u00ea\u00dd\u00b3\u00aa\n\u00a1;\u00c0\u00b2\u0004Xe(>\u00e5iV\u00a0p\u008c\u00f1\u0005t\nU\u00ffT\u00c1\n~o\u0088\u00bc1G\u00dcya=\u00cd\u00de?(\u0004\u00ac\u008d=\u00014\u009bh\u0085\u0001\u00a1l\u0097<\u0001z\u00c1\u000f\u0013'\u00b4a\u0002\u00dcw\u001aE\u009e\u00d6j\u00bd\u001c\u00aa@\u00f67\u00cb{\u0001\u00ff \u00f4\u00b7\u0085\u00ac\u0006i\u00fcU$\u00cd\u000f\u0094\u0017\u00ca?uH\u009e\u00b4\u008e.0]\u00d5\u0082\u00d3~\u00ff\u00cc.\u0004\u00e3(]\u00ec*\u00ad\r\u00ec\u00b6g\u00ecA\u0089\u00dc}\nAIDp\u00a2\u008d\u00aeo@\u00d6\u00adUA\u0091VO]-\nS\u00a8\u0017m\u00fc\u00f3\u00ac".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = oq.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00cc\u00d8\u00d6\u00f0\u0082\u00bb\u00df\u00b8\u0004V\u0094\u001c\u0017\u00f6J\u00f3S)RW\u00ce\u0011k\u0013Z\u00ea\u00ef\u00aa\u00e9F\u0095\u001b\u00ae\u00acK\u0081\u00eccrX\u0018\u00a0\u00c5|\u00cc\u00b40\u000f\u00a3%,z\u0005\u00a2\u0006\u00e1\u00e6^6\u0082|X;\u00f4\u00ef";
                    var8_6 = "\u00cc\u00d8\u00d6\u00f0\u0082\u00bb\u00df\u00b8\u0004V\u0094\u001c\u0017\u00f6J\u00f3S)RW\u00ce\u0011k\u0013Z\u00ea\u00ef\u00aa\u00e9F\u0095\u001b\u00ae\u00acK\u0081\u00eccrX\u0018\u00a0\u00c5|\u00cc\u00b40\u000f\u00a3%,z\u0005\u00a2\u0006\u00e1\u00e6^6\u0082|X;\u00f4\u00ef".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = oq.a(var10_9).intern();
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
        oq.d = var9_3;
        oq.e = new String[11];
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1298;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/oq", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            oq.e[n2] = oq.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = oq.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/oq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(oq.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
