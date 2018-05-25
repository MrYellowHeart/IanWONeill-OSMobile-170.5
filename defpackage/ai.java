package p000;

public class ai extends kq {
    public static ky ad = new ky(64, null);
    static kf af = null;
    static final int at = 4700;
    public static final int az = 33;
    static kh bj = null;
    static final int bl = 2;
    static int ni;
    public char aa;
    public String[] ae;
    public String ag;
    public int[] aj;
    public char an;
    public int[] ar;
    public int as;
    public int ay;

    ai() {
        try {
            this.ag = jv.aj;
            this.as = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ai.<init>(" + ')');
        }
    }

    public static ai ay(int i) {
        ai aiVar = (ai) ad.af((long) i);
        if (aiVar == null) {
            byte[] an = af.an(8, i, -704820823);
            aiVar = new ai();
            if (an != null) {
                aiVar.an(new ik(an), 812414808);
            }
            ad.an(aiVar, (long) i);
        }
        return aiVar;
    }

    void ae(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, (byte) -46);
            } else {
                return;
            }
        }
    }

    void aj(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, (byte) -83);
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
                    aa(ikVar, ao, (byte) -94);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ai.an(" + ')');
            }
        }
    }

    void ar(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, (byte) -93);
            } else {
                return;
            }
        }
    }

    void as(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                aa(ikVar, ao, (byte) -81);
            } else {
                return;
            }
        }
    }

    void aa(ik ikVar, int i, byte b) {
        int i2 = 0;
        if (1 == i) {
            try {
                this.an = (char) ikVar.ao((byte) 0);
            } catch (Throwable e) {
                throw ba.ad(e, "ai.aa(" + ')');
            }
        } else if (i == 2) {
            this.aa = (char) ikVar.ao((byte) 0);
        } else if (i == 3) {
            this.ag = ikVar.bc(259440205);
        } else if (4 == i) {
            this.ay = ikVar.al(1525355296) * 808635215;
        } else if (i == 5) {
            this.as = ikVar.au(-1153312276) * 1309147683;
            this.ar = new int[(this.as * -112083573)];
            this.ae = new String[(this.as * -112083573)];
            while (i2 < this.as * -112083573) {
                this.ar[i2] = ikVar.al(1455620126);
                this.ae[i2] = ikVar.bc(1371065677);
                i2++;
            }
        } else if (i == 6) {
            this.as = ikVar.au(1660950482) * 1309147683;
            this.ar = new int[(this.as * -112083573)];
            this.aj = new int[(this.as * -112083573)];
            while (i2 < this.as * -112083573) {
                this.ar[i2] = ikVar.al(-757209399);
                this.aj[i2] = ikVar.al(1073938267);
                i2++;
            }
        }
    }

    void am(ik ikVar, int i) {
        int i2 = 0;
        if (1 == i) {
            this.an = (char) ikVar.ao((byte) 0);
        } else if (i == 2) {
            this.aa = (char) ikVar.ao((byte) 0);
        } else if (i == 3) {
            this.ag = ikVar.bc(1908277437);
        } else if (4 == i) {
            this.ay = ikVar.al(-178716257) * 808635215;
        } else if (i == 5) {
            this.as = ikVar.au(-1368066836) * 1309147683;
            this.ar = new int[(this.as * -112083573)];
            this.ae = new String[(this.as * -112083573)];
            while (i2 < this.as * -112083573) {
                this.ar[i2] = ikVar.al(-119162489);
                this.ae[i2] = ikVar.bc(357793495);
                i2++;
            }
        } else if (i == 6) {
            this.as = ikVar.au(895397969) * 1309147683;
            this.ar = new int[(this.as * -112083573)];
            this.aj = new int[(this.as * -112083573)];
            while (i2 < this.as * -112083573) {
                this.ar[i2] = ikVar.al(26457778);
                this.aj[i2] = ikVar.al(1482821035);
                i2++;
            }
        }
    }

    void aq(ik ikVar, int i) {
        int i2 = 0;
        if (1 == i) {
            this.an = (char) ikVar.ao((byte) 0);
        } else if (i == 2) {
            this.aa = (char) ikVar.ao((byte) 0);
        } else if (i == 3) {
            this.ag = ikVar.bc(745377045);
        } else if (4 == i) {
            this.ay = ikVar.al(39573345) * 808635215;
        } else if (i == 5) {
            this.as = ikVar.au(-1400279550) * 1309147683;
            this.ar = new int[(this.as * -112083573)];
            this.ae = new String[(this.as * -112083573)];
            while (i2 < this.as * -112083573) {
                this.ar[i2] = ikVar.al(-1151260827);
                this.ae[i2] = ikVar.bc(2070021169);
                i2++;
            }
        } else if (i == 6) {
            this.as = ikVar.au(-2136980798) * 1309147683;
            this.ar = new int[(this.as * -112083573)];
            this.aj = new int[(this.as * -112083573)];
            while (i2 < this.as * -112083573) {
                this.ar[i2] = ikVar.al(105993363);
                this.aj[i2] = ikVar.al(2135949420);
                i2++;
            }
        }
    }

    void at(ik ikVar, int i) {
        int i2 = 0;
        if (1 == i) {
            this.an = (char) ikVar.ao((byte) 0);
        } else if (i == 2) {
            this.aa = (char) ikVar.ao((byte) 0);
        } else if (i == 3) {
            this.ag = ikVar.bc(655952238);
        } else if (4 == i) {
            this.ay = ikVar.al(2114218360) * 808635215;
        } else if (i == 5) {
            this.as = ikVar.au(-1595514077) * 1309147683;
            this.ar = new int[(this.as * -112083573)];
            this.ae = new String[(this.as * -112083573)];
            while (i2 < this.as * -112083573) {
                this.ar[i2] = ikVar.al(841591959);
                this.ae[i2] = ikVar.bc(1289182608);
                i2++;
            }
        } else if (i == 6) {
            this.as = ikVar.au(1330341371) * 1309147683;
            this.ar = new int[(this.as * -112083573)];
            this.aj = new int[(this.as * -112083573)];
            while (i2 < this.as * -112083573) {
                this.ar[i2] = ikVar.al(1329688826);
                this.aj[i2] = ikVar.al(-782433030);
                i2++;
            }
        }
    }

    public static void ag(int i, int i2) {
        try {
            mf.ag = 63807465;
            ex.ay = null;
            ml.as = 1919717083;
            mf.ar = 2021257265;
            ci.aj = 0;
            gm.aq = false;
            cb.ae = 1758792857 * i;
        } catch (Throwable e) {
            throw ba.ad(e, "ai.ag(" + ')');
        }
    }

    public int ab() {
        return this.as * -112083573;
    }

    public int ag(byte b) {
        try {
            return this.as * -112083573;
        } catch (Throwable e) {
            throw ba.ad(e, "ai.ag(" + ')');
        }
    }
}
