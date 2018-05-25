package p000;

import com.jagex.oldscape.osrenderer.af;
import com.jagex.oldscape.osrenderer.zv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class bk extends cn {
    static final int bd = 46;
    protected static ma qm;
    int[] ad;
    int[] af;
    int ag;
    int[] an;
    List ay;

    bk(by byVar) {
        try {
            super(byVar);
            this.af = new int[4700];
            this.ad = new int[4700];
            this.an = new int[4700];
            this.ay = new LinkedList();
        } catch (Throwable e) {
            throw ba.ad(e, "bk.<init>(" + ')');
        }
    }

    final void aa(int i, int i2) {
        try {
            this.ag = 770825789 * i;
            this.ay.size();
            ag(959755325);
        } catch (Throwable e) {
            throw ba.ad(e, "bk.aa(" + ')');
        }
    }

    final void ak(int i) {
        this.ag = 770825789 * i;
        this.ay.size();
        ag(-1438404593);
    }

    final void ao(int i) {
        this.ag = 770825789 * i;
        this.ay.size();
        ag(272180673);
    }

    final void ac() {
        int i = (-1696257771 * this.ag) - 100;
        Iterator it = this.ay.iterator();
        while (it.hasNext()) {
            cl clVar = (cl) it.next();
            if (i >= clVar.bf) {
                ah(clVar, (short) 31182);
                clVar.bf = -1;
                clVar.bh = true;
                it.remove();
            }
        }
    }

    final void ag(int i) {
        try {
            int i2 = (-1696257771 * this.ag) - 100;
            Iterator it = this.ay.iterator();
            while (it.hasNext()) {
                cl clVar = (cl) it.next();
                if (i2 >= clVar.bf) {
                    ah(clVar, (short) 29899);
                    clVar.bf = -1;
                    clVar.bh = true;
                    it.remove();
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bk.ag(" + ')');
        }
    }

    final void au() {
        int i = (-1696257771 * this.ag) - 100;
        Iterator it = this.ay.iterator();
        while (it.hasNext()) {
            cl clVar = (cl) it.next();
            if (i >= clVar.bf) {
                ah(clVar, (short) 15337);
                clVar.bf = -1;
                clVar.bh = true;
                it.remove();
            }
        }
    }

    final void av() {
        int i = (-1696257771 * this.ag) - 100;
        Iterator it = this.ay.iterator();
        while (it.hasNext()) {
            cl clVar = (cl) it.next();
            if (i >= clVar.bf) {
                ah(clVar, (short) 15915);
                clVar.bf = -1;
                clVar.bh = true;
                it.remove();
            }
        }
    }

    final void ax() {
        int i = (-1696257771 * this.ag) - 100;
        Iterator it = this.ay.iterator();
        while (it.hasNext()) {
            cl clVar = (cl) it.next();
            if (i >= clVar.bf) {
                ah(clVar, (short) 12267);
                clVar.bf = -1;
                clVar.bh = true;
                it.remove();
            }
        }
    }

    public final void af(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            this.av[0] = -1;
            if (!(2 == clVar.bp || 1 == clVar.bp)) {
                clVar.as();
            }
            int i9 = -1575402035 * this.bf.bg;
            int i10 = -1508152919 * this.bf.bh;
            int i11 = as[i];
            int i12 = ar[i];
            int i13 = as[i2];
            int i14 = ar[i2];
            int i15 = as[i3];
            int i16 = ar[i3];
            int i17 = as[i4];
            int i18 = ar[i4];
            int i19 = ((i7 * i18) + (i6 * i17)) >> 16;
            for (int i20 = 0; i20 < clVar.ag; i20++) {
                int i21;
                int i22 = clVar.ay[i20];
                int i23 = clVar.as[i20];
                int i24 = clVar.ar[i20];
                if (i3 != 0) {
                    i21 = ((i22 * i16) + (i23 * i15)) >> 16;
                    i23 = ((i23 * i16) - (i22 * i15)) >> 16;
                } else {
                    i21 = i22;
                }
                if (i != 0) {
                    i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                    i23 = ((i23 * i12) - (i24 * i11)) >> 16;
                }
                if (i2 != 0) {
                    i22 = ((i14 * i21) + (i24 * i13)) >> 16;
                    i24 = ((i24 * i14) - (i21 * i13)) >> 16;
                } else {
                    i22 = i21;
                }
                i22 += i5;
                i21 = i23 + i6;
                i24 += i7;
                i23 = ((i21 * i18) - (i17 * i24)) >> 16;
                i24 = ((i24 * i18) + (i21 * i17)) >> 16;
                this.ah[i20] = i24 - i19;
                this.ai[i20] = (((this.bf.bz * 542614623) * i22) / i24) + i9;
                this.az[i20] = (((542614623 * this.bf.bz) * i23) / i24) + i10;
                if (clVar.ax > 0) {
                    this.ak[i20] = i22;
                    this.ao[i20] = i23;
                    this.ax[i20] = i24;
                }
            }
            try {
                aw(clVar, false, false, 0);
            } catch (Exception e) {
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "bk.af(" + ')');
        }
    }

    public final void ar(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.av[0] = -1;
        if (!(2 == clVar.bp || 1 == clVar.bp)) {
            clVar.as();
        }
        int i8 = -1575402035 * this.bf.bg;
        int i9 = 243866889 * this.bf.bh;
        int i10 = as[i];
        int i11 = ar[i];
        int i12 = as[i2];
        int i13 = ar[i2];
        int i14 = as[i3];
        int i15 = ar[i3];
        int i16 = as[i4];
        int i17 = ar[i4];
        int i18 = ((i7 * i17) + (i6 * i16)) >> 16;
        for (int i19 = 0; i19 < clVar.ag; i19++) {
            int i20;
            int i21 = clVar.ay[i19];
            int i22 = clVar.as[i19];
            int i23 = clVar.ar[i19];
            if (i3 != 0) {
                i20 = ((i21 * i15) + (i22 * i14)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i22 * i11) - (i23 * i10)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i13 * i20) + (i23 * i12)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i20 * i17) - (i16 * i23)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ah[i19] = i23 - i18;
            this.ai[i19] = (((this.bf.bz * -2095206125) * i21) / i23) + i8;
            this.az[i19] = (((1388640444 * this.bf.bz) * i22) / i23) + i9;
            if (clVar.ax > 0) {
                this.ak[i19] = i21;
                this.ao[i19] = i22;
                this.ax[i19] = i23;
            }
        }
        try {
            aw(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void as(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.av[0] = -1;
        if (!(2 == clVar.bp || 1 == clVar.bp)) {
            clVar.as();
        }
        int i8 = -1575402035 * this.bf.bg;
        int i9 = -1508152919 * this.bf.bh;
        int i10 = as[i];
        int i11 = ar[i];
        int i12 = as[i2];
        int i13 = ar[i2];
        int i14 = as[i3];
        int i15 = ar[i3];
        int i16 = as[i4];
        int i17 = ar[i4];
        int i18 = ((i7 * i17) + (i6 * i16)) >> 16;
        for (int i19 = 0; i19 < clVar.ag; i19++) {
            int i20;
            int i21 = clVar.ay[i19];
            int i22 = clVar.as[i19];
            int i23 = clVar.ar[i19];
            if (i3 != 0) {
                i20 = ((i21 * i15) + (i22 * i14)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i22 * i11) - (i23 * i10)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i13 * i20) + (i23 * i12)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i20 * i17) - (i16 * i23)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ah[i19] = i23 - i18;
            this.ai[i19] = (((this.bf.bz * 542614623) * i21) / i23) + i8;
            this.az[i19] = (((542614623 * this.bf.bz) * i22) / i23) + i9;
            if (clVar.ax > 0) {
                this.ak[i19] = i21;
                this.ao[i19] = i22;
                this.ax[i19] = i23;
            }
        }
        try {
            aw(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    static void ad(fx fxVar, int i, int i2, int i3, int i4) {
        try {
            dh.aj.ag(fxVar, lf.af(i, i2, i3, (byte) -12), fxVar.af.length * 4);
        } catch (Throwable e) {
            throw ba.ad(e, "bk.ad(" + ')');
        }
    }

    public final void ad(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            this.av[0] = -1;
            if (!(2 == clVar.bp || 1 == clVar.bp)) {
                clVar.as();
            }
            int i10 = -1575402035 * this.bf.bg;
            int i11 = -1508152919 * this.bf.bh;
            int i12 = as[i];
            int i13 = ar[i];
            int i14 = as[i2];
            int i15 = ar[i2];
            int i16 = as[i3];
            int i17 = ar[i3];
            int i18 = as[i4];
            int i19 = ar[i4];
            int i20 = ((i6 * i18) + (i7 * i19)) >> 16;
            for (int i21 = 0; i21 < clVar.ag; i21++) {
                int i22;
                int i23 = clVar.ay[i21];
                int i24 = clVar.as[i21];
                int i25 = clVar.ar[i21];
                if (i3 != 0) {
                    i22 = ((i23 * i17) + (i24 * i16)) >> 16;
                    i24 = ((i24 * i17) - (i23 * i16)) >> 16;
                } else {
                    i22 = i23;
                }
                if (i != 0) {
                    i25 = ((i25 * i13) + (i24 * i12)) >> 16;
                    i24 = ((i13 * i24) - (i12 * i25)) >> 16;
                }
                if (i2 != 0) {
                    i23 = ((i15 * i22) + (i14 * i25)) >> 16;
                    i25 = ((i25 * i15) - (i22 * i14)) >> 16;
                } else {
                    i23 = i22;
                }
                i23 += i5;
                i22 = i24 + i6;
                i25 += i7;
                i24 = ((i22 * i19) - (i25 * i18)) >> 16;
                i25 = ((i25 * i19) + (i22 * i18)) >> 16;
                this.ah[i21] = i25 - i20;
                this.ai[i21] = (((542614623 * this.bf.bz) * i23) / i8) + i10;
                this.az[i21] = (((this.bf.bz * 542614623) * i24) / i8) + i11;
                if (clVar.ax > 0) {
                    this.ak[i21] = i23;
                    this.ao[i21] = i24;
                    this.ax[i21] = i25;
                }
            }
            try {
                aw(clVar, false, false, 0);
            } catch (Exception e) {
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "bk.ad(" + ')');
        }
    }

    public final void ae(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.av[0] = -1;
        if (!(2 == clVar.bp || 1 == clVar.bp)) {
            clVar.as();
        }
        int i9 = -1575402035 * this.bf.bg;
        int i10 = 392420937 * this.bf.bh;
        int i11 = as[i];
        int i12 = ar[i];
        int i13 = as[i2];
        int i14 = ar[i2];
        int i15 = as[i3];
        int i16 = ar[i3];
        int i17 = as[i4];
        int i18 = ar[i4];
        int i19 = ((i6 * i17) + (i7 * i18)) >> 16;
        for (int i20 = 0; i20 < clVar.ag; i20++) {
            int i21;
            int i22 = clVar.ay[i20];
            int i23 = clVar.as[i20];
            int i24 = clVar.ar[i20];
            if (i3 != 0) {
                i21 = ((i22 * i16) + (i23 * i15)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i12 * i23) - (i11 * i24)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i14 * i21) + (i13 * i24)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i21 * i18) - (i24 * i17)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ah[i20] = i24 - i19;
            this.ai[i20] = (((542614623 * this.bf.bz) * i22) / i8) + i9;
            this.az[i20] = (((this.bf.bz * -279256043) * i23) / i8) + i10;
            if (clVar.ax > 0) {
                this.ak[i20] = i22;
                this.ao[i20] = i23;
                this.ax[i20] = i24;
            }
        }
        try {
            aw(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void aj(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.av[0] = -1;
        if (!(2 == clVar.bp || 1 == clVar.bp)) {
            clVar.as();
        }
        int i9 = -320210751 * this.bf.bg;
        int i10 = -1508152919 * this.bf.bh;
        int i11 = as[i];
        int i12 = ar[i];
        int i13 = as[i2];
        int i14 = ar[i2];
        int i15 = as[i3];
        int i16 = ar[i3];
        int i17 = as[i4];
        int i18 = ar[i4];
        int i19 = ((i6 * i17) + (i7 * i18)) >> 16;
        for (int i20 = 0; i20 < clVar.ag; i20++) {
            int i21;
            int i22 = clVar.ay[i20];
            int i23 = clVar.as[i20];
            int i24 = clVar.ar[i20];
            if (i3 != 0) {
                i21 = ((i22 * i16) + (i23 * i15)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i12 * i23) - (i11 * i24)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i14 * i21) + (i13 * i24)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i21 * i18) - (i24 * i17)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ah[i20] = i24 - i19;
            this.ai[i20] = (((1757801372 * this.bf.bz) * i22) / i8) + i9;
            this.az[i20] = (((this.bf.bz * 542614623) * i23) / i8) + i10;
            if (clVar.ax > 0) {
                this.ak[i20] = i22;
                this.ao[i20] = i23;
                this.ax[i20] = i24;
            }
        }
        try {
            aw(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    public final void aq(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.av[0] = -1;
        if (!(2 == clVar.bp || 1 == clVar.bp)) {
            clVar.as();
        }
        int i9 = -1575402035 * this.bf.bg;
        int i10 = -399986391 * this.bf.bh;
        int i11 = as[i];
        int i12 = ar[i];
        int i13 = as[i2];
        int i14 = ar[i2];
        int i15 = as[i3];
        int i16 = ar[i3];
        int i17 = as[i4];
        int i18 = ar[i4];
        int i19 = ((i6 * i17) + (i7 * i18)) >> 16;
        for (int i20 = 0; i20 < clVar.ag; i20++) {
            int i21;
            int i22 = clVar.ay[i20];
            int i23 = clVar.as[i20];
            int i24 = clVar.ar[i20];
            if (i3 != 0) {
                i21 = ((i22 * i16) + (i23 * i15)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i12 * i23) - (i11 * i24)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i14 * i21) + (i13 * i24)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i21 * i18) - (i24 * i17)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ah[i20] = i24 - i19;
            this.ai[i20] = (((-1824531381 * this.bf.bz) * i22) / i8) + i9;
            this.az[i20] = (((this.bf.bz * 542614623) * i23) / i8) + i10;
            if (clVar.ax > 0) {
                this.ak[i20] = i22;
                this.ao[i20] = i23;
                this.ax[i20] = i24;
            }
        }
        try {
            aw(clVar, false, false, 0);
        } catch (Exception e) {
        }
    }

    public void ab(cq cqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        if (bv) {
            System.nanoTime();
            cl ac = cqVar.ac();
            if (ac != null) {
                if (1 != ac.bp) {
                    ac.ay();
                }
                ac.ag(i);
                int i9 = (ac.bt * i3) >> 16;
                int i10 = (ac.bt * i2) >> 16;
                int i11 = ((i8 * i5) - (i4 * i6)) >> 16;
                int i12 = ((i11 * i3) + (i7 * i2)) >> 16;
                int i13 = i12 + i9;
                if (i13 > 50 && i12 < 3500) {
                    int i14 = ((i5 * i6) + (i8 * i4)) >> 16;
                    int i15 = (i14 - ac.bt) * (this.bf.bz * 542614623);
                    if (i15 / i13 < this.bf.bx * -1292978563) {
                        int i16 = (ac.bt + i14) * (this.bf.bz * 542614623);
                        if (i16 / i13 > this.bf.bp * 1292965175) {
                            int i17 = ((i7 * i3) - (i11 * i2)) >> 16;
                            int i18 = (this.bf.bz * 542614623) * (i17 + i10);
                            if (i18 / i13 > -1542934767 * this.bf.bt) {
                                int i19 = (i17 - (i10 + (((1500767459 * ac.bo) * i3) >> 16))) * (this.bf.bz * 542614623);
                                if (i19 / i13 < -939286465 * this.bf.bu) {
                                    int i20 = cs.aa * -429386291;
                                    int ae = ht.ae(-414970391);
                                    boolean z = cs.an;
                                    if (ev.af(j) && z) {
                                        boolean am;
                                        if (cs.af) {
                                            am = js.am(ac, i6, i7, i8, this, -1392962020);
                                        } else {
                                            int i21;
                                            i9 = i12 - i9;
                                            if (i9 <= 50) {
                                                i21 = 50;
                                            } else {
                                                i21 = i9;
                                            }
                                            if (i14 > 0) {
                                                i14 = i16 / i21;
                                                i15 /= i13;
                                            } else {
                                                i14 = i16 / i13;
                                                i15 /= i21;
                                            }
                                            if (i17 > 0) {
                                                i9 = i19 / i13;
                                                i10 = i18 / i21;
                                            } else {
                                                i10 = i18 / i13;
                                                i9 = i19 / i21;
                                            }
                                            i21 = i20 - (-1575402035 * this.bf.bg);
                                            i13 = ae - (-1508152919 * this.bf.bh);
                                            if (i21 <= i15 || i21 >= r6 || i13 <= r3 || i13 >= r4) {
                                                am = false;
                                            } else {
                                                am = true;
                                            }
                                        }
                                        if (am && (ac.bc || ay(ac, i, i2, i3, i4, i5, i6, i7, i8, 294704482))) {
                                            long[] jArr = cs.az;
                                            i10 = cs.ai + 313171601;
                                            cs.ai = i10;
                                            jArr[(i10 * 963961457) - 1] = j;
                                        }
                                    }
                                    i18 = as[i];
                                    i19 = ar[i];
                                    if (ac.bu < 1600) {
                                        if (ac.bh) {
                                            az(ac, 1886619373);
                                        }
                                        af.aq(ac.bg, j, ac.bu, ac.be, i2, i3, i4, i5, i18, i19, i6, i7, i8, i12, false, (byte) -116);
                                        if (!ac.bv) {
                                            if (-1 == ac.bf) {
                                                this.ay.add(ac);
                                            }
                                            ac.bf = this.ag * -1696257771;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void am(cq cqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        if (bv) {
            System.nanoTime();
            cl ac = cqVar.ac();
            if (ac != null) {
                if (1 != ac.bp) {
                    ac.ay();
                }
                ac.ag(i);
                int i9 = (ac.bt * i3) >> 16;
                int i10 = (ac.bt * i2) >> 16;
                int i11 = ((i8 * i5) - (i4 * i6)) >> 16;
                int i12 = ((i11 * i3) + (i7 * i2)) >> 16;
                int i13 = i12 + i9;
                if (i13 > 50 && i12 < 3500) {
                    int i14 = ((i5 * i6) + (i8 * i4)) >> 16;
                    int i15 = (i14 - ac.bt) * (this.bf.bz * -625912550);
                    if (i15 / i13 < this.bf.bx * 2029135028) {
                        int i16 = (ac.bt + i14) * (this.bf.bz * 542614623);
                        if (i16 / i13 > this.bf.bp * -223928401) {
                            int i17 = ((i7 * i3) - (i11 * i2)) >> 16;
                            int i18 = (this.bf.bz * -1983030884) * (i17 + i10);
                            if (i18 / i13 > -1542934767 * this.bf.bt) {
                                int i19 = (i17 - (i10 + (((1500767459 * ac.bo) * i3) >> 16))) * (this.bf.bz * 542614623);
                                if (i19 / i13 < -939286465 * this.bf.bu) {
                                    int i20 = cs.aa * -887057556;
                                    int ae = ht.ae(-414970391);
                                    boolean z = cs.an;
                                    if (ev.af(j) && z) {
                                        boolean am;
                                        if (cs.af) {
                                            am = js.am(ac, i6, i7, i8, this, -1483934575);
                                        } else {
                                            int i21;
                                            i9 = i12 - i9;
                                            if (i9 <= 50) {
                                                i21 = -1122062411;
                                            } else {
                                                i21 = i9;
                                            }
                                            if (i14 > 0) {
                                                i14 = i16 / i21;
                                                i15 /= i13;
                                            } else {
                                                i14 = i16 / i13;
                                                i15 /= i21;
                                            }
                                            if (i17 > 0) {
                                                i9 = i19 / i13;
                                                i10 = i18 / i21;
                                            } else {
                                                i10 = i18 / i13;
                                                i9 = i19 / i21;
                                            }
                                            i21 = i20 - (-1575402035 * this.bf.bg);
                                            i13 = ae - (-150026339 * this.bf.bh);
                                            if (i21 <= i15 || i21 >= r6 || i13 <= r3 || i13 >= r4) {
                                                am = false;
                                            } else {
                                                am = true;
                                            }
                                        }
                                        if (am && (ac.bc || ay(ac, i, i2, i3, i4, i5, i6, i7, i8, -586407183))) {
                                            long[] jArr = cs.az;
                                            i10 = cs.ai + 313171601;
                                            cs.ai = i10;
                                            jArr[(i10 * 963961457) - 1] = j;
                                        }
                                    }
                                    i18 = as[i];
                                    i19 = ar[i];
                                    if (ac.bu < -69533560) {
                                        if (ac.bh) {
                                            az(ac, 2130086366);
                                        }
                                        af.aq(ac.bg, j, ac.bu, ac.be, i2, i3, i4, i5, i18, i19, i6, i7, i8, i12, false, (byte) 46);
                                        if (!ac.bv) {
                                            if (-1 == ac.bf) {
                                                this.ay.add(ac);
                                            }
                                            ac.bf = this.ag * -1696257771;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void an(cq cqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        try {
            if (bv) {
                System.nanoTime();
                cl ac = cqVar.ac();
                if (ac != null) {
                    if (1 != ac.bp) {
                        ac.ay();
                    }
                    ac.ag(i);
                    int i9 = (ac.bt * i3) >> 16;
                    int i10 = (ac.bt * i2) >> 16;
                    int i11 = ((i8 * i5) - (i4 * i6)) >> 16;
                    int i12 = ((i11 * i3) + (i7 * i2)) >> 16;
                    int i13 = i12 + i9;
                    if (i13 > 50 && i12 < 3500) {
                        int i14 = ((i5 * i6) + (i8 * i4)) >> 16;
                        int i15 = (i14 - ac.bt) * (this.bf.bz * 542614623);
                        if (i15 / i13 < this.bf.bx * -1292978563) {
                            int i16 = (ac.bt + i14) * (this.bf.bz * 542614623);
                            if (i16 / i13 > this.bf.bp * 1292965175) {
                                int i17 = ((i7 * i3) - (i11 * i2)) >> 16;
                                int i18 = (this.bf.bz * 542614623) * (i17 + i10);
                                if (i18 / i13 > -1542934767 * this.bf.bt) {
                                    int i19 = (i17 - (i10 + (((1500767459 * ac.bo) * i3) >> 16))) * (this.bf.bz * 542614623);
                                    if (i19 / i13 < -939286465 * this.bf.bu) {
                                        int i20 = cs.aa * -429386291;
                                        int ae = ht.ae(-414970391);
                                        boolean z = cs.an;
                                        if (ev.af(j) && z) {
                                            z = false;
                                            if (cs.af) {
                                                z = js.am(ac, i6, i7, i8, this, -1810244839);
                                            } else {
                                                int i21;
                                                i9 = i12 - i9;
                                                if (i9 <= 50) {
                                                    i21 = 50;
                                                } else {
                                                    i21 = i9;
                                                }
                                                if (i14 > 0) {
                                                    i14 = i16 / i21;
                                                    i15 /= i13;
                                                } else {
                                                    i14 = i16 / i13;
                                                    i15 /= i21;
                                                }
                                                if (i17 > 0) {
                                                    i9 = i19 / i13;
                                                    i11 = i18 / i21;
                                                } else {
                                                    i11 = i18 / i13;
                                                    i9 = i19 / i21;
                                                }
                                                i21 = i20 - (-1575402035 * this.bf.bg);
                                                i13 = ae - (-1508152919 * this.bf.bh);
                                                if (i21 > i15 && i21 < r6 && i13 > r4 && i13 < r5) {
                                                    z = true;
                                                }
                                            }
                                            if (z && (ac.bc || ay(ac, i, i2, i3, i4, i5, i6, i7, i8, 1340430574))) {
                                                long[] jArr = cs.az;
                                                i9 = cs.ai + 313171601;
                                                cs.ai = i9;
                                                jArr[(i9 * 963961457) - 1] = j;
                                            }
                                        }
                                        i18 = as[i];
                                        i19 = ar[i];
                                        if (ac.bu < 1600) {
                                            if (ac.bh) {
                                                az(ac, 1875624330);
                                            }
                                            af.aq(ac.bg, j, ac.bu, ac.be, i2, i3, i4, i5, i18, i19, i6, i7, i8, i12, false, (byte) -95);
                                            if (!ac.bv) {
                                                if (-1 == ac.bf) {
                                                    this.ay.add(ac);
                                                }
                                                ac.bf = this.ag * -1696257771;
                                            }
                                            System.nanoTime();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bk.an(" + ')');
        }
    }

    public void at(cq cqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        if (bv) {
            System.nanoTime();
            cl ac = cqVar.ac();
            if (ac != null) {
                if (1 != ac.bp) {
                    ac.ay();
                }
                ac.ag(i);
                int i9 = (ac.bt * i3) >> 16;
                int i10 = (ac.bt * i2) >> 16;
                int i11 = ((i8 * i5) - (i4 * i6)) >> 16;
                int i12 = ((i11 * i3) + (i7 * i2)) >> 16;
                int i13 = i12 + i9;
                if (i13 > 50 && i12 < 3500) {
                    int i14 = ((i5 * i6) + (i8 * i4)) >> 16;
                    int i15 = (i14 - ac.bt) * (this.bf.bz * 542614623);
                    if (i15 / i13 < this.bf.bx * -1292978563) {
                        int i16 = (ac.bt + i14) * (this.bf.bz * 542614623);
                        if (i16 / i13 > this.bf.bp * 1292965175) {
                            int i17 = ((i7 * i3) - (i11 * i2)) >> 16;
                            int i18 = (this.bf.bz * 542614623) * (i17 + i10);
                            if (i18 / i13 > -1542934767 * this.bf.bt) {
                                int i19 = (i17 - (i10 + (((1500767459 * ac.bo) * i3) >> 16))) * (this.bf.bz * 542614623);
                                if (i19 / i13 < -939286465 * this.bf.bu) {
                                    int i20 = cs.aa * -429386291;
                                    int ae = ht.ae(-414970391);
                                    boolean z = cs.an;
                                    if (ev.af(j) && z) {
                                        boolean am;
                                        if (cs.af) {
                                            am = js.am(ac, i6, i7, i8, this, -533617042);
                                        } else {
                                            int i21;
                                            i9 = i12 - i9;
                                            if (i9 <= 50) {
                                                i21 = 50;
                                            } else {
                                                i21 = i9;
                                            }
                                            if (i14 > 0) {
                                                i14 = i16 / i21;
                                                i15 /= i13;
                                            } else {
                                                i14 = i16 / i13;
                                                i15 /= i21;
                                            }
                                            if (i17 > 0) {
                                                i9 = i19 / i13;
                                                i10 = i18 / i21;
                                            } else {
                                                i10 = i18 / i13;
                                                i9 = i19 / i21;
                                            }
                                            i21 = i20 - (-1575402035 * this.bf.bg);
                                            i13 = ae - (-1508152919 * this.bf.bh);
                                            if (i21 <= i15 || i21 >= r6 || i13 <= r3 || i13 >= r4) {
                                                am = false;
                                            } else {
                                                am = true;
                                            }
                                        }
                                        if (am && (ac.bc || ay(ac, i, i2, i3, i4, i5, i6, i7, i8, 1536158915))) {
                                            long[] jArr = cs.az;
                                            i10 = cs.ai + 313171601;
                                            cs.ai = i10;
                                            jArr[(i10 * 963961457) - 1] = j;
                                        }
                                    }
                                    i18 = as[i];
                                    i19 = ar[i];
                                    if (ac.bu < 1600) {
                                        if (ac.bh) {
                                            az(ac, 2102441003);
                                        }
                                        af.aq(ac.bg, j, ac.bu, ac.be, i2, i3, i4, i5, i18, i19, i6, i7, i8, i12, false, (byte) -87);
                                        if (!ac.bv) {
                                            if (-1 == ac.bf) {
                                                this.ay.add(ac);
                                            }
                                            ac.bf = this.ag * -1696257771;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final boolean al(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (clVar.bu >= 1600) {
            return false;
        }
        int i9;
        int i10;
        int i11 = -1575402035 * this.bf.bg;
        int i12 = this.bf.bh * -1508152919;
        int i13 = as[i];
        int i14 = ar[i];
        for (i9 = 0; i9 < clVar.ag; i9++) {
            int i15 = clVar.ay[i9];
            int i16 = clVar.as[i9];
            int i17 = clVar.ar[i9];
            if (i != 0) {
                i10 = ((i15 * i14) + (i17 * i13)) >> 16;
                i17 = ((i17 * i14) - (i15 * i13)) >> 16;
            } else {
                i10 = i15;
            }
            i10 += i6;
            i15 = i16 + i7;
            i17 += i8;
            i16 = ((i10 * i5) + (i17 * i4)) >> 16;
            i17 = ((i17 * i5) - (i10 * i4)) >> 16;
            i10 = ((i3 * i15) - (i17 * i2)) >> 16;
            i17 = ((i17 * i3) + (i15 * i2)) >> 16;
            if (i17 >= 50) {
                this.ai[i9] = ((i16 * (542614623 * this.bf.bz)) / i17) + i11;
                this.az[i9] = ((i10 * (this.bf.bz * 542614623)) / i17) + i12;
            } else {
                int[] iArr = this.ai;
                this.az[i9] = -1;
                iArr[i9] = -1;
            }
        }
        for (i16 = 0; i16 < clVar.aj; i16++) {
            if (clVar.aw[i16] != -2) {
                i9 = clVar.ae[i16];
                i17 = clVar.aq[i16];
                i10 = clVar.am[i16];
                i15 = this.ai[i9];
                i11 = this.ai[i17];
                i12 = this.ai[i10];
                if (!(-1 == i15 || i11 == -1 || -1 == i12 || !ea.at(this.az[i9], this.az[i17], this.az[i10], i15, i11, i12, 5, 388188633))) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean ap(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (clVar.bu >= 1600) {
            return false;
        }
        int i9;
        int i10 = -1575402035 * this.bf.bg;
        int i11 = this.bf.bh * -1508152919;
        int i12 = as[i];
        int i13 = ar[i];
        for (i9 = 0; i9 < clVar.ag; i9++) {
            int i14;
            int i15 = clVar.ay[i9];
            int i16 = clVar.as[i9];
            int i17 = clVar.ar[i9];
            if (i != 0) {
                i14 = ((i15 * i13) + (i17 * i12)) >> 16;
                i17 = ((i17 * i13) - (i15 * i12)) >> 16;
            } else {
                i14 = i15;
            }
            i14 += i6;
            i15 = i16 + i7;
            i17 += i8;
            i16 = ((i14 * i5) + (i17 * i4)) >> 16;
            i17 = ((i17 * i5) - (i14 * i4)) >> 16;
            i14 = ((i3 * i15) - (i17 * i2)) >> 16;
            i17 = ((i17 * i3) + (i15 * i2)) >> 16;
            if (i17 >= 50) {
                this.ai[i9] = ((i16 * (542614623 * this.bf.bz)) / i17) + i10;
                this.az[i9] = ((i14 * (this.bf.bz * 542614623)) / i17) + i11;
            } else {
                int[] iArr = this.ai;
                this.az[i9] = -1;
                iArr[i9] = -1;
            }
        }
        for (i16 = 0; i16 < clVar.aj; i16++) {
            if (clVar.aw[i16] != -2) {
                i9 = clVar.ae[i16];
                i17 = clVar.aq[i16];
                i14 = clVar.am[i16];
                i15 = this.ai[i9];
                i10 = this.ai[i17];
                i11 = this.ai[i14];
                if (!(-1 == i15 || i10 == -1 || -1 == i11 || !ea.at(this.az[i9], this.az[i17], this.az[i14], i15, i10, i11, 5, -1069459940))) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean ay(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            if (clVar.bu >= 1600) {
                return false;
            }
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = -1575402035 * this.bf.bg;
            int i16 = this.bf.bh * -1508152919;
            int i17 = as[i];
            int i18 = ar[i];
            for (i10 = 0; i10 < clVar.ag; i10++) {
                i11 = clVar.ay[i10];
                i12 = clVar.as[i10];
                i13 = clVar.ar[i10];
                if (i != 0) {
                    i14 = ((i11 * i18) + (i13 * i17)) >> 16;
                    i13 = ((i13 * i18) - (i11 * i17)) >> 16;
                } else {
                    i14 = i11;
                }
                i14 += i6;
                i11 = i12 + i7;
                i13 += i8;
                i12 = ((i14 * i5) + (i13 * i4)) >> 16;
                i13 = ((i13 * i5) - (i14 * i4)) >> 16;
                i14 = ((i3 * i11) - (i13 * i2)) >> 16;
                i13 = ((i13 * i3) + (i11 * i2)) >> 16;
                if (i13 >= 50) {
                    this.ai[i10] = ((i12 * (542614623 * this.bf.bz)) / i13) + i15;
                    this.az[i10] = ((i14 * (this.bf.bz * 542614623)) / i13) + i16;
                } else {
                    int[] iArr = this.ai;
                    this.az[i10] = -1;
                    iArr[i10] = -1;
                }
            }
            for (i12 = 0; i12 < clVar.aj; i12++) {
                if (clVar.aw[i12] != -2) {
                    i13 = clVar.ae[i12];
                    i14 = clVar.aq[i12];
                    i11 = clVar.am[i12];
                    i10 = this.ai[i13];
                    i15 = this.ai[i14];
                    i16 = this.ai[i11];
                    if (!(-1 == i10 || i15 == -1 || -1 == i16 || !ea.at(this.az[i13], this.az[i14], this.az[i11], i10, i15, i16, 5, -664981710))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "bk.ay(" + ')');
        }
    }

    final boolean bw(cl clVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (clVar.bu >= 1600) {
            return false;
        }
        int i9;
        int i10 = -1575402035 * this.bf.bg;
        int i11 = this.bf.bh * -1508152919;
        int i12 = as[i];
        int i13 = ar[i];
        for (i9 = 0; i9 < clVar.ag; i9++) {
            int i14;
            int i15 = clVar.ay[i9];
            int i16 = clVar.as[i9];
            int i17 = clVar.ar[i9];
            if (i != 0) {
                i14 = ((i15 * i13) + (i17 * i12)) >> 16;
                i17 = ((i17 * i13) - (i15 * i12)) >> 16;
            } else {
                i14 = i15;
            }
            i14 += i6;
            i15 = i16 + i7;
            i17 += i8;
            i16 = ((i14 * i5) + (i17 * i4)) >> 16;
            i17 = ((i17 * i5) - (i14 * i4)) >> 16;
            i14 = ((i3 * i15) - (i17 * i2)) >> 16;
            i17 = ((i17 * i3) + (i15 * i2)) >> 16;
            if (i17 >= 1867330936) {
                this.ai[i9] = ((i16 * (542614623 * this.bf.bz)) / i17) + i10;
                this.az[i9] = ((i14 * (this.bf.bz * 542614623)) / i17) + i11;
            } else {
                int[] iArr = this.ai;
                this.az[i9] = -1;
                iArr[i9] = -1;
            }
        }
        for (i16 = 0; i16 < clVar.aj; i16++) {
            if (clVar.aw[i16] != -2) {
                i9 = clVar.ae[i16];
                i17 = clVar.aq[i16];
                i14 = clVar.am[i16];
                i15 = this.ai[i9];
                i10 = this.ai[i17];
                i11 = this.ai[i14];
                if (!(-1 == i15 || i10 == -1 || -1 == i11 || !ea.at(this.az[i9], this.az[i17], this.az[i14], i15, i10, i11, 5, 1236857497))) {
                    return true;
                }
            }
        }
        return false;
    }

    final void aw(cl clVar, boolean z, boolean z2, long j) {
        try {
            if (clVar.bu < 1600) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                for (i = 0; i < clVar.bu; i++) {
                    this.av[i] = 0;
                }
                int i10 = 0;
                boolean z3 = z2;
                while (i10 < clVar.aj) {
                    boolean z4;
                    if (-2 == clVar.aw[i10]) {
                        z4 = z3;
                    } else {
                        i2 = clVar.ae[i10];
                        int i11 = clVar.aq[i10];
                        int i12 = clVar.am[i10];
                        i3 = this.ai[i2];
                        i4 = this.ai[i11];
                        i5 = this.ai[i12];
                        if (z && (i3 == -5000 || i4 == -5000 || i5 == -5000)) {
                            i = this.ak[i2];
                            i6 = this.ak[i11];
                            i7 = this.ak[i12];
                            i3 = this.ao[i2];
                            i4 = this.ao[i11];
                            i5 = this.ao[i12];
                            i8 = this.ax[i2];
                            i9 = this.ax[i11];
                            i -= i6;
                            i7 -= i6;
                            i3 -= i4;
                            i5 -= i4;
                            i8 -= i9;
                            int i13 = this.ax[i12] - i9;
                            if ((((i * i5) - (i7 * i3)) * i9) + ((i6 * ((i3 * i13) - (i8 * i5))) + (i4 * ((i8 * i7) - (i13 * i)))) > 0) {
                                this.aw[i10] = true;
                                i = clVar.be + ((this.ah[i12] + (this.ah[i11] + this.ah[i2])) / 3);
                                iArr = this.ac[i];
                                iArr2 = this.av;
                                i3 = iArr2[i];
                                iArr2[i] = i3 + 1;
                                iArr[i3] = i10;
                            }
                            z4 = z3;
                        } else {
                            if (z3 && ea.at(this.az[i2], this.az[i11], this.az[i12], i3, i4, i5, 0, -33325925)) {
                                long[] jArr = cs.az;
                                i6 = cs.ai + 313171601;
                                cs.ai = i6;
                                jArr[(i6 * 963961457) - 1] = j;
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (((this.az[i12] - this.az[i11]) * (i3 - i4)) - ((i5 - i4) * (this.az[i2] - this.az[i11])) > 0) {
                                this.aw[i10] = false;
                                if (i3 < 0 || i4 < 0 || i5 < 0 || i3 > this.bf.bf * 784773023 || i4 > 784773023 * this.bf.bf || i5 > this.bf.bf * 784773023) {
                                    this.ab[i10] = true;
                                } else {
                                    this.ab[i10] = false;
                                }
                                i6 = (((this.ah[i11] + this.ah[i2]) + this.ah[i12]) / 3) + clVar.be;
                                iArr2 = this.ac[i6];
                                iArr3 = this.av;
                                i4 = iArr3[i6];
                                iArr3[i6] = i4 + 1;
                                iArr2[i4] = i10;
                            }
                        }
                    }
                    i10++;
                    z3 = z4;
                }
                if (clVar.ai == null) {
                    for (i6 = clVar.bu - 1; i6 >= 0; i6--) {
                        i7 = this.av[i6];
                        if (i7 > 0) {
                            iArr3 = this.ac[i6];
                            for (i = 0; i < i7; i++) {
                                ai(clVar, iArr3[i], (byte) -93);
                            }
                        }
                    }
                    return;
                }
                int[] iArr4;
                for (i = 0; i < 12; i++) {
                    this.al[i] = 0;
                    this.bc[i] = 0;
                }
                for (i6 = clVar.bu - 1; i6 >= 0; i6--) {
                    i7 = this.av[i6];
                    if (i7 > 0) {
                        iArr3 = this.ac[i6];
                        for (i = 0; i < i7; i++) {
                            i4 = iArr3[i];
                            byte b = clVar.ai[i4];
                            int[] iArr5 = this.al;
                            i9 = iArr5[b];
                            iArr5[b] = i9 + 1;
                            this.ap[b][i9] = i4;
                            if (b < (byte) 10) {
                                iArr4 = this.bc;
                                iArr4[b] = iArr4[b] + i6;
                            } else if ((byte) 10 == b) {
                                this.bw[i9] = i6;
                            } else {
                                this.bb[i9] = i6;
                            }
                        }
                    }
                }
                if (this.al[1] > 0 || this.al[2] > 0) {
                    i10 = (this.bc[1] + this.bc[2]) / (this.al[1] + this.al[2]);
                } else {
                    i10 = 0;
                }
                i = 0;
                if (this.al[3] > 0 || this.al[4] > 0) {
                    i = (this.bc[3] + this.bc[4]) / (this.al[4] + this.al[3]);
                }
                i6 = 0;
                if (this.al[6] > 0 || this.al[8] > 0) {
                    i6 = (this.bc[6] + this.bc[8]) / (this.al[8] + this.al[6]);
                }
                i9 = 0;
                i8 = this.al[10];
                int[] iArr6 = this.ap[10];
                iArr4 = this.bw;
                if (i8 == 0) {
                    i9 = 0;
                    i8 = this.al[11];
                    iArr6 = this.ap[11];
                    iArr4 = this.bb;
                }
                if (i8 > 0) {
                    i7 = iArr4[i9];
                } else {
                    i7 = -1000;
                }
                int i14 = 0;
                iArr3 = iArr6;
                i5 = i9;
                int i15 = i8;
                i8 = i7;
                iArr2 = iArr4;
                i4 = i15;
                while (i14 < 10) {
                    while (i14 == 0 && r8 > r11) {
                        i8 = i5 + 1;
                        ai(clVar, iArr3[i5], (byte) -107);
                        if (i8 != i4 || iArr3 == this.ap[11]) {
                            i5 = i8;
                        } else {
                            i5 = 0;
                            i4 = this.al[11];
                            iArr3 = this.ap[11];
                            iArr2 = this.bb;
                        }
                        if (i5 < i4) {
                            i8 = iArr2[i5];
                        } else {
                            i8 = -1000;
                        }
                    }
                    while (3 == i14 && i8 > r2) {
                        i8 = i5 + 1;
                        ai(clVar, iArr3[i5], (byte) -97);
                        if (i8 != i4 || this.ap[11] == iArr3) {
                            i5 = i8;
                        } else {
                            i5 = 0;
                            i4 = this.al[11];
                            iArr3 = this.ap[11];
                            iArr2 = this.bb;
                        }
                        if (i5 < i4) {
                            i8 = iArr2[i5];
                        } else {
                            i8 = -1000;
                        }
                    }
                    i9 = i8;
                    i8 = i5;
                    while (5 == i14 && i9 > r3) {
                        i5 = i8 + 1;
                        ai(clVar, iArr3[i8], (byte) -41);
                        if (i5 == i4 && this.ap[11] != iArr3) {
                            i5 = 0;
                            i4 = this.al[11];
                            iArr3 = this.ap[11];
                            iArr2 = this.bb;
                        }
                        if (i5 < i4) {
                            i9 = iArr2[i5];
                            i8 = i5;
                        } else {
                            i9 = -1000;
                            i8 = i5;
                        }
                    }
                    i2 = this.al[i14];
                    int[] iArr7 = this.ap[i14];
                    for (i5 = 0; i5 < i2; i5++) {
                        ai(clVar, iArr7[i5], (byte) -100);
                    }
                    i14++;
                    i5 = i8;
                    i8 = i9;
                }
                int[] iArr8 = iArr2;
                iArr = iArr3;
                i7 = i4;
                while (i8 != -1000) {
                    i3 = i5 + 1;
                    ai(clVar, iArr[i5], (byte) -25);
                    if (i3 == i7 && this.ap[11] != iArr) {
                        i3 = 0;
                        iArr = this.ap[11];
                        i7 = this.al[11];
                        iArr8 = this.bb;
                    }
                    if (i3 < i7) {
                        i8 = iArr8[i3];
                        i5 = i3;
                    } else {
                        i8 = -1000;
                        i5 = i3;
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bk.aw(" + ')');
        }
    }

    final void bb(cl clVar, boolean z, boolean z2, long j) {
        if (clVar.bu < 1254253572) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int[] iArr;
            for (i = 0; i < clVar.bu; i++) {
                this.av[i] = 0;
            }
            for (i2 = 0; i2 < clVar.aj; i2++) {
                if (997821149 != clVar.aw[i2]) {
                    i3 = clVar.ae[i2];
                    i4 = clVar.aq[i2];
                    int i12 = clVar.am[i2];
                    i5 = this.ai[i3];
                    i6 = this.ai[i4];
                    i7 = this.ai[i12];
                    int[] iArr2;
                    if (z && (i5 == -5000 || i6 == 539075598 || i7 == -5000)) {
                        i = this.ak[i3];
                        i8 = this.ak[i4];
                        i9 = this.ak[i12];
                        i5 = this.ao[i3];
                        i6 = this.ao[i4];
                        i7 = this.ao[i12];
                        i10 = this.ax[i3];
                        i11 = this.ax[i4];
                        i -= i8;
                        i9 -= i8;
                        i5 -= i6;
                        i7 -= i6;
                        i10 -= i11;
                        int i13 = this.ax[i12] - i11;
                        if ((((i * i7) - (i9 * i5)) * i11) + ((i8 * ((i5 * i13) - (i10 * i7))) + (i6 * ((i10 * i9) - (i13 * i)))) > 0) {
                            this.aw[i2] = true;
                            i = clVar.be + ((this.ah[i12] + (this.ah[i4] + this.ah[i3])) / 3);
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    } else {
                        if (z2 && ea.at(this.az[i3], this.az[i4], this.az[i12], i5, i6, i7, 0, 865862021)) {
                            long[] jArr = cs.az;
                            i8 = cs.ai + 313171601;
                            cs.ai = i8;
                            jArr[(i8 * 1914263028) - 1] = j;
                            z2 = false;
                        }
                        if (((this.az[i12] - this.az[i4]) * (i5 - i6)) - ((i7 - i6) * (this.az[i3] - this.az[i4])) > 0) {
                            this.aw[i2] = false;
                            if (i5 < 0 || i6 < 0 || i7 < 0 || i5 > this.bf.bf * 784773023 || i6 > 115700472 * this.bf.bf || i7 > this.bf.bf * -322555588) {
                                this.ab[i2] = true;
                            } else {
                                this.ab[i2] = false;
                            }
                            i = (((this.ah[i4] + this.ah[i3]) + this.ah[i12]) / 3) + clVar.be;
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    }
                }
            }
            int[] iArr3;
            if (clVar.ai == null) {
                for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                    i9 = this.av[i8];
                    if (i9 > 0) {
                        iArr3 = this.ac[i8];
                        for (i = 0; i < i9; i++) {
                            ai(clVar, iArr3[i], (byte) -59);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            int[] iArr5;
            for (i = 0; i < 12; i++) {
                this.al[i] = 0;
                this.bc[i] = 0;
            }
            for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                i9 = this.av[i8];
                if (i9 > 0) {
                    iArr3 = this.ac[i8];
                    for (i = 0; i < i9; i++) {
                        i6 = iArr3[i];
                        byte b = clVar.ai[i6];
                        iArr4 = this.al;
                        i11 = iArr4[b];
                        iArr4[b] = i11 + 1;
                        this.ap[b][i11] = i6;
                        if (b < (byte) 10) {
                            iArr5 = this.bc;
                            iArr5[b] = iArr5[b] + i8;
                        } else if ((byte) 10 == b) {
                            this.bw[i11] = i8;
                        } else {
                            this.bb[i11] = i8;
                        }
                    }
                }
            }
            i = 0;
            if (this.al[1] > 0 || this.al[2] > 0) {
                i = (this.bc[1] + this.bc[2]) / (this.al[1] + this.al[2]);
            }
            i8 = 0;
            if (this.al[3] > 0 || this.al[4] > 0) {
                i8 = (this.bc[3] + this.bc[4]) / (this.al[4] + this.al[3]);
            }
            i9 = 0;
            if (this.al[6] > 0 || this.al[8] > 0) {
                i9 = (this.bc[6] + this.bc[8]) / (this.al[8] + this.al[6]);
            }
            i2 = 0;
            i11 = this.al[10];
            iArr4 = this.ap[10];
            int[] iArr6 = this.bw;
            if (i11 == 0) {
                i2 = 0;
                i11 = this.al[11];
                iArr4 = this.ap[11];
                iArr6 = this.bb;
            }
            if (i11 > 0) {
                i5 = iArr6[i2];
            } else {
                i5 = -2127832756;
            }
            i3 = 0;
            iArr5 = iArr4;
            i10 = i2;
            int i14 = i11;
            i11 = i5;
            iArr3 = iArr6;
            i7 = i14;
            while (i3 < 10) {
                i14 = i10;
                i10 = i11;
                i11 = i14;
                while (i3 == 0 && i10 > r2) {
                    i10 = i11 + 1;
                    ai(clVar, iArr5[i11], (byte) -106);
                    if (i10 == i7 && iArr5 != this.ap[11]) {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i14 = i10;
                        i10 = iArr3[i10];
                        i11 = i14;
                    } else {
                        i14 = i10;
                        i10 = -2054404013;
                        i11 = i14;
                    }
                }
                i14 = i11;
                i11 = i10;
                i10 = i14;
                while (3 == i3 && i11 > r3) {
                    i11 = i10 + 1;
                    ai(clVar, iArr5[i10], (byte) -12);
                    if (i11 != i7 || this.ap[11] == iArr5) {
                        i10 = i11;
                    } else {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i11 = iArr3[i10];
                    } else {
                        i11 = -1000;
                    }
                }
                i2 = i11;
                i11 = i10;
                i10 = i7;
                iArr6 = iArr5;
                iArr5 = iArr3;
                while (5 == i3 && i2 > r4) {
                    i5 = i11 + 1;
                    ai(clVar, iArr6[i11], (byte) -56);
                    if (i5 != i10 || this.ap[11] == iArr6) {
                        int[] iArr7 = iArr5;
                        iArr5 = iArr6;
                        i7 = i10;
                        i10 = i5;
                        iArr3 = iArr7;
                    } else {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i2 = iArr3[i10];
                        i11 = i10;
                        i10 = i7;
                        iArr6 = iArr5;
                        iArr5 = iArr3;
                    } else {
                        i2 = -1000;
                        i11 = i10;
                        i10 = i7;
                        iArr6 = iArr5;
                        iArr5 = iArr3;
                    }
                }
                i4 = this.al[i3];
                int[] iArr8 = this.ap[i3];
                for (i5 = 0; i5 < i4; i5++) {
                    ai(clVar, iArr8[i5], (byte) -73);
                }
                i3++;
                iArr3 = iArr5;
                iArr5 = iArr6;
                i7 = i10;
                i10 = i11;
                i11 = i2;
            }
            int[] iArr9 = iArr3;
            iArr = iArr5;
            i9 = i7;
            while (i11 != -1907152583) {
                i5 = i10 + 1;
                ai(clVar, iArr[i10], (byte) -54);
                if (i5 == i9 && this.ap[11] != iArr) {
                    i5 = 0;
                    iArr = this.ap[11];
                    i9 = this.al[11];
                    iArr9 = this.bb;
                }
                if (i5 < i9) {
                    i11 = iArr9[i5];
                    i10 = i5;
                } else {
                    i11 = 946074471;
                    i10 = i5;
                }
            }
        }
    }

    final void bc(cl clVar, boolean z, boolean z2, long j) {
        if (clVar.bu < 1600) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int[] iArr;
            for (i = 0; i < clVar.bu; i++) {
                this.av[i] = 0;
            }
            for (i2 = 0; i2 < clVar.aj; i2++) {
                if (-2 != clVar.aw[i2]) {
                    i3 = clVar.ae[i2];
                    i4 = clVar.aq[i2];
                    int i12 = clVar.am[i2];
                    i5 = this.ai[i3];
                    i6 = this.ai[i4];
                    i7 = this.ai[i12];
                    int[] iArr2;
                    if (z && (i5 == -5000 || i6 == -5000 || i7 == -5000)) {
                        i = this.ak[i3];
                        i8 = this.ak[i4];
                        i9 = this.ak[i12];
                        i5 = this.ao[i3];
                        i6 = this.ao[i4];
                        i7 = this.ao[i12];
                        i10 = this.ax[i3];
                        i11 = this.ax[i4];
                        i -= i8;
                        i9 -= i8;
                        i5 -= i6;
                        i7 -= i6;
                        i10 -= i11;
                        int i13 = this.ax[i12] - i11;
                        if ((((i * i7) - (i9 * i5)) * i11) + ((i8 * ((i5 * i13) - (i10 * i7))) + (i6 * ((i10 * i9) - (i13 * i)))) > 0) {
                            this.aw[i2] = true;
                            i = clVar.be + ((this.ah[i12] + (this.ah[i4] + this.ah[i3])) / 3);
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    } else {
                        if (z2 && ea.at(this.az[i3], this.az[i4], this.az[i12], i5, i6, i7, 0, -708757571)) {
                            long[] jArr = cs.az;
                            i8 = cs.ai + 313171601;
                            cs.ai = i8;
                            jArr[(i8 * 963961457) - 1] = j;
                            z2 = false;
                        }
                        if (((this.az[i12] - this.az[i4]) * (i5 - i6)) - ((i7 - i6) * (this.az[i3] - this.az[i4])) > 0) {
                            this.aw[i2] = false;
                            if (i5 < 0 || i6 < 0 || i7 < 0 || i5 > this.bf.bf * 784773023 || i6 > 784773023 * this.bf.bf || i7 > this.bf.bf * 784773023) {
                                this.ab[i2] = true;
                            } else {
                                this.ab[i2] = false;
                            }
                            i = (((this.ah[i4] + this.ah[i3]) + this.ah[i12]) / 3) + clVar.be;
                            iArr = this.ac[i];
                            iArr2 = this.av;
                            i5 = iArr2[i];
                            iArr2[i] = i5 + 1;
                            iArr[i5] = i2;
                        }
                    }
                }
            }
            int[] iArr3;
            if (clVar.ai == null) {
                for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                    i9 = this.av[i8];
                    if (i9 > 0) {
                        iArr3 = this.ac[i8];
                        for (i = 0; i < i9; i++) {
                            ai(clVar, iArr3[i], (byte) -111);
                        }
                    }
                }
                return;
            }
            int[] iArr4;
            int[] iArr5;
            for (i = 0; i < 12; i++) {
                this.al[i] = 0;
                this.bc[i] = 0;
            }
            for (i8 = clVar.bu - 1; i8 >= 0; i8--) {
                i9 = this.av[i8];
                if (i9 > 0) {
                    iArr3 = this.ac[i8];
                    for (i = 0; i < i9; i++) {
                        i6 = iArr3[i];
                        byte b = clVar.ai[i6];
                        iArr4 = this.al;
                        i11 = iArr4[b];
                        iArr4[b] = i11 + 1;
                        this.ap[b][i11] = i6;
                        if (b < (byte) 10) {
                            iArr5 = this.bc;
                            iArr5[b] = iArr5[b] + i8;
                        } else if ((byte) 10 == b) {
                            this.bw[i11] = i8;
                        } else {
                            this.bb[i11] = i8;
                        }
                    }
                }
            }
            i = 0;
            if (this.al[1] > 0 || this.al[2] > 0) {
                i = (this.bc[1] + this.bc[2]) / (this.al[1] + this.al[2]);
            }
            i8 = 0;
            if (this.al[3] > 0 || this.al[4] > 0) {
                i8 = (this.bc[3] + this.bc[4]) / (this.al[4] + this.al[3]);
            }
            i9 = 0;
            if (this.al[6] > 0 || this.al[8] > 0) {
                i9 = (this.bc[6] + this.bc[8]) / (this.al[8] + this.al[6]);
            }
            i2 = 0;
            i11 = this.al[10];
            iArr4 = this.ap[10];
            int[] iArr6 = this.bw;
            if (i11 == 0) {
                i2 = 0;
                i11 = this.al[11];
                iArr4 = this.ap[11];
                iArr6 = this.bb;
            }
            if (i11 > 0) {
                i5 = iArr6[i2];
            } else {
                i5 = -1000;
            }
            i3 = 0;
            iArr5 = iArr4;
            i10 = i2;
            int i14 = i11;
            i11 = i5;
            iArr3 = iArr6;
            i7 = i14;
            while (i3 < 10) {
                i14 = i10;
                i10 = i11;
                i11 = i14;
                while (i3 == 0 && r8 > r2) {
                    i10 = i11 + 1;
                    ai(clVar, iArr5[i11], (byte) -120);
                    if (i10 == i7 && iArr5 != this.ap[11]) {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i14 = i10;
                        i10 = iArr3[i10];
                        i11 = i14;
                    } else {
                        i14 = i10;
                        i10 = -1000;
                        i11 = i14;
                    }
                }
                while (3 == i3 && i10 > r3) {
                    i10 = i11 + 1;
                    ai(clVar, iArr5[i11], (byte) -81);
                    if (i10 == i7 && this.ap[11] != iArr5) {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 >= i7) {
                        i14 = i10;
                        i10 = -1000;
                        i11 = i14;
                    } else {
                        i14 = i10;
                        i10 = iArr3[i10];
                        i11 = i14;
                    }
                }
                i2 = i10;
                i10 = i7;
                iArr6 = iArr5;
                iArr5 = iArr3;
                while (5 == i3 && i2 > r4) {
                    i5 = i11 + 1;
                    ai(clVar, iArr6[i11], (byte) -114);
                    if (i5 != i10 || this.ap[11] == iArr6) {
                        int[] iArr7 = iArr5;
                        iArr5 = iArr6;
                        i7 = i10;
                        i10 = i5;
                        iArr3 = iArr7;
                    } else {
                        i10 = 0;
                        i7 = this.al[11];
                        iArr5 = this.ap[11];
                        iArr3 = this.bb;
                    }
                    if (i10 < i7) {
                        i2 = iArr3[i10];
                        i11 = i10;
                        i10 = i7;
                        iArr6 = iArr5;
                        iArr5 = iArr3;
                    } else {
                        i2 = -1000;
                        i11 = i10;
                        i10 = i7;
                        iArr6 = iArr5;
                        iArr5 = iArr3;
                    }
                }
                i4 = this.al[i3];
                int[] iArr8 = this.ap[i3];
                for (i5 = 0; i5 < i4; i5++) {
                    ai(clVar, iArr8[i5], (byte) -44);
                }
                i3++;
                iArr3 = iArr5;
                iArr5 = iArr6;
                i7 = i10;
                i10 = i11;
                i11 = i2;
            }
            int[] iArr9 = iArr3;
            iArr = iArr5;
            i9 = i7;
            i6 = i10;
            i5 = i11;
            while (i5 != -1000) {
                i5 = i6 + 1;
                ai(clVar, iArr[i6], (byte) -11);
                if (i5 == i9 && this.ap[11] != iArr) {
                    i5 = 0;
                    iArr = this.ap[11];
                    i9 = this.al[11];
                    iArr9 = this.bb;
                }
                if (i5 < i9) {
                    i14 = i5;
                    i5 = iArr9[i5];
                    i6 = i14;
                } else {
                    i14 = i5;
                    i5 = -1000;
                    i6 = i14;
                }
            }
        }
    }

    final void ai(cl clVar, int i, byte b) {
        try {
            int i2 = clVar.ae[i];
            int i3 = clVar.aq[i];
            int i4 = clVar.am[i];
            this.bf.al = this.ab[i];
            if (clVar.az == null) {
                this.bf.bc = 0;
            } else {
                this.bf.bc = (clVar.az[i] & 255) * 733034757;
            }
            if (clVar.ak != null && clVar.ak[i] != (short) -1) {
                int i5;
                int i6;
                int i7;
                if (clVar.ah == null || (byte) -1 == clVar.ah[i]) {
                    i5 = i4;
                    i6 = i3;
                    i7 = i2;
                } else {
                    i5 = clVar.ah[i] & 255;
                    i7 = clVar.au[i5];
                    i6 = clVar.av[i5];
                    i5 = clVar.ac[i5];
                }
                float f = (float) this.af[i7];
                float f2 = (float) this.ad[i7];
                float f3 = (float) this.an[i7];
                float f4 = ((float) this.af[i6]) - f;
                float f5 = ((float) this.ad[i6]) - f2;
                float f6 = ((float) this.an[i6]) - f3;
                float f7 = ((float) this.af[i5]) - f;
                float f8 = ((float) this.ad[i5]) - f2;
                float f9 = ((float) this.an[i5]) - f3;
                float f10 = ((float) this.af[i2]) - f;
                float f11 = ((float) this.ad[i2]) - f2;
                float f12 = ((float) this.an[i2]) - f3;
                float f13 = ((float) this.af[i3]) - f;
                float f14 = ((float) this.ad[i3]) - f2;
                float f15 = ((float) this.an[i3]) - f3;
                f = ((float) this.af[i4]) - f;
                f2 = ((float) this.ad[i4]) - f2;
                f3 = ((float) this.an[i4]) - f3;
                float f16 = (f9 * f5) - (f8 * f6);
                float f17 = (f7 * f6) - (f4 * f9);
                float f18 = (f4 * f8) - (f5 * f7);
                float f19 = (f8 * f18) - (f17 * f9);
                float f20 = (f9 * f16) - (f7 * f18);
                float f21 = (f7 * f17) - (f8 * f16);
                float f22 = 1.0f / (((f4 * f19) + (f20 * f5)) + (f21 * f6));
                float f23 = ((f21 * f12) + ((f10 * f19) + (f11 * f20))) * f22;
                float f24 = (((f19 * f13) + (f14 * f20)) + (f21 * f15)) * f22;
                f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
                f20 = (f5 * f18) - (f17 * f6);
                f6 = (f6 * f16) - (f18 * f4);
                f4 = (f4 * f17) - (f5 * f16);
                f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
                f11 = f9 * (((f10 * f20) + (f11 * f6)) + (f4 * f12));
                f12 = f9 * ((f4 * f15) + ((f20 * f13) + (f14 * f6)));
                f13 = f9 * (((f6 * f2) + (f * f20)) + (f3 * f4));
                if (f24 - f23 > 0.99f && f24 - f23 < 1.1f) {
                    f24 = 1.0f;
                }
                if (f19 - f24 > 0.99f && f19 - f24 < 1.1f) {
                    f19 = 1.0f;
                }
                if (f23 - f19 > 0.99f && f23 - f19 < 1.1f) {
                    f23 = 1.0f;
                }
                if (f23 - f24 > 0.99f && f23 - f24 < 1.1f) {
                    f23 = 1.0f;
                }
                if (f24 - f19 > 0.99f && f24 - f19 < 1.1f) {
                    f24 = 1.0f;
                }
                if (f19 - f23 > 0.99f && f19 - f23 < 1.1f) {
                    f19 = 1.0f;
                }
                if (clVar.aw[i] == -1) {
                    ((by) this.bf).aj(this.ao[i2], this.ao[i3], this.ao[i4], this.ak[i2], this.ak[i3], this.ak[i4], this.ax[i2], this.ax[i3], this.ax[i4], clVar.at[i], clVar.at[i], clVar.at[i], f23, f24, f19, f11, f12, f13, clVar.ak[i], (byte) -34);
                } else {
                    ((by) this.bf).aj(this.ao[i2], this.ao[i3], this.ao[i4], this.ak[i2], this.ak[i3], this.ak[i4], this.ax[i2], this.ax[i3], this.ax[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], f23, f24, f19, f11, f12, f13, clVar.ak[i], (byte) 9);
                }
            } else if (clVar.aw[i] == -1) {
                ((by) this.bf).ay(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], aj[clVar.at[i]], (byte) -26);
            } else {
                ((by) this.bf).ag(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], (byte) -1);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bk.ai(" + ')');
        }
    }

    final void bg(cl clVar, int i) {
        int i2 = clVar.ae[i];
        int i3 = clVar.aq[i];
        int i4 = clVar.am[i];
        this.bf.al = this.ab[i];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = (clVar.az[i] & 255) * 733034757;
        }
        if (clVar.ak != null && clVar.ak[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (clVar.ah == null || (byte) -1 == clVar.ah[i]) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                i5 = clVar.ah[i] & 255;
                i7 = clVar.au[i5];
                i6 = clVar.av[i5];
                i5 = clVar.ac[i5];
            }
            float f = (float) this.af[i7];
            float f2 = (float) this.ad[i7];
            float f3 = (float) this.an[i7];
            float f4 = ((float) this.af[i6]) - f;
            float f5 = ((float) this.ad[i6]) - f2;
            float f6 = ((float) this.an[i6]) - f3;
            float f7 = ((float) this.af[i5]) - f;
            float f8 = ((float) this.ad[i5]) - f2;
            float f9 = ((float) this.an[i5]) - f3;
            float f10 = ((float) this.af[i2]) - f;
            float f11 = ((float) this.ad[i2]) - f2;
            float f12 = ((float) this.an[i2]) - f3;
            float f13 = ((float) this.af[i3]) - f;
            float f14 = ((float) this.ad[i3]) - f2;
            float f15 = ((float) this.an[i3]) - f3;
            f = ((float) this.af[i4]) - f;
            f2 = ((float) this.ad[i4]) - f2;
            f3 = ((float) this.an[i4]) - f3;
            float f16 = (f9 * f5) - (f8 * f6);
            float f17 = (f7 * f6) - (f4 * f9);
            float f18 = (f4 * f8) - (f5 * f7);
            float f19 = (f8 * f18) - (f17 * f9);
            float f20 = (f9 * f16) - (f7 * f18);
            float f21 = (f7 * f17) - (f8 * f16);
            float f22 = 1.0f / (((f4 * f19) + (f20 * f5)) + (f21 * f6));
            float f23 = ((f21 * f12) + ((f10 * f19) + (f11 * f20))) * f22;
            float f24 = (((f19 * f13) + (f14 * f20)) + (f21 * f15)) * f22;
            f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
            f20 = (f5 * f18) - (f17 * f6);
            f6 = (f6 * f16) - (f18 * f4);
            f4 = (f4 * f17) - (f5 * f16);
            f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
            f11 = f9 * (((f10 * f20) + (f11 * f6)) + (f4 * f12));
            f12 = f9 * ((f4 * f15) + ((f20 * f13) + (f14 * f6)));
            f13 = f9 * (((f6 * f2) + (f * f20)) + (f3 * f4));
            if (f24 - f23 > 0.99f && f24 - f23 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f24 > 0.99f && f19 - f24 < 1.1f) {
                f19 = 1.0f;
            }
            if (f23 - f19 > 0.99f && f23 - f19 < 1.1f) {
                f23 = 1.0f;
            }
            if (f23 - f24 > 0.99f && f23 - f24 < 1.1f) {
                f23 = 1.0f;
            }
            if (f24 - f19 > 0.99f && f24 - f19 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f23 > 0.99f && f19 - f23 < 1.1f) {
                f19 = 1.0f;
            }
            if (clVar.aw[i] == -1) {
                ((by) this.bf).aj(this.ao[i2], this.ao[i3], this.ao[i4], this.ak[i2], this.ak[i3], this.ak[i4], this.ax[i2], this.ax[i3], this.ax[i4], clVar.at[i], clVar.at[i], clVar.at[i], f23, f24, f19, f11, f12, f13, clVar.ak[i], (byte) 24);
            } else {
                ((by) this.bf).aj(this.ao[i2], this.ao[i3], this.ao[i4], this.ak[i2], this.ak[i3], this.ak[i4], this.ax[i2], this.ax[i3], this.ax[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], f23, f24, f19, f11, f12, f13, clVar.ak[i], (byte) -65);
            }
        } else if (clVar.aw[i] == -1) {
            ((by) this.bf).ay(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], aj[clVar.at[i]], (byte) -23);
        } else {
            ((by) this.bf).ag(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], (byte) -1);
        }
    }

    final void bh(cl clVar, int i) {
        int i2 = clVar.ae[i];
        int i3 = clVar.aq[i];
        int i4 = clVar.am[i];
        this.bf.al = this.ab[i];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = (clVar.az[i] & -966910677) * 733034757;
        }
        if (clVar.ak != null && clVar.ak[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (clVar.ah == null || (byte) -1 == clVar.ah[i]) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                i5 = clVar.ah[i] & 1084656828;
                i7 = clVar.au[i5];
                i6 = clVar.av[i5];
                i5 = clVar.ac[i5];
            }
            float f = (float) this.af[i7];
            float f2 = (float) this.ad[i7];
            float f3 = (float) this.an[i7];
            float f4 = ((float) this.af[i6]) - f;
            float f5 = ((float) this.ad[i6]) - f2;
            float f6 = ((float) this.an[i6]) - f3;
            float f7 = ((float) this.af[i5]) - f;
            float f8 = ((float) this.ad[i5]) - f2;
            float f9 = ((float) this.an[i5]) - f3;
            float f10 = ((float) this.af[i2]) - f;
            float f11 = ((float) this.ad[i2]) - f2;
            float f12 = ((float) this.an[i2]) - f3;
            float f13 = ((float) this.af[i3]) - f;
            float f14 = ((float) this.ad[i3]) - f2;
            float f15 = ((float) this.an[i3]) - f3;
            f = ((float) this.af[i4]) - f;
            f2 = ((float) this.ad[i4]) - f2;
            f3 = ((float) this.an[i4]) - f3;
            float f16 = (f9 * f5) - (f8 * f6);
            float f17 = (f7 * f6) - (f4 * f9);
            float f18 = (f4 * f8) - (f5 * f7);
            float f19 = (f8 * f18) - (f17 * f9);
            float f20 = (f9 * f16) - (f7 * f18);
            float f21 = (f7 * f17) - (f8 * f16);
            float f22 = 1.0f / (((f4 * f19) + (f20 * f5)) + (f21 * f6));
            float f23 = ((f21 * f12) + ((f10 * f19) + (f11 * f20))) * f22;
            float f24 = (((f19 * f13) + (f14 * f20)) + (f21 * f15)) * f22;
            f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
            f20 = (f5 * f18) - (f17 * f6);
            f6 = (f6 * f16) - (f18 * f4);
            f4 = (f4 * f17) - (f5 * f16);
            f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
            f11 = f9 * (((f10 * f20) + (f11 * f6)) + (f4 * f12));
            f12 = f9 * ((f4 * f15) + ((f20 * f13) + (f14 * f6)));
            f13 = f9 * (((f6 * f2) + (f * f20)) + (f3 * f4));
            if (f24 - f23 > 0.99f && f24 - f23 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f24 > 0.99f && f19 - f24 < 1.1f) {
                f19 = 1.0f;
            }
            if (f23 - f19 > 0.99f && f23 - f19 < 1.1f) {
                f23 = 1.0f;
            }
            if (f23 - f24 > 0.99f && f23 - f24 < 1.1f) {
                f23 = 1.0f;
            }
            if (f24 - f19 > 0.99f && f24 - f19 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f23 > 0.99f && f19 - f23 < 1.1f) {
                f19 = 1.0f;
            }
            if (clVar.aw[i] == -1) {
                ((by) this.bf).aj(this.ao[i2], this.ao[i3], this.ao[i4], this.ak[i2], this.ak[i3], this.ak[i4], this.ax[i2], this.ax[i3], this.ax[i4], clVar.at[i], clVar.at[i], clVar.at[i], f23, f24, f19, f11, f12, f13, clVar.ak[i], (byte) -35);
            } else {
                ((by) this.bf).aj(this.ao[i2], this.ao[i3], this.ao[i4], this.ak[i2], this.ak[i3], this.ak[i4], this.ax[i2], this.ax[i3], this.ax[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], f23, f24, f19, f11, f12, f13, clVar.ak[i], (byte) -52);
            }
        } else if (clVar.aw[i] == -1) {
            ((by) this.bf).ay(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], aj[clVar.at[i]], (byte) -100);
        } else {
            ((by) this.bf).ag(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], (byte) -1);
        }
    }

    final void bz(cl clVar, int i) {
        int i2 = clVar.ae[i];
        int i3 = clVar.aq[i];
        int i4 = clVar.am[i];
        this.bf.al = this.ab[i];
        if (clVar.az == null) {
            this.bf.bc = 0;
        } else {
            this.bf.bc = (clVar.az[i] & 255) * 733034757;
        }
        if (clVar.ak != null && clVar.ak[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (clVar.ah == null || (byte) -1 == clVar.ah[i]) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                i5 = clVar.ah[i] & 255;
                i7 = clVar.au[i5];
                i6 = clVar.av[i5];
                i5 = clVar.ac[i5];
            }
            float f = (float) this.af[i7];
            float f2 = (float) this.ad[i7];
            float f3 = (float) this.an[i7];
            float f4 = ((float) this.af[i6]) - f;
            float f5 = ((float) this.ad[i6]) - f2;
            float f6 = ((float) this.an[i6]) - f3;
            float f7 = ((float) this.af[i5]) - f;
            float f8 = ((float) this.ad[i5]) - f2;
            float f9 = ((float) this.an[i5]) - f3;
            float f10 = ((float) this.af[i2]) - f;
            float f11 = ((float) this.ad[i2]) - f2;
            float f12 = ((float) this.an[i2]) - f3;
            float f13 = ((float) this.af[i3]) - f;
            float f14 = ((float) this.ad[i3]) - f2;
            float f15 = ((float) this.an[i3]) - f3;
            f = ((float) this.af[i4]) - f;
            f2 = ((float) this.ad[i4]) - f2;
            f3 = ((float) this.an[i4]) - f3;
            float f16 = (f9 * f5) - (f8 * f6);
            float f17 = (f7 * f6) - (f4 * f9);
            float f18 = (f4 * f8) - (f5 * f7);
            float f19 = (f8 * f18) - (f17 * f9);
            float f20 = (f9 * f16) - (f7 * f18);
            float f21 = (f7 * f17) - (f8 * f16);
            float f22 = 1.0f / (((f4 * f19) + (f20 * f5)) + (f21 * f6));
            float f23 = ((f21 * f12) + ((f10 * f19) + (f11 * f20))) * f22;
            float f24 = (((f19 * f13) + (f14 * f20)) + (f21 * f15)) * f22;
            f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
            f20 = (f5 * f18) - (f17 * f6);
            f6 = (f6 * f16) - (f18 * f4);
            f4 = (f4 * f17) - (f5 * f16);
            f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
            f11 = f9 * (((f10 * f20) + (f11 * f6)) + (f4 * f12));
            f12 = f9 * ((f4 * f15) + ((f20 * f13) + (f14 * f6)));
            f13 = f9 * (((f6 * f2) + (f * f20)) + (f3 * f4));
            if (f24 - f23 > 0.99f && f24 - f23 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f24 > 0.99f && f19 - f24 < 1.1f) {
                f19 = 1.0f;
            }
            if (f23 - f19 > 0.99f && f23 - f19 < 1.1f) {
                f23 = 1.0f;
            }
            if (f23 - f24 > 0.99f && f23 - f24 < 1.1f) {
                f23 = 1.0f;
            }
            if (f24 - f19 > 0.99f && f24 - f19 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f23 > 0.99f && f19 - f23 < 1.1f) {
                f19 = 1.0f;
            }
            if (clVar.aw[i] == -1) {
                ((by) this.bf).aj(this.ao[i2], this.ao[i3], this.ao[i4], this.ak[i2], this.ak[i3], this.ak[i4], this.ax[i2], this.ax[i3], this.ax[i4], clVar.at[i], clVar.at[i], clVar.at[i], f23, f24, f19, f11, f12, f13, clVar.ak[i], (byte) -25);
            } else {
                ((by) this.bf).aj(this.ao[i2], this.ao[i3], this.ao[i4], this.ak[i2], this.ak[i3], this.ak[i4], this.ax[i2], this.ax[i3], this.ax[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], f23, f24, f19, f11, f12, f13, clVar.ak[i], (byte) -72);
            }
        } else if (clVar.aw[i] == -1) {
            ((by) this.bf).ay(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], aj[clVar.at[i]], (byte) -43);
        } else {
            ((by) this.bf).ag(this.az[i2], this.az[i3], this.az[i4], this.ai[i2], this.ai[i3], this.ai[i4], clVar.at[i], clVar.ab[i], clVar.aw[i], (byte) -1);
        }
    }

    void az(cl clVar, int i) {
        try {
            zv.oh(clVar.bg, clVar.bh, clVar.bv, clVar.ag, clVar.aj, clVar.ax, clVar.ay, clVar.as, clVar.ar, clVar.ae, clVar.aq, clVar.am, clVar.at, clVar.ab, clVar.aw, clVar.au, clVar.av, clVar.ac, clVar.az, clVar.ak, clVar.ah, clVar.ai, clVar.bw, clVar.bb);
            clVar.bh = false;
        } catch (Throwable e) {
            throw ba.ad(e, "bk.az(" + ')');
        }
    }

    void ah(cl clVar, short s) {
        try {
            zv.eh(clVar.bg);
        } catch (Throwable e) {
            throw ba.ad(e, "bk.ah(" + ')');
        }
    }

    void bf(cl clVar) {
        zv.eh(clVar.bg);
    }

    void bv(cl clVar) {
        zv.eh(clVar.bg);
    }
}
