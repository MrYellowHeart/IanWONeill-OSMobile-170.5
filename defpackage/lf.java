package p000;

import com.jagex.oldscape.osrenderer.af;
import com.jagex.oldscape.osrenderer.zv;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public abstract class lf implements Runnable {
    protected static long[] qc = new long[32];
    static lf qg = null;
    static boolean qh = false;
    static int qj = 0;
    static final long qq = (TimeUnit.MILLISECONDS.toNanos(20) * -8404108934090701459L);
    protected static long[] qr = new long[32];
    static long qu = 0;
    protected static int qv = 0;
    static mv qw = null;
    static volatile boolean rk = true;
    static int rw = 1289028068;
    static ll rx = new ll();
    protected int qe;
    int qk;
    int qo;
    protected float qy;
    int rb;
    protected gn re;
    bd rf;
    int rh;
    protected int ri;
    int rj;
    int rl;
    ld rn;
    lg ro;
    HashMap rp;
    volatile boolean rq;
    int rr;
    boolean rs;
    URL rt;
    int rv;
    protected ft ry;

    protected abstract void ab(boolean z, float f, int i);

    protected abstract void aj(byte b);

    protected abstract void am(int i);

    protected abstract void at(int i);

    protected abstract void aw(int i);

    protected abstract void ay(int i);

    protected abstract void ck(int i, int i2);

    protected abstract void cs(byte b);

    protected abstract void ga();

    protected abstract void gb();

    protected abstract void gk();

    protected abstract void gq();

    protected abstract void gr();

    protected abstract void gx();

    protected abstract void gy();

    protected abstract void hd(boolean z, float f);

    protected abstract void hj();

    protected abstract void hk();

    protected abstract void hx(boolean z, float f);

    protected abstract void hy();

    protected abstract void ka(int i);

    protected abstract void km(int i);

    protected abstract void ta();

    protected abstract void tb();

    protected abstract void tn();

    protected abstract void tu();

    protected abstract void tw();

    protected abstract void tx();

    static long af(int i, int i2, int i3, byte b) {
        return (long) (((i3 << 16) | (i << 8)) | i2);
    }

    protected lf() {
        try {
            this.rh = 0;
            this.rl = 0;
            this.rq = true;
            this.rs = false;
            this.re = new gn();
            this.rp = new HashMap();
            kz kzVar = new kz(250);
            av.aj = new eh();
        } catch (Throwable e) {
            throw ba.ad(e, "lf.<init>(" + ')');
        }
    }

    public final mw ty(int i) {
        try {
            return hu.rd;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.ty(" + ')');
        }
    }

    public final mw vj() {
        return hu.rd;
    }

    public final void tz(mw mwVar, int i) {
        try {
            hu.rd = mwVar;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.tz(" + ')');
        }
    }

    public final void vb(mw mwVar) {
        hu.rd = mwVar;
    }

    public final void vc(mw mwVar) {
        hu.rd = mwVar;
    }

    public final void vm(mw mwVar) {
        hu.rd = mwVar;
    }

    public final void vs(mw mwVar) {
        hu.rd = mwVar;
    }

    public final int tj(byte b) {
        try {
            float an = hu.rd.an(1622030489);
            if (an < 0.0f) {
                return -1;
            }
            return (int) (an * ((float) (1616559063 * af.ru)));
        } catch (Throwable e) {
            throw ba.ad(e, "lf.tj(" + ')');
        }
    }

    public final int vl() {
        float an = hu.rd.an(1722075199);
        return an < 0.0f ? -1 : (int) (an * ((float) (1616559063 * af.ru)));
    }

    public final int wj() {
        float an = hu.rd.an(2004641780);
        if (an < 0.0f) {
            return -1;
        }
        return (int) (an * ((float) (1616559063 * af.ru)));
    }

    public final int wo() {
        float an = hu.rd.an(1648714911);
        if (an < 0.0f) {
            return -1;
        }
        return (int) (an * ((float) (1616559063 * af.ru)));
    }

    protected final void ur(int i, int i2, byte b) {
        try {
            if (!(i == 1356335931 * this.rb && 708882149 * this.rj == i2)) {
                vg((byte) -36);
            }
            this.rb = -554920461 * i;
            this.rj = -705798419 * i2;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.ur(" + ')');
        }
    }

    protected final void wp(int i, int i2) {
        if (!(i == 113180354 * this.rb && -1672960087 * this.rj == i2)) {
            vg((byte) -51);
        }
        this.rb = -1614718159 * i;
        this.rj = -705798419 * i2;
    }

    protected final void wq(int i, int i2) {
        if (!(i == 1356335931 * this.rb && 708882149 * this.rj == i2)) {
            vg((byte) -71);
        }
        this.rb = -554920461 * i;
        this.rj = -705798419 * i2;
    }

    protected ls uz(int i) {
        try {
            if (this.rn == null) {
                this.rn = new ld();
            }
            return this.rn;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.uz(" + ')');
        }
    }

    protected ls wr() {
        if (this.rn == null) {
            this.rn = new ld();
        }
        return this.rn;
    }

    protected ls wy() {
        if (this.rn == null) {
            this.rn = new ld();
        }
        return this.rn;
    }

    protected ch uu(int i) {
        try {
            return this.ry.an(-914536586);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.uu(" + ')');
        }
    }

    protected ch wc() {
        return this.ry.an(-914536586);
    }

    protected ch wg() {
        return this.ry.an(-914536586);
    }

    protected ch wv() {
        return this.ry.an(-914536586);
    }

    protected void uc(int i) {
    }

    protected void wh() {
    }

    protected void ws() {
    }

    protected void ua(String str, int i) {
    }

    protected void we(String str) {
    }

    protected void wu(String str) {
    }

    protected final void ui(int i) {
    }

    protected final void wf() {
    }

    protected final void wl() {
    }

    protected final void ul(int i) {
    }

    protected final void wm() {
    }

    protected final void wn() {
    }

    protected final void wt() {
    }

    final void uo(int i) {
        try {
            mk vn = vn(-148212989);
            this.qe = Math.max(vn.an * 1292316989, this.rr * 23309685) * -1841386785;
            this.ri = Math.max(vn.aa * 1953141137, -728648867 * this.rv) * 1423661363;
            if (this.qe * -645951201 <= 0) {
                this.qe = -1841386785;
            }
            if (this.ri * -1115665925 <= 0) {
                this.ri = 1423661363;
            }
            ds.rg = Math.min(this.qe * -645951201, 1356335931 * this.rb) * 689826357;
            af.ru = Math.min(this.ri * -1115665925, 708882149 * this.rj) * -1908709401;
            this.rh = (((this.qe * -645951201) - (ds.rg * -1946576867)) / 2) * 106331953;
            this.rl = 0;
            if (this.ry == null) {
                this.ry = new lc(ds.rg * -1946576867, 1616559063 * af.ru);
            } else {
                this.ry.aa(ds.rg * -1946576867, 1616559063 * af.ru, -618531888);
            }
            this.rq = true;
            cs((byte) 5);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.uo(" + ')');
        }
    }

    final void wk() {
        mk vn = vn(700339600);
        this.qe = Math.max(vn.an * 1292316989, this.rr * 690849766) * -1841386785;
        this.ri = Math.max(vn.aa * 1953141137, 1390393804 * this.rv) * 1423661363;
        if (236402926 * this.qe <= 0) {
            this.qe = -1329679451;
        }
        if (this.ri * -1115665925 <= 0) {
            this.ri = 1423661363;
        }
        ds.rg = Math.min(this.qe * 1294379937, 1356335931 * this.rb) * 689826357;
        af.ru = Math.min(this.ri * -1115665925, -2052106030 * this.rj) * -744765313;
        this.rh = (((this.qe * -645951201) - (ds.rg * 2052931438)) / 2) * 106331953;
        this.rl = 0;
        if (this.ry == null) {
            this.ry = new lc(ds.rg * -1946576867, 1616559063 * af.ru);
        } else {
            this.ry.aa(ds.rg * -1946576867, 1107996785 * af.ru, 126879888);
        }
        this.rq = true;
        cs((byte) 5);
    }

    void uk(byte b) {
        try {
            int i = this.rh * 478443985;
            int i2 = 1432745817 * this.rl;
            int i3 = ((-645951201 * this.qe) - (-1946576867 * ds.rg)) - i;
            int i4 = ((this.ri * -1115665925) - (1616559063 * af.ru)) - i2;
            if (i <= 0 && i3 <= 0 && i2 <= 0 && i4 <= 0) {
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.uk(" + ')');
        }
    }

    void wb() {
        int i = this.rh * 478443985;
        int i2 = 1432745817 * this.rl;
        int i3 = ((-645951201 * this.qe) - (1694771131 * ds.rg)) - i;
        int i4 = ((this.ri * -1115665925) - (-1216189998 * af.ru)) - i2;
        if (i <= 0 && i3 <= 0 && i2 <= 0 && i4 <= 0) {
        }
    }

    void wi() {
        int i = this.rh * 478443985;
        int i2 = 1432745817 * this.rl;
        int i3 = ((-645951201 * this.qe) - (-1946576867 * ds.rg)) - i;
        int i4 = ((this.ri * -1115665925) - (1616559063 * af.ru)) - i2;
        if (i <= 0 && i3 <= 0 && i2 <= 0 && i4 <= 0) {
        }
    }

    void wx() {
        int i = this.rh * 478443985;
        int i2 = 1432745817 * this.rl;
        int i3 = ((-645951201 * this.qe) - (-1946576867 * ds.rg)) - i;
        int i4 = ((this.ri * -1115665925) - (1616559063 * af.ru)) - i2;
        if (i <= 0 && i3 <= 0 && i2 <= 0 && i4 <= 0) {
        }
    }

    final void ud(int i, int i2, int i3, int i4, int i5, byte b) {
        try {
            String property;
            Thread.currentThread().setName("NXT");
            qg = this;
            ds.rg = 689826357 * i;
            af.ru = -1908709401 * i2;
            this.rr = 578026205 * i;
            this.rv = -596690699 * i2;
            mq.an = -2026845921 * i5;
            this.rf = ic.af((byte) -100);
            ae.qs = new mj();
            ae.qs.aa(this, 1, (byte) 27);
            try {
                property = System.getProperty("os.name");
            } catch (Exception e) {
                property = "Unknown";
            }
            ir.rc = property.toLowerCase();
        } catch (Throwable e2) {
            try {
                ah.af(null, e2, (short) 14470);
            } catch (Throwable e22) {
                throw ba.ad(e22, "lf.ud(" + ')');
            }
        }
    }

    final void ww(int i, int i2, int i3, int i4, int i5) {
        try {
            String property;
            Thread.currentThread().setName("NXT");
            qg = this;
            ds.rg = 689826357 * i;
            af.ru = -1908709401 * i2;
            this.rr = 578026205 * i;
            this.rv = -596690699 * i2;
            mq.an = -2026845921 * i5;
            this.rf = ic.af((byte) -16);
            ae.qs = new mj();
            ae.qs.aa(this, 1, (byte) 46);
            try {
                property = System.getProperty("os.name");
            } catch (Exception e) {
                property = "Unknown";
            }
            ir.rc = property.toLowerCase();
        } catch (Throwable e2) {
            ah.af(null, e2, (short) -1443);
        }
    }

    final void wz(int i, int i2, int i3, int i4, int i5) {
        try {
            String property;
            Thread.currentThread().setName("NXT");
            qg = this;
            ds.rg = 689826357 * i;
            af.ru = -1908709401 * i2;
            this.rr = 578026205 * i;
            this.rv = -596690699 * i2;
            mq.an = -2026845921 * i5;
            this.rf = ic.af((byte) -96);
            ae.qs = new mj();
            ae.qs.aa(this, 1, (byte) 11);
            try {
                property = System.getProperty("os.name");
            } catch (Exception e) {
                property = "Unknown";
            }
            ir.rc = property.toLowerCase();
        } catch (Throwable e2) {
            ah.af(null, e2, (short) -9991);
        }
    }

    protected final void uh(int i, int i2, int i3, short s) {
        try {
            ud(i, i2, 0, 0, i3, (byte) 22);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.uh(" + ')');
        }
    }

    protected final void wa(int i, int i2, int i3) {
        ud(i, i2, 0, 0, i3, (byte) -91);
    }

    protected final void wd(int i, int i2, int i3) {
        ud(i, i2, 0, 0, i3, (byte) 25);
    }

    protected final void xb(int i, int i2, int i3) {
        ud(i, i2, 0, 0, i3, (byte) 8);
    }

    public final void un(int i) {
        try {
            ug(1515757203);
            long af = hu.af(262637159) / 1000;
            while (zv.va()) {
                long af2 = hu.af(1116874138) / 1000;
                if (af2 == af) {
                    af2 = af;
                }
                ub(2007729973);
                af = af2;
            }
            ue(2126450583);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.un(" + ')');
        }
    }

    public final void xa() {
        ug(1655467285);
        long af = hu.af(32198694) / 1000;
        while (zv.va()) {
            long af2 = hu.af(246402009) / 1000;
            if (af2 != af) {
                af = af2;
            }
            ub(2076218671);
        }
        ue(808593116);
    }

    public final void xh() {
        ug(1186789517);
        long af = hu.af(463171823) / 1000;
        while (zv.va()) {
            long af2 = hu.af(1542531289) / 1000;
            if (af2 != af) {
                af = af2;
            }
            ub(1890148500);
        }
        ue(1407304057);
    }

    public final void xj() {
        ug(667286836);
        long af = hu.af(1439744199) / 1000;
        while (zv.va()) {
            long af2 = hu.af(695223558) / 1000;
            if (af2 != af) {
                af = af2;
            }
            ub(1875939378);
        }
        ue(1272840975);
    }

    public final void xq() {
        ug(-778353750);
        long af = hu.af(1527939759) / 1000;
        while (zv.va()) {
            long af2 = hu.af(1508727007) / 1000;
            if (af2 != af) {
                af = af2;
            }
            ub(1791478450);
        }
        ue(1446981610);
    }

    final void ug(int i) {
        try {
            this.rf.aa(774825143);
            if (af.at((byte) 1)) {
                System.out.println("Audio renderer successfully started");
            } else {
                System.out.println("Audio renderer FAILED to start");
            }
            this.qk = zv.xm() * 1846390701;
            this.qo = af.ag(-1400296303) * 431755541;
            this.qy = ((float) (this.qk * 1847561253)) / ((float) (this.qo * -694176195));
        } catch (Throwable e) {
            throw ba.ad(e, "lf.ug(" + ')');
        }
    }

    final void xg() {
        this.rf.aa(896463852);
        if (af.at((byte) 1)) {
            System.out.println("Audio renderer successfully started");
        } else {
            System.out.println("Audio renderer FAILED to start");
        }
        this.qk = zv.xm() * 1846390701;
        this.qo = af.ag(-2043174795) * 431755541;
        this.qy = ((float) (this.qk * 1847561253)) / ((float) (this.qo * -694176195));
    }

    final void xk() {
        this.rf.aa(1586709007);
        if (af.at((byte) 1)) {
            System.out.println("Audio renderer successfully started");
        } else {
            System.out.println("Audio renderer FAILED to start");
        }
        this.qk = zv.xm() * 1846390701;
        this.qo = af.ag(-1134350766) * 431755541;
        this.qy = ((float) (this.qk * 1847561253)) / ((float) (this.qo * -694176195));
    }

    final void xn() {
        this.rf.aa(1019218257);
        if (af.at((byte) 1)) {
            System.out.println("Audio renderer successfully started");
        } else {
            System.out.println("Audio renderer FAILED to start");
        }
        this.qk = zv.xm() * 1846390701;
        this.qo = af.ag(-1862269559) * 431755541;
        this.qy = ((float) (this.qk * 1847561253)) / ((float) (this.qo * -694176195));
    }

    final void ub(int i) {
        try {
            this.rf.ak((byte) -37);
            uy(-369021911);
            ut(-1090453124);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.ub(" + ')');
        }
    }

    final void xi() {
        this.rf.ak((byte) -5);
        uy(1057799298);
        ut(-1090453124);
    }

    final void xp() {
        this.rf.ak((byte) -92);
        uy(1879960066);
        ut(-1090453124);
    }

    final void ue(int i) {
        try {
            vy(-946140612);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.ue(" + ')');
        }
    }

    final void xu() {
        vy(-1194887991);
    }

    final void xv() {
        vy(-504440290);
    }

    public final gn uq(int i) {
        try {
            return this.re;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.uq(" + ')');
        }
    }

    public final gn xt() {
        return this.re;
    }

    public final void uv(go goVar, byte b) {
        try {
            this.re.af(goVar, (byte) 1);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.uv(" + ')');
        }
    }

    public final void xl(go goVar) {
        this.re.af(goVar, (byte) 1);
    }

    public final void xm(go goVar) {
        this.re.af(goVar, (byte) 1);
    }

    public final void xw(go goVar) {
        this.re.af(goVar, (byte) 1);
    }

    public final void xy(go goVar) {
        this.re.af(goVar, (byte) 1);
    }

    public final void uj(boolean z, int i) {
        try {
            this.rf.ah(z, 804240950);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.uj(" + ')');
        }
    }

    public final void xf(boolean z) {
        this.rf.ah(z, 830978210);
    }

    public final void xx(boolean z) {
        this.rf.ah(z, 1024849472);
    }

    void uy(int i) {
        try {
            int[] aa = af.aa(-1968053094);
            for (int i2 = 0; i2 < aa.length / 2; i2++) {
                int i3 = aa[i2 * 2];
                int i4 = aa[(i2 * 2) + 1];
                long af = hu.af(914880227);
                i4 = hu.rd.ad(i4, -434942487);
                if (i4 >= 0) {
                    switch (i3) {
                        case 0:
                            this.re.ay(i4, af);
                            break;
                        case 1:
                            this.re.as(i4, af);
                            break;
                        case 2:
                            this.re.ar((char) i4, af);
                            break;
                        default:
                            continue;
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.uy(" + ')');
        }
    }

    void xc() {
        int[] aa = af.aa(-1717061068);
        for (int i = 0; i < aa.length / 2; i++) {
            int i2 = aa[i * 2];
            int i3 = aa[(i * 2) + 1];
            long af = hu.af(547825075);
            i3 = hu.rd.ad(i3, -1120379554);
            if (i3 >= 0) {
                switch (i2) {
                    case 0:
                        this.re.ay(i3, af);
                        break;
                    case 1:
                        this.re.as(i3, af);
                        break;
                    case 2:
                        this.re.ar((char) i3, af);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    void xo() {
        int[] aa = af.aa(-1865727486);
        for (int i = 0; i < aa.length / 2; i++) {
            int i2 = aa[i * 2];
            int i3 = aa[(i * 2) + 1];
            long af = hu.af(1147360553);
            i3 = hu.rd.ad(i3, 1106951409);
            if (i3 >= 0) {
                switch (i2) {
                    case 0:
                        this.re.ay(i3, af);
                        break;
                    case 1:
                        this.re.as(i3, af);
                        break;
                    case 2:
                        this.re.ar((char) i3, af);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    void xr() {
        int[] aa = af.aa(-1978260132);
        for (int i = 0; i < aa.length / 2; i++) {
            int i2 = aa[i * 2];
            int i3 = aa[(i * 2) + 1];
            long af = hu.af(369547512);
            i3 = hu.rd.ad(i3, 1518791939);
            if (i3 >= 0) {
                switch (i2) {
                    case 0:
                        this.re.ay(i3, af);
                        break;
                    case 1:
                        this.re.as(i3, af);
                        break;
                    case 2:
                        this.re.ar((char) i3, af);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    void ut(int i) {
        try {
            int[] xl = zv.xl();
            for (int i2 = 0; i2 < xl.length; i2 += 4) {
                int i3 = xl[i2 + 0];
                int i4 = xl[i2 + 1];
                int i5 = xl[i2 + 2];
                int i6 = xl[i2 + 3];
                long af = hu.af(606621179);
                int i7 = (i5 * (-1946576867 * ds.rg)) / (this.qk * 1847561253);
                i6 = ((1616559063 * af.ru) * i6) / (this.qo * -694176195);
                switch (i3) {
                    case 0:
                        this.re.aj(i4, 0, i7, i6, af);
                        break;
                    case 1:
                        this.re.ae(i4, 0, i7, i6, af);
                        break;
                    case 2:
                        this.re.aq(i4, i7, i6, af);
                        break;
                    case 3:
                        this.re.ae(i4, 0, i7, i6, af);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.ut(" + ')');
        }
    }

    void xd() {
        int[] xl = zv.xl();
        for (int i = 0; i < xl.length; i += 4) {
            int i2 = xl[i + 0];
            int i3 = xl[i + 1];
            int i4 = xl[i + 2];
            int i5 = xl[i + 3];
            long af = hu.af(1586897579);
            i4 = (i4 * (552257860 * ds.rg)) / (this.qk * 1847561253);
            i5 = (i5 * (1616559063 * af.ru)) / (this.qo * -694176195);
            switch (i2) {
                case 0:
                    this.re.aj(i3, 0, i4, i5, af);
                    break;
                case 1:
                    this.re.ae(i3, 0, i4, i5, af);
                    break;
                case 2:
                    this.re.aq(i3, i4, i5, af);
                    break;
                case 3:
                    this.re.ae(i3, 0, i4, i5, af);
                    break;
                default:
                    break;
            }
        }
    }

    protected boolean uf(int i) {
        return true;
    }

    protected boolean xe() {
        return true;
    }

    protected boolean xs() {
        return true;
    }

    protected boolean xz() {
        return true;
    }

    protected boolean ym() {
        return true;
    }

    protected URL um(int i) {
        try {
            return this.rt;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.um(" + ')');
        }
    }

    protected URL yd() {
        return this.rt;
    }

    protected URL yg() {
        return this.rt;
    }

    protected URL yo() {
        return this.rt;
    }

    protected URL ys() {
        return this.rt;
    }

    boolean ux(String str, int i) {
        try {
            this.rt = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            try {
                e.printStackTrace();
                return false;
            } catch (Throwable e2) {
                throw ba.ad(e2, "lf.ux(" + ')');
            }
        }
    }

    boolean yi(String str) {
        try {
            this.rt = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

    boolean yx(String str) {
        try {
            this.rt = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

    void up(int i, String str, int i2) {
        try {
            this.rp.put(Integer.toString(i), str);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.up(" + ')');
        }
    }

    void ye(int i, String str) {
        this.rp.put(Integer.toString(i), str);
    }

    void yl(int i, String str) {
        this.rp.put(Integer.toString(i), str);
    }

    void yn(int i, String str) {
        this.rp.put(Integer.toString(i), str);
    }

    void yr(int i, String str) {
        this.rp.put(Integer.toString(i), str);
    }

    protected String us(String str, byte b) {
        try {
            return (String) this.rp.get(str);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.us(" + ')');
        }
    }

    protected String yh(String str) {
        return (String) this.rp.get(str);
    }

    protected String yq(String str) {
        return (String) this.rp.get(str);
    }

    protected String yv(String str) {
        return (String) this.rp.get(str);
    }

    protected int uw(byte b) {
        return 0;
    }

    protected int ya() {
        return 0;
    }

    protected int yu() {
        return 0;
    }

    public void vf(lg lgVar, int i) {
        try {
            this.ro = lgVar;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vf(" + ')');
        }
    }

    public void bo() {
        try {
            int i;
            if (vx(935462289)) {
                mq.af = um(1271312872);
                try {
                    aj((byte) 1);
                    am(-849052230);
                    this.ry = new lc(-1946576867 * ds.rg, 492258448 * af.ru);
                    bk.qm = new mm();
                    long j = 0;
                    while (true) {
                        if (0 != -4735150349178294803L * qu && hu.af(642229339) >= qu * -4735150349178294803L) {
                            break;
                        }
                        long nanoTime = System.nanoTime();
                        long j2 = nanoTime / (763677499859897445L * qq);
                        ha.qn = Math.min((int) (j2 - j), 10) * -1839067853;
                        for (i = 0; i < ha.qn * -279398917; i++) {
                            va((byte) 1);
                        }
                        he.qz = hu.af(12391644) * 6587033402505504557L;
                        vq(((float) (nanoTime - ((763677499859897445L * qq) * j2))) / ((float) (763677499859897445L * qq)), 954891272);
                        j = j2;
                    }
                    vk(-1296489082);
                } catch (Exception e) {
                    while (true) {
                        qj -= 2028256629;
                        ck(0, 183489761);
                        cu.af(100);
                        vw(1607989503);
                        if (this.ry != null) {
                            vr(1540413476);
                        }
                        if (20 == 352425251 * qj) {
                            hu.rd.aq(661629519);
                        }
                    }
                }
            } else {
                for (i = 0; i < 50; i++) {
                    ck(0, 1942323044);
                    cu.af(100);
                    vw(1892931251);
                    if (this.ry != null) {
                        vt(((((50 - i) - 1) * -1075392177) / 1000) + 1, (byte) 111);
                    }
                }
                this.ro = new lg(this.ro.ay(-1420394124));
                ae.qs.aa(this, 1, (byte) 39);
            }
        } catch (Throwable e2) {
            ah.af(null, e2, (short) -3749);
            vp(mv.af, (short) -14503);
        }
    }

    public void ci() {
        try {
            int i;
            if (vx(-1823699225)) {
                mq.af = um(1145352935);
                try {
                    aj((byte) 1);
                    am(-719447806);
                    this.ry = new lc(-1946576867 * ds.rg, 1616559063 * af.ru);
                    bk.qm = new mm();
                    long j = 0;
                    while (true) {
                        if (0 != -4735150349178294803L * qu && hu.af(810632611) >= qu * -4735150349178294803L) {
                            break;
                        }
                        long nanoTime = System.nanoTime();
                        long j2 = nanoTime / (763677499859897445L * qq);
                        ha.qn = Math.min((int) (j2 - j), 10) * -1839067853;
                        for (i = 0; i < ha.qn * -279398917; i++) {
                            va((byte) 1);
                        }
                        he.qz = hu.af(316614657) * 6587033402505504557L;
                        vq(((float) (nanoTime - ((763677499859897445L * qq) * j2))) / ((float) (763677499859897445L * qq)), 264447432);
                        j = j2;
                    }
                    vk(-1417527902);
                } catch (Exception e) {
                    while (true) {
                        qj -= 2028256629;
                        ck(0, -669279648);
                        cu.af(100);
                        vw(1156595072);
                        if (this.ry != null) {
                            vr(938655973);
                        }
                        if (20 == 352425251 * qj) {
                            hu.rd.aq(-378514261);
                        }
                    }
                }
            } else {
                for (i = 0; i < 50; i++) {
                    ck(0, 1791816430);
                    cu.af(100);
                    vw(1377995026);
                    if (this.ry != null) {
                        vt(((((50 - i) - 1) * 100) / 1000) + 1, (byte) 92);
                    }
                }
                this.ro = new lg(this.ro.ay(1618260995));
                ae.qs.aa(this, 1, (byte) -40);
            }
        } catch (Throwable e2) {
            ah.af(null, e2, (short) -3822);
            vp(mv.af, (short) -9097);
        }
    }

    public void cv() {
        try {
            int i;
            if (vx(-1398090135)) {
                mq.af = um(1573103547);
                try {
                    aj((byte) 1);
                    am(116203923);
                    this.ry = new lc(-1946576867 * ds.rg, 1616559063 * af.ru);
                    bk.qm = new mm();
                    long j = 0;
                    while (true) {
                        if (0 != -4735150349178294803L * qu && hu.af(862926948) >= qu * -4735150349178294803L) {
                            break;
                        }
                        long nanoTime = System.nanoTime();
                        long j2 = nanoTime / (763677499859897445L * qq);
                        ha.qn = Math.min((int) (j2 - j), 10) * -1839067853;
                        for (i = 0; i < ha.qn * -279398917; i++) {
                            va((byte) 1);
                        }
                        he.qz = hu.af(626651870) * 6587033402505504557L;
                        vq(((float) (nanoTime - ((763677499859897445L * qq) * j2))) / ((float) (763677499859897445L * qq)), -1161439054);
                        j = j2;
                    }
                    vk(-1232856752);
                } catch (Exception e) {
                    while (true) {
                        qj -= 2028256629;
                        ck(0, 883262841);
                        cu.af(100);
                        vw(788788976);
                        if (this.ry != null) {
                            vr(1916298678);
                        }
                        if (20 == 352425251 * qj) {
                            hu.rd.aq(-240642475);
                        }
                    }
                }
            } else {
                for (i = 0; i < 50; i++) {
                    ck(0, 277632857);
                    cu.af(100);
                    vw(1039529000);
                    if (this.ry != null) {
                        vt(((((50 - i) - 1) * 100) / 1000) + 1, (byte) 93);
                    }
                }
                this.ro = new lg(this.ro.ay(-257492480));
                ae.qs.aa(this, 1, (byte) 38);
            }
        } catch (Throwable e2) {
            ah.af(null, e2, (short) 19236);
            vp(mv.af, (short) -20310);
        }
    }

    public void run() {
        try {
            int i;
            if (vx(219623129)) {
                mq.af = um(1609460920);
                try {
                    aj((byte) 1);
                    am(-1528288487);
                    this.ry = new lc(-1946576867 * ds.rg, 1616559063 * af.ru);
                    bk.qm = new mm();
                    long j = 0;
                    while (true) {
                        if (0 != -4735150349178294803L * qu && hu.af(1520664716) >= qu * -4735150349178294803L) {
                            break;
                        }
                        long nanoTime = System.nanoTime();
                        long j2 = nanoTime / (763677499859897445L * qq);
                        ha.qn = Math.min((int) (j2 - j), 10) * -1839067853;
                        for (i = 0; i < ha.qn * -279398917; i++) {
                            va((byte) 1);
                        }
                        he.qz = hu.af(442460070) * 6587033402505504557L;
                        vq(((float) (nanoTime - ((763677499859897445L * qq) * j2))) / ((float) (763677499859897445L * qq)), -2029019196);
                        j = j2;
                    }
                    vk(-1154183421);
                } catch (Exception e) {
                    while (true) {
                        qj -= 2028256629;
                        ck(0, -654393126);
                        cu.af(100);
                        vw(154985990);
                        if (this.ry != null) {
                            vr(919405106);
                        }
                        if (20 == 352425251 * qj) {
                            hu.rd.aq(-296772993);
                        }
                    }
                }
            } else {
                for (i = 0; i < 50; i++) {
                    ck(0, 1635105070);
                    cu.af(100);
                    vw(1396393246);
                    if (this.ry != null) {
                        vt(((((50 - i) - 1) * 100) / 1000) + 1, (byte) 107);
                    }
                }
                this.ro = new lg(this.ro.ay(58524942));
                ae.qs.aa(this, 1, (byte) -90);
            }
        } catch (Throwable e2) {
            try {
                ah.af(null, e2, (short) 6444);
                vp(mv.af, (short) 13319);
            } catch (Throwable e22) {
                throw ba.ad(e22, "lf.run(" + ')');
            }
        }
    }

    void va(byte b) {
        try {
            long af = hu.af(176093406);
            long j = qr[cg.qd * -2017410969];
            qr[cg.qd * -2017410969] = af;
            cg.qd = (((cg.qd * -2017410969) + 1) & 31) * -2049549481;
            if (j == 0 || af > j) {
                vh(777886274);
                at(-54809881);
            } else {
                vh(777886274);
                at(-54809881);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.va(" + ')');
        }
    }

    void yb() {
        long af = hu.af(396181380);
        long j = qr[cg.qd * -2017410969];
        qr[cg.qd * -2017410969] = af;
        cg.qd = (((cg.qd * -2017410969) + 1) & 31) * -2049549481;
        if (j == 0 || af > j) {
            vh(1198119345);
            at(-206753260);
        } else {
            vh(1198119345);
            at(-206753260);
        }
    }

    void yp() {
        long af = hu.af(1882973481);
        long j = qr[cg.qd * -2017410969];
        qr[cg.qd * -2017410969] = af;
        cg.qd = (((cg.qd * -2017410969) + 1) & 31) * -2049549481;
        if (j == 0 || af > j) {
            vh(553897689);
            at(1163351607);
        } else {
            vh(553897689);
            at(1163351607);
        }
    }

    synchronized void vh(int i) {
        try {
            jp.ra = rk;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vh(" + ')');
        }
    }

    synchronized void yf() {
        jp.ra = rk;
    }

    synchronized void yw() {
        jp.ra = rk;
    }

    void vq(float f, int i) {
        try {
            int i2;
            long af = hu.af(1751247630);
            long j = qc[jp.qa * 342504941];
            qc[jp.qa * 342504941] = af;
            jp.qa = (((jp.qa * 342504941) + 1) & 31) * -1165201435;
            if (0 != j && af > j) {
                i2 = (int) (af - j);
                qv = (((i2 >> 1) + 32000) / i2) * -584279303;
            }
            i2 = rw - 710386515;
            rw = i2;
            if ((i2 * 436561701) - 1 > 50) {
                rw -= -1159587382;
                this.rq = true;
            }
            vw(976803265);
            ab(this.rq, f, -1054550131);
            if (this.rq) {
                uk((byte) -27);
            }
            this.rq = false;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vq(" + ')');
        }
    }

    void yt(float f) {
        int i;
        long af = hu.af(2058886240);
        long j = qc[-865717317 * jp.qa];
        qc[jp.qa * 855961926] = af;
        jp.qa = (((jp.qa * 270886022) + 1) & 31) * 719244398;
        if (0 != j && af > j) {
            i = (int) (af - j);
            qv = (((i >> 1) + 32000) / i) * -584279303;
        }
        i = rw - 1972049166;
        rw = i;
        if ((i * 275031472) - 1 > -184260937) {
            rw -= -1159587382;
            this.rq = true;
        }
        vw(1186973530);
        ab(this.rq, f, 458733764);
        if (this.rq) {
            uk((byte) 104);
        }
        this.rq = false;
    }

    void yz(float f) {
        int i;
        long af = hu.af(1197264965);
        long j = qc[jp.qa * 342504941];
        qc[jp.qa * 342504941] = af;
        jp.qa = (((jp.qa * -476281583) + 1) & 31) * 790551881;
        if (0 != j && af > j) {
            i = (int) (af - j);
            qv = (((i >> 1) + 32000) / i) * -584279303;
        }
        i = rw - 213851130;
        rw = i;
        if ((i * -966633832) - 1 > 50) {
            rw -= -1159587382;
            this.rq = true;
        }
        vw(662114773);
        ab(this.rq, f, 573808356);
        if (this.rq) {
            uk((byte) 53);
        }
        this.rq = false;
    }

    final void vw(int i) {
        try {
            mk vn = vn(-178715731);
            if (vn.an * 1292316989 != this.qk * 1847561253 || this.qo * -694176195 != vn.aa * 1953141137 || this.rs) {
                uo(102522052);
                this.rs = false;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vw(" + ')');
        }
    }

    final void yc() {
        mk vn = vn(-332171669);
        if (vn.an * 1292316989 != this.qk * 1847561253 || this.qo * -694176195 != vn.aa * 1953141137 || this.rs) {
            uo(135632586);
            this.rs = false;
        }
    }

    final void yj() {
        mk vn = vn(-1019622458);
        if (vn.an * 1292316989 != this.qk * 1847561253 || this.qo * -694176195 != vn.aa * -108144348 || this.rs) {
            uo(-69072838);
            this.rs = false;
        }
    }

    final void yk() {
        mk vn = vn(-366708751);
        if (vn.an * 1292316989 != this.qk * 1847561253 || this.qo * -694176195 != vn.aa * 1953141137 || this.rs) {
            uo(1072023875);
            this.rs = false;
        }
    }

    final void yy() {
        mk vn = vn(1273326393);
        if (vn.an * 1292316989 != this.qk * 1847561253 || this.qo * -694176195 != vn.aa * 1953141137 || this.rs) {
            uo(-368963360);
            this.rs = false;
        }
    }

    final void ze() {
        mk vn = vn(-21488692);
        if (vn.an * -1082392279 != this.qk * 1847561253 || this.qo * -694176195 != vn.aa * 1953141137 || this.rs) {
            uo(-898575659);
            this.rs = false;
        }
    }

    final void vg(byte b) {
        try {
            this.rs = true;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vg(" + ')');
        }
    }

    final void zi() {
        this.rs = true;
    }

    final void zn() {
        this.rs = true;
    }

    final void zo() {
        this.rs = true;
    }

    final synchronized void vk(int i) {
        try {
            if (!qh) {
                qh = true;
                try {
                    aw(1411349724);
                } catch (Exception e) {
                }
                if (ae.qs != null) {
                    try {
                        ae.qs.af(1990786353);
                    } catch (Exception e2) {
                    }
                }
                ay(1975423279);
            }
        } catch (Throwable e3) {
            throw ba.ad(e3, "lf.vk(" + ')');
        }
    }

    final synchronized void zh() {
        if (!qh) {
            qh = true;
            try {
                aw(1998974288);
            } catch (Exception e) {
            }
            if (ae.qs != null) {
                try {
                    ae.qs.af(2020280271);
                } catch (Exception e2) {
                }
            }
            ay(1975423279);
        }
    }

    final synchronized void zl() {
        if (!qh) {
            qh = true;
            try {
                aw(-720066931);
            } catch (Exception e) {
            }
            if (ae.qs != null) {
                try {
                    ae.qs.af(2088649982);
                } catch (Exception e2) {
                }
            }
            ay(1975423279);
        }
    }

    final synchronized void zq() {
        if (!qh) {
            qh = true;
            try {
                aw(1527622086);
            } catch (Exception e) {
            }
            if (ae.qs != null) {
                try {
                    ae.qs.af(2143670512);
                } catch (Exception e2) {
                }
            }
            ay(1975423279);
        }
    }

    final synchronized void zr() {
        if (!qh) {
            qh = true;
            try {
                aw(-2130475660);
            } catch (Exception e) {
            }
            if (ae.qs != null) {
                try {
                    ae.qs.af(2039426750);
                } catch (Exception e2) {
                }
            }
            ay(1975423279);
        }
    }

    final void vy(int i) {
        try {
            if (this == qg && !qh) {
                qu = hu.af(2054251941) * -5385333503565219867L;
                cu.af(5000);
                vk(-1757114830);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vy(" + ')');
        }
    }

    final void zm() {
        if (this == qg && !qh) {
            qu = hu.af(1908779598) * -5385333503565219867L;
            cu.af(5000);
            vk(-628818922);
        }
    }

    final void zv() {
        if (this == qg && !qh) {
            qu = hu.af(1114526372) * -5385333503565219867L;
            cu.af(5000);
            vk(-670619900);
        }
    }

    boolean vx(int i) {
        while (!this.ro.af(0, -1782358842)) {
            try {
                cu.af(10);
            } catch (Throwable e) {
                throw ba.ad(e, "lf.vx(" + ')');
            }
        }
        for (Entry entry : this.ro.ag((byte) 1).ad.entrySet()) {
            up(Integer.parseInt((String) entry.getKey()), (String) entry.getValue(), -1446047214);
        }
        String str = (String) this.ro.ag((byte) 1).af.get("codebase");
        if (str == null) {
            return false;
        }
        return ux(str, 303292531);
    }

    boolean zb() {
        while (!this.ro.af(0, 114701281)) {
            cu.af(10);
        }
        for (Entry entry : this.ro.ag((byte) 1).ad.entrySet()) {
            up(Integer.parseInt((String) entry.getKey()), (String) entry.getValue(), -2117771650);
        }
        String str = (String) this.ro.ag((byte) 1).af.get("codebase");
        if (str == null) {
            return false;
        }
        return ux(str, 303292531);
    }

    boolean zf() {
        while (!this.ro.af(0, 61688438)) {
            cu.af(10);
        }
        for (Entry entry : this.ro.ag((byte) 1).ad.entrySet()) {
            up(Integer.parseInt((String) entry.getKey()), (String) entry.getValue(), -1990787848);
        }
        String str = (String) this.ro.ag((byte) 1).af.get("codebase");
        if (str == null) {
            return false;
        }
        return ux(str, 303292531);
    }

    protected final boolean vu(boolean z, int i) {
        try {
            jj.rz = (fx) hu.rd.ay(mi.af, -1781167374);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vu(" + ')');
        }
    }

    protected final boolean zc(boolean z) {
        jj.rz = (fx) hu.rd.ay(mi.af, -639558281);
        return true;
    }

    protected final boolean zj(boolean z) {
        jj.rz = (fx) hu.rd.ay(mi.af, -1891622857);
        return true;
    }

    protected final boolean zp(boolean z) {
        jj.rz = (fx) hu.rd.ay(mi.af, 151635402);
        return true;
    }

    protected final boolean zt(boolean z) {
        jj.rz = (fx) hu.rd.ay(mi.af, -1113585609);
        return true;
    }

    protected final boolean zx(boolean z) {
        jj.rz = (fx) hu.rd.ay(mi.af, -847098478);
        return true;
    }

    protected final boolean zy(boolean z) {
        jj.rz = (fx) hu.rd.ay(mi.af, 1310731887);
        return true;
    }

    protected final void vz(int i, String str, boolean z, int i2) {
        try {
            if (ab.rm == null) {
                ab.rm = (lr) hu.rd.ay(mi.ad, -84354507);
            }
            rx.af(i, str, jj.rz, ab.rm, hu.rd.ae(1956694138), this.ry, -1615169107);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vz(" + ')');
        }
    }

    protected final void zd(int i, String str, boolean z) {
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, 1516681352);
        }
        rx.af(i, str, jj.rz, ab.rm, hu.rd.ae(1956694138), this.ry, -74013723);
    }

    protected final void zg(int i, String str, boolean z) {
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, 1550576662);
        }
        rx.af(i, str, jj.rz, ab.rm, hu.rd.ae(1956694138), this.ry, -49680443);
    }

    protected final void zw(int i, String str, boolean z) {
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, -266403780);
        }
        rx.af(i, str, jj.rz, ab.rm, hu.rd.ae(1956694138), this.ry, 1519446761);
    }

    protected final void zz(int i, String str, boolean z) {
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, -553127774);
        }
        rx.af(i, str, jj.rz, ab.rm, hu.rd.ae(1956694138), this.ry, -51781728);
    }

    protected final void vd(byte b) {
    }

    protected final void za() {
    }

    protected final void zk() {
    }

    protected void aab(mv mvVar) {
        if (!vv(-2022635749)) {
            qw = mvVar;
        }
    }

    protected void vp(mv mvVar, short s) {
        try {
            if (!vv(1219124094)) {
                qw = mvVar;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vp(" + ')');
        }
    }

    protected void zs(mv mvVar) {
        if (!vv(992918292)) {
            qw = mvVar;
        }
    }

    protected void zu(mv mvVar) {
        if (!vv(-1928466383)) {
            qw = mvVar;
        }
    }

    protected void aaf() {
        qj -= 2028256629;
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, -5812572);
        }
        if (ab.rm != null) {
            rx.ad(qw, ab.rm, this.ry, this.qy, (byte) -35);
        }
        if (qw == mv.ay && qj * 352425251 == 20) {
            hu.rd.aq(1494815790);
        }
    }

    protected void aak() {
        qj -= 2028256629;
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, -638940759);
        }
        if (ab.rm != null) {
            rx.ad(qw, ab.rm, this.ry, this.qy, (byte) -117);
        }
        if (qw == mv.ay && qj * 352425251 == 20) {
            hu.rd.aq(2862704);
        }
    }

    protected void ve(int i) {
        try {
            qj -= 2028256629;
            if (ab.rm == null) {
                ab.rm = (lr) hu.rd.ay(mi.ad, 1959856153);
            }
            if (ab.rm != null) {
                rx.ad(qw, ab.rm, this.ry, this.qy, (byte) -97);
            }
            if (qw == mv.ay && qj * 352425251 == 20) {
                hu.rd.aq(-715965991);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.ve(" + ')');
        }
    }

    boolean vv(int i) {
        try {
            return qw != null;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vv(" + ')');
        }
    }

    final void aag(int i) {
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, -541434653);
        }
        if (ab.rm != null) {
            rx.an(i, ab.rm, this.ry, this.qy, (byte) 0);
        }
    }

    final void aah(int i) {
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, 662087177);
        }
        if (ab.rm != null) {
            rx.an(i, ab.rm, this.ry, this.qy, (byte) 0);
        }
    }

    final void aax(int i) {
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, 132283468);
        }
        if (ab.rm != null) {
            rx.an(i, ab.rm, this.ry, this.qy, (byte) 0);
        }
    }

    final void vt(int i, byte b) {
        try {
            if (ab.rm == null) {
                ab.rm = (lr) hu.rd.ay(mi.ad, 703630559);
            }
            if (ab.rm != null) {
                rx.an(i, ab.rm, this.ry, this.qy, (byte) 0);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vt(" + ')');
        }
    }

    final void aav() {
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, 1028123446);
        }
        if (ab.rm != null) {
            rx.aa(ab.rm, this.ry, this.qy, (byte) 17);
        }
    }

    final void aay() {
        if (ab.rm == null) {
            ab.rm = (lr) hu.rd.ay(mi.ad, -1535382880);
        }
        if (ab.rm != null) {
            rx.aa(ab.rm, this.ry, this.qy, (byte) 82);
        }
    }

    final void vr(int i) {
        try {
            if (ab.rm == null) {
                ab.rm = (lr) hu.rd.ay(mi.ad, -1482685281);
            }
            if (ab.rm != null) {
                rx.aa(ab.rm, this.ry, this.qy, (byte) 92);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vr(" + ')');
        }
    }

    protected na aaq() {
        return hu.rd;
    }

    protected na aaw() {
        return hu.rd;
    }

    protected na vi(int i) {
        try {
            return hu.rd;
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vi(" + ')');
        }
    }

    mk aam() {
        return new mk(this.qk * 1847561253, this.qo * -694176195);
    }

    mk aao() {
        return new mk(this.qk * 1847561253, this.qo * -694176195);
    }

    mk aar() {
        return new mk(this.qk * 1847561253, this.qo * -694176195);
    }

    mk aat() {
        return new mk(this.qk * 1847561253, this.qo * 1193378181);
    }

    mk aau() {
        return new mk(this.qk * 1847561253, this.qo * -694176195);
    }

    mk vn(int i) {
        try {
            return new mk(this.qk * 1847561253, this.qo * -694176195);
        } catch (Throwable e) {
            throw ba.ad(e, "lf.vn(" + ')');
        }
    }

    protected final boolean aae() {
        return false;
    }

    protected final boolean aap() {
        return false;
    }

    protected final boolean vo(short s) {
        return false;
    }
}
