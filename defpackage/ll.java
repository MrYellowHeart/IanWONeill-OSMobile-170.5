package p000;

public class ll {
    static final int aa = 400;
    static String ab = "Failed to download config. Please check your Internet connection.";
    static final int ad = 503;
    static String ae = "Your client needs updating. Opening store page...";
    static final int af = 765;
    static final int ag = 60;
    static String aj = "Old School RuneScape has encountered a problem";
    static String am = "Application crashed";
    static final float an = 1.5208747f;
    static String aq = "Unable to download content";
    static String at = "Error loading application";
    static String aw = "Automatically retrying in %s...";
    public static final int bu = 50;
    int ah;
    String ai;
    int ak;
    int az;

    ll() {
        try {
            this.ak = 596214671;
        } catch (Throwable e) {
            throw ba.ad(e, "ll.<init>(" + ')');
        }
    }

    void af(int i, String str, fx fxVar, lr lrVar, float f, ft ftVar, int i2) {
        try {
            gf af = ftVar.af(1558734878);
            af.ad(-715595968);
            ag(f, -709281733);
            int i3 = ((630076967 * this.ah) - 60) / 2;
            if (fxVar != null) {
                int i4 = (fxVar.an + 40) + ag;
                int i5 = 405353361 * this.ak;
                if (i5 > 255) {
                    i5 = 510 - i5;
                }
                this.ak = (((405353361 * this.ak) + 5) % 510) * 1080290673;
                i3 = ((this.az * 1794083055) - fxVar.ad) / 2;
                i4 = ((this.ah * 630076967) - i4) / 2;
                af.bx(fxVar, i3, i4, ((i5 << 8) + (i5 << 16)) + i5, 1844768594);
                i3 = (fxVar.an + i4) + 40;
            }
            int i6 = (i3 + 30) + 5;
            af.fi(((this.az * 1794083055) - 400) / 2, i3, aa, ag, -7597807, 1849667919);
            af.aa((((this.az * 1794083055) - 400) - 4) / 2, i3 + 2, (i * 396) / 100, 56, -7597807, (byte) -40);
            if (lrVar != null) {
                lrVar.am(str, (1794083055 * this.az) / 2, i6, -1, 0, af);
            }
            ftVar.as(0, 0, 1778852765);
        } catch (Throwable e) {
            throw ba.ad(e, "ll.af(" + ')');
        }
    }

    void ay(int i, String str, fx fxVar, lr lrVar, float f, ft ftVar) {
        gf af = ftVar.af(-1098470222);
        af.ad(-124055936);
        ag(f, -853245247);
        int i2 = ((630076967 * this.ah) - 60) / 2;
        if (fxVar != null) {
            int i3 = (fxVar.an + 40) + ag;
            int i4 = 405353361 * this.ak;
            if (i4 > 255) {
                i4 = 510 - i4;
            }
            this.ak = (((405353361 * this.ak) + 5) % 510) * 1080290673;
            i2 = ((this.az * 1794083055) - fxVar.ad) / 2;
            i3 = ((this.ah * 630076967) - i3) / 2;
            af.bx(fxVar, i2, i3, ((i4 << 8) + (i4 << 16)) + i4, 1130797764);
            i2 = (fxVar.an + i3) + 40;
        }
        int i5 = (i2 + 30) + 5;
        af.fi(((this.az * 1794083055) - 400) / 2, i2, aa, ag, -7597807, 2019696699);
        af.aa((((this.az * 1794083055) - 400) - 4) / 2, i2 + 2, (i * 396) / 100, 56, -7597807, (byte) 52);
        if (lrVar != null) {
            lrVar.am(str, (1794083055 * this.az) / 2, i5, -1, 0, af);
        }
        ftVar.as(0, 0, 1315719924);
    }

