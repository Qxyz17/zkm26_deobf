/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.om;
import com.zelix.prr;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.awt.Point;
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

public class mc
implements LayoutManager2 {
    protected float m;
    protected Dimension l;
    protected Component Q;
    protected int C;
    protected int y;
    protected boolean E;
    protected Component p;
    protected Container L;
    protected om f;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] g;
    private static final Map h;

    void q(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Point point = (Point)objectArray[1];
        long l11 = (l10 = a ^ l10) ^ 0x41058BB45C82L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l11;
        objectArray2[0] = point;
        m44.a("u", (Object)this, (Object)objectArray2, (long)-7398236134872116286L, (long)l10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void removeLayoutComponent(Component component) {
        mc mc2;
        CallSite callSite;
        long l10;
        block12: {
            Component component2;
            CallSite callSite2;
            block10: {
                l10 = a ^ 0x823E77F0B28L;
                callSite = m44.a("l", (long)3494134612903436057L, (long)l10);
                try {
                    try {
                        block11: {
                            try {
                                try {
                                    callSite2 = m44.a("r", (Object)this, (long)3139447373486290674L, (long)l10);
                                    component2 = component;
                                    if (callSite == null) break block10;
                                    if (callSite2 != component2) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)3288089194254850016L, (long)l10);
                                }
                                m44.a("p", (Object)this, null, (long)3139447373486290674L, (long)l10);
                                if (callSite != null) return;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)3288089194254850016L, (long)l10);
                            }
                        }
                        mc2 = this;
                        if (callSite == null) break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)3288089194254850016L, (long)l10);
                    }
                    callSite2 = m44.a("r", (Object)mc2, (long)3132798213609367156L, (long)l10);
                    component2 = component;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("l", (Object)illegalArgumentException, (long)3288089194254850016L, (long)l10);
                }
            }
            if (callSite2 != component2) throw new IllegalArgumentException((String)((Object)mc.a("m", (int)20109, (long)(0xD8EE1200C94F124L ^ l10))));
            mc2 = this;
        }
        try {
            m44.a("p", (Object)mc2, null, (long)3132798213609367156L, (long)l10);
            if (callSite != null) return;
            throw new IllegalArgumentException((String)((Object)mc.a("m", (int)20109, (long)(0xD8EE1200C94F124L ^ l10))));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("l", (Object)illegalArgumentException, (long)3288089194254850016L, (long)l10);
        }
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        long l10 = a ^ 0x65D36A3B6B0L;
        return m44.a("s", (Object)this, (Object)container, (long)-8181554197046204608L, (long)l10);
    }

    @Override
    public void addLayoutComponent(String string, Component component) {
        long l10 = a ^ 0x5329D0F50D24L;
        long l11 = l10 ^ 0x1512B6F11127L;
        Object[] objectArray = new Object[2];
        objectArray[1] = component;
        objectArray[0] = l11;
        m44.a("i", (Object)this, (Object)objectArray, (long)2885564449157939871L, (long)l10);
    }

    void s(Object[] objectArray) {
        block8: {
            long l10;
            block9: {
                mc mc2;
                Point point;
                block6: {
                    point = (Point)objectArray[0];
                    l10 = (Long)objectArray[1];
                    l10 = a ^ l10;
                    CallSite callSite = m44.a("k", (long)-1435874103134698634L, (long)l10);
                    try {
                        block7: {
                            try {
                                try {
                                    mc2 = this;
                                    if (callSite == null) break block6;
                                    if (m44.a("u", (Object)mc2, (long)-1582052897835088048L, (long)l10) != false) break block7;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("k", (Object)illegalArgumentException, (long)-1022656564686451825L, (long)l10);
                                }
                                m44.a("w", (Object)this, (float)((float)(m44.a("u", (Object)m44.a("t", (Object)m44.a("u", (Object)this, (long)-576770582178813283L, (long)l10), (long)-1318107727708096103L, (long)l10), (long)-1095335811555144374L, (long)l10) + m44.a("u", (Object)point, (long)-1142340754005284118L, (long)l10)) / (float)m44.a("u", (Object)m44.a("t", (Object)m44.a("u", (Object)this, (long)-1150488353669731570L, (long)l10), (long)-1215760422869726381L, (long)l10), (long)-1095335811555144374L, (long)l10)), (long)-1645223109440356304L, (long)l10);
                                if (l10 <= 0L) break block8;
                                if (callSite != null) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("k", (Object)illegalArgumentException, (long)-1022656564686451825L, (long)l10);
                            }
                        }
                        mc2 = this;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("k", (Object)illegalArgumentException, (long)-1022656564686451825L, (long)l10);
                    }
                }
                m44.a("w", (Object)mc2, (float)((float)(m44.a("u", (Object)m44.a("t", (Object)m44.a("u", (Object)this, (long)-576770582178813283L, (long)l10), (long)-1318107727708096103L, (long)l10), (long)-1339432530358935909L, (long)l10) + m44.a("u", (Object)point, (long)-1671908006037101637L, (long)l10)) / (float)m44.a("u", (Object)m44.a("t", (Object)m44.a("u", (Object)this, (long)-1150488353669731570L, (long)l10), (long)-1215760422869726381L, (long)l10), (long)-1339432530358935909L, (long)l10)), (long)-1645223109440356304L, (long)l10);
            }
            m44.a("w", (Object)this, (float)m44.a("k", (float)0.0f, (float)m44.a("k", (float)1.0f, (float)m44.a("u", (Object)this, (long)-1645223109440356304L, (long)l10), (long)-1685734241548295657L, (long)l10), (long)-753418327949918284L, (long)l10), (long)-1645223109440356304L, (long)l10);
            m44.a("t", (Object)m44.a("u", (Object)this, (long)-1150488353669731570L, (long)l10), (long)-1691815651536392850L, (long)l10);
            m44.a("t", (Object)m44.a("u", (Object)this, (long)-1150488353669731570L, (long)l10), (long)-728567239900564734L, (long)l10);
        }
    }

    void z(Object[] objectArray) {
        block5: {
            mc mc2;
            long l10;
            long l11;
            Point point;
            block4: {
                point = (Point)objectArray[0];
                l11 = (Long)objectArray[1];
                l10 = (l11 = a ^ l11) ^ 0x772A75B753AL;
                CallSite callSite = m44.a("j", (long)-5927991248964222241L, (long)l11);
                try {
                    try {
                        mc2 = this;
                        if (callSite == null) break block4;
                        if (m44.a("t", (Object)mc2, (long)-6278953586051679104L, (long)l11) == false) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("j", (Object)illegalArgumentException, (long)-5735474843634054618L, (long)l11);
                    }
                    mc2 = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("j", (Object)illegalArgumentException, (long)-5735474843634054618L, (long)l11);
                }
            }
            Object[] objectArray2 = new Object[2];
            objectArray2[1] = l10;
            objectArray2[0] = point;
            m44.a("u", (Object)mc2, (Object)objectArray2, (long)-5698063868197979526L, (long)l11);
        }
    }

    @Override
    public void addLayoutComponent(Component component, Object object) {
        long l10 = a ^ 0x117202B4C0F4L;
        long l11 = l10 ^ 0x574964B0DCF7L;
        try {
            if (object != this) {
                Object[] objectArray = new Object[2];
                objectArray[1] = component;
                objectArray[0] = l11;
                m44.a("i", (Object)this, (Object)objectArray, (long)-1883674731529384113L, (long)l10);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw m44.a("h", (Object)illegalArgumentException, (long)-1838107590511846340L, (long)l10);
        }
    }

    private void t(Object[] objectArray) {
        block21: {
            Component component;
            CallSite callSite;
            long l10;
            block22: {
                Component component2;
                block24: {
                    CallSite callSite2;
                    block19: {
                        l10 = (Long)objectArray[0];
                        component2 = (Component)objectArray[1];
                        l10 = a ^ l10;
                        callSite2 = m44.a("l", (long)1424732605051681953L, (long)l10);
                        try {
                            block20: {
                                try {
                                    try {
                                        callSite = m44.a("r", (Object)this, (long)588156168236094794L, (long)l10);
                                        if (callSite2 == null) break block19;
                                        if (callSite != null) break block20;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("l", (Object)illegalArgumentException, (long)1016020869095912536L, (long)l10);
                                    }
                                    m44.a("p", (Object)this, (Component)component2, (long)588156168236094794L, (long)l10);
                                    if (callSite2 != null) break block21;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)1016020869095912536L, (long)l10);
                                }
                            }
                            callSite = m44.a("r", (Object)this, (long)588156168236094794L, (long)l10);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("l", (Object)illegalArgumentException, (long)1016020869095912536L, (long)l10);
                        }
                    }
                    try {
                        block23: {
                            try {
                                try {
                                    try {
                                        try {
                                            component = component2;
                                            if (l10 < 0L || callSite2 == null) break block22;
                                            if (callSite == component) break block23;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("l", (Object)illegalArgumentException, (long)1016020869095912536L, (long)l10);
                                        }
                                        callSite = m44.a("r", (Object)this, (long)631046329533859276L, (long)l10);
                                        if (callSite2 == null) break block24;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw m44.a("l", (Object)illegalArgumentException, (long)1016020869095912536L, (long)l10);
                                    }
                                    if (l10 <= 0L) break block24;
                                    if (callSite != null) break block23;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("l", (Object)illegalArgumentException, (long)1016020869095912536L, (long)l10);
                                }
                                m44.a("p", (Object)this, (Component)component2, (long)631046329533859276L, (long)l10);
                                if (callSite2 != null) break block21;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("l", (Object)illegalArgumentException, (long)1016020869095912536L, (long)l10);
                            }
                        }
                        callSite = m44.a("r", (Object)this, (long)631046329533859276L, (long)l10);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("l", (Object)illegalArgumentException, (long)1016020869095912536L, (long)l10);
                    }
                }
                component = component2;
            }
            try {
                if (callSite == component) {
                    throw new IllegalArgumentException((String)((Object)mc.a("m", (int)5232, (long)(0x488B812849C60863L ^ l10))));
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("l", (Object)illegalArgumentException, (long)1016020869095912536L, (long)l10);
            }
        }
    }

    @Override
    public float getLayoutAlignmentY(Container container) {
        return 0.5f;
    }

    @Override
    public float getLayoutAlignmentX(Container container) {
        return 0.5f;
    }

    @Override
    public Dimension maximumLayoutSize(Container container) {
        long l10 = a ^ 0x67C03C3A4F63L;
        return new Dimension((int)mc.b("z", (int)18959, (long)(0x4E8BBE14A62EC0C2L ^ l10)), (int)mc.b("z", (int)1118, (long)(0x35551FE8BE330E95L ^ l10)));
    }

    private Dimension S(Object[] objectArray) {
        CallSite callSite;
        block2: {
            CallSite callSite2;
            block3: {
                Container container = (Container)objectArray[0];
                long l10 = (Long)objectArray[1];
                Insets insets = (Insets)objectArray[2];
                l10 = a ^ l10;
                callSite2 = m44.a("r", (Object)container, (long)-6573370995121962827L, (long)l10);
                CallSite callSite3 = m44.a("m", (long)-6344250664368994160L, (long)l10);
                CallSite callSite4 = callSite2;
                m44.a("q", (Object)callSite4, (int)(m44.a("s", (Object)callSite4, (long)-4959900938790467924L, (long)l10) - (m44.a("s", (Object)insets, (long)-6685904164460512379L, (long)l10) + m44.a("s", (Object)insets, (long)-6685904164460512379L, (long)l10))), (long)-4959900938790467924L, (long)l10);
                CallSite callSite5 = callSite2;
                m44.a("q", (Object)callSite5, (int)(m44.a("s", (Object)callSite5, (long)-6444914348809579139L, (long)l10) - (m44.a("s", (Object)insets, (long)-4811038926481495890L, (long)l10) + m44.a("s", (Object)insets, (long)-6668088926443256946L, (long)l10))), (long)-6444914348809579139L, (long)l10);
                CallSite callSite6 = callSite3;
                try {
                    callSite = m44.a("s", (Object)this, (long)-4981288462601788246L, (long)l10);
                    if (callSite6 == null) break block2;
                    if (callSite == null) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-5032566993121853335L, (long)l10);
                }
                int n10 = Math.max((int)m44.a("s", (Object)callSite2, (long)-4959900938790467924L, (long)l10), (int)m44.a("s", (Object)m44.a("s", (Object)this, (long)-4981288462601788246L, (long)l10), (long)-4959900938790467924L, (long)l10));
                int n11 = Math.max((int)m44.a("s", (Object)callSite2, (long)-6444914348809579139L, (long)l10), (int)m44.a("s", (Object)m44.a("s", (Object)this, (long)-4981288462601788246L, (long)l10), (long)-6444914348809579139L, (long)l10));
                return new Dimension(n10, n11);
            }
            callSite = callSite2;
        }
        return callSite;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        Object object;
        block4: {
            long l10;
            block5: {
                l10 = a ^ 0x5AFF2EF3B011L;
                CallSite callSite = m44.a("m", (long)-8411323093547670496L, (long)l10);
                try {
                    try {
                        object = m44.a("s", (Object)this, (long)-7606963373744109542L, (long)l10);
                        if (callSite == null) break block4;
                        if (object == null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("m", (Object)illegalArgumentException, (long)-7595055309483086631L, (long)l10);
                    }
                    return m44.a("s", (Object)this, (long)-7606963373744109542L, (long)l10);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("m", (Object)illegalArgumentException, (long)-7595055309483086631L, (long)l10);
                }
            }
            object = new Dimension((int)mc.b("z", (int)21982, (long)(0x9DC7646B58BA060L ^ l10)), (int)mc.b("z", (int)9432, (long)(0x458F488BA53B5165L ^ l10)));
        }
        return object;
    }

    @Override
    public void invalidateLayout(Container container) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public mc(int n10, int n11, long l10, boolean bl2, int n12) {
        block30: {
            Object object;
            int n13;
            CallSite callSite;
            block29: {
                block28: {
                    int n14;
                    block27: {
                        block26: {
                            int n15;
                            block24: {
                                l10 = a ^ l10;
                                CallSite callSite2 = m44.a("h", (long)-8310911725148429363L, (long)l10);
                                callSite = callSite2;
                                try {
                                    block25: {
                                        try {
                                            try {
                                                m44.a("t", (Object)this, (int)0, (long)-8453222929193834517L, (long)l10);
                                                n15 = n10;
                                                if (callSite == null) break block24;
                                                if (n15 != 0) break block25;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                                            }
                                            m44.a("t", (Object)this, (int)0, (long)-8453222929193834517L, (long)l10);
                                            if (l10 <= 0L || callSite != null) break block26;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                                        }
                                    }
                                    n15 = n10;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                                }
                            }
                            try {
                                try {
                                    if (n15 != 1) throw new IllegalArgumentException((String)((Object)mc.a("m", (int)21972, (long)(0x2BB909911CD556A8L ^ l10))));
                                    m44.a("t", (Object)this, (int)1, (long)-8453222929193834517L, (long)l10);
                                    if (l10 < 0L || callSite != null) break block26;
                                    throw new IllegalArgumentException((String)((Object)mc.a("m", (int)21972, (long)(0x2BB909911CD556A8L ^ l10))));
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                            }
                        }
                        try {
                            n14 = n11;
                            if (l10 < 0L || callSite == null) break block27;
                            if (n14 < 0) throw new IllegalArgumentException((String)((Object)mc.a("m", (int)11892, (long)(0x60AA36B2BE342D0FL ^ l10))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                        }
                        n14 = n11;
                    }
                    try {
                        try {
                            if (n14 > mc.b("z", (int)9432, (long)(0x458F076C2DD05688L ^ l10))) throw new IllegalArgumentException((String)((Object)mc.a("m", (int)11892, (long)(0x60AA36B2BE342D0FL ^ l10))));
                            m44.a("t", (Object)this, (float)((float)n11 / 100.0f), (long)-8533886430389985141L, (long)l10);
                            if (l10 < 0L || callSite != null) break block28;
                            throw new IllegalArgumentException((String)((Object)mc.a("m", (int)11892, (long)(0x60AA36B2BE342D0FL ^ l10))));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                    }
                }
                try {
                    try {
                        n13 = n12;
                        object = 3;
                        if (l10 <= 0L || callSite == null) break block29;
                        if (n13 < object) throw new IllegalArgumentException((String)((Object)mc.a("m", (int)20437, (long)(0x3368BC4A9724CCABL ^ l10))));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                    }
                    n13 = n12;
                    object = mc.b("z", (int)29846, (long)(0x2CB3FD9B46FB86C7L ^ l10));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                }
            }
            try {
                try {
                    if (n13 > object) throw new IllegalArgumentException((String)((Object)mc.a("m", (int)20437, (long)(0x3368BC4A9724CCABL ^ l10))));
                    m44.a("t", (Object)this, (int)n12, (long)-8461910515582948232L, (long)l10);
                    if (l10 < 0L) return;
                    if (callSite != null) break block30;
                    throw new IllegalArgumentException((String)((Object)mc.a("m", (int)20437, (long)(0x3368BC4A9724CCABL ^ l10))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw m44.a("h", (Object)illegalArgumentException, (long)-7965250873599464652L, (long)l10);
            }
        }
        m44.a("t", (Object)this, (boolean)bl2, (long)-8516708804086047342L, (long)l10);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void layoutContainer(Container var1_1) {
        block18: {
            block17: {
                block15: {
                    block16: {
                        block13: {
                            block14: {
                                v0 = var2_2 = mc.a ^ 118784764480572L;
                                var4_3 = v0 ^ 51731266641680L;
                                var6_4 = v0 ^ 54223793333262L;
                                var8_5 = m44.a("h", (long)3992947676949747725L, (long)var2_2);
                                try {
                                    try {
                                        v1 = this;
                                        if (var8_5 == null) break block13;
                                        if (m44.a("v", (Object)v1, (long)3131031081314971765L, (long)var2_2) != null) break block14;
                                    }
                                    catch (IllegalArgumentException v2) {
                                        throw m44.a("h", (Object)v2, (long)3077585376589795572L, (long)var2_2);
                                    }
                                    m44.a("t", (Object)this, (Container)var1_1, (long)3131031081314971765L, (long)var2_2);
                                }
                                catch (IllegalArgumentException v3) {
                                    throw m44.a("h", (Object)v3, (long)3077585376589795572L, (long)var2_2);
                                }
                            }
                            v1 = this;
                        }
                        try {
                            try {
                                v4 = m44.a("v", (Object)v1, (long)2958991479436217900L, (long)var2_2);
                                if (var8_5 == null) break block15;
                                if (v4 != null) break block16;
                            }
                            catch (IllegalArgumentException v5) {
                                throw m44.a("h", (Object)v5, (long)3077585376589795572L, (long)var2_2);
                            }
                            m44.a("t", (Object)this, (om)new om(this, var4_3), (long)2958991479436217900L, (long)var2_2);
                            m44.a("w", (Object)m44.a("v", (Object)this, (long)3131031081314971765L, (long)var2_2), (Object)m44.a("v", (Object)this, (long)2958991479436217900L, (long)var2_2), (Object)this, (long)3713298463458299128L, (long)var2_2);
                        }
                        catch (IllegalArgumentException v6) {
                            throw m44.a("h", (Object)v6, (long)3077585376589795572L, (long)var2_2);
                        }
                    }
                    v4 = var1_1;
                }
                var9_6 = m44.a("w", (Object)v4, (long)3937191613552014008L, (long)var2_2);
                v7 = new Object[3];
                v7[2] = var9_6;
                v7[1] = var6_4;
                v7[0] = var1_1;
                var10_7 = m44.a("i", (Object)this, (Object)v7, (long)3188547190458994181L, (long)var2_2);
                try {
                    v8 /* !! */  = m44.a("v", (Object)this, (long)3562461209655467051L, (long)var2_2);
                    if (var8_5 == null) break block17;
                    if (v8 /* !! */  == false) {
                    }
                    ** GOTO lbl59
                }
                catch (IllegalArgumentException v9) {
                    throw m44.a("h", (Object)v9, (long)3077585376589795572L, (long)var2_2);
                }
                var11_8 /* !! */  = (CallSite)Math.max(0, (int)m44.a("h", (float)((float)m44.a("v", (Object)var10_7, (long)3150154947703281201L, (long)var2_2) * m44.a("v", (Object)this, (long)3625945882123148107L, (long)var2_2) - (float)m44.a("v", (Object)this, (long)3553683325424015288L, (long)var2_2)), (long)3365652002639373390L, (long)var2_2));
                var12_9 = m44.a("v", (Object)var10_7, (long)3150154947703281201L, (long)var2_2) - m44.a("v", (Object)this, (long)3553683325424015288L, (long)var2_2) - var11_8 /* !! */ ;
                try {
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)3208228608692777446L, (long)var2_2), (int)0, (int)0, (int)var11_8 /* !! */ , (int)m44.a("v", (Object)var10_7, (long)3896297471842485728L, (long)var2_2), (long)3300646703248426336L, (long)var2_2);
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)2958991479436217900L, (long)var2_2), (int)var11_8 /* !! */ , (int)0, (int)m44.a("v", (Object)this, (long)3553683325424015288L, (long)var2_2), (int)m44.a("v", (Object)var10_7, (long)3896297471842485728L, (long)var2_2), (long)3283944667101595161L, (long)var2_2);
                    m44.a("w", (Object)m44.a("v", (Object)this, (long)3201368068125368672L, (long)var2_2), (int)(var11_8 /* !! */  + m44.a("v", (Object)this, (long)3553683325424015288L, (long)var2_2)), (int)0, (int)var12_9, (int)m44.a("v", (Object)var10_7, (long)3896297471842485728L, (long)var2_2), (long)3300646703248426336L, (long)var2_2);
                    if (var8_5 != null) break block18;
lbl59:
                    // 2 sources

                    v8 /* !! */  = (CallSite)Math.max(0, (int)m44.a("h", (float)((float)m44.a("v", (Object)var10_7, (long)3896297471842485728L, (long)var2_2) * m44.a("v", (Object)this, (long)3625945882123148107L, (long)var2_2) - (float)m44.a("v", (Object)this, (long)3553683325424015288L, (long)var2_2)), (long)3365652002639373390L, (long)var2_2));
                }
                catch (IllegalArgumentException v10) {
                    throw m44.a("h", (Object)v10, (long)3077585376589795572L, (long)var2_2);
                }
            }
            var11_8 /* !! */  = v8 /* !! */ ;
            var12_9 = m44.a("v", (Object)var10_7, (long)3896297471842485728L, (long)var2_2) - m44.a("v", (Object)this, (long)3553683325424015288L, (long)var2_2) - var11_8 /* !! */ ;
            m44.a("w", (Object)m44.a("v", (Object)this, (long)3208228608692777446L, (long)var2_2), (int)0, (int)0, (int)m44.a("v", (Object)var10_7, (long)3150154947703281201L, (long)var2_2), (int)var11_8 /* !! */ , (long)3300646703248426336L, (long)var2_2);
            m44.a("w", (Object)m44.a("v", (Object)this, (long)2958991479436217900L, (long)var2_2), (int)0, (int)var11_8 /* !! */ , (int)m44.a("v", (Object)var10_7, (long)3150154947703281201L, (long)var2_2), (int)m44.a("v", (Object)this, (long)3553683325424015288L, (long)var2_2), (long)3283944667101595161L, (long)var2_2);
            m44.a("w", (Object)m44.a("v", (Object)this, (long)3201368068125368672L, (long)var2_2), (int)0, (int)(var11_8 /* !! */  + m44.a("v", (Object)this, (long)3553683325424015288L, (long)var2_2)), (int)m44.a("v", (Object)var10_7, (long)3150154947703281201L, (long)var2_2), (int)var12_9, (long)3300646703248426336L, (long)var2_2);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        mc.a = prr.a(3696499232693568358L, -4181162308225906780L, MethodHandles.lookup().lookupClass()).a(21391061137721L);
                        mc.d = new HashMap<K, V>(13);
                        var11 = mc.a ^ 131979722499494L;
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
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "P-.\u00f2\u008dD\u009f\u00c6\u00ae\u0015H\u00cf[\u009d_\u00ee\u00c3\u00c6\u00dfn\u0080^\u0014\u009c+\u0088\f3\u0090AY*\u0096\u00c9\u00a7zF\u00cb\u00c2\u0010\u00f7\u00ec\u00bf{\f\\\u00bf1\u00e6L)\u00b24\u00actW\u00f3\\v\u0082x\u0005\u00ed=\u00c9\u00a6\u000f\u009f\u0084jL8\u00ce+\u00b7\u00dam\u00a4\u00a5\u00b3\u00102t\u00f5\u001e\u00d0\u00ce\u00f0@\u00ecyEb\u00e2\u00b1*\u00e9\u00184\u00b7/I\u00ae\u00bc}\u00f7\u0091\u00f4\u00d1]ct\u000f\u00de\u001dpu\u00bf\u00d9\u00f6\u00e3\u00b3\u00b9\u0092\u00ab\u000b\u0013P\u00a8Gw+\u0001\u00fe\n\u00a0\u009c\u00d6j\u00fdi]U\u00ba\u00bd\u0007\u00f2\u00f8a\u00b0;\u00cfd@\u00ec\u0006\u00cf\u00dfY-\u0011\u00e7V\u0006yOK\\\u00a9\u00f1\u001b\u00ca*\u00e2jL`\u00da\u00bb\u00e7_Z\u007f\u00c6In\u00f1G\n\u00a2\u00d7\u0016\u00e5Q\u0016\u00c5\u00f6\u001fS\u00e5T\u00d2\u00be]\u0081\u0006}\u00dd\u0087\u009d7\u0090\u00ba\u00ffTOz9";
                        var19_6 = "P-.\u00f2\u008dD\u009f\u00c6\u00ae\u0015H\u00cf[\u009d_\u00ee\u00c3\u00c6\u00dfn\u0080^\u0014\u009c+\u0088\f3\u0090AY*\u0096\u00c9\u00a7zF\u00cb\u00c2\u0010\u00f7\u00ec\u00bf{\f\\\u00bf1\u00e6L)\u00b24\u00actW\u00f3\\v\u0082x\u0005\u00ed=\u00c9\u00a6\u000f\u009f\u0084jL8\u00ce+\u00b7\u00dam\u00a4\u00a5\u00b3\u00102t\u00f5\u001e\u00d0\u00ce\u00f0@\u00ecyEb\u00e2\u00b1*\u00e9\u00184\u00b7/I\u00ae\u00bc}\u00f7\u0091\u00f4\u00d1]ct\u000f\u00de\u001dpu\u00bf\u00d9\u00f6\u00e3\u00b3\u00b9\u0092\u00ab\u000b\u0013P\u00a8Gw+\u0001\u00fe\n\u00a0\u009c\u00d6j\u00fdi]U\u00ba\u00bd\u0007\u00f2\u00f8a\u00b0;\u00cfd@\u00ec\u0006\u00cf\u00dfY-\u0011\u00e7V\u0006yOK\\\u00a9\u00f1\u001b\u00ca*\u00e2jL`\u00da\u00bb\u00e7_Z\u007f\u00c6In\u00f1G\n\u00a2\u00d7\u0016\u00e5Q\u0016\u00c5\u00f6\u001fS\u00e5T\u00d2\u00be]\u0081\u0006}\u00dd\u0087\u009d7\u0090\u00ba\u00ffTOz9".length();
                        var16_7 = 88;
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
                            var20_3[var18_4++] = mc.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\\\u00f9\u0005\u00c1\u00a2'\u00ecuQ\u0019\\9\u001f\u00d9\u00d903\u00c7\u0007(\u00cf\u0006\u0083j1El\u00cc6\u00f5\u001aLa\bCeS\u0085u\u00b1~\u0093\u00bf#\u00efI\u00dfY<\fm\u0011\u00b7\u00fb\u0093n\u0015\u00aa\u0087-I\u0013\u00e2\u00f7\u009am\u00edy\"\u00a9\u00ce5Jt\u00ebs]\u000b\u0092=\u00b2\u00a5\u0087C\u008d\u00b1\u00ab<n\u00ac\u009e\u00ef}\u008cZ\u00f6\u0010\u00af6\u0084\u0013tg=\u009a<\u00bc\u00b8\u0002\u00b5\u00c2\u0018P\u00cf)\u000e\u009e\u00f3s\u0085\u00a6W\u00d2\u00f2\u00f5\u00f1\u00ed\u0093Q\u0010\u00f6\u00f8\u0089\u00b6\u00c6\u00f9J\u00903X>\u00c8\u00043*T\u00f4\u00afU@)\u00e8\u008e\u00f1\u0016\u0086\u00ee:\u0014\ru\u001e&\u00b6\u0014z\u008d\u00b6\u00eaY5s\u008c\u00d3\u00c1\u00fc%\u00feC\u00e0\u00cf\u00fee\u0019\u0085\u00a4^J\u00c6\u00da\u00b2\u00f1\u00d9";
                            var19_6 = "\\\u00f9\u0005\u00c1\u00a2'\u00ecuQ\u0019\\9\u001f\u00d9\u00d903\u00c7\u0007(\u00cf\u0006\u0083j1El\u00cc6\u00f5\u001aLa\bCeS\u0085u\u00b1~\u0093\u00bf#\u00efI\u00dfY<\fm\u0011\u00b7\u00fb\u0093n\u0015\u00aa\u0087-I\u0013\u00e2\u00f7\u009am\u00edy\"\u00a9\u00ce5Jt\u00ebs]\u000b\u0092=\u00b2\u00a5\u0087C\u008d\u00b1\u00ab<n\u00ac\u009e\u00ef}\u008cZ\u00f6\u0010\u00af6\u0084\u0013tg=\u009a<\u00bc\u00b8\u0002\u00b5\u00c2\u0018P\u00cf)\u000e\u009e\u00f3s\u0085\u00a6W\u00d2\u00f2\u00f5\u00f1\u00ed\u0093Q\u0010\u00f6\u00f8\u0089\u00b6\u00c6\u00f9J\u00903X>\u00c8\u00043*T\u00f4\u00afU@)\u00e8\u008e\u00f1\u0016\u0086\u00ee:\u0014\ru\u001e&\u00b6\u0014z\u008d\u00b6\u00eaY5s\u008c\u00d3\u00c1\u00fc%\u00feC\u00e0\u00cf\u00fee\u0019\u0085\u00a4^J\u00c6\u00da\u00b2\u00f1\u00d9".length();
                            var16_7 = 112;
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
                            var20_3[var18_4++] = mc.a(var21_9).intern();
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
                mc.b = var20_3;
                mc.c = new String[5];
                mc.h = new HashMap<K, V>(13);
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
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "X1\u0098\u0081&\u008d\u0001\u001b\u0097\u0080\u00be\u00b2Z^)\u00c5\u00d2\u00fa\u00c9\u0019z\u0016\u00da\u0018";
                var5_15 = "X1\u0098\u0081&\u008d\u0001\u001b\u0097\u0080\u00be\u00b2Z^)\u00c5\u00d2\u00fa\u00c9\u0019z\u0016\u00da\u0018".length();
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
                    var4_14 = "\u0094\u000e\u008a\u0098dK\u00d0=\u00da\u00cd\u00fb\u0081\u00c3t:\u00ef";
                    var5_15 = "\u0094\u000e\u008a\u0098dK\u00d0=\u00da\u00cd\u00fb\u0081\u00c3t:\u00ef".length();
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
        mc.e = var6_12;
        mc.g = new Integer[5];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x10;
        if (c[n11] == null) {
            Object[] objectArray;
            try {
                Long l11 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l11);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l11, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/mc", exception);
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
            mc.c[n11] = mc.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n11];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        String string2 = mc.a(n10, l10);
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
            throw new RuntimeException("com/zelix/mc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n10, long l10) {
        int n11 = n10 ^ (int)(l10 & 0x7FFFL) ^ 0x713F;
        if (g[n11] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n11];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/zelix/mc", exception);
            }
            int n12 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mc.g[n11] = n12;
        }
        return g[n11];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n10 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n11 = mc.b(n10, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n11);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n11;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("com/zelix/mc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(mc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

