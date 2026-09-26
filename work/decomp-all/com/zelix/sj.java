/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix._4;
import com.zelix.aw;
import com.zelix.eo;
import com.zelix.gu;
import com.zelix.h1;
import com.zelix.jf;
import com.zelix.js;
import com.zelix.l6q;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
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

public class sj
extends _4
implements eo {
    private jf[] X;
    private jf V;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    sj(_4 _42, h1 h12, long l, l6q l6q2) {
        int n;
        CallSite callSite;
        js js2;
        long l2;
        long l3;
        long l4;
        long l5;
        block18: {
            block19: {
                js js3;
                int n2;
                block16: {
                    block17: {
                        long l6 = l = a ^ l;
                        l5 = l6 ^ 0x282DC532A794L;
                        l4 = l6 ^ 0x2BAB64EE0CFEL;
                        l3 = l6 ^ 0x697E8B92C9DDL;
                        l2 = l6 ^ 0x92821D0AC9AL;
                        super(_42);
                        n2 = h12.readUnsignedShort();
                        js2 = _42.m(l3, n2);
                        callSite = m44.a("m", (long)-2678367690943394253L, (long)l);
                        try {
                            try {
                                js3 = js2;
                                if (callSite != false) break block16;
                                if (js3 != null) break block17;
                            }
                            catch (n9 n92) {
                                throw m44.a("m", (Object)((Object)n92), (long)-2511188817290581082L, (long)l);
                            }
                            throw new aw((String)((Object)m44.a("r", (Object)_42.G(l4), (long)l5, (long)-4555390095574421400L, (long)l)) + (String)((Object)sj.a("i", (int)21479, (long)(0x77BC7CE38AA46BD5L ^ l))) + n2 + (String)((Object)sj.a("i", (int)8817, (long)(0x2346FECACAC91A4BL ^ l))));
                        }
                        catch (n9 n93) {
                            throw m44.a("m", (Object)((Object)n93), (long)-2511188817290581082L, (long)l);
                        }
                    }
                    js3 = js2;
                }
                try {
                    try {
                        n = js3 instanceof jf;
                        if (callSite != false) break block18;
                        if (n != 0) break block19;
                    }
                    catch (n9 n94) {
                        throw m44.a("m", (Object)((Object)n94), (long)-2511188817290581082L, (long)l);
                    }
                    throw new aw((String)((Object)m44.a("r", (Object)_42.G(l4), (long)l5, (long)-4555390095574421400L, (long)l)) + (String)((Object)sj.a("i", (int)22171, (long)(0x955FBE96EBB6EAEL ^ l))) + n2 + (String)((Object)sj.a("i", (int)23109, (long)(0x5A96E2623C54E274L ^ l))) + js2.getClass().getName() + (String)((Object)sj.a("i", (int)1993, (long)(0x37D3C1814DDDBFFFL ^ l))));
                }
                catch (n9 n95) {
                    throw m44.a("m", (Object)((Object)n95), (long)-2511188817290581082L, (long)l);
                }
            }
            m44.a("q", (Object)((Object)this), (jf)((jf)js2), (long)-4183335767706803029L, (long)l);
            l6q2.t((Object)m44.a("s", (Object)((Object)this), (long)-4183335767706803029L, (long)l), (Object)this, l2);
            n = h12.readUnsignedShort();
        }
        int n3 = n;
        m44.a("q", (Object)((Object)this), (jf[])new jf[n3], (long)-4413776353586370092L, (long)l);
        int n4 = 0;
        while (n4 < n3) {
            Object object;
            block22: {
                js js4;
                int n5;
                block20: {
                    block21: {
                        n5 = h12.readUnsignedShort();
                        js2 = _42.m(l3, n5);
                        try {
                            try {
                                js4 = js2;
                                if (l < 0L || callSite != false) break block20;
                                if (js4 != null) break block21;
                            }
                            catch (n9 n96) {
                                throw m44.a("m", (Object)((Object)n96), (long)-2511188817290581082L, (long)l);
                            }
                            throw new aw((String)((Object)m44.a("r", (Object)_42.G(l4), (long)l5, (long)-4555390095574421400L, (long)l)) + (String)((Object)sj.a("i", (int)30034, (long)(0x3966FBFEDEA74D61L ^ l))) + n5 + (String)((Object)sj.a("i", (int)5348, (long)(0x32EC3266452EACD3L ^ l))));
                        }
                        catch (n9 n97) {
                            throw m44.a("m", (Object)((Object)n97), (long)-2511188817290581082L, (long)l);
                        }
                    }
                    js4 = js2;
                }
                try {
                    object = js4 instanceof jf;
                    if (l <= 0L) break block22;
                    if (!object) {
                        throw new aw((String)((Object)m44.a("r", (Object)_42.G(l4), (long)l5, (long)-4555390095574421400L, (long)l)) + (String)((Object)sj.a("i", (int)13709, (long)(0x634BEC1BB3208DBDL ^ l))) + n5 + (String)((Object)sj.a("i", (int)17655, (long)(0x6DFBAB7ECCCDFCCCL ^ l))) + js2.getClass().getName() + (String)((Object)sj.a("i", (int)7962, (long)(0x564D15CDD75FA72EL ^ l))));
                    }
                }
                catch (n9 n98) {
                    throw m44.a("m", (Object)((Object)n98), (long)-2511188817290581082L, (long)l);
                }
                m44.a("s", (Object)((Object)this), (long)-4413776353586370092L, (long)l)[n4] = (jf)js2;
                l6q2.t((Object)m44.a("s", (Object)((Object)this), (long)-4413776353586370092L, (long)l)[n4], (Object)this, l2);
                ++n4;
                object = callSite;
            }
            if (!object) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    void z(Object[] var1_1) {
        block18: {
            block19: {
                block17: {
                    var4_2 = (DataOutputStream)var1_1[0];
                    var5_3 = (Map)var1_1[1];
                    var2_4 = (Long)var1_1[2];
                    var2_4 = sj.a ^ var2_4;
                    var7_5 = (js)var5_3.get(m44.a("r", (Object)this, (long)-114590371198705870L, (long)var2_4));
                    var6_6 = m44.a("l", (long)-498249772959496099L, (long)var2_4);
                    try {
                        try {
                            if (var6_6 == false) break block17;
                            if (var7_5 != null) {
                            }
                            ** GOTO lbl24
                        }
                        catch (n9 v0) {
                            throw m44.a("l", (Object)v0, (long)-1819632431027384257L, (long)var2_4);
                        }
                        var4_2.writeShort(var7_5.E());
                    }
                    catch (n9 v1) {
                        throw m44.a("l", (Object)v1, (long)-1819632431027384257L, (long)var2_4);
                    }
                }
                try {
                    if (var2_4 < 0L) break block18;
                    if (var6_6 != false) break block19;
lbl24:
                    // 2 sources

                    var4_2.writeShort(m44.a("r", (Object)this, (long)-114590371198705870L, (long)var2_4).E());
                }
                catch (n9 v2) {
                    throw m44.a("l", (Object)v2, (long)-1819632431027384257L, (long)var2_4);
                }
            }
            var4_2.writeShort(((CallSite)m44.a("r", (Object)this, (long)-493646463443398067L, (long)var2_4)).length);
        }
        var8_7 = m44.a("r", (Object)this, (long)-493646463443398067L, (long)var2_4);
        var9_8 = ((CallSite)var8_7).length;
        var10_9 = 0;
        while (var10_9 < var9_8) {
            block21: {
                block22: {
                    block20: {
                        var11_10 = var8_7[var10_9];
                        var7_5 = (js)var5_3.get(m44.a("r", (Object)this, (long)-493646463443398067L, (long)var2_4));
                        try {
                            try {
                                v3 = var6_6;
                                if (var2_4 <= 0L) ** GOTO lbl54
                                if (v3 == false) break block20;
                                if (var7_5 != null) {
                                }
                                ** GOTO lbl56
                            }
                            catch (n9 v4) {
                                throw m44.a("l", (Object)v4, (long)-1819632431027384257L, (long)var2_4);
                            }
                            var4_2.writeShort(var7_5.E());
                        }
                        catch (n9 v5) {
                            throw m44.a("l", (Object)v5, (long)-1819632431027384257L, (long)var2_4);
                        }
                    }
                    try {
                        v3 = var6_6;
lbl54:
                        // 2 sources

                        if (var2_4 <= 0L) break block21;
                        if (v3 != false) break block22;
lbl56:
                        // 2 sources

                        var4_2.writeShort(var11_10.E());
                    }
                    catch (n9 v6) {
                        throw m44.a("l", (Object)v6, (long)-1819632431027384257L, (long)var2_4);
                    }
                }
                ++var10_9;
                v3 = var6_6;
            }
            if (v3 != false) continue;
        }
    }

    void z(gu gu2, long l) {
        long l2 = l ^ 0x66FDF08525FDL;
        CallSite callSite = m44.a("h", (long)6170399952317654249L, (long)l);
        gu2.K((js)m44.a("v", (Object)((Object)this), (long)5970808571274392454L, (long)l), (Object)this, l2, (Object)this.H());
        CallSite callSite2 = m44.a("v", (Object)((Object)this), (long)6166062587176533753L, (long)l);
        int n = ((CallSite)callSite2).length;
        CallSite callSite3 = callSite;
        for (int i = 0; i < n; ++i) {
            CallSite callSite4 = callSite2[i];
            gu2.K((js)callSite4, (Object)this, l2, (Object)this.H());
            if (callSite3 != false) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public void S(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.considerAsDoLoopStart(LoopIdentifier.java:383)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopIdentifier.identifyLoops1(LoopIdentifier.java:65)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at CfrApi.lambda$main$2(CfrApi.java:31)
         *     at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
         *     at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
         *     at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
         *     at java.base/java.lang.Thread.run(Thread.java:829)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void C(Object[] objectArray) {
        long l = (Long)objectArray[0];
        DataOutputStream dataOutputStream = (DataOutputStream)objectArray[1];
        l = a ^ l;
        CallSite callSite = m44.a("i", (long)8057110253389036343L, (long)l);
        dataOutputStream.writeShort(m44.a("w", (Object)((Object)this), (long)8139644552666468783L, (long)l).E());
        dataOutputStream.writeShort(((CallSite)m44.a("w", (Object)((Object)this), (long)8627489624915287248L, (long)l)).length);
        CallSite callSite2 = m44.a("w", (Object)((Object)this), (long)8627489624915287248L, (long)l);
        CallSite callSite3 = callSite;
        for (CallSite callSite4 : callSite2) {
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
                sj.a = prr.a((long)7442855804952200468L, (long)-8960638437553305023L, MethodHandles.lookup().lookupClass()).a(3783433764211L);
                sj.d = new HashMap<K, V>(13);
                var0 = sj.a ^ 4432672465532L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "F\u00d6\u00d0\u00cc\u0095\u00cc\r\u00a3\u00d5U\u001d\u008e\b\u0087}\u00d3\u00ce?&\u00bf\u00cf\u0080\u00fe\u00cc\u00d4\u0080\u00ee\u000b\u00c4h\u00b0\u00ec\u0087\u0000\u00d0\u00f1\u0084z\u000f\u00c2\u0084\u00d4\u0011\u00b3=>\u00e1\u0091~\u0089N\u00c2\u00dc`\u00f0\u00c6\"\u0087v\u00c3H\u00f2\u00ab\u00ccF\u0005\u0016\u000f-\u00db\u0098\u00dd\u00ac\u00f7<\u00c9n\u009f\u00843P\u00eb@\u00c3e\u00cd\u00a2\u00f7\u0087\u00a8f$\u001fR\b\u008a5\u001c\u0091\u00ff~\u00ec\u0001AK\u00cf\u009c\u00cd\u00c6\u00fcD&\u000f\u00e5\u00dbYU\u007fVQ\u00ef\u00d7g\u00b6\b\u00dc\u00e7\"3\u00bfw@ZdE\u00c0\u0098\u008c\u0018\u00f0\u00a24\u00b1\u00ac\u0098s\u0010\u00f5\u0017\u00f30\u0017G\u00ba\u00e2\u001d<xA\u00f9\u0089(@\"\u00f1\u00f9\u00cf\u00efZ\u00c2\u0095:\u00bb\r\u00bf\u007f\u00fb\u00d7\u0019iqt>)Bu\n\u001e@\u00f6H\u000b\u0019V\u00d1\u00a7\f\u00a2Q/\u00a7[\u0010\u0091Fv\u00fd\u0083\u0010\u00b2\u00e1\t\u00c7\nK_z\u008f\u00d0@f\u0017\u0090\u00d9\u0096\u0085\u0081\u00dc*\u001cO\u00c4?27F\u00ca\u008bWr\u00f3f\u00dc9RZ_e4\u00c0l\u0085\u00fc\u0099:\u00864\u0088\u008a\u00aeW\u001cvK\u00a03H\u0010T1\u00e3\u00d7S$!\u00d0}\u00d5\u00cc\u00a1\u007f\u00c4\u00bd\u000fHR\nJ\u00c2\u00c0\u00a9\u00c4\u00fb\u000b>7\u0093\u00fd%\u00f5\u00e3\u0084\u00e5zI\u0012\u0007\u0081\u008c\u00c1K\u008eg\u0085\u00f56\u00cf\u0087\u00b4\u009bK\u00af\u00c1\u0012\u00d9\u00f9\u00cf\u001a\u00d9\u00f1Y\u00e7\u0011\u00ea\u00d4{rsF\u00e3\u00b3j\u00fckP%n\u0093\u000f\u00c2\u00ba\u00b0\u0096b\u001c\u009a\u00ac@\u00a8\u00a7\u00d25\u00ab<zR\u0015\u00dd\bh\b\u0094\u00e1\u00af~\u00ac\u00c1\u00a6\u00d0\u00f2.\u0085x=b\u0019Xo\u00bf$\u008aT\u0016\u00ff\u00b8\u00aa\u00c2iha&r\u00cd?\u00ef\u00a0\u00e8\u008b\u00f6\u00f2\u00a1rm\u009bb\u00ce9\u00a6\u00efL\u0085\u0094(\u00f16\u00fd\u0012\u00c4\u00a8VK\u00cf\u009c\u009cl6\u0007c\u00ab\u009d\u00b0\u00c1<u\u00ba\u0087\u0005'k\u0001\u000e*\u00c2\u007f^\u00987\u00a5\u0005\u00a1p\u00e9,";
                var8_6 = "F\u00d6\u00d0\u00cc\u0095\u00cc\r\u00a3\u00d5U\u001d\u008e\b\u0087}\u00d3\u00ce?&\u00bf\u00cf\u0080\u00fe\u00cc\u00d4\u0080\u00ee\u000b\u00c4h\u00b0\u00ec\u0087\u0000\u00d0\u00f1\u0084z\u000f\u00c2\u0084\u00d4\u0011\u00b3=>\u00e1\u0091~\u0089N\u00c2\u00dc`\u00f0\u00c6\"\u0087v\u00c3H\u00f2\u00ab\u00ccF\u0005\u0016\u000f-\u00db\u0098\u00dd\u00ac\u00f7<\u00c9n\u009f\u00843P\u00eb@\u00c3e\u00cd\u00a2\u00f7\u0087\u00a8f$\u001fR\b\u008a5\u001c\u0091\u00ff~\u00ec\u0001AK\u00cf\u009c\u00cd\u00c6\u00fcD&\u000f\u00e5\u00dbYU\u007fVQ\u00ef\u00d7g\u00b6\b\u00dc\u00e7\"3\u00bfw@ZdE\u00c0\u0098\u008c\u0018\u00f0\u00a24\u00b1\u00ac\u0098s\u0010\u00f5\u0017\u00f30\u0017G\u00ba\u00e2\u001d<xA\u00f9\u0089(@\"\u00f1\u00f9\u00cf\u00efZ\u00c2\u0095:\u00bb\r\u00bf\u007f\u00fb\u00d7\u0019iqt>)Bu\n\u001e@\u00f6H\u000b\u0019V\u00d1\u00a7\f\u00a2Q/\u00a7[\u0010\u0091Fv\u00fd\u0083\u0010\u00b2\u00e1\t\u00c7\nK_z\u008f\u00d0@f\u0017\u0090\u00d9\u0096\u0085\u0081\u00dc*\u001cO\u00c4?27F\u00ca\u008bWr\u00f3f\u00dc9RZ_e4\u00c0l\u0085\u00fc\u0099:\u00864\u0088\u008a\u00aeW\u001cvK\u00a03H\u0010T1\u00e3\u00d7S$!\u00d0}\u00d5\u00cc\u00a1\u007f\u00c4\u00bd\u000fHR\nJ\u00c2\u00c0\u00a9\u00c4\u00fb\u000b>7\u0093\u00fd%\u00f5\u00e3\u0084\u00e5zI\u0012\u0007\u0081\u008c\u00c1K\u008eg\u0085\u00f56\u00cf\u0087\u00b4\u009bK\u00af\u00c1\u0012\u00d9\u00f9\u00cf\u001a\u00d9\u00f1Y\u00e7\u0011\u00ea\u00d4{rsF\u00e3\u00b3j\u00fckP%n\u0093\u000f\u00c2\u00ba\u00b0\u0096b\u001c\u009a\u00ac@\u00a8\u00a7\u00d25\u00ab<zR\u0015\u00dd\bh\b\u0094\u00e1\u00af~\u00ac\u00c1\u00a6\u00d0\u00f2.\u0085x=b\u0019Xo\u00bf$\u008aT\u0016\u00ff\u00b8\u00aa\u00c2iha&r\u00cd?\u00ef\u00a0\u00e8\u008b\u00f6\u00f2\u00a1rm\u009bb\u00ce9\u00a6\u00efL\u0085\u0094(\u00f16\u00fd\u0012\u00c4\u00a8VK\u00cf\u009c\u009cl6\u0007c\u00ab\u009d\u00b0\u00c1<u\u00ba\u0087\u0005'k\u0001\u000e*\u00c2\u007f^\u00987\u00a5\u0005\u00a1p\u00e9,".length();
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
                    var9_3[var7_4++] = sj.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0089\u0012d\u0013~\u0011]\u008c\u000b\u00f8\u00b4\u0010ceE_\u00aa\u00eb\u00f4}\u0000(\u00961\u00ad\u0082\u00b1\u00ba\u00e3;Rh\u00dc,Re-\u00e0\u00f3\u00b7\u00fb\u0089\u0013\u00c9\u001a\u00fe\u000bdQ*'\u00b0\"i\u00f2<\u00ab(P\u0000\u00f0G\u00aej\u0010\f\u009e\u00a1\u00cf$\u00f1)\u00df\u00aa\u0014^R\u00b9\u00f7Mp";
                    var8_6 = "\u0089\u0012d\u0013~\u0011]\u008c\u000b\u00f8\u00b4\u0010ceE_\u00aa\u00eb\u00f4}\u0000(\u00961\u00ad\u0082\u00b1\u00ba\u00e3;Rh\u00dc,Re-\u00e0\u00f3\u00b7\u00fb\u0089\u0013\u00c9\u001a\u00fe\u000bdQ*'\u00b0\"i\u00f2<\u00ab(P\u0000\u00f0G\u00aej\u0010\f\u009e\u00a1\u00cf$\u00f1)\u00df\u00aa\u0014^R\u00b9\u00f7Mp".length();
                    var5_7 = 64;
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
                    var9_3[var7_4++] = sj.a(var10_9).intern();
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
        sj.b = var9_3;
        sj.c = new String[10];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x69A0;
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
                throw new RuntimeException("com/zelix/sj", exception);
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
            sj.c[n2] = sj.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = sj.a(n, l);
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
            throw new RuntimeException("com/zelix/sj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(sj.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
