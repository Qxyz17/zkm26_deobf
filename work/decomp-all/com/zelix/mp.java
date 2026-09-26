/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._v;
import com.zelix.cf;
import com.zelix.e_;
import com.zelix.lbc;
import com.zelix.lki;
import com.zelix.m44;
import com.zelix.mq;
import com.zelix.prr;
import com.zelix.u2;
import com.zelix.u3;
import java.awt.Frame;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mp
implements Runnable {
    final e_ X;
    final e_ R;
    final mq Q;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    mp(mq mq2, e_ e_2, e_ e_3) {
        this.Q = mq2;
        this.X = e_2;
        this.R = e_3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    @Override
    public void run() {
        block27: {
            long l;
            long l2 = l = a ^ 0x8252FBF6287L;
            long l3 = l2 ^ 0x5E322096AEC4L;
            long l4 = l2 ^ 0x2CB19E44D148L;
            long l5 = l2 ^ 0x4F3FDDDDED88L;
            long l6 = l2 ^ 0x63B238A9CA14L;
            long l7 = l2 ^ 0x1DE5F5D19799L;
            long l8 = l2 ^ 0x4E9E6EEB058EL;
            long l9 = l2 ^ 0x775B667B49E8L;
            long l10 = l2 ^ 0x7390246BF83L;
            long l11 = l2 ^ 0x57662E158766L;
            long l12 = l2 ^ 0x35C7F458DFA5L;
            long l13 = l2 ^ 0x738DF07C1C0BL;
            long l14 = l2 ^ 0x333F336F0A45L;
            CallSite callSite = m44.a("i", (long)4205328474779045036L, (long)l);
            try {
                Vector<lki> vector;
                CallSite callSite2;
                block29: {
                    int n;
                    CallSite callSite3;
                    block31: {
                        Vector<lki> vector2;
                        block30: {
                            block32: {
                                CallSite callSite4;
                                block28: {
                                    block26: {
                                        CallSite callSite5;
                                        CallSite callSite6;
                                        block25: {
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l11;
                                            m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (long)2411487101572168148L, (long)l), (Object)objectArray, (long)4577962454533406379L, (long)l);
                                            Object[] objectArray2 = new Object[2];
                                            objectArray2[1] = l14;
                                            objectArray2[0] = m44.a("w", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (long)2821717064333569535L, (long)l);
                                            callSite2 = m44.a("v", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (Object)objectArray2, (long)2685140376148487940L, (long)l);
                                            vector = null;
                                            Object[] objectArray3 = new Object[2];
                                            objectArray3[1] = mp.a("h", (int)26178, (long)(0x289EA7311CFE9FFAL ^ l));
                                            objectArray3[0] = l12;
                                            callSite6 = m44.a("v", (Object)callSite2, (Object)objectArray3, (long)2693570336489762383L, (long)l);
                                            Object[] objectArray4 = new Object[2];
                                            objectArray4[1] = l8;
                                            objectArray4[0] = mp.a("h", (int)15404, (long)(0x1396A430634E4590L ^ l));
                                            callSite3 = m44.a("v", (Object)callSite2, (Object)objectArray4, (long)4115561222636087904L, (long)l);
                                            try {
                                                callSite5 = callSite6;
                                                if (callSite != null) break block25;
                                                if (callSite5 == null) break block26;
                                            }
                                            catch (u3 u32) {
                                                throw m44.a("i", (Object)((Object)u32), (long)4600769017208726765L, (long)l);
                                            }
                                            callSite5 = callSite6;
                                        }
                                        if (callSite5.size() > 0) {
                                            vector = new Vector<lki>(Math.max(5, callSite6.size()));
                                            for (n = 0; n < callSite6.size(); ++n) {
                                                try {
                                                    vector.addElement(new lki((_v)callSite6.get(n), true));
                                                    if (callSite == null) {
                                                        if (callSite == null) continue;
                                                        break;
                                                    }
                                                    break block27;
                                                }
                                                catch (u3 u33) {
                                                    throw m44.a("i", (Object)((Object)u33), (long)4600769017208726765L, (long)l);
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        callSite4 = callSite3;
                                        if (callSite != null) break block28;
                                        if (callSite4 == null) break block29;
                                    }
                                    catch (u3 u34) {
                                        throw m44.a("i", (Object)((Object)u34), (long)4600769017208726765L, (long)l);
                                    }
                                    callSite4 = callSite3;
                                }
                                if (callSite4.size() <= 0) break block29;
                                vector2 = vector;
                                if (callSite != null) break block30;
                                break block32;
                                catch (u3 u35) {
                                    throw m44.a("i", (Object)((Object)u35), (long)4600769017208726765L, (long)l);
                                }
                            }
                            try {
                                block33: {
                                    if (vector2 != null) break block31;
                                    break block33;
                                    catch (u3 u36) {
                                        throw m44.a("i", (Object)((Object)u36), (long)4600769017208726765L, (long)l);
                                    }
                                }
                                vector2 = new Vector<lki>(callSite3.size());
                            }
                            catch (u3 u37) {
                                throw m44.a("i", (Object)((Object)u37), (long)4600769017208726765L, (long)l);
                            }
                        }
                        vector = vector2;
                    }
                    for (n = 0; n < callSite3.size(); ++n) {
                        try {
                            vector.addElement(new lki((_v)callSite3.get(n), false));
                            if (callSite == null) {
                                if (callSite == null) continue;
                                break;
                            }
                            break block27;
                        }
                        catch (u3 u38) {
                            throw m44.a("i", (Object)((Object)u38), (long)4600769017208726765L, (long)l);
                        }
                    }
                }
                Object[] objectArray = new Object[3];
                objectArray[2] = vector;
                objectArray[1] = l6;
                objectArray[0] = m44.a("w", (Object)this, (long)4081642168700802577L, (long)l);
                m44.a("i", (Object)objectArray, (long)2384502333901044791L, (long)l);
                Object[] objectArray5 = new Object[1];
                objectArray5[0] = l7;
                Object[] objectArray6 = new Object[3];
                objectArray6[2] = m44.a("v", (Object)callSite2, (Object)objectArray5, (long)2384044763397457278L, (long)l);
                objectArray6[1] = l4;
                objectArray6[0] = m44.a("w", (Object)this, (long)4081642168700802577L, (long)l);
                m44.a("i", (Object)objectArray6, (long)4230248021338572725L, (long)l);
                Object[] objectArray7 = new Object[2];
                objectArray7[1] = m44.a("w", (Object)this, (long)2880085155844578542L, (long)l);
                objectArray7[0] = l13;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)4162816179264638963L, (long)l), (Object)objectArray7, (long)4478363477068054294L, (long)l);
            }
            catch (u3 u39) {
                Object[] objectArray = new Object[1];
                objectArray[0] = l9;
                new lbc((Frame)((Object)m44.a("w", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (long)2411487101572168148L, (long)l)), (String)((Object)mp.a("h", (int)6450, (long)(0x3658DAECBB956088L ^ l))), l5, (String)((Object)mp.a("h", (int)9034, (long)(0x2980A44F23E15AF4L ^ l))) + cf.a((String)((Object)m44.a("v", (Object)((Object)u39), (Object)objectArray, (long)4209684545742716208L, (long)l))) + (String)((Object)mp.a("h", (int)9993, (long)(0x5D0E0F1300345EB4L ^ l))));
                Object[] objectArray8 = new Object[1];
                objectArray8[0] = l3;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (Object)objectArray8, (long)2566025897413417039L, (long)l);
                Object[] objectArray9 = new Object[1];
                objectArray9[0] = l10;
                m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (long)2411487101572168148L, (long)l), (Object)objectArray9, (long)4451223354613938829L, (long)l);
            }
            catch (u2 u22) {
                new lbc((Frame)((Object)m44.a("w", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (long)2411487101572168148L, (long)l)), (String)((Object)mp.a("h", (int)986, (long)(0x251D3975ADDE7A63L ^ l))), l5, (String)((Object)mp.a("h", (int)2991, (long)(0x5D62782127F97210L ^ l))) + (String)((Object)m44.a("v", (Object)((Object)u22), (long)4519360111595978832L, (long)l)));
                Object[] objectArray = new Object[1];
                objectArray[0] = l3;
                m44.a("v", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (Object)objectArray, (long)2566025897413417039L, (long)l);
                {
                    catch (Throwable throwable) {
                        Object[] objectArray10 = new Object[1];
                        objectArray10[0] = l10;
                        m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (long)2411487101572168148L, (long)l), (Object)objectArray10, (long)4451223354613938829L, (long)l);
                        throw throwable;
                    }
                }
                Object[] objectArray11 = new Object[1];
                objectArray11[0] = l10;
                m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (long)2411487101572168148L, (long)l), (Object)objectArray11, (long)4451223354613938829L, (long)l);
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l10;
            m44.a("v", (Object)m44.a("w", (Object)m44.a("w", (Object)this, (long)4081642168700802577L, (long)l), (long)2411487101572168148L, (long)l), (Object)objectArray, (long)4451223354613938829L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                mp.a = prr.a((long)3642354355871612251L, (long)-7166174525241123532L, MethodHandles.lookup().lookupClass()).a(259450812054092L);
                mp.d = new HashMap<K, V>(13);
                var0 = mp.a ^ 80947830126121L;
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\u000f\u000e\u00deA\u0003\u00a4\u00ddJ\u0018M\u0088J:\u00e2\u0090d\u001fy\u00bdc\u0014\u008c\u008a\u0097\u000e\u0091\u00a1\u00f5k\u008f3\u009a@\u00d4\u00aa\u00e3\u00e7+v\u00dc \u0099\u00aeX\u00f72\u0094:M\u00a7\u00ad\u0006~\u00e4\u0098\u009c\u00ae@\u000b\u00a1\u009d\u00aa(2!p\u00e5S\u0005H\u009c\u0090,h\u0012\u009bQ\u0010\b\u00d2$\u00bb'\u00b3\u00ac\u00c9\u00beV; \u00894o\u00a1\u00e5\u00d8\u0013\u00a3\u00de\u001fOD~\u00a5S\u008b\u00ba\"\u00bc\u000bQ\u00c76\u00db\u00fe[.\u00ae[\u00ec\u009d\u00d9\u00c1\u00c4\u00b2c\u00acS\u0092\u00a9\u00aa\u00c5D\u008d\u00cc?\u008d\u00e8\u00e8\u0015\u0015\u00ff\u0080\u00f5h\u00fd\u00c0\u0085\u00c4?\u0010\u0010\u0086K{\u0084\u009c\u0010ut\u009f1\u00a5\u0006G\u001aG\u0095=w\u0018\u0091\u008d\u00a0\u00ce\u00dd\u00a2\u00e3Xz]\u0080\u0088\u00d2v\u007f\u0094*\u00a36\u00db\u00849\u009e\u009dDz'\u0012 \u0093\u001f\u0085\u0088%Ue\u00a3\u00a1\u00e5\u0089\u00d6B\u009eO9\u001a\u0082\u00b5\u00b5\u00b3x\u0000\u00a6\u001b/w|*9\u0019o:\u00d0'\u0006\u001f\u00be\u0086\b\u00df\u0014\u0096\u0099\u00b2\u00d3\u0007\u00ccxB\u008flS\u00b5k\u00c6\u00db\u00b6'\u00c9\u00d1\u00b8\u00f7\u00fd\u00f7\u00ce\u00078\u00a2K\u00fe\u0092\u00acP\u00e9'\u00c4\rI\u00eb\u00d5\u00df\u00b3\u00fe\u00c7\u009fv\u00bb\u008fb\u0003{\u00da6\u0002_\u009ayJ\u00b9\u00ed\u00f7v\u00d5\u009a}\u00fe\u00efs&\u00d1\u009e\u00e7v\u0080\u00f7\u0001\u00a8B\u00e4\u000f\u00c5`)";
                var8_6 = "\u000f\u000e\u00deA\u0003\u00a4\u00ddJ\u0018M\u0088J:\u00e2\u0090d\u001fy\u00bdc\u0014\u008c\u008a\u0097\u000e\u0091\u00a1\u00f5k\u008f3\u009a@\u00d4\u00aa\u00e3\u00e7+v\u00dc \u0099\u00aeX\u00f72\u0094:M\u00a7\u00ad\u0006~\u00e4\u0098\u009c\u00ae@\u000b\u00a1\u009d\u00aa(2!p\u00e5S\u0005H\u009c\u0090,h\u0012\u009bQ\u0010\b\u00d2$\u00bb'\u00b3\u00ac\u00c9\u00beV; \u00894o\u00a1\u00e5\u00d8\u0013\u00a3\u00de\u001fOD~\u00a5S\u008b\u00ba\"\u00bc\u000bQ\u00c76\u00db\u00fe[.\u00ae[\u00ec\u009d\u00d9\u00c1\u00c4\u00b2c\u00acS\u0092\u00a9\u00aa\u00c5D\u008d\u00cc?\u008d\u00e8\u00e8\u0015\u0015\u00ff\u0080\u00f5h\u00fd\u00c0\u0085\u00c4?\u0010\u0010\u0086K{\u0084\u009c\u0010ut\u009f1\u00a5\u0006G\u001aG\u0095=w\u0018\u0091\u008d\u00a0\u00ce\u00dd\u00a2\u00e3Xz]\u0080\u0088\u00d2v\u007f\u0094*\u00a36\u00db\u00849\u009e\u009dDz'\u0012 \u0093\u001f\u0085\u0088%Ue\u00a3\u00a1\u00e5\u0089\u00d6B\u009eO9\u001a\u0082\u00b5\u00b5\u00b3x\u0000\u00a6\u001b/w|*9\u0019o:\u00d0'\u0006\u001f\u00be\u0086\b\u00df\u0014\u0096\u0099\u00b2\u00d3\u0007\u00ccxB\u008flS\u00b5k\u00c6\u00db\u00b6'\u00c9\u00d1\u00b8\u00f7\u00fd\u00f7\u00ce\u00078\u00a2K\u00fe\u0092\u00acP\u00e9'\u00c4\rI\u00eb\u00d5\u00df\u00b3\u00fe\u00c7\u009fv\u00bb\u008fb\u0003{\u00da6\u0002_\u009ayJ\u00b9\u00ed\u00f7v\u00d5\u009a}\u00fe\u00efs&\u00d1\u009e\u00e7v\u0080\u00f7\u0001\u00a8B\u00e4\u000f\u00c5`)".length();
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
                    var9_3[var7_4++] = mp.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0006\t\b\u009e:\u0098\u00ed\u008dy\u00dd\u0081\u0083?\u0097\u00d0\u009d\u00d2?\u00a7\u0099\u007fI\u00e4\u00a3_|R\u00a6h;\u00d5\u0012 0I\u00a9UEl\u00ff\u008c\u00eb\u008c\u00e7\u009a\u00d3y\u0005U\u0085e!\u00d4\u008c\u00d1\u00d0\u00f6`7\u00ce\rU7\u0018\u00fb";
                    var8_6 = "\u0006\t\b\u009e:\u0098\u00ed\u008dy\u00dd\u0081\u0083?\u0097\u00d0\u009d\u00d2?\u00a7\u0099\u007fI\u00e4\u00a3_|R\u00a6h;\u00d5\u0012 0I\u00a9UEl\u00ff\u008c\u00eb\u008c\u00e7\u009a\u00d3y\u0005U\u0085e!\u00d4\u008c\u00d1\u00d0\u00f6`7\u00ce\rU7\u0018\u00fb".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = mp.a(var10_9).intern();
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
        mp.b = var9_3;
        mp.c = new String[7];
    }

    private static u3 a(u3 u32) {
        return u32;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4A6A;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/mp", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            mp.c[n2] = mp.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mp.a(n, l);
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
            throw new RuntimeException("com/zelix/mp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
