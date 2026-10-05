package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ls {
   Map y;
   private final int z;
   private final int f;
   private static final long a = ess.a(-8941129819624682496L, -519856557088776743L, MethodHandles.lookup().lookupClass()).a(82003263964031L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public boolean c(Object var1, Object var2, long var3, Object var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 27270462303422L;
      long var8 = var3 ^ 120361438247L;
      String var10000 = x44.a<"s">(8363918434754981142L, var3);
      w var11 = (w)this.y.get(var1);
      String var10 = var10000;

      label27: {
         try {
            if (var10 != null) {
               return var11.u(var8, var2, var5);
            }

            if (var11 == null) {
               break label27;
            }
         } catch (gj var13) {
            throw x44.a<"s">(var13, 7915692582352043508L, var3);
         }

         return var11.u(var8, var2, var5);
      }

      var11 = new w(var6, x44.a<"o">(this, 8401754888968276153L, var3), x44.a<"o">(this, 8108330614614214516L, var3));
      boolean var12 = var11.u(var8, var2, var5);
      this.y.put(var1, var11);
      return var12;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public e9 E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 12584585524028L;
      long var6 = var2 ^ 40890461670031L;
      String var10000 = x44.a<"v">(-7471591218177801909L, var2);
      ax var9 = new ax(this.y.size() * 2, var4);
      Iterator var10 = x44.a<"n">(this, new Object[0], -8934063640795303663L, var2).iterator();
      String var8 = var10000;

      label76:
      while (true) {
         Iterator var18 = var10;

         label74:
         while (true) {
            Object var19;
            if (var18.hasNext()) {
               var19 = var10.next();
            } else {
               var19 = new e9(var9);
               if (var2 > 0L) {
                  return (e9)var19;
               }
            }

            do {
               Entry var11 = (Entry)var19;
               w var12 = (w)var11.getValue();
               Iterator var13 = x44.a<"n">(var12, new Object[0], -8756303392380302960L, var2).iterator();

               label69:
               while (true) {
                  Entry var14;
                  if (var13.hasNext()) {
                     var14 = (Entry)var13.next();
                     var19 = var14.getValue();
                  } else {
                     var21 = var8;
                     if (var2 >= 0L) {
                        break;
                     }

                     var14 = (Entry)var8;
                     var19 = var14.getValue();
                  }

                  label67:
                  while (true) {
                     var18 = ((Set)var19).iterator();
                     if (var8 != null) {
                        continue label74;
                     }

                     Iterator var15 = var18;

                     label63:
                     while (true) {
                        if (var15.hasNext()) {
                           var19 = var15.next();
                        } else {
                           var19 = var8;
                           if (var2 >= 0L) {
                              break;
                           }
                        }

                        while (true) {
                           Object var16 = var19;
                           var9.b(var6, var11.getKey(), var14.getKey(), var16);
                           if (var8 != null) {
                              continue label69;
                           }

                           var19 = var8;
                           if (var2 < 0L) {
                              continue label67;
                           }

                           if (var8 == null) {
                              break;
                           }

                           var19 = var8;
                           if (var2 >= 0L) {
                              break label63;
                           }
                        }
                     }

                     if (var19 == null) {
                        break;
                     }

                     var21 = var8;
                     if (var2 >= 0L) {
                        break label69;
                     }

                     var14 = (Entry)var8;
                     var19 = var14.getValue();
                  }
               }

               if (var21 == null) {
                  continue label76;
               }

               var19 = new e9(var9);
            } while (var2 <= 0L);

            return (e9)var19;
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public w s(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 10360655190242L;
      long var10001 = var2 ^ 31595423592969L;
      int var6 = (int)((var2 ^ 31595423592969L) >>> 56);
      int var7 = (int)((var2 ^ 31595423592969L) << 8 >>> 32);
      int var8 = (int)(var10001 << 40 >>> 40);
      long var9 = var2 ^ 84819582717585L;
      w var12 = new w(this.y.size(), (byte)var6, var7, var8);
      String var10000 = x44.a<"u">(-5285863975808290912L, var2);
      Iterator var13 = x44.a<"m">(this, new Object[0], -6131490829386801158L, var2).iterator();
      String var11 = var10000;

      label44:
      while (var13.hasNext()) {
         Entry var14 = (Entry)var13.next();
         Object var15 = var14.getKey();
         var10000 = (String)var14.getValue();

         label39:
         while (true) {
            w var16 = (w)var10000;
            if (var11 != null) {
               return var16;
            }

            Iterator var17 = x44.a<"m">(var16, new Object[]{var4}, -5798366373061322287L, var2).iterator();

            while (true) {
               if (var17.hasNext()) {
                  var10000 = (String)var17.next();
               } else {
                  var10000 = var11;
                  if (var2 > 0L) {
                     break label39;
                  }
               }

               while (true) {
                  Object var18 = var10000;
                  var12.u(var9, var15, var18);
                  if (var11 != null) {
                     continue label44;
                  }

                  var10000 = var11;
                  if (var2 <= 0L) {
                     continue label39;
                  }

                  if (var11 == null) {
                     break;
                  }

                  var10000 = var11;
                  if (var2 > 0L) {
                     break label39;
                  }
               }
            }
         }

         if (var10000 != null) {
            break;
         }
      }

      return var12;
   }

   public ls(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 99154714813060L;
      this(var3, a<"t">(25819, 8103756868817273628L ^ var1), a<"t">(21148, 2619670416145675610L ^ var1));
   }

   public Set c(Object[] var1) {
      return this.y.entrySet();
   }

   public ls(long var1, int var3, int var4, int var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 116872398769761L;
      long var8 = var1 ^ 48791002597370L;
      super();
      this.z = var4;
      this.f = var5;
      int var10001 = sh.Q(var3, var8);
      Object[] var10004 = new Object[]{null, var6};
      var10004[0] = var10001;
      this.y = x44.a<"t">(var10004, -1125059408087484463L, var1);
   }

   public Set e(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Object
      // 19: astore 4
      // 1b: pop
      // 1c: getstatic com/zelix/ls.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 23065115046881
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: ldc2_w -3949755439321919445
      // 2e: lload 2
      // 2f: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: aload 0
      // 35: getfield com/zelix/ls.y Ljava/util/Map;
      // 38: aload 5
      // 3a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3f: checkcast com/zelix/w
      // 42: astore 9
      // 44: astore 8
      // 46: aload 9
      // 48: aload 8
      // 4a: ifnonnull 6b
      // 4d: ifnonnull 69
      // 50: goto 5d
      // 53: ldc2_w -3393728759630921527
      // 56: lload 2
      // 57: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aconst_null
      // 5e: areturn
      // 5f: ldc2_w -3393728759630921527
      // 62: lload 2
      // 63: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: aload 9
      // 6b: lload 6
      // 6d: aload 4
      // 6f: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 72: areturn
   }

   public w R(Object[] var1) {
      Object var2 = var1[0];
      return (w)this.y.get(var2);
   }

   public ls(long var1, int var3, int var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 59630175688701L;
      this(var5, var3, var4, a<"t">(14753, 7555301872952537599L ^ var1));
   }

   static {
      long var0 = a ^ 91206692855241L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[3];
      int var5 = 0;
      String var6 = "âE\u001bC[®¦Sî§OvYÖ¨n×R=]\u0096\u0094\u0086\u0005";
      int var7 = "âE\u001bC[®¦Sî§OvYÖ¨n×R=]\u0096\u0094\u0086\u0005".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)((int)(var10 >>> 56)),
               (byte)((int)(var10 >>> 48)),
               (byte)((int)(var10 >>> 40)),
               (byte)((int)(var10 >>> 32)),
               (byte)((int)(var10 >>> 24)),
               (byte)((int)(var10 >>> 16)),
               (byte)((int)(var10 >>> 8)),
               (byte)((int)var10)
            }
         );
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[3];
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11385;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = b[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ls", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/ls" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
