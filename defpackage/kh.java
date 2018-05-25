package p000;

import java.io.File;
import java.io.IOException;
import java.util.zip.CRC32;

public class kh extends kf {
    static CRC32 bc = new CRC32();
    public static final int bq = 68;
    mr ac;
    int al;
    volatile boolean ap;
    mr av;
    volatile boolean[] bb;
    int bg;
    int bh;
    boolean bw;
    int bz;

    public kh(mr mrVar, mr mrVar2, int i, boolean z, boolean z2, boolean z3) {
        try {
            super(z, z2);
            this.ap = false;
            this.bw = false;
            this.bh = -1341935297;
            this.av = mrVar;
            this.ac = mrVar2;
            this.al = -674852995 * i;
            this.bw = z3;
            int i2 = -984505899 * this.al;
            if (iu.ao != null) {
                iu.ao.ad = 1735125103 + (-659773672 * i2);
                ec(iu.ao.al(-93885965), iu.ao.al(1239912081), (byte) 41);
                return;
            }
            it.ad(null, 255, 255, 0, (byte) 0, true, (short) 27489);
            jw.ax[i2] = this;
        } catch (Throwable e) {
            throw ba.ad(e, "kh.<init>(" + ')');
        }
    }

    public static nw af(String str, String str2, boolean z, int i) {
        try {
            File file = new File(oa.aa, "preferences" + str + ".dat");
            if (file.exists()) {
                try {
                    return new nw(file, cw.an, 10000);
                } catch (IOException e) {
                }
            }
            String str3 = "";
            if (at.ab * -1064806823 == 33) {
                str3 = "_rc";
            } else if (at.ab * -1064806823 == 34) {
                str3 = "_wip";
            }
            File file2 = new File(jc.az, "jagex_" + str2 + "_preferences" + str + str3 + ".dat");
            if (!z && file2.exists()) {
                try {
                    return new nw(file2, cw.an, 10000);
                } catch (IOException e2) {
                }
            }
            return new nw(file, cw.an, 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        } catch (Throwable e4) {
            throw ba.ad(e4, "kh.af(" + ')');
        }
    }

    public int ef() {
        if (this.ap) {
            return -281460423;
        }
        if (this.am != null) {
            return -1251138217;
        }
        int an = bp.an(255, -984505899 * this.al, -616538746);
        if (an >= 1133268460) {
            return -1701356861;
        }
        return an;
    }

    public int el() {
        if (this.ap) {
            return 100;
        }
        if (this.am != null) {
            return 99;
        }
        int an = bp.an(255, -984505899 * this.al, -616538746);
        if (an < 100) {
            return an;
        }
        return 99;
    }

    public int et() {
        if (this.ap) {
            return 100;
        }
        if (this.am != null) {
            return 99;
        }
        int an = bp.an(255, -984505899 * this.al, -616538746);
        if (an < 100) {
            return an;
        }
        return 99;
    }

    public int eu(int i) {
        try {
            if (this.ap) {
                return 100;
            }
            if (this.am != null) {
                return 99;
            }
            int an = bp.an(255, -984505899 * this.al, -616538746);
            if (an < 100) {
                return an;
            }
            return 99;
        } catch (Throwable e) {
            throw ba.ad(e, "kh.eu(" + ')');
        }
    }

    void ad(int i, int i2) {
        try {
            ks ksVar = (ks) jw.aj.af((long) (((this.al * -984505899) << 16) + i));
            if (ksVar != null) {
                jw.ar.ad(ksVar);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "kh.ad(" + ')');
        }
    }

    void bf(int i) {
        ks ksVar = (ks) jw.aj.af((long) (((this.al * -984505899) << 16) + i));
        if (ksVar != null) {
            jw.ar.ad(ksVar);
        }
    }

    void bh(int i) {
        ks ksVar = (ks) jw.aj.af((long) (((this.al * 1303218512) << 16) + i));
        if (ksVar != null) {
            jw.ar.ad(ksVar);
        }
    }

    void bv(int i) {
        ks ksVar = (ks) jw.aj.af((long) (((this.al * 795499574) << 16) + i));
        if (ksVar != null) {
            jw.ar.ad(ksVar);
        }
    }

    void at(int i, int i2) {
        try {
            if (this.av == null || this.bb == null || !this.bb[i]) {
                it.ad(this, -984505899 * this.al, i, this.ay[i], (byte) 2, true, (short) 26603);
                return;
            }
            mr mrVar = this.av;
            byte[] an = kc.af.an(i, mrVar, 404437947);
            if (an != null) {
                ev(mrVar, i, an, true, -1359113164);
                return;
            }
            ev(mrVar, i, mrVar.af(i, 1973955633), true, -1535935634);
        } catch (Throwable e) {
            throw ba.ad(e, "kh.at(" + ')');
        }
    }

    void cd(int i) {
        if (this.av == null || this.bb == null || !this.bb[i]) {
            it.ad(this, -984505899 * this.al, i, this.ay[i], (byte) 2, true, (short) 9500);
            return;
        }
        mr mrVar = this.av;
        byte[] an = kc.af.an(i, mrVar, 404437947);
        if (an != null) {
            ev(mrVar, i, an, true, -1207426891);
            return;
        }
        ev(mrVar, i, mrVar.af(i, 2011910647), true, -590844706);
    }

    void ch(int i) {
        if (this.av == null || this.bb == null || !this.bb[i]) {
            it.ad(this, 1608729264 * this.al, i, this.ay[i], (byte) 2, true, (short) 12897);
            return;
        }
        mr mrVar = this.av;
        byte[] an = kc.af.an(i, mrVar, 404437947);
        if (an != null) {
            ev(mrVar, i, an, true, -2082521301);
            return;
        }
        ev(mrVar, i, mrVar.af(i, 2045988551), true, -786164057);
    }

    public void ec(int i, int i2, byte b) {
        try {
            this.bz = -1745991667 * i;
            this.bg = -5828757 * i2;
            if (this.ac != null) {
                int i3 = -984505899 * this.al;
                mr mrVar = this.ac;
                byte[] an = kc.af.an(i3, mrVar, 404437947);
                if (an != null) {
                    ev(mrVar, i3, an, true, 126670934);
                    return;
                } else {
                    ev(mrVar, i3, mrVar.af(i3, 1975280112), true, -896826150);
                    return;
                }
            }
            it.ad(this, 255, -984505899 * this.al, 1928021701 * this.bz, (byte) 0, true, (short) 6759);
        } catch (Throwable e) {
            throw ba.ad(e, "kh.ec(" + ')');
        }
    }

    public void eg(int i, byte[] bArr, boolean z, boolean z2) {
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.as[i] >> 8);
            bArr[bArr.length - 1] = (byte) this.as[i];
            if (this.av != null) {
                mr mrVar = this.av;
                jj jjVar = new jj();
                jjVar.af = 0;
                jjVar.fy = (long) i;
                jjVar.ad = bArr;
                jjVar.an = mrVar;
                kc.af.ae(jjVar, (byte) -118);
                kc.af.ad(602581061);
                this.bb[i] = true;
            }
            if (z2) {
                this.am[i] = gl.af(bArr, false, 2057657498);
            }
        } else if (this.ap) {
            throw new RuntimeException();
        } else {
            if (this.ac != null) {
                int i2 = -984505899 * this.al;
                mr mrVar2 = this.ac;
                jj jjVar2 = new jj();
                jjVar2.af = 0;
                jjVar2.fy = (long) i2;
                jjVar2.ad = bArr;
                jjVar2.an = mrVar2;
                kc.af.ae(jjVar2, (byte) -14);
                kc.af.ad(602581061);
            }
            af(bArr, 62136427);
            eq((byte) -1);
        }
    }

    public void ej(int i, byte[] bArr, boolean z, boolean z2) {
        if (!z) {
            bArr[bArr.length - 2] = (byte) (this.as[i] >> 8);
            bArr[bArr.length - 1] = (byte) this.as[i];
            if (this.av != null) {
                mr mrVar = this.av;
                jj jjVar = new jj();
                jjVar.af = 0;
                jjVar.fy = (long) i;
                jjVar.ad = bArr;
                jjVar.an = mrVar;
                kc.af.ae(jjVar, (byte) -122);
                kc.af.ad(602581061);
                this.bb[i] = true;
            }
            if (z2) {
                this.am[i] = gl.af(bArr, false, 2110651062);
            }
        } else if (this.ap) {
            throw new RuntimeException();
        } else {
            if (this.ac != null) {
                int i2 = -984505899 * this.al;
                mr mrVar2 = this.ac;
                jj jjVar2 = new jj();
                jjVar2.af = 0;
                jjVar2.fy = (long) i2;
                jjVar2.ad = bArr;
                jjVar2.an = mrVar2;
                kc.af.ae(jjVar2, (byte) 2);
                kc.af.ad(602581061);
            }
            af(bArr, -114128578);
            eq((byte) -1);
        }
    }

    public void ep(int i, byte[] bArr, boolean z, boolean z2, int i2) {
        if (z) {
            try {
                if (this.ap) {
                    throw new RuntimeException();
                }
                if (this.ac != null) {
                    int i3 = -984505899 * this.al;
                    mr mrVar = this.ac;
                    jj jjVar = new jj();
                    jjVar.af = 0;
                    jjVar.fy = (long) i3;
                    jjVar.ad = bArr;
                    jjVar.an = mrVar;
                    kc.af.ae(jjVar, (byte) -109);
                    kc.af.ad(602581061);
                }
                af(bArr, 718622033);
                eq((byte) -1);
                return;
            } catch (Throwable e) {
                throw ba.ad(e, "kh.ep(" + ')');
            }
        }
        bArr[bArr.length - 2] = (byte) (this.as[i] >> 8);
        bArr[bArr.length - 1] = (byte) this.as[i];
        if (this.av != null) {
            mr mrVar2 = this.av;
            jj jjVar2 = new jj();
            jjVar2.af = 0;
            jjVar2.fy = (long) i;
            jjVar2.ad = bArr;
            jjVar2.an = mrVar2;
            kc.af.ae(jjVar2, (byte) -52);
            kc.af.ad(602581061);
            this.bb[i] = true;
        }
        if (z2) {
            this.am[i] = gl.af(bArr, false, 2128347559);
        }
    }

    void ed(mr mrVar, int i, byte[] bArr, boolean z) {
        int i2;
        if (mrVar != this.ac) {
            if (!z && i == 238108993 * this.bh) {
                this.ap = true;
            }
            if (bArr == null || bArr.length <= 2) {
                this.bb[i] = false;
                if (this.bw || z) {
                    it.ad(this, -984505899 * this.al, i, this.ay[i], (byte) 2, z, (short) 10139);
                    return;
                }
                return;
            }
            bc.reset();
            bc.update(bArr, 0, bArr.length - 2);
            i2 = (bArr[bArr.length - 1] & -1211875642) + ((bArr[bArr.length - 2] & 255) << 8);
            if (this.ay[i] == ((int) bc.getValue()) && this.as[i] == i2) {
                this.bb[i] = true;
                if (z) {
                    this.am[i] = gl.af(bArr, false, 2074914283);
                    return;
                }
                return;
            }
            this.bb[i] = false;
            if (this.bw || z) {
                it.ad(this, -984505899 * this.al, i, this.ay[i], (byte) 2, z, (short) 3870);
            }
        } else if (this.ap) {
            throw new RuntimeException();
        } else if (bArr == null) {
            it.ad(this, -797276689, -984505899 * this.al, this.bz * 1928021701, (byte) 0, true, (short) 15952);
        } else {
            bc.reset();
            bc.update(bArr, 0, bArr.length);
            if (this.bz * 1928021701 != ((int) bc.getValue())) {
                it.ad(this, 255, -984505899 * this.al, 1928021701 * this.bz, (byte) 0, true, (short) 9810);
                return;
            }
            ik ikVar = new ik(lm.bc(bArr, (byte) 81));
            i2 = ikVar.ao((byte) 0);
            if (i2 == 5 || i2 == 6) {
                int al;
                if (i2 >= 6) {
                    al = ikVar.al(1671652494);
                } else {
                    al = 0;
                }
                if (al != this.bg * -1126615020) {
                    it.ad(this, -598255693, -984505899 * this.al, 1928021701 * this.bz, (byte) 0, true, (short) 6687);
                    return;
                }
                af(bArr, 763997334);
                eq((byte) -1);
                return;
            }
            throw new RuntimeException(i2 + "," + (this.al * -1499751496) + "," + i);
        }
    }

    void em(mr mrVar, int i, byte[] bArr, boolean z) {
        int i2;
        if (mrVar != this.ac) {
            if (!z && i == 238108993 * this.bh) {
                this.ap = true;
            }
            if (bArr == null || bArr.length <= 2) {
                this.bb[i] = false;
                if (this.bw || z) {
                    it.ad(this, -984505899 * this.al, i, this.ay[i], (byte) 2, z, (short) 26731);
                    return;
                }
                return;
            }
            bc.reset();
            bc.update(bArr, 0, bArr.length - 2);
            i2 = (bArr[bArr.length - 1] & 255) + ((bArr[bArr.length - 2] & 255) << 8);
            if (this.ay[i] == ((int) bc.getValue()) && this.as[i] == i2) {
                this.bb[i] = true;
                if (z) {
                    this.am[i] = gl.af(bArr, false, 2083015527);
                    return;
                }
                return;
            }
            this.bb[i] = false;
            if (this.bw || z) {
                it.ad(this, -984505899 * this.al, i, this.ay[i], (byte) 2, z, (short) 5776);
            }
        } else if (this.ap) {
            throw new RuntimeException();
        } else if (bArr == null) {
            it.ad(this, 255, -984505899 * this.al, this.bz * 1928021701, (byte) 0, true, (short) 29384);
        } else {
            bc.reset();
            bc.update(bArr, 0, bArr.length);
            if (this.bz * 1928021701 != ((int) bc.getValue())) {
                it.ad(this, 255, -984505899 * this.al, 1928021701 * this.bz, (byte) 0, true, (short) 10251);
                return;
            }
            ik ikVar = new ik(lm.bc(bArr, Byte.MAX_VALUE));
            i2 = ikVar.ao((byte) 0);
            if (i2 == 5 || i2 == 6) {
                int al;
                if (i2 >= 6) {
                    al = ikVar.al(-230176575);
                } else {
                    al = 0;
                }
                if (al != this.bg * -406477501) {
                    it.ad(this, 255, -984505899 * this.al, 1928021701 * this.bz, (byte) 0, true, (short) 3239);
                    return;
                }
                af(bArr, -1666972764);
                eq((byte) -1);
                return;
            }
            throw new RuntimeException(i2 + "," + (this.al * -984505899) + "," + i);
        }
    }

    void ev(mr mrVar, int i, byte[] bArr, boolean z, int i2) {
        int i3 = 0;
        try {
            if (mrVar != this.ac) {
                if (!z) {
                    if (i == 238108993 * this.bh) {
                        this.ap = true;
                    }
                }
                if (bArr == null || bArr.length <= 2) {
                    this.bb[i] = false;
                    if (this.bw || z) {
                        it.ad(this, -984505899 * this.al, i, this.ay[i], (byte) 2, z, (short) 29029);
                        return;
                    }
                    return;
                }
                bc.reset();
                bc.update(bArr, 0, bArr.length - 2);
                int i4 = (bArr[bArr.length - 1] & 255) + ((bArr[bArr.length - 2] & 255) << 8);
                if (this.ay[i] == ((int) bc.getValue()) && this.as[i] == i4) {
                    this.bb[i] = true;
                    if (z) {
                        this.am[i] = gl.af(bArr, false, 2093757621);
                        return;
                    }
                    return;
                }
                this.bb[i] = false;
                if (this.bw || z) {
                    it.ad(this, -984505899 * this.al, i, this.ay[i], (byte) 2, z, (short) 2952);
                }
            } else if (this.ap) {
                throw new RuntimeException();
            } else if (bArr == null) {
                it.ad(this, 255, -984505899 * this.al, this.bz * 1928021701, (byte) 0, true, (short) 3691);
            } else {
                bc.reset();
                bc.update(bArr, 0, bArr.length);
                if (this.bz * 1928021701 != ((int) bc.getValue())) {
                    it.ad(this, 255, -984505899 * this.al, 1928021701 * this.bz, (byte) 0, true, (short) 23754);
                    return;
                }
                ik ikVar = new ik(lm.bc(bArr, (byte) 104));
                int ao = ikVar.ao((byte) 0);
                if (ao == 5 || ao == 6) {
                    if (ao >= 6) {
                        i3 = ikVar.al(625250498);
                    }
                    if (i3 != this.bg * -406477501) {
                        it.ad(this, 255, -984505899 * this.al, 1928021701 * this.bz, (byte) 0, true, (short) 15145);
                        return;
                    }
                    af(bArr, -679052253);
                    eq((byte) -1);
                    return;
                }
                throw new RuntimeException(ao + "," + (this.al * -984505899) + "," + i);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "kh.ev(" + ')');
        }
    }

    void eb() {
        int i = 0;
        this.bb = new boolean[this.am.length];
        for (int i2 = 0; i2 < this.bb.length; i2++) {
            this.bb[i2] = false;
        }
        if (this.av == null) {
            this.ap = true;
            return;
        }
        this.bh = -1341935297;
        while (i < this.bb.length) {
            if (this.ar[i] > 0) {
                df.af(i, this.av, this, -1555677738);
                this.bh = 1341935297 * i;
            }
            i++;
        }
        if (this.bh * 238108993 == -1) {
            this.ap = true;
        }
    }

    void ee() {
        int i = 0;
        this.bb = new boolean[this.am.length];
        for (int i2 = 0; i2 < this.bb.length; i2++) {
            this.bb[i2] = false;
        }
        if (this.av == null) {
            this.ap = true;
            return;
        }
        this.bh = -1341935297;
        while (i < this.bb.length) {
            if (this.ar[i] > 0) {
                df.af(i, this.av, this, -270562687);
                this.bh = 1341935297 * i;
            }
            i++;
        }
        if (this.bh * 1581865095 == -1) {
            this.ap = true;
        }
    }

    void eq(byte b) {
        int i = 0;
        try {
            this.bb = new boolean[this.am.length];
            for (int i2 = 0; i2 < this.bb.length; i2++) {
                this.bb[i2] = false;
            }
            if (this.av == null) {
                this.ap = true;
                return;
            }
            this.bh = -1341935297;
            while (i < this.bb.length) {
                if (this.ar[i] > 0) {
                    df.af(i, this.av, this, 1276775226);
                    this.bh = 1341935297 * i;
                }
                i++;
            }
            if (this.bh * 238108993 == -1) {
                this.ap = true;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "kh.eq(" + ')');
        }
    }

    void ez() {
        int i = 0;
        this.bb = new boolean[this.am.length];
        for (int i2 = 0; i2 < this.bb.length; i2++) {
            this.bb[i2] = false;
        }
        if (this.av == null) {
            this.ap = true;
            return;
        }
        this.bh = -1341935297;
        while (i < this.bb.length) {
            if (this.ar[i] > 0) {
                df.af(i, this.av, this, -174818168);
                this.bh = 1341935297 * i;
            }
            i++;
        }
        if (this.bh * 238108993 == -1) {
            this.ap = true;
        }
    }

    int aj(int i, int i2) {
        try {
            if (this.am[i] != null) {
                return 100;
            }
            if (this.bb[i]) {
                return 100;
            }
            return bp.an(-984505899 * this.al, i, -616538746);
        } catch (Throwable e) {
            throw ba.ad(e, "kh.aj(" + ')');
        }
    }

    int cv(int i) {
        if (this.am[i] == null && !this.bb[i]) {
            return bp.an(-984505899 * this.al, i, -616538746);
        }
        return 100;
    }

    public boolean eh(int i) {
        return this.bb[i];
    }

    public boolean ei(int i) {
        return this.bb[i];
    }

    public boolean en(int i, int i2) {
        try {
            return this.bb[i];
        } catch (Throwable e) {
            throw ba.ad(e, "kh.en(" + ')');
        }
    }

    public boolean eo(int i) {
        return this.bb[i];
    }

    public boolean fd(int i) {
        return this.bb[i];
    }

    public boolean ea(int i, int i2) {
        try {
            return ab(i, 225578706) != null;
        } catch (Throwable e) {
            throw ba.ad(e, "kh.ea(" + ')');
        }
    }

    public boolean fk(int i) {
        return ab(i, -1719747825) != null;
    }

    public boolean fv(int i) {
        return ab(i, -151798631) != null;
    }

    public int ey(byte b) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.am.length) {
            try {
                if (this.ar[i2] > 0) {
                    i3 += 100;
                    i += aj(i2, -1568348982);
                }
                i2++;
            } catch (Throwable e) {
                throw ba.ad(e, "kh.ey(" + ')');
            }
        }
        if (i3 == 0) {
            return 100;
        }
        return (i * 100) / i3;
    }

    public int fa() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < this.am.length) {
            if (this.ar[i] > 0) {
                i3 += 100;
                i2 += aj(i, 1283816528);
            }
            i++;
        }
        if (i3 == 0) {
            return 100;
        }
        return (i2 * 100) / i3;
    }

    public int fh() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < this.am.length) {
            if (this.ar[i] > 0) {
                i3 += 100;
                i2 += aj(i, 661239627);
            }
            i++;
        }
        if (i3 == 0) {
            return 100;
        }
        return (-1700892072 * i2) / i3;
    }

    public int fl() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < this.am.length) {
            if (this.ar[i] > 0) {
                i3 += 100;
                i2 += aj(i, -97592628);
            }
            i++;
        }
        if (i3 == 0) {
            return -1042172030;
        }
        return (62718635 * i2) / i3;
    }

    public int fm() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < this.am.length) {
            if (this.ar[i] > 0) {
                i3 += 100;
                i2 += aj(i, 718662433);
            }
            i++;
        }
        if (i3 == 0) {
            return 100;
        }
        return (i2 * 100) / i3;
    }
}
