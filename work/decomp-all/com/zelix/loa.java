/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._f;
import com.zelix.e_;
import com.zelix.lbc;
import com.zelix.lqu;
import com.zelix.lu4;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.qr;
import com.zelix.r1;
import com.zelix.wa;
import com.zelix.yf;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
import javax.swing.JFrame;

public class loa
implements Runnable {
    final Vector L;
    final qr k;
    final yf q;
    final lqu d;
    final e_ z;
    final lu4 m;
    final wa e;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map f;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void run() {
        block53: {
            block52: {
                block50: {
                    block48: {
                        block49: {
                            block47: {
                                block46: {
                                    block45: {
                                        block44: {
                                            v0 = var1_1 = loa.a ^ 96639444589035L;
                                            var3_2 = v0 ^ 5301224564579L;
                                            var5_3 = v0 ^ 92631784019587L;
                                            var7_4 = v0 ^ 102760772885646L;
                                            var9_5 = v0 ^ 97446402934268L;
                                            var11_6 = v0 ^ 97262919335634L;
                                            var13_7 = v0 ^ 120409843311659L;
                                            var15_8 = v0 ^ 94584874243944L;
                                            var17_9 = v0 ^ 101699320326925L;
                                            var19_10 = v0 ^ 12821366731813L;
                                            var21_11 = v0 ^ 130686101878155L;
                                            var23_12 = v0 ^ 30659798929468L;
                                            var26_13 = null;
                                            var25_14 = m44.a("k", (long)7567811804984123382L, (long)var1_1);
                                            try {
                                                var26_13 = new PrintWriter(new FileWriter((String)loa.a("m", (int)29207, (long)(1341980869234343962L ^ var1_1))));
                                            }
                                            catch (IOException var27_15) {
                                                block54: {
                                                    block43: {
                                                        v1 = this;
                                                        if (var25_14 != null) break block54;
                                                        try {
                                                            block55: {
                                                                if (m44.a("u", (Object)v1, (long)8474890382209776234L, (long)var1_1) == null) break block43;
                                                                break block55;
                                                                catch (IOException v2) {
                                                                    throw m44.a("k", (Object)v2, (long)8201924462786276241L, (long)var1_1);
                                                                }
                                                            }
                                                            v3 = new Object[3];
                                                            v3[2] = null;
                                                            v3[1] = var3_2;
                                                            v3[0] = false;
                                                            m44.a("t", (Object)m44.a("u", (Object)this, (long)8474890382209776234L, (long)var1_1), (Object)v3, (long)7583654497628562174L, (long)var1_1);
                                                        }
                                                        catch (IOException v4) {
                                                            throw m44.a("k", (Object)v4, (long)8201924462786276241L, (long)var1_1);
                                                        }
                                                    }
                                                    v1 = this;
                                                }
                                                v5 = var21_11;
                                                v6 = new Object[3];
                                                v6[2] = (String)loa.a("m", (int)31965, (long)(4781883274098953939L ^ var1_1)) + var27_15.getClass().getName();
                                                v6[1] = v5;
                                                v6[0] = loa.a("m", (int)31987, (long)(879752388719365887L ^ var1_1));
                                                m44.a("t", (Object)m44.a("u", (Object)v1, (long)8207826533797097356L, (long)var1_1), (Object)v6, (long)8089692389544339844L, (long)var1_1);
                                            }
                                            v7 = new Object[2];
                                            v7[1] = m44.a("u", (Object)this, (long)8421715543928253398L, (long)var1_1);
                                            v7[0] = var17_9;
                                            v8 = new Object[11];
                                            v8[10] = m44.a("u", (Object)this, (long)8415539927686996040L, (long)var1_1);
                                            v8[9] = m44.a("u", (Object)this, (long)8474890382209776234L, (long)var1_1);
                                            v8[8] = var5_3;
                                            v8[7] = m44.a("u", (Object)this, (long)8463509138462800180L, (long)var1_1);
                                            v8[6] = m44.a("u", (Object)this, (long)8207826533797097356L, (long)var1_1);
                                            v8[5] = var26_13;
                                            v8[4] = null;
                                            v8[3] = null;
                                            v8[2] = null;
                                            v8[1] = m44.a("u", (Object)this, (long)8185098195340148225L, (long)var1_1);
                                            v8[0] = m44.a("u", (Object)this, (long)7786808668597568033L, (long)var1_1);
                                            m44.a("t", (Object)m44.a("k", (Object)v7, (long)8420876345177105587L, (long)var1_1), (Object)v8, (long)7854877367943407777L, (long)var1_1);
                                            v9 = new Object[2];
                                            v9[1] = m44.a("u", (Object)this, (long)8421715543928253398L, (long)var1_1);
                                            v9[0] = var15_8;
                                            v10 = new Object[1];
                                            v10[0] = var23_12;
                                            m44.a("t", (Object)m44.a("k", (Object)v9, (long)8348598749787563886L, (long)var1_1), (Object)v10, (long)7767841180829106410L, (long)var1_1);
                                            v11 = new Object[2];
                                            v11[1] = m44.a("u", (Object)this, (long)8421715543928253398L, (long)var1_1);
                                            v11[0] = var9_5;
                                            var27_16 = (_f)m44.a("t", (Object)m44.a("k", (Object)v11, (long)7876282423991461964L, (long)var1_1), (Object)new Object[0], (long)7680590516789053068L, (long)var1_1);
                                            try {
                                                v12 = var27_16;
                                                if (var25_14 != null) break block44;
                                                if (v12 == null) break block45;
                                            }
                                            catch (IOException v13) {
                                                throw m44.a("k", (Object)v13, (long)8201924462786276241L, (long)var1_1);
                                            }
                                            v12 = var27_16;
                                        }
                                        v14 = new Object[1];
                                        v14[0] = var7_4;
                                        m44.a("t", (Object)v12, (Object)v14, (long)8151374809186530517L, (long)var1_1);
                                    }
                                    try {
                                        v15 = var26_13;
                                        if (var25_14 != null) break block46;
                                        if (v15 == null) break block47;
                                    }
                                    catch (IOException v16) {
                                        throw m44.a("k", (Object)v16, (long)8201924462786276241L, (long)var1_1);
                                    }
                                    v15 = var26_13;
                                }
                                m44.a("t", (Object)v15, (long)8556497683110053065L, (long)var1_1);
                            }
                            var28_17 = null;
                            var28_17 = new BufferedReader(new FileReader((String)loa.a("m", (int)3302, (long)(4305650924776275692L ^ var1_1))));
                            m44.a("t", (Object)var28_17, (int)1, (long)7637267458584033721L, (long)var1_1);
                            v17 = var28_17;
                            if (var25_14 != null) break block48;
                            try {
                                block56: {
                                    if (m44.a("t", (Object)v17, (long)7813129512542271285L, (long)var1_1) == -1) break block49;
                                    break block56;
                                    catch (IOException v18) {
                                        throw m44.a("k", (Object)v18, (long)8201924462786276241L, (long)var1_1);
                                    }
                                }
                                m44.a("t", (Object)var28_17, (long)8370566043224722834L, (long)var1_1);
                                new r1((JFrame)m44.a("u", (Object)this, (long)8421715543928253398L, (long)var1_1), var19_10, (String)loa.a("m", (int)23202, (long)(7326527026238941357L ^ var1_1)), (String)loa.a("m", (int)6653, (long)(5072283317906090998L ^ var1_1)), var28_17, false, true, false);
                            }
                            catch (IOException v19) {
                                throw m44.a("k", (Object)v19, (long)8201924462786276241L, (long)var1_1);
                            }
                        }
                        v17 = var28_17;
                    }
                    try {
                        if (var25_14 == null) {
                            if (v17 == null) break block50;
                        }
                        ** GOTO lbl141
                    }
                    catch (IOException v20) {
                        throw m44.a("k", (Object)v20, (long)8201924462786276241L, (long)var1_1);
                    }
                    try {
                        v17 = var28_17;
lbl141:
                        // 2 sources

                        m44.a("t", (Object)v17, (long)7682547654808066783L, (long)var1_1);
                    }
                    catch (IOException var29_18) {}
                    break block50;
                    catch (FileNotFoundException var29_19) {
                        try {
                            v21 = var28_17;
                            if (var25_14 == null) {
                                if (v21 == null) break block50;
                            }
                            ** GOTO lbl156
                        }
                        catch (IOException v22) {
                            throw m44.a("k", (Object)v22, (long)8201924462786276241L, (long)var1_1);
                        }
                        try {
                            v21 = var28_17;
lbl156:
                            // 2 sources

                            m44.a("t", v21, (long)7682547654808066783L, (long)var1_1);
                        }
                        catch (IOException var29_20) {}
                    }
                    catch (IOException var29_21) {
                        new lbc((Frame)m44.a("u", (Object)this, (long)8421715543928253398L, (long)var1_1), (String)loa.a("m", (int)7677, (long)(4007978019624202229L ^ var1_1)), var11_6, (String)loa.a("m", (int)5482, (long)(7017288428752676707L ^ var1_1)) + var29_21.getClass().getName());
                        v23 = var28_17;
                        if (var25_14 != null) ** GOTO lbl187
                        {
                            catch (Throwable var30_23) {
                                block51: {
                                    try {
                                        v24 = var28_17;
                                        if (var25_14 == null) {
                                            if (v24 == null) break block51;
                                        }
                                        ** GOTO lbl178
                                    }
                                    catch (IOException v25) {
                                        throw m44.a("k", (Object)v25, (long)8201924462786276241L, (long)var1_1);
                                    }
                                    try {
                                        v24 = var28_17;
lbl178:
                                        // 2 sources

                                        m44.a("t", v24, (long)7682547654808066783L, (long)var1_1);
                                    }
                                    catch (IOException var31_24) {
                                        // empty catch block
                                    }
                                }
                                throw var30_23;
                            }
                        }
                        if (v23 == null) break block50;
                        try {
                            v23 = var28_17;
lbl187:
                            // 2 sources

                            m44.a("t", (Object)v23, (long)7682547654808066783L, (long)var1_1);
                        }
                        catch (IOException var29_22) {}
                    }
                }
                try {
                    try {
                        v26 = m44.a("u", (Object)this, (long)8474890382209776234L, (long)var1_1);
                        if (var25_14 != null) break block52;
                        if (v26 == null) break block53;
                    }
                    catch (IOException v27) {
                        throw m44.a("k", (Object)v27, (long)8201924462786276241L, (long)var1_1);
                    }
                    v26 = m44.a("u", (Object)this, (long)8474890382209776234L, (long)var1_1);
                }
                catch (IOException v28) {
                    throw m44.a("k", (Object)v28, (long)8201924462786276241L, (long)var1_1);
                }
            }
            v29 = new Object[1];
            v29[0] = var13_7;
            m44.a("t", (Object)v26, (Object)v29, (long)7948130664615869649L, (long)var1_1);
        }
    }

    loa(wa wa2, lu4 lu42, yf yf2, qr qr2, Vector vector, e_ e_2, lqu lqu2) {
        this.e = wa2;
        this.m = lu42;
        this.q = yf2;
        this.k = qr2;
        this.L = vector;
        this.z = e_2;
        this.d = lqu2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                loa.a = prr.a((long)-7548892148915696459L, (long)2180098097178646145L, MethodHandles.lookup().lookupClass()).a(202055363833673L);
                loa.f = new HashMap<K, V>(13);
                var0 = loa.a ^ 90693070226661L;
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
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "\u0011\u0086\u0097L\u00c3\u00afTf\u00b5?\u009d\u007fW\u00b8.\f\u008e\u0095x\u0004\u00e2\u00a4\u0004\u00e6\u00b6\u00f7\u00c4\u00ac#Xv<\u00b8\u001e\u00aeY\u0000\u00b6\u00a6\u0090\u00e5w,]\u0095\u001d)\u00d2{\u0095\u008a\u00d5\u0085\u00b8\u00c3\u00b7\u0000(L\u0007\u00ff\u0095\u00e8P\u00b4B\u0001\\\u00d1\rS$\u0010.N\u00ac\u0086D\u008e\u0014\u00c4\u00bc\u00f8\u008e/\u00ca\\\u00a2\u0002H|\u00b4\u00d9\u0094t\u0007,n\u00c2R\u009fuJ\u00cf\u001cL\u00a9\u0018\u00b7[\u00eb\u009atot\b|3q\u00d7\u0097HS\u0080\u00dc\t\u00be\u00b8\u0096\u00d4(\u00ad\u00a9\f\u0002\u0092H\u00a2y\u0084\u0012\u0080\u00b2\u0080\u0083;\u00a2\u00bd\u00ae\u00c4\u0099\u00dev\u008d\u00b2\u009b\r\u00c8\u00d4Mu\u00bf\u0018\u00b0\u00cc\u00e2\u00b2c\u00fcjz\u00f9[I\u00c1\u00d3\u001e[\u00b6\u0006\u0017a\u00da\u001e\u00c3d\u00d2 R\u0095]2\u00cf\b_7\u0081Qc\u0098\u00a4\u00f0\u00d5\u00e9\u00f5?\u008e\u00e3\u0088\u00bbT\u001b}\r[\u00eb\u0086\u00a9\u009b\u00aa\u0010$\u00e9SA\u001d\u00b7\u00da\u00bc1Rp\u00a3|\u0003\u0016~";
                var8_6 = "\u0011\u0086\u0097L\u00c3\u00afTf\u00b5?\u009d\u007fW\u00b8.\f\u008e\u0095x\u0004\u00e2\u00a4\u0004\u00e6\u00b6\u00f7\u00c4\u00ac#Xv<\u00b8\u001e\u00aeY\u0000\u00b6\u00a6\u0090\u00e5w,]\u0095\u001d)\u00d2{\u0095\u008a\u00d5\u0085\u00b8\u00c3\u00b7\u0000(L\u0007\u00ff\u0095\u00e8P\u00b4B\u0001\\\u00d1\rS$\u0010.N\u00ac\u0086D\u008e\u0014\u00c4\u00bc\u00f8\u008e/\u00ca\\\u00a2\u0002H|\u00b4\u00d9\u0094t\u0007,n\u00c2R\u009fuJ\u00cf\u001cL\u00a9\u0018\u00b7[\u00eb\u009atot\b|3q\u00d7\u0097HS\u0080\u00dc\t\u00be\u00b8\u0096\u00d4(\u00ad\u00a9\f\u0002\u0092H\u00a2y\u0084\u0012\u0080\u00b2\u0080\u0083;\u00a2\u00bd\u00ae\u00c4\u0099\u00dev\u008d\u00b2\u009b\r\u00c8\u00d4Mu\u00bf\u0018\u00b0\u00cc\u00e2\u00b2c\u00fcjz\u00f9[I\u00c1\u00d3\u001e[\u00b6\u0006\u0017a\u00da\u001e\u00c3d\u00d2 R\u0095]2\u00cf\b_7\u0081Qc\u0098\u00a4\u00f0\u00d5\u00e9\u00f5?\u008e\u00e3\u0088\u00bbT\u001b}\r[\u00eb\u0086\u00a9\u009b\u00aa\u0010$\u00e9SA\u001d\u00b7\u00da\u00bc1Rp\u00a3|\u0003\u0016~".length();
                var5_7 = 72;
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
                    var9_3[var7_4++] = loa.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00cc\u00ff{2?\u00d4\u00cc`\u00dfr\u008b\u00f7\u009a\u007f\u00f0\u00c8\u00c739\u0093\u00ae\u00f9\u00cf\u008c)\u0000\u00eb\u0010\u00ca\u00f8\u009c\u00b28R\u0010Vz\u0015\u00ce\u00bf\u00bc\u00b1\u009b\u00e4\u00c3\u00b5\u00ba\u00dd)\u0004W4\u00a0(&\u0015xF\u009et\u00d9\u009d\r1\u009dN\u00f3[\u00c5\u00f2\u00a4X\u00e9\u000e|\u0014\u00f5\u00f9\u0016\u001e\u00df\u0013+o\u00be\u00e6\u00ef\u00e1V";
                    var8_6 = "\u00cc\u00ff{2?\u00d4\u00cc`\u00dfr\u008b\u00f7\u009a\u007f\u00f0\u00c8\u00c739\u0093\u00ae\u00f9\u00cf\u008c)\u0000\u00eb\u0010\u00ca\u00f8\u009c\u00b28R\u0010Vz\u0015\u00ce\u00bf\u00bc\u00b1\u009b\u00e4\u00c3\u00b5\u00ba\u00dd)\u0004W4\u00a0(&\u0015xF\u009et\u00d9\u009d\r1\u009dN\u00f3[\u00c5\u00f2\u00a4X\u00e9\u000e|\u0014\u00f5\u00f9\u0016\u001e\u00df\u0013+o\u00be\u00e6\u00ef\u00e1V".length();
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
                    var9_3[var7_4++] = loa.a(var10_9).intern();
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
        loa.b = var9_3;
        loa.c = new String[8];
    }

    private static IOException a(IOException iOException) {
        return iOException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5285;
        if (c[n2] == null) {
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
                throw new RuntimeException("com/zelix/loa", exception);
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
            loa.c[n2] = loa.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = loa.a(n, l);
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
            throw new RuntimeException("com/zelix/loa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(loa.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
