package p000;

public class bb {
    public static final int at = 1024;
    public static final int cl = 1008;
    static boolean mq;
    public int ad;
    public int af;
    public int an;

    public bb() {
        try {
            this.af = 509225751;
        } catch (Throwable e) {
            throw ba.ad(e, "bb.<init>(" + ')');
        }
    }

    public bb(int i, int i2, int i3) {
        try {
            this.af = -509225751 * i;
            this.ad = 541094283 * i2;
            this.an = 1109197151 * i3;
        } catch (Throwable e) {
            throw ba.ad(e, "bb.<init>(" + ')');
        }
    }

    public bb(bb bbVar) {
        try {
            this.af = bbVar.af * 1;
            this.ad = bbVar.ad * 1;
            this.an = bbVar.an * 1;
        } catch (Throwable e) {
            throw ba.ad(e, "bb.<init>(" + ')');
        }
    }

    public bb(int i) {
        try {
            if (i == -1) {
                this.af = 509225751;
                return;
            }
            this.af = ((i >> 28) & 3) * -509225751;
            this.ad = ((i >> 14) & 16383) * 541094283;
            this.an = 1109197151 * (i & 16383);
        } catch (Throwable e) {
            throw ba.ad(e, "bb.<init>(" + ')');
        }
    }

    public void af(int i, int i2, int i3, byte b) {
        try {
            this.af = -509225751 * i;
            this.ad = 541094283 * i2;
            this.an = 1109197151 * i3;
        } catch (Throwable e) {
            throw ba.ad(e, "bb.af(" + ')');
        }
    }

    public int ad(int i) {
        try {
            return (((1302348633 * this.af) << 28) | ((this.ad * 1452060195) << 14)) | (this.an * 1719114399);
        } catch (Throwable e) {
            throw ba.ad(e, "bb.ad(" + ')');
        }
    }

    public boolean cf(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bb) {
            return an((bb) obj, (byte) 40);
        }
        return false;
    }

    public boolean cz(Object obj) {
        if (obj == this) {
            return true;
        }
        return !(obj instanceof bb) ? false : an((bb) obj, (byte) 45);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        try {
            if (obj instanceof bb) {
                return an((bb) obj, (byte) -4);
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "bb.equals(" + ')');
        }
    }

    boolean ag(bb bbVar) {
        if (1302348633 * bbVar.af != 1270701763 * this.af || bbVar.ad * -501156357 != 1452060195 * this.ad) {
            return false;
        }
        if (359150100 * this.an != bbVar.an * 484536376) {
            return false;
        }
        return true;
    }

    boolean an(bb bbVar, byte b) {
        try {
            if (bbVar.af * 1302348633 == this.af * 1302348633 && bbVar.ad * 1452060195 == this.ad * 1452060195 && this.an * 1719114399 == bbVar.an * 1719114399) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "bb.an(" + ')');
        }
    }

    boolean ay(bb bbVar) {
        if (bbVar.af * 1302348633 != this.af * 1302348633 || bbVar.ad * 1452060195 != this.ad * 1452060195) {
            return false;
        }
        if (this.an * 1719114399 != bbVar.an * 1719114399) {
            return false;
        }
        return true;
    }

    public int ce() {
        return ad(16711935);
    }

    public int cg() {
        return ad(16711935);
    }

    public int cr() {
        return ad(16711935);
    }

    public int hashCode() {
        try {
            return ad(16711935);
        } catch (Throwable e) {
            throw ba.ad(e, "bb.hashCode(" + ')');
        }
    }

    public String ca() {
        return aa(",", -1280418460);
    }

    public String cw() {
        return aa(",", -1404784465);
    }

    public String cx() {
        return aa(",", -2013391294);
    }

    public String toString() {
        try {
            return aa(",", -558577642);
        } catch (Throwable e) {
            throw ba.ad(e, "bb.toString(" + ')');
        }
    }

    String aa(String str, int i) {
        try {
            return (1302348633 * this.af) + str + ((this.ad * 1452060195) >> 6) + str + ((this.an * 1719114399) >> 6) + str + ((this.ad * 1452060195) & 63) + str + ((this.an * 1719114399) & 63);
        } catch (Throwable e) {
            throw ba.ad(e, "bb.aa(" + ')');
        }
    }

    String ar(String str) {
        return (1302348633 * this.af) + str + ((this.ad * 1452060195) >> 6) + str + ((this.an * 1719114399) >> 6) + str + ((this.ad * 1452060195) & 63) + str + ((this.an * 1719114399) & 63);
    }

    String as(String str) {
        return (1302348633 * this.af) + str + ((1452060195 * this.ad) >> 6) + str + ((this.an * -448874138) >> 6) + str + ((this.ad * -1572507351) & 63) + str + ((1719114399 * this.an) & 63);
    }

    public static int as(long j) {
        return (int) ((j >>> 17) & 4294967295L);
    }

    static void aa(int i) {
        try {
            if (gr.co != null && gr.co.length() > 0) {
                return;
            }
            if (cs.oj.ay != null) {
                gr.co = cs.oj.ay;
                gr.cn = true;
                return;
            }
            gr.cn = false;
        } catch (Throwable e) {
            throw ba.ad(e, "bb.aa(" + ')');
        }
    }
}
