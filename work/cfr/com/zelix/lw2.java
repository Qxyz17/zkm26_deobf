/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.lq0;
import com.zelix.m44;
import com.zelix.prr;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class lw2
implements Map {
    Map P;
    private static final long a = prr.a(-3838175525670235846L, 8615396930415492936L, MethodHandles.lookup().lookupClass()).a(24934151914171L);

    @Override
    public boolean containsKey(Object object) {
        long l10 = a ^ 0x57FFB630F135L;
        return m44.a("w", (Object)this, (long)8890887539956722512L, (long)l10).containsKey(object);
    }

    public lq0 j(Object[] objectArray) {
        Object object = objectArray[0];
        long l10 = (Long)objectArray[1];
        lq0 lq02 = (lq0)objectArray[2];
        l10 = a ^ l10;
        return m44.a("v", (Object)this, (long)-1559453388193088919L, (long)l10).put(object, lq02);
    }

    public lq0 Y(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        Object object2 = objectArray[2];
        Object object3 = objectArray[3];
        long l11 = (l10 = a ^ l10) ^ 0x29468779DB64L;
        int n10 = (int)(l11 >>> 32);
        long l12 = l11 << 32 >>> 32;
        lq0 lq02 = new lq0(object2, n10, l12, object3);
        return m44.a("p", (Object)this, (long)6286367785148417807L, (long)l10).put(object, lq02);
    }

    @Override
    public boolean isEmpty() {
        long l10 = a ^ 0x2D6F9B2E0ED3L;
        return (boolean)m44.a("p", (Object)m44.a("q", (Object)this, (long)-8897778551696141130L, (long)l10), (long)-9170709719339752198L, (long)l10);
    }

    @Override
    public void clear() {
        long l10 = a ^ 0x296050F8A0B6L;
        m44.a("t", (Object)this, (long)3089954793588357843L, (long)l10).clear();
    }

    public lq0 U(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        l10 = a ^ l10;
        return (lq0)m44.a("w", (Object)this, (long)3518106999596277984L, (long)l10).get(object);
    }

    public Object remove(Object object) {
        long l10 = a ^ 0x3D0107398D9L;
        long l11 = l10 ^ 0x4FAD12AE9B57L;
        Object[] objectArray = new Object[2];
        objectArray[1] = object;
        objectArray[0] = l11;
        return m44.a("r", (Object)this, (Object)objectArray, (long)951270230151195444L, (long)l10);
    }

    public Collection values() {
        long l10 = a ^ 0x331E13A01FE5L;
        return m44.a("w", (Object)this, (long)-7659879708367927936L, (long)l10).values();
    }

    public Object put(Object object, Object object2) {
        long l10 = a ^ 0xFEE10EAB84BL;
        long l11 = l10 ^ 0x4EA5B96E5BECL;
        Object[] objectArray = new Object[3];
        objectArray[2] = (lq0)object2;
        objectArray[1] = l11;
        objectArray[0] = object;
        return m44.a("p", (Object)this, (Object)objectArray, (long)3349542318071274286L, (long)l10);
    }

    public lq0 v(Object[] objectArray) {
        long l10 = (Long)objectArray[0];
        Object object = objectArray[1];
        l10 = a ^ l10;
        return (lq0)m44.a("w", (Object)this, (long)752866747025021504L, (long)l10).remove(object);
    }

    @Override
    public int size() {
        long l10 = a ^ 0x52CC52B2A40EL;
        return m44.a("t", (Object)this, (long)3339914107696676459L, (long)l10).size();
    }

    public Object get(Object object) {
        long l10 = a ^ 0x57ED3A178B02L;
        long l11 = l10 ^ 0x706C5BABB22CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = object;
        objectArray[0] = l11;
        return m44.a("q", (Object)this, (Object)objectArray, (long)1997232156186264674L, (long)l10);
    }

    public lw2(long l10) {
        long l11 = (l10 = a ^ l10) ^ 0x2911620BE09CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l11;
        m44.a("u", (Object)this, (Map)((Object)m44.a("i", (Object)objectArray, (long)358226328446132250L, (long)l10)), (long)153847470988349968L, (long)l10);
    }

    public Set keySet() {
        long l10 = a ^ 0x5A1EB6AF0611L;
        return m44.a("s", (Object)this, (long)-8338754469545190284L, (long)l10).keySet();
    }

    public void putAll(Map map) {
        long l10 = a ^ 0x32A3AC897FFL;
        m44.a("t", (Object)m44.a("u", (Object)this, (long)2137120515119730074L, (long)l10), (Object)map, (long)2205553242434073308L, (long)l10);
    }

    public Set entrySet() {
        long l10 = a ^ 0x371EC2BE0A3EL;
        return m44.a("t", (Object)this, (long)-9193632455446245285L, (long)l10).entrySet();
    }

    @Override
    public boolean containsValue(Object object) {
        long l10 = a ^ 0x235003FDFF17L;
        return (boolean)m44.a("t", (Object)m44.a("u", (Object)this, (long)8448950482878866802L, (long)l10), (Object)object, (long)7504532388924594350L, (long)l10);
    }
}

