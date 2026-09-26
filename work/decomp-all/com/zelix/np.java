/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ay;
import com.zelix.b0;
import com.zelix.bn;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.nj;
import com.zelix.o4;
import com.zelix.prr;
import com.zelix.sh;
import com.zelix.tt;
import com.zelix.wa;
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
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class np
extends nj {
    private static final long a;
    private static final String[] M;
    private static final String[] P;
    private static final Map X;
    private static final long[] hb;
    private static final Integer[] ib;
    private static final Map jb;

    np(bn bn2, int n, sh sh2, int n2, short s, o4 o42, wa wa2, tt tt2) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ a;
        long l2 = l ^ 0x25E341A26581L;
        super((b0)bn2, sh2, l2, (JList)o42, wa2, tt2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    void O(Object[] var1_1) {
        block27: {
            block34: {
                block35: {
                    block32: {
                        block33: {
                            block30: {
                                block31: {
                                    block28: {
                                        block29: {
                                            block26: {
                                                var3_2 = (Long)var1_1[0];
                                                var2_3 = (Integer)var1_1[1];
                                                var5_4 = var3_2 ^ 55030064788582L;
                                                var7_5 = m44.a("o", (long)-1204064367421646406L, (long)var3_2);
                                                v0 = var2_3 & np.f("z", (int)21489, (long)(1761150936619610358L ^ var3_2));
                                                if (var7_5 != null) break block26;
                                                try {
                                                    block36: {
                                                        if (v0 == 0) break block27;
                                                        break block36;
                                                        catch (n9 v1) {
                                                            throw m44.a("o", (Object)v1, (long)-710805190559651501L, (long)var3_2);
                                                        }
                                                    }
                                                    v0 = var2_3 & 2;
                                                }
                                                catch (n9 v2) {
                                                    throw m44.a("o", (Object)v2, (long)-710805190559651501L, (long)var3_2);
                                                }
                                            }
                                            v3 = var7_5;
                                            if (var3_2 < 0L) ** GOTO lbl39
                                            if (v3 != null) break block28;
                                            try {
                                                block37: {
                                                    if (v0 == 0) break block29;
                                                    break block37;
                                                    catch (n9 v4) {
                                                        throw m44.a("o", (Object)v4, (long)-710805190559651501L, (long)var3_2);
                                                    }
                                                }
                                                throw new ay((String)np.c("v", (int)12741, (long)(5477849602221057582L ^ var3_2)));
                                            }
                                            catch (n9 v5) {
                                                throw m44.a("o", (Object)v5, (long)-710805190559651501L, (long)var3_2);
                                            }
                                        }
                                        v0 = var2_3 & np.f("z", (int)3277, (long)(4263745107869937614L ^ var3_2));
                                    }
                                    v3 = var7_5;
lbl39:
                                    // 2 sources

                                    if (var3_2 <= 0L) ** GOTO lbl55
                                    if (v3 != null) break block30;
                                    try {
                                        block38: {
                                            if (v0 == 0) break block31;
                                            break block38;
                                            catch (n9 v6) {
                                                throw m44.a("o", (Object)v6, (long)-710805190559651501L, (long)var3_2);
                                            }
                                        }
                                        throw new ay((String)np.c("v", (int)23195, (long)(1480476139000581492L ^ var3_2)));
                                    }
                                    catch (n9 v7) {
                                        throw m44.a("o", (Object)v7, (long)-710805190559651501L, (long)var3_2);
                                    }
                                }
                                v0 = var2_3 & np.f("z", (int)19264, (long)(337388598804998209L ^ var3_2));
                            }
                            v3 = var7_5;
lbl55:
                            // 2 sources

                            if (var3_2 < 0L) ** GOTO lbl72
                            if (v3 != null) break block32;
                            try {
                                block39: {
                                    if (v0 == 0) break block33;
                                    break block39;
                                    catch (n9 v8) {
                                        throw m44.a("o", (Object)v8, (long)-710805190559651501L, (long)var3_2);
                                    }
                                }
                                throw new ay((String)np.c("v", (int)15161, (long)(7911751967674084565L ^ var3_2)));
                            }
                            catch (n9 v9) {
                                throw m44.a("o", (Object)v9, (long)-710805190559651501L, (long)var3_2);
                            }
                        }
                        v0 = var2_3 & np.f("z", (int)22587, (long)(4766013784318671678L ^ var3_2));
                    }
                    if (var3_2 < 0L) break block34;
                    v3 = var7_5;
lbl72:
                    // 2 sources

                    if (v3 != null) break block34;
                    try {
                        block40: {
                            if (v0 == 0) break block35;
                            break block40;
                            catch (n9 v10) {
                                throw m44.a("o", (Object)v10, (long)-710805190559651501L, (long)var3_2);
                            }
                        }
                        throw new ay((String)np.c("v", (int)28140, (long)(7257353180841048584L ^ var3_2)));
                    }
                    catch (n9 v11) {
                        throw m44.a("o", (Object)v11, (long)-710805190559651501L, (long)var3_2);
                    }
                }
                v0 = var2_3 & np.f("z", (int)32322, (long)(8846838932266540358L ^ var3_2));
            }
            try {
                if (v0 != 0) {
                    throw new ay((String)np.c("v", (int)9661, (long)(8092105209526137432L ^ var3_2)));
                }
            }
            catch (n9 v12) {
                throw m44.a("o", (Object)v12, (long)-710805190559651501L, (long)var3_2);
            }
        }
        var8_6 = m44.a("q", (Object)this, (long)-1363265818092375670L, (long)var3_2);
        synchronized (var8_6) {
            v13 = new Object[2];
            v13[1] = var5_4;
            v13[0] = var2_3;
            m44.a("p", (Object)m44.a("q", (Object)this, (long)-1649243461925158747L, (long)var3_2), (Object)v13, (long)-777463695220440413L, (long)var3_2);
        }
    }

    void E(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
    }

    void G(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        super.G(objectArray2);
        m44.a("p", (Object)((Object)this), (int)0, (long)5899436113469261141L, (long)l);
        m44.a("p", (Object)((Object)this), (int)1, (long)5495266710159221109L, (long)l);
        m44.a("p", (Object)((Object)this), (int)np.f("z", (int)17003, (long)(0x589066B4F53A479EL ^ l)), (long)5324810129088711965L, (long)l);
        m44.a("p", (Object)((Object)this), (int)np.f("z", (int)19820, (long)(0x44F83FCAD20CC894L ^ l)), (long)5967516352489231371L, (long)l);
        m44.a("p", (Object)((Object)this), (int)np.f("z", (int)7214, (long)(0x1628FFB147699DDL ^ l)), (long)5853267560883367978L, (long)l);
    }

    void Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        o4 o42 = (o4)objectArray[1];
        DefaultListModel defaultListModel = (DefaultListModel)((Object)m44.a("s", (Object)o42, (long)-7982812456648693490L, (long)l));
        m44.a("s", (Object)defaultListModel, (Object)np.c("v", (int)7504, (long)(0x28256116CD3EEE91L ^ l)), (long)-8262748918071857545L, (long)l);
        m44.a("s", (Object)defaultListModel, (Object)np.c("v", (int)16938, (long)(0x6DF6297AD7EEB1E8L ^ l)), (long)-8262748918071857545L, (long)l);
        m44.a("s", (Object)defaultListModel, (Object)np.c("v", (int)23888, (long)(0x5A8F5E144BB42E95L ^ l)), (long)-8262748918071857545L, (long)l);
        m44.a("s", (Object)defaultListModel, (Object)np.c("v", (int)27852, (long)(0x497A53A52E851F0AL ^ l)), (long)-8262748918071857545L, (long)l);
        m44.a("s", (Object)defaultListModel, (Object)np.c("v", (int)1952, (long)(0x6EC499A1012F7463L ^ l)), (long)-8262748918071857545L, (long)l);
    }

    int p(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return (int)np.f("z", (int)10616, (long)(0x3948E6A39A3C9C74L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        np.a = prr.a((long)-5125943774884944388L, (long)3554494344319917556L, MethodHandles.lookup().lookupClass()).a(158354911019992L);
                        np.X = new HashMap<K, V>(13);
                        var11 = np.a ^ 5555622485335L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[10];
                        var18_4 = 0;
                        var17_5 = "[S\u00f4F\u009d\u00ab\u00ba\u0087\u0085\u00ab\u00f3\u00c6f^\u00f4#\u0089\u0099\f\f\u0006\u00e0|\u00a0\u00cb\u00e6k\b\u0018m>f@\u00ad\u00a7\u0085\rR\t\u00e2(\u00b3\u009b\u000f\u00b9-\u00b5\u00a9l\u00d8S\n\u00ae9w\u00ac\u0082\"\u009d\u000f\u009e\u008f\u00b6\u00af:>oC\u00f7\u00e8\u00d2\u00e3\u00e8\u00dc\u008eW\u00be\u00a3=\u00fc\u00ee(#\u00b8\u00d5\u0095\u00be(\u0093A\u00e9LB\u00c9\u00a0\u00d9\u00b5H\u00fe\u00caa\u00d9\u009d\f\u00b6I\u0013\u00fb\u00f9E\u00d4\u00ab2U\u00e1\u0006\u00dd\u00ec\u00e6\u00f42\u00a0\u00f5\u0092u)\u00bc\u00fcxY\u00e9\u0082p\u000e\u0014\u00d0$\u00c3\u0081\u0085\u00a9\u00ed\u0012\u00ed\u000ene\u00f7\u00f0\u00da\u00be\u0012\u001c\u00dep\u00ef6\u001b\u001a\u00cecOX2\u00f1\u0007\u00e1\u00ea\u00a8H\u0010\u00c4\u008a\u00e0\u00a0\u00e4\u0082\u0018g\nY\"\u00cd4^\u0090\u00ed\u0010va\u0087\u008e\u001f\u008f\u008c3\u001bIi\u0001\u00e6\u00f7\u0015x\u0010\u001d\u00ecc\u001d\u0085\u00c7\u009e\u0095g\u00ca\u00e5\u00c85\u00a3\u0083zX\u00b3\u00f9\u0084\u0081\u000b\u009f\u00a2?\u0010\u00a7\u00d2\u000b\u001a\u00d2\u0005\u0099+d\u0005\u0097\u001b\u0098\u00a9\u00d6D\u008f\u00ea7@\u00a9\u00f5\u001fb\u00df\u008b\u00e8y\u00fd`l5\u00d1\u00a8\u00e3&\u00bb\u00c1\u00c7H\u00e0\u0086\u00ff\u008a\u0094\u00e2\u00e8E{\u00a24\u0006ZB\u0005\u007f\u0001%Jb|b\u009eFT\u00b5y\u00faz\u00b6M7\u000e\u0012MW\u000fE\u00bb \u00da@\u0095+\u0081\u00f3\u0081X\u00dc!\u00b6\u001a!e\u00f6\u001e\u00b7Y\u00edi\u00b0\u00fc\u00b0\u001e\u00ec\u00cb\u0016\u0092\u00ccA\u00c9q";
                        var19_6 = "[S\u00f4F\u009d\u00ab\u00ba\u0087\u0085\u00ab\u00f3\u00c6f^\u00f4#\u0089\u0099\f\f\u0006\u00e0|\u00a0\u00cb\u00e6k\b\u0018m>f@\u00ad\u00a7\u0085\rR\t\u00e2(\u00b3\u009b\u000f\u00b9-\u00b5\u00a9l\u00d8S\n\u00ae9w\u00ac\u0082\"\u009d\u000f\u009e\u008f\u00b6\u00af:>oC\u00f7\u00e8\u00d2\u00e3\u00e8\u00dc\u008eW\u00be\u00a3=\u00fc\u00ee(#\u00b8\u00d5\u0095\u00be(\u0093A\u00e9LB\u00c9\u00a0\u00d9\u00b5H\u00fe\u00caa\u00d9\u009d\f\u00b6I\u0013\u00fb\u00f9E\u00d4\u00ab2U\u00e1\u0006\u00dd\u00ec\u00e6\u00f42\u00a0\u00f5\u0092u)\u00bc\u00fcxY\u00e9\u0082p\u000e\u0014\u00d0$\u00c3\u0081\u0085\u00a9\u00ed\u0012\u00ed\u000ene\u00f7\u00f0\u00da\u00be\u0012\u001c\u00dep\u00ef6\u001b\u001a\u00cecOX2\u00f1\u0007\u00e1\u00ea\u00a8H\u0010\u00c4\u008a\u00e0\u00a0\u00e4\u0082\u0018g\nY\"\u00cd4^\u0090\u00ed\u0010va\u0087\u008e\u001f\u008f\u008c3\u001bIi\u0001\u00e6\u00f7\u0015x\u0010\u001d\u00ecc\u001d\u0085\u00c7\u009e\u0095g\u00ca\u00e5\u00c85\u00a3\u0083zX\u00b3\u00f9\u0084\u0081\u000b\u009f\u00a2?\u0010\u00a7\u00d2\u000b\u001a\u00d2\u0005\u0099+d\u0005\u0097\u001b\u0098\u00a9\u00d6D\u008f\u00ea7@\u00a9\u00f5\u001fb\u00df\u008b\u00e8y\u00fd`l5\u00d1\u00a8\u00e3&\u00bb\u00c1\u00c7H\u00e0\u0086\u00ff\u008a\u0094\u00e2\u00e8E{\u00a24\u0006ZB\u0005\u007f\u0001%Jb|b\u009eFT\u00b5y\u00faz\u00b6M7\u000e\u0012MW\u000fE\u00bb \u00da@\u0095+\u0081\u00f3\u0081X\u00dc!\u00b6\u001a!e\u00f6\u001e\u00b7Y\u00edi\u00b0\u00fc\u00b0\u001e\u00ec\u00cb\u0016\u0092\u00ccA\u00c9q".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = np.d(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00fa\u00a3\u0013r\u00d7_\u0086\u009a%\u0099\u00ef\u0088\u00bcA\t\u00e9f\u00e16(=\u0002\u00cd\u0011\u00ec\u00a5\u00d7\u00fe\u00f5\u00fe\u00ae\u00aa\u00c7\b>\u00e4\u00ee\u00be\u00c4\u0094\u000bo\u00de]\u00bcO\u00b7{\u0000y{\u00da3\u0005\u00c3\u008d\u00a6\u0006\u00fe\u00c6\u00d6\u0081\u00b5l\b\u0011\u001a\u0001\u00ae\u009a\u00fb!\u00f6\u0086@B\u00c3\u001c\u0083\u00aaPH\u0098\u00a3c\u00b1\u00ba{J\u000b\u0006\u00f4\u0092&\u00a9i\u00b7\u0010]\u007f\u00cf\u0091q\u0019&\u009en.\u008dJ`\u00bfM\u00b3l\u00ef\u0017[%/\u00a9\u0002\u00db\u00f0S\u00b2x\u00a7\u00bd*\u00e9\u007f\u00b6\u00d5\u0097\u00d2\u009e\u0010\u00e5\u00c11\u0096\u00a7~\u00ad\u00bcL1\u00994\u00c2V\u00e6m\u00a9\u00dcm\u00b4v\u0011\u00e1";
                            var19_6 = "\u00fa\u00a3\u0013r\u00d7_\u0086\u009a%\u0099\u00ef\u0088\u00bcA\t\u00e9f\u00e16(=\u0002\u00cd\u0011\u00ec\u00a5\u00d7\u00fe\u00f5\u00fe\u00ae\u00aa\u00c7\b>\u00e4\u00ee\u00be\u00c4\u0094\u000bo\u00de]\u00bcO\u00b7{\u0000y{\u00da3\u0005\u00c3\u008d\u00a6\u0006\u00fe\u00c6\u00d6\u0081\u00b5l\b\u0011\u001a\u0001\u00ae\u009a\u00fb!\u00f6\u0086@B\u00c3\u001c\u0083\u00aaPH\u0098\u00a3c\u00b1\u00ba{J\u000b\u0006\u00f4\u0092&\u00a9i\u00b7\u0010]\u007f\u00cf\u0091q\u0019&\u009en.\u008dJ`\u00bfM\u00b3l\u00ef\u0017[%/\u00a9\u0002\u00db\u00f0S\u00b2x\u00a7\u00bd*\u00e9\u007f\u00b6\u00d5\u0097\u00d2\u009e\u0010\u00e5\u00c11\u0096\u00a7~\u00ad\u00bcL1\u00994\u00c2V\u00e6m\u00a9\u00dcm\u00b4v\u0011\u00e1".length();
                            var16_7 = 80;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = np.d(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                np.M = var20_3;
                np.P = new String[10];
                np.jb = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[9];
                var3_13 = 0;
                var4_14 = "\u009c\u0088\u0014\u0005\u00f5v\u00ac\u00b1\u0004>c\r6l\u00ce\u00b8aH\u001aL\u00cbg\u00a1|H\u00ebiB;\"\u00ea\u00d5\u00e1\u0019\u00034A\u00de3\u00bdoP)\u00c4\u00f3\u001c\u00c6x>\u00d3\u0083\u00db\u00a3k\u00cf\u0080";
                var5_15 = "\u009c\u0088\u0014\u0005\u00f5v\u00ac\u00b1\u0004>c\r6l\u00ce\u00b8aH\u001aL\u00cbg\u00a1|H\u00ebiB;\"\u00ea\u00d5\u00e1\u0019\u00034A\u00de3\u00bdoP)\u00c4\u00f3\u001c\u00c6x>\u00d3\u0083\u00db\u00a3k\u00cf\u0080".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u008b\u0086\u00df\u0087\u001b\u00e9$\u00aei\u00e0\u0002!\u00fe\u00f7\u008c\u00c0";
                    var5_15 = "\u008b\u0086\u00df\u0087\u001b\u00e9$\u00aei\u00e0\u0002!\u00fe\u00f7\u008c\u00c0".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        np.hb = var6_12;
        np.ib = new Integer[9];
    }

    private static n9 b(n9 n92) {
        return n92;
    }

    private static String d(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x712D;
        if (P[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])X.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    X.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/np", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = M[n2].getBytes("ISO-8859-1");
            np.P[n2] = np.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return P[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = np.c(n, l);
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
            throw new RuntimeException("com/zelix/np" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int f(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x45C3;
        if (ib[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = hb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])jb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    jb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/np", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            np.ib[n2] = n3;
        }
        return ib[n2];
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = np.f(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/np" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(np.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(np.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
