/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.g1;
import com.zelix.gs;
import com.zelix.m44;
import com.zelix.prr;
import com.zelix.u1;
import com.zelix.ur;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a_ {
    private static String E;
    private String S;
    private g1 I;
    private static String[] P;
    private String B;
    private String p;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /*
     * Exception decompiling
     */
    public a_(long var1_1, gs var3_2) {
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void X(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        try {
            if (m44.a("w", (Object)m44.a("v", (Object)this, (long)3596769740101884294L, (long)l), (Object)string, (long)3804919514792037564L, (long)l) == false) {
                throw new ur((String)((Object)a_.a("d", (int)1565, (long)(0x7980AF99ACF8384AL ^ l))) + (String)((Object)m44.a("v", (Object)this, (long)3561789301577369234L, (long)l)) + (String)((Object)a_.a("d", (int)3840, (long)(0x168EFFF569C13140L ^ l))) + string + (String)((Object)a_.a("d", (int)2863, (long)(0x6BBB3BDBB5703579L ^ l))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("h", (Object)illegalArgumentException, (long)3456355703587289669L, (long)l);
        }
    }

    String Q(Object[] objectArray) {
        long l = (Long)objectArray[0];
        String string = (String)objectArray[1];
        l = a ^ l;
        return (String)((Object)m44.a("r", (Object)m44.a("s", (Object)this, (long)5622593998462903915L, (long)l), (Object)string, (long)6021256837669815286L, (long)l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                a_.a = prr.a((long)-3666918368051450021L, (long)-1578332916542724114L, MethodHandles.lookup().lookupClass()).a(30909603362980L);
                var9 = a_.a ^ 69934923156950L;
                a_.d = new HashMap<K, V>(13);
                m44.a("l", null, (long)-883747682035344874L, (long)var9);
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
                var7_3 = new String[38];
                var5_4 = 0;
                var4_5 = "\u00079\u00f7l]g\u0094\u0014;\u0010\u000f\u001f\u00beJr\u00b4\u00ed\u0081\u00fdEs\u001at<\u00a9\u007f5]t\u00a0\u00f7\u00c1\u0010\u00fa=\u00d7\u00a9\u00a4\u00df\u00df\u00af[\u00c6Lg\u00f3CXp \u001e\u00c4\u00ed<)P\u00be\u00fb\u0080Z_%h\fd\u00d5S\u00c2Mzx\u00ec\u00feD\u00b5\u0015\u00b2{\u00b8*\u008aD /\u00b2\u00dc\u0095w\u00df\u00bdl\u0004\u00a6\u00eb\u00d1Z\u001fO\u0001\u009f\u009f2\u0093\u00ea\u00b6Im\t\u00ea\u00f71\u00be\u00b0\u00e2\b@\u009c#\u00a1iZJ\u0089\r\u0096\u00fc*\u0010~j\u0004-\u0087x<W\u00ac\u00a5'\u00cf/\u0081\u0081\u00e1d0\u009dp(.\u0084\u0086\u00e9c=\u00e2\u00e2T\u0016H\u00bd\u00be\u00c6\u00ed\u00d9\u00aci\u007f|\u0099X\n\u0010\u0080le\u009f\u001e\u0006((&\b\u00f0\u00079\u00d8\u00db\u00e6\u0086\u00c9)N7\u0006\u00b8p\u00a3\u00bfus}3O\u00dd\u00e6n!VyWc\u00c7Q}\\\u00bf\u00d5Fe}@\u001b\u0095\u009c\u00ea\u00fa\u00da\u00a6}Xu\u00c8m\u009e\u00ff\"#\u009e\u008b\u001b\u00d2jx\u0016\u00b0\u008d\u0006\u00b2\u00fc\u00ab(K2\u00f7#\u0080B\u00db\u00bdZQm\u0098\u0017\u009c\u00b2}\u00f6|%OV\u00a5t\u00b0\u0088\u008b\u0093hk\u001e\\6\u00cc\u008e\u0010\u00f3\u008a\u00d3\u0010\u00ca\u0090g\u00d2\u00fc{\u001bQ\u00d1\u00df\u0006u \u0094vq\u00de\u000f\u009fHm.\u00fb\u009b\u00e0h\u00000\u00daP{\u00a8\u00e7\u00fb\t%W8\f\u001a\u00d9\u008b\u00c0\u00e6L \u0085Gvy\u00e6\u0097Z2\u0096\u000bN\u001f:\u00c6\u00c3\u00fa\u0011)J\u001b\u00a7r`\u001a\u00e8\u001d\u00bc\u0012w\u00b1\u00a7\u00b4\u0018\u0010\u00e87\u00c7\u00a7\u00b1\u00d2\f\u009c\u0016\u00d2\u0081\u00daF\u0089s\u00ed\u00f4O\r\u00d9\u001e'\u0096(\u00c7nnM\u00c9\u00bc\u009ce\u00acC\u00fb\u00be\u00d3\u0091\u00a3\u00f1\u00bf\u00fe6\u0007y\u001f\u0085\u00ef\u00f9\u0087\u0090\u00dd\u00f6Y+H\u00fc\u00bc\u0014\u000e\u00f2\u0082\u00cf\u001b(E\u008c\"\u0001\u009c\u009d\t #\u00cd\u0080r\\\u00b2G\u00f6\u0081:\u0098\u0096T\u00d2\u008bsTe\u00eaQ\u009f\u009d\u009b/\b\u00b4\u00d6\u0099\u008e*o\u0088\u0010\u0088i\u0019\u00d2\u00b1x\u0089\u0088}\u00df6\u00ab\u00a6\u00e8\u0016)\u0010\u00c7\t\u00e0\u0093Q\u00b2\u00c4\u00c7\u009f\u0019\u0091b/o\\Y({\u00b3\u00a3\u0012w\u00db\u00c0D9/Y\u00f3j\u0000O\u00cbI\u00f92+\rg\u009cE\u00bbz\u008c\u00deU\u00aa\u00e4\u0097M\u00ec5\u00be5x\u00c7u\u00109k\u001bm\u00e3\u00f2\u00c5M\u00cdN]x\u00cd\u00e0F\u0087 \u00f5:\u00ad\u008e\u00f3\u0080\u00d4*\u00f6\u0083\u0001\u00faC\u00e5\u00edg\u00ad\u0001\u00c9\u00f6j\u00e6\u00bb@\u00ff\u0005\u00af\u001a\u00ea\u00f5\u00b4\u00e2\u0010A\u00cfB\u00c7\t\u008e\u001cR\u00ec\u00adx\u00aa<>\u00e4\u00d3\u0010\f\b'\u0015\u009a?\u00e9^\u00f4\u0007\u00cf)}=C\u0019(\u0096~\u00dc\u00c65\u00a7J\u00160\u00f0\u00a7M~\r\u00d02\u00cf\u00e4\u00c9\u00d4$\u00f7\f\u00acG\u0014\u00b2\u0096D\u001e\u00fb\u009c\u00b5K\u00bd/\u00b9\u00ef\u00fc\u00ce v\u0010\u00ac\u008b\u00cc\u00a0\td\u0002\u0004\u00ee\u000f\u0019{\u00b2-G]\u0014\u00c5\u008c\u00c1\u00a4\u00cd\u00bdY\u001ca\u0080o\u00b46 I6\u009e\u00cf\u0095\u009e**{\u0087\u0098\u00ec\u0080\u0001si\u00a3\u0019\u00a7\u009e<6I\u00b5\u00ffih\u0006^f\u00dc\u008d\u0018\u00f9\u00bd*\u0097{K*<\u00ec\u008f\b\u00caY\u00bd\u008c\u000e\u0002\u009397\u000e#\rr(fpV\\w+H\u00a4}=\u0010\u00a1\u00ffGskG\u0013\u00b5\u00e8\u00d9\u0090\u009c\u00e4l\u0087\u00f82I\u00f6w\u00b0\u00a2\u00ccb1\u00aat\u00fc\u00e6\u0018\u00f6\u00d5.\u0087\u00a4ZK\u00cb\u00baY\u00d4\u00d3\u0084w\n\u0017\u00eae\u0019a\u00b5\u0090\u00136 >\u00bbs\u00d2\u00f9\u00fa\tc\u000bq\u0002\u0010{\u00c4\u00a6\u0002\u00db\u00c7\u0086\u00d6\u00e9\u001b\u00e8\u00c4eY\u00f4z\u00b3\u00e6u\u008a 8\u00beM\u0086\"\u0017\u00b7u\u0082\u00d3g'\u0000\u00d4\u00d3\u0086j\u00e9\u0000\u00f0x\u0089\u00ed\u0092\u00fc\u0093\u000e\u0013@\u008a\u00b6\u00b0\u00106\u00dfm\u0007\r,\b\u0088\u008c\u00c0$\u00c5\u009dz\u00bd\u0090\u0018\u0012R\u0083\u00a1\u00f2\u00f4b\u009a\u00e8\u0086\u001b\u00d7\u00ad-;5\u00fe\u0095d\u00c8\u00ce\u008f\u0089#\u0010\u001bDM:\u00ecG[\u00faE0t\u001c\u00ba\u00c9dy@%\t\u000f_s\u00db\u00e9mW\u00eb%\u00b2\u00d5\u0090\u00bbo]\u0013u\\\b\u00e1\u00f9}_,\u00e3\u00fb\u008a+,\u00d1\u00f3\u00c2\u00d7\u00eb\u00e2\u0092A%\u00ad\u00d7\u00e8\u00fc\u000fG-\u00d6S9\u00b5K\u0012\u00be\b\u0001HJ\u0004\u0098\u0006/6\u00ec \u0093\u00a83/zZs \u00d8 \u00bcK\u00cf?\u008a\u00c4f\u0005\u0001\u00e9\u0011\u00bf\u00c0^\u00e3\u00ac@/\u00b0}\u00ba\u00a5\u0018\u00a6\u00c0\u0010\u00b7\u00887\u0087\u001e\u00c7W}\u0089\u0004\u00ba\u00e2\u00f9Z2\u00d8\u001f\u00e0\u00cf3#(\fY\u00d86pB\u000ei\u00d2\u0017\u00ba\u0001\u00d35\u00dd<\u0080\u00c5\u00f6a\u00a4\rF\u00c1,\u00cd\u00ac6>D\u00e6\u00d0\u0086S\u0001>?\u008c\u00c4%\u0018T\u00c9q\u00d8\u0091\u00d6\u00f5m\u00b9\u00d0\u00cf\u00ed\u0002\u00ee\u0013\u00a7\u008c\u0005Y$\u00d6\u0000,\u001f";
                var6_6 = "\u00079\u00f7l]g\u0094\u0014;\u0010\u000f\u001f\u00beJr\u00b4\u00ed\u0081\u00fdEs\u001at<\u00a9\u007f5]t\u00a0\u00f7\u00c1\u0010\u00fa=\u00d7\u00a9\u00a4\u00df\u00df\u00af[\u00c6Lg\u00f3CXp \u001e\u00c4\u00ed<)P\u00be\u00fb\u0080Z_%h\fd\u00d5S\u00c2Mzx\u00ec\u00feD\u00b5\u0015\u00b2{\u00b8*\u008aD /\u00b2\u00dc\u0095w\u00df\u00bdl\u0004\u00a6\u00eb\u00d1Z\u001fO\u0001\u009f\u009f2\u0093\u00ea\u00b6Im\t\u00ea\u00f71\u00be\u00b0\u00e2\b@\u009c#\u00a1iZJ\u0089\r\u0096\u00fc*\u0010~j\u0004-\u0087x<W\u00ac\u00a5'\u00cf/\u0081\u0081\u00e1d0\u009dp(.\u0084\u0086\u00e9c=\u00e2\u00e2T\u0016H\u00bd\u00be\u00c6\u00ed\u00d9\u00aci\u007f|\u0099X\n\u0010\u0080le\u009f\u001e\u0006((&\b\u00f0\u00079\u00d8\u00db\u00e6\u0086\u00c9)N7\u0006\u00b8p\u00a3\u00bfus}3O\u00dd\u00e6n!VyWc\u00c7Q}\\\u00bf\u00d5Fe}@\u001b\u0095\u009c\u00ea\u00fa\u00da\u00a6}Xu\u00c8m\u009e\u00ff\"#\u009e\u008b\u001b\u00d2jx\u0016\u00b0\u008d\u0006\u00b2\u00fc\u00ab(K2\u00f7#\u0080B\u00db\u00bdZQm\u0098\u0017\u009c\u00b2}\u00f6|%OV\u00a5t\u00b0\u0088\u008b\u0093hk\u001e\\6\u00cc\u008e\u0010\u00f3\u008a\u00d3\u0010\u00ca\u0090g\u00d2\u00fc{\u001bQ\u00d1\u00df\u0006u \u0094vq\u00de\u000f\u009fHm.\u00fb\u009b\u00e0h\u00000\u00daP{\u00a8\u00e7\u00fb\t%W8\f\u001a\u00d9\u008b\u00c0\u00e6L \u0085Gvy\u00e6\u0097Z2\u0096\u000bN\u001f:\u00c6\u00c3\u00fa\u0011)J\u001b\u00a7r`\u001a\u00e8\u001d\u00bc\u0012w\u00b1\u00a7\u00b4\u0018\u0010\u00e87\u00c7\u00a7\u00b1\u00d2\f\u009c\u0016\u00d2\u0081\u00daF\u0089s\u00ed\u00f4O\r\u00d9\u001e'\u0096(\u00c7nnM\u00c9\u00bc\u009ce\u00acC\u00fb\u00be\u00d3\u0091\u00a3\u00f1\u00bf\u00fe6\u0007y\u001f\u0085\u00ef\u00f9\u0087\u0090\u00dd\u00f6Y+H\u00fc\u00bc\u0014\u000e\u00f2\u0082\u00cf\u001b(E\u008c\"\u0001\u009c\u009d\t #\u00cd\u0080r\\\u00b2G\u00f6\u0081:\u0098\u0096T\u00d2\u008bsTe\u00eaQ\u009f\u009d\u009b/\b\u00b4\u00d6\u0099\u008e*o\u0088\u0010\u0088i\u0019\u00d2\u00b1x\u0089\u0088}\u00df6\u00ab\u00a6\u00e8\u0016)\u0010\u00c7\t\u00e0\u0093Q\u00b2\u00c4\u00c7\u009f\u0019\u0091b/o\\Y({\u00b3\u00a3\u0012w\u00db\u00c0D9/Y\u00f3j\u0000O\u00cbI\u00f92+\rg\u009cE\u00bbz\u008c\u00deU\u00aa\u00e4\u0097M\u00ec5\u00be5x\u00c7u\u00109k\u001bm\u00e3\u00f2\u00c5M\u00cdN]x\u00cd\u00e0F\u0087 \u00f5:\u00ad\u008e\u00f3\u0080\u00d4*\u00f6\u0083\u0001\u00faC\u00e5\u00edg\u00ad\u0001\u00c9\u00f6j\u00e6\u00bb@\u00ff\u0005\u00af\u001a\u00ea\u00f5\u00b4\u00e2\u0010A\u00cfB\u00c7\t\u008e\u001cR\u00ec\u00adx\u00aa<>\u00e4\u00d3\u0010\f\b'\u0015\u009a?\u00e9^\u00f4\u0007\u00cf)}=C\u0019(\u0096~\u00dc\u00c65\u00a7J\u00160\u00f0\u00a7M~\r\u00d02\u00cf\u00e4\u00c9\u00d4$\u00f7\f\u00acG\u0014\u00b2\u0096D\u001e\u00fb\u009c\u00b5K\u00bd/\u00b9\u00ef\u00fc\u00ce v\u0010\u00ac\u008b\u00cc\u00a0\td\u0002\u0004\u00ee\u000f\u0019{\u00b2-G]\u0014\u00c5\u008c\u00c1\u00a4\u00cd\u00bdY\u001ca\u0080o\u00b46 I6\u009e\u00cf\u0095\u009e**{\u0087\u0098\u00ec\u0080\u0001si\u00a3\u0019\u00a7\u009e<6I\u00b5\u00ffih\u0006^f\u00dc\u008d\u0018\u00f9\u00bd*\u0097{K*<\u00ec\u008f\b\u00caY\u00bd\u008c\u000e\u0002\u009397\u000e#\rr(fpV\\w+H\u00a4}=\u0010\u00a1\u00ffGskG\u0013\u00b5\u00e8\u00d9\u0090\u009c\u00e4l\u0087\u00f82I\u00f6w\u00b0\u00a2\u00ccb1\u00aat\u00fc\u00e6\u0018\u00f6\u00d5.\u0087\u00a4ZK\u00cb\u00baY\u00d4\u00d3\u0084w\n\u0017\u00eae\u0019a\u00b5\u0090\u00136 >\u00bbs\u00d2\u00f9\u00fa\tc\u000bq\u0002\u0010{\u00c4\u00a6\u0002\u00db\u00c7\u0086\u00d6\u00e9\u001b\u00e8\u00c4eY\u00f4z\u00b3\u00e6u\u008a 8\u00beM\u0086\"\u0017\u00b7u\u0082\u00d3g'\u0000\u00d4\u00d3\u0086j\u00e9\u0000\u00f0x\u0089\u00ed\u0092\u00fc\u0093\u000e\u0013@\u008a\u00b6\u00b0\u00106\u00dfm\u0007\r,\b\u0088\u008c\u00c0$\u00c5\u009dz\u00bd\u0090\u0018\u0012R\u0083\u00a1\u00f2\u00f4b\u009a\u00e8\u0086\u001b\u00d7\u00ad-;5\u00fe\u0095d\u00c8\u00ce\u008f\u0089#\u0010\u001bDM:\u00ecG[\u00faE0t\u001c\u00ba\u00c9dy@%\t\u000f_s\u00db\u00e9mW\u00eb%\u00b2\u00d5\u0090\u00bbo]\u0013u\\\b\u00e1\u00f9}_,\u00e3\u00fb\u008a+,\u00d1\u00f3\u00c2\u00d7\u00eb\u00e2\u0092A%\u00ad\u00d7\u00e8\u00fc\u000fG-\u00d6S9\u00b5K\u0012\u00be\b\u0001HJ\u0004\u0098\u0006/6\u00ec \u0093\u00a83/zZs \u00d8 \u00bcK\u00cf?\u008a\u00c4f\u0005\u0001\u00e9\u0011\u00bf\u00c0^\u00e3\u00ac@/\u00b0}\u00ba\u00a5\u0018\u00a6\u00c0\u0010\u00b7\u00887\u0087\u001e\u00c7W}\u0089\u0004\u00ba\u00e2\u00f9Z2\u00d8\u001f\u00e0\u00cf3#(\fY\u00d86pB\u000ei\u00d2\u0017\u00ba\u0001\u00d35\u00dd<\u0080\u00c5\u00f6a\u00a4\rF\u00c1,\u00cd\u00ac6>D\u00e6\u00d0\u0086S\u0001>?\u008c\u00c4%\u0018T\u00c9q\u00d8\u0091\u00d6\u00f5m\u00b9\u00d0\u00cf\u00ed\u0002\u00ee\u0013\u00a7\u008c\u0005Y$\u00d6\u0000,\u001f".length();
                var3_7 = 32;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = a_.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "`C\u00f3\u00ce\u009a0S\u00a6\u00aa\u00b0\u001e\u009cm>G\u00f6\u009cF@Y\u00ab;c\u00dd\u00d5\u0016;\u00ac\u00d6\u00f2\u00c7\u0082'\u00c3\u00f8mn\u0086\u000e\u0019\u00c9#\u008b\u0011\u00feERI\"\u00ff\u00f2\u001f\u00b9\u00caABXM\\\u00f73\u00ff\u00e9> \u00e1\u00ed\u00b4\u0017\u000f|7\u0005r\u00cbL\u0003\u0004\u001c\u00d4\u0012N\u00abd\u0011E\u00f1s(\u00ce\u00ca\u00b9\u00c0\u00eb@\u0083\u00ea";
                    var6_6 = "`C\u00f3\u00ce\u009a0S\u00a6\u00aa\u00b0\u001e\u009cm>G\u00f6\u009cF@Y\u00ab;c\u00dd\u00d5\u0016;\u00ac\u00d6\u00f2\u00c7\u0082'\u00c3\u00f8mn\u0086\u000e\u0019\u00c9#\u008b\u0011\u00feERI\"\u00ff\u00f2\u001f\u00b9\u00caABXM\\\u00f73\u00ff\u00e9> \u00e1\u00ed\u00b4\u0017\u000f|7\u0005r\u00cbL\u0003\u0004\u001c\u00d4\u0012N\u00abd\u0011E\u00f1s(\u00ce\u00ca\u00b9\u00c0\u00eb@\u0083\u00ea".length();
                    var3_7 = 64;
                    var2_8 = -1;
lbl35:
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
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = a_.a(var8_9).intern();
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        a_.b = var7_3;
        a_.c = new String[38];
        m44.a("o", (String)"&", (long)-1377713902945569046L, (long)var9);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long X(Object[] objectArray) {
        String string;
        long l = (Long)objectArray[0];
        l = a ^ l;
        String string2 = (String)((Object)m44.a("u", (Object)m44.a("t", (Object)this, (long)-7710051608660394644L, (long)l), (Object)a_.a("d", (int)24929, (long)(0x354DB5C1EE3D7BC2L ^ l)), (long)-8608385857705846543L, (long)l));
        CallSite callSite = m44.a("j", (long)-7696397130106710903L, (long)l);
        try {
            string = string2;
            if (callSite != null) return (long)m44.a("j", (Object)string, (long)-8486352272247726698L, (long)l);
            if (string == null) throw new u1((String)((Object)a_.a("d", (int)8262, (long)(0x7101EAA617E83AF8L ^ l))) + (String)((Object)m44.a("t", (Object)this, (long)-7672959953342700936L, (long)l)) + (String)((Object)a_.a("d", (int)27315, (long)(0x4CAAFC4B95BBF017L ^ l))) + (String)((Object)a_.a("d", (int)24929, (long)(0x354DB5C1EE3D7BC2L ^ l))) + (String)((Object)a_.a("d", (int)16796, (long)(0x7F6473DC399A5B28L ^ l))));
        }
        catch (NumberFormatException numberFormatException) {
            throw m44.a("j", (Object)numberFormatException, (long)-8422471412588175697L, (long)l);
        }
        try {
            string = string2;
            return (long)m44.a("j", (Object)string, (long)-8486352272247726698L, (long)l);
        }
        catch (NumberFormatException numberFormatException) {
            throw new u1((String)((Object)a_.a("d", (int)8262, (long)(0x7101EAA617E83AF8L ^ l))) + (String)((Object)m44.a("t", (Object)this, (long)-7672959953342700936L, (long)l)) + (String)((Object)a_.a("d", (int)28747, (long)(0x5CD94224C985EAEDL ^ l))) + (String)((Object)a_.a("d", (int)24929, (long)(0x354DB5C1EE3D7BC2L ^ l))) + (String)((Object)a_.a("d", (int)29946, (long)(0x520E6AED090AEE51L ^ l))) + string2 + (String)((Object)a_.a("d", (int)16889, (long)(0x1E18BF89B6E15B55L ^ l))) + (String)((Object)m44.a("u", (Object)numberFormatException, (long)-7532819071938727153L, (long)l)));
        }
    }

    public void S(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (Long)objectArray[1];
        l2 = a ^ l2;
        String string = (String)((Object)m44.a("v", (Object)m44.a("w", (Object)this, (long)7972226763108042447L, (long)l2), (Object)a_.a("d", (int)29755, (long)(0x68F7B038D6221507L ^ l2)), (Object)m44.a("i", (long)l, (long)8219571736124317105L, (long)l2), (long)8422846412895904003L, (long)l2));
    }

    /*
     * Exception decompiling
     */
    public void y(Object[] var1_1) {
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
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public String K(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("q", (Object)this, (long)-4417689000783538043L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    private String V(Object[] var1_1) {
        block27: {
            block25: {
                block26: {
                    block24: {
                        block23: {
                            block22: {
                                var2_2 = (Long)var1_1[0];
                                var4_3 = (String)var1_1[1];
                                var2_2 = a_.a ^ var2_2;
                                var6_4 = var4_3.indexOf(":");
                                var5_5 = m44.a("l", (long)4253324803048012479L, (long)var2_2);
                                try {
                                    v0 = var6_4;
                                    if (var5_5 != null) break block22;
                                    if (v0 > 0) {
                                    }
                                    ** GOTO lbl19
                                }
                                catch (IllegalArgumentException v1) {
                                    throw m44.a("l", (Object)v1, (long)2678341151196655769L, (long)var2_2);
                                }
                                v0 = var6_4;
                            }
                            try {
                                if (v0 != var4_3.length() - 1) break block23;
lbl19:
                                // 2 sources

                                throw new ur((String)a_.a("d", (int)14978, (long)(1776193642778725928L ^ var2_2)) + var4_3 + "'");
                            }
                            catch (IllegalArgumentException v2) {
                                throw m44.a("l", (Object)v2, (long)2678341151196655769L, (long)var2_2);
                            }
                        }
                        var7_6 = var4_3.substring(0, var6_4).trim();
                        try {
                            v3 = m44.a("s", (Object)var7_6, (Object)a_.a("d", (int)26443, (long)(2877451295078962130L ^ var2_2)), (long)4487244010373321049L, (long)var2_2);
                            v4 = var5_5;
                            if (var2_2 <= 0L) ** GOTO lbl47
                            if (v4 != null) break block24;
                            if (v3 != false) {
                            }
                            ** GOTO lbl39
                        }
                        catch (IllegalArgumentException v5) {
                            throw m44.a("l", (Object)v5, (long)2678341151196655769L, (long)var2_2);
                        }
                        v6 = a_.a("d", (int)13648, (long)(3195231357548298702L ^ var2_2));
                        if (var2_2 < 0L) ** GOTO lbl40
                        var7_6 = v6;
                        try {
                            if (var5_5 == null) break block25;
lbl39:
                            // 2 sources

                            v6 = var7_6;
lbl40:
                            // 2 sources

                            v3 = m44.a("s", (Object)v6, (Object)a_.a("d", (int)31883, (long)(3626390837441284116L ^ var2_2)), (long)4487244010373321049L, (long)var2_2);
                        }
                        catch (IllegalArgumentException v7) {
                            throw m44.a("l", (Object)v7, (long)2678341151196655769L, (long)var2_2);
                        }
                    }
                    try {
                        v4 = var5_5;
lbl47:
                        // 2 sources

                        if (var2_2 < 0L) ** GOTO lbl68
                        if (v4 != null) break block26;
                        if (v3 != false) {
                        }
                        ** GOTO lbl59
                    }
                    catch (IllegalArgumentException v8) {
                        throw m44.a("l", (Object)v8, (long)2678341151196655769L, (long)var2_2);
                    }
                    v9 = a_.a("d", (int)31883, (long)(3626390837441284116L ^ var2_2));
                    if (var2_2 <= 0L) ** GOTO lbl60
                    var7_6 = v9;
                    try {
                        if (var5_5 == null) break block25;
lbl59:
                        // 2 sources

                        v9 = var7_6;
lbl60:
                        // 2 sources

                        v3 = m44.a("s", (Object)v9, (Object)a_.a("d", (int)24929, (long)(3840877824710989300L ^ var2_2)), (long)4487244010373321049L, (long)var2_2);
                    }
                    catch (IllegalArgumentException v10) {
                        throw m44.a("l", (Object)v10, (long)2678341151196655769L, (long)var2_2);
                    }
                }
                try {
                    if (var2_2 <= 0L) break block27;
                    v4 = var5_5;
lbl68:
                    // 2 sources

                    if (v4 != null) break block27;
                    if (v3 == false) break block25;
                }
                catch (IllegalArgumentException v11) {
                    throw m44.a("l", (Object)v11, (long)2678341151196655769L, (long)var2_2);
                }
                var7_6 = a_.a("d", (int)24929, (long)(3840877824710989300L ^ var2_2));
            }
            v3 = m44.a("s", (Object)m44.a("r", (Object)this, (long)4266697892803220314L, (long)var2_2), (Object)var7_6, (long)4472595627212375648L, (long)var2_2);
        }
        try {
            if (v3 != false) {
                throw new ur((String)a_.a("d", (int)28141, (long)(1269562186363820406L ^ var2_2)) + (String)var7_6 + (String)a_.a("d", (int)21765, (long)(1671582774649708936L ^ var2_2)) + var4_3 + "'");
            }
        }
        catch (IllegalArgumentException v12) {
            throw m44.a("l", (Object)v12, (long)2678341151196655769L, (long)var2_2);
        }
        var8_7 = var4_3.substring(var6_4 + 1).trim();
        m44.a("s", (Object)m44.a("r", (Object)this, (long)4266697892803220314L, (long)var2_2), (Object)var7_6, (Object)var8_7, (long)2411298335614710934L, (long)var2_2);
        return var7_6;
    }

    /*
     * Exception decompiling
     */
    public void H(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [37[DOLOOP]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static String[] v() {
        return P;
    }

    public String R(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return m44.a("p", (Object)this, (long)-2159431371973814796L, (long)l);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String H(Object[] objectArray) {
        int n;
        String string;
        block12: {
            String string2;
            block11: {
                int n2;
                int n3;
                int n4;
                CallSite callSite;
                long l;
                block10: {
                    String string3;
                    block9: {
                        l = (Long)objectArray[0];
                        l = a ^ l;
                        string2 = (String)((Object)m44.a("t", (Object)m44.a("u", (Object)this, (long)8005554329871501173L, (long)l), (Object)a_.a("d", (int)3367, (long)(0x5E119153F1106D88L ^ l)), (long)8255603333339325160L, (long)l));
                        callSite = m44.a("k", (long)8010199770396995216L, (long)l);
                        try {
                            string3 = string2;
                            if (callSite != null) break block9;
                            if (string3 == null) throw new ur((String)((Object)a_.a("d", (int)8262, (long)(0x7101FF702022C0E1L ^ l))) + (String)((Object)m44.a("u", (Object)this, (long)8042652977288124513L, (long)l)) + (String)((Object)a_.a("d", (int)3793, (long)(0x1E066F33B4FC6E55L ^ l))) + (String)((Object)a_.a("d", (int)31883, (long)(0x3253AD5F140E1C3BL ^ l))) + (String)((Object)a_.a("d", (int)21545, (long)(0x6A73453A027DB487L ^ l))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)8143716532212884662L, (long)l);
                        }
                        string3 = string2;
                    }
                    n4 = string3.lastIndexOf("/");
                    try {
                        try {
                            n3 = n4;
                            n2 = -1;
                            if (callSite != null) break block10;
                            if (n3 <= n2) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("k", (Object)illegalArgumentException, (long)8143716532212884662L, (long)l);
                        }
                        n3 = n4;
                        n2 = string2.length();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)8143716532212884662L, (long)l);
                    }
                }
                if (n3 >= n2) throw new ur((String)((Object)a_.a("d", (int)8262, (long)(0x7101FF702022C0E1L ^ l))) + (String)((Object)m44.a("u", (Object)this, (long)8042652977288124513L, (long)l)) + (String)((Object)a_.a("d", (int)26668, (long)(0x24E36ED1F0358880L ^ l))) + (String)((Object)a_.a("d", (int)31883, (long)(0x3253AD5F140E1C3BL ^ l))) + (String)((Object)a_.a("d", (int)4597, (long)(0x503CB86E1BC77149L ^ l))) + string2 + "'");
                string = string2.substring(n4 + 1);
                try {
                    if (callSite != null) {
                        throw new ur((String)((Object)a_.a("d", (int)8262, (long)(0x7101FF702022C0E1L ^ l))) + (String)((Object)m44.a("u", (Object)this, (long)8042652977288124513L, (long)l)) + (String)((Object)a_.a("d", (int)26668, (long)(0x24E36ED1F0358880L ^ l))) + (String)((Object)a_.a("d", (int)31883, (long)(0x3253AD5F140E1C3BL ^ l))) + (String)((Object)a_.a("d", (int)4597, (long)(0x503CB86E1BC77149L ^ l))) + string2 + "'");
                    }
                    break block12;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("k", (Object)illegalArgumentException, (long)8143716532212884662L, (long)l);
                }
            }
            string = string2;
        }
        if ((n = string.indexOf("?")) <= -1) return string;
        return string.substring(0, n);
    }

    public static void b(String[] stringArray) {
        P = stringArray;
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x37B;
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
                throw new RuntimeException("com/zelix/a_", exception);
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
            a_.c[n2] = a_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a_.a(n, l);
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
            throw new RuntimeException("com/zelix/a_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
