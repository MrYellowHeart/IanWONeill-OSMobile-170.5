package p000;

import java.net.MalformedURLException;
import java.net.URL;

public final class bx {
    static final int ab = 7;
    static final int av = 24;
    public cq aa;
    int ad;
    int af;
    public long ag;
    int an;
    int ay;

    bx() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "bx.<init>(" + ')');
        }
    }

    public static ix af(ix[] ixVarArr, int i, byte b) {
        int i2 = 0;
        while (i2 < ixVarArr.length) {
            try {
                ix ixVar = ixVarArr[i2];
                if (i == ixVar.af(1253367533)) {
                    return ixVar;
                }
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "bx.af(" + ')');
            }
        }
        return null;
    }

    static int ay(int i, byte b) {
        try {
            hl hlVar = (hl) hi.ad.af((long) i);
            if (hlVar == null) {
                return -1;
            }
            if (hi.an.af == hlVar.dx) {
                return -1;
            }
            return ((hl) hlVar.dx).af * 1687932353;
        } catch (Throwable e) {
            throw ba.ad(e, "bx.ay(" + ')');
        }
    }

    static synchronized void an(byte[] bArr, byte b) {
        synchronized (bx.class) {
            byte[][] bArr2;
            int i;
            if (bArr.length != 100 || iu.af * -600689067 >= 1000) {
                try {
                    if (bArr.length == 5000 && iu.ad * 294619543 < 250) {
                        bArr2 = iu.ag;
                        i = iu.ad - 1452571097;
                        iu.ad = i;
                        bArr2[(i * 294619543) - 1] = bArr;
                    } else if (30000 == bArr.length && iu.an * -1060735039 < 50) {
                        bArr2 = iu.ay;
                        i = iu.an + 1858181185;
                        iu.an = i;
                        bArr2[(i * -1060735039) - 1] = bArr;
                    } else if (iu.aj != null) {
                        int i2 = 0;
                        while (i2 < iu.as.length) {
                            if (iu.as[i2] == bArr.length && ij.ar[i2] < iu.aj[i2].length) {
                                byte[][] bArr3 = iu.aj[i2];
                                int[] iArr = ij.ar;
                                int i3 = iArr[i2];
                                iArr[i2] = i3 + 1;
                                bArr3[i3] = bArr;
                                break;
                            }
                            i2++;
                        }
                    }
                } catch (Throwable e) {
                    throw ba.ad(e, "bx.an(" + ')');
                }
            }
            bArr2 = iu.aa;
            i = iu.af + 232855293;
            iu.af = i;
            bArr2[(i * -600689067) - 1] = bArr;
        }
    }

    static boolean an(String str, int i) {
        if (str == null) {
            return false;
        }
        try {
            URL url = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            return false;
        } catch (Throwable e2) {
            throw ba.ad(e2, "bx.an(" + ')');
        }
    }

    static final int bu(int i, int i2, int i3) {
        int i4 = 2;
        int i5 = ((i & 127) * i2) >> 7;
        if (i5 >= 2) {
            i4 = i5 > 126 ? 126 : i5;
        }
        return i4 + (65408 & i);
    }

    static void gl(short s) {
        try {
            if (eq.ps != null) {
                client.pt = -674047909 * client.ak;
                eq.ps.ag(759260481);
                for (int i = 0; i < client.hb.length; i++) {
                    if (client.hb[i] != null) {
                        eq.ps.aa(((516759209 * client.hb[i].bg) >> 7) + (1407993063 * bq.du), ((2328865 * client.hb[i].bh) >> 7) + (1289967967 * gl.dp), (byte) 8);
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bx.gl(" + ')');
        }
    }
}
