/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.n9;
import com.zelix.prr;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import javax.swing.JPanel;

public class l77
extends JPanel {
    int v;
    Image N;
    boolean r;
    int j;
    private static final long a = prr.a((long)8659420921377927343L, (long)7280616675694589780L, MethodHandles.lookup().lookupClass()).a(272499020065397L);

    @Override
    public Dimension getPreferredSize() {
        long l = a ^ 0x4BCCC2E5A99FL;
        return new Dimension((int)m44.a("w", (Object)this, (long)-608777413204724907L, (long)l), (int)m44.a("w", (Object)this, (long)-1171388683548712693L, (long)l));
    }

    public boolean k(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        return (boolean)m44.a("r", (Object)this, (long)-2478489300944873192L, (long)l);
    }

    @Override
    public void update(Graphics graphics) {
        long l = a ^ 0x42F405D312C6L;
        m44.a("w", (Object)graphics, (Object)m44.a("v", (Object)this, (long)5293968907165147837L, (long)l), (int)0, (int)0, (int)m44.a("v", (Object)this, (long)5536112599161112588L, (long)l), (int)m44.a("v", (Object)this, (long)6117978508793485906L, (long)l), (Object)this, (long)5851377140705887401L, (long)l);
    }

    private void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = a ^ l;
        MediaTracker mediaTracker = new MediaTracker(this);
        m44.a("s", (Object)mediaTracker, (Object)m44.a("r", (Object)this, (long)7913926125573801497L, (long)l), (int)0, (long)8111537931470332183L, (long)l);
        try {
            m44.a("s", (Object)mediaTracker, (int)0, (long)8303551223765391834L, (long)l);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    @Override
    public void paint(Graphics graphics) {
        long l = a ^ 0x231AAB8F35C0L;
        m44.a("q", (Object)this, (Object)graphics, (long)8494493007151285126L, (long)l);
    }

    @Override
    public Dimension getMinimumSize() {
        long l = a ^ 0x7A27CF9F02A0L;
        return m44.a("q", (Object)this, (long)5025947630188891104L, (long)l);
    }

    public l77(Image image, long l, Image image2) {
        block4: {
            block5: {
                long l2 = (l = a ^ l) ^ 0x4A2E693C8E73L;
                m44.a("r", (Object)this, (Image)image, (long)-5302436354542379613L, (long)l);
                Object[] objectArray = new Object[1];
                objectArray[0] = l2;
                m44.a("o", (Object)this, (Object)objectArray, (long)-6154112566193558582L, (long)l);
                CallSite callSite = m44.a("n", (long)-5199412994120476493L, (long)l);
                m44.a("r", (Object)this, (boolean)true, (long)-5467156517623009118L, (long)l);
                CallSite callSite2 = m44.a("q", (Object)this, (Object)m44.a("p", (Object)this, (long)-5302436354542379613L, (long)l), (Object)this, (long)-6054297916335392024L, (long)l);
                CallSite callSite3 = callSite;
                try {
                    try {
                        if (callSite3 == null) break block4;
                        if (callSite2 != false) break block5;
                    }
                    catch (n9 n92) {
                        throw m44.a("n", (Object)((Object)n92), (long)-5616739948745565218L, (long)l);
                    }
                    m44.a("r", (Object)this, (Image)image2, (long)-5302436354542379613L, (long)l);
                    m44.a("r", (Object)this, (boolean)false, (long)-5467156517623009118L, (long)l);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    m44.a("o", (Object)this, (Object)objectArray2, (long)-6154112566193558582L, (long)l);
                    m44.a("q", (Object)this, (Object)m44.a("p", (Object)this, (long)-5302436354542379613L, (long)l), (Object)this, (long)-6054297916335392024L, (long)l);
                }
                catch (n9 n93) {
                    throw m44.a("n", (Object)((Object)n93), (long)-5616739948745565218L, (long)l);
                }
            }
            m44.a("r", (Object)this, (int)m44.a("q", (Object)m44.a("p", (Object)this, (long)-5302436354542379613L, (long)l), (Object)this, (long)-5356424605531055531L, (long)l), (long)-5491511351908436206L, (long)l);
            m44.a("r", (Object)this, (int)m44.a("q", (Object)m44.a("p", (Object)this, (long)-5302436354542379613L, (long)l), (Object)this, (long)-5923750930904830750L, (long)l), (long)-6054685505785371316L, (long)l);
            m44.a("q", (Object)this, (long)-5287444528637284554L, (long)l);
        }
    }

    private static n9 a(n9 n92) {
        return n92;
    }
}
