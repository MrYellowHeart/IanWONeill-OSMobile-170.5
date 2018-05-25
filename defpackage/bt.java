package p000;

import com.jagex.oldscape.osrenderer.af;
import com.jagex.oldscape.osrenderer.zv;

public class bt {
    static int[] bw = null;
    static int cr = 0;
    static final int mp = 1024;
    int aa;
    int ad;
    long ae;
    int af;
    int ag;
    boolean aj;
    int[] an;
    int ar;
    int as;
    int ay;

    bt() {
        try {
            this.aj = false;
            af(1, 1, (byte) -37);
        } catch (Throwable e) {
            throw ba.ad(e, "bt.<init>(" + ')');
        }
    }

    public final void af(int i, int i2, byte b) {
        try {
            this.af = 1865492087 * i;
            this.ad = -235744305 * i2;
            int i3 = i2 * i;
            if (this.an == null || i3 != this.an.length) {
                this.an = new int[i3];
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bt.af(" + ')');
        }
    }

    public final void ar(int i, int i2) {
        this.af = -214171698 * i;
        this.ad = 1848745019 * i2;
        int i3 = i2 * i;
        if (this.an == null || i3 != this.an.length) {
            this.an = new int[i3];
        }
    }

    void ad(int i, int i2, int i3, int i4, int i5) {
        try {
            this.aa = 1962635607 * i;
            this.ag = -1762711757 * i2;
            this.ay = 127517843 * i3;
            this.as = -2057657915 * i4;
        } catch (Throwable e) {
            throw ba.ad(e, "bt.ad(" + ')');
        }
    }

    void ae(int i, int i2, int i3, int i4) {
        this.aa = 429114613 * i;
        this.ag = -1762711757 * i2;
        this.ay = 127517843 * i3;
        this.as = -2057657915 * i4;
    }

    void aj(int i, int i2, int i3, int i4) {
        this.aa = 1962635607 * i;
        this.ag = -1762711757 * i2;
        this.ay = 127517843 * i3;
        this.as = -2057657915 * i4;
    }

    public int[] an(int i) {
        try {
            return this.an;
        } catch (Throwable e) {
            throw ba.ad(e, "bt.an(" + ')');
        }
    }

    public int[] aq() {
        return this.an;
    }

    final void aa(int i) {
        try {
            if (!this.aj) {
                zv.ft();
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bt.aa(" + ')');
        }
    }

    final void am() {
        if (!this.aj) {
            zv.ft();
        }
    }

    final void at() {
        if (!this.aj) {
            zv.ft();
        }
    }

    final void ab(boolean z) {
        int ay;
        long nanoTime = System.nanoTime();
        boolean se = z & zv.se();
        if (se) {
            zv.cu(this.af * -67595449, this.ad * -418294993);
            zv.cc(this.af * -67595449, this.ad * -418294993);
            zv.ex(2111310439 * this.aa, -598397957 * this.ag, this.ay * 2120350107, this.as * 298333453);
            if (this.aj) {
                zv.fo();
            } else {
                zv.bp();
            }
            zv.vm(this.an);
            af.an(404626467);
        }
        if (!this.aj) {
            zv.gc(se);
        }
        if (se) {
            ay = af.ay((byte) -9);
        } else {
            ay = 0;
        }
        this.ar = ay * -166409427;
        this.aj = false;
        af.af(se, (byte) 0);
        this.ae = (System.nanoTime() - nanoTime) * 5579709646502548599L;
        zv.hb();
    }

    final void ag(boolean z, int i) {
        int i2 = 0;
        try {
            long nanoTime = System.nanoTime();
            boolean se = zv.se() & z;
            if (se) {
                zv.cu(this.af * -67595449, this.ad * -418294993);
                zv.cc(this.af * -67595449, this.ad * -418294993);
                zv.ex(2111310439 * this.aa, -598397957 * this.ag, this.ay * 2120350107, this.as * 298333453);
                if (this.aj) {
                    zv.fo();
                } else {
                    zv.bp();
                }
                zv.vm(this.an);
                af.an(655870594);
            }
            if (!this.aj) {
                zv.gc(se);
            }
            if (se) {
                i2 = af.ay((byte) -100);
            }
            this.ar = i2 * -166409427;
            this.aj = false;
            af.af(se, (byte) 0);
            this.ae = (System.nanoTime() - nanoTime) * 5579709646502548599L;
            zv.hb();
        } catch (Throwable e) {
            throw ba.ad(e, "bt.ag(" + ')');
        }
    }

    final void aw(boolean z) {
        int ay;
        long nanoTime = System.nanoTime();
        boolean se = z & zv.se();
        if (se) {
            zv.cu(this.af * -812746996, -1437415245 * this.ad);
            zv.cc(565409972 * this.af, -2029603006 * this.ad);
            zv.ex(-1429120783 * this.aa, -598397957 * this.ag, this.ay * -2057939597, this.as * 1722878829);
            if (this.aj) {
                zv.fo();
            } else {
                zv.bp();
            }
            zv.vm(this.an);
            af.an(1713938057);
        }
        if (!this.aj) {
            zv.gc(se);
        }
        if (se) {
            ay = af.ay((byte) -75);
        } else {
            ay = 0;
        }
        this.ar = ay * 485849265;
        this.aj = false;
        af.af(se, (byte) 0);
        this.ae = (System.nanoTime() - nanoTime) * 5579709646502548599L;
        zv.hb();
    }

    int ai() {
        return this.ar * 642190764;
    }

    int ay(byte b) {
        try {
            return this.ar * -1418412891;
        } catch (Throwable e) {
            throw ba.ad(e, "bt.ay(" + ')');
        }
    }

    public void ah() {
        this.aj = true;
    }

    public void ak() {
        this.aj = true;
    }

    public void ao() {
        this.aj = true;
    }

    public void as(int i) {
        try {
            this.aj = true;
        } catch (Throwable e) {
            throw ba.ad(e, "bt.as(" + ')');
        }
    }

    public void az() {
        this.aj = true;
    }

    static boolean ay(ia iaVar, int i, int i2) {
        boolean z = false;
        try {
            int kf = iaVar.kf(2, (byte) -52);
            int kf2;
            int i3;
            int i4;
            int i5;
            if (kf == 0) {
                if (iaVar.kf(1, (byte) -124) != 0) {
                    bt.ay(iaVar, i, 600480215);
                }
                kf = iaVar.kf(13, (byte) -36);
                kf2 = iaVar.kf(13, (byte) -3);
                if (iaVar.kf(1, (byte) -26) == 1) {
                    z = true;
                }
                if (z) {
                    int[] iArr = gw.ab;
                    i3 = gw.at + 1377463787;
                    gw.at = i3;
                    iArr[(i3 * 482038467) - 1] = i;
                }
                if (client.hb[i] != null) {
                    throw new RuntimeException();
                }
                ga[] gaVarArr = client.hb;
                ga gaVar = new ga();
                gaVarArr[i] = gaVar;
                gaVar.al = -1174618595 * i;
                if (gw.ag[i] != null) {
                    gaVar.af(gw.ag[i], -1684250263);
                }
                gaVar.dz = 1453001121 * gw.aq[i];
                gaVar.ck = gw.am[i] * 1968525927;
                int i6 = gw.ae[i];
                i4 = i6 >> 28;
                i5 = (i6 >> 14) & 255;
                i6 &= 255;
                gaVar.dr[0] = gw.aa[i];
                gaVar.ac = ((byte) i4) * -1345790225;
                gaVar.at((kf + (i5 << 13)) - (bq.du * 1407993063), ((i6 << 13) + kf2) - (gl.dp * 1289967967), -1711672351);
                gaVar.bb = false;
                return true;
            } else if (kf == 1) {
                r1 = iaVar.kf(2, (byte) -106);
                kf = gw.ae[i];
                gw.ae[i] = (((r1 + (kf >> 28)) & 3) << 28) + (268435455 & kf);
                return false;
            } else if (2 == kf) {
                kf = iaVar.kf(5, (byte) -103);
                kf2 = kf >> 3;
                i3 = kf & 7;
                i4 = gw.ae[i];
                i5 = ((i4 >> 28) + kf2) & 3;
                kf = (i4 >> 14) & 255;
                kf2 = i4 & 255;
                if (i3 == 0) {
                    kf--;
                    kf2--;
                }
                if (i3 == 1) {
                    r1 = kf2 - 1;
                } else {
                    r1 = kf2;
                }
                if (i3 == 2) {
                    kf++;
                    r1--;
                }
                if (i3 == 3) {
                    kf--;
                }
                if (i3 == 4) {
                    kf++;
                }
                if (i3 == 5) {
                    kf--;
                    r1++;
                }
                if (6 == i3) {
                    r1++;
                }
                if (7 == i3) {
                    kf++;
                    r1++;
                }
                gw.ae[i] = r1 + ((kf << 14) + (i5 << 28));
                return false;
            } else {
                r1 = iaVar.kf(18, (byte) -78);
                kf = r1 >> 16;
                kf2 = (r1 >> 8) & 255;
                r1 &= 255;
                i3 = gw.ae[i];
                r1 = (r1 + i3) & 255;
                kf = ((kf + (i3 >> 28)) & 3) << 28;
                gw.ae[i] = r1 + (kf + (((kf2 + (i3 >> 14)) & 255) << 14));
                return false;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bt.ay(" + ')');
        }
    }
}
