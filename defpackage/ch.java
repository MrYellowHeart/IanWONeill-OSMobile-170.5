package p000;

public abstract class ch {
    static int ab = 0;
    public static final int ah = 64;
    public static boolean an = true;
    static byte[][][] ar = null;
    public static final int aw = 2;

    abstract void aa(cc ccVar, bl blVar, int i, int i2, int i3, int i4, int i5, int i6, byte b);

    abstract void ab(cc ccVar, bl blVar, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract cn ad(byte b);

    abstract void ae(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract bi af(int i);

    public abstract bi ag();

    public abstract cn aj();

    abstract void am(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    abstract void an(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    abstract void aq(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public abstract cn ar();

    public abstract bi as();

    abstract void at(cc ccVar, be beVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    abstract void aw(cc ccVar, bl blVar, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract bi ay();

    ch() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "ch.<init>(" + ')');
        }
    }

    public void ah(int i) {
    }

    public void ai(int i, byte b) {
    }

    public void ak(int i) {
    }

    public void ao(int i) {
    }

    public void az(int i) {
    }

    public static int aa(boolean z, boolean z2, int i) {
        int i2 = 0;
        if (z) {
            try {
                i2 = 0 + ((-773058017 * jw.ag) + (-33214903 * jw.as));
            } catch (Throwable e) {
                throw ba.ad(e, "ch.aa(" + ')');
            }
        }
        return z2 ? i2 + ((-2034551303 * jw.ae) + (-920885363 * jw.am)) : i2;
    }

    static final void cj(int i, int i2, int i3, int i4, int i5) {
        try {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            long nanoTime = System.nanoTime();
            client.gx += 1370958301;
            if (((516759209 * gf.ho.bg) >> 7) == client.mj * -502376731 && ((2328865 * gf.ho.bh) >> 7) == 1931904491 * client.mw) {
                client.mj = 0;
            }
            cz.ct(-2106217445);
            if (1640838373 * client.im >= 0 && client.hb[client.im * 1640838373] != null) {
                kf.cu(client.hb[1640838373 * client.im], false, -648412244);
            }
            dt.dj(true, -1954745340);
            ba.cb(-1532092339);
            dt.dj(false, -1640174051);
            gx.dc(555494997);
            cq cqVar = (hu) client.ib.as();
            while (cqVar != null) {
                if (-1674539149 * dq.hf != 487694493 * cqVar.an || cqVar.ae) {
                    cqVar.ki();
                } else if (1581849891 * client.ak >= 1033436157 * cqVar.ad) {
                    cqVar.af(client.ej * -2000050073, 444742068);
                    if (cqVar.ae) {
                        cqVar.ki();
                    } else {
                        gp.en.am(cqVar.an * 487694493, cqVar.aa * -570609171, -1662952889 * cqVar.ag, 1820774789 * cqVar.ay, 60, cqVar, 0, -1, false);
                    }
                }
                cqVar = (hu) client.ib.aj();
            }
            mf.cp(i, i2, i3, i4, true, -1814050410);
            int i13 = client.om * -799207233;
            int i14 = client.op * -784386417;
            int i15 = 2140963035 * client.oc;
            int i16 = -1949120505 * client.ot;
            client.ad.ry.af(457068554).fj(i13, i14, i13 + i15, i14 + i16, -1879486423);
            ch uu = client.ad.uu(-1725047075);
            bi af = uu.af(144700525);
            af.af(-271693784);
            af.bf(i13, i14, i15 + i13, i16 + i14, (byte) 48);
            af.bv(-2126838720);
            if (!client.nm) {
                int i17;
                float f = (mc.pc * ((float) (client.fe * -424339111))) + ((float) (client.fz * 1679658745));
                if (f < 128.0f) {
                    f = 128.0f;
                } else if (f > 383.0f) {
                    f = 383.0f;
                }
                i6 = (int) f;
                if ((client.gt * 1959418925) / 256 > i6) {
                    i6 = (1959418925 * client.gt) / 256;
                }
                if (!client.nk[4] || client.oo[4] + mn.an <= i6) {
                    i17 = i6;
                } else {
                    i17 = client.oo[4] + mn.an;
                }
                int i18 = ((int) (((mc.pc * ((float) (client.fs * 1025736795))) + ((float) (client.fn * -198683079))) % 2048.0f)) & 2047;
                int i19 = -1216222673 * be.gs;
                i7 = et.gp * -1241354743;
                i8 = ed.gf * 1417186721;
                i6 = (i17 * 3) + 600;
                i9 = (2048 - i17) & 2047;
                i10 = (2048 - i18) & 2047;
                int i20 = 0;
                if (i9 != 0) {
                    i11 = bi.az[i9];
                    i12 = bi.ah[i9];
                    i6 = ((i6 * i12) + (0 * i11)) >> 16;
                    i20 = ((i12 * 0) - (i11 * i6)) >> 16;
                }
                if (i10 != 0) {
                    i11 = bi.az[i10];
                    i10 = bi.ah[i10];
                    i9 = ((i11 * i6) + (0 * i10)) >> 16;
                    i6 = ((i6 * i10) - (0 * i11)) >> 16;
                } else {
                    i9 = 0;
                }
                aa.fp = (i19 - i9) * -443041885;
                cz.fg = (i7 - i20) * -1527798187;
                mk.fq = (i8 - i6) * -451992303;
                dw.fo = -741992617 * i17;
                mz.fu = -1359668543 * i18;
                if (1 == 780758273 * client.fi && client.jc * -2036797811 >= 2 && (client.ak * 1581849891) % 50 == 0 && !(((516759209 * gf.ho.bg) >> 7) == ((be.gs * -1216222673) >> 7) && ((1417186721 * ed.gf) >> 7) == ((gf.ho.bh * 2328865) >> 7))) {
                    gk.gp(((be.gs * -1216222673) >> 7) + (1407993063 * bq.du), ((1417186721 * ed.gf) >> 7) + (gl.dp * 1289967967), -277606385 * gf.ho.ac, true, (byte) -44);
                }
            }
            if (client.nm) {
                if (cs.oj.an) {
                    i6 = -1674539149 * dq.hf;
                } else if (iz.de(aa.fp * -721800181, -2076152847 * mk.fq, dq.hf * -1674539149, 1752324281) - (43525885 * cz.fg) >= 800 || (gu.ad[-1674539149 * dq.hf][(-721800181 * aa.fp) >> 7][(-2076152847 * mk.fq) >> 7] & 4) == 0) {
                    i6 = 3;
                } else {
                    i6 = -1674539149 * dq.hf;
                }
                i7 = i6;
            } else {
                i7 = bo.dk(-1194553915);
            }
            i8 = aa.fp * -721800181;
            i10 = cz.fg * 43525885;
            i11 = -2076152847 * mk.fq;
            i12 = dw.fo * -1421687705;
            int i21 = 1124758849 * mz.fu;
            for (i6 = 0; i6 < 5; i6++) {
                if (client.nk[i6]) {
                    i9 = (int) (((Math.random() * ((double) ((client.nl[i6] * 2) + 1))) - ((double) client.nl[i6])) + (Math.sin((((double) client.ol[i6]) / 100.0d) * ((double) client.on[i6])) * ((double) client.oo[i6])));
                    if (i6 == 0) {
                        aa.fp += -443041885 * i9;
                    }
                    if (i6 == 1) {
                        cz.fg += -1527798187 * i9;
                    }
                    if (i6 == 2) {
                        mk.fq += -451992303 * i9;
                    }
                    if (3 == i6) {
                        mz.fu = (((1124758849 * mz.fu) + i9) & 2047) * -1359668543;
                    }
                    if (4 == i6) {
                        dw.fo = (i9 * -741992617) + dw.fo;
                        if (dw.fo * -1421687705 < mn.an) {
                            dw.fo = -485774464;
                        }
                        if (-1421687705 * dw.fo > 383) {
                            dw.fo = -715330775;
                        }
                    }
                }
            }
            i9 = -1;
            i6 = -1;
            if (cn.bf((byte) -59)) {
                i9 = -356911569 * client.ao.ae;
                i6 = client.ao.aq * 695318399;
            }
            if (i9 < i13 || i9 >= i15 + i13 || i6 < i14 || i6 >= i16 + i14) {
                dk.aj(1134844291);
            } else {
                i6 -= i14;
                cs.aa = (i9 - i13) * -287121659;
                cs.ag = i6 * 200428963;
                cs.an = true;
                cs.ai = 0;
                cs.ay = false;
            }
            uu.ai(1581849891 * client.ak, (byte) -73);
            int bg = af.bg(-1208701334);
            af.an(client.ou * 2097392939, -1701198609);
            if (client.px) {
                gp.en.bn(uu, aa.fp * -721800181, cz.fg * 43525885, -2076152847 * mk.fq, -1421687705 * dw.fo, mz.fu * 1124758849, i7);
            }
            af.bz(bg, -2067554013);
            gp.en.aw();
            hj.dl(i13, i14, i15, i16, -1374758230);
            ib.m17do(i13, i14, 1842045126);
            ((cd) bi.ab).bw(-2000050073 * client.ej, -1860035093);
            nq.ii.bz(client.ad.ry.af(-204921627), -368034426);
            cm.di((byte) 0);
            aa.fp = -443041885 * i8;
            cz.fg = -1527798187 * i10;
            mk.fq = -451992303 * i11;
            dw.fo = -741992617 * i12;
            mz.fu = -1359668543 * i21;
            if (client.ah && ch.aa(true, false, 708775659) == 0) {
                client.ah = false;
            }
            if (client.ah) {
                client.ad.ry.af(1645442261).aa(i13, i14, i15, i16, 0, (byte) 31);
                en.cq(jv.am, false, 178159538);
            }
            client.pb.af(System.nanoTime() - nanoTime);
        } catch (Throwable e) {
            throw ba.ad(e, "ch.cj(" + ')');
        }
    }
}
