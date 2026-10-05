package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class id extends h8 implements yk, Comparable {
   private int t;
   private _op g;
   private static final long a = ess.a(154303066425493451L, 917001117226334485L, MethodHandles.lookup().lookupClass()).a(225051551740768L);
   private static final String b;

   id(long var1, h8 var3, _xx var4, _y4 var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 39665089993728L;
      long var8 = var1 ^ 86355475294024L;
      super(var3);
      int var10 = var4.readUnsignedShort();
      var5.G(z.R(var10, var6), this, var8);
      this.t = var4.readUnsignedShort();
   }

   public _op J(Object[] var1) {
      return this.g;
   }

   void N(long var1, _8l var3) {
   }

   public wd B(int var1, byte var2, int var3) {
      return wd.T;
   }

   public void e(Integer var1, long var2, _op var4) {
      this.g = var4;
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      return b;
   }

   public void m(Object[] var1) {
      long var3 = (Long)var1[0];
      w var2 = (w)var1[1];
      long var5 = var3 ^ 11807521485311L;
      var2.u(var5, this.g, this);
   }

   public void r(int var1) {
      this.t = var1;
   }

   protected void W(DataOutputStream var1) {
      var1.writeShort(this.g.W());
      var1.writeShort(this.t);
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 118557577748691L;
      long var4 = var2 ^ 95283760675195L;
      return x44.a<"m">(this, new Object[]{(id)var1, var4}, -106358272418858995L, var2);
   }

   public int I(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast com/zelix/id
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/id.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -8611573928919909319
      // 1d: lload 2
      // 1e: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: istore 5
      // 25: aload 0
      // 26: getfield com/zelix/id.g Lcom/zelix/_op;
      // 29: invokevirtual com/zelix/_op.W ()I
      // 2c: aload 4
      // 2e: getfield com/zelix/id.g Lcom/zelix/_op;
      // 31: invokevirtual com/zelix/_op.W ()I
      // 34: iload 5
      // 36: ifne 7c
      // 39: if_icmpge 55
      // 3c: goto 49
      // 3f: ldc2_w -7599078701440608376
      // 42: lload 2
      // 43: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: bipush -1
      // 4a: ireturn
      // 4b: ldc2_w -7599078701440608376
      // 4e: lload 2
      // 4f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: aload 0
      // 56: getfield com/zelix/id.g Lcom/zelix/_op;
      // 59: invokevirtual com/zelix/_op.W ()I
      // 5c: iload 5
      // 5e: lload 2
      // 5f: lconst_0
      // 60: lcmp
      // 61: iflt 6f
      // 64: ifne fb
      // 67: aload 4
      // 69: getfield com/zelix/id.g Lcom/zelix/_op;
      // 6c: invokevirtual com/zelix/_op.W ()I
      // 6f: goto 7c
      // 72: ldc2_w -7599078701440608376
      // 75: lload 2
      // 76: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: lload 2
      // 7d: lconst_0
      // 7e: lcmp
      // 7f: ifle 8e
      // 82: if_icmpne fa
      // 85: aload 0
      // 86: getfield com/zelix/id.t I
      // 89: aload 4
      // 8b: getfield com/zelix/id.t I
      // 8e: lload 2
      // 8f: lconst_0
      // 90: lcmp
      // 91: iflt e9
      // 94: iload 5
      // 96: ifne e9
      // 99: goto a6
      // 9c: ldc2_w -7599078701440608376
      // 9f: lload 2
      // a0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: athrow
      // a6: lload 2
      // a7: lconst_0
      // a8: lcmp
      // a9: ifle ce
      // ac: if_icmpge c8
      // af: goto bc
      // b2: ldc2_w -7599078701440608376
      // b5: lload 2
      // b6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: athrow
      // bc: bipush -1
      // bd: ireturn
      // be: ldc2_w -7599078701440608376
      // c1: lload 2
      // c2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 0
      // c9: getfield com/zelix/id.t I
      // cc: iload 5
      // ce: lload 2
      // cf: lconst_0
      // d0: lcmp
      // d1: iflt dc
      // d4: ifne f9
      // d7: aload 4
      // d9: getfield com/zelix/id.t I
      // dc: goto e9
      // df: ldc2_w -7599078701440608376
      // e2: lload 2
      // e3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e8: athrow
      // e9: if_icmpne f8
      // ec: bipush 0
      // ed: ireturn
      // ee: ldc2_w -7599078701440608376
      // f1: lload 2
      // f2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f7: athrow
      // f8: bipush 1
      // f9: ireturn
      // fa: bipush 1
      // fb: ireturn
   }

   public int q() {
      return this.t;
   }

   static {
      long var0 = a ^ 137838852791753L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0010¼ÏeÈé\u0089ÄpUI \u007fâÿ\u001b".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
