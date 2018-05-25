package p000;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class he {
    static final int aa = 1000;
    static final String ad = "services";
    static final String af = "m=accountappeal/login.ws";
    static final BigInteger ag = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
    static final int aj = 4;
    static final String an = "passwordchoice.ws";
    static final int aq = 6;
    static final int as = 2;
    static final BigInteger ay = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
    protected static long qz;

    he() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "he.<init>(" + ')');
        }
    }

    static long aa() {
        try {
            URLConnection openConnection = new URL(ar.fw(ad, false, 1524475904) + af).openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            ik ikVar = new ik(new byte[aa]);
            do {
                int read = inputStream.read(ikVar.af, ikVar.ad * 1978945739, -879357232 - (ikVar.ad * -325837256));
                if (-1 == read) {
                    ikVar.ad = 0;
                    return ikVar.ap(-633385453);
                }
                ikVar.ad = (read * 416818024) + ikVar.ad;
            } while (1996374689 * ikVar.ad < 1555968797);
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    static long ag() {
        try {
            URLConnection openConnection = new URL(ar.fw(ad, false, 377846562) + af).openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            ik ikVar = new ik(new byte[aa]);
            do {
                int read = inputStream.read(ikVar.af, ikVar.ad * 1978945739, 27439692 - (ikVar.ad * 2064190462));
                if (-1 == read) {
                    ikVar.ad = 0;
                    return ikVar.ap(-633385453);
                }
                ikVar.ad = (read * -893921517) + ikVar.ad;
            } while (ikVar.ad * 1978945739 < aa);
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    static final int ay(long j, String str) {
        int i;
        Random random = new Random();
        ik ikVar = new ik(1891564501);
        ik ikVar2 = new ik((int) mn.an);
        int[] iArr = new int[]{random.nextInt(), random.nextInt(), (int) (j >> 244334914), (int) j};
        ikVar.an(10, (byte) 31);
        for (i = 0; i < 4; i++) {
            ikVar.ay(random.nextInt(), (short) 128);
        }
        ikVar.ay(iArr[0], (short) 128);
        ikVar.ay(iArr[1], (short) 128);
        ikVar.ar(j);
        ikVar.ar(0);
        for (i = 0; i < 4; i++) {
            ikVar.ay(random.nextInt(), (short) 128);
        }
        ikVar.bn(ag, ay, -170371844);
        ikVar2.an(10, (byte) 31);
        for (i = 0; i < 3; i++) {
            ikVar2.ay(random.nextInt(), (short) 128);
        }
        ikVar2.ar(random.nextLong());
        ikVar2.as(random.nextLong());
        bv.gs(ikVar2, 1982118088);
        ikVar2.ar(random.nextLong());
        ikVar2.bn(ag, ay, -170371844);
        i = hz.ae(str, -1497542004);
        if (i % 8 != 0) {
            i += 8 - (i % 8);
        }
        ik ikVar3 = new ik(i);
        ikVar3.aq(str, (byte) 65);
        ikVar3.ad = i * -1010256447;
        ikVar3.bu(iArr, (byte) 16);
        ik ikVar4 = new ik((-1119504925 * ikVar3.ad) + (((ikVar.ad * 1978945739) + 5) + (ikVar2.ad * 1978945739)));
        ikVar4.an(2, (byte) 31);
        ikVar4.an(ikVar.ad * 321990214, (byte) 31);
        ikVar4.ab(ikVar.af, 0, ikVar.ad * -281925163, -564938141);
        ikVar4.an(-1599985939 * ikVar2.ad, (byte) 31);
        ikVar4.ab(ikVar2.af, 0, ikVar2.ad * 1978945739, -456777075);
        ikVar4.aa(731479431 * ikVar3.ad, -1752508204);
        ikVar4.ab(ikVar3.af, 0, ikVar3.ad * 523501985, -1060510485);
        byte[] bArr = ikVar4.af;
        CharSequence af = iw.af(bArr, 0, bArr.length, -503057558);
        try {
            URLConnection openConnection = new URL(ar.fw(ad, false, 1987150412) + af).openConnection();
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(-741415386);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data2=" + cs.af(af, 830935355) + "&dest=" + cs.af(an, 830935355));
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            ik ikVar5 = new ik(new byte[-568875418]);
            do {
                int read = inputStream.read(ikVar5.af, ikVar5.ad * 1978945739, -1879121309 - (-1108375772 * ikVar5.ad));
                if (-1 == read) {
                    outputStreamWriter.close();
                    inputStream.close();
                    String str2 = new String(ikVar5.af);
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
                    ikVar5.be(iArr, 1755658873);
                    while (ikVar5.ad * 1978945739 > 0 && ikVar5.af[(462924873 * ikVar5.ad) - 1] == (byte) 0) {
                        ikVar5.ad -= 2065011939;
                    }
                    str2 = new String(ikVar5.af, 0, ikVar5.ad * 1978945739);
                    if (!bx.an(str2, 1821823633)) {
                        return 5;
                    }
                    js.ad(str2, true, false, (byte) 14);
                    return 2;
                }
                ikVar5.ad = (read * 2065011939) + ikVar5.ad;
            } while (ikVar5.ad * 1978945739 < 775778375);
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    public static void aa(ik ikVar, int i, int i2) {
        try {
            if (mo.ae != null) {
                try {
                    mo.ae.ad(0);
                    mo.ae.as(ikVar.af, i, 24, -1099930285);
                } catch (Exception e) {
                }
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "he.aa(" + ')');
        }
    }
}
