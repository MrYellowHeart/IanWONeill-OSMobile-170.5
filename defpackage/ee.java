package p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ee extends ea {
    static final int bg = 32;
    static int df;
    final nv aj;

    public ee(nv nvVar) {
        try {
            super(400);
            this.aj = nvVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ee.<init>(" + ')');
        }
    }

    et ao(byte b) {
        try {
            return new ef();
        } catch (Throwable e) {
            throw ba.ad(e, "ee.ao(" + ')');
        }
    }

    et cd() {
        return new ef();
    }

    et ch() {
        return new ef();
    }

    et[] ax(int i, int i2) {
        try {
            return new ef[i];
        } catch (Throwable e) {
            throw ba.ad(e, "ee.ax(" + ')');
        }
    }

    et[] cj(int i) {
        return new ef[i];
    }

    et[] cm(int i) {
        return new ef[i];
    }

    et[] cq(int i) {
        return new ef[i];
    }

    public void dt(ik ikVar, int i, byte b) {
        while (ikVar.ad * 1978945739 < i) {
            try {
                Object obj = 1 == (ikVar.ao((byte) 0) & 1) ? 1 : null;
                ey eyVar = new ey(ikVar.bc(1130519913), this.aj);
                ey eyVar2 = new ey(ikVar.bc(1479875419), this.aj);
                ikVar.bc(1202254798);
                if (eyVar == null || !eyVar.ad(-1069759578)) {
                    throw new IllegalStateException();
                }
                et etVar = (ef) ay(eyVar, 1099558325);
                if (obj != null) {
                    et etVar2 = (ef) ay(eyVar2, 1099558325);
                    if (!(etVar2 == null || etVar == etVar2)) {
                        if (etVar != null) {
                            aj(etVar2, 2142124456);
                        } else {
                            etVar = etVar2;
                        }
                    }
                }
                if (etVar != null) {
                    ab(etVar, eyVar, eyVar2, (byte) 64);
                } else if (ad(1447332004) < 400) {
                    ((ef) aq(eyVar, eyVar2, -386352732)).af = ad(1654481576) * -1443010645;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ee.dt(" + ')');
            }
        }
    }

    public static void ad(int i, int i2, short s) {
        try {
            ag agVar = (ag) ag.ad.af((long) i);
            if (agVar == null) {
                byte[] an = ag.af.an(14, i, -1525055865);
                agVar = new ag();
                if (an != null) {
                    agVar.ad(new ik(an), (byte) -82);
                }
                ag.ad.an(agVar, (long) i);
            }
            int i3 = agVar.an * -345339061;
            int i4 = -1983699515 * agVar.aa;
            int i5 = al.af[(agVar.ag * -2000072461) - i4];
            if (i2 < 0 || i2 > i5) {
                i2 = 0;
            }
            i5 <<= i4;
            al.an[i3] = (i5 & (i2 << i4)) | (al.an[i3] & (i5 ^ -1));
        } catch (Throwable e) {
            throw ba.ad(e, "ee.ad(" + ')');
        }
    }

    public static void ad(File file, int i) {
        try {
            if (file.exists()) {
                mo.ae = new nn(new nw(file, cw.an, 25), 24, 0);
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, cw.an);
            int read = randomAccessFile.read();
            randomAccessFile.seek(0);
            randomAccessFile.write(read);
            randomAccessFile.seek(0);
            randomAccessFile.close();
            mo.ae = new nn(new nw(file, cw.an, 25), 24, 0);
        } catch (IOException e) {
        } catch (Throwable e2) {
            throw ba.ad(e2, "ee.ad(" + ')');
        }
    }
}
