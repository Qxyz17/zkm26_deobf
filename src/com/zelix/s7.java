/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.kt;
import com.zelix.lk0;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.x6;
import com.zelix.xl;
import java.io.DataOutputStream;
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

public class s7
extends _4 {
    private final x6[] U;
    private final kt i;
    private xl a;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map f;

    void z(gu gu2, long l) {
        long l2 = l;
        long l3 = l2 ^ 0x6DE1DADD9981L;
        long l4 = l2 ^ 0x6DE1DADD9981L;
        m44.a("w", (Object)m44.a("v", (Object)((Object)this), (long)6051547249463901383L, (long)l), (long)l4, (Object)gu2, (Object)((Object)this), (Object)this.H(), (long)5994452879398371859L, (long)l);
        CallSite callSite = m44.a("v", (Object)((Object)this), (long)5932106781273274698L, (long)l);
        int n = ((CallSite)callSite).length;
        CallSite callSite2 = m44.a("h", (long)6170399952317654249L, (long)l);
        for (int i = 0; i < n; ++i) {
            CallSite callSite3 = callSite[i];
            m44.a("w", (Object)callSite3, (long)l3, (Object)gu2, (Object)((Object)this), (Object)this.H(), (long)6237079643253363842L, (long)l);
            if (callSite2 != false) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    s7(int var1_1, int var2_2, byte var3_3, _4 var4_4, h1 var5_5) {
        block32: {
            block30: {
                block31: {
                    block28: {
                        block29: {
                            v0 = var6_6 = ((long)var1_1 << 32 | (long)var2_2 << 40 >>> 32 | (long)var3_3 << 56 >>> 56) ^ s7.b;
                            var8_7 = v0 ^ 134070951728914L;
                            var10_8 = v0 ^ 134593314258040L;
                            var12_9 = v0 ^ 134070951728914L;
                            v1 = v0 ^ 107394142068662L;
                            var14_10 = (int)(v1 >>> 48);
                            var15_11 = (int)(v1 << 16 >>> 32);
                            var16_12 = (int)(v1 << 48 >>> 48);
                            var17_13 = v0 ^ 62382752905563L;
                            var19_14 = v0 ^ 114406829144806L;
                            var21_15 = v0 ^ 51783013269536L;
                            v2 = m44.a("k", (long)-6173635724757238091L, (long)var6_6);
                            super(var4_4);
                            var24_16 = var5_5.readUnsignedShort();
                            var23_17 = v2;
                            var25_18 = var4_4.m(var17_13, var24_16);
                            try {
                                try {
                                    v3 = var25_18;
                                    if (var23_17 != false) break block28;
                                    if (v3 != null) break block29;
                                }
                                catch (n9 v4) {
                                    throw m44.a("k", (Object)v4, (long)-5758867491450321477L, (long)var6_6);
                                }
                                throw new aw((String)m44.a("t", (Object)var4_4.G(var10_8), (long)var8_7, (long)-5742563320360779538L, (long)var6_6) + (String)s7.a("z", (int)23852, (long)(6425317406578577973L ^ var6_6)) + var24_16 + (String)s7.a("z", (int)22235, (long)(3659691661099440588L ^ var6_6)));
                            }
                            catch (n9 v5) {
                                throw m44.a("k", (Object)v5, (long)-5758867491450321477L, (long)var6_6);
                            }
                        }
                        v3 = var25_18;
                    }
                    try {
                        try {
                            v6 = v3 instanceof xl;
                            if (var23_17 != false) break block30;
                            if (v6 != 0) break block31;
                        }
                        catch (n9 v7) {
                            throw m44.a("k", (Object)v7, (long)-5758867491450321477L, (long)var6_6);
                        }
                        throw new aw((String)m44.a("t", (Object)var4_4.G(var10_8), (long)var8_7, (long)-5742563320360779538L, (long)var6_6) + (String)s7.a("z", (int)24473, (long)(4782131431747031172L ^ var6_6)) + var24_16 + (String)s7.a("z", (int)31236, (long)(4900488592872322330L ^ var6_6)) + var25_18.getClass().getName() + (String)s7.a("z", (int)24431, (long)(7103867629711265917L ^ var6_6)));
                    }
                    catch (n9 v8) {
                        throw m44.a("k", (Object)v8, (long)-5758867491450321477L, (long)var6_6);
                    }
                }
                m44.a("w", (Object)this, (xl)((xl)var25_18), (long)-5453745480380687508L, (long)var6_6);
                this.i = new kt((_4)this, var5_5);
                v6 = var5_5.readUnsignedShort();
            }
            var26_19 = v6;
            this.U = new x6[var26_19];
            var27_20 = 0;
            block22: while (var27_20 < var26_19) {
                v9 /* !! */  = var5_5.readUnsignedShort();
                do {
                    block35: {
                        block33: {
                            block34: {
                                var28_22 = v9 /* !! */ ;
                                v10 = var4_4.m(var17_13, var28_22);
                                if (var3_3 > 0) ** GOTO lbl64
                                var25_18 = v10;
                                try {
                                    try {
                                        try {
                                            if (var23_17 != false) break block32;
                                            v10 = var25_18;
lbl64:
                                            // 2 sources

                                            if (var2_2 <= 0 || var23_17 != false) break block33;
                                        }
                                        catch (n9 v11) {
                                            throw m44.a("k", (Object)v11, (long)-5758867491450321477L, (long)var6_6);
                                        }
                                        if (v10 != null) break block34;
                                    }
                                    catch (n9 v12) {
                                        throw m44.a("k", (Object)v12, (long)-5758867491450321477L, (long)var6_6);
                                    }
                                    throw new aw((String)m44.a("t", (Object)var4_4.G(var10_8), (long)var8_7, (long)-5742563320360779538L, (long)var6_6) + (String)s7.a("z", (int)10853, (long)(4338925748942005621L ^ var6_6)) + var28_22 + (String)s7.a("z", (int)18782, (long)(4887451028896384578L ^ var6_6)));
                                }
                                catch (n9 v13) {
                                    throw m44.a("k", (Object)v13, (long)-5758867491450321477L, (long)var6_6);
                                }
                            }
                            v10 = var25_18;
                        }
                        try {
                            v14 /* !! */  = v10 instanceof x6;
                            if (var3_3 > 0) break block35;
                            if (!v14 /* !! */ ) {
                                throw new aw((String)m44.a("t", (Object)var4_4.G(var10_8), (long)var8_7, (long)-5742563320360779538L, (long)var6_6) + (String)s7.a("z", (int)24855, (long)(790616626397064708L ^ var6_6)) + var28_22 + (String)s7.a("z", (int)16207, (long)(5013505649034096727L ^ var6_6)) + var25_18.getClass().getName() + (String)s7.a("z", (int)22650, (long)(2048096783843825505L ^ var6_6)));
                            }
                        }
                        catch (n9 v15) {
                            throw m44.a("k", (Object)v15, (long)-5758867491450321477L, (long)var6_6);
                        }
                        m44.a("u", (Object)this, (long)-5334479706773823775L, (long)var6_6)[var27_20] = (x6)var25_18;
                        ++var27_20;
                        v14 /* !! */  = var23_17;
                    }
                    if (!v14 /* !! */ ) continue block22;
                    v16 = new Object[2];
                    v16[1] = m44.a("u", (Object)this, (long)-5334479706773823775L, (long)var6_6);
                    v16[0] = var19_14;
                    v9 /* !! */  = (int)m44.a("k", (Object)v16, (long)-6119483556434853362L, (long)var6_6);
                } while (var3_3 > 0);
            }
            if (v9 /* !! */  == 0) {
                block38: {
                    var27_21 = new StringBuilder();
                    var27_21.append((String)s7.a("z", (int)23341, (long)(3314947740930610231L ^ var6_6)));
                    var27_21.append(this.f(var12_9));
                    var27_21.append((String)s7.a("z", (int)25849, (long)(1610021542622473192L ^ var6_6)));
                    var28_22 = 0;
                    while (var28_22 < ((CallSite)m44.a("u", (Object)this, (long)-5334479706773823775L, (long)var6_6)).length) {
                        block36: {
                            block37: {
                                block39: {
                                    try {
                                        try {
                                            try {
                                                var27_21.append((String)m44.a("t", (Object)m44.a("u", (Object)this, (long)-5334479706773823775L, (long)var6_6)[var28_22], (char)((char)var14_10), (int)var15_11, (short)((short)var16_12), (long)-6078319038418816276L, (long)var6_6));
                                                v17 = var23_17;
                                                while (true) {
                                                    if (var1_1 <= 0) break block36;
                                                    if (v17 != false) break block37;
                                                    v18 = var28_22;
                                                    v19 = ((CallSite)m44.a("u", (Object)this, (long)-5334479706773823775L, (long)var6_6)).length - 1;
                                                    if (var23_17 != false) break block38;
                                                    break;
                                                }
                                            }
                                            catch (n9 v20) {
                                                throw m44.a("k", (Object)v20, (long)-5758867491450321477L, (long)var6_6);
                                            }
                                            if (v18 >= v19) break block39;
                                        }
                                        catch (n9 v21) {
                                            throw m44.a("k", (Object)v21, (long)-5758867491450321477L, (long)var6_6);
                                        }
                                        var27_21.append((String)s7.a("z", (int)30422, (long)(4291583951284976073L ^ var6_6)));
                                    }
                                    catch (n9 v22) {
                                        throw m44.a("k", (Object)v22, (long)-5758867491450321477L, (long)var6_6);
                                    }
                                }
                                ++var28_22;
                            }
                            v17 = var23_17;
                        }
                        if (v17 == false) continue;
                    }
                    v18 = 0;
                    if (var3_3 >= 0) ** continue;
                    v19 = 1;
                }
                v23 = new String[v19];
                v23[0] = var27_21.toString();
                lk0.t((boolean)v18, (String[])v23, (long)var21_15);
            }
        }
    }

    void N(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        long l = (Long)objectArray[1];
        Map map = (Map)objectArray[2];
        long l2 = (l = b ^ l) ^ 0x6FC346D8E7F6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = dataOutputStream;
        objectArray2[0] = l2;
        m44.a("w", (Object)((Object)this), (Object)objectArray2, (long)6472592764207074825L, (long)l);
    }

    void U(Object[] objectArray) {
        long l = (Long)objectArray[0];
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[1];
        l = b ^ l;
        dataOutputStream.writeShort(m44.a("p", (Object)((Object)this), (long)8355618764658220233L, (long)l).E());
        CallSite callSite = m44.a("n", (long)7923994049682356496L, (long)l);
        dataOutputStream.writeShort(m44.a("p", (Object)((Object)this), (long)8515564653440950524L, (long)l).G());
        dataOutputStream.writeShort(((CallSite)m44.a("p", (Object)((Object)this), (long)8240856581759670596L, (long)l)).length);
        CallSite callSite2 = m44.a("p", (Object)((Object)this), (long)8240856581759670596L, (long)l);
        int n = ((CallSite)callSite2).length;
        CallSite callSite3 = callSite;
        for (int i = 0; i < n; ++i) {
            CallSite callSite4 = callSite2[i];
            dataOutputStream.writeShort(callSite4.E());
            if (callSite3 == false) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                s7.b = prr.a((long)4766623058261907957L, (long)7820897599916908926L, MethodHandles.lookup().lookupClass()).a(72058685692898L);
                s7.f = new HashMap<K, V>(13);
                var0 = s7.b ^ 45131211766625L;
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
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "\u00b4\u000f\u0007\u00ccea\u00ec\u00a2:\fx\u00a0|O\u00b9\u00fb<j^\u00ddj\u0018\u0096\u00da\u00d6\u00fe\u00e4\u00ddI\u00bfy\u00eb\u00cb\u0001T\u00e7\u0099[\u00ebQ3v\u009e*\u00a4%\u00f6\u0002\u00f5\u00b60\u0002~\u00eb\u00dc\u00f1J\u00b8r\u00ccSWG @\u008b \u00b1\u00af\u00a4\u00e1L\u00e5\u00f5\u0096\u00d9Y5\u00ec\u00a5U\u0086j6\f\u00a6@Y\u00e5\u00b4\u0087\u00c0\u00cc\u00f0\u00f8\u00d9\u00dd\u001d>R\u0084\u00d6\u00929\u0083`\u008b\u00b8^\u0096\u0098i\u00a57a\u00a4[\u00a8E\u00fe\u0017\u00c1 \u000e\u00f9\u000b\u0095\u0093\u00e6PhM\u0096M\u000e\u00199^I\u0015G\u00c4KC\u00c5\t\u00fd~\u00f3\u00ba.M\u00dd\u00c6\u0013\u0095\u00b0\u001b?g~\u009e\u00c1~\u0095\u00b7\u00eb'O\u00a8\u00854^x\u00c9\u0018\u008f\u009c2\u00d4\u009b\u0010\u0082\u00cb\u00d2\u00e4\u00f4,\u00ee\u00f9\u0085!\u00f0\u0097\u00ca`OQ\u00f1;\u0014[\u00e7MW\u00cal\u00f8\u0085\u0002\u0010\u00b1\u0083\u0013&\u00cf\u0098\u00c1h\u008f\u00a9\u00aaq\u008d\u00eb+p\u0010\u00a9\u00c0\u00aevV?l>\u0097g\u00f3\u0097\u0012\u00fd\u0087\u0004\u0010*\u00f0\u00b0z\u00ce\u0013RR\u008f@3Ld/\tn(~(\u00b1<o02\u00b7@\u00a3\u00bc\u00e9\u008e\u00af\u0011\u00e7\u008a\u00b0\u00e7\u0092\u00c9]mSMr\u00a9\u00fc\u00a0~<\u000b\u0093\u0081\u008c\u00e4\u00b0\u00d1\u007f\u008e@\u00c1\u0011Rc9jvF\u00ccIZ\f\u00bb\u0017\u00dd\u009f\u0005\u00d9O\u000e\u00a8\u00c0\u00fe|\b\u008d\u00fb\u00b3\u008d\u00f9\u00915$6\u001d\u00d9\u0018\u0016i\u00ba\u001c\u00f4\u00b9\u00c6\u00b5\u00de{_\u00c1d\u00b4\u0004\u00d9U\u00e9\u0004\u00b2\u0015\u009e\u00d6~\u00eay\u00f1(_,\u0093\u0015\u00af\u00f0\u0014s\u00ae\u00f7\u000f\u00ed\u00d0\u00b8\u00ce\u00ae\u0002<\u0012{\u00ba\u00bc~\u008b\u00df\u00d2(\u00d1^\u00cd\u00c7+\u0003\u0097\u00ce\u00ad\u0001\u00ca\u00d2EH\u00e2\u0085\u0086\u00e1\u00fb\u0002\u00ae\u00d0\u009e\u0007h\u00baD\u00a3\u00b6\u00a5\u00d0\u00dcB\u008e\u00a1\f\u0015&/\te\u0096m`\u0084t\u00b8\u0017\u00c3\u0092\u00d5\u001e\u0086\u001drv\u00f2\u008eY\u00c8\u001dT:Kn\u00a7\u00c9\u00a7\u00f1E\\\u00cf\u00a9\u00c7Nb\u0098\u0095\u0081[\r5\u00f8\u00bd8E@\u00a4^\u00f1h*\t\u00c7=P\r\u00ed\u00f9\u00b0\u00a7\u00b7\u00ce\u00bc<\u0012\u0097I7\u00ce6y\u00a1\f\u0003\u00b0\u00ea\u00867+\u00ad\u0088u\u00c2\u009e\u00d9\u009a\u0082\u00ab\u00a8\u00cbPd\u0015\u00f1\u00c0\u00f1?\u00df0\u00f1\u00c3\u008a,L\u00ff\u00c3L\u00cc\u00bd\u00c1";
                var8_6 = "\u00b4\u000f\u0007\u00ccea\u00ec\u00a2:\fx\u00a0|O\u00b9\u00fb<j^\u00ddj\u0018\u0096\u00da\u00d6\u00fe\u00e4\u00ddI\u00bfy\u00eb\u00cb\u0001T\u00e7\u0099[\u00ebQ3v\u009e*\u00a4%\u00f6\u0002\u00f5\u00b60\u0002~\u00eb\u00dc\u00f1J\u00b8r\u00ccSWG @\u008b \u00b1\u00af\u00a4\u00e1L\u00e5\u00f5\u0096\u00d9Y5\u00ec\u00a5U\u0086j6\f\u00a6@Y\u00e5\u00b4\u0087\u00c0\u00cc\u00f0\u00f8\u00d9\u00dd\u001d>R\u0084\u00d6\u00929\u0083`\u008b\u00b8^\u0096\u0098i\u00a57a\u00a4[\u00a8E\u00fe\u0017\u00c1 \u000e\u00f9\u000b\u0095\u0093\u00e6PhM\u0096M\u000e\u00199^I\u0015G\u00c4KC\u00c5\t\u00fd~\u00f3\u00ba.M\u00dd\u00c6\u0013\u0095\u00b0\u001b?g~\u009e\u00c1~\u0095\u00b7\u00eb'O\u00a8\u00854^x\u00c9\u0018\u008f\u009c2\u00d4\u009b\u0010\u0082\u00cb\u00d2\u00e4\u00f4,\u00ee\u00f9\u0085!\u00f0\u0097\u00ca`OQ\u00f1;\u0014[\u00e7MW\u00cal\u00f8\u0085\u0002\u0010\u00b1\u0083\u0013&\u00cf\u0098\u00c1h\u008f\u00a9\u00aaq\u008d\u00eb+p\u0010\u00a9\u00c0\u00aevV?l>\u0097g\u00f3\u0097\u0012\u00fd\u0087\u0004\u0010*\u00f0\u00b0z\u00ce\u0013RR\u008f@3Ld/\tn(~(\u00b1<o02\u00b7@\u00a3\u00bc\u00e9\u008e\u00af\u0011\u00e7\u008a\u00b0\u00e7\u0092\u00c9]mSMr\u00a9\u00fc\u00a0~<\u000b\u0093\u0081\u008c\u00e4\u00b0\u00d1\u007f\u008e@\u00c1\u0011Rc9jvF\u00ccIZ\f\u00bb\u0017\u00dd\u009f\u0005\u00d9O\u000e\u00a8\u00c0\u00fe|\b\u008d\u00fb\u00b3\u008d\u00f9\u00915$6\u001d\u00d9\u0018\u0016i\u00ba\u001c\u00f4\u00b9\u00c6\u00b5\u00de{_\u00c1d\u00b4\u0004\u00d9U\u00e9\u0004\u00b2\u0015\u009e\u00d6~\u00eay\u00f1(_,\u0093\u0015\u00af\u00f0\u0014s\u00ae\u00f7\u000f\u00ed\u00d0\u00b8\u00ce\u00ae\u0002<\u0012{\u00ba\u00bc~\u008b\u00df\u00d2(\u00d1^\u00cd\u00c7+\u0003\u0097\u00ce\u00ad\u0001\u00ca\u00d2EH\u00e2\u0085\u0086\u00e1\u00fb\u0002\u00ae\u00d0\u009e\u0007h\u00baD\u00a3\u00b6\u00a5\u00d0\u00dcB\u008e\u00a1\f\u0015&/\te\u0096m`\u0084t\u00b8\u0017\u00c3\u0092\u00d5\u001e\u0086\u001drv\u00f2\u008eY\u00c8\u001dT:Kn\u00a7\u00c9\u00a7\u00f1E\\\u00cf\u00a9\u00c7Nb\u0098\u0095\u0081[\r5\u00f8\u00bd8E@\u00a4^\u00f1h*\t\u00c7=P\r\u00ed\u00f9\u00b0\u00a7\u00b7\u00ce\u00bc<\u0012\u0097I7\u00ce6y\u00a1\f\u0003\u00b0\u00ea\u00867+\u00ad\u0088u\u00c2\u009e\u00d9\u009a\u0082\u00ab\u00a8\u00cbPd\u0015\u00f1\u00c0\u00f1?\u00df0\u00f1\u00c3\u008a,L\u00ff\u00c3L\u00cc\u00bd\u00c1".length();
                var5_7 = 64;
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
                    var9_3[var7_4++] = s7.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0090\u0015\u00c7/\u000fWC\u00b3C\u00ae\u00bc\t\u0012\u008c\u008f=\u0006\u00b8A\u009b\u00ad\u00f5\u00eb\u00eaU\u00c9\u00de\f\b$\u00d1e\u001b\u0004\u00880L\u00aa\u00b8,\u00b2\u0098\u009e\u0000\u008f\u00a9Z\u001b\u00e6L\u00d5yf\u00ce\u00d2\u00e2\u008c\u00de2\u00e8t\u00b7R\u00fe^@LF01z\u00130\u008eZ\u00c4\u00c6\u008b\u00d1^\u0019?m\u00ec \u0098,Z\u00b1\u00d1\u00ed&!\u008d\u00a5\u00ed\u0000-j\u00bak\u00d9\u00f2\u001a3>F\u00fb\u00fe\u00bdQ.\u0094\u0013V\u0013\u00a0\u0086\u0018\u0012\u00c6";
                    var8_6 = "\u0090\u0015\u00c7/\u000fWC\u00b3C\u00ae\u00bc\t\u0012\u008c\u008f=\u0006\u00b8A\u009b\u00ad\u00f5\u00eb\u00eaU\u00c9\u00de\f\b$\u00d1e\u001b\u0004\u00880L\u00aa\u00b8,\u00b2\u0098\u009e\u0000\u008f\u00a9Z\u001b\u00e6L\u00d5yf\u00ce\u00d2\u00e2\u008c\u00de2\u00e8t\u00b7R\u00fe^@LF01z\u00130\u008eZ\u00c4\u00c6\u008b\u00d1^\u0019?m\u00ec \u0098,Z\u00b1\u00d1\u00ed&!\u008d\u00a5\u00ed\u0000-j\u00bak\u00d9\u00f2\u001a3>F\u00fb\u00fe\u00bdQ.\u0094\u0013V\u0013\u00a0\u0086\u0018\u0012\u00c6".length();
                    var5_7 = 72;
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
                    var9_3[var7_4++] = s7.a(var10_9).intern();
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
        s7.c = var9_3;
        s7.d = new String[13];
    }

    private static n9 a(n9 n92) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6E0F;
        if (d[n2] == null) {
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
                throw new RuntimeException("com/zelix/s7", exception);
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
            s7.d[n2] = s7.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = s7.a(n, l);
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
            throw new RuntimeException("com/zelix/s7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(s7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
