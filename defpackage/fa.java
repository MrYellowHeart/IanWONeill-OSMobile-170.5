package p000;

import java.util.concurrent.ScheduledExecutorService;

public abstract class fa {
    public static ScheduledExecutorService aa = null;
    public static int af = 0;
    public static int ag = 0;
    public static final int an = 1;
    static final int ap = 32;
    public static final int ar = 16384;
    public static final int as = 256;
    public static fg ay = null;
    public static final int bm = 64;
    public static final int ct = 89;
    static fl nz;
    public int ab;
    boolean ae;
    fb am;
    int ao;
    public int[] aq;
    int at;
    fb[] au;
    fb[] ax;

    protected abstract void an(int i);

    protected abstract void ao();

    public static ar ad(int i, byte b) {
        try {
            ar arVar = (ar) ar.ad.af((long) i);
            if (arVar == null) {
                byte[] an = ar.af.an(5, i, -947845276);
                arVar = new ar();
                if (an != null) {
                    arVar.an(new ik(an), 2049797021);
                }
                ar.ad.an(arVar, (long) i);
            }
            return arVar;
        } catch (Throwable e) {
            throw ba.ad(e, "fa.ad(" + ')');
        }
    }

    protected fa() {
        try {
            this.ae = false;
            this.at = -734555424;
            hu.af(1005561219);
            this.ao = 0;
            this.ax = new fb[8];
            this.au = new fb[8];
        } catch (Throwable e) {
            throw ba.ad(e, "fa.<init>(" + ')');
        }
    }

    public static final void ai(int i, boolean z, int i2) {
        if (i < 8000 || i > 48000) {
            throw new IllegalArgumentException();
        }
        af = -1398464295 * i;
        iv.ad = z;
        ag = -813327613 * i2;
    }

    public static final void aw(int i, boolean z, int i2) {
        if (i < 8000 || i > 48000) {
            throw new IllegalArgumentException();
        }
        af = -1398464295 * i;
        iv.ad = z;
        ag = -813327613 * i2;
    }

    public static final void az(int i, boolean z, int i2) {
        if (i < 8000 || i > 48000) {
            throw new IllegalArgumentException();
        }
        af = -1398464295 * i;
        iv.ad = z;
        ag = -813327613 * i2;
    }

    public final synchronized void ad(fb fbVar, int i) {
        try {
            this.am = fbVar;
        } catch (Throwable e) {
            throw ba.ad(e, "fa.ad(" + ')');
        }
    }

    public final synchronized void ah(fb fbVar) {
        this.am = fbVar;
    }

    public final synchronized void ak(fb fbVar) {
        this.am = fbVar;
    }

    public final void aa(byte b) {
    }

    public final void au() {
    }

    public final void av() {
    }

    public final void ax() {
    }

    public final synchronized void ac() {
        try {
            ab((byte) 0);
        } catch (Exception e) {
            at(319668257);
            hu.af(1623379242);
        }
    }

    public final synchronized void ag(byte b) {
        try {
            ab((byte) 0);
        } catch (Exception e) {
            try {
                at(948365466);
                hu.af(113244478);
            } catch (Throwable e2) {
                throw ba.ad(e2, "fa.ag(" + ')');
            }
        }
    }

    public final synchronized void al() {
        try {
            ab((byte) 0);
        } catch (Exception e) {
            at(-929567046);
            hu.af(718042276);
        }
    }

    public final synchronized void ap() {
        try {
            ab((byte) 0);
        } catch (Exception e) {
            at(-1774771363);
            hu.af(953704806);
        }
    }

    public final synchronized void bb() {
        try {
            ab((byte) 0);
        } catch (Exception e) {
            at(-1985735418);
            hu.af(1853363875);
        }
    }

    public final synchronized void bw() {
        try {
            ab((byte) 0);
        } catch (Exception e) {
            at(-2112540450);
            hu.af(33434596);
        }
    }

    public final synchronized void ay(int i) {
        try {
            if (ay != null) {
                Object obj = 1;
                for (int i2 = 0; i2 < 2; i2++) {
                    if (this == ay.af[i2]) {
                        ay.af[i2] = null;
                    }
                    if (ay.af[i2] != null) {
                        obj = null;
                    }
                }
                if (obj != null) {
                    aa.shutdownNow();
                    aa = null;
                    ay = null;
                }
            }
            at(1466165299);
            this.aq = null;
        } catch (Throwable e) {
            throw ba.ad(e, "fa.ay(" + ')');
        }
    }

