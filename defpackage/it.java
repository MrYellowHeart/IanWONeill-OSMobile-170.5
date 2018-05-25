package p000;

public class it {
    static int[] as;

    it() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "it.<init>(" + ')');
        }
    }

    public static final void an(long j) {
        if (j > 0) {
            if (0 == j % 10) {
                aq.ad(j - 1);
                aq.ad(1);
                return;
            }
            aq.ad(j);
        }
    }

    static final void aa(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        }
    }

    static final void ag(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        }
    }

    static final void ay(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        }
    }

    static void ad(kh khVar, int i, int i2, int i3, byte b, boolean z, short s) {
        long j = (long) ((i << 16) + i2);
        try {
            if (((ks) jw.aa.af(j)) == null && ((ks) jw.ay.af(j)) == null) {
                ks ksVar = (ks) jw.aj.af(j);
                if (ksVar == null) {
                    if (!z) {
                        if (((ks) jw.aq.af(j)) != null) {
                            return;
                        }
                    }
                    kd ksVar2 = new ks();
                    ksVar2.af = khVar;
                    ksVar2.ad = 1351238033 * i3;
                    ksVar2.an = b;
                    if (z) {
                        jw.aa.ad(ksVar2, j);
                        jw.ag -= 916264481;
                        return;
                    }
                    jw.ar.af(ksVar2);
                    jw.aj.ad(ksVar2, j);
                    jw.ae += 1417772105;
                } else if (z) {
                    ksVar.dm();
                    jw.aa.ad(ksVar, j);
                    jw.ae -= 1417772105;
                    jw.ag -= 916264481;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "it.ad(" + ')');
        }
    }

    public static lr aq(byte[] bArr, byte[] bArr2, byte b) {
        try {
            ec.ah(bArr, 13032508);
            return ew.aw(bArr2, -1437327022);
        } catch (Throwable e) {
            throw ba.ad(e, "it.aq(" + ')');
        }
    }

    static hs av(int i) {
        try {
            if (client.pp == null || client.pu * -427906923 >= client.pp.size()) {
                return null;
            }
            return (hs) client.pp.get(client.pu * -427906923);
        } catch (Throwable e) {
            throw ba.ad(e, "it.av(" + ')');
        }
    }
}
