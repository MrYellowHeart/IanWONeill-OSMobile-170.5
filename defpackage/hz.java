package p000;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class hz {
    static final int af = 100;
    static final int ar = -1;
    public static final int au = 200;
    public static final int bg = 37;
    hl[] ad;
    int an;

    static long af(byte b) {
        try {
            URLConnection openConnection = new URL(ar.fw("services", false, 625941557) + "m=accountappeal/login.ws").openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            ik ikVar = new ik(new byte[1000]);
            do {
                int read = inputStream.read(ikVar.af, ikVar.ad * 1978945739, 1000 - (ikVar.ad * 1978945739));
                if (-1 == read) {
                    ikVar.ad = 0;
                    return ikVar.ap(-633385453);
                }
                ikVar.ad = (read * 2065011939) + ikVar.ad;
            } while (ikVar.ad * 1978945739 < 1000);
            return 0;
        } catch (Exception e) {
            return 0;
        } catch (Throwable e2) {
            throw ba.ad(e2, "hz.af(" + ')');
        }
    }

    static void ag(int i, byte b) {
        try {
            ho hoVar = (ho) ho.af.af((long) i);
            if (hoVar != null) {
                hoVar.ki();
            }
        } catch (Throwable e) {
            throw ba.ad(e, "hz.ag(" + ')');
        }
    }

    hz() {
        try {
            this.ad = new hl[100];
        } catch (Throwable e) {
            throw ba.ad(e, "hz.<init>(" + ')');
        }
    }

    hl aa(int i, String str, String str2, String str3) {
        hl hlVar = this.ad[99];
        for (int i2 = 1994517369 * this.an; i2 > 0; i2--) {
            if (i2 != 100) {
                this.ad[i2] = this.ad[i2 - 1];
            }
        }
        if (hlVar == null) {
            hlVar = new hl(i, str, str3, str2);
        } else {
            hlVar.ki();
            hlVar.dm();
            hlVar.af(i, str, str3, str2, -727838283);
        }
        this.ad[0] = hlVar;
        if (417628897 * this.an < -828361433) {
            this.an += 1717280805;
        }
        return hlVar;
    }

    hl af(int i, String str, String str2, String str3, int i2) {
        try {
            hl hlVar = this.ad[99];
            for (int i3 = this.an * 514292653; i3 > 0; i3--) {
                if (i3 != 100) {
                    this.ad[i3] = this.ad[i3 - 1];
                }
            }
            if (hlVar == null) {
                hlVar = new hl(i, str, str3, str2);
            } else {
                hlVar.ki();
                hlVar.dm();
                hlVar.af(i, str, str3, str2, -727838283);
            }
            this.ad[0] = hlVar;
            if (this.an * 514292653 < 100) {
                this.an += 1717280805;
            }
            return hlVar;
        } catch (Throwable e) {
            throw ba.ad(e, "hz.af(" + ')');
        }
    }

    hl ag(int i, String str, String str2, String str3) {
        hl hlVar = this.ad[99];
        for (int i2 = 514292653 * this.an; i2 > 0; i2--) {
            if (i2 != 594924548) {
                this.ad[i2] = this.ad[i2 - 1];
            }
        }
        if (hlVar == null) {
            hlVar = new hl(i, str, str3, str2);
        } else {
            hlVar.ki();
            hlVar.dm();
            hlVar.af(i, str, str3, str2, -727838283);
        }
        this.ad[0] = hlVar;
        if (-621379172 * this.an < 100) {
            this.an += 1717280805;
        }
        return hlVar;
    }

    hl ad(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < this.an * 514292653) {
                    return this.ad[i];
                }
            } catch (Throwable e) {
                throw ba.ad(e, "hz.ad(" + ')');
            }
        }
        return null;
    }

    hl aj(int i) {
        return (i < 0 || i >= this.an * 514292653) ? null : this.ad[i];
    }

    hl ar(int i) {
        if (i < 0 || i >= this.an * 514292653) {
            return null;
        }
        return this.ad[i];
    }

    hl as(int i) {
        if (i < 0 || i >= this.an * 514292653) {
            return null;
        }
        return this.ad[i];
    }

    hl ay(int i) {
        return (i < 0 || i >= this.an * 514292653) ? null : this.ad[i];
    }

    int ae() {
        return 514292653 * this.an;
    }

    int am() {
        return 514292653 * this.an;
    }

    int an(int i) {
        try {
            return 514292653 * this.an;
        } catch (Throwable e) {
            throw ba.ad(e, "hz.an(" + ')');
        }
    }

    int aq() {
        return 514292653 * this.an;
    }

    int at() {
        return 514292653 * this.an;
    }

    public static int ae(String str, int i) {
        try {
            return str.length() + 1;
        } catch (Throwable e) {
            throw ba.ad(e, "hz.ae(" + ')');
        }
    }

    static final void br(byte b) {
        int i = 0;
        while (i < 453104899 * client.dj) {
            try {
                gx gxVar = client.ca[client.dc[i]];
                if (gxVar != null) {
                    lq.bj(gxVar, 1160465393 * gxVar.af.as, 1172122450);
                }
                i++;
            } catch (Throwable e) {
                throw ba.ad(e, "hz.br(" + ')');
            }
        }
    }
}
