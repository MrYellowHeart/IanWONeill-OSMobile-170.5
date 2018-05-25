package p000;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class ht extends ev {
    public static final int ap = 32;

    static final int ad(long j, String str, int i) {
        int i2 = 0;
        try {
            int i3;
            Random random = new Random();
            ik ikVar = new ik((int) mn.an);
            ik ikVar2 = new ik((int) mn.an);
            int[] iArr = new int[]{random.nextInt(), random.nextInt(), (int) (j >> 32), (int) j};
            ikVar.an(10, (byte) 31);
            for (i3 = 0; i3 < 4; i3++) {
                ikVar.ay(random.nextInt(), (short) 128);
            }
            ikVar.ay(iArr[0], (short) 128);
            ikVar.ay(iArr[1], (short) 128);
            ikVar.ar(j);
            ikVar.ar(0);
            for (i3 = 0; i3 < 4; i3++) {
                ikVar.ay(random.nextInt(), (short) 128);
            }
            ikVar.bn(he.ag, he.ay, -170371844);
            ikVar2.an(10, (byte) 31);
            while (i2 < 3) {
                ikVar2.ay(random.nextInt(), (short) 128);
                i2++;
            }
            ikVar2.ar(random.nextLong());
            ikVar2.as(random.nextLong());
            bv.gs(ikVar2, 1292972865);
            ikVar2.ar(random.nextLong());
            ikVar2.bn(he.ag, he.ay, -170371844);
            i2 = hz.ae(str, -171934281);
            if (i2 % 8 != 0) {
                i2 += 8 - (i2 % 8);
            }
            ik ikVar3 = new ik(i2);
            ikVar3.aq(str, (byte) 91);
            ikVar3.ad = i2 * 2065011939;
            ikVar3.bu(iArr, (byte) 16);
            ik ikVar4 = new ik((ikVar3.ad * 1978945739) + (((ikVar.ad * 1978945739) + 5) + (ikVar2.ad * 1978945739)));
            ikVar4.an(2, (byte) 31);
            ikVar4.an(ikVar.ad * 1978945739, (byte) 31);
            ikVar4.ab(ikVar.af, 0, ikVar.ad * 1978945739, 2071419023);
            ikVar4.an(ikVar2.ad * 1978945739, (byte) 31);
            ikVar4.ab(ikVar2.af, 0, ikVar2.ad * 1978945739, 1271282467);
            ikVar4.aa(ikVar3.ad * 1978945739, -1752508204);
            ikVar4.ab(ikVar3.af, 0, ikVar3.ad * 1978945739, 607146739);
            byte[] bArr = ikVar4.af;
            CharSequence af = iw.af(bArr, 0, bArr.length, -1227331882);
            try {
                URLConnection openConnection = new URL(ar.fw("services", false, 928234974) + "m=accountappeal/login.ws").openConnection();
                openConnection.setDoInput(true);
                openConnection.setDoOutput(true);
                openConnection.setConnectTimeout(5000);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
                outputStreamWriter.write("data2=" + cs.af(af, 830935355) + "&dest=" + cs.af("passwordchoice.ws", 830935355));
                outputStreamWriter.flush();
                InputStream inputStream = openConnection.getInputStream();
                ikVar3 = new ik(new byte[1000]);
                do {
                    int read = inputStream.read(ikVar3.af, ikVar3.ad * 1978945739, 1000 - (ikVar3.ad * 1978945739));
                    if (-1 == read) {
                        outputStreamWriter.close();
                        inputStream.close();
                        String str2 = new String(ikVar3.af);
                        if (str2.startsWith("OFFLINE")) {
                            return 4;
                        }
                        if (str2.startsWith("WRONG")) {
                            return 7;
                        }
                        if (str2.startsWith("RELOAD")) {
                            return 3;
                        }
                        if (str2.startsWith("Not permitted for social network accounts.")) {
                            return 6;
                        }
                        ikVar3.be(iArr, 1755658873);
                        while (ikVar3.ad * 1978945739 > 0 && ikVar3.af[(ikVar3.ad * 1978945739) - 1] == (byte) 0) {
                            ikVar3.ad -= 2065011939;
                        }
                        str2 = new String(ikVar3.af, 0, ikVar3.ad * 1978945739);
                        if (!bx.an(str2, 1238726631)) {
                            return 5;
                        }
                        js.ad(str2, true, false, (byte) 14);
                        return 2;
                    }
                    ikVar3.ad = (read * 2065011939) + ikVar3.ad;
                } while (ikVar3.ad * 1978945739 < 1000);
                return 5;
            } catch (Throwable th) {
                th.printStackTrace();
                return 5;
            }
        } catch (Throwable th2) {
            throw ba.ad(th2, "ht.ad(" + ')');
        }
    }

    static final int ae(int i) {
        try {
            return cs.ag * 340086283;
        } catch (Throwable e) {
            throw ba.ad(e, "ht.ae(" + ')');
        }
    }

    static ba ae(int i, byte b) {
        try {
            ba baVar = (ba) ah.ag.af((long) i);
            if (baVar == null) {
                baVar = dk.af(ah.ad, ah.an, i, false, (byte) 1);
                if (baVar != null) {
                    ah.ag.an(baVar, (long) i);
                }
            }
            return baVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ht.ae(" + ')');
        }
    }

    ht() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "ht.<init>(" + ')');
        }
    }

    protected boolean aa(int i, int i2, int i3, eq eqVar) {
        return i2 == -1205974761 * this.af && this.ad * 989331065 == i3;
    }

    protected boolean ad(int i, int i2, int i3, eq eqVar) {
        return i2 == -1205974761 * this.af && this.ad * 989331065 == i3;
    }

    protected boolean af(int i, int i2, int i3, eq eqVar, byte b) {
        try {
            return i2 == -1205974761 * this.af && this.ad * 989331065 == i3;
        } catch (Throwable e) {
            throw ba.ad(e, "ht.af(" + ')');
        }
    }

    protected boolean an(int i, int i2, int i3, eq eqVar) {
        return i2 == -1205974761 * this.af && this.ad * 2024830596 == i3;
    }
}
