package p000;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Collection;

public class ag extends kq {
    public static ky ad = new ky(64, null);
    static kf ae = null;
    public static kf af = null;
    static final int ai = 360;
    public static fm at = null;
    public static final int bp = 41;
    public static final int bw = 33;
    public int aa;
    public int ag;
    public int an;

    static int af(int i, int i2, int i3) {
        try {
            ho hoVar = (ho) ho.af.af((long) i);
            if (hoVar == null) {
                return 0;
            }
            if (i2 < 0 || i2 >= hoVar.an.length) {
                return 0;
            }
            return hoVar.an[i2];
        } catch (Throwable e) {
            throw ba.ad(e, "ag.af(" + ')');
        }
    }

    public static File af(String str, byte b) {
        RandomAccessFile randomAccessFile;
        try {
            if (lz.af) {
                File file = (File) lz.an.get(str);
                if (file == null) {
                    file = new File(lz.ad, str);
                    try {
                        if (new File(file.getParent()).exists()) {
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, cw.an);
                            try {
                                int read = randomAccessFile2.read();
                                randomAccessFile2.seek(0);
                                randomAccessFile2.write(read);
                                randomAccessFile2.seek(0);
                                randomAccessFile2.close();
                                lz.an.put(str, file);
                            } catch (Exception e) {
                                randomAccessFile = randomAccessFile2;
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (Exception e2) {
                                    }
                                }
                                throw new RuntimeException();
                            }
                        }
                        throw new RuntimeException("");
                    } catch (Exception e3) {
                        randomAccessFile = null;
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        throw new RuntimeException();
                    }
                }
                return file;
            }
            throw new RuntimeException("");
        } catch (Throwable e4) {
            throw ba.ad(e4, "ag.af(" + ')');
        }
    }

    public static void ag(kf kfVar) {
        af = kfVar;
    }

    public static void ay(kf kfVar) {
        af = kfVar;
    }

    public void ad(ik ikVar, byte b) {
        while (true) {
            try {
                int ao = ikVar.ao((byte) 0);
                if (ao != 0) {
                    an(ikVar, ao, (byte) 114);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "ag.ad(" + ')');
            }
        }
    }

    public void ar(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                an(ikVar, ao, (byte) 35);
            } else {
                return;
            }
        }
    }

    public void as(ik ikVar) {
        while (true) {
            int ao = ikVar.ao((byte) 0);
            if (ao != 0) {
                an(ikVar, ao, (byte) 45);
            } else {
                return;
            }
        }
    }

    void aj(ik ikVar, int i) {
        if (i == 1) {
            this.an = ikVar.au(-370419185) * -184736157;
            this.aa = ikVar.ao((byte) 0) * 2073104653;
            this.ag = ikVar.ao((byte) 0) * -1621997509;
        }
    }

    void an(ik ikVar, int i, byte b) {
        if (i == 1) {
            try {
                this.an = ikVar.au(1965008831) * -184736157;
                this.aa = ikVar.ao((byte) 0) * 2073104653;
                this.ag = ikVar.ao((byte) 0) * -1621997509;
            } catch (Throwable e) {
                throw ba.ad(e, "ag.an(" + ')');
            }
        }
    }

    public static az ad(int i, int i2) {
        try {
            az azVar = (az) az.an.af((long) i);
            if (azVar == null) {
                byte[] an = az.af.an(13, i, -592586913);
                azVar = new az();
                azVar.ag = -207412785 * i;
                if (an != null) {
                    azVar.an(new ik(an), -1757885994);
                }
                az.an.an(azVar, (long) i);
            }
            return azVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ag.ad(" + ')');
        }
    }

    public static void ae(Collection collection) {
        collection.add(ad);
    }

    public static void aq(Collection collection) {
        collection.add(ad);
    }
}
