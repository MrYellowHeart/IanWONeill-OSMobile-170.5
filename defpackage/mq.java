package p000;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;

public class mq extends RuntimeException {
    public static String ad;
    public static URL af;
    public static int an;
    String ag;
    Throwable ay;

    mq(Throwable th, String str) {
        try {
            this.ag = str;
            this.ay = th;
        } catch (Throwable e) {
            throw ba.ad(e, "mq.<init>(" + ')');
        }
    }

    public static void aa(String str, Throwable th) {
        try {
            String str2 = "";
            if (th != null) {
                str2 = jz.an(th, 146096009);
            }
            if (str != null) {
                if (th != null) {
                    str2 = str2 + " | ";
                }
                str2 = str2 + str;
            }
            System.out.println("Error: " + str2);
            str2 = str2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if (af != null) {
                DataInputStream dataInputStream = new DataInputStream(new URL(af, "clienterror.ws?c=" + (1643082463 * an) + "&u=" + ad + "&v1=" + mj.af + "&v2=" + mj.ad + "&e=" + str2 + "&ct=" + (nf.aa * -410611811) + "&e=" + str2).openStream());
                dataInputStream.read();
                dataInputStream.close();
            }
        } catch (Exception e) {
        }
    }

    public static void ag(String str, Throwable th) {
        try {
            String str2 = "";
            if (th != null) {
                str2 = jz.an(th, 146096009);
            }
            if (str != null) {
                if (th != null) {
                    str2 = str2 + " | ";
                }
                str2 = str2 + str;
            }
            System.out.println("Error: " + str2);
            str2 = str2.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if (af != null) {
                DataInputStream dataInputStream = new DataInputStream(new URL(af, "clienterror.ws?c=" + (1643082463 * an) + "&u=" + ad + "&v1=" + mj.af + "&v2=" + mj.ad + "&e=" + str2 + "&ct=" + (nf.aa * -410611811) + "&e=" + str2).openStream());
                dataInputStream.read();
                dataInputStream.close();
            }
        } catch (Exception e) {
        }
    }

    public static void ay(String str, Throwable th) {
        try {
            String str2 = "";
            if (th != null) {
                str2 = jz.an(th, 146096009);
            }
            if (str != null) {
                if (th != null) {
                    str2 = str2 + " | ";
                }
                str2 = str2 + str;
            }
            System.out.println("Error: " + str2);
            str2 = str2.replace(':', '').replace('@', '晡').replace('&', '_').replace('#', '堄');
            if (af != null) {
                DataInputStream dataInputStream = new DataInputStream(new URL(af, "clienterror.ws?c=" + (1643082463 * an) + "&u=" + ad + "&v1=" + mj.af + "&v2=" + mj.ad + "&e=" + str2 + "&ct=" + (nf.aa * -410611811) + "&e=" + str2).openStream());
                dataInputStream.read();
                dataInputStream.close();
            }
        } catch (Exception e) {
        }
    }

    public static mq as(Throwable th, String str) {
        if (!(th instanceof mq)) {
            return new mq(th, str);
        }
        mq mqVar = (mq) th;
        mqVar.ag += ' ' + str;
        return mqVar;
    }

    static String aj(Throwable th) throws IOException {
        String str;
        if (th instanceof mq) {
            mq mqVar = (mq) th;
            str = mqVar.ag + " | ";
            th = mqVar.ay;
        } else {
            str = "";
        }
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
        String readLine = bufferedReader.readLine();
        while (true) {
            String readLine2 = bufferedReader.readLine();
            if (readLine2 == null) {
                return str + "| " + readLine;
            }
            int indexOf = readLine2.indexOf(40);
            int indexOf2 = readLine2.indexOf(41, indexOf + 1);
            if (indexOf >= 0 && indexOf2 >= 0) {
                String substring = readLine2.substring(indexOf + 1, indexOf2);
                int indexOf3 = substring.indexOf(".java:");
                if (indexOf3 >= 0) {
                    str = str + (substring.substring(0, indexOf3) + substring.substring(indexOf3 + 5)) + ' ';
                } else {
                    readLine2 = readLine2.substring(0, indexOf);
                }
            }
            readLine2 = readLine2.trim();
            readLine2 = readLine2.substring(readLine2.lastIndexOf(32) + 1);
            str = str + readLine2.substring(readLine2.lastIndexOf(9) + 1) + ' ';
        }
    }

