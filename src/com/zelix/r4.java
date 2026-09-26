/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.ah;
import com.zelix.fc;
import com.zelix.kd;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import com.zelix.rh;
import com.zelix.snp;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JButton;
import javax.swing.JFrame;

public class r4
extends rh
implements ActionListener {
    static String[] P;
    JButton u;
    snp d;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map e;

    public r4(JFrame jFrame, String string, long l, kd kd2) {
        string = "About Zelix KlassMaster Unlimited";
        long l2 = l = a ^ l;
        long l3 = l2 ^ 0x5B8EF59076E2L;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 48);
        int n3 = (int)(l3 << 48 >>> 48);
        long l4 = l2 ^ 0x3CFCD46F1158L;
        long l5 = l2 ^ 0x374C4E354CEDL;
        super(n, jFrame, string, (short)n2, true, (char)n3);
        Object[] objectArray = new Object[5];
        objectArray[4] = kd2;
        objectArray[3] = r4.b("g", (int)6882, (long)(0x2C459FB0CB3C512EL ^ l));
        objectArray[2] = l4;
        objectArray[1] = r4.b("g", (int)24771, (long)(0x68237DC82C4B2B04L ^ l));
        objectArray[0] = r4.b("g", (int)28488, (long)(0x75EE368B15352480L ^ l));
        m44.a("p", (Object)this, (Object)objectArray, (long)-8287495916992264164L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l5;
        m44.a("p", (Object)this, (Object)objectArray2, (long)-8140716912877436158L, (long)l);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        long l = a ^ 0x6906B6FC5A0EL;
        long l2 = l ^ 0x87D6EF8F731L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        m44.a("u", (Object)this, (Object)objectArray, (long)2763968546992988897L, (long)l);
    }

    public void n(Object[] objectArray) {
        long l;
        block17: {
            r4 r42;
            block18: {
                CallSite callSite;
                ah ah2;
                long l2;
                long l3;
                block15: {
                    CallSite callSite2;
                    CallSite callSite3;
                    long l4;
                    block16: {
                        block13: {
                            block14: {
                                String string = (String)objectArray[0];
                                String string2 = (String)objectArray[1];
                                l = (Long)objectArray[2];
                                String string3 = (String)objectArray[3];
                                kd kd2 = (kd)objectArray[4];
                                long l5 = l = a ^ l;
                                l3 = l5 ^ 0x68326321DCECL;
                                l2 = l5 ^ 0x69273F4A3082L;
                                l4 = l5 ^ 0x355E8F88FB5L;
                                long l6 = l5 ^ 0x2858E04D0F2FL;
                                long l7 = l5 ^ 0x4D4430D13A3FL;
                                callSite3 = m44.a("s", (Object)this, (long)-882641999340825035L, (long)l);
                                CallSite callSite4 = m44.a("l", (long)-866593575167294199L, (long)l);
                                ah2 = new ah((Container)((Object)callSite3), l7);
                                m44.a("s", (Object)callSite3, (Object)ah2, (long)-1723350530672536343L, (long)l);
                                m44.a("p", (Object)this, (snp)new snp(l6, string, string2, string3, kd2), (long)-788126614903552252L, (long)l);
                                callSite2 = callSite4;
                                try {
                                    try {
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l4;
                                        callSite = m44.a("s", (Object)m44.a("r", (Object)this, (long)-788126614903552252L, (long)l), (Object)objectArray2, (long)-1584263074985452535L, (long)l);
                                        if (callSite2 != null) break block13;
                                        if (callSite != false) break block14;
                                    }
                                    catch (n9 n92) {
                                        throw m44.a("l", (Object)((Object)n92), (long)-717762243593607168L, (long)l);
                                    }
                                    m44.a("s", (Object)callSite3, (Object)m44.a("h", (long)-658513151256854408L, (long)l), (long)-623014344558859272L, (long)l);
                                }
                                catch (n9 n93) {
                                    throw m44.a("l", (Object)((Object)n93), (long)-717762243593607168L, (long)l);
                                }
                            }
                            Object[] objectArray3 = new Object[1];
                            objectArray3[0] = l4;
                            callSite = m44.a("s", (Object)m44.a("r", (Object)this, (long)-788126614903552252L, (long)l), (Object)objectArray3, (long)-1584263074985452535L, (long)l);
                        }
                        try {
                            try {
                                if (l <= 0L || callSite2 != null) break block15;
                                if (callSite != false) break block16;
                            }
                            catch (n9 n94) {
                                throw m44.a("l", (Object)((Object)n94), (long)-717762243593607168L, (long)l);
                            }
                            m44.a("s", (Object)this, (Object)m44.a("h", (long)-658513151256854408L, (long)l), (long)-1203962501833540397L, (long)l);
                            m44.a("s", (Object)this, (Object)m44.a("h", (long)-1607269216551659717L, (long)l), (long)-1216944927974598297L, (long)l);
                        }
                        catch (n9 n95) {
                            throw m44.a("l", (Object)((Object)n95), (long)-717762243593607168L, (long)l);
                        }
                    }
                    try {
                        m44.a("s", (Object)callSite3, (Object)m44.a("r", (Object)this, (long)-788126614903552252L, (long)l), (Object)r4.b("g", (int)7984, (long)(0x2A8011B1EC06AB92L ^ l)), (long)-1057086110558040540L, (long)l);
                        m44.a("p", (Object)this, (JButton)new JButton((String)((Object)r4.b("g", (int)2332, (long)(0x251A7C90E4463DB3L ^ l)))), (long)-656026320363908455L, (long)l);
                        m44.a("s", (Object)m44.a("r", (Object)this, (long)-656026320363908455L, (long)l), (Object)this, (long)-1234749440927953451L, (long)l);
                        m44.a("s", (Object)callSite3, (Object)m44.a("r", (Object)this, (long)-656026320363908455L, (long)l), (Object)r4.b("g", (int)25876, (long)(0x1BC267DCF68D51B9L ^ l)), (long)-1057086110558040540L, (long)l);
                        if (l < 0L) break block17;
                        r42 = this;
                        if (callSite2 != null) break block18;
                        Object[] objectArray4 = new Object[1];
                        objectArray4[0] = l4;
                        callSite = m44.a("s", (Object)m44.a("r", (Object)r42, (long)-788126614903552252L, (long)l), (Object)objectArray4, (long)-1584263074985452535L, (long)l);
                    }
                    catch (n9 n96) {
                        throw m44.a("l", (Object)((Object)n96), (long)-717762243593607168L, (long)l);
                    }
                }
                try {
                    if (callSite == false) {
                        m44.a("s", (Object)m44.a("r", (Object)this, (long)-656026320363908455L, (long)l), (Object)m44.a("h", (long)-658513151256854408L, (long)l), (long)-1134817897298255625L, (long)l);
                        m44.a("s", (Object)m44.a("r", (Object)this, (long)-656026320363908455L, (long)l), (Object)m44.a("h", (long)-1607269216551659717L, (long)l), (long)-1158674272831904103L, (long)l);
                    }
                }
                catch (n9 n97) {
                    throw m44.a("l", (Object)((Object)n97), (long)-717762243593607168L, (long)l);
                }
                Object[] objectArray5 = new Object[2];
                objectArray5[1] = l2;
                objectArray5[0] = m44.a("h", (long)-630807773065055268L, (long)l);
                m44.a("s", (Object)ah2, (Object)objectArray5, (long)-1379840944032876313L, (long)l);
                Object[] objectArray6 = new Object[2];
                objectArray6[1] = l3;
                objectArray6[0] = this;
                m44.a("l", (Object)objectArray6, (long)-1516605079246463724L, (long)l);
                r42 = this;
            }
            m44.a("s", (Object)r42, (boolean)false, (long)-608619110864695816L, (long)l);
        }
        fc fc2 = new fc(this);
        m44.a("s", (Object)m44.a("r", (Object)this, (long)-656026320363908455L, (long)l), (Object)fc2, (long)-1538703666468908122L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                r4.a = prr.a((long)-8369157182990850792L, (long)6744490272090638236L, MethodHandles.lookup().lookupClass()).a(268892480605633L);
                var9 = r4.a ^ 52099568322930L;
                r4.e = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[11];
                var5_4 = 0;
                var4_5 = "\u001c\u00bf,\rM\u00f5\u00e7\u00ea\u0084\u00de\u00a3\u0091\u00c7-:\u0091o\u0082N\u00b0\u00ae\u00c3\u0019\u0096@\u0000\u0012\u0094f\"(\u008e\u009a\u0016*2\u00f1\u00d6\u008b\u0014,\u00b3\u0081\t\u008cd\u00b9\u00b2\u00d3Y\u00c2\u0097_\u00ab\u00a6.E\u00b4$\u00a5\u00f3\u0092]\u0082\u00cat\u001d\u000b\u0093\u0000\u00bf\u0083\u00f9\u007f]\u00e0e.\u00a2\u0084\u0097;\u0089\u008e\u00dd\u0099\u000b\u00ad\u0081 \u00b0VP\u009d%(\u0000\u00c7\n\u00011y\t3^\u00a7-\u00d2\u0091>2K_\u00eb0\u0091\u0006\u00cf8\u00f6\u00d8`0\u00cf\u00be\u00da\u00da\u0087\u0084J\u00e7\bf\u0085`\u0016(\fD\u00c4\u00dbv\u00d2>\u0007\u0014\u00c4X\u00d5#\u00b3@#M\u0088\rg\u0087pq:\u00fc\u00f4\u001d\u00ed\u00d6\u0015\u0099w\u0089\u0019(n\u00c98\u000f\u00f2\u00de5\u009f+W\u00a4L\u0097\u009ay\u00bf\u008e!\u0003\u00ef\u001a\u001e\u00e2v8%n\u0093\u00eb\u00c1\u0003\f\u00d2^\u00fd\u00c5\u00b0\f\u00c9\u00db8\u0083_\u001d\u0010\u00e5\u00c9\u00cb\u00fd\u009e\u0095\u00a3#\u009a\u00e3\u00fc\u00b8ZO,\u0013We\u00e9I\u00dc\u0099\"\u00e0\u0092s(l\u00c2\u00ff1K\u001c\u0014G \u0091\u00d0\u00ed\u0098\u00ca\u00fe\u00eb`\u0000E\u0098x\u00e4\u0098\u00e2\u00fb \u00b4uB\u00f1\u00f4\u001f!\u00e5\u0081\u001d\u0000\u00bcJ#\u00c2\\d;l\u0090\u00db?\u00f4\u00bb(\u00a2\u00bdX\u00e9)2\u00b3 w`\u00ef\u008d\u00b2\u0017\u009d]\u00b8(7\u00c2-5j\u00cf\u00bd\u008c\u00861\u00d6\u00f481L\u00eaxs_\u0093;n\u0010P\u00fa\u000f\u0001\u00e9\u0095\u00e3q\u00fd\u008cp\u00d5\u008a\u0081\\#";
                var6_6 = "\u001c\u00bf,\rM\u00f5\u00e7\u00ea\u0084\u00de\u00a3\u0091\u00c7-:\u0091o\u0082N\u00b0\u00ae\u00c3\u0019\u0096@\u0000\u0012\u0094f\"(\u008e\u009a\u0016*2\u00f1\u00d6\u008b\u0014,\u00b3\u0081\t\u008cd\u00b9\u00b2\u00d3Y\u00c2\u0097_\u00ab\u00a6.E\u00b4$\u00a5\u00f3\u0092]\u0082\u00cat\u001d\u000b\u0093\u0000\u00bf\u0083\u00f9\u007f]\u00e0e.\u00a2\u0084\u0097;\u0089\u008e\u00dd\u0099\u000b\u00ad\u0081 \u00b0VP\u009d%(\u0000\u00c7\n\u00011y\t3^\u00a7-\u00d2\u0091>2K_\u00eb0\u0091\u0006\u00cf8\u00f6\u00d8`0\u00cf\u00be\u00da\u00da\u0087\u0084J\u00e7\bf\u0085`\u0016(\fD\u00c4\u00dbv\u00d2>\u0007\u0014\u00c4X\u00d5#\u00b3@#M\u0088\rg\u0087pq:\u00fc\u00f4\u001d\u00ed\u00d6\u0015\u0099w\u0089\u0019(n\u00c98\u000f\u00f2\u00de5\u009f+W\u00a4L\u0097\u009ay\u00bf\u008e!\u0003\u00ef\u001a\u001e\u00e2v8%n\u0093\u00eb\u00c1\u0003\f\u00d2^\u00fd\u00c5\u00b0\f\u00c9\u00db8\u0083_\u001d\u0010\u00e5\u00c9\u00cb\u00fd\u009e\u0095\u00a3#\u009a\u00e3\u00fc\u00b8ZO,\u0013We\u00e9I\u00dc\u0099\"\u00e0\u0092s(l\u00c2\u00ff1K\u001c\u0014G \u0091\u00d0\u00ed\u0098\u00ca\u00fe\u00eb`\u0000E\u0098x\u00e4\u0098\u00e2\u00fb \u00b4uB\u00f1\u00f4\u001f!\u00e5\u0081\u001d\u0000\u00bcJ#\u00c2\\d;l\u0090\u00db?\u00f4\u00bb(\u00a2\u00bdX\u00e9)2\u00b3 w`\u00ef\u008d\u00b2\u0017\u009d]\u00b8(7\u00c2-5j\u00cf\u00bd\u008c\u00861\u00d6\u00f481L\u00eaxs_\u0093;n\u0010P\u00fa\u000f\u0001\u00e9\u0095\u00e3q\u00fd\u008cp\u00d5\u008a\u0081\\#".length();
                var3_7 = 24;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = r4.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "Y\u0011\u00d7)DU{\u00e3\u000f\u00f4a\u0019-[\u00bc\u0006Mu\u000b\u00c9(\u00d2\u0017-.\u00b1v\u0004+\u00135\u00d0SD\u00d9\"E\u009e\"\u008ba\\fv>\u0019\u0014\u00dfS\u00d5\u00e9[\f\"\u00eb\u00a92\u00b9)e\u0006L['f\u0015\u00a1XP\u0018\u00f6\u0007_m\u00b8p:\u0098\u00de\u00f0 \u0092\u0010\u00e2\u00d5:=3\u0019\u0006;>\u00c5'\u00dcU7\u00d1\u00cb`\u00dd\u00b1\u00988\u0013\u00c5p\u00cd\u0088\u00e3\u00eb3\u0010\u0081\u00c3_Y\u009a\u0087\u0003\u00f1|\u00d5\u0006\u00b7\u00d8\u00c6\u0086\u00e3";
                    var6_6 = "Y\u0011\u00d7)DU{\u00e3\u000f\u00f4a\u0019-[\u00bc\u0006Mu\u000b\u00c9(\u00d2\u0017-.\u00b1v\u0004+\u00135\u00d0SD\u00d9\"E\u009e\"\u008ba\\fv>\u0019\u0014\u00dfS\u00d5\u00e9[\f\"\u00eb\u00a92\u00b9)e\u0006L['f\u0015\u00a1XP\u0018\u00f6\u0007_m\u00b8p:\u0098\u00de\u00f0 \u0092\u0010\u00e2\u00d5:=3\u0019\u0006;>\u00c5'\u00dcU7\u00d1\u00cb`\u00dd\u00b1\u00988\u0013\u00c5p\u00cd\u0088\u00e3\u00eb3\u0010\u0081\u00c3_Y\u009a\u0087\u0003\u00f1|\u00d5\u0006\u00b7\u00d8\u00c6\u0086\u00e3".length();
                    var3_7 = 112;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = r4.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        r4.b = var7_3;
        r4.c = new String[11];
        m44.a("m", (String[])new String[]{r4.b("g", (int)14617, (long)(3108160425454948494L ^ var9)), r4.b("g", (int)21853, (long)(2568075609051446478L ^ var9)), r4.b("g", (int)1953, (long)(4573642074609380919L ^ var9)), r4.b("g", (int)6281, (long)(6456844817436504349L ^ var9)), r4.b("g", (int)8044, (long)(4331218158058632958L ^ var9))}, (long)3030015497284824814L, (long)var9);
    }

    private static n9 a(n9 n92) {
        return n92;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4ED6;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/r4", exception);
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
            r4.c[n2] = r4.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = r4.b(n, l);
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
            throw new RuntimeException("com/zelix/r4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(r4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
