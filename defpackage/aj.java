package p000;

import java.util.Collection;

public class aj extends kq {
    static ky ad = new ky(64, null);
    public int aa;
    public String ag;
    char an;
    boolean ay;

    aj() {
        try {
            this.ay = true;
        } catch (Throwable e) {
            throw ba.ad(e, "aj.<init>(" + ')');
        }
    }

    public static void ae(kf kfVar) {
        nf.af = kfVar;
    }

    public static void aj(kf kfVar) {
        nf.af = kfVar;
    }

    public static void aq(kf kfVar) {
        nf.af = kfVar;
    }

    public static void ar(kf kfVar) {
        nf.af = kfVar;
    }

    public static aj am(int i) {
        aj ajVar = (aj) ad.af((long) i);
        if (ajVar == null) {
            byte[] an = nf.af.an(11, i, -900942730);
            ajVar = new aj();
            if (an != null) {
                ajVar.aa(new ik(an), (byte) -50);
            }
            ajVar.an((byte) 59);
            ad.an(ajVar, (long) i);
        }
        return ajVar;
    }

    public static aj at(int i) {
        aj ajVar = (aj) ad.af((long) i);
        if (ajVar == null) {
            byte[] an = nf.af.an(11, i, -2107305317);
            ajVar = new aj();
            if (an != null) {
                ajVar.aa(new ik(an), (byte) -22);
            }
            ajVar.an((byte) 29);
            ad.an(ajVar, (long) i);
        }
        return ajVar;
    }

    void ab() {
    }

    void an(byte b) {
    }

    void aw() {
    }

