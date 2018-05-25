package p000;

import com.jagex.oldscape.osrenderer.af;
import com.jagex.oldscape.osrenderer.zv;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

public class bd implements Runnable {
    static bd af = null;
    static final int ar = 3;
    static fx[] eb = null;
    static ac ih = null;
    static final int pq = 4;
    kz aa;
    int[] ab;
    volatile boolean ad;
    SynchronousQueue ae;
    public long ag;
    LinkedList aj;
    int[][] am;
    volatile boolean an;
    int[] aq;
    boolean as;
    int[] at;
    kz aw;
    Object ay;

    public static synchronized bd ao() {
        bd bdVar;
        synchronized (bd.class) {
            if (af == null) {
                af = new bd();
            }
            bdVar = af;
        }
        return bdVar;
    }

    bd() {
        try {
            this.ad = true;
            this.an = true;
            this.aa = new kz(250);
            this.as = false;
            this.aj = new LinkedList();
            this.ae = new SynchronousQueue();
            this.aw = new kz(250);
            if (!af.af) {
                try {
                    if ("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                        System.loadLibrary("osrenderer");
                    } else {
                        System.loadLibrary("windows/x64/OSRenderer");
                    }
                } catch (UnsatisfiedLinkError e) {
                    e.printStackTrace();
                }
                af.af = true;
            }
            ad((byte) 97);
            ag((byte) -4);
        } catch (Throwable e2) {
            throw ba.ad(e2, "bd.<init>(" + ')');
        }
    }

    final void ad(byte b) {
        try {
            an(0.8f, (byte) 1);
        } catch (Throwable e) {
            throw ba.ad(e, "bd.ad(" + ')');
        }
    }

    final void au() {
        an(0.8f, (byte) 1);
    }

    final void av() {
        an(0.8f, (byte) 1);
    }

    final void ax() {
        an(0.8f, (byte) 1);
    }

    void ac(float f) {
        bs.bw(0.800000011920929d);
        this.aq = Arrays.copyOf(bi.at, bi.at.length);
    }

    void al(float f) {
        bs.bw(0.800000011920929d);
        this.aq = Arrays.copyOf(bi.at, bi.at.length);
    }

    void an(float f, byte b) {
        try {
            bs.bw(0.800000011920929d);
            this.aq = Arrays.copyOf(bi.at, bi.at.length);
        } catch (Throwable e) {
            throw ba.ad(e, "bd.an(" + ')');
        }
    }

    void ap(float f) {
        bs.bw(0.800000011920929d);
        this.aq = Arrays.copyOf(bi.at, bi.at.length);
    }

    public final void aa(int i) {
        try {
            zv.xp(null);
            zv.pn();
            this.as = true;
        } catch (Throwable e) {
            throw ba.ad(e, "bd.aa(" + ')');
        }
    }

    public final void bw() {
        zv.xp(null);
        zv.pn();
        this.as = true;
    }

    final void ag(byte b) {
        int i = 0;
        while (i < 3) {
            try {
                this.aj.add(new bt());
                i++;
            } catch (Throwable e) {
                throw ba.ad(e, "bd.ag(" + ')');
            }
        }
    }

    final void bb() {
        for (int i = 0; i < 3; i++) {
            this.aj.add(new bt());
        }
    }

    final void bc() {
        for (int i = 0; i < 3; i++) {
            this.aj.add(new bt());
        }
    }

    final void bz() {
        for (int i = 0; i < 3; i++) {
            this.aj.add(new bt());
        }
    }

