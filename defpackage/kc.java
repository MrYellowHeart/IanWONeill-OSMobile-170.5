package p000;

public class kc implements Runnable {
    static final kc af = new kc();
    public static final int ay = 1024;
    int aa;
    final kg ad;
    Thread ag;
    final kg an;

    kc() {
        try {
            this.ad = new kg();
            this.an = new kg();
            this.aa = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "kc.<init>(" + ')');
        }
    }

    static void ab(int i, mr mrVar, kh khVar) {
        jj jjVar = new jj();
        jjVar.af = 913720689;
        jjVar.fy = (long) i;
        jjVar.an = mrVar;
        jjVar.aa = khVar;
        af.ae(jjVar, (byte) -12);
        af.ad(602581061);
    }

    static void aw(int i, mr mrVar, kh khVar) {
        jj jjVar = new jj();
        jjVar.af = 550765631;
        jjVar.fy = (long) i;
        jjVar.an = mrVar;
        jjVar.aa = khVar;
        af.ae(jjVar, (byte) -94);
        af.ad(602581061);
    }

    synchronized void ad(int i) {
        try {
            if (-1738713721 * this.aa == 0) {
                this.ag = new Thread(af);
                this.ag.setDaemon(true);
                this.ag.start();
                this.ag.setPriority(5);
            }
            this.aa = -2082373400;
        } catch (Throwable e) {
            throw ba.ad(e, "kc.ad(" + ')');
        }
    }

    synchronized void ai() {
        if (-1738713721 * this.aa == 0) {
            this.ag = new Thread(af);
            this.ag.setDaemon(true);
            this.ag.start();
            this.ag.setPriority(5);
        }
        this.aa = -2082373400;
    }

    synchronized void az() {
        if (-1738713721 * this.aa == 0) {
            this.ag = new Thread(af);
            this.ag.setDaemon(true);
            this.ag.start();
            this.ag.setPriority(5);
        }
        this.aa = -2082373400;
    }

    synchronized byte[] ah(int i, mr mrVar) {
        byte[] bArr;
        try {
            jj jjVar = (jj) this.ad.as();
            while (jjVar != null) {
                if (jjVar.fy == ((long) i) && jjVar.an == mrVar && 2034809087 * jjVar.af == 0) {
                    bArr = jjVar.ad;
                    break;
                }
                jjVar = (jj) this.ad.aj();
            }
            bArr = null;
        } catch (Throwable e) {
            ah.af(null, e, (short) -28836);
            bArr = null;
        }
        return bArr;
    }

    synchronized byte[] ak(int i, mr mrVar) {
        byte[] bArr;
        try {
            jj jjVar = (jj) this.ad.as();
            while (jjVar != null) {
                if (jjVar.fy == ((long) i) && jjVar.an == mrVar && -104080495 * jjVar.af == 0) {
                    bArr = jjVar.ad;
                    break;
                }
                jjVar = (jj) this.ad.aj();
            }
            bArr = null;
        } catch (Throwable e) {
            ah.af(null, e, (short) 6336);
            bArr = null;
        }
        return bArr;
    }

    synchronized byte[] an(int i, mr mrVar, int i2) {
        byte[] bArr;
        try {
            jj jjVar = (jj) this.ad.as();
            while (jjVar != null) {
                if (jjVar.fy == ((long) i) && jjVar.an == mrVar && -104080495 * jjVar.af == 0) {
                    bArr = jjVar.ad;
                    break;
                }
                jjVar = (jj) this.ad.aj();
            }
            bArr = null;
        } catch (Throwable e) {
            try {
                ah.af(null, e, (short) 11725);
                bArr = null;
            } catch (Throwable e2) {
                throw ba.ad(e2, "kc.an(" + ')');
            }
        }
        return bArr;
    }

    synchronized byte[] ao(int i, mr mrVar) {
        byte[] bArr;
        try {
            jj jjVar = (jj) this.ad.as();
            while (jjVar != null) {
                if (jjVar.fy == ((long) i) && jjVar.an == mrVar && -1627244538 * jjVar.af == 0) {
                    bArr = jjVar.ad;
                    break;
                }
                jjVar = (jj) this.ad.aj();
            }
            bArr = null;
        } catch (Throwable e) {
            ah.af(null, e, (short) -15173);
            bArr = null;
        }
        return bArr;
    }

    synchronized byte[] au(int i, mr mrVar) {
        byte[] bArr;
        try {
            jj jjVar = (jj) this.ad.as();
            while (jjVar != null) {
                if (jjVar.fy == ((long) i) && jjVar.an == mrVar && -104080495 * jjVar.af == 0) {
                    bArr = jjVar.ad;
                    break;
                }
                jjVar = (jj) this.ad.aj();
            }
            bArr = null;
        } catch (Throwable e) {
            ah.af(null, e, (short) 23153);
            bArr = null;
        }
        return bArr;
    }

    synchronized byte[] ax(int i, mr mrVar) {
        byte[] bArr;
        try {
            jj jjVar = (jj) this.ad.as();
            while (jjVar != null) {
                if (jjVar.fy == ((long) i) && jjVar.an == mrVar && -104080495 * jjVar.af == 0) {
                    bArr = jjVar.ad;
                    break;
                }
                jjVar = (jj) this.ad.aj();
            }
            bArr = null;
        } catch (Throwable e) {
            ah.af(null, e, (short) -21477);
            bArr = null;
        }
        return bArr;
    }

    public static void ac() {
        while (true) {
            jj ag = af.ag((byte) 0);
            if (ag != null) {
                ag.aa.ev(ag.an, (int) ag.fy, ag.ad, false, -1461381517);
            } else {
                return;
            }
        }
    }

    public static void al() {
        while (true) {
            jj ag = af.ag((byte) 0);
            if (ag != null) {
                ag.aa.ev(ag.an, (int) ag.fy, ag.ad, false, -1406172498);
            } else {
                return;
            }
        }
    }

    public static void ap() {
        while (true) {
            jj ag = af.ag((byte) 0);
            if (ag != null) {
                ag.aa.ev(ag.an, (int) ag.fy, ag.ad, false, -398513253);
            } else {
                return;
            }
        }
    }

    public static void av() {
        while (true) {
            jj ag = af.ag((byte) 0);
            if (ag != null) {
                ag.aa.ev(ag.an, (int) ag.fy, ag.ad, false, -52283142);
            } else {
                return;
            }
        }
    }

    synchronized jj ag(byte b) {
        jj jjVar;
        try {
            jjVar = (jj) this.an.ag();
        } catch (Throwable e) {
            try {
                ah.af(null, e, (short) 7704);
                jjVar = null;
            } catch (Throwable e2) {
                throw ba.ad(e2, "kc.ag(" + ')');
            }
        }
        return jjVar;
    }

    synchronized jj bb() {
        jj jjVar;
        try {
            jjVar = (jj) this.an.ag();
        } catch (Throwable e) {
            ah.af(null, e, (short) 23458);
            jjVar = null;
        }
        return jjVar;
    }

    synchronized jj bc() {
        jj jjVar;
        try {
            jjVar = (jj) this.an.ag();
        } catch (Throwable e) {
            ah.af(null, e, (short) 7660);
            jjVar = null;
        }
        return jjVar;
    }

    synchronized jj bw() {
        jj jjVar;
        try {
            jjVar = (jj) this.an.ag();
        } catch (Throwable e) {
            ah.af(null, e, (short) 894);
            jjVar = null;
        }
        return jjVar;
    }

    synchronized jj bz() {
        jj jjVar;
        try {
            jjVar = (jj) this.an.ag();
        } catch (Throwable e) {
            ah.af(null, e, (short) 12018);
            jjVar = null;
        }
        return jjVar;
    }

    synchronized jj ay(int i) {
        jj jjVar;
        try {
            jjVar = (jj) this.ad.as();
        } catch (Throwable e) {
            try {
                ah.af(null, e, (short) 4508);
                jjVar = null;
            } catch (Throwable e2) {
                throw ba.ad(e2, "kc.ay(" + ')');
            }
        }
        if (jjVar == null) {
            jjVar = null;
        } else {
            jjVar.ki();
        }
        return jjVar;
    }

    synchronized jj bf() {
        jj jjVar;
        try {
            jjVar = (jj) this.ad.as();
        } catch (Throwable e) {
            ah.af(null, e, (short) 14378);
            jjVar = null;
        }
        if (jjVar == null) {
            jjVar = null;
        } else {
            jjVar.ki();
        }
        return jjVar;
    }

    synchronized jj bg() {
        jj jjVar;
        try {
            jjVar = (jj) this.ad.as();
        } catch (Throwable e) {
            ah.af(null, e, (short) 9308);
            jjVar = null;
        }
        if (jjVar == null) {
            jjVar = null;
        } else {
            jjVar.ki();
        }
        return jjVar;
    }

    synchronized jj bh() {
        jj jjVar;
        try {
            jjVar = (jj) this.ad.as();
        } catch (Throwable e) {
            ah.af(null, e, (short) -17149);
            jjVar = null;
        }
        if (jjVar == null) {
            jjVar = null;
        } else {
            jjVar.ki();
        }
        return jjVar;
    }

    synchronized boolean as(byte b) {
        boolean z = true;
        synchronized (this) {
            try {
                if (this.aa * -1738713721 <= 1) {
                    this.aa = 0;
                    notifyAll();
                } else {
                    z = false;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "kc.as(" + ')');
            }
        }
        return z;
    }

    synchronized boolean bp() {
        boolean z = true;
        synchronized (this) {
            if (this.aa * 1592199662 <= 1) {
                this.aa = 0;
                notifyAll();
            } else {
                z = false;
            }
        }
        return z;
    }

    synchronized boolean bv() {
        boolean z = true;
        synchronized (this) {
            if (this.aa * -1738713721 <= 1) {
                this.aa = 0;
                notifyAll();
            } else {
                z = false;
            }
        }
        return z;
    }

    synchronized boolean bx() {
        boolean z = true;
        synchronized (this) {
            if (this.aa * -1738713721 <= 1) {
                this.aa = 0;
                notifyAll();
            } else {
                z = false;
            }
        }
        return z;
    }

    synchronized void ar(int i) {
        try {
            this.aa = -2082373400;
        } catch (Throwable e) {
            throw ba.ad(e, "kc.ar(" + ')');
        }
    }

    synchronized void be() {
        this.aa = -2082373400;
    }

    synchronized void bt() {
        this.aa = -2082373400;
    }

    synchronized void bu() {
        this.aa = -965876830;
    }

    synchronized void aj(int i) {
        try {
            this.aa -= -1793040329;
        } catch (Throwable e) {
            throw ba.ad(e, "kc.aj(" + ')');
        }
    }

    synchronized void bk() {
        this.aa -= -1793040329;
    }

    synchronized void bn() {
        this.aa -= -1793040329;
    }

    synchronized void by() {
        this.aa -= -1793040329;
    }

    synchronized void ae(jj jjVar, byte b) {
        try {
            this.ad.ad(jjVar);
        } catch (Throwable e) {
            throw ba.ad(e, "kc.ae(" + ')');
        }
    }

    synchronized void ba(jj jjVar) {
        this.ad.ad(jjVar);
    }

    synchronized void bd(jj jjVar) {
        this.ad.ad(jjVar);
    }

    synchronized void bl(jj jjVar) {
        this.ad.ad(jjVar);
    }

    synchronized void aq(jj jjVar, int i) {
        try {
            this.an.ad(jjVar);
        } catch (Throwable e) {
            throw ba.ad(e, "kc.aq(" + ')');
        }
    }

    synchronized void bm(jj jjVar) {
        this.an.ad(jjVar);
    }

    synchronized void br(jj jjVar) {
        this.an.ad(jjVar);
    }

    synchronized void bs(jj jjVar) {
        this.an.ad(jjVar);
    }

    public void bo() {
        while (true) {
            try {
                jj ay = ay(1952694229);
                if (ay == null) {
                    cu.af(100);
                    if (!as((byte) -53)) {
                        aj(-206545609);
                    } else {
                        return;
                    }
                }
                if (ay.af * -104080495 == 0) {
                    ay.an.ad((int) ay.fy, ay.ad, ay.ad.length, -747781375);
                } else if (ay.af * -104080495 == 1) {
                    ay.ad = ay.an.af((int) ay.fy, 2037705778);
                    aq(ay, 1258794790);
                }
                if (!as((byte) 97)) {
                    ar(1433063752);
                } else {
                    return;
                }
            } catch (Throwable e) {
                ah.af(null, e, (short) -10954);
                return;
            }
        }
    }

    public void ci() {
        while (true) {
            try {
                jj ay = ay(1640483318);
                if (ay == null) {
                    cu.af(100);
                    if (!as((byte) -47)) {
                        aj(-1063146166);
                    } else {
                        return;
                    }
                }
                if (ay.af * -104080495 == 0) {
                    ay.an.ad((int) ay.fy, ay.ad, ay.ad.length, 1243330383);
                } else if (ay.af * -104080495 == 1) {
                    ay.ad = ay.an.af((int) ay.fy, 1646943853);
                    aq(ay, 1551553541);
                }
                if (!as((byte) -20)) {
                    ar(1385259583);
                } else {
                    return;
                }
            } catch (Throwable e) {
                ah.af(null, e, (short) 25303);
                return;
            }
        }
    }

    public void cv() {
        while (true) {
            try {
                jj ay = ay(1641692350);
                if (ay == null) {
                    cu.af(100);
                    if (!as((byte) 19)) {
                        aj(-869004545);
                    } else {
                        return;
                    }
                }
                if (ay.af * -104080495 == 0) {
                    ay.an.ad((int) ay.fy, ay.ad, ay.ad.length, -2126481063);
                } else if (ay.af * -104080495 == 1) {
                    ay.ad = ay.an.af((int) ay.fy, 1975579679);
                    aq(ay, 1706497036);
                }
                if (!as((byte) -35)) {
                    ar(908823002);
                } else {
                    return;
                }
            } catch (Throwable e) {
                ah.af(null, e, (short) 12903);
                return;
            }
        }
    }

    public void run() {
        while (true) {
            jj ay = ay(1602537874);
            if (ay == null) {
                cu.af(100);
                if (!as((byte) -40)) {
                    aj(1236617739);
                } else {
                    return;
                }
            }
            try {
                if (ay.af * -104080495 == 0) {
                    ay.an.ad((int) ay.fy, ay.ad, ay.ad.length, -710235705);
                } else if (ay.af * -104080495 == 1) {
                    ay.ad = ay.an.af((int) ay.fy, 2011135855);
                    aq(ay, -369837825);
                }
                if (!as((byte) -105)) {
                    ar(1408844388);
                } else {
                    return;
                }
            } catch (Throwable e) {
                try {
                    ah.af(null, e, (short) 26040);
                    return;
                } catch (Throwable e2) {
                    throw ba.ad(e2, "kc.run(" + ')');
                }
            }
        }
    }

    public static void bi() {
        af.at(-436488078);
    }

    public static void bj() {
        af.at(-636142204);
    }

    synchronized void at(int i) {
        try {
            if (this.aa * -1738713721 != 0) {
                this.aa = -1793040329;
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "kc.at(" + ')');
        }
    }

    synchronized void bq() {
        if (this.aa * -1738713721 != 0) {
            this.aa = -1793040329;
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    synchronized void cc() {
        if (this.aa * -1738713721 != 0) {
            this.aa = -1793040329;
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }
}
