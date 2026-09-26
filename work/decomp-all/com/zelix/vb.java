/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vb
extends Canvas {
    private int h;
    private String B;
    private FontMetrics i;
    private boolean l;
    private int I;
    private int o;
    private Vector N;
    static int C;
    private static final long a;
    private static final String b;

    @Override
    public synchronized void setBounds(int n, int n2, int n3, int n4) {
        long l = a ^ 0x50148B44BF7BL;
        super.setBounds(n, n2, n3, n4);
        m44.a("s", (Object)this, (int)m44.a("q", (Object)m44.a("p", (Object)this, (long)-2230510776847783452L, (long)l), (long)-6560961415298450L, (long)l), (long)-493493364594506771L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public int q(Object[] var1_1) {
        block12: {
            block11: {
                block9: {
                    block10: {
                        var2_2 = (Long)var1_1[0];
                        var4_3 = (var2_2 = vb.a ^ var2_2) ^ 48002336564588L;
                        var6_4 = m44.a("l", (long)-5600853929683772127L, (long)var2_2);
                        try {
                            try {
                                v0 = this;
                                if (var6_4 == null) break block9;
                                if (m44.a("r", (Object)v0, (long)-5783650621381502157L, (long)var2_2) != false) break block10;
                            }
                            catch (n9 v1) {
                                throw m44.a("l", (Object)v1, (long)-5407918368201691441L, (long)var2_2);
                            }
                            v2 = new Object[1];
                            v2[0] = var4_3;
                            m44.a("s", (Object)this, (Object)v2, (long)-5494087516073694929L, (long)var2_2);
                        }
                        catch (n9 v3) {
                            throw m44.a("l", (Object)v3, (long)-5407918368201691441L, (long)var2_2);
                        }
                    }
                    v0 = this;
                }
                try {
                    v4 = m44.a("r", (Object)v0, (long)-6038682905877109024L, (long)var2_2);
                    if (var6_4 == null) break block11;
                    if (v4 == null) {
                    }
                    ** GOTO lbl35
                }
                catch (n9 v5) {
                    throw m44.a("l", (Object)v5, (long)-5407918368201691441L, (long)var2_2);
                }
                var7_5 = 0;
                try {
                    if (var6_4 != null) break block12;
lbl35:
                    // 2 sources

                    v4 = m44.a("r", (Object)this, (long)-6038682905877109024L, (long)var2_2);
                }
                catch (n9 v6) {
                    throw m44.a("l", (Object)v6, (long)-5407918368201691441L, (long)var2_2);
                }
            }
            var7_5 = v4.size() * (m44.a("r", (Object)this, (long)-5608519787955951570L, (long)var2_2) + m44.a("r", (Object)this, (long)-5766592021337494375L, (long)var2_2) + m44.a("h", (long)-5866533526202098560L, (long)var2_2));
        }
        return var7_5;
    }

    public vb(String string, long l, int n, Font font) {
        l = a ^ l;
        m44.a("w", (Object)this, (String)string, (long)-1340436111948874239L, (long)l);
        m44.a("w", (Object)this, (int)n, (long)-906643099869902431L, (long)l);
        m44.a("t", (Object)this, (Object)font, (long)-856166352175231431L, (long)l);
        m44.a("w", (Object)this, (FontMetrics)((Object)m44.a("t", (Object)this, (Object)m44.a("t", (Object)this, (long)-1415328211536386381L, (long)l), (long)-1161038168034931651L, (long)l)), (long)-810265231134177547L, (long)l);
        m44.a("w", (Object)this, (int)m44.a("t", (Object)m44.a("u", (Object)this, (long)-810265231134177547L, (long)l), (long)-661326242058386541L, (long)l), (long)-1651239575077735663L, (long)l);
        m44.a("w", (Object)this, (int)m44.a("t", (Object)m44.a("u", (Object)this, (long)-810265231134177547L, (long)l), (long)-638721418938689927L, (long)l), (long)-808425035007133786L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = prr.a((long)3275541598924240733L, (long)999212398998207955L, MethodHandles.lookup().lookupClass()).a(39724828013044L);
        long l = a ^ 0x14148F23BEBDL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00f4\u00be\u00dcND\u0080qe".getBytes("ISO-8859-1"));
                b = vb.a(byArray3).intern();
                m44.a("j", (int)1, (long)-134959575781372875L, (long)l);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @Override
    public Dimension getMinimumSize() {
        long l = a ^ 0x395C8606C4AL;
        long l2 = l ^ 0x2A695C38D1C9L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return new Dimension((int)m44.a("p", (Object)this, (long)3033053295572799708L, (long)l), (int)m44.a("q", (Object)this, (Object)objectArray, (long)3698736125786071025L, (long)l));
    }

    @Override
    public Dimension getPreferredSize() {
        long l = a ^ 0x75E1D2EDEB31L;
        return m44.a("r", (Object)this, (long)-6068282073606822474L, (long)l);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void paint(Graphics graphics) {
        vb vb2;
        CallSite callSite;
        long l;
        block5: {
            block6: {
                l = a ^ 0x5CFD45100C86L;
                long l2 = l ^ 0x76DA945C7E2L;
                callSite = m44.a("j", (long)5822003968261554095L, (long)l);
                try {
                    try {
                        vb2 = this;
                        if (callSite == null) break block5;
                        if (m44.a("t", (Object)vb2, (long)5562636732730145213L, (long)l) != false) break block6;
                    }
                    catch (n9 n92) {
                        throw m44.a("j", (Object)((Object)n92), (long)6232166185207254081L, (long)l);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l2;
                    m44.a("u", (Object)this, (Object)objectArray, (long)5858963516030520225L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("j", (Object)((Object)n93), (long)6232166185207254081L, (long)l);
                }
            }
            vb2 = this;
        }
        CallSite callSite2 = m44.a("u", (Object)vb2, (long)5978157617327512089L, (long)l);
        m44.a("u", (Object)graphics, (int)0, (int)0, (int)m44.a("t", (Object)callSite2, (long)5482495099879322003L, (long)l), (int)m44.a("t", (Object)callSite2, (long)5886284886155190850L, (long)l), (long)6079933867382643415L, (long)l);
        CallSite callSite3 = m44.a("t", (Object)this, (long)5810949954144766624L, (long)l);
        for (int i = 0; i < ((Vector)((Object)m44.a("t", (Object)this, (long)5673520827023574126L, (long)l))).size(); ++i) {
            void var8_7;
            String string = (String)((Vector)((Object)m44.a("t", (Object)this, (long)5673520827023574126L, (long)l))).elementAt(i);
            m44.a("u", (Object)graphics, (Object)string, (int)0, (int)var8_7, (long)5365617226347968486L, (long)l);
            var8_7 += m44.a("t", (Object)this, (long)5810949954144766624L, (long)l) + m44.a("t", (Object)this, (long)5581894933703183895L, (long)l) + m44.a("n", (long)5484203551459655182L, (long)l);
            if (callSite != null) continue;
        }
    }

    @Override
    public void invalidate() {
        long l = a ^ 0x3D9C3A5EBD36L;
        super.invalidate();
        m44.a("v", (Object)this, (boolean)false, (long)-251614699305187315L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void P(Object[] var1_1) {
        var2_2 = (Long)var1_1[0];
        var2_2 = vb.a ^ var2_2;
        v0 = m44.a("k", (long)-4277655026088514618L, (long)var2_2);
        m44.a("w", (Object)this, new Vector<E>(), (long)-2678168946825900025L, (long)var2_2);
        var5_3 = new StringTokenizer((String)m44.a("u", (Object)this, (long)-4558288562567687207L, (long)var2_2), vb.b, true);
        var6_4 = new StringBuffer();
        var7_5 = 0;
        var8_6 = var5_3.countTokens();
        var9_7 = 0;
        var4_8 = v0;
        while (var9_7 < var8_6) {
            block31: {
                block27: {
                    block30: {
                        block28: {
                            block29: {
                                block26: {
                                    block23: {
                                        block24: {
                                            block25: {
                                                var10_9 = var5_3.nextToken();
                                                try {
                                                    try {
                                                        try {
                                                            if (var2_2 <= 0L) break block23;
                                                            v1 = var10_9.equals("\n");
                                                            if (var4_8 == null) break block24;
                                                            if (v1 != 0) break block25;
                                                        }
                                                        catch (n9 v2) {
                                                            throw m44.a("k", (Object)v2, (long)-4461865971437905880L, (long)var2_2);
                                                        }
                                                        v3 /* !! */  = var10_9.equals("\r");
                                                        if (var4_8 == null) break block26;
                                                    }
                                                    catch (n9 v4) {
                                                        throw m44.a("k", (Object)v4, (long)-4461865971437905880L, (long)var2_2);
                                                    }
                                                    if (v3 /* !! */  != 0) {
                                                    }
                                                    ** GOTO lbl43
                                                }
                                                catch (n9 v5) {
                                                    throw m44.a("k", (Object)v5, (long)-4461865971437905880L, (long)var2_2);
                                                }
                                            }
                                            m44.a("u", (Object)this, (long)-2678168946825900025L, (long)var2_2).addElement(var6_4.toString());
                                            var6_4 = new StringBuffer();
                                            v1 = 0;
                                        }
                                        var7_5 = v1;
                                    }
                                    try {
                                        if (var2_2 <= 0L || var4_8 != null) break block27;
lbl43:
                                        // 2 sources

                                        v3 /* !! */  = m44.a("t", (Object)m44.a("u", (Object)this, (long)-2803146818615579859L, (long)var2_2), (Object)var10_9, (long)-2787309435530751208L, (long)var2_2);
                                    }
                                    catch (n9 v6) {
                                        throw m44.a("k", (Object)v6, (long)-4461865971437905880L, (long)var2_2);
                                    }
                                }
                                var11_10 = v3 /* !! */ ;
                                var7_5 += var11_10;
                                try {
                                    try {
                                        v7 = var7_5;
                                        v8 = var4_8;
                                        if (var2_2 >= 0L) {
                                            if (v8 == null) break block28;
                                            if (v7 > m44.a("u", (Object)this, (long)-2399697157521070983L, (long)var2_2)) break block29;
                                        }
                                        ** GOTO lbl74
                                    }
                                    catch (n9 v9) {
                                        throw m44.a("k", (Object)v9, (long)-4461865971437905880L, (long)var2_2);
                                    }
                                    var6_4.append(var10_9);
                                    if (var2_2 < 0L || var4_8 != null) break block27;
                                }
                                catch (n9 v10) {
                                    throw m44.a("k", (Object)v10, (long)-4461865971437905880L, (long)var2_2);
                                }
                            }
                            m44.a("u", (Object)this, (long)-2678168946825900025L, (long)var2_2).addElement(var6_4.toString());
                            var6_4 = new StringBuffer();
                            v7 = (int)var10_9.equals(" ");
                        }
                        try {
                            v8 = var4_8;
lbl74:
                            // 2 sources

                            if (v8 == null) break block30;
                            if (v7 == 0) {
                            }
                            ** GOTO lbl85
                        }
                        catch (n9 v11) {
                            throw m44.a("k", (Object)v11, (long)-4461865971437905880L, (long)var2_2);
                        }
                        var6_4.append(var10_9);
                        var7_5 = var11_10;
                        try {
                            if (var2_2 < 0L || var4_8 != null) break block27;
lbl85:
                            // 2 sources

                            v7 = 0;
                        }
                        catch (n9 v12) {
                            throw m44.a("k", (Object)v12, (long)-4461865971437905880L, (long)var2_2);
                        }
                    }
                    var7_5 = v7;
                }
                try {
                    if (var2_2 < 0L) break block31;
                    if (var9_7 == var8_6 - 1) {
                        m44.a("u", (Object)this, (long)-2678168946825900025L, (long)var2_2).addElement(var6_4.toString());
                    }
                }
                catch (n9 v13) {
                    throw m44.a("k", (Object)v13, (long)-4461865971437905880L, (long)var2_2);
                }
                m44.a("w", (Object)this, (boolean)true, (long)-2784585716261458476L, (long)var2_2);
                ++var9_7;
            }
            if (var4_8 != null) continue;
        }
    }

    @Override
    public void validate() {
        long l = a ^ 0x7CD82D572A2DL;
        super.validate();
        m44.a("v", (Object)this, (long)8464452132100377453L, (long)l);
    }

    @Override
    public void update(Graphics graphics) {
        long l = a ^ 0x547CC70609A5L;
        m44.a("v", (Object)this, (Object)graphics, (long)5777549023683892716L, (long)l);
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
}
