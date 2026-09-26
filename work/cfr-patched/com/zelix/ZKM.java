/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.f33;
import com.zelix.l66;
import com.zelix.m44;
import com.zelix.n2;
import com.zelix.nz;
import com.zelix.prr;
import com.zelix.sz;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ZKM
extends l66 {
    private static final long a;
    private static final Integer[] n;
    private static final long[] l;
    private static final String[] g;
    private static final String[] f;
    private static final Map h;
    private static final Map o;
    private static final String[] q;
    private static final String[] p;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(ZKM.a(11077, -4024) + ZKM.a(11086, 1885) + string + ZKM.a(11086, 1885) + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ZKM.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x44AD;
        if (ZKM.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ZKM.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance(ZKM.a(11072, -29104)), SecretKeyFactory.getInstance(ZKM.a(11084, 12229)), new IvParameterSpec(new byte[8])};
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException(ZKM.a(11076, 28341), exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ZKM.n[n2] = n3;
        }
        return ZKM.n[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block128: {
            block127: {
                block126: {
                    block125: {
                        block124: {
                            block123: {
                                block122: {
                                    block129: {
                                        break block129;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    v0 = "\u0092Ic\u00c0\u00e3w\u0098\u00f1\u0090d\u0019Z\u00cc\u0088[f\u00070\u00a3\u001d<\u0098m\u00a8\u00d2\u00b4\u00e4(\u00c8ma\u00d5!\"$Lw\u00f0\u00c6\u00c3zW\u000br\u00ef\u00ab\u00beG\u008e\u000f\u00a9\u00a3`)\u00c9\u0013\u008dT\u008a\u00e5\u0019\u00e0\u00a3\u00e9\u00e6\u00e55\u0554\u00d6^4\u000e\u00b0\u00d6$\\\u00ba|=\u001fF\u00cf\u0095\u00cc\u00d3\u00f2=\u00fa#\u009a\u00a6\u000f\u0019\u009a6\u00fa\u000e\u00f9\u00ce\u0014u\u00ff\u00bd\u0081\u009a\u00d2x[\u00af\u00bd\u00834m\u0000\u008a\u009f\u00b1*\u0015\u00de\u00c7\u00e6IYy\u001b\u0083=\u00a1\u00c9\u0093X\u00a4O\u00b9|l\u0000\r\u008f`\u0013\u0019\u00fa\u00ac\u00e7;\u0081^-S0\u0081\u00d7#e\u0004\u00bar\u00be\u00ea\u00cdB\u00e2\u00ad0\u00e6\u0001\u00cf\u00bf\u0099\u00e1\u00c1\u00d5\u009c\u00a0\u008cOt)\u00f4'p\u0014\u00ae\u00b3\u0016\u001a\u0084\u00b3\u00bb\u00dd\u00d0y\u00a1,l6\u00d1\\\u049c4Q\u000etCn=\u00d4h-_X#\u0088SF vT\u00d1&f\u0003\u00c8\u00b7\u00d6\u00af?e\u008e(\u00dd\u00b5eC\u00fdnf\u0083\u0001s\u00cdv\u0011g4-\u0000y\u009e\u00e6]Q\u00d2\u0090[\u00ed!Zm\u00b0\u0012\u009f\u0011A\u0086\u00acN\u00b4\u00b7t\u00a4\"\u0095\u00af,J\u0010\u00d4R\u00bfi\u00a35\u00aa\u0087\u00ac\u00be0\u00b1\u0016\u00a3L\u00d2\u0082\u00b1\u0096\u00a8\u00e5G%\u00cfi\u00cb\u00b6\u00cb,\u00f0P\u0011B\u0000\u008bYGI\u00e2\\\u00a4)\u0089L\u0004\u00c0;\u00d7\u00ebJ\u00feY~\u00b2\u00b0\u00d4<|\u00f2\u00a9\u00ed\u00b5\u00aa\u001bP\u00ecJ\u0001\u00d0\u0006U\u0011\u00d2\u00a4+\u00c8\u00c8\u00f3\u0002\u0011\u00c8\u000b\u00de1\u0081\u0098\u00d1mh\u00b31\u0084<B^\u00bb\u00e6b/\u008b\u0004\u009a\u00ba*\u00d4\u00fc\u00c7{D\u00fb\u009bK\u00f8\u00ed\u00a3b-\u00f5Z\n\u00eerS\u00c8\u00cf\u00e8\u00beN!B\u00c7\u0097}\u00a0\u00a0k\u0018\u008fu\u00f4\u00deH\u0007\u00a8\u007f\u001b\u00bc=\u00f2\\\u00a1n\u0010\u0098<+\u0084n\u00e5\u00f2\u009e\u009a[\u0086\u0080\u00da\u008e\u0014\u000f\u00f1l\u00ca\u00e4D\u0085%\u00e5\t\u00bd\u0010\u00ec\u00d5\u00b7%\u0019\u00a46\u0006\u00a4\u001b#\u00b6r\u00c8\u00f4e\u00b3.\u00c8\u00eey\u00e1\u00a1Q\u0093_Q^Y\u00dfW\u0084\u0099.\u00d1\u00d7\u00bf\u00caS\u0002\u0090&\u008c\u008f_\u008c\u001a\u00b46\u00d1c \u0099{\u00cc\u00c6\u00b7Mt?\u00b1\u0016\u00a3?\u00e8\\\u00cf)\u00ac\u0097\u00efL\u0092g1I\u00e9\u00d4\u00cf\u0099\u00b0\u00a1\u00e2{\u0017\u001fFb]\u00aev\u00fa,0\u00b0\u00f9\u00a02[r\u00ec\u001b\u009c\u00159C\u0096\u0088+\u00f8r\u00e9\u001b\u001a\u00c0\u00aa\u008a\u001e5TD\u008a\u00f0\u00c5];\u00b0\u00d5E}'\u00c4\u00ff\u00b1\u008e\u0090{\u00f9\u00e3\u00ca\u00ae\u0000`QSP\u00bdR73\u0003\"\u00b9\u00bd\u0087T\u00e1\u00f2\u001b\u00c6\u00b8P\f\u0013\u0006\u001d\u001b\u00a5\u00cc\u00b9\u00f4A\u001b\u00c7x\u00b8b\u00d4U\u00ce\u00e9T\u0096f\u00abI\u00d5\u000b%\u00b0>\u00f8\u0018\u0010\u0017\u00e5\u00b7\u00dd\u00a0\u00d6B\u00a7\u001a\u00c3.\u00f5\u00b6\u00ee\u000b(3\u00e0a\u00811\u00bb\u00f6-s`\u001f\u00cd\u00ab\u009ej\u00ad\u00a5l\u0014wJ\u00d7\u00fb\u0019\u007f\\|\u00c4\u00cb\u00ae\u00f7\u0089\t\u00b5\u00b13\u00b4\u00cc\u00f5r/\u00ca\u00d3\u00fd\u0007'\u00e3\u00cf\u00c0\u00ef\u0004\u00fa\u0080\u00ba\u00e3\u00ab\u00a9\u00ca]\u00d7\u00e64h*\u00d4\u0099\u00fa\u00ba2\u00b1j\u00b4*\u00a0#\u00e6`\u00a9\u00d8\u00ed1\u00f1`>\u00e6\u009d\u00fb`\u00f75\u008a\u009f\u00c7\u0005h\u0012_=\u00c5\u00f3HJEQ'\u0001zH\u00bcwx?\u0097\u00d0bL*\u0093\u00e7\u001b-\u00b0\u00ce\u000f g\u00cf\u0011N^\u009a\u0084\u00f1\u0099*T\u00fa%\nl\u00e1F\u00a7 \u00ac\u009dH\u00e6\u00e0\u0004a\u0018\u0013\u0090>yi\u0001z\u00ef\u00d1\u001e\u00fbA\u00c1Tg1\b\u0092j{:^\u00bd\u00c39\u0013\u0016\u009d\u00ff\u00e1\u00c6\u0092\u00c0)\u00835\u008e\u009b\u00a0\u000e\u00f3\u0089\u00fb\u0083C\f\n\u00db\u00833\u00ff\u00ac\u001d\u0016\u00d3\u00ccN\u00a5\u008d\u00861(\u00b9{GG\u0084\u0001<\u00d9[u\u0096\u00cd\u00a8\u00b5\u00f6\u00abT\u000b\u001b\u00c07\r\u001e\u00f5\u00ec\u0095b'\u00b0\u00b6\u00d9\u008bo^\u009d\u00c8\u0096\u00cb\u00e1\u00e4^\u0092x7\u00a4\u0090\u00f6 \u00e5\u008f(\u00e1q\r\u0014\u00fcf \u00e9\u00d8\u00a1\u001d\u00a9\u0096-p=\u001b\u00d2\u00a6\u00c7\u00a2\u00cdOPd\u008b\u00dc\u00f0(2\tx\u00bd\u00f2\u0091Lc0\u00da\u0084\u00bd\u00d5\u00e6t\u0004\u00dd\u0082\u0013f\u00bc\u00042\u001a\u008f\u00d3\u00d3\u00e9(\u00e2\u00e9\u00e5\u0017\\\u00c9O\u00a3Px\u0016\u00cc\u00c6p\u00de$\u00d4\u008b\u0018\u00a4\u00cc>\u00c4 b\u001cqI\u008a*3\u0094^\u0006\u00ce\u00c0MA(\u00f6\u00cc\u00d1\u00c9g=\u00a5\u00e6\u00a1b\u00ac\u008a\u008e2\u00df\u00cf\\C\u00fc\u00e0\u00d3V\u0015\u0096.\u00d4\u00a1(\u008b\u00b6\u00e6D\u001e\u007fw\u00e1\u0004\u001bKb\u0098G\u0084q\u00f2=R\u00d3\u008ew9\u00ec\u00e1\u00d9\u00bc=*\u001f\u00f6\u00fe\u0016\u00ae\u00ec\u00ac\u00b3\u0091\u00a1\u00cd\u0004\u00ebx\u00fb\u0014\u00d4\u0093{\u00e0Yp\u00c3\u00fa\u009b2\u0011\u00af\u001f\u00b8J\u00dd\u00dd?\fD\u00a3A\u0000\u00ef\u00deo\u00cc*\u00c3\f?\u00cf\u00a8+\u00f1t4!5\n\u00c1\u00admx\u00f9\u00f7y\u00c49HUF\u00ab\u00ca\u00dc{\u00afN\u001fl\u00f6\u00b5\u0083\u0007\u00e2\u00a9\u00dc\u00a5d\u00cc\u00fb}y\u00c7@r@\u0017|Mv\u00d4$s-\\\u001e\u00d5\u0080u,%,\u001f\u00e2D\u009d\u0086\u00c5\u00fa\u00ce\u00ee\u00eb\u00c1\u00dd\u00d2\u0085N\u00b9u{5\u009ev\u00ff:T#\u0010\u008d\u00b50\u00f6\u00fb\u00d7\u00e9~m\u0085%\\\u0080\b\u00c0_\u0086Ux\u0084}<\u00e4\u0087\u00bf\u0087\u0084\u00d1\u00bb\n\u00eab\u0089\u0011\u009d:~P}\u0090$$B\u0010\u00e9\u00ee\u00d1\u00e1\u00a8L\u00dd=\u00f1\u0005H3\u00ef\u000b\u00e7\u00b0\u0085\u00a1M\u00f1\u0017M\u00e2\u001e\u00ef\u00c0Q\u0084\u00a6\u009b.\u00ad\u00f4@\u0000{B\u00dd\u00be\u00b5\u00ca\u00a0k\u00e2\u00ef?\u00bc\u00dd\u0089f6b\u00cd\n?\u008f\u0097Ml\u00a2U\u00f4\u00a7\u00f80Q\u000f4\u0093\u00aag>\u00ee\u00ee\u00c7'\u009b\u00b0\u00e5_a\u00b2F\f\u000f\u00f2\u008aq\u0019\u00c1\u0085\u00f8\u00abL\u00aaSO\u001c8X\u00da\u00d5\u00fe\u008a0\u00ff<d?\u0090L\u00e6\u00d7\u00ce\u00af\u0097\u00dc\u009e\u00fa{tJ\u00a6\u0010\u0088\u0094\u000e\u0088\u0007\u0003\u00ac\u00a5\u00b5\u00ea\bx\u0095".toCharArray();
                                    v1 = v0.length;
                                    var1_1 = 0;
                                    v2 = 33;
                                    v3 = v0;
                                    v4 = v1;
                                    if (v1 > 1) ** GOTO lbl54
                                    do {
                                        v5 = v2;
                                        v3 = v3;
                                        v6 = v3;
                                        v7 = v2;
                                        v8 = var1_1;
                                        while (true) {
                                            switch (var1_1 % 7) {
                                                case 0: {
                                                    v9 = 58;
                                                    break;
                                                }
                                                case 1: {
                                                    v9 = 41;
                                                    break;
                                                }
                                                case 2: {
                                                    v9 = 117;
                                                    break;
                                                }
                                                case 3: {
                                                    v9 = 108;
                                                    break;
                                                }
                                                case 4: {
                                                    v9 = 33;
                                                    break;
                                                }
                                                case 5: {
                                                    v9 = 13;
                                                    break;
                                                }
                                                default: {
                                                    v9 = 96;
                                                }
                                            }
                                            v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                                            ++var1_1;
                                            v2 = v5;
                                            if (v5 != 0) break;
                                            v5 = v2;
                                            v3 = v3;
                                            v8 = v2;
                                            v6 = v3;
                                            v7 = v2;
                                        }
lbl54:
                                        // 2 sources

                                        v10 = v3;
                                        v4 = v4;
                                    } while (v4 > var1_1);
                                    ** while (true)
lbl61:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var0 = new String(v10).intern();
                                    v11 = var0.toCharArray();
                                    v12 = v11.length;
                                    var3_3 = 0;
                                    v13 = 112;
                                    v14 = v11;
                                    v15 = v12;
                                    if (v12 > 1) ** GOTO lbl115
                                    do {
                                        v16 = v13;
                                        v14 = v14;
                                        v17 = v14;
                                        v18 = v13;
                                        v19 = var3_3;
                                        while (true) {
                                            switch (var3_3 % 7) {
                                                case 0: {
                                                    v20 = 82;
                                                    break;
                                                }
                                                case 1: {
                                                    v20 = 112;
                                                    break;
                                                }
                                                case 2: {
                                                    v20 = 120;
                                                    break;
                                                }
                                                case 3: {
                                                    v20 = 64;
                                                    break;
                                                }
                                                case 4: {
                                                    v20 = 37;
                                                    break;
                                                }
                                                case 5: {
                                                    v20 = 43;
                                                    break;
                                                }
                                                default: {
                                                    v20 = 71;
                                                }
                                            }
                                            v17[v19] = (char)(v17[v19] ^ (v18 ^ v20));
                                            ++var3_3;
                                            v13 = v16;
                                            if (v16 != 0) break;
                                            v16 = v13;
                                            v14 = v14;
                                            v19 = v13;
                                            v17 = v14;
                                            v18 = v13;
                                        }
lbl115:
                                        // 2 sources

                                        v21 = v14;
                                        v15 = v15;
                                    } while (v15 > var3_3);
                                    ** while (true)
lbl122:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var2_2 = new String(v21).intern();
                                    v22 = var2_2.toCharArray();
                                    v23 = v22.length;
                                    var5_5 = 0;
                                    v24 = 86;
                                    v25 = v22;
                                    v26 = v23;
                                    if (v23 > 1) ** GOTO lbl176
                                    do {
                                        v27 = v24;
                                        v25 = v25;
                                        v28 = v25;
                                        v29 = v24;
                                        v30 = var5_5;
                                        while (true) {
                                            switch (var5_5 % 7) {
                                                case 0: {
                                                    v31 = 18;
                                                    break;
                                                }
                                                case 1: {
                                                    v31 = 39;
                                                    break;
                                                }
                                                case 2: {
                                                    v31 = 83;
                                                    break;
                                                }
                                                case 3: {
                                                    v31 = 56;
                                                    break;
                                                }
                                                case 4: {
                                                    v31 = 54;
                                                    break;
                                                }
                                                case 5: {
                                                    v31 = 110;
                                                    break;
                                                }
                                                default: {
                                                    v31 = 64;
                                                }
                                            }
                                            v28[v30] = (char)(v28[v30] ^ (v29 ^ v31));
                                            ++var5_5;
                                            v24 = v27;
                                            if (v27 != 0) break;
                                            v27 = v24;
                                            v25 = v25;
                                            v30 = v24;
                                            v28 = v25;
                                            v29 = v24;
                                        }
lbl176:
                                        // 2 sources

                                        v32 = v25;
                                        v26 = v26;
                                    } while (v26 > var5_5);
                                    ** while (true)
lbl183:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var4_4 = new String(v32).intern();
                                    v33 = var4_4.toCharArray();
                                    v34 = v33.length;
                                    var7_7 = 0;
                                    v35 = 45;
                                    v36 = v33;
                                    v37 = v34;
                                    if (v34 > 1) ** GOTO lbl237
                                    do {
                                        v38 = v35;
                                        v36 = v36;
                                        v39 = v36;
                                        v40 = v35;
                                        v41 = var7_7;
                                        while (true) {
                                            switch (var7_7 % 7) {
                                                case 0: {
                                                    v42 = 126;
                                                    break;
                                                }
                                                case 1: {
                                                    v42 = 87;
                                                    break;
                                                }
                                                case 2: {
                                                    v42 = 28;
                                                    break;
                                                }
                                                case 3: {
                                                    v42 = 98;
                                                    break;
                                                }
                                                case 4: {
                                                    v42 = 34;
                                                    break;
                                                }
                                                case 5: {
                                                    v42 = 49;
                                                    break;
                                                }
                                                default: {
                                                    v42 = 23;
                                                }
                                            }
                                            v39[v41] = (char)(v39[v41] ^ (v40 ^ v42));
                                            ++var7_7;
                                            v35 = v38;
                                            if (v38 != 0) break;
                                            v38 = v35;
                                            v36 = v36;
                                            v41 = v35;
                                            v39 = v36;
                                            v40 = v35;
                                        }
lbl237:
                                        // 2 sources

                                        v43 = v36;
                                        v37 = v37;
                                    } while (v37 > var7_7);
                                    ** while (true)
lbl244:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var6_6 = new String(v43).intern();
                                    v44 = var6_6.toCharArray();
                                    v45 = v44.length;
                                    var9_9 = 0;
                                    v46 = 6;
                                    v47 = v44;
                                    v48 = v45;
                                    if (v45 > 1) ** GOTO lbl298
                                    do {
                                        v49 = v46;
                                        v47 = v47;
                                        v50 = v47;
                                        v51 = v46;
                                        v52 = var9_9;
                                        while (true) {
                                            switch (var9_9 % 7) {
                                                case 0: {
                                                    v53 = 35;
                                                    break;
                                                }
                                                case 1: {
                                                    v53 = 113;
                                                    break;
                                                }
                                                case 2: {
                                                    v53 = 80;
                                                    break;
                                                }
                                                case 3: {
                                                    v53 = 107;
                                                    break;
                                                }
                                                case 4: {
                                                    v53 = 33;
                                                    break;
                                                }
                                                case 5: {
                                                    v53 = 12;
                                                    break;
                                                }
                                                default: {
                                                    v53 = 63;
                                                }
                                            }
                                            v50[v52] = (char)(v50[v52] ^ (v51 ^ v53));
                                            ++var9_9;
                                            v46 = v49;
                                            if (v49 != 0) break;
                                            v49 = v46;
                                            v47 = v47;
                                            v52 = v46;
                                            v50 = v47;
                                            v51 = v46;
                                        }
lbl298:
                                        // 2 sources

                                        v54 = v47;
                                        v48 = v48;
                                    } while (v48 > var9_9);
                                    ** while (true)
lbl305:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var8_8 = new String(v54).intern();
                                    v55 = var8_8.toCharArray();
                                    v56 = v55.length;
                                    var11_11 = 0;
                                    v57 = 5;
                                    v58 = v55;
                                    v59 = v56;
                                    if (v56 > 1) ** GOTO lbl359
                                    do {
                                        v60 = v57;
                                        v58 = v58;
                                        v61 = v58;
                                        v62 = v57;
                                        v63 = var11_11;
                                        while (true) {
                                            switch (var11_11 % 7) {
                                                case 0: {
                                                    v64 = 127;
                                                    break;
                                                }
                                                case 1: {
                                                    v64 = 82;
                                                    break;
                                                }
                                                case 2: {
                                                    v64 = 83;
                                                    break;
                                                }
                                                case 3: {
                                                    v64 = 67;
                                                    break;
                                                }
                                                case 4: {
                                                    v64 = 9;
                                                    break;
                                                }
                                                case 5: {
                                                    v64 = 5;
                                                    break;
                                                }
                                                default: {
                                                    v64 = 102;
                                                }
                                            }
                                            v61[v63] = (char)(v61[v63] ^ (v62 ^ v64));
                                            ++var11_11;
                                            v57 = v60;
                                            if (v60 != 0) break;
                                            v60 = v57;
                                            v58 = v58;
                                            v63 = v57;
                                            v61 = v58;
                                            v62 = v57;
                                        }
lbl359:
                                        // 2 sources

                                        v65 = v58;
                                        v59 = v59;
                                    } while (v59 > var11_11);
                                    ** while (true)
lbl366:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var10_10 = new String(v65).intern();
                                    v66 = var10_10.toCharArray();
                                    v67 = v66.length;
                                    var13_13 = 0;
                                    v68 = 8;
                                    v69 = v66;
                                    v70 = v67;
                                    if (v67 > 1) ** GOTO lbl420
                                    do {
                                        v71 = v68;
                                        v69 = v69;
                                        v72 = v69;
                                        v73 = v68;
                                        v74 = var13_13;
                                        while (true) {
                                            switch (var13_13 % 7) {
                                                case 0: {
                                                    v75 = 28;
                                                    break;
                                                }
                                                case 1: {
                                                    v75 = 1;
                                                    break;
                                                }
                                                case 2: {
                                                    v75 = 126;
                                                    break;
                                                }
                                                case 3: {
                                                    v75 = 68;
                                                    break;
                                                }
                                                case 4: {
                                                    v75 = 117;
                                                    break;
                                                }
                                                case 5: {
                                                    v75 = 46;
                                                    break;
                                                }
                                                default: {
                                                    v75 = 13;
                                                }
                                            }
                                            v72[v74] = (char)(v72[v74] ^ (v73 ^ v75));
                                            ++var13_13;
                                            v68 = v71;
                                            if (v71 != 0) break;
                                            v71 = v68;
                                            v69 = v69;
                                            v74 = v68;
                                            v72 = v69;
                                            v73 = v68;
                                        }
lbl420:
                                        // 2 sources

                                        v76 = v69;
                                        v70 = v70;
                                    } while (v70 > var13_13);
                                    ** while (true)
                                    var12_12 = new String(v76).intern();
                                    var14_14 = new String[2];
                                    var18_15 = 0;
                                    var17_16 = var12_12;
                                    var19_17 = var17_16.length();
                                    var16_18 = 67;
                                    var15_19 = -1;
lbl434:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl436:
                                    // 1 sources

                                    while (true) {
                                        var14_14[var18_15++] = new String(v77).intern();
                                        if ((var15_19 += var16_18) < var19_17) {
                                            var16_18 = var17_16.charAt(var15_19);
                                            ** continue;
                                        }
                                        break block122;
                                        break;
                                    }
                                    v78 = ++var15_19;
                                    v79 = var17_16.substring(v78, v78 + var16_18).toCharArray();
                                    v80 = v79.length;
                                    var20_20 = 0;
                                    v81 = 100;
                                    v82 = v79;
                                    v83 = v80;
                                    if (v80 > 1) ** GOTO lbl494
                                    do {
                                        v84 = v81;
                                        v82 = v82;
                                        v85 = v82;
                                        v86 = v81;
                                        v87 = var20_20;
                                        while (true) {
                                            switch (var20_20 % 7) {
                                                case 0: {
                                                    v88 = 31;
                                                    break;
                                                }
                                                case 1: {
                                                    v88 = 77;
                                                    break;
                                                }
                                                case 2: {
                                                    v88 = 107;
                                                    break;
                                                }
                                                case 3: {
                                                    v88 = 84;
                                                    break;
                                                }
                                                case 4: {
                                                    v88 = 34;
                                                    break;
                                                }
                                                case 5: {
                                                    v88 = 48;
                                                    break;
                                                }
                                                default: {
                                                    v88 = 53;
                                                }
                                            }
                                            v85[v87] = (char)(v85[v87] ^ (v86 ^ v88));
                                            ++var20_20;
                                            v81 = v84;
                                            if (v84 != 0) break;
                                            v84 = v81;
                                            v82 = v82;
                                            v87 = v81;
                                            v85 = v82;
                                            v86 = v81;
                                        }
lbl494:
                                        // 2 sources

                                        v77 = v82;
                                        v83 = v83;
                                    } while (v83 > var20_20);
                                    ** while (true)
                                }
                                var26_21 = new String[15];
                                var24_22 = 0;
                                var23_23 = var14_14[1];
                                var25_24 = var23_23.length();
                                var22_25 = 3;
                                var21_26 = -1;
lbl508:
                                // 2 sources

                                while (true) {
                                    v89 = 92;
                                    v90 = ++var21_26;
                                    v91 = var23_23.substring(v90, v90 + var22_25);
                                    v92 = -1;
                                    break block123;
                                    break;
                                }
lbl514:
                                // 1 sources

                                while (true) {
                                    var26_21[var24_22++] = v93.intern();
                                    if ((var21_26 += var22_25) < var25_24) {
                                        var22_25 = var23_23.charAt(var21_26);
                                        ** continue;
                                    }
                                    var23_23 = var14_14[0];
                                    var25_24 = var23_23.length();
                                    var22_25 = 49;
                                    var21_26 = -1;
lbl523:
                                    // 2 sources

                                    while (true) {
                                        v89 = 69;
                                        v94 = ++var21_26;
                                        v91 = var23_23.substring(v94, v94 + var22_25);
                                        v92 = 0;
                                        break block123;
                                        break;
                                    }
                                    break;
                                }
lbl529:
                                // 1 sources

                                while (true) {
                                    var26_21[var24_22++] = v93.intern();
                                    if ((var21_26 += var22_25) < var25_24) {
                                        var22_25 = var23_23.charAt(var21_26);
                                        ** continue;
                                    }
                                    break block124;
                                    break;
                                }
                            }
                            v95 = v91.toCharArray();
                            v96 = v95.length;
                            var27_27 = 0;
                            v97 = v89;
                            v98 = v95;
                            v99 = v96;
                            if (v96 > 1) ** GOTO lbl586
                            do {
                                v100 = v97;
                                v98 = v98;
                                v101 = v98;
                                v102 = v97;
                                v103 = var27_27;
                                while (true) {
                                    switch (var27_27 % 7) {
                                        case 0: {
                                            v104 = 114;
                                            break;
                                        }
                                        case 1: {
                                            v104 = 73;
                                            break;
                                        }
                                        case 2: {
                                            v104 = 2;
                                            break;
                                        }
                                        case 3: {
                                            v104 = 83;
                                            break;
                                        }
                                        case 4: {
                                            v104 = 88;
                                            break;
                                        }
                                        case 5: {
                                            v104 = 40;
                                            break;
                                        }
                                        default: {
                                            v104 = 65;
                                        }
                                    }
                                    v101[v103] = (char)(v101[v103] ^ (v102 ^ v104));
                                    ++var27_27;
                                    v97 = v100;
                                    if (v100 != 0) break;
                                    v100 = v97;
                                    v98 = v98;
                                    v103 = v97;
                                    v101 = v98;
                                    v102 = v97;
                                }
lbl586:
                                // 2 sources

                                v105 = v98;
                                v99 = v99;
                            } while (v99 > var27_27);
                            v93 = new String(v105);
                            switch (v92) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl596:
                                // 1 sources

                                ** continue;
                            }
                        }
                        ZKM.p = var26_21;
                        ZKM.q = new String[15];
                        ZKM.a = prr.a((long)4946739422844520167L, (long)-3255849720267822854L, MethodHandles.lookup().lookupClass()).a(206446864202663L);
                        ZKM.h = new HashMap<K, V>(13);
                        var39_28 = ZKM.a ^ 17832197718613L;
                        var41_29 = Cipher.getInstance(ZKM.a(11078, 16511));
                        v106 = SecretKeyFactory.getInstance(ZKM.a(11082, 6937));
                        v107 = new byte[8];
                        v108 = v107;
                        v107[0] = (byte)(var39_28 >>> 56);
                        for (var42_30 = 1; var42_30 < 8; ++var42_30) {
                            v108 = v108;
                            v108[var42_30] = (byte)(var39_28 << var42_30 * 8 >>> 56);
                        }
                        var41_29.init(2, (Key)v106.generateSecret(new DESKeySpec(v108)), new IvParameterSpec(new byte[8]));
                        var48_31 = new String[20];
                        var46_32 = 0;
                        var45_33 = ZKM.a(11079, 28719);
                        var47_34 = var45_33.length();
                        var44_35 = 88;
                        var43_36 = -1;
lbl619:
                        // 2 sources

                        while (true) {
                            v109 = ++var43_36;
                            v110 = var45_33.substring(v109, v109 + var44_35);
                            v111 = -1;
                            break block125;
                            break;
                        }
lbl624:
                        // 1 sources

                        while (true) {
                            var48_31[var46_32++] = ZKM.c(var49_37).intern();
                            if ((var43_36 += var44_35) < var47_34) {
                                var44_35 = var45_33.charAt(var43_36);
                                ** continue;
                            }
                            var45_33 = ZKM.a(11073, -12081);
                            var47_34 = var45_33.length();
                            var44_35 = 16;
                            var43_36 = -1;
lbl633:
                            // 2 sources

                            while (true) {
                                v112 = ++var43_36;
                                v110 = var45_33.substring(v112, v112 + var44_35);
                                v111 = 0;
                                break block125;
                                break;
                            }
                            break;
                        }
lbl638:
                        // 1 sources

                        while (true) {
                            var48_31[var46_32++] = ZKM.c(var49_37).intern();
                            if ((var43_36 += var44_35) < var47_34) {
                                var44_35 = var45_33.charAt(var43_36);
                                ** continue;
                            }
                            break block126;
                            break;
                        }
                    }
                    var49_37 = var41_29.doFinal(v110.getBytes(ZKM.a(11083, -19686)));
                    switch (v111) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl650:
                        // 1 sources

                        ** continue;
                    }
                }
                ZKM.f = var48_31;
                ZKM.g = new String[20];
                ZKM.o = new HashMap<K, V>(13);
                var28_38 = Cipher.getInstance(ZKM.a(11074, 10503));
                v113 = SecretKeyFactory.getInstance(ZKM.a(11082, 6937));
                v114 = new byte[8];
                v115 = v114;
                v114[0] = (byte)(var39_28 >>> 56);
                for (var29_39 = 1; var29_39 < 8; ++var29_39) {
                    v115 = v115;
                    v115[var29_39] = (byte)(var39_28 << var29_39 * 8 >>> 56);
                }
                var28_38.init(2, (Key)v113.generateSecret(new DESKeySpec(v115)), new IvParameterSpec(new byte[8]));
                var34_40 = new long[3];
                var31_41 = 0;
                var32_42 = ZKM.a(11081, 23579);
                var33_43 = var32_42.length();
                var30_44 = 0;
                while (true) {
                    break block127;
                    break;
                }
lbl672:
                // 1 sources

                while (true) {
                    var34_40[v116] = ((long)var38_47[0] & 255L) << 56 | ((long)var38_47[1] & 255L) << 48 | ((long)var38_47[2] & 255L) << 40 | ((long)var38_47[3] & 255L) << 32 | ((long)var38_47[4] & 255L) << 24 | ((long)var38_47[5] & 255L) << 16 | ((long)var38_47[6] & 255L) << 8 | (long)var38_47[7] & 255L;
                    if (var30_44 < var33_43) ** continue;
                    break block128;
                    break;
                }
            }
            var35_45 = var32_42.substring(var30_44, var30_44 += 8).getBytes(ZKM.a(11083, -19686));
            v116 = var31_41++;
            var36_46 = ((long)var35_45[0] & 255L) << 56 | ((long)var35_45[1] & 255L) << 48 | ((long)var35_45[2] & 255L) << 40 | ((long)var35_45[3] & 255L) << 32 | ((long)var35_45[4] & 255L) << 24 | ((long)var35_45[5] & 255L) << 16 | ((long)var35_45[6] & 255L) << 8 | (long)var35_45[7] & 255L;
            var38_47 = var28_38.doFinal(new byte[]{(byte)(var36_46 >>> 56), (byte)(var36_46 >>> 48), (byte)(var36_46 >>> 40), (byte)(var36_46 >>> 32), (byte)(var36_46 >>> 24), (byte)(var36_46 >>> 16), (byte)(var36_46 >>> 8), (byte)var36_46});
            ** while (true)
        }
        ZKM.l = var34_40;
        ZKM.n = new Integer[3];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(ZKM.a(11077, -4024) + ZKM.a(11080, 3372) + string + ZKM.a(11086, 1885) + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5ABA;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance(ZKM.a(11085, -5501)), SecretKeyFactory.getInstance(ZKM.a(11082, 6937)), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(ZKM.a(11077, -4024), exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes(ZKM.a(11087, 11773));
            ZKM.g[n2] = ZKM.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ZKM.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void main(String[] var0) {
        block58: {
            block59: {
                block57: {
                    block53: {
                        block54: {
                            System.err.println("[Patch] com/zelix/ZKM.class");
                            System.err.println("[Patch] com/zelix/m44.class");
                            System.err.println("[Patch] com/zelix/OverrideGuardRuntime.class");
                            System.err.println("[Patch] com/zelix/rv.class");
                            System.err.println("[Patch] com/zelix/_f.class");
                            System.err.println("[Patch] com/zelix/bn.class");
                            v0 = var1_1 = prr.a((long)434753564064269493L, (long)-6059157263496536882L, MethodHandles.lookup().lookupClass()).a(187172637952660L) ^ ZKM.a ^ 138704655075023L;
                            var3_2 = v0 ^ 22467878379007L;
                            v1 = v0 ^ 121891444785602L;
                            var5_3 = (int)(v1 >>> 48);
                            var6_4 = (int)(v1 << 16 >>> 32);
                            var7_5 = (int)(v1 << 48 >>> 48);
                            v2 = v0 ^ 119165718902860L;
                            var8_6 = (int)(v2 >>> 32);
                            var9_7 = (int)(v2 << 32 >>> 48);
                            var10_8 = (int)(v2 << 48 >>> 48);
                            var11_9 = v0 ^ 84088325467515L;
                            var13_10 = v0 ^ 123526720634890L;
                            var15_11 = v0 ^ 140470900189420L;
                            v3 = m44.a("o", (long)-6106787713937261014L, (long)var1_1);
                            v4 = new Object[3];
                            v4[2] = var7_5;
                            v4[1] = var6_4;
                            v4[0] = (int)((short)var5_3);
                            m44.a("o", (Object)v4, (long)-5837571092968019918L, (long)var1_1);
                            var17_12 = v3;
                            try {
                                v5 /* !! */  = m44.a("k", (long)-5218313455228665260L, (long)var1_1);
                                if (var17_12 != false) break block53;
                                if (v5 /* !! */  == false) break block54;
                            }
                            catch (IOException v6) {
                                throw m44.a("o", (Object)v6, (long)-5368076453595410483L, (long)var1_1);
                            }
                            var18_13 = null;
                            try {
                                var19_15 /* !! */  = new File((File)m44.a("k", (long)-5469430883076217138L, (long)var1_1), m44.a("p", (Object)new StringBuilder().append((String)ZKM.b("x", (int)31192, (long)(6567526310856989076L ^ var1_1))), (long)m44.a("o", (long)-6312184085645231658L, (long)var1_1), (long)-5905011584256399547L, (long)var1_1).append((String)ZKM.b("x", (int)10855, (long)(4597447638855371327L ^ var1_1))).toString());
                                m44.a("p", (Object)m44.a("k", (long)-5252841223497150920L, (long)var1_1), (Object)((String)ZKM.b("x", (int)17221, (long)(2548692315052417804L ^ var1_1)) + (String)m44.a("p", (Object)var19_15 /* !! */ , (long)-6272382197403921009L, (long)var1_1) + "'" + (char)ZKM.d("g", (int)32379, (long)(1219846864443736102L ^ var1_1))), (long)-6024335133417294224L, (long)var1_1);
                                var18_13 = new PrintStream(new BufferedOutputStream(new FileOutputStream((File)var19_15 /* !! */ ), (int)ZKM.d("g", (int)27396, (long)(2762882559493477720L ^ var1_1))), true);
                                m44.a("l", (PrintStream)m44.a("k", (long)-5252841223497150920L, (long)var1_1), (long)-6269546598198549329L, (long)var1_1);
                                m44.a("o", (Object)var18_13, (long)-5298246967050726441L, (long)var1_1);
                            }
                            catch (IOException var19_16) {
                                block55: {
                                    block56: {
                                        v7 = var18_13;
                                        if (var17_12 != false) break block55;
                                        try {
                                            block71: {
                                                if (v7 == null) break block56;
                                                break block71;
                                                catch (IOException v8) {
                                                    throw m44.a("o", (Object)v8, (long)-5368076453595410483L, (long)var1_1);
                                                }
                                            }
                                            m44.a("p", (Object)var18_13, (long)-5360231983348431755L, (long)var1_1);
                                        }
                                        catch (IOException v9) {
                                            throw m44.a("o", (Object)v9, (long)-5368076453595410483L, (long)var1_1);
                                        }
                                    }
                                    v7 = m44.a("k", (long)-6269546598198549329L, (long)var1_1);
                                }
                                m44.a("o", v7, (long)-5298246967050726441L, (long)var1_1);
                                m44.a("p", (Object)var19_16, (long)-6215606479103734252L, (long)var1_1);
                                m44.a("o", (int)1, (long)-6321365809701674414L, (long)var1_1);
                            }
                        }
                        v5 /* !! */  = m44.a("k", (long)-5462925723972650987L, (long)var1_1);
                    }
                    if (var17_12 != false) break block57;
                    try {
                        block72: {
                            if (v5 /* !! */  == false) break block58;
                            break block72;
                            catch (IOException v10) {
                                throw m44.a("o", (Object)v10, (long)-5368076453595410483L, (long)var1_1);
                            }
                        }
                        v11 = new Object[1];
                        v11[0] = var3_2;
                        v5 /* !! */  = m44.a("o", (Object)v11, (long)-6294500403946371405L, (long)var1_1);
                    }
                    catch (IOException v12) {
                        throw m44.a("o", (Object)v12, (long)-5368076453595410483L, (long)var1_1);
                    }
                }
                if (var17_12 != false) break block59;
                try {
                    block73: {
                        if (v5 /* !! */  >= ZKM.d("g", (int)19167, (long)(5372843128486737024L ^ var1_1))) break block58;
                        break block73;
                        catch (IOException v13) {
                            throw m44.a("o", (Object)v13, (long)-5368076453595410483L, (long)var1_1);
                        }
                    }
                    m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)m44.a("k", (long)-5670528750727968233L, (long)var1_1) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
                    v5 /* !! */  = (CallSite)true;
                }
                catch (IOException v14) {
                    throw m44.a("o", (Object)v14, (long)-5368076453595410483L, (long)var1_1);
                }
            }
            m44.a("o", (int)v5 /* !! */ , (long)-6321365809701674414L, (long)var1_1);
        }
        try {
            Class.forName((String)ZKM.b("x", (int)27953, (long)(3596271060376456574L ^ var1_1)));
        }
        catch (ClassNotFoundException var18_14) {
            m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)m44.a("k", (long)-5281402695822861072L, (long)var1_1) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
            m44.a("o", (int)1, (long)-6321365809701674414L, (long)var1_1);
        }
        var18_13 = new sz(var8_6, (short)var9_7, (char)var10_8);
        try {
            var19_15 /* !! */  = new Class[]{String[].class, sz.class};
            v15 = new Object[1];
            v15[0] = var13_10;
            var20_23 = Class.forName(f33.a((String)m44.a("o", (Object)v15, (long)-5855770429551048623L, (long)var1_1))).getConstructor(var19_15 /* !! */ );
            var21_26 = new Object[]{var0, var18_13};
            var20_23.newInstance(var21_26);
        }
        catch (InstantiationException var19_17) {
            m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)ZKM.b("x", (int)13865, (long)(16079434320565857L ^ var1_1)) + (String)ZKM.b("x", (int)31905, (long)(829157951551642855L ^ var1_1)) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
            m44.a("o", (int)1, (long)-6321365809701674414L, (long)var1_1);
        }
        catch (IllegalAccessException var19_18) {
            m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)ZKM.b("x", (int)8036, (long)(7054214277611192111L ^ var1_1)) + (String)ZKM.b("x", (int)21908, (long)(3123322892268680655L ^ var1_1)) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
            m44.a("o", (int)1, (long)-6321365809701674414L, (long)var1_1);
        }
        catch (NoClassDefFoundError var19_19) {
            block63: {
                block61: {
                    block60: {
                        var20_24 = m44.a("o", (Object)ZKM.b("x", (int)2763, (long)(8312011596693170834L ^ var1_1)), (long)-5463205984814506095L, (long)var1_1);
                        try {
                            v16 = var20_24;
                            if (var17_12 != false) break block60;
                            if (v16 != null) {
                            }
                            ** GOTO lbl177
                        }
                        catch (IOException v17) {
                            throw m44.a("o", (Object)v17, (long)-5368076453595410483L, (long)var1_1);
                        }
                        v16 = var20_24;
                    }
                    try {
                        block62: {
                            try {
                                try {
                                    v18 /* !! */  = v16.indexOf((String)ZKM.b("x", (int)16805, (long)(2954886598309061119L ^ var1_1)));
                                    if (var17_12 != false) break block61;
                                    if (v18 /* !! */  != -1) break block62;
                                }
                                catch (IOException v19) {
                                    throw m44.a("o", (Object)v19, (long)-5368076453595410483L, (long)var1_1);
                                }
                                m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)ZKM.b("x", (int)17318, (long)(5485655479818232805L ^ var1_1)), (long)-6024335133417294224L, (long)var1_1);
                                if (var17_12 == false) break block63;
                            }
                            catch (IOException v20) {
                                throw m44.a("o", (Object)v20, (long)-5368076453595410483L, (long)var1_1);
                            }
                        }
                        v21 = new Object[2];
                        v21[1] = var11_9;
                        v21[0] = var20_24;
                        v18 /* !! */  = (int)m44.a("o", (Object)v21, (long)-5347275402462789336L, (long)var1_1);
                    }
                    catch (IOException v22) {
                        throw m44.a("o", (Object)v22, (long)-5368076453595410483L, (long)var1_1);
                    }
                }
                try {
                    try {
                        block64: {
                            try {
                                if (v18 /* !! */  == 0) break block64;
                                m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)ZKM.b("x", (int)847, (long)(2862497275391730447L ^ var1_1)) + (String)ZKM.b("x", (int)21908, (long)(3123322892268680655L ^ var1_1)) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
                                if (var17_12 == false) break block63;
                            }
                            catch (IOException v23) {
                                throw m44.a("o", (Object)v23, (long)-5368076453595410483L, (long)var1_1);
                            }
                        }
                        m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)ZKM.b("x", (int)28331, (long)(8160491850574434031L ^ var1_1)), (long)-6024335133417294224L, (long)var1_1);
                        if (var17_12 == false) break block63;
                    }
                    catch (IOException v24) {
                        throw m44.a("o", (Object)v24, (long)-5368076453595410483L, (long)var1_1);
                    }
