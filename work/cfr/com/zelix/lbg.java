/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ah;
import com.zelix.gq;
import com.zelix.i5;
import com.zelix.lb8;
import com.zelix.lbu;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.ne;
import com.zelix.prr;
import com.zelix.v;
import java.awt.Component;
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
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class lbg
extends lb8 {
    JLabel u;
    JButton s;
    JButton i;
    static final String U;
    static String[] R;
    JEditorPane Y;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map h;
    private static final long[] j;
    private static final Integer[] k;
    private static final Map l;

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        lbg.a = prr.a(2290713239191795374L, -5058531735627691541L, MethodHandles.lookup().lookupClass()).a(10327974519331L);
                        var20 = lbg.a ^ 44528964079168L;
                        lbg.h = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[26];
                        var16_4 = 0;
                        var15_5 = "R\u00ed\u0001\u0099\u00cd\u00a2\u0093Ki\u000f\u00f3\u0095\u00desRZ\\\u0007\u00d8\u0005\u00aa4K\u00c90\u00bb\u00de9]\u00f2|\u0003<\u00f4\u00f1\u009f\u0000\u00008b\u00e4\u00f2Jv3\u00be\u0002Z\u00da\u009e\\\u00a3\u00ba\u00ed~`\u0082\rFL\u00d0\u00aa\u00e6*c\u00f0\u001c\u0099\u00f4\u00d3\u00f8\u00fd08\u008d!Qg[5wV\u00c4\u0005\u00baY\u00827\n\u00be\u00b6\u00e5LGv\u00cc\u001d\u009e\u00e1\u0083\u0090\u00b83Z7\u00ceu\u00faxf\u00a6\u00fd\t\u00d9\u0082\u00a2\u00b0Qz\u00b2m\u00c5\u00e3VP\u00d4\u00e5\u00a2\u00c4\u00b7(:\u00b5\u00a8f\"P\u00b95\u00e3\u0085G\u000b\u009a\u00a3\u001d\u00f0\t\u00e9\u00f9w\u00ac\u00d6wI@\u00b8\u00ef\u00ae\u00f6\u00e6u8\n\u0019*\u008c*\u00c2j^(\u0093\u0015u\u00e7\u0095\u00a3&;k\u00dc\u0083!\u00a9\u00a8Q-\u00d2\u008b\u00a3j\u0013\u0090%{\u009d\u008e\u008b\u0094\u00b8\u00f4\u009f\u00dd\u0013\u00a9\u00fd\u00c6\u000bb\u00ec\u0099`W\u00b10\u00d3\u0094\u00e7\u009c\u00b6M\u00c3\u00ef\u009e\u00de\u00f0D\u00f3k\u00b8Ky\u00da\u00ff\u001ejn\u00b4\u00de<\u00ae\u0014\u008bt0\u00e9;\n\u0093\u00f5\u008aD#\u00bcyh\u00bb\u00b1\u008a\u0089\u00b1z\u0000\u00e4\bUm\u0018l\u0085\u0096\u00e4\u00b4\u00bb;\u00f2@\u00a8\u00bc\u00fc\u00efm\u00c1~E\u00dc\u008esV\u00d3\u00fe\u00c5o\u009e\u00c8 -9F_\u00a0M\u0095\u00c4\u00e4h\u00cdO\u0018\b\u00feL\u001a\u00a8)S\u00c1\u00ecZr\u001a\u0010\u00acf\u00ac\u00b4\u00d4\u00b4\u0087[,^\u0095 \u00aeP\u00f4\u00e55\u00c6\u00bf6!\u00f0?\u00867\u00a7\u00f9\u0007\u00e6\u0084I\u0019\u00cb\u001a\u00c1\u00d7iH\u00b9\u0006\u00f7\u009d\u00ce\u00aeXs9\u000b\u0089&A\u00d2Ts6\u00ea\u00fe\u0007\u00c4\u0015\u00f0\u008c\u008as\u00ea\u00d7DhS\u00dd\u00aa\u00cfTeI\u00ae\u00acQ8\u00ea\u00baq\u00de\u001d+?\u00e6\u00fb\u00e9\u00f0\u000b7\u00c4l\u00c4X{r\u000e#\u00f7\u0013\u0081\u00d0j\u00f5\u00e6\u00d3\u0093\u00d4,yQa2X\u00e1+\u0017Z\u00c4\u001a\u00a3\u00d8\u00bc:z\u0003\u00d3\u00bb#\u00b0!\u0010\u0097\u0016\u0096\u00a97\u00a9Z\u00c2\u00c7\u0006\u009a\u001c\u00ad\u0014\u00caq0yHD\u00bb\u00c4\u001d_\u0089\u009fiU`\u00b1Hf8\u00a4\u00a5u\u001e>&\u00a0</\u00d9\u008a\\:f\u00d7\u00ad\u00976\u00bfY\u0003_\u00f2\u00d7\u00aa\u00ad\u00d6\u00c7\u00df\\j{\u0018\u00b0\u009b_\u0098R*\u009d\u0087\u001b\u00d69\u001e\u00e9\u0080Y%\u0093\u0003\u0098\u00e9\u008d\u00caT\u0096\u0010A\u0004\u007f\u00c9|<Z\u00c6d\u00fa8%\u0010B\u001a/\u0010\u009e$\u00a8\u008c\u0013\u00feWQ=\u00b56\u008c'6\u00ba\u0015\u0010\u008a2TM%\u00b8YE|C\u00d2\u0013\u0013\u00e5\u0094J\u0010\u00fc\u00b4\u009c\u00d6\u00bb`\u0084\u00c6\b5\u00b3\u00f0x\u00c8\u009f8@\u0082\u008a\u00ab5\u0084@\u00bf\u00c4\u00f9m\u00cf\u009b\u00e4\u0086V-\u0096+\u0098\u008d\u0010\u00b5\u009c\b\"s\u00d8\u00f6F?\u0093\u00c8pN\u000f\u00b4\u007f\u00b3!\u0005\u00d2y\u00ce\u00fa\u0096y\u0015\u00a8HQ\u0017\u0089\u009b.\u00a9\n\u008e)\u00f8\u008e\u00b2\u0014\u0010\u0088(\u00bf\u0087iQ v\u000b8\u0004\r\u00b9+\u001f>\u008b\u0088\u00aa\u00871\u0006Qn\u00b8\u00b3\u00b6}\u0015\u0083\u00fe\u0004!\u00a7^\u00b5\f\u00fb\u00e4\u009e\u0001:\u0010A\u0011oa\u00ac\u00b6h\u00b3JN\u00db\u009eA/\u0007\u00aa`\u009b\u00c2\u0095up\u00adyO\u00de\u00d3\u00e4\u00d2#\u00e6\u0096!b\u00e4k\u00b9|\u009c\u00b9r\u0007\u00c3M&G\u0093\u0092L\u00d4\u008d?\r\u009e\u00e1c\u00aa\u00c1\u00a5\u00cduR\u00bb\u00ca/\u00da\u001bh\\\u00d7\u001b\u0019\u0000\u00fa-\u001b\u008c\u009f<\u00f8k\u00dc\u0014\u0005\u00b0\u0097\u0097K\u00a4\u00e4\u00d6\u00a97\u0089\u00a5\u00ea\u0010\u008c\u00aa\u00a7iF\u00adp\u001e\u0012\u00cb\u00dd|D/,\u00a6\u0010+\u008e\u00c6^/JI\u00ff5nm\u00d6mp\u00ef\"8\u00e1\u009b\u0091\u00de\b\u00d2\u00d0\u0083\u00faz\u00bb~\n\nL@\u00c0/\u0001\u00ad\u00bc\u0087\u00e6]+j2I&,\u00d1\u008f\u0080\u00b6\u001b`\u008fH'r\u00a6\u00d1\rY\u009e\u00f2\u00a3\u001f\u00f1\u0084\u00c5\u000e\u0018ZU\u00df\u0010M\u00be\u00dc\u0091\u00b7\u00d0\u00ad\u00dbp)B\u00bd\u00e6\u00dd\u0015u8\u00c1\u0016]\u00c50\u00e2,g\u00a5]\u00f7\u00d24\u009d\u0004H_\u00d7P\u00f7\u00e1\u00f6 K(bb\u00e7Z\b\u00df\u0014\u00cbT\u001bU&&\u00bb:R\u0085M\u00ado(\u009c\u00ac]\u00ce@\u00ba\u0087\u0099O\u00f9";
                        var17_6 = "R\u00ed\u0001\u0099\u00cd\u00a2\u0093Ki\u000f\u00f3\u0095\u00desRZ\\\u0007\u00d8\u0005\u00aa4K\u00c90\u00bb\u00de9]\u00f2|\u0003<\u00f4\u00f1\u009f\u0000\u00008b\u00e4\u00f2Jv3\u00be\u0002Z\u00da\u009e\\\u00a3\u00ba\u00ed~`\u0082\rFL\u00d0\u00aa\u00e6*c\u00f0\u001c\u0099\u00f4\u00d3\u00f8\u00fd08\u008d!Qg[5wV\u00c4\u0005\u00baY\u00827\n\u00be\u00b6\u00e5LGv\u00cc\u001d\u009e\u00e1\u0083\u0090\u00b83Z7\u00ceu\u00faxf\u00a6\u00fd\t\u00d9\u0082\u00a2\u00b0Qz\u00b2m\u00c5\u00e3VP\u00d4\u00e5\u00a2\u00c4\u00b7(:\u00b5\u00a8f\"P\u00b95\u00e3\u0085G\u000b\u009a\u00a3\u001d\u00f0\t\u00e9\u00f9w\u00ac\u00d6wI@\u00b8\u00ef\u00ae\u00f6\u00e6u8\n\u0019*\u008c*\u00c2j^(\u0093\u0015u\u00e7\u0095\u00a3&;k\u00dc\u0083!\u00a9\u00a8Q-\u00d2\u008b\u00a3j\u0013\u0090%{\u009d\u008e\u008b\u0094\u00b8\u00f4\u009f\u00dd\u0013\u00a9\u00fd\u00c6\u000bb\u00ec\u0099`W\u00b10\u00d3\u0094\u00e7\u009c\u00b6M\u00c3\u00ef\u009e\u00de\u00f0D\u00f3k\u00b8Ky\u00da\u00ff\u001ejn\u00b4\u00de<\u00ae\u0014\u008bt0\u00e9;\n\u0093\u00f5\u008aD#\u00bcyh\u00bb\u00b1\u008a\u0089\u00b1z\u0000\u00e4\bUm\u0018l\u0085\u0096\u00e4\u00b4\u00bb;\u00f2@\u00a8\u00bc\u00fc\u00efm\u00c1~E\u00dc\u008esV\u00d3\u00fe\u00c5o\u009e\u00c8 -9F_\u00a0M\u0095\u00c4\u00e4h\u00cdO\u0018\b\u00feL\u001a\u00a8)S\u00c1\u00ecZr\u001a\u0010\u00acf\u00ac\u00b4\u00d4\u00b4\u0087[,^\u0095 \u00aeP\u00f4\u00e55\u00c6\u00bf6!\u00f0?\u00867\u00a7\u00f9\u0007\u00e6\u0084I\u0019\u00cb\u001a\u00c1\u00d7iH\u00b9\u0006\u00f7\u009d\u00ce\u00aeXs9\u000b\u0089&A\u00d2Ts6\u00ea\u00fe\u0007\u00c4\u0015\u00f0\u008c\u008as\u00ea\u00d7DhS\u00dd\u00aa\u00cfTeI\u00ae\u00acQ8\u00ea\u00baq\u00de\u001d+?\u00e6\u00fb\u00e9\u00f0\u000b7\u00c4l\u00c4X{r\u000e#\u00f7\u0013\u0081\u00d0j\u00f5\u00e6\u00d3\u0093\u00d4,yQa2X\u00e1+\u0017Z\u00c4\u001a\u00a3\u00d8\u00bc:z\u0003\u00d3\u00bb#\u00b0!\u0010\u0097\u0016\u0096\u00a97\u00a9Z\u00c2\u00c7\u0006\u009a\u001c\u00ad\u0014\u00caq0yHD\u00bb\u00c4\u001d_\u0089\u009fiU`\u00b1Hf8\u00a4\u00a5u\u001e>&\u00a0</\u00d9\u008a\\:f\u00d7\u00ad\u00976\u00bfY\u0003_\u00f2\u00d7\u00aa\u00ad\u00d6\u00c7\u00df\\j{\u0018\u00b0\u009b_\u0098R*\u009d\u0087\u001b\u00d69\u001e\u00e9\u0080Y%\u0093\u0003\u0098\u00e9\u008d\u00caT\u0096\u0010A\u0004\u007f\u00c9|<Z\u00c6d\u00fa8%\u0010B\u001a/\u0010\u009e$\u00a8\u008c\u0013\u00feWQ=\u00b56\u008c'6\u00ba\u0015\u0010\u008a2TM%\u00b8YE|C\u00d2\u0013\u0013\u00e5\u0094J\u0010\u00fc\u00b4\u009c\u00d6\u00bb`\u0084\u00c6\b5\u00b3\u00f0x\u00c8\u009f8@\u0082\u008a\u00ab5\u0084@\u00bf\u00c4\u00f9m\u00cf\u009b\u00e4\u0086V-\u0096+\u0098\u008d\u0010\u00b5\u009c\b\"s\u00d8\u00f6F?\u0093\u00c8pN\u000f\u00b4\u007f\u00b3!\u0005\u00d2y\u00ce\u00fa\u0096y\u0015\u00a8HQ\u0017\u0089\u009b.\u00a9\n\u008e)\u00f8\u008e\u00b2\u0014\u0010\u0088(\u00bf\u0087iQ v\u000b8\u0004\r\u00b9+\u001f>\u008b\u0088\u00aa\u00871\u0006Qn\u00b8\u00b3\u00b6}\u0015\u0083\u00fe\u0004!\u00a7^\u00b5\f\u00fb\u00e4\u009e\u0001:\u0010A\u0011oa\u00ac\u00b6h\u00b3JN\u00db\u009eA/\u0007\u00aa`\u009b\u00c2\u0095up\u00adyO\u00de\u00d3\u00e4\u00d2#\u00e6\u0096!b\u00e4k\u00b9|\u009c\u00b9r\u0007\u00c3M&G\u0093\u0092L\u00d4\u008d?\r\u009e\u00e1c\u00aa\u00c1\u00a5\u00cduR\u00bb\u00ca/\u00da\u001bh\\\u00d7\u001b\u0019\u0000\u00fa-\u001b\u008c\u009f<\u00f8k\u00dc\u0014\u0005\u00b0\u0097\u0097K\u00a4\u00e4\u00d6\u00a97\u0089\u00a5\u00ea\u0010\u008c\u00aa\u00a7iF\u00adp\u001e\u0012\u00cb\u00dd|D/,\u00a6\u0010+\u008e\u00c6^/JI\u00ff5nm\u00d6mp\u00ef\"8\u00e1\u009b\u0091\u00de\b\u00d2\u00d0\u0083\u00faz\u00bb~\n\nL@\u00c0/\u0001\u00ad\u00bc\u0087\u00e6]+j2I&,\u00d1\u008f\u0080\u00b6\u001b`\u008fH'r\u00a6\u00d1\rY\u009e\u00f2\u00a3\u001f\u00f1\u0084\u00c5\u000e\u0018ZU\u00df\u0010M\u00be\u00dc\u0091\u00b7\u00d0\u00ad\u00dbp)B\u00bd\u00e6\u00dd\u0015u8\u00c1\u0016]\u00c50\u00e2,g\u00a5]\u00f7\u00d24\u009d\u0004H_\u00d7P\u00f7\u00e1\u00f6 K(bb\u00e7Z\b\u00df\u0014\u00cbT\u001bU&&\u00bb:R\u0085M\u00ado(\u009c\u00ac]\u00ce@\u00ba\u0087\u0099O\u00f9".length();
                        var14_7 = 24;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = lbg.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "j\u00af\u00ba\u0085O\u00d3\u00fc=X7R\u00053Z\u00e5\u0089@\u00f5\f\u00144\u00b2Kn{W\u008e}\u00c8\u0005\u00e0\u009e+\u0017sc'\u0094\u00ee\u008a\u0083\u00ec\u00e8P!\u001b';\u000bI^\u000e\u00cc\u00f7\u00fa\u00a2)\u008bA\u00f5\u00a0\u00d7qJ|B#1\u00e0\r\u00b9\u001fJ|{\u008e\u00a8\u009c\u0001\u0082K";
                            var17_6 = "j\u00af\u00ba\u0085O\u00d3\u00fc=X7R\u00053Z\u00e5\u0089@\u00f5\f\u00144\u00b2Kn{W\u008e}\u00c8\u0005\u00e0\u009e+\u0017sc'\u0094\u00ee\u008a\u0083\u00ec\u00e8P!\u001b';\u000bI^\u000e\u00cc\u00f7\u00fa\u00a2)\u008bA\u00f5\u00a0\u00d7qJ|B#1\u00e0\r\u00b9\u001fJ|{\u008e\u00a8\u009c\u0001\u0082K".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = lbg.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                lbg.b = var18_3;
                lbg.c = new String[26];
                lbg.l = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[13];
                var3_13 = 0;
                var4_14 = "T\u0012{\u0080\u00b9.\u00ba3\u00e4'\u00fa7F|\u00c1\u008e\u0004_.b8\u0010o\u0005\u008e\u00efj\u00ff\u0092^\u00b3\u001a\u00cd\u00d8\u00ac\u00a7\u00c4\u00c7\u0018\u0093s\u0083\u0019Z\u00afQ\u009f\u0000\u00cc\u0092\u00e3\u00b9fL6\u00d0\r\u00b3\u000e\u00c8p\u00ee\u0084\u0017\u0081s\u00ddh\u00e4\u0080\u0081\tq+\u00fcq\u00cf\u001f2\u000b\u00b9\u00ee\u00f0\u00eb|\u0090bl";
                var5_15 = "T\u0012{\u0080\u00b9.\u00ba3\u00e4'\u00fa7F|\u00c1\u008e\u0004_.b8\u0010o\u0005\u008e\u00efj\u00ff\u0092^\u00b3\u001a\u00cd\u00d8\u00ac\u00a7\u00c4\u00c7\u0018\u0093s\u0083\u0019Z\u00afQ\u009f\u0000\u00cc\u0092\u00e3\u00b9fL6\u00d0\r\u00b3\u000e\u00c8p\u00ee\u0084\u0017\u0081s\u00ddh\u00e4\u0080\u0081\tq+\u00fcq\u00cf\u001f2\u000b\u00b9\u00ee\u00f0\u00eb|\u0090bl".length();
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
                    var4_14 = "\u0019\u00b4\u00f2\b\u00f1-\u0097\u00e9\u001b\u009e\u00e4os\u00a4'\u00eb";
                    var5_15 = "\u0019\u00b4\u00f2\b\u00f1-\u0097\u00e9\u001b\u009e\u00e4os\u00a4'\u00eb".length();
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
        lbg.j = var6_12;
        lbg.k = new Integer[13];
        lbg.U = m44.a("h", (long)2694887737267910704L, (long)var20);
        v15 = new String[lbg.c("n", (int)20786, (long)(2241446397629820703L ^ var20))];
        v15[0] = lbg.b("k", (int)26004, (long)(6680241800568493653L ^ var20));
        v15[1] = lbg.b("k", (int)1027, (long)(5719848118146906057L ^ var20));
        v15[2] = lbg.b("k", (int)6466, (long)(1889689811898706575L ^ var20));
        v15[3] = lbg.b("k", (int)10737, (long)(8000064421317155374L ^ var20));
        v15[4] = lbg.b("k", (int)21319, (long)(8809378932487151759L ^ var20));
        v15[5] = lbg.b("k", (int)21388, (long)(4593923132311429198L ^ var20));
        v15[lbg.c("n", (int)15191, (long)(6695843093230552444L ^ var20))] = lbg.b("k", (int)22215, (long)(3363974064980550920L ^ var20));
        v15[lbg.c("n", (int)31173, (long)(7836463469942917095L ^ var20))] = lbg.b("k", (int)1684, (long)(6189733109414606157L ^ var20));
        v15[lbg.c("n", (int)1650, (long)(4323899533777811537L ^ var20))] = lbg.b("k", (int)32636, (long)(476501166470122671L ^ var20));
        v15[lbg.c("n", (int)8837, (long)(4520426003875142828L ^ var20))] = lbg.b("k", (int)11813, (long)(1926258898187558382L ^ var20));
        v15[lbg.c("n", (int)3462, (long)(410748399778608046L ^ var20))] = lbg.b("k", (int)19281, (long)(2356668144900896927L ^ var20));
        v15[lbg.c("n", (int)10180, (long)(5664319866477713893L ^ var20))] = lbg.b("k", (int)1510, (long)(2101347403969574461L ^ var20));
        v15[lbg.c("n", (int)28945, (long)(3563860955767000894L ^ var20))] = lbg.b("k", (int)7352, (long)(7865982554010955618L ^ var20));
        v15[lbg.c("n", (int)12873, (long)(829079445564066917L ^ var20))] = lbg.b("k", (int)6764, (long)(4419937182251329964L ^ var20));
        v15[lbg.c("n", (int)7167, (long)(2310532375498565073L ^ var20))] = lbg.b("k", (int)20759, (long)(93729157633467102L ^ var20));
        v15[lbg.c("n", (int)17490, (long)(1079863899582593655L ^ var20))] = lbg.b("k", (int)16425, (long)(3700963094545331188L ^ var20));
        m44.a("o", (String[])v15, (long)2451864073956797708L, (long)var20);
    }

    public lbg(JFrame jFrame, long l10, String string, String string2, String object) {
        Object object2;
        long l11;
        long l12;
        long l13;
        long l14;
        long l15;
        long l16;
        long l17;
        block4: {
            block5: {
                long l18 = l10 = a ^ l10;
                l17 = l18 ^ 0xFCCF886E243L;
                l16 = l18 ^ 0x6AAC22AACE6FL;
                l15 = l18 ^ 0x2CDBB68355C7L;
                l14 = l18 ^ 0x58EC625ED838L;
                l13 = l18 ^ 0x26B8BF4C9651L;
                l12 = l18 ^ 0x8B8B9185F7AL;
                l11 = l18 ^ 0x3ED44071A2B5L;
                CallSite callSite = m44.a("i", (long)-8002692363365826668L, (long)l10);
                super(jFrame, string, true);
                CallSite callSite2 = callSite;
                try {
                    try {
                        object2 = jFrame;
                        if (callSite2 == null) break block4;
                        if (m44.a("v", (Object)object2, (long)-8066959980177499278L, (long)l10) != false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("i", (Object)n92, (long)-7805156889732869103L, (long)l10);
                    }
                    return;
                }
                catch (n9 n93) {
                    throw m44.a("i", (Object)n93, (long)-7805156889732869103L, (long)l10);
                }
            }
            object2 = m44.a("v", (Object)this, (long)-7799566854279486448L, (long)l10);
        }
        JFrame jFrame2 = object2;
        ah ah2 = new ah(jFrame2, l12);
        m44.a("v", (Object)jFrame2, (Object)ah2, (long)-8264061137218096724L, (long)l10);
        m44.a("u", (Object)this, (JLabel)new JLabel(string2), (long)-7870073827838505760L, (long)l10);
        Object[] objectArray = new Object[4];
        objectArray[3] = lbg.b("k", (int)13954, (long)(0x5C18ED00C173B2B1L ^ l10));
        objectArray[2] = l17;
        objectArray[1] = "<";
        objectArray[0] = object;
        object = m44.a("i", (Object)objectArray, (long)-8332540574407619192L, (long)l10);
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = lbg.b("k", (int)22247, (long)(0x1F657D429F01D2CDL ^ l10));
        objectArray2[2] = l17;
        objectArray2[1] = ">";
        objectArray2[0] = object;
        object = m44.a("i", (Object)objectArray2, (long)-8332540574407619192L, (long)l10);
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = lbg.b("k", (int)7758, (long)(0x465C05BB15531A7BL ^ l10));
        objectArray3[2] = l17;
        objectArray3[1] = m44.a("m", (long)-8338218355942045788L, (long)l10);
        objectArray3[0] = object;
        object = m44.a("i", (Object)objectArray3, (long)-8332540574407619192L, (long)l10);
        m44.a("u", (Object)this, (JEditorPane)new JEditorPane(), (long)-7932420720683645016L, (long)l10);
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-7932420720683645016L, (long)l10), (boolean)false, (long)-7799068229078675395L, (long)l10);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = object;
        objectArray4[1] = m44.a("w", (Object)this, (long)-7932420720683645016L, (long)l10);
        objectArray4[0] = l13;
        m44.a("i", (Object)objectArray4, (long)-8349302075184796722L, (long)l10);
        m44.a("v", (Object)jFrame2, (Object)m44.a("w", (Object)this, (long)-7870073827838505760L, (long)l10), (Object)lbg.b("k", (int)12008, (long)(0x21C31565704A2AC6L ^ l10)), (long)-7777368883379754143L, (long)l10);
        m44.a("v", (Object)jFrame2, (Object)new v(l11, (Component)((Object)m44.a("w", (Object)this, (long)-7932420720683645016L, (long)l10))), (Object)lbg.b("k", (int)8516, (long)(0x16CE17491097A56DL ^ l10)), (long)-7777368883379754143L, (long)l10);
        m44.a("u", (Object)this, (JButton)new JButton((String)((Object)lbg.b("k", (int)12737, (long)(0x66C576A32A19B5EAL ^ l10)))), (long)-7891452024019458564L, (long)l10);
        m44.a("v", (Object)jFrame2, (Object)m44.a("w", (Object)this, (long)-7891452024019458564L, (long)l10), (Object)lbg.b("k", (int)24284, (long)(0x53EA1B7A6338DAF4L ^ l10)), (long)-7777368883379754143L, (long)l10);
        m44.a("u", (Object)this, (JButton)new JButton((String)((Object)lbg.b("k", (int)20176, (long)(0x3A699FCD3AC0CAEFL ^ l10)))), (long)-8300146688732738490L, (long)l10);
        m44.a("v", (Object)jFrame2, (Object)m44.a("w", (Object)this, (long)-8300146688732738490L, (long)l10), (Object)lbg.b("k", (int)22467, (long)(0x6F24B2B01F7253F2L ^ l10)), (long)-7777368883379754143L, (long)l10);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l16;
        objectArray5[0] = lbg.b("k", (int)16667, (long)(0x2587C039C17CC53AL ^ l10));
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-8300146688732738490L, (long)l10), (Object)m44.a("i", (Object)objectArray5, (long)-8463501155031003051L, (long)l10), (long)-7608650673167273389L, (long)l10);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l15;
        objectArray6[0] = m44.a("m", (long)-7643779770141893919L, (long)l10);
        m44.a("v", (Object)ah2, (Object)objectArray6, (long)-8530780847808701022L, (long)l10);
        m44.a("v", (Object)this, (int)lbg.c("n", (int)9136, (long)(0x5FE27945DA6F2A77L ^ l10)), (int)lbg.c("n", (int)3227, (long)(0x5B1781B81DE78556L ^ l10)), (long)-8313659044746001374L, (long)l10);
        gq gq2 = new gq(this);
        m44.a("v", (Object)this, (Object)gq2, (long)-8055288940898478625L, (long)l10);
        i5 i52 = new i5(this);
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-7891452024019458564L, (long)l10), (Object)i52, (long)-8079412829896116509L, (long)l10);
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-8300146688732738490L, (long)l10), (Object)i52, (long)-8079412829896116509L, (long)l10);
        ne ne2 = new ne(this);
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-7891452024019458564L, (long)l10), (Object)ne2, (long)-8387941041454847856L, (long)l10);
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-8300146688732738490L, (long)l10), (Object)ne2, (long)-8387941041454847856L, (long)l10);
        CallSite callSite = m44.a("v", (Object)this, (long)-7791332771150801114L, (long)l10);
        CallSite callSite3 = m44.a("v", (Object)jFrame, (long)-8413527810399222914L, (long)l10);
        CallSite callSite4 = m44.a("v", (Object)jFrame, (long)-8549763138417854071L, (long)l10);
        Object object3 = m44.a("w", (Object)callSite4, (long)-8345473232389951064L, (long)l10) / 2 - m44.a("w", (Object)callSite, (long)-8345473232389951064L, (long)l10) / 2 + m44.a("w", (Object)callSite3, (long)-8302405099889601016L, (long)l10);
        Object object4 = m44.a("w", (Object)callSite4, (long)-7959240859797806471L, (long)l10) / 2 - m44.a("w", (Object)callSite, (long)-7959240859797806471L, (long)l10) / 2 + m44.a("w", (Object)callSite3, (long)-7769191868375064743L, (long)l10);
        object3 = Math.max(0, (int)object3);
        object4 = Math.max(0, (int)object4);
        m44.a("v", (Object)this, (int)object3, (int)object4, (long)-8336082607702916844L, (long)l10);
        Object[] objectArray7 = new Object[3];
        objectArray7[2] = true;
        objectArray7[1] = this;
        objectArray7[0] = l14;
        m44.a("i", (Object)objectArray7, (long)-8070028910756571545L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void k(Object[] var0) {
        block14: {
            block13: {
                var6_1 = (JFrame)var0[0];
                var7_2 = (String)var0[1];
                var2_3 = (Long)var0[2];
                var1_4 = (String)var0[3];
                var5_5 = (String)var0[4];
                var4_6 = (Boolean)var0[5];
                var8_7 = (var2_3 = lbg.a ^ var2_3) ^ 62560642596777L;
                var11_8 = new lbu(var6_1, var7_2, var1_4, var5_5);
                var10_9 = m44.a("k", (long)5315074178111235750L, (long)var2_3);
                try {
                    v0 /* !! */  = var4_6;
                    if (var10_9 == null) break block13;
                    if (v0 /* !! */ ) {
                    }
                    ** GOTO lbl46
                }
                catch (InterruptedException v1) {
                    throw m44.a("k", (Object)v1, (long)5376406622341254435L, (long)var2_3);
                }
                v0 /* !! */  = m44.a("k", (long)5321854526695335178L, (long)var2_3);
            }
            try {
                if (v0 /* !! */ ) ** GOTO lbl38
                m44.a("k", (Object)var11_8, (long)5954215070972498253L, (long)var2_3);
                break block14;
            }
            catch (n9 v2) {
                throw m44.a("k", (Object)v2, (long)5376406622341254435L, (long)var2_3);
            }
            {
                catch (InterruptedException var12_10) {
                }
                catch (InvocationTargetException var12_11) {
                    try {
                        try {
                            block15: {
                                v3 = var10_9;
                                if (var2_3 > 0L) {
                                    if (v3 != null) break block14;
                                }
                                break block15;
lbl38:
                                // 2 sources

                                new lbg(var6_1, var8_7, var7_2, var1_4, var5_5);
                                v3 = var10_9;
                            }
                            if (v3 != null) break block14;
                        }
                        catch (InterruptedException v4) {
                            throw m44.a("k", (Object)v4, (long)5376406622341254435L, (long)var2_3);
                        }
lbl46:
                        // 2 sources

                        m44.a("k", (Object)var11_8, (long)5739025290326854136L, (long)var2_3);
                    }
                    catch (InterruptedException v5) {
                        throw m44.a("k", (Object)v5, (long)5376406622341254435L, (long)var2_3);
                    }
                }
            }
        }
    }

    @Override
    public void O(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        m44.a("t", (Object)this, (boolean)false, (long)-323324272626195480L, (long)l10);
        m44.a("t", (Object)this, (long)-2127575909263387920L, (long)l10);
    }

    public void M(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-3350009093214091328L, (long)l10), (long)-3472174477778422377L, (long)l10);
        m44.a("v", (Object)m44.a("w", (Object)this, (long)-3350009093214091328L, (long)l10), (long)-3227931138392405861L, (long)l10);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x1B11;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lbg", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l10 >>> 56);
            for (int i10 = 1; i10 < 8; ++i10) {
                byArray[i10] = (byte)(l10 << i10 * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n11].getBytes("ISO-8859-1");
            lbg.c[n11] = lbg.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = lbg.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lbg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x16F2;
        if (k[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = j[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])l.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/lbg", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lbg.k[n11] = n12;
        }
        return k[n11];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = lbg.c(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/lbg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lbg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lbg.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

