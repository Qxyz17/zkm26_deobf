/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.jd;
import com.zelix.m44;
import com.zelix.n9;
import com.zelix.o7;
import com.zelix.prr;
import com.zelix.xk;
import com.zelix.xu;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c9 {
    private static String[] K;
    private int l;
    private long m;
    private int P;
    private xk O;
    private jd S;
    private final o7 N;
    private int L;
    private xu q;
    private static final long a;

    public void J(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        long l11 = (Long)objectArray[1];
        l11 = a ^ l11;
        m44.a("q", (Object)this, (long)l10, (long)8352455764718661010L, (long)l11);
    }

    public int p(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("p", (Object)this, (long)5304887055944415018L, (long)l10);
    }

    public long F(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (long)m44.a("u", (Object)this, (long)486272240537589956L, (long)l10);
    }

    public c9(long l10, jd jd2, int n10) {
        l10 = a ^ l10;
        m44.a("w", (Object)this, (int)-1, (long)7419999265720289791L, (long)l10);
        m44.a("w", (Object)this, (int)-1, (long)8969237191803427348L, (long)l10);
        this.N = m44.a("o", (long)8997495591972043548L, (long)l10);
        m44.a("w", (Object)this, (jd)jd2, (long)7486480791563522392L, (long)l10);
        m44.a("w", (Object)this, (int)n10, (long)6959176519431511591L, (long)l10);
        m44.a("w", (Object)this, (int)n10, (long)8969237191803427348L, (long)l10);
    }

    public xk f(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("r", (Object)this, (long)4782440113687073515L, (long)l10);
    }

    public int Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return (int)m44.a("q", (Object)this, (long)179349319616212347L, (long)l10);
    }

    public boolean H(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("m", (long)-2159454458339414868L, (long)l10);
                try {
                    try {
                        object = m44.a("s", (Object)this, (long)-2029133831503721263L, (long)l10);
                        if (callSite == null) break block4;
                        if (object <= -1) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("m", (Object)n92, (long)-2112017686722070769L, (long)l10);
                    }
                    object = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("m", (Object)n93, (long)-2112017686722070769L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public boolean h(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l10 = (Long)objectArray[0];
                l10 = a ^ l10;
                CallSite callSite = m44.a("h", (long)-732552964904731791L, (long)l10);
                try {
                    try {
                        object = m44.a("v", (Object)this, (long)-981603546344796972L, (long)l10);
                        if (callSite == null) break block4;
                        if (object <= -1) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("h", (Object)n92, (long)-761677387004075822L, (long)l10);
                    }
                    object = true;
                    break block4;
                }
                catch (n9 n93) {
                    throw m44.a("h", (Object)n93, (long)-761677387004075822L, (long)l10);
                }
            }
            object = false;
        }
        return (boolean)object;
    }

    public o7 H(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("s", (Object)this, (long)3855621452609173060L, (long)l10);
    }

    public c9(int n10, long l10, int n11) {
        l10 = a ^ l10;
        m44.a("w", (Object)this, (int)-1, (long)-5937578625738734945L, (long)l10);
        m44.a("w", (Object)this, (int)-1, (long)-5253035538962411148L, (long)l10);
        this.N = m44.a("o", (long)-5399776405641086905L, (long)l10);
        m44.a("w", (Object)this, (int)n10, (long)-5937578625738734945L, (long)l10);
        m44.a("w", (Object)this, (int)n11, (long)-6056303996011113145L, (long)l10);
        m44.a("w", (Object)this, (int)n11, (long)-5253035538962411148L, (long)l10);
    }

    public c9(xu xu2, char c10, int n10, long l10) {
        long l11 = ((long)c10 << 48 | l10 << 16 >>> 16) ^ a;
        m44.a("w", (Object)this, (int)-1, (long)-2127600729494172289L, (long)l11);
        m44.a("w", (Object)this, (int)-1, (long)-506305484242559340L, (long)l11);
        this.N = m44.a("o", (long)-1947692107325475656L, (long)l11);
        m44.a("w", (Object)this, (xu)xu2, (long)-2234218540586083841L, (long)l11);
        m44.a("w", (Object)this, (int)n10, (long)-2012007047540909401L, (long)l11);
        m44.a("w", (Object)this, (int)n10, (long)-506305484242559340L, (long)l11);
    }

    public static String[] q() {
        return K;
    }

    public static void r(String[] stringArray) {
        K = stringArray;
    }

    public xu v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)this, (long)3986387026462346835L, (long)l10);
    }

    public void d(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        int n10 = (Integer)objectArray[1];
        l10 = a ^ l10;
        m44.a("p", (Object)this, (int)n10, (long)395340905148857288L, (long)l10);
    }

    public boolean d(Object[] objectArray) {
        boolean bl2;
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        try {
            bl2 = m44.a("u", (Object)this, (long)-4320690432273345348L, (long)l10) != null;
        }
        catch (n9 n92) {
            throw m44.a("k", (Object)n92, (long)-4526503725062581103L, (long)l10);
        }
        return bl2;
    }

    public c9(xk xk2, long l10, int n10) {
        l10 = a ^ l10;
        m44.a("p", (Object)this, (int)-1, (long)-2283770408763371704L, (long)l10);
        m44.a("p", (Object)this, (int)-1, (long)-374245886905230173L, (long)l10);
        this.N = m44.a("h", (long)-43942105776097673L, (long)l10);
        m44.a("p", (Object)this, (xk)xk2, (long)-2013511055003208517L, (long)l10);
        m44.a("p", (Object)this, (int)n10, (long)-1863154607975114608L, (long)l10);
        m44.a("p", (Object)this, (int)n10, (long)-374245886905230173L, (long)l10);
    }

    public jd v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        l10 = a ^ l10;
        return m44.a("q", (Object)this, (long)1959461586794884492L, (long)l10);
    }

    public c9(long l10, int n10, xu xu2) {
        l10 = a ^ l10;
        m44.a("t", (Object)this, (int)-1, (long)6733481477292749428L, (long)l10);
        m44.a("t", (Object)this, (int)-1, (long)5184243551209546143L, (long)l10);
        this.N = m44.a("l", (long)6880624714930027326L, (long)l10);
        m44.a("t", (Object)this, (xu)xu2, (long)6914549084654266100L, (long)l10);
        m44.a("t", (Object)this, (int)n10, (long)6564266467538920876L, (long)l10);
        m44.a("t", (Object)this, (int)n10, (long)5184243551209546143L, (long)l10);
    }

    static {
        a = prr.a(4460185848817196983L, -2269446616252542091L, MethodHandles.lookup().lookupClass()).a(38953706700268L);
        long l10 = a ^ 0x4E5EFE894F8FL;
        if (m44.a("j", (long)2175047921116795019L, (long)l10) == null) {
            m44.a("j", (Object)new String[3], (long)1869439544612175781L, (long)l10);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}

