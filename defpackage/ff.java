package p000;

import java.lang.reflect.Array;

public class ff {
    public static ks ab = null;
    static final int ad = 7;
    static final int af = 14;
    int aa;
    int ag;
    int[][] ay;

    public ff(int i, int i2) {
        try {
            if (i != i2) {
                int i3;
                int i4;
                if (i2 > i) {
                    i3 = i;
                    i4 = i2;
                } else {
                    i3 = i2;
                    i4 = i;
                }
                while (i3 != 0) {
                    int i5 = i4 % i3;
                    i4 = i3;
                    i3 = i5;
                }
                int i6 = i / i4;
                int i7 = i2 / i4;
                this.aa = -1123487229 * i6;
                this.ag = 1737932009 * i7;
                this.ay = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i6, 14});
                for (int i8 = 0; i8 < i6; i8++) {
                    int[] iArr = this.ay[i8];
                    double d = 6.0d + (((double) i8) / ((double) i6));
                    i4 = (int) Math.floor((d - 7.0d) + 1.0d);
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    i3 = (int) Math.ceil(7.0d + d);
                    if (i3 > 14) {
                        i3 = 14;
                    }
                    double d2 = ((double) i7) / ((double) i6);
                    for (i4 = 
/*
Method generation error in method: ff.<init>(int, int):void
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r3_7 'i4' int) = (r3_5 'i4' int), (r3_6 'i4' int) binds: {(r3_5 'i4' int)=B:6:0x0028, (r3_6 'i4' int)=B:7:0x002a} in method: ff.<init>(int, int):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:190)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:277)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 32 more

*/

                    public static aj ad(int i, byte b) {
                        try {
                            aj ajVar = (aj) aj.ad.af((long) i);
                            if (ajVar == null) {
                                byte[] an = nf.af.an(11, i, -1284377984);
                                ajVar = new aj();
                                if (an != null) {
                                    ajVar.aa(new ik(an), (byte) -19);
                                }
                                ajVar.an((byte) 84);
                                aj.ad.an(ajVar, (long) i);
                            }
                            return ajVar;
                        } catch (Throwable e) {
                            throw ba.ad(e, "ff.ad(" + ')');
                        }
                    }

                    byte[] af(byte[] bArr, byte b) {
                        try {
                            if (this.ay != null) {
                                int i;
                                int i2;
                                int length = ((int) ((((long) bArr.length) * ((long) (-1896490151 * this.ag))) / ((long) (this.aa * -2114139989)))) + 14;
                                int[] iArr = new int[length];
                                int i3 = 0;
                                int i4 = 0;
                                for (byte b2 : bArr) {
                                    int[] iArr2 = this.ay[i4];
                                    for (i2 = 0; i2 < 14; i2++) {
                                        int i5 = i2 + i3;
                                        iArr[i5] = iArr[i5] + (iArr2[i2] * b2);
                                    }
                                    i2 = (-1896490151 * this.ag) + i4;
                                    i4 = i2 / (-2114139989 * this.aa);
                                    i3 += i4;
                                    i4 = i2 - (i4 * (-2114139989 * this.aa));
                                }
                                bArr = new byte[length];
                                for (i2 = 0; i2 < length; i2++) {
                                    i = (iArr[i2] + 32768) >> 16;
                                    if (i < -128) {
                                        bArr[i2] = Byte.MIN_VALUE;
                                    } else if (i > 127) {
                                        bArr[i2] = Byte.MAX_VALUE;
                                    } else {
                                        bArr[i2] = (byte) i;
                                    }
                                }
                            }
                            return bArr;
                        } catch (Throwable e) {
                            throw ba.ad(e, "ff.af(" + ')');
                        }
                    }

                    int aa(int i) {
                        return this.ay != null ? (int) ((((long) (this.ag * -293560364)) * ((long) i)) / ((long) (this.aa * -1659722271))) : i;
                    }

                    int ad(int i, int i2) {
                        try {
                            return this.ay != null ? (int) ((((long) (this.ag * -1896490151)) * ((long) i)) / ((long) (this.aa * -2114139989))) : i;
                        } catch (Throwable e) {
                            throw ba.ad(e, "ff.ad(" + ')');
                        }
                    }

                    int ag(int i) {
                        if (this.ay != null) {
                            return ((int) ((((long) i) * ((long) (this.ag * -671281909))) / ((long) (-2114139989 * this.aa)))) + 6;
                        }
                        return i;
                    }

                    int an(int i, int i2) {
                        try {
                            return this.ay != null ? ((int) ((((long) i) * ((long) (this.ag * -1896490151))) / ((long) (-2114139989 * this.aa)))) + 6 : i;
                        } catch (Throwable e) {
                            throw ba.ad(e, "ff.an(" + ')');
                        }
                    }

                    int ay(int i) {
                        if (this.ay != null) {
                            return ((int) ((((long) i) * ((long) (this.ag * -1896490151))) / ((long) (-2114139989 * this.aa)))) + 6;
                        }
                        return i;
                    }
                }