    void aa(ik ikVar, byte b) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    ag(ikVar, ao, 2137691933);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "aj.aa(" + ')');
            }
        }
    }

    void ah(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ag(ikVar, ao, 1023940203);
            } else {
                return;
            }
        }
    }

    void ai(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ag(ikVar, ao, 525640274);
            } else {
                return;
            }
        }
    }

    void az(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ag(ikVar, ao, -530983912);
            } else {
                return;
            }
        }
    }

    void ag(ik ikVar, int i, int i2) {
        if (1 == i) {
            try {
                int ax = ikVar.ax(1247983979) & 255;
                if (ax == 0) {
                    throw new IllegalArgumentException("");
                }
                if (ax >= mn.an && ax < 160) {
                    ax = ml.af[ax - 128];
                    if (ax == 0) {
                        ax = 63;
                    }
                }
                this.an = (char) ax;
            } catch (Throwable e) {
                throw ba.ad(e, "aj.ag(" + ')');
            }
        } else if (i == 2) {
            this.aa = ikVar.al(100002431) * -2014609209;
        } else if (i == 4) {
            this.ay = false;
        } else if (i == 5) {
            this.ag = ikVar.bc(759726727);
        }
    }

    void ak(ik ikVar, int i) {
        if (1 == i) {
            int ax = ikVar.ax(1247983979) & 633726340;
            if (ax == 0) {
                throw new IllegalArgumentException("");
            }
            if (ax >= mn.an && ax < -1254242658) {
                ax = ml.af[ax - -1127776389];
                if (ax == 0) {
                    ax = -1891316160;
                }
            }
            this.an = (char) ax;
        } else if (i == 2) {
            this.aa = ikVar.al(-118302978) * 269458754;
        } else if (i == 4) {
            this.ay = false;
        } else if (i == 5) {
            this.ag = ikVar.bc(1414495370);
        }
    }

    void ao(ik ikVar, int i) {
        if (1 == i) {
            int ax = ikVar.ax(1247983979) & 255;
            if (ax == 0) {
                throw new IllegalArgumentException("");
            }
            if (ax >= mn.an && ax < 160) {
                ax = ml.af[ax - 128];
                if (ax == 0) {
                    ax = 63;
                }
            }
            this.an = (char) ax;
        } else if (i == 2) {
            this.aa = ikVar.al(1539995637) * -2014609209;
        } else if (i == 4) {
            this.ay = false;
        } else if (i == 5) {
            this.ag = ikVar.bc(1931019895);
        }
    }

    void au(ik ikVar, int i) {
        if (1 == i) {
            int ax = ikVar.ax(1247983979) & 255;
            if (ax == 0) {
                throw new IllegalArgumentException("");
            }
            if (ax >= mn.an && ax < 1187809352) {
                ax = ml.af[ax - 128];
                if (ax == 0) {
                    ax = 63;
                }
            }
            this.an = (char) ax;
        } else if (i == 2) {
            this.aa = ikVar.al(-927848407) * 326640618;
        } else if (i == 4) {
            this.ay = false;
        } else if (i == 5) {
            this.ag = ikVar.bc(952090854);
        }
    }

    void ax(ik ikVar, int i) {
        if (1 == i) {
            int ax = ikVar.ax(1247983979) & 255;
            if (ax == 0) {
                throw new IllegalArgumentException("");
            }
            if (ax >= mn.an && ax < 603000829) {
                ax = ml.af[ax - 1554051744];
                if (ax == 0) {
                    ax = -2143887902;
                }
            }
            this.an = (char) ax;
        } else if (i == 2) {
            this.aa = ikVar.al(-1020766255) * -268971166;
        } else if (i == 4) {
            this.ay = false;
        } else if (i == 5) {
            this.ag = ikVar.bc(1853284592);
        }
    }

    public boolean av() {
        return this.an == 's';
    }

    public boolean ay(int i) {
        try {
            return this.an == 's';
        } catch (Throwable e) {
            throw ba.ad(e, "aj.ay(" + ')');
        }
    }

    public static void ac(Collection collection) {
        collection.add(ad);
    }

    public static void al(Collection collection) {
        collection.add(ad);
    }

    public static void ap(Collection collection) {
        collection.add(ad);
    }

    public static void bw(Collection collection) {
        collection.add(ad);
    }

    static final void aj(fb fbVar, byte b) {
        try {
            fbVar.ak = false;
            if (fbVar.ah != null) {
                fbVar.ah.af = 0;
            }
            fb ay = fbVar.ay();
            while (ay != null) {
                aj.aj(ay, (byte) -106);
                ay = fbVar.as();
            }
        } catch (Throwable e) {
            throw ba.ad(e, "aj.aj(" + ')');
        }
    }

    static void au(int[] iArr, byte[] bArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i3 >> 2);
        int i9 = -(i3 & 3);
        int i10 = -i4;
        int i11 = i;
        int i12 = i2;
        while (i10 < 0) {
            int i13 = i8;
            while (i13 < 0) {
                byte b;
                int i14 = i11 + 1;
                try {
                    b = bArr[i11];
                    if (b != (byte) 0) {
                        i11 = i12 + 1;
                        iArr[i12] = iArr2[b & 255];
                    } else {
                        i11 = i12 + 1;
                    }
                    int i15 = i14 + 1;
                    byte b2 = bArr[i14];
                    if (b2 != (byte) 0) {
                        i12 = i11 + 1;
                        iArr[i11] = iArr2[b2 & 255];
                        i11 = i12;
                    } else {
                        i11++;
                    }
                    int i16 = i15 + 1;
                    b2 = bArr[i15];
                    if (b2 != (byte) 0) {
                        i12 = i11 + 1;
                        iArr[i11] = iArr2[b2 & 255];
                        i11 = i12;
                    } else {
                        i11++;
                    }
                    i14 = i16 + 1;
                    b = bArr[i16];
                    if (b != (byte) 0) {
                        i12 = i11 + 1;
                        iArr[i11] = iArr2[b & 255];
                    } else {
                        i12 = i11 + 1;
                    }
                    i13++;
                    i11 = i14;
                } catch (Throwable e) {
                    throw ba.ad(e, "aj.au(" + ')');
                }
            }
            i13 = i12;
            i12 = i11;
            i11 = i9;
            while (i11 < 0) {
                i14 = i12 + 1;
                b = bArr[i12];
                if (b != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = iArr2[b & 255];
                } else {
                    i12 = i13 + 1;
                }
                i11++;
                i13 = i12;
                i12 = i14;
            }
            i11 = i12 + i6;
            i10++;
            i12 = i13 + i5;
        }
    }
}
