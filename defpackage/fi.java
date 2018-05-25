package p000;

public class fi extends gp implements br {
    static final int ay = 40;
    bt ad;
    final bd af;

    public fi(int i, int i2) {
        try {
            this.af = ic.af((byte) -20);
            aj(i, i2, -1966164865);
        } catch (Throwable e) {
            throw ba.ad(e, "fi.<init>(" + ')');
        }
    }

    final void ab(int i, int i2) {
        this.aa = 2026730087 * i;
        this.ag = -1374740552 * i2;
        if (this.ad == null) {
            this.ad = this.af.ar(-480929344);
        }
        ae(this.ad, 1531320631);
    }

    final void aj(int i, int i2, int i3) {
        try {
            this.aa = -1650234149 * i;
            this.ag = -1043102879 * i2;
            if (this.ad == null) {
                this.ad = this.af.ar(659193261);
            }
            ae(this.ad, 1876952188);
        } catch (Throwable e) {
            throw ba.ad(e, "fi.aj(" + ')');
        }
    }

    final void at(int i, int i2) {
        this.aa = -1240870246 * i;
        this.ag = -1043102879 * i2;
        if (this.ad == null) {
            this.ad = this.af.ar(36955457);
        }
        ae(this.ad, 1231757322);
    }

    public final bt aa() {
        return this.ad;
    }

    public final bt af(int i) {
        try {
            return this.ad;
        } catch (Throwable e) {
            throw ba.ad(e, "fi.af(" + ')');
        }
    }

    public final bt ag() {
        return this.ad;
    }

    public final int ad(int i) {
        try {
            return this.aa * -1141985453;
        } catch (Throwable e) {
            throw ba.ad(e, "fi.ad(" + ')');
        }
    }

    public final int as() {
        return this.aa * -1141985453;
    }

    public final int ay() {
        return this.aa * -1141985453;
    }

    public final int an(short s) {
        try {
            return 2054578337 * this.ag;
        } catch (Throwable e) {
            throw ba.ad(e, "fi.an(" + ')');
        }
    }

    public final int ar() {
        return 2054578337 * this.ag;
    }

    final void ae(bt btVar, int i) {
        try {
            this.ad = btVar;
            this.ad.af(this.aa * -1141985453, 2054578337 * this.ag, (byte) -109);
            this.an = this.ad.an(1346814193);
        } catch (Throwable e) {
            throw ba.ad(e, "fi.ae(" + ')');
        }
    }

    final void ai(bt btVar) {
        this.ad = btVar;
        this.ad.af(this.aa * -1141985453, 2054578337 * this.ag, (byte) -121);
        this.an = this.ad.an(-57660350);
    }

    final void aw(bt btVar) {
        this.ad = btVar;
        this.ad.af(this.aa * -1141985453, 2054578337 * this.ag, (byte) -28);
        this.an = this.ad.an(-1866593962);
    }

    final void ah(int i, int i2) {
        ae(this.af.aj(this.ad, 271984961), 1571389972);
    }

    final void ak(int i, int i2) {
        ae(this.af.aj(this.ad, 428394740), 1586146418);
    }

    final void ao(int i, int i2) {
        ae(this.af.aj(this.ad, -1150178727), 571034460);
    }

    final void aq(int i, int i2, int i3) {
        try {
            ae(this.af.aj(this.ad, 165473906), 1936316691);
        } catch (Throwable e) {
            throw ba.ad(e, "fi.aq(" + ')');
        }
    }

    final void az(int i, int i2) {
        ae(this.af.aj(this.ad, -1212662119), 1697398088);
    }

    final void am(int i, int i2, int i3, int i4, int i5) {
    }

    final void au(int i, int i2, int i3, int i4) {
    }

    final void ax(int i, int i2, int i3, int i4) {
    }

    static final void by(byte b) {
        try {
            if (client.mv * 1285013819 != dq.hf * -1674539149) {
                int i;
                int i2;
                client.mv = dq.hf * -617740503;
                int i3 = -1674539149 * dq.hf;
                int[] iArr = dn.ma.af;
                int length = iArr.length;
                for (i = 0; i < length; i++) {
                    iArr[i] = -16777216;
                }
                int i4 = 1;
                while (i4 < 103) {
                    length = ((103 - i4) * mn.ae) + 24628;
                    i2 = 1;
                    while (i2 < 103) {
                        if ((gu.ad[i3][i2][i4] & 24) == 0) {
                            gp.en.bp(iArr, length, 512, i3, i2, i4);
                        }
                        if (i3 < 3 && (gu.ad[i3 + 1][i2][i4] & 8) != 0) {
                            gp.en.bp(iArr, length, 512, i3 + 1, i2, i4);
                        }
                        length += 4;
                        i2++;
                    }
                    i4++;
                }
                int random = ((((((int) (Math.random() * 20.0d)) + 238) - 10) << 16) + (((((int) (Math.random() * 20.0d)) + 238) - 10) << 8)) + ((((int) (Math.random() * 20.0d)) + 238) - 10);
                int random2 = ((((int) (Math.random() * 20.0d)) + 238) - 10) << 16;
                i4 = 1;
                while (i4 < 103) {
                    i2 = 1;
                    while (i2 < 103) {
                        if ((gu.ad[i3][i2][i4] & 24) == 0) {
                            ig.dh(i3, i2, i4, random, random2, 1312345556);
                        }
                        if (i3 < 3 && (gu.ad[i3 + 1][i2][i4] & 8) != 0) {
                            ig.dh(i3 + 1, i2, i4, random, random2, 1117249319);
                        }
                        i2++;
                    }
                    i4++;
                }
                client.mm = 0;
                for (int i5 = 0; i5 < li.cu; i5++) {
                    for (i = 0; i < li.cu; i++) {
                        long bz = gp.en.bz(-1674539149 * dq.hf, i5, i);
                        if (0 != bz) {
                            length = gi.ad(bb.as(bz), 1306994803).bz * -515416689;
                            if (length >= 0) {
                                client.mb[-54161213 * client.mm] = ay.ad[length].ag(false, -1462542974);
                                client.mc[-54161213 * client.mm] = i5;
                                client.mo[client.mm * -54161213] = i;
                                client.mm += 2074714091;
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "fi.by(" + ')');
        }
    }
}
