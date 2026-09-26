/*
 * Decompiled with CFR 0.152.
 */
package com.zelix;

import com.zelix.h1;
import com.zelix.jx;
import com.zelix.lkh;
import com.zelix.m44;
import com.zelix.to;
import java.io.DataOutputStream;

public abstract class j0
extends jx
implements lkh {
    final int z;
    final int s;

    @Override
    public boolean G() {
        return true;
    }

    public j0(int n10, h1 h12, to to2) {
        super(n10, to2);
        this.s = h12.readUnsignedShort();
        this.z = h12.readUnsignedShort();
    }

    @Override
    void O(DataOutputStream dataOutputStream, long l10) {
        long l11 = l10 ^ 0x68EC39ED4954L;
        dataOutputStream.writeByte(this.A(l11).g());
        dataOutputStream.writeShort((int)m44.a("w", (Object)this, (long)-1757927856054372661L, (long)l10));
        dataOutputStream.writeShort((int)m44.a("w", (Object)this, (long)-2172795878897454933L, (long)l10));
    }
}

