package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hl extends hq {
   final int e;
   private static final long a = ess.a(6819815666011436354L, 5821285467329639815L, MethodHandles.lookup().lookupClass()).a(225446627174360L);
   private static final long b;

   hl(int param1, h8 param2, long param3, _xx param5, _y4 param6, _y4 param7, PrintWriter param8, wp param9, Map param10, Map param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hl.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: lload 3
      // 07: dup2
      // 08: ldc2_w 128975881095893
      // 0b: lxor
      // 0c: lstore 12
      // 0e: dup2
      // 0f: ldc2_w 34997631676829
      // 12: lxor
      // 13: lstore 14
      // 15: dup2
      // 16: ldc2_w 93816500493467
      // 19: lxor
      // 1a: dup2
      // 1b: bipush 32
      // 1d: lushr
      // 1e: l2i
      // 1f: istore 16
      // 21: dup2
      // 22: bipush 32
      // 24: lshl
      // 25: bipush 48
      // 27: lushr
      // 28: l2i
      // 29: istore 17
      // 2b: dup2
      // 2c: bipush 48
      // 2e: lshl
      // 2f: bipush 48
      // 31: lushr
      // 32: l2i
      // 33: istore 18
      // 35: pop2
      // 36: dup2
      // 37: ldc2_w 30550343898612
      // 3a: lxor
      // 3b: lstore 19
      // 3d: pop2
      // 3e: ldc2_w -326631078314455245
      // 41: lload 3
      // 42: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: aload 0
      // 48: aload 2
      // 49: invokespecial com/zelix/hq.<init> (Lcom/zelix/h8;)V
      // 4c: istore 21
      // 4e: iload 16
      // 50: iload 17
      // 52: i2s
      // 53: iload 18
      // 55: invokestatic com/zelix/_uo.f (ISI)Lcom/zelix/_uo;
      // 58: astore 22
      // 5a: aload 0
      // 5b: aload 5
      // 5d: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 60: putfield com/zelix/hl.e I
      // 63: aload 9
      // 65: lload 19
      // 67: invokevirtual com/zelix/wp.C (J)I
      // 6a: istore 23
      // 6c: iload 21
      // 6e: ifne 9f
      // 71: iload 23
      // 73: bipush -1
      // 74: if_icmpne aa
      // 77: goto 84
      // 7a: ldc2_w -2014338914651351560
      // 7d: lload 3
      // 7e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: aload 0
      // 85: aload 0
      // 86: ldc2_w -350162012522832950
      // 89: lload 3
      // 8a: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: putfield com/zelix/hl.c I
      // 92: goto 9f
      // 95: ldc2_w -2014338914651351560
      // 98: lload 3
      // 99: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: lload 3
      // a0: lconst_0
      // a1: lcmp
      // a2: iflt e6
      // a5: iload 21
      // a7: ifeq ca
      // aa: aload 0
      // ab: iload 23
      // ad: bipush 1
      // ae: iadd
      // af: aload 0
      // b0: ldc2_w -350162012522832950
      // b3: lload 3
      // b4: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: iadd
      // ba: putfield com/zelix/hl.c I
      // bd: goto ca
      // c0: ldc2_w -2014338914651351560
      // c3: lload 3
      // c4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: athrow
      // ca: aload 9
      // cc: aload 0
      // cd: getfield com/zelix/hl.c I
      // d0: invokevirtual com/zelix/wp.V (I)V
      // d3: aload 6
      // d5: aload 22
      // d7: aload 0
      // d8: getfield com/zelix/hl.c I
      // db: lload 12
      // dd: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // e0: aload 0
      // e1: lload 14
      // e3: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // e6: return
   }

   protected void W(DataOutputStream var1, wp var2, Map var3, long var4) {
      long var6 = var4 ^ 128704502481930L;
      var1.writeByte(x44.a<"i">(this, new Object[]{var6}, -7287370723922932070L, var4));
      var1.writeShort(x44.a<"m">(this, -8670671576674080958L, var4));
   }

   final void N(long var1, _8l var3) {
   }

   public int z(long var1) {
      byte var3 = 1;
      return var3 + 2;
   }

   public hl(h6 var1, _op var2, int var3) {
      super(var1);
      this.W = var2;
      this.e = var3;
      this.P = true;
   }

   public int I(Object[] var1) {
      long var2 = (Long)var1[0];
      return (int)b;
   }

   static {
      long var0 = a ^ 140401235270113L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -5690998367603771497L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)((int)(var4 >>> 56)),
            (byte)((int)(var4 >>> 48)),
            (byte)((int)(var4 >>> 40)),
            (byte)((int)(var4 >>> 32)),
            (byte)((int)(var4 >>> 24)),
            (byte)((int)(var4 >>> 16)),
            (byte)((int)(var4 >>> 8)),
            (byte)((int)var4)
         }
      );
      long var7 = ((long)var6[0] & 255L) << 56
         | ((long)var6[1] & 255L) << 48
         | ((long)var6[2] & 255L) << 40
         | ((long)var6[3] & 255L) << 32
         | ((long)var6[4] & 255L) << 24
         | ((long)var6[5] & 255L) << 16
         | ((long)var6[6] & 255L) << 8
         | (long)var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