    public static int aa(CharSequence charSequence, int i, boolean z, byte b) {
        Object obj = null;
        if (i < 2 || i > 36) {
            try {
                throw new IllegalArgumentException("");
            } catch (Throwable e) {
                throw ba.ad(e, "ll.aa(" + ')');
            }
        }
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        Object obj2 = null;
        while (i2 < length) {
            int i4;
            int i5;
            char charAt = charSequence.charAt(i2);
            if (i2 == 0) {
                Object obj3;
                if (charAt == '-') {
                    int i6 = 1;
                    Object obj4 = obj;
                    i4 = i3;
                    obj3 = obj4;
                } else if (charAt == '+' && z) {
                    i5 = i3;
                    obj3 = obj;
                    i4 = i5;
                }
                i2++;
                i5 = i4;
                obj = obj3;
                i3 = i5;
            }
            if (charAt >= '0' && charAt <= '9') {
                i4 = charAt - 48;
            } else if (charAt >= 'A' && charAt <= 'Z') {
                i4 = charAt - 55;
            } else if (charAt < 'a' || charAt > 'z') {
                throw new NumberFormatException();
            } else {
                i4 = charAt - 87;
            }
            if (i4 >= i) {
                throw new NumberFormatException();
            }
            if (obj2 != null) {
                i4 = -i4;
            }
            i4 += i3 * i;
            if (i3 != i4 / i) {
                throw new NumberFormatException();
            }
            i3 = 1;
            i2++;
            i5 = i4;
            obj = obj3;
            i3 = i5;
        }
        if (obj != null) {
            return i3;
        }
        throw new NumberFormatException();
    }

