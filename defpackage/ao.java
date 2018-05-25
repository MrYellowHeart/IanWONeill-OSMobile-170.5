package p000;

public class ao implements ix {
    static final ao ad = new ao(2, 1);
    static final ao af = new ao(0, 0);
    static final ao an = new ao(1, 2);
    static final int bd = 3;
    static ac[] kc;
    public final int aa;
    final int ag;

    ao(int i, int i2) {
        try {
            this.aa = -572521813 * i;
            this.ag = -1110913981 * i2;
        } catch (Throwable e) {
            throw ba.ad(e, "ao.<init>(" + ')');
        }
    }

    public int aa() {
        return this.ag * -1563893653;
    }

    public int ad() {
        return this.ag * -1563893653;
    }

    public int af(int i) {
        try {
            return this.ag * -1563893653;
        } catch (Throwable e) {
            throw ba.ad(e, "ao.af(" + ')');
        }
    }

    public int an() {
        return this.ag * -1563893653;
    }

    public static void ad(kf kfVar, int i, int i2, int i3, boolean z, int i4) {
        try {
            mf.ag = 63807465;
            ex.ay = kfVar;
            ml.as = -1919717083 * i;
            mf.ar = -2021257265 * i2;
            ci.aj = -1734207119 * i3;
            gm.aq = z;
            cb.ae = 37492880;
        } catch (Throwable e) {
            throw ba.ad(e, "ao.ad(" + ')');
        }
    }

    public static int an(CharSequence charSequence, int i, int i2) {
        try {
            return ll.aa(charSequence, i, true, (byte) -20);
        } catch (Throwable e) {
            throw ba.ad(e, "ao.an(" + ')');
        }
    }

    public static final int bb(int i, double d) {
        double d2 = ((double) ((i >> 8) & 255)) / 256.0d;
        try {
            return (((((int) (Math.pow(((double) ((i >> 16) & 255)) / 256.0d, d) * 256.0d)) << 16) + (((int) (Math.pow(d2, d) * 256.0d)) << 8)) + ((int) (256.0d * Math.pow(((double) (i & 255)) / 256.0d, d)))) | (-16777216 & i);
        } catch (Throwable e) {
            throw ba.ad(e, "ao.bb(" + ')');
        }
    }

    public static boolean aa(int i, byte b) {
        int i2 = 0;
        try {
            if (ek.as[i]) {
                return true;
            }
            if (!gn.ar.as(i, 2328865)) {
                return false;
            }
            int aw = gn.ar.aw(i, -870843897);
            if (aw == 0) {
                ek.as[i] = true;
                return true;
            }
            if (en.ay[i] == null) {
                en.ay[i] = new ac[aw];
            }
            while (i2 < aw) {
                if (en.ay[i][i2] == null) {
                    byte[] an = gn.ar.an(i, i2, 366685550);
                    if (an != null) {
                        en.ay[i][i2] = new ac();
                        en.ay[i][i2].ah = ((i << 16) + i2) * 1337491127;
                        if ((byte) -1 == an[0]) {
                            en.ay[i][i2].as(new ik(an), (byte) 72);
                        } else {
                            en.ay[i][i2].ay(new ik(an), -918986700);
                        }
                    }
                }
                i2++;
            }
            ek.as[i] = true;
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "ao.aa(" + ')');
        }
    }

    static gd an(boolean z, boolean z2, short s) {
        if (!z) {
            return z2 ? gr.am : bq.aq;
        } else {
            if (!z2) {
                return gr.at;
            }
            try {
                return mg.ab;
            } catch (Throwable e) {
                throw ba.ad(e, "ao.an(" + ')');
            }
        }
    }

    static void ax(byte b) {
        try {
            if (dq.af(-1679128282)) {
                gr.cg = true;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ao.ax(" + ')');
        }
    }
}