    synchronized boolean ay(cy cyVar, int i) {
        boolean z;
        try {
            this.am = cyVar.ad(363909213);
            if (this.am == null) {
                z = false;
            } else {
                this.at = new int[this.am.length];
                this.ab = new int[this.am.length];
                z = true;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bd.ay(" + ')');
        }
        return z;
    }

    void as(cy cyVar, int i) {
        try {
            if (this.at != null) {
                int as = cyVar.as((byte) -15);
                for (int i2 = 0; i2 < as; i2++) {
                    ck af = cyVar.af(i2, (byte) 2);
                    if (af != null) {
                        this.at[i2] = af.at / 2;
                        this.ab[i2] = af.ab / 2;
                    }
                }
                af.as(as, this.at, this.ab, (byte) 36);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bd.as(" + ')');
        }
    }

    void bg(cy cyVar) {
        if (this.at != null) {
            int as = cyVar.as((byte) -109);
            for (int i = 0; i < as; i++) {
                ck af = cyVar.af(i, (byte) 2);
                if (af != null) {
                    this.at[i] = af.at / 2;
                    this.ab[i] = af.ab / 2;
                }
            }
            af.as(as, this.at, this.ab, (byte) 71);
        }
    }

    public bt ar(int i) {
        try {
            return (bt) this.aj.removeFirst();
        } catch (Throwable e) {
            throw ba.ad(e, "bd.ar(" + ')');
        }
    }

    public bt bf() {
        return (bt) this.aj.removeFirst();
    }

    public bt bh() {
        return (bt) this.aj.removeFirst();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.bt aj(p000.bt r5, int r6) {
        /*
        r4 = this;
    L_0x0000:
        r0 = r4.aw;	 Catch:{ InterruptedException -> 0x0037, RuntimeException -> 0x001a }
        r1 = -30;
        r1 = r5.ay(r1);	 Catch:{ InterruptedException -> 0x0037, RuntimeException -> 0x001a }
        r2 = (long) r1;	 Catch:{ InterruptedException -> 0x0037, RuntimeException -> 0x001a }
        r0.af(r2);	 Catch:{ InterruptedException -> 0x0037, RuntimeException -> 0x001a }
        r0 = r4.ae;	 Catch:{ InterruptedException -> 0x0037, RuntimeException -> 0x001a }
        r0.put(r5);	 Catch:{ InterruptedException -> 0x0037, RuntimeException -> 0x001a }
    L_0x0011:
        r0 = r4.ae;	 Catch:{ InterruptedException -> 0x0035, RuntimeException -> 0x001a }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x0035, RuntimeException -> 0x001a }
        r0 = (p000.bt) r0;	 Catch:{ InterruptedException -> 0x0035, RuntimeException -> 0x001a }
        return r0;
    L_0x001a:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "bd.aj(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
    L_0x0035:
        r0 = move-exception;
        goto L_0x0011;
    L_0x0037:
        r0 = move-exception;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.aj(bt, int):bt");
    }

    public final bt bv(bt btVar) {
        while (true) {
            try {
                this.aw.af((long) btVar.ay((byte) -33));
                this.ae.put(btVar);
                break;
            } catch (InterruptedException e) {
            }
        }
        return (bt) this.ae.take();
        while (true) {
            try {
                break;
            } catch (InterruptedException e2) {
            }
        }
        return (bt) this.ae.take();
    }

    final void ae(bt btVar, byte b) {
        try {
            if (this.aj.size() < 3) {
                this.aj.add(btVar);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bd.ae(" + ')');
        }
    }

    final void be(bt btVar) {
        if (this.aj.size() < 3) {
            this.aj.add(btVar);
        }
    }

    final void bp(bt btVar) {
        if (this.aj.size() < 3) {
            this.aj.add(btVar);
        }
    }

    final void bt(bt btVar) {
        if (this.aj.size() < 3) {
            this.aj.add(btVar);
        }
    }

    final void bu(bt btVar) {
        if (this.aj.size() < 3) {
            this.aj.add(btVar);
        }
    }

    final void bx(bt btVar) {
        if (this.aj.size() < 3) {
            this.aj.add(btVar);
        }
    }

    final synchronized Object aq(int i) {
        Object obj = null;
        synchronized (this) {
            try {
                if (this.ay != null) {
                    obj = this.ay;
                    this.ay = null;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "bd.aq(" + ')');
            }
        }
        return obj;
    }

    final synchronized Object bk() {
        Object obj = null;
        synchronized (this) {
            if (this.ay != null) {
                obj = this.ay;
                this.ay = null;
            }
        }
        return obj;
    }

    final bt am(byte b) {
        while (true) {
            try {
                return (bt) this.ae.take();
            } catch (InterruptedException e) {
            } catch (Throwable e2) {
                throw ba.ad(e2, "bd.am(" + ')');
            }
        }
    }

    final bt by() {
        while (true) {
            try {
                break;
            } catch (InterruptedException e) {
            }
        }
        return (bt) this.ae.take();
    }

    final void at(byte b) {
        while (true) {
            try {
                this.ae.put(this.aj.removeFirst());
                return;
            } catch (InterruptedException e) {
            } catch (Throwable e2) {
                throw ba.ad(e2, "bd.at(" + ')');
            }
        }
    }

    final void ba() {
        while (true) {
            try {
                this.ae.put(this.aj.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    final void bl() {
        while (true) {
            try {
                this.ae.put(this.aj.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    final void bn() {
        while (true) {
            try {
                this.ae.put(this.aj.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    final void m28ab(int i) {
        try {
            bt am = am((byte) 92);
            if (am != null) {
                System.nanoTime();
                am.aa(1133371161);
                at((byte) -55);
                am.ag(this.an, -1254189136);
                ae(am, (byte) 1);
                this.aa.af(-3872935816404843193L * am.ae);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bd.ab(" + ')');
        }
    }

    final void bd() {
        bt am = am((byte) 28);
        if (am != null) {
            System.nanoTime();
            am.aa(1938645395);
            at((byte) -22);
            am.ag(this.an, -983345490);
            ae(am, (byte) 1);
            this.aa.af(-3872935816404843193L * am.ae);
        }
    }

    final void bm() {
        bt am = am((byte) 25);
        if (am != null) {
            System.nanoTime();
            am.aa(676140180);
            at((byte) -89);
            am.ag(this.an, -150185444);
            ae(am, (byte) 1);
            this.aa.af(-3872935816404843193L * am.ae);
        }
    }

    final void bs() {
        bt am = am((byte) 85);
        if (am != null) {
            System.nanoTime();
            am.aa(-1472812620);
            at((byte) -103);
            am.ag(this.an, -1232025403);
            ae(am, (byte) 1);
            this.aa.af(-3872935816404843193L * am.ae);
        }
    }

    static fx[] ab(int i) {
        try {
            int i2;
            fx[] fxVarArr = new fx[(gl.af * 1473408217)];
            for (i2 = 0; i2 < le.ar.length; i2++) {
                if (le.ar[i2] != 0) {
                    int[] iArr = le.ar;
                    iArr[i2] = iArr[i2] | -16777216;
                }
            }
            for (int i3 = 0; i3 < gl.af * 1473408217; i3++) {
                fx fxVar = new fx();
                fxVarArr[i3] = fxVar;
                fxVar.ay = gl.ad * -102972929;
                fxVar.as = nu.an * -820473409;
                fxVar.aa = dr.aa[i3];
                fxVar.ag = gl.ag[i3];
                fxVar.ad = my.ay[i3];
                fxVar.an = it.as[i3];
                int i4 = fxVar.an * fxVar.ad;
                byte[] bArr = gl.aj[i3];
                fxVar.af = new int[i4];
                for (i2 = 0; i2 < i4; i2++) {
                    fxVar.af[i2] = le.ar[bArr[i2] & 255];
                }
            }
            gy.ak(805967750);
            return fxVarArr;
        } catch (Throwable e) {
            throw ba.ad(e, "bd.ab(" + ')');
        }
    }

    final void aw(byte b) {
        try {
            int[] iArr;
            int[][] iArr2;
            int[][] iArr3 = (int[][]) null;
            synchronized (this) {
                iArr = this.aq;
                this.aq = null;
                iArr2 = this.am;
                this.am = (int[][]) null;
            }
            if (iArr != null) {
                af.ad(iArr, (byte) -9);
            }
            if (iArr2 != null) {
                for (int i = 0; i < iArr2.length; i++) {
                    if (iArr2[i] != null) {
                        zv.fc(i, iArr2[i]);
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bd.aw(" + ')');
        }
    }

    final void bj() {
        Object aq = aq(-467845837);
        if (aq != null) {
            if (this.as) {
                zv.zt();
                this.as = false;
            } else {
                zv.xp(aq);
                this.as = true;
            }
        }
        if (this.as) {
            aw((byte) 0);
        }
    }

    final void br() {
        Object aq = aq(-1179837658);
        if (aq != null) {
            if (this.as) {
                zv.zt();
                this.as = false;
            } else {
                zv.xp(aq);
                this.as = true;
            }
        }
        if (this.as) {
            aw((byte) 0);
        }
    }

    final void ai(int i) {
        try {
            Object aq = aq(-1647173923);
            if (aq != null) {
                if (this.as) {
                    zv.zt();
                    this.as = false;
                } else {
                    zv.xp(aq);
                    this.as = true;
                }
            }
            if (this.as) {
                aw((byte) 0);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bd.ai(" + ')');
        }
    }

    public void az(int i) {
        try {
            this.an = !this.an;
        } catch (Throwable e) {
            throw ba.ad(e, "bd.az(" + ')');
        }
    }

    public void ah(boolean z, int i) {
        try {
            this.an = z;
        } catch (Throwable e) {
            throw ba.ad(e, "bd.ah(" + ')');
        }
    }

    public void bi(boolean z) {
        this.an = z;
    }

    public final void ak(byte b) {
        try {
            ai(830469744);
            if (this.as) {
                ab(346828239);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "bd.ak(" + ')');
        }
    }

    public final void bq() {
        ai(-725802442);
        if (this.as) {
            ab(2137036505);
        }
    }

    public void bo() {
        while (this.ad) {
            ak((byte) -26);
        }
    }

    public void ci() {
        while (this.ad) {
            ak((byte) -51);
        }
    }

    public void cv() {
        while (this.ad) {
            ak((byte) 91);
        }
    }

    public void run() {
        while (this.ad) {
            try {
                ak((byte) -22);
            } catch (Throwable e) {
                throw ba.ad(e, "bd.run(" + ')');
            }
        }
    }
}
