/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.js;
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

public class b2
extends _4 {
    private final x6[] a;
    private xl s;
    private final kt I;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map f;

    void T(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        long l10 = (Long)objectArray[1];
        Map map = (Map)objectArray[2];
        long l11 = (l10 = b ^ l10) ^ 0x520E402CD327L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = dataOutputStream;
        m44.a("r", (Object)this, (Object)objectArray2, (long)-1404517345012073206L, (long)l10);
    }

    void R(Object[] objectArray) {
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[0];
        long l10 = (Long)objectArray[1];
        l10 = b ^ l10;
        dataOutputStream.writeShort(((js)((Object)m44.a("r", (Object)this, (long)-2388766106667363051L, (long)l10))).E());
        CallSite callSite = m44.a("l", (long)-2385282328238650878L, (long)l10);
        dataOutputStream.writeShort(((kt)((Object)m44.a("r", (Object)this, (long)-4485751504220513125L, (long)l10))).G());
        dataOutputStream.writeShort(((CallSite)m44.a("r", (Object)this, (long)-4222065644932559694L, (long)l10)).length);
        CallSite callSite2 = m44.a("r", (Object)this, (long)-4222065644932559694L, (long)l10);
        int n10 = ((CallSite)callSite2).length;
        CallSite callSite3 = callSite;
        for (int i10 = 0; i10 < n10; ++i10) {
            CallSite callSite4 = callSite2[i10];
            dataOutputStream.writeShort(((js)((Object)callSite4)).E());
            if (callSite3 == false) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    b2(_4 var1_1, h1 var2_2, long var3_3) {
        block32: {
            block30: {
                block31: {
                    block28: {
                        block29: {
                            v0 = var3_3 = b2.b ^ var3_3;
                            var5_4 = v0 ^ 22055645445323L;
                            var7_5 = v0 ^ 25879781955489L;
                            var9_6 = v0 ^ 22055645445323L;
                            v1 = v0 ^ 13521834931311L;
                            var11_7 = (int)(v1 >>> 48);
                            var12_8 = (int)(v1 << 16 >>> 32);
                            var13_9 = (int)(v1 << 48 >>> 48);
                            var14_10 = v0 ^ 93855576298114L;
                            var16_11 = v0 ^ 6517679165759L;
                            var18_12 = v0 ^ 73634085743609L;
                            super(var1_1);
                            var21_13 = var2_2.readUnsignedShort();
                            var22_14 = var1_1.m(var14_10, var21_13);
                            var20_15 = m44.a("j", (long)1861053966367615131L, (long)var3_3);
                            try {
                                try {
                                    v2 = var22_14;
                                    if (var20_15 == false) break block28;
                                    if (v2 != null) break block29;
                                }
                                catch (n9 v3) {
                                    throw m44.a("j", (Object)v3, (long)123962302493681760L, (long)var3_3);
                                }
                                throw new aw((String)m44.a("u", (Object)var1_1.G(var7_5), (long)var5_4, (long)1988124783676484407L, (long)var3_3) + (String)b2.a("t", (int)3147, (long)(8759278968222945932L ^ var3_3)) + var21_13 + (String)b2.a("t", (int)25279, (long)(2317176293518605436L ^ var3_3)));
                            }
                            catch (n9 v4) {
                                throw m44.a("j", (Object)v4, (long)123962302493681760L, (long)var3_3);
                            }
                        }
                        v2 = var22_14;
                    }
                    try {
                        try {
                            v5 = v2 instanceof xl;
                            if (var20_15 == false) break block30;
                            if (v5 != 0) break block31;
                        }
                        catch (n9 v6) {
                            throw m44.a("j", (Object)v6, (long)123962302493681760L, (long)var3_3);
                        }
                        throw new aw((String)m44.a("u", (Object)var1_1.G(var7_5), (long)var5_4, (long)1988124783676484407L, (long)var3_3) + (String)b2.a("t", (int)9823, (long)(7612946439664416915L ^ var3_3)) + var21_13 + (String)b2.a("t", (int)27437, (long)(5399542584760759782L ^ var3_3)) + var22_14.getClass().getName() + (String)b2.a("t", (int)6400, (long)(331932714171500495L ^ var3_3)));
                    }
                    catch (n9 v7) {
                        throw m44.a("j", (Object)v7, (long)123962302493681760L, (long)var3_3);
                    }
                }
                m44.a("v", (Object)this, (xl)((xl)var22_14), (long)123595387175733883L, (long)var3_3);
                this.I = new kt((_4)this, var2_2);
                v5 = var2_2.readUnsignedShort();
            }
            var23_16 = v5;
            this.a = new x6[var23_16];
            var24_17 = 0;
            block22: while (var24_17 < var23_16) {
                v8 /* !! */  = var2_2.readUnsignedShort();
                do {
                    block35: {
                        block33: {
                            block34: {
                                var25_19 = v8 /* !! */ ;
                                v9 = var1_1.m(var14_10, var25_19);
                                if (var3_3 < 0L) ** GOTO lbl63
                                var22_14 = v9;
                                try {
                                    try {
                                        try {
                                            if (var20_15 == false) break block32;
                                            v9 = var22_14;
lbl63:
                                            // 2 sources

                                            if (var3_3 <= 0L || var20_15 == false) break block33;
                                        }
                                        catch (n9 v10) {
                                            throw m44.a("j", (Object)v10, (long)123962302493681760L, (long)var3_3);
                                        }
                                        if (v9 != null) break block34;
                                    }
                                    catch (n9 v11) {
                                        throw m44.a("j", (Object)v11, (long)123962302493681760L, (long)var3_3);
                                    }
                                    throw new aw((String)m44.a("u", (Object)var1_1.G(var7_5), (long)var5_4, (long)1988124783676484407L, (long)var3_3) + (String)b2.a("t", (int)1292, (long)(5471554395432098766L ^ var3_3)) + var25_19 + (String)b2.a("t", (int)17898, (long)(2574855313132051239L ^ var3_3)));
                                }
                                catch (n9 v12) {
                                    throw m44.a("j", (Object)v12, (long)123962302493681760L, (long)var3_3);
                                }
                            }
                            v9 = var22_14;
                        }
                        try {
                            v13 /* !! */  = v9 instanceof x6;
                            if (var3_3 <= 0L) break block35;
                            if (!v13 /* !! */ ) {
                                throw new aw((String)m44.a("u", (Object)var1_1.G(var7_5), (long)var5_4, (long)1988124783676484407L, (long)var3_3) + (String)b2.a("t", (int)29955, (long)(4242994868676094917L ^ var3_3)) + var25_19 + (String)b2.a("t", (int)7137, (long)(4244833760824427813L ^ var3_3)) + var22_14.getClass().getName() + (String)b2.a("t", (int)1455, (long)(2483457101142399850L ^ var3_3)));
                            }
                        }
                        catch (n9 v14) {
                            throw m44.a("j", (Object)v14, (long)123962302493681760L, (long)var3_3);
                        }
                        m44.a("t", (Object)this, (long)1875266636564386780L, (long)var3_3)[var24_17] = (x6)var22_14;
                        ++var24_17;
                        v13 /* !! */  = var20_15;
                    }
                    if (v13 /* !! */ ) continue block22;
                    v15 = new Object[2];
                    v15[1] = m44.a("t", (Object)this, (long)1875266636564386780L, (long)var3_3);
                    v15[0] = var16_11;
                    v8 /* !! */  = (int)m44.a("j", (Object)v15, (long)56954428787386839L, (long)var3_3);
                } while (var3_3 <= 0L);
            }
            if (v8 /* !! */  == 0) {
                block38: {
                    var24_18 = new StringBuilder();
                    var24_18.append((String)b2.a("t", (int)28437, (long)(1765068369579078100L ^ var3_3)));
                    var24_18.append(this.f(var9_6));
                    var24_18.append((String)b2.a("t", (int)8278, (long)(2011540960016809624L ^ var3_3)));
                    var25_19 = 0;
                    while (var25_19 < ((CallSite)m44.a("t", (Object)this, (long)1875266636564386780L, (long)var3_3)).length) {
                        block36: {
                            block37: {
                                block39: {
                                    try {
                                        try {
                                            try {
                                                var24_18.append((String)m44.a("u", (Object)m44.a("t", (Object)this, (long)1875266636564386780L, (long)var3_3)[var25_19], (char)((char)var11_7), (int)var12_8, (short)((short)var13_9), (long)34925888509827381L, (long)var3_3));
                                                v16 = var20_15;
                                                while (true) {
                                                    if (var3_3 < 0L) break block36;
                                                    if (v16 == false) break block37;
                                                    v17 = var25_19;
                                                    v18 = ((CallSite)m44.a("t", (Object)this, (long)1875266636564386780L, (long)var3_3)).length - 1;
                                                    if (var20_15 == false) break block38;
                                                    break;
                                                }
                                            }
                                            catch (n9 v19) {
                                                throw m44.a("j", (Object)v19, (long)123962302493681760L, (long)var3_3);
                                            }
                                            if (v17 >= v18) break block39;
                                        }
                                        catch (n9 v20) {
                                            throw m44.a("j", (Object)v20, (long)123962302493681760L, (long)var3_3);
                                        }
                                        var24_18.append((String)b2.a("t", (int)9892, (long)(8568798100688877668L ^ var3_3)));
                                    }
                                    catch (n9 v21) {
                                        throw m44.a("j", (Object)v21, (long)123962302493681760L, (long)var3_3);
                                    }
                                }
                                ++var25_19;
                            }
                            v16 = var20_15;
                        }
                        if (v16 != false) continue;
                    }
                    v17 = 0;
                    if (var3_3 < 0L) ** continue;
                    v18 = 1;
                }
                v22 = new String[v18];
                v22[0] = var24_18.toString();
                lk0.t((boolean)v17, v22, var18_12);
            }
        }
    }

    @Override
    void z(gu gu2, long l10) {
        long l11 = l10 ^ 0x66FDF08525FDL;
        gu2.K((js)((Object)m44.a("v", (Object)this, (long)5604019388109538825L, (long)l10)), this, l11, this.H());
        CallSite callSite = m44.a("v", (Object)this, (long)6229650066107834286L, (long)l10);
        int n10 = ((CallSite)callSite).length;
        CallSite callSite2 = m44.a("h", (long)5618762033536375070L, (long)l10);
        for (int i10 = 0; i10 < n10; ++i10) {
            CallSite callSite3 = callSite[i10];
            gu2.K((js)((Object)callSite3), this, l11, this.H());
            if (callSite2 == false) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                b2.b = prr.a(-4935658771750236180L, 7937720577573936599L, MethodHandles.lookup().lookupClass()).a(260978517645876L);
                b2.f = new HashMap<K, V>(13);
                var0 = b2.b ^ 5518643270907L;
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
                var6_5 = "\u008b\u00c7\u0081\u00be\u00a5V\u00ca\u00ed\u00bc\u0087<P)L1v2\u00b2Ng]\u00f9\u0001@A\u008d\u00c2\u00a9\u00d4\u00f7u\u009d\u0099M\u00c0\u0092\u0096\u00fe\u00de\u0087\u009a\"\u00e1\u00d4\u00c6\u00d4@\u0096\u00bc\u00e5\u00df\u00c7!L{Ww\u0098}\u00d8R\u00fePS\u00d2cB\u0083`\u0083\u008a\u00e4\u00b1l\u00bf\u00eet*dv(m\u00bee\u00a6\u00e6\u0082\u00efa\u00ab\u00dc\u0082\u0099\u00e3\u00cc\u0085\u001e\u0099\u009e\u00cb,rN\u0010\u0010\u00dc[\b\u00baR\u00e7\u00f0\u00dcf8\u0002\f\u00b7\u0012\u0092\u00ff@\u0014kM\u00cb\u0002v\u00b6$\\\u00ff/H\u0091\u0001\u0083\u00ec3\u00f4l\u00ebpw\u0012IA\tG&\u00f6_\u00d1CJ%\u001fzJ\u0095\u00c1\u0081\u00a7\u001fa\u00ba\u00bb\u00fa8\u00e2Hp\u0010S}\u00fa`U\u0002\u00dd\u00b2\b\u0093\r\u00ee\u00fa\u0010\u0097%M3x&\u00da\u00fc\u00a2\u00c6\u00e4\u00a6\u00d7Y\u00af\u001a8\u007f\u00b2?\u00c3\u0012Q\u00c0[\u000e\u00a1\u009d\u00ce\u00dd\u00b8\u0012\u0094\u00b8N\u00e7\u0088\u0015&\t:\u0082\u00c9\u00cb\u00b6<u\u00f4\u00d6\u0005Iz\u0017z'9\u00f0\u00fc\u0084\u00fc%\u00cd\u0090\u00ca\u00b0\u00ca\u00f8|\u0014G\u00deK\u00cfH\u0013\u00fa\u0091U\u000b\u001d\u008d\u00ed\u0080\u0006\u001ay\u001c\u00ff\u00c7\u00ee\u00a9\u00d2\u00e7\u00e6<\u00eb\u00b28D\u00d2\u00feY\u00cds\u0091\u0017\u00ac\u00a4\u009ad\u00ec&\u008fRQ]\u00b5\u008e\u008bi\u0015!aO\u00aa0\u0002:\u0087\u00c2\u00813\u00e5\u00df\u00c1,\tkzW?\u00d6\u0095\u00b2\u00fd{@YZqJ\u000e\u001bI\u0082\f\u0091r\u0093\u00d6\n{0\u0019\u00aeB\u0005\u00e3P\u00056\u001b(\u0015/\u00bfL$\u00c4Q\u0000\u00b2\u00bb\u000e\u00dd\u00ac\r\u00b4\u008e2\u00ba\u00f5Z:\u00e0\u009fw\u00cc\u00dcec\u00f6w\u00d7|\u00a8\u00bf\u00d2\u0014i\u00e6\u0010\u0083)\u00f7\u00aa\u0003\u00bb[\u001aF{\u0088W\u00ba5\u00e8\u000b@M\u00b2\u00ad\u00a0\u00c6\u00bc.\u00a2\u0095\u00d9)Z\u001b\u00167T+G\t\u00ab\u00d2\u00d0\u00d9\u00c0\u00e9\u00f3%\u0013@\u00ef\u00855^B\u00e4\u00a6\u00c8\u00b0\u00c4f6\u0080\u00a5\u00eeS\u00ed\u00ad\u00ac\u00cf.4\u00b4R\u0089@9\u00c2\u00d6\"C\u00d8\u00a4L\u00a9PmC(\u00bcW\u001e\u0083zi\u00d3\u00d23\u0006\u00ef\u00f7\u00db\u00a1^\u00b6\u00c8i&\u00eb\u00d7H%9\u009c\u00d4\u0084\u0011\u00bcv4\u001f\u0014;\u00a7\u00a7\u00b6\u00ef\u001c\\ \u00ba-\u0010>\u0017\u0084\u00ab\u00bb\u0003o\u00fe\u00b5\u00c5\u00fc/\u0094%\u00a6\u00cf\u0017\u0089p\u00cc\u00e3\u00af)x4c\u000eEA\u0090\u0013,\u00b70k;\u00d6\u00ca\u00b2\u0010\u00a4\u001bt\u008e1\u008c\u00ca=:\u00ea\u009d7;\u001b\u0006\u00d9O\u0005_i\u00ec\u00fa\u00a4i\u00a0\u00c1\u0018\u001d\u00afy\u00d7\u0003\f~\u00be\u008d\u00144\u00b21~L";
                var8_6 = "\u008b\u00c7\u0081\u00be\u00a5V\u00ca\u00ed\u00bc\u0087<P)L1v2\u00b2Ng]\u00f9\u0001@A\u008d\u00c2\u00a9\u00d4\u00f7u\u009d\u0099M\u00c0\u0092\u0096\u00fe\u00de\u0087\u009a\"\u00e1\u00d4\u00c6\u00d4@\u0096\u00bc\u00e5\u00df\u00c7!L{Ww\u0098}\u00d8R\u00fePS\u00d2cB\u0083`\u0083\u008a\u00e4\u00b1l\u00bf\u00eet*dv(m\u00bee\u00a6\u00e6\u0082\u00efa\u00ab\u00dc\u0082\u0099\u00e3\u00cc\u0085\u001e\u0099\u009e\u00cb,rN\u0010\u0010\u00dc[\b\u00baR\u00e7\u00f0\u00dcf8\u0002\f\u00b7\u0012\u0092\u00ff@\u0014kM\u00cb\u0002v\u00b6$\\\u00ff/H\u0091\u0001\u0083\u00ec3\u00f4l\u00ebpw\u0012IA\tG&\u00f6_\u00d1CJ%\u001fzJ\u0095\u00c1\u0081\u00a7\u001fa\u00ba\u00bb\u00fa8\u00e2Hp\u0010S}\u00fa`U\u0002\u00dd\u00b2\b\u0093\r\u00ee\u00fa\u0010\u0097%M3x&\u00da\u00fc\u00a2\u00c6\u00e4\u00a6\u00d7Y\u00af\u001a8\u007f\u00b2?\u00c3\u0012Q\u00c0[\u000e\u00a1\u009d\u00ce\u00dd\u00b8\u0012\u0094\u00b8N\u00e7\u0088\u0015&\t:\u0082\u00c9\u00cb\u00b6<u\u00f4\u00d6\u0005Iz\u0017z'9\u00f0\u00fc\u0084\u00fc%\u00cd\u0090\u00ca\u00b0\u00ca\u00f8|\u0014G\u00deK\u00cfH\u0013\u00fa\u0091U\u000b\u001d\u008d\u00ed\u0080\u0006\u001ay\u001c\u00ff\u00c7\u00ee\u00a9\u00d2\u00e7\u00e6<\u00eb\u00b28D\u00d2\u00feY\u00cds\u0091\u0017\u00ac\u00a4\u009ad\u00ec&\u008fRQ]\u00b5\u008e\u008bi\u0015!aO\u00aa0\u0002:\u0087\u00c2\u00813\u00e5\u00df\u00c1,\tkzW?\u00d6\u0095\u00b2\u00fd{@YZqJ\u000e\u001bI\u0082\f\u0091r\u0093\u00d6\n{0\u0019\u00aeB\u0005\u00e3P\u00056\u001b(\u0015/\u00bfL$\u00c4Q\u0000\u00b2\u00bb\u000e\u00dd\u00ac\r\u00b4\u008e2\u00ba\u00f5Z:\u00e0\u009fw\u00cc\u00dcec\u00f6w\u00d7|\u00a8\u00bf\u00d2\u0014i\u00e6\u0010\u0083)\u00f7\u00aa\u0003\u00bb[\u001aF{\u0088W\u00ba5\u00e8\u000b@M\u00b2\u00ad\u00a0\u00c6\u00bc.\u00a2\u0095\u00d9)Z\u001b\u00167T+G\t\u00ab\u00d2\u00d0\u00d9\u00c0\u00e9\u00f3%\u0013@\u00ef\u00855^B\u00e4\u00a6\u00c8\u00b0\u00c4f6\u0080\u00a5\u00eeS\u00ed\u00ad\u00ac\u00cf.4\u00b4R\u0089@9\u00c2\u00d6\"C\u00d8\u00a4L\u00a9PmC(\u00bcW\u001e\u0083zi\u00d3\u00d23\u0006\u00ef\u00f7\u00db\u00a1^\u00b6\u00c8i&\u00eb\u00d7H%9\u009c\u00d4\u0084\u0011\u00bcv4\u001f\u0014;\u00a7\u00a7\u00b6\u00ef\u001c\\ \u00ba-\u0010>\u0017\u0084\u00ab\u00bb\u0003o\u00fe\u00b5\u00c5\u00fc/\u0094%\u00a6\u00cf\u0017\u0089p\u00cc\u00e3\u00af)x4c\u000eEA\u0090\u0013,\u00b70k;\u00d6\u00ca\u00b2\u0010\u00a4\u001bt\u008e1\u008c\u00ca=:\u00ea\u009d7;\u001b\u0006\u00d9O\u0005_i\u00ec\u00fa\u00a4i\u00a0\u00c1\u0018\u001d\u00afy\u00d7\u0003\f~\u00be\u008d\u00144\u00b21~L".length();
                var5_7 = 80;
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
                    var9_3[var7_4++] = b2.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "F:\u009d\u0018\u009a\u00ef\u00c0\u00a8s\u00a33\u0081\u008c\r\u0087G\u0012\u00e4\u0005\u00b8\u0090v\u00d6\u00bc\u00d7B8R\u00865\u0097Z\u0092t\u0080\u008d\u0084d\u00ae\u00c6\u0010g\u0014_\u00a7\u00c1f\u0083\u0001\u00a6\u00a14\u00f9g\u0007\u0003\u00ba";
                    var8_6 = "F:\u009d\u0018\u009a\u00ef\u00c0\u00a8s\u00a33\u0081\u008c\r\u0087G\u0012\u00e4\u0005\u00b8\u0090v\u00d6\u00bc\u00d7B8R\u00865\u0097Z\u0092t\u0080\u008d\u0084d\u00ae\u00c6\u0010g\u0014_\u00a7\u00c1f\u0083\u0001\u00a6\u00a14\u00f9g\u0007\u0003\u00ba".length();
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
                    var9_3[var7_4++] = b2.a(var10_9).intern();
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
        b2.c = var9_3;
        b2.d = new String[13];
    }

    private static n9 a(n9 n92) {
        return n92;
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

    private static String a(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x140A;
        if (d[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/b2", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n11].getBytes("ISO-8859-1");
            b2.d[n11] = b2.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = b2.a(n10, l10);
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
            throw new RuntimeException("com/zelix/b2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b2.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

