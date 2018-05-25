package p000;

public class aw extends kq {
    public static ky aa = new ky(64, null);
    public static kf ad = null;
    public static kf af = null;
    public static ky an = new ky(64, null);
    static final int as = 30;
    static final int ay = 70;
    int ab = -458835651;
    public int ae = -96953543;
    public int ag;
    public int ai = 0;
    public int aj = -1763073037;
    public int am = -665517770;
    public int aq = 1550244493;
    public int ar = 642169897;
    int at = -533600739;
    public int aw = -231238218;

    public static final boolean ad(char c, int i) {
        try {
            if (Character.isISOControl(c)) {
                return false;
            }
            if (ik.aq(c, (byte) 112)) {
                return true;
            }
            char[] cArr = ms.an;
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
            cArr = ms.aa;
            for (char c22 : cArr) {
                if (c == c22) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            throw ba.ad(e, "aw.ad(" + ')');
        }
    }

    public void af(ik ikVar, int i) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    ad(ikVar, ao, (byte) 40);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "aw.af(" + ')');
            }
        }
    }

    public void ag(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ad(ikVar, ao, (byte) 40);
            } else {
                return;
            }
        }
    }

    public void ay(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                ad(ikVar, ao, (byte) 40);
            } else {
                return;
            }
        }
    }

    void ad(ik ikVar, int i, byte b) {
        if (i == 1) {
            try {
                ikVar.au(-1144029955);
            } catch (Throwable e) {
                throw ba.ad(e, "aw.ad(" + ')');
            }
        } else if (2 == i) {
            this.ar = ikVar.ao((byte) 0) * -1378608425;
        } else if (i == 3) {
            this.aj = ikVar.ao((byte) 0) * -394303219;
        } else if (i == 4) {
            this.ae = 0;
        } else if (5 == i) {
            this.am = ikVar.au(-1449089509) * 1831192873;
        } else if (6 == i) {
            ikVar.ao((byte) 0);
        } else if (i == 7) {
            this.at = ikVar.bx(1637351187) * 533600739;
        } else if (8 == i) {
            this.ab = ikVar.bx(1701349116) * 458835651;
        } else if (i == 11) {
            this.ae = ikVar.au(590812230) * 96953543;
        } else if (14 == i) {
            this.aw = ikVar.ao((byte) 0) * 421788789;
        } else if (i == 15) {
            this.ai = ikVar.ao((byte) 0) * 1070260705;
        }
    }

    void ar(ik ikVar, int i) {
        if (i == 1) {
            ikVar.au(-1997351182);
        } else if (2 == i) {
            this.ar = ikVar.ao((byte) 0) * -1378608425;
        } else if (i == 3) {
            this.aj = ikVar.ao((byte) 0) * -955363569;
        } else if (i == 4) {
            this.ae = 0;
        } else if (5 == i) {
            this.am = ikVar.au(-1647892054) * 620770602;
        } else if (6 == i) {
            ikVar.ao((byte) 0);
        } else if (i == 7) {
            this.at = ikVar.bx(1408587219) * 533600739;
        } else if (8 == i) {
            this.ab = ikVar.bx(2021546622) * -244899047;
        } else if (i == 11) {
            this.ae = ikVar.au(2084373156) * -1500903126;
        } else if (14 == i) {
            this.aw = ikVar.ao((byte) 0) * 421788789;
        } else if (i == 15) {
            this.ai = ikVar.ao((byte) 0) * 75592;
        }
    }

    void as(ik ikVar, int i) {
        if (i == 1) {
            ikVar.au(2139171740);
        } else if (2 == i) {
            this.ar = ikVar.ao((byte) 0) * -1378608425;
        } else if (i == 3) {
            this.aj = ikVar.ao((byte) 0) * 710279037;
        } else if (i == 4) {
            this.ae = 0;
        } else if (5 == i) {
            this.am = ikVar.au(1045361136) * 1831192873;
        } else if (6 == i) {
            ikVar.ao((byte) 0);
        } else if (i == 7) {
            this.at = ikVar.bx(1948409435) * 533600739;
        } else if (8 == i) {
            this.ab = ikVar.bx(1776162478) * 458835651;
        } else if (i == 11) {
            this.ae = ikVar.au(-21840347) * 1229786744;
        } else if (14 == i) {
            this.aw = ikVar.ao((byte) 0) * 421788789;
        } else if (i == 15) {
            this.ai = ikVar.ao((byte) 0) * -1809308229;
        }
    }

    public fx ae() {
        if (2045918762 * this.at < 0) {
            return null;
        }
        fx fxVar = (fx) aa.af((long) (817139870 * this.at));
        if (fxVar != null) {
            return fxVar;
        }
        fxVar = cb.an(ad, 1067161343 * this.at, 0, (byte) 0);
        if (fxVar == null) {
            return fxVar;
        }
        aa.an(fxVar, (long) (1410534464 * this.at));
        return fxVar;
    }

    public fx aj() {
        if (this.at * 1664480203 < 0) {
            return null;
        }
        fx fxVar = (fx) aa.af((long) (this.at * 1664480203));
        if (fxVar != null) {
            return fxVar;
        }
        fxVar = cb.an(ad, this.at * 1664480203, 0, (byte) 0);
        if (fxVar == null) {
            return fxVar;
        }
        aa.an(fxVar, (long) (this.at * 1664480203));
        return fxVar;
    }

    public fx am() {
        if (this.at * 1664480203 < 0) {
            return null;
        }
        fx fxVar = (fx) aa.af((long) (this.at * 1664480203));
        if (fxVar != null) {
            return fxVar;
        }
        fxVar = cb.an(ad, this.at * 1664480203, 0, (byte) 0);
        if (fxVar == null) {
            return fxVar;
        }
        aa.an(fxVar, (long) (this.at * 1664480203));
        return fxVar;
    }

    public fx an(byte b) {
        try {
            if (this.at * 1664480203 < 0) {
                return null;
            }
            fx fxVar = (fx) aa.af((long) (this.at * 1664480203));
            if (fxVar != null) {
                return fxVar;
            }
            fxVar = cb.an(ad, this.at * 1664480203, 0, (byte) 0);
            if (fxVar == null) {
                return fxVar;
            }
            aa.an(fxVar, (long) (this.at * 1664480203));
            return fxVar;
        } catch (Throwable e) {
            throw ba.ad(e, "aw.an(" + ')');
        }
    }

    public fx aq() {
        if (-90732029 * this.at < 0) {
            return null;
        }
        fx fxVar = (fx) aa.af((long) (-996614356 * this.at));
        if (fxVar != null) {
            return fxVar;
        }
        fxVar = cb.an(ad, 1970265711 * this.at, 0, (byte) 0);
        if (fxVar == null) {
            return fxVar;
        }
        aa.an(fxVar, (long) (1664480203 * this.at));
        return fxVar;
    }

    public fx aa(byte b) {
        try {
            if (this.ab * -635364885 < 0) {
                return null;
            }
            fx fxVar = (fx) aa.af((long) (this.ab * -635364885));
            if (fxVar != null) {
                return fxVar;
            }
            fxVar = cb.an(ad, this.ab * -635364885, 0, (byte) 0);
            if (fxVar == null) {
                return fxVar;
            }
            aa.an(fxVar, (long) (this.ab * -635364885));
            return fxVar;
        } catch (Throwable e) {
            throw ba.ad(e, "aw.aa(" + ')');
        }
    }

    public fx ab() {
        if (this.ab * -635364885 < 0) {
            return null;
        }
        fx fxVar = (fx) aa.af((long) (this.ab * -635364885));
        if (fxVar != null) {
            return fxVar;
        }
        fxVar = cb.an(ad, this.ab * -635364885, 0, (byte) 0);
        if (fxVar == null) {
            return fxVar;
        }
        aa.an(fxVar, (long) (this.ab * -635364885));
        return fxVar;
    }

    public fx at() {
        if (this.ab * -635364885 < 0) {
            return null;
        }
        fx fxVar = (fx) aa.af((long) (this.ab * -635364885));
        if (fxVar != null) {
            return fxVar;
        }
        fxVar = cb.an(ad, this.ab * -635364885, 0, (byte) 0);
        if (fxVar == null) {
            return fxVar;
        }
        aa.an(fxVar, (long) (this.ab * -635364885));
        return fxVar;
    }

    public fx aw() {
        if (this.ab * -635364885 < 0) {
            return null;
        }
        fx fxVar = (fx) aa.af((long) (this.ab * -635364885));
        if (fxVar != null) {
            return fxVar;
        }
        fxVar = cb.an(ad, this.ab * -794451677, 0, (byte) 0);
        if (fxVar == null) {
            return fxVar;
        }
        aa.an(fxVar, (long) (this.ab * -635364885));
        return fxVar;
    }

    public static final boolean fu(ac acVar, int i) {
        try {
            int i2 = acVar.au * -586529633;
            if (205 == i2) {
                client.dl = -1012553922;
                return true;
            }
            int i3;
            int i4;
            bc bcVar;
            boolean z;
            if (i2 >= 300 && i2 <= 313) {
                i3 = (i2 - 300) / 2;
                i4 = i2 & 1;
                bcVar = client.ob;
                if (1 == i4) {
                    z = true;
                } else {
                    z = false;
                }
                bcVar.ad(i3, z, (byte) -63);
            }
            if (i2 >= 314 && i2 <= 323) {
                i3 = (i2 - 314) / 2;
                i4 = i2 & 1;
                bcVar = client.ob;
                if (1 == i4) {
                    z = true;
                } else {
                    z = false;
                }
                bcVar.an(i3, z, 1624417948);
            }
            if (324 == i2) {
                client.ob.aa(false, -500776324);
            }
            if (325 == i2) {
                client.ob.aa(true, -500776324);
            }
            if (i2 != 326) {
                return false;
            }
            no ad = ik.ad(nr.dr, client.dv.ag, (byte) 5);
            client.ob.ag(ad.an, (byte) 67);
            client.dv.an(ad, (short) 255);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "aw.fu(" + ')');
        }
    }
}
