package p000;

import java.util.ArrayList;
import java.util.Collection;

public class av extends kd {
    static final int aa = 3;
    static final int ac = 24;
    static final int ad = 1;
    static final int ae = 3;
    static final int af = 6;
    static final int ag = 4;
    public static fq aj = null;
    static final int an = 2;
    public static final int ao = 8;
    static final int ar = 1;
    static final int at = 6;
    static final int aw = 8;
    static final int ax = 22;
    boolean as;
    int ay;
    int ba;
    String bd;
    int bf;
    int bi;
    int bj;
    int bk;
    String bl;
    String bm;
    int bn;
    String bo;
    int bp;
    int bq;
    int br;
    String bs;
    boolean bt;
    int bu;
    int bv;
    int bw;
    int bx;
    int cc;
    int[] ci;
    String cv;

    public static boolean an(int i, int i2) {
        return ((i >> 21) & 1) != 0;
    }

    public static ai ad(int i, int i2) {
        try {
            ai aiVar = (ai) ai.ad.af((long) i);
            if (aiVar == null) {
                byte[] an = ai.af.an(8, i, -1790187367);
                aiVar = new ai();
                if (an != null) {
                    aiVar.an(new ik(an), 812414808);
                }
                ai.ad.an(aiVar, (long) i);
            }
            return aiVar;
        } catch (Throwable e) {
            throw ba.ad(e, "av.ad(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public av(boolean r12) {
        /*
        r11 = this;
        r9 = 57;
        r8 = 48;
        r2 = 2;
        r1 = 0;
        r7 = -1;
        r11.<init>();	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = 3;
        r0 = new int[r0];	 Catch:{ RuntimeException -> 0x00a8 }
        r11.ci = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r12 == 0) goto L_0x02cc;
    L_0x0011:
        r0 = p000.gs.aw;	 Catch:{ RuntimeException -> 0x00a8 }
        r3 = "win";
        r0 = r0.startsWith(r3);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 == 0) goto L_0x0097;
    L_0x001b:
        r0 = 521887009; // 0x1f1b5d21 float:3.289956E-20 double:2.57846442E-315;
        r11.ay = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x0020:
        r0 = "os.arch";
        r0 = java.lang.System.getProperty(r0);	 Catch:{ Exception -> 0x00db }
        r0 = r0.toLowerCase();	 Catch:{ Exception -> 0x00db }
        r5 = r0;
    L_0x002b:
        r0 = "os.version";
        r0 = java.lang.System.getProperty(r0);	 Catch:{ Exception -> 0x00e1 }
        r0 = r0.toLowerCase();	 Catch:{ Exception -> 0x00e1 }
        r4 = r0;
    L_0x0036:
        r0 = "Unknown";
        r3 = "1.1";
        r6 = "java.vendor";
        r0 = java.lang.System.getProperty(r6);	 Catch:{ Exception -> 0x0307 }
        r6 = "java.version";
        r3 = java.lang.System.getProperty(r6);	 Catch:{ Exception -> 0x0307 }
    L_0x0046:
        r6 = "amd64";
        r6 = r5.startsWith(r6);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r6 != 0) goto L_0x0056;
    L_0x004e:
        r6 = "x86_64";
        r5 = r5.startsWith(r6);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == 0) goto L_0x00e7;
    L_0x0056:
        r5 = 1;
        r11.as = r5;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x0059:
        r5 = 1859675873; // 0x6ed866e1 float:3.3486568E28 double:9.188019612E-315;
        r6 = r11.ay;	 Catch:{ RuntimeException -> 0x00a8 }
        r5 = r5 * r6;
        r6 = 1;
        if (r5 != r6) goto L_0x0182;
    L_0x0062:
        r5 = "4.0";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x00ec;
    L_0x006a:
        r4 = -317152707; // 0xffffffffed18a23d float:-2.952366E27 double:NaN;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x006f:
        r4 = r0.toLowerCase();	 Catch:{ RuntimeException -> 0x00a8 }
        r5 = "sun";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x0202;
    L_0x007b:
        r0 = 92887247; // 0x58958cf float:1.2916041E-35 double:4.58923977E-316;
        r11.bf = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x0080:
        r0 = r1;
    L_0x0081:
        r4 = r3.length();	 Catch:{ Exception -> 0x0242 }
        if (r2 >= r4) goto L_0x0243;
    L_0x0087:
        r4 = r3.charAt(r2);	 Catch:{ Exception -> 0x0242 }
        if (r4 < r8) goto L_0x0243;
    L_0x008d:
        if (r4 > r9) goto L_0x0243;
    L_0x008f:
        r4 = r4 + -48;
        r0 = r0 * 10;
        r0 = r0 + r4;
        r2 = r2 + 1;
        goto L_0x0081;
    L_0x0097:
        r0 = p000.gs.aw;	 Catch:{ RuntimeException -> 0x00a8 }
        r3 = "mac";
        r0 = r0.startsWith(r3);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 == 0) goto L_0x00c3;
    L_0x00a1:
        r0 = 1043774018; // 0x3e36ba42 float:0.17844489 double:5.156928843E-315;
        r11.ay = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0020;
    L_0x00a8:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "av.<init>(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
    L_0x00c3:
        r0 = p000.gs.aw;	 Catch:{ RuntimeException -> 0x00a8 }
        r3 = "linux";
        r0 = r0.startsWith(r3);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 == 0) goto L_0x00d4;
    L_0x00cd:
        r0 = 1565661027; // 0x5d521763 float:9.4616735E17 double:7.735393265E-315;
        r11.ay = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0020;
    L_0x00d4:
        r0 = 2087548036; // 0x7c6d7484 float:4.9317503E36 double:1.0313857686E-314;
        r11.ay = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0020;
    L_0x00db:
        r0 = move-exception;
        r0 = "";
        r5 = r0;
        goto L_0x002b;
    L_0x00e1:
        r0 = move-exception;
        r0 = "";
        r4 = r0;
        goto L_0x0036;
    L_0x00e7:
        r5 = 0;
        r11.as = r5;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0059;
    L_0x00ec:
        r5 = "4.1";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x00fb;
    L_0x00f4:
        r4 = -634305414; // 0xffffffffda31447a float:-1.24740904E16 double:NaN;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x00fb:
        r5 = "4.9";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x010a;
    L_0x0103:
        r4 = -951458121; // 0xffffffffc749e6b7 float:-51686.715 double:NaN;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x010a:
        r5 = "5.0";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0119;
    L_0x0112:
        r4 = -1268610828; // 0xffffffffb46288f4 float:-2.1097713E-7 double:NaN;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0119:
        r5 = "5.1";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0128;
    L_0x0121:
        r4 = -1585763535; // 0xffffffffa17b2b31 float:-8.509927E-19 double:NaN;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0128:
        r5 = "5.2";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0137;
    L_0x0130:
        r4 = 1757745640; // 0x68c511e8 float:7.445092E24 double:8.68441735E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0137:
        r5 = "6.0";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0146;
    L_0x013f:
        r4 = -1902916242; // 0xffffffff8e93cd6e float:-3.643612E-30 double:NaN;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0146:
        r5 = "6.1";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0155;
    L_0x014e:
        r4 = 2074898347; // 0x7bac6fab float:1.7906799E36 double:1.025135992E-314;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0155:
        r5 = "6.2";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0164;
    L_0x015d:
        r4 = 1440592933; // 0x55ddb425 float:3.04707231E13 double:7.11747478E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0164:
        r5 = "6.3";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0173;
    L_0x016c:
        r4 = 1123440226; // 0x42f65662 float:123.16872 double:5.55053221E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0173:
        r5 = "10.0";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x006f;
    L_0x017b:
        r4 = 806287519; // 0x300ef89f float:5.201261E-10 double:3.98358964E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0182:
        r5 = 1859675873; // 0x6ed866e1 float:3.3486568E28 double:9.188019612E-315;
        r6 = r11.ay;	 Catch:{ RuntimeException -> 0x00a8 }
        r5 = r5 * r6;
        if (r2 != r5) goto L_0x006f;
    L_0x018a:
        r5 = "10.4";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0199;
    L_0x0192:
        r4 = -2048086844; // 0xffffffff85ecacc4 float:-2.2256797E-35 double:NaN;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0199:
        r5 = "10.5";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01a8;
    L_0x01a1:
        r4 = 1929727745; // 0x73054f01 float:1.0561796E31 double:9.534121846E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01a8:
        r5 = "10.6";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01b7;
    L_0x01b0:
        r4 = 1612575038; // 0x601df13e float:4.5523784E19 double:7.967179276E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01b7:
        r5 = "10.7";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01c6;
    L_0x01bf:
        r4 = 1295422331; // 0x4d36937b float:1.91444912E8 double:6.400236706E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01c6:
        r5 = "10.8";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01d5;
    L_0x01ce:
        r4 = 978269624; // 0x3a4f35b8 float:7.904428E-4 double:4.833294136E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01d5:
        r5 = "10.9";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01e4;
    L_0x01dd:
        r4 = 661116917; // 0x2767d7f5 float:3.217476E-15 double:3.266351566E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01e4:
        r5 = "10.10";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01f3;
    L_0x01ec:
        r4 = 343964210; // 0x14807a32 float:1.2972895E-26 double:1.699408996E-315;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01f3:
        r5 = "10.11";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x006f;
    L_0x01fb:
        r4 = 26811503; // 0x1991c6f float:5.6244124E-38 double:1.32466425E-316;
        r11.bw = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0202:
        r4 = r0.toLowerCase();	 Catch:{ RuntimeException -> 0x00a8 }
        r5 = "microsoft";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x0215;
    L_0x020e:
        r0 = 185774494; // 0xb12b19e float:2.8252202E-32 double:9.17847954E-316;
        r11.bf = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0080;
    L_0x0215:
        r4 = r0.toLowerCase();	 Catch:{ RuntimeException -> 0x00a8 }
        r5 = "apple";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x0228;
    L_0x0221:
        r0 = 278661741; // 0x109c0a6d float:6.1547214E-29 double:1.37677193E-315;
        r11.bf = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0080;
    L_0x0228:
        r0 = r0.toLowerCase();	 Catch:{ RuntimeException -> 0x00a8 }
        r4 = "oracle";
        r0 = r0.indexOf(r4);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 == r7) goto L_0x023b;
    L_0x0234:
        r0 = 464436235; // 0x1baebc0b float:2.8907405E-22 double:2.294619884E-315;
        r11.bf = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0080;
    L_0x023b:
        r0 = 371548988; // 0x1625633c float:1.3359907E-25 double:1.835695907E-315;
        r11.bf = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0080;
    L_0x0242:
        r2 = move-exception;
    L_0x0243:
        r2 = -1244765255; // 0xffffffffb5ce63b9 float:-1.5377219E-6 double:NaN;
        r0 = r0 * r2;
        r11.bv = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = 46;
        r2 = 2;
        r0 = r3.indexOf(r0, r2);	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0 + 1;
        r2 = r0;
        r0 = r1;
    L_0x0254:
        r4 = r3.length();	 Catch:{ Exception -> 0x026a }
        if (r2 >= r4) goto L_0x026b;
    L_0x025a:
        r4 = r3.charAt(r2);	 Catch:{ Exception -> 0x026a }
        if (r4 < r8) goto L_0x026b;
    L_0x0260:
        if (r4 > r9) goto L_0x026b;
    L_0x0262:
        r0 = r0 * 10;
        r4 = r4 + -48;
        r0 = r0 + r4;
        r2 = r2 + 1;
        goto L_0x0254;
    L_0x026a:
        r2 = move-exception;
    L_0x026b:
        r2 = 580100561; // 0x2293a1d1 float:4.001576E-18 double:2.866077583E-315;
        r0 = r0 * r2;
        r11.bp = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = 95;
        r2 = 4;
        r0 = r3.indexOf(r0, r2);	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0 + 1;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x027d:
        r2 = r3.length();	 Catch:{ Exception -> 0x0293 }
        if (r1 >= r2) goto L_0x0294;
    L_0x0283:
        r2 = r3.charAt(r1);	 Catch:{ Exception -> 0x0293 }
        if (r2 < r8) goto L_0x0294;
    L_0x0289:
        if (r2 > r9) goto L_0x0294;
    L_0x028b:
        r2 = r2 + -48;
        r0 = r0 * 10;
        r0 = r0 + r2;
        r1 = r1 + 1;
        goto L_0x027d;
    L_0x0293:
        r1 = move-exception;
    L_0x0294:
        r1 = -20496653; // 0xfffffffffec73ef3 float:-1.3242161E38 double:NaN;
        r0 = r0 * r1;
        r11.bx = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = 0;
        r11.bt = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = java.lang.Runtime.getRuntime();	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0.maxMemory();	 Catch:{ RuntimeException -> 0x00a8 }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0 / r2;
        r0 = (int) r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0 + 1;
        r1 = 1947253067; // 0x7410b94b float:4.5864803E31 double:9.62070844E-315;
        r0 = r0 * r1;
        r11.bu = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r11.bv;	 Catch:{ RuntimeException -> 0x00a8 }
        r1 = -202984823; // 0xfffffffff3e6b289 float:-3.6555463E31 double:NaN;
        r0 = r0 * r1;
        r1 = 3;
        if (r0 <= r1) goto L_0x0303;
    L_0x02bb:
        r0 = java.lang.Runtime.getRuntime();	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0.availableProcessors();	 Catch:{ RuntimeException -> 0x00a8 }
        r1 = -15528951; // 0xffffffffff130c09 float:-1.95459E38 double:NaN;
        r0 = r0 * r1;
        r11.bk = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02c9:
        r0 = 0;
        r11.bn = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02cc:
        r0 = r11.bl;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02d4;
    L_0x02d0:
        r0 = "";
        r11.bl = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02d4:
        r0 = r11.bd;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02dc;
    L_0x02d8:
        r0 = "";
        r11.bd = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02dc:
        r0 = r11.bs;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02e4;
    L_0x02e0:
        r0 = "";
        r11.bs = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02e4:
        r0 = r11.bm;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02ec;
    L_0x02e8:
        r0 = "";
        r11.bm = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02ec:
        r0 = r11.bo;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02f4;
    L_0x02f0:
        r0 = "";
        r11.bo = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02f4:
        r0 = r11.cv;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02fc;
    L_0x02f8:
        r0 = "";
        r11.cv = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02fc:
        r0 = -338379690; // 0xffffffffebd4bc56 float:-5.1436333E26 double:NaN;
        r11.af(r0);	 Catch:{ RuntimeException -> 0x00a8 }
        return;
    L_0x0303:
        r0 = 0;
        r11.bk = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x02c9;
    L_0x0307:
        r6 = move-exception;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: av.<init>(boolean):void");
    }

    void aa() {
        if (this.bl.length() > 302505990) {
            this.bl = this.bl.substring(0, 1430256491);
        }
        if (this.bd.length() > -1838916823) {
            this.bd = this.bd.substring(0, 40);
        }
        if (this.bs.length() > 10) {
            this.bs = this.bs.substring(0, 10);
        }
        if (this.bm.length() > 10) {
            this.bm = this.bm.substring(0, 10);
        }
    }

    void af(int i) {
        try {
            if (this.bl.length() > 40) {
                this.bl = this.bl.substring(0, 40);
            }
            if (this.bd.length() > 40) {
                this.bd = this.bd.substring(0, 40);
            }
            if (this.bs.length() > 10) {
                this.bs = this.bs.substring(0, 10);
            }
            if (this.bm.length() > 10) {
                this.bm = this.bm.substring(0, 10);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "av.af(" + ')');
        }
    }

    public void ad(ik ikVar, int i) {
        int i2 = 1;
        int i3 = 0;
        try {
            int i4;
            ikVar.an(6, (byte) 31);
            ikVar.an(1859675873 * this.ay, (byte) 31);
            if (this.as) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            ikVar.an(i4, (byte) 31);
            ikVar.an(-1014659819 * this.bw, (byte) 31);
            ikVar.an(this.bf * 181710383, (byte) 31);
            ikVar.an(this.bv * -202984823, (byte) 31);
            ikVar.an(this.bp * -1983883471, (byte) 31);
            ikVar.an(this.bx * -1616573893, (byte) 31);
            if (!this.bt) {
                i2 = 0;
            }
            ikVar.an(i2, (byte) 31);
            ikVar.aa(this.bu * -1636169629, -1752508204);
            ikVar.an(677921337 * this.bk, (byte) 31);
            ikVar.ag(444796463 * this.bn, 1730676270);
            ikVar.aa(this.ba * 1842003979, -1752508204);
            ikVar.at(this.bl, 1170869161);
            ikVar.at(this.bd, 1703948865);
            ikVar.at(this.bs, 1588200195);
            ikVar.at(this.bm, 1645618837);
            ikVar.an(this.bj * 1057079029, (byte) 31);
            ikVar.aa(-1133338985 * this.br, -1752508204);
            ikVar.at(this.bo, 1040442095);
            ikVar.at(this.cv, 389835310);
            ikVar.an(this.bi * 492804017, (byte) 31);
            ikVar.an(341440467 * this.bq, (byte) 31);
            while (i3 < this.ci.length) {
                ikVar.ay(this.ci[i3], (short) 128);
                i3++;
            }
            ikVar.ay(-585739293 * this.cc, (short) 128);
        } catch (Throwable e) {
            throw ba.ad(e, "av.ad(" + ')');
        }
    }

    public void ag(ik ikVar) {
        int i;
        int i2 = 1;
        int i3 = 0;
        ikVar.an(6, (byte) 31);
        ikVar.an(1859675873 * this.ay, (byte) 31);
        if (this.as) {
            i = 1;
        } else {
            i = 0;
        }
        ikVar.an(i, (byte) 31);
        ikVar.an(-1014659819 * this.bw, (byte) 31);
        ikVar.an(this.bf * 181710383, (byte) 31);
        ikVar.an(this.bv * -202984823, (byte) 31);
        ikVar.an(this.bp * -1983883471, (byte) 31);
        ikVar.an(this.bx * -1616573893, (byte) 31);
        if (!this.bt) {
            i2 = 0;
        }
        ikVar.an(i2, (byte) 31);
        ikVar.aa(this.bu * -1636169629, -1752508204);
        ikVar.an(677921337 * this.bk, (byte) 31);
        ikVar.ag(444796463 * this.bn, 1636872925);
        ikVar.aa(this.ba * 1842003979, -1752508204);
        ikVar.at(this.bl, 1193483325);
        ikVar.at(this.bd, 618455598);
        ikVar.at(this.bs, 1597918129);
        ikVar.at(this.bm, 1900422776);
        ikVar.an(this.bj * 1057079029, (byte) 31);
        ikVar.aa(-1133338985 * this.br, -1752508204);
        ikVar.at(this.bo, 1859033568);
        ikVar.at(this.cv, 1984871834);
        ikVar.an(this.bi * 492804017, (byte) 31);
        ikVar.an(341440467 * this.bq, (byte) 31);
        while (i3 < this.ci.length) {
            ikVar.ay(this.ci[i3], (short) 128);
            i3++;
        }
        ikVar.ay(-585739293 * this.cc, (short) 128);
    }

    public void ay(ik ikVar) {
        int i = 1;
        int i2 = 0;
        ikVar.an(6, (byte) 31);
        ikVar.an(1859675873 * this.ay, (byte) 31);
        ikVar.an(this.as ? 1 : 0, (byte) 31);
        ikVar.an(1589927444 * this.bw, (byte) 31);
        ikVar.an(this.bf * 1261449870, (byte) 31);
        ikVar.an(this.bv * 946797101, (byte) 31);
        ikVar.an(this.bp * 457222618, (byte) 31);
        ikVar.an(this.bx * -115106397, (byte) 31);
        if (!this.bt) {
            i = 0;
        }
        ikVar.an(i, (byte) 31);
        ikVar.aa(this.bu * -1636169629, -1752508204);
        ikVar.an(677921337 * this.bk, (byte) 31);
        ikVar.ag(1621976952 * this.bn, 1974049504);
        ikVar.aa(this.ba * 924124900, -1752508204);
        ikVar.at(this.bl, 1486023497);
        ikVar.at(this.bd, 544686387);
        ikVar.at(this.bs, 931798580);
        ikVar.at(this.bm, 965151154);
        ikVar.an(this.bj * -650076130, (byte) 31);
        ikVar.aa(-1133338985 * this.br, -1752508204);
        ikVar.at(this.bo, 1856508805);
        ikVar.at(this.cv, 2047182078);
        ikVar.an(this.bi * 492804017, (byte) 31);
        ikVar.an(574120017 * this.bq, (byte) 31);
        while (i2 < this.ci.length) {
            ikVar.ay(this.ci[i2], (short) 128);
            i2++;
        }
        ikVar.ay(-585739293 * this.cc, (short) 128);
    }

    public int aj() {
        return (((((38 + (this.bl.length() + 2)) + (this.bd.length() + 2)) + (this.bs.length() + 2)) + gb.am(this.bm, -1438344568)) + (this.bo.length() + 2)) + gb.am(this.cv, -2093045305);
    }

    public int an(int i) {
        try {
            return (((((38 + (this.bl.length() + 2)) + (this.bd.length() + 2)) + (this.bs.length() + 2)) + gb.am(this.bm, -1885108453)) + (this.bo.length() + 2)) + gb.am(this.cv, -2079611796);
        } catch (Throwable e) {
            throw ba.ad(e, "av.an(" + ')');
        }
    }

    public int ar() {
        return (((((38 + (this.bl.length() + 2)) + (this.bd.length() + 2)) + (this.bs.length() + 2)) + gb.am(this.bm, -2013217517)) + (this.bo.length() + 2)) + gb.am(this.cv, -1928745308);
    }

    public int as() {
        return (((((-16097978 + (this.bl.length() + 2)) + (this.bd.length() + 2)) + (this.bs.length() + 2)) + gb.am(this.bm, -2138696720)) + (this.bo.length() + 2)) + gb.am(this.cv, -1521925783);
    }

    static void bb(byte b) {
        try {
            if (dl.po == null) {
                dl.po = new ArrayList(100);
            }
            dl.po.clear();
            dl.po.add(ai.ad);
            hp.aj(dl.po, (byte) -56);
            dl.po.add(ar.ad);
            mv.aw(dl.po, 655375754);
            gj.am(dl.po, (byte) -41);
            cb.ax(dl.po, (byte) 0);
            il.aq(dl.po, 1385750290);
            Collection collection = dl.po;
            collection.add(az.an);
            collection.add(az.aa);
            ge.aa(dl.po, 1447520349);
            hg.ag(dl.po, -1866693060);
            collection = dl.po;
            collection.add(aa.aa);
            collection.add(aa.ag);
            collection.add(aa.ay);
            collection = dl.po;
            collection.add(aw.an);
            collection.add(aw.aa);
            nd.ar(dl.po, (byte) -37);
            ik.as(dl.po, (byte) -26);
            dl.po.add(ay.aa);
            ge.ae(dl.po, 2025698476);
            ap.ai(dl.po, 1898781285);
            dl.po.add(gk.af);
        } catch (Throwable e) {
            throw ba.ad(e, "av.bb(" + ')');
        }
    }

    static final void bi(gx gxVar, int i) {
        try {
            int i2 = (gxVar.dj * 81181341) - (1581849891 * client.ak);
            int i3 = (gxVar.cw * 549017216) + (gxVar.bv * -144385472);
            int i4 = (717643904 * gxVar.cu) + (gxVar.bv * -144385472);
            gxVar.bg = (((i3 - (gxVar.bg * 516759209)) / i2) * 1506829721) + gxVar.bg;
            gxVar.bh = (((i4 - (gxVar.bh * 2328865)) / i2) * -1638712607) + gxVar.bh;
            gxVar.de = 0;
            gxVar.dz = gxVar.dk * 1060454559;
        } catch (Throwable e) {
            throw ba.ad(e, "av.bi(" + ')');
        }
    }

    static final void fs(int i) {
        try {
            lj.ag(-742415278);
            if (df.my != null) {
                df.my.di(-401624331);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "av.fs(" + ')');
        }
    }
}
