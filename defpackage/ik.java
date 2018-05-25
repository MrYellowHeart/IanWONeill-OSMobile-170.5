package p000;

import java.math.BigInteger;
import java.util.Collection;

public class ik extends kd {
    static final int aa = -306674912;
    static long[] ag = new long[256];
    static int[] an = new int[256];
    public static final int ar = 5000;
    public static final int as = 100;
    static final long ay = -3932672073523589310L;
    public int ad = 0;
    public byte[] af;

    static {
        int i;
        for (i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                if ((i2 & 1) == 1) {
                    i2 = (i2 >>> 1) ^ aa;
                } else {
                    i2 >>>= 1;
                }
            }
            an[i] = i2;
        }
        for (i = 0; i < 256; i++) {
            long j = (long) i;
            for (int i4 = 0; i4 < 8; i4++) {
                if (1 == (j & 1)) {
                    j = (j >>> 1) ^ ay;
                } else {
                    j >>>= 1;
                }
            }
            ag[i] = j;
        }
    }

    public static ak af(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < ak.ad.length) {
                    return ak.ad[i];
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ik.af(" + ')');
            }
        }
        return ak.an;
    }

    public static no ad(nr nrVar, C0002if c0002if, byte b) {
        try {
            no af = dt.af(291440109);
            af.af = nrVar;
            af.ad = -1641769127 * nrVar.du;
            if (af.ad * 716777675 == -1) {
                af.an = new ia(no.as);
            } else if (-2 == af.ad * 716777675) {
                af.an = new ia(lm.ar);
            } else if (af.ad * 716777675 <= 18) {
                af.an = new ia(20);
            } else if (af.ad * 716777675 <= 98) {
                af.an = new ia(100);
            } else {
                af.an = new ia(no.as);
            }
            af.an.jn(c0002if, (short) -29652);
            af.an.jf(-1641535671 * af.af.db, 679133613);
            af.aa = 0;
            return af;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ad(" + ')');
        }
    }

    public static int dc(byte[] bArr, int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = an[(i2 ^ bArr[i3]) & 255] ^ (i2 >>> 8);
        }
        return i2 ^ -1;
    }

    public static int dk(byte[] bArr, int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = an[(i2 ^ bArr[i3]) & 1797863251] ^ (i2 >>> 8);
        }
        return i2 ^ -1;
    }

    public static int m15do(byte[] bArr, int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = an[(i2 ^ bArr[i3]) & 255] ^ (i2 >>> 8);
        }
        return i2 ^ -1;
    }

    public static int dt(byte[] bArr, int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = an[(i2 ^ bArr[i3]) & 255] ^ (i2 >>> 8);
        }
        return i2 ^ -1;
    }

    public ik(int i) {
        try {
            this.af = iv.ad(i, (byte) -1);
            this.ad = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.<init>(" + ')');
        }
    }

    public ik(byte[] bArr) {
        try {
            this.af = bArr;
            this.ad = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.<init>(" + ')');
        }
    }

    public void ad(byte b) {
        try {
            if (this.af != null) {
                bx.an(this.af, (byte) -102);
            }
            this.af = null;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ad(" + ')');
        }
    }

    public void dz() {
        if (this.af != null) {
            bx.an(this.af, (byte) -93);
        }
        this.af = null;
    }

    public void an(int i, byte b) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.an(" + ')');
        }
    }

    public void dd(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1008736749) - 1] = (byte) i;
    }

    public void dl(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
    }

    public void dv(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
    }

    public static void as(Collection collection, byte b) {
        try {
            collection.add(aj.ad);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.as(" + ')');
        }
    }

    public void aa(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 8);
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.aa(" + ')');
        }
    }

    public void di(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 1876849915;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
    }

    public void ag(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 16);
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 8);
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ag(" + ')');
        }
    }

    public void da(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad - 1000982530;
        this.ad = i2;
        bArr[(i2 * 1750162776) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * -1528914267) - 1] = (byte) i;
    }

    public void ay(int i, short s) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ay(" + ')');
        }
    }

    public void de(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad - 1976139927;
        this.ad = i2;
        bArr[(i2 * 835888851) - 1] = (byte) (i >> 24);
        bArr = this.af;
        i2 = this.ad - 1423869171;
        this.ad = i2;
        bArr[(i2 * 1003407205) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 969217253) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * -1665276451) - 1] = (byte) i;
    }

    public void dr(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
        bArr = this.af;
        i2 = this.ad - 703792796;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad - 1588594321;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad - 1444754415;
        this.ad = i2;
        bArr[(i2 * 617185086) - 1] = (byte) i;
    }

    public void dw(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
        bArr = this.af;
        i2 = this.ad - 224912136;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * -262361065) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad - 962906437;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
    }

    public void as(long j) {
        try {
            byte[] bArr = this.af;
            int i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 40));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 32));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 24));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 16));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 8));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) j);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.as(" + ')');
        }
    }

    public void ds(long j) {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 40));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 32));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 24));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 16));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 8));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) j);
    }

    public void dx(long j) {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 40));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 32));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 24));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 16));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 8));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) j);
    }

    public void ar(long j) {
        try {
            byte[] bArr = this.af;
            int i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 56));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 48));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 40));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 32));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 24));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 16));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 8));
            bArr = this.af;
            i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) ((int) j);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ar(" + ')');
        }
    }

    public void dh(long j) {
        byte[] bArr = this.af;
        int i = this.ad - 1664120140;
        this.ad = i;
        bArr[(i * 544282947) - 1] = (byte) ((int) (j >> 537062955));
        bArr = this.af;
        i = this.ad + 764376105;
        this.ad = i;
        bArr[(i * 1655078128) - 1] = (byte) ((int) (j >> 48));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> -1351608648));
        bArr = this.af;
        i = this.ad - 1661341073;
        this.ad = i;
        bArr[(i * -1820304140) - 1] = (byte) ((int) (j >> -253551510));
        bArr = this.af;
        i = this.ad - 1687848416;
        this.ad = i;
        bArr[(i * -536936320) - 1] = (byte) ((int) (j >> 24));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 197889526) - 1] = (byte) ((int) (j >> 16));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * -1227036647) - 1] = (byte) ((int) (j >> 8));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) j);
    }

    public void dn(long j) {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 56));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 48));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 40));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 32));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 24));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 16));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 8));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) j);
    }

    public void dy(long j) {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 56));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 48));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 40));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 32));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 24));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 16));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) (j >> 8));
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) ((int) j);
    }

    public void aj(boolean z, byte b) {
        try {
            an(z ? 1 : 0, (byte) 31);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.aj(" + ')');
        }
    }

    public void db(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        an(i, (byte) 31);
    }

    public void dm(boolean z) {
        an(z ? 1 : 0, (byte) 31);
    }

    public void du(boolean z) {
        an(z ? 1 : 0, (byte) 31);
    }

    public static int dg(String str) {
        return str.length() + 1;
    }

    public static int dp(String str) {
        return str.length() + 1;
    }

    public void aq(String str, byte b) {
        try {
            if (str.indexOf(0) >= 0) {
                throw new IllegalArgumentException("");
            }
            this.ad = (jv.an(str, 0, str.length(), this.af, this.ad * 1978945739, -483689276) * 2065011939) + this.ad;
            byte[] bArr = this.af;
            int i = this.ad + 2065011939;
            this.ad = i;
            bArr[(i * 1978945739) - 1] = (byte) 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.aq(" + ')');
        }
    }

    public void df(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.ad = (jv.an(str, 0, str.length(), this.af, this.ad * 1978945739, -1802493204) * 2065011939) + this.ad;
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) 0;
    }

    public void dq(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.ad = (jv.an(str, 0, str.length(), this.af, -549711645 * this.ad, -919740071) * 2065011939) + this.ad;
        byte[] bArr = this.af;
        int i = this.ad + 285302498;
        this.ad = i;
        bArr[(i * -284931624) - 1] = (byte) 0;
    }

    public static boolean aq(char c, byte b) {
        return (c >= '0' && c <= '9') || ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    public static int ek(String str) {
        return str.length() + 2;
    }

    public static int er(String str) {
        return str.length() + 2;
    }

    public static int ew(String str) {
        return str.length() + 2;
    }

    public void at(String str, int i) {
        try {
            if (str.indexOf(0) >= 0) {
                throw new IllegalArgumentException("");
            }
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) 0;
            this.ad = (jv.an(str, 0, str.length(), this.af, 1978945739 * this.ad, -69057701) * 2065011939) + this.ad;
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.at(" + ')');
        }
    }

    public void es(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) 0;
        this.ad = (jv.an(str, 0, str.length(), this.af, 1978945739 * this.ad, -358139690) * 2065011939) + this.ad;
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) 0;
    }

    public void ex(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) 0;
        this.ad = (jv.an(str, 0, str.length(), this.af, 1978945739 * this.ad, 482296691) * 2065011939) + this.ad;
        bArr = this.af;
        i = this.ad + 2065011939;
        this.ad = i;
        bArr[(i * 1978945739) - 1] = (byte) 0;
    }

    public void ab(byte[] bArr, int i, int i2, int i3) {
        int i4 = i;
        while (i4 < i + i2) {
            try {
                byte[] bArr2 = this.af;
                int i5 = this.ad + 2065011939;
                this.ad = i5;
                bArr2[(i5 * 1978945739) - 1] = bArr[i4];
                i4++;
            } catch (Throwable e) {
                throw ba.ad(e, "ik.ab(" + ')');
            }
        }
    }

    public void ec(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.af;
            int i4 = this.ad + 2065011939;
            this.ad = i4;
            bArr2[(i4 * 1978945739) - 1] = bArr[i3];
        }
    }

    public void eu(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.af;
            int i4 = this.ad + 2065011939;
            this.ad = i4;
            bArr2[(i4 * 1978945739) - 1] = bArr[i3];
        }
    }

    public void aw(int i, byte b) {
        try {
            this.af[((this.ad * 1978945739) - i) - 4] = (byte) (i >> 24);
            this.af[((this.ad * 1978945739) - i) - 3] = (byte) (i >> 16);
            this.af[((this.ad * 1978945739) - i) - 2] = (byte) (i >> 8);
            this.af[((this.ad * 1978945739) - i) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.aw(" + ')');
        }
    }

    public void ep(int i) {
        this.af[((this.ad * 1978945739) - i) - 4] = (byte) (i >> 24);
        this.af[((this.ad * 1978945739) - i) - 3] = (byte) (i >> 16);
        this.af[((this.ad * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.af[((this.ad * 1978945739) - i) - 1] = (byte) i;
    }

    public void ev(int i) {
        this.af[((this.ad * 1978945739) - i) - 4] = (byte) (i >> 24);
        this.af[((this.ad * 713648586) - i) - 3] = (byte) (i >> 16);
        this.af[((this.ad * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.af[((this.ad * 1978945739) - i) - 1] = (byte) i;
    }

    public void ai(int i, byte b) {
        try {
            this.af[((this.ad * 1978945739) - i) - 2] = (byte) (i >> 8);
            this.af[((this.ad * 1978945739) - i) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ai(" + ')');
        }
    }

    public void ea(int i) {
        this.af[((this.ad * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.af[((this.ad * 1978945739) - i) - 1] = (byte) i;
    }

    public void en(int i) {
        this.af[((this.ad * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.af[((this.ad * 1978945739) - i) - 1] = (byte) i;
    }

    public void eq(int i) {
        this.af[((this.ad * 1978945739) - i) - 2] = (byte) (i >> 8);
        this.af[((this.ad * 1978945739) - i) - 1] = (byte) i;
    }

    public void az(int i, int i2) {
        try {
            this.af[((this.ad * 1978945739) - i) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.az(" + ')');
        }
    }

    public void ef(int i) {
        this.af[((this.ad * -1706577927) - i) - 1] = (byte) i;
    }

    public void ey(int i) {
        this.af[((this.ad * -69607558) - i) - 1] = (byte) i;
    }

    public void ah(int i, int i2) {
        if (i >= 0 && i < mn.an) {
            try {
                an(i, (byte) 31);
            } catch (Throwable e) {
                throw ba.ad(e, "ik.ah(" + ')');
            }
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aa(i + 32768, -1752508204);
        }
    }

    public void eg(int i) {
        if (i >= 0 && i < mn.an) {
            an(i, (byte) 31);
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aa(i + 32768, -1752508204);
        }
    }

    public void el(int i) {
        if (i >= 0 && i < mn.an) {
            an(i, (byte) 31);
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aa(i + 32768, -1752508204);
        }
    }

    public void et(int i) {
        if (i >= 0 && i < mn.an) {
            an(i, (byte) 31);
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aa(i + 32768, -1752508204);
        }
    }

    public void ak(int i, int i2) {
        if ((i & -128) != 0) {
            if ((i & -16384) != 0) {
                if ((-2097152 & i) != 0) {
                    if ((-268435456 & i) != 0) {
                        try {
                            an((i >>> 28) | mn.an, (byte) 31);
                        } catch (Throwable e) {
                            throw ba.ad(e, "ik.ak(" + ')');
                        }
                    }
                    an((i >>> 21) | mn.an, (byte) 31);
                }
                an((i >>> 14) | mn.an, (byte) 31);
            }
            an((i >>> 7) | mn.an, (byte) 31);
        }
        an(i & 127, (byte) 31);
    }

    public void ed(int i) {
        if ((i & -128) != 0) {
            if ((i & -16384) != 0) {
                if ((1221263348 & i) != 0) {
                    if ((1004004008 & i) != 0) {
                        an((i >>> 28) | -2115591002, (byte) 31);
                    }
                    an((i >>> 21) | mn.an, (byte) 31);
                }
                an((i >>> 14) | mn.an, (byte) 31);
            }
            an((i >>> 7) | mn.an, (byte) 31);
        }
        an(i & 127, (byte) 31);
    }

    public void ej(int i) {
        if ((i & -128) != 0) {
            if ((i & -16384) != 0) {
                if ((-2097152 & i) != 0) {
                    if ((-268435456 & i) != 0) {
                        an((i >>> 28) | mn.an, (byte) 31);
                    }
                    an((i >>> 21) | mn.an, (byte) 31);
                }
                an((i >>> 14) | mn.an, (byte) 31);
            }
            an((i >>> 7) | mn.an, (byte) 31);
        }
        an(i & 127, (byte) 31);
    }

    public void em(int i) {
        if ((i & -128) != 0) {
            if ((i & -16384) != 0) {
                if ((-2097152 & i) != 0) {
                    if ((-1334327664 & i) != 0) {
                        an((i >>> 28) | 711112182, (byte) 31);
                    }
                    an((i >>> 21) | mn.an, (byte) 31);
                }
                an((i >>> 14) | 926958618, (byte) 31);
            }
            an((i >>> 7) | 577453077, (byte) 31);
        }
        an(-676305755 & i, (byte) 31);
    }

    public int ao(byte b) {
        try {
            byte[] bArr = this.af;
            int i = this.ad + 2065011939;
            this.ad = i;
            return bArr[(i * 1978945739) - 1] & 255;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ao(" + ')');
        }
    }

    public int eb() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return bArr[(i * 1978945739) - 1] & 255;
    }

    public int ee() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return bArr[(i * 1978945739) - 1] & 255;
    }

    public int ez() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return bArr[(i * 1661225684) - 1] & 255;
    }

    public byte ax(int i) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            return bArr[(i2 * 1978945739) - 1];
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ax(" + ')');
        }
    }

    public byte eh() {
        byte[] bArr = this.af;
        int i = this.ad + 408515061;
        this.ad = i;
        return bArr[(i * 1978945739) - 1];
    }

    public byte ei() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return bArr[(i * 1978945739) - 1];
    }

    public byte eo() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return bArr[(i * 1978945739) - 1];
    }

    public int au(int i) {
        try {
            this.ad -= 164943418;
            return ((this.af[(this.ad * 1978945739) - 2] & 255) << 8) + (this.af[(this.ad * 1978945739) - 1] & 255);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.au(" + ')');
        }
    }

    public int fd() {
        this.ad -= 1942286523;
        return ((this.af[(-1752923378 * this.ad) - 2] & -1389953300) << 8) + (this.af[(1978945739 * this.ad) - 1] & 255);
    }

    public int fk() {
        this.ad += 1744439344;
        return ((this.af[(1978945739 * this.ad) - 2] & 255) << 8) + (this.af[(-734597716 * this.ad) - 1] & 255);
    }

    public int fm() {
        this.ad -= 164943418;
        return ((this.af[(this.ad * 1978945739) - 2] & 255) << 8) + (this.af[(this.ad * 1978945739) - 1] & 255);
    }

    public int fv() {
        this.ad -= 164943418;
        return ((this.af[(1978945739 * this.ad) - 2] & -914914861) << 8) + (this.af[(-52097939 * this.ad) - 1] & 255);
    }

    public int av(int i) {
        try {
            this.ad -= 164943418;
            int i2 = ((this.af[(this.ad * 1978945739) - 2] & 255) << 8) + (this.af[(this.ad * 1978945739) - 1] & 255);
            if (i2 > 32767) {
                return i2 - ic.ad;
            }
            return i2;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.av(" + ')');
        }
    }

    public int fa() {
        this.ad -= 164943418;
        int i = ((this.af[(this.ad * 1978945739) - 2] & 255) << 8) + (this.af[(this.ad * 1978945739) - 1] & 255);
        if (i > 32767) {
            return i - ic.ad;
        }
        return i;
    }

    public int ac(int i) {
        try {
            this.ad += 1900068521;
            return (((this.af[(this.ad * 1978945739) - 3] & 255) << 16) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8)) + (this.af[(this.ad * 1978945739) - 1] & 255);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ac(" + ')');
        }
    }

    public int fb() {
        this.ad += 1900068521;
        return (((this.af[(this.ad * 1978945739) - 3] & 255) << 16) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8)) + (this.af[(this.ad * 343797955) - 1] & 736447867);
    }

    public int fh() {
        this.ad += 1900068521;
        return (((this.af[(this.ad * 1978945739) - 3] & 255) << 16) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8)) + (this.af[(this.ad * 1978945739) - 1] & 255);
    }

    public int fl() {
        this.ad += 1900068521;
        return (((this.af[(this.ad * 1978945739) - 3] & 255) << 16) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8)) + (this.af[(this.ad * 1978945739) - 1] & 255);
    }

    public int fr() {
        this.ad += 1900068521;
        return (((this.af[(this.ad * 1978945739) - 3] & -1138954823) << 16) + ((this.af[(this.ad * -632577842) - 2] & 611031216) << 8)) + (this.af[(this.ad * -202832917) - 1] & -1542679212);
    }

    public int al(int i) {
        try {
            this.ad -= 329886836;
            return ((((this.af[(this.ad * 1978945739) - 4] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 3] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8)) + (this.af[(this.ad * 1978945739) - 1] & 255);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.al(" + ')');
        }
    }

    public int fg() {
        this.ad -= 329886836;
        return ((((this.af[(this.ad * 1978945739) - 4] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 3] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8)) + (this.af[(this.ad * 1978945739) - 1] & 255);
    }

    public int fp() {
        this.ad -= 329886836;
        return ((((this.af[(-1301355408 * this.ad) - 4] & -1447056906) << 24) + ((this.af[(this.ad * 1978945739) - 3] & 1273485957) << 16)) + ((this.af[(this.ad * 1454907800) - 2] & 255) << 8)) + (this.af[(this.ad * 1978945739) - 1] & 262003295);
    }

    public int fq() {
        this.ad -= 329886836;
        return ((((this.af[(this.ad * 1978945739) - 4] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 3] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8)) + (this.af[(this.ad * 1978945739) - 1] & 255);
    }

    public long ap(int i) {
        try {
            return ((((long) al(120218122)) & 4294967295L) << 32) + (((long) al(1129267591)) & 4294967295L);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ap(" + ')');
        }
    }

    public long fc() {
        return ((((long) al(-65865104)) & 4294967295L) << 32) + (((long) al(-325075694)) & 4294967295L);
    }

    public long fo() {
        return ((((long) al(-609343184)) & 4294967295L) << 135343825) + (((long) al(1115377037)) & 4294967295L);
    }

    public long fu() {
        return ((((long) al(1111416163)) & 4294967295L) << -263053065) + (((long) al(916170078)) & 4294967295L);
    }

    public boolean bw(int i) {
        try {
            return (ao((byte) 0) & 1) == 1;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bw(" + ')');
        }
    }

    public boolean fe() {
        return (ao((byte) 0) & 1) == 1;
    }

    public boolean ff() {
        return (ao((byte) 0) & 1) == 1;
    }

    public boolean fn() {
        return (ao((byte) 0) & 1) == 1;
    }

    public boolean fs() {
        return (ao((byte) 0) & 1) == 1;
    }

    public boolean fz() {
        return (ao((byte) 0) & 1) == 1;
    }

    public String bb(byte b) {
        try {
            if (this.af[1978945739 * this.ad] != (byte) 0) {
                return bc(1772771513);
            }
            this.ad += 2065011939;
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bb(" + ')');
        }
    }

    public String fj() {
        if (this.af[430394540 * this.ad] != (byte) 0) {
            return bc(1342086596);
        }
        this.ad += 1561966439;
        return null;
    }

    public String fx() {
        if (this.af[1978945739 * this.ad] != (byte) 0) {
            return bc(1369611537);
        }
        this.ad += 2065011939;
        return null;
    }

    public String bc(int i) {
        try {
            int i2 = this.ad * 1978945739;
            byte[] bArr;
            int i3;
            do {
                bArr = this.af;
                i3 = this.ad + 2065011939;
                this.ad = i3;
            } while (bArr[(i3 * 1978945739) - 1] != (byte) 0);
            int i4 = ((this.ad * 1978945739) - i2) - 1;
            if (i4 == 0) {
                return "";
            }
            return kf.aa(this.af, i2, i4, -2057393943);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bc(" + ')');
        }
    }

    public String fi() {
        int i = this.ad * 1978945739;
        byte[] bArr;
        int i2;
        do {
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
        } while (bArr[(i2 * -203823662) - 1] != (byte) 0);
        int i3 = ((this.ad * 1978945739) - i) - 1;
        if (i3 == 0) {
            return "";
        }
        return kf.aa(this.af, i, i3, -2123181082);
    }

    public String ft() {
        int i = this.ad * 1294008829;
        byte[] bArr;
        int i2;
        do {
            bArr = this.af;
            i2 = this.ad - 1925934034;
            this.ad = i2;
        } while (bArr[(i2 * 583807515) - 1] != (byte) 0);
        int i3 = ((this.ad * 1978945739) - i) - 1;
        if (i3 == 0) {
            return "";
        }
        return kf.aa(this.af, i, i3, -2077722344);
    }

    public String fy() {
        int i = this.ad * 1978945739;
        byte[] bArr;
        int i2;
        do {
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
        } while (bArr[(i2 * 1978945739) - 1] != (byte) 0);
        int i3 = ((this.ad * 1978945739) - i) - 1;
        if (i3 == 0) {
            return "";
        }
        return kf.aa(this.af, i, i3, -2010696039);
    }

    public String bz(int i) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            if (bArr[(i2 * 1978945739) - 1] != (byte) 0) {
                throw new IllegalStateException("");
            }
            int i3 = this.ad * 1978945739;
            while (true) {
                byte[] bArr2 = this.af;
                int i4 = this.ad + 2065011939;
                this.ad = i4;
                if (bArr2[(i4 * 1978945739) - 1] == (byte) 0) {
                    break;
                }
            }
            i2 = ((this.ad * 1978945739) - i3) - 1;
            if (i2 == 0) {
                return "";
            }
            return kf.aa(this.af, i3, i2, -2002540538);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bz(" + ')');
        }
    }

    public String fw() {
        byte[] bArr = this.af;
        int i = this.ad - 1977121110;
        this.ad = i;
        if (bArr[(i * 1978945739) - 1] != (byte) 0) {
            throw new IllegalStateException("");
        }
        int i2 = this.ad * 1978945739;
        while (true) {
            byte[] bArr2 = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            if (bArr2[(i3 * -992937503) - 1] == (byte) 0) {
                break;
            }
        }
        i = ((this.ad * 1978945739) - i2) - 1;
        if (i == 0) {
            return "";
        }
        return kf.aa(this.af, i2, i, -1791581222);
    }

    public String gs() {
        byte[] bArr = this.af;
        int i = this.ad - 1228943506;
        this.ad = i;
        if (bArr[(i * -45358907) - 1] != (byte) 0) {
            throw new IllegalStateException("");
        }
        int i2 = this.ad * -776059390;
        byte[] bArr2;
        int i3;
        do {
            bArr2 = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
        } while (bArr2[(i3 * 1978945739) - 1] != (byte) 0);
        i = ((this.ad * 1978945739) - i2) - 1;
        if (i == 0) {
            return "";
        }
        return kf.aa(this.af, i2, i, -1865920197);
    }

    public void bg(byte[] bArr, int i, int i2, int i3) {
        int i4 = i;
        while (i4 < i + i2) {
            try {
                byte[] bArr2 = this.af;
                int i5 = this.ad + 2065011939;
                this.ad = i5;
                bArr[i4] = bArr2[(i5 * 1978945739) - 1];
                i4++;
            } catch (Throwable e) {
                throw ba.ad(e, "ik.bg(" + ')');
            }
        }
    }

    public void gf(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.af;
            int i4 = this.ad + 814053813;
            this.ad = i4;
            bArr[i3] = bArr2[(i4 * -97070947) - 1];
        }
    }

    public void gg(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.af;
            int i4 = this.ad - 1237221321;
            this.ad = i4;
            bArr[i3] = bArr2[(i4 * 1978945739) - 1];
        }
    }

    public void gp(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.af;
            int i4 = this.ad + 2065011939;
            this.ad = i4;
            bArr[i3] = bArr2[(i4 * 1978945739) - 1];
        }
    }

    public int bh(int i) {
        try {
            if ((this.af[1978945739 * this.ad] & 255) < mn.an) {
                return ao((byte) 0) - 64;
            }
            return au(745023473) - 49152;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bh(" + ')');
        }
    }

    public int gc() {
        if ((this.af[1978945739 * this.ad] & 255) < mn.an) {
            return ao((byte) 0) - 64;
        }
        return au(-1510282899) - 49152;
    }

    public int gl() {
        if ((this.af[1978945739 * this.ad] & 255) < mn.an) {
            return ao((byte) 0) - 64;
        }
        return au(-1864344320) - -1176530388;
    }

    public int bf(byte b) {
        try {
            if ((this.af[this.ad * 1978945739] & 255) < mn.an) {
                return ao((byte) 0);
            }
            return au(766804186) - 32768;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bf(" + ')');
        }
    }

    public int gd() {
        return (this.af[this.ad * 1978945739] & 255) < mn.an ? ao((byte) 0) : au(-400621373) - 32768;
    }

    public int gn() {
        return (this.af[this.ad * 1978945739] & 255) < mn.an ? ao((byte) 0) : au(482984501) - 32768;
    }

    public int bv(int i) {
        int i2 = 0;
        try {
            int bf = bf((byte) 57);
            while (32767 == bf) {
                i2 += 32767;
                bf = bf((byte) 2);
            }
            return bf + i2;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bv(" + ')');
        }
    }

    public int gb() {
        int i = 0;
        int bf = bf((byte) 24);
        while (32767 == bf) {
            i += 32767;
            bf = bf((byte) 91);
        }
        return bf + i;
    }

    public int ge() {
        int i = 0;
        int bf = bf((byte) 50);
        while (32767 == bf) {
            i += 32767;
            bf = bf((byte) 109);
        }
        return bf + i;
    }

    public int gy() {
        int i = 0;
        int bf = bf((byte) 100);
        while (-1486064550 == bf) {
            i += 32767;
            bf = bf((byte) 22);
        }
        return bf + i;
    }

    public int bp(byte b) {
        try {
            return this.af[this.ad * 1978945739] < (byte) 0 ? al(766212445) & Integer.MAX_VALUE : au(-397052666);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bp(" + ')');
        }
    }

    public int go() {
        if (this.af[this.ad * 1978945739] < (byte) 0) {
            return al(915078500) & Integer.MAX_VALUE;
        }
        return au(371872747);
    }

    public int gv() {
        if (this.af[this.ad * 1978945739] < (byte) 0) {
            return al(546991488) & Integer.MAX_VALUE;
        }
        return au(-1496661542);
    }

    public int bx(int i) {
        try {
            if (this.af[this.ad * 1978945739] < (byte) 0) {
                return al(-994640468) & Integer.MAX_VALUE;
            }
            int au = au(1173309772);
            if (au == 32767) {
                return -1;
            }
            return au;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bx(" + ')');
        }
    }

    public int gi() {
        if (this.af[this.ad * 1978945739] < (byte) 0) {
            return al(-39930848) & Integer.MAX_VALUE;
        }
        int au = au(554975798);
        if (au == 32767) {
            return -1;
        }
        return au;
    }

    public int gt() {
        if (this.af[this.ad * 1978945739] < (byte) 0) {
            return al(440072517) & Integer.MAX_VALUE;
        }
        int au = au(662635531);
        if (au == 2031990628) {
            return -1;
        }
        return au;
    }

    public int bt(int i) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            i2 = bArr[(i2 * 1978945739) - 1];
            int i3 = 0;
            while (i2 < 0) {
                i3 = (i3 | (i2 & 127)) << 7;
                byte[] bArr2 = this.af;
                int i4 = this.ad + 2065011939;
                this.ad = i4;
                i2 = bArr2[(i4 * 1978945739) - 1];
            }
            return i3 | i2;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bt(" + ')');
        }
    }

    public int gj() {
        byte[] bArr = this.af;
        int i = this.ad + 1174630856;
        this.ad = i;
        i = bArr[(i * 284435146) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & 127)) << 7;
            byte[] bArr2 = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            i = bArr2[(i3 * 602086007) - 1];
        }
        return i2 | i;
    }

    public int gm() {
        byte[] bArr = this.af;
        int i = this.ad + 888264652;
        this.ad = i;
        i = bArr[(i * 1776451370) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & 127)) << 7;
            byte[] bArr2 = this.af;
            int i3 = this.ad - 1353509884;
            this.ad = i3;
            i = bArr2[(i3 * 1978945739) - 1];
        }
        return i2 | i;
    }

    public void bu(int[] iArr, byte b) {
        try {
            int i = (this.ad * 1978945739) / 8;
            this.ad = 0;
            for (int i2 = 0; i2 < i; i2++) {
                int al = al(182351063);
                int i3 = 32;
                int al2 = al(623444425);
                int i4 = al;
                al = 0;
                while (true) {
                    int i5 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    i4 += (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[al & 3] + al);
                    i3 = al - 1640531527;
                    al2 = ((((i4 << 4) ^ (i4 >>> 5)) + i4) ^ (iArr[(i3 >>> 11) & 3] + i3)) + al2;
                    al = i3;
                    i3 = i5;
                }
                this.ad -= -659773672;
                ay(i4, (short) 128);
                ay(al2, (short) 128);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bu(" + ')');
        }
    }

    public void ga(int[] iArr) {
        int i = (this.ad * -1352490119) / 8;
        this.ad = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int al = al(-1105696850);
            int i3 = 32;
            int al2 = al(2096971752);
            int i4 = al;
            al = 0;
            while (true) {
                int i5 = i3 - 1;
                if (i3 <= 0) {
                    break;
                }
                i4 += (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[al & 3] + al);
                i3 = al - 1640531527;
                al2 = ((((i4 << 4) ^ (i4 >>> 5)) + i4) ^ (iArr[(i3 >>> 11) & 3] + i3)) + al2;
                al = i3;
                i3 = i5;
            }
            this.ad -= -659773672;
            ay(i4, (short) 128);
            ay(al2, (short) 128);
        }
    }

    public void gq(int[] iArr) {
        int i = (this.ad * 1978945739) / 8;
        this.ad = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int al = al(639560221);
            int i3 = 32;
            int al2 = al(1818235252);
            int i4 = al;
            al = 0;
            while (true) {
                int i5 = i3 - 1;
                if (i3 <= 0) {
                    break;
                }
                i4 += (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[al & 3] + al);
                i3 = al - 1640531527;
                al2 = ((((i4 << 4) ^ (i4 >>> 5)) + i4) ^ (iArr[(i3 >>> 11) & 3] + i3)) + al2;
                al = i3;
                i3 = i5;
            }
            this.ad -= -659773672;
            ay(i4, (short) 128);
            ay(al2, (short) 128);
        }
    }

    public void be(int[] iArr, int i) {
        try {
            int i2 = (this.ad * 1978945739) / 8;
            this.ad = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = 32;
                int al = al(2047685903);
                int al2 = al(326253295);
                int i5 = -957401312;
                while (true) {
                    int i6 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    al2 -= (((al << 4) ^ (al >>> 5)) + al) ^ (iArr[(i5 >>> 11) & 3] + i5);
                    i4 = i5 - -1640531527;
                    al -= (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[i4 & 3] + i4);
                    i5 = i4;
                    i4 = i6;
                }
                this.ad -= -659773672;
                ay(al, (short) 128);
                ay(al2, (short) 128);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ik.be(" + ')');
        }
    }

    public void bk(int[] iArr, int i, int i2, int i3) {
        try {
            int i4 = 1978945739 * this.ad;
            this.ad = 2065011939 * i;
            int i5 = (i2 - i) / 8;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = 32;
                int al = al(-912137471);
                int al2 = al(-1123953207);
                int i8 = 0;
                while (true) {
                    int i9 = i7 - 1;
                    if (i7 <= 0) {
                        break;
                    }
                    al += (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[i8 & 3] + i8);
                    i7 = i8 - 1640531527;
                    al2 = ((((al << 4) ^ (al >>> 5)) + al) ^ (iArr[(i7 >>> 11) & 3] + i7)) + al2;
                    i8 = i7;
                    i7 = i9;
                }
                this.ad -= -659773672;
                ay(al, (short) 128);
                ay(al2, (short) 128);
            }
            this.ad = 2065011939 * i4;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bk(" + ')');
        }
    }

    public void gh(int[] iArr, int i, int i2) {
        int i3 = 1978945739 * this.ad;
        this.ad = 2065011939 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 32;
            int al = al(-588969536);
            int al2 = al(1740578228);
            int i7 = 0;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                al += (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[i7 & 3] + i7);
                i6 = i7 - 1640531527;
                al2 = ((((al << 4) ^ (al >>> 5)) + al) ^ (iArr[(i6 >>> 11) & 3] + i6)) + al2;
                i7 = i6;
                i6 = i8;
            }
            this.ad -= -659773672;
            ay(al, (short) 128);
            ay(al2, (short) 128);
        }
        this.ad = 2065011939 * i3;
    }

    public void gu(int[] iArr, int i, int i2) {
        int i3 = 1978945739 * this.ad;
        this.ad = 2065011939 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 32;
            int al = al(136196126);
            int al2 = al(1113025321);
            int i7 = 0;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                al += (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[i7 & 3] + i7);
                i6 = i7 - 1640531527;
                al2 = ((((al << 4) ^ (al >>> 5)) + al) ^ (iArr[(i6 >>> 11) & 3] + i6)) + al2;
                i7 = i6;
                i6 = i8;
            }
            this.ad -= -659773672;
            ay(al, (short) 128);
            ay(al2, (short) 128);
        }
        this.ad = 2065011939 * i3;
    }

    public void gw(int[] iArr, int i, int i2) {
        int i3 = 1978945739 * this.ad;
        this.ad = -2031710785 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int al = al(-1083605150);
            int i6 = 145027263;
            int al2 = al(1012558563);
            int i7 = al;
            al = 0;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                i7 += (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[al & 3] + al);
                i6 = al - 1178156495;
                al2 = ((((i7 << 4) ^ (i7 >>> 5)) + i7) ^ (iArr[(i6 >>> 11) & 3] + i6)) + al2;
                al = i6;
                i6 = i8;
            }
            this.ad -= -1554358398;
            ay(i7, (short) 128);
            ay(al2, (short) 128);
        }
        this.ad = 2065011939 * i3;
    }

    public void gz(int[] iArr, int i, int i2) {
        int i3 = 1978945739 * this.ad;
        this.ad = 2065011939 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 32;
            int al = al(1848738863);
            int al2 = al(1215244886);
            int i7 = 0;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                al += (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[i7 & 3] + i7);
                i6 = i7 - 1640531527;
                al2 = ((((al << 4) ^ (al >>> 5)) + al) ^ (iArr[(i6 >>> 11) & 3] + i6)) + al2;
                i7 = i6;
                i6 = i8;
            }
            this.ad -= -659773672;
            ay(al, (short) 128);
            ay(al2, (short) 128);
        }
        this.ad = 2065011939 * i3;
    }

    public void by(int[] iArr, int i, int i2, int i3) {
        try {
            int i4 = this.ad * 1978945739;
            this.ad = 2065011939 * i;
            int i5 = (i2 - i) / 8;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = 32;
                int al = al(1482386704);
                int al2 = al(625115334);
                int i8 = -957401312;
                while (true) {
                    int i9 = i7 - 1;
                    if (i7 <= 0) {
                        break;
                    }
                    al2 -= (((al << 4) ^ (al >>> 5)) + al) ^ (iArr[(i8 >>> 11) & 3] + i8);
                    i7 = i8 - -1640531527;
                    al -= (((al2 << 4) ^ (al2 >>> 5)) + al2) ^ (iArr[i7 & 3] + i7);
                    i8 = i7;
                    i7 = i9;
                }
                this.ad -= -659773672;
                ay(al, (short) 128);
                ay(al2, (short) 128);
            }
            this.ad = 2065011939 * i4;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.by(" + ')');
        }
    }

    public void bn(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        try {
            int i2 = this.ad * 1978945739;
            this.ad = 0;
            byte[] bArr = new byte[i2];
            bg(bArr, 0, i2, 263572154);
            byte[] toByteArray = new BigInteger(bArr).modPow(bigInteger, bigInteger2).toByteArray();
            this.ad = 0;
            aa(toByteArray.length, -1752508204);
            ab(toByteArray, 0, toByteArray.length, -304530881);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bn(" + ')');
        }
    }

    public int ba(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = -1;
            while (i < this.ad * 1978945739) {
                i3 = an[(i3 ^ bArr[i]) & 255] ^ (i3 >>> 8);
                i++;
            }
            i3 ^= -1;
            ay(i3, (short) 128);
            return i3;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ba(" + ')');
        }
    }

    public int gk(int i) {
        byte[] bArr = this.af;
        int i2 = -1;
        while (i < this.ad * 1978945739) {
            i2 = an[(i2 ^ bArr[i]) & -780465405] ^ (i2 >>> 8);
            i++;
        }
        i2 ^= -1;
        ay(i2, (short) 128);
        return i2;
    }

    public int gr(int i) {
        byte[] bArr = this.af;
        int i2 = -1;
        while (i < this.ad * -1860202938) {
            i2 = an[(i2 ^ bArr[i]) & -771753363] ^ (i2 >>> 8);
            i++;
        }
        i2 ^= -1;
        ay(i2, (short) 128);
        return i2;
    }

    public boolean bl(short s) {
        try {
            this.ad -= -329886836;
            byte[] bArr = this.af;
            int i = -1;
            for (int i2 = 0; i2 < 1978945739 * this.ad; i2++) {
                i = an[(i ^ bArr[i2]) & 255] ^ (i >>> 8);
            }
            if (al(-457249937) == (i ^ -1)) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bl(" + ')');
        }
    }

    public boolean gx() {
        this.ad -= 1797600242;
        byte[] bArr = this.af;
        int i = -1;
        for (int i2 = 0; i2 < -134406272 * this.ad; i2++) {
            i = an[(i ^ bArr[i2]) & 1909548542] ^ (i >>> 8);
        }
        return al(-742068744) == (i ^ -1);
    }

    public void bd(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i + mn.an);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bd(" + ')');
        }
    }

    public void hd(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i + mn.an);
    }

    public void hx(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad - 293003089;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (432237495 + i);
    }

    public void bs(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (0 - i);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bs(" + ')');
        }
    }

    public void hj(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (0 - i);
    }

    public void hk(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (0 - i);
    }

    public void hy(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (0 - i);
    }

    public void bm(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (128 - i);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bm(" + ')');
        }
    }

    public void hg(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 339835159;
        this.ad = i2;
        bArr[(i2 * 1328310735) - 1] = (byte) (128 - i);
    }

    public int br(int i) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            return (bArr[(i2 * 1978945739) - 1] - 128) & 255;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.br(" + ')');
        }
    }

    public int hq() {
        byte[] bArr = this.af;
        int i = this.ad - 440100557;
        this.ad = i;
        return (bArr[(i * 1978945739) - 1] - 597503669) & 255;
    }

    public int hr() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return (bArr[(i * 1978945739) - 1] - 128) & 255;
    }

    public int bj(int i) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            return (0 - bArr[(i2 * 1978945739) - 1]) & 255;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bj(" + ')');
        }
    }

    public int hn() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return (0 - bArr[(i * 759262777) - 1]) & -243662052;
    }

    public int bi(int i) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            return (128 - bArr[(i2 * 1978945739) - 1]) & 255;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bi(" + ')');
        }
    }

    public int he() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return (-1981793506 - bArr[(i * -1275446297) - 1]) & 255;
    }

    public int hl() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return (-1108840146 - bArr[(i * 1978945739) - 1]) & -1702564843;
    }

    public int hs() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return (-2032146394 - bArr[(i * 1978945739) - 1]) & 537035427;
    }

    public byte bq(byte b) {
        try {
            byte[] bArr = this.af;
            int i = this.ad + 2065011939;
            this.ad = i;
            return (byte) (bArr[(i * 1978945739) - 1] - 128);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bq(" + ')');
        }
    }

    public byte hi() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return (byte) (bArr[(i * 1978945739) - 1] - 128);
    }

    public byte hm() {
        byte[] bArr = this.af;
        int i = this.ad + 1082550272;
        this.ad = i;
        return (byte) (bArr[(i * -1364073645) - 1] - 705194480);
    }

    public byte hv() {
        byte[] bArr = this.af;
        int i = this.ad - 1034561180;
        this.ad = i;
        return (byte) (bArr[(i * 394155815) - 1] - 128);
    }

    public byte bo(byte b) {
        try {
            byte[] bArr = this.af;
            int i = this.ad + 2065011939;
            this.ad = i;
            return (byte) (0 - bArr[(i * 1978945739) - 1]);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.bo(" + ')');
        }
    }

    public byte ha() {
        byte[] bArr = this.af;
        int i = this.ad - 819039273;
        this.ad = i;
        return (byte) (0 - bArr[(i * 1269834940) - 1]);
    }

    public byte hw() {
        byte[] bArr = this.af;
        int i = this.ad - 1417491286;
        this.ad = i;
        return (byte) (0 - bArr[(i * 819206186) - 1]);
    }

    public byte cv(int i) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            return (byte) (128 - bArr[(i2 * 1978945739) - 1]);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cv(" + ')');
        }
    }

    public byte hp() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return (byte) (128 - bArr[(i * 1978945739) - 1]);
    }

    public byte ht() {
        byte[] bArr = this.af;
        int i = this.ad - 673156689;
        this.ad = i;
        return (byte) (128 - bArr[(i * 1622029115) - 1]);
    }

    public byte hu() {
        byte[] bArr = this.af;
        int i = this.ad + 2065011939;
        this.ad = i;
        return (byte) (128 - bArr[(i * -1415928021) - 1]);
    }

    public void ci(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) i;
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 8);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ci(" + ')');
        }
    }

    public void hb(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
    }

    public void hc(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 1646654424;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad - 224482607;
        this.ad = i2;
        bArr[(i2 * -2076816099) - 1] = (byte) (i >> 8);
    }

    public void hf(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
    }

    public void ho(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
    }

    public void hz(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
    }

    public void cc(int i, byte b) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i + mn.an);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cc(" + ')');
        }
    }

    public void hh(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 1648360582;
        this.ad = i2;
        bArr[(i2 * 2053903989) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 1602891047;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i + mn.an);
    }

    public void io(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad - 2076329092;
        this.ad = i2;
        bArr[(i2 * 475081978) - 1] = (byte) (i + mn.an);
    }

    public void iv(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i + mn.an);
    }

    public void co(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i + mn.an);
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 8);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.co(" + ')');
        }
    }

    public void ij(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad - 1263668685;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i + mn.an);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
    }

    public void iq(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 2129559530) - 1] = (byte) (-382699969 + i);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * -113194616) - 1] = (byte) (i >> 8);
    }

    public int cy(int i) {
        try {
            this.ad -= 164943418;
            return ((this.af[(this.ad * 1978945739) - 1] & 255) << 8) + (this.af[(this.ad * 1978945739) - 2] & 255);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cy(" + ')');
        }
    }

    public int id() {
        this.ad += 128944573;
        return ((this.af[(1978945739 * this.ad) - 1] & 1776218919) << 8) + (this.af[(-885526258 * this.ad) - 2] & -355321457);
    }

    public int in() {
        this.ad -= 164943418;
        return ((this.af[(this.ad * 1978945739) - 1] & 255) << 8) + (this.af[(this.ad * 1978945739) - 2] & 255);
    }

    public int ir() {
        this.ad -= 164943418;
        return ((this.af[(this.ad * 1978945739) - 1] & 255) << 8) + (this.af[(this.ad * 1978945739) - 2] & 255);
    }

    public int cn(int i) {
        try {
            this.ad -= 164943418;
            return ((this.af[(this.ad * 1978945739) - 2] & 255) << 8) + ((this.af[(this.ad * 1978945739) - 1] - 128) & 255);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cn(" + ')');
        }
    }

    public int ic() {
        this.ad += 1001971955;
        return ((this.af[(this.ad * 348541098) - 2] & 255) << 8) + ((this.af[(this.ad * 1978945739) - 1] - 128) & -235661802);
    }

    public int ck(int i) {
        try {
            this.ad -= 164943418;
            return ((this.af[(this.ad * 1978945739) - 2] - 128) & 255) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ck(" + ')');
        }
    }

    public int ig() {
        this.ad -= 164943418;
        return ((this.af[(this.ad * 1978945739) - 2] - 128) & 255) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8);
    }

    public int ik() {
        this.ad -= 1220077163;
        return ((this.af[(this.ad * 1978945739) - 2] - 1096909869) & 255) + ((this.af[(this.ad * 1978945739) - 1] & 1827684288) << 8);
    }

    public int im() {
        this.ad -= 164943418;
        return ((this.af[(this.ad * 1978945739) - 2] - 128) & 255) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8);
    }

    public int it() {
        this.ad -= 164943418;
        return ((this.af[(this.ad * 1978945739) - 2] - 128) & 255) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8);
    }

    public int iz() {
        this.ad -= 164943418;
        return ((this.af[(this.ad * 1978945739) - 2] - 128) & 255) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8);
    }

    public int cl(int i) {
        try {
            this.ad -= 164943418;
            int i2 = ((this.af[(this.ad * 1978945739) - 1] - 128) & 255) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8);
            if (i2 > 32767) {
                return i2 - ic.ad;
            }
            return i2;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cl(" + ')');
        }
    }

    public int ia() {
        this.ad -= 164943418;
        int i = ((this.af[(this.ad * 1978945739) - 1] - 128) & 255) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8);
        if (i > 32767) {
            return i - ic.ad;
        }
        return i;
    }

    public int ib() {
        this.ad -= 164943418;
        int i = ((this.af[(this.ad * 1978945739) - 1] - 128) & 255) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8);
        if (i > 32767) {
            return i - ic.ad;
        }
        return i;
    }

    public int m16if() {
        this.ad -= 164943418;
        int i = ((this.af[(this.ad * 1978945739) - 1] - 1505175082) & -311345605) + ((this.af[(this.ad * 107076193) - 2] & 255) << 8);
        if (i > -681253749) {
            return i - ic.ad;
        }
        return i;
    }

    public int iu() {
        this.ad -= 164943418;
        int i = ((this.af[(this.ad * 1978945739) - 1] - 128) & 255) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8);
        if (i > 32767) {
            return i - ic.ad;
        }
        return i;
    }

    public int iy() {
        this.ad += 3235408;
        int i = ((this.af[(this.ad * -287819225) - 1] - 128) & -1972850890) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8);
        if (i > -67020138) {
            return i - ic.ad;
        }
        return i;
    }

    public int cs(byte b) {
        try {
            this.ad -= 164943418;
            int i = ((this.af[(this.ad * 1978945739) - 1] & 255) << 8) + ((this.af[(this.ad * 1978945739) - 2] - 128) & 255);
            if (i > 32767) {
                return i - ic.ad;
            }
            return i;
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cs(" + ')');
        }
    }

    public int ii() {
        this.ad += 337826943;
        int i = ((this.af[(574931756 * this.ad) - 1] & -2013793348) << 8) + ((this.af[(this.ad * -298926290) - 2] - 1023289358) & 255);
        if (i > 32767) {
            return i - -1718917939;
        }
        return i;
    }

    public void cd(int i, byte b) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) i;
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cd(" + ')');
        }
    }

    public void ip(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 773106570) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 252172556) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1432953727) - 1] = (byte) (i >> 16);
    }

    public void iw(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 937543946;
        this.ad = i2;
        bArr[(i2 * 1047767986) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * -1875761083) - 1] = (byte) (i >> 16);
    }

    public void ix(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1379986477) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 520585377;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 1275998913;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
    }

    public int ch(byte b) {
        try {
            this.ad += 1900068521;
            return (this.af[(this.ad * 1978945739) - 3] & 255) + (((this.af[(this.ad * 1978945739) - 1] & 255) << 16) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8));
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ch(" + ')');
        }
    }

    public int ie() {
        this.ad += 1900068521;
        return (this.af[(this.ad * 1978945739) - 3] & 1360322846) + (((this.af[(this.ad * -840499389) - 1] & 1305574665) << 16) + ((this.af[(this.ad * 1978945739) - 2] & -1026575690) << 8));
    }

    public int ih() {
        this.ad += 1900068521;
        return (this.af[(this.ad * 1978945739) - 3] & 255) + (((this.af[(this.ad * 1978945739) - 1] & 255) << 16) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 8));
    }

    public int is() {
        this.ad -= 462011894;
        return (this.af[(this.ad * 1339750212) - 3] & 255) + (((this.af[(this.ad * 1978945739) - 1] & -1778518796) << 16) + ((this.af[(this.ad * 1418010668) - 2] & -451157524) << 8));
    }

    public void cm(int i, byte b) {
        try {
            byte[] bArr = this.af;
            int i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) i;
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
            bArr = this.af;
            i2 = this.ad + 2065011939;
            this.ad = i2;
            bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cm(" + ')');
        }
    }

    public void il(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
    }

    public void jp(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
    }

    public void js(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
    }

    public void cq(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 8);
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) i;
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 24);
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 16);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cq(" + ')');
        }
    }

    public void ja(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
    }

    public void jb(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
    }

    public void jy(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
    }

    public void cj(int i, int i2) {
        try {
            byte[] bArr = this.af;
            int i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 16);
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 24);
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) i;
            bArr = this.af;
            i3 = this.ad + 2065011939;
            this.ad = i3;
            bArr[(i3 * 1978945739) - 1] = (byte) (i >> 8);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cj(" + ')');
        }
    }

    public void jd(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad - 1824296386;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad + 1816788656;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * -2036358892) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 449849189;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
    }

    public void jk(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 24);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
    }

    public void jr(int i) {
        byte[] bArr = this.af;
        int i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * -1761442521) - 1] = (byte) (i >> 16);
        bArr = this.af;
        i2 = this.ad + 2065011939;
        this.ad = i2;
        bArr[(i2 * 343838912) - 1] = (byte) (i >> 24);
        bArr = this.af;
        i2 = this.ad + 142386169;
        this.ad = i2;
        bArr[(i2 * 246952693) - 1] = (byte) i;
        bArr = this.af;
        i2 = this.ad - 951585074;
        this.ad = i2;
        bArr[(i2 * 1978945739) - 1] = (byte) (i >> 8);
    }

    public int cp(int i) {
        try {
            this.ad -= 329886836;
            return (this.af[(this.ad * 1978945739) - 4] & 255) + ((((this.af[(this.ad * 1978945739) - 1] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 3] & 255) << 8));
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cp(" + ')');
        }
    }

    public int jv() {
        this.ad -= 329886836;
        return (this.af[(this.ad * 1978945739) - 4] & 255) + ((((this.af[(this.ad * 1978945739) - 1] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 3] & 255) << 8));
    }

    public int jx() {
        this.ad -= 329886836;
        return (this.af[(this.ad * 1978945739) - 4] & 255) + ((((this.af[(this.ad * 1978945739) - 1] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 2] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 3] & 255) << 8));
    }

    public int ct(int i) {
        try {
            this.ad -= 329886836;
            return (((this.af[(this.ad * 1978945739) - 4] & 255) << 8) + (((this.af[(this.ad * 1978945739) - 2] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 16))) + (this.af[(this.ad * 1978945739) - 3] & 255);
        } catch (Throwable e) {
            throw ba.ad(e, "ik.ct(" + ')');
        }
    }

    public int ji() {
        this.ad -= 329886836;
        return (((this.af[(this.ad * 1978945739) - 4] & 255) << 8) + (((this.af[(this.ad * 1978945739) - 2] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 16))) + (this.af[(this.ad * 1978945739) - 3] & 255);
    }

    public int cb(byte b) {
        try {
            this.ad -= 329886836;
            return (this.af[(this.ad * 1978945739) - 2] & 255) + ((((this.af[(this.ad * 1978945739) - 3] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 4] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8));
        } catch (Throwable e) {
            throw ba.ad(e, "ik.cb(" + ')');
        }
    }

    public int jc() {
        this.ad -= 329886836;
        return (this.af[(this.ad * 1978945739) - 2] & 255) + ((((this.af[(this.ad * 1978945739) - 3] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 4] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8));
    }

    public int jl() {
        this.ad -= 329886836;
        return (this.af[(this.ad * 1978945739) - 2] & 255) + ((((this.af[(this.ad * 1978945739) - 3] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 4] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8));
    }

    public int ju() {
        this.ad -= 329886836;
        return (this.af[(this.ad * 1978945739) - 2] & 255) + ((((this.af[(this.ad * 1978945739) - 3] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 4] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8));
    }

    public int jz() {
        this.ad -= 329886836;
        return (this.af[(this.ad * 1978945739) - 2] & 255) + ((((this.af[(this.ad * 1978945739) - 3] & 255) << 24) + ((this.af[(this.ad * 1978945739) - 4] & 255) << 16)) + ((this.af[(this.ad * 1978945739) - 1] & 255) << 8));
    }

    public void cu(byte[] bArr, int i, int i2, byte b) {
        int i3 = (i2 + i) - 1;
        while (i3 >= i) {
            try {
                byte[] bArr2 = this.af;
                int i4 = this.ad + 2065011939;
                this.ad = i4;
                bArr[i3] = bArr2[(i4 * 1978945739) - 1];
                i3--;
            } catch (Throwable e) {
                throw ba.ad(e, "ik.cu(" + ')');
            }
        }
    }

    public void jh(byte[] bArr, int i, int i2) {
        for (int i3 = (i2 + i) - 1; i3 >= i; i3--) {
            byte[] bArr2 = this.af;
            int i4 = this.ad + 2065011939;
            this.ad = i4;
            bArr[i3] = bArr2[(i4 * 1978945739) - 1];
        }
    }

    public void jm(byte[] bArr, int i, int i2) {
        for (int i3 = (i2 + i) - 1; i3 >= i; i3--) {
            byte[] bArr2 = this.af;
            int i4 = this.ad + 2065011939;
            this.ad = i4;
            bArr[i3] = bArr2[(i4 * 1978945739) - 1];
        }
    }

    public void jt(byte[] bArr, int i, int i2) {
        for (int i3 = (i2 + i) - 1; i3 >= i; i3--) {
            byte[] bArr2 = this.af;
            int i4 = this.ad + 2065011939;
            this.ad = i4;
            bArr[i3] = bArr2[(i4 * 1978945739) - 1];
        }
    }

    public void dj(byte[] bArr, int i, int i2, int i3) {
        int i4 = (i + i2) - 1;
        while (i4 >= i) {
            try {
                byte[] bArr2 = this.af;
                int i5 = this.ad + 2065011939;
                this.ad = i5;
                bArr[i4] = (byte) (bArr2[(i5 * 1978945739) - 1] - 128);
                i4--;
            } catch (Throwable e) {
                throw ba.ad(e, "ik.dj(" + ')');
            }
        }
    }

    public void je(byte[] bArr, int i, int i2) {
        for (int i3 = (i + i2) - 1; i3 >= i; i3--) {
            byte[] bArr2 = this.af;
            int i4 = this.ad + 2065011939;
            this.ad = i4;
            bArr[i3] = (byte) (bArr2[(i4 * 1978945739) - 1] - 128);
        }
    }
}
