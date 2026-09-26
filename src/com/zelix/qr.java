/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.m44;
import com.zelix.nn;
import com.zelix.prr;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class qr
implements Serializable {
    public boolean d;
    public boolean c;
    public boolean b;
    public boolean e;
    public boolean a;
    public boolean f;
    private static final long g = prr.a((long)7681007487019334912L, (long)-8868636923535037194L, MethodHandles.lookup().lookupClass()).a(252544214517115L);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String string, String string2) {
        File file = new File(string, string2);
        long l = g ^ 0x2A33B5929DA9L;
        if (m44.a("u", (Object)file, (long)-4037827883620711890L, (long)l) != false && (m44.a("u", (Object)file, (long)-2683452228289162824L, (long)l) != false || m44.a("u", (Object)file, (long)-2848247974922190656L, (long)l) == false)) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        m44.a("u", (Object)objectOutputStream, (Object)this, (long)-2680969911814331104L, (long)l);
        if (objectOutputStream == null) return;
        try {
            m44.a("u", (Object)objectOutputStream, (long)-4608906756844592589L, (long)l);
            return;
        }
        catch (IOException iOException) {}
        return;
        catch (IOException iOException) {
            if (objectOutputStream == null) return;
            try {
                m44.a("u", (Object)objectOutputStream, (long)-4608906756844592589L, (long)l);
                return;
            }
            catch (IOException iOException2) {}
            return;
            catch (Throwable throwable) {
                if (objectOutputStream == null) throw throwable;
                try {
                    m44.a("u", objectOutputStream, (long)-4608906756844592589L, (long)l);
                    throw throwable;
                }
                catch (IOException iOException3) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public qr(String string, String string2) {
        long l = g ^ 0x6936384FF729L;
        m44.a("v", (Object)this, (boolean)false, (long)-5267938170450186680L, (long)l);
        m44.a("v", (Object)this, (boolean)true, (long)-5824051029342757374L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-5953577763198813992L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-6012814238856436323L, (long)l);
        m44.a("v", (Object)this, (boolean)false, (long)-5396020131698211297L, (long)l);
        m44.a("v", (Object)this, (boolean)true, (long)-5919740701464889699L, (long)l);
        File file = new File(string, string2);
        if (m44.a("u", (Object)file, (long)-5947421210789566290L, (long)l) == false) return;
        if (m44.a("u", (Object)file, (long)-5745971419607106760L, (long)l) != false) return;
        if (m44.a("u", (Object)file, (long)-5628710491202100880L, (long)l) == false) return;
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            qr qr2 = (qr)((Object)m44.a("u", (Object)objectInputStream, (long)-5440864553257820170L, (long)l));
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)qr2, (long)-5267938170450186680L, (long)l), (long)-5267938170450186680L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)qr2, (long)-5824051029342757374L, (long)l), (long)-5824051029342757374L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)qr2, (long)-6012814238856436323L, (long)l), (long)-6012814238856436323L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)qr2, (long)-5953577763198813992L, (long)l), (long)-5953577763198813992L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)qr2, (long)-5396020131698211297L, (long)l), (long)-5396020131698211297L, (long)l);
            m44.a("v", (Object)this, (boolean)m44.a("t", (Object)qr2, (long)-5919740701464889699L, (long)l), (long)-5919740701464889699L, (long)l);
            if (objectInputStream == null) return;
        }
        catch (IOException iOException) {
            if (objectInputStream == null) return;
            try {
                m44.a("u", (Object)objectInputStream, (long)-5351891133969536620L, (long)l);
                return;
            }
            catch (IOException iOException2) {
                return;
            }
            catch (ClassNotFoundException classNotFoundException) {
                if (objectInputStream == null) return;
                try {
                    m44.a("u", (Object)objectInputStream, (long)-5351891133969536620L, (long)l);
                    return;
                }
                catch (IOException iOException3) {
                    return;
                }
                catch (ClassCastException classCastException) {
                    if (objectInputStream == null) return;
                    try {
                        m44.a("u", (Object)objectInputStream, (long)-5351891133969536620L, (long)l);
                        return;
                    }
                    catch (IOException iOException4) {
                        return;
                    }
                    catch (nn nn2) {
                        throw nn2;
                        catch (Throwable throwable) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            m44.a("u", (Object)objectInputStream, (long)-5351891133969536620L, (long)l);
            return;
        }
        catch (IOException iOException) {
            return;
        }
        finally {
            if (objectInputStream != null) {
                try {
                    m44.a("u", objectInputStream, (long)-5351891133969536620L, (long)l);
                }
                catch (IOException iOException) {}
            }
        }
    }

    public qr() {
        long l = g ^ 0x12224195355FL;
        m44.a("p", (Object)this, (boolean)false, (long)8400054643811593278L, (long)l);
        m44.a("p", (Object)this, (boolean)true, (long)7879798954015857780L, (long)l);
        m44.a("p", (Object)this, (boolean)false, (long)8004831150558444206L, (long)l);
        m44.a("p", (Object)this, (boolean)false, (long)7996222892584462315L, (long)l);
        m44.a("p", (Object)this, (boolean)false, (long)8604979569987896425L, (long)l);
        m44.a("p", (Object)this, (boolean)true, (long)8047545670553941227L, (long)l);
    }
}
