package p000;

public class bo {
    static final int ac = 2;
    public static final int ag = 4;
    public static final int an = 14;
    static gd[] ay = null;
    static final int dw = 5000;

    bo() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "bo.<init>(" + ')');
        }
    }

    static String af(int i, byte b) {
        try {
            return "<img=" + i + ">";
        } catch (Throwable e) {
            throw ba.ad(e, "bo.af(" + ')');
        }
    }

    static final void aq(String str, int i) {
        try {
            cz.aj(str + jv.go, (byte) 4);
        } catch (Throwable e) {
            throw ba.ad(e, "bo.aq(" + ')');
        }
    }

    static void be(int i, int i2) {
        if (i == -1) {
            try {
                if (!client.me) {
                    mx.an((byte) 42);
                    client.mx = -541914011 * i;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "bo.be(" + ')');
            }
        }
        if (!(-1 == i || i == client.mx * 1387447661 || client.mk * -1819605895 == 0 || client.me)) {
            kf kfVar = client.bo;
            int i3 = client.mk * -1819605895;
            mf.ag = 63807465;
            ex.ay = kfVar;
            ml.as = -1919717083 * i;
            mf.ar = 0;
            ci.aj = -1734207119 * i3;
            gm.aq = false;
            cb.ae = -777381582;
        }
        client.mx = -541914011 * i;
    }

    static final int dk(int i) {
        try {
            if (cs.oj.an) {
                return dq.hf * -1674539149;
            }
            int i2 = 3;
            if (dw.fo * -1421687705 < 310) {
                int i3;
                int i4;
                if (1 == client.fi * 780758273) {
                    i3 = (1417186721 * ed.gf) >> 7;
                    i4 = (be.gs * -1216222673) >> 7;
                } else {
                    i3 = (gf.ho.bh * 2328865) >> 7;
                    i4 = (gf.ho.bg * 516759209) >> 7;
                }
                int i5 = (-721800181 * aa.fp) >> 7;
                int i6 = (mk.fq * -2076152847) >> 7;
                if (i5 < 0 || i6 < 0 || i5 >= li.cu || i6 >= li.cu) {
                    return dq.hf * -1674539149;
                }
                if (i4 < 0 || i3 < 0 || i4 >= li.cu || i3 >= li.cu) {
                    return dq.hf * -1674539149;
                }
                int i7;
                int i8;
                if ((gu.ad[dq.hf * -1674539149][i5][i6] & 4) != 0) {
                    i2 = dq.hf * -1674539149;
                }
                if (i4 > i5) {
                    i7 = i4 - i5;
                } else {
                    i7 = i5 - i4;
                }
                if (i3 > i6) {
                    i8 = i3 - i6;
                } else {
                    i8 = i6 - i3;
                }
                if (i7 > i8) {
                    int i9 = (i8 * ic.ad) / i7;
                    i7 = 32768;
                    i8 = i6;
                    i6 = i5;
                    while (i4 != i6) {
                        i5 = i6 < i4 ? i6 + 1 : i6 > i4 ? i6 - 1 : i6;
                        if ((gu.ad[dq.hf * -1674539149][i5][i8] & 4) != 0) {
                            i6 = dq.hf * -1674539149;
                        } else {
                            i6 = i2;
                        }
                        i2 = i7 + i9;
                        if (i2 >= ic.ad) {
                            i7 = i2 - ic.ad;
                            if (i8 < i3) {
                                i2 = i8 + 1;
                            } else if (i8 > i3) {
                                i2 = i8 - 1;
                            } else {
                                i2 = i8;
                            }
                            if ((gu.ad[dq.hf * -1674539149][i5][i2] & 4) != 0) {
                                i8 = i2;
                                i2 = dq.hf * -1674539149;
                                i6 = i5;
                            } else {
                                i8 = i2;
                                i2 = i6;
                                i6 = i5;
                            }
                        } else {
                            i7 = i2;
                            i2 = i6;
                            i6 = i5;
                        }
                    }
                } else if (i8 > 0) {
                    i7 = (i7 * ic.ad) / i8;
                    i8 = i5;
                    i5 = 32768;
                    while (i6 != i3) {
                        if (i6 < i3) {
                            i6++;
                        } else if (i6 > i3) {
                            i6--;
                        }
                        if ((gu.ad[dq.hf * -1674539149][i8][i6] & 4) != 0) {
                            i2 = dq.hf * -1674539149;
                        }
                        i5 += i7;
                        if (i5 >= ic.ad) {
                            i5 -= ic.ad;
                            if (i8 < i4) {
                                i8++;
                            } else if (i8 > i4) {
                                i8--;
                            }
                            if ((gu.ad[dq.hf * -1674539149][i8][i6] & 4) != 0) {
                                i2 = dq.hf * -1674539149;
                            }
                        }
                    }
                }
            }
            if (gf.ho.bg * 516759209 < 0 || gf.ho.bh * 2328865 < 0 || gf.ho.bg * 516759209 >= 13312 || gf.ho.bh * 2328865 >= 13312) {
                return dq.hf * -1674539149;
            }
            if ((gu.ad[dq.hf * -1674539149][(gf.ho.bg * 516759209) >> 7][(gf.ho.bh * 2328865) >> 7] & 4) != 0) {
                return dq.hf * -1674539149;
            }
            return i2;
        } catch (Throwable e) {
            throw ba.ad(e, "bo.dk(" + ')');
        }
    }
}
