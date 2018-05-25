package p000;

import java.io.DataInputStream;
import java.net.URL;
import java.util.Collection;

public class ah extends kq {
    static ky aa = new ky(64, null);
    public static kf ad = null;
    public static kf af = null;
    static ky ag = new ky(100, null);
    public static kf an = null;
    static final int iq = 4;
    static final int mg = 100;
    public int ab;
    public int ae;
    public int ah;
    public int ai;
    public int[] aj;
    public int ak;
    public boolean am;
    int[] aq;
    public int[] ar;
    int[] as;
    public int at;
    public int aw;
    public int[] ay;
    public int az;

    public static void af(String str, Throwable th, short s) {
        try {
            String str2 = "";
            if (th != null) {
                str2 = jz.an(th, 146096009);
            }
            if (str != null) {
                if (th != null) {
                    str2 = str2 + " | ";
                }
                str2 = str2 + str;
            }
            System.out.println("Error: " + str2);
            str2 = str2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if (mq.af != null) {
                DataInputStream dataInputStream = new DataInputStream(new URL(mq.af, "clienterror.ws?c=" + (1643082463 * mq.an) + "&u=" + mq.ad + "&v1=" + mj.af + "&v2=" + mj.ad + "&e=" + str2 + "&ct=" + (nf.aa * -410611811) + "&e=" + str2).openStream());
                dataInputStream.read();
                dataInputStream.close();
            }
        } catch (Exception e) {
        } catch (Throwable e2) {
            throw ba.ad(e2, "ah.af(" + ')');
        }
    }

    ah() {
        try {
            this.ae = -150217501;
            this.am = false;
            this.at = -1173565057;
            this.ab = 1937894897;
            this.aw = -1866650081;
            this.ai = 2017587569;
            this.az = -80393921;
            this.ah = -874856747;
            this.ak = -806271642;
        } catch (Throwable e) {
            throw ba.ad(e, "ah.<init>(" + ')');
        }
    }

    public static ah ab(int i) {
        ah ahVar = (ah) aa.af((long) i);
        if (ahVar == null) {
            byte[] an = af.an(12, i, -944548315);
            ahVar = new ah();
            if (an != null) {
                ahVar.ad(new ik(an), Byte.MIN_VALUE);
            }
            ahVar.aa((byte) -48);
            aa.an(ahVar, (long) i);
        }
        return ahVar;
    }

    public static ah am(int i) {
        ah ahVar = (ah) aa.af((long) i);
        if (ahVar == null) {
            byte[] an = af.an(12, i, -1378722540);
            ahVar = new ah();
            if (an != null) {
                ahVar.ad(new ik(an), (byte) -78);
            }
            ahVar.aa((byte) -93);
            aa.an(ahVar, (long) i);
        }
        return ahVar;
    }

    public static ah at(int i) {
        ah ahVar = (ah) aa.af((long) i);
        if (ahVar == null) {
            byte[] an = af.an(12, i, 14406420);
            ahVar = new ah();
            if (an != null) {
                ahVar.ad(new ik(an), (byte) -68);
            }
            ahVar.aa((byte) -126);
            aa.an(ahVar, (long) i);
        }
        return ahVar;
    }

    public static ah aw(int i) {
        ah ahVar = (ah) aa.af((long) i);
        if (ahVar == null) {
            byte[] an = af.an(12, i, -584430795);
            ahVar = new ah();
            if (an != null) {
                ahVar.ad(new ik(an), (byte) -127);
            }
            ahVar.aa((byte) -93);
            aa.an(ahVar, (long) i);
        }
        return ahVar;
    }