lbl177:
                    // 2 sources

                    m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)ZKM.b("x", (int)17850, (long)(4950365708442871291L ^ var1_1)), (long)-6024335133417294224L, (long)var1_1);
                }
                catch (IOException v25) {
                    throw m44.a("o", (Object)v25, (long)-5368076453595410483L, (long)var1_1);
                }
            }
            m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)ZKM.b("x", (int)32257, (long)(7508489171196223046L ^ var1_1)) + (String)var20_24 + "\""), (long)-6024335133417294224L, (long)var1_1);
            m44.a("o", (int)1, (long)-6321365809701674414L, (long)var1_1);
        }
        catch (InvocationTargetException var19_20) {
            block67: {
                block68: {
                    block70: {
                        block69: {
                            block65: {
                                var20_25 = var19_20.getTargetException();
                                try {
                                    try {
                                        block66: {
                                            try {
                                                try {
                                                    v26 = var20_25 instanceof n2;
                                                    if (var17_12 != false) break block65;
                                                    if (!v26) break block66;
                                                }
                                                catch (IOException v27) {
                                                    throw m44.a("o", (Object)v27, (long)-5368076453595410483L, (long)var1_1);
                                                }
                                                m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)ZKM.b("x", (int)8323, (long)(4844394857771385025L ^ var1_1)) + (String)m44.a("p", (Object)var20_25, (long)-5639825607131496390L, (long)var1_1) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
                                                if (var17_12 == false) break block67;
                                            }
                                            catch (IOException v28) {
                                                throw m44.a("o", (Object)v28, (long)-5368076453595410483L, (long)var1_1);
                                            }
                                        }
                                        v29 = var20_25;
                                        if (var17_12 != false) break block68;
                                    }
                                    catch (IOException v30) {
                                        throw m44.a("o", (Object)v30, (long)-5368076453595410483L, (long)var1_1);
                                    }
                                    v26 = v29 instanceof nz;
                                }
                                catch (IOException v31) {
                                    throw m44.a("o", (Object)v31, (long)-5368076453595410483L, (long)var1_1);
                                }
                            }
                            if (!v26) ** GOTO lbl233
                            var21_27 = (PrintWriter)var18_13.t();
                            m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)ZKM.b("x", (int)7758, (long)(6545799619055386116L ^ var1_1)) + (String)ZKM.b("x", (int)21908, (long)(3123322892268680655L ^ var1_1)) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
                            m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)m44.a("p", (Object)var20_25, (long)-5639825607131496390L, (long)var1_1) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
                            var21_27.println((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)ZKM.b("x", (int)12281, (long)(1310531563823288252L ^ var1_1)) + (String)ZKM.b("x", (int)21908, (long)(3123322892268680655L ^ var1_1)));
                            var21_27.println((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)m44.a("p", (Object)var20_25, (long)-5639825607131496390L, (long)var1_1) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1));
                            var22_28 = m44.a("p", (Object)var20_25, (long)-5762037063852437289L, (long)var1_1);
                            try {
                                v32 = var22_28;
                                if (var17_12 != false) break block69;
                                if (v32 == null) break block70;
                            }
                            catch (IOException v33) {
                                throw m44.a("o", (Object)v33, (long)-5368076453595410483L, (long)var1_1);
                            }
                            v32 = var22_28;
                        }
                        m44.a("p", (Object)v32, (Object)var21_27, (long)-5811263463143763874L, (long)var1_1);
                    }
                    try {
                        if (var17_12 == false) break block67;
lbl233:
                        // 2 sources

                        m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)ZKM.b("x", (int)12281, (long)(1310531563823288252L ^ var1_1)) + (String)ZKM.b("x", (int)21908, (long)(3123322892268680655L ^ var1_1)) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
                        v29 = var20_25;
                    }
                    catch (IOException v34) {
                        throw m44.a("o", (Object)v34, (long)-5368076453595410483L, (long)var1_1);
                    }
                }
                v35 = new Object[3];
                v35[2] = (PrintWriter)var18_13.t();
                v35[1] = v29;
                v35[0] = var15_11;
                m44.a("o", (Object)v35, (long)-5841944763581912744L, (long)var1_1);
            }
            m44.a("o", (int)1, (long)-6321365809701674414L, (long)var1_1);
        }
        catch (NoSuchMethodException var19_21) {
            m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)ZKM.b("x", (int)18173, (long)(1521890141751715507L ^ var1_1)) + (String)ZKM.b("x", (int)21908, (long)(3123322892268680655L ^ var1_1)) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
            m44.a("o", (int)1, (long)-6321365809701674414L, (long)var1_1);
        }
        catch (Throwable var19_22) {
            m44.a("p", (Object)m44.a("k", (long)-5626360419864341094L, (long)var1_1), (Object)((String)m44.a("k", (long)-6304784172887163001L, (long)var1_1) + (String)ZKM.b("x", (int)13431, (long)(8503645708197123130L ^ var1_1)) + (String)ZKM.b("x", (int)21908, (long)(3123322892268680655L ^ var1_1)) + (String)m44.a("k", (long)-6304784172887163001L, (long)var1_1)), (long)-6024335133417294224L, (long)var1_1);
            v36 = new Object[3];
            v36[2] = (PrintWriter)var18_13.t();
            v36[1] = var19_22;
            v36[0] = var15_11;
            m44.a("o", (Object)v36, (long)-5841944763581912744L, (long)var1_1);
            m44.a("o", (int)1, (long)-6321365809701674414L, (long)var1_1);
        }
    }

    private static String a(int n, int n3) {
        int n4 = (n ^ 0x2B4C) & 0xFFFF;
        if (q[n4] == null) {
            int n5;
            int n6;
            char[] cArray = p[n4].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n6 = 96;
                    break;
                }
                case 1: {
                    n6 = 239;
                    break;
                }
                case 2: {
                    n6 = 95;
                    break;
                }
                case 3: {
                    n6 = 195;
                    break;
                }
                case 4: {
                    n6 = 184;
                    break;
                }
                case 5: {
                    n6 = 19;
                    break;
                }
                case 6: {
                    n6 = 68;
                    break;
                }
                case 7: {
                    n6 = 245;
                    break;
                }
                case 8: {
                    n6 = 254;
                    break;
                }
                case 9: {
                    n6 = 62;
                    break;
                }
                case 10: {
                    n6 = 21;
                    break;
                }
                case 11: {
                    n6 = 67;
                    break;
                }
                case 12: {
                    n6 = 207;
                    break;
                }
                case 13: {
                    n6 = 188;
                    break;
                }
                case 14: {
                    n6 = 27;
                    break;
                }
                case 15: {
                    n6 = 134;
                    break;
                }
                case 16: {
                    n6 = 39;
                    break;
                }
                case 17: {
                    n6 = 213;
                    break;
                }
                case 18: {
                    n6 = 169;
                    break;
                }
                case 19: {
                    n6 = 194;
                    break;
                }
                case 20: {
                    n6 = 12;
                    break;
                }
                case 21: {
                    n6 = 200;
                    break;
                }
                case 22: {
                    n6 = 158;
                    break;
                }
                case 23: {
                    n6 = 212;
                    break;
                }
                case 24: {
                    n6 = 47;
                    break;
                }
                case 25: {
                    n6 = 141;
                    break;
                }
                case 26: {
                    n6 = 97;
                    break;
                }
                case 27: {
                    n6 = 151;
                    break;
                }
                case 28: {
                    n6 = 176;
                    break;
                }
                case 29: {
                    n6 = 78;
                    break;
                }
                case 30: {
                    n6 = 122;
                    break;
                }
                case 31: {
                    n6 = 44;
                    break;
                }
                case 32: {
                    n6 = 131;
                    break;
                }
                case 33: {
                    n6 = 37;
                    break;
                }
                case 34: {
                    n6 = 159;
                    break;
                }
                case 35: {
                    n6 = 156;
                    break;
                }
                case 36: {
                    n6 = 41;
                    break;
                }
                case 37: {
                    n6 = 14;
                    break;
                }
                case 38: {
                    n6 = 235;
                    break;
                }
                case 39: {
                    n6 = 172;
                    break;
                }
                case 40: {
                    n6 = 90;
                    break;
                }
                case 41: {
                    n6 = 252;
                    break;
                }
                case 42: {
                    n6 = 109;
                    break;
                }
                case 43: {
                    n6 = 52;
                    break;
                }
                case 44: {
                    n6 = 140;
                    break;
                }
                case 45: {
                    n6 = 64;
                    break;
                }
                case 46: {
                    n6 = 249;
                    break;
                }
                case 47: {
                    n6 = 132;
                    break;
                }
                case 48: {
                    n6 = 137;
                    break;
                }
                case 49: {
                    n6 = 69;
                    break;
                }
                case 50: {
                    n6 = 248;
                    break;
                }
                case 51: {
                    n6 = 206;
                    break;
                }
                case 52: {
                    n6 = 38;
                    break;
                }
                case 53: {
                    n6 = 128;
                    break;
                }
                case 54: {
                    n6 = 150;
                    break;
                }
                case 55: {
                    n6 = 186;
                    break;
                }
                case 56: {
                    n6 = 24;
                    break;
                }
                case 57: {
                    n6 = 20;
                    break;
                }
                case 58: {
                    n6 = 70;
                    break;
                }
                case 59: {
                    n6 = 178;
                    break;
                }
                case 60: {
                    n6 = 149;
                    break;
                }
                case 61: {
                    n6 = 111;
                    break;
                }
                case 62: {
                    n6 = 214;
                    break;
                }
                case 63: {
                    n6 = 99;
                    break;
                }
                case 64: {
                    n6 = 76;
                    break;
                }
                case 65: {
                    n6 = 179;
                    break;
                }
                case 66: {
                    n6 = 199;
                    break;
                }
                case 67: {
                    n6 = 6;
                    break;
                }
                case 68: {
                    n6 = 113;
                    break;
                }
                case 69: {
                    n6 = 243;
                    break;
                }
                case 70: {
                    n6 = 100;
                    break;
                }
                case 71: {
                    n6 = 85;
                    break;
                }
                case 72: {
                    n6 = 56;
                    break;
                }
                case 73: {
                    n6 = 192;
                    break;
                }
                case 74: {
                    n6 = 34;
                    break;
                }
                case 75: {
                    n6 = 182;
                    break;
                }
                case 76: {
                    n6 = 31;
                    break;
                }
                case 77: {
                    n6 = 123;
                    break;
                }
                case 78: {
                    n6 = 163;
                    break;
                }
                case 79: {
                    n6 = 210;
                    break;
                }
                case 80: {
                    n6 = 116;
                    break;
                }
                case 81: {
                    n6 = 129;
                    break;
                }
                case 82: {
                    n6 = 147;
                    break;
                }
                case 83: {
                    n6 = 25;
                    break;
                }
                case 84: {
                    n6 = 253;
                    break;
                }
                case 85: {
                    n6 = 98;
                    break;
                }
                case 86: {
                    n6 = 110;
                    break;
                }
                case 87: {
                    n6 = 221;
                    break;
                }
                case 88: {
                    n6 = 227;
                    break;
                }
                case 89: {
                    n6 = 93;
                    break;
                }
                case 90: {
                    n6 = 228;
                    break;
                }
                case 91: {
                    n6 = 101;
                    break;
                }
                case 92: {
                    n6 = 61;
                    break;
                }
                case 93: {
                    n6 = 138;
                    break;
                }
                case 94: {
                    n6 = 202;
                    break;
                }
                case 95: {
                    n6 = 222;
                    break;
                }
                case 96: {
                    n6 = 143;
                    break;
                }
                case 97: {
                    n6 = 240;
                    break;
                }
                case 98: {
                    n6 = 161;
                    break;
                }
                case 99: {
                    n6 = 224;
                    break;
                }
                case 100: {
                    n6 = 4;
                    break;
                }
                case 101: {
                    n6 = 226;
                    break;
                }
                case 102: {
                    n6 = 43;
                    break;
                }
                case 103: {
                    n6 = 54;
                    break;
                }
                case 104: {
                    n6 = 208;
                    break;
                }
                case 105: {
                    n6 = 71;
                    break;
                }
                case 106: {
                    n6 = 89;
                    break;
                }
                case 107: {
                    n6 = 108;
                    break;
                }
                case 108: {
                    n6 = 81;
                    break;
                }
                case 109: {
                    n6 = 103;
                    break;
                }
                case 110: {
                    n6 = 247;
                    break;
                }
                case 111: {
                    n6 = 148;
                    break;
                }
                case 112: {
                    n6 = 105;
                    break;
                }
                case 113: {
                    n6 = 92;
                    break;
                }
                case 114: {
                    n6 = 26;
                    break;
                }
                case 115: {
                    n6 = 236;
                    break;
                }
                case 116: {
                    n6 = 119;
                    break;
                }
                case 117: {
                    n6 = 160;
                    break;
                }
                case 118: {
                    n6 = 234;
                    break;
                }
                case 119: {
                    n6 = 218;
                    break;
                }
                case 120: {
                    n6 = 204;
                    break;
                }
                case 121: {
                    n6 = 144;
                    break;
                }
                case 122: {
                    n6 = 173;
                    break;
                }
                case 123: {
                    n6 = 238;
                    break;
                }
                case 124: {
                    n6 = 170;
                    break;
                }
                case 125: {
                    n6 = 51;
                    break;
                }
                case 126: {
                    n6 = 193;
                    break;
                }
                case 127: {
                    n6 = 165;
                    break;
                }
                case 128: {
                    n6 = 183;
                    break;
                }
                case 129: {
                    n6 = 251;
                    break;
                }
                case 130: {
                    n6 = 215;
                    break;
                }
                case 131: {
                    n6 = 9;
                    break;
                }
                case 132: {
                    n6 = 102;
                    break;
                }
                case 133: {
                    n6 = 33;
                    break;
                }
                case 134: {
                    n6 = 80;
                    break;
                }
                case 135: {
                    n6 = 233;
                    break;
                }
                case 136: {
                    n6 = 241;
                    break;
                }
                case 137: {
                    n6 = 217;
                    break;
                }
                case 138: {
                    n6 = 175;
                    break;
                }
                case 139: {
                    n6 = 35;
                    break;
                }
                case 140: {
                    n6 = 190;
                    break;
                }
                case 141: {
                    n6 = 135;
                    break;
                }
                case 142: {
                    n6 = 197;
                    break;
                }
                case 143: {
                    n6 = 16;
                    break;
                }
                case 144: {
                    n6 = 17;
                    break;
                }
                case 145: {
                    n6 = 40;
                    break;
                }
                case 146: {
                    n6 = 48;
                    break;
                }
                case 147: {
                    n6 = 8;
                    break;
                }
                case 148: {
                    n6 = 106;
                    break;
                }
                case 149: {
                    n6 = 7;
                    break;
                }
                case 150: {
                    n6 = 91;
                    break;
                }
                case 151: {
                    n6 = 58;
                    break;
                }
                case 152: {
                    n6 = 133;
                    break;
                }
                case 153: {
                    n6 = 88;
                    break;
                }
                case 154: {
                    n6 = 246;
                    break;
                }
                case 155: {
                    n6 = 244;
                    break;
                }
                case 156: {
                    n6 = 154;
                    break;
                }
                case 157: {
                    n6 = 46;
                    break;
                }
                case 158: {
                    n6 = 167;
                    break;
                }
                case 159: {
                    n6 = 32;
                    break;
                }
                case 160: {
                    n6 = 201;
                    break;
                }
                case 161: {
                    n6 = 28;
                    break;
                }
                case 162: {
                    n6 = 53;
                    break;
                }
                case 163: {
                    n6 = 66;
                    break;
                }
                case 164: {
                    n6 = 168;
                    break;
                }
                case 165: {
                    n6 = 29;
                    break;
                }
                case 166: {
                    n6 = 11;
                    break;
                }
                case 167: {
                    n6 = 136;
                    break;
                }
                case 168: {
                    n6 = 255;
                    break;
                }
                case 169: {
                    n6 = 219;
                    break;
                }
                case 170: {
                    n6 = 162;
                    break;
                }
                case 171: {
                    n6 = 237;
                    break;
                }
                case 172: {
                    n6 = 121;
                    break;
                }
                case 173: {
                    n6 = 142;
                    break;
                }
                case 174: {
                    n6 = 30;
                    break;
                }
                case 175: {
                    n6 = 45;
                    break;
                }
                case 176: {
                    n6 = 216;
                    break;
                }
                case 177: {
                    n6 = 73;
                    break;
                }
                case 178: {
                    n6 = 115;
                    break;
                }
                case 179: {
                    n6 = 74;
                    break;
                }
                case 180: {
                    n6 = 209;
                    break;
                }
                case 181: {
                    n6 = 87;
                    break;
                }
                case 182: {
                    n6 = 185;
                    break;
                }
                case 183: {
                    n6 = 126;
                    break;
                }
                case 184: {
                    n6 = 0;
                    break;
                }
                case 185: {
                    n6 = 36;
                    break;
                }
                case 186: {
                    n6 = 232;
                    break;
                }
                case 187: {
                    n6 = 189;
                    break;
                }
                case 188: {
                    n6 = 164;
                    break;
                }
                case 189: {
                    n6 = 187;
                    break;
                }
                case 190: {
                    n6 = 225;
                    break;
                }
                case 191: {
                    n6 = 174;
                    break;
                }
                case 192: {
                    n6 = 180;
                    break;
                }
                case 193: {
                    n6 = 181;
                    break;
                }
                case 194: {
                    n6 = 118;
                    break;
                }
                case 195: {
                    n6 = 155;
                    break;
                }
                case 196: {
                    n6 = 10;
                    break;
                }
                case 197: {
                    n6 = 177;
                    break;
                }
                case 198: {
                    n6 = 1;
                    break;
                }
                case 199: {
                    n6 = 231;
                    break;
                }
                case 200: {
                    n6 = 59;
                    break;
                }
                case 201: {
                    n6 = 124;
                    break;
                }
                case 202: {
                    n6 = 23;
                    break;
                }
                case 203: {
                    n6 = 139;
                    break;
                }
                case 204: {
                    n6 = 153;
                    break;
                }
                case 205: {
                    n6 = 117;
                    break;
                }
                case 206: {
                    n6 = 22;
                    break;
                }
                case 207: {
                    n6 = 55;
                    break;
                }
                case 208: {
                    n6 = 57;
                    break;
                }
                case 209: {
                    n6 = 230;
                    break;
                }
                case 210: {
                    n6 = 211;
                    break;
                }
                case 211: {
                    n6 = 157;
                    break;
                }
                case 212: {
                    n6 = 3;
                    break;
                }
                case 213: {
                    n6 = 18;
                    break;
                }
                case 214: {
                    n6 = 77;
                    break;
                }
                case 215: {
                    n6 = 107;
                    break;
                }
                case 216: {
                    n6 = 79;
                    break;
                }
                case 217: {
                    n6 = 86;
                    break;
                }
                case 218: {
                    n6 = 196;
                    break;
                }
                case 219: {
                    n6 = 104;
                    break;
                }
                case 220: {
                    n6 = 112;
                    break;
                }
                case 221: {
                    n6 = 49;
                    break;
                }
                case 222: {
                    n6 = 229;
                    break;
                }
                case 223: {
                    n6 = 84;
                    break;
                }
                case 224: {
                    n6 = 250;
                    break;
                }
                case 225: {
                    n6 = 205;
                    break;
                }
                case 226: {
                    n6 = 152;
                    break;
                }
                case 227: {
                    n6 = 5;
                    break;
                }
                case 228: {
                    n6 = 171;
                    break;
                }
                case 229: {
                    n6 = 198;
                    break;
                }
                case 230: {
                    n6 = 166;
                    break;
                }
                case 231: {
                    n6 = 146;
                    break;
                }
                case 232: {
                    n6 = 42;
                    break;
                }
                case 233: {
                    n6 = 63;
                    break;
                }
                case 234: {
                    n6 = 114;
                    break;
                }
                case 235: {
                    n6 = 242;
                    break;
                }
                case 236: {
                    n6 = 145;
                    break;
                }
                case 237: {
                    n6 = 72;
                    break;
                }
                case 238: {
                    n6 = 94;
                    break;
                }
                case 239: {
                    n6 = 50;
                    break;
                }
                case 240: {
                    n6 = 203;
                    break;
                }
                case 241: {
                    n6 = 223;
                    break;
                }
                case 242: {
                    n6 = 127;
                    break;
                }
                case 243: {
                    n6 = 60;
                    break;
                }
                case 244: {
                    n6 = 220;
                    break;
                }
                case 245: {
                    n6 = 120;
                    break;
                }
                case 246: {
                    n6 = 130;
                    break;
                }
                case 247: {
                    n6 = 191;
                    break;
                }
                case 248: {
                    n6 = 83;
                    break;
                }
                case 249: {
                    n6 = 125;
                    break;
                }
                case 250: {
                    n6 = 2;
                    break;
                }
                case 251: {
                    n6 = 75;
                    break;
                }
                case 252: {
                    n6 = 13;
                    break;
                }
                case 253: {
                    n6 = 15;
                    break;
                }
                case 254: {
                    n6 = 82;
                    break;
                }
                default: {
                    n6 = 65;
                }
            }
            int n7 = n6;
            int n8 = (n3 & 0xFF) - n7;
            if (n8 < 0) {
                n8 += 256;
            }
            if ((n5 = ((n3 & 0xFFFF) >>> 8) - n7) < 0) {
                n5 += 256;
            }
            int n9 = 0;
            while (n9 < cArray.length) {
                int n10 = n9 % 2;
                int n11 = n9;
                char[] cArray2 = cArray;
                char c = cArray[n11];
                if (n10 == 0) {
                    cArray2[n11] = (char)(c ^ n8);
                    n8 = ((n8 >>> 3 | n8 << 5) ^ cArray[n9]) & 0xFF;
                } else {
                    cArray2[n11] = (char)(c ^ n5);
                    n5 = ((n5 >>> 3 | n5 << 5) ^ cArray[n9]) & 0xFF;
                }
                ++n9;
            }
            ZKM.q[n4] = new String(cArray).intern();
        }
        return q[n4];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ZKM.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ZKM.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