    static String ar(Throwable th) throws IOException {
        String str;
        if (th instanceof mq) {
            mq mqVar = (mq) th;
            str = mqVar.ag + " | ";
            th = mqVar.ay;
        } else {
            str = "";
        }
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
        String readLine = bufferedReader.readLine();
        while (true) {
            String readLine2 = bufferedReader.readLine();
            if (readLine2 == null) {
                return str + "| " + readLine;
            }
            int indexOf = readLine2.indexOf(40);
            int indexOf2 = readLine2.indexOf(-835578726, indexOf + 1);
            if (indexOf >= 0 && indexOf2 >= 0) {
                String substring = readLine2.substring(indexOf + 1, indexOf2);
                int indexOf3 = substring.indexOf(".java:");
                if (indexOf3 >= 0) {
                    str = str + (substring.substring(0, indexOf3) + substring.substring(indexOf3 + 5)) + ' ';
                } else {
                    readLine2 = readLine2.substring(0, indexOf);
                }
            }
            readLine2 = readLine2.trim();
            readLine2 = readLine2.substring(readLine2.lastIndexOf(-705743067) + 1);
            str = str + readLine2.substring(readLine2.lastIndexOf(9) + 1) + ' ';
        }
    }

    static void ag(ia iaVar, int i, int i2) {
        try {
            Object obj;
            int i3;
            if (iaVar.kf(1, (byte) -27) == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                int[] iArr = gw.ab;
                i3 = gw.at + 1377463787;
                gw.at = i3;
                iArr[(i3 * 482038467) - 1] = i;
            }
            int kf = iaVar.kf(2, (byte) -102);
            ga gaVar = client.hb[i];
            if (kf == 0) {
                if (obj != null) {
                    gaVar.bb = false;
                } else if (i == -1522892003 * client.hz) {
                    throw new RuntimeException();
                } else {
                    gw.ae[i] = (((-277606385 * gaVar.ac) << 28) + (((gaVar.di[0] + (bq.du * 1407993063)) >> 13) << 14)) + ((gaVar.da[0] + (1289967967 * gl.dp)) >> 13);
                    if (323118731 * gaVar.cs != -1) {
                        gw.aq[i] = 323118731 * gaVar.cs;
                    } else {
                        gw.aq[i] = -1058596255 * gaVar.dz;
                    }
                    gw.am[i] = gaVar.ck * -609375913;
                    client.hb[i] = null;
                    if (iaVar.kf(1, (byte) -78) != 0) {
                        bt.ay(iaVar, i, 79865063);
                    }
                }
            } else if (1 == kf) {
                r5 = iaVar.kf(3, (byte) -75);
                i3 = gaVar.di[0];
                kf = gaVar.da[0];
                if (r5 == 0) {
                    i3--;
                    kf--;
                } else if (1 == r5) {
                    kf--;
                } else if (r5 == 2) {
                    i3++;
                    kf--;
                } else if (r5 == 3) {
                    i3--;
                } else if (r5 == 4) {
                    i3++;
                } else if (5 == r5) {
                    i3--;
                    kf++;
                } else if (r5 == 6) {
                    kf++;
                } else if (7 == r5) {
                    i3++;
                    kf++;
                }
                if (i == -1522892003 * client.hz && (gaVar.bg * 516759209 < eu.ar || gaVar.bh * 2328865 < eu.ar || gaVar.bg * 516759209 >= 11776 || gaVar.bh * 2328865 >= 11776)) {
                    gaVar.at(i3, kf, -1400208079);
                    gaVar.bb = false;
                } else if (obj != null) {
                    gaVar.bb = true;
                    gaVar.bc = i3 * -1732185005;
                    gaVar.bz = kf * -1115815949;
                } else {
                    gaVar.bb = false;
                    gaVar.am(i3, kf, gw.aa[i], -285954126);
                }
            } else if (2 == kf) {
                r5 = iaVar.kf(4, (byte) -29);
                i3 = gaVar.di[0];
                kf = gaVar.da[0];
                if (r5 == 0) {
                    i3 -= 2;
                    kf -= 2;
                } else if (1 == r5) {
                    i3--;
                    kf -= 2;
                } else if (2 == r5) {
                    kf -= 2;
                } else if (r5 == 3) {
                    i3++;
                    kf -= 2;
                } else if (r5 == 4) {
                    i3 += 2;
                    kf -= 2;
                } else if (r5 == 5) {
                    i3 -= 2;
                    kf--;
                } else if (6 == r5) {
                    i3 += 2;
                    kf--;
                } else if (7 == r5) {
                    i3 -= 2;
                } else if (8 == r5) {
                    i3 += 2;
                } else if (9 == r5) {
                    i3 -= 2;
                    kf++;
                } else if (r5 == 10) {
                    i3 += 2;
                    kf++;
                } else if (11 == r5) {
                    i3 -= 2;
                    kf += 2;
                } else if (12 == r5) {
                    i3--;
                    kf += 2;
                } else if (r5 == 13) {
                    kf += 2;
                } else if (14 == r5) {
                    i3++;
                    kf += 2;
                } else if (r5 == 15) {
                    i3 += 2;
                    kf += 2;
                }
                if (-1522892003 * client.hz == i && (516759209 * gaVar.bg < eu.ar || gaVar.bh * 2328865 < eu.ar || gaVar.bg * 516759209 >= 11776 || gaVar.bh * 2328865 >= 11776)) {
                    gaVar.at(i3, kf, -1715066825);
                    gaVar.bb = false;
                } else if (obj != null) {
                    gaVar.bb = true;
                    gaVar.bc = i3 * -1732185005;
                    gaVar.bz = kf * -1115815949;
                } else {
                    gaVar.bb = false;
                    gaVar.am(i3, kf, gw.aa[i], -907938464);
                }
            } else if (iaVar.kf(1, (byte) -40) == 0) {
                i3 = iaVar.kf(12, (byte) -56);
                r3 = i3 >> 10;
                kf = (i3 >> 5) & 31;
                if (kf > 15) {
                    kf -= 32;
                }
                i3 &= 31;
                if (i3 > 15) {
                    i3 -= 32;
                }
                kf += gaVar.di[0];
                i3 += gaVar.da[0];
                if (client.hz * -1522892003 == i && (gaVar.bg * 516759209 < eu.ar || gaVar.bh * 2328865 < eu.ar || gaVar.bg * 516759209 >= 11776 || gaVar.bh * 2328865 >= 11776)) {
                    gaVar.at(kf, i3, -2101537664);
                    gaVar.bb = false;
                } else if (obj != null) {
                    gaVar.bb = true;
                    gaVar.bc = kf * -1732185005;
                    gaVar.bz = -1115815949 * i3;
                } else {
                    gaVar.bb = false;
                    gaVar.am(kf, i3, gw.aa[i], -136829882);
                }
                gaVar.ac = ((byte) (((-277606385 * gaVar.ac) + r3) & 3)) * -1345790225;
                if (client.hz * -1522892003 == i) {
                    dq.hf = gaVar.ac * -1742053899;
                }
            } else {
                kf = iaVar.kf(30, (byte) -38);
                i3 = kf >> 28;
                r3 = ((((kf >> 14) & 16383) + (gaVar.di[0] + (bq.du * 1407993063))) & 16383) - (bq.du * 1407993063);
                kf = (((kf & 16383) + ((gl.dp * 1289967967) + gaVar.da[0])) & 16383) - (1289967967 * gl.dp);
                if (i == -1522892003 * client.hz && (516759209 * gaVar.bg < eu.ar || gaVar.bh * 2328865 < eu.ar || 516759209 * gaVar.bg >= 11776 || gaVar.bh * 2328865 >= 11776)) {
                    gaVar.at(r3, kf, -1642434231);
                    gaVar.bb = false;
                } else if (obj != null) {
                    gaVar.bb = true;
                    gaVar.bc = -1732185005 * r3;
                    gaVar.bz = kf * -1115815949;
                } else {
                    gaVar.bb = false;
                    gaVar.am(r3, kf, gw.aa[i], -1031612555);
                }
                gaVar.ac = -1345790225 * ((byte) ((i3 + (-277606385 * gaVar.ac)) & 3));
                if (i == -1522892003 * client.hz) {
                    dq.hf = gaVar.ac * -1742053899;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "mq.ag(" + ')');
        }
    }
}