    void ad(ik ikVar, byte b) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    an(ikVar, ao, (byte) -50);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ah.ad(" + ')');
            }
        }
    }

    void ah(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                an(ikVar, ao, (byte) -15);
            } else {
                return;
            }
        }
    }

    void ai(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                an(ikVar, ao, (byte) 56);
            } else {
                return;
            }
        }
    }

    void az(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                an(ikVar, ao, (byte) -10);
            } else {
                return;
            }
        }
    }

    void ak(ik ikVar, int i) {
        int i2 = 0;
        int au;
        int i3;
        if (i == 1) {
            au = ikVar.au(-1912723060);
            this.ar = new int[au];
            for (i3 = 0; i3 < au; i3++) {
                this.ar[i3] = ikVar.au(-15018288);
            }
            this.ay = new int[au];
            for (i3 = 0; i3 < au; i3++) {
                this.ay[i3] = ikVar.au(-1708671057);
            }
            while (i2 < au) {
                this.ay[i2] = (ikVar.au(755123468) << 16) + this.ay[i2];
                i2++;
            }
        } else if (i == 2) {
            this.ae = ikVar.au(35763058) * 150217501;
        } else if (i == 3) {
            au = ikVar.ao((byte) 0);
            this.aq = new int[(au + 1)];
            for (i3 = 0; i3 < au; i3++) {
                this.aq[i3] = ikVar.ao((byte) 0);
            }
            this.aq[au] = 9999999;
        } else if (4 == i) {
            this.am = true;
        } else if (5 == i) {
            this.at = ikVar.ao((byte) 0) * 1483273907;
        } else if (i == 6) {
            this.ab = ikVar.au(-813061631) * -1937894897;
        } else if (7 == i) {
            this.aw = ikVar.au(-1439991392) * 1866650081;
        } else if (8 == i) {
            this.ai = ikVar.ao((byte) 0) * -1498043109;
        } else if (9 == i) {
            this.az = ikVar.ao((byte) 0) * 80393921;
        } else if (i == 10) {
            this.ah = ikVar.ao((byte) 0) * 874856747;
        } else if (11 == i) {
            this.ak = ikVar.ao((byte) 0) * 1744347827;
        } else if (12 == i) {
            au = ikVar.ao((byte) 0);
            this.as = new int[au];
            for (i3 = 0; i3 < au; i3++) {
                this.as[i3] = ikVar.au(167641097);
            }
            while (i2 < au) {
                this.as[i2] = (ikVar.au(-1891288220) << 16) + this.as[i2];
                i2++;
            }
        } else if (13 == i) {
            i3 = ikVar.ao((byte) 0);
            this.aj = new int[i3];
            while (i2 < i3) {
                this.aj[i2] = ikVar.ac(-1229170187);
                i2++;
            }
        }
    }

    void an(ik ikVar, int i, byte b) {
        int i2 = 0;
        int au;
        int i3;
        if (i == 1) {
            try {
                au = ikVar.au(864072125);
                this.ar = new int[au];
                for (i3 = 0; i3 < au; i3++) {
                    this.ar[i3] = ikVar.au(-880642634);
                }
                this.ay = new int[au];
                for (i3 = 0; i3 < au; i3++) {
                    this.ay[i3] = ikVar.au(-597712306);
                }
                while (i2 < au) {
                    this.ay[i2] = (ikVar.au(748703278) << 16) + this.ay[i2];
                    i2++;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ah.an(" + ')');
            }
        } else if (i == 2) {
            this.ae = ikVar.au(-1398535622) * 150217501;
        } else if (i == 3) {
            i3 = ikVar.ao((byte) 0);
            this.aq = new int[(i3 + 1)];
            while (i2 < i3) {
                this.aq[i2] = ikVar.ao((byte) 0);
                i2++;
            }
            this.aq[i3] = 9999999;
        } else if (4 == i) {
            this.am = true;
        } else if (5 == i) {
            this.at = ikVar.ao((byte) 0) * 1483273907;
        } else if (i == 6) {
            this.ab = ikVar.au(-1002959805) * -1937894897;
        } else if (7 == i) {
            this.aw = ikVar.au(323563078) * 1866650081;
        } else if (8 == i) {
            this.ai = ikVar.ao((byte) 0) * -1498043109;
        } else if (9 == i) {
            this.az = ikVar.ao((byte) 0) * 80393921;
        } else if (i == 10) {
            this.ah = ikVar.ao((byte) 0) * 874856747;
        } else if (11 == i) {
            this.ak = ikVar.ao((byte) 0) * 1744347827;
        } else if (12 == i) {
            au = ikVar.ao((byte) 0);
            this.as = new int[au];
            for (i3 = 0; i3 < au; i3++) {
                this.as[i3] = ikVar.au(-1932620543);
            }
            while (i2 < au) {
                this.as[i2] = (ikVar.au(1386619237) << 16) + this.as[i2];
                i2++;
            }
        } else if (13 == i) {
            i3 = ikVar.ao((byte) 0);
            this.aj = new int[i3];
            while (i2 < i3) {
                this.aj[i2] = ikVar.ac(-1878861195);
                i2++;
            }
        }
    }

    void ao(ik ikVar, int i) {
        int i2 = 0;
        int au;
        int i3;
        if (i == 1) {
            au = ikVar.au(-484330497);
            this.ar = new int[au];
            for (i3 = 0; i3 < au; i3++) {
                this.ar[i3] = ikVar.au(880026317);
            }
            this.ay = new int[au];
            for (i3 = 0; i3 < au; i3++) {
                this.ay[i3] = ikVar.au(-1221743541);
            }
            while (i2 < au) {
                this.ay[i2] = (ikVar.au(1433722980) << 16) + this.ay[i2];
                i2++;
            }
        } else if (i == 2) {
            this.ae = ikVar.au(-767446789) * 150217501;
        } else if (i == 3) {
            au = ikVar.ao((byte) 0);
            this.aq = new int[(au + 1)];
            for (i3 = 0; i3 < au; i3++) {
                this.aq[i3] = ikVar.ao((byte) 0);
            }
            this.aq[au] = 9999999;
        } else if (4 == i) {
            this.am = true;
        } else if (5 == i) {
            this.at = ikVar.ao((byte) 0) * 1483273907;
        } else if (i == 6) {
            this.ab = ikVar.au(-387515971) * -1937894897;
        } else if (7 == i) {
            this.aw = ikVar.au(-1153874738) * 1866650081;
        } else if (8 == i) {
            this.ai = ikVar.ao((byte) 0) * -869668217;
        } else if (9 == i) {
            this.az = ikVar.ao((byte) 0) * 80393921;
        } else if (i == 10) {
            this.ah = ikVar.ao((byte) 0) * 1356931722;
        } else if (11 == i) {
            this.ak = ikVar.ao((byte) 0) * 1744347827;
        } else if (12 == i) {
            au = ikVar.ao((byte) 0);
            this.as = new int[au];
            for (i3 = 0; i3 < au; i3++) {
                this.as[i3] = ikVar.au(-938184445);
            }
            while (i2 < au) {
                this.as[i2] = (ikVar.au(-417661122) << 16) + this.as[i2];
                i2++;
            }
        } else if (13 == i) {
            i3 = ikVar.ao((byte) 0);
            this.aj = new int[i3];
            while (i2 < i3) {
                this.aj[i2] = ikVar.ac(1406364270);
                i2++;
            }
        }
    }

    void aa(byte b) {
        try {
            if (-920725183 * this.az == -1) {
                if (this.aq != null) {
                    this.az = 160787842;
                } else {
                    this.az = 0;
                }
            }
            if (this.ah * -990546557 != -1) {
                return;
            }
            if (this.aq != null) {
                this.ah = 1749713494;
            } else {
                this.ah = 0;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ah.aa(" + ')');
        }
    }

    void au() {
        if (-920725183 * this.az == -1) {
            if (this.aq != null) {
                this.az = 160787842;
            } else {
                this.az = 0;
            }
        }
        if (this.ah * -990546557 != -1) {
            return;
        }
        if (this.aq != null) {
            this.ah = 1749713494;
        } else {
            this.ah = 0;
        }
    }

    void av() {
        if (1237382319 * this.az == -1) {
            if (this.aq != null) {
                this.az = 160787842;
            } else {
                this.az = 0;
            }
        }
        if (this.ah * -990546557 != -1) {
            return;
        }
        if (this.aq != null) {
            this.ah = 1188738486;
        } else {
            this.ah = 0;
        }
    }

    void ax() {
        if (-920725183 * this.az == -1) {
            if (this.aq != null) {
                this.az = 160787842;
            } else {
                this.az = 0;
            }
        }
        if (this.ah * -990546557 != -1) {
            return;
        }
        if (this.aq != null) {
            this.ah = 1023968494;
        } else {
            this.ah = 0;
        }
    }

    public cl ac(cl clVar, int i) {
        boolean z = true;
        int i2 = this.ay[i];
        ba ae = ht.ae(i2 >> 16, (byte) -78);
        i2 &= 65535;
        if (ae == null) {
            return clVar.ad(true);
        }
        if (ae.ad(i2, (byte) -124)) {
            z = false;
        }
        cl ad = clVar.ad(z);
        ad.ae(ae, i2);
        return ad;
    }

    public cl ag(cl clVar, int i, byte b) {
        boolean z = true;
        try {
            int i2 = this.ay[i];
            ba ae = ht.ae(i2 >> 16, (byte) -123);
            i2 &= 65535;
            if (ae == null) {
                return clVar.ad(true);
            }
            if (ae.ad(i2, (byte) -8)) {
                z = false;
            }
            cl ad = clVar.ad(z);
            ad.ae(ae, i2);
            return ad;
        } catch (Throwable e) {
            throw ba.ad(e, "ah.ag(" + ')');
        }
    }

    public cl al(cl clVar, int i) {
        boolean z = true;
        int i2 = this.ay[i];
        ba ae = ht.ae(i2 >> 16, (byte) -55);
        i2 &= 65535;
        if (ae == null) {
            return clVar.ad(true);
        }
        if (ae.ad(i2, (byte) -78)) {
            z = false;
        }
        cl ad = clVar.ad(z);
        ad.ae(ae, i2);
        return ad;
    }

    public cl ap(cl clVar, int i) {
        boolean z = true;
        int i2 = this.ay[i];
        ba ae = ht.ae(i2 >> 16, (byte) -35);
        i2 &= 927476169;
        if (ae == null) {
            return clVar.ad(true);
        }
        if (ae.ad(i2, (byte) -42)) {
            z = false;
        }
        cl ad = clVar.ad(z);
        ad.ae(ae, i2);
        return ad;
    }

    cl ay(cl clVar, int i, int i2, byte b) {
        try {
            int i3 = this.ay[i];
            ba ae = ht.ae(i3 >> 16, (byte) -3);
            int i4 = 65535 & i3;
            if (ae == null) {
                return clVar.ad(true);
            }
            cl ad = clVar.ad(!ae.ad(i4, (byte) -108));
            int i5 = i2 & 3;
            if (i5 == 1) {
                ad.aw();
            } else if (2 == i5) {
                ad.ab();
            } else if (3 == i5) {
                ad.at();
            }
            ad.ae(ae, i4);
            if (i5 == 1) {
                ad.at();
                return ad;
            } else if (2 == i5) {
                ad.ab();
                return ad;
            } else if (3 != i5) {
                return ad;
            } else {
                ad.aw();
                return ad;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ah.ay(" + ')');
        }
    }

    cl bb(cl clVar, int i, int i2) {
        int i3 = this.ay[i];
        ba ae = ht.ae(i3 >> 16, (byte) -1);
        int i4 = 65535 & i3;
        if (ae == null) {
            return clVar.ad(true);
        }
        boolean z;
        if (ae.ad(i4, (byte) -60)) {
            z = false;
        } else {
            z = true;
        }
        cl ad = clVar.ad(z);
        int i5 = i2 & 3;
        if (i5 == 1) {
            ad.aw();
        } else if (2 == i5) {
            ad.ab();
        } else if (3 == i5) {
            ad.at();
        }
        ad.ae(ae, i4);
        if (i5 == 1) {
            ad.at();
            return ad;
        } else if (2 == i5) {
            ad.ab();
            return ad;
        } else if (3 != i5) {
            return ad;
        } else {
            ad.aw();
            return ad;
        }
    }

    cl bc(cl clVar, int i, int i2) {
        int i3 = this.ay[i];
        ba ae = ht.ae(i3 >> 16, (byte) -113);
        int i4 = 65535 & i3;
        if (ae == null) {
            return clVar.ad(true);
        }
        cl ad = clVar.ad(!ae.ad(i4, (byte) -114));
        int i5 = i2 & 3;
        if (i5 == 1) {
            ad.aw();
        } else if (2 == i5) {
            ad.ab();
        } else if (3 == i5) {
            ad.at();
        }
        ad.ae(ae, i4);
        if (i5 == 1) {
            ad.at();
            return ad;
        } else if (2 == i5) {
            ad.ab();
            return ad;
        } else if (3 != i5) {
            return ad;
        } else {
            ad.aw();
            return ad;
        }
    }

    cl bw(cl clVar, int i, int i2) {
        int i3 = this.ay[i];
        ba ae = ht.ae(i3 >> 16, (byte) -124);
        int i4 = 65535 & i3;
        if (ae == null) {
            return clVar.ad(true);
        }
        cl ad = clVar.ad(!ae.ad(i4, (byte) -21));
        int i5 = i2 & 3;
        if (i5 == 1) {
            ad.aw();
        } else if (2 == i5) {
            ad.ab();
        } else if (3 == i5) {
            ad.at();
        }
        ad.ae(ae, i4);
        if (i5 == 1) {
            ad.at();
            return ad;
        } else if (2 == i5) {
            ad.ab();
            return ad;
        } else if (3 != i5) {
            return ad;
        } else {
            ad.aw();
            return ad;
        }
    }

    cl as(cl clVar, int i, byte b) {
        boolean z = true;
        try {
            int i2 = this.ay[i];
            ba ae = ht.ae(i2 >> 16, (byte) -13);
            i2 &= 65535;
            if (ae == null) {
                return clVar.an(true);
            }
            if (ae.ad(i2, (byte) -121)) {
                z = false;
            }
            cl an = clVar.an(z);
            an.ae(ae, i2);
            return an;
        } catch (Throwable e) {
            throw ba.ad(e, "ah.as(" + ')');
        }
    }

    cl bz(cl clVar, int i) {
        boolean z = true;
        int i2 = this.ay[i];
        ba ae = ht.ae(i2 >> 16, (byte) -76);
        i2 &= 65535;
        if (ae == null) {
            return clVar.an(true);
        }
        if (ae.ad(i2, (byte) -111)) {
            z = false;
        }
        cl an = clVar.an(z);
        an.ae(ae, i2);
        return an;
    }

    public cl ar(cl clVar, int i, ah ahVar, int i2, int i3) {
        int i4 = 1;
        boolean z = false;
        try {
            int i5 = this.ay[i];
            ba ae = ht.ae(i5 >> 16, (byte) -31);
            i5 &= 65535;
            if (ae == null) {
                return ahVar.ag(clVar, i2, (byte) -8);
            }
            int i6 = ahVar.ay[i2];
            ba ae2 = ht.ae(i6 >> 16, (byte) -83);
            i6 &= 65535;
            cl ad;
            if (ae2 == null) {
                if (!ae.ad(i5, (byte) -22)) {
                    z = true;
                }
                ad = clVar.ad(z);
                ad.ae(ae, i5);
                return ad;
            }
            int i7;
            if (ae.ad(i5, (byte) 36)) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            if (ae2.ad(i6, (byte) -14)) {
                i4 = 0;
            }
            ad = clVar.ad(i4 & i7);
            ad.aq(ae, i5, ae2, i6, this.aq);
            return ad;
        } catch (Throwable e) {
            throw ba.ad(e, "ah.ar(" + ')');
        }
    }

    public cl bg(cl clVar, int i, ah ahVar, int i2) {
        int i3 = 1;
        int i4 = this.ay[i];
        ba ae = ht.ae(i4 >> 16, (byte) -47);
        int i5 = i4 & 65535;
        if (ae == null) {
            return ahVar.ag(clVar, i2, (byte) 18);
        }
        i4 = ahVar.ay[i2];
        ba ae2 = ht.ae(i4 >> 16, (byte) -33);
        int i6 = i4 & 65535;
        if (ae2 == null) {
            boolean z;
            if (ae.ad(i5, (byte) -70)) {
                z = false;
            }
            cl ad = clVar.ad(z);
            ad.ae(ae, i5);
            return ad;
        }
        if (ae.ad(i5, (byte) -44)) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (ae2.ad(i6, (byte) -117)) {
            i3 = 0;
        }
        ad = clVar.ad(i4 & i3);
        ad.aq(ae, i5, ae2, i6, this.aq);
        return ad;
    }

    public cl aj(cl clVar, int i, int i2) {
        int i3 = true;
        try {
            int i4 = this.ay[i];
            ba ae = ht.ae(i4 >> 16, (byte) -48);
            int i5 = i4 & 65535;
            if (ae == null) {
                return clVar.ad(true);
            }
            int i6;
            ba baVar;
            if (this.as == null || i >= this.as.length) {
                i6 = 0;
                baVar = null;
            } else {
                i4 = this.as[i];
                baVar = ht.ae(i4 >> 16, (byte) -48);
                i6 = i4 & 65535;
            }
            cl ad;
            if (baVar == null || 65535 == i6) {
                boolean z;
                if (ae.ad(i5, (byte) -35)) {
                    z = false;
                }
                ad = clVar.ad(z);
                ad.ae(ae, i5);
                return ad;
            }
            if (ae.ad(i5, (byte) -113)) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            if (baVar.ad(i6, (byte) -65)) {
                i3 = 0;
            }
            ad = clVar.ad(i3 & i4);
            ad.ae(ae, i5);
            ad.ae(baVar, i6);
            return ad;
        } catch (Throwable e) {
            throw ba.ad(e, "ah.aj(" + ')');
        }
    }

    public cl bf(cl clVar, int i) {
        int i2 = false;
        int i3 = this.ay[i];
        ba ae = ht.ae(i3 >> 16, (byte) -123);
        int i4 = i3 & 65535;
        if (ae == null) {
            return clVar.ad(true);
        }
        int i5;
        ba baVar;
        if (this.as == null || i >= this.as.length) {
            i5 = 0;
            baVar = null;
        } else {
            i3 = this.as[i];
            baVar = ht.ae(i3 >> 16, (byte) -102);
            i5 = i3 & 65535;
        }
        if (baVar == null || 65535 == i5) {
            boolean z;
            if (!ae.ad(i4, (byte) -3)) {
                z = true;
            }
            cl ad = clVar.ad(z);
            ad.ae(ae, i4);
            return ad;
        }
        if (ae.ad(i4, (byte) 14)) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (!baVar.ad(i5, (byte) -85)) {
            i2 = 1;
        }
        ad = clVar.ad(i2 & i3);
        ad.ae(ae, i4);
        ad.ae(baVar, i5);
        return ad;
    }

    public cl bh(cl clVar, int i) {
        boolean z = true;
        int i2 = 0;
        int i3 = this.ay[i];
        ba ae = ht.ae(i3 >> 16, (byte) -11);
        int i4 = i3 & 65535;
        if (ae == null) {
            return clVar.ad(true);
        }
        int i5;
        ba baVar;
        if (this.as == null || i >= this.as.length) {
            i5 = 0;
            baVar = null;
        } else {
            i3 = this.as[i];
            baVar = ht.ae(i3 >> 16, (byte) -115);
            i5 = i3 & 65535;
        }
        if (baVar == null || 65535 == i5) {
            if (ae.ad(i4, (byte) -77)) {
                z = false;
            }
            cl ad = clVar.ad(z);
            ad.ae(ae, i4);
            return ad;
        }
        i3 = !ae.ad(i4, (byte) -5) ? 1 : 0;
        if (!baVar.ad(i5, (byte) 23)) {
            i2 = 1;
        }
        ad = clVar.ad(i3 & i2);
        ad.ae(ae, i4);
        ad.ae(baVar, i5);
        return ad;
    }

    static ba bp(int i) {
        ba baVar = (ba) ag.af((long) i);
        if (baVar == null) {
            baVar = dk.af(ad, an, i, false, (byte) 1);
            if (baVar != null) {
                ag.an(baVar, (long) i);
            }
        }
        return baVar;
    }

    static ba bv(int i) {
        ba baVar = (ba) ag.af((long) i);
        if (baVar == null) {
            baVar = dk.af(ad, an, i, false, (byte) 1);
            if (baVar != null) {
                ag.an(baVar, (long) i);
            }
        }
        return baVar;
    }

    public static void bt(Collection collection) {
        collection.add(aa);
        collection.add(ag);
    }

    public static void bu(Collection collection) {
        collection.add(aa);
        collection.add(ag);
    }

    public static void bx(Collection collection) {
        collection.add(aa);
        collection.add(ag);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int ah(int r18, p000.gk r19, boolean r20, int r21) {
        /*
        r2 = 4100; // 0x1004 float:5.745E-42 double:2.0257E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x00de;
    L_0x0006:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 - r5;
        p000.hr.ar = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r5 = r5 + r6;
        p000.hr.ae = r5;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x03f9 }
        r6.<init>();	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r6.append(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x03f9 }
        r4[r5] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
    L_0x004a:
        return r2;
    L_0x004b:
        r5 = 8364; // 0x20ac float:1.172E-41 double:4.1324E-320;
        if (r2 == r5) goto L_0x005f;
    L_0x004f:
        r5 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r2 == r5) goto L_0x005f;
    L_0x0053:
        r5 = 8212; // 0x2014 float:1.1507E-41 double:4.0573E-320;
        if (r5 == r2) goto L_0x005f;
    L_0x0057:
        r5 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r5 == r2) goto L_0x005f;
    L_0x005b:
        r5 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        if (r2 != r5) goto L_0x076b;
    L_0x005f:
        r2 = 1;
    L_0x0060:
        if (r2 == 0) goto L_0x076e;
    L_0x0062:
        r2 = 1;
    L_0x0063:
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x0067:
        r2 = 4104; // 0x1008 float:5.751E-42 double:2.0276E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x039f;
    L_0x006d:
        r2 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r6 = 11745; // 0x2de1 float:1.6458E-41 double:5.803E-320;
        r2 = (long) r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2 + r6;
        r2 = r2 * r4;
        r4 = p000.hr.aw;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = new java.util.Date;	 Catch:{ RuntimeException -> 0x03f9 }
        r5.<init>(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r4.setTime(r5);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = p000.hr.aw;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 5;
        r2 = r2.get(r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.aw;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 2;
        r3 = r3.get(r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.aw;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 1;
        r4 = r4.get(r5);	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r6 = r6 + r7;
        p000.hr.ae = r6;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x03f9 }
        r7.<init>();	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r7.append(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = "-";
        r2 = r2.append(r7);	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = p000.hr.ai;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = r7[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = "-";
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.append(r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x03f9 }
        r5[r6] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x00de:
        r2 = 4101; // 0x1005 float:5.747E-42 double:2.026E-320;
        r0 = r18;
        if (r2 != r0) goto L_0x0203;
    L_0x00e4:
        r2 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r2 = r2 - r3;
        p000.hr.ae = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + 1;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r5 = r5 + r6;
        p000.hr.ae = r5;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x03f9 }
        r6.<init>();	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r6.append(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x03f9 }
        r4[r5] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x0128:
        r2 = 4110; // 0x100e float:5.76E-42 double:2.0306E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x0453;
    L_0x012e:
        r2 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r2 = r2 - r3;
        p000.hr.ae = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + 1;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r5 = r5 - r6;
        p000.hr.ar = r5;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 1;
        if (r4 != r5) goto L_0x071a;
    L_0x015f:
        r3 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        p000.hr.ae = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
    L_0x0171:
        r2 = 1;
        goto L_0x004a;
    L_0x0174:
        r2 = 4107; // 0x100b float:5.755E-42 double:2.029E-320;
        r0 = r18;
        if (r2 != r0) goto L_0x052b;
    L_0x017a:
        r2 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r2 = r2 - r3;
        p000.hr.ae = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r8 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        p000.hr.ar = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r9 = r2 + -1;
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = r3 * r4;
        r10 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = r3 * r4;
        r3 = r3 + 1;
        r11 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = -1387037251; // 0xffffffffad537dbd float:-1.2021881E-11 double:NaN;
        r3 = p000.client.aq;	 Catch:{ RuntimeException -> 0x03f9 }
        r12 = r2 * r3;
        r13 = r10.length();	 Catch:{ RuntimeException -> 0x03f9 }
        r14 = r11.length();	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
    L_0x01bb:
        r6 = r5 - r3;
        if (r6 < r13) goto L_0x0482;
    L_0x01bf:
        r6 = r4 - r2;
        if (r6 < r14) goto L_0x0482;
    L_0x01c3:
        r3 = java.lang.Math.min(r13, r14);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 0;
    L_0x01c8:
        if (r2 >= r3) goto L_0x0638;
    L_0x01ca:
        r4 = r10.charAt(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = r11.charAt(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        if (r5 == r4) goto L_0x0716;
    L_0x01d4:
        r6 = java.lang.Character.toUpperCase(r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = java.lang.Character.toUpperCase(r5);	 Catch:{ RuntimeException -> 0x03f9 }
        if (r6 == r7) goto L_0x0716;
    L_0x01de:
        r4 = java.lang.Character.toLowerCase(r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = java.lang.Character.toLowerCase(r5);	 Catch:{ RuntimeException -> 0x03f9 }
        if (r5 == r4) goto L_0x0716;
    L_0x01e8:
        r2 = 287566383; // 0x1123ea2f float:1.2930596E-28 double:1.420766707E-315;
        r2 = p000.mj.ad(r4, r12, r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 1089458405; // 0x40efd0e5 float:7.49425 double:5.382639705E-315;
        r3 = p000.mj.ad(r5, r12, r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2 - r3;
    L_0x01f7:
        r3 = -1995248940; // 0xffffffff8912ead4 float:-1.7684526E-33 double:NaN;
        r2 = p000.cz.aw(r2, r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r8[r9] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x0203:
        r2 = 4102; // 0x1006 float:5.748E-42 double:2.0267E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x028b;
    L_0x0209:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 - r5;
        p000.hr.ar = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r5 = r5 + r6;
        p000.hr.ae = r5;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x03f9 }
        r6.<init>();	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r6.append(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = 1;
        r7 = -1809644762; // 0xffffffff94230326 float:-8.230018E-27 double:NaN;
        r3 = p000.bh.ag(r3, r6, r7);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x03f9 }
        r4[r5] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x0257:
        r2 = 4116; // 0x1014 float:5.768E-42 double:2.0336E-320;
        r0 = r18;
        if (r2 != r0) goto L_0x0779;
    L_0x025d:
        r2 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        p000.hr.ar = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2 = (char) r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 5;
        r2 = p000.ha.ae(r2, r5);	 Catch:{ RuntimeException -> 0x03f9 }
        if (r2 == 0) goto L_0x0776;
    L_0x0285:
        r2 = 1;
    L_0x0286:
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x028b:
        r2 = 4103; // 0x1007 float:5.75E-42 double:2.027E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x0067;
    L_0x0291:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        p000.hr.ae = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2 = r2.toLowerCase();	 Catch:{ RuntimeException -> 0x03f9 }
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x02ba:
        r2 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r2 != r6) goto L_0x02fd;
    L_0x02be:
        r2 = 69;
    L_0x02c0:
        r3 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        if (r3 != r4) goto L_0x05bf;
    L_0x02c4:
        r3 = 69;
    L_0x02c6:
        r15 = -1097987312; // 0xffffffffbe8e0b10 float:-0.27742815 double:NaN;
        r6 = p000.ew.af(r6, r12, r15);	 Catch:{ RuntimeException -> 0x03f9 }
        r15 = -459135418; // 0xffffffffe4a22646 float:-2.3929043E22 double:NaN;
        r4 = p000.ew.af(r4, r12, r15);	 Catch:{ RuntimeException -> 0x03f9 }
        if (r6 == r4) goto L_0x051f;
    L_0x02d6:
        r15 = java.lang.Character.toUpperCase(r6);	 Catch:{ RuntimeException -> 0x03f9 }
        r16 = java.lang.Character.toUpperCase(r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r0 = r16;
        if (r15 == r0) goto L_0x051f;
    L_0x02e2:
        r6 = java.lang.Character.toLowerCase(r6);	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = java.lang.Character.toLowerCase(r4);	 Catch:{ RuntimeException -> 0x03f9 }
        if (r4 == r6) goto L_0x051f;
    L_0x02ec:
        r2 = 293012825; // 0x11770559 float:1.9486512E-28 double:1.447675706E-315;
        r2 = p000.mj.ad(r6, r12, r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 194271199; // 0xb9457df float:5.713974E-32 double:9.59827254E-316;
        r3 = p000.mj.ad(r4, r12, r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2 - r3;
        goto L_0x01f7;
    L_0x02fd:
        r2 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r6 != r2) goto L_0x0528;
    L_0x0301:
        r2 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x02c0;
    L_0x0304:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 + r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = r5.toString();	 Catch:{ RuntimeException -> 0x03f9 }
        r2[r3] = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x031d:
        r2 = 4118; // 0x1016 float:5.77E-42 double:2.0346E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x0587;
    L_0x0323:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r3 = r3 - r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r5 = r5 * r6;
        r5 = r5 + 1;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r6 = r6 + r7;
        p000.hr.ae = r6;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r2 = r2.substring(r3, r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r5[r6] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x036a:
        r2 = 4114; // 0x1012 float:5.765E-42 double:2.0326E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x06e0;
    L_0x0370:
        r2 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        p000.hr.ar = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2 = (char) r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r2 = p000.ik.aq(r2, r5);	 Catch:{ RuntimeException -> 0x03f9 }
        if (r2 == 0) goto L_0x0771;
    L_0x0399:
        r2 = 1;
    L_0x039a:
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x039f:
        r2 = 4105; // 0x1009 float:5.752E-42 double:2.028E-320;
        r0 = r18;
        if (r2 != r0) goto L_0x0414;
    L_0x03a5:
        r2 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r2 = r2 - r3;
        p000.hr.ae = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + 1;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.gf.ho;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = r4.ad;	 Catch:{ RuntimeException -> 0x03f9 }
        if (r4 == 0) goto L_0x03e6;
    L_0x03c9:
        r4 = p000.gf.ho;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = r4.ad;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = r4.an;	 Catch:{ RuntimeException -> 0x03f9 }
        if (r4 == 0) goto L_0x03e6;
    L_0x03d1:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        p000.hr.ae = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2[r4] = r3;	 Catch:{ RuntimeException -> 0x03f9 }
    L_0x03e3:
        r2 = 1;
        goto L_0x004a;
    L_0x03e6:
        r3 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        p000.hr.ae = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        goto L_0x03e3;
    L_0x03f9:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "ah.ah(";
        r3 = r3.append(r4);
        r4 = 41;
        r3 = r3.append(r4);
        r3 = r3.toString();
        r2 = p000.ba.ad(r2, r3);
        throw r2;
    L_0x0414:
        r2 = 4106; // 0x100a float:5.754E-42 double:2.0286E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x0174;
    L_0x041a:
        r2 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        p000.hr.ae = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2 = java.lang.Integer.toString(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x0443:
        if (r3 == 0) goto L_0x04fb;
    L_0x0445:
        r6 = r3;
        r7 = r5;
    L_0x0447:
        if (r2 == 0) goto L_0x050d;
    L_0x0449:
        r5 = r4;
        r4 = r2;
    L_0x044b:
        r2 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        if (r2 != r6) goto L_0x0517;
    L_0x044f:
        r2 = 69;
        goto L_0x02c0;
    L_0x0453:
        r2 = 4111; // 0x100f float:5.761E-42 double:2.031E-320;
        r0 = r18;
        if (r2 != r0) goto L_0x05eb;
    L_0x0459:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        p000.hr.ae = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2 = p000.lr.ar(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x0482:
        r6 = r5 - r3;
        if (r6 < r13) goto L_0x04d6;
    L_0x0486:
        r2 = -1;
        goto L_0x01f7;
    L_0x0489:
        r2 = 4121; // 0x1019 float:5.775E-42 double:2.036E-320;
        r0 = r18;
        if (r2 != r0) goto L_0x05e2;
    L_0x048f:
        r2 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r2 = r2 - r3;
        p000.hr.ae = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + 1;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r5 = r5 - r6;
        p000.hr.ar = r5;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r6 = r6 + r7;
        p000.hr.ar = r6;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r2 = r2.indexOf(r3, r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r5[r6] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x04d6:
        r6 = r4 - r2;
        if (r6 < r14) goto L_0x0443;
    L_0x04da:
        r2 = 1;
        goto L_0x01f7;
    L_0x04dd:
        r2 = 0;
    L_0x04de:
        if (r2 >= r3) goto L_0x0681;
    L_0x04e0:
        r4 = r10.charAt(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = r11.charAt(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        if (r5 == r4) goto L_0x067d;
    L_0x04ea:
        r2 = -118366639; // 0xfffffffff8f1de51 float:-3.9245395E34 double:NaN;
        r2 = p000.mj.ad(r4, r12, r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = -973674585; // 0xffffffffc5f6e7a7 float:-7900.9565 double:NaN;
        r3 = p000.mj.ad(r5, r12, r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2 - r3;
        goto L_0x01f7;
    L_0x04fb:
        r6 = r5 + 1;
        r3 = r10.charAt(r5);	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = r6;
        r6 = r3;
        goto L_0x0447;
    L_0x0505:
        r2 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        if (r2 != r6) goto L_0x02ba;
    L_0x0509:
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x02c0;
    L_0x050d:
        r3 = r4 + 1;
        r2 = r11.charAt(r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = r2;
        r5 = r3;
        goto L_0x044b;
    L_0x0517:
        r2 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        if (r6 != r2) goto L_0x0505;
    L_0x051b:
        r2 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x02c0;
    L_0x051f:
        r4 = r5;
        r5 = r7;
        r17 = r3;
        r3 = r2;
        r2 = r17;
        goto L_0x01bb;
    L_0x0528:
        r2 = 0;
        goto L_0x02c0;
    L_0x052b:
        r2 = 4108; // 0x100c float:5.757E-42 double:2.0296E-320;
        r0 = r18;
        if (r2 != r0) goto L_0x0684;
    L_0x0531:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r3 = r3 - r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r6 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = r5 * r6;
        r5 = r5 + 1;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.au.ck;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = 0;
        r7 = -186043853; // 0xfffffffff4e93233 float:-1.4780558E32 double:NaN;
        r4 = r5.an(r4, r6, r7);	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = new lr;	 Catch:{ RuntimeException -> 0x03f9 }
        r5.<init>(r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r6 = r6 + r7;
        p000.hr.ar = r6;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r2 = r5.as(r2, r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r4[r6] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x0587:
        r2 = 4119; // 0x1017 float:5.772E-42 double:2.035E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x063e;
    L_0x058d:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r4 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r4.length();	 Catch:{ RuntimeException -> 0x03f9 }
        r5.<init>(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = 0;
        r2 = 0;
        r17 = r2;
        r2 = r3;
        r3 = r17;
    L_0x05ad:
        r6 = r4.length();	 Catch:{ RuntimeException -> 0x03f9 }
        if (r3 >= r6) goto L_0x0304;
    L_0x05b3:
        r6 = r4.charAt(r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = 60;
        if (r6 != r7) goto L_0x07be;
    L_0x05bb:
        r2 = 1;
    L_0x05bc:
        r3 = r3 + 1;
        goto L_0x05ad;
    L_0x05bf:
        r3 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        if (r4 != r3) goto L_0x05c7;
    L_0x05c3:
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x02c6;
    L_0x05c7:
        r3 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        if (r4 != r3) goto L_0x05cf;
    L_0x05cb:
        r3 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x02c6;
    L_0x05cf:
        r3 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r4 != r3) goto L_0x05d7;
    L_0x05d3:
        r3 = 69;
        goto L_0x02c6;
    L_0x05d7:
        r3 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r3 != r4) goto L_0x05df;
    L_0x05db:
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x02c6;
    L_0x05df:
        r3 = 0;
        goto L_0x02c6;
    L_0x05e2:
        r2 = 2;
        goto L_0x004a;
    L_0x05e5:
        if (r2 != 0) goto L_0x05bc;
    L_0x05e7:
        r5.append(r6);	 Catch:{ RuntimeException -> 0x03f9 }
        goto L_0x05bc;
    L_0x05eb:
        r2 = 4112; // 0x1010 float:5.762E-42 double:2.0316E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x072e;
    L_0x05f1:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 - r5;
        p000.hr.ar = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r5 = r5 + r6;
        p000.hr.ae = r5;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x03f9 }
        r6.<init>();	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r6.append(r2);	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = (char) r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.append(r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x03f9 }
        r4[r5] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x0638:
        r2 = r13 - r14;
        if (r2 == 0) goto L_0x04dd;
    L_0x063c:
        goto L_0x01f7;
    L_0x063e:
        r2 = 4120; // 0x1018 float:5.773E-42 double:2.0356E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x0489;
    L_0x0644:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 - r5;
        p000.hr.ar = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r5 = r5 + r6;
        p000.hr.ar = r5;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r2 = r2.indexOf(r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r4[r5] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x067d:
        r2 = r2 + 1;
        goto L_0x04de;
    L_0x0681:
        r2 = 0;
        goto L_0x01f7;
    L_0x0684:
        r2 = 4109; // 0x100d float:5.758E-42 double:2.03E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x0128;
    L_0x068a:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r3 = r3 - r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r5 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = r4 * r5;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r5 = r5 * r6;
        r5 = r5 + 1;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = p000.au.ck;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = 0;
        r7 = -60937696; // 0xfffffffffc5e2a20 float:-4.6141772E36 double:NaN;
        r4 = r5.an(r4, r6, r7);	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = new lr;	 Catch:{ RuntimeException -> 0x03f9 }
        r5.<init>(r4);	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r6 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r6 = r6 + r7;
        p000.hr.ar = r6;	 Catch:{ RuntimeException -> 0x03f9 }
        r7 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r2 = r5.ay(r2, r3);	 Catch:{ RuntimeException -> 0x03f9 }
        r4[r6] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x06e0:
        r2 = 4115; // 0x1013 float:5.766E-42 double:2.033E-320;
        r0 = r18;
        if (r2 != r0) goto L_0x0257;
    L_0x06e6:
        r2 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        p000.hr.ar = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2 = (char) r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 51550529; // 0x3129941 float:4.308147E-37 double:2.54693454E-316;
        r2 = p000.cz.aj(r2, r5);	 Catch:{ RuntimeException -> 0x03f9 }
        if (r2 == 0) goto L_0x0774;
    L_0x0710:
        r2 = 1;
    L_0x0711:
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r2 = 1;
        goto L_0x004a;
    L_0x0716:
        r2 = r2 + 1;
        goto L_0x01c8;
    L_0x071a:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        p000.hr.ae = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2[r4] = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        goto L_0x0171;
    L_0x072e:
        r2 = 4113; // 0x1011 float:5.764E-42 double:2.032E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x036a;
    L_0x0734:
        r2 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        p000.hr.ar = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2 = (char) r2;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 32;
        if (r2 < r5) goto L_0x0760;
    L_0x0759:
        r5 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r2 > r5) goto L_0x0760;
    L_0x075d:
        r2 = 1;
        goto L_0x0060;
    L_0x0760:
        r5 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        if (r2 < r5) goto L_0x004b;
    L_0x0764:
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r2 > r5) goto L_0x004b;
    L_0x0768:
        r2 = 1;
        goto L_0x0060;
    L_0x076b:
        r2 = 0;
        goto L_0x0060;
    L_0x076e:
        r2 = 0;
        goto L_0x0063;
    L_0x0771:
        r2 = 0;
        goto L_0x039a;
    L_0x0774:
        r2 = 0;
        goto L_0x0711;
    L_0x0776:
        r2 = 0;
        goto L_0x0286;
    L_0x0779:
        r2 = 4117; // 0x1015 float:5.769E-42 double:2.034E-320;
        r0 = r18;
        if (r0 != r2) goto L_0x031d;
    L_0x077f:
        r2 = p000.hr.aj;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ae;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 - r4;
        p000.hr.ae = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x03f9 }
        if (r2 == 0) goto L_0x07aa;
    L_0x0791:
        r3 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        p000.hr.ar = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r2 = r2.length();	 Catch:{ RuntimeException -> 0x03f9 }
        r3[r4] = r2;	 Catch:{ RuntimeException -> 0x03f9 }
    L_0x07a7:
        r2 = 1;
        goto L_0x004a;
    L_0x07aa:
        r2 = p000.hr.as;	 Catch:{ RuntimeException -> 0x03f9 }
        r3 = p000.hr.ar;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 + r4;
        p000.hr.ar = r3;	 Catch:{ RuntimeException -> 0x03f9 }
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = 0;
        r2[r3] = r4;	 Catch:{ RuntimeException -> 0x03f9 }
        goto L_0x07a7;
    L_0x07be:
        r7 = 62;
        if (r7 != r6) goto L_0x05e5;
    L_0x07c2:
        r2 = 0;
        goto L_0x05bc;
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.ah(int, gk, boolean, int):int");
    }

    static final void dg(int i, int i2, byte b) {
        try {
            kg kgVar = client.ik[-1674539149 * dq.hf][i][i2];
            if (kgVar == null) {
                gp.en.au(dq.hf * -1674539149, i, i2);
                return;
            }
            kd kdVar = null;
            long j = -99999999;
            for (kd kdVar2 = (hb) kgVar.as(); kdVar2 != null; kdVar2 = (hb) kgVar.aj()) {
                long j2;
                kd kdVar3;
                ax af = cm.af(kdVar2.af * -15746003, 1518230888);
                long j3 = (long) (af.bg * 116446285);
                if (1 == af.bz * 1099170281) {
                    j3 *= (long) ((1071269889 * kdVar2.ad) + 1);
                }
                if (j3 > j) {
                    kd kdVar4 = kdVar2;
                    j2 = j3;
                    kdVar3 = kdVar4;
                } else {
                    kdVar3 = kdVar;
                    j2 = j;
                }
                kdVar = kdVar3;
                j = j2;
            }
            if (kdVar == null) {
                gp.en.au(-1674539149 * dq.hf, i, i2);
                return;
            }
            kgVar.an(kdVar);
            cq cqVar = null;
            cq cqVar2 = null;
            for (cq cqVar3 = (hb) kgVar.as(); cqVar3 != null; hb hbVar = (hb) kgVar.aj()) {
                if (-15746003 * cqVar3.af != kdVar.af * -15746003) {
                    if (cqVar == null) {
                        cqVar = cqVar3;
                    }
                    if (-15746003 * cqVar3.af != -15746003 * cqVar.af && cqVar2 == null) {
                        cqVar2 = cqVar3;
                    }
                }
            }
            long ar = cg.ar(i, i2, 3, false, 0, 1942998010);
            gp.en.ar(dq.hf * -1674539149, i, i2, iz.de((i * mn.an) + 64, (i2 * mn.an) + 64, dq.hf * -1674539149, 1962182647), kdVar, ar, cqVar, cqVar2);
        } catch (Throwable e) {
            throw ba.ad(e, "ah.dg(" + ')');
        }
    }

    public static int fy(ac acVar, int i) {
        try {
            kr krVar = (kr) client.lk.af(((long) (acVar.ak * 2102445939)) + (((long) (acVar.ah * 1172750087)) << 32));
            return krVar != null ? krVar.af : 1271311755 * acVar.de;
        } catch (Throwable e) {
            throw ba.ad(e, "ah.fy(" + ')');
        }
    }
}
