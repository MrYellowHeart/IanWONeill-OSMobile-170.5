package p000;

public class az extends kq {
    public static ky aa = new ky(30, null);
    static kf ad = null;
    static kf af = null;
    public static ky an = new ky(64, null);
    static final int bt = 38;
    int ab;
    short[] ae;
    int ag;
    int ai;
    short[] aj;
    int am;
    short[] aq;
    short[] ar;
    public int as;
    int at;
    int aw;
    int ay;

    static gk af(int i, int i2) {
        try {
            gk gkVar = (gk) gk.af.af((long) i);
            if (gkVar != null) {
                return gkVar;
            }
            byte[] an = dt.cn.an(i, 0, -2122122397);
            if (an == null) {
                return null;
            }
            gkVar = cs.an(an, 435800729);
            gk.af.an(gkVar, (long) i);
            return gkVar;
        } catch (Throwable e) {
            throw ba.ad(e, "az.af(" + ')');
        }
    }

    az() {
        try {
            this.as = 952123923;
            this.am = 93340032;
            this.at = -152219520;
            this.ab = 0;
            this.aw = 0;
            this.ai = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "az.<init>(" + ')');
        }
    }

    public static void as(kf kfVar, kf kfVar2) {
        af = kfVar;
        ad = kfVar2;
    }

    public static void ay(kf kfVar, kf kfVar2) {
        af = kfVar;
        ad = kfVar2;
    }

    public static az ae(int i) {
        az azVar = (az) an.af((long) i);
        if (azVar == null) {
            byte[] an = af.an(13, i, -704092108);
            azVar = new az();
            azVar.ag = -1715467361 * i;
            if (an != null) {
                azVar.an(new ik(an), -676897622);
            }
            an.an(azVar, (long) i);
        }
        return azVar;
    }

    public static az aj(int i) {
        az azVar = (az) an.af((long) i);
        if (azVar == null) {
            byte[] an = af.an(13, i, 675472291);
            azVar = new az();
            azVar.ag = -207412785 * i;
            if (an != null) {
                azVar.an(new ik(an), -497297726);
            }
            an.an(azVar, (long) i);
        }
        return azVar;
    }

    public static az aq(int i) {
        az azVar = (az) an.af((long) i);
        if (azVar == null) {
            byte[] an = af.an(13, i, -831702962);
            azVar = new az();
            azVar.ag = -207412785 * i;
            if (an != null) {
                azVar.an(new ik(an), -138699393);
            }
            an.an(azVar, (long) i);
        }
        return azVar;
    }

    public static az ar(int i) {
        az azVar = (az) an.af((long) i);
        if (azVar == null) {
            byte[] an = af.an(13, i, -1685721949);
            azVar = new az();
            azVar.ag = -1392853296 * i;
            if (an != null) {
                azVar.an(new ik(an), -1513413298);
            }
            an.an(azVar, (long) i);
        }
        return azVar;
    }

    void am(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, -290811587);
            } else {
                return;
            }
        }
    }

    void an(ik ikVar, int i) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    aa(ikVar, ao, 2141394485);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "az.an(" + ')');
            }
        }
    }

    void aa(ik ikVar, int i, int i2) {
        int i3 = 0;
        if (1 == i) {
            try {
                this.ay = ikVar.au(-227749589) * -1215422697;
            } catch (Throwable e) {
                throw ba.ad(e, "az.aa(" + ')');
            }
        } else if (2 == i) {
            this.as = ikVar.au(-1136489747) * -952123923;
        } else if (i == 4) {
            this.am = ikVar.au(738333471) * -569696125;
        } else if (i == 5) {
            this.at = ikVar.au(1486565909) * 636344993;
        } else if (i == 6) {
            this.ab = ikVar.au(-1868547773) * 662378065;
        } else if (i == 7) {
            this.aw = ikVar.ao((byte) 0) * 817436769;
        } else if (i == 8) {
            this.ai = ikVar.ao((byte) 0) * 1401220701;
        } else if (i == 40) {
            r1 = ikVar.ao((byte) 0);
            this.ar = new short[r1];
            this.aj = new short[r1];
            while (i3 < r1) {
                this.ar[i3] = (short) ikVar.au(-1333873357);
                this.aj[i3] = (short) ikVar.au(967084437);
                i3++;
            }
        } else if (i == 41) {
            r1 = ikVar.ao((byte) 0);
            this.ae = new short[r1];
            this.aq = new short[r1];
            while (i3 < r1) {
                this.ae[i3] = (short) ikVar.au(1480634597);
                this.aq[i3] = (short) ikVar.au(-2000780709);
                i3++;
            }
        }
    }

    public final cl ab(int i) {
        int i2 = 0;
        cl clVar = (cl) aa.af((long) (this.ag * -804240081));
        if (clVar == null) {
            bj af = bj.af(ad, 332859559 * this.ay, 0);
            if (af == null) {
                return null;
            }
            if (this.ar != null) {
                for (int i3 = 0; i3 < this.ar.length; i3++) {
                    af.at(this.ar[i3], this.aj[i3]);
                }
            }
            if (this.ae != null) {
                while (i2 < this.ae.length) {
                    af.ab(this.ae[i2], this.aq[i2]);
                    i2++;
                }
            }
            clVar = af.ax((this.aw * 1564183457) + 64, (-2130749963 * this.ai) + 850, -30, -50, -30);
            aa.an(clVar, (long) (this.ag * -804240081));
        }
        if (this.as * 1690052581 == -1 || i == -1) {
            clVar = clVar.an(true);
        } else {
            clVar = cd.af(this.as * 1690052581, 1822277343).as(clVar, i, (byte) -7);
        }
        if (!(this.am * -1804718549 == mn.an && mn.an == this.at * -891254431)) {
            clVar.ah(this.am * -1804718549, this.at * -891254431, this.am * -1804718549);
        }
        if (this.ab * 800977585 == 0) {
            return clVar;
        }
        if (90 == this.ab * 800977585) {
            clVar.at();
        }
        if (this.ab * 800977585 == 180) {
            clVar.at();
            clVar.at();
        }
        if (this.ab * 800977585 != 270) {
            return clVar;
        }
        clVar.at();
        clVar.at();
        clVar.at();
        return clVar;
    }

    public final cl ag(int i, int i2) {
        int i3 = 0;
        try {
            cl clVar = (cl) aa.af((long) (this.ag * -804240081));
            if (clVar == null) {
                bj af = bj.af(ad, 332859559 * this.ay, 0);
                if (af == null) {
                    return null;
                }
                if (this.ar != null) {
                    for (int i4 = 0; i4 < this.ar.length; i4++) {
                        af.at(this.ar[i4], this.aj[i4]);
                    }
                }
                if (this.ae != null) {
                    while (i3 < this.ae.length) {
                        af.ab(this.ae[i3], this.aq[i3]);
                        i3++;
                    }
                }
                clVar = af.ax((this.aw * 1564183457) + 64, (-2130749963 * this.ai) + 850, -30, -50, -30);
                aa.an(clVar, (long) (this.ag * -804240081));
            }
            if (this.as * 1690052581 == -1 || i == -1) {
                clVar = clVar.an(true);
            } else {
                clVar = cd.af(this.as * 1690052581, 2086713891).as(clVar, i, (byte) 25);
            }
            if (!(this.am * -1804718549 == mn.an && mn.an == this.at * -891254431)) {
                clVar.ah(this.am * -1804718549, this.at * -891254431, this.am * -1804718549);
            }
            if (this.ab * 800977585 == 0) {
                return clVar;
            }
            if (90 == this.ab * 800977585) {
                clVar.at();
            }
            if (this.ab * 800977585 == 180) {
                clVar.at();
                clVar.at();
            }
            if (this.ab * 800977585 != 270) {
                return clVar;
            }
            clVar.at();
            clVar.at();
            clVar.at();
            return clVar;
        } catch (Throwable e) {
            throw ba.ad(e, "az.ag(" + ')');
        }
    }

    public final cl at(int i) {
        int i2 = 0;
        cl clVar = (cl) aa.af((long) (this.ag * -804240081));
        if (clVar == null) {
            bj af = bj.af(ad, -820026271 * this.ay, 0);
            if (af == null) {
                return null;
            }
            if (this.ar != null) {
                for (int i3 = 0; i3 < this.ar.length; i3++) {
                    af.at(this.ar[i3], this.aj[i3]);
                }
            }
            if (this.ae != null) {
                while (i2 < this.ae.length) {
                    af.ab(this.ae[i2], this.aq[i2]);
                    i2++;
                }
            }
            clVar = af.ax((this.aw * -774874504) + 64, (-2130749963 * this.ai) + 1360739490, -30, -50, -30);
            aa.an(clVar, (long) (this.ag * -804240081));
        }
        if (this.as * 1690052581 == -1 || i == -1) {
            clVar = clVar.an(true);
        } else {
            clVar = cd.af(this.as * 1690052581, 211394197).as(clVar, i, (byte) -50);
        }
        if (!(-1804718549 * this.am == -1086697108 && 1773753296 == this.at * -891254431)) {
            clVar.ah(-579634139 * this.am, this.at * -891254431, this.am * -1067349486);
        }
        if (this.ab * 800977585 == 0) {
            return clVar;
        }
        if (90 == this.ab * -110268175) {
            clVar.at();
        }
        if (85262604 * this.ab == 180) {
            clVar.at();
            clVar.at();
        }
        if (800977585 * this.ab != 270) {
            return clVar;
        }
        clVar.at();
        clVar.at();
        clVar.at();
        return clVar;
    }
}