    public final synchronized void bc() {
        if (ay != null) {
            Object obj = 1;
            for (int i = 0; i < 2; i++) {
                if (this == ay.af[i]) {
                    ay.af[i] = null;
                }
                if (ay.af[i] != null) {
                    obj = null;
                }
            }
            if (obj != null) {
                aa.shutdownNow();
                aa = null;
                ay = null;
            }
        }
        at(-2100938895);
        this.aq = null;
    }

    public final synchronized void bg() {
        if (ay != null) {
            Object obj = 1;
            for (int i = 0; i < 2; i++) {
                if (this == ay.af[i]) {
                    ay.af[i] = null;
                }
                if (ay.af[i] != null) {
                    obj = null;
                }
            }
            if (obj != null) {
                aa.shutdownNow();
                aa = null;
                ay = null;
            }
        }
        at(-964445605);
        this.aq = null;
    }

    public final synchronized void bz() {
        if (ay != null) {
            Object obj = 1;
            for (int i = 0; i < 2; i++) {
                if (this == ay.af[i]) {
                    ay.af[i] = null;
                }
                if (ay.af[i] != null) {
                    obj = null;
                }
            }
            if (obj != null) {
                aa.shutdownNow();
                aa = null;
                ay = null;
            }
        }
        at(-904584442);
        this.aq = null;
    }

    public void as(boolean z, byte b) {
        try {
            this.ae = z;
        } catch (Throwable e) {
            throw ba.ad(e, "fa.as(" + ')');
        }
    }

    public void bf(boolean z) {
        this.ae = z;
    }

    public void bh(boolean z) {
        this.ae = z;
    }

    protected final void ar(int[] iArr, int i) {
        int i2;
        if (iv.ad) {
            i2 = i << 1;
        } else {
            i2 = i;
        }
        id.ae(iArr, 0, i2);
        this.ao -= 1850210431 * i;
        if (this.am != null && this.ao * 1600112511 <= 0) {
            fb ay;
            this.ao += ((af * 1688035177) >> 4) * 1850210431;
            aj.aj(this.am, (byte) -65);
            ae(this.am, this.am.bk(), -513238632);
            int i3 = 0;
            int i4 = 255;
            int i5 = 7;
            loop0:
            while (i4 != 0) {
                int i6;
                if (i5 < 0) {
                    i6 = i5 & 3;
                    i2 = -(i5 >> 2);
                } else {
                    i2 = 0;
                    i6 = i5;
                }
                int i7 = (i4 >>> i6) & 286331153;
                int i8 = i2;
                int i9 = i6;
                i2 = i4;
                i6 = i3;
                while (i7 != 0) {
                    if ((i7 & 1) != 0) {
                        i4 = i2 & ((1 << i9) ^ -1);
                        i2 = i4;
                        fb fbVar = null;
                        fb fbVar2 = this.ax[i9];
                        while (fbVar2 != null) {
                            fd fdVar = fbVar2.ah;
                            if (fdVar == null || fdVar.af <= i8) {
                                fbVar2.ak = true;
                                int ar = fbVar2.ar();
                                i3 = i6 + ar;
                                if (fdVar != null) {
                                    fdVar.af += ar;
                                }
                                if (i3 >= -513965273 * this.at) {
                                    break loop0;
                                }
                                ay = fbVar2.ay();
                                if (ay != null) {
                                    int i10 = fbVar2.az;
                                    while (ay != null) {
                                        ae(ay, (ay.bk() * i10) >> 8, 1081591199);
                                        ay = fbVar2.as();
                                    }
                                }
                                ay = fbVar2.ai;
                                fbVar2.ai = null;
                                if (fbVar == null) {
                                    this.ax[i9] = ay;
                                } else {
                                    fbVar.ai = ay;
                                }
                                if (ay == null) {
                                    this.au[i9] = fbVar;
                                }
                                fbVar2 = ay;
                                i6 = i3;
                            } else {
                                i4 = 1 << i9;
                                i2 = i4 | i2;
                                fbVar = fbVar2;
                                fbVar2 = fbVar2.ai;
                            }
                        }
                        continue;
                    }
                    i7 >>>= 4;
                    i8++;
                    i9 += 4;
                }
                i5--;
                i4 = i2;
                i3 = i6;
            }
            for (i5 = 0; i5 < 8; i5++) {
                fb fbVar3 = this.ax[i5];
                fb[] fbVarArr = this.ax;
                this.au[i5] = null;
                fbVarArr[i5] = null;
                while (fbVar3 != null) {
                    ay = fbVar3.ai;
                    fbVar3.ai = null;
                    fbVar3 = ay;
                }
            }
        }
        if (1600112511 * this.ao < 0) {
            this.ao = 0;
        }
        if (this.am != null) {
            this.am.aj(iArr, 0, i);
        }
        hu.af(500744819);
    }

