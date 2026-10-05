package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o4 extends y1 {
   int f;
   Vector I = new Vector();
   private static final long a = ess.a(3759003002612469900L, -4766374606708018035L, MethodHandles.lookup().lookupClass()).a(189564715793005L);
   private static final String b;

   public o4(int var1) {
      super(var1);
   }

   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 53733908992340L;
      long var9 = var3 ^ 139470081862105L;
      long var11 = var3 ^ 1133881831266L;
      int var10000 = x44.a<"u">(8264398724260313806L, var3);
      int var14 = this.u(var11);
      int var13 = var10000;
      int var15 = 0;

      label34: {
         while (var15 < var14) {
            try {
               if (var3 > 0L) {
                  var18 = this.a(var15);
                  if (var13 == 0) {
                     break label34;
                  }

                  var18.h(this, var2, var5);
                  var15++;
               }

               if (var13 != 0) {
                  continue;
               }
            } catch (gj var16) {
               throw x44.a<"u">(var16, 7569555803124636441L, var3);
            }

            if (var3 > 0L) {
               break;
            }
         }

         var18 = var1;
      }

      ve var17 = (ve)var18;
      x44.a<"m">(var17, new Object[]{x44.a<"m">(this, new Object[]{var7}, 7772055412473863838L, var3), var9}, 7853878501544139098L, var3);
   }

   void r(Object[] var1) {
      this.f++;
   }

   void x(String var1) {
      this.I.addElement(var1);
   }

   public String V(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic com/zelix/o4.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w 8220263572025497081
      // 015: lload 2
      // 016: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: new java/lang/StringBuilder
      // 01e: dup
      // 01f: invokespecial java/lang/StringBuilder.<init> ()V
      // 022: astore 5
      // 024: aload 0
      // 025: getfield com/zelix/o4.I Ljava/util/Vector;
      // 028: invokevirtual java/util/Vector.size ()I
      // 02b: istore 6
      // 02d: istore 4
      // 02f: iload 6
      // 031: iload 4
      // 033: ifne 0c2
      // 036: ifeq 0c1
      // 039: goto 046
      // 03c: ldc2_w 7494092874892024341
      // 03f: lload 2
      // 040: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: athrow
      // 046: bipush 0
      // 047: istore 7
      // 049: iload 7
      // 04b: iload 6
      // 04d: if_icmpge 0c1
      // 050: aload 0
      // 051: getfield com/zelix/o4.I Ljava/util/Vector;
      // 054: iload 7
      // 056: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 059: checkcast java/lang/String
      // 05c: astore 8
      // 05e: aload 5
      // 060: aload 8
      // 062: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 065: pop
      // 066: iload 4
      // 068: lload 2
      // 069: lconst_0
      // 06a: lcmp
      // 06b: iflt 0be
      // 06e: ifne 0bc
      // 071: iload 7
      // 073: aload 0
      // 074: getfield com/zelix/o4.I Ljava/util/Vector;
      // 077: invokevirtual java/util/Vector.size ()I
      // 07a: bipush 1
      // 07b: isub
      // 07c: lload 2
      // 07d: lconst_0
      // 07e: lcmp
      // 07f: iflt 0ca
      // 082: iload 4
      // 084: ifne 0ca
      // 087: goto 094
      // 08a: ldc2_w 7494092874892024341
      // 08d: lload 2
      // 08e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: if_icmpge 0b9
      // 097: goto 0a4
      // 09a: ldc2_w 7494092874892024341
      // 09d: lload 2
      // 09e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 5
      // 0a6: ldc "."
      // 0a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ab: pop
      // 0ac: goto 0b9
      // 0af: ldc2_w 7494092874892024341
      // 0b2: lload 2
      // 0b3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: iinc 7 1
      // 0bc: iload 4
      // 0be: ifeq 049
      // 0c1: bipush 0
      // 0c2: istore 7
      // 0c4: iload 7
      // 0c6: aload 0
      // 0c7: getfield com/zelix/o4.f I
      // 0ca: if_icmpge 103
      // 0cd: aload 5
      // 0cf: getstatic com/zelix/o4.b Ljava/lang/String;
      // 0d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d5: iload 4
      // 0d7: ifne 105
      // 0da: goto 0e7
      // 0dd: ldc2_w 7494092874892024341
      // 0e0: lload 2
      // 0e1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: pop
      // 0e8: iinc 7 1
      // 0eb: iload 4
      // 0ed: ifeq 0c4
      // 0f0: lload 2
      // 0f1: lconst_0
      // 0f2: lcmp
      // 0f3: iflt 103
      // 0f6: goto 103
      // 0f9: ldc2_w 7494092874892024341
      // 0fc: lload 2
      // 0fd: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: aload 5
      // 105: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 108: areturn
   }

   static {
      long var0 = a ^ 20547317958250L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\\y\u001c¹Nø\u008cß".getBytes("ISO-8859-1"));
      String var5 = b(var4).intern();
      byte var10001 = -1;
      b = var5;
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
