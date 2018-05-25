package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class nm {
    public static final nm aa = new nm(4);
    public static final nm ad = new nm(5);
    public static final nm ae = new nm(3);
    public static final nm af = new nm(14);
    public static final nm ag = new nm(15);
    public static final nm aj = new nm(4);
    public static final nm an = new nm(2);
    public static final nm ar = new nm(6);
    public static final nm as = new nm(7);
    public static final nm ay = new nm(5);
    static final int bf = 7;
    static gd[] ez;

    nm(int i) {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "nm.<init>(" + ')');
        }
    }

    public static void af(ia iaVar, int i) {
        oy oyVar = (oy) oa.af.ag();
        if (oyVar != null) {
            int i2 = iaVar.ad * 1978945739;
            iaVar.ay(-1972136341 * oyVar.af, (short) 128);
            for (int i3 = 0; i3 < -2015133847 * oyVar.ad; i3++) {
                if (oyVar.aa[i3] != 0) {
                    iaVar.an(oyVar.aa[i3], (byte) 31);
                } else {
                    try {
                        int i4 = oyVar.an[i3];
                        int i5;
                        if (i4 == 0) {
                            i5 = oyVar.ag[i3].getInt(null);
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i5, (short) 128);
                        } else if (1 == i4) {
                            oyVar.ag[i3].setInt(null, oyVar.ay[i3]);
                            iaVar.an(0, (byte) 31);
                        } else if (i4 == 2) {
                            i5 = oyVar.ag[i3].getModifiers();
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i5, (short) 128);
                        }
                        if (i4 == 3) {
                            Method method = oyVar.as[i3];
                            byte[][] bArr = oyVar.ar[i3];
                            Object[] objArr = new Object[bArr.length];
                            for (i4 = 0; i4 < bArr.length; i4++) {
                                objArr[i4] = new ObjectInputStream(new ByteArrayInputStream(bArr[i4])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                iaVar.an(0, (byte) 31);
                            } else if (invoke instanceof Number) {
                                iaVar.an(1, (byte) 31);
                                iaVar.ar(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                iaVar.an(2, (byte) 31);
                                iaVar.aq((String) invoke, (byte) 50);
                            } else {
                                iaVar.an(4, (byte) 31);
                            }
                        } else if (4 == i4) {
                            i4 = oyVar.as[i3].getModifiers();
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i4, (short) 128);
                        }
                    } catch (ClassNotFoundException e) {
                        iaVar.an(-10, (byte) 31);
                    } catch (InvalidClassException e2) {
                        try {
                            iaVar.an(-11, (byte) 31);
                        } catch (Throwable e3) {
                            throw ba.ad(e3, "nm.af(" + ')');
                        }
                    } catch (StreamCorruptedException e4) {
                        iaVar.an(-12, (byte) 31);
                    } catch (OptionalDataException e5) {
                        iaVar.an(-13, (byte) 31);
                    } catch (IllegalAccessException e6) {
                        iaVar.an(-14, (byte) 31);
                    } catch (IllegalArgumentException e7) {
                        iaVar.an(-15, (byte) 31);
                    } catch (InvocationTargetException e8) {
                        iaVar.an(-16, (byte) 31);
                    } catch (SecurityException e9) {
                        iaVar.an(-17, (byte) 31);
                    } catch (IOException e10) {
                        iaVar.an(-18, (byte) 31);
                    } catch (NullPointerException e11) {
                        iaVar.an(-19, (byte) 31);
                    } catch (Exception e12) {
                        iaVar.an(-20, (byte) 31);
                    } catch (Throwable th) {
                        iaVar.an(-21, (byte) 31);
                    }
                }
            }
            iaVar.ba(i2, 1664578769);
            oyVar.ki();
        }
    }

    static final void ds(int i, int i2, boolean z, int i3) {
        if (z) {
            try {
                if (gr.dg * -999007853 == i && i2 == 47973899 * ee.df) {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "nm.ds(" + ')');
            }
        }
        gr.dg = 1216720027 * i;
        ee.df = -1740384861 * i2;
        ad.ai(25, -2122507077);
        client.ad.ry.ar(-28836521);
        en.cq(jv.am, true, -58299002);
        int i4 = 1407993063 * bq.du;
        int i5 = 1289967967 * gl.dp;
        bq.du = -1934330184 * (i - 6);
        gl.dp = (i2 - 6) * -956689160;
        int i6 = (1407993063 * bq.du) - i4;
        int i7 = (gl.dp * 1289967967) - i5;
        i4 = bq.du * 1407993063;
        i4 = gl.dp * 1289967967;
        for (i5 = 0; i5 < 32768; i5++) {
            gm gmVar = client.ca[i5];
            if (gmVar != null) {
                for (i4 = 0; i4 < 10; i4++) {
                    int[] iArr = gmVar.di;
                    iArr[i4] = iArr[i4] - i6;
                    iArr = gmVar.da;
                    iArr[i4] = iArr[i4] - i7;
                }
                gmVar.bg -= -399324032 * i6;
                gmVar.bh -= 698183808 * i7;
            }
        }
        for (i5 = 0; i5 < mn.ae; i5++) {
            ga gaVar = client.hb[i5];
            if (gaVar != null) {
                for (i4 = 0; i4 < 10; i4++) {
                    iArr = gaVar.di;
                    iArr[i4] = iArr[i4] - i6;
                    iArr = gaVar.da;
                    iArr[i4] = iArr[i4] - i7;
                }
                gaVar.bg -= -399324032 * i6;
                gaVar.bh -= 698183808 * i7;
            }
        }
        int i8 = 0;
        i5 = li.cu;
        i4 = 1;
        if (i6 < 0) {
            i8 = 103;
            i5 = -1;
            i4 = -1;
        }
        int i9 = 0;
        int i10 = li.cu;
        int i11 = 1;
        if (i7 < 0) {
            i9 = 103;
            i10 = -1;
            i11 = -1;
        }
        for (int i12 = i8; i12 != i5; i12 += i4) {
            for (int i13 = i9; i10 != i13; i13 += i11) {
                int i14 = i6 + i12;
                int i15 = i7 + i13;
                for (i8 = 0; i8 < 4; i8++) {
                    if (i14 < 0 || i15 < 0 || i14 >= li.cu || i15 >= li.cu) {
                        client.ik[i8][i12][i13] = null;
                    } else {
                        client.ik[i8][i12][i13] = client.ik[i8][i14][i15];
                    }
                }
            }
        }
        gi giVar = (gi) client.ig.as();
        while (giVar != null) {
            giVar.an -= 1781132395 * i6;
            giVar.aa -= 134655125 * i7;
            if (giVar.an * -1294114749 < 0 || giVar.aa * -401817923 < 0 || giVar.an * -1294114749 >= li.cu || -401817923 * giVar.aa >= li.cu) {
                giVar.ki();
            }
            giVar = (gi) client.ig.aj();
        }
        if (client.mj * -502376731 != 0) {
            client.mj -= -751012115 * i6;
            client.mw -= 637696707 * i7;
        }
        client.nd = 0;
        client.nm = false;
        aa.fp -= -443041885 * (i6 << 7);
        mk.fq -= -451992303 * (i7 << 7);
        be.gs -= (i6 << 7) * -1812882225;
        ed.gf -= -6908319 * (i7 << 7);
        client.mv = -1523675123;
        client.ib.af();
        client.ia.af();
        for (i4 = 0; i4 < 4; i4++) {
            client.ea[i4].af(1668580752);
        }
    }
}
