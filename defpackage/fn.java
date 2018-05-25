package p000;

import com.jagex.oldscape.osrenderer.af;
import com.jagex.oldscape.osrenderer.zv;

public class fn extends fa {
    fn() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "fn.<init>(" + ')');
        }
    }

    public void aq(byte b) {
    }

    public void bu() {
    }

    public void am(int i, int i2) {
        try {
            af.at((byte) 1);
        } catch (Throwable e) {
            throw ba.ad(e, "fn.am(" + ')');
        }
    }

    public void be(int i) {
        af.at((byte) 1);
    }

    public void bk(int i) {
        af.at((byte) 1);
    }

    public void by(int i) {
        af.at((byte) 1);
    }

    void at(int i) {
        try {
            af.ab((byte) -47);
        } catch (Throwable e) {
            throw ba.ad(e, "fn.at(" + ')');
        }
    }

    void ba() {
        af.ab((byte) -12);
    }

    void bn() {
        af.ab((byte) -52);
    }

    void ab(byte b) {
    }

    void bl() {
    }

    protected synchronized void an(int i) {
        try {
            if (this.aq != null) {
                af.aw(1942092353);
                int az = af.az((byte) 67);
                int ai = af.ai(2034583219);
                if (az < ai) {
                    for (int i2 = az; i2 < ai; i2 += 256) {
                        ar(this.aq, 256);
                        if (!this.ae) {
                            int[] iArr = this.aq;
                            if (iv.ad) {
                                az = 512;
                            } else {
                                az = 256;
                            }
                            zv.oe(iArr, az);
                        }
                    }
                }
                zv.ho();
            }
        } catch (Exception e) {
            zv.ho();
        } catch (Throwable e2) {
            throw ba.ad(e2, "fn.an(" + ')');
        } catch (Throwable th) {
            zv.ho();
        }
    }

    protected synchronized void ao() {
        if (this.aq != null) {
            try {
                af.aw(1901987907);
                int az = af.az((byte) 45);
                int ai = af.ai(-96150511);
                if (az < ai) {
                    for (int i = az; i < ai; i += 256) {
                        ar(this.aq, 256);
                        if (!this.ae) {
                            int[] iArr = this.aq;
                            if (iv.ad) {
                                az = 512;
                            } else {
                                az = 256;
                            }
                            zv.oe(iArr, az);
                        }
                    }
                }
            } catch (Exception e) {
            } finally {
                zv.ho();
            }
        }
    }
}