    void ad(mv mvVar, lr lrVar, ft ftVar, float f, byte b) {
        if (mvVar != null) {
            if (this.ai == null) {
                switch (mvVar.ae * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        try {
                            this.ai = aq;
                            break;
                        } catch (Throwable e) {
                            throw ba.ad(e, "ll.ad(" + ')');
                        }
                    case 1:
                        this.ai = am;
                        break;
                    case 3:
                        this.ai = ae;
                        break;
                    default:
                        this.ai = at;
                        break;
                }
            }
            ftVar.af(61754147).ad(-1250980822);
            ag(f, 1391979229);
            lrVar.am(aj, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - 50, -1, 0, ftVar.af(798797878));
            lrVar.am(this.ai, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) + 50, -1, 0, ftVar.af(815548791));
            ftVar.as(0, 0, 1345772834);
        }
    }

    void ae(mv mvVar, lr lrVar, ft ftVar, float f) {
        if (mvVar != null) {
            if (this.ai == null) {
                switch (mvVar.ae * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.ai = aq;
                        break;
                    case 1:
                        this.ai = am;
                        break;
                    case 3:
                        this.ai = ae;
                        break;
                    default:
                        this.ai = at;
                        break;
                }
            }
            ftVar.af(1752724762).ad(886718207);
            ag(f, -2088404722);
            lrVar.am(aj, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - 50, -1, 0, ftVar.af(1656403450));
            lrVar.am(this.ai, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) + 50, -1, 0, ftVar.af(1280895541));
            ftVar.as(0, 0, 2055970844);
        }
    }

    void aj(mv mvVar, lr lrVar, ft ftVar, float f) {
        if (mvVar != null) {
            if (this.ai == null) {
                switch (mvVar.ae * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.ai = aq;
                        break;
                    case 1:
                        this.ai = am;
                        break;
                    case 3:
                        this.ai = ae;
                        break;
                    default:
                        this.ai = at;
                        break;
                }
            }
            ftVar.af(1498661957).ad(182669320);
            ag(f, -1137231841);
            lrVar.am(aj, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - -1085288306, -1, 0, ftVar.af(-792769116));
            lrVar.am(this.ai, (this.az * -932095401) / 2, ((this.ah * 630076967) / 2) + 50, -1, 0, ftVar.af(1089860209));
            ftVar.as(0, 0, 855385354);
        }
    }

    void aq(mv mvVar, lr lrVar, ft ftVar, float f) {
        if (mvVar != null) {
            if (this.ai == null) {
                switch (mvVar.ae * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.ai = aq;
                        break;
                    case 1:
                        this.ai = am;
                        break;
                    case 3:
                        this.ai = ae;
                        break;
                    default:
                        this.ai = at;
                        break;
                }
            }
            ftVar.af(1501569356).ad(-2072594497);
            ag(f, -634275270);
            lrVar.am(aj, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - 50, -1, 0, ftVar.af(-1846250521));
            lrVar.am(this.ai, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) + 50, -1, 0, ftVar.af(-320977017));
            ftVar.as(0, 0, -18407086);
        }
    }

    void ar(mv mvVar, lr lrVar, ft ftVar, float f) {
        if (mvVar != null) {
            if (this.ai == null) {
                switch (mvVar.ae * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.ai = aq;
                        break;
                    case 1:
                        this.ai = am;
                        break;
                    case 3:
                        this.ai = ae;
                        break;
                    default:
                        this.ai = at;
                        break;
                }
            }
            ftVar.af(1020392568).ad(1763363431);
            ag(f, 2005931267);
            lrVar.am(aj, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - 50, -1, 0, ftVar.af(639819949));
            lrVar.am(this.ai, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) + 50, -1, 0, ftVar.af(-282863639));
            ftVar.as(0, 0, 496822151);
        }
    }

    void as(mv mvVar, lr lrVar, ft ftVar, float f) {
        if (mvVar != null) {
            if (this.ai == null) {
                switch (mvVar.ae * 2141241185) {
                    case 0:
                    case 4:
                    case 7:
                    case 8:
                        this.ai = aq;
                        break;
                    case 1:
                        this.ai = am;
                        break;
                    case 3:
                        this.ai = ae;
                        break;
                    default:
                        this.ai = at;
                        break;
                }
            }
            ftVar.af(1655989452).ad(840460718);
            ag(f, -1300599381);
            lrVar.am(aj, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - 50, -1, 0, ftVar.af(388307659));
            lrVar.am(this.ai, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) + 50, -1, 0, ftVar.af(8125548));
            ftVar.as(0, 0, 1962541671);
        }
    }

    void ab(int i, lr lrVar, ft ftVar, float f) {
        ftVar.af(-679380664).ad(1036369613);
        ag(f, 1632098367);
        lrVar.am(ab, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - 50, -1, 0, ftVar.af(-1180445843));
        lr lrVar2 = lrVar;
        lrVar2.am(String.format(aw, new Object[]{Integer.valueOf(i)}), (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) + 50, -1, 0, ftVar.af(-759972417));
        ftVar.as(0, 0, 1746170288);
    }

    void ai(int i, lr lrVar, ft ftVar, float f) {
        ftVar.af(929091885).ad(1636628693);
        ag(f, -2001646664);
        lrVar.am(ab, (this.az * 1794083055) / 2, ((630076967 * this.ah) / 2) - -527606653, -1, 0, ftVar.af(-596135429));
        lr lrVar2 = lrVar;
        lrVar2.am(String.format(aw, new Object[]{Integer.valueOf(i)}), (this.az * 1794083055) / 2, ((-65228943 * this.ah) / 2) + 50, -1, 0, ftVar.af(1575830413));
        ftVar.as(0, 0, 1271405427);
    }

    void am(int i, lr lrVar, ft ftVar, float f) {
        ftVar.af(-1584395331).ad(-266449398);
        ag(f, -583556978);
        lrVar.am(ab, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - 50, -1, 0, ftVar.af(1215624838));
        lr lrVar2 = lrVar;
        lrVar2.am(String.format(aw, new Object[]{Integer.valueOf(i)}), (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) + 50, -1, 0, ftVar.af(-196620695));
        ftVar.as(0, 0, 291289538);
    }

    void an(int i, lr lrVar, ft ftVar, float f, byte b) {
        try {
            ftVar.af(-1807792722).ad(1261920561);
            ag(f, 458769620);
            lrVar.am(ab, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - 50, -1, 0, ftVar.af(415248865));
            lr lrVar2 = lrVar;
            lrVar2.am(String.format(aw, new Object[]{Integer.valueOf(i)}), (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) + 50, -1, 0, ftVar.af(-53672021));
            ftVar.as(0, 0, 2054512842);
        } catch (Throwable e) {
            throw ba.ad(e, "ll.an(" + ')');
        }
    }

    void at(int i, lr lrVar, ft ftVar, float f) {
        ftVar.af(-354352647).ad(737340077);
        ag(f, -1037181338);
        lrVar.am(ab, (1655498285 * this.az) / 2, ((1377444161 * this.ah) / 2) - 50, -1, 0, ftVar.af(295265626));
        lr lrVar2 = lrVar;
        lrVar2.am(String.format(aw, new Object[]{Integer.valueOf(i)}), (this.az * 280313303) / 2, ((-1267918188 * this.ah) / 2) + 50, -1, 0, ftVar.af(-509530256));
        ftVar.as(0, 0, -374742198);
    }

    void aw(int i, lr lrVar, ft ftVar, float f) {
        ftVar.af(1958162289).ad(-2123483919);
        ag(f, 1604413798);
        lrVar.am(ab, (this.az * 1794083055) / 2, ((this.ah * 630076967) / 2) - -1037012357, -1, 0, ftVar.af(-748804677));
        lr lrVar2 = lrVar;
        lrVar2.am(String.format(aw, new Object[]{Integer.valueOf(i)}), (this.az * 1794083055) / 2, 2047524264 + ((this.ah * 630076967) / 2), -1, 0, ftVar.af(598188302));
        ftVar.as(0, 0, 961430178);
    }

    void aa(lr lrVar, ft ftVar, float f, byte b) {
        try {
            ftVar.af(1716449992).ad(-1482534193);
            ag(f, 794394492);
            lrVar.am(ae, (1794083055 * this.az) / 2, (this.ah * 630076967) / 2, -1, 0, ftVar.af(-1618876028));
            ftVar.as(0, 0, 236806134);
        } catch (Throwable e) {
            throw ba.ad(e, "ll.aa(" + ')');
        }
    }

    void ah(lr lrVar, ft ftVar, float f) {
        ftVar.af(1937685652).ad(-459236401);
        ag(f, -1860766147);
        lrVar.am(ae, (1794083055 * this.az) / 2, (this.ah * 630076967) / 2, -1, 0, ftVar.af(-183221483));
        ftVar.as(0, 0, 2097741460);
    }

    void az(lr lrVar, ft ftVar, float f) {
        ftVar.af(349116698).ad(-385309634);
        ag(f, 947071641);
        lrVar.am(ae, (626901358 * this.az) / 2, (this.ah * -1804427662) / 2, -1, 0, ftVar.af(-1156025487));
        ftVar.as(0, 0, 1805934114);
    }

    void ag(float f, int i) {
        int i2 = af;
        int i3 = 503;
        if (f > an) {
            i2 = (int) (503.0f * f);
        } else if (f > 0.0f) {
            i3 = (int) (765.0f / f);
        }
        try {
            this.az = i2 * -1315658225;
            this.ah = i3 * 712104343;
        } catch (Throwable e) {
            throw ba.ad(e, "ll.ag(" + ')');
        }
    }

    void ak(float f) {
        int i = af;
        int i2 = 503;
        if (f > an) {
            i = (int) (503.0f * f);
        } else if (f > 0.0f) {
            i2 = (int) (765.0f / f);
        }
        this.az = i * 749138246;
        this.ah = i2 * 1411685586;
    }

    void ao(float f) {
        int i = af;
        int i2 = 503;
        if (f > an) {
            i = (int) (503.0f * f);
        } else if (f > 0.0f) {
            i2 = (int) (765.0f / f);
        }
        this.az = i * -1315658225;
        this.ah = i2 * 712104343;
    }

    void ax(float f) {
        int i = -1550018950;
        int i2 = -1717904789;
        if (f > an) {
            i = (int) (503.0f * f);
        } else if (f > 0.0f) {
            i2 = (int) (765.0f / f);
        }
        this.az = i * -1091154366;
        this.ah = i2 * -680561743;
    }
}
