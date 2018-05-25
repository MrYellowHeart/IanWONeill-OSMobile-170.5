package p000;

public class dc {
    public static final int aa = 2;
    public static final int ad = 8;
    public static final int af = 64;
    public static final int as = 16;
    static int[] bp = null;
    static final int bz = 19136995;

    dc() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "dc.<init>(" + ')');
        }
    }

    static hl an(int i, int i2) {
        try {
            return (hl) hi.ad.af((long) i);
        } catch (Throwable e) {
            throw ba.ad(e, "dc.an(" + ')');
        }
    }

    public static final boolean an(char c, int i) {
        return ' ' == c || ' ' == c || '_' == c || '-' == c;
    }

    public static void af(kf kfVar, kf kfVar2, kf kfVar3, kf kfVar4, int i) {
        try {
            gn.ar = kfVar;
            an.aj = kfVar2;
            ag.ae = kfVar3;
            ni.aq = kfVar4;
            en.ay = new ac[gn.ar.ai(1761238379)][];
            ek.as = new boolean[gn.ar.ai(1813553933)];
        } catch (Throwable e) {
            throw ba.ad(e, "dc.af(" + ')');
        }
    }

    static void cy(int i) {
        try {
            if (et.pz != null) {
                et.pz.at(dq.hf * -1674539149, ((gf.ho.bg * 516759209) >> 7) + (bq.du * 1407993063), (gl.dp * 1289967967) + ((gf.ho.bh * 2328865) >> 7), false, 976087032);
                et.pz.bc(1715668880);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dc.cy(" + ')');
        }
    }

    static final void db(gi giVar, int i) {
        int i2 = 0;
        long j = 0;
        try {
            int as;
            int i3;
            if (giVar.ad * -1833730097 == 0) {
                j = gp.en.bw(giVar.af * -1783248061, giVar.an * -1294114749, giVar.aa * -401817923);
            }
            if (1 == giVar.ad * -1833730097) {
                j = gp.en.bb(giVar.af * -1783248061, giVar.an * -1294114749, giVar.aa * -401817923);
            }
            if (giVar.ad * -1833730097 == 2) {
                j = gp.en.bc(giVar.af * -1783248061, giVar.an * -1294114749, giVar.aa * -401817923);
            }
            if (giVar.ad * -1833730097 == 3) {
                j = gp.en.bz(giVar.af * -1783248061, giVar.an * -1294114749, giVar.aa * -401817923);
            }
            if (j != 0) {
                i2 = gp.en.bg(giVar.af * -1783248061, giVar.an * -1294114749, giVar.aa * -401817923, j);
                as = bb.as(j);
                i3 = i2 & 31;
                i2 = (i2 >> 6) & 3;
            } else {
                as = -1;
                i3 = 0;
            }
            giVar.ag = as * -686175921;
            giVar.as = i3 * 156191129;
            giVar.ay = i2 * 573474583;
        } catch (Throwable e) {
            throw ba.ad(e, "dc.db(" + ')');
        }
    }
}