    protected final void bp(int[] iArr, int i) {
        int i2;
        if (iv.ad) {
            i2 = i << 1;
        } else {
            i2 = i;
        }
        id.ae(iArr, 0, i2);
        this.ao -= 1850210431 * i;
        if (this.am != null && this.ao * 1600112511 <= 0) {
            fb ay;
            this.ao += ((af * 1688035177) >> 4) * 1850210431;
            aj.aj(this.am, (byte) -32);
            ae(this.am, this.am.bk(), -2077026486);
            int i3 = 0;
            int i4 = 255;
            int i5 = 7;
            loop0:
            while (i4 != 0) {
                int i6;
                if (i5 < 0) {
                    i6 = i5 & 3;
                    i2 = -(i5 >> 2);
                } else {
                    i2 = 0;
                    i6 = i5;
                }
                int i7 = (i4 >>> i6) & 286331153;
                int i8 = i2;
                int i9 = i6;
                i2 = i4;
                i6 = i3;
                while (i7 != 0) {
                    if ((i7 & 1) != 0) {
                        i4 = i2 & ((1 << i9) ^ -1);
                        i2 = i4;
                        fb fbVar = null;
                        fb fbVar2 = this.ax[i9];
                        while (fbVar2 != null) {
                            fd fdVar = fbVar2.ah;
                            if (fdVar == null || fdVar.af <= i8) {
                                fbVar2.ak = true;
                                int ar = fbVar2.ar();
                                i3 = i6 + ar;
                                if (fdVar != null) {
                                    fdVar.af += ar;
                                }
                                if (i3 >= -513965273 * this.at) {
                                    break loop0;
                                }
                                ay = fbVar2.ay();
                                if (ay != null) {
                                    int i10 = fbVar2.az;
                                    while (ay != null) {
                                        ae(ay, (ay.bk() * i10) >> 8, 740239450);
                                        ay = fbVar2.as();
                                    }
                                }
                                ay = fbVar2.ai;
                                fbVar2.ai = null;
                                if (fbVar == null) {
                                    this.ax[i9] = ay;
                                } else {
                                    fbVar.ai = ay;
                                }
                                if (ay == null) {
                                    this.au[i9] = fbVar;
                                }
                                fbVar2 = ay;
                                i6 = i3;
                            } else {
                                i4 = (1 << i9) | i2;
                                i2 = i4;
                                fbVar = fbVar2;
                                fbVar2 = fbVar2.ai;
                            }
                        }
                        continue;
                    }
                    i7 >>>= 4;
                    i8++;
                    i9 += 4;
                }
                i5--;
                i4 = i2;
                i3 = i6;
            }
            for (i5 = 0; i5 < 8; i5++) {
                fb fbVar3 = this.ax[i5];
                fb[] fbVarArr = this.ax;
                this.au[i5] = null;
                fbVarArr[i5] = null;
                while (fbVar3 != null) {
                    ay = fbVar3.ai;
                    fbVar3.ai = null;
                    fbVar3 = ay;
                }
            }
        }
        if (1600112511 * this.ao < 0) {
            this.ao = 0;
        }
        if (this.am != null) {
            this.am.aj(iArr, 0, i);
        }
        hu.af(557021667);
    }

