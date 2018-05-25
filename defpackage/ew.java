package p000;

import java.util.Iterator;
import java.util.LinkedList;

public class ew {
    int aa = -1651867011;
    boolean ab = false;
    int ae = 1904716619;
    String ag;
    bb aj = null;
    int am = 1571053905;
    int aq = 0;
    int ar = -133782641;
    int as = -1825115985;
    int at = 0;
    LinkedList aw;
    String ay;

    public static char af(char c, int i, int i2) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if ('ý' == c || c == 'ÿ') {
                return 'y';
            }
        }
        if (c == 'Œ') {
            return 'O';
        }
        if ('œ' == c) {
            return 'o';
        }
        if ('Ÿ' == c) {
            return 'Y';
        }
        return c;
    }

    public void aj(ik ikVar, int i, byte b) {
        boolean z = true;
        int i2 = 0;
        try {
            this.aa = 1651867011 * i;
            this.ag = ikVar.bc(935826852);
            this.ay = ikVar.bc(773536472);
            this.aj = new bb(ikVar.al(221239909));
            this.as = ikVar.al(1339230633) * 1825115985;
            ikVar.ao((byte) 0);
            if (ikVar.ao((byte) 0) != 1) {
                z = false;
            }
            this.ab = z;
            this.ar = ikVar.ao((byte) 0) * 133782641;
            int ao = ikVar.ao((byte) 0);
            this.aw = new LinkedList();
            while (i2 < ao) {
                this.aw.add(ae(ikVar, 1710488492));
                i2++;
            }
            aw(1135979693);
        } catch (Throwable e) {
            throw ba.ad(e, "ew.aj(" + ')');
        }
    }

    public void bz(ik ikVar, int i) {
        boolean z = true;
        int i2 = 0;
        this.aa = 1651867011 * i;
        this.ag = ikVar.bc(1816058363);
        this.ay = ikVar.bc(1586849736);
        this.aj = new bb(ikVar.al(-489459665));
        this.as = ikVar.al(75609016) * 1825115985;
        ikVar.ao((byte) 0);
        if (ikVar.ao((byte) 0) != 1) {
            z = false;
        }
        this.ab = z;
        this.ar = ikVar.ao((byte) 0) * 133782641;
        int ao = ikVar.ao((byte) 0);
        this.aw = new LinkedList();
        while (i2 < ao) {
            this.aw.add(ae(ikVar, -550512569));
            i2++;
        }
        aw(1420745639);
    }

    di ae(ik ikVar, int i) {
        try {
            di dvVar;
            switch (((da) bx.af(da.ag((byte) 1), ikVar.ao((byte) 0), (byte) 47)).ag * 2069403121) {
                case 0:
                    dvVar = new dv();
                    break;
                case 1:
                    dvVar = new dp();
                    break;
                case 2:
                    dvVar = new db();
                    break;
                case 3:
                    dvVar = new df();
                    break;
                default:
                    throw new IllegalStateException("");
            }
            dvVar.ay(ikVar, (byte) 115);
            return dvVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.ae(" + ')');
        }
    }

    di bg(ik ikVar) {
        di dvVar;
        switch (((da) bx.af(da.ag((byte) 1), ikVar.ao((byte) 0), (byte) 122)).ag * 2069403121) {
            case 0:
                dvVar = new dv();
                break;
            case 1:
                dvVar = new dp();
                break;
            case 2:
                dvVar = new db();
                break;
            case 3:
                dvVar = new df();
                break;
            default:
                throw new IllegalStateException("");
        }
        dvVar.ay(ikVar, (byte) 6);
        return dvVar;
    }

    di bh(ik ikVar) {
        di dvVar;
        switch (((da) bx.af(da.ag((byte) 1), ikVar.ao((byte) 0), (byte) 61)).ag * 2069403121) {
            case 0:
                dvVar = new dv();
                break;
            case 1:
                dvVar = new dp();
                break;
            case 2:
                dvVar = new db();
                break;
            case 3:
                dvVar = new df();
                break;
            default:
                throw new IllegalStateException("");
        }
        dvVar.ay(ikVar, (byte) 113);
        return dvVar;
    }

    public boolean aq(int i, int i2, int i3, int i4) {
        try {
            Iterator it = this.aw.iterator();
            while (it.hasNext()) {
                if (((di) it.next()).ad(i, i2, i3, -623124042)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.aq(" + ')');
        }
    }

    public boolean bf(int i, int i2, int i3) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            if (((di) it.next()).ad(i, i2, i3, 733665301)) {
                return true;
            }
        }
        return false;
    }

    public boolean bp(int i, int i2, int i3) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            if (((di) it.next()).ad(i, i2, i3, -1970900880)) {
                return true;
            }
        }
        return false;
    }

    public boolean bt(int i, int i2, int i3) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            if (((di) it.next()).ad(i, i2, i3, 1147093208)) {
                return true;
            }
        }
        return false;
    }

    public boolean bv(int i, int i2, int i3) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            if (((di) it.next()).ad(i, i2, i3, 235137123)) {
                return true;
            }
        }
        return false;
    }

    public boolean bx(int i, int i2, int i3) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            if (((di) it.next()).ad(i, i2, i3, 2067226545)) {
                return true;
            }
        }
        return false;
    }

    public boolean am(int i, int i2, int i3) {
        try {
            int i4 = i / 64;
            int i5 = i2 / 64;
            if (i4 < this.ae * -1332676195 || i4 > 845527457 * this.aq) {
                return false;
            }
            if (i5 < -668436401 * this.am || i5 > -519973341 * this.at) {
                return false;
            }
            Iterator it = this.aw.iterator();
            while (it.hasNext()) {
                if (((di) it.next()).an(i, i2, -1145965454)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.am(" + ')');
        }
    }

    public boolean be(int i, int i2) {
        int i3 = i / 64;
        int i4 = i2 / 64;
        if (i3 < this.ae * -1332676195 || i3 > 845527457 * this.aq) {
            return false;
        }
        if (i4 < -668436401 * this.am || i4 > -519973341 * this.at) {
            return false;
        }
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            if (((di) it.next()).an(i, i2, -2029947743)) {
                return true;
            }
        }
        return false;
    }

    public boolean bk(int i, int i2) {
        int i3 = i / 499449300;
        int i4 = i2 / 64;
        if (i3 < this.ae * -1332676195 || i3 > 1636519478 * this.aq) {
            return false;
        }
        if (i4 < -668436401 * this.am || i4 > 1377816856 * this.at) {
            return false;
        }
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            if (((di) it.next()).an(i, i2, -657921840)) {
                return true;
            }
        }
        return false;
    }

    public boolean bu(int i, int i2) {
        int i3 = i / 64;
        int i4 = i2 / 64;
        if (i3 < this.ae * -1332676195 || i3 > 845527457 * this.aq) {
            return false;
        }
        if (i4 < -668436401 * this.am || i4 > -519973341 * this.at) {
            return false;
        }
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            if (((di) it.next()).an(i, i2, -1966072559)) {
                return true;
            }
        }
        return false;
    }

    public boolean by(int i, int i2) {
        int i3 = i / 64;
        int i4 = i2 / 64;
        if (i3 < this.ae * -1332676195 || i3 > 845527457 * this.aq) {
            return false;
        }
        if (i4 < -668436401 * this.am || i4 > -519973341 * this.at) {
            return false;
        }
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            if (((di) it.next()).an(i, i2, -175249578)) {
                return true;
            }
        }
        return false;
    }

    public int[] at(int i, int i2, int i3, byte b) {
        try {
            Iterator it = this.aw.iterator();
            while (it.hasNext()) {
                di diVar = (di) it.next();
                if (diVar.ad(i, i2, i3, -1347610078)) {
                    return diVar.aa(i, i2, i3, (byte) -67);
                }
            }
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.at(" + ')');
        }
    }

    public int[] ba(int i, int i2, int i3) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            di diVar = (di) it.next();
            if (diVar.ad(i, i2, i3, -2108557747)) {
                return diVar.aa(i, i2, i3, (byte) -54);
            }
        }
        return null;
    }

    public int[] bl(int i, int i2, int i3) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            di diVar = (di) it.next();
            if (diVar.ad(i, i2, i3, -481308377)) {
                return diVar.aa(i, i2, i3, (byte) 86);
            }
        }
        return null;
    }

    public int[] bn(int i, int i2, int i3) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            di diVar = (di) it.next();
            if (diVar.ad(i, i2, i3, 1892134211)) {
                return diVar.aa(i, i2, i3, (byte) 69);
            }
        }
        return null;
    }

    public bb ab(int i, int i2, byte b) {
        try {
            Iterator it = this.aw.iterator();
            while (it.hasNext()) {
                di diVar = (di) it.next();
                if (diVar.an(i, i2, -409457094)) {
                    return diVar.ag(i, i2, 1268637691);
                }
            }
            return null;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.ab(" + ')');
        }
    }

    public bb bd(int i, int i2) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            di diVar = (di) it.next();
            if (diVar.an(i, i2, -1803412421)) {
                return diVar.ag(i, i2, 2076258541);
            }
        }
        return null;
    }

    public bb bm(int i, int i2) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            di diVar = (di) it.next();
            if (diVar.an(i, i2, -356610886)) {
                return diVar.ag(i, i2, 44853078);
            }
        }
        return null;
    }

    public bb bs(int i, int i2) {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            di diVar = (di) it.next();
            if (diVar.an(i, i2, 358392563)) {
                return diVar.ag(i, i2, 1422231219);
            }
        }
        return null;
    }

    void aw(int i) {
        try {
            Iterator it = this.aw.iterator();
            while (it.hasNext()) {
                ((di) it.next()).af(this, 328478598);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ew.aw(" + ')');
        }
    }

    void bi() {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            ((di) it.next()).af(this, 1823778179);
        }
    }

    void bj() {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            ((di) it.next()).af(this, -255947978);
        }
    }

    void br() {
        Iterator it = this.aw.iterator();
        while (it.hasNext()) {
            ((di) it.next()).af(this, -1435437451);
        }
    }

    public int ai(int i) {
        try {
            return -528778965 * this.aa;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.ai(" + ')');
        }
    }

    public int bq() {
        return -1871806057 * this.aa;
    }

    public boolean az(int i) {
        try {
            return this.ab;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.az(" + ')');
        }
    }

    public boolean bo() {
        return this.ab;
    }

    public boolean ci() {
        return this.ab;
    }

    public boolean cv() {
        return this.ab;
    }

    public String ah(byte b) {
        try {
            return this.ag;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.ah(" + ')');
        }
    }

    public String cc() {
        return this.ag;
    }

    public String co() {
        return this.ag;
    }

    public String ak(int i) {
        try {
            return this.ay;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.ak(" + ')');
        }
    }

    int ao(int i) {
        try {
            return 507877809 * this.as;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.ao(" + ')');
        }
    }

    int cn() {
        return 507877809 * this.as;
    }

    int cy() {
        return 456410039 * this.as;
    }

    public int ax(byte b) {
        try {
            return this.ar * 1800332433;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.ax(" + ')');
        }
    }

    public int cd() {
        return this.ar * 1800332433;
    }

    public int ch() {
        return this.ar * 1800332433;
    }

    public int ck() {
        return this.ar * -343517874;
    }

    public int cl() {
        return this.ar * 1023191199;
    }

    public int cs() {
        return this.ar * 1800332433;
    }

    public int au(int i) {
        try {
            return this.ae * -1332676195;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.au(" + ')');
        }
    }

    public int cj() {
        return this.ae * -1332676195;
    }

    public int cm() {
        return this.ae * 221896352;
    }

    public int cq() {
        return this.ae * -1332676195;
    }

    public int av(int i) {
        try {
            return 845527457 * this.aq;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.av(" + ')');
        }
    }

    public int cp() {
        return 845527457 * this.aq;
    }

    public int ct() {
        return 845527457 * this.aq;
    }

    public int ac(int i) {
        try {
            return -668436401 * this.am;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.ac(" + ')');
        }
    }

    public int cb() {
        return -668436401 * this.am;
    }

    public int cu() {
        return -668436401 * this.am;
    }

    public int al(byte b) {
        try {
            return -519973341 * this.at;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.al(" + ')');
        }
    }

    public int dj() {
        return -519973341 * this.at;
    }

    public int ap(int i) {
        try {
            return 1452060195 * this.aj.ad;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.ap(" + ')');
        }
    }

    public int dc() {
        return -1849625805 * this.aj.ad;
    }

    public int dk() {
        return 1452060195 * this.aj.ad;
    }

    public int bw(int i) {
        try {
            return this.aj.af * 1302348633;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.bw(" + ')');
        }
    }

    public int m6do() {
        return this.aj.af * 1302348633;
    }

    public int dt() {
        return this.aj.af * 1302348633;
    }

    public int bb(byte b) {
        try {
            return this.aj.an * 1719114399;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.bb(" + ')');
        }
    }

    public int dv() {
        return this.aj.an * 1719114399;
    }

    public int dz() {
        return this.aj.an * 1456438199;
    }

    public bb bc(int i) {
        try {
            return new bb(this.aj);
        } catch (Throwable e) {
            throw ba.ad(e, "ew.bc(" + ')');
        }
    }

    public bb dd() {
        return new bb(this.aj);
    }

    public bb di() {
        return new bb(this.aj);
    }

    public bb dl() {
        return new bb(this.aj);
    }

    static lr aw(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        try {
            lr lrVar = new lr(bArr, dr.aa, gl.ag, my.ay, it.as, le.ar, gl.aj);
            gy.ak(805967750);
            return lrVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ew.aw(" + ')');
        }
    }

    public static final int er(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < client.dc.length) {
                    return client.dc[i];
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ew.er(" + ')');
            }
        }
        return -1;
    }
}
