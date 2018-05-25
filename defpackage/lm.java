package p000;

import java.util.Comparator;

public class lm implements Comparator {
    public static final int aa = 3;
    static final int am = 5;
    public static final int ar = 10000;
    public static final int az = 19;
    static final int bx = 37;
    final boolean af;

    public lm(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "lm.<init>(" + ')');
        }
    }

    int ad(et etVar, et etVar2) {
        return this.af ? etVar.ar(2011959025).an(etVar2.ar(1879233576), 2122311966) : etVar2.ar(1824641987).an(etVar.ar(1994725119), 1278748557);
    }

    int af(et etVar, et etVar2, int i) {
        try {
            return this.af ? etVar.ar(2008180065).an(etVar2.ar(2027580993), 2080932165) : etVar2.ar(2042091061).an(etVar.ar(2110363659), 1311059541);
        } catch (Throwable e) {
            throw ba.ad(e, "lm.af(" + ')');
        }
    }

    public int aa(Object obj, Object obj2) {
        return af((et) obj, (et) obj2, -278246749);
    }

    public int ag(Object obj, Object obj2) {
        return af((et) obj, (et) obj2, -251710965);
    }

    public int an(Object obj, Object obj2) {
        return af((et) obj, (et) obj2, -545208989);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((et) obj, (et) obj2, 1510435830);
        } catch (Throwable e) {
            throw ba.ad(e, "lm.compare(" + ')');
        }
    }

    public boolean cf(Object obj) {
        return super.equals(obj);
    }

    public boolean cz(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (Throwable e) {
            throw ba.ad(e, "lm.equals(" + ')');
        }
    }

    static final byte[] bc(byte[] bArr, byte b) {
        try {
            ik ikVar = new ik(bArr);
            int ao = ikVar.ao((byte) 0);
            int al = ikVar.al(-532895429);
            if (al < 0 || (kf.ah * 1621223447 != 0 && al > kf.ah * 1621223447)) {
                throw new RuntimeException();
            } else if (ao == 0) {
                r0 = new byte[al];
                ikVar.bg(r0, 0, al, 248078995);
                return r0;
            } else {
                int al2 = ikVar.al(365135331);
                if (al2 < 0 || (kf.ah * 1621223447 != 0 && al2 > kf.ah * 1621223447)) {
                    throw new RuntimeException();
                }
                r0 = new byte[al2];
                if (1 == ao) {
                    im.af(r0, al2, bArr, al, 9);
                    return r0;
                }
                kf.ab.af(ikVar, r0, 91258545);
                return r0;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lm.bc(" + ')');
        }
    }

    static void au(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12 = -i7;
        int i13 = i4;
        int i14 = i2;
        while (i12 < 0) {
            int i15 = (i3 >> 16) * i10;
            int i16 = i14;
            i14 = i13;
            i13 = -i6;
            while (i13 < 0) {
                try {
                    int i17;
                    int i18 = iArr2[(i16 >> 16) + i15];
                    if (i18 != 0) {
                        i17 = i14 + 1;
                        iArr[i14] = i18;
                    } else {
                        i17 = i14 + 1;
                    }
                    i13++;
                    i16 += i8;
                    i14 = i17;
                } catch (Throwable e) {
                    throw ba.ad(e, "lm.au(" + ')');
                }
            }
            i3 += i9;
            i13 = i14 + i5;
            i12++;
            i14 = i2;
        }
    }
}
