package p000;

public final class cm {
    static final int dr = 128;
    int aa;
    int ab;
    int ad;
    int ae;
    int af;
    int ag;
    int aj;
    int am;
    int an;
    int aq;
    int ar;
    int as;
    public long at;
    public cq ay;

    cm() {
        try {
            this.at = 0;
            this.ab = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "cm.<init>(" + ')');
        }
    }

    public static ax af(int i, int i2) {
        try {
            ax axVar = (ax) ax.am.af((long) i);
            if (axVar == null) {
                byte[] an = ax.ar.an(10, i, 582516754);
                axVar = new ax();
                axVar.az = 923506921 * i;
                if (an != null) {
                    axVar.an(new ik(an), -1652915320);
                }
                axVar.ad((byte) -31);
                if (-1 != axVar.bo * -50977591) {
                    axVar.ag(cm.af(axVar.bo * -50977591, 1235141975), cm.af(-1461501241 * axVar.bq, 1152631545), (byte) 3);
                }
                if (-1 != axVar.cd * -1216365831) {
                    axVar.ay(cm.af(axVar.cd * -1216365831, 1989894194), cm.af(1034178721 * axVar.cs, 1467091218), 1437130979);
                }
                if (-1 != 2018587685 * axVar.cm) {
                    axVar.as(cm.af(2018587685 * axVar.cm, 1736665312), cm.af(axVar.ch * -778372525, 1293522248), (byte) 1);
                }
                if (!nz.ae && axVar.bh) {
                    axVar.ak = jv.af;
                    axVar.cl = false;
                    axVar.bf = null;
                    axVar.bv = null;
                    axVar.bx = -1555922751;
                    axVar.cn = 0;
                    if (axVar.ck != null) {
                        Object obj = null;
                        for (kd aa = axVar.ck.aa(); aa != null; aa = axVar.ck.ag()) {
                            if (ff.ad((int) aa.fy, (byte) 63).ay) {
                                aa.ki();
                            } else {
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            axVar.ck = null;
                        }
                    }
                }
                ax.am.an(axVar, (long) i);
            }
            return axVar;
        } catch (Throwable e) {
            throw ba.ad(e, "cm.af(" + ')');
        }
    }

    static final int ai(int i, int i2, int i3, int i4) {
        int i5;
        if (i3 > 179) {
            try {
                i5 = i2 / 2;
            } catch (Throwable e) {
                throw ba.ad(e, "cm.ai(" + ')');
            }
        }
        i5 = i2;
        if (i3 > 192) {
            i5 /= 2;
        }
        if (i3 > 217) {
            i5 /= 2;
        }
        if (i3 > 243) {
            i5 /= 2;
        }
        return (((i5 / 32) << 7) + ((i / 4) << 10)) + (i3 / 2);
    }

    static final void di(byte b) {
        try {
            client.hm = 0;
            int i = ((516759209 * gf.ho.bg) >> 7) + (bq.du * 1407993063);
            int i2 = (1289967967 * gl.dp) + ((2328865 * gf.ho.bh) >> 7);
            if (i >= 3053 && i <= 3156 && i2 >= 3056 && i2 <= 3136) {
                client.hm = -243265051;
            }
            if (i >= 3072 && i <= 3118 && i2 >= 9492 && i2 <= 9535) {
                client.hm = -243265051;
            }
            if (client.hm * 783729645 == 1 && i >= 3139 && i <= 3199 && i2 >= 3008 && i2 <= 3062) {
                client.hm = 0;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cm.di(" + ')');
        }
    }
}
