package p000;

import java.util.Iterator;

public class dj {
    static final int bw = 19136800;
    static ac il;
    long aa = 0;
    long ad = 5998295499682296539L;
    int ae = 0;
    long af = 4754412273799761543L;
    long ag = 0;
    int aj = 0;
    public boolean an = false;
    int ar = 0;
    int as = 0;
    long ay = 0;

    public void af(byte b) {
        try {
            this.af = hu.af(614525051) * -4754412273799761543L;
        } catch (Throwable e) {
            throw ba.ad(e, "dj.af(" + ')');
        }
    }

    public void ad(int i) {
        try {
            if (-1 != this.af * 7316156162874026185L) {
                this.ag = (hu.af(834744333) - (this.af * 7316156162874026185L)) * 2458210260674424813L;
                this.af = 4754412273799761543L;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "dj.ad(" + ')');
        }
    }

    public void aj() {
        if (-1 != this.af * 7316156162874026185L) {
            this.ag = (hu.af(1822381520) - (this.af * 7316156162874026185L)) * 2458210260674424813L;
            this.af = 4754412273799761543L;
        }
    }

    public void ae(int i) {
        this.ad = hu.af(476154890) * -5998295499682296539L;
        this.as = 747107711 * i;
    }

    public void an(int i, int i2) {
        try {
            this.ad = hu.af(680430741) * -5998295499682296539L;
            this.as = 747107711 * i;
        } catch (Throwable e) {
            throw ba.ad(e, "dj.an(" + ')');
        }
    }

    public void aq(int i) {
        this.ad = hu.af(752258502) * -5998295499682296539L;
        this.as = 747107711 * i;
    }

    public void aa(byte b) {
        try {
            if (this.ad * -8093970993862113619L != -1) {
                this.aa = (hu.af(1968674932) - (this.ad * -8093970993862113619L)) * -7255329472432519067L;
                this.ad = 5998295499682296539L;
            }
            this.aj -= 2049460701;
            this.an = true;
        } catch (Throwable e) {
            throw ba.ad(e, "dj.aa(" + ')');
        }
    }

    public void am() {
        if (this.ad * -8093970993862113619L != -1) {
            this.aa = (hu.af(1350650492) - (this.ad * -8093970993862113619L)) * -7255329472432519067L;
            this.ad = 5998295499682296539L;
        }
        this.aj += 215108220;
        this.an = true;
    }

    public void at() {
        if (this.ad * -8093970993862113619L != -1) {
            this.aa = (hu.af(1753195651) - (this.ad * -8093970993862113619L)) * -7255329472432519067L;
            this.ad = 5998295499682296539L;
        }
        this.aj += 130549313;
        this.an = true;
    }

    public void ab() {
        this.an = false;
        this.ar = 0;
    }

    public void ag(int i) {
        try {
            this.an = false;
            this.ar = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "dj.ag(" + ')');
        }
    }

    public void aw() {
        this.an = false;
        this.ar = 0;
    }

    public void ah() {
        aa((byte) 79);
    }

    public void ai() {
        aa((byte) 59);
    }

    public void ak() {
        aa((byte) 32);
    }

    public void ao() {
        aa((byte) 85);
    }

    public void ay(int i) {
        try {
            aa((byte) 67);
        } catch (Throwable e) {
            throw ba.ad(e, "dj.ay(" + ')');
        }
    }

    public void az() {
        aa((byte) 38);
    }

    public void as(ik ikVar, int i) {
        try {
            ae.ar(ikVar, this.ag * 6062170405317346789L);
            ae.ar(ikVar, this.aa * -3431668639088727699L);
            ae.ar(ikVar, this.ay * 2777343718368230323L);
            ikVar.aa(this.as * 1890175615, -1752508204);
            ikVar.aa(-1911671075 * this.ar, -1752508204);
            ikVar.aa(this.aj * 394373515, -1752508204);
            ikVar.aa(this.ae * -89326879, -1752508204);
        } catch (Throwable e) {
            throw ba.ad(e, "dj.as(" + ')');
        }
    }

    public void au(ik ikVar) {
        ae.ar(ikVar, this.ag * 6062170405317346789L);
        ae.ar(ikVar, this.aa * -3431668639088727699L);
        ae.ar(ikVar, this.ay * 2777343718368230323L);
        ikVar.aa(this.as * 1890175615, -1752508204);
        ikVar.aa(-1911671075 * this.ar, -1752508204);
        ikVar.aa(this.aj * 394373515, -1752508204);
        ikVar.aa(this.ae * -89326879, -1752508204);
    }

    public void ax(ik ikVar) {
        ae.ar(ikVar, this.ag * 6062170405317346789L);
        ae.ar(ikVar, this.aa * -3431668639088727699L);
        ae.ar(ikVar, this.ay * 2777343718368230323L);
        ikVar.aa(this.as * 1890175615, -1752508204);
        ikVar.aa(-1911671075 * this.ar, -1752508204);
        ikVar.aa(this.aj * 394373515, -1752508204);
        ikVar.aa(this.ae * -89326879, -1752508204);
    }

    static void ac(ik ikVar, long j) {
        long j2 = 65535;
        long j3 = j / 10;
        if (j3 < 0) {
            j2 = 0;
        } else if (j3 <= 65535) {
            j2 = j3;
        }
        ikVar.aa((int) j2, -1752508204);
    }

    static void al(ik ikVar, long j) {
        long j2 = 0;
        long j3 = j / 10;
        if (j3 >= 0) {
            if (j3 > 65535) {
                j2 = 65535;
            } else {
                j2 = j3;
            }
        }
        ikVar.aa((int) j2, -1752508204);
    }

    static void av(ik ikVar, long j) {
        long j2 = 65535;
        long j3 = j / 10;
        if (j3 < 0) {
            j2 = 0;
        } else if (j3 <= 65535) {
            j2 = j3;
        }
        ikVar.aa((int) j2, -1752508204);
    }

    static gd[] am(byte b) {
        int i = 0;
        try {
            gd[] gdVarArr = new gd[(gl.af * 1473408217)];
            for (int i2 = 0; i2 < le.ar.length; i2++) {
                if (le.ar[i2] != 0) {
                    int[] iArr = le.ar;
                    iArr[i2] = iArr[i2] | -16777216;
                }
            }
            while (i < gl.af * 1473408217) {
                gd gdVar = new gd();
                gdVarArr[i] = gdVar;
                gdVar.as = gl.ad * -102972929;
                gdVar.ar = nu.an * -820473409;
                gdVar.ag = dr.aa[i];
                gdVar.ay = gl.ag[i];
                gdVar.an = my.ay[i];
                gdVar.aa = it.as[i];
                gdVar.ad = le.ar;
                gdVar.af = gl.aj[i];
                i++;
            }
            gy.ak(805967750);
            return gdVarArr;
        } catch (Throwable e) {
            throw ba.ad(e, "dj.am(" + ')');
        }
    }

    static void bv(int i) {
        try {
            Iterator it = hi.ad.iterator();
            String str = "";
            while (it.hasNext()) {
                hl hlVar = (hl) it.next();
                str = str + hlVar.aa + ':' + hlVar.aj + '\n';
            }
            client.ad.ua(str, -1177352197);
        } catch (Throwable e) {
            throw ba.ad(e, "dj.bv(" + ')');
        }
    }
}