    protected final void bv(int[] iArr, int i) {
        int i2;
        if (iv.ad) {
            i2 = i << 1;
        } else {
            i2 = i;
        }
        id.ae(iArr, 0, i2);
        this.ao -= -322834875 * i;
        if (this.am != null && this.ao * -1500259901 <= 0) {
            fb ay;
            this.ao += ((af * -77473988) >> 4) * 1850210431;
            aj.aj(this.am, (byte) -122);
            ae(this.am, this.am.bk(), 32068331);
            int i3 = 0;
            int i4 = 255;
            int i5 = 7;
            loop0:
            while (i4 != 0) {
                int i6;
                if (i5 < 0) {
                    i6 = i5 & 3;
                    i2 = -(i5 >> 2);
                } else {
                    i2 = 0;
                    i6 = i5;
                }
                int i7 = (i4 >>> i6) & 286331153;
                int i8 = i2;
                int i9 = i6;
                i2 = i4;
                i6 = i3;
                while (i7 != 0) {
                    if ((i7 & 1) != 0) {
                        i4 = i2 & ((1 << i9) ^ -1);
                        i2 = i4;
                        fb fbVar = null;
                        fb fbVar2 = this.ax[i9];
                        while (fbVar2 != null) {
                            fd fdVar = fbVar2.ah;
                            if (fdVar == null || fdVar.af <= i8) {
                                fbVar2.ak = true;
                                int ar = fbVar2.ar();
                                i3 = i6 + ar;
                                if (fdVar != null) {
                                    fdVar.af += ar;
                                }
                                if (i3 >= -1881847494 * this.at) {
                                    break loop0;
                                }
                                ay = fbVar2.ay();
                                if (ay != null) {
                                    int i10 = fbVar2.az;
                                    while (ay != null) {
                                        ae(ay, (ay.bk() * i10) >> 8, -1866084501);
                                        ay = fbVar2.as();
                                    }
                                }
                                ay = fbVar2.ai;
                                fbVar2.ai = null;
                                if (fbVar == null) {
                                    this.ax[i9] = ay;
                                } else {
                                    fbVar.ai = ay;
                                }
                                if (ay == null) {
                                    this.au[i9] = fbVar;
                                }
                                fbVar2 = ay;
                                i6 = i3;
                            } else {
                                i4 = (1 << i9) | i2;
                                i2 = i4;
                                fbVar = fbVar2;
                                fbVar2 = fbVar2.ai;
                            }
                        }
                        continue;
                    }
                    i7 >>>= 4;
                    i8++;
                    i9 += 4;
                }
                i5--;
                i4 = i2;
                i3 = i6;
            }
            for (i5 = 0; i5 < 8; i5++) {
                fb fbVar3 = this.ax[i5];
                fb[] fbVarArr = this.ax;
                this.au[i5] = null;
                fbVarArr[i5] = null;
                while (fbVar3 != null) {
                    ay = fbVar3.ai;
                    fbVar3.ai = null;
                    fbVar3 = ay;
                }
            }
        }
        if (1600112511 * this.ao < 0) {
            this.ao = 0;
        }
        if (this.am != null) {
            this.am.aj(iArr, 0, i);
        }
        hu.af(799877834);
    }

    static final void bt(fb fbVar) {
        fbVar.ak = false;
        if (fbVar.ah != null) {
            fbVar.ah.af = 0;
        }
        fb ay = fbVar.ay();
        while (ay != null) {
            aj.aj(ay, (byte) -89);
            ay = fbVar.as();
        }
    }

    static final void bx(fb fbVar) {
        fbVar.ak = false;
        if (fbVar.ah != null) {
            fbVar.ah.af = 0;
        }
        fb ay = fbVar.ay();
        while (ay != null) {
            aj.aj(ay, (byte) -27);
            ay = fbVar.as();
        }
    }

    final void ae(fb fbVar, int i, int i2) {
        int i3 = i >> 5;
        try {
            fb fbVar2 = this.au[i3];
            if (fbVar2 == null) {
                this.ax[i3] = fbVar;
            } else {
                fbVar2.ai = fbVar;
            }
            this.au[i3] = fbVar;
            fbVar.az = i;
        } catch (Throwable e) {
            throw ba.ad(e, "fa.ae(" + ')');
        }
    }

    public void aq(byte b) throws Exception {
    }

    public void bu() throws Exception {
    }

    public void am(int i, int i2) throws Exception {
    }

    public void be(int i) throws Exception {
    }

    public void bk(int i) throws Exception {
    }

    public void by(int i) throws Exception {
    }

    void at(int i) {
    }

    void ba() {
    }

    void bn() {
    }

    void ab(byte b) throws Exception {
    }

    void bl() throws Exception {
    }
}
