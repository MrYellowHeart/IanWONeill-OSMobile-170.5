package p000;

import java.lang.reflect.Array;
import java.util.Calendar;

public class hr {
    static final float aa = 30.0f;
    static final int ad = 5000000;
    static int ae = 0;
    static final int af = 500000;
    static int[] ag = new int[5];
    static int ah = 0;
    static final String[] ai = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static String[] aj = new String[1000];
    static hf[] am = new hf[50];
    static final int an = 3;
    static int aq = 0;
    static int ar = 0;
    static int[] as = new int[1000];
    static ac at = null;
    static Calendar aw = Calendar.getInstance();
    static final int ax = 21;
    static int[][] ay = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 5000}));

    public static void af(kf kfVar, int i) {
        try {
            nf.af = kfVar;
        } catch (Throwable e) {
            throw ba.ad(e, "hr.af(" + ')');
        }
    }

    hr() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "hr.<init>(" + ')');
        }
    }

    static void ac(hv hvVar, int i) {
        int i2;
        int i3;
        gk gkVar;
        Throwable e;
        Object[] objArr = hvVar.af;
        if (gy.af(182090275 * hvVar.am, (byte) -15)) {
            ec.az = (es) objArr[0];
            ay ayVar = ay.ad[ec.az.af * -1099459587];
            i2 = hvVar.am * 182090275;
            i3 = -2068206069 * ayVar.av;
            gk ad = ej.ad(C0002if.af(1733135393 * ayVar.ag, i2, 735380873), i2, -1898588231);
            if (ad == null) {
                ad = ej.ad(((40000 + i3) << 8) + i2, i2, -1912404497);
                if (ad == null) {
                    ad = null;
                }
            }
            gkVar = ad;
        } else {
            gkVar = az.af(((Integer) objArr[0]).intValue(), -2115468043);
        }
        if (gkVar != null) {
            ar = 0;
            ae = 0;
            int[] iArr = gkVar.ad;
            int[] iArr2 = gkVar.an;
            aq = 0;
            int i4;
            gk gkVar2;
            try {
                int intValue;
                int i5;
                String str;
                cb.an = new int[(407879525 * gkVar.ag)];
                i4 = 0;
                mx.aa = new String[(gkVar.ay * -1469700137)];
                i2 = 0;
                int i6 = 1;
                while (i6 < objArr.length) {
                    if (objArr[i6] instanceof Integer) {
                        intValue = ((Integer) objArr[i6]).intValue();
                        if (-2147483647 == intValue) {
                            intValue = -13807801 * hvVar.aa;
                        }
                        if (-2147483646 == intValue) {
                            intValue = 1604438419 * hvVar.ag;
                        }
                        if (intValue == -2147483645) {
                            intValue = hvVar.an != null ? hvVar.an.ah * 1172750087 : -1;
                        }
                        if (intValue == -2147483644) {
                            intValue = hvVar.ay * -947161835;
                        }
                        if (intValue == -2147483643) {
                            intValue = hvVar.an != null ? hvVar.an.ak * 2102445939 : -1;
                        }
                        if (intValue == -2147483642) {
                            intValue = hvVar.as != null ? hvVar.as.ah * 1172750087 : -1;
                        }
                        if (-2147483641 == intValue) {
                            intValue = hvVar.as != null ? hvVar.as.ak * 2102445939 : -1;
                        }
                        if (-2147483640 == intValue) {
                            intValue = 1094872107 * hvVar.ar;
                        }
                        if (intValue == -2147483639) {
                            i5 = hvVar.aj * 361884663;
                        } else {
                            i5 = intValue;
                        }
                        intValue = i4 + 1;
                        cb.an[i4] = i5;
                        int i7 = i2;
                        i2 = intValue;
                        intValue = i7;
                    } else if (objArr[i6] instanceof String) {
                        String str2;
                        str = (String) objArr[i6];
                        if (str.equals("event_opbase")) {
                            str2 = hvVar.ae;
                        } else {
                            str2 = str;
                        }
                        intValue = i2 + 1;
                        mx.aa[i2] = str2;
                        i2 = i4;
                    } else {
                        intValue = i2;
                        i2 = i4;
                    }
                    i6++;
                    i4 = i2;
                    i2 = intValue;
                }
                intValue = 0;
                ah = hvVar.aq * 698456767;
                i2 = -1;
                gkVar2 = gkVar;
                i3 = -1;
                int[] iArr3 = iArr;
                iArr = iArr2;
                while (true) {
                    int i8 = intValue + 1;
                    if (i8 <= i) {
                        i5 = i3 + 1;
                        i2 = iArr3[i5];
                        if (i2 >= 100) {
                            boolean z;
                            if (gkVar2.an[i5] == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            switch (ce.an(i2, gkVar2, z, (byte) -80)) {
                                case 0:
                                    return;
                                case 1:
                                    intValue = i8;
                                    i3 = i5;
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                                default:
                                    intValue = i8;
                                    i3 = i5;
                                    break;
                            }
                        } else if (i2 == 0) {
                            r0 = as;
                            i3 = ar - 1194553915;
                            ar = i3;
                            r0[(i3 * 537618701) - 1] = iArr[i5];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 1) {
                            intValue = iArr[i5];
                            r3 = as;
                            r4 = ar - 1194553915;
                            ar = r4;
                            r3[(r4 * 537618701) - 1] = al.an[intValue];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 2) {
                            intValue = iArr[i5];
                            r3 = al.an;
                            r4 = as;
                            i6 = ar - -1194553915;
                            ar = i6;
                            r3[intValue] = r4[i6 * 537618701];
                            em.fp(intValue, -340419356);
                            intValue = i8;
                            i3 = i5;
                        } else if (3 == i2) {
                            r0 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r0[(i3 * -1267697097) - 1] = gkVar2.aa[i5];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 6) {
                            i3 = iArr[i5] + i5;
                            intValue = i8;
                        } else {
                            if (i2 == 7) {
                                ar -= 1905859466;
                                if (as[(537618701 * ar) + 1] != as[537618701 * ar]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (8 == i2) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] == as[(ar * 537618701) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 9) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] < as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 10) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] > as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (21 == i2) {
                                if (344694797 * aq != 0) {
                                    hf[] hfVarArr = am;
                                    i3 = aq - -1432768827;
                                    aq = i3;
                                    hf hfVar = hfVarArr[i3 * 344694797];
                                    gkVar2 = hfVar.af;
                                    r3 = gkVar2.ad;
                                    r0 = gkVar2.an;
                                    r4 = hfVar.ad * -132320779;
                                    cb.an = hfVar.an;
                                    mx.aa = hfVar.aa;
                                    iArr = r0;
                                    iArr3 = r3;
                                    intValue = i8;
                                    i3 = r4;
                                } else {
                                    return;
                                }
                            } else if (i2 == 25) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - 1194553915;
                                ar = r4;
                                r3[(r4 * 537618701) - 1] = io.af(intValue, 998830794);
                                intValue = i8;
                                i3 = i5;
                            } else if (27 == i2) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                ee.ad(intValue, r3[r4 * 537618701], (short) -3416);
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 31) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] <= as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (32 == i2) {
                                ar -= 1905859466;
                                if (as[ar * 537618701] >= as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 33) {
                                r0 = as;
                                i3 = ar - 1194553915;
                                ar = i3;
                                r0[(i3 * 537618701) - 1] = cb.an[iArr[i5]];
                                intValue = i8;
                                i3 = i5;
                            } else if (34 == i2) {
                                r0 = cb.an;
                                i3 = iArr[i5];
                                r4 = as;
                                i6 = ar - -1194553915;
                                ar = i6;
                                r0[i3] = r4[i6 * 537618701];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 35) {
                                r0 = aj;
                                i3 = ae - 1246602361;
                                ae = i3;
                                r0[(i3 * -1267697097) - 1] = mx.aa[iArr[i5]];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 36) {
                                r0 = mx.aa;
                                i3 = iArr[i5];
                                r4 = aj;
                                i6 = ae - -1246602361;
                                ae = i6;
                                r0[i3] = r4[i6 * -1267697097];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 37) {
                                intValue = iArr[i5];
                                ae -= -1246602361 * intValue;
                                String[] strArr = aj;
                                i3 = -1267697097 * ae;
                                if (intValue == 0) {
                                    str = "";
                                } else if (intValue == 1) {
                                    CharSequence charSequence = strArr[i3];
                                    if (charSequence == null) {
                                        str = "null";
                                    } else {
                                        str = charSequence.toString();
                                    }
                                } else {
                                    int i9 = intValue + i3;
                                    intValue = 0;
                                    for (r4 = i3; r4 < i9; r4++) {
                                        CharSequence charSequence2 = strArr[r4];
                                        if (charSequence2 == null) {
                                            intValue += 4;
                                        } else {
                                            intValue += charSequence2.length();
                                        }
                                    }
                                    StringBuilder stringBuilder = new StringBuilder(intValue);
                                    for (intValue = i3; intValue < i9; intValue++) {
                                        CharSequence charSequence3 = strArr[intValue];
                                        if (charSequence3 == null) {
                                            stringBuilder.append("null");
                                        } else {
                                            stringBuilder.append(charSequence3);
                                        }
                                    }
                                    str = stringBuilder.toString();
                                }
                                r3 = aj;
                                r4 = ae - 1246602361;
                                ae = r4;
                                r3[(r4 * -1267697097) - 1] = str;
                                intValue = i8;
                                i3 = i5;
                            } else if (38 == i2) {
                                ar -= -1194553915;
                                intValue = i8;
                                i3 = i5;
                            } else if (39 == i2) {
                                ae -= -1246602361;
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 40) {
                                gk af = az.af(iArr[i5], -279754684);
                                iArr = new int[(407879525 * af.ag)];
                                String[] strArr2 = new String[(af.ay * -1469700137)];
                                for (intValue = 0; intValue < af.as * 950863471; intValue++) {
                                    iArr[intValue] = as[((ar * 537618701) - (af.as * 950863471)) + intValue];
                                }
                                for (intValue = 0; intValue < 483841497 * af.ar; intValue++) {
                                    strArr2[intValue] = aj[((ae * -1267697097) - (483841497 * af.ar)) + intValue];
                                }
                                ar -= -769321365 * af.as;
                                ae -= -1322194833 * af.ar;
                                hf hfVar2 = new hf();
                                hfVar2.af = gkVar2;
                                hfVar2.ad = -475434403 * i5;
                                hfVar2.an = cb.an;
                                hfVar2.aa = mx.aa;
                                hf[] hfVarArr2 = am;
                                i5 = aq - 1432768827;
                                aq = i5;
                                hfVarArr2[(i5 * 344694797) - 1] = hfVar2;
                                try {
                                    int[] iArr4 = af.ad;
                                    r0 = af.an;
                                    cb.an = iArr;
                                    mx.aa = strArr2;
                                    iArr = r0;
                                    iArr3 = iArr4;
                                    intValue = i8;
                                    gkVar2 = af;
                                    i3 = -1;
                                } catch (Exception e2) {
                                    e = e2;
                                    gkVar2 = af;
                                }
                            } else if (42 == i2) {
                                try {
                                    r0 = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    r0[(i3 * 537618701) - 1] = bc.kq.ad(iArr[i5], 2013460253);
                                    intValue = i8;
                                    i3 = i5;
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } else if (i2 == 43) {
                                r0 = bc.kq;
                                i3 = iArr[i5];
                                r4 = as;
                                i6 = ar - -1194553915;
                                ar = i6;
                                r0.af(i3, r4[i6 * 537618701], 224110188);
                                intValue = i8;
                                i3 = i5;
                            } else if (44 == i2) {
                                r4 = iArr[i5] >> 16;
                                i3 = 65535 & iArr[i5];
                                r0 = as;
                                i6 = ar - -1194553915;
                                ar = i6;
                                i6 = r0[i6 * 537618701];
                                if (i6 < 0 || i6 > 5000) {
                                    throw new RuntimeException();
                                }
                                ag[r4] = i6;
                                intValue = -1;
                                if (i3 == ie.ca) {
                                    intValue = 0;
                                }
                                for (i3 = 0; i3 < i6; i3++) {
                                    ay[r4][i3] = intValue;
                                }
                                intValue = i8;
                                i3 = i5;
                            } else if (45 == i2) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                i3 = r3[r4 * 537618701];
                                if (i3 < 0 || i3 >= ag[intValue]) {
                                    throw new RuntimeException();
                                }
                                r4 = as;
                                i6 = ar - 1194553915;
                                ar = i6;
                                r4[(i6 * 537618701) - 1] = ay[intValue][i3];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 46) {
                                intValue = iArr[i5];
                                ar -= 1905859466;
                                i3 = as[537618701 * ar];
                                if (i3 < 0 || i3 >= ag[intValue]) {
                                    throw new RuntimeException();
                                }
                                ay[intValue][i3] = as[(ar * 537618701) + 1];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 47) {
                                str = bc.kq.aa(iArr[i5], 1771818963);
                                if (str == null) {
                                    str = jv.aj;
                                }
                                r3 = aj;
                                r4 = ae - 1246602361;
                                ae = r4;
                                r3[(r4 * -1267697097) - 1] = str;
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 48) {
                                r0 = bc.kq;
                                i3 = iArr[i5];
                                r4 = aj;
                                i6 = ae - -1246602361;
                                ae = i6;
                                r0.an(i3, r4[i6 * -1267697097], 427793602);
                                intValue = i8;
                                i3 = i5;
                            } else if (60 == i2) {
                                kp kpVar = gkVar2.aj[iArr[i5]];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                kr krVar = (kr) kpVar.af((long) r3[r4 * 537618701]);
                                if (krVar != null) {
                                    i3 = krVar.af + i5;
                                    intValue = i8;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                            intValue = i8;
                            i3 = i5;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            } catch (Exception e4) {
                e = e4;
                i2 = -1;
                gkVar2 = gkVar;
                StringBuilder stringBuilder2 = new StringBuilder(30);
                stringBuilder2.append("").append(gkVar2.fy).append(" ");
                for (i4 = (344694797 * aq) - 1; i4 >= 0; i4--) {
                    stringBuilder2.append("").append(am[i4].af.fy).append(" ");
                }
                stringBuilder2.append("").append(i2);
                ah.af(stringBuilder2.toString(), e, (short) 8593);
            }
        }
    }

    static void al(hv hvVar, int i) {
        int i2;
        int i3;
        gk gkVar;
        Throwable e;
        Object[] objArr = hvVar.af;
        if (gy.af(182090275 * hvVar.am, (byte) -19)) {
            ec.az = (es) objArr[0];
            ay ayVar = ay.ad[ec.az.af * -1099459587];
            i2 = hvVar.am * 182090275;
            i3 = -2068206069 * ayVar.av;
            gk ad = ej.ad(C0002if.af(1733135393 * ayVar.ag, i2, 735380873), i2, -1988614422);
            if (ad == null) {
                ad = ej.ad(((40000 + i3) << 8) + i2, i2, -1895038036);
                if (ad == null) {
                    ad = null;
                }
            }
            gkVar = ad;
        } else {
            gkVar = az.af(((Integer) objArr[0]).intValue(), -1175444501);
        }
        if (gkVar != null) {
            ar = 0;
            ae = 0;
            int[] iArr = gkVar.ad;
            int[] iArr2 = gkVar.an;
            aq = 0;
            int i4;
            gk gkVar2;
            try {
                int intValue;
                int i5;
                String str;
                cb.an = new int[(407879525 * gkVar.ag)];
                i4 = 0;
                mx.aa = new String[(gkVar.ay * -1469700137)];
                i2 = 0;
                int i6 = 1;
                while (i6 < objArr.length) {
                    if (objArr[i6] instanceof Integer) {
                        intValue = ((Integer) objArr[i6]).intValue();
                        if (-2147483647 == intValue) {
                            intValue = -13807801 * hvVar.aa;
                        }
                        if (-2147483646 == intValue) {
                            intValue = 1604438419 * hvVar.ag;
                        }
                        if (intValue == -2147483645) {
                            intValue = hvVar.an != null ? hvVar.an.ah * 1172750087 : -1;
                        }
                        if (intValue == -2147483644) {
                            intValue = hvVar.ay * -947161835;
                        }
                        if (intValue == -2147483643) {
                            intValue = hvVar.an != null ? hvVar.an.ak * 2102445939 : -1;
                        }
                        if (intValue == -2147483642) {
                            intValue = hvVar.as != null ? hvVar.as.ah * 1172750087 : -1;
                        }
                        if (-2147483641 == intValue) {
                            intValue = hvVar.as != null ? hvVar.as.ak * 2102445939 : -1;
                        }
                        if (-2147483640 == intValue) {
                            intValue = 1094872107 * hvVar.ar;
                        }
                        if (intValue == -2147483639) {
                            i5 = hvVar.aj * 361884663;
                        } else {
                            i5 = intValue;
                        }
                        intValue = i4 + 1;
                        cb.an[i4] = i5;
                        int i7 = i2;
                        i2 = intValue;
                        intValue = i7;
                    } else if (objArr[i6] instanceof String) {
                        String str2;
                        str = (String) objArr[i6];
                        if (str.equals("event_opbase")) {
                            str2 = hvVar.ae;
                        } else {
                            str2 = str;
                        }
                        intValue = i2 + 1;
                        mx.aa[i2] = str2;
                        i2 = i4;
                    } else {
                        intValue = i2;
                        i2 = i4;
                    }
                    i6++;
                    i4 = i2;
                    i2 = intValue;
                }
                intValue = 0;
                ah = hvVar.aq * 698456767;
                i2 = -1;
                gkVar2 = gkVar;
                i3 = -1;
                int[] iArr3 = iArr;
                iArr = iArr2;
                while (true) {
                    int i8 = intValue + 1;
                    if (i8 <= i) {
                        i5 = i3 + 1;
                        i2 = iArr3[i5];
                        if (i2 >= 100) {
                            boolean z;
                            if (gkVar2.an[i5] == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            switch (ce.an(i2, gkVar2, z, (byte) -85)) {
                                case 0:
                                    return;
                                case 1:
                                    intValue = i8;
                                    i3 = i5;
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                                default:
                                    intValue = i8;
                                    i3 = i5;
                                    break;
                            }
                        } else if (i2 == 0) {
                            r0 = as;
                            i3 = ar - 1194553915;
                            ar = i3;
                            r0[(i3 * 537618701) - 1] = iArr[i5];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 1) {
                            intValue = iArr[i5];
                            r3 = as;
                            r4 = ar - 1194553915;
                            ar = r4;
                            r3[(r4 * 537618701) - 1] = al.an[intValue];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 2) {
                            intValue = iArr[i5];
                            r3 = al.an;
                            r4 = as;
                            i6 = ar - -1194553915;
                            ar = i6;
                            r3[intValue] = r4[i6 * 537618701];
                            em.fp(intValue, 535734134);
                            intValue = i8;
                            i3 = i5;
                        } else if (3 == i2) {
                            r0 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r0[(i3 * -1267697097) - 1] = gkVar2.aa[i5];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 6) {
                            i3 = iArr[i5] + i5;
                            intValue = i8;
                        } else {
                            if (i2 == 7) {
                                ar -= 1905859466;
                                if (as[(537618701 * ar) + 1] != as[537618701 * ar]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (8 == i2) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] == as[(ar * 537618701) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 9) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] < as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 10) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] > as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (21 == i2) {
                                if (344694797 * aq != 0) {
                                    hf[] hfVarArr = am;
                                    i3 = aq - -1432768827;
                                    aq = i3;
                                    hf hfVar = hfVarArr[i3 * 344694797];
                                    gkVar2 = hfVar.af;
                                    r3 = gkVar2.ad;
                                    r0 = gkVar2.an;
                                    r4 = hfVar.ad * -132320779;
                                    cb.an = hfVar.an;
                                    mx.aa = hfVar.aa;
                                    iArr = r0;
                                    iArr3 = r3;
                                    intValue = i8;
                                    i3 = r4;
                                } else {
                                    return;
                                }
                            } else if (i2 == 25) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - 1194553915;
                                ar = r4;
                                r3[(r4 * 537618701) - 1] = io.af(intValue, 998830794);
                                intValue = i8;
                                i3 = i5;
                            } else if (27 == i2) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                ee.ad(intValue, r3[r4 * 537618701], (short) -4346);
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 31) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] <= as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (32 == i2) {
                                ar -= 1905859466;
                                if (as[ar * 537618701] >= as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 33) {
                                r0 = as;
                                i3 = ar - 1194553915;
                                ar = i3;
                                r0[(i3 * 537618701) - 1] = cb.an[iArr[i5]];
                                intValue = i8;
                                i3 = i5;
                            } else if (34 == i2) {
                                r0 = cb.an;
                                i3 = iArr[i5];
                                r4 = as;
                                i6 = ar - -1194553915;
                                ar = i6;
                                r0[i3] = r4[i6 * 537618701];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 35) {
                                r0 = aj;
                                i3 = ae - 1246602361;
                                ae = i3;
                                r0[(i3 * -1267697097) - 1] = mx.aa[iArr[i5]];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 36) {
                                r0 = mx.aa;
                                i3 = iArr[i5];
                                r4 = aj;
                                i6 = ae - -1246602361;
                                ae = i6;
                                r0[i3] = r4[i6 * -1267697097];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 37) {
                                intValue = iArr[i5];
                                ae -= -1246602361 * intValue;
                                String[] strArr = aj;
                                i3 = -1267697097 * ae;
                                if (intValue == 0) {
                                    str = "";
                                } else if (intValue == 1) {
                                    CharSequence charSequence = strArr[i3];
                                    if (charSequence == null) {
                                        str = "null";
                                    } else {
                                        str = charSequence.toString();
                                    }
                                } else {
                                    int i9 = intValue + i3;
                                    intValue = 0;
                                    for (r4 = i3; r4 < i9; r4++) {
                                        CharSequence charSequence2 = strArr[r4];
                                        if (charSequence2 == null) {
                                            intValue += 4;
                                        } else {
                                            intValue += charSequence2.length();
                                        }
                                    }
                                    StringBuilder stringBuilder = new StringBuilder(intValue);
                                    for (intValue = i3; intValue < i9; intValue++) {
                                        CharSequence charSequence3 = strArr[intValue];
                                        if (charSequence3 == null) {
                                            stringBuilder.append("null");
                                        } else {
                                            stringBuilder.append(charSequence3);
                                        }
                                    }
                                    str = stringBuilder.toString();
                                }
                                r3 = aj;
                                r4 = ae - 1246602361;
                                ae = r4;
                                r3[(r4 * -1267697097) - 1] = str;
                                intValue = i8;
                                i3 = i5;
                            } else if (38 == i2) {
                                ar -= -1194553915;
                                intValue = i8;
                                i3 = i5;
                            } else if (39 == i2) {
                                ae -= -1246602361;
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 40) {
                                gk af = az.af(iArr[i5], -230969754);
                                iArr = new int[(407879525 * af.ag)];
                                String[] strArr2 = new String[(af.ay * -1469700137)];
                                for (intValue = 0; intValue < af.as * 950863471; intValue++) {
                                    iArr[intValue] = as[((ar * 537618701) - (af.as * 950863471)) + intValue];
                                }
                                for (intValue = 0; intValue < 483841497 * af.ar; intValue++) {
                                    strArr2[intValue] = aj[((ae * -1267697097) - (483841497 * af.ar)) + intValue];
                                }
                                ar -= -769321365 * af.as;
                                ae -= -1322194833 * af.ar;
                                hf hfVar2 = new hf();
                                hfVar2.af = gkVar2;
                                hfVar2.ad = -475434403 * i5;
                                hfVar2.an = cb.an;
                                hfVar2.aa = mx.aa;
                                hf[] hfVarArr2 = am;
                                i5 = aq - 1432768827;
                                aq = i5;
                                hfVarArr2[(i5 * 344694797) - 1] = hfVar2;
                                try {
                                    int[] iArr4 = af.ad;
                                    r0 = af.an;
                                    cb.an = iArr;
                                    mx.aa = strArr2;
                                    iArr = r0;
                                    iArr3 = iArr4;
                                    intValue = i8;
                                    gkVar2 = af;
                                    i3 = -1;
                                } catch (Exception e2) {
                                    e = e2;
                                    gkVar2 = af;
                                }
                            } else if (42 == i2) {
                                try {
                                    r0 = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    r0[(i3 * 537618701) - 1] = bc.kq.ad(iArr[i5], 1753372502);
                                    intValue = i8;
                                    i3 = i5;
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } else if (i2 == 43) {
                                r0 = bc.kq;
                                i3 = iArr[i5];
                                r4 = as;
                                i6 = ar - -1194553915;
                                ar = i6;
                                r0.af(i3, r4[i6 * 537618701], 1787865153);
                                intValue = i8;
                                i3 = i5;
                            } else if (44 == i2) {
                                r4 = iArr[i5] >> 16;
                                i3 = 65535 & iArr[i5];
                                r0 = as;
                                i6 = ar - -1194553915;
                                ar = i6;
                                i6 = r0[i6 * 537618701];
                                if (i6 < 0 || i6 > 5000) {
                                    throw new RuntimeException();
                                }
                                ag[r4] = i6;
                                intValue = -1;
                                if (i3 == ie.ca) {
                                    intValue = 0;
                                }
                                for (i3 = 0; i3 < i6; i3++) {
                                    ay[r4][i3] = intValue;
                                }
                                intValue = i8;
                                i3 = i5;
                            } else if (45 == i2) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                i3 = r3[r4 * 537618701];
                                if (i3 < 0 || i3 >= ag[intValue]) {
                                    throw new RuntimeException();
                                }
                                r4 = as;
                                i6 = ar - 1194553915;
                                ar = i6;
                                r4[(i6 * 537618701) - 1] = ay[intValue][i3];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 46) {
                                intValue = iArr[i5];
                                ar -= 1905859466;
                                i3 = as[537618701 * ar];
                                if (i3 < 0 || i3 >= ag[intValue]) {
                                    throw new RuntimeException();
                                }
                                ay[intValue][i3] = as[(ar * 537618701) + 1];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 47) {
                                str = bc.kq.aa(iArr[i5], -592909);
                                if (str == null) {
                                    str = jv.aj;
                                }
                                r3 = aj;
                                r4 = ae - 1246602361;
                                ae = r4;
                                r3[(r4 * -1267697097) - 1] = str;
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 48) {
                                r0 = bc.kq;
                                i3 = iArr[i5];
                                r4 = aj;
                                i6 = ae - -1246602361;
                                ae = i6;
                                r0.an(i3, r4[i6 * -1267697097], 441446629);
                                intValue = i8;
                                i3 = i5;
                            } else if (60 == i2) {
                                kp kpVar = gkVar2.aj[iArr[i5]];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                kr krVar = (kr) kpVar.af((long) r3[r4 * 537618701]);
                                if (krVar != null) {
                                    i3 = krVar.af + i5;
                                    intValue = i8;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                            intValue = i8;
                            i3 = i5;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            } catch (Exception e4) {
                e = e4;
                i2 = -1;
                gkVar2 = gkVar;
                StringBuilder stringBuilder2 = new StringBuilder(30);
                stringBuilder2.append("").append(gkVar2.fy).append(" ");
                for (i4 = (344694797 * aq) - 1; i4 >= 0; i4--) {
                    stringBuilder2.append("").append(am[i4].af.fy).append(" ");
                }
                stringBuilder2.append("").append(i2);
                ah.af(stringBuilder2.toString(), e, (short) -14169);
            }
        }
    }

    static void ap(hv hvVar, int i) {
        int i2;
        int i3;
        gk gkVar;
        Throwable e;
        Object[] objArr = hvVar.af;
        if (gy.af(182090275 * hvVar.am, (byte) -107)) {
            ec.az = (es) objArr[0];
            ay ayVar = ay.ad[ec.az.af * -1099459587];
            i2 = hvVar.am * 182090275;
            i3 = -2068206069 * ayVar.av;
            gk ad = ej.ad(C0002if.af(1733135393 * ayVar.ag, i2, 735380873), i2, -1830896753);
            if (ad == null) {
                ad = ej.ad(((40000 + i3) << 8) + i2, i2, -1879399765);
                if (ad == null) {
                    ad = null;
                }
            }
            gkVar = ad;
        } else {
            gkVar = az.af(((Integer) objArr[0]).intValue(), -1430527005);
        }
        if (gkVar != null) {
            ar = 0;
            ae = 0;
            int[] iArr = gkVar.ad;
            int[] iArr2 = gkVar.an;
            aq = 0;
            int i4;
            gk gkVar2;
            try {
                int intValue;
                int i5;
                String str;
                cb.an = new int[(407879525 * gkVar.ag)];
                i4 = 0;
                mx.aa = new String[(gkVar.ay * -1469700137)];
                i2 = 0;
                int i6 = 1;
                while (i6 < objArr.length) {
                    if (objArr[i6] instanceof Integer) {
                        intValue = ((Integer) objArr[i6]).intValue();
                        if (-2147483647 == intValue) {
                            intValue = -13807801 * hvVar.aa;
                        }
                        if (-2147483646 == intValue) {
                            intValue = 1604438419 * hvVar.ag;
                        }
                        if (intValue == -2147483645) {
                            intValue = hvVar.an != null ? hvVar.an.ah * 1172750087 : -1;
                        }
                        if (intValue == -2147483644) {
                            intValue = hvVar.ay * -947161835;
                        }
                        if (intValue == -2147483643) {
                            intValue = hvVar.an != null ? hvVar.an.ak * 2102445939 : -1;
                        }
                        if (intValue == -2147483642) {
                            intValue = hvVar.as != null ? hvVar.as.ah * 1172750087 : -1;
                        }
                        if (-2147483641 == intValue) {
                            intValue = hvVar.as != null ? hvVar.as.ak * 2102445939 : -1;
                        }
                        if (-2147483640 == intValue) {
                            intValue = 1094872107 * hvVar.ar;
                        }
                        if (intValue == -2147483639) {
                            i5 = hvVar.aj * 361884663;
                        } else {
                            i5 = intValue;
                        }
                        intValue = i4 + 1;
                        cb.an[i4] = i5;
                        int i7 = i2;
                        i2 = intValue;
                        intValue = i7;
                    } else if (objArr[i6] instanceof String) {
                        String str2;
                        str = (String) objArr[i6];
                        if (str.equals("event_opbase")) {
                            str2 = hvVar.ae;
                        } else {
                            str2 = str;
                        }
                        intValue = i2 + 1;
                        mx.aa[i2] = str2;
                        i2 = i4;
                    } else {
                        intValue = i2;
                        i2 = i4;
                    }
                    i6++;
                    i4 = i2;
                    i2 = intValue;
                }
                intValue = 0;
                ah = hvVar.aq * 698456767;
                i2 = -1;
                gkVar2 = gkVar;
                i3 = -1;
                int[] iArr3 = iArr;
                iArr = iArr2;
                while (true) {
                    int i8 = intValue + 1;
                    if (i8 <= i) {
                        i5 = i3 + 1;
                        i2 = iArr3[i5];
                        if (i2 >= 100) {
                            boolean z;
                            if (gkVar2.an[i5] == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            switch (ce.an(i2, gkVar2, z, (byte) -27)) {
                                case 0:
                                    return;
                                case 1:
                                    intValue = i8;
                                    i3 = i5;
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                                default:
                                    intValue = i8;
                                    i3 = i5;
                                    break;
                            }
                        } else if (i2 == 0) {
                            r0 = as;
                            i3 = ar - 1194553915;
                            ar = i3;
                            r0[(i3 * 537618701) - 1] = iArr[i5];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 1) {
                            intValue = iArr[i5];
                            r3 = as;
                            r4 = ar - 1194553915;
                            ar = r4;
                            r3[(r4 * 537618701) - 1] = al.an[intValue];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 2) {
                            intValue = iArr[i5];
                            r3 = al.an;
                            r4 = as;
                            i6 = ar - -1194553915;
                            ar = i6;
                            r3[intValue] = r4[i6 * 537618701];
                            em.fp(intValue, -840634432);
                            intValue = i8;
                            i3 = i5;
                        } else if (3 == i2) {
                            r0 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r0[(i3 * -1267697097) - 1] = gkVar2.aa[i5];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 6) {
                            i3 = iArr[i5] + i5;
                            intValue = i8;
                        } else {
                            if (i2 == 7) {
                                ar -= 1905859466;
                                if (as[(537618701 * ar) + 1] != as[537618701 * ar]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (8 == i2) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] == as[(ar * 537618701) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 9) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] < as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 10) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] > as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (21 == i2) {
                                if (344694797 * aq != 0) {
                                    hf[] hfVarArr = am;
                                    i3 = aq - -1432768827;
                                    aq = i3;
                                    hf hfVar = hfVarArr[i3 * 344694797];
                                    gkVar2 = hfVar.af;
                                    r3 = gkVar2.ad;
                                    r0 = gkVar2.an;
                                    r4 = hfVar.ad * -132320779;
                                    cb.an = hfVar.an;
                                    mx.aa = hfVar.aa;
                                    iArr = r0;
                                    iArr3 = r3;
                                    intValue = i8;
                                    i3 = r4;
                                } else {
                                    return;
                                }
                            } else if (i2 == 25) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - 1194553915;
                                ar = r4;
                                r3[(r4 * 537618701) - 1] = io.af(intValue, 998830794);
                                intValue = i8;
                                i3 = i5;
                            } else if (27 == i2) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                ee.ad(intValue, r3[r4 * 537618701], (short) 13871);
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 31) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] <= as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (32 == i2) {
                                ar -= 1905859466;
                                if (as[ar * 537618701] >= as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 33) {
                                r0 = as;
                                i3 = ar - 1194553915;
                                ar = i3;
                                r0[(i3 * 537618701) - 1] = cb.an[iArr[i5]];
                                intValue = i8;
                                i3 = i5;
                            } else if (34 == i2) {
                                r0 = cb.an;
                                i3 = iArr[i5];
                                r4 = as;
                                i6 = ar - -1194553915;
                                ar = i6;
                                r0[i3] = r4[i6 * 537618701];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 35) {
                                r0 = aj;
                                i3 = ae - 1246602361;
                                ae = i3;
                                r0[(i3 * -1267697097) - 1] = mx.aa[iArr[i5]];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 36) {
                                r0 = mx.aa;
                                i3 = iArr[i5];
                                r4 = aj;
                                i6 = ae - -1246602361;
                                ae = i6;
                                r0[i3] = r4[i6 * -1267697097];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 37) {
                                intValue = iArr[i5];
                                ae -= -1246602361 * intValue;
                                String[] strArr = aj;
                                i3 = -1267697097 * ae;
                                if (intValue == 0) {
                                    str = "";
                                } else if (intValue == 1) {
                                    CharSequence charSequence = strArr[i3];
                                    if (charSequence == null) {
                                        str = "null";
                                    } else {
                                        str = charSequence.toString();
                                    }
                                } else {
                                    int i9 = intValue + i3;
                                    intValue = 0;
                                    for (r4 = i3; r4 < i9; r4++) {
                                        CharSequence charSequence2 = strArr[r4];
                                        if (charSequence2 == null) {
                                            intValue += 4;
                                        } else {
                                            intValue += charSequence2.length();
                                        }
                                    }
                                    StringBuilder stringBuilder = new StringBuilder(intValue);
                                    for (intValue = i3; intValue < i9; intValue++) {
                                        CharSequence charSequence3 = strArr[intValue];
                                        if (charSequence3 == null) {
                                            stringBuilder.append("null");
                                        } else {
                                            stringBuilder.append(charSequence3);
                                        }
                                    }
                                    str = stringBuilder.toString();
                                }
                                r3 = aj;
                                r4 = ae - 1246602361;
                                ae = r4;
                                r3[(r4 * -1267697097) - 1] = str;
                                intValue = i8;
                                i3 = i5;
                            } else if (38 == i2) {
                                ar -= -1194553915;
                                intValue = i8;
                                i3 = i5;
                            } else if (39 == i2) {
                                ae -= -1246602361;
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 40) {
                                gk af = az.af(iArr[i5], -1967892685);
                                iArr = new int[(407879525 * af.ag)];
                                String[] strArr2 = new String[(af.ay * -1469700137)];
                                for (intValue = 0; intValue < af.as * 950863471; intValue++) {
                                    iArr[intValue] = as[((ar * 537618701) - (af.as * 950863471)) + intValue];
                                }
                                for (intValue = 0; intValue < 483841497 * af.ar; intValue++) {
                                    strArr2[intValue] = aj[((ae * -1267697097) - (483841497 * af.ar)) + intValue];
                                }
                                ar -= -769321365 * af.as;
                                ae -= -1322194833 * af.ar;
                                hf hfVar2 = new hf();
                                hfVar2.af = gkVar2;
                                hfVar2.ad = -475434403 * i5;
                                hfVar2.an = cb.an;
                                hfVar2.aa = mx.aa;
                                hf[] hfVarArr2 = am;
                                i5 = aq - 1432768827;
                                aq = i5;
                                hfVarArr2[(i5 * 344694797) - 1] = hfVar2;
                                try {
                                    int[] iArr4 = af.ad;
                                    r0 = af.an;
                                    cb.an = iArr;
                                    mx.aa = strArr2;
                                    iArr = r0;
                                    iArr3 = iArr4;
                                    intValue = i8;
                                    gkVar2 = af;
                                    i3 = -1;
                                } catch (Exception e2) {
                                    e = e2;
                                    gkVar2 = af;
                                }
                            } else if (42 == i2) {
                                try {
                                    r0 = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    r0[(i3 * 537618701) - 1] = bc.kq.ad(iArr[i5], 2132372176);
                                    intValue = i8;
                                    i3 = i5;
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } else if (i2 == 43) {
                                r0 = bc.kq;
                                i3 = iArr[i5];
                                r4 = as;
                                i6 = ar - -1194553915;
                                ar = i6;
                                r0.af(i3, r4[i6 * 537618701], -1494251381);
                                intValue = i8;
                                i3 = i5;
                            } else if (44 == i2) {
                                r4 = iArr[i5] >> 16;
                                i3 = 65535 & iArr[i5];
                                r0 = as;
                                i6 = ar - -1194553915;
                                ar = i6;
                                i6 = r0[i6 * 537618701];
                                if (i6 < 0 || i6 > 5000) {
                                    throw new RuntimeException();
                                }
                                ag[r4] = i6;
                                intValue = -1;
                                if (i3 == ie.ca) {
                                    intValue = 0;
                                }
                                for (i3 = 0; i3 < i6; i3++) {
                                    ay[r4][i3] = intValue;
                                }
                                intValue = i8;
                                i3 = i5;
                            } else if (45 == i2) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                i3 = r3[r4 * 537618701];
                                if (i3 < 0 || i3 >= ag[intValue]) {
                                    throw new RuntimeException();
                                }
                                r4 = as;
                                i6 = ar - 1194553915;
                                ar = i6;
                                r4[(i6 * 537618701) - 1] = ay[intValue][i3];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 46) {
                                intValue = iArr[i5];
                                ar -= 1905859466;
                                i3 = as[537618701 * ar];
                                if (i3 < 0 || i3 >= ag[intValue]) {
                                    throw new RuntimeException();
                                }
                                ay[intValue][i3] = as[(ar * 537618701) + 1];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 47) {
                                str = bc.kq.aa(iArr[i5], -1803199202);
                                if (str == null) {
                                    str = jv.aj;
                                }
                                r3 = aj;
                                r4 = ae - 1246602361;
                                ae = r4;
                                r3[(r4 * -1267697097) - 1] = str;
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 48) {
                                r0 = bc.kq;
                                i3 = iArr[i5];
                                r4 = aj;
                                i6 = ae - -1246602361;
                                ae = i6;
                                r0.an(i3, r4[i6 * -1267697097], -1716558009);
                                intValue = i8;
                                i3 = i5;
                            } else if (60 == i2) {
                                kp kpVar = gkVar2.aj[iArr[i5]];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                kr krVar = (kr) kpVar.af((long) r3[r4 * 537618701]);
                                if (krVar != null) {
                                    i3 = krVar.af + i5;
                                    intValue = i8;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                            intValue = i8;
                            i3 = i5;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            } catch (Exception e4) {
                e = e4;
                i2 = -1;
                gkVar2 = gkVar;
                StringBuilder stringBuilder2 = new StringBuilder(30);
                stringBuilder2.append("").append(gkVar2.fy).append(" ");
                for (i4 = (344694797 * aq) - 1; i4 >= 0; i4--) {
                    stringBuilder2.append("").append(am[i4].af.fy).append(" ");
                }
                stringBuilder2.append("").append(i2);
                ah.af(stringBuilder2.toString(), e, (short) -6750);
            }
        }
    }

    static void bw(hv hvVar, int i) {
        int i2;
        int i3;
        gk gkVar;
        Throwable e;
        Object[] objArr = hvVar.af;
        if (gy.af(182090275 * hvVar.am, (byte) -110)) {
            ec.az = (es) objArr[0];
            ay ayVar = ay.ad[ec.az.af * -235703048];
            i2 = hvVar.am * 182090275;
            i3 = -1490254486 * ayVar.av;
            gk ad = ej.ad(C0002if.af(1404154115 * ayVar.ag, i2, 735380873), i2, -2034917812);
            if (ad == null) {
                ad = ej.ad(((40000 + i3) << 8) + i2, i2, -1858495796);
                if (ad == null) {
                    ad = null;
                }
            }
            gkVar = ad;
        } else {
            gkVar = az.af(((Integer) objArr[0]).intValue(), -1721913271);
        }
        if (gkVar != null) {
            ar = 0;
            ae = 0;
            int[] iArr = gkVar.ad;
            int[] iArr2 = gkVar.an;
            aq = 0;
            int i4;
            gk gkVar2;
            try {
                int intValue;
                int i5;
                String str;
                cb.an = new int[(407879525 * gkVar.ag)];
                i4 = 0;
                mx.aa = new String[(gkVar.ay * 1952290069)];
                i2 = 0;
                int i6 = 1;
                while (i6 < objArr.length) {
                    if (objArr[i6] instanceof Integer) {
                        intValue = ((Integer) objArr[i6]).intValue();
                        if (-1728773917 == intValue) {
                            intValue = -1050573046 * hvVar.aa;
                        }
                        if (-454428760 == intValue) {
                            intValue = 1604438419 * hvVar.ag;
                        }
                        if (intValue == -2006000562) {
                            intValue = hvVar.an != null ? hvVar.an.ah * 1172750087 : -1;
                        }
                        if (intValue == -1795160421) {
                            intValue = hvVar.ay * 465966367;
                        }
                        if (intValue == -2147483643) {
                            intValue = hvVar.an != null ? hvVar.an.ak * 2102445939 : -1;
                        }
                        if (intValue == -1525642635) {
                            intValue = hvVar.as != null ? hvVar.as.ah * 1172750087 : -1;
                        }
                        if (-1008433288 == intValue) {
                            intValue = hvVar.as != null ? hvVar.as.ak * 2091887404 : -1;
                        }
                        if (-1054734007 == intValue) {
                            intValue = 1094872107 * hvVar.ar;
                        }
                        if (intValue == -2147483639) {
                            i5 = hvVar.aj * 361884663;
                        } else {
                            i5 = intValue;
                        }
                        intValue = i4 + 1;
                        cb.an[i4] = i5;
                        int i7 = i2;
                        i2 = intValue;
                        intValue = i7;
                    } else if (objArr[i6] instanceof String) {
                        String str2;
                        str = (String) objArr[i6];
                        if (str.equals("event_opbase")) {
                            str2 = hvVar.ae;
                        } else {
                            str2 = str;
                        }
                        intValue = i2 + 1;
                        mx.aa[i2] = str2;
                        i2 = i4;
                    } else {
                        intValue = i2;
                        i2 = i4;
                    }
                    i6++;
                    i4 = i2;
                    i2 = intValue;
                }
                intValue = 0;
                ah = hvVar.aq * -2064366074;
                i2 = -1;
                gkVar2 = gkVar;
                i3 = -1;
                int[] iArr3 = iArr;
                iArr = iArr2;
                while (true) {
                    int i8 = intValue + 1;
                    if (i8 > i) {
                        throw new RuntimeException();
                    }
                    i5 = i3 + 1;
                    try {
                        i2 = iArr3[i5];
                        if (i2 >= 100) {
                            boolean z;
                            if (gkVar2.an[i5] == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            switch (ce.an(i2, gkVar2, z, (byte) -51)) {
                                case 0:
                                    return;
                                case 1:
                                    intValue = i8;
                                    i3 = i5;
                                    break;
                                case 2:
                                    throw new IllegalStateException();
                                default:
                                    intValue = i8;
                                    i3 = i5;
                                    break;
                            }
                        } else if (i2 == 0) {
                            r0 = as;
                            i3 = ar - 1194553915;
                            ar = i3;
                            r0[(i3 * -227038924) - 1] = iArr[i5];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 1) {
                            intValue = iArr[i5];
                            r3 = as;
                            r4 = ar - 945588302;
                            ar = r4;
                            r3[(r4 * 537618701) - 1] = al.an[intValue];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 2) {
                            intValue = iArr[i5];
                            r3 = al.an;
                            r4 = as;
                            i6 = ar - 1732272619;
                            ar = i6;
                            r3[intValue] = r4[i6 * -1000344808];
                            em.fp(intValue, -948701986);
                            intValue = i8;
                            i3 = i5;
                        } else if (3 == i2) {
                            r0 = aj;
                            i3 = ae - 1151509123;
                            ae = i3;
                            r0[(i3 * 1422344447) - 1] = gkVar2.aa[i5];
                            intValue = i8;
                            i3 = i5;
                        } else if (i2 == 6) {
                            i3 = iArr[i5] + i5;
                            intValue = i8;
                        } else {
                            if (i2 == 7) {
                                ar -= 1905859466;
                                if (as[(537618701 * ar) + 1] != as[537618701 * ar]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (8 == i2) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] == as[(ar * 730925423) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 9) {
                                ar -= 1905859466;
                                if (as[-1614894283 * ar] < as[(905414603 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 10) {
                                ar -= 1905859466;
                                if (as[537618701 * ar] > as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (21 == i2) {
                                if (1480692390 * aq != 0) {
                                    hf[] hfVarArr = am;
                                    i3 = aq - -1472268760;
                                    aq = i3;
                                    hf hfVar = hfVarArr[i3 * 461026031];
                                    gkVar2 = hfVar.af;
                                    r3 = gkVar2.ad;
                                    r0 = gkVar2.an;
                                    r4 = hfVar.ad * -132320779;
                                    cb.an = hfVar.an;
                                    mx.aa = hfVar.aa;
                                    iArr = r0;
                                    iArr3 = r3;
                                    intValue = i8;
                                    i3 = r4;
                                } else {
                                    return;
                                }
                            } else if (i2 == 25) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - 1194553915;
                                ar = r4;
                                r3[(r4 * 537618701) - 1] = io.af(intValue, 998830794);
                                intValue = i8;
                                i3 = i5;
                            } else if (27 == i2) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                ee.ad(intValue, r3[r4 * -154332925], (short) 2310);
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 31) {
                                ar -= 1905859466;
                                if (as[-318558518 * ar] <= as[(-1946694937 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (112184396 == i2) {
                                ar -= 2000302847;
                                if (as[ar * 537618701] >= as[(537618701 * ar) + 1]) {
                                    i3 = iArr[i5] + i5;
                                    intValue = i8;
                                }
                            } else if (i2 == 33) {
                                r0 = as;
                                i3 = ar - 189254226;
                                ar = i3;
                                r0[(i3 * -688522194) - 1] = cb.an[iArr[i5]];
                                intValue = i8;
                                i3 = i5;
                            } else if (-2066126186 == i2) {
                                r0 = cb.an;
                                i3 = iArr[i5];
                                r4 = as;
                                i6 = ar - -1607193923;
                                ar = i6;
                                r0[i3] = r4[i6 * 537618701];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 35) {
                                r0 = aj;
                                i3 = ae - 737069681;
                                ae = i3;
                                r0[(i3 * 373566052) - 1] = mx.aa[iArr[i5]];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 36) {
                                r0 = mx.aa;
                                i3 = iArr[i5];
                                r4 = aj;
                                i6 = ae - 828667997;
                                ae = i6;
                                r0[i3] = r4[i6 * 542232649];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == -62367621) {
                                intValue = iArr[i5];
                                ae -= 1006842196 * intValue;
                                String[] strArr = aj;
                                i3 = -1267697097 * ae;
                                if (intValue == 0) {
                                    str = "";
                                } else if (intValue == 1) {
                                    CharSequence charSequence = strArr[i3];
                                    if (charSequence == null) {
                                        str = "null";
                                    } else {
                                        str = charSequence.toString();
                                    }
                                } else {
                                    int i9 = intValue + i3;
                                    intValue = 0;
                                    for (r4 = i3; r4 < i9; r4++) {
                                        CharSequence charSequence2 = strArr[r4];
                                        if (charSequence2 == null) {
                                            intValue += 4;
                                        } else {
                                            intValue += charSequence2.length();
                                        }
                                    }
                                    StringBuilder stringBuilder = new StringBuilder(intValue);
                                    for (intValue = i3; intValue < i9; intValue++) {
                                        CharSequence charSequence3 = strArr[intValue];
                                        if (charSequence3 == null) {
                                            stringBuilder.append("null");
                                        } else {
                                            stringBuilder.append(charSequence3);
                                        }
                                    }
                                    str = stringBuilder.toString();
                                }
                                r3 = aj;
                                r4 = ae - 146758249;
                                ae = r4;
                                r3[(r4 * -1267697097) - 1] = str;
                                intValue = i8;
                                i3 = i5;
                            } else if (38 == i2) {
                                ar -= -1078349548;
                                intValue = i8;
                                i3 = i5;
                            } else if (39 == i2) {
                                ae -= -1246602361;
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 40) {
                                gk af = az.af(iArr[i5], -749958224);
                                iArr = new int[(359133038 * af.ag)];
                                String[] strArr2 = new String[(af.ay * -1758808353)];
                                for (intValue = 0; intValue < af.as * -492945279; intValue++) {
                                    iArr[intValue] = as[((ar * 537618701) - (af.as * 1440565427)) + intValue];
                                }
                                for (intValue = 0; intValue < 483841497 * af.ar; intValue++) {
                                    strArr2[intValue] = aj[((ae * -1267697097) - (-951204749 * af.ar)) + intValue];
                                }
                                ar -= -1280206510 * af.as;
                                ae -= 400755115 * af.ar;
                                hf hfVar2 = new hf();
                                hfVar2.af = gkVar2;
                                hfVar2.ad = -475434403 * i5;
                                hfVar2.an = cb.an;
                                hfVar2.aa = mx.aa;
                                hf[] hfVarArr2 = am;
                                i5 = aq - 1432768827;
                                aq = i5;
                                hfVarArr2[(i5 * 1547997781) - 1] = hfVar2;
                                try {
                                    int[] iArr4 = af.ad;
                                    r0 = af.an;
                                    cb.an = iArr;
                                    mx.aa = strArr2;
                                    iArr = r0;
                                    iArr3 = iArr4;
                                    intValue = i8;
                                    gkVar2 = af;
                                    i3 = -1;
                                } catch (Exception e2) {
                                    e = e2;
                                    gkVar2 = af;
                                }
                            } else if (-417641592 == i2) {
                                r0 = as;
                                i3 = ar - 1553828577;
                                ar = i3;
                                r0[(i3 * -1275765528) - 1] = bc.kq.ad(iArr[i5], 1905649359);
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == -408169791) {
                                r0 = bc.kq;
                                i3 = iArr[i5];
                                r4 = as;
                                i6 = ar - -2007759774;
                                ar = i6;
                                r0.af(i3, r4[i6 * 537618701], -1247855648);
                                intValue = i8;
                                i3 = i5;
                            } else if (44 == i2) {
                                r4 = iArr[i5] >> 16;
                                i3 = 65535 & iArr[i5];
                                r0 = as;
                                i6 = ar - 1089377259;
                                ar = i6;
                                i6 = r0[i6 * 537618701];
                                if (i6 < 0 || i6 > 1129533158) {
                                    throw new RuntimeException();
                                }
                                ag[r4] = i6;
                                intValue = -1;
                                if (i3 == ie.ca) {
                                    intValue = 0;
                                }
                                for (i3 = 0; i3 < i6; i3++) {
                                    ay[r4][i3] = intValue;
                                }
                                intValue = i8;
                                i3 = i5;
                            } else if (-487238594 == i2) {
                                intValue = iArr[i5];
                                r3 = as;
                                r4 = ar - -493250260;
                                ar = r4;
                                i3 = r3[r4 * 537618701];
                                if (i3 < 0 || i3 >= ag[intValue]) {
                                    throw new RuntimeException();
                                }
                                r4 = as;
                                i6 = ar + 60360334;
                                ar = i6;
                                r4[(i6 * 37438479) - 1] = ay[intValue][i3];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == -219932604) {
                                intValue = iArr[i5];
                                ar -= 1905859466;
                                i3 = as[537618701 * ar];
                                if (i3 < 0 || i3 >= ag[intValue]) {
                                    throw new RuntimeException();
                                }
                                ay[intValue][i3] = as[(ar * -1020059551) + 1];
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 47) {
                                str = bc.kq.aa(iArr[i5], -1514635107);
                                if (str == null) {
                                    str = jv.aj;
                                }
                                r3 = aj;
                                r4 = ae - 1649055793;
                                ae = r4;
                                r3[(r4 * -1267697097) - 1] = str;
                                intValue = i8;
                                i3 = i5;
                            } else if (i2 == 1216370267) {
                                r0 = bc.kq;
                                i3 = iArr[i5];
                                r4 = aj;
                                i6 = ae - -196408125;
                                ae = i6;
                                r0.an(i3, r4[i6 * 2102353812], -817095256);
                                intValue = i8;
                                i3 = i5;
                            } else if (60 == i2) {
                                kp kpVar = gkVar2.aj[iArr[i5]];
                                r3 = as;
                                r4 = ar - -1194553915;
                                ar = r4;
                                kr krVar = (kr) kpVar.af((long) r3[r4 * 1391253640]);
                                if (krVar != null) {
                                    i3 = krVar.af + i5;
                                    intValue = i8;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                            intValue = i8;
                            i3 = i5;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                i2 = -1;
                gkVar2 = gkVar;
                StringBuilder stringBuilder2 = new StringBuilder(30);
                stringBuilder2.append("").append(gkVar2.fy).append(" ");
                for (i4 = (344694797 * aq) - 1; i4 >= 0; i4--) {
                    stringBuilder2.append("").append(am[i4].af.fy).append(" ");
                }
                stringBuilder2.append("").append(i2);
                ah.af(stringBuilder2.toString(), e, (short) 21738);
            }
        }
    }

    static int bb(int i, gk gkVar, boolean z) {
        int i2 = 0;
        int i3;
        int i4;
        int i5;
        ac ad;
        ac acVar;
        int[] iArr;
        int[] iArr2;
        if (i < 1000) {
            if (100 == i) {
                ar -= 711305551;
                i3 = as[ar * 537618701];
                i4 = as[(ar * 537618701) + 1];
                i5 = as[(ar * 537618701) + 2];
                if (i4 == 0) {
                    throw new RuntimeException();
                }
                ad = hv.ad(i3, 1857863263);
                if (ad.fo == null) {
                    ad.fo = new ac[(i5 + 1)];
                }
                if (ad.fo.length <= i5) {
                    ac[] acVarArr = new ac[(i5 + 1)];
                    while (i2 < ad.fo.length) {
                        acVarArr[i2] = ad.fo[i2];
                        i2++;
                    }
                    ad.fo = acVarArr;
                }
                if (i5 <= 0 || ad.fo[i5 - 1] != null) {
                    acVar = new ac();
                    acVar.ao = i4 * 97215005;
                    i4 = ad.ah * 1;
                    acVar.ah = i4;
                    acVar.bt = i4 * 1790940165;
                    acVar.ak = -1063340613 * i5;
                    acVar.az = true;
                    ad.fo[i5] = acVar;
                    if (z) {
                        mn.ab = acVar;
                    } else {
                        at = acVar;
                    }
                    client.fk(ad, (byte) 121);
                    i2 = 1;
                } else {
                    throw new RuntimeException("" + (i5 - 1));
                }
            } else if (i == jr.cx) {
                if (z) {
                    acVar = mn.ab;
                } else {
                    acVar = at;
                }
                ad = hv.ad(acVar.ah * 1172750087, 436049493);
                ad.fo[acVar.ak * 2102445939] = null;
                client.fk(ad, (byte) 30);
                i2 = 1;
            } else if (102 == i) {
                iArr = as;
                i3 = ar - -1194553915;
                ar = i3;
                acVar = hv.ad(iArr[i3 * 537618701], 564447666);
                acVar.fo = null;
                client.fk(acVar, (byte) 120);
                i2 = 1;
            } else if (i == 200) {
                ar -= 1905859466;
                i3 = as[ar * 537618701];
                i4 = as[(ar * 537618701) + 1];
                ad = jd.an(i3, i4, (byte) 123);
                if (ad == null || -1 == i4) {
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                } else {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                }
                i2 = 1;
            } else if (201 == i) {
                iArr2 = as;
                i4 = ar - -1194553915;
                ar = i4;
                ad = hv.ad(iArr2[i4 * 537618701], 1825216870);
                if (ad != null) {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                } else {
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                }
                i2 = 1;
            } else {
                i2 = 2;
            }
            return i2;
        } else if (i < 1100) {
            return eh.aa(i, gkVar, z, (byte) 36);
        } else {
            if (i < 1200) {
                return cx.ag(i, gkVar, z, -1073153195);
            }
            if (i < 1300) {
                return cx.ay(i, gkVar, z, (byte) -28);
            }
            if (i < ac.aa) {
                return bq.as(i, gkVar, z, 387092651);
            }
            if (i < 1500) {
                return ef.ar(i, gkVar, z, 2142624698);
            }
            if (i < 1600) {
                return gw.aj(i, gkVar, z, -272687888);
            }
            if (i < 1700) {
                return dz.ae(i, gkVar, z, 782921389);
            }
            if (i < 1800) {
                if (z) {
                    ad = mn.ab;
                } else {
                    ad = at;
                }
                if (1700 == i) {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = ad.fr * -868539721;
                    return 1;
                } else if (1701 == i) {
                    if (-868539721 * ad.fr != -1) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.fp * -1148087135;
                        return 1;
                    }
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                    return 1;
                } else if (i != 1702) {
                    return 2;
                } else {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = ad.ak * 2102445939;
                    return 1;
                }
            } else if (i < 1900) {
                return ed.aq(i, gkVar, z, 331766706);
            } else {
                if (i < 2000) {
                    return ed.am(i, gkVar, z, -1522754930);
                }
                if (i < 2100) {
                    return eh.aa(i, gkVar, z, (byte) 11);
                }
                if (i < 2200) {
                    return cx.ag(i, gkVar, z, -91733529);
                }
                if (i < 2300) {
                    return cx.ay(i, gkVar, z, (byte) 106);
                }
                if (i < 2400) {
                    return bq.as(i, gkVar, z, -906746226);
                }
                if (i < 2500) {
                    return ef.ar(i, gkVar, z, 2142624698);
                }
                int[] iArr3;
                if (i < 2600) {
                    iArr2 = as;
                    i4 = ar - -1194553915;
                    ar = i4;
                    ad = hv.ad(iArr2[i4 * 537618701], 350075350);
                    if (i == 2500) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bg * 642824123;
                        return 1;
                    } else if (2501 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bh * 384720325;
                        return 1;
                    } else if (2502 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bf * 256177861;
                        return 1;
                    } else if (i == 2503) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bv * 57307023;
                        return 1;
                    } else if (2504 == i) {
                        iArr3 = as;
                        i5 = ar - 1194553915;
                        ar = i5;
                        i5 = (i5 * 537618701) - 1;
                        if (ad.bu) {
                            i2 = 1;
                        }
                        iArr3[i5] = i2;
                        return 1;
                    } else if (i != 2505) {
                        return 2;
                    } else {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bt * -1008623461;
                        return 1;
                    }
                } else if (i < 2700) {
                    iArr2 = as;
                    i4 = ar - -1194553915;
                    ar = i4;
                    ad = hv.ad(iArr2[i4 * 537618701], 1610138050);
                    if (i == 2600) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.be * -2091547827;
                        return 1;
                    } else if (2601 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bk * 654937537;
                        return 1;
                    } else if (i == 2602) {
                        r0 = aj;
                        i4 = ae - 1246602361;
                        ae = i4;
                        r0[(i4 * -1267697097) - 1] = ad.dj;
                        return 1;
                    } else if (i == 2603) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.by * 1151268625;
                        return 1;
                    } else if (i == 2604) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bn * -1243953689;
                        return 1;
                    } else if (2605 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cr * 2105704033;
                        return 1;
                    } else if (i == 2606) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cb * -1375479599;
                        return 1;
                    } else if (2607 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cz * -1211464689;
                        return 1;
                    } else if (i == 2608) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cf * -2032348791;
                        return 1;
                    } else if (i == 2609) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bj * -479221341;
                        return 1;
                    } else if (2610 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bi * -1726277411;
                        return 1;
                    } else if (2611 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.ba * 334261811;
                        return 1;
                    } else if (2612 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bl * 1703184995;
                        return 1;
                    } else if (2613 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.br.af(718081459);
                        return 1;
                    } else if (2614 != i) {
                        return 2;
                    } else {
                        iArr3 = as;
                        i5 = ar - 1194553915;
                        ar = i5;
                        i5 = (i5 * 537618701) - 1;
                        if (ad.cx) {
                            i2 = 1;
                        }
                        iArr3[i5] = i2;
                        return 1;
                    }
                } else if (i < 2800) {
                    if (i == 2700) {
                        iArr = as;
                        i3 = ar - -1194553915;
                        ar = i3;
                        acVar = hv.ad(iArr[i3 * 537618701], 746275757);
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = acVar.fr * -868539721;
                        return 1;
                    } else if (i == 2701) {
                        iArr2 = as;
                        i4 = ar - -1194553915;
                        ar = i4;
                        ad = hv.ad(iArr2[i4 * 537618701], 2054952612);
                        if (ad.fr * -868539721 != -1) {
                            iArr = as;
                            i4 = ar - 1194553915;
                            ar = i4;
                            iArr[(i4 * 537618701) - 1] = ad.fp * -1148087135;
                            return 1;
                        }
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = 0;
                        return 1;
                    } else if (i == 2702) {
                        iArr2 = as;
                        i4 = ar - -1194553915;
                        ar = i4;
                        if (((hy) client.jk.af((long) iArr2[i4 * 537618701])) != null) {
                            iArr = as;
                            i3 = ar - 1194553915;
                            ar = i3;
                            iArr[(i3 * 537618701) - 1] = 1;
                            return 1;
                        }
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != i) {
                        return 2;
                    } else {
                        iArr = as;
                        i3 = ar - 1194553915;
                        ar = i3;
                        iArr[(i3 * 537618701) - 1] = 1704673651 * client.jy;
                        return 1;
                    }
                } else if (i < 2900) {
                    iArr = as;
                    i3 = ar - -1194553915;
                    ar = i3;
                    acVar = hv.ad(iArr[i3 * 537618701], 662756657);
                    if (2800 == i) {
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = (ah.fy(acVar, -699149418) >> 11) & 63;
                        return 1;
                    } else if (2801 == i) {
                        iArr2 = as;
                        i4 = ar - -1194553915;
                        ar = i4;
                        i3 = iArr2[i4 * 537618701] - 1;
                        if (acVar.ds == null || i3 >= acVar.ds.length || acVar.ds[i3] == null) {
                            r0 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r0[(i3 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r2 = aj;
                        i5 = ae - 1246602361;
                        ae = i5;
                        r2[(i5 * -1267697097) - 1] = acVar.ds[i3];
                        return 1;
                    } else if (i != 2802) {
                        return 2;
                    } else {
                        if (acVar.dw == null) {
                            r0 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r0[(i3 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r1 = aj;
                        i4 = ae - 1246602361;
                        ae = i4;
                        r1[(i4 * -1267697097) - 1] = acVar.dw;
                        return 1;
                    }
                } else if (i < 3000) {
                    return ed.am(i, gkVar, z, 2038695401);
                } else {
                    if (i < 3200) {
                        return hy.at(i, gkVar, z, -331111033);
                    }
                    if (i < 3300) {
                        return bh.ab(i, gkVar, z, -593781161);
                    }
                    if (i < 3400) {
                        return dr.aw(i, gkVar, z, 16711935);
                    }
                    int i6;
                    if (i < 3500) {
                        ai ad2;
                        ai aiVar;
                        if (3400 == i) {
                            ar -= 1905859466;
                            i3 = as[ar * 537618701];
                            i4 = as[(ar * 537618701) + 1];
                            ad2 = av.ad(i3, -282531470);
                            if ('s' != ad2.aa) {
                                while (i2 >= -112083573 * ad2.as) {
                                    if (i4 != ad2.ar[i2]) {
                                        r2 = aj;
                                        i5 = ae - 1246602361;
                                        ae = i5;
                                        r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                        aiVar = null;
                                        break;
                                    }
                                    i2++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                r1 = aj;
                                i4 = ae - 1246602361;
                                ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            }
                            while (i2 >= -112083573 * ad2.as) {
                                if (i4 != ad2.ar[i2]) {
                                    r2 = aj;
                                    i5 = ae - 1246602361;
                                    ae = i5;
                                    r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                    aiVar = null;
                                    break;
                                }
                                i2++;
                            }
                            aiVar = ad2;
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = aj;
                            i4 = ae - 1246602361;
                            ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                            if (i2 >= -112083573 * ad2.as) {
                                aiVar = ad2;
                            } else if (i4 != ad2.ar[i2]) {
                                r2 = aj;
                                i5 = ae - 1246602361;
                                ae = i5;
                                r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                aiVar = null;
                                break;
                            } else {
                                i2++;
                            }
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = aj;
                            i4 = ae - 1246602361;
                            ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                        } else if (3408 == i) {
                            ar -= -483248364;
                            char c = as[ar * 537618701];
                            char c2 = as[(ar * 537618701) + 1];
                            i3 = as[(ar * 537618701) + 2];
                            i6 = as[(ar * 537618701) + 3];
                            ad2 = av.ad(i3, -1586977394);
                            if (ad2.an == c && c2 == ad2.aa) {
                                while (i2 < -112083573 * ad2.as) {
                                    if (i6 == ad2.ar[i2]) {
                                        if (c2 == 's') {
                                            r2 = aj;
                                            i6 = ae - 1246602361;
                                            ae = i6;
                                            r2[(i6 * -1267697097) - 1] = ad2.ae[i2];
                                        } else {
                                            iArr3 = as;
                                            i6 = ar - 1194553915;
                                            ar = i6;
                                            iArr3[(i6 * 537618701) - 1] = ad2.aj[i2];
                                        }
                                        aiVar = null;
                                        if (aiVar != null) {
                                            return 1;
                                        }
                                        if ('s' != c2) {
                                            r1 = aj;
                                            i4 = ae - 1246602361;
                                            ae = i4;
                                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                            return 1;
                                        }
                                        iArr2 = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr2[(i4 * 537618701) - 1] = aiVar.ay * -240948305;
                                        return 1;
                                    }
                                    i2++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                if ('s' != c2) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = aiVar.ay * -240948305;
                                    return 1;
                                }
                                r1 = aj;
                                i4 = ae - 1246602361;
                                ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            } else if (c2 == 's') {
                                r0 = aj;
                                i3 = ae - 1246602361;
                                ae = i3;
                                r0[(i3 * -1267697097) - 1] = jv.aj;
                                return 1;
                            } else {
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if (i != 3411) {
                            return 2;
                        } else {
                            iArr = as;
                            i3 = ar - -1194553915;
                            ar = i3;
                            aiVar = av.ad(iArr[i3 * 537618701], 1812519497);
                            iArr2 = as;
                            i4 = ar - 1194553915;
                            ar = i4;
                            iArr2[(i4 * 537618701) - 1] = aiVar.ag((byte) 1);
                            return 1;
                        }
                    } else if (i < 3700) {
                        return cv.ai(i, gkVar, z, 2123082082);
                    } else {
                        if (i < 4000) {
                            return ga.az(i, gkVar, z, (byte) -118);
                        }
                        if (i < 4100) {
                            if (i == 4000) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 + i3;
                                return 1;
                            } else if (4001 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 - i3;
                                return 1;
                            } else if (i == 4002) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 * i3;
                                return 1;
                            } else if (4003 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 / i3;
                                return 1;
                            } else if (4004 == i) {
                                iArr = as;
                                i3 = ar - -1194553915;
                                ar = i3;
                                i2 = iArr[i3 * 537618701];
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) i2));
                                return 1;
                            } else if (i == 4005) {
                                iArr = as;
                                i3 = ar - -1194553915;
                                ar = i3;
                                i2 = iArr[i3 * 537618701];
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) (i2 + 1)));
                                return 1;
                            } else if (4006 == i) {
                                ar -= -1677802279;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                i4 = as[(ar * 537618701) + 2];
                                i5 = as[(ar * 537618701) + 3];
                                i6 = as[(ar * 537618701) + 4];
                                int[] iArr4 = as;
                                int i7 = ar - 1194553915;
                                ar = i7;
                                iArr4[(i7 * 537618701) - 1] = i2 + (((i3 - i2) * (i6 - i4)) / (i5 - i4));
                                return 1;
                            } else if (4007 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 + ((i3 * i2) / 100);
                                return 1;
                            } else if (i == 4008) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 | (1 << i3);
                                return 1;
                            } else if (4009 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 & (-1 - (1 << i3));
                                return 1;
                            } else if (4010 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i4 = as[(ar * 537618701) + 1];
                                int[] iArr5 = as;
                                i6 = ar - 1194553915;
                                ar = i6;
                                i6 = (i6 * 537618701) - 1;
                                if ((i3 & (1 << i4)) != 0) {
                                    i2 = 1;
                                }
                                iArr5[i6] = i2;
                                return 1;
                            } else if (i == 4011) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 % i3;
                                return 1;
                            } else if (4012 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i4 = as[(ar * 537618701) + 1];
                                if (i3 == 0) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                iArr = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr[(i5 * 537618701) - 1] = (int) Math.pow((double) i3, (double) i4);
                                return 1;
                            } else if (4013 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i4 = as[(ar * 537618701) + 1];
                                if (i3 == 0) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                switch (i4) {
                                    case 0:
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = i3;
                                        return 1;
                                    case 2:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.sqrt((double) i3);
                                        return 1;
                                    case 3:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.cbrt((double) i3);
                                        return 1;
                                    case 4:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.sqrt(Math.sqrt((double) i3));
                                        return 1;
                                    default:
                                        iArr = as;
                                        i5 = ar - 1194553915;
                                        ar = i5;
                                        iArr[(i5 * 537618701) - 1] = (int) Math.pow((double) i3, 1.0d / ((double) i4));
                                        return 1;
                                }
                            } else if (4014 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 & i3;
                                return 1;
                            } else if (4015 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 | i3;
                                return 1;
                            } else if (4018 != i) {
                                return 2;
                            } else {
                                ar -= 711305551;
                                long j = (long) as[ar * 537618701];
                                long j2 = (long) as[(ar * 537618701) + 1];
                                long j3 = (long) as[(ar * 537618701) + 2];
                                int[] iArr6 = as;
                                int i8 = ar - 1194553915;
                                ar = i8;
                                iArr6[(i8 * 537618701) - 1] = (int) ((j * j3) / j2);
                                return 1;
                            }
                        } else if (i < 4200) {
                            return ah.ah(i, gkVar, z, -1339380354);
                        } else {
                            if (i < 4300) {
                                return C0001do.ak(i, gkVar, z, -396276527);
                            }
                            if (i < 5100) {
                                return dq.ao(i, gkVar, z, 565482459);
                            }
                            if (i < 5400) {
                                if (i == 5306) {
                                    iArr2 = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    i4 = (i2 * 537618701) - 1;
                                    if (client.ld) {
                                        i2 = 2;
                                    } else {
                                        i2 = 1;
                                    }
                                    iArr2[i4] = i2;
                                    return 1;
                                } else if (5307 == i) {
                                    iArr = as;
                                    i3 = ar - -1194553915;
                                    ar = i3;
                                    i2 = iArr[i3 * 537618701];
                                    if (i2 != 1 && 2 != i2) {
                                        return 1;
                                    }
                                    client.ad.ck(i2, -628919830);
                                    return 1;
                                } else if (i == 5308) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = 1775240613 * cs.oj.ag;
                                    return 1;
                                } else if (i != 5309) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - -1194553915;
                                    ar = i3;
                                    i2 = iArr[i3 * 537618701];
                                    if (1 != i2 && 2 != i2) {
                                        return 1;
                                    }
                                    cs.oj.ag = i2 * 1983339053;
                                    co.aa(-480187775);
                                    return 1;
                                }
                            } else if (i < 5600) {
                                if (i == 5504) {
                                    ar -= 1905859466;
                                    i2 = as[ar * 537618701];
                                    i3 = as[(ar * 537618701) + 1];
                                    if (client.nm) {
                                        return 1;
                                    }
                                    bm.bs(i2, i3, -2086233489);
                                    return 1;
                                } else if (i == 5505) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fz * 1679658745;
                                    return 1;
                                } else if (5506 == i) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fn * -198683079;
                                    return 1;
                                } else if (5530 == i) {
                                    iArr2 = as;
                                    i4 = ar - -1194553915;
                                    ar = i4;
                                    i3 = iArr2[i4 * 537618701];
                                    if (i3 >= 0) {
                                        i2 = i3;
                                    }
                                    client.fw = i2 * -1089737365;
                                    return 1;
                                } else if (i != 5531) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fw * -176892093;
                                    return 1;
                                }
                            } else if (i < 5700) {
                                if (5630 != i) {
                                    return 2;
                                }
                                client.dl = -1012553922;
                                return 1;
                            } else if (i < 6300) {
                                if (i == 6200) {
                                    ar -= 1905859466;
                                    client.oh = (short) as[ar * 537618701];
                                    if (client.oh <= (short) 0) {
                                        client.oh = (short) 256;
                                    }
                                    client.oy = (short) as[(ar * 537618701) + 1];
                                    if (client.oy > (short) 0) {
                                        return 1;
                                    }
                                    client.oy = (short) 205;
                                    return 1;
                                } else if (i == 6201) {
                                    ar -= 1905859466;
                                    client.oa = (short) as[ar * 537618701];
                                    if (client.oa <= (short) 0) {
                                        client.oa = (short) 256;
                                    }
                                    client.oi = (short) as[(ar * 537618701) + 1];
                                    if (client.oi > (short) 0) {
                                        return 1;
                                    }
                                    client.oi = (short) 320;
                                    return 1;
                                } else if (6202 == i) {
                                    ar -= -483248364;
                                    client.ox = (short) as[ar * 537618701];
                                    if (client.ox <= (short) 0) {
                                        client.ox = (short) 1;
                                    }
                                    client.ov = (short) as[(ar * 537618701) + 1];
                                    if (client.ov <= (short) 0) {
                                        client.ov = Short.MAX_VALUE;
                                    } else if (client.ov < client.ox) {
                                        client.ov = client.ox;
                                    }
                                    client.of = (short) as[(ar * 537618701) + 2];
                                    if (client.of <= (short) 0) {
                                        client.of = (short) 1;
                                    }
                                    client.os = (short) as[(ar * 537618701) + 3];
                                    if (client.os <= (short) 0) {
                                        client.os = Short.MAX_VALUE;
                                        return 1;
                                    } else if (client.os >= client.of) {
                                        return 1;
                                    } else {
                                        client.os = client.of;
                                        return 1;
                                    }
                                } else if (i == 6203) {
                                    if (client.ju != null) {
                                        mf.cp(0, 0, 256177861 * client.ju.bf, 57307023 * client.ju.bv, false, -1526745070);
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * 537618701) - 1] = 2140963035 * client.oc;
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * 537618701) - 1] = client.ot * -1949120505;
                                        return 1;
                                    }
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = -1;
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = -1;
                                    return 1;
                                } else if (i == 6204) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oa;
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oi;
                                    return 1;
                                } else if (6205 != i) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oh;
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oy;
                                    return 1;
                                }
                            } else if (i < 6600) {
                                return gu.ax(i, gkVar, z, 1717640738);
                            } else {
                                if (i < 6700) {
                                    return no.au(i, gkVar, z, -751569064);
                                }
                                return 2;
                            }
                        }
                    }
                }
            }
        }
    }

    static int bc(int i, gk gkVar, boolean z) {
        int i2 = 0;
        int i3;
        int i4;
        int i5;
        ac ad;
        ac acVar;
        int[] iArr;
        int[] iArr2;
        if (i < 1000) {
            if (100 == i) {
                ar -= 711305551;
                i3 = as[ar * 537618701];
                i4 = as[(ar * 537618701) + 1];
                i5 = as[(ar * 537618701) + 2];
                if (i4 == 0) {
                    throw new RuntimeException();
                }
                ad = hv.ad(i3, 1656591227);
                if (ad.fo == null) {
                    ad.fo = new ac[(i5 + 1)];
                }
                if (ad.fo.length <= i5) {
                    ac[] acVarArr = new ac[(i5 + 1)];
                    while (i2 < ad.fo.length) {
                        acVarArr[i2] = ad.fo[i2];
                        i2++;
                    }
                    ad.fo = acVarArr;
                }
                if (i5 <= 0 || ad.fo[i5 - 1] != null) {
                    acVar = new ac();
                    acVar.ao = i4 * 97215005;
                    i4 = ad.ah * 1;
                    acVar.ah = i4;
                    acVar.bt = i4 * 1790940165;
                    acVar.ak = -1063340613 * i5;
                    acVar.az = true;
                    ad.fo[i5] = acVar;
                    if (z) {
                        mn.ab = acVar;
                    } else {
                        at = acVar;
                    }
                    client.fk(ad, (byte) 83);
                    i2 = 1;
                } else {
                    throw new RuntimeException("" + (i5 - 1));
                }
            } else if (i == jr.cx) {
                acVar = z ? mn.ab : at;
                ad = hv.ad(acVar.ah * 1172750087, 1471455264);
                ad.fo[acVar.ak * 2102445939] = null;
                client.fk(ad, (byte) 99);
                i2 = 1;
            } else if (102 == i) {
                iArr = as;
                i3 = ar - -1194553915;
                ar = i3;
                acVar = hv.ad(iArr[i3 * 537618701], 1729502942);
                acVar.fo = null;
                client.fk(acVar, (byte) 54);
                i2 = 1;
            } else if (i == 200) {
                ar -= 1905859466;
                i3 = as[ar * 537618701];
                i4 = as[(ar * 537618701) + 1];
                ad = jd.an(i3, i4, (byte) 52);
                if (ad == null || -1 == i4) {
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                } else {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                }
                i2 = 1;
            } else if (201 == i) {
                iArr2 = as;
                i4 = ar - -1194553915;
                ar = i4;
                ad = hv.ad(iArr2[i4 * 537618701], 103912634);
                if (ad != null) {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                } else {
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                }
                i2 = 1;
            } else {
                i2 = 2;
            }
            return i2;
        } else if (i < 1100) {
            return eh.aa(i, gkVar, z, (byte) 92);
        } else {
            if (i < 1200) {
                return cx.ag(i, gkVar, z, -504755427);
            }
            if (i < 1300) {
                return cx.ay(i, gkVar, z, (byte) -77);
            }
            if (i < ac.aa) {
                return bq.as(i, gkVar, z, -855166533);
            }
            if (i < 1500) {
                return ef.ar(i, gkVar, z, 2142624698);
            }
            if (i < 1600) {
                return gw.aj(i, gkVar, z, -634157123);
            }
            if (i < 1700) {
                return dz.ae(i, gkVar, z, 829285324);
            }
            if (i < 1800) {
                if (z) {
                    ad = mn.ab;
                } else {
                    ad = at;
                }
                if (1700 == i) {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = ad.fr * -868539721;
                    return 1;
                } else if (1701 == i) {
                    if (-868539721 * ad.fr != -1) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.fp * -1148087135;
                        return 1;
                    }
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                    return 1;
                } else if (i != 1702) {
                    return 2;
                } else {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = ad.ak * 2102445939;
                    return 1;
                }
            } else if (i < 1900) {
                return ed.aq(i, gkVar, z, 1525373600);
            } else {
                if (i < 2000) {
                    return ed.am(i, gkVar, z, 1748199288);
                }
                if (i < 2100) {
                    return eh.aa(i, gkVar, z, (byte) 41);
                }
                if (i < 2200) {
                    return cx.ag(i, gkVar, z, 156386604);
                }
                if (i < 2300) {
                    return cx.ay(i, gkVar, z, (byte) -22);
                }
                if (i < 2400) {
                    return bq.as(i, gkVar, z, -1677895968);
                }
                if (i < 2500) {
                    return ef.ar(i, gkVar, z, 2142624698);
                }
                int[] iArr3;
                if (i < 2600) {
                    iArr2 = as;
                    i4 = ar - -1194553915;
                    ar = i4;
                    ad = hv.ad(iArr2[i4 * 537618701], 1672017432);
                    if (i == 2500) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bg * 642824123;
                        return 1;
                    } else if (2501 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bh * 384720325;
                        return 1;
                    } else if (2502 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bf * 256177861;
                        return 1;
                    } else if (i == 2503) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bv * 57307023;
                        return 1;
                    } else if (2504 == i) {
                        iArr3 = as;
                        i5 = ar - 1194553915;
                        ar = i5;
                        i5 = (i5 * 537618701) - 1;
                        if (ad.bu) {
                            i2 = 1;
                        }
                        iArr3[i5] = i2;
                        return 1;
                    } else if (i != 2505) {
                        return 2;
                    } else {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bt * -1008623461;
                        return 1;
                    }
                } else if (i < 2700) {
                    iArr2 = as;
                    i4 = ar - -1194553915;
                    ar = i4;
                    ad = hv.ad(iArr2[i4 * 537618701], 973620928);
                    if (i == 2600) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.be * -2091547827;
                        return 1;
                    } else if (2601 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bk * 654937537;
                        return 1;
                    } else if (i == 2602) {
                        r0 = aj;
                        i4 = ae - 1246602361;
                        ae = i4;
                        r0[(i4 * -1267697097) - 1] = ad.dj;
                        return 1;
                    } else if (i == 2603) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.by * 1151268625;
                        return 1;
                    } else if (i == 2604) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bn * -1243953689;
                        return 1;
                    } else if (2605 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cr * 2105704033;
                        return 1;
                    } else if (i == 2606) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cb * -1375479599;
                        return 1;
                    } else if (2607 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cz * -1211464689;
                        return 1;
                    } else if (i == 2608) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cf * -2032348791;
                        return 1;
                    } else if (i == 2609) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bj * -479221341;
                        return 1;
                    } else if (2610 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bi * -1726277411;
                        return 1;
                    } else if (2611 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.ba * 334261811;
                        return 1;
                    } else if (2612 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bl * 1703184995;
                        return 1;
                    } else if (2613 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.br.af(991068145);
                        return 1;
                    } else if (2614 != i) {
                        return 2;
                    } else {
                        iArr3 = as;
                        i5 = ar - 1194553915;
                        ar = i5;
                        i5 = (i5 * 537618701) - 1;
                        if (ad.cx) {
                            i2 = 1;
                        }
                        iArr3[i5] = i2;
                        return 1;
                    }
                } else if (i < 2800) {
                    if (i == 2700) {
                        iArr = as;
                        i3 = ar - -1194553915;
                        ar = i3;
                        acVar = hv.ad(iArr[i3 * 537618701], 2078478989);
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = acVar.fr * -868539721;
                        return 1;
                    } else if (i == 2701) {
                        iArr2 = as;
                        i4 = ar - -1194553915;
                        ar = i4;
                        ad = hv.ad(iArr2[i4 * 537618701], 958070486);
                        if (ad.fr * -868539721 != -1) {
                            iArr = as;
                            i4 = ar - 1194553915;
                            ar = i4;
                            iArr[(i4 * 537618701) - 1] = ad.fp * -1148087135;
                            return 1;
                        }
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = 0;
                        return 1;
                    } else if (i == 2702) {
                        iArr2 = as;
                        i4 = ar - -1194553915;
                        ar = i4;
                        if (((hy) client.jk.af((long) iArr2[i4 * 537618701])) != null) {
                            iArr = as;
                            i3 = ar - 1194553915;
                            ar = i3;
                            iArr[(i3 * 537618701) - 1] = 1;
                            return 1;
                        }
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != i) {
                        return 2;
                    } else {
                        iArr = as;
                        i3 = ar - 1194553915;
                        ar = i3;
                        iArr[(i3 * 537618701) - 1] = 1704673651 * client.jy;
                        return 1;
                    }
                } else if (i < 2900) {
                    iArr = as;
                    i3 = ar - -1194553915;
                    ar = i3;
                    acVar = hv.ad(iArr[i3 * 537618701], 1752424260);
                    if (2800 == i) {
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = (ah.fy(acVar, -2005551113) >> 11) & 63;
                        return 1;
                    } else if (2801 == i) {
                        iArr2 = as;
                        i4 = ar - -1194553915;
                        ar = i4;
                        i3 = iArr2[i4 * 537618701] - 1;
                        if (acVar.ds == null || i3 >= acVar.ds.length || acVar.ds[i3] == null) {
                            r0 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r0[(i3 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r2 = aj;
                        i5 = ae - 1246602361;
                        ae = i5;
                        r2[(i5 * -1267697097) - 1] = acVar.ds[i3];
                        return 1;
                    } else if (i != 2802) {
                        return 2;
                    } else {
                        if (acVar.dw == null) {
                            r0 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r0[(i3 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r1 = aj;
                        i4 = ae - 1246602361;
                        ae = i4;
                        r1[(i4 * -1267697097) - 1] = acVar.dw;
                        return 1;
                    }
                } else if (i < 3000) {
                    return ed.am(i, gkVar, z, 599082505);
                } else {
                    if (i < 3200) {
                        return hy.at(i, gkVar, z, -1699829299);
                    }
                    if (i < 3300) {
                        return bh.ab(i, gkVar, z, -151844425);
                    }
                    if (i < 3400) {
                        return dr.aw(i, gkVar, z, 16711935);
                    }
                    int i6;
                    if (i < 3500) {
                        ai ad2;
                        ai aiVar;
                        if (3400 == i) {
                            ar -= 1905859466;
                            i3 = as[ar * 537618701];
                            i4 = as[(ar * 537618701) + 1];
                            ad2 = av.ad(i3, -288678908);
                            if ('s' != ad2.aa) {
                                while (i2 >= -112083573 * ad2.as) {
                                    if (i4 != ad2.ar[i2]) {
                                        r2 = aj;
                                        i5 = ae - 1246602361;
                                        ae = i5;
                                        r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                        aiVar = null;
                                        break;
                                    }
                                    i2++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                r1 = aj;
                                i4 = ae - 1246602361;
                                ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            }
                            while (i2 >= -112083573 * ad2.as) {
                                if (i4 != ad2.ar[i2]) {
                                    r2 = aj;
                                    i5 = ae - 1246602361;
                                    ae = i5;
                                    r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                    aiVar = null;
                                    break;
                                }
                                i2++;
                            }
                            aiVar = ad2;
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = aj;
                            i4 = ae - 1246602361;
                            ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                            if (i2 >= -112083573 * ad2.as) {
                                aiVar = ad2;
                            } else if (i4 != ad2.ar[i2]) {
                                r2 = aj;
                                i5 = ae - 1246602361;
                                ae = i5;
                                r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                aiVar = null;
                                break;
                            } else {
                                i2++;
                            }
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = aj;
                            i4 = ae - 1246602361;
                            ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                        } else if (3408 == i) {
                            ar -= -483248364;
                            char c = as[ar * 537618701];
                            char c2 = as[(ar * 537618701) + 1];
                            i3 = as[(ar * 537618701) + 2];
                            i6 = as[(ar * 537618701) + 3];
                            ad2 = av.ad(i3, -670775006);
                            if (ad2.an == c && c2 == ad2.aa) {
                                while (i2 < -112083573 * ad2.as) {
                                    if (i6 == ad2.ar[i2]) {
                                        if (c2 == 's') {
                                            r2 = aj;
                                            i6 = ae - 1246602361;
                                            ae = i6;
                                            r2[(i6 * -1267697097) - 1] = ad2.ae[i2];
                                        } else {
                                            iArr3 = as;
                                            i6 = ar - 1194553915;
                                            ar = i6;
                                            iArr3[(i6 * 537618701) - 1] = ad2.aj[i2];
                                        }
                                        aiVar = null;
                                        if (aiVar != null) {
                                            return 1;
                                        }
                                        if ('s' != c2) {
                                            r1 = aj;
                                            i4 = ae - 1246602361;
                                            ae = i4;
                                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                            return 1;
                                        }
                                        iArr2 = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr2[(i4 * 537618701) - 1] = aiVar.ay * -240948305;
                                        return 1;
                                    }
                                    i2++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                if ('s' != c2) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = aiVar.ay * -240948305;
                                    return 1;
                                }
                                r1 = aj;
                                i4 = ae - 1246602361;
                                ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            } else if (c2 == 's') {
                                r0 = aj;
                                i3 = ae - 1246602361;
                                ae = i3;
                                r0[(i3 * -1267697097) - 1] = jv.aj;
                                return 1;
                            } else {
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if (i != 3411) {
                            return 2;
                        } else {
                            iArr = as;
                            i3 = ar - -1194553915;
                            ar = i3;
                            aiVar = av.ad(iArr[i3 * 537618701], -896323716);
                            iArr2 = as;
                            i4 = ar - 1194553915;
                            ar = i4;
                            iArr2[(i4 * 537618701) - 1] = aiVar.ag((byte) 1);
                            return 1;
                        }
                    } else if (i < 3700) {
                        return cv.ai(i, gkVar, z, 2123082082);
                    } else {
                        if (i < 4000) {
                            return ga.az(i, gkVar, z, (byte) -76);
                        }
                        if (i < 4100) {
                            if (i == 4000) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 + i3;
                                return 1;
                            } else if (4001 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 - i3;
                                return 1;
                            } else if (i == 4002) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 * i3;
                                return 1;
                            } else if (4003 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 / i3;
                                return 1;
                            } else if (4004 == i) {
                                iArr = as;
                                i3 = ar - -1194553915;
                                ar = i3;
                                i2 = iArr[i3 * 537618701];
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) i2));
                                return 1;
                            } else if (i == 4005) {
                                iArr = as;
                                i3 = ar - -1194553915;
                                ar = i3;
                                i2 = iArr[i3 * 537618701];
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) (i2 + 1)));
                                return 1;
                            } else if (4006 == i) {
                                ar -= -1677802279;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                i4 = as[(ar * 537618701) + 2];
                                i5 = as[(ar * 537618701) + 3];
                                i6 = as[(ar * 537618701) + 4];
                                int[] iArr4 = as;
                                int i7 = ar - 1194553915;
                                ar = i7;
                                iArr4[(i7 * 537618701) - 1] = i2 + (((i3 - i2) * (i6 - i4)) / (i5 - i4));
                                return 1;
                            } else if (4007 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 + ((i3 * i2) / 100);
                                return 1;
                            } else if (i == 4008) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 | (1 << i3);
                                return 1;
                            } else if (4009 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 & (-1 - (1 << i3));
                                return 1;
                            } else if (4010 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i4 = as[(ar * 537618701) + 1];
                                int[] iArr5 = as;
                                i6 = ar - 1194553915;
                                ar = i6;
                                i6 = (i6 * 537618701) - 1;
                                if ((i3 & (1 << i4)) != 0) {
                                    i2 = 1;
                                }
                                iArr5[i6] = i2;
                                return 1;
                            } else if (i == 4011) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 % i3;
                                return 1;
                            } else if (4012 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i4 = as[(ar * 537618701) + 1];
                                if (i3 == 0) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                iArr = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr[(i5 * 537618701) - 1] = (int) Math.pow((double) i3, (double) i4);
                                return 1;
                            } else if (4013 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i4 = as[(ar * 537618701) + 1];
                                if (i3 == 0) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                switch (i4) {
                                    case 0:
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = i3;
                                        return 1;
                                    case 2:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.sqrt((double) i3);
                                        return 1;
                                    case 3:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.cbrt((double) i3);
                                        return 1;
                                    case 4:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.sqrt(Math.sqrt((double) i3));
                                        return 1;
                                    default:
                                        iArr = as;
                                        i5 = ar - 1194553915;
                                        ar = i5;
                                        iArr[(i5 * 537618701) - 1] = (int) Math.pow((double) i3, 1.0d / ((double) i4));
                                        return 1;
                                }
                            } else if (4014 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 & i3;
                                return 1;
                            } else if (4015 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 | i3;
                                return 1;
                            } else if (4018 != i) {
                                return 2;
                            } else {
                                ar -= 711305551;
                                long j = (long) as[ar * 537618701];
                                long j2 = (long) as[(ar * 537618701) + 1];
                                long j3 = (long) as[(ar * 537618701) + 2];
                                int[] iArr6 = as;
                                int i8 = ar - 1194553915;
                                ar = i8;
                                iArr6[(i8 * 537618701) - 1] = (int) ((j * j3) / j2);
                                return 1;
                            }
                        } else if (i < 4200) {
                            return ah.ah(i, gkVar, z, -1092975641);
                        } else {
                            if (i < 4300) {
                                return C0001do.ak(i, gkVar, z, -483251386);
                            }
                            if (i < 5100) {
                                return dq.ao(i, gkVar, z, -36554249);
                            }
                            if (i < 5400) {
                                if (i == 5306) {
                                    iArr2 = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr2[(i2 * 537618701) - 1] = client.ld ? 2 : 1;
                                    return 1;
                                } else if (5307 == i) {
                                    iArr = as;
                                    i3 = ar - -1194553915;
                                    ar = i3;
                                    i2 = iArr[i3 * 537618701];
                                    if (i2 != 1 && 2 != i2) {
                                        return 1;
                                    }
                                    client.ad.ck(i2, 2114443801);
                                    return 1;
                                } else if (i == 5308) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = 1775240613 * cs.oj.ag;
                                    return 1;
                                } else if (i != 5309) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - -1194553915;
                                    ar = i3;
                                    i2 = iArr[i3 * 537618701];
                                    if (1 != i2 && 2 != i2) {
                                        return 1;
                                    }
                                    cs.oj.ag = i2 * 1983339053;
                                    co.aa(-1207668997);
                                    return 1;
                                }
                            } else if (i < 5600) {
                                if (i == 5504) {
                                    ar -= 1905859466;
                                    i2 = as[ar * 537618701];
                                    i3 = as[(ar * 537618701) + 1];
                                    if (client.nm) {
                                        return 1;
                                    }
                                    bm.bs(i2, i3, -2062366712);
                                    return 1;
                                } else if (i == 5505) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fz * 1679658745;
                                    return 1;
                                } else if (5506 == i) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fn * -198683079;
                                    return 1;
                                } else if (5530 == i) {
                                    iArr2 = as;
                                    i4 = ar - -1194553915;
                                    ar = i4;
                                    i3 = iArr2[i4 * 537618701];
                                    if (i3 >= 0) {
                                        i2 = i3;
                                    }
                                    client.fw = i2 * -1089737365;
                                    return 1;
                                } else if (i != 5531) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fw * -176892093;
                                    return 1;
                                }
                            } else if (i < 5700) {
                                if (5630 != i) {
                                    return 2;
                                }
                                client.dl = -1012553922;
                                return 1;
                            } else if (i < 6300) {
                                if (i == 6200) {
                                    ar -= 1905859466;
                                    client.oh = (short) as[ar * 537618701];
                                    if (client.oh <= (short) 0) {
                                        client.oh = (short) 256;
                                    }
                                    client.oy = (short) as[(ar * 537618701) + 1];
                                    if (client.oy > (short) 0) {
                                        return 1;
                                    }
                                    client.oy = (short) 205;
                                    return 1;
                                } else if (i == 6201) {
                                    ar -= 1905859466;
                                    client.oa = (short) as[ar * 537618701];
                                    if (client.oa <= (short) 0) {
                                        client.oa = (short) 256;
                                    }
                                    client.oi = (short) as[(ar * 537618701) + 1];
                                    if (client.oi > (short) 0) {
                                        return 1;
                                    }
                                    client.oi = (short) 320;
                                    return 1;
                                } else if (6202 == i) {
                                    ar -= -483248364;
                                    client.ox = (short) as[ar * 537618701];
                                    if (client.ox <= (short) 0) {
                                        client.ox = (short) 1;
                                    }
                                    client.ov = (short) as[(ar * 537618701) + 1];
                                    if (client.ov <= (short) 0) {
                                        client.ov = Short.MAX_VALUE;
                                    } else if (client.ov < client.ox) {
                                        client.ov = client.ox;
                                    }
                                    client.of = (short) as[(ar * 537618701) + 2];
                                    if (client.of <= (short) 0) {
                                        client.of = (short) 1;
                                    }
                                    client.os = (short) as[(ar * 537618701) + 3];
                                    if (client.os <= (short) 0) {
                                        client.os = Short.MAX_VALUE;
                                        return 1;
                                    } else if (client.os >= client.of) {
                                        return 1;
                                    } else {
                                        client.os = client.of;
                                        return 1;
                                    }
                                } else if (i == 6203) {
                                    if (client.ju != null) {
                                        mf.cp(0, 0, 256177861 * client.ju.bf, 57307023 * client.ju.bv, false, -1199401814);
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * 537618701) - 1] = 2140963035 * client.oc;
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * 537618701) - 1] = client.ot * -1949120505;
                                        return 1;
                                    }
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = -1;
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = -1;
                                    return 1;
                                } else if (i == 6204) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oa;
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oi;
                                    return 1;
                                } else if (6205 != i) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oh;
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oy;
                                    return 1;
                                }
                            } else if (i < 6600) {
                                return gu.ax(i, gkVar, z, 820734962);
                            } else {
                                if (i < 6700) {
                                    return no.au(i, gkVar, z, -2145227718);
                                }
                                return 2;
                            }
                        }
                    }
                }
            }
        }
    }

    static int bg(int i, gk gkVar, boolean z) {
        int i2 = 2;
        byte b = (byte) 0;
        int i3;
        int i4;
        ac ad;
        int i5;
        ac acVar;
        int[] iArr;
        int[] iArr2;
        if (i < 1000) {
            if (100 == i) {
                ar -= 236346055;
                i2 = as[-13288956 * ar];
                i3 = as[(ar * 413664612) + 1];
                i4 = as[(ar * 537618701) + 2];
                if (i3 == 0) {
                    throw new RuntimeException();
                }
                ad = hv.ad(i2, 910329181);
                if (ad.fo == null) {
                    ad.fo = new ac[(i4 + 1)];
                }
                if (ad.fo.length <= i4) {
                    ac[] acVarArr = new ac[(i4 + 1)];
                    while (i5 < ad.fo.length) {
                        acVarArr[i5] = ad.fo[i5];
                        i5++;
                    }
                    ad.fo = acVarArr;
                }
                if (i4 <= 0 || ad.fo[i4 - 1] != null) {
                    acVar = new ac();
                    acVar.ao = i3 * 1275667449;
                    i3 = ad.ah * 1;
                    acVar.ah = i3;
                    acVar.bt = i3 * 1790940165;
                    acVar.ak = -852112938 * i4;
                    acVar.az = true;
                    ad.fo[i4] = acVar;
                    if (z) {
                        mn.ab = acVar;
                    } else {
                        at = acVar;
                    }
                    client.fk(ad, (byte) 108);
                    i5 = 1;
                } else {
                    throw new RuntimeException("" + (i4 - 1));
                }
            } else if (i == jr.cx) {
                if (z) {
                    acVar = mn.ab;
                } else {
                    acVar = at;
                }
                ad = hv.ad(acVar.ah * 1172750087, 1161901677);
                ad.fo[acVar.ak * -2086492844] = null;
                client.fk(ad, (byte) 10);
                i5 = 1;
            } else if (102 == i) {
                iArr = as;
                i2 = ar - 1306996421;
                ar = i2;
                acVar = hv.ad(iArr[i2 * 1766606743], 687416923);
                acVar.fo = null;
                client.fk(acVar, (byte) 82);
                i5 = 1;
            } else if (i == 200) {
                ar -= -2099650184;
                i2 = as[-2007968056 * ar];
                i3 = as[(-1153051936 * ar) + 1];
                ad = jd.an(i2, i3, (byte) 40);
                if (ad == null || -1 == i3) {
                    iArr2 = as;
                    i3 = ar - 1194553915;
                    ar = i3;
                    iArr2[(i3 * 537618701) - 1] = 0;
                } else {
                    iArr = as;
                    i3 = ar + 488407551;
                    ar = i3;
                    iArr[(i3 * 1107288197) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                }
                i5 = 1;
            } else if (201 == i) {
                iArr2 = as;
                i3 = ar - -1194553915;
                ar = i3;
                ad = hv.ad(iArr2[i3 * -1141919033], 329788097);
                if (ad != null) {
                    iArr = as;
                    i3 = ar - 1194553915;
                    ar = i3;
                    iArr[(i3 * 2071820785) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                } else {
                    iArr2 = as;
                    i3 = ar + 1362573482;
                    ar = i3;
                    iArr2[(i3 * 537618701) - 1] = 0;
                }
                i5 = 1;
            } else {
                i5 = 2;
            }
            return i5;
        } else if (i < 1251447387) {
            return eh.aa(i, gkVar, z, (byte) 71);
        } else {
            if (i < -2019309627) {
                return cx.ag(i, gkVar, z, 619991694);
            }
            if (i < 1300) {
                return cx.ay(i, gkVar, z, (byte) 0);
            }
            if (i < ac.aa) {
                return bq.as(i, gkVar, z, -1191337185);
            }
            if (i < 163135857) {
                return ef.ar(i, gkVar, z, 2142624698);
            }
            if (i < 2014161160) {
                return gw.aj(i, gkVar, z, -215814278);
            }
            if (i < 1700) {
                return dz.ae(i, gkVar, z, 806759551);
            }
            ac acVar2;
            if (i < -1738842910) {
                acVar2 = z ? mn.ab : at;
                if (212861266 == i) {
                    iArr = as;
                    i2 = ar - 1300678827;
                    ar = i2;
                    iArr[(i2 * 537618701) - 1] = acVar2.fr * 1987446265;
                    return 1;
                } else if (1701 == i) {
                    if (-868539721 * acVar2.fr != -1) {
                        iArr = as;
                        i2 = ar - 461205819;
                        ar = i2;
                        iArr[(i2 * -1218814396) - 1] = acVar2.fp * -436500698;
                        return 1;
                    }
                    iArr2 = as;
                    i3 = ar - 1194553915;
                    ar = i3;
                    iArr2[(i3 * -1886312239) - 1] = 0;
                    return 1;
                } else if (i != 1702) {
                    return 2;
                } else {
                    iArr = as;
                    i2 = ar - 502872842;
                    ar = i2;
                    iArr[(i2 * 998760798) - 1] = acVar2.ak * -1586324861;
                    return 1;
                }
            } else if (i < -2028087243) {
                return ed.aq(i, gkVar, z, 1893773604);
            } else {
                if (i < 633417136) {
                    return ed.am(i, gkVar, z, -1935907987);
                }
                if (i < 2100) {
                    return eh.aa(i, gkVar, z, (byte) 12);
                }
                if (i < 2124614500) {
                    return cx.ag(i, gkVar, z, -1644691955);
                }
                if (i < 1478333647) {
                    return cx.ay(i, gkVar, z, (byte) -38);
                }
                if (i < 1451047493) {
                    return bq.as(i, gkVar, z, -1208304187);
                }
                if (i < 692085704) {
                    return ef.ar(i, gkVar, z, 2142624698);
                }
                int[] iArr3;
                if (i < -300800088) {
                    iArr3 = as;
                    i4 = ar - -1578483789;
                    ar = i4;
                    acVar2 = hv.ad(iArr3[i4 * 537618701], 397753459);
                    if (i == 2143938321) {
                        iArr = as;
                        i2 = ar + 144303583;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.bg * -570416964;
                        return 1;
                    } else if (2117860107 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.bh * 384720325;
                        return 1;
                    } else if (-1330481579 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 416712527) - 1] = acVar2.bf * -1063643337;
                        return 1;
                    } else if (i == 1618764589) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 697169193) - 1] = acVar2.bv * 57307023;
                        return 1;
                    } else if (2504 == i) {
                        iArr2 = as;
                        i4 = ar + 398590361;
                        ar = i4;
                        i4 = (i4 * 1679864568) - 1;
                        if (acVar2.bu) {
                            i5 = 1;
                        }
                        iArr2[i4] = i5;
                        return 1;
                    } else if (i != -248705459) {
                        return 2;
                    } else {
                        iArr = as;
                        i2 = ar - 538939923;
                        ar = i2;
                        iArr[(i2 * -1276668122) - 1] = acVar2.bt * 1047584357;
                        return 1;
                    }
                } else if (i < 2700) {
                    iArr3 = as;
                    i4 = ar - -1194553915;
                    ar = i4;
                    acVar2 = hv.ad(iArr3[i4 * 537618701], 1623915599);
                    if (i == -600641128) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * -1165675312) - 1] = acVar2.be * -2091547827;
                        return 1;
                    } else if (-655923201 == i) {
                        iArr = as;
                        i2 = ar + 792048624;
                        ar = i2;
                        iArr[(i2 * 1346303853) - 1] = acVar2.bk * 654937537;
                        return 1;
                    } else if (i == -1009157699) {
                        r0 = aj;
                        i2 = ae - 1246602361;
                        ae = i2;
                        r0[(i2 * -1944079396) - 1] = acVar2.dj;
                        return 1;
                    } else if (i == 2603) {
                        iArr = as;
                        i2 = ar - 421508287;
                        ar = i2;
                        iArr[(i2 * 1891518690) - 1] = acVar2.by * 1151268625;
                        return 1;
                    } else if (i == 2604) {
                        iArr = as;
                        i2 = ar + 281978569;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.bn * 144013302;
                        return 1;
                    } else if (-773080022 == i) {
                        iArr = as;
                        i2 = ar + 1741757323;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.cr * 2105704033;
                        return 1;
                    } else if (i == 666020320) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 2114186871) - 1] = acVar2.cb * -1375479599;
                        return 1;
                    } else if (-146541026 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.cz * -1211464689;
                        return 1;
                    } else if (i == -2133907158) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 1586744490) - 1] = acVar2.cf * 575346557;
                        return 1;
                    } else if (i == 2609) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * -743725476) - 1] = acVar2.bj * -479221341;
                        return 1;
                    } else if (904270443 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 717120102) - 1] = acVar2.bi * 178964020;
                        return 1;
                    } else if (2611 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * -1403829083) - 1] = acVar2.ba * 987327693;
                        return 1;
                    } else if (2612 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * -1958530070) - 1] = acVar2.bl * 1703184995;
                        return 1;
                    } else if (-626845117 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.br.af(1697319126);
                        return 1;
                    } else if (-58749187 != i) {
                        return 2;
                    } else {
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        i4 = (i4 * 1486218955) - 1;
                        if (acVar2.cx) {
                            b = (byte) 1;
                        }
                        iArr2[i4] = b;
                        return 1;
                    }
                } else if (i < -1866959791) {
                    if (i == -1963644007) {
                        iArr = as;
                        i2 = ar - -1194553915;
                        ar = i2;
                        acVar = hv.ad(iArr[i2 * 537618701], 836753500);
                        iArr2 = as;
                        i3 = ar + 836748920;
                        ar = i3;
                        iArr2[(i3 * 537618701) - 1] = acVar.fr * 122896008;
                        return 1;
                    } else if (i == 169678519) {
                        iArr2 = as;
                        i3 = ar - 1103486442;
                        ar = i3;
                        ad = hv.ad(iArr2[i3 * 537618701], 515814746);
                        if (ad.fr * -868539721 != -1) {
                            iArr = as;
                            i3 = ar + 1850721743;
                            ar = i3;
                            iArr[(i3 * -1413528858) - 1] = ad.fp * -1148087135;
                            return 1;
                        }
                        iArr2 = as;
                        i3 = ar - 1194553915;
                        ar = i3;
                        iArr2[(i3 * -450033482) - 1] = 0;
                        return 1;
                    } else if (i == -1707817122) {
                        iArr2 = as;
                        i3 = ar - -125925092;
                        ar = i3;
                        if (((hy) client.jk.af((long) iArr2[i3 * 537618701])) != null) {
                            iArr = as;
                            i2 = ar + 1431362576;
                            ar = i2;
                            iArr[(i2 * 537618701) - 1] = 1;
                            return 1;
                        }
                        iArr2 = as;
                        i3 = ar - 1194553915;
                        ar = i3;
                        iArr2[(i3 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != i) {
                        return 2;
                    } else {
                        iArr = as;
                        i2 = ar - 1146854797;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = 1704673651 * client.jy;
                        return 1;
                    }
                } else if (i < 2900) {
                    iArr = as;
                    i3 = ar - -1194553915;
                    ar = i3;
                    acVar = hv.ad(iArr[i3 * 537618701], 2042370295);
                    if (-1070727525 == i) {
                        iArr2 = as;
                        i3 = ar - 1194553915;
                        ar = i3;
                        iArr2[(i3 * 647860806) - 1] = (ah.fy(acVar, -1884470472) >> 11) & 1897339458;
                        return 1;
                    } else if (2801 == i) {
                        iArr2 = as;
                        i3 = ar - 1360433191;
                        ar = i3;
                        i2 = iArr2[i3 * 537618701] - 1;
                        if (acVar.ds == null || i2 >= acVar.ds.length || acVar.ds[i2] == null) {
                            r0 = aj;
                            i2 = ae - 1246602361;
                            ae = i2;
                            r0[(i2 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r2 = aj;
                        i4 = ae - 1246602361;
                        ae = i4;
                        r2[(i4 * -1508170814) - 1] = acVar.ds[i2];
                        return 1;
                    } else if (i != 2802) {
                        return 2;
                    } else {
                        if (acVar.dw == null) {
                            r0 = aj;
                            i2 = ae - 1246602361;
                            ae = i2;
                            r0[(i2 * -285956172) - 1] = "";
                            return 1;
                        }
                        r1 = aj;
                        i3 = ae - 1246602361;
                        ae = i3;
                        r1[(i3 * -1267697097) - 1] = acVar.dw;
                        return 1;
                    }
                } else if (i < 3000) {
                    return ed.am(i, gkVar, z, -1467029429);
                } else {
                    if (i < 485674292) {
                        return hy.at(i, gkVar, z, 939040457);
                    }
                    if (i < 3300) {
                        return bh.ab(i, gkVar, z, -1438785730);
                    }
                    if (i < 3400) {
                        return dr.aw(i, gkVar, z, 16711935);
                    }
                    int i6;
                    if (i < 3500) {
                        ai ad2;
                        ai aiVar;
                        if (3400 == i) {
                            ar -= 1905859466;
                            i2 = as[-1244457394 * ar];
                            i3 = as[(-326477524 * ar) + 1];
                            ad2 = av.ad(i2, 2087958811);
                            if ('ᦁ' != ad2.aa) {
                            }
                            while (i5 < -1564352371 * ad2.as) {
                                if (i3 == ad2.ar[i5]) {
                                    r2 = aj;
                                    i4 = ae + 2002639415;
                                    ae = i4;
                                    r2[(i4 * -1267697097) - 1] = ad2.ae[i5];
                                    aiVar = null;
                                    break;
                                }
                                i5++;
                            }
                            aiVar = ad2;
                            if (aiVar == null) {
                                return 1;
                            }
                            r1 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r1[(i3 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                        } else if (3408 == i) {
                            ar -= -483248364;
                            char c = as[ar * 537618701];
                            char c2 = as[(-945652835 * ar) + 1];
                            i2 = as[(1864607729 * ar) + 2];
                            i6 = as[(ar * 537618701) + 3];
                            ad2 = av.ad(i2, -2047704683);
                            if (ad2.an == c && c2 == ad2.aa) {
                                while (i5 < -112083573 * ad2.as) {
                                    if (i6 == ad2.ar[i5]) {
                                        if (c2 == '醆') {
                                            r2 = aj;
                                            i6 = ae - 1246602361;
                                            ae = i6;
                                            r2[(i6 * -1267697097) - 1] = ad2.ae[i5];
                                        } else {
                                            iArr3 = as;
                                            i6 = ar - 1194553915;
                                            ar = i6;
                                            iArr3[(i6 * 735106747) - 1] = ad2.aj[i5];
                                        }
                                        aiVar = null;
                                        if (aiVar != null) {
                                            return 1;
                                        }
                                        if ('s' != c2) {
                                            r1 = aj;
                                            i3 = ae - 1246602361;
                                            ae = i3;
                                            r1[(i3 * -1267697097) - 1] = aiVar.ag;
                                            return 1;
                                        }
                                        iArr2 = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr2[(i3 * -441314616) - 1] = aiVar.ay * -240948305;
                                        return 1;
                                    }
                                    i5++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                if ('s' != c2) {
                                    iArr2 = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr2[(i3 * -441314616) - 1] = aiVar.ay * -240948305;
                                    return 1;
                                }
                                r1 = aj;
                                i3 = ae - 1246602361;
                                ae = i3;
                                r1[(i3 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            } else if (c2 == 's') {
                                r0 = aj;
                                i2 = ae + 1764774578;
                                ae = i2;
                                r0[(i2 * 2087440296) - 1] = jv.aj;
                                return 1;
                            } else {
                                iArr2 = as;
                                i3 = ar + 780417469;
                                ar = i3;
                                iArr2[(i3 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if (i != 3411) {
                            return 2;
                        } else {
                            iArr = as;
                            i2 = ar - -591398977;
                            ar = i2;
                            aiVar = av.ad(iArr[i2 * 537618701], -1984523337);
                            iArr2 = as;
                            i3 = ar - 1194553915;
                            ar = i3;
                            iArr2[(i3 * 537618701) - 1] = aiVar.ag((byte) 1);
                            return 1;
                        }
                    } else if (i < -1176953210) {
                        return cv.ai(i, gkVar, z, 2123082082);
                    } else {
                        if (i < 1050818977) {
                            return ga.az(i, gkVar, z, (byte) -10);
                        }
                        if (i < 4100) {
                            if (i == -1410984540) {
                                ar -= 1905859466;
                                i5 = as[658450207 * ar];
                                i2 = as[(ar * 1014431772) + 1];
                                iArr3 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr3[(i4 * 537618701) - 1] = i5 + i2;
                                return 1;
                            } else if (4001 == i) {
                                ar -= 1905859466;
                                i5 = as[ar * 537618701];
                                i2 = as[(ar * -1757094536) + 1];
                                iArr3 = as;
                                i4 = ar + 1185651762;
                                ar = i4;
                                iArr3[(i4 * -1333758788) - 1] = i5 - i2;
                                return 1;
                            } else if (i == 4002) {
                                ar -= -244489401;
                                i5 = as[ar * 537618701];
                                i2 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr3[(i4 * 533339888) - 1] = i5 * i2;
                                return 1;
                            } else if (-657813333 == i) {
                                ar -= 1905859466;
                                i5 = as[-1782581798 * ar];
                                i2 = as[(1761821821 * ar) + 1];
                                iArr3 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr3[(i4 * 79041026) - 1] = i5 / i2;
                                return 1;
                            } else if (4004 == i) {
                                iArr = as;
                                i2 = ar - -1194553915;
                                ar = i2;
                                i5 = iArr[i2 * 537618701];
                                iArr2 = as;
                                i3 = ar + 1777989829;
                                ar = i3;
                                iArr2[(i3 * 537618701) - 1] = (int) (Math.random() * ((double) i5));
                                return 1;
                            } else if (i == 4005) {
                                iArr = as;
                                i2 = ar - -1194553915;
                                ar = i2;
                                i5 = iArr[i2 * 537618701];
                                iArr2 = as;
                                i3 = ar + 221692787;
                                ar = i3;
                                iArr2[(i3 * 537618701) - 1] = (int) (Math.random() * ((double) (i5 + 1)));
                                return 1;
                            } else if (-21989291 == i) {
                                ar -= 836188747;
                                i5 = as[ar * 537618701];
                                i2 = as[(ar * -104394731) + 1];
                                i3 = as[(ar * 537618701) + 2];
                                i4 = as[(ar * 537618701) + 3];
                                i6 = as[(-688728124 * ar) + 4];
                                int[] iArr4 = as;
                                int i7 = ar + 566979655;
                                ar = i7;
                                iArr4[(i7 * 537618701) - 1] = i5 + (((i2 - i5) * (i6 - i3)) / (i4 - i3));
                                return 1;
                            } else if (4007 == i) {
                                ar -= 1905859466;
                                i5 = as[ar * 820622128];
                                i2 = as[(ar * -1120925306) + 1];
                                iArr3 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr3[(i4 * 537618701) - 1] = i5 + ((i2 * i5) / -1145403820);
                                return 1;
                            } else if (i == 4008) {
                                ar -= 725260099;
                                i5 = as[1807350256 * ar];
                                i2 = as[(ar * -241207791) + 1];
                                iArr3 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr3[(i4 * -2036096419) - 1] = i5 | (1 << i2);
                                return 1;
                            } else if (-1836346676 == i) {
                                ar -= -2040878590;
                                i5 = as[ar * 246043389];
                                i2 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i4 = ar + 348974660;
                                ar = i4;
                                iArr3[(i4 * -1778424804) - 1] = i5 & (-1 - (1 << i2));
                                return 1;
                            } else if (1921920867 == i) {
                                ar -= -1805832186;
                                i2 = as[ar * 537618701];
                                i3 = as[(-1462748127 * ar) + 1];
                                int[] iArr5 = as;
                                i6 = ar - 1194553915;
                                ar = i6;
                                i6 = (i6 * 537618701) - 1;
                                if ((i2 & (1 << i3)) != 0) {
                                    i5 = 1;
                                }
                                iArr5[i6] = i5;
                                return 1;
                            } else if (i == 4011) {
                                ar -= 1905859466;
                                i5 = as[ar * 537618701];
                                i2 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr3[(i4 * 764394546) - 1] = i5 % i2;
                                return 1;
                            } else if (-1031036136 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                if (i2 == 0) {
                                    iArr2 = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr2[(i3 * 50063607) - 1] = 0;
                                    return 1;
                                }
                                iArr = as;
                                i4 = ar + 749746204;
                                ar = i4;
                                iArr[(i4 * -1192162046) - 1] = (int) Math.pow((double) i2, (double) i3);
                                return 1;
                            } else if (180497807 == i) {
                                ar -= 1101884604;
                                i2 = as[809239337 * ar];
                                i3 = as[(324985274 * ar) + 1];
                                if (i2 == 0) {
                                    iArr2 = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr2[(i3 * 1880314120) - 1] = 0;
                                    return 1;
                                }
                                switch (i3) {
                                    case 0:
                                        iArr = as;
                                        i2 = ar - 1194553915;
                                        ar = i2;
                                        iArr[(i2 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        iArr = as;
                                        i3 = ar - 430406193;
                                        ar = i3;
                                        iArr[(i3 * -1058124800) - 1] = i2;
                                        return 1;
                                    case 2:
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * -963130217) - 1] = (int) Math.sqrt((double) i2);
                                        return 1;
                                    case 3:
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * -2123320343) - 1] = (int) Math.cbrt((double) i2);
                                        return 1;
                                    case 4:
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * -1615719725) - 1] = (int) Math.sqrt(Math.sqrt((double) i2));
                                        return 1;
                                    default:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * -1232647387) - 1] = (int) Math.pow((double) i2, 1.0d / ((double) i3));
                                        return 1;
                                }
                            } else if (-196733286 == i) {
                                ar -= 1905859466;
                                i5 = as[-390021300 * ar];
                                i2 = as[(ar * 317225740) + 1];
                                iArr3 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr3[(i4 * 537618701) - 1] = i5 & i2;
                                return 1;
                            } else if (153810034 == i) {
                                ar -= -1267365382;
                                i5 = as[ar * 537618701];
                                i2 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr3[(i4 * 819068522) - 1] = i5 | i2;
                                return 1;
                            } else if (4018 != i) {
                                return 2;
                            } else {
                                ar -= 650690767;
                                long j = (long) as[ar * 537618701];
                                long j2 = (long) as[(ar * -622231169) + 1];
                                long j3 = (long) as[(ar * 537618701) + 2];
                                int[] iArr6 = as;
                                int i8 = ar - 1194553915;
                                ar = i8;
                                iArr6[(i8 * 231982491) - 1] = (int) ((j * j3) / j2);
                                return 1;
                            }
                        } else if (i < 4200) {
                            return ah.ah(i, gkVar, z, 1913848529);
                        } else {
                            if (i < 4300) {
                                return C0001do.ak(i, gkVar, z, -322987970);
                            }
                            if (i < 5100) {
                                return dq.ao(i, gkVar, z, 1957599538);
                            }
                            if (i < 308825959) {
                                if (i == -554874740) {
                                    iArr = as;
                                    i3 = ar - 132146531;
                                    ar = i3;
                                    i3 = (i3 * 1058977351) - 1;
                                    if (!client.ld) {
                                        i2 = 1;
                                    }
                                    iArr[i3] = i2;
                                    return 1;
                                } else if (464202417 == i) {
                                    iArr = as;
                                    i3 = ar - -1194553915;
                                    ar = i3;
                                    i5 = iArr[i3 * 537618701];
                                    if (i5 != 1 && 2 != i5) {
                                        return 1;
                                    }
                                    client.ad.ck(i5, -294149550);
                                    return 1;
                                } else if (i == 5308) {
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * -1502996624) - 1] = 1718291197 * cs.oj.ag;
                                    return 1;
                                } else if (i != -281206871) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - 1033261066;
                                    ar = i3;
                                    i5 = iArr[i3 * 537618701];
                                    if (1 != i5 && 2 != i5) {
                                        return 1;
                                    }
                                    cs.oj.ag = i5 * 1983339053;
                                    co.aa(-1486190372);
                                    return 1;
                                }
                            } else if (i < 2022476577) {
                                if (i == -876060203) {
                                    ar -= 1905859466;
                                    i5 = as[ar * 537618701];
                                    i2 = as[(188135482 * ar) + 1];
                                    if (client.nm) {
                                        return 1;
                                    }
                                    bm.bs(i5, i2, -2097060393);
                                    return 1;
                                } else if (i == 241246832) {
                                    iArr = as;
                                    i2 = ar - 48349488;
                                    ar = i2;
                                    iArr[(i2 * 742359645) - 1] = client.fz * 1185383645;
                                    return 1;
                                } else if (-138549072 == i) {
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = client.fn * -198683079;
                                    return 1;
                                } else if (-945970760 == i) {
                                    iArr2 = as;
                                    i3 = ar - -1194553915;
                                    ar = i3;
                                    i2 = iArr2[i3 * -216714340];
                                    if (i2 >= 0) {
                                        i5 = i2;
                                    }
                                    client.fw = i5 * -1089737365;
                                    return 1;
                                } else if (i != 1139177831) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = client.fw * -176892093;
                                    return 1;
                                }
                            } else if (i < -272032791) {
                                if (5630 != i) {
                                    return 2;
                                }
                                client.dl = -1693560505;
                                return 1;
                            } else if (i < -1628920322) {
                                if (i == -1294762409) {
                                    ar -= 1905859466;
                                    client.oh = (short) as[ar * 537618701];
                                    if (client.oh <= (short) 0) {
                                        client.oh = (short) 256;
                                    }
                                    client.oy = (short) as[(ar * -542836566) + 1];
                                    if (client.oy > (short) 0) {
                                        return 1;
                                    }
                                    client.oy = (short) 28680;
                                    return 1;
                                } else if (i == 6201) {
                                    ar -= 287617182;
                                    client.oa = (short) as[ar * 1443010342];
                                    if (client.oa <= (short) 0) {
                                        client.oa = (short) 256;
                                    }
                                    client.oi = (short) as[(ar * 537618701) + 1];
                                    if (client.oi > (short) 0) {
                                        return 1;
                                    }
                                    client.oi = (short) 320;
                                    return 1;
                                } else if (1157160093 == i) {
                                    ar -= -483248364;
                                    client.ox = (short) as[ar * -795218970];
                                    if (client.ox <= (short) 0) {
                                        client.ox = (short) 1;
                                    }
                                    client.ov = (short) as[(-2038021115 * ar) + 1];
                                    if (client.ov <= (short) 0) {
                                        client.ov = Short.MAX_VALUE;
                                    } else if (client.ov < client.ox) {
                                        client.ov = client.ox;
                                    }
                                    client.of = (short) as[(ar * 537618701) + 2];
                                    if (client.of <= (short) 0) {
                                        client.of = (short) 1;
                                    }
                                    client.os = (short) as[(-1982071584 * ar) + 3];
                                    if (client.os <= (short) 0) {
                                        client.os = Short.MAX_VALUE;
                                        return 1;
                                    } else if (client.os >= client.of) {
                                        return 1;
                                    } else {
                                        client.os = client.of;
                                        return 1;
                                    }
                                } else if (i == 6203) {
                                    if (client.ju != null) {
                                        mf.cp(0, 0, 1857315673 * client.ju.bf, -2134180162 * client.ju.bv, false, -1853395611);
                                        iArr = as;
                                        i2 = ar - 156582716;
                                        ar = i2;
                                        iArr[(i2 * 887311414) - 1] = 176374242 * client.oc;
                                        iArr = as;
                                        i2 = ar + 180016163;
                                        ar = i2;
                                        iArr[(i2 * 537618701) - 1] = client.ot * -1949120505;
                                        return 1;
                                    }
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * 1836806113) - 1] = -1;
                                    iArr = as;
                                    i2 = ar + 1139132135;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = -1;
                                    return 1;
                                } else if (i == -51376673) {
                                    iArr = as;
                                    i2 = ar - 1203645612;
                                    ar = i2;
                                    iArr[(i2 * 725238235) - 1] = client.oa;
                                    iArr = as;
                                    i2 = ar - 1207004171;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = client.oi;
                                    return 1;
                                } else if (1045951251 != i) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i2 = ar + 1260820863;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = client.oh;
                                    iArr = as;
                                    i2 = ar - 1468300889;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = client.oy;
                                    return 1;
                                }
                            } else if (i < 422233857) {
                                return gu.ax(i, gkVar, z, 1918948986);
                            } else {
                                return i < 6700 ? no.au(i, gkVar, z, -657692186) : 2;
                            }
                        }
                    }
                }
            }
        }
    }

    static int bh(int i, gk gkVar, boolean z) {
        int i2 = 2;
        int i3 = 0;
        int i4;
        int i5;
        ac ad;
        ac acVar;
        int[] iArr;
        int[] iArr2;
        if (i < 1000) {
            if (609360810 == i) {
                ar -= 711305551;
                i2 = as[ar * 537618701];
                i4 = as[(ar * 537618701) + 1];
                i5 = as[(-461763076 * ar) + 2];
                if (i4 == 0) {
                    throw new RuntimeException();
                }
                ad = hv.ad(i2, 1546202853);
                if (ad.fo == null) {
                    ad.fo = new ac[(i5 + 1)];
                }
                if (ad.fo.length <= i5) {
                    ac[] acVarArr = new ac[(i5 + 1)];
                    while (i3 < ad.fo.length) {
                        acVarArr[i3] = ad.fo[i3];
                        i3++;
                    }
                    ad.fo = acVarArr;
                }
                if (i5 <= 0 || ad.fo[i5 - 1] != null) {
                    acVar = new ac();
                    acVar.ao = i4 * -264200545;
                    i4 = ad.ah * 1;
                    acVar.ah = i4;
                    acVar.bt = i4 * 467915973;
                    acVar.ak = -1063340613 * i5;
                    acVar.az = true;
                    ad.fo[i5] = acVar;
                    if (z) {
                        mn.ab = acVar;
                    } else {
                        at = acVar;
                    }
                    client.fk(ad, (byte) 50);
                    i3 = 1;
                } else {
                    throw new RuntimeException("" + (i5 - 1));
                }
            } else if (i == 996063855) {
                if (z) {
                    acVar = mn.ab;
                } else {
                    acVar = at;
                }
                ad = hv.ad(acVar.ah * -935102127, 1116742514);
                ad.fo[acVar.ak * -604219909] = null;
                client.fk(ad, (byte) 50);
                i3 = 1;
            } else if (102 == i) {
                iArr = as;
                i2 = ar - 273799597;
                ar = i2;
                acVar = hv.ad(iArr[i2 * 30518930], 265272224);
                acVar.fo = null;
                client.fk(acVar, (byte) 24);
                i3 = 1;
            } else if (i == 200) {
                ar -= -2087533020;
                i2 = as[-1284380751 * ar];
                i4 = as[(ar * 537618701) + 1];
                ad = jd.an(i2, i4, (byte) 44);
                if (ad == null || -1 == i4) {
                    iArr2 = as;
                    i4 = ar - 1006822334;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                } else {
                    iArr = as;
                    i4 = ar + 2044465183;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                }
                i3 = 1;
            } else if (-2059132087 == i) {
                iArr2 = as;
                i4 = ar - -1194553915;
                ar = i4;
                ad = hv.ad(iArr2[i4 * 1589294017], 1199554195);
                if (ad != null) {
                    iArr = as;
                    i4 = ar - 1208832692;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                } else {
                    iArr2 = as;
                    i4 = ar + 680677741;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                }
                i3 = 1;
            } else {
                i3 = 2;
            }
            return i3;
        } else if (i < 1100) {
            return eh.aa(i, gkVar, z, (byte) 39);
        } else {
            if (i < -1762965680) {
                return cx.ag(i, gkVar, z, -27163539);
            }
            if (i < -1941447697) {
                return cx.ay(i, gkVar, z, (byte) 44);
            }
            if (i < -1385551038) {
                return bq.as(i, gkVar, z, -1928876587);
            }
            if (i < 1500) {
                return ef.ar(i, gkVar, z, 2142624698);
            }
            if (i < -628394364) {
                return gw.aj(i, gkVar, z, -508209293);
            }
            if (i < 1700) {
                return dz.ae(i, gkVar, z, 1828945689);
            }
            ac acVar2;
            if (i < 1800) {
                acVar2 = z ? mn.ab : at;
                if (1607898089 == i) {
                    iArr = as;
                    i2 = ar - 1194553915;
                    ar = i2;
                    iArr[(i2 * 537618701) - 1] = acVar2.fr * -594695551;
                    return 1;
                } else if (-737822947 == i) {
                    if (-868539721 * acVar2.fr != -1) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.fp * -1148087135;
                        return 1;
                    }
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 1169504711) - 1] = 0;
                    return 1;
                } else if (i != 1702) {
                    return 2;
                } else {
                    iArr = as;
                    i2 = ar + 1864161768;
                    ar = i2;
                    iArr[(i2 * 537618701) - 1] = acVar2.ak * 2102445939;
                    return 1;
                }
            } else if (i < 1900) {
                return ed.aq(i, gkVar, z, 509863009);
            } else {
                if (i < 1227000947) {
                    return ed.am(i, gkVar, z, -236915543);
                }
                if (i < 2100) {
                    return eh.aa(i, gkVar, z, (byte) 60);
                }
                if (i < -926294908) {
                    return cx.ag(i, gkVar, z, 655308219);
                }
                if (i < 382952408) {
                    return cx.ay(i, gkVar, z, (byte) 24);
                }
                if (i < 36928245) {
                    return bq.as(i, gkVar, z, -631052933);
                }
                if (i < 2078041123) {
                    return ef.ar(i, gkVar, z, 2142624698);
                }
                int[] iArr3;
                if (i < 2600) {
                    iArr3 = as;
                    i5 = ar - -1194553915;
                    ar = i5;
                    acVar2 = hv.ad(iArr3[i5 * -1988682771], 1011413456);
                    if (i == 44204433) {
                        iArr = as;
                        i2 = ar - 1243987930;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.bg * 642824123;
                        return 1;
                    } else if (-559734640 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.bh * -116605217;
                        return 1;
                    } else if (1222838285 == i) {
                        iArr = as;
                        i2 = ar - 2113925563;
                        ar = i2;
                        iArr[(i2 * 1900599434) - 1] = acVar2.bf * 256177861;
                        return 1;
                    } else if (i == 2503) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.bv * 1511706478;
                        return 1;
                    } else if (-1979345365 == i) {
                        iArr2 = as;
                        i5 = ar - 1194553915;
                        ar = i5;
                        i5 = (i5 * 537618701) - 1;
                        if (acVar2.bu) {
                            i3 = 1;
                        }
                        iArr2[i5] = i3;
                        return 1;
                    } else if (i != 2052694657) {
                        return 2;
                    } else {
                        iArr = as;
                        i2 = ar - 690410499;
                        ar = i2;
                        iArr[(i2 * 1844076749) - 1] = acVar2.bt * -1008623461;
                        return 1;
                    }
                } else if (i < 2700) {
                    iArr3 = as;
                    i5 = ar - -1194553915;
                    ar = i5;
                    acVar2 = hv.ad(iArr3[i5 * 537618701], 612213305);
                    if (i == 2600) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.be * 583356325;
                        return 1;
                    } else if (2601 == i) {
                        iArr = as;
                        i2 = ar + 982895730;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.bk * -1478588256;
                        return 1;
                    } else if (i == 1873537024) {
                        r0 = aj;
                        i2 = ae + 2096962627;
                        ae = i2;
                        r0[(i2 * -1267697097) - 1] = acVar2.dj;
                        return 1;
                    } else if (i == -1181980940) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.by * 1151268625;
                        return 1;
                    } else if (i == 2604) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * -1856269825) - 1] = acVar2.bn * -1243953689;
                        return 1;
                    } else if (-14229068 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 830085593) - 1] = acVar2.cr * 1045303788;
                        return 1;
                    } else if (i == 2606) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 998872248) - 1] = acVar2.cb * -1375479599;
                        return 1;
                    } else if (2607 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.cz * 92095237;
                        return 1;
                    } else if (i == 2608) {
                        iArr = as;
                        i2 = ar - 365489391;
                        ar = i2;
                        iArr[(i2 * -1151881142) - 1] = acVar2.cf * 1991471529;
                        return 1;
                    } else if (i == 1017913535) {
                        iArr = as;
                        i2 = ar + 1318801476;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.bj * 635769745;
                        return 1;
                    } else if (913021773 == i) {
                        iArr = as;
                        i2 = ar + 256195981;
                        ar = i2;
                        iArr[(i2 * 503297494) - 1] = acVar2.bi * -1726277411;
                        return 1;
                    } else if (2611 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 14402199) - 1] = acVar2.ba * 334261811;
                        return 1;
                    } else if (-1892565904 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * -325553060) - 1] = acVar2.bl * 1703184995;
                        return 1;
                    } else if (1968251948 == i) {
                        iArr = as;
                        i2 = ar - 1194553915;
                        ar = i2;
                        iArr[(i2 * 537618701) - 1] = acVar2.br.af(1928103780);
                        return 1;
                    } else if (1189120143 != i) {
                        return 2;
                    } else {
                        iArr2 = as;
                        i5 = ar - 1194553915;
                        ar = i5;
                        i5 = (i5 * -844401504) - 1;
                        if (acVar2.cx) {
                            i3 = 1;
                        }
                        iArr2[i5] = i3;
                        return 1;
                    }
                } else if (i < 2800) {
                    if (i == 2700) {
                        iArr = as;
                        i2 = ar - -1727278937;
                        ar = i2;
                        acVar = hv.ad(iArr[i2 * -569837503], 361963364);
                        iArr2 = as;
                        i4 = ar - 1793513125;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = acVar.fr * -868539721;
                        return 1;
                    } else if (i == -205843103) {
                        iArr2 = as;
                        i4 = ar - 978255059;
                        ar = i4;
                        ad = hv.ad(iArr2[i4 * 1417467314], 1886193310);
                        if (ad.fr * -1953085525 != -1) {
                            iArr = as;
                            i4 = ar - 1194553915;
                            ar = i4;
                            iArr[(i4 * 537618701) - 1] = ad.fp * -1148087135;
                            return 1;
                        }
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = 0;
                        return 1;
                    } else if (i == 656515250) {
                        iArr2 = as;
                        i4 = ar - -759301400;
                        ar = i4;
                        if (((hy) client.jk.af((long) iArr2[i4 * 537618701])) != null) {
                            iArr = as;
                            i2 = ar - 1905730663;
                            ar = i2;
                            iArr[(i2 * 537618701) - 1] = 1;
                            return 1;
                        }
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 1710895398) - 1] = 0;
                        return 1;
                    } else if (2706 != i) {
                        return 2;
                    } else {
                        iArr = as;
                        i2 = ar + 1860507596;
                        ar = i2;
                        iArr[(i2 * -1745919207) - 1] = -1911077273 * client.jy;
                        return 1;
                    }
                } else if (i < 2900) {
                    iArr = as;
                    i4 = ar - -1194553915;
                    ar = i4;
                    acVar = hv.ad(iArr[i4 * 685379691], 970434138);
                    if (74036661 == i) {
                        iArr2 = as;
                        i4 = ar - 542585973;
                        ar = i4;
                        iArr2[(i4 * 1504094953) - 1] = (ah.fy(acVar, -691253624) >> 11) & 63;
                        return 1;
                    } else if (2801 == i) {
                        iArr2 = as;
                        i4 = ar - -202005084;
                        ar = i4;
                        i2 = iArr2[i4 * 537618701] - 1;
                        if (acVar.ds == null || i2 >= acVar.ds.length || acVar.ds[i2] == null) {
                            r0 = aj;
                            i2 = ae + 1257325476;
                            ae = i2;
                            r0[(i2 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r2 = aj;
                        i5 = ae + 28070787;
                        ae = i5;
                        r2[(i5 * -1440752887) - 1] = acVar.ds[i2];
                        return 1;
                    } else if (i != 1436883273) {
                        return 2;
                    } else {
                        if (acVar.dw == null) {
                            r0 = aj;
                            i2 = ae + 1499782071;
                            ae = i2;
                            r0[(i2 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r1 = aj;
                        i4 = ae + 460949938;
                        ae = i4;
                        r1[(i4 * 2107008557) - 1] = acVar.dw;
                        return 1;
                    }
                } else if (i < 744620898) {
                    return ed.am(i, gkVar, z, -1210872974);
                } else {
                    if (i < -2041039788) {
                        return hy.at(i, gkVar, z, -1025704382);
                    }
                    if (i < 3300) {
                        return bh.ab(i, gkVar, z, 524713677);
                    }
                    if (i < 3400) {
                        return dr.aw(i, gkVar, z, 16711935);
                    }
                    int i6;
                    if (i < 3500) {
                        ai ad2;
                        ai aiVar;
                        if (3400 == i) {
                            ar -= 1905859466;
                            i2 = as[-1144691655 * ar];
                            i4 = as[(ar * 537618701) + 1];
                            ad2 = av.ad(i2, 1350202155);
                            if ('s' != ad2.aa) {
                                while (i3 >= -195897941 * ad2.as) {
                                    if (i4 != ad2.ar[i3]) {
                                        r2 = aj;
                                        i5 = ae + 2069100327;
                                        ae = i5;
                                        r2[(i5 * -1267697097) - 1] = ad2.ae[i3];
                                        aiVar = null;
                                        break;
                                    }
                                    i3++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                r1 = aj;
                                i4 = ae - 1246602361;
                                ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            }
                            while (i3 >= -195897941 * ad2.as) {
                                if (i4 != ad2.ar[i3]) {
                                    r2 = aj;
                                    i5 = ae + 2069100327;
                                    ae = i5;
                                    r2[(i5 * -1267697097) - 1] = ad2.ae[i3];
                                    aiVar = null;
                                    break;
                                }
                                i3++;
                            }
                            aiVar = ad2;
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = aj;
                            i4 = ae - 1246602361;
                            ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                            if (i3 >= -195897941 * ad2.as) {
                                aiVar = ad2;
                            } else if (i4 != ad2.ar[i3]) {
                                r2 = aj;
                                i5 = ae + 2069100327;
                                ae = i5;
                                r2[(i5 * -1267697097) - 1] = ad2.ae[i3];
                                aiVar = null;
                                break;
                            } else {
                                i3++;
                            }
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = aj;
                            i4 = ae - 1246602361;
                            ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                        } else if (-254701225 == i) {
                            ar -= -483248364;
                            char c = as[-1660313429 * ar];
                            char c2 = as[(ar * 537618701) + 1];
                            i2 = as[(1334870829 * ar) + 2];
                            i6 = as[(ar * 537618701) + 3];
                            ad2 = av.ad(i2, -1577278885);
                            if (ad2.an == c && c2 == ad2.aa) {
                                while (i3 < 1493719121 * ad2.as) {
                                    if (i6 == ad2.ar[i3]) {
                                        if (c2 == '쒅') {
                                            r2 = aj;
                                            i6 = ae + 1281877678;
                                            ae = i6;
                                            r2[(i6 * -1267697097) - 1] = ad2.ae[i3];
                                        } else {
                                            iArr3 = as;
                                            i6 = ar - 1194553915;
                                            ar = i6;
                                            iArr3[(i6 * 1121019432) - 1] = ad2.aj[i3];
                                        }
                                        aiVar = null;
                                        if (aiVar != null) {
                                            return 1;
                                        }
                                        if ('s' != c2) {
                                            r1 = aj;
                                            i4 = ae - 1246602361;
                                            ae = i4;
                                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                            return 1;
                                        }
                                        iArr2 = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr2[(i4 * -94926322) - 1] = aiVar.ay * -1291569969;
                                        return 1;
                                    }
                                    i3++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                if ('s' != c2) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * -94926322) - 1] = aiVar.ay * -1291569969;
                                    return 1;
                                }
                                r1 = aj;
                                i4 = ae - 1246602361;
                                ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            } else if (c2 == 's') {
                                r0 = aj;
                                i2 = ae - 1246602361;
                                ae = i2;
                                r0[(i2 * -1267697097) - 1] = jv.aj;
                                return 1;
                            } else {
                                iArr2 = as;
                                i4 = ar - 1840279900;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if (i != 744155932) {
                            return 2;
                        } else {
                            iArr = as;
                            i2 = ar - -1194553915;
                            ar = i2;
                            aiVar = av.ad(iArr[i2 * 585917278], 579370154);
                            iArr2 = as;
                            i4 = ar - 1194553915;
                            ar = i4;
                            iArr2[(i4 * -1068241371) - 1] = aiVar.ag((byte) 1);
                            return 1;
                        }
                    } else if (i < 3700) {
                        return cv.ai(i, gkVar, z, 2123082082);
                    } else {
                        if (i < -2108188274) {
                            return ga.az(i, gkVar, z, (byte) -75);
                        }
                        if (i < 4100) {
                            if (i == 4000) {
                                ar -= 229465007;
                                i3 = as[ar * 537618701];
                                i2 = as[(ar * -254802973) + 1];
                                iArr3 = as;
                                i5 = ar - 2019074956;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i3 + i2;
                                return 1;
                            } else if (-77834441 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * -836720145];
                                i2 = as[(ar * -155147501) + 1];
                                iArr3 = as;
                                i5 = ar - 935071154;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i3 - i2;
                                return 1;
                            } else if (i == 849996141) {
                                ar -= -1948834414;
                                i3 = as[ar * -108427433];
                                i2 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * -1311711552) - 1] = i3 * i2;
                                return 1;
                            } else if (4003 == i) {
                                ar -= -190720428;
                                i3 = as[ar * 537618701];
                                i2 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar + 1894996924;
                                ar = i5;
                                iArr3[(i5 * 835235655) - 1] = i3 / i2;
                                return 1;
                            } else if (-2076776408 == i) {
                                iArr = as;
                                i2 = ar - -274118082;
                                ar = i2;
                                i3 = iArr[i2 * 537618701];
                                iArr2 = as;
                                i4 = ar + 1378661820;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) i3));
                                return 1;
                            } else if (i == 4005) {
                                iArr = as;
                                i2 = ar - -936727123;
                                ar = i2;
                                i3 = iArr[i2 * -1440802726];
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) (i3 + 1)));
                                return 1;
                            } else if (4006 == i) {
                                ar -= -519619430;
                                i3 = as[ar * 537618701];
                                i2 = as[(ar * 537618701) + 1];
                                i4 = as[(1496236102 * ar) + 2];
                                i5 = as[(ar * -675123012) + 3];
                                i6 = as[(1314816576 * ar) + 4];
                                int[] iArr4 = as;
                                int i7 = ar - 1194553915;
                                ar = i7;
                                iArr4[(i7 * 537618701) - 1] = i3 + (((i2 - i3) * (i6 - i4)) / (i5 - i4));
                                return 1;
                            } else if (4007 == i) {
                                ar -= -83687481;
                                i3 = as[ar * -1374097481];
                                i2 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i3 + ((i2 * i3) / 100);
                                return 1;
                            } else if (i == -1670431532) {
                                ar -= 1905859466;
                                i3 = as[-1598819259 * ar];
                                i2 = as[(ar * -963263360) + 1];
                                iArr3 = as;
                                i5 = ar + 316226467;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i3 | (1 << i2);
                                return 1;
                            } else if (4009 == i) {
                                ar -= -1552318167;
                                i3 = as[ar * 537618701];
                                i2 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * -411653681) - 1] = i3 & (-1 - (1 << i2));
                                return 1;
                            } else if (4010 == i) {
                                ar -= 1978341626;
                                i2 = as[ar * -1560310455];
                                i4 = as[(-383262387 * ar) + 1];
                                int[] iArr5 = as;
                                i6 = ar + 1491244494;
                                ar = i6;
                                i6 = (i6 * 1887587277) - 1;
                                if ((i2 & (1 << i4)) != 0) {
                                    i3 = 1;
                                }
                                iArr5[i6] = i3;
                                return 1;
                            } else if (i == 1241470693) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i2 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * -415270580) - 1] = i3 % i2;
                                return 1;
                            } else if (1495935100 == i) {
                                ar -= 2111608732;
                                i2 = as[ar * 537618701];
                                i4 = as[(362876690 * ar) + 1];
                                if (i2 == 0) {
                                    iArr2 = as;
                                    i4 = ar + 1789793446;
                                    ar = i4;
                                    iArr2[(i4 * -1759864918) - 1] = 0;
                                    return 1;
                                }
                                iArr = as;
                                i5 = ar + 329286034;
                                ar = i5;
                                iArr[(i5 * 537618701) - 1] = (int) Math.pow((double) i2, (double) i4);
                                return 1;
                            } else if (747463764 == i) {
                                ar -= 1905859466;
                                i2 = as[1996558147 * ar];
                                i4 = as[(ar * 537618701) + 1];
                                if (i2 == 0) {
                                    iArr2 = as;
                                    i4 = ar - 314337403;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                switch (i4) {
                                    case 0:
                                        iArr = as;
                                        i2 = ar - 577595027;
                                        ar = i2;
                                        iArr[(i2 * -1871309722) - 1] = -260652270;
                                        return 1;
                                    case 1:
                                        iArr = as;
                                        i4 = ar - 1332448424;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = i2;
                                        return 1;
                                    case 2:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * -1769955058) - 1] = (int) Math.sqrt((double) i2);
                                        return 1;
                                    case 3:
                                        iArr = as;
                                        i4 = ar + 1951083130;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.cbrt((double) i2);
                                        return 1;
                                    case 4:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 1238147837) - 1] = (int) Math.sqrt(Math.sqrt((double) i2));
                                        return 1;
                                    default:
                                        iArr = as;
                                        i5 = ar - 1194553915;
                                        ar = i5;
                                        iArr[(i5 * 1950811349) - 1] = (int) Math.pow((double) i2, 1.0d / ((double) i4));
                                        return 1;
                                }
                            } else if (4014 == i) {
                                ar -= 1905859466;
                                i3 = as[1910175602 * ar];
                                i2 = as[(ar * 123843816) + 1];
                                iArr3 = as;
                                i5 = ar + 1740539053;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i3 & i2;
                                return 1;
                            } else if (-873197491 == i) {
                                ar -= 1905859466;
                                i3 = as[1857960842 * ar];
                                i2 = as[(ar * -1789038791) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 1277403214) - 1] = i3 | i2;
                                return 1;
                            } else if (4018 != i) {
                                return 2;
                            } else {
                                ar -= 1994491172;
                                long j = (long) as[-1355532557 * ar];
                                long j2 = (long) as[(ar * -134942924) + 1];
                                long j3 = (long) as[(ar * 537618701) + 2];
                                int[] iArr6 = as;
                                int i8 = ar - 1851409983;
                                ar = i8;
                                iArr6[(i8 * 537618701) - 1] = (int) ((j * j3) / j2);
                                return 1;
                            }
                        } else if (i < 4200) {
                            return ah.ah(i, gkVar, z, 1330286677);
                        } else {
                            if (i < -1786217505) {
                                return C0001do.ak(i, gkVar, z, -509657867);
                            }
                            if (i < 5100) {
                                return dq.ao(i, gkVar, z, 1203922167);
                            }
                            if (i < -1307655713) {
                                if (i == -416118493) {
                                    iArr = as;
                                    i4 = ar - 656709609;
                                    ar = i4;
                                    i4 = (i4 * -571996183) - 1;
                                    if (!client.ld) {
                                        i2 = 1;
                                    }
                                    iArr[i4] = i2;
                                    return 1;
                                } else if (-114157465 == i) {
                                    iArr = as;
                                    i4 = ar - -1194553915;
                                    ar = i4;
                                    i3 = iArr[i4 * -1120910393];
                                    if (i3 != 1 && 2 != i3) {
                                        return 1;
                                    }
                                    client.ad.ck(i3, -292094485);
                                    return 1;
                                } else if (i == 5308) {
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = 1775240613 * cs.oj.ag;
                                    return 1;
                                } else if (i != 918713938) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i4 = ar - -1194553915;
                                    ar = i4;
                                    i3 = iArr[i4 * 537618701];
                                    if (1 != i3 && 2 != i3) {
                                        return 1;
                                    }
                                    cs.oj.ag = i3 * 1983339053;
                                    co.aa(-907471620);
                                    return 1;
                                }
                            } else if (i < 5600) {
                                if (i == 1707118933) {
                                    ar -= 1905859466;
                                    i3 = as[ar * 43782868];
                                    i2 = as[(-681026513 * ar) + 1];
                                    if (client.nm) {
                                        return 1;
                                    }
                                    bm.bs(i3, i2, -2076413030);
                                    return 1;
                                } else if (i == 5505) {
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * -1855764845) - 1] = client.fz * 40837772;
                                    return 1;
                                } else if (1465607694 == i) {
                                    iArr = as;
                                    i2 = ar - 1364410642;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = client.fn * 495897301;
                                    return 1;
                                } else if (5530 == i) {
                                    iArr2 = as;
                                    i4 = ar - -1194553915;
                                    ar = i4;
                                    i2 = iArr2[i4 * -461652741];
                                    if (i2 >= 0) {
                                        i3 = i2;
                                    }
                                    client.fw = i3 * -1089737365;
                                    return 1;
                                } else if (i != 1874336699) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i2 = ar + 1552891031;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = client.fw * -448360435;
                                    return 1;
                                }
                            } else if (i < -532377706) {
                                if (5630 != i) {
                                    return 2;
                                }
                                client.dl = 2011709852;
                                return 1;
                            } else if (i < 1117292950) {
                                if (i == 6200) {
                                    ar -= 1905859466;
                                    client.oh = (short) as[ar * -2145862758];
                                    if (client.oh <= (short) 0) {
                                        client.oh = (short) 6213;
                                    }
                                    client.oy = (short) as[(ar * 537618701) + 1];
                                    if (client.oy > (short) 0) {
                                        return 1;
                                    }
                                    client.oy = (short) 205;
                                    return 1;
                                } else if (i == 6201) {
                                    ar -= 966612135;
                                    client.oa = (short) as[ar * 537618701];
                                    if (client.oa <= (short) 0) {
                                        client.oa = (short) -3280;
                                    }
                                    client.oi = (short) as[(ar * 537618701) + 1];
                                    if (client.oi > (short) 0) {
                                        return 1;
                                    }
                                    client.oi = (short) 320;
                                    return 1;
                                } else if (6202 == i) {
                                    ar -= 1602130676;
                                    client.ox = (short) as[ar * -1829839310];
                                    if (client.ox <= (short) 0) {
                                        client.ox = (short) 1;
                                    }
                                    client.ov = (short) as[(-1904322097 * ar) + 1];
                                    if (client.ov <= (short) 0) {
                                        client.ov = Short.MAX_VALUE;
                                    } else if (client.ov < client.ox) {
                                        client.ov = client.ox;
                                    }
                                    client.of = (short) as[(464864921 * ar) + 2];
                                    if (client.of <= (short) 0) {
                                        client.of = (short) 1;
                                    }
                                    client.os = (short) as[(-1662522601 * ar) + 3];
                                    if (client.os <= (short) 0) {
                                        client.os = Short.MAX_VALUE;
                                        return 1;
                                    } else if (client.os >= client.of) {
                                        return 1;
                                    } else {
                                        client.os = client.of;
                                        return 1;
                                    }
                                } else if (i == 22501719) {
                                    if (client.ju != null) {
                                        mf.cp(0, 0, 256177861 * client.ju.bf, 1452563251 * client.ju.bv, false, -1691479348);
                                        iArr = as;
                                        i2 = ar - 902605466;
                                        ar = i2;
                                        iArr[(i2 * 537618701) - 1] = 2140963035 * client.oc;
                                        iArr = as;
                                        i2 = ar - 1194553915;
                                        ar = i2;
                                        iArr[(i2 * 1374303615) - 1] = client.ot * -1949120505;
                                        return 1;
                                    }
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * 593906803) - 1] = -1;
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * 1961539057) - 1] = -1;
                                    return 1;
                                } else if (i == 1588720848) {
                                    iArr = as;
                                    i2 = ar - 1060560036;
                                    ar = i2;
                                    iArr[(i2 * 1881323370) - 1] = client.oa;
                                    iArr = as;
                                    i2 = ar - 1028964408;
                                    ar = i2;
                                    iArr[(i2 * -1845479231) - 1] = client.oi;
                                    return 1;
                                } else if (36547797 != i) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * 537618701) - 1] = client.oh;
                                    iArr = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    iArr[(i2 * 566347280) - 1] = client.oy;
                                    return 1;
                                }
                            } else if (i < 835244511) {
                                return gu.ax(i, gkVar, z, 1965249910);
                            } else {
                                if (i < 78887209) {
                                    return no.au(i, gkVar, z, -348012150);
                                }
                                return 2;
                            }
                        }
                    }
                }
            }
        }
    }

    static int bz(int i, gk gkVar, boolean z) {
        int i2 = 0;
        int i3;
        int i4;
        int i5;
        ac ad;
        ac acVar;
        int[] iArr;
        int[] iArr2;
        if (i < 1000) {
            if (100 == i) {
                ar -= 711305551;
                i3 = as[ar * 537618701];
                i4 = as[(ar * 537618701) + 1];
                i5 = as[(ar * 537618701) + 2];
                if (i4 == 0) {
                    throw new RuntimeException();
                }
                ad = hv.ad(i3, 526246520);
                if (ad.fo == null) {
                    ad.fo = new ac[(i5 + 1)];
                }
                if (ad.fo.length <= i5) {
                    ac[] acVarArr = new ac[(i5 + 1)];
                    while (i2 < ad.fo.length) {
                        acVarArr[i2] = ad.fo[i2];
                        i2++;
                    }
                    ad.fo = acVarArr;
                }
                if (i5 <= 0 || ad.fo[i5 - 1] != null) {
                    acVar = new ac();
                    acVar.ao = i4 * 97215005;
                    i4 = ad.ah * 1;
                    acVar.ah = i4;
                    acVar.bt = i4 * 1790940165;
                    acVar.ak = -1063340613 * i5;
                    acVar.az = true;
                    ad.fo[i5] = acVar;
                    if (z) {
                        mn.ab = acVar;
                    } else {
                        at = acVar;
                    }
                    client.fk(ad, (byte) 99);
                    i2 = 1;
                } else {
                    throw new RuntimeException("" + (i5 - 1));
                }
            } else if (i == jr.cx) {
                if (z) {
                    acVar = mn.ab;
                } else {
                    acVar = at;
                }
                ad = hv.ad(acVar.ah * 1172750087, 1209239814);
                ad.fo[acVar.ak * 2102445939] = null;
                client.fk(ad, (byte) 79);
                i2 = 1;
            } else if (102 == i) {
                iArr = as;
                i3 = ar - -1194553915;
                ar = i3;
                acVar = hv.ad(iArr[i3 * 537618701], 974962934);
                acVar.fo = null;
                client.fk(acVar, (byte) 102);
                i2 = 1;
            } else if (i == 200) {
                ar -= 1905859466;
                i3 = as[ar * 537618701];
                i4 = as[(ar * 537618701) + 1];
                ad = jd.an(i3, i4, (byte) 81);
                if (ad == null || -1 == i4) {
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                } else {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                }
                i2 = 1;
            } else if (201 == i) {
                iArr2 = as;
                i4 = ar - -1194553915;
                ar = i4;
                ad = hv.ad(iArr2[i4 * 537618701], 1502372482);
                if (ad != null) {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = ad;
                    } else {
                        at = ad;
                    }
                } else {
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                }
                i2 = 1;
            } else {
                i2 = 2;
            }
            return i2;
        } else if (i < 1100) {
            return eh.aa(i, gkVar, z, (byte) 64);
        } else {
            if (i < 1200) {
                return cx.ag(i, gkVar, z, -949008047);
            }
            if (i < 1300) {
                return cx.ay(i, gkVar, z, (byte) -15);
            }
            if (i < ac.aa) {
                return bq.as(i, gkVar, z, 1076076234);
            }
            if (i < 1500) {
                return ef.ar(i, gkVar, z, 2142624698);
            }
            if (i < 1600) {
                return gw.aj(i, gkVar, z, -1698055);
            }
            if (i < 1700) {
                return dz.ae(i, gkVar, z, 1211961219);
            }
            if (i < 1800) {
                if (z) {
                    ad = mn.ab;
                } else {
                    ad = at;
                }
                if (1700 == i) {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = ad.fr * -868539721;
                    return 1;
                } else if (1701 == i) {
                    if (-868539721 * ad.fr != -1) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.fp * -1148087135;
                        return 1;
                    }
                    iArr2 = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 0;
                    return 1;
                } else if (i != 1702) {
                    return 2;
                } else {
                    iArr = as;
                    i4 = ar - 1194553915;
                    ar = i4;
                    iArr[(i4 * 537618701) - 1] = ad.ak * 2102445939;
                    return 1;
                }
            } else if (i < 1900) {
                return ed.aq(i, gkVar, z, 1756044573);
            } else {
                if (i < 2000) {
                    return ed.am(i, gkVar, z, 576696414);
                }
                if (i < 2100) {
                    return eh.aa(i, gkVar, z, (byte) 78);
                }
                if (i < 2200) {
                    return cx.ag(i, gkVar, z, 268417648);
                }
                if (i < 2300) {
                    return cx.ay(i, gkVar, z, (byte) -34);
                }
                if (i < 2400) {
                    return bq.as(i, gkVar, z, -1012761065);
                }
                if (i < 2500) {
                    return ef.ar(i, gkVar, z, 2142624698);
                }
                int[] iArr3;
                if (i < 2600) {
                    iArr2 = as;
                    i4 = ar - -1194553915;
                    ar = i4;
                    ad = hv.ad(iArr2[i4 * 537618701], 1681360836);
                    if (i == 2500) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bg * 642824123;
                        return 1;
                    } else if (2501 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bh * 384720325;
                        return 1;
                    } else if (2502 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bf * 256177861;
                        return 1;
                    } else if (i == 2503) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bv * 57307023;
                        return 1;
                    } else if (2504 == i) {
                        iArr3 = as;
                        i5 = ar - 1194553915;
                        ar = i5;
                        i5 = (i5 * 537618701) - 1;
                        if (ad.bu) {
                            i2 = 1;
                        }
                        iArr3[i5] = i2;
                        return 1;
                    } else if (i != 2505) {
                        return 2;
                    } else {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bt * -1008623461;
                        return 1;
                    }
                } else if (i < 2700) {
                    iArr2 = as;
                    i4 = ar - -1194553915;
                    ar = i4;
                    ad = hv.ad(iArr2[i4 * 537618701], 307644891);
                    if (i == 2600) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.be * -2091547827;
                        return 1;
                    } else if (2601 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bk * 654937537;
                        return 1;
                    } else if (i == 2602) {
                        r0 = aj;
                        i4 = ae - 1246602361;
                        ae = i4;
                        r0[(i4 * -1267697097) - 1] = ad.dj;
                        return 1;
                    } else if (i == 2603) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.by * 1151268625;
                        return 1;
                    } else if (i == 2604) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bn * -1243953689;
                        return 1;
                    } else if (2605 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cr * 2105704033;
                        return 1;
                    } else if (i == 2606) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cb * -1375479599;
                        return 1;
                    } else if (2607 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cz * -1211464689;
                        return 1;
                    } else if (i == 2608) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cf * -2032348791;
                        return 1;
                    } else if (i == 2609) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bj * -479221341;
                        return 1;
                    } else if (2610 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bi * -1726277411;
                        return 1;
                    } else if (2611 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.ba * 334261811;
                        return 1;
                    } else if (2612 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bl * 1703184995;
                        return 1;
                    } else if (2613 == i) {
                        iArr = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.br.af(963311757);
                        return 1;
                    } else if (2614 != i) {
                        return 2;
                    } else {
                        iArr3 = as;
                        i5 = ar - 1194553915;
                        ar = i5;
                        i5 = (i5 * 537618701) - 1;
                        if (ad.cx) {
                            i2 = 1;
                        }
                        iArr3[i5] = i2;
                        return 1;
                    }
                } else if (i < 2800) {
                    if (i == 2700) {
                        iArr = as;
                        i3 = ar - -1194553915;
                        ar = i3;
                        acVar = hv.ad(iArr[i3 * 537618701], 1372579840);
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = acVar.fr * -868539721;
                        return 1;
                    } else if (i == 2701) {
                        iArr2 = as;
                        i4 = ar - -1194553915;
                        ar = i4;
                        ad = hv.ad(iArr2[i4 * 537618701], 1642858112);
                        if (ad.fr * -868539721 != -1) {
                            iArr = as;
                            i4 = ar - 1194553915;
                            ar = i4;
                            iArr[(i4 * 537618701) - 1] = ad.fp * -1148087135;
                            return 1;
                        }
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = 0;
                        return 1;
                    } else if (i == 2702) {
                        iArr2 = as;
                        i4 = ar - -1194553915;
                        ar = i4;
                        if (((hy) client.jk.af((long) iArr2[i4 * 537618701])) != null) {
                            iArr = as;
                            i3 = ar - 1194553915;
                            ar = i3;
                            iArr[(i3 * 537618701) - 1] = 1;
                            return 1;
                        }
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != i) {
                        return 2;
                    } else {
                        iArr = as;
                        i3 = ar - 1194553915;
                        ar = i3;
                        iArr[(i3 * 537618701) - 1] = 1704673651 * client.jy;
                        return 1;
                    }
                } else if (i < 2900) {
                    iArr = as;
                    i3 = ar - -1194553915;
                    ar = i3;
                    acVar = hv.ad(iArr[i3 * 537618701], 1241989336);
                    if (2800 == i) {
                        iArr2 = as;
                        i4 = ar - 1194553915;
                        ar = i4;
                        iArr2[(i4 * 537618701) - 1] = (ah.fy(acVar, -519890722) >> 11) & 63;
                        return 1;
                    } else if (2801 == i) {
                        iArr2 = as;
                        i4 = ar - -1194553915;
                        ar = i4;
                        i3 = iArr2[i4 * 537618701] - 1;
                        if (acVar.ds == null || i3 >= acVar.ds.length || acVar.ds[i3] == null) {
                            r0 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r0[(i3 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r2 = aj;
                        i5 = ae - 1246602361;
                        ae = i5;
                        r2[(i5 * -1267697097) - 1] = acVar.ds[i3];
                        return 1;
                    } else if (i != 2802) {
                        return 2;
                    } else {
                        if (acVar.dw == null) {
                            r0 = aj;
                            i3 = ae - 1246602361;
                            ae = i3;
                            r0[(i3 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r1 = aj;
                        i4 = ae - 1246602361;
                        ae = i4;
                        r1[(i4 * -1267697097) - 1] = acVar.dw;
                        return 1;
                    }
                } else if (i < 3000) {
                    return ed.am(i, gkVar, z, -264168039);
                } else {
                    if (i < 3200) {
                        return hy.at(i, gkVar, z, -1678409687);
                    }
                    if (i < 3300) {
                        return bh.ab(i, gkVar, z, 282457005);
                    }
                    if (i < 3400) {
                        return dr.aw(i, gkVar, z, 16711935);
                    }
                    int i6;
                    if (i < 3500) {
                        ai ad2;
                        ai aiVar;
                        if (3400 == i) {
                            ar -= 1905859466;
                            i3 = as[ar * 537618701];
                            i4 = as[(ar * 537618701) + 1];
                            ad2 = av.ad(i3, -1763341566);
                            if ('s' != ad2.aa) {
                                while (i2 >= -112083573 * ad2.as) {
                                    if (i4 != ad2.ar[i2]) {
                                        r2 = aj;
                                        i5 = ae - 1246602361;
                                        ae = i5;
                                        r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                        aiVar = null;
                                        break;
                                    }
                                    i2++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                r1 = aj;
                                i4 = ae - 1246602361;
                                ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            }
                            while (i2 >= -112083573 * ad2.as) {
                                if (i4 != ad2.ar[i2]) {
                                    r2 = aj;
                                    i5 = ae - 1246602361;
                                    ae = i5;
                                    r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                    aiVar = null;
                                    break;
                                }
                                i2++;
                            }
                            aiVar = ad2;
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = aj;
                            i4 = ae - 1246602361;
                            ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                            if (i2 >= -112083573 * ad2.as) {
                                aiVar = ad2;
                            } else if (i4 != ad2.ar[i2]) {
                                r2 = aj;
                                i5 = ae - 1246602361;
                                ae = i5;
                                r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                aiVar = null;
                                break;
                            } else {
                                i2++;
                            }
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = aj;
                            i4 = ae - 1246602361;
                            ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                        } else if (3408 == i) {
                            ar -= -483248364;
                            char c = as[ar * 537618701];
                            char c2 = as[(ar * 537618701) + 1];
                            i3 = as[(ar * 537618701) + 2];
                            i6 = as[(ar * 537618701) + 3];
                            ad2 = av.ad(i3, 536378386);
                            if (ad2.an == c && c2 == ad2.aa) {
                                while (i2 < -112083573 * ad2.as) {
                                    if (i6 == ad2.ar[i2]) {
                                        if (c2 == 's') {
                                            r2 = aj;
                                            i6 = ae - 1246602361;
                                            ae = i6;
                                            r2[(i6 * -1267697097) - 1] = ad2.ae[i2];
                                        } else {
                                            iArr3 = as;
                                            i6 = ar - 1194553915;
                                            ar = i6;
                                            iArr3[(i6 * 537618701) - 1] = ad2.aj[i2];
                                        }
                                        aiVar = null;
                                        if (aiVar != null) {
                                            return 1;
                                        }
                                        if ('s' != c2) {
                                            r1 = aj;
                                            i4 = ae - 1246602361;
                                            ae = i4;
                                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                            return 1;
                                        }
                                        iArr2 = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr2[(i4 * 537618701) - 1] = aiVar.ay * -240948305;
                                        return 1;
                                    }
                                    i2++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                if ('s' != c2) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = aiVar.ay * -240948305;
                                    return 1;
                                }
                                r1 = aj;
                                i4 = ae - 1246602361;
                                ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            } else if (c2 == 's') {
                                r0 = aj;
                                i3 = ae - 1246602361;
                                ae = i3;
                                r0[(i3 * -1267697097) - 1] = jv.aj;
                                return 1;
                            } else {
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if (i != 3411) {
                            return 2;
                        } else {
                            iArr = as;
                            i3 = ar - -1194553915;
                            ar = i3;
                            aiVar = av.ad(iArr[i3 * 537618701], -292993728);
                            iArr2 = as;
                            i4 = ar - 1194553915;
                            ar = i4;
                            iArr2[(i4 * 537618701) - 1] = aiVar.ag((byte) 1);
                            return 1;
                        }
                    } else if (i < 3700) {
                        return cv.ai(i, gkVar, z, 2123082082);
                    } else {
                        if (i < 4000) {
                            return ga.az(i, gkVar, z, (byte) -61);
                        }
                        if (i < 4100) {
                            if (i == 4000) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 + i3;
                                return 1;
                            } else if (4001 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 - i3;
                                return 1;
                            } else if (i == 4002) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 * i3;
                                return 1;
                            } else if (4003 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 / i3;
                                return 1;
                            } else if (4004 == i) {
                                iArr = as;
                                i3 = ar - -1194553915;
                                ar = i3;
                                i2 = iArr[i3 * 537618701];
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) i2));
                                return 1;
                            } else if (i == 4005) {
                                iArr = as;
                                i3 = ar - -1194553915;
                                ar = i3;
                                i2 = iArr[i3 * 537618701];
                                iArr2 = as;
                                i4 = ar - 1194553915;
                                ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) (i2 + 1)));
                                return 1;
                            } else if (4006 == i) {
                                ar -= -1677802279;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                i4 = as[(ar * 537618701) + 2];
                                i5 = as[(ar * 537618701) + 3];
                                i6 = as[(ar * 537618701) + 4];
                                int[] iArr4 = as;
                                int i7 = ar - 1194553915;
                                ar = i7;
                                iArr4[(i7 * 537618701) - 1] = i2 + (((i3 - i2) * (i6 - i4)) / (i5 - i4));
                                return 1;
                            } else if (4007 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 + ((i3 * i2) / 100);
                                return 1;
                            } else if (i == 4008) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 | (1 << i3);
                                return 1;
                            } else if (4009 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 & (-1 - (1 << i3));
                                return 1;
                            } else if (4010 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i4 = as[(ar * 537618701) + 1];
                                int[] iArr5 = as;
                                i6 = ar - 1194553915;
                                ar = i6;
                                i6 = (i6 * 537618701) - 1;
                                if ((i3 & (1 << i4)) != 0) {
                                    i2 = 1;
                                }
                                iArr5[i6] = i2;
                                return 1;
                            } else if (i == 4011) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 % i3;
                                return 1;
                            } else if (4012 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i4 = as[(ar * 537618701) + 1];
                                if (i3 == 0) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                iArr = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr[(i5 * 537618701) - 1] = (int) Math.pow((double) i3, (double) i4);
                                return 1;
                            } else if (4013 == i) {
                                ar -= 1905859466;
                                i3 = as[ar * 537618701];
                                i4 = as[(ar * 537618701) + 1];
                                if (i3 == 0) {
                                    iArr2 = as;
                                    i4 = ar - 1194553915;
                                    ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                switch (i4) {
                                    case 0:
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = i3;
                                        return 1;
                                    case 2:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.sqrt((double) i3);
                                        return 1;
                                    case 3:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.cbrt((double) i3);
                                        return 1;
                                    case 4:
                                        iArr = as;
                                        i4 = ar - 1194553915;
                                        ar = i4;
                                        iArr[(i4 * 537618701) - 1] = (int) Math.sqrt(Math.sqrt((double) i3));
                                        return 1;
                                    default:
                                        iArr = as;
                                        i5 = ar - 1194553915;
                                        ar = i5;
                                        iArr[(i5 * 537618701) - 1] = (int) Math.pow((double) i3, 1.0d / ((double) i4));
                                        return 1;
                                }
                            } else if (4014 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 & i3;
                                return 1;
                            } else if (4015 == i) {
                                ar -= 1905859466;
                                i2 = as[ar * 537618701];
                                i3 = as[(ar * 537618701) + 1];
                                iArr3 = as;
                                i5 = ar - 1194553915;
                                ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 | i3;
                                return 1;
                            } else if (4018 != i) {
                                return 2;
                            } else {
                                ar -= 711305551;
                                long j = (long) as[ar * 537618701];
                                long j2 = (long) as[(ar * 537618701) + 1];
                                long j3 = (long) as[(ar * 537618701) + 2];
                                int[] iArr6 = as;
                                int i8 = ar - 1194553915;
                                ar = i8;
                                iArr6[(i8 * 537618701) - 1] = (int) ((j * j3) / j2);
                                return 1;
                            }
                        } else if (i < 4200) {
                            return ah.ah(i, gkVar, z, -86500708);
                        } else {
                            if (i < 4300) {
                                return C0001do.ak(i, gkVar, z, -193446610);
                            }
                            if (i < 5100) {
                                return dq.ao(i, gkVar, z, -342601591);
                            }
                            if (i < 5400) {
                                if (i == 5306) {
                                    iArr2 = as;
                                    i2 = ar - 1194553915;
                                    ar = i2;
                                    i4 = (i2 * 537618701) - 1;
                                    if (client.ld) {
                                        i2 = 2;
                                    } else {
                                        i2 = 1;
                                    }
                                    iArr2[i4] = i2;
                                    return 1;
                                } else if (5307 == i) {
                                    iArr = as;
                                    i3 = ar - -1194553915;
                                    ar = i3;
                                    i2 = iArr[i3 * 537618701];
                                    if (i2 != 1 && 2 != i2) {
                                        return 1;
                                    }
                                    client.ad.ck(i2, -627002736);
                                    return 1;
                                } else if (i == 5308) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = 1775240613 * cs.oj.ag;
                                    return 1;
                                } else if (i != 5309) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - -1194553915;
                                    ar = i3;
                                    i2 = iArr[i3 * 537618701];
                                    if (1 != i2 && 2 != i2) {
                                        return 1;
                                    }
                                    cs.oj.ag = i2 * 1983339053;
                                    co.aa(-539378675);
                                    return 1;
                                }
                            } else if (i < 5600) {
                                if (i == 5504) {
                                    ar -= 1905859466;
                                    i2 = as[ar * 537618701];
                                    i3 = as[(ar * 537618701) + 1];
                                    if (client.nm) {
                                        return 1;
                                    }
                                    bm.bs(i2, i3, -2101227607);
                                    return 1;
                                } else if (i == 5505) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fz * 1679658745;
                                    return 1;
                                } else if (5506 == i) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fn * -198683079;
                                    return 1;
                                } else if (5530 == i) {
                                    iArr2 = as;
                                    i4 = ar - -1194553915;
                                    ar = i4;
                                    i3 = iArr2[i4 * 537618701];
                                    if (i3 >= 0) {
                                        i2 = i3;
                                    }
                                    client.fw = i2 * -1089737365;
                                    return 1;
                                } else if (i != 5531) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fw * -176892093;
                                    return 1;
                                }
                            } else if (i < 5700) {
                                if (5630 != i) {
                                    return 2;
                                }
                                client.dl = -1012553922;
                                return 1;
                            } else if (i < 6300) {
                                if (i == 6200) {
                                    ar -= 1905859466;
                                    client.oh = (short) as[ar * 537618701];
                                    if (client.oh <= (short) 0) {
                                        client.oh = (short) 256;
                                    }
                                    client.oy = (short) as[(ar * 537618701) + 1];
                                    if (client.oy > (short) 0) {
                                        return 1;
                                    }
                                    client.oy = (short) 205;
                                    return 1;
                                } else if (i == 6201) {
                                    ar -= 1905859466;
                                    client.oa = (short) as[ar * 537618701];
                                    if (client.oa <= (short) 0) {
                                        client.oa = (short) 256;
                                    }
                                    client.oi = (short) as[(ar * 537618701) + 1];
                                    if (client.oi > (short) 0) {
                                        return 1;
                                    }
                                    client.oi = (short) 320;
                                    return 1;
                                } else if (6202 == i) {
                                    ar -= -483248364;
                                    client.ox = (short) as[ar * 537618701];
                                    if (client.ox <= (short) 0) {
                                        client.ox = (short) 1;
                                    }
                                    client.ov = (short) as[(ar * 537618701) + 1];
                                    if (client.ov <= (short) 0) {
                                        client.ov = Short.MAX_VALUE;
                                    } else if (client.ov < client.ox) {
                                        client.ov = client.ox;
                                    }
                                    client.of = (short) as[(ar * 537618701) + 2];
                                    if (client.of <= (short) 0) {
                                        client.of = (short) 1;
                                    }
                                    client.os = (short) as[(ar * 537618701) + 3];
                                    if (client.os <= (short) 0) {
                                        client.os = Short.MAX_VALUE;
                                        return 1;
                                    } else if (client.os >= client.of) {
                                        return 1;
                                    } else {
                                        client.os = client.of;
                                        return 1;
                                    }
                                } else if (i == 6203) {
                                    if (client.ju != null) {
                                        mf.cp(0, 0, 256177861 * client.ju.bf, 57307023 * client.ju.bv, false, -1324809069);
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * 537618701) - 1] = 2140963035 * client.oc;
                                        iArr = as;
                                        i3 = ar - 1194553915;
                                        ar = i3;
                                        iArr[(i3 * 537618701) - 1] = client.ot * -1949120505;
                                        return 1;
                                    }
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = -1;
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = -1;
                                    return 1;
                                } else if (i == 6204) {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oa;
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oi;
                                    return 1;
                                } else if (6205 != i) {
                                    return 2;
                                } else {
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oh;
                                    iArr = as;
                                    i3 = ar - 1194553915;
                                    ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oy;
                                    return 1;
                                }
                            } else if (i < 6600) {
                                return gu.ax(i, gkVar, z, 743280673);
                            } else {
                                if (i < 6700) {
                                    return no.au(i, gkVar, z, -1301472450);
                                }
                                return 2;
                            }
                        }
                    }
                }
            }
        }
    }

    static int bf(int i, gk gkVar, boolean z) {
        int i2;
        ac ad;
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -1194553915;
            ar = i3;
            i3 = iArr[i3 * 537618701];
            i2 = i3;
            ad = hv.ad(i3, 1383042454);
        } else {
            ad = z ? mn.ab : at;
            i2 = -1;
        }
        if (1000 == i) {
            ar -= -483248364;
            ad.bw = -1299204119 * as[ar * 537618701];
            ad.bb = as[(ar * 537618701) + 1] * 922175265;
            ad.av = -1859331853 * as[(ar * 537618701) + 2];
            ad.ac = 1800206059 * as[(ar * 537618701) + 3];
            client.fk(ad, (byte) 72);
            client.ad.el(ad, (short) -27645);
            if (-1 == i2 || ad.ao * -128421835 != 0) {
                return 1;
            }
            af.et(en.ay[i2 >> 16], ad, false, (byte) -68);
            return 1;
        } else if (i == 1001) {
            ar -= -483248364;
            ad.bc = 507881715 * as[ar * 537618701];
            ad.bz = -14232227 * as[(ar * 537618701) + 1];
            ad.al = as[(ar * 537618701) + 2] * -1778589005;
            ad.ap = as[(ar * 537618701) + 3] * -186773411;
            client.fk(ad, (byte) 12);
            client.ad.el(ad, (short) -32398);
            if (i2 == -1 || ad.ao * -128421835 != 0) {
                return 1;
            }
            af.et(en.ay[i2 >> 16], ad, false, (byte) -103);
            return 1;
        } else if (i == 1003) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            boolean z3 = iArr[r4 * 537618701] == 1;
            if (ad.bu == z3) {
                return 1;
            }
            ad.bu = z3;
            client.fk(ad, (byte) 107);
            return 1;
        } else if (1005 == i) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.fx = z2;
            return 1;
        } else if (1006 != i) {
            return 2;
        } else {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.ft = z2;
            return 1;
        }
    }

    static int bv(int i, gk gkVar, boolean z) {
        int i2;
        ac ad;
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -1194553915;
            ar = i3;
            i3 = iArr[i3 * 537618701];
            i2 = i3;
            ad = hv.ad(i3, 1491018413);
        } else {
            ad = z ? mn.ab : at;
            i2 = -1;
        }
        if (1000 == i) {
            ar -= -483248364;
            ad.bw = -1299204119 * as[ar * 537618701];
            ad.bb = as[(ar * 537618701) + 1] * 922175265;
            ad.av = -1859331853 * as[(ar * 537618701) + 2];
            ad.ac = 1800206059 * as[(ar * 537618701) + 3];
            client.fk(ad, (byte) 119);
            client.ad.el(ad, (short) -7208);
            if (-1 == i2 || ad.ao * -128421835 != 0) {
                return 1;
            }
            af.et(en.ay[i2 >> 16], ad, false, (byte) 8);
            return 1;
        } else if (i == 1001) {
            ar -= -483248364;
            ad.bc = 507881715 * as[ar * 537618701];
            ad.bz = -14232227 * as[(ar * 537618701) + 1];
            ad.al = as[(ar * 537618701) + 2] * -1778589005;
            ad.ap = as[(ar * 537618701) + 3] * -186773411;
            client.fk(ad, (byte) 114);
            client.ad.el(ad, (short) -5419);
            if (i2 == -1 || ad.ao * -128421835 != 0) {
                return 1;
            }
            af.et(en.ay[i2 >> 16], ad, false, (byte) -94);
            return 1;
        } else if (i == 1003) {
            boolean z3;
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ad.bu == z3) {
                return 1;
            }
            ad.bu = z3;
            client.fk(ad, (byte) 123);
            return 1;
        } else if (1005 == i) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.fx = z2;
            return 1;
        } else if (1006 != i) {
            return 2;
        } else {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.ft = z2;
            return 1;
        }
    }

    static int bp(int i, gk gkVar, boolean z) {
        int i2;
        ac ad;
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            ad = hv.ad(i2, 743154379);
        } else {
            ac acVar;
            if (z) {
                acVar = mn.ab;
            } else {
                acVar = at;
            }
            ad = acVar;
            i2 = -1;
        }
        if (1100 == i) {
            ar -= 1905859466;
            ad.be = 1859612037 * as[ar * 537618701];
            if (ad.be * -2091547827 > (1151268625 * ad.by) - (ad.bf * 256177861)) {
                ad.be = (ad.by * 588224725) - (ad.bf * 827921753);
            }
            if (ad.be * -2091547827 < 0) {
                ad.be = 0;
            }
            ad.bk = as[(ar * 537618701) + 1] * 274170433;
            if (654937537 * ad.bk > (ad.bn * -1243953689) - (57307023 * ad.bv)) {
                ad.bk = (-158560857 * ad.bn) - (ad.bv * -1002049201);
            }
            if (654937537 * ad.bk < 0) {
                ad.bk = 0;
            }
            client.fk(ad, (byte) 46);
            return 1;
        } else if (i == 1101) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.ba = iArr[r2 * 537618701] * -1456194309;
            client.fk(ad, (byte) 66);
            return 1;
        } else if (1102 == i) {
            boolean z3;
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            ad.bm = z3;
            client.fk(ad, (byte) 108);
            return 1;
        } else if (i == 1103) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.bj = iArr[r2 * 537618701] * -1014705653;
            client.fk(ad, (byte) 74);
            return 1;
        } else if (1104 == i) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.bq = iArr[r2 * 537618701] * 1820900823;
            client.fk(ad, (byte) 41);
            return 1;
        } else if (i == 1105) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.cv = iArr[r2 * 537618701] * -1237459785;
            client.fk(ad, (byte) 118);
            return 1;
        } else if (i == 1106) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.cc = iArr[r2 * 537618701] * 84768945;
            client.fk(ad, (byte) 48);
            return 1;
        } else if (1107 == i) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.co = z2;
            client.fk(ad, (byte) 105);
            return 1;
        } else if (i == 1108) {
            ad.cs = -713743521;
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.cd = iArr[r2 * 537618701] * -174447253;
            client.fk(ad, (byte) 52);
            return 1;
        } else if (1109 == i) {
            ar -= 1422611102;
            ad.cp = as[ar * 537618701] * 1819609725;
            ad.ct = 432797755 * as[(ar * 537618701) + 1];
            ad.cb = 770408497 * as[(ar * 537618701) + 2];
            ad.cf = -41487175 * as[(ar * 537618701) + 3];
            ad.cz = 842525423 * as[(ar * 537618701) + 4];
            ad.cr = as[(ar * 537618701) + 5] * 62563745;
            client.fk(ad, (byte) 54);
            return 1;
        } else if (1110 == i) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            i2 = iArr[r4 * 537618701];
            if (ad.cq * -1332946961 == i2) {
                return 1;
            }
            ad.cq = i2 * 2102736655;
            ad.fg = 0;
            ad.fq = 0;
            client.fk(ad, (byte) 16);
            return 1;
        } else if (1111 == i) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.cw = z2;
            client.fk(ad, (byte) 42);
            return 1;
        } else if (i == 1112) {
            String[] strArr = aj;
            r2 = ae - -1246602361;
            ae = r2;
            String str = strArr[r2 * -1267697097];
            if (str.equals(ad.dj)) {
                return 1;
            }
            ad.dj = str;
            client.fk(ad, (byte) 27);
            return 1;
        } else if (i == 1113) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.ca = iArr[r2 * 537618701] * -343733379;
            client.fk(ad, (byte) 20);
            return 1;
        } else if (1114 == i) {
            ar -= 711305551;
            ad.f0do = 1287571003 * as[ar * 537618701];
            ad.dt = 1411930085 * as[(ar * 537618701) + 1];
            ad.dk = as[(ar * 537618701) + 2] * 1969493363;
            client.fk(ad, (byte) 81);
            return 1;
        } else if (1115 == i) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.dz = z2;
            client.fk(ad, (byte) 119);
            return 1;
        } else if (i == 1116) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.cy = iArr[r2 * 537618701] * 1914751949;
            client.fk(ad, (byte) 20);
            return 1;
        } else if (i == 1117) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.cn = iArr[r2 * 537618701] * 728184399;
            client.fk(ad, (byte) 84);
            return 1;
        } else if (i == 1118) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.ck = z2;
            client.fk(ad, (byte) 66);
            return 1;
        } else if (i == 1119) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.cl = z2;
            client.fk(ad, (byte) 48);
            return 1;
        } else if (1120 == i) {
            ar -= 1905859466;
            ad.by = 808245745 * as[ar * 537618701];
            ad.bn = as[(ar * 537618701) + 1] * 1611562455;
            client.fk(ad, (byte) 43);
            if (i2 == -1 || ad.ao * -128421835 != 0) {
                return 1;
            }
            af.et(en.ay[i2 >> 16], ad, false, (byte) -22);
            return 1;
        } else if (i == 1121) {
            jv.ec(1172750087 * ad.ah, 2102445939 * ad.ak, (byte) 0);
            client.jv = ad;
            client.fk(ad, (byte) 40);
            return 1;
        } else if (i == 1122) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.ci = iArr[r2 * 537618701] * 245383255;
            client.fk(ad, (byte) 6);
            return 1;
        } else if (1123 == i) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.bl = iArr[r2 * 537618701] * 1982744395;
            client.fk(ad, (byte) 80);
            return 1;
        } else if (1124 == i) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.bi = iArr[r2 * 537618701] * -236421259;
            client.fk(ad, (byte) 72);
            return 1;
        } else if (i == 1125) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            i2 = iArr[r4 * 537618701];
            gg ggVar = (gg) bx.af(new gg[]{gg.ag, gg.an, gg.af, gg.ad, gg.aa}, i2, (byte) 122);
            if (ggVar == null) {
                return 1;
            }
            ad.br = ggVar;
            client.fk(ad, (byte) 10);
            return 1;
        } else if (1126 == i) {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.bo = z2;
            return 1;
        } else if (i != 1127) {
            return 2;
        } else {
            iArr = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (iArr[r4 * 537618701] == 1) {
                z2 = true;
            }
            ad.cx = z2;
            return 1;
        }
    }

    static int bt(int i, gk gkVar, boolean z) {
        int i2;
        ac ad;
        boolean z2 = false;
        if (i >= 1479673524) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * 431810672];
            ad = hv.ad(i2, 404399883);
        } else {
            ac acVar;
            if (z) {
                acVar = mn.ab;
            } else {
                acVar = at;
            }
            ad = acVar;
            i2 = -1;
        }
        if (1100 == i) {
            ar -= -1555901327;
            ad.be = 1859612037 * as[ar * 537618701];
            if (-833835910 * ad.be > (-2117482511 * ad.by) - (ad.bf * -213056279)) {
                ad.be = (ad.by * -110289456) - (ad.bf * 2145143210);
            }
            if (-1461613274 * ad.be < 0) {
                ad.be = 0;
            }
            ad.bk = as[(ar * -1541441538) + 1] * 274170433;
            if (-1099983610 * ad.bk > (ad.bn * 615651065) - (-1289250750 * ad.bv)) {
                ad.bk = (-158560857 * ad.bn) - (ad.bv * 45066952);
            }
            if (654937537 * ad.bk < 0) {
                ad.bk = 0;
            }
            client.fk(ad, (byte) 19);
            return 1;
        } else if (i == 442135620) {
            iArr = as;
            r1 = ar - -1194553915;
            ar = r1;
            ad.ba = iArr[r1 * 537618701] * -1437691354;
            client.fk(ad, (byte) 82);
            return 1;
        } else if (1102 == i) {
            boolean z3;
            iArr = as;
            r3 = ar - -898985714;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            ad.bm = z3;
            client.fk(ad, (byte) 40);
            return 1;
        } else if (i == 2028992424) {
            iArr = as;
            r1 = ar - -243565491;
            ar = r1;
            ad.bj = iArr[r1 * 537618701] * -701129034;
            client.fk(ad, (byte) 67);
            return 1;
        } else if (-473511747 == i) {
            iArr = as;
            r1 = ar - 55057286;
            ar = r1;
            ad.bq = iArr[r1 * 532507150] * 1820900823;
            client.fk(ad, (byte) 94);
            return 1;
        } else if (i == -344148512) {
            iArr = as;
            r1 = ar - -1194553915;
            ar = r1;
            ad.cv = iArr[r1 * 537618701] * -1237459785;
            client.fk(ad, (byte) 14);
            return 1;
        } else if (i == 1106) {
            iArr = as;
            r1 = ar - -1194553915;
            ar = r1;
            ad.cc = iArr[r1 * -1820234342] * 84768945;
            client.fk(ad, (byte) 26);
            return 1;
        } else if (1107 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * -2082675861] == 1) {
                z2 = true;
            }
            ad.co = z2;
            client.fk(ad, (byte) 77);
            return 1;
        } else if (i == -1112116502) {
            ad.cs = -713743521;
            iArr = as;
            r1 = ar - -89344083;
            ar = r1;
            ad.cd = iArr[r1 * 537618701] * 2115878253;
            client.fk(ad, (byte) 93);
            return 1;
        } else if (319865854 == i) {
            ar -= 1422611102;
            ad.cp = as[ar * 537618701] * 1284265172;
            ad.ct = 1240215437 * as[(1027524491 * ar) + 1];
            ad.cb = 770408497 * as[(ar * 2073066462) + 2];
            ad.cf = -41487175 * as[(ar * 537618701) + 3];
            ad.cz = 842525423 * as[(ar * -2002621181) + 4];
            ad.cr = as[(ar * 537618701) + 5] * 1057374537;
            client.fk(ad, (byte) 50);
            return 1;
        } else if (1110 == i) {
            iArr = as;
            r3 = ar - -1014588452;
            ar = r3;
            i2 = iArr[r3 * 537618701];
            if (ad.cq * 1215081994 == i2) {
                return 1;
            }
            ad.cq = i2 * 2102736655;
            ad.fg = 0;
            ad.fq = 0;
            client.fk(ad, (byte) 7);
            return 1;
        } else if (1111 == i) {
            iArr = as;
            r3 = ar - -516538972;
            ar = r3;
            if (iArr[r3 * 169066528] == 1) {
                z2 = true;
            }
            ad.cw = z2;
            client.fk(ad, (byte) 71);
            return 1;
        } else if (i == 1112) {
            String[] strArr = aj;
            r1 = ae - -1374603692;
            ae = r1;
            String str = strArr[r1 * -2096620539];
            if (str.equals(ad.dj)) {
                return 1;
            }
            ad.dj = str;
            client.fk(ad, (byte) 10);
            return 1;
        } else if (i == 1113) {
            iArr = as;
            r1 = ar - 229385297;
            ar = r1;
            ad.ca = iArr[r1 * 1795061734] * 1840094458;
            client.fk(ad, (byte) 56);
            return 1;
        } else if (1114 == i) {
            ar -= -1587363519;
            ad.f0do = 1287571003 * as[ar * 537618701];
            ad.dt = -25387511 * as[(ar * 537618701) + 1];
            ad.dk = as[(1605990261 * ar) + 2] * -1568633224;
            client.fk(ad, Byte.MAX_VALUE);
            return 1;
        } else if (1219029057 == i) {
            iArr = as;
            r3 = ar - -449192775;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            ad.dz = z2;
            client.fk(ad, (byte) 99);
            return 1;
        } else if (i == -786143041) {
            iArr = as;
            r1 = ar - -514311314;
            ar = r1;
            ad.cy = iArr[r1 * 537618701] * 1914751949;
            client.fk(ad, (byte) 59);
            return 1;
        } else if (i == 1670300581) {
            iArr = as;
            r1 = ar - 1529543093;
            ar = r1;
            ad.cn = iArr[r1 * 537618701] * 728184399;
            client.fk(ad, (byte) 9);
            return 1;
        } else if (i == 1642882772) {
            iArr = as;
            r3 = ar - -428513653;
            ar = r3;
            if (iArr[r3 * -1223382085] == 1) {
                z2 = true;
            }
            ad.ck = z2;
            client.fk(ad, (byte) 52);
            return 1;
        } else if (i == -75346629) {
            iArr = as;
            r3 = ar - 1177954472;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            ad.cl = z2;
            client.fk(ad, (byte) 51);
            return 1;
        } else if (1120 == i) {
            ar -= -255135211;
            ad.by = 808245745 * as[ar * 537618701];
            ad.bn = as[(ar * 537618701) + 1] * -447323526;
            client.fk(ad, (byte) 37);
            if (i2 == -1 || ad.ao * 1420217900 != 0) {
                return 1;
            }
            af.et(en.ay[i2 >> 16], ad, false, (byte) 10);
            return 1;
        } else if (i == 1121) {
            jv.ec(1172750087 * ad.ah, 1449584244 * ad.ak, (byte) 0);
            client.jv = ad;
            client.fk(ad, (byte) 107);
            return 1;
        } else if (i == -871782712) {
            iArr = as;
            r1 = ar - -1194553915;
            ar = r1;
            ad.ci = iArr[r1 * 370168553] * 245383255;
            client.fk(ad, (byte) 28);
            return 1;
        } else if (-1882441890 == i) {
            iArr = as;
            r1 = ar - 1561984912;
            ar = r1;
            ad.bl = iArr[r1 * 537618701] * 1982744395;
            client.fk(ad, (byte) 83);
            return 1;
        } else if (1124 == i) {
            iArr = as;
            r1 = ar - -1792381936;
            ar = r1;
            ad.bi = iArr[r1 * 537618701] * 1476271858;
            client.fk(ad, (byte) 79);
            return 1;
        } else if (i == -904322459) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            i2 = iArr[r3 * 645075319];
            gg ggVar = (gg) bx.af(new gg[]{gg.ag, gg.an, gg.af, gg.ad, gg.aa}, i2, (byte) 95);
            if (ggVar == null) {
                return 1;
            }
            ad.br = ggVar;
            client.fk(ad, (byte) 80);
            return 1;
        } else if (1912299520 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 1508545974] == 1) {
                z2 = true;
            }
            ad.bo = z2;
            return 1;
        } else if (i != 1127) {
            return 2;
        } else {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            ad.cx = z2;
            return 1;
        }
    }

    static int bx(int i, gk gkVar, boolean z) {
        int i2;
        ac ad;
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            ad = hv.ad(i2, 822386259);
        } else {
            ad = z ? mn.ab : at;
            i2 = -1;
        }
        if (2015619668 == i) {
            ar -= 1905859466;
            ad.be = 1680009701 * as[ar * -416559410];
            if (-2091547827 * ad.be > (1151268625 * ad.by) - (ad.bf * 256177861)) {
                ad.be = (ad.by * 1542076378) - (ad.bf * 1954189653);
            }
            if (-2091547827 * ad.be < 0) {
                ad.be = 0;
            }
            ad.bk = as[(ar * 537618701) + 1] * 693206580;
            if (654937537 * ad.bk > (ad.bn * 1444206320) - (57307023 * ad.bv)) {
                ad.bk = (-158560857 * ad.bn) - (ad.bv * -1002049201);
            }
            if (-1957315919 * ad.bk < 0) {
                ad.bk = 0;
            }
            client.fk(ad, (byte) 66);
            return 1;
        } else if (i == 1101) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.ba = iArr[r2 * 537618701] * -1456194309;
            client.fk(ad, (byte) 114);
            return 1;
        } else if (138635333 == i) {
            iArr = as;
            r3 = ar - -576579372;
            ar = r3;
            ad.bm = iArr[r3 * 598486078] == 1;
            client.fk(ad, (byte) 22);
            return 1;
        } else if (i == 1103) {
            iArr = as;
            r2 = ar - 154149316;
            ar = r2;
            ad.bj = iArr[r2 * 537618701] * -1014705653;
            client.fk(ad, (byte) 21);
            return 1;
        } else if (1104 == i) {
            iArr = as;
            r2 = ar - -1155287769;
            ar = r2;
            ad.bq = iArr[r2 * 537618701] * 1820900823;
            client.fk(ad, (byte) 73);
            return 1;
        } else if (i == 1105) {
            iArr = as;
            r2 = ar - 1032255774;
            ar = r2;
            ad.cv = iArr[r2 * 888110926] * -1880972889;
            client.fk(ad, (byte) 83);
            return 1;
        } else if (i == 1106) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.cc = iArr[r2 * -2113627961] * -1598920003;
            client.fk(ad, (byte) 17);
            return 1;
        } else if (180571607 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            ad.co = z2;
            client.fk(ad, (byte) 62);
            return 1;
        } else if (i == 1108) {
            ad.cs = -713743521;
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.cd = iArr[r2 * -1908760076] * -174447253;
            client.fk(ad, (byte) 115);
            return 1;
        } else if (1109 == i) {
            ar -= 1422611102;
            ad.cp = as[ar * 1164754645] * 1819609725;
            ad.ct = 432797755 * as[(ar * 537618701) + 1];
            ad.cb = 770408497 * as[(ar * 537618701) + 2];
            ad.cf = -41487175 * as[(ar * 537618701) + 3];
            ad.cz = 842525423 * as[(ar * 693098276) + 4];
            ad.cr = as[(ar * 537618701) + 5] * -1280824925;
            client.fk(ad, (byte) 108);
            return 1;
        } else if (618992983 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            i2 = iArr[r3 * 537618701];
            if (ad.cq * -1332946961 == i2) {
                return 1;
            }
            ad.cq = i2 * 2102736655;
            ad.fg = 0;
            ad.fq = 0;
            client.fk(ad, (byte) 60);
            return 1;
        } else if (1111 == i) {
            iArr = as;
            r3 = ar - -2081276635;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            ad.cw = z2;
            client.fk(ad, (byte) 56);
            return 1;
        } else if (i == -2141473916) {
            String[] strArr = aj;
            r2 = ae - 1748587584;
            ae = r2;
            String str = strArr[r2 * -1267697097];
            if (str.equals(ad.dj)) {
                return 1;
            }
            ad.dj = str;
            client.fk(ad, (byte) 5);
            return 1;
        } else if (i == 1113) {
            iArr = as;
            r2 = ar - -259775457;
            ar = r2;
            ad.ca = iArr[r2 * -1851914716] * -343733379;
            client.fk(ad, (byte) 41);
            return 1;
        } else if (1114 == i) {
            ar -= 711305551;
            ad.f0do = -133984684 * as[1316073309 * ar];
            ad.dt = 226611983 * as[(ar * 537618701) + 1];
            ad.dk = as[(ar * 537618701) + 2] * 1969493363;
            client.fk(ad, (byte) 62);
            return 1;
        } else if (1115 == i) {
            iArr = as;
            r5 = ar - -1194553915;
            ar = r5;
            if (iArr[r5 * 537618701] == 1) {
                z2 = true;
            }
            ad.dz = z2;
            client.fk(ad, (byte) 2);
            return 1;
        } else if (i == -774612011) {
            iArr = as;
            r2 = ar - 510404183;
            ar = r2;
            ad.cy = iArr[r2 * 1656324411] * 1083250592;
            client.fk(ad, (byte) 33);
            return 1;
        } else if (i == 484125049) {
            iArr = as;
            r2 = ar - -2092249532;
            ar = r2;
            ad.cn = iArr[r2 * 537316781] * 728184399;
            client.fk(ad, (byte) 72);
            return 1;
        } else if (i == 246026090) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * -1415332016] == 1) {
                z2 = true;
            }
            ad.ck = z2;
            client.fk(ad, (byte) 90);
            return 1;
        } else if (i == 1119) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            ad.cl = z2;
            client.fk(ad, (byte) 72);
            return 1;
        } else if (-808064038 == i) {
            ar -= -503459622;
            ad.by = 808245745 * as[ar * 1238466632];
            ad.bn = as[(ar * 537618701) + 1] * -1702725469;
            client.fk(ad, (byte) 82);
            if (i2 == -1 || ad.ao * -128421835 != 0) {
                return 1;
            }
            af.et(en.ay[i2 >> 16], ad, false, (byte) 0);
            return 1;
        } else if (i == 541428711) {
            jv.ec(1172750087 * ad.ah, 2102445939 * ad.ak, (byte) 0);
            client.jv = ad;
            client.fk(ad, (byte) 93);
            return 1;
        } else if (i == -367634348) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.ci = iArr[r2 * 1973304394] * 245383255;
            client.fk(ad, (byte) 106);
            return 1;
        } else if (-1786366836 == i) {
            iArr = as;
            r2 = ar - 1398909151;
            ar = r2;
            ad.bl = iArr[r2 * -972404216] * 1733757175;
            client.fk(ad, (byte) 99);
            return 1;
        } else if (1124 == i) {
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            ad.bi = iArr[r2 * 537618701] * -236421259;
            client.fk(ad, (byte) 55);
            return 1;
        } else if (i == 1125) {
            iArr = as;
            r5 = ar - -375688224;
            ar = r5;
            gg ggVar = (gg) bx.af(new gg[]{gg.ag, gg.an, gg.af, gg.ad, gg.aa}, iArr[r5 * -332645114], (byte) 50);
            if (ggVar == null) {
                return 1;
            }
            ad.br = ggVar;
            client.fk(ad, (byte) 2);
            return 1;
        } else if (-1901319037 == i) {
            iArr = as;
            r3 = ar - -939317217;
            ar = r3;
            if (iArr[r3 * -621946418] == 1) {
                z2 = true;
            }
            ad.bo = z2;
            return 1;
        } else if (i != 1847673063) {
            return 2;
        } else {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            ad.cx = z2;
            return 1;
        }
    }

    static int be(int i, gk gkVar, boolean z) {
        ac ad;
        int i2 = 0;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -1194553915;
            ar = i3;
            ad = hv.ad(iArr[i3 * 537618701], 1396712405);
        } else if (z) {
            ad = mn.ab;
        } else {
            ad = at;
        }
        client.fk(ad, (byte) 92);
        if (1200 == i || i == 1205 || 1212 == i) {
            ar -= 1905859466;
            i3 = as[ar * 537618701];
            int i4 = as[(ar * 537618701) + 1];
            ad.fr = -1404216569 * i3;
            ad.fp = i4 * 895045473;
            ax af = cm.af(i3, 1936971179);
            ad.cb = af.al * -1010358009;
            ad.cf = af.ap * -1123242253;
            ad.cz = -1813573947 * af.bw;
            ad.cp = af.bb * -1211168499;
            ad.ct = 1928138403 * af.bc;
            ad.cr = af.ac * -136593549;
            if (i == 1205) {
                ad.cu = 0;
            } else {
                if (i == 1212) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (af.bz * 1099170281 == 1) {
                    i2 = 1;
                }
                if ((i3 | i2) != 0) {
                    ad.cu = -144948821;
                } else {
                    ad.cu = -289897642;
                }
            }
            if (1535179975 * ad.ce > 0) {
                ad.cr = ((ad.cr * -1336947680) / (ad.ce * 1535179975)) * 62563745;
                return 1;
            } else if (ad.bc * 1506390075 <= 0) {
                return 1;
            } else {
                ad.cr = ((ad.cr * -1336947680) / (1506390075 * ad.bc)) * 62563745;
                return 1;
            }
        } else if (1201 == i) {
            ad.cs = -1427487042;
            int[] iArr2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            ad.cd = iArr2[i2 * 537618701] * -174447253;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            ad.cs = -2141230563;
            ad.cd = gf.ho.ad.aj((byte) 96) * -174447253;
            return 1;
        }
    }

    static int bk(int i, gk gkVar, boolean z) {
        ac ad;
        int i2 = 0;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -1194553915;
            ar = i3;
            ad = hv.ad(iArr[i3 * 537618701], 115070878);
        } else {
            ad = z ? mn.ab : at;
        }
        client.fk(ad, (byte) 37);
        if (1200 == i || i == 1205 || 1212 == i) {
            ar -= 1905859466;
            i3 = as[ar * 537618701];
            int i4 = as[(ar * 537618701) + 1];
            ad.fr = -1404216569 * i3;
            ad.fp = i4 * 895045473;
            ax af = cm.af(i3, 1070061916);
            ad.cb = af.al * -1010358009;
            ad.cf = af.ap * -1123242253;
            ad.cz = -1813573947 * af.bw;
            ad.cp = af.bb * -1211168499;
            ad.ct = 1928138403 * af.bc;
            ad.cr = af.ac * -136593549;
            if (i == 1205) {
                ad.cu = 0;
            } else {
                if (i == 1212) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (af.bz * 1099170281 == 1) {
                    i2 = 1;
                }
                if ((i3 | i2) != 0) {
                    ad.cu = -144948821;
                } else {
                    ad.cu = -289897642;
                }
            }
            if (1535179975 * ad.ce > 0) {
                ad.cr = ((ad.cr * -1336947680) / (ad.ce * 1535179975)) * 62563745;
                return 1;
            } else if (ad.bc * 1506390075 <= 0) {
                return 1;
            } else {
                ad.cr = ((ad.cr * -1336947680) / (1506390075 * ad.bc)) * 62563745;
                return 1;
            }
        } else if (1201 == i) {
            ad.cs = -1427487042;
            int[] iArr2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            ad.cd = iArr2[i2 * 537618701] * -174447253;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            ad.cs = -2141230563;
            ad.cd = gf.ho.ad.aj((byte) -60) * -174447253;
            return 1;
        }
    }

    static int bu(int i, gk gkVar, boolean z) {
        ac ad;
        int i2 = 0;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -1194553915;
            ar = i3;
            ad = hv.ad(iArr[i3 * 537618701], 488191313);
        } else if (z) {
            ad = mn.ab;
        } else {
            ad = at;
        }
        client.fk(ad, (byte) 105);
        if (1200 == i || i == 1205 || 1212 == i) {
            ar -= 1905859466;
            i3 = as[ar * 537618701];
            int i4 = as[(ar * 537618701) + 1];
            ad.fr = -1404216569 * i3;
            ad.fp = i4 * 895045473;
            ax af = cm.af(i3, 1613158220);
            ad.cb = af.al * -1010358009;
            ad.cf = af.ap * -1123242253;
            ad.cz = -1813573947 * af.bw;
            ad.cp = af.bb * -1211168499;
            ad.ct = 1928138403 * af.bc;
            ad.cr = af.ac * -136593549;
            if (i == 1205) {
                ad.cu = 0;
            } else {
                if (i == 1212) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (af.bz * 1099170281 == 1) {
                    i2 = 1;
                }
                if ((i3 | i2) != 0) {
                    ad.cu = -144948821;
                } else {
                    ad.cu = -289897642;
                }
            }
            if (1535179975 * ad.ce > 0) {
                ad.cr = ((ad.cr * -1336947680) / (ad.ce * 1535179975)) * 62563745;
                return 1;
            } else if (ad.bc * 1506390075 <= 0) {
                return 1;
            } else {
                ad.cr = ((ad.cr * -1336947680) / (1506390075 * ad.bc)) * 62563745;
                return 1;
            }
        } else if (1201 == i) {
            ad.cs = -1427487042;
            int[] iArr2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            ad.cd = iArr2[i2 * 537618701] * -174447253;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            ad.cs = -2141230563;
            ad.cd = gf.ho.ad.aj((byte) 29) * -174447253;
            return 1;
        }
    }

    static int by(int i, gk gkVar, boolean z) {
        ac ad;
        int i2 = 0;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -1194553915;
            ar = i3;
            ad = hv.ad(iArr[i3 * 537618701], 1364392318);
        } else {
            ad = z ? mn.ab : at;
        }
        client.fk(ad, (byte) 92);
        if (1200 == i || i == 1205 || 1212 == i) {
            ar -= 1905859466;
            i3 = as[ar * 537618701];
            int i4 = as[(ar * 537618701) + 1];
            ad.fr = -1404216569 * i3;
            ad.fp = i4 * 895045473;
            ax af = cm.af(i3, 1678761558);
            ad.cb = af.al * -1010358009;
            ad.cf = af.ap * -1123242253;
            ad.cz = -1813573947 * af.bw;
            ad.cp = af.bb * -1211168499;
            ad.ct = 1928138403 * af.bc;
            ad.cr = af.ac * -136593549;
            if (i == 1205) {
                ad.cu = 0;
            } else {
                i3 = i == 1212 ? 1 : 0;
                if (af.bz * 1099170281 == 1) {
                    i2 = 1;
                }
                if ((i3 | i2) != 0) {
                    ad.cu = -144948821;
                } else {
                    ad.cu = -289897642;
                }
            }
            if (1535179975 * ad.ce > 0) {
                ad.cr = ((ad.cr * -1336947680) / (ad.ce * 1535179975)) * 62563745;
                return 1;
            } else if (ad.bc * 1506390075 <= 0) {
                return 1;
            } else {
                ad.cr = ((ad.cr * -1336947680) / (1506390075 * ad.bc)) * 62563745;
                return 1;
            }
        } else if (1201 == i) {
            ad.cs = -1427487042;
            int[] iArr2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            ad.cd = iArr2[i2 * 537618701] * -174447253;
            return 1;
        } else if (1202 != i) {
            return 2;
        } else {
            ad.cs = -2141230563;
            ad.cd = gf.ho.ad.aj((byte) -41) * -174447253;
            return 1;
        }
    }

    static int ba(int i, gk gkVar, boolean z) {
        ac ad;
        int[] iArr;
        int i2;
        Object[] objArr = null;
        if (i >= 2000) {
            i -= 1000;
            int[] iArr2 = as;
            int i3 = ar - -2023327109;
            ar = i3;
            ad = hv.ad(iArr2[i3 * -736667957], 1308763116);
        } else {
            ad = z ? mn.ab : at;
        }
        String[] strArr = aj;
        int i4 = ae - -1295589949;
        ae = i4;
        String str = strArr[i4 * -1267697097];
        if (str.length() <= 0 || str.charAt(str.length() - 1) != 'Y') {
            iArr = null;
        } else {
            iArr = as;
            int i5 = ar - 1478968780;
            ar = i5;
            i5 = iArr[i5 * 1359797905];
            if (i5 > 0) {
                iArr = new int[i5];
                while (true) {
                    i2 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    int[] iArr3 = as;
                    int i6 = ar - 322677590;
                    ar = i6;
                    iArr[i2] = iArr3[i6 * -1301342936];
                    i5 = i2;
                }
            } else {
                iArr = null;
            }
            str = str.substring(0, str.length() - 1);
        }
        Object[] objArr2 = new Object[(str.length() + 1)];
        for (i2 = objArr2.length - 1; i2 >= 1; i2--) {
            if (str.charAt(i2 - 1) == 's') {
                String[] strArr2 = aj;
                int i7 = ae - -765888551;
                ae = i7;
                objArr2[i2] = strArr2[i7 * 1030626114];
            } else {
                int[] iArr4 = as;
                int i8 = ar - -1194553915;
                ar = i8;
                objArr2[i2] = new Integer(iArr4[i8 * 537618701]);
            }
        }
        int[] iArr5 = as;
        i2 = ar - -1194553915;
        ar = i2;
        i4 = iArr5[i2 * 1262307461];
        if (-1 != i4) {
            objArr2[0] = new Integer(i4);
            objArr = objArr2;
        }
        if (272915720 == i) {
            ad.dp = objArr;
        } else if (ac.ag == i) {
            ad.dq = objArr;
        } else if (i == 1402) {
            ad.df = objArr;
        } else if (1097158105 == i) {
            ad.er = objArr;
        } else if (-1670253278 == i) {
            ad.ek = objArr;
        } else if (i == 1405) {
            ad.es = objArr;
        } else if (1406 == i) {
            ad.ec = objArr;
        } else if (1407 == i) {
            ad.ep = objArr;
            ad.ev = iArr;
        } else if (i == 1408) {
            ad.ef = objArr;
        } else if (1657857493 == i) {
            ad.el = objArr;
        } else if (i == 1691298545) {
            ad.ex = objArr;
        } else if (-827847043 == i) {
            ad.dg = objArr;
        } else if (i == -679102547) {
            ad.ew = objArr;
        } else if (i == 1414) {
            ad.eq = objArr;
            ad.en = iArr;
        } else if (i == 1415) {
            ad.ea = objArr;
            ad.ey = iArr;
        } else if (i == 227767377) {
            ad.eu = objArr;
        } else if (1417 == i) {
            ad.et = objArr;
        } else if (552669066 == i) {
            ad.eg = objArr;
        } else if (i == 1419) {
            ad.ej = objArr;
        } else if (i == -640393061) {
            ad.ed = objArr;
        } else if (i == 1421) {
            ad.em = objArr;
        } else if (-1162443756 == i) {
            ad.ez = objArr;
        } else if (1388458881 == i) {
            ad.ee = objArr;
        } else if (1424 == i) {
            ad.eb = objArr;
        } else if (1425 == i) {
            ad.eh = objArr;
        } else if (-1743646982 == i) {
            ad.eo = objArr;
        } else if (i != 1427) {
            return 2;
        } else {
            ad.ei = objArr;
        }
        ad.db = true;
        return 1;
    }

    static int bl(int i, gk gkVar, boolean z) {
        ac ad;
        int[] iArr;
        int i2;
        Object[] objArr = null;
        if (i >= 370442202) {
            i -= 1000;
            int[] iArr2 = as;
            int i3 = ar - -1179176167;
            ar = i3;
            ad = hv.ad(iArr2[i3 * -1916908261], 1094391555);
        } else if (z) {
            ad = mn.ab;
        } else {
            ad = at;
        }
        String[] strArr = aj;
        int i4 = ae - -1246602361;
        ae = i4;
        String str = strArr[i4 * -1267697097];
        if (str.length() <= 0 || str.charAt(str.length() - 1) != 'Y') {
            iArr = null;
        } else {
            iArr = as;
            int i5 = ar - 1468107154;
            ar = i5;
            i5 = iArr[i5 * 537618701];
            if (i5 > 0) {
                iArr = new int[i5];
                while (true) {
                    i2 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    int[] iArr3 = as;
                    int i6 = ar - -1194553915;
                    ar = i6;
                    iArr[i2] = iArr3[i6 * 1948593141];
                    i5 = i2;
                }
            } else {
                iArr = null;
            }
            str = str.substring(0, str.length() - 1);
        }
        Object[] objArr2 = new Object[(str.length() + 1)];
        for (i2 = objArr2.length - 1; i2 >= 1; i2--) {
            if (str.charAt(i2 - 1) == '魲') {
                String[] strArr2 = aj;
                int i7 = ae - -11595589;
                ae = i7;
                objArr2[i2] = strArr2[i7 * -1574499218];
            } else {
                int[] iArr4 = as;
                int i8 = ar - -1194553915;
                ar = i8;
                objArr2[i2] = new Integer(iArr4[i8 * 537618701]);
            }
        }
        int[] iArr5 = as;
        i2 = ar - -1194553915;
        ar = i2;
        i4 = iArr5[i2 * 537618701];
        if (-1 != i4) {
            objArr2[0] = new Integer(i4);
            objArr = objArr2;
        }
        if (1206129589 == i) {
            ad.dp = objArr;
        } else if (-1718774906 == i) {
            ad.dq = objArr;
        } else if (i == 1402) {
            ad.df = objArr;
        } else if (1403 == i) {
            ad.er = objArr;
        } else if (-1384534052 == i) {
            ad.ek = objArr;
        } else if (i == 1074803796) {
            ad.es = objArr;
        } else if (1406 == i) {
            ad.ec = objArr;
        } else if (2072920394 == i) {
            ad.ep = objArr;
            ad.ev = iArr;
        } else if (i == -938864223) {
            ad.ef = objArr;
        } else if (1409 == i) {
            ad.el = objArr;
        } else if (i == 1410) {
            ad.ex = objArr;
        } else if (1411 == i) {
            ad.dg = objArr;
        } else if (i == 824274944) {
            ad.ew = objArr;
        } else if (i == 1414) {
            ad.eq = objArr;
            ad.en = iArr;
        } else if (i == 1415) {
            ad.ea = objArr;
            ad.ey = iArr;
        } else if (i == 1416) {
            ad.eu = objArr;
        } else if (678253793 == i) {
            ad.et = objArr;
        } else if (1418 == i) {
            ad.eg = objArr;
        } else if (i == 392014067) {
            ad.ej = objArr;
        } else if (i == 1420) {
            ad.ed = objArr;
        } else if (i == 732591225) {
            ad.em = objArr;
        } else if (1422 == i) {
            ad.ez = objArr;
        } else if (-2070871093 == i) {
            ad.ee = objArr;
        } else if (352814972 == i) {
            ad.eb = objArr;
        } else if (1425 == i) {
            ad.eh = objArr;
        } else if (1426 == i) {
            ad.eo = objArr;
        } else if (i != -1980465682) {
            return 2;
        } else {
            ad.ei = objArr;
        }
        ad.db = true;
        return 1;
    }

    static int bn(int i, gk gkVar, boolean z) {
        ac ad;
        int i2;
        Object[] objArr;
        if (i >= 922685758) {
            i -= 1000;
            int[] iArr = as;
            int i3 = ar - -876619946;
            ar = i3;
            ad = hv.ad(iArr[i3 * 537618701], 727832334);
        } else if (z) {
            ad = mn.ab;
        } else {
            ad = at;
        }
        String[] strArr = aj;
        int i4 = ae - -1246602361;
        ae = i4;
        String str = strArr[i4 * -1199068998];
        int[] iArr2 = null;
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'Y') {
            int[] iArr3 = as;
            i2 = ar - -1194553915;
            ar = i2;
            int i5 = iArr3[i2 * 537618701];
            if (i5 > 0) {
                iArr2 = new int[i5];
                while (true) {
                    i2 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    iArr3 = as;
                    int i6 = ar - -1194553915;
                    ar = i6;
                    iArr2[i2] = iArr3[i6 * -1924503382];
                    i5 = i2;
                }
            }
            str = str.substring(0, str.length() - 1);
        }
        Object[] objArr2 = new Object[(str.length() + 1)];
        for (i2 = objArr2.length - 1; i2 >= 1; i2--) {
            if (str.charAt(i2 - 1) == 's') {
                String[] strArr2 = aj;
                int i7 = ae - -1246602361;
                ae = i7;
                objArr2[i2] = strArr2[i7 * -1267697097];
            } else {
                int[] iArr4 = as;
                int i8 = ar - -1194553915;
                ar = i8;
                objArr2[i2] = new Integer(iArr4[i8 * 537618701]);
            }
        }
        int[] iArr5 = as;
        i2 = ar - 1347847308;
        ar = i2;
        i4 = iArr5[i2 * 60365506];
        if (-1 != i4) {
            objArr2[0] = new Integer(i4);
            objArr = objArr2;
        } else {
            objArr = null;
        }
        if (523499912 == i) {
            ad.dp = objArr;
        } else if (ac.ag == i) {
            ad.dq = objArr;
        } else if (i == -969226099) {
            ad.df = objArr;
        } else if (218627641 == i) {
            ad.er = objArr;
        } else if (1542680126 == i) {
            ad.ek = objArr;
        } else if (i == 1405) {
            ad.es = objArr;
        } else if (-1421465946 == i) {
            ad.ec = objArr;
        } else if (174049690 == i) {
            ad.ep = objArr;
            ad.ev = iArr2;
        } else if (i == 1408) {
            ad.ef = objArr;
        } else if (47273384 == i) {
            ad.el = objArr;
        } else if (i == 706670956) {
            ad.ex = objArr;
        } else if (1411 == i) {
            ad.dg = objArr;
        } else if (i == 1412) {
            ad.ew = objArr;
        } else if (i == 1835230628) {
            ad.eq = objArr;
            ad.en = iArr2;
        } else if (i == 1968633492) {
            ad.ea = objArr;
            ad.ey = iArr2;
        } else if (i == 1416) {
            ad.eu = objArr;
        } else if (-98402636 == i) {
            ad.et = objArr;
        } else if (607282777 == i) {
            ad.eg = objArr;
        } else if (i == 1419) {
            ad.ej = objArr;
        } else if (i == 1903603523) {
            ad.ed = objArr;
        } else if (i == 310549163) {
            ad.em = objArr;
        } else if (1422 == i) {
            ad.ez = objArr;
        } else if (1423 == i) {
            ad.ee = objArr;
        } else if (1424 == i) {
            ad.eb = objArr;
        } else if (1627374947 == i) {
            ad.eh = objArr;
        } else if (-1723397860 == i) {
            ad.eo = objArr;
        } else if (i != -1218379612) {
            return 2;
        } else {
            ad.ei = objArr;
        }
        ad.db = true;
        return 1;
    }

    static int bd(int i, gk gkVar, boolean z) {
        ac acVar;
        if (z) {
            acVar = mn.ab;
        } else {
            acVar = at;
        }
        int[] iArr;
        int i2;
        if (i == 1600) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.be * -2091547827;
            return 1;
        } else if (1601 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bk * 654937537;
            return 1;
        } else if (i == 1602) {
            String[] strArr = aj;
            i2 = ae - 1246602361;
            ae = i2;
            strArr[(i2 * -1267697097) - 1] = acVar.dj;
            return 1;
        } else if (i == 1603) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.by * 1151268625;
            return 1;
        } else if (i == 1604) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bn * -1243953689;
            return 1;
        } else if (1605 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cr * 2105704033;
            return 1;
        } else if (i == 1606) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cb * -1375479599;
            return 1;
        } else if (i == 1607) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cz * -1211464689;
            return 1;
        } else if (i == 1608) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cf * -2032348791;
            return 1;
        } else if (i == 1609) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bj * -479221341;
            return 1;
        } else if (1610 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bi * -1726277411;
            return 1;
        } else if (1611 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.ba * 334261811;
            return 1;
        } else if (i == 1612) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bl * 1703184995;
            return 1;
        } else if (i == 1613) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.br.af(1298992303);
            return 1;
        } else if (1614 != i) {
            return 2;
        } else {
            int i3;
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            if (acVar.cx) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            iArr[i2] = i3;
            return 1;
        }
    }

    static int bm(int i, gk gkVar, boolean z) {
        ac acVar;
        if (z) {
            acVar = mn.ab;
        } else {
            acVar = at;
        }
        int[] iArr;
        int i2;
        if (i == 1600) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.be * 315480984;
            return 1;
        } else if (1601 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * -249469663) - 1] = acVar.bk * 654937537;
            return 1;
        } else if (i == -471237678) {
            String[] strArr = aj;
            i2 = ae - 1246602361;
            ae = i2;
            strArr[(i2 * -1267697097) - 1] = acVar.dj;
            return 1;
        } else if (i == 1603) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.by * 1151268625;
            return 1;
        } else if (i == 1604) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 2062869999) - 1] = acVar.bn * 2103050581;
            return 1;
        } else if (-962023118 == i) {
            iArr = as;
            i2 = ar - 2138175681;
            ar = i2;
            iArr[(i2 * -230261656) - 1] = acVar.cr * 2105704033;
            return 1;
        } else if (i == -1439523706) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cb * -1375479599;
            return 1;
        } else if (i == 1607) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cz * -1082025575;
            return 1;
        } else if (i == -882466631) {
            iArr = as;
            i2 = ar - 1713768704;
            ar = i2;
            iArr[(i2 * -1393478071) - 1] = acVar.cf * -2032348791;
            return 1;
        } else if (i == -2146156522) {
            iArr = as;
            i2 = ar + 1416121560;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bj * -479221341;
            return 1;
        } else if (-1337524449 == i) {
            iArr = as;
            i2 = ar - 6625027;
            ar = i2;
            iArr[(i2 * -1410750256) - 1] = acVar.bi * -1726277411;
            return 1;
        } else if (1611 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 1118412946) - 1] = acVar.ba * 2036412910;
            return 1;
        } else if (i == 593109393) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * -410082362) - 1] = acVar.bl * 1703184995;
            return 1;
        } else if (i == 1613) {
            iArr = as;
            i2 = ar + 1150843618;
            ar = i2;
            iArr[(i2 * -1676027327) - 1] = acVar.br.af(1106498801);
            return 1;
        } else if (276734658 != i) {
            return 2;
        } else {
            int i3;
            iArr = as;
            i2 = ar - 676288580;
            ar = i2;
            i2 = (i2 * 270773695) - 1;
            if (acVar.cx) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            iArr[i2] = i3;
            return 1;
        }
    }

    static int br(int i, gk gkVar, boolean z) {
        ac acVar;
        if (z) {
            acVar = mn.ab;
        } else {
            acVar = at;
        }
        int[] iArr;
        int i2;
        if (i == 1600) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.be * -2091547827;
            return 1;
        } else if (1601 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bk * 654937537;
            return 1;
        } else if (i == 1602) {
            String[] strArr = aj;
            i2 = ae - 1246602361;
            ae = i2;
            strArr[(i2 * -1267697097) - 1] = acVar.dj;
            return 1;
        } else if (i == 1603) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.by * 1151268625;
            return 1;
        } else if (i == 1604) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bn * -1243953689;
            return 1;
        } else if (1605 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cr * 2105704033;
            return 1;
        } else if (i == 1606) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cb * -1375479599;
            return 1;
        } else if (i == 1607) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cz * -1211464689;
            return 1;
        } else if (i == 1608) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cf * -2032348791;
            return 1;
        } else if (i == 1609) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bj * -479221341;
            return 1;
        } else if (1610 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bi * -1726277411;
            return 1;
        } else if (1611 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.ba * 334261811;
            return 1;
        } else if (i == 1612) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bl * 1703184995;
            return 1;
        } else if (i == 1613) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.br.af(1485073402);
            return 1;
        } else if (1614 != i) {
            return 2;
        } else {
            int i3;
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            if (acVar.cx) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            iArr[i2] = i3;
            return 1;
        }
    }

    static int bs(int i, gk gkVar, boolean z) {
        ac acVar;
        if (z) {
            acVar = mn.ab;
        } else {
            acVar = at;
        }
        int[] iArr;
        int i2;
        if (i == 1600) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.be * -2091547827;
            return 1;
        } else if (1601 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bk * 654937537;
            return 1;
        } else if (i == 1602) {
            String[] strArr = aj;
            i2 = ae - 1246602361;
            ae = i2;
            strArr[(i2 * -1267697097) - 1] = acVar.dj;
            return 1;
        } else if (i == 1603) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.by * 1151268625;
            return 1;
        } else if (i == 1604) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bn * -1243953689;
            return 1;
        } else if (1605 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cr * 2105704033;
            return 1;
        } else if (i == 1606) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cb * -1375479599;
            return 1;
        } else if (i == 1607) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cz * -1211464689;
            return 1;
        } else if (i == 1608) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.cf * -2032348791;
            return 1;
        } else if (i == 1609) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bj * -479221341;
            return 1;
        } else if (1610 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bi * -1726277411;
            return 1;
        } else if (1611 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.ba * 334261811;
            return 1;
        } else if (i == 1612) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.bl * 1703184995;
            return 1;
        } else if (i == 1613) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = acVar.br.af(553377644);
            return 1;
        } else if (1614 != i) {
            return 2;
        } else {
            int i3;
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            if (acVar.cx) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            iArr[i2] = i3;
            return 1;
        }
    }

    static int bi(int i, gk gkVar, boolean z) {
        ac acVar = z ? mn.ab : at;
        int[] iArr;
        int i2;
        if (i == 1800) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = (ah.fy(acVar, -1947817025) >> 11) & -488190793;
            return 1;
        } else if (i == 1801) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r2 = iArr[i2 * 537618701] - 1;
            if (acVar.ds == null || r2 >= acVar.ds.length || acVar.ds[r2] == null) {
                r0 = aj;
                r2 = ae - 1246602361;
                ae = r2;
                r0[(r2 * -616103159) - 1] = "";
            } else {
                String[] strArr = aj;
                int i3 = ae - 1246602361;
                ae = i3;
                strArr[(i3 * -1267697097) - 1] = acVar.ds[r2];
            }
            return 1;
        } else if (1802 != i) {
            return 2;
        } else {
            if (acVar.dw == null) {
                r0 = aj;
                r2 = ae + 845986801;
                ae = r2;
                r0[(r2 * -1267697097) - 1] = "";
            } else {
                String[] strArr2 = aj;
                i2 = ae + 286397528;
                ae = i2;
                strArr2[(i2 * 578789013) - 1] = acVar.dw;
            }
            return 1;
        }
    }

    static int bj(int i, gk gkVar, boolean z) {
        ac acVar;
        if (z) {
            acVar = mn.ab;
        } else {
            acVar = at;
        }
        int[] iArr;
        int i2;
        if (i == 1800) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = (ah.fy(acVar, -182197182) >> 11) & 63;
            return 1;
        } else if (i == 1801) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r2 = iArr[i2 * 537618701] - 1;
            if (acVar.ds == null || r2 >= acVar.ds.length || acVar.ds[r2] == null) {
                r0 = aj;
                r2 = ae - 1246602361;
                ae = r2;
                r0[(r2 * -1267697097) - 1] = "";
            } else {
                String[] strArr = aj;
                int i3 = ae - 1246602361;
                ae = i3;
                strArr[(i3 * -1267697097) - 1] = acVar.ds[r2];
            }
            return 1;
        } else if (1802 != i) {
            return 2;
        } else {
            if (acVar.dw == null) {
                r0 = aj;
                r2 = ae - 1246602361;
                ae = r2;
                r0[(r2 * -1267697097) - 1] = "";
            } else {
                String[] strArr2 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                strArr2[(i2 * -1267697097) - 1] = acVar.dw;
            }
            return 1;
        }
    }

    static int bo(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        String[] strArr;
        int i2;
        if (i == 3100) {
            strArr = aj;
            i2 = ae - -1246602361;
            ae = i2;
            ax.af(0, "", strArr[i2 * -1267697097], 1374273098);
            return 1;
        } else if (3101 == i) {
            ar -= 1905859466;
            hb.cn(gf.ho, as[ar * 537618701], as[(ar * 537618701) + 1], (byte) -35);
            return 1;
        } else if (3103 == i) {
            gw.fg(-1265034995);
            return 1;
        } else if (3104 == i) {
            strArr = aj;
            i2 = ae - -1246602361;
            ae = i2;
            CharSequence charSequence = strArr[i2 * -1267697097];
            if (ej.af(charSequence, 1297087347)) {
                r0 = ll.aa(charSequence, 10, true, (byte) -20);
            }
            r2 = ik.ad(nr.cz, client.dv.ag, (byte) -100);
            r2.an.ay(r0, (short) 128);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (i == 3105) {
            r0 = aj;
            r2 = ae - -1246602361;
            ae = r2;
            r0 = r0[r2 * -1267697097];
            r2 = ik.ad(nr.ck, client.dv.ag, (byte) -98);
            r2.an.an(r0.length() + 1, (byte) 31);
            r2.an.aq(r0, (byte) 72);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (3106 == i) {
            r0 = aj;
            r2 = ae - -1246602361;
            ae = r2;
            r0 = r0[r2 * -1267697097];
            r2 = ik.ad(nr.bc, client.dv.ag, (byte) -17);
            r2.an.an(r0.length() + 1, (byte) 31);
            r2.an.aq(r0, (byte) -102);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (3107 == i) {
            r0 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = r0[r2 * 537618701];
            strArr = aj;
            i2 = ae - -1246602361;
            ae = i2;
            nv.eu(r0, strArr[i2 * -1267697097], (byte) 38);
            return 1;
        } else if (3108 == i) {
            ar -= 711305551;
            ex.fd(hv.ad(as[(ar * 537618701) + 2], 966436867), as[ar * 537618701], as[(ar * 537618701) + 1], -1411741105);
            return 1;
        } else if (i == 3109) {
            ac acVar;
            ar -= 1905859466;
            r2 = as[ar * 537618701];
            i2 = as[(ar * 537618701) + 1];
            if (z) {
                acVar = mn.ab;
            } else {
                acVar = at;
            }
            ex.fd(acVar, r2, i2, -1587995660);
            return 1;
        } else if (i == 3110) {
            r2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            if (r2[i2 * 537618701] == 1) {
                z2 = true;
            }
            ay.bu = z2;
            return 1;
        } else if (3111 == i) {
            r2 = as;
            i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            if (cs.oj.an) {
                z2 = true;
            }
            r2[i2] = z2;
            return 1;
        } else if (i == 3112) {
            gj gjVar = cs.oj;
            r3 = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            gjVar.an = z2;
            co.aa(-1817899549);
            return 1;
        } else if (i == 3113) {
            boolean z3;
            strArr = aj;
            i2 = ae - -1246602361;
            ae = i2;
            r3 = strArr[i2 * -1267697097];
            r2 = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (r2[r4 * 537618701] == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            js.ad(r3, z3, false, (byte) 14);
            return 1;
        } else if (3115 == i) {
            r0 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = r0[r2 * 537618701];
            r2 = ik.ad(nr.ba, client.dv.ag, (byte) -70);
            r2.an.aa(r0, -1752508204);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (3116 == i) {
            r0 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = r0[r2 * 537618701];
            ae -= 1801762574;
            String str = aj[ae * -1267697097];
            r3 = aj[(ae * -1267697097) + 1];
            if (str.length() > 500 || r3.length() > 500) {
                return 1;
            }
            no ad = ik.ad(nr.co, client.dv.ag, (byte) -65);
            ad.an.aa((hz.ae(str, -1590626361) + 1) + hz.ae(r3, -2120273923), -1752508204);
            ad.an.aq(r3, (byte) -41);
            ad.an.an(r0, (byte) 31);
            ad.an.aq(str, (byte) -14);
            client.dv.an(ad, (short) 255);
            return 1;
        } else if (i == 3117) {
            r2 = nq.ii;
            r3 = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            r2.cy(z2, -2107451610);
            return 1;
        } else if (3118 == i) {
            r2 = nq.ii;
            r3 = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            r2.co = z2;
            return 1;
        } else if (i == 3119) {
            r2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            if (r2[i2 * 537618701] == 1) {
                z2 = true;
            }
            client.hh = z2;
            return 1;
        } else if (i == 3120) {
            r0 = as;
            r2 = ar - -1194553915;
            ar = r2;
            if (r0[r2 * 537618701] == 1) {
                client.ir = 213563641 * ((client.ir * 1424263497) | 1);
                return 1;
            }
            client.ir = 213563641 * ((1424263497 * client.ir) & -2);
            return 1;
        } else if (i == 3121) {
            r0 = as;
            r2 = ar - -1194553915;
            ar = r2;
            if (r0[r2 * 537618701] == 1) {
                client.ir = 213563641 * ((client.ir * 1424263497) | 2);
                return 1;
            }
            client.ir = ((1424263497 * client.ir) & -3) * 213563641;
            return 1;
        } else if (i == 3122) {
            r0 = as;
            r2 = ar - -1194553915;
            ar = r2;
            if (r0[r2 * 537618701] == 1) {
                client.ir = 213563641 * ((client.ir * 1424263497) | 4);
                return 1;
            }
            client.ir = ((client.ir * 1424263497) & -5) * 213563641;
            return 1;
        } else if (i == 3123) {
            r0 = as;
            r2 = ar - -1194553915;
            ar = r2;
            if (r0[r2 * 537618701] == 1) {
                client.ir = 213563641 * ((1424263497 * client.ir) | 8);
                return 1;
            }
            client.ir = ((client.ir * 1424263497) & -9) * 213563641;
            return 1;
        } else if (3124 == i) {
            client.ir = 0;
            return 1;
        } else if (i == 3125) {
            r2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            if (r2[i2 * 537618701] == 1) {
                z2 = true;
            }
            client.hy = z2;
            return 1;
        } else if (3126 == i) {
            r2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            if (r2[i2 * 537618701] == 1) {
                z2 = true;
            }
            client.hp = z2;
            return 1;
        } else if (3127 == i) {
            r2 = nq.ii;
            r3 = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (r3[r4 * 537618701] == 1) {
                z2 = true;
            }
            r2.ck(z2, (byte) 6);
            return 1;
        } else if (3128 == i) {
            r2 = as;
            i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            if (nq.ii.cl(1693428806)) {
                z2 = true;
            }
            r2[i2] = z2;
            return 1;
        } else if (3129 == i) {
            ar -= 1905859466;
            client.gn = -704603963 * as[ar * 537618701];
            client.ge = as[(ar * 537618701) + 1] * -1890400699;
            return 1;
        } else if (3130 == i) {
            ar -= 1905859466;
            r2 = as[ar * 537618701];
            if (1 == as[(ar * 537618701) + 1]) {
                z2 = true;
            }
            nq.ii.cs(r2, z2, 1829547545);
            return 1;
        } else if (i == 3131) {
            r2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            if (r2[i2 * 537618701] == 1) {
                z2 = true;
            }
            nq.ii.cd(z2, -107858092);
            return 1;
        } else if (3132 != i) {
            return 2;
        } else {
            r0 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r0[(r2 * 537618701) - 1] = ds.rg * -1946576867;
            r0 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r0[(r2 * 537618701) - 1] = af.ru * 1616559063;
            return 1;
        }
    }

    static int bq(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        String[] strArr;
        int i2;
        if (i == 1978441066) {
            strArr = aj;
            i2 = ae - 455129804;
            ae = i2;
            ax.af(0, "", strArr[i2 * -1267697097], 817803530);
            return 1;
        } else if (3101 == i) {
            ar -= 1905859466;
            hb.cn(gf.ho, as[887342997 * ar], as[(ar * 537618701) + 1], (byte) 53);
            return 1;
        } else if (3103 == i) {
            gw.fg(-1265034995);
            return 1;
        } else if (3104 == i) {
            strArr = aj;
            i2 = ae - -1299641765;
            ae = i2;
            CharSequence charSequence = strArr[i2 * -1267697097];
            if (ej.af(charSequence, -1953603472)) {
                r0 = ll.aa(charSequence, 10, true, (byte) -26);
            }
            r2 = ik.ad(nr.cz, client.dv.ag, (byte) 64);
            r2.an.ay(r0, (short) 128);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (i == 157391912) {
            r0 = aj;
            r2 = ae - -1246602361;
            ae = r2;
            r0 = r0[r2 * -1267697097];
            r2 = ik.ad(nr.ck, client.dv.ag, (byte) 21);
            r2.an.an(r0.length() + 1, (byte) 31);
            r2.an.aq(r0, (byte) -110);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (-389604674 == i) {
            r0 = aj;
            r2 = ae - -1246602361;
            ae = r2;
            r0 = r0[r2 * -1267697097];
            r2 = ik.ad(nr.bc, client.dv.ag, (byte) 11);
            r2.an.an(r0.length() + 1, (byte) 31);
            r2.an.aq(r0, (byte) -46);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (3107 == i) {
            r0 = as;
            r2 = ar - 262375461;
            ar = r2;
            r0 = r0[r2 * 537618701];
            strArr = aj;
            i2 = ae - -1246602361;
            ae = i2;
            nv.eu(r0, strArr[i2 * -1267697097], (byte) 126);
            return 1;
        } else if (-284390598 == i) {
            ar -= 711305551;
            ex.fd(hv.ad(as[(ar * 537618701) + 2], 1333363834), as[877821444 * ar], as[(ar * 1425635068) + 1], -1936702677);
            return 1;
        } else if (i == 1098715310) {
            ac acVar;
            ar -= 1905859466;
            r2 = as[-1880238379 * ar];
            i2 = as[(ar * 537618701) + 1];
            if (z) {
                acVar = mn.ab;
            } else {
                acVar = at;
            }
            ex.fd(acVar, r2, i2, -607333217);
            return 1;
        } else if (i == -1614888946) {
            r2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            if (r2[i2 * 537618701] == 1) {
                z2 = true;
            }
            ay.bu = z2;
            return 1;
        } else if (3111 == i) {
            r2 = as;
            i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            if (cs.oj.an) {
                z2 = true;
            }
            r2[i2] = z2;
            return 1;
        } else if (i == 3112) {
            gj gjVar = cs.oj;
            r3 = as;
            r4 = ar - -16802562;
            ar = r4;
            if (r3[r4 * -1704434607] == 1) {
                z2 = true;
            }
            gjVar.an = z2;
            co.aa(-773961319);
            return 1;
        } else if (i == 3113) {
            boolean z3;
            strArr = aj;
            i2 = ae - 396723836;
            ae = i2;
            r3 = strArr[i2 * -1267697097];
            r2 = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (r2[r4 * 537618701] == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            js.ad(r3, z3, false, (byte) 14);
            return 1;
        } else if (-1273923796 == i) {
            r0 = as;
            r2 = ar - 426730601;
            ar = r2;
            r0 = r0[r2 * -1364912829];
            r2 = ik.ad(nr.ba, client.dv.ag, (byte) 3);
            r2.an.aa(r0, -1752508204);
            client.dv.an(r2, (short) 255);
            return 1;
        } else if (1632997921 == i) {
            r0 = as;
            r2 = ar - -1363493497;
            ar = r2;
            r0 = r0[r2 * 537618701];
            ae -= -882377786;
            String str = aj[-388661531 * ae];
            r3 = aj[(ae * -1267697097) + 1];
            if (str.length() > 500 || r3.length() > 1410036255) {
                return 1;
            }
            no ad = ik.ad(nr.co, client.dv.ag, (byte) 54);
            ad.an.aa((hz.ae(str, -730449741) + 1) + hz.ae(r3, -445549660), -1752508204);
            ad.an.aq(r3, (byte) -74);
            ad.an.an(r0, (byte) 31);
            ad.an.aq(str, (byte) -99);
            client.dv.an(ad, (short) 255);
            return 1;
        } else if (i == 3117) {
            r2 = nq.ii;
            r3 = as;
            r4 = ar - -1478738320;
            ar = r4;
            if (r3[r4 * 662926746] == 1) {
                z2 = true;
            }
            r2.cy(z2, -1284347001);
            return 1;
        } else if (3118 == i) {
            r2 = nq.ii;
            r3 = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (r3[r4 * -1895168705] == 1) {
                z2 = true;
            }
            r2.co = z2;
            return 1;
        } else if (i == 3119) {
            r2 = as;
            i2 = ar - -80608205;
            ar = i2;
            if (r2[i2 * 1826156992] == 1) {
                z2 = true;
            }
            client.hh = z2;
            return 1;
        } else if (i == 3120) {
            r0 = as;
            r2 = ar - -1194553915;
            ar = r2;
            if (r0[r2 * -934602224] == 1) {
                client.ir = 213563641 * ((client.ir * 1424263497) | 1);
                return 1;
            }
            client.ir = 213563641 * ((1424263497 * client.ir) & -2);
            return 1;
        } else if (i == 3121) {
            r0 = as;
            r2 = ar - -1498690551;
            ar = r2;
            if (r0[r2 * 340902191] == 1) {
                client.ir = 213563641 * ((client.ir * 1424263497) | 2);
                return 1;
            }
            client.ir = ((-1451137936 * client.ir) & -3) * 213563641;
            return 1;
        } else if (i == 3122) {
            r0 = as;
            r2 = ar - -1194553915;
            ar = r2;
            if (r0[r2 * -272849554] == 1) {
                client.ir = 1705213515 * ((client.ir * 527966598) | 4);
                return 1;
            }
            client.ir = ((client.ir * 307884747) & -5) * -806874138;
            return 1;
        } else if (i == 3123) {
            r0 = as;
            r2 = ar - -2089120149;
            ar = r2;
            if (r0[r2 * -546727388] == 1) {
                client.ir = 1429956437 * ((-144579153 * client.ir) | 8);
                return 1;
            }
            client.ir = ((client.ir * -1343082360) & -9) * 213563641;
            return 1;
        } else if (857052209 == i) {
            client.ir = 0;
            return 1;
        } else if (i == -1389828627) {
            r2 = as;
            i2 = ar - 712062225;
            ar = i2;
            if (r2[i2 * 537618701] == 1) {
                z2 = true;
            }
            client.hy = z2;
            return 1;
        } else if (1214727079 == i) {
            r2 = as;
            i2 = ar - 1159992019;
            ar = i2;
            if (r2[i2 * 1586491414] == 1) {
                z2 = true;
            }
            client.hp = z2;
            return 1;
        } else if (392326526 == i) {
            r2 = nq.ii;
            r3 = as;
            r4 = ar - -395605969;
            ar = r4;
            if (r3[r4 * 1925164329] == 1) {
                z2 = true;
            }
            r2.ck(z2, (byte) 6);
            return 1;
        } else if (3128 == i) {
            r2 = as;
            i2 = ar + 668938702;
            ar = i2;
            i2 = (i2 * -291137458) - 1;
            if (nq.ii.cl(1693428806)) {
                z2 = true;
            }
            r2[i2] = z2;
            return 1;
        } else if (3129 == i) {
            ar -= 1905859466;
            client.gn = -1557400196 * as[ar * 537618701];
            client.ge = as[(ar * -1109250475) + 1] * 1258156105;
            return 1;
        } else if (3130 == i) {
            ar -= 1943124127;
            r2 = as[ar * -1468302260];
            if (1 == as[(-610044264 * ar) + 1]) {
                z2 = true;
            }
            nq.ii.cs(r2, z2, 1829547545);
            return 1;
        } else if (i == 3131) {
            r2 = as;
            i2 = ar - -1194553915;
            ar = i2;
            if (r2[i2 * 2061739620] == 1) {
                z2 = true;
            }
            nq.ii.cd(z2, -107858092);
            return 1;
        } else if (-1062750140 != i) {
            return 2;
        } else {
            r0 = as;
            r2 = ar - 1062294958;
            ar = r2;
            r0[(r2 * 587841043) - 1] = ds.rg * -1946576867;
            r0 = as;
            r2 = ar - 1962439799;
            ar = r2;
            r0[(r2 * 973947456) - 1] = af.ru * 1308893036;
            return 1;
        }
    }

    static int cv(int i, gk gkVar, boolean z) {
        if (-287012744 == i) {
            ar -= 1020032301;
            em.bu(as[1221032437 * ar], as[(ar * 537618701) + 1], as[(ar * -1996978601) + 2], -1562186178);
            return 1;
        } else if (-207986655 == i) {
            int[] iArr = as;
            r1 = ar - 935706424;
            ar = r1;
            r0 = iArr[r1 * 537618701];
            if (-1 == r0 && !client.me) {
                mx.an((byte) 73);
            } else if (!(r0 == -1 || 2115268781 * client.mx == r0 || client.mk * -1819605895 == 0 || client.me)) {
                kf kfVar = client.bo;
                int i2 = client.mk * -1819605895;
                mf.ag = -734138154;
                ex.ay = kfVar;
                ml.as = -1919717083 * r0;
                mf.ar = 0;
                ci.aj = 1634727746 * i2;
                gm.aq = false;
                cb.ae = -1566667469;
            }
            client.mx = r0 * -541914011;
            return 1;
        } else if (i != 3202) {
            return 2;
        } else {
            ar -= -1620888673;
            r1 = as[ar * -1105031955];
            r0 = as[(ar * 2016582817) + 1];
            if (!(client.mk * -1819605895 == 0 || r1 == -1)) {
                ao.ad(ds.cy, r1, 0, client.mk * -1819605895, false, -1213370980);
                client.me = true;
            }
            return 1;
        }
    }

    static int cc(int i, gk gkVar, boolean z) {
        int i2 = -1;
        int[] iArr;
        if (i == 3300) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = client.ak * 1581849891;
            return 1;
        } else if (i == 3301) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            r3 = as[(ar * 537618701) + 1];
            r4 = as;
            r5 = ar - 1194553915;
            ar = r5;
            r5 = (r5 * 537618701) - 1;
            r0 = (ho) ho.af.af((long) r0);
            if (r0 == null) {
                r0 = -1;
            } else if (r3 < 0 || r3 >= r0.ad.length) {
                r0 = -1;
            } else {
                r0 = r0.ad[r3];
            }
            r4[r5] = r0;
            return 1;
        } else if (3302 == i) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            i2 = as[(ar * 537618701) + 1];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r3[(r4 * 537618701) - 1] = ag.af(r0, i2, -2122722976);
            return 1;
        } else if (i == 3303) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            i2 = as[(ar * 537618701) + 1];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r3[(r4 * 537618701) - 1] = bp.ad(r0, i2, 2109708550);
            return 1;
        } else if (i == 3304) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = fa.ad(r0, (byte) -30).an * -408205527;
            return 1;
        } else if (3305 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = client.iu[r0];
            return 1;
        } else if (3306 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = client.f2if[r0];
            return 1;
        } else if (i == 3307) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = client.iy[r0];
            return 1;
        } else if (i == 3308) {
            r0 = dq.hf * -1674539149;
            i2 = ((gf.ho.bg * 516759209) >> 7) + (bq.du * 1407993063);
            r3 = ((gf.ho.bh * 2328865) >> 7) + (1289967967 * gl.dp);
            r4 = as;
            r5 = ar - 1194553915;
            ar = r5;
            r4[(r5 * 537618701) - 1] = ((r0 << 28) + (i2 << 14)) + r3;
            return 1;
        } else if (3309 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = (r0 >> 14) & 16383;
            return 1;
        } else if (i == 3310) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = r0 >> 28;
            return 1;
        } else if (i == 3311) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = r0 & 16383;
            return 1;
        } else if (i == 3312) {
            r1 = as;
            r0 = ar - 1194553915;
            ar = r0;
            r1[(r0 * 537618701) - 1] = client.aj ? 1 : 0;
            return 1;
        } else if (i == 3313) {
            ar -= 1905859466;
            r0 = as[ar * 537618701] + 32768;
            r3 = as[(ar * 537618701) + 1];
            r4 = as;
            r5 = ar - 1194553915;
            ar = r5;
            r5 = (r5 * 537618701) - 1;
            r0 = (ho) ho.af.af((long) r0);
            if (r0 != null && r3 >= 0 && r3 < r0.ad.length) {
                i2 = r0.ad[r3];
            }
            r4[r5] = i2;
            return 1;
        } else if (i == 3314) {
            ar -= 1905859466;
            r0 = as[ar * 537618701] + 32768;
            i2 = as[(ar * 537618701) + 1];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r3[(r4 * 537618701) - 1] = ag.af(r0, i2, -1606886351);
            return 1;
        } else if (3315 == i) {
            ar -= 1905859466;
            r0 = as[ar * 537618701] + 32768;
            i2 = as[(ar * 537618701) + 1];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r3[(r4 * 537618701) - 1] = bp.ad(r0, i2, 1217962947);
            return 1;
        } else if (3316 == i) {
            if (client.jc * -2036797811 >= 2) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = client.jc * -2036797811;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            return 1;
        } else if (3317 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -659341571 * client.bc;
            return 1;
        } else if (3318 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = client.an * -1304916389;
            return 1;
        } else if (i == 3321) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -28768771 * client.jx;
            return 1;
        } else if (i == 3322) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = client.ji * 392548631;
            return 1;
        } else if (3323 == i) {
            if (client.jl) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = 1;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            return 1;
        } else if (3324 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = client.aa * 1164415301;
            return 1;
        } else if (3325 != i) {
            return 2;
        } else {
            ar -= -483248364;
            r0 = ((as[ar * 537618701] + (as[(ar * 537618701) + 1] << 14)) + (as[(ar * 537618701) + 2] << 28)) + as[(ar * 537618701) + 3];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = r0;
            return 1;
        }
    }

    static int ci(int i, gk gkVar, boolean z) {
        int i2 = -1;
        int[] iArr;
        if (i == 3300) {
            iArr = as;
            i2 = ar - 1235005853;
            ar = i2;
            iArr[(i2 * -1784477734) - 1] = client.ak * 1581849891;
            return 1;
        } else if (i == 3301) {
            ar -= 842640160;
            r0 = as[ar * -107807270];
            r3 = as[(ar * 537618701) + 1];
            r4 = as;
            r5 = ar - 1194553915;
            ar = r5;
            r5 = (r5 * 2139089110) - 1;
            r0 = (ho) ho.af.af((long) r0);
            if (r0 == null) {
                r0 = -1;
            } else if (r3 < 0 || r3 >= r0.ad.length) {
                r0 = -1;
            } else {
                r0 = r0.ad[r3];
            }
            r4[r5] = r0;
            return 1;
        } else if (3302 == i) {
            ar -= -35408527;
            r0 = as[ar * -555291948];
            i2 = as[(-1228714381 * ar) + 1];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r3[(r4 * -171135686) - 1] = ag.af(r0, i2, -578963960);
            return 1;
        } else if (i == 3303) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            i2 = as[(ar * 537618701) + 1];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r3[(r4 * 537618701) - 1] = bp.ad(r0, i2, 1642561598);
            return 1;
        } else if (i == -1566635516) {
            iArr = as;
            i2 = ar - -2064570284;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = fa.ad(r0, (byte) -92).an * -408205527;
            return 1;
        } else if (1666596986 == i) {
            iArr = as;
            i2 = ar - -2082525047;
            ar = i2;
            r0 = iArr[i2 * 930920652];
            r1 = as;
            r3 = ar + 150835035;
            ar = r3;
            r1[(r3 * 537618701) - 1] = client.iu[r0];
            return 1;
        } else if (-2071508279 == i) {
            iArr = as;
            i2 = ar - -803761450;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar + 1572967805;
            ar = r3;
            r1[(r3 * 537618701) - 1] = client.f2if[r0];
            return 1;
        } else if (i == -1005392689) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * -384117311];
            r1 = as;
            r3 = ar - 1139816512;
            ar = r3;
            r1[(r3 * 537618701) - 1] = client.iy[r0];
            return 1;
        } else if (i == 3308) {
            r0 = dq.hf * -2019340959;
            i2 = ((gf.ho.bg * -174069007) >> 7) + (bq.du * 1407993063);
            r3 = ((gf.ho.bh * 2328865) >> 7) + (2018555913 * gl.dp);
            r4 = as;
            r5 = ar - 1911093223;
            ar = r5;
            r4[(r5 * 537618701) - 1] = ((r0 << 28) + (i2 << 14)) + r3;
            return 1;
        } else if (3309 == i) {
            iArr = as;
            i2 = ar - 1371109420;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = (r0 >> 14) & 123988984;
            return 1;
        } else if (i == 1058883676) {
            iArr = as;
            i2 = ar - 214659831;
            ar = i2;
            r0 = iArr[i2 * 692317785];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * -829922050) - 1] = r0 >> 28;
            return 1;
        } else if (i == 923782673) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 847755553];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 1551277748) - 1] = r0 & 16383;
            return 1;
        } else if (i == 1439889070) {
            r1 = as;
            r0 = ar + 1895668845;
            ar = r0;
            r1[(r0 * 537618701) - 1] = client.aj ? 1 : 0;
            return 1;
        } else if (i == 1093302870) {
            ar -= 1905859466;
            r0 = as[ar * 537618701] + 32768;
            r3 = as[(ar * 1572246078) + 1];
            r4 = as;
            r5 = ar - 1194553915;
            ar = r5;
            r5 = (r5 * -1507921733) - 1;
            r0 = (ho) ho.af.af((long) r0);
            if (r0 != null) {
                if (r3 >= 0 && r3 < r0.ad.length) {
                    i2 = r0.ad[r3];
                }
            }
            r4[r5] = i2;
            return 1;
        } else if (i == 861453087) {
            ar -= 1905859466;
            r0 = as[1008107457 * ar] + 32768;
            i2 = as[(ar * -555009043) + 1];
            r3 = as;
            r4 = ar + 1094797215;
            ar = r4;
            r3[(r4 * 537618701) - 1] = ag.af(r0, i2, -187173969);
            return 1;
        } else if (3315 == i) {
            ar -= 1905859466;
            r0 = as[-933659544 * ar] + 32768;
            i2 = as[(ar * 537618701) + 1];
            r3 = as;
            r4 = ar - 1325351694;
            ar = r4;
            r3[(r4 * 537618701) - 1] = bp.ad(r0, i2, 1858027395);
            return 1;
        } else if (-1477857730 == i) {
            if (client.jc * 584317047 >= 2) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = client.jc * -2036797811;
                return 1;
            }
            iArr = as;
            i2 = ar - 723768802;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            return 1;
        } else if (3317 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -659341571 * client.bc;
            return 1;
        } else if (3318 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 1481623601) - 1] = client.an * -2011211603;
            return 1;
        } else if (i == 3321) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -28768771 * client.jx;
            return 1;
        } else if (i == 3322) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 1319832389) - 1] = client.ji * -626982563;
            return 1;
        } else if (-1653069880 == i) {
            if (client.jl) {
                iArr = as;
                i2 = ar - 2023980801;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = 1;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            return 1;
        } else if (851713785 == i) {
            iArr = as;
            i2 = ar + 2014003070;
            ar = i2;
            iArr[(i2 * -2091922815) - 1] = client.aa * 1920818514;
            return 1;
        } else if (1777989949 != i) {
            return 2;
        } else {
            ar -= 814304025;
            r0 = ((as[ar * 537618701] + (as[(ar * 766243172) + 1] << 14)) + (as[(ar * -671686891) + 2] << 28)) + as[(1577057563 * ar) + 3];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 367375102) - 1] = r0;
            return 1;
        }
    }

    static int co(int i, gk gkVar, boolean z) {
        int i2 = 0;
        int i3 = -1;
        int[] iArr;
        if (i == 3300) {
            iArr = as;
            i3 = ar - 1194553915;
            ar = i3;
            iArr[(i3 * 1790610553) - 1] = client.ak * 78499482;
            return 1;
        } else if (i == 1395563763) {
            ar -= 1905859466;
            i2 = as[ar * 579937345];
            r3 = as[(1396811946 * ar) + 1];
            r4 = as;
            r5 = ar - 1072409736;
            ar = r5;
            r5 = (r5 * 537618701) - 1;
            r0 = (ho) ho.af.af((long) i2);
            if (r0 == null) {
                i2 = -1;
            } else if (r3 < 0 || r3 >= r0.ad.length) {
                i2 = -1;
            } else {
                i2 = r0.ad[r3];
            }
            r4[r5] = i2;
            return 1;
        } else if (294056897 == i) {
            ar -= 1905859466;
            i2 = as[ar * 537618701];
            i3 = as[(ar * 537618701) + 1];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r3[(r4 * 537618701) - 1] = ag.af(i2, i3, -1658575385);
            return 1;
        } else if (i == 3303) {
            ar -= 1905859466;
            i2 = as[-129300801 * ar];
            i3 = as[(ar * 537618701) + 1];
            r3 = as;
            r4 = ar + 1644223361;
            ar = r4;
            r3[(r4 * 611541490) - 1] = bp.ad(i2, i3, 1373980908);
            return 1;
        } else if (i == 583995244) {
            iArr = as;
            i3 = ar - -1364040999;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            r1 = as;
            r3 = ar + 901079353;
            ar = r3;
            r1[(r3 * 815688554) - 1] = fa.ad(i2, (byte) -89).an * -980731731;
            return 1;
        } else if (-1371798092 == i) {
            iArr = as;
            i3 = ar - -1868032612;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 2018118307) - 1] = client.iu[i2];
            return 1;
        } else if (3306 == i) {
            iArr = as;
            i3 = ar - -477057334;
            ar = i3;
            i2 = iArr[i3 * 1943229229];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 446153780) - 1] = client.f2if[i2];
            return 1;
        } else if (i == 3307) {
            iArr = as;
            i3 = ar - 865226781;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * -1273427963) - 1] = client.iy[i2];
            return 1;
        } else if (i == -230411862) {
            i2 = dq.hf * 1044452921;
            i3 = ((gf.ho.bg * 1796951273) >> 7) + (bq.du * -1590778596);
            r3 = ((gf.ho.bh * 2328865) >> 7) + (1289967967 * gl.dp);
            r4 = as;
            r5 = ar - 1634340777;
            ar = r5;
            r4[(r5 * -1300679304) - 1] = ((i2 << 28) + (i3 << 14)) + r3;
            return 1;
        } else if (3309 == i) {
            iArr = as;
            i3 = ar - 1588383775;
            ar = i3;
            i2 = iArr[i3 * -1710665958];
            r1 = as;
            r3 = ar + 1658412568;
            ar = r3;
            r1[(r3 * -478526104) - 1] = (i2 >> 14) & 340285081;
            return 1;
        } else if (i == -903380263) {
            iArr = as;
            i3 = ar - -1003881308;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = i2 >> 28;
            return 1;
        } else if (i == 3311) {
            iArr = as;
            i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * -1215125633];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = i2 & 16383;
            return 1;
        } else if (i == 2047847153) {
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r3 = (r3 * 537618701) - 1;
            if (client.aj) {
                i2 = 1;
            }
            r1[r3] = i2;
            return 1;
        } else if (i == 3313) {
            ar -= 964176959;
            i2 = as[ar * 537618701] + 1258437867;
            r3 = as[(ar * 1301890610) + 1];
            r4 = as;
            r5 = ar - 1194553915;
            ar = r5;
            r5 = (r5 * 537618701) - 1;
            r0 = (ho) ho.af.af((long) i2);
            if (r0 != null && r3 >= 0 && r3 < r0.ad.length) {
                i3 = r0.ad[r3];
            }
            r4[r5] = i3;
            return 1;
        } else if (i == -788553087) {
            ar -= -81465654;
            i2 = as[1874505109 * ar] - 1828381412;
            i3 = as[(ar * -533807733) + 1];
            r3 = as;
            r4 = ar + 1865293856;
            ar = r4;
            r3[(r4 * 537618701) - 1] = ag.af(i2, i3, 209778143);
            return 1;
        } else if (-931679656 == i) {
            ar -= -1326853824;
            i2 = as[-2113016086 * ar] - 1336727617;
            i3 = as[(685595505 * ar) + 1];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r3[(r4 * 537618701) - 1] = bp.ad(i2, i3, 2052951427);
            return 1;
        } else if (3316 == i) {
            if (client.jc * -2036797811 >= 2) {
                iArr = as;
                i3 = ar - 1194553915;
                ar = i3;
                iArr[(i3 * -741344145) - 1] = client.jc * -2036797811;
                return 1;
            }
            r1 = as;
            r3 = ar + 50424720;
            ar = r3;
            r1[(r3 * 537618701) - 1] = 0;
            return 1;
        } else if (1487273303 == i) {
            iArr = as;
            i3 = ar + 2144154231;
            ar = i3;
            iArr[(i3 * -1758894376) - 1] = -659341571 * client.bc;
            return 1;
        } else if (1355959476 == i) {
            iArr = as;
            i3 = ar + 2019308707;
            ar = i3;
            iArr[(i3 * -307534782) - 1] = client.an * -124152861;
            return 1;
        } else if (i == 74564323) {
            iArr = as;
            i3 = ar - 1194553915;
            ar = i3;
            iArr[(i3 * 537618701) - 1] = -28768771 * client.jx;
            return 1;
        } else if (i == 1175834186) {
            iArr = as;
            i3 = ar - 1600092445;
            ar = i3;
            iArr[(i3 * 672306987) - 1] = client.ji * 1199436251;
            return 1;
        } else if (3323 == i) {
            if (client.jl) {
                iArr = as;
                i3 = ar - 1194553915;
                ar = i3;
                iArr[(i3 * 537618701) - 1] = 1;
                return 1;
            }
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = 0;
            return 1;
        } else if (3324 == i) {
            iArr = as;
            i3 = ar - 1194553915;
            ar = i3;
            iArr[(i3 * 537618701) - 1] = client.aa * 1164415301;
            return 1;
        } else if (3325 != i) {
            return 2;
        } else {
            ar -= 1220951805;
            i2 = ((as[ar * -909257124] + (as[(ar * 537618701) + 1] << 14)) + (as[(ar * 537618701) + 2] << 28)) + as[(ar * 537618701) + 3];
            r1 = as;
            r3 = ar + 262107402;
            ar = r3;
            r1[(r3 * 1564089861) - 1] = i2;
            return 1;
        }
    }

    static int ck(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        if (-1297614677 == i) {
            if (dm.ow.as * -1211745851 == 0) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = 855905528;
                return 1;
            } else if (-1211745851 * dm.ow.as == 1) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 378474664) - 1] = -1;
                return 1;
            } else {
                iArr = as;
                i2 = ar + 2046014506;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = dm.ow.ag.ad(1773870743);
                return 1;
            }
        } else if (3601 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 1027530262];
            if (!dm.ow.af(2130647203) || r0 < 0 || r0 >= dm.ow.ag.ad(1998751696)) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * 1180280646) - 1] = "";
                r0 = aj;
                i2 = ae + 1465861461;
                ae = i2;
                r0[(i2 * 58881128) - 1] = "";
                return 1;
            }
            ei eiVar = (ei) dm.ow.ag.am(r0, -111822009);
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * 1658171177) - 1] = eiVar.aj((byte) -57);
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * -2122480592) - 1] = eiVar.ae((byte) -1);
            return 1;
        } else if (i == 3602) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 1242822101];
            if (!dm.ow.af(2145843369) || r0 < 0 || r0 >= dm.ow.ag.ad(1227556068)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * -53114437) - 1] = 0;
                return 1;
            }
            r2 = as;
            r3 = ar - 702272243;
            ar = r3;
            r2[(r3 * 1805614193) - 1] = ((ez) dm.ow.ag.am(r0, 1929467084)).ag * -1161455169;
            return 1;
        } else if (28777835 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (!dm.ow.af(2134311347) || r0 < 0 || r0 >= dm.ow.ag.ad(1780386194)) {
                iArr = as;
                r3 = ar + 1046573549;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r2 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r2[(r3 * -55314782) - 1] = ((ez) dm.ow.ag.am(r0, -42578265)).as * 1598845212;
            return 1;
        } else if (i == 3604) {
            r0 = aj;
            i2 = ae - -359232846;
            ae = i2;
            r0 = r0[i2 * -1267697097];
            r2 = as;
            r3 = ar - 1145459495;
            ar = r3;
            i2 = r2[r3 * 537618701];
            no ad = ik.ad(nr.bi, client.dv.ag, (byte) -43);
            ad.an.an(hz.ae(r0, 1238976728) + 1, (byte) 31);
            ad.an.bd(i2, 1703184995);
            ad.an.aq(r0, Byte.MIN_VALUE);
            client.dv.an(ad, (short) 255);
            return 1;
        } else if (-100772504 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            dm.ow.ar(r0[i2 * 702008767], (byte) -51);
            return 1;
        } else if (1247078626 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            dm.ow.ak(r0[i2 * -1267697097], -1512304095);
            return 1;
        } else if (3607 == i) {
            r0 = aj;
            i2 = ae - -771647940;
            ae = i2;
            dm.ow.aw(r0[i2 * -482009310], 1495663750);
            return 1;
        } else if (3608 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            dm.ow.ao(r0[i2 * -1267697097], -1862398429);
            return 1;
        } else if (i == 3609) {
            r0 = aj;
            r3 = ae - 871764335;
            ae = r3;
            r0 = cq.gg(r0[r3 * 468934902], -292013008);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 1268766362) - 1;
            if (dm.ow.ay(new ey(r0, hn.ar), false, -889911197)) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (i == -2024446699) {
            if (df.my != null) {
                r0 = aj;
                i2 = ae - 223507966;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = df.my.ae;
                return 1;
            }
            r0 = aj;
            i2 = ae - 1281910559;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = "";
            return 1;
        } else if (3612 == i) {
            if (df.my != null) {
                iArr = as;
                i2 = ar - 1309337017;
                ar = i2;
                iArr[(i2 * -1120805237) - 1] = df.my.ad(1708695747);
                return 1;
            }
            iArr = as;
            r3 = ar - 2111860823;
            ar = r3;
            iArr[(r3 * 537618701) - 1] = 0;
            return 1;
        } else if (i == 3613) {
            iArr = as;
            i2 = ar - 1265707530;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1201202126)) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * 1817210817) - 1] = df.my.am(r0, 1147906357).ar(1838004125).af(-1348322271);
            return 1;
        } else if (i == 3614) {
            iArr = as;
            r3 = ar - 595236671;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1869992695)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r2 = as;
            r3 = ar - 1827236689;
            ar = r3;
            r2[(r3 * -98471898) - 1] = ((ez) df.my.am(r0, 2108697232)).by((byte) -39);
            return 1;
        } else if (-1316568568 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 384771369];
            if (df.my == null || r0 >= df.my.ad(1572613325)) {
                iArr = as;
                r3 = ar + 671263075;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r2 = as;
            r3 = ar - 365591603;
            ar = r3;
            r2[(r3 * 1344217618) - 1] = ((ez) df.my.am(r0, 924147339)).as * -1055111740;
            return 1;
        } else if (i == 1306388153) {
            iArr = as;
            r3 = ar - 1194553915;
            ar = r3;
            r3 = (r3 * 537618701) - 1;
            if (df.my != null) {
                z2 = df.my.am;
            }
            iArr[r3] = z2;
            return 1;
        } else if (3617 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            da.fx(r0[i2 * -1267697097], 487356334);
            return 1;
        } else if (i == 1535157330) {
            iArr = as;
            r3 = ar - 1194553915;
            ar = r3;
            r3 = (r3 * 537618701) - 1;
            if (df.my != null) {
                z2 = df.my.at * true;
            }
            iArr[r3] = z2;
            return 1;
        } else if (3619 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            ab.ft(r0[i2 * -1267697097], (byte) 4);
            return 1;
        } else if (1652089165 == i) {
            no ad2 = ik.ad(nr.bs, client.dv.ag, (byte) -22);
            ad2.an.an(0, (byte) 31);
            client.dv.an(ad2, (short) 255);
            return 1;
        } else if (1278543129 == i) {
            if (dm.ow.af(2128544391)) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 438014208) - 1] = dm.ow.ay.ad(1353054623);
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * -577212892) - 1] = -1;
            return 1;
        } else if (3622 == i) {
            iArr = as;
            i2 = ar - -1198393448;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            if (!dm.ow.af(2147009239) || r0 < 0 || r0 >= dm.ow.ay.ad(1619021377)) {
                r0 = aj;
                i2 = ae + 344583304;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            ef efVar = (ef) dm.ow.ay.am(r0, 277319274);
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * 1365961097) - 1] = efVar.aj((byte) -29);
            r2 = aj;
            r3 = ae + 1540582260;
            ae = r3;
            r2[(r3 * -1267697097) - 1] = efVar.ae((byte) -1);
            return 1;
        } else if (i == 109828534) {
            r0 = aj;
            r3 = ae - -1246602361;
            ae = r3;
            r0 = cq.gg(r0[r3 * 1600276449], 2141812703);
            r3 = as;
            r4 = ar - 1548170549;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (dm.ow.as(new ey(r0, hn.ar), (byte) -12)) {
                r0 = 1;
            } else {
                boolean z3 = false;
            }
            r3[r4] = r0;
            return 1;
        } else if (i == 967076826) {
            iArr = as;
            r3 = ar - 885409267;
            ar = r3;
            r0 = iArr[r3 * -2012413986];
            if (df.my == null || r0 >= df.my.ad(1418698946) || !df.my.am(r0, -74873356).ar(2136893101).equals(gf.ho.af)) {
                iArr = as;
                r3 = ar + 8694945;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 89866724) - 1] = 1;
            return 1;
        } else if (i == -165198104) {
            if (df.my == null || df.my.aq == null) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = df.my.aq;
            return 1;
        } else if (3626 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 231774437];
            if (df.my == null || r0 >= df.my.ad(1107716384) || !((ed) df.my.am(r0, 544839444)).an((byte) 87)) {
                iArr = as;
                r3 = ar + 7889855;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            iArr = as;
            i2 = ar + 989289464;
            ar = i2;
            iArr[(i2 * -1785095586) - 1] = 1;
            return 1;
        } else if (i == 3627) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1980145743) || !((ed) df.my.am(r0, 669493504)).bw(1799209702)) {
                iArr = as;
                r3 = ar + 1456848866;
                ar = r3;
                iArr[(r3 * -1655422876) - 1] = 0;
                return 1;
            }
            iArr = as;
            i2 = ar - 142049742;
            ar = i2;
            iArr[(i2 * 1051878527) - 1] = 1;
            return 1;
        } else if (i == 3628) {
            dm.ow.ag.au(6730569);
            return 1;
        } else if (i == 1870121215) {
            iArr = as;
            r3 = ar - 1050477592;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new lo(z2), (byte) 1);
            return 1;
        } else if (3630 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 1036881252] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new lm(z2), (byte) 1);
            return 1;
        } else if (3631 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cp(z2), (byte) 1);
            return 1;
        } else if (i == 250000445) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cr(z2), (byte) 1);
            return 1;
        } else if (1166082827 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 1118354662] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cw(z2), (byte) 1);
            return 1;
        } else if (38307178 == i) {
            iArr = as;
            r3 = ar - 1723074616;
            ar = r3;
            if (iArr[r3 * -280926950] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cb(z2), (byte) 1);
            return 1;
        } else if (-112235548 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cf(z2), (byte) 1);
            return 1;
        } else if (i == 3636) {
            iArr = as;
            r3 = ar - -337298846;
            ar = r3;
            if (iArr[r3 * -1733434282] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cg(z2), (byte) 1);
            return 1;
        } else if (i == 3637) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * -1904196949] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new ce(z2), (byte) 1);
            return 1;
        } else if (-1439895399 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cz(z2), (byte) 1);
            return 1;
        } else if (627861313 == i) {
            dm.ow.ag.at(1241064189);
            return 1;
        } else if (i == 3640) {
            dm.ow.ay.au(1138189767);
            return 1;
        } else if (3641 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ay.av(new lo(z2), (byte) 1);
            return 1;
        } else if (i == 3642) {
            iArr = as;
            r3 = ar - -1203799472;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ay.av(new lm(z2), (byte) 1);
            return 1;
        } else if (1121438628 == i) {
            dm.ow.ay.at(1241064189);
            return 1;
        } else if (3644 == i) {
            if (df.my == null) {
                return 1;
            }
            df.my.au(-695560403);
            return 1;
        } else if (-1181764213 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 322013206] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new lo(z2), (byte) 1);
            return 1;
        } else if (-347847831 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 2026997172] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new lm(z2), (byte) 1);
            return 1;
        } else if (i == 36978708) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cp(z2), (byte) 1);
            return 1;
        } else if (i == 3648) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * -1852644887] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cr(z2), (byte) 1);
            return 1;
        } else if (3649 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cw(z2), (byte) 1);
            return 1;
        } else if (3650 == i) {
            iArr = as;
            r3 = ar - -834843968;
            ar = r3;
            if (iArr[r3 * -1079579068] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cb(z2), (byte) 1);
            return 1;
        } else if (3651 == i) {
            iArr = as;
            r3 = ar - 945413366;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cf(z2), (byte) 1);
            return 1;
        } else if (3652 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cg(z2), (byte) 1);
            return 1;
        } else if (i == 3653) {
            iArr = as;
            r3 = ar - 1250261589;
            ar = r3;
            if (iArr[r3 * 1203482373] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new ce(z2), (byte) 1);
            return 1;
        } else if (3654 == i) {
            iArr = as;
            r3 = ar - 1547881759;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cz(z2), (byte) 1);
            return 1;
        } else if (3655 == i) {
            if (df.my == null) {
                return 1;
            }
            df.my.at(1241064189);
            return 1;
        } else if (i == 1150181556) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new ct(z2), (byte) 1);
            return 1;
        } else if (-1829803746 != i) {
            return 2;
        } else {
            iArr = as;
            r3 = ar - -1801489757;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new ct(z2), (byte) 1);
            return 1;
        }
    }

    static int cn(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        if (3600 == i) {
            if (dm.ow.as * -1211745851 == 0) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = -2;
                return 1;
            } else if (-1211745851 * dm.ow.as == 1) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = -1;
                return 1;
            } else {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = dm.ow.ag.ad(1771532498);
                return 1;
            }
        } else if (3601 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            if (!dm.ow.af(2143301677) || r0 < 0 || r0 >= dm.ow.ag.ad(1112741123)) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            ei eiVar = (ei) dm.ow.ag.am(r0, -95154298);
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * -1267697097) - 1] = eiVar.aj((byte) 30);
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * -1267697097) - 1] = eiVar.ae((byte) -1);
            return 1;
        } else if (i == 3602) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (!dm.ow.af(2138655732) || r0 < 0 || r0 >= dm.ow.ag.ad(1183336497)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r2 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r2[(r3 * 537618701) - 1] = ((ez) dm.ow.ag.am(r0, 1532362376)).ag * -1161455169;
            return 1;
        } else if (3603 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (!dm.ow.af(2145465257) || r0 < 0 || r0 >= dm.ow.ag.ad(2012438880)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r2 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r2[(r3 * 537618701) - 1] = ((ez) dm.ow.ag.am(r0, -97961238)).as * -533735695;
            return 1;
        } else if (i == 3604) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            r0 = r0[i2 * -1267697097];
            r2 = as;
            r3 = ar - -1194553915;
            ar = r3;
            i2 = r2[r3 * 537618701];
            no ad = ik.ad(nr.bi, client.dv.ag, (byte) 14);
            ad.an.an(hz.ae(r0, -859200405) + 1, (byte) 31);
            ad.an.bd(i2, 1703184995);
            ad.an.aq(r0, (byte) 95);
            client.dv.an(ad, (short) 255);
            return 1;
        } else if (3605 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            dm.ow.ar(r0[i2 * -1267697097], (byte) -36);
            return 1;
        } else if (3606 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            dm.ow.ak(r0[i2 * -1267697097], -1669905710);
            return 1;
        } else if (3607 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            dm.ow.aw(r0[i2 * -1267697097], 2072552404);
            return 1;
        } else if (3608 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            dm.ow.ao(r0[i2 * -1267697097], 889641322);
            return 1;
        } else if (i == 3609) {
            r0 = aj;
            r3 = ae - -1246602361;
            ae = r3;
            r0 = cq.gg(r0[r3 * -1267697097], -648450493);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (dm.ow.ay(new ey(r0, hn.ar), false, -889911197)) {
                r0 = 1;
            } else {
                boolean z3 = false;
            }
            r3[r4] = r0;
            return 1;
        } else if (i == 3611) {
            if (df.my != null) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = df.my.ae;
                return 1;
            }
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = "";
            return 1;
        } else if (3612 == i) {
            if (df.my != null) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = df.my.ad(2128774370);
                return 1;
            }
            iArr = as;
            r3 = ar - 1194553915;
            ar = r3;
            iArr[(r3 * 537618701) - 1] = 0;
            return 1;
        } else if (i == 3613) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1903146148)) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * -1267697097) - 1] = df.my.am(r0, 13921556).ar(2041882847).af(-1449189930);
            return 1;
        } else if (i == 3614) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1593178002)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r2 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r2[(r3 * 537618701) - 1] = ((ez) df.my.am(r0, -113803846)).by((byte) -18);
            return 1;
        } else if (3615 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1742011064)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r2 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r2[(r3 * 537618701) - 1] = ((ez) df.my.am(r0, 1240459375)).as * -533735695;
            return 1;
        } else if (i == 3616) {
            iArr = as;
            r3 = ar - 1194553915;
            ar = r3;
            r3 = (r3 * 537618701) - 1;
            if (df.my != null) {
                z2 = df.my.am;
            }
            iArr[r3] = z2;
            return 1;
        } else if (3617 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            da.fx(r0[i2 * -1267697097], -1492032523);
            return 1;
        } else if (i == 3618) {
            iArr = as;
            r3 = ar - 1194553915;
            ar = r3;
            r3 = (r3 * 537618701) - 1;
            if (df.my != null) {
                z2 = df.my.at * true;
            }
            iArr[r3] = z2;
            return 1;
        } else if (3619 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            ab.ft(r0[i2 * -1267697097], (byte) 94);
            return 1;
        } else if (3620 == i) {
            no ad2 = ik.ad(nr.bs, client.dv.ag, (byte) -43);
            ad2.an.an(0, (byte) 31);
            client.dv.an(ad2, (short) 255);
            return 1;
        } else if (3621 == i) {
            if (dm.ow.af(2126486924)) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = dm.ow.ay.ad(1092247204);
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -1;
            return 1;
        } else if (3622 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            if (!dm.ow.af(2134301386) || r0 < 0 || r0 >= dm.ow.ay.ad(2090318063)) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            ef efVar = (ef) dm.ow.ay.am(r0, 1466035655);
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * -1267697097) - 1] = efVar.aj((byte) -49);
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * -1267697097) - 1] = efVar.ae((byte) -1);
            return 1;
        } else if (i == 3623) {
            r0 = aj;
            r3 = ae - -1246602361;
            ae = r3;
            r0 = cq.gg(r0[r3 * -1267697097], 1649639898);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (dm.ow.as(new ey(r0, hn.ar), (byte) -19)) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (i == 3624) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1144620670) || !df.my.am(r0, 1393724332).ar(1850918761).equals(gf.ho.af)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 1;
            return 1;
        } else if (i == 3625) {
            if (df.my == null || df.my.aq == null) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = df.my.aq;
            return 1;
        } else if (3626 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1878325971) || !((ed) df.my.am(r0, 268308407)).an((byte) 12)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 1;
            return 1;
        } else if (i == 3627) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1873821705) || !((ed) df.my.am(r0, 945916339)).bw(1598162017)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 1;
            return 1;
        } else if (i == 3628) {
            dm.ow.ag.au(1073712267);
            return 1;
        } else if (i == 3629) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new lo(z2), (byte) 1);
            return 1;
        } else if (3630 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new lm(z2), (byte) 1);
            return 1;
        } else if (3631 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cp(z2), (byte) 1);
            return 1;
        } else if (i == 3632) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cr(z2), (byte) 1);
            return 1;
        } else if (3633 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cw(z2), (byte) 1);
            return 1;
        } else if (3634 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cb(z2), (byte) 1);
            return 1;
        } else if (3635 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cf(z2), (byte) 1);
            return 1;
        } else if (i == 3636) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cg(z2), (byte) 1);
            return 1;
        } else if (i == 3637) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new ce(z2), (byte) 1);
            return 1;
        } else if (3638 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cz(z2), (byte) 1);
            return 1;
        } else if (3639 == i) {
            dm.ow.ag.at(1241064189);
            return 1;
        } else if (i == 3640) {
            dm.ow.ay.au(-2125760298);
            return 1;
        } else if (3641 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ay.av(new lo(z2), (byte) 1);
            return 1;
        } else if (i == 3642) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ay.av(new lm(z2), (byte) 1);
            return 1;
        } else if (3643 == i) {
            dm.ow.ay.at(1241064189);
            return 1;
        } else if (3644 == i) {
            if (df.my == null) {
                return 1;
            }
            df.my.au(-1690532858);
            return 1;
        } else if (3645 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new lo(z2), (byte) 1);
            return 1;
        } else if (3646 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new lm(z2), (byte) 1);
            return 1;
        } else if (i == 3647) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cp(z2), (byte) 1);
            return 1;
        } else if (i == 3648) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cr(z2), (byte) 1);
            return 1;
        } else if (3649 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cw(z2), (byte) 1);
            return 1;
        } else if (3650 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cb(z2), (byte) 1);
            return 1;
        } else if (3651 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cf(z2), (byte) 1);
            return 1;
        } else if (3652 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cg(z2), (byte) 1);
            return 1;
        } else if (i == 3653) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new ce(z2), (byte) 1);
            return 1;
        } else if (3654 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cz(z2), (byte) 1);
            return 1;
        } else if (3655 == i) {
            if (df.my == null) {
                return 1;
            }
            df.my.at(1241064189);
            return 1;
        } else if (i == 3656) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new ct(z2), (byte) 1);
            return 1;
        } else if (3657 != i) {
            return 2;
        } else {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new ct(z2), (byte) 1);
            return 1;
        }
    }

    static int cy(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        if (3600 == i) {
            if (dm.ow.as * -1211745851 == 0) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * -467046028) - 1] = 876925284;
                return 1;
            } else if (1943219422 * dm.ow.as == 1) {
                iArr = as;
                i2 = ar + 320316995;
                ar = i2;
                iArr[(i2 * -1170600057) - 1] = -1;
                return 1;
            } else {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = dm.ow.ag.ad(1949752177);
                return 1;
            }
        } else if (3601 == i) {
            iArr = as;
            i2 = ar - -1351509451;
            ar = i2;
            r0 = iArr[i2 * 796177992];
            if (!dm.ow.af(2141771458) || r0 < 0 || r0 >= dm.ow.ag.ad(1662792619)) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                r0 = aj;
                i2 = ae - 1880231430;
                ae = i2;
                r0[(i2 * -25313481) - 1] = "";
                return 1;
            }
            ei eiVar = (ei) dm.ow.ag.am(r0, 1857625353);
            r1 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r1[(r3 * 1236178409) - 1] = eiVar.aj((byte) -12);
            r1 = aj;
            r3 = ae + 157225499;
            ae = r3;
            r1[(r3 * 1241064189) - 1] = eiVar.ae((byte) -1);
            return 1;
        } else if (i == 3602) {
            iArr = as;
            r3 = ar - 1266910376;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (!dm.ow.af(2139823514) || r0 < 0 || r0 >= dm.ow.ag.ad(1806874550)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 645263813) - 1] = ((ez) dm.ow.ag.am(r0, 543043014)).ag * -1161455169;
            return 1;
        } else if (3603 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * -740453027];
            if (!dm.ow.af(2133241903) || r0 < 0 || r0 >= dm.ow.ag.ad(1528152672)) {
                iArr = as;
                r3 = ar + 1990332210;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 537618701) - 1] = ((ez) dm.ow.ag.am(r0, 23142955)).as * -533735695;
            return 1;
        } else if (i == 3604) {
            r0 = aj;
            i2 = ae - -1495012347;
            ae = i2;
            r0 = r0[i2 * 653574902];
            r1 = as;
            r3 = ar - -1194553915;
            ar = r3;
            i2 = r1[r3 * 537618701];
            no ad = ik.ad(nr.bi, client.dv.ag, (byte) 27);
            ad.an.an(hz.ae(r0, 269060355) + 1, (byte) 31);
            ad.an.bd(i2, 1703184995);
            ad.an.aq(r0, (byte) 33);
            client.dv.an(ad, (short) 255);
            return 1;
        } else if (3605 == i) {
            r0 = aj;
            i2 = ae - 1839704103;
            ae = i2;
            dm.ow.ar(r0[i2 * -1267697097], (byte) -48);
            return 1;
        } else if (3606 == i) {
            r0 = aj;
            i2 = ae - -910073670;
            ae = i2;
            dm.ow.ak(r0[i2 * -1267697097], -1721481581);
            return 1;
        } else if (-919836359 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            dm.ow.aw(r0[i2 * -1267697097], 1160668496);
            return 1;
        } else if (3608 == i) {
            r0 = aj;
            i2 = ae - -1151401203;
            ae = i2;
            dm.ow.ao(r0[i2 * -1738664533], -12491011);
            return 1;
        } else if (i == 3609) {
            r0 = aj;
            r3 = ae - -1246602361;
            ae = r3;
            r0 = cq.gg(r0[r3 * -1267697097], -1021555902);
            r3 = as;
            r4 = ar + 1980709142;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (dm.ow.ay(new ey(r0, hn.ar), false, -889911197)) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (i == 3611) {
            if (df.my != null) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * 2141353817) - 1] = df.my.ae;
                return 1;
            }
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = "";
            return 1;
        } else if (-1366315435 == i) {
            if (df.my != null) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = df.my.ad(1650604653);
                return 1;
            }
            iArr = as;
            r3 = ar - 1194553915;
            ar = r3;
            iArr[(r3 * 537618701) - 1] = 0;
            return 1;
        } else if (i == 3613) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1242639097)) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            r1 = aj;
            r3 = ae - 1740261130;
            ae = r3;
            r1[(r3 * -1267697097) - 1] = df.my.am(r0, 1512172766).ar(1880522183).af(-476772400);
            return 1;
        } else if (i == 99937997) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * -150838268];
            if (df.my == null || r0 >= df.my.ad(1480041639)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * -1310811203) - 1] = 0;
                return 1;
            }
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * -1153106410) - 1] = ((ez) df.my.am(r0, 150198659)).by((byte) -30);
            return 1;
        } else if (1042418307 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * -2124139135];
            if (df.my == null || r0 >= df.my.ad(1687568089)) {
                iArr = as;
                r3 = ar + 283486550;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r1[(r3 * 1440902686) - 1] = ((ez) df.my.am(r0, 1308181010)).as * -272030229;
            return 1;
        } else if (i == -1027077045) {
            byte b;
            r3 = as;
            r0 = ar + 2048863572;
            ar = r0;
            r4 = (r0 * 537618701) - 1;
            if (df.my != null) {
                b = df.my.am;
            } else {
                b = (byte) 0;
            }
            r3[r4] = b;
            return 1;
        } else if (3617 == i) {
            r0 = aj;
            i2 = ae - 1999106770;
            ae = i2;
            da.fx(r0[i2 * -1267697097], 477161637);
            return 1;
        } else if (i == 3618) {
            iArr = as;
            r3 = ar + 84069509;
            ar = r3;
            r3 = (r3 * 464103707) - 1;
            if (df.my != null) {
                z2 = df.my.at * true;
            }
            iArr[r3] = z2;
            return 1;
        } else if (3619 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            ab.ft(r0[i2 * -1267697097], (byte) 22);
            return 1;
        } else if (3620 == i) {
            no ad2 = ik.ad(nr.bs, client.dv.ag, (byte) 14);
            ad2.an.an(0, (byte) 31);
            client.dv.an(ad2, (short) 255);
            return 1;
        } else if (3621 == i) {
            if (dm.ow.af(2137145989)) {
                iArr = as;
                i2 = ar + 1709454674;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = dm.ow.ay.ad(1715490930);
                return 1;
            }
            iArr = as;
            i2 = ar + 1691677434;
            ar = i2;
            iArr[(i2 * -679319138) - 1] = -1;
            return 1;
        } else if (3622 == i) {
            iArr = as;
            i2 = ar - -1052304361;
            ar = i2;
            r0 = iArr[i2 * 796046100];
            if (!dm.ow.af(2138907131) || r0 < 0 || r0 >= dm.ow.ay.ad(1627369708)) {
                r0 = aj;
                i2 = ae + 176732483;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            ef efVar = (ef) dm.ow.ay.am(r0, 1096734740);
            r1 = aj;
            r3 = ae - 1929323834;
            ae = r3;
            r1[(r3 * -1267697097) - 1] = efVar.aj((byte) 41);
            r1 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r1[(r3 * -1267697097) - 1] = efVar.ae((byte) -1);
            return 1;
        } else if (i == 631415018) {
            r0 = aj;
            r3 = ae - -1246602361;
            ae = r3;
            r0 = cq.gg(r0[r3 * -1215034132], 2141040248);
            r3 = as;
            r4 = ar - 23397499;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (dm.ow.as(new ey(r0, hn.ar), (byte) -88)) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (i == 3624) {
            iArr = as;
            r3 = ar - -943764074;
            ar = r3;
            r0 = iArr[r3 * 537618701];
            if (df.my == null || r0 >= df.my.ad(1771423729) || !df.my.am(r0, 1068751682).ar(1903111147).equals(gf.ho.af)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 1;
            return 1;
        } else if (i == 3625) {
            if (df.my == null || df.my.aq == null) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            r0 = aj;
            i2 = ae - 963447591;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = df.my.aq;
            return 1;
        } else if (-1743251511 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r0 = iArr[r3 * 1439273923];
            if (df.my == null || r0 >= df.my.ad(1453549884) || !((ed) df.my.am(r0, 1769604872)).an((byte) 48)) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            iArr = as;
            i2 = ar + 1029184264;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 1;
            return 1;
        } else if (i == 3627) {
            iArr = as;
            r3 = ar - 672674325;
            ar = r3;
            r0 = iArr[r3 * 1039640653];
            if (df.my == null || r0 >= df.my.ad(1149680897) || !((ed) df.my.am(r0, 1518234950)).bw(2085049487)) {
                iArr = as;
                r3 = ar + 598480927;
                ar = r3;
                iArr[(r3 * 537618701) - 1] = 0;
                return 1;
            }
            iArr = as;
            i2 = ar - 697652873;
            ar = i2;
            iArr[(i2 * 995967305) - 1] = 1;
            return 1;
        } else if (i == 3628) {
            dm.ow.ag.au(-1120867081);
            return 1;
        } else if (i == -1280240364) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 352932280] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new lo(z2), (byte) 1);
            return 1;
        } else if (850532896 == i) {
            iArr = as;
            r3 = ar - -837168263;
            ar = r3;
            if (iArr[r3 * -523027448] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new lm(z2), (byte) 1);
            return 1;
        } else if (237655262 == i) {
            iArr = as;
            r3 = ar - 304795582;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cp(z2), (byte) 1);
            return 1;
        } else if (i == 322979134) {
            iArr = as;
            r3 = ar - 347313453;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cr(z2), (byte) 1);
            return 1;
        } else if (3633 == i) {
            iArr = as;
            r3 = ar - -1940255372;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cw(z2), (byte) 1);
            return 1;
        } else if (1424204108 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cb(z2), (byte) 1);
            return 1;
        } else if (3635 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * -1083985782] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cf(z2), (byte) 1);
            return 1;
        } else if (i == 3636) {
            iArr = as;
            r3 = ar - 1283102722;
            ar = r3;
            if (iArr[r3 * -827819151] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cg(z2), (byte) 1);
            return 1;
        } else if (i == 631022294) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new ce(z2), (byte) 1);
            return 1;
        } else if (599124629 == i) {
            iArr = as;
            r3 = ar - 1536805580;
            ar = r3;
            if (iArr[r3 * 1168337569] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new cz(z2), (byte) 1);
            return 1;
        } else if (598707076 == i) {
            dm.ow.ag.at(1241064189);
            return 1;
        } else if (i == 3640) {
            dm.ow.ay.au(32735448);
            return 1;
        } else if (3641 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * -1936574897] == 1) {
                z2 = true;
            }
            dm.ow.ay.av(new lo(z2), (byte) 1);
            return 1;
        } else if (i == 729961543) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            dm.ow.ay.av(new lm(z2), (byte) 1);
            return 1;
        } else if (-806271786 == i) {
            dm.ow.ay.at(1241064189);
            return 1;
        } else if (3644 == i) {
            if (df.my == null) {
                return 1;
            }
            df.my.au(-2075013680);
            return 1;
        } else if (1568447020 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new lo(z2), (byte) 1);
            return 1;
        } else if (1508103797 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * -1336884976] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new lm(z2), (byte) 1);
            return 1;
        } else if (i == -777765029) {
            iArr = as;
            r3 = ar - 1941968083;
            ar = r3;
            if (iArr[r3 * 283703887] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cp(z2), (byte) 1);
            return 1;
        } else if (i == 3648) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cr(z2), (byte) 1);
            return 1;
        } else if (3649 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 1976250254] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cw(z2), (byte) 1);
            return 1;
        } else if (3650 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cb(z2), (byte) 1);
            return 1;
        } else if (3651 == i) {
            iArr = as;
            r3 = ar - 1203887229;
            ar = r3;
            if (iArr[r3 * 1655218032] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cf(z2), (byte) 1);
            return 1;
        } else if (2028221281 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cg(z2), (byte) 1);
            return 1;
        } else if (i == -363004933) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * -1340886067] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new ce(z2), (byte) 1);
            return 1;
        } else if (1118952225 == i) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * 537618701] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new cz(z2), (byte) 1);
            return 1;
        } else if (3655 == i) {
            if (df.my == null) {
                return 1;
            }
            df.my.at(1241064189);
            return 1;
        } else if (i == 3656) {
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (iArr[r3 * -1640134218] == 1) {
                z2 = true;
            }
            dm.ow.ag.av(new ct(z2), (byte) 1);
            return 1;
        } else if (-825351350 != i) {
            return 2;
        } else {
            iArr = as;
            r3 = ar - 1898443116;
            ar = r3;
            if (iArr[r3 * -46088246] == 1) {
                z2 = true;
            }
            if (df.my == null) {
                return 1;
            }
            df.my.av(new ct(z2), (byte) 1);
            return 1;
        }
    }

    static int cd(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        if (-1039276280 == i) {
            iArr = as;
            i2 = ar - 337581614;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1825361527;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].an((byte) 0);
            return 1;
        } else if (i == 3904) {
            r0 = as;
            i3 = ar - -1194553915;
            ar = i3;
            r0 = r0[i3 * 611509164];
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * -488833568) - 1] = client.og[r0].ad * 1845400323;
            return 1;
        } else if (i == 3905) {
            r0 = as;
            i3 = ar - 1889616515;
            ar = i3;
            r0 = r0[i3 * 537618701];
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * -1051534165) - 1] = client.og[r0].an * 798361731;
            return 1;
        } else if (1578640917 == i) {
            r0 = as;
            i3 = ar - -1194553915;
            ar = i3;
            r0 = r0[i3 * 537618701];
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = client.og[r0].aa * -1832118056;
            return 1;
        } else if (i == 3907) {
            r0 = as;
            i3 = ar - -1269321072;
            ar = i3;
            r0 = r0[i3 * 1542598302];
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * -1874381306) - 1] = client.og[r0].ag * -2034245968;
            return 1;
        } else if (i == 1887826787) {
            r0 = as;
            i3 = ar - -1194553915;
            ar = i3;
            r0 = r0[i3 * 537618701];
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = client.og[r0].ay * -683379476;
            return 1;
        } else if (-1752716449 == i) {
            iArr = as;
            i2 = ar - -894447165;
            ar = i2;
            i3 = client.og[iArr[i2 * 1755441992]].ad((byte) 32);
            iArr2 = as;
            i4 = ar - 244545690;
            ar = i4;
            i4 = (i4 * 537618701) - 1;
            if (i3 == 0) {
                r0 = (byte) 1;
            }
            iArr2[i4] = r0;
            return 1;
        } else if (-1280877871 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = client.og[iArr[i2 * 537618701]].ad((byte) 32);
            iArr2 = as;
            i4 = ar - 151277539;
            ar = i4;
            i4 = (i4 * 485502535) - 1;
            if (i3 == 2) {
                r0 = (byte) 1;
            }
            iArr2[i4] = r0;
            return 1;
        } else if (-1938190086 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = client.og[iArr[i2 * -889951503]].ad((byte) 32);
            iArr2 = as;
            i4 = ar + 1831359139;
            ar = i4;
            i4 = (i4 * 537618701) - 1;
            if (i3 == 5) {
                r0 = (byte) 1;
            }
            iArr2[i4] = r0;
            return 1;
        } else if (3913 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = client.og[iArr[i2 * 1430193225]].ad((byte) 32);
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            i4 = (i4 * -1133878207) - 1;
            if (1 == i3) {
                r0 = (byte) 1;
            }
            iArr2[i4] = r0;
            return 1;
        } else if (i == -1619873318) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            if (iArr[i2 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.aa, z2, -1461513947);
            return 1;
        } else if (3915 == i) {
            iArr = as;
            i2 = ar - 103760732;
            ar = i2;
            if (iArr[i2 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.an, z2, 479440221);
            return 1;
        } else if (i == 3916) {
            boolean z3;
            ar -= -1745737973;
            if (1 == as[ar * -1480400447]) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (as[(ar * -973943839) + 1] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            client.pe.af = z2;
            dr.ph.af(client.pe, z3, -155754918);
            return 1;
        } else if (i == 1135515395) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            if (iArr[i2 * -1877221653] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.ad, z2, -711042546);
            return 1;
        } else if (-1781542834 == i) {
            iArr = as;
            i2 = ar - 1267571611;
            ar = i2;
            if (iArr[i2 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.ag, z2, 245333410);
            return 1;
        } else if (i == 3919) {
            iArr = as;
            i2 = ar + 732046453;
            ar = i2;
            i2 = (i2 * 1759858009) - 1;
            if (dr.ph != null) {
                z2 = dr.ph.af.size();
            }
            iArr[i2] = z2;
            return 1;
        } else if (i == -1261715796) {
            r0 = as;
            i3 = ar - -1194553915;
            ar = i3;
            r0 = (nh) dr.ph.af.get(r0[i3 * 1583178457]);
            iArr = as;
            i2 = ar + 1648838649;
            ar = i2;
            iArr[(i2 * -1531386247) - 1] = r0.af * -1546500950;
            return 1;
        } else if (i == 3921) {
            r0 = as;
            i3 = ar - -1194553915;
            ar = i3;
            r0 = (nh) dr.ph.af.get(r0[i3 * 498232121]);
            r2 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r2[(i2 * -1267697097) - 1] = r0.af(-1462247273);
            return 1;
        } else if (3922 == i) {
            r0 = as;
            i3 = ar - -1194553915;
            ar = i3;
            r0 = (nh) dr.ph.af.get(r0[i3 * 217186917]);
            r2 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r2[(i2 * 1076857120) - 1] = r0.ad(1083521505);
            return 1;
        } else if (1455465949 == i) {
            r0 = as;
            i3 = ar - 88739131;
            ar = i3;
            long af = (hu.af(768768681) - (hi.pr * 5304096097959642155L)) - (((nh) dr.ph.af.get(r0[i3 * -1403010488])).ad * 8313538393492320215L);
            r0 = (int) (af / 3600000);
            i4 = (int) ((af - ((long) (-1404414013 * r0))) / 60000);
            i3 = (int) (((af - ((long) (3600000 * r0))) - ((long) (-1251161694 * i4))) / 1000);
            String str = r0 + ":" + (i4 / 10) + (i4 % 10) + ":" + (i3 / 10) + (i3 % 10);
            r2 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r2[(i2 * -70455473) - 1] = str;
            return 1;
        } else if (1296821054 == i) {
            r0 = as;
            i3 = ar - -1194553915;
            ar = i3;
            r0 = (nh) dr.ph.af.get(r0[i3 * -2073100357]);
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = r0.an.aa * -672413105;
            return 1;
        } else if (i == 1831279018) {
            r0 = as;
            i3 = ar - 1084483802;
            ar = i3;
            r0 = (nh) dr.ph.af.get(r0[i3 * 537618701]);
            iArr = as;
            i2 = ar + 737258478;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = r0.an.an * -1928030811;
            return 1;
        } else if (3926 != i) {
            return 2;
        } else {
            r0 = as;
            i3 = ar - 2117921008;
            ar = i3;
            r0 = (nh) dr.ph.af.get(r0[i3 * 537618701]);
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = r0.an.ad * 203777790;
            return 1;
        }
    }

    static int cl(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        if (3903 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].an((byte) -92);
            return 1;
        } else if (i == 3904) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].ad * 1845400323;
            return 1;
        } else if (i == 3905) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].an * -1928030811;
            return 1;
        } else if (3906 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].aa * -672413105;
            return 1;
        } else if (i == 3907) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].ag * -732345473;
            return 1;
        } else if (i == 3908) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].ay * -1822937453;
            return 1;
        } else if (3910 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (i2 == 0) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3911 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (i2 == 2) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3912 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (i2 == 5) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3913 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (1 == i2) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (i == 3914) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.aa, z2, 487251212);
            return 1;
        } else if (3915 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.an, z2, -884315599);
            return 1;
        } else if (i == 3916) {
            boolean z3;
            ar -= 1905859466;
            if (1 == as[ar * 537618701]) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (as[(ar * 537618701) + 1] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            client.pe.af = z2;
            dr.ph.af(client.pe, z3, -1609321230);
            return 1;
        } else if (i == 3917) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.ad, z2, -2143421275);
            return 1;
        } else if (3918 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.ag, z2, -418407966);
            return 1;
        } else if (i == 3919) {
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            i4 = (i4 * 537618701) - 1;
            if (dr.ph != null) {
                z2 = dr.ph.af.size();
            }
            iArr2[i4] = z2;
            return 1;
        } else if (i == 3920) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.af * -215043303;
            return 1;
        } else if (i == 3921) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            r2 = aj;
            i4 = ae - 1246602361;
            ae = i4;
            r2[(i4 * -1267697097) - 1] = r0.af(-1462247273);
            return 1;
        } else if (3922 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            r2 = aj;
            i4 = ae - 1246602361;
            ae = i4;
            r2[(i4 * -1267697097) - 1] = r0.ad(1492690594);
            return 1;
        } else if (3923 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            long af = (hu.af(509651154) - (hi.pr * 5304096097959642155L)) - (((nh) dr.ph.af.get(iArr[i2 * 537618701])).ad * 8313538393492320215L);
            i3 = (int) (af / 3600000);
            r4 = (int) ((af - ((long) (3600000 * i3))) / 60000);
            i2 = (int) (((af - ((long) (3600000 * i3))) - ((long) (60000 * r4))) / 1000);
            String str = i3 + ":" + (r4 / 10) + (r4 % 10) + ":" + (i2 / 10) + (i2 % 10);
            r2 = aj;
            i4 = ae - 1246602361;
            ae = i4;
            r2[(i4 * -1267697097) - 1] = str;
            return 1;
        } else if (3924 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.an.aa * -672413105;
            return 1;
        } else if (i == 3925) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.an.an * -1928030811;
            return 1;
        } else if (3926 != i) {
            return 2;
        } else {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.an.ad * 1845400323;
            return 1;
        }
    }

    static int cs(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        if (3903 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].an((byte) -24);
            return 1;
        } else if (i == 3904) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].ad * 1845400323;
            return 1;
        } else if (i == 3905) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].an * -1928030811;
            return 1;
        } else if (3906 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].aa * -672413105;
            return 1;
        } else if (i == 3907) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].ag * -732345473;
            return 1;
        } else if (i == 3908) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = client.og[i3].ay * -1822937453;
            return 1;
        } else if (3910 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (i2 == 0) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3911 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (i2 == 2) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3912 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (i2 == 5) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3913 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i2 = client.og[iArr2[i4 * 537618701]].ad((byte) 32);
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (1 == i2) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (i == 3914) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.aa, z2, -234524224);
            return 1;
        } else if (3915 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.an, z2, -1041000693);
            return 1;
        } else if (i == 3916) {
            boolean z3;
            ar -= 1905859466;
            if (1 == as[ar * 537618701]) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (as[(ar * 537618701) + 1] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            client.pe.af = z2;
            dr.ph.af(client.pe, z3, -68794911);
            return 1;
        } else if (i == 3917) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.ad, z2, 287223982);
            return 1;
        } else if (3918 == i) {
            iArr2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            if (iArr2[i4 * 537618701] == 1) {
                z2 = true;
            }
            if (dr.ph == null) {
                return 1;
            }
            dr.ph.af(nj.ag, z2, -250679384);
            return 1;
        } else if (i == 3919) {
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            i4 = (i4 * 537618701) - 1;
            if (dr.ph != null) {
                i3 = dr.ph.af.size();
            }
            iArr2[i4] = i3;
            return 1;
        } else if (i == 3920) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.af * -215043303;
            return 1;
        } else if (i == 3921) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            r2 = aj;
            i4 = ae - 1246602361;
            ae = i4;
            r2[(i4 * -1267697097) - 1] = r0.af(-1462247273);
            return 1;
        } else if (3922 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            r2 = aj;
            i4 = ae - 1246602361;
            ae = i4;
            r2[(i4 * -1267697097) - 1] = r0.ad(200354863);
            return 1;
        } else if (3923 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            long af = (hu.af(1320582478) - (hi.pr * 5304096097959642155L)) - (((nh) dr.ph.af.get(iArr[i2 * 537618701])).ad * 8313538393492320215L);
            i3 = (int) (af / 3600000);
            r4 = (int) ((af - ((long) (3600000 * i3))) / 60000);
            i2 = (int) (((af - ((long) (3600000 * i3))) - ((long) (60000 * r4))) / 1000);
            String str = i3 + ":" + (r4 / 10) + (r4 % 10) + ":" + (i2 / 10) + (i2 % 10);
            r2 = aj;
            i4 = ae - 1246602361;
            ae = i4;
            r2[(i4 * -1267697097) - 1] = str;
            return 1;
        } else if (3924 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.an.aa * -672413105;
            return 1;
        } else if (i == 3925) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.an.an * -1928030811;
            return 1;
        } else if (3926 != i) {
            return 2;
        } else {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = (nh) dr.ph.af.get(iArr[i2 * 537618701]);
            iArr2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr2[(i4 * 537618701) - 1] = r0.an.ad * 1845400323;
            return 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int ch(int r15, p000.gk r16, boolean r17) {
        /*
        r0 = 4100; // 0x1004 float:5.745E-42 double:2.0257E-320;
        if (r15 != r0) goto L_0x004e;
    L_0x0004:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 - r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = aj;
        r3 = ae;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 + r4;
        ae = r3;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r2[r3] = r0;
        r0 = 1;
    L_0x0048:
        return r0;
    L_0x0049:
        r0 = 0;
    L_0x004a:
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x004e:
        r0 = 4101; // 0x1005 float:5.747E-42 double:2.026E-320;
        if (r0 != r15) goto L_0x0103;
    L_0x0052:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r0 = aj;
        r1 = ae;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + 1;
        r1 = r1[r2];
        r2 = aj;
        r3 = ae;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 + r4;
        ae = r3;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r2[r3] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0095:
        r0 = 2;
        goto L_0x0048;
    L_0x0097:
        r0 = r0 + 1;
    L_0x0099:
        if (r0 >= r1) goto L_0x0601;
    L_0x009b:
        r2 = r8.charAt(r0);
        r3 = r9.charAt(r0);
        if (r3 == r2) goto L_0x0097;
    L_0x00a5:
        r4 = java.lang.Character.toUpperCase(r2);
        r5 = java.lang.Character.toUpperCase(r3);
        if (r4 == r5) goto L_0x0097;
    L_0x00af:
        r2 = java.lang.Character.toLowerCase(r2);
        r3 = java.lang.Character.toLowerCase(r3);
        if (r3 == r2) goto L_0x0097;
    L_0x00b9:
        r0 = 1581168761; // 0x5e3eb879 float:3.43571683E18 double:7.81201165E-315;
        r0 = p000.mj.ad(r2, r10, r0);
        r1 = -1275877076; // 0xffffffffb3f3a92c float:-1.13463415E-7 double:NaN;
        r1 = p000.mj.ad(r3, r10, r1);
        r0 = r0 - r1;
    L_0x00c8:
        r1 = -1995248940; // 0xffffffff8912ead4 float:-1.7684526E-33 double:NaN;
        r0 = p000.cz.aw(r0, r1);
        r6[r7] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x00d4:
        r0 = 4117; // 0x1015 float:5.769E-42 double:2.034E-320;
        if (r15 != r0) goto L_0x01b0;
    L_0x00d8:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        if (r0 == 0) goto L_0x0705;
    L_0x00ea:
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = r0.length();
        r1[r2] = r0;
    L_0x0100:
        r0 = 1;
        goto L_0x0048;
    L_0x0103:
        r0 = 4102; // 0x1006 float:5.748E-42 double:2.0267E-320;
        if (r15 != r0) goto L_0x01fb;
    L_0x0107:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 - r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = aj;
        r3 = ae;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 + r4;
        ae = r3;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r4 = 1;
        r5 = -89530187; // 0xfffffffffaa9e0b5 float:-4.410279E35 double:NaN;
        r1 = p000.bh.ag(r1, r4, r5);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r2[r3] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0155:
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        if (r0 < r3) goto L_0x0607;
    L_0x0159:
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r0 > r3) goto L_0x0607;
    L_0x015d:
        r0 = 1;
    L_0x015e:
        if (r0 == 0) goto L_0x0773;
    L_0x0160:
        r0 = 1;
    L_0x0161:
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0166:
        r0 = 4110; // 0x100e float:5.76E-42 double:2.0306E-320;
        if (r15 != r0) goto L_0x0536;
    L_0x016a:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r0 = aj;
        r1 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = ae;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + 1;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        ar = r3;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];
        r3 = 1;
        if (r2 != r3) goto L_0x0662;
    L_0x019b:
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r1[r2] = r0;
    L_0x01ad:
        r0 = 1;
        goto L_0x0048;
    L_0x01b0:
        r0 = 4118; // 0x1016 float:5.77E-42 double:2.0346E-320;
        if (r15 != r0) goto L_0x0505;
    L_0x01b4:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = ar;
        r2 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r1 = r1 - r2;
        ar = r1;
        r1 = as;
        r2 = ar;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r3 = r3 + 1;
        r2 = r2[r3];
        r3 = aj;
        r4 = ae;
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        ae = r4;
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r0 = r0.substring(r1, r2);
        r3[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x01fb:
        r0 = 4103; // 0x1007 float:5.75E-42 double:2.027E-320;
        if (r15 != r0) goto L_0x0228;
    L_0x01ff:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = r0.toLowerCase();
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0228:
        r0 = 4104; // 0x1008 float:5.751E-42 double:2.0276E-320;
        if (r15 != r0) goto L_0x02f1;
    L_0x022c:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r2 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = 11745; // 0x2de1 float:1.6458E-41 double:5.803E-320;
        r0 = (long) r0;
        r0 = r0 + r4;
        r0 = r0 * r2;
        r2 = aw;
        r3 = new java.util.Date;
        r3.<init>(r0);
        r2.setTime(r3);
        r0 = aw;
        r1 = 5;
        r0 = r0.get(r1);
        r1 = aw;
        r2 = 2;
        r1 = r1.get(r2);
        r2 = aw;
        r3 = 1;
        r2 = r2.get(r3);
        r3 = aj;
        r4 = ae;
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        ae = r4;
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = r5.append(r0);
        r5 = "-";
        r0 = r0.append(r5);
        r5 = ai;
        r1 = r5[r1];
        r0 = r0.append(r1);
        r1 = "-";
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r0 = r0.toString();
        r3[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x029d:
        r0 = 4107; // 0x100b float:5.755E-42 double:2.029E-320;
        if (r0 != r15) goto L_0x056e;
    L_0x02a1:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r6 = as;
        r0 = ar;
        r1 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r0 + r1;
        ar = r0;
        r1 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r0 * r1;
        r7 = r0 + -1;
        r0 = aj;
        r1 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = ae;
        r1 = r1 * r2;
        r8 = r0[r1];
        r0 = aj;
        r1 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = ae;
        r1 = r1 * r2;
        r1 = r1 + 1;
        r9 = r0[r1];
        r0 = -1387037251; // 0xffffffffad537dbd float:-1.2021881E-11 double:NaN;
        r1 = p000.client.aq;
        r10 = r0 * r1;
        r11 = r8.length();
        r12 = r9.length();
        r3 = 0;
        r1 = 0;
        r2 = 0;
        r0 = 0;
    L_0x02e2:
        r4 = r3 - r2;
        if (r4 < r11) goto L_0x0405;
    L_0x02e6:
        r4 = r1 - r0;
        if (r4 < r12) goto L_0x0405;
    L_0x02ea:
        r1 = java.lang.Math.min(r11, r12);
        r0 = 0;
        goto L_0x0099;
    L_0x02f1:
        r0 = 4105; // 0x1009 float:5.752E-42 double:2.028E-320;
        if (r0 != r15) goto L_0x039d;
    L_0x02f5:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r0 = aj;
        r1 = ae;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + 1;
        r1 = r1[r2];
        r2 = p000.gf.ho;
        r2 = r2.ad;
        if (r2 == 0) goto L_0x0388;
    L_0x0319:
        r2 = p000.gf.ho;
        r2 = r2.ad;
        r2 = r2.an;
        if (r2 == 0) goto L_0x0388;
    L_0x0321:
        r0 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0[r2] = r1;
    L_0x0333:
        r0 = 1;
        goto L_0x0048;
    L_0x0336:
        r0 = 4114; // 0x1012 float:5.765E-42 double:2.0326E-320;
        if (r15 != r0) goto L_0x05cd;
    L_0x033a:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = (char) r0;
        r3 = 52;
        r0 = p000.ik.aq(r0, r3);
        if (r0 == 0) goto L_0x039b;
    L_0x0363:
        r0 = 1;
    L_0x0364:
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0369:
        r0 = r0 + 1;
    L_0x036b:
        if (r0 >= r1) goto L_0x061e;
    L_0x036d:
        r2 = r8.charAt(r0);
        r3 = r9.charAt(r0);
        if (r3 == r2) goto L_0x0369;
    L_0x0377:
        r0 = -1095324713; // 0xffffffffbeb6abd7 float:-0.35677978 double:NaN;
        r0 = p000.mj.ad(r2, r10, r0);
        r1 = 295140931; // 0x11977e43 float:2.3901414E-28 double:1.458189947E-315;
        r1 = p000.mj.ad(r3, r10, r1);
        r0 = r0 - r1;
        goto L_0x00c8;
    L_0x0388:
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r1[r2] = r0;
        goto L_0x0333;
    L_0x039b:
        r0 = 0;
        goto L_0x0364;
    L_0x039d:
        r0 = 4106; // 0x100a float:5.754E-42 double:2.0286E-320;
        if (r15 != r0) goto L_0x029d;
    L_0x03a1:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = java.lang.Integer.toString(r0);
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x03ca:
        r0 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        if (r2 != r0) goto L_0x065a;
    L_0x03ce:
        r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
    L_0x03d0:
        r13 = -212465308; // 0xfffffffff3560964 float:-1.6957733E31 double:NaN;
        r4 = p000.ew.af(r4, r10, r13);
        r13 = 947426673; // 0x38789571 float:5.9266986E-5 double:4.68090971E-315;
        r2 = p000.ew.af(r2, r10, r13);
        if (r4 == r2) goto L_0x05c8;
    L_0x03e0:
        r13 = java.lang.Character.toUpperCase(r4);
        r14 = java.lang.Character.toUpperCase(r2);
        if (r13 == r14) goto L_0x05c8;
    L_0x03ea:
        r4 = java.lang.Character.toLowerCase(r4);
        r2 = java.lang.Character.toLowerCase(r2);
        if (r2 == r4) goto L_0x05c8;
    L_0x03f4:
        r0 = -629923968; // 0xffffffffda741f80 float:-1.71786322E16 double:NaN;
        r0 = p000.mj.ad(r4, r10, r0);
        r1 = 2091630719; // 0x7cabc07f float:7.1342964E36 double:1.033402882E-314;
        r1 = p000.mj.ad(r2, r10, r1);
        r0 = r0 - r1;
        goto L_0x00c8;
    L_0x0405:
        r4 = r3 - r2;
        if (r4 < r11) goto L_0x040c;
    L_0x0409:
        r0 = -1;
        goto L_0x00c8;
    L_0x040c:
        r4 = r1 - r0;
        if (r4 < r12) goto L_0x0413;
    L_0x0410:
        r0 = 1;
        goto L_0x00c8;
    L_0x0413:
        if (r2 == 0) goto L_0x0650;
    L_0x0415:
        r4 = r2;
        r5 = r3;
    L_0x0417:
        if (r0 == 0) goto L_0x0429;
    L_0x0419:
        r2 = r0;
        r3 = r1;
    L_0x041b:
        r0 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        if (r0 != r4) goto L_0x047d;
    L_0x041f:
        r0 = 69;
        r1 = r0;
    L_0x0422:
        r0 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        if (r0 != r2) goto L_0x04fd;
    L_0x0426:
        r0 = 69;
        goto L_0x03d0;
    L_0x0429:
        r2 = r1 + 1;
        r0 = r9.charAt(r1);
        r3 = r2;
        r2 = r0;
        goto L_0x041b;
    L_0x0432:
        r0 = 4121; // 0x1019 float:5.775E-42 double:2.036E-320;
        if (r0 != r15) goto L_0x0095;
    L_0x0436:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r0 = aj;
        r1 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = ae;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + 1;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        ar = r3;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];
        r3 = as;
        r4 = ar;
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        ar = r4;
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r0 = r0.indexOf(r1, r2);
        r3[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x047d:
        r0 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        if (r4 != r0) goto L_0x0485;
    L_0x0481:
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r1 = r0;
        goto L_0x0422;
    L_0x0485:
        r0 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        if (r0 != r4) goto L_0x04e7;
    L_0x0489:
        r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r1 = r0;
        goto L_0x0422;
    L_0x048d:
        r0 = 4109; // 0x100d float:5.758E-42 double:2.03E-320;
        if (r15 != r0) goto L_0x0166;
    L_0x0491:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = ar;
        r2 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r1 = r1 - r2;
        ar = r1;
        r1 = as;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = ar;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r3 = r3 + 1;
        r2 = r2[r3];
        r3 = p000.au.ck;
        r4 = 0;
        r5 = 543922053; // 0x206b9785 float:1.9955408E-19 double:2.687332004E-315;
        r2 = r3.an(r2, r4, r5);
        r3 = new lr;
        r3.<init>(r2);
        r2 = as;
        r4 = ar;
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        ar = r4;
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r0 = r3.ay(r0, r1);
        r2[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x04e7:
        r0 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r0 != r4) goto L_0x04f0;
    L_0x04eb:
        r0 = 69;
        r1 = r0;
        goto L_0x0422;
    L_0x04f0:
        r0 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r4 != r0) goto L_0x04f9;
    L_0x04f4:
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r1 = r0;
        goto L_0x0422;
    L_0x04f9:
        r0 = 0;
        r1 = r0;
        goto L_0x0422;
    L_0x04fd:
        r0 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        if (r2 != r0) goto L_0x03ca;
    L_0x0501:
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x03d0;
    L_0x0505:
        r0 = 4119; // 0x1017 float:5.772E-42 double:2.035E-320;
        if (r15 != r0) goto L_0x0733;
    L_0x0509:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r2 = r0[r1];
        r3 = new java.lang.StringBuilder;
        r0 = r2.length();
        r3.<init>(r0);
        r1 = 0;
        r0 = 0;
    L_0x0524:
        r4 = r2.length();
        if (r0 >= r4) goto L_0x071a;
    L_0x052a:
        r4 = r2.charAt(r0);
        r5 = 60;
        if (r4 != r5) goto L_0x0676;
    L_0x0532:
        r1 = 1;
    L_0x0533:
        r0 = r0 + 1;
        goto L_0x0524;
    L_0x0536:
        r0 = 4111; // 0x100f float:5.761E-42 double:2.031E-320;
        if (r0 != r15) goto L_0x0684;
    L_0x053a:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = p000.lr.ar(r0);
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0563:
        r0 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r0 != r2) goto L_0x0770;
    L_0x0567:
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x03d0;
    L_0x056b:
        r0 = 0;
        goto L_0x036b;
    L_0x056e:
        r0 = 4108; // 0x100c float:5.757E-42 double:2.0296E-320;
        if (r0 != r15) goto L_0x048d;
    L_0x0572:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = ar;
        r2 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r1 = r1 - r2;
        ar = r1;
        r1 = as;
        r2 = ar;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = as;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = ar;
        r3 = r3 * r4;
        r3 = r3 + 1;
        r2 = r2[r3];
        r3 = p000.au.ck;
        r4 = 0;
        r5 = -675285887; // 0xffffffffd7bff481 float:-4.22113714E14 double:NaN;
        r2 = r3.an(r2, r4, r5);
        r3 = new lr;
        r3.<init>(r2);
        r2 = as;
        r4 = ar;
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        ar = r4;
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r0 = r3.as(r0, r1);
        r2[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x05c8:
        r2 = r1;
        r1 = r3;
        r3 = r5;
        goto L_0x02e2;
    L_0x05cd:
        r0 = 4115; // 0x1013 float:5.766E-42 double:2.033E-320;
        if (r0 != r15) goto L_0x0621;
    L_0x05d1:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = (char) r0;
        r3 = -2009995551; // 0xffffffff8831e6e1 float:-5.3535397E-34 double:NaN;
        r0 = p000.cz.aj(r0, r3);
        if (r0 == 0) goto L_0x0702;
    L_0x05fb:
        r0 = 1;
    L_0x05fc:
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0601:
        r0 = r11 - r12;
        if (r0 == 0) goto L_0x056b;
    L_0x0605:
        goto L_0x00c8;
    L_0x0607:
        r3 = 8364; // 0x20ac float:1.172E-41 double:4.1324E-320;
        if (r0 == r3) goto L_0x061b;
    L_0x060b:
        r3 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r0 == r3) goto L_0x061b;
    L_0x060f:
        r3 = 8212; // 0x2014 float:1.1507E-41 double:4.0573E-320;
        if (r3 == r0) goto L_0x061b;
    L_0x0613:
        r3 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r3 == r0) goto L_0x061b;
    L_0x0617:
        r3 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        if (r0 != r3) goto L_0x06ff;
    L_0x061b:
        r0 = 1;
        goto L_0x015e;
    L_0x061e:
        r0 = 0;
        goto L_0x00c8;
    L_0x0621:
        r0 = 4116; // 0x1014 float:5.768E-42 double:2.0336E-320;
        if (r0 != r15) goto L_0x00d4;
    L_0x0625:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = (char) r0;
        r3 = 5;
        r0 = p000.ha.ae(r0, r3);
        if (r0 == 0) goto L_0x0049;
    L_0x064d:
        r0 = 1;
        goto L_0x004a;
    L_0x0650:
        r4 = r3 + 1;
        r2 = r8.charAt(r3);
        r5 = r4;
        r4 = r2;
        goto L_0x0417;
    L_0x065a:
        r0 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r2 != r0) goto L_0x0563;
    L_0x065e:
        r0 = 69;
        goto L_0x03d0;
    L_0x0662:
        r0 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0[r2] = r1;
        goto L_0x01ad;
    L_0x0676:
        r5 = 62;
        if (r5 != r4) goto L_0x067d;
    L_0x067a:
        r1 = 0;
        goto L_0x0533;
    L_0x067d:
        if (r1 != 0) goto L_0x0533;
    L_0x067f:
        r3.append(r4);
        goto L_0x0533;
    L_0x0684:
        r0 = 4112; // 0x1010 float:5.762E-42 double:2.0316E-320;
        if (r15 != r0) goto L_0x06cf;
    L_0x0688:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 - r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = aj;
        r3 = ae;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 + r4;
        ae = r3;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r1 = (char) r1;
        r0 = r0.append(r1);
        r0 = r0.toString();
        r2[r3] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x06cf:
        r0 = 4113; // 0x1011 float:5.764E-42 double:2.032E-320;
        if (r15 != r0) goto L_0x0336;
    L_0x06d3:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = (char) r0;
        r3 = 32;
        if (r0 < r3) goto L_0x0155;
    L_0x06f8:
        r3 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r0 > r3) goto L_0x0155;
    L_0x06fc:
        r0 = 1;
        goto L_0x015e;
    L_0x06ff:
        r0 = 0;
        goto L_0x015e;
    L_0x0702:
        r0 = 0;
        goto L_0x05fc;
    L_0x0705:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 + r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r1 = r1 + -1;
        r2 = 0;
        r0[r1] = r2;
        goto L_0x0100;
    L_0x071a:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 + r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r1 = r1 + -1;
        r2 = r3.toString();
        r0[r1] = r2;
        r0 = 1;
        goto L_0x0048;
    L_0x0733:
        r0 = 4120; // 0x1018 float:5.773E-42 double:2.0356E-320;
        if (r15 != r0) goto L_0x0432;
    L_0x0737:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 - r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 + r4;
        ar = r3;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r0 = r0.indexOf(r1);
        r2[r3] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0770:
        r0 = 0;
        goto L_0x03d0;
    L_0x0773:
        r0 = 0;
        goto L_0x0161;
        */
        throw new UnsupportedOperationException("Method not decompiled: hr.ch(int, gk, boolean):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int cm(int r15, p000.gk r16, boolean r17) {
        /*
        r0 = 4100; // 0x1004 float:5.745E-42 double:2.0257E-320;
        if (r15 != r0) goto L_0x00a2;
    L_0x0004:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 - r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = aj;
        r3 = ae;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 + r4;
        ae = r3;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r2[r3] = r0;
        r0 = 1;
    L_0x0048:
        return r0;
    L_0x0049:
        r0 = 4109; // 0x100d float:5.758E-42 double:2.03E-320;
        if (r15 != r0) goto L_0x05d4;
    L_0x004d:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = ar;
        r2 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r1 = r1 - r2;
        ar = r1;
        r1 = as;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = ar;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r3 = r3 + 1;
        r2 = r2[r3];
        r3 = p000.au.ck;
        r4 = 0;
        r5 = -706386752; // 0xffffffffd5e564c0 float:-3.15276101E13 double:NaN;
        r2 = r3.an(r2, r4, r5);
        r3 = new lr;
        r3.<init>(r2);
        r2 = as;
        r4 = ar;
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        ar = r4;
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r0 = r3.ay(r0, r1);
        r2[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x00a2:
        r0 = 4101; // 0x1005 float:5.747E-42 double:2.026E-320;
        if (r0 != r15) goto L_0x022c;
    L_0x00a6:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r0 = aj;
        r1 = ae;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + 1;
        r1 = r1[r2];
        r2 = aj;
        r3 = ae;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 + r4;
        ae = r3;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r2[r3] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x00ea:
        r0 = 4113; // 0x1011 float:5.764E-42 double:2.032E-320;
        if (r15 != r0) goto L_0x06f9;
    L_0x00ee:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = (char) r0;
        r3 = 32;
        if (r0 < r3) goto L_0x06eb;
    L_0x0113:
        r3 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r0 > r3) goto L_0x06eb;
    L_0x0117:
        r0 = 1;
    L_0x0118:
        if (r0 == 0) goto L_0x04d9;
    L_0x011a:
        r0 = 1;
    L_0x011b:
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0120:
        r0 = 4104; // 0x1008 float:5.751E-42 double:2.0276E-320;
        if (r15 != r0) goto L_0x02c0;
    L_0x0124:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r2 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = 11745; // 0x2de1 float:1.6458E-41 double:5.803E-320;
        r0 = (long) r0;
        r0 = r0 + r4;
        r0 = r0 * r2;
        r2 = aw;
        r3 = new java.util.Date;
        r3.<init>(r0);
        r2.setTime(r3);
        r0 = aw;
        r1 = 5;
        r0 = r0.get(r1);
        r1 = aw;
        r2 = 2;
        r1 = r1.get(r2);
        r2 = aw;
        r3 = 1;
        r2 = r2.get(r3);
        r3 = aj;
        r4 = ae;
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        ae = r4;
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r0 = r5.append(r0);
        r5 = "-";
        r0 = r0.append(r5);
        r5 = ai;
        r1 = r5[r1];
        r0 = r0.append(r1);
        r1 = "-";
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r0 = r0.toString();
        r3[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0195:
        r0 = r11 - r12;
        if (r0 == 0) goto L_0x061d;
    L_0x0199:
        r1 = -1995248940; // 0xffffffff8912ead4 float:-1.7684526E-33 double:NaN;
        r0 = p000.cz.aw(r0, r1);
        r6[r7] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x01a5:
        r0 = 4107; // 0x100b float:5.755E-42 double:2.029E-320;
        if (r0 != r15) goto L_0x040b;
    L_0x01a9:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r6 = as;
        r0 = ar;
        r1 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r0 = r0 + r1;
        ar = r0;
        r1 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r0 = r0 * r1;
        r7 = r0 + -1;
        r0 = aj;
        r1 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = ae;
        r1 = r1 * r2;
        r8 = r0[r1];
        r0 = aj;
        r1 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = ae;
        r1 = r1 * r2;
        r1 = r1 + 1;
        r9 = r0[r1];
        r0 = -1387037251; // 0xffffffffad537dbd float:-1.2021881E-11 double:NaN;
        r1 = p000.client.aq;
        r10 = r0 * r1;
        r11 = r8.length();
        r12 = r9.length();
        r5 = 0;
        r3 = 0;
        r0 = 0;
        r1 = 0;
        r2 = r0;
        r0 = r1;
        r1 = r3;
        r3 = r5;
    L_0x01ee:
        r4 = r3 - r2;
        if (r4 < r11) goto L_0x0469;
    L_0x01f2:
        r4 = r1 - r0;
        if (r4 < r12) goto L_0x0469;
    L_0x01f6:
        r1 = java.lang.Math.min(r11, r12);
        r0 = 0;
    L_0x01fb:
        if (r0 >= r1) goto L_0x0195;
    L_0x01fd:
        r2 = r8.charAt(r0);
        r3 = r9.charAt(r0);
        if (r3 == r2) goto L_0x0465;
    L_0x0207:
        r4 = java.lang.Character.toUpperCase(r2);
        r5 = java.lang.Character.toUpperCase(r3);
        if (r4 == r5) goto L_0x0465;
    L_0x0211:
        r2 = java.lang.Character.toLowerCase(r2);
        r3 = java.lang.Character.toLowerCase(r3);
        if (r3 == r2) goto L_0x0465;
    L_0x021b:
        r0 = 780476099; // 0x2e851ec3 float:6.053604E-11 double:3.85606428E-315;
        r0 = p000.mj.ad(r2, r10, r0);
        r1 = 713612319; // 0x2a88dc1f float:2.4311193E-13 double:3.525713313E-315;
        r1 = p000.mj.ad(r3, r10, r1);
        r0 = r0 - r1;
        goto L_0x0199;
    L_0x022c:
        r0 = 4102; // 0x1006 float:5.748E-42 double:2.0267E-320;
        if (r15 != r0) goto L_0x0293;
    L_0x0230:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 - r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = aj;
        r3 = ae;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 + r4;
        ae = r3;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r4 = 1;
        r5 = -429978176; // 0xffffffffe65f0dc0 float:-2.6333534E23 double:NaN;
        r1 = p000.bh.ag(r1, r4, r5);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r2[r3] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x027e:
        r0 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0[r2] = r1;
    L_0x0290:
        r0 = 1;
        goto L_0x0048;
    L_0x0293:
        r0 = 4103; // 0x1007 float:5.75E-42 double:2.027E-320;
        if (r15 != r0) goto L_0x0120;
    L_0x0297:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = r0.toLowerCase();
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x02c0:
        r0 = 4105; // 0x1009 float:5.752E-42 double:2.028E-320;
        if (r0 != r15) goto L_0x0305;
    L_0x02c4:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r0 = aj;
        r1 = ae;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + 1;
        r1 = r1[r2];
        r2 = p000.gf.ho;
        r2 = r2.ad;
        if (r2 == 0) goto L_0x03bb;
    L_0x02e8:
        r2 = p000.gf.ho;
        r2 = r2.ad;
        r2 = r2.an;
        if (r2 == 0) goto L_0x03bb;
    L_0x02f0:
        r0 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0[r2] = r1;
    L_0x0302:
        r0 = 1;
        goto L_0x0048;
    L_0x0305:
        r0 = 4106; // 0x100a float:5.754E-42 double:2.0286E-320;
        if (r15 != r0) goto L_0x01a5;
    L_0x0309:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = java.lang.Integer.toString(r0);
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0332:
        r0 = 4119; // 0x1017 float:5.772E-42 double:2.035E-320;
        if (r15 != r0) goto L_0x0470;
    L_0x0336:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r2 = r0[r1];
        r3 = new java.lang.StringBuilder;
        r0 = r2.length();
        r3.<init>(r0);
        r1 = 0;
        r0 = 0;
    L_0x0351:
        r4 = r2.length();
        if (r0 >= r4) goto L_0x0757;
    L_0x0357:
        r4 = r2.charAt(r0);
        r5 = 60;
        if (r4 != r5) goto L_0x0749;
    L_0x035f:
        r1 = 1;
    L_0x0360:
        r0 = r0 + 1;
        goto L_0x0351;
    L_0x0363:
        r3 = 8364; // 0x20ac float:1.172E-41 double:4.1324E-320;
        if (r0 == r3) goto L_0x0377;
    L_0x0367:
        r3 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r0 == r3) goto L_0x0377;
    L_0x036b:
        r3 = 8212; // 0x2014 float:1.1507E-41 double:4.0573E-320;
        if (r3 == r0) goto L_0x0377;
    L_0x036f:
        r3 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r3 == r0) goto L_0x0377;
    L_0x0373:
        r3 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        if (r0 != r3) goto L_0x06f6;
    L_0x0377:
        r0 = 1;
        goto L_0x0118;
    L_0x037a:
        r0 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        if (r4 != r0) goto L_0x04dc;
    L_0x037e:
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
    L_0x0380:
        r1 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        if (r1 != r2) goto L_0x05bc;
    L_0x0384:
        r1 = 69;
    L_0x0386:
        r13 = -1244916674; // 0xffffffffb5cc143e float:-1.5205076E-6 double:NaN;
        r4 = p000.ew.af(r4, r10, r13);
        r13 = 731299515; // 0x2b96bebb float:1.0711079E-12 double:3.61309967E-315;
        r2 = p000.ew.af(r2, r10, r13);
        if (r4 == r2) goto L_0x0773;
    L_0x0396:
        r13 = java.lang.Character.toUpperCase(r4);
        r14 = java.lang.Character.toUpperCase(r2);
        if (r13 == r14) goto L_0x0773;
    L_0x03a0:
        r4 = java.lang.Character.toLowerCase(r4);
        r2 = java.lang.Character.toLowerCase(r2);
        if (r2 == r4) goto L_0x0773;
    L_0x03aa:
        r0 = -501740898; // 0xffffffffe2180a9e float:-7.0116754E20 double:NaN;
        r0 = p000.mj.ad(r4, r10, r0);
        r1 = 171513803; // 0xa3917cb float:8.911901E-33 double:8.4739078E-316;
        r1 = p000.mj.ad(r2, r10, r1);
        r0 = r0 - r1;
        goto L_0x0199;
    L_0x03bb:
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r1[r2] = r0;
        goto L_0x0302;
    L_0x03cf:
        r0 = 4115; // 0x1013 float:5.766E-42 double:2.033E-320;
        if (r0 != r15) goto L_0x0537;
    L_0x03d3:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = (char) r0;
        r3 = -220053740; // 0xfffffffff2e23f14 float:-8.962543E30 double:NaN;
        r0 = p000.cz.aj(r0, r3);
        if (r0 == 0) goto L_0x072c;
    L_0x03fd:
        r0 = 1;
    L_0x03fe:
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0403:
        r1 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r2 != r1) goto L_0x05cc;
    L_0x0407:
        r1 = 69;
        goto L_0x0386;
    L_0x040b:
        r0 = 4108; // 0x100c float:5.757E-42 double:2.0296E-320;
        if (r0 != r15) goto L_0x0049;
    L_0x040f:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = ar;
        r2 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r1 = r1 - r2;
        ar = r1;
        r1 = as;
        r2 = ar;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = as;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = ar;
        r3 = r3 * r4;
        r3 = r3 + 1;
        r2 = r2[r3];
        r3 = p000.au.ck;
        r4 = 0;
        r5 = -194777603; // 0xfffffffff463edfd float:-7.2233787E31 double:NaN;
        r2 = r3.an(r2, r4, r5);
        r3 = new lr;
        r3.<init>(r2);
        r2 = as;
        r4 = ar;
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        ar = r4;
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r0 = r3.as(r0, r1);
        r2[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0465:
        r0 = r0 + 1;
        goto L_0x01fb;
    L_0x0469:
        r4 = r3 - r2;
        if (r4 < r11) goto L_0x04ad;
    L_0x046d:
        r0 = -1;
        goto L_0x0199;
    L_0x0470:
        r0 = 4120; // 0x1018 float:5.773E-42 double:2.0356E-320;
        if (r15 != r0) goto L_0x04ec;
    L_0x0474:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 - r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 + r4;
        ar = r3;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r0 = r0.indexOf(r1);
        r2[r3] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x04ad:
        r4 = r1 - r0;
        if (r4 < r12) goto L_0x04b4;
    L_0x04b1:
        r0 = 1;
        goto L_0x0199;
    L_0x04b4:
        if (r2 == 0) goto L_0x04c7;
    L_0x04b6:
        r4 = r2;
        r5 = r3;
    L_0x04b8:
        if (r0 == 0) goto L_0x04d0;
    L_0x04ba:
        r2 = r0;
        r3 = r1;
    L_0x04bc:
        r0 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        if (r0 != r4) goto L_0x037a;
    L_0x04c0:
        r0 = 69;
        goto L_0x0380;
    L_0x04c4:
        r0 = 0;
        goto L_0x0380;
    L_0x04c7:
        r4 = r3 + 1;
        r2 = r8.charAt(r3);
        r5 = r4;
        r4 = r2;
        goto L_0x04b8;
    L_0x04d0:
        r2 = r1 + 1;
        r0 = r9.charAt(r1);
        r3 = r2;
        r2 = r0;
        goto L_0x04bc;
    L_0x04d9:
        r0 = 0;
        goto L_0x011b;
    L_0x04dc:
        r0 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        if (r0 != r4) goto L_0x04e4;
    L_0x04e0:
        r0 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x0380;
    L_0x04e4:
        r0 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r0 != r4) goto L_0x0569;
    L_0x04e8:
        r0 = 69;
        goto L_0x0380;
    L_0x04ec:
        r0 = 4121; // 0x1019 float:5.775E-42 double:2.036E-320;
        if (r0 != r15) goto L_0x0770;
    L_0x04f0:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r0 = aj;
        r1 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = ae;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + 1;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        ar = r3;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];
        r3 = as;
        r4 = ar;
        r5 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r4 = r4 + r5;
        ar = r4;
        r5 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r0 = r0.indexOf(r1, r2);
        r3[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0537:
        r0 = 4116; // 0x1014 float:5.768E-42 double:2.0336E-320;
        if (r0 != r15) goto L_0x066e;
    L_0x053b:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = (char) r0;
        r3 = 5;
        r0 = p000.ha.ae(r0, r3);
        if (r0 == 0) goto L_0x072f;
    L_0x0563:
        r0 = 1;
    L_0x0564:
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0569:
        r0 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r4 != r0) goto L_0x04c4;
    L_0x056d:
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0380;
    L_0x0571:
        r0 = 4118; // 0x1016 float:5.77E-42 double:2.0346E-320;
        if (r15 != r0) goto L_0x0332;
    L_0x0575:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = ar;
        r2 = 1905859466; // 0x71991b8a float:1.516304E30 double:9.41619688E-315;
        r1 = r1 - r2;
        ar = r1;
        r1 = as;
        r2 = ar;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r3 = r3 + 1;
        r2 = r2[r3];
        r3 = aj;
        r4 = ae;
        r5 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r4 = r4 + r5;
        ae = r4;
        r5 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + -1;
        r0 = r0.substring(r1, r2);
        r3[r4] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x05bc:
        r1 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        if (r2 != r1) goto L_0x05c4;
    L_0x05c0:
        r1 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0386;
    L_0x05c4:
        r1 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        if (r2 != r1) goto L_0x0403;
    L_0x05c8:
        r1 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x0386;
    L_0x05cc:
        r1 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r1 != r2) goto L_0x06e8;
    L_0x05d0:
        r1 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x0386;
    L_0x05d4:
        r0 = 4110; // 0x100e float:5.76E-42 double:2.0306E-320;
        if (r15 != r0) goto L_0x063b;
    L_0x05d8:
        r0 = ae;
        r1 = 1801762574; // 0x6b64b70e float:2.7649954E26 double:8.9018899E-315;
        r0 = r0 - r1;
        ae = r0;
        r0 = aj;
        r1 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = ae;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + 1;
        r1 = r1[r2];
        r2 = as;
        r3 = ar;
        r4 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r3 = r3 - r4;
        ar = r3;
        r4 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r3 = r3 * r4;
        r2 = r2[r3];
        r3 = 1;
        if (r2 != r3) goto L_0x027e;
    L_0x0609:
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r1[r2] = r0;
        goto L_0x0290;
    L_0x061d:
        r0 = 0;
    L_0x061e:
        if (r0 >= r1) goto L_0x066b;
    L_0x0620:
        r2 = r8.charAt(r0);
        r3 = r9.charAt(r0);
        if (r3 == r2) goto L_0x0668;
    L_0x062a:
        r0 = 2005586978; // 0x778ad422 float:5.631559E33 double:9.908916256E-315;
        r0 = p000.mj.ad(r2, r10, r0);
        r1 = -914005010; // 0xffffffffc98563ee float:-1092733.8 double:NaN;
        r1 = p000.mj.ad(r3, r10, r1);
        r0 = r0 - r1;
        goto L_0x0199;
    L_0x063b:
        r0 = 4111; // 0x100f float:5.761E-42 double:2.031E-320;
        if (r0 != r15) goto L_0x069d;
    L_0x063f:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = aj;
        r2 = ae;
        r3 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r2 = r2 + r3;
        ae = r2;
        r3 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = p000.lr.ar(r0);
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x0668:
        r0 = r0 + 1;
        goto L_0x061e;
    L_0x066b:
        r0 = 0;
        goto L_0x0199;
    L_0x066e:
        r0 = 4117; // 0x1015 float:5.769E-42 double:2.034E-320;
        if (r15 != r0) goto L_0x0571;
    L_0x0672:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        if (r0 == 0) goto L_0x0734;
    L_0x0684:
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = r0.length();
        r1[r2] = r0;
    L_0x069a:
        r0 = 1;
        goto L_0x0048;
    L_0x069d:
        r0 = 4112; // 0x1010 float:5.762E-42 double:2.0316E-320;
        if (r15 != r0) goto L_0x00ea;
    L_0x06a1:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 - r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 - r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r1 = r1[r2];
        r2 = aj;
        r3 = ae;
        r4 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r3 = r3 + r4;
        ae = r3;
        r4 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r3 = r3 * r4;
        r3 = r3 + -1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r1 = (char) r1;
        r0 = r0.append(r1);
        r0 = r0.toString();
        r2[r3] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x06e8:
        r1 = 0;
        goto L_0x0386;
    L_0x06eb:
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        if (r0 < r3) goto L_0x0363;
    L_0x06ef:
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r0 > r3) goto L_0x0363;
    L_0x06f3:
        r0 = 1;
        goto L_0x0118;
    L_0x06f6:
        r0 = 0;
        goto L_0x0118;
    L_0x06f9:
        r0 = 4114; // 0x1012 float:5.765E-42 double:2.0326E-320;
        if (r15 != r0) goto L_0x03cf;
    L_0x06fd:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 - r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r0 = r0[r1];
        r1 = as;
        r2 = ar;
        r3 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r2 = r2 + r3;
        ar = r2;
        r3 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r2 = r2 * r3;
        r2 = r2 + -1;
        r0 = (char) r0;
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r0 = p000.ik.aq(r0, r3);
        if (r0 == 0) goto L_0x0732;
    L_0x0726:
        r0 = 1;
    L_0x0727:
        r1[r2] = r0;
        r0 = 1;
        goto L_0x0048;
    L_0x072c:
        r0 = 0;
        goto L_0x03fe;
    L_0x072f:
        r0 = 0;
        goto L_0x0564;
    L_0x0732:
        r0 = 0;
        goto L_0x0727;
    L_0x0734:
        r0 = as;
        r1 = ar;
        r2 = -1194553915; // 0xffffffffb8cc8dc5 float:-9.753885E-5 double:NaN;
        r1 = r1 + r2;
        ar = r1;
        r2 = 537618701; // 0x200b690d float:1.1808516E-19 double:2.656189307E-315;
        r1 = r1 * r2;
        r1 = r1 + -1;
        r2 = 0;
        r0[r1] = r2;
        goto L_0x069a;
    L_0x0749:
        r5 = 62;
        if (r5 != r4) goto L_0x0750;
    L_0x074d:
        r1 = 0;
        goto L_0x0360;
    L_0x0750:
        if (r1 != 0) goto L_0x0360;
    L_0x0752:
        r3.append(r4);
        goto L_0x0360;
    L_0x0757:
        r0 = aj;
        r1 = ae;
        r2 = -1246602361; // 0xffffffffb5b25b87 float:-1.3288671E-6 double:NaN;
        r1 = r1 + r2;
        ae = r1;
        r2 = -1267697097; // 0xffffffffb4707a37 float:-2.2396203E-7 double:NaN;
        r1 = r1 * r2;
        r1 = r1 + -1;
        r2 = r3.toString();
        r0[r1] = r2;
        r0 = 1;
        goto L_0x0048;
    L_0x0770:
        r0 = 2;
        goto L_0x0048;
    L_0x0773:
        r2 = r0;
        r0 = r1;
        r1 = r3;
        r3 = r5;
        goto L_0x01ee;
        */
        throw new UnsupportedOperationException("Method not decompiled: hr.cm(int, gk, boolean):int");
    }

    static int cj(int i, gk gkVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        String[] strArr;
        int i4;
        if (4200 == i) {
            iArr = as;
            i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            strArr = aj;
            i4 = ae - 1246602361;
            ae = i4;
            strArr[(i4 * -1267697097) - 1] = cm.af(i2, 1522290910).ak;
            return 1;
        } else if (4201 == i) {
            ar -= 1905859466;
            i2 = as[ar * 537618701];
            i3 = as[(ar * 537618701) + 1];
            r0 = cm.af(i2, 1926325702);
            if (i3 < 1 || i3 > 5 || r0.bf[i3 - 1] == null) {
                r0 = aj;
                i3 = ae - 1246602361;
                ae = i3;
                r0[(i3 * -1267697097) - 1] = "";
                return 1;
            }
            r3 = aj;
            r4 = ae - 1246602361;
            ae = r4;
            r3[(r4 * -1267697097) - 1] = r0.bf[i3 - 1];
            return 1;
        } else if (i == 4202) {
            ar -= 1905859466;
            i2 = as[ar * 537618701];
            i3 = as[(ar * 537618701) + 1];
            r0 = cm.af(i2, 1410981907);
            if (i3 < 1 || i3 > 5 || r0.bv[i3 - 1] == null) {
                r0 = aj;
                i3 = ae - 1246602361;
                ae = i3;
                r0[(i3 * -1267697097) - 1] = "";
                return 1;
            }
            r3 = aj;
            r4 = ae - 1246602361;
            ae = r4;
            r3[(r4 * -1267697097) - 1] = r0.bv[i3 - 1];
            return 1;
        } else if (4203 == i) {
            iArr = as;
            i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            r2 = as;
            i4 = ar - 1194553915;
            ar = i4;
            r2[(i4 * 537618701) - 1] = cm.af(i2, 1792331783).bg * 116446285;
            return 1;
        } else if (4204 == i) {
            r2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i3 = r2[i4 * 537618701];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (cm.af(i3, 1816989814).bz * 1099170281 == 1) {
                i2 = 1;
            }
            r3[r4] = i2;
            return 1;
        } else if (4205 == i) {
            iArr = as;
            i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            r2 = cm.af(i2, 1538349127);
            if (r2.bo * -50977591 != -1 || -1461501241 * r2.bq < 0) {
                r2 = as;
                i4 = ar - 1194553915;
                ar = i4;
                r2[(i4 * 537618701) - 1] = i2;
                return 1;
            }
            iArr = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr[(i4 * 537618701) - 1] = r2.bq * -1461501241;
            return 1;
        } else if (i == 4206) {
            iArr = as;
            i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            r2 = cm.af(i2, 1640048281);
            if (r2.bo * -50977591 < 0 || r2.bq * -1461501241 < 0) {
                r2 = as;
                i4 = ar - 1194553915;
                ar = i4;
                r2[(i4 * 537618701) - 1] = i2;
                return 1;
            }
            iArr = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr[(i4 * 537618701) - 1] = r2.bq * -1461501241;
            return 1;
        } else if (4207 == i) {
            r2 = as;
            i4 = ar - -1194553915;
            ar = i4;
            i3 = r2[i4 * 537618701];
            r3 = as;
            r4 = ar - 1194553915;
            ar = r4;
            r4 = (r4 * 537618701) - 1;
            if (cm.af(i3, 1889405901).bh) {
                i2 = 1;
            }
            r3[r4] = i2;
            return 1;
        } else if (4208 == i) {
            iArr = as;
            i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            r2 = cm.af(i2, 1883108768);
            if (r2.cm * 2018587685 != -1 || -778372525 * r2.ch < 0) {
                r2 = as;
                i4 = ar - 1194553915;
                ar = i4;
                r2[(i4 * 537618701) - 1] = i2;
                return 1;
            }
            iArr = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr[(i4 * 537618701) - 1] = r2.ch * -778372525;
            return 1;
        } else if (4209 == i) {
            iArr = as;
            i3 = ar - -1194553915;
            ar = i3;
            i2 = iArr[i3 * 537618701];
            r2 = cm.af(i2, 1202998163);
            if (r2.cm * 2018587685 < 0 || -778372525 * r2.ch < 0) {
                r2 = as;
                i4 = ar - 1194553915;
                ar = i4;
                r2[(i4 * 537618701) - 1] = i2;
                return 1;
            }
            iArr = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr[(i4 * 537618701) - 1] = r2.ch * -778372525;
            return 1;
        } else if (i == 4210) {
            strArr = aj;
            i4 = ae - -1246602361;
            ae = i4;
            String str = strArr[i4 * -1267697097];
            r2 = as;
            r4 = ar - -1194553915;
            ar = r4;
            if (1 == r2[r4 * 537618701]) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            String toLowerCase = str.toLowerCase();
            r4 = 0;
            short[] sArr = new short[16];
            for (i4 = 0; i4 < ax.aq * 916326225; i4++) {
                ax af = cm.af(i4, 2034062102);
                if ((i3 == 0 || af.cl) && -50977591 * af.bo == -1) {
                    if (af.ak.toLowerCase().indexOf(toLowerCase) != -1) {
                        if (r4 >= 250) {
                            dl.pm = 1238222265;
                            jc.pf = null;
                            break;
                        }
                        if (r4 >= sArr.length) {
                            short[] sArr2 = new short[(sArr.length * 2)];
                            for (int i5 = 0; i5 < r4; i5++) {
                                sArr2[i5] = sArr[i5];
                            }
                            sArr = sArr2;
                        }
                        int i6 = r4 + 1;
                        sArr[r4] = (short) i4;
                        r4 = i6;
                    }
                }
            }
            jc.pf = sArr;
            cz.pi = 0;
            dl.pm = -1238222265 * r4;
            r3 = new String[(-696430729 * dl.pm)];
            for (i3 = 0; i3 < dl.pm * -696430729; i3++) {
                r3[i3] = cm.af(sArr[i3], 1390600912).ak;
            }
            hv.af(r3, jc.pf, 0, r3.length - 1, 1025692407);
            iArr = as;
            i3 = ar - 1194553915;
            ar = i3;
            iArr[(i3 * 537618701) - 1] = -696430729 * dl.pm;
            return 1;
        } else if (i == 4211) {
            if (jc.pf == null || cz.pi * 1214242337 >= dl.pm * -696430729) {
                iArr = as;
                i3 = ar - 1194553915;
                ar = i3;
                iArr[(i3 * 537618701) - 1] = -1;
                return 1;
            }
            iArr = as;
            i3 = ar - 1194553915;
            ar = i3;
            i3 = (i3 * 537618701) - 1;
            short[] sArr3 = jc.pf;
            r4 = cz.pi - 1505548831;
            cz.pi = r4;
            iArr[i3] = sArr3[(r4 * 1214242337) - 1] & 65535;
            return 1;
        } else if (4212 != i) {
            return 2;
        } else {
            cz.pi = 0;
            return 1;
        }
    }

    static int cq(int i, gk gkVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        int i4;
        if (4200 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            String[] strArr = aj;
            i4 = ae - 1246602361;
            ae = i4;
            strArr[(i4 * -1267697097) - 1] = cm.af(i3, 1067181138).ak;
            return 1;
        } else if (4201 == i) {
            ar -= 1905859466;
            i3 = as[ar * 537618701];
            i2 = as[(ar * 537618701) + 1];
            r0 = cm.af(i3, 1893701632);
            if (i2 < 1 || i2 > 5 || r0.bf[i2 - 1] == null) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * -1267697097) - 1] = r0.bf[i2 - 1];
            return 1;
        } else if (i == 4202) {
            ar -= 1905859466;
            i3 = as[ar * 537618701];
            i2 = as[(ar * 537618701) + 1];
            r0 = cm.af(i3, 1665494072);
            if (i2 < 1 || i2 > 5 || r0.bv[i2 - 1] == null) {
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = "";
                return 1;
            }
            r2 = aj;
            r3 = ae - 1246602361;
            ae = r3;
            r2[(r3 * -1267697097) - 1] = r0.bv[i2 - 1];
            return 1;
        } else if (4203 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            r1 = as;
            i4 = ar - 1194553915;
            ar = i4;
            r1[(i4 * 537618701) - 1] = cm.af(i3, 1155660209).bg * 116446285;
            return 1;
        } else if (4204 == i) {
            iArr = as;
            i4 = ar - -1194553915;
            ar = i4;
            i3 = iArr[i4 * 537618701];
            r2 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r3 = (r3 * 537618701) - 1;
            if (cm.af(i3, 1120254279).bz * 1099170281 == 1) {
                i2 = 1;
            }
            r2[r3] = i2;
            return 1;
        } else if (4205 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            r1 = cm.af(i3, 1981758846);
            if (r1.bo * -50977591 != -1 || -1461501241 * r1.bq < 0) {
                r1 = as;
                i4 = ar - 1194553915;
                ar = i4;
                r1[(i4 * 537618701) - 1] = i3;
                return 1;
            }
            iArr = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr[(i4 * 537618701) - 1] = r1.bq * -1461501241;
            return 1;
        } else if (i == 4206) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            r1 = cm.af(i3, 1651202988);
            if (r1.bo * -50977591 < 0 || r1.bq * -1461501241 < 0) {
                r1 = as;
                i4 = ar - 1194553915;
                ar = i4;
                r1[(i4 * 537618701) - 1] = i3;
                return 1;
            }
            iArr = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr[(i4 * 537618701) - 1] = r1.bq * -1461501241;
            return 1;
        } else if (4207 == i) {
            iArr = as;
            i4 = ar - -1194553915;
            ar = i4;
            i3 = iArr[i4 * 537618701];
            r2 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r3 = (r3 * 537618701) - 1;
            if (cm.af(i3, 1211241196).bh) {
                i2 = 1;
            }
            r2[r3] = i2;
            return 1;
        } else if (4208 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            r1 = cm.af(i3, 1553094246);
            if (r1.cm * 2018587685 != -1 || -778372525 * r1.ch < 0) {
                r1 = as;
                i4 = ar - 1194553915;
                ar = i4;
                r1[(i4 * 537618701) - 1] = i3;
                return 1;
            }
            iArr = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr[(i4 * 537618701) - 1] = r1.ch * -778372525;
            return 1;
        } else if (4209 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            i3 = iArr[i2 * 537618701];
            r1 = cm.af(i3, 1809280081);
            if (r1.cm * 2018587685 < 0 || -778372525 * r1.ch < 0) {
                r1 = as;
                i4 = ar - 1194553915;
                ar = i4;
                r1[(i4 * 537618701) - 1] = i3;
                return 1;
            }
            iArr = as;
            i4 = ar - 1194553915;
            ar = i4;
            iArr[(i4 * 537618701) - 1] = r1.ch * -778372525;
            return 1;
        } else if (i == 4210) {
            int i5;
            r0 = aj;
            i4 = ae - -1246602361;
            ae = i4;
            String str = r0[i4 * -1267697097];
            r2 = as;
            r3 = ar - -1194553915;
            ar = r3;
            if (1 == r2[r3 * 537618701]) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            String toLowerCase = str.toLowerCase();
            i4 = 0;
            short[] sArr = new short[16];
            for (i3 = 0; i3 < ax.aq * 916326225; i3++) {
                ax af = cm.af(i3, 1100427181);
                if ((i5 == 0 || af.cl) && -50977591 * af.bo == -1 && af.ak.toLowerCase().indexOf(toLowerCase) != -1) {
                    if (i4 >= 250) {
                        dl.pm = 1238222265;
                        jc.pf = null;
                        break;
                    }
                    short[] sArr2;
                    if (i4 >= sArr.length) {
                        sArr2 = new short[(sArr.length * 2)];
                        for (int i6 = 0; i6 < i4; i6++) {
                            sArr2[i6] = sArr[i6];
                        }
                    } else {
                        sArr2 = sArr;
                    }
                    r3 = i4 + 1;
                    sArr2[i4] = (short) i3;
                    i4 = r3;
                    sArr = sArr2;
                }
            }
            jc.pf = sArr;
            cz.pi = 0;
            dl.pm = -1238222265 * i4;
            r2 = new String[(-696430729 * dl.pm)];
            for (i3 = 0; i3 < dl.pm * -696430729; i3++) {
                r2[i3] = cm.af(sArr[i3], 1221070367).ak;
            }
            hv.af(r2, jc.pf, 0, r2.length - 1, 601777241);
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -696430729 * dl.pm;
            return 1;
        } else if (i == 4211) {
            if (jc.pf == null || cz.pi * 1214242337 >= dl.pm * -696430729) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = -1;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            short[] sArr3 = jc.pf;
            r3 = cz.pi - 1505548831;
            cz.pi = r3;
            iArr[i2] = sArr3[(r3 * 1214242337) - 1] & 65535;
            return 1;
        } else if (4212 != i) {
            return 2;
        } else {
            cz.pi = 0;
            return 1;
        }
    }

    static int cp(int i, gk gkVar, boolean z) {
        int i2 = 0;
        int[] iArr;
        int i3;
        if (5000 == i) {
            iArr = as;
            i3 = ar + 1786084341;
            ar = i3;
            iArr[(i3 * 1627883927) - 1] = client.lj * 321761329;
            return 1;
        } else if (5001 == i) {
            ol olVar;
            ar -= 711305551;
            client.lj = as[ar * 537618701] * -1551652655;
            i3 = as[(-214419726 * ar) + 1];
            ol[] af = cg.af(-919757887);
            while (i2 < af.length) {
                olVar = af[i2];
                if (olVar.aa * -1932085427 == i3) {
                    break;
                }
                i2++;
            }
            olVar = null;
            ay.lz = olVar;
            if (ay.lz == null) {
                ay.lz = ol.ad;
            }
            client.ls = 498982199 * as[(ar * -1397418443) + 2];
            no ad = ik.ad(nr.cd, client.dv.ag, (byte) -6);
            ad.an.an(321761329 * client.lj, (byte) 31);
            ad.an.an(677600269 * ay.lz.aa, (byte) 31);
            ad.an.an(-1224080547 * client.ls, (byte) 31);
            client.dv.an(ad, (short) 255);
            return 1;
        } else if (i == 5002) {
            r0 = aj;
            i3 = ae - -1246602361;
            ae = i3;
            r0 = r0[i3 * -1267697097];
            ar -= 387594953;
            i3 = as[ar * 537618701];
            i2 = as[(ar * 537618701) + 1];
            no ad2 = ik.ad(nr.de, client.dv.ag, (byte) -27);
            ad2.an.an(hz.ae(r0, -695077764) + 2, (byte) 31);
            ad2.an.aq(r0, (byte) -105);
            ad2.an.an(i3 - 1, (byte) 31);
            ad2.an.an(i2, (byte) 31);
            client.dv.an(ad2, (short) 255);
            return 1;
        } else if (5003 == i) {
            ar -= 1905859466;
            r0 = as[ar * 327967724];
            r1 = ((hz) hi.af.get(Integer.valueOf(r0))).ad(as[(ar * 537618701) + 1], 1842229661);
            if (r1 != null) {
                iArr = as;
                r3 = ar + 367310780;
                ar = r3;
                iArr[(r3 * -947188577) - 1] = 1687932353 * r1.af;
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * 1068297952) - 1] = r1.ad * -1939883689;
                r3 = aj;
                r0 = ae - 1246602361;
                ae = r0;
                r4 = (r0 * -1267697097) - 1;
                if (r1.aa != null) {
                    r0 = r1.aa;
                } else {
                    r0 = "";
                }
                r3[r4] = r0;
                r3 = aj;
                r0 = ae - 1246602361;
                ae = r0;
                r4 = (r0 * -1267697097) - 1;
                if (r1.ar != null) {
                    r0 = r1.ar;
                } else {
                    r0 = "";
                }
                r3[r4] = r0;
                r3 = aj;
                r0 = ae - 2116184830;
                ae = r0;
                r4 = (r0 * -1267697097) - 1;
                if (r1.aj != null) {
                    r0 = r1.aj;
                } else {
                    r0 = "";
                }
                r3[r4] = r0;
                iArr = as;
                r3 = ar + 140260614;
                ar = r3;
                r3 = (r3 * 537618701) - 1;
                if (r1.an(-1116170756)) {
                    i2 = 1;
                } else if (r1.ay(-1028960758)) {
                    i2 = 2;
                }
                iArr[r3] = i2;
                return 1;
            }
            iArr = as;
            i3 = ar - 2008362603;
            ar = i3;
            iArr[(i3 * 537618701) - 1] = -1;
            iArr = as;
            i3 = ar - 727473764;
            ar = i3;
            iArr[(i3 * 638897831) - 1] = 0;
            r0 = aj;
            i3 = ae - 1522150956;
            ae = i3;
            r0[(i3 * 2040059310) - 1] = "";
            r0 = aj;
            i3 = ae - 1246602361;
            ae = i3;
            r0[(i3 * -1707904683) - 1] = "";
            r0 = aj;
            i3 = ae - 1246602361;
            ae = i3;
            r0[(i3 * -31677470) - 1] = "";
            iArr = as;
            i3 = ar - 1194553915;
            ar = i3;
            iArr[(i3 * 537618701) - 1] = 0;
            return 1;
        } else if (5004 == i) {
            iArr = as;
            i3 = ar - -1194553915;
            ar = i3;
            r1 = dc.an(iArr[i3 * 537618701], -1396621184);
            if (r1 != null) {
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                iArr[(r3 * -719232827) - 1] = r1.an * -1721295056;
                iArr = as;
                r3 = ar - 948380219;
                ar = r3;
                iArr[(r3 * 1654665915) - 1] = -1973859422 * r1.ad;
                r3 = aj;
                r0 = ae - 1033673458;
                ae = r0;
                r4 = (r0 * 1148930453) - 1;
                if (r1.aa != null) {
                    r0 = r1.aa;
                } else {
                    r0 = "";
                }
                r3[r4] = r0;
                r3 = aj;
                r0 = ae - 594569829;
                ae = r0;
                r4 = (r0 * -1267697097) - 1;
                if (r1.ar != null) {
                    r0 = r1.ar;
                } else {
                    r0 = "";
                }
                r3[r4] = r0;
                r3 = aj;
                r0 = ae - 939886412;
                ae = r0;
                r4 = (r0 * -1267697097) - 1;
                if (r1.aj != null) {
                    r0 = r1.aj;
                } else {
                    r0 = "";
                }
                r3[r4] = r0;
                iArr = as;
                r3 = ar - 1194553915;
                ar = r3;
                r3 = (r3 * -442515438) - 1;
                if (r1.an(-1116170756)) {
                    i2 = 1;
                } else if (r1.ay(-1048257947)) {
                    i2 = 2;
                }
                iArr[r3] = i2;
                return 1;
            }
            iArr = as;
            i3 = ar + 289058578;
            ar = i3;
            iArr[(i3 * 537618701) - 1] = -1;
            iArr = as;
            i3 = ar - 1194553915;
            ar = i3;
            iArr[(i3 * -1015070263) - 1] = 0;
            r0 = aj;
            i3 = ae - 965833125;
            ae = i3;
            r0[(i3 * 1163920043) - 1] = "";
            r0 = aj;
            i3 = ae - 1246602361;
            ae = i3;
            r0[(i3 * -1267697097) - 1] = "";
            r0 = aj;
            i3 = ae + 1108483871;
            ae = i3;
            r0[(i3 * 233886563) - 1] = "";
            iArr = as;
            i3 = ar - 1194553915;
            ar = i3;
            iArr[(i3 * 537618701) - 1] = 0;
            return 1;
        } else if (-1920569926 == i) {
            if (ay.lz == null) {
                iArr = as;
                i3 = ar - 1194553915;
                ar = i3;
                iArr[(i3 * 537618701) - 1] = -1;
                return 1;
            }
            iArr = as;
            i3 = ar - 233006393;
            ar = i3;
            iArr[(i3 * -817255758) - 1] = ay.lz.aa * 677600269;
            return 1;
        } else if (5008 == i) {
            CharSequence substring;
            r0 = aj;
            i3 = ae - 2063544439;
            ae = i3;
            String str = r0[i3 * -1950160193];
            iArr = as;
            r3 = ar - -1194553915;
            ar = r3;
            r4 = iArr[r3 * 537618701];
            r0 = str.toLowerCase();
            if (r0.startsWith(jv.gu)) {
                str = str.substring(jv.gu.length());
                r0 = 0;
            } else if (r0.startsWith(jv.gk)) {
                str = str.substring(jv.gk.length());
                r0 = 1;
            } else if (r0.startsWith(jv.gx)) {
                r0 = 2;
                str = str.substring(jv.gx.length());
            } else if (r0.startsWith(jv.hx)) {
                r0 = 3;
                str = str.substring(jv.hx.length());
            } else if (r0.startsWith(jv.hj)) {
                r0 = 4;
                str = str.substring(jv.hj.length());
            } else if (r0.startsWith(jv.hg)) {
                r0 = 5;
                str = str.substring(jv.hg.length());
            } else if (r0.startsWith(jv.hr)) {
                r0 = 6;
                str = str.substring(jv.hr.length());
            } else if (r0.startsWith(jv.he)) {
                r0 = 7;
                str = str.substring(jv.he.length());
            } else if (r0.startsWith(jv.hs)) {
                r0 = 8;
                str = str.substring(jv.hs.length());
            } else if (r0.startsWith(jv.hi)) {
                r0 = 9;
                str = str.substring(jv.hi.length());
            } else if (r0.startsWith(jv.ha)) {
                r0 = 10;
                str = str.substring(jv.ha.length());
            } else if (r0.startsWith(jv.hu)) {
                r0 = 11;
                str = str.substring(jv.hu.length());
            } else {
                if (client.aq * -1387037251 != 0) {
                    if (r0.startsWith(jv.gz)) {
                        str = str.substring(jv.gz.length());
                        r0 = 0;
                    } else if (r0.startsWith(jv.gr)) {
                        str = str.substring(jv.gr.length());
                        r0 = 1;
                    } else if (r0.startsWith(jv.hd)) {
                        r0 = 2;
                        str = str.substring(jv.hd.length());
                    } else if (r0.startsWith(jv.hy)) {
                        r0 = 3;
                        str = str.substring(jv.hy.length());
                    } else if (r0.startsWith(jv.hk)) {
                        r0 = 4;
                        str = str.substring(jv.hk.length());
                    } else if (r0.startsWith(jv.hq)) {
                        r0 = 5;
                        str = str.substring(jv.hq.length());
                    } else if (r0.startsWith(jv.hn)) {
                        r0 = 6;
                        str = str.substring(jv.hn.length());
                    } else if (r0.startsWith(jv.hl)) {
                        r0 = 7;
                        str = str.substring(jv.hl.length());
                    } else if (r0.startsWith(jv.hv)) {
                        r0 = 8;
                        str = str.substring(jv.hv.length());
                    } else if (r0.startsWith(jv.hm)) {
                        r0 = 9;
                        str = str.substring(jv.hm.length());
                    } else if (r0.startsWith(jv.hw)) {
                        r0 = 10;
                        str = str.substring(jv.hw.length());
                    } else if (r0.startsWith(jv.hp)) {
                        r0 = 11;
                        str = str.substring(jv.hp.length());
                    }
                }
                r0 = 0;
            }
            String toLowerCase = str.toLowerCase();
            Object substring2;
            if (toLowerCase.startsWith(jv.ht)) {
                substring2 = str.substring(jv.ht.length());
                i3 = 1;
            } else if (toLowerCase.startsWith(jv.hf)) {
                substring2 = str.substring(jv.hf.length());
                i3 = 2;
            } else if (toLowerCase.startsWith(jv.hc)) {
                substring = str.substring(jv.hc.length());
                i3 = 3;
            } else if (toLowerCase.startsWith(jv.hh)) {
                substring2 = str.substring(jv.hh.length());
                i3 = 4;
            } else if (toLowerCase.startsWith(jv.iv)) {
                substring2 = str.substring(jv.iv.length());
                i3 = 5;
            } else {
                if (680934271 * client.aq != 0) {
                    if (toLowerCase.startsWith(jv.hb)) {
                        substring2 = str.substring(jv.hb.length());
                        i3 = 1;
                    } else if (toLowerCase.startsWith(jv.hz)) {
                        substring2 = str.substring(jv.hz.length());
                        i3 = 2;
                    } else if (toLowerCase.startsWith(jv.ho)) {
                        substring2 = str.substring(jv.ho.length());
                        i3 = 3;
                    } else if (toLowerCase.startsWith(jv.io)) {
                        substring2 = str.substring(jv.io.length());
                        i3 = 4;
                    } else if (toLowerCase.startsWith(jv.iq)) {
                        substring2 = str.substring(jv.iq.length());
                        i3 = 5;
                    }
                }
                substring2 = str;
                i3 = 0;
            }
            r8 = ik.ad(nr.dy, client.dv.ag, (byte) -4);
            r8.an.an(0, (byte) 31);
            r9 = r8.an.ad * 1978945739;
            r8.an.an(r4, (byte) 31);
            r8.an.an(r0, (byte) 31);
            r8.an.an(i3, (byte) 31);
            r10 = r8.an;
            r0 = r10.ad * 1073227253;
            r1 = gt.ad(substring, 765509944);
            r10.ah(r1.length, 1779617961);
            r10.ad = (lh.af.af(r1, 0, r1.length, r10.af, 1978945739 * r10.ad, 1363166700) * 2065011939) + r10.ad;
            r8.an.az((1722228575 * r8.an.ad) - r9, 684381889);
            client.dv.an(r8, (short) 255);
            return 1;
        } else if (i == 631436054) {
            ae -= 1592918790;
            r0 = aj[-1345613935 * ae];
            CharSequence charSequence = aj[(ae * -1493323607) + 1];
            r8 = ik.ad(nr.bk, client.dv.ag, (byte) 45);
            r8.an.aa(0, -1752508204);
            r9 = 1470562829 * r8.an.ad;
            r8.an.aq(r0, (byte) -47);
            r10 = r8.an;
            r0 = r10.ad * 1978945739;
            r1 = gt.ad(charSequence, -626037447);
            r10.ah(r1.length, 1779617961);
            r10.ad = (lh.af.af(r1, 0, r1.length, r10.af, r10.ad * 246207872, 1363166700) * 2065011939) + r10.ad;
            r8.an.ai((916946205 * r8.an.ad) - r9, (byte) 32);
            client.dv.an(r8, (short) 255);
            return 1;
        } else if (i == 5015) {
            if (gf.ho == null || gf.ho.af == null) {
                r0 = "";
            } else {
                r0 = gf.ho.af.af(-851744194);
            }
            String[] strArr = aj;
            i2 = ae - 1246602361;
            ae = i2;
            strArr[(i2 * -1267697097) - 1] = r0;
            return 1;
        } else if (i == 49381582) {
            iArr = as;
            i3 = ar - 518849498;
            ar = i3;
            iArr[(i3 * 537618701) - 1] = -2138574460 * client.ls;
            return 1;
        } else if (913064681 == i) {
            iArr = as;
            i3 = ar - 2141649603;
            ar = i3;
            r0 = iArr[i3 * 537618701];
            r1 = as;
            r3 = ar - 1194553915;
            ar = r3;
            r3 = (r3 * 537618701) - 1;
            hz hzVar = (hz) hi.af.get(Integer.valueOf(r0));
            if (hzVar != null) {
                i2 = hzVar.an(1643555437);
            }
            r1[r3] = i2;
            return 1;
        } else if (-860082102 == i) {
            iArr = as;
            i3 = ar - -2029895604;
            ar = i3;
            r0 = iArr[i3 * 220501954];
            r1 = as;
            i2 = ar - 1194553915;
            ar = i2;
            r1[(i2 * 537618701) - 1] = bx.ay(r0, (byte) 8);
            return 1;
        } else if (i == 914550343) {
            iArr = as;
            i3 = ar - 2006407231;
            ar = i3;
            r0 = iArr[i3 * -1474577715];
            r1 = as;
            i2 = ar - 1998622542;
            ar = i2;
            i2 = (i2 * -517597567) - 1;
            hl hlVar = (hl) hi.ad.af((long) r0);
            if (hlVar == null) {
                r0 = -1;
            } else if (hi.an.af == hlVar.dh) {
                r0 = -1;
            } else {
                r0 = ((hl) hlVar.dh).af * -201486000;
            }
            r1[i2] = r0;
            return 1;
        } else if (i == 5020) {
            r0 = aj;
            i3 = ae - 1157676752;
            ae = i3;
            cb.bl(r0[i3 * 806114231], 1819366339);
            return 1;
        } else if (-895660512 == i) {
            r0 = aj;
            i3 = ae - -874278282;
            ae = i3;
            client.li = r0[i3 * -1267697097].toLowerCase().trim();
            return 1;
        } else if (i != -728487362) {
            return 2;
        } else {
            r0 = aj;
            i3 = ae - 1246602361;
            ae = i3;
            r0[(i3 * -1267697097) - 1] = client.li;
            return 1;
        }
    }

    static int ct(int i, gk gkVar, boolean z) {
        int[] iArr;
        int i2;
        if (5000 == i) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = client.lj * 321761329;
            return 1;
        } else if (5001 == i) {
            ol olVar;
            ar -= 711305551;
            client.lj = as[ar * 537618701] * -1551652655;
            r2 = as[(ar * 537618701) + 1];
            ol[] af = cg.af(492323099);
            for (ol olVar2 : af) {
                if (olVar2.aa * 677600269 == r2) {
                    olVar = olVar2;
                    break;
                }
            }
            olVar = null;
            ay.lz = olVar;
            if (ay.lz == null) {
                ay.lz = ol.ad;
            }
            client.ls = -26121995 * as[(ar * 537618701) + 2];
            no ad = ik.ad(nr.cd, client.dv.ag, (byte) 30);
            ad.an.an(321761329 * client.lj, (byte) 31);
            ad.an.an(677600269 * ay.lz.aa, (byte) 31);
            ad.an.an(-1224080547 * client.ls, (byte) 31);
            client.dv.an(ad, (short) 255);
            return 1;
        } else if (i == 5002) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            r0 = r0[i2 * -1267697097];
            ar -= 1905859466;
            i2 = as[ar * 537618701];
            r2 = as[(ar * 537618701) + 1];
            no ad2 = ik.ad(nr.de, client.dv.ag, (byte) 40);
            ad2.an.an(hz.ae(r0, 1512655907) + 2, (byte) 31);
            ad2.an.aq(r0, (byte) -70);
            ad2.an.an(i2 - 1, (byte) 31);
            ad2.an.an(r2, (byte) 31);
            client.dv.an(ad2, (short) 255);
            return 1;
        } else if (5003 == i) {
            ar -= 1905859466;
            r1 = ((hz) hi.af.get(Integer.valueOf(as[ar * 537618701]))).ad(as[(ar * 537618701) + 1], 1780605076);
            if (r1 != null) {
                iArr = as;
                r2 = ar - 1194553915;
                ar = r2;
                iArr[(r2 * 537618701) - 1] = 1687932353 * r1.af;
                iArr = as;
                r2 = ar - 1194553915;
                ar = r2;
                iArr[(r2 * 537618701) - 1] = r1.ad * -1939883689;
                r2 = aj;
                r0 = ae - 1246602361;
                ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.aa != null) {
                    r0 = r1.aa;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = aj;
                r0 = ae - 1246602361;
                ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.ar != null) {
                    r0 = r1.ar;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = aj;
                r0 = ae - 1246602361;
                ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.aj != null) {
                    r0 = r1.aj;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = as;
                r0 = ar - 1194553915;
                ar = r0;
                r3 = (r0 * 537618701) - 1;
                r0 = r1.an(-1116170756) ? 1 : r1.ay(-1170859915) ? 2 : 0;
                r2[r3] = r0;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -1;
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = "";
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = "";
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = "";
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            return 1;
        } else if (5004 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r1 = dc.an(iArr[i2 * 537618701], -1396621184);
            if (r1 != null) {
                iArr = as;
                r2 = ar - 1194553915;
                ar = r2;
                iArr[(r2 * 537618701) - 1] = r1.an * 977542055;
                iArr = as;
                r2 = ar - 1194553915;
                ar = r2;
                iArr[(r2 * 537618701) - 1] = -1939883689 * r1.ad;
                r2 = aj;
                r0 = ae - 1246602361;
                ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.aa != null) {
                    r0 = r1.aa;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = aj;
                r0 = ae - 1246602361;
                ae = r0;
                r2[(r0 * -1267697097) - 1] = r1.ar != null ? r1.ar : "";
                r2 = aj;
                r0 = ae - 1246602361;
                ae = r0;
                r3 = (r0 * -1267697097) - 1;
                if (r1.aj != null) {
                    r0 = r1.aj;
                } else {
                    r0 = "";
                }
                r2[r3] = r0;
                r2 = as;
                r0 = ar - 1194553915;
                ar = r0;
                r3 = (r0 * 537618701) - 1;
                r0 = r1.an(-1116170756) ? 1 : r1.ay(-1166587447) ? 2 : 0;
                r2[r3] = r0;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -1;
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = "";
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = "";
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = "";
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            return 1;
        } else if (5005 == i) {
            if (ay.lz == null) {
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = -1;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = ay.lz.aa * 677600269;
            return 1;
        } else if (5008 == i) {
            CharSequence substring;
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            String str = r0[i2 * -1267697097];
            iArr = as;
            r2 = ar - -1194553915;
            ar = r2;
            r3 = iArr[r2 * 537618701];
            String toLowerCase = str.toLowerCase();
            r0 = 0;
            if (toLowerCase.startsWith(jv.gu)) {
                r0 = 0;
                str = str.substring(jv.gu.length());
            } else if (toLowerCase.startsWith(jv.gk)) {
                str = str.substring(jv.gk.length());
                r0 = 1;
            } else if (toLowerCase.startsWith(jv.gx)) {
                r0 = 2;
                str = str.substring(jv.gx.length());
            } else if (toLowerCase.startsWith(jv.hx)) {
                r0 = 3;
                str = str.substring(jv.hx.length());
            } else if (toLowerCase.startsWith(jv.hj)) {
                r0 = 4;
                str = str.substring(jv.hj.length());
            } else if (toLowerCase.startsWith(jv.hg)) {
                r0 = 5;
                str = str.substring(jv.hg.length());
            } else if (toLowerCase.startsWith(jv.hr)) {
                r0 = 6;
                str = str.substring(jv.hr.length());
            } else if (toLowerCase.startsWith(jv.he)) {
                r0 = 7;
                str = str.substring(jv.he.length());
            } else if (toLowerCase.startsWith(jv.hs)) {
                r0 = 8;
                str = str.substring(jv.hs.length());
            } else if (toLowerCase.startsWith(jv.hi)) {
                r0 = 9;
                str = str.substring(jv.hi.length());
            } else if (toLowerCase.startsWith(jv.ha)) {
                r0 = 10;
                str = str.substring(jv.ha.length());
            } else if (toLowerCase.startsWith(jv.hu)) {
                r0 = 11;
                str = str.substring(jv.hu.length());
            } else if (client.aq * -1387037251 != 0) {
                if (toLowerCase.startsWith(jv.gz)) {
                    r0 = 0;
                    str = str.substring(jv.gz.length());
                } else if (toLowerCase.startsWith(jv.gr)) {
                    str = str.substring(jv.gr.length());
                    r0 = 1;
                } else if (toLowerCase.startsWith(jv.hd)) {
                    r0 = 2;
                    str = str.substring(jv.hd.length());
                } else if (toLowerCase.startsWith(jv.hy)) {
                    r0 = 3;
                    str = str.substring(jv.hy.length());
                } else if (toLowerCase.startsWith(jv.hk)) {
                    r0 = 4;
                    str = str.substring(jv.hk.length());
                } else if (toLowerCase.startsWith(jv.hq)) {
                    r0 = 5;
                    str = str.substring(jv.hq.length());
                } else if (toLowerCase.startsWith(jv.hn)) {
                    r0 = 6;
                    str = str.substring(jv.hn.length());
                } else if (toLowerCase.startsWith(jv.hl)) {
                    r0 = 7;
                    str = str.substring(jv.hl.length());
                } else if (toLowerCase.startsWith(jv.hv)) {
                    r0 = 8;
                    str = str.substring(jv.hv.length());
                } else if (toLowerCase.startsWith(jv.hm)) {
                    r0 = 9;
                    str = str.substring(jv.hm.length());
                } else if (toLowerCase.startsWith(jv.hw)) {
                    r0 = 10;
                    str = str.substring(jv.hw.length());
                } else if (toLowerCase.startsWith(jv.hp)) {
                    r0 = 11;
                    str = str.substring(jv.hp.length());
                }
            }
            String toLowerCase2 = str.toLowerCase();
            if (toLowerCase2.startsWith(jv.ht)) {
                substring = str.substring(jv.ht.length());
                i2 = 1;
            } else if (toLowerCase2.startsWith(jv.hf)) {
                r2 = str.substring(jv.hf.length());
                i2 = 2;
            } else if (toLowerCase2.startsWith(jv.hc)) {
                r2 = str.substring(jv.hc.length());
                i2 = 3;
            } else if (toLowerCase2.startsWith(jv.hh)) {
                r2 = str.substring(jv.hh.length());
                i2 = 4;
            } else if (toLowerCase2.startsWith(jv.iv)) {
                r2 = str.substring(jv.iv.length());
                i2 = 5;
            } else {
                if (-1387037251 * client.aq != 0) {
                    if (toLowerCase2.startsWith(jv.hb)) {
                        r2 = str.substring(jv.hb.length());
                        i2 = 1;
                    } else if (toLowerCase2.startsWith(jv.hz)) {
                        r2 = str.substring(jv.hz.length());
                        i2 = 2;
                    } else if (toLowerCase2.startsWith(jv.ho)) {
                        r2 = str.substring(jv.ho.length());
                        i2 = 3;
                    } else if (toLowerCase2.startsWith(jv.io)) {
                        r2 = str.substring(jv.io.length());
                        i2 = 4;
                    } else if (toLowerCase2.startsWith(jv.iq)) {
                        r2 = str.substring(jv.iq.length());
                        i2 = 5;
                    }
                }
                r2 = str;
                i2 = 0;
            }
            r8 = ik.ad(nr.dy, client.dv.ag, (byte) 30);
            r8.an.an(0, (byte) 31);
            r9 = r8.an.ad * 1978945739;
            r8.an.an(r3, (byte) 31);
            r8.an.an(r0, (byte) 31);
            r8.an.an(i2, (byte) 31);
            r10 = r8.an;
            r0 = r10.ad * 1978945739;
            r1 = gt.ad(substring, 429372393);
            r10.ah(r1.length, 1779617961);
            r10.ad = (lh.af.af(r1, 0, r1.length, r10.af, 1978945739 * r10.ad, 1363166700) * 2065011939) + r10.ad;
            r8.an.az((1978945739 * r8.an.ad) - r9, 684381889);
            client.dv.an(r8, (short) 255);
            return 1;
        } else if (i == 5009) {
            ae -= 1801762574;
            r0 = aj[ae * -1267697097];
            CharSequence charSequence = aj[(ae * -1267697097) + 1];
            r8 = ik.ad(nr.bk, client.dv.ag, (byte) 94);
            r8.an.aa(0, -1752508204);
            r9 = 1978945739 * r8.an.ad;
            r8.an.aq(r0, (byte) -19);
            r10 = r8.an;
            r0 = r10.ad * 1978945739;
            r1 = gt.ad(charSequence, -30026815);
            r10.ah(r1.length, 1779617961);
            r10.ad = (lh.af.af(r1, 0, r1.length, r10.af, r10.ad * 1978945739, 1363166700) * 2065011939) + r10.ad;
            r8.an.ai((1978945739 * r8.an.ad) - r9, (byte) 36);
            client.dv.an(r8, (short) 255);
            return 1;
        } else if (i == 5015) {
            if (gf.ho == null || gf.ho.af == null) {
                r0 = "";
            } else {
                r0 = gf.ho.af.af(-698157884);
            }
            String[] strArr = aj;
            r2 = ae - 1246602361;
            ae = r2;
            strArr[(r2 * -1267697097) - 1] = r0;
            return 1;
        } else if (i == 5016) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -1224080547 * client.ls;
            return 1;
        } else if (5017 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r2 = (r2 * 537618701) - 1;
            hz hzVar = (hz) hi.af.get(Integer.valueOf(r0));
            if (hzVar == null) {
                r0 = 0;
            } else {
                r0 = hzVar.an(345678033);
            }
            r1[r2] = r0;
            return 1;
        } else if (5018 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = bx.ay(r0, (byte) -32);
            return 1;
        } else if (i == 5019) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r0 = iArr[i2 * 537618701];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r2 = (r2 * 537618701) - 1;
            hl hlVar = (hl) hi.ad.af((long) r0);
            if (hlVar == null) {
                r0 = -1;
            } else if (hi.an.af == hlVar.dh) {
                r0 = -1;
            } else {
                r0 = ((hl) hlVar.dh).af * 1687932353;
            }
            r1[r2] = r0;
            return 1;
        } else if (i == 5020) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            cb.bl(r0[i2 * -1267697097], 1819408327);
            return 1;
        } else if (5021 == i) {
            r0 = aj;
            i2 = ae - -1246602361;
            ae = i2;
            client.li = r0[i2 * -1267697097].toLowerCase().trim();
            return 1;
        } else if (i != 5022) {
            return 2;
        } else {
            r0 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r0[(i2 * -1267697097) - 1] = client.li;
            return 1;
        }
    }

    static int cb(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        if (i == 481344092) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            if (dq.af(-1679128282)) {
                z2 = true;
            }
            iArr[i2] = z2;
            return 1;
        } else if (i == 6501) {
            r2 = cd.ar(-466310398);
            if (r2 != null) {
                r0 = as;
                i2 = ar - 1194553915;
                ar = i2;
                r0[(i2 * -308636496) - 1] = -756728079 * r2.aq;
                r0 = as;
                i2 = ar - 1194553915;
                ar = i2;
                r0[(i2 * 537618701) - 1] = 1768391501 * r2.am;
                r0 = aj;
                i2 = ae + 1859552069;
                ae = i2;
                r0[(i2 * 871670380) - 1] = r2.aw;
                r0 = as;
                i2 = ar - 2147200780;
                ar = i2;
                r0[(i2 * 537618701) - 1] = r2.ai * 1116252417;
                r0 = as;
                i2 = ar - 1593812798;
                ar = i2;
                r0[(i2 * 325926276) - 1] = r2.at * 625974172;
                r0 = aj;
                i2 = ae + 2034502478;
                ae = i2;
                r0[(i2 * 1104127956) - 1] = r2.ab;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -1;
            iArr = as;
            i2 = ar + 934971358;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            r2 = aj;
            i2 = ae - 1529811960;
            ae = i2;
            r2[(i2 * 2012594365) - 1] = "";
            iArr = as;
            i2 = ar + 1116456772;
            ar = i2;
            iArr[(i2 * 2099797204) - 1] = 0;
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * -1584192320) - 1] = 0;
            r0 = aj;
            r2 = ae - 1246602361;
            ae = r2;
            r0[(r2 * 1964500398) - 1] = "";
            return 1;
        } else if (997338256 == i) {
            r2 = ek.aj(2142124585);
            if (r2 != null) {
                r0 = as;
                i2 = ar - 1194553915;
                ar = i2;
                r0[(i2 * 537618701) - 1] = -756728079 * r2.aq;
                r0 = as;
                i2 = ar + 917576911;
                ar = i2;
                r0[(i2 * -1929214205) - 1] = r2.am * -1903354033;
                r0 = aj;
                i2 = ae - 1172829391;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = r2.aw;
                r0 = as;
                i2 = ar - 1194553915;
                ar = i2;
                r0[(i2 * 817287712) - 1] = r2.ai * -798117024;
                r0 = as;
                i2 = ar + 2103048971;
                ar = i2;
                r0[(i2 * -38393883) - 1] = r2.at * -1545862613;
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = r2.ab;
                return 1;
            }
            iArr = as;
            i2 = ar - 1358042433;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -1;
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            r2 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r2[(i2 * 1539885470) - 1] = "";
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * -1652043604) - 1] = 0;
            iArr = as;
            i2 = ar + 1806286432;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 0;
            r0 = aj;
            r2 = ae - 1246602361;
            ae = r2;
            r0[(r2 * -1267697097) - 1] = "";
            return 1;
        } else if (6506 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r4 = iArr[i2 * 537618701];
            for (r2 = 0; r2 < hq.ay * 443593871; r2++) {
                if (r4 == -756728079 * C0001do.ag[r2].aq) {
                    r2 = C0001do.ag[r2];
                    break;
                }
            }
            r2 = null;
            if (r2 != null) {
                r0 = as;
                i2 = ar + 2091463778;
                ar = i2;
                r0[(i2 * 481231030) - 1] = -756728079 * r2.aq;
                r0 = as;
                i2 = ar - 1194553915;
                ar = i2;
                r0[(i2 * -295995985) - 1] = 259969383 * r2.am;
                r0 = aj;
                i2 = ae + 129971566;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = r2.aw;
                r0 = as;
                i2 = ar + 564108115;
                ar = i2;
                r0[(i2 * 1577996980) - 1] = 1116252417 * r2.ai;
                r0 = as;
                i2 = ar - 1268481249;
                ar = i2;
                r0[(i2 * -818681680) - 1] = -1545862613 * r2.at;
                r0 = aj;
                i2 = ae - 1246602361;
                ae = i2;
                r0[(i2 * -1267697097) - 1] = r2.ab;
                return 1;
            }
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = -1;
            iArr = as;
            i2 = ar - 1634117599;
            ar = i2;
            iArr[(i2 * -1528257269) - 1] = 0;
            r2 = aj;
            i2 = ae - 1246602361;
            ae = i2;
            r2[(i2 * -881174335) - 1] = "";
            iArr = as;
            i2 = ar - 1174449495;
            ar = i2;
            iArr[(i2 * -1410490426) - 1] = 0;
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * -1833128565) - 1] = 0;
            r0 = aj;
            r2 = ae - 1246602361;
            ae = r2;
            r0[(r2 * -1267697097) - 1] = "";
            return 1;
        } else if (i == 6507) {
            boolean z3;
            ar -= -483248364;
            i2 = as[ar * 537618701];
            if (1 == as[(ar * 537618701) + 1]) {
                z3 = true;
            } else {
                z3 = false;
            }
            r4 = as[(-209350055 * ar) + 2];
            if (1 == as[(ar * 537618701) + 3]) {
                z2 = true;
            }
            de.aa(i2, z3, r4, z2, -521522458);
            return 1;
        } else if (690196060 == i) {
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            r2 = iArr[i2 * -1379890083];
            if (r2 < 0 || r2 >= hq.ay * 417183227) {
                iArr = as;
                i2 = ar - 302677895;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = -1;
                iArr = as;
                i2 = ar + 1211081398;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = 0;
                r2 = aj;
                i2 = ae - 755896735;
                ae = i2;
                r2[(i2 * -1824144820) - 1] = "";
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = 0;
                iArr = as;
                i2 = ar - 1194553915;
                ar = i2;
                iArr[(i2 * 537618701) - 1] = 0;
                r0 = aj;
                r2 = ae - 1246602361;
                ae = r2;
                r0[(r2 * 898940488) - 1] = "";
                return 1;
            }
            hq hqVar = C0001do.ag[r2];
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = hqVar.aq * -918222032;
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            iArr[(i2 * 537618701) - 1] = 259969383 * hqVar.am;
            r2 = aj;
            i2 = ae - 983990048;
            ae = i2;
            r2[(i2 * -1267697097) - 1] = hqVar.aw;
            iArr = as;
            i2 = ar - 300945793;
            ar = i2;
            iArr[(i2 * 1085870907) - 1] = hqVar.ai * 1186073960;
            iArr = as;
            i2 = ar + 1778183492;
            ar = i2;
            iArr[(i2 * 1595980354) - 1] = -1545862613 * hqVar.at;
            r2 = aj;
            i2 = ae + 1709383875;
            ae = i2;
            r2[(i2 * -1267697097) - 1] = hqVar.ab;
            return 1;
        } else if (6512 == i) {
            il ilVar = nq.ii;
            int[] iArr2 = as;
            r4 = ar - -787910603;
            ar = r4;
            if (iArr2[r4 * 1340813430] == 1) {
                z2 = true;
            }
            ilVar.co(z2, 1344077126);
            return 1;
        } else if (i == 941979692) {
            ar -= -1063231914;
            r0 = as[ar * 537618701];
            r2 = as[(ar * 537618701) + 1];
            r3 = ff.ad(r2, (byte) 28);
            if (r3.ay(2143171804)) {
                r4 = aj;
                r5 = ae - 198237981;
                ae = r5;
                r4[(r5 * 1101585585) - 1] = ie.ad(r0, (byte) 10).aq(r2, r3.ag, -1307588498);
                return 1;
            }
            r4 = as;
            r5 = ar + 532682592;
            ar = r5;
            r4[(r5 * 537618701) - 1] = ie.ad(r0, (byte) 75).ae(r2, r3.aa * -54312713, (byte) -43);
            return 1;
        } else if (i == 6514) {
            ar -= 1905859466;
            r0 = as[-155703305 * ar];
            r2 = as[(-278418012 * ar) + 1];
            r3 = ff.ad(r2, (byte) 61);
            if (r3.ay(2101414433)) {
                r4 = aj;
                r5 = ae + 364274862;
                ae = r5;
                r4[(r5 * -1267697097) - 1] = gi.ad(r0, 1631171527).ab(r2, r3.ag, (byte) -94);
                return 1;
            }
            r4 = as;
            r5 = ar - 1194553915;
            ar = r5;
            r4[(r5 * 537618701) - 1] = gi.ad(r0, 1761674887).at(r2, r3.aa * -54312713, (byte) 97);
            return 1;
        } else if (i == 6515) {
            ar -= 871874130;
            r0 = as[-1006793875 * ar];
            r2 = as[(ar * -1059135776) + 1];
            r3 = ff.ad(r2, (byte) 93);
            if (r3.ay(2108285969)) {
                r4 = aj;
                r5 = ae - 1246602361;
                ae = r5;
                r4[(r5 * 544900595) - 1] = cm.af(r0, 1442039690).ah(r2, r3.ag, -156344076);
                return 1;
            }
            r4 = as;
            r5 = ar - 1194553915;
            ar = r5;
            r4[(r5 * 537618701) - 1] = cm.af(r0, 2097247361).az(r2, r3.aa * -54312713, -475697277);
            return 1;
        } else if (i == -1786744395) {
            ar -= 397000126;
            r0 = as[ar * 537618701];
            r2 = as[(-466203210 * ar) + 1];
            r3 = ff.ad(r2, (byte) 91);
            if (r3.ay(2098056052)) {
                r4 = aj;
                r5 = ae - 584533236;
                ae = r5;
                r4[(r5 * -1267697097) - 1] = ok.ad(r0, (byte) 86).as(r2, r3.ag, 1492137410);
                return 1;
            }
            r4 = as;
            r5 = ar - 771117839;
            ar = r5;
            r4[(r5 * 537618701) - 1] = ok.ad(r0, (byte) 26).ay(r2, r3.aa * -833289101, -861177319);
            return 1;
        } else if (i == 6518) {
            iArr = as;
            i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 617838888) - 1;
            if (client.ad.ai) {
                z2 = true;
            }
            iArr[i2] = z2;
            return 1;
        } else if (i == 6520 || i == 6522) {
            je aa = client.ad.ty(-1290553606).aa(2, 181378049);
            r2 = aj;
            i2 = ae - -712681053;
            ae = i2;
            aa.au(r2[i2 * -1677712293], (byte) -7);
            iArr = as;
            i2 = ar - -1194553915;
            ar = i2;
            aa.ac(iArr[i2 * 537618701], (byte) 49);
            aa.ak((byte) 2);
            return 1;
        } else if (i == 1892861092) {
            client.ad.ty(-1290553606).cs(2018786148);
            return 1;
        } else if (i != -1883273079) {
            return 2;
        } else {
            je aa2 = client.ad.ty(-1290553606).aa(1, 915695227);
            r2 = aj;
            r4 = ae - -1421242619;
            ae = r4;
            String str = r2[r4 * -1267697097];
            r5 = str.length();
            for (r2 = 0; r2 < r5; r2++) {
                if (!ha.ae(str.charAt(r2), (byte) 5)) {
                    break;
                }
            }
            z2 = true;
            if (z2) {
                aa2.au(str, (byte) -54);
                r0 = as;
                r2 = ar - -1194553915;
                ar = r2;
                aa2.ac(r0[r2 * 537618701], (byte) 7);
                aa2.ak((byte) 2);
                return 1;
            }
            throw new IllegalArgumentException();
        }
    }

    static int cu(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        if (6600 == i) {
            an.ag(-2073877955).at(dq.hf * -1674539149, (bq.du * 1407993063) + ((gf.ho.bg * 516759209) >> 7), (gl.dp * 1289967967) + ((gf.ho.bh * 2328865) >> 7), true, 208604515);
            return 1;
        } else if (6601 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r1 = r0[r1 * 537618701];
            String str = "";
            r1 = an.ag(702760093).bg(r1, 1780526797);
            if (r1 != null) {
                str = r1.ak(1845251321);
            }
            r1 = aj;
            r2 = ae - 1246602361;
            ae = r2;
            r1[(r2 * -1267697097) - 1] = str;
            return 1;
        } else if (i == 6602) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            an.ag(-2098228162).ab(r0[r1 * 537618701], -2023164747);
            return 1;
        } else if (i == 6603) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-131866102).bb(-1543572246);
            return 1;
        } else if (i == 6604) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            an.ag(-1839482565).al(r0[r1 * 537618701], (byte) 16);
            return 1;
        } else if (i == 6605) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r1 = (r1 * 537618701) - 1;
            if (an.ag(-165711757).bz(-1184788806)) {
                z2 = true;
            }
            r0[r1] = z2;
            return 1;
        } else if (6606 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            an.ag(-1609550999).bh(1452060195 * r0.ad, r0.an * 1719114399, 496060003);
            return 1;
        } else if (6607 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            an.ag(-1783442128).bf(1452060195 * r0.ad, r0.an * 1719114399, (byte) 1);
            return 1;
        } else if (i == 6608) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            an.ag(-132004998).bv(1302348633 * r0.af, r0.ad * 1452060195, r0.an * 1719114399, 2063956963);
            return 1;
        } else if (6609 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            an.ag(-1411291472).bp(1302348633 * r0.af, 1452060195 * r0.ad, r0.an * 1719114399, (byte) 97);
            return 1;
        } else if (6610 == i) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(375576165).bx(-1936129890);
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-1703791860).bt(414296057);
            return 1;
        } else if (6611 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = an.ag(-2065461622).bg(r0[r1 * 537618701], -1227819454);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.bc(-1585549308).ad(16711935);
            return 1;
        } else if (i == 6612) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = an.ag(837883150).bg(r0[r1 * 537618701], -2098912309);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.av(-12536102) - r0.au(-2113924132)) + 1) * 64;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.al((byte) -66) - r0.ac(1978452358)) + 1) * 64;
            return 1;
        } else if (i == 6613) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = an.ag(314159895).bg(r0[r1 * 537618701], 1999784472);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.au(-2113924132) * 64;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ac(-1391245846) * 64;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.av(283805151) * 64) + 64) - 1;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.al((byte) 4) * 64) + 64) - 1;
            return 1;
        } else if (i == 6614) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = an.ag(-1586052486).bg(r0[r1 * 537618701], 1164948750);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ax((byte) -85);
            return 1;
        } else if (6615 == i) {
            r0 = an.ag(470613517).bu(33704627);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad * 1452060195;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.an * 1719114399;
            return 1;
        } else if (6616 == i) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-1726339422).aw(-64702655);
            return 1;
        } else if (i == 6617) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            r1 = an.ag(-806377000).ai(-2146210881);
            if (r1 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r0 = r1.at(1302348633 * r0.af, r0.ad * 1452060195, r0.an * 1719114399, (byte) 2);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0[0];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0[1];
            return 1;
        } else if (i == 6618) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            r1 = an.ag(-1839651816).ai(-1050095533);
            if (r1 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r0 = r1.ab(r0.ad * 1452060195, r0.an * 1719114399, (byte) 14);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad(16711935);
            return 1;
        } else if (i == 6619) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            bb bbVar = new bb(as[(ar * 537618701) + 1]);
            an.ag(387366882).ak(an.ag(365001959).bg(r0, -578799116), new bb(gf.ho.ac * -277606385, ((gf.ho.bg * 516759209) >> 7) + (1407993063 * bq.du), (gl.dp * 1289967967) + ((gf.ho.bh * 2328865) >> 7)), bbVar, false, (byte) -63);
            return 1;
        } else if (6620 == i) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            bb bbVar2 = new bb(as[(ar * 537618701) + 1]);
            an.ag(647613243).ak(an.ag(814061826).bg(r0, -384439412), new bb(-277606385 * gf.ho.ac, (1407993063 * bq.du) + ((gf.ho.bg * 516759209) >> 7), ((gf.ho.bh * 2328865) >> 7) + (gl.dp * 1289967967)), bbVar2, true, Byte.MIN_VALUE);
            return 1;
        } else if (6621 == i) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            bb bbVar3 = new bb(as[(ar * 537618701) + 1]);
            r0 = an.ag(-1581935455).bg(r0, 1875881632);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                return 1;
            }
            int[] iArr = as;
            int i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            if (r0.aq(bbVar3.af * 1302348633, 1452060195 * bbVar3.ad, bbVar3.an * 1719114399, 1946827084)) {
                z2 = true;
            }
            iArr[i2] = z2;
            return 1;
        } else if (i == 6622) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-750810919).be(-2077494935);
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-789749000).bk(-1295775924);
            return 1;
        } else if (6623 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            r0 = an.ag(-820020569).am(r0.af * 1302348633, 1452060195 * r0.ad, r0.an * 1719114399, 526965417);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ai(1686238370);
            return 1;
        } else if (i == 6624) {
            r0 = an.ag(-2111658206);
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0.by(r1[r2 * 537618701], 1182047553);
            return 1;
        } else if (6625 == i) {
            an.ag(433555728).bn((short) -2490);
            return 1;
        } else if (i == 6626) {
            r0 = an.ag(-2061827769);
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0.ba(r1[r2 * 537618701], -1820700323);
            return 1;
        } else if (6627 == i) {
            an.ag(627907373).bl((byte) 111);
            return 1;
        } else if (i == 6628) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            if (r0[r1 * 537618701] == 1) {
                z2 = true;
            }
            an.ag(-148598920).bd(z2, -737590336);
            return 1;
        } else if (6629 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            an.ag(-132754165).bs(r0[r1 * 537618701], (byte) 50);
            return 1;
        } else if (i == 6630) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            an.ag(-1730427010).bm(r0[r1 * 537618701], -1772085722);
            return 1;
        } else if (i == 6631) {
            an.ag(-1239742594).br((byte) 62);
            return 1;
        } else if (i == 6632) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            if (r0[r1 * 537618701] == 1) {
                z2 = true;
            }
            an.ag(-1362653300).bj(z2, 1244081313);
            return 1;
        } else if (i == 6633) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            if (1 == as[(ar * 537618701) + 1]) {
                z2 = true;
            }
            an.ag(-125907935).bi(r0, z2, -1007046295);
            return 1;
        } else if (i == 6634) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            if (1 == as[(ar * 537618701) + 1]) {
                z2 = true;
            }
            an.ag(-694497830).bq(r0, z2, (short) 4095);
            return 1;
        } else if (i == 6635) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r1 = (r1 * 537618701) - 1;
            if (an.ag(784830324).bo(1982431206)) {
                z2 = true;
            }
            r0[r1] = z2;
            return 1;
        } else if (6636 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = r0[r1 * 537618701];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r2 = (r2 * 537618701) - 1;
            if (an.ag(-1845026837).cv(r0, 372071910)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (6637 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = r0[r1 * 537618701];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r2 = (r2 * 537618701) - 1;
            if (an.ag(-996748985).ci(r0, -292849775)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (i == 6638) {
            ar -= 1905859466;
            r0 = an.ag(-146458444).cy(as[ar * 537618701], new bb(as[(ar * 537618701) + 1]), (byte) 85);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad(16711935);
            return 1;
        } else if (i == 6639) {
            r0 = an.ag(-246901920).ck(-727768392);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.af * -459008153;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad.ad(16711935);
            return 1;
        } else if (i == 6640) {
            r0 = an.ag(-402500026).cl(-67488227);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = -459008153 * r0.af;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad.ad(16711935);
            return 1;
        } else if (i == 6693) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = ay.ad[r0[r1 * 537618701]];
            if (r0.ar == null) {
                String[] strArr = aj;
                r1 = ae - 1246602361;
                ae = r1;
                strArr[(r1 * -1267697097) - 1] = "";
                return 1;
            }
            r1 = aj;
            r2 = ae - 1246602361;
            ae = r2;
            r1[(r2 * -1267697097) - 1] = r0.ar;
            return 1;
        } else if (6694 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = ay.ad[r0[r1 * 537618701]];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ae * 253714037;
            return 1;
        } else if (i == 6695) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = ay.ad[r0[r1 * 537618701]];
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.av * -2068206069;
            return 1;
        } else if (i == 6696) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = ay.ad[r0[r1 * 537618701]];
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ay * 1755658873;
            return 1;
        } else if (i == 6697) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = ec.az.af * -1099459587;
            return 1;
        } else if (i == 6698) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = ec.az.ad.ad(16711935);
            return 1;
        } else if (6699 != i) {
            return 2;
        } else {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = ec.az.an.ad(16711935);
            return 1;
        }
    }

    static int dc(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        if (6600 == i) {
            an.ag(-1788412542).at(dq.hf * -1674539149, (bq.du * 1407993063) + ((gf.ho.bg * 1698188710) >> 7), (gl.dp * -64546552) + ((gf.ho.bh * 54108314) >> 7), true, 698427214);
            return 1;
        } else if (6601 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r1 = r0[r1 * 537618701];
            String str = "";
            r1 = an.ag(236187320).bg(r1, -229140632);
            if (r1 != null) {
                str = r1.ak(1845251321);
            }
            r1 = aj;
            r2 = ae - 1291043161;
            ae = r2;
            r1[(r2 * -527955515) - 1] = str;
            return 1;
        } else if (i == 6602) {
            r0 = as;
            r1 = ar - 1118008961;
            ar = r1;
            an.ag(-1906509513).ab(r0[r1 * 1900765981], -2040150025);
            return 1;
        } else if (i == 6603) {
            r0 = as;
            r1 = ar + 1715416973;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-22706036).bb(-1972373590);
            return 1;
        } else if (i == 6604) {
            r0 = as;
            r1 = ar - -1007827636;
            ar = r1;
            an.ag(-1836742193).al(r0[r1 * 537618701], (byte) 16);
            return 1;
        } else if (i == 259419798) {
            r0 = as;
            r1 = ar + 930630943;
            ar = r1;
            r1 = (r1 * 537618701) - 1;
            if (an.ag(-1381499183).bz(-1533997531)) {
                z2 = true;
            }
            r0[r1] = z2;
            return 1;
        } else if (340871223 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            an.ag(-502100730).bh(1452060195 * r0.ad, r0.an * 1719114399, 1018079287);
            return 1;
        } else if (-514463675 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 268736428]);
            an.ag(-1156986454).bf(1452060195 * r0.ad, r0.an * 131742865, (byte) 1);
            return 1;
        } else if (i == 6608) {
            r1 = as;
            r2 = ar - 1299957023;
            ar = r2;
            r0 = new bb(r1[r2 * 948940223]);
            an.ag(227579162).bv(1302348633 * r0.af, r0.ad * 1452060195, r0.an * 1719114399, 2063956963);
            return 1;
        } else if (-319430485 == i) {
            r1 = as;
            r2 = ar - 1212208642;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            an.ag(-1462789862).bp(1302348633 * r0.af, 1452060195 * r0.ad, r0.an * 1719114399, (byte) -8);
            return 1;
        } else if (6610 == i) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-1483156400).bx(-1555554330);
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 309956193) - 1] = an.ag(682573661).bt(414296057);
            return 1;
        } else if (2091401244 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = an.ag(-446462075).bg(r0[r1 * 91309870], 1386356882);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 580256796;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * -345451851) - 1] = r0.bc(-1968934706).ad(16711935);
            return 1;
        } else if (i == 6612) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = an.ag(-826214444).bg(r0[r1 * -409602798], 507235418);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 370578160) - 1] = 0;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 907872518) - 1] = 0;
                return 1;
            }
            r1 = as;
            r2 = ar + 1438304479;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.av(1171999877) - r0.au(-2113924132)) + 1) * 64;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.al((byte) -89) - r0.ac(-1701977949)) + 1) * 64;
            return 1;
        } else if (i == 6613) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = an.ag(-1323055652).bg(r0[r1 * 634610662], -667702580);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                r0 = as;
                r1 = ar - 1622849596;
                ar = r1;
                r0[(r1 * -866301002) - 1] = 0;
                r0 = as;
                r1 = ar + 1889975046;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * -2055875588) - 1] = 0;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * -1157016438) - 1] = r0.au(-2113924132) * 887333407;
            r1 = as;
            r2 = ar + 875741188;
            ar = r2;
            r1[(r2 * 1477180749) - 1] = r0.ac(-866128717) * 64;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.av(1629370398) * 64) - 1726925263) - 1;
            r1 = as;
            r2 = ar - 372229291;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.al((byte) 17) * 64) + 64) - 1;
            return 1;
        } else if (i == 6614) {
            r0 = as;
            r1 = ar - -980173272;
            ar = r1;
            r0 = an.ag(-495736696).bg(r0[r1 * 826590991], 1590662387);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 1943652311) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ax((byte) -99);
            return 1;
        } else if (-823157933 == i) {
            r0 = an.ag(309908220).bu(33704627);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 1425472267) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad * 1452060195;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * -104547848) - 1] = r0.an * 1719114399;
            return 1;
        } else if (6616 == i) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-1158883388).aw(355976661);
            return 1;
        } else if (i == 6617) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            r1 = an.ag(-69088735).ai(-2124958029);
            if (r1 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * -1888763490) - 1] = -1;
                r0 = as;
                r1 = ar + 1668431784;
                ar = r1;
                r0[(r1 * 1928062123) - 1] = -1;
                return 1;
            }
            r0 = r1.at(-779698558 * r0.af, r0.ad * 1452060195, r0.an * 1068486133, (byte) 2);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1180652957;
                ar = r1;
                r0[(r1 * 1418032224) - 1] = -1;
                r0 = as;
                r1 = ar - 816085235;
                ar = r1;
                r0[(r1 * -45577624) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 110701815;
            ar = r2;
            r1[(r2 * 24056106) - 1] = r0[0];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0[1];
            return 1;
        } else if (i == 1305660689) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            r1 = an.ag(-1229664200).ai(111245696);
            if (r1 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * -871125710) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r0 = r1.ab(r0.ad * 1452060195, r0.an * -819153584, (byte) 118);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 275026248) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 546150873;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad(16711935);
            return 1;
        } else if (i == 6619) {
            ar -= 1905859466;
            r0 = as[ar * -1855896276];
            bb bbVar = new bb(as[(14200581 * ar) + 1]);
            an.ag(-684473459).ak(an.ag(-1938566706).bg(r0, 1808643653), new bb(gf.ho.ac * -277606385, ((gf.ho.bg * 1429849718) >> 7) + (1407993063 * bq.du), (gl.dp * 1289967967) + ((gf.ho.bh * -2028720967) >> 7)), bbVar, false, (byte) -119);
            return 1;
        } else if (6620 == i) {
            ar -= 933787932;
            r0 = as[ar * 537618701];
            bb bbVar2 = new bb(as[(ar * 537618701) + 1]);
            an.ag(-2104721754).ak(an.ag(-1050959851).bg(r0, -99337227), new bb(-277606385 * gf.ho.ac, (10175660 * bq.du) + ((gf.ho.bg * 516759209) >> 7), ((gf.ho.bh * 1683924630) >> 7) + (gl.dp * 745176158)), bbVar2, true, (byte) -94);
            return 1;
        } else if (-1796159061 == i) {
            ar -= 388681251;
            r0 = as[939984950 * ar];
            bb bbVar3 = new bb(as[(ar * 537618701) + 1]);
            r0 = an.ag(-10383177).bg(r0, -1735821618);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 678561211;
                ar = r1;
                r0[(r1 * -433391485) - 1] = 0;
                return 1;
            }
            int[] iArr = as;
            int i2 = ar - 1194553915;
            ar = i2;
            i2 = (i2 * 537618701) - 1;
            if (r0.aq(bbVar3.af * 60946158, -287807174 * bbVar3.ad, bbVar3.an * 820471586, 1937974370)) {
                z2 = true;
            }
            iArr[i2] = z2;
            return 1;
        } else if (i == 331646145) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-1699881462).be(-2136476123);
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-1488618860).bk(-1295775924);
            return 1;
        } else if (6623 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            r0 = an.ag(-389876481).am(r0.af * 1302348633, 1452060195 * r0.ad, r0.an * 1719114399, -176598326);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 603946811;
                ar = r1;
                r0[(r1 * 1688921210) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 666872085;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ai(1931873096);
            return 1;
        } else if (i == 1817479204) {
            r0 = an.ag(-120763463);
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0.by(r1[r2 * 537618701], 1370525075);
            return 1;
        } else if (-1431313965 == i) {
            an.ag(-398399661).bn((short) -14400);
            return 1;
        } else if (i == -777950950) {
            r0 = an.ag(-602154165);
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0.ba(r1[r2 * 537618701], -1608431486);
            return 1;
        } else if (1150350935 == i) {
            an.ag(217020775).bl((byte) 46);
            return 1;
        } else if (i == 221962893) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            if (r0[r1 * -1616203611] == 1) {
                z2 = true;
            }
            an.ag(748039992).bd(z2, -1060835306);
            return 1;
        } else if (-711795007 == i) {
            r0 = as;
            r1 = ar - -1427103525;
            ar = r1;
            an.ag(-574660226).bs(r0[r1 * 537618701], (byte) 89);
            return 1;
        } else if (i == 6630) {
            r0 = as;
            r1 = ar - -1460868834;
            ar = r1;
            an.ag(-663440718).bm(r0[r1 * -1224247822], -1772085722);
            return 1;
        } else if (i == 6631) {
            an.ag(-227320255).br((byte) 94);
            return 1;
        } else if (i == 6632) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            if (r0[r1 * 981188592] == 1) {
                z2 = true;
            }
            an.ag(458040377).bj(z2, 1244081313);
            return 1;
        } else if (i == -2049897654) {
            ar -= 523859014;
            r0 = as[ar * 537618701];
            if (1 == as[(ar * 319067318) + 1]) {
                z2 = true;
            }
            an.ag(569383094).bi(r0, z2, -79631302);
            return 1;
        } else if (i == 6634) {
            ar -= 1862325793;
            r0 = as[ar * 537618701];
            if (1 == as[(-961609063 * ar) + 1]) {
                z2 = true;
            }
            an.ag(820278917).bq(r0, z2, (short) 4095);
            return 1;
        } else if (i == 46761695) {
            r0 = as;
            r1 = ar - 987362506;
            ar = r1;
            r1 = (r1 * 537618701) - 1;
            if (an.ag(-676604086).bo(-1213482134)) {
                z2 = true;
            }
            r0[r1] = z2;
            return 1;
        } else if (-1114737700 == i) {
            r0 = as;
            r1 = ar - 141780760;
            ar = r1;
            r0 = r0[r1 * 537618701];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r2 = (r2 * 210351205) - 1;
            if (an.ag(393172016).cv(r0, -190167514)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (6637 == i) {
            r0 = as;
            r1 = ar - -1928696794;
            ar = r1;
            r0 = r0[r1 * 537618701];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r2 = (r2 * 537618701) - 1;
            if (an.ag(-574504353).ci(r0, -763962373)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (i == 6638) {
            ar -= 1905859466;
            r0 = an.ag(-1279334559).cy(as[ar * 537618701], new bb(as[(ar * 537618701) + 1]), Byte.MAX_VALUE);
            if (r0 == null) {
                r0 = as;
                r1 = ar + 485390803;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 89493013) - 1] = r0.ad(16711935);
            return 1;
        } else if (i == 6639) {
            r0 = an.ag(604025406).ck(-1374257990);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 150736024;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar + 1381259369;
                ar = r1;
                r0[(r1 * -1563793419) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.af * 1261829781;
            r1 = as;
            r2 = ar - 1112121178;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad.ad(16711935);
            return 1;
        } else if (i == 1469258799) {
            r0 = an.ag(-824310671).cl(-67488227);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 273531313) - 1] = -1;
                r0 = as;
                r1 = ar - 767556864;
                ar = r1;
                r0[(r1 * -1346483831) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 664777148;
            ar = r2;
            r1[(r2 * 537618701) - 1] = 1030952348 * r0.af;
            r1 = as;
            r2 = ar + 1673437314;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad.ad(16711935);
            return 1;
        } else if (i == 1310361721) {
            r0 = as;
            r1 = ar - 1389560291;
            ar = r1;
            r0 = ay.ad[r0[r1 * -1197471352]];
            if (r0.ar == null) {
                String[] strArr = aj;
                r1 = ae - 1246602361;
                ae = r1;
                strArr[(r1 * 226123248) - 1] = "";
                return 1;
            }
            r1 = aj;
            r2 = ae - 2086473291;
            ae = r2;
            r1[(r2 * -1267697097) - 1] = r0.ar;
            return 1;
        } else if (6694 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = ay.ad[r0[r1 * -1028101546]];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 1645575146) - 1] = r0.ae * -1653244045;
            return 1;
        } else if (i == 239154672) {
            r0 = as;
            r1 = ar - 1756526026;
            ar = r1;
            r0 = ay.ad[r0[r1 * 1017319839]];
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * -1387920681) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * -845886504) - 1] = r0.av * 1431588016;
            return 1;
        } else if (i == 2018239862) {
            r0 = as;
            r1 = ar - -239867523;
            ar = r1;
            r0 = ay.ad[r0[r1 * -1221676858]];
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 1170796143;
            ar = r2;
            r1[(r2 * -1675141313) - 1] = r0.ay * -737249569;
            return 1;
        } else if (i == 371119535) {
            r0 = as;
            r1 = ar + 333740076;
            ar = r1;
            r0[(r1 * -1133678754) - 1] = ec.az.af * -1099459587;
            return 1;
        } else if (i == 1705504436) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 613654955) - 1] = ec.az.ad.ad(16711935);
            return 1;
        } else if (6699 != i) {
            return 2;
        } else {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = ec.az.an.ad(16711935);
            return 1;
        }
    }

    static int dj(int i, gk gkVar, boolean z) {
        boolean z2 = false;
        if (6600 == i) {
            an.ag(-744282489).at(dq.hf * -1545402682, (bq.du * 1427581220) + ((gf.ho.bg * 2052868554) >> 7), (gl.dp * 1289967967) + ((gf.ho.bh * 1390099611) >> 7), true, 498403945);
            return 1;
        } else if (6601 == i) {
            r0 = as;
            r1 = ar - -1670582083;
            ar = r1;
            r1 = r0[r1 * 537618701];
            String str = "";
            r1 = an.ag(-2103264818).bg(r1, -644281150);
            if (r1 != null) {
                str = r1.ak(1845251321);
            }
            r1 = aj;
            r2 = ae - 112361374;
            ae = r2;
            r1[(r2 * 1562692026) - 1] = str;
            return 1;
        } else if (i == 6602) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            an.ag(-410537299).ab(r0[r1 * -948081835], -1982418073);
            return 1;
        } else if (i == 6603) {
            r0 = as;
            r1 = ar + 813141663;
            ar = r1;
            r0[(r1 * -146175937) - 1] = an.ag(32336226).bb(-1899173653);
            return 1;
        } else if (i == 6604) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            an.ag(-451192596).al(r0[r1 * 1214056793], (byte) 16);
            return 1;
        } else if (i == 6605) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r1 = (r1 * 486874487) - 1;
            if (an.ag(772118419).bz(-396888605)) {
                z2 = true;
            }
            r0[r1] = z2;
            return 1;
        } else if (6606 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 1252621360]);
            an.ag(-1931746307).bh(1452060195 * r0.ad, r0.an * 1719114399, -179577559);
            return 1;
        } else if (6607 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            an.ag(-342118404).bf(-1881909844 * r0.ad, r0.an * 1719114399, (byte) 1);
            return 1;
        } else if (i == 6608) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            an.ag(-350326553).bv(1302348633 * r0.af, r0.ad * 1452060195, r0.an * 1719114399, 2063956963);
            return 1;
        } else if (6609 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            an.ag(-1932144800).bp(1599002659 * r0.af, 1017340150 * r0.ad, r0.an * 1719114399, (byte) 42);
            return 1;
        } else if (6610 == i) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-489813825).bx(-778913688);
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * -595694560) - 1] = an.ag(-1446639010).bt(414296057);
            return 1;
        } else if (6611 == i) {
            r0 = as;
            r1 = ar - -1439157169;
            ar = r1;
            r0 = an.ag(103020441).bg(r0[r1 * 537618701], -836572214);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r2 = ar + 1997078975;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.bc(-2070564002).ad(16711935);
            return 1;
        } else if (i == 869257338) {
            r0 = as;
            r1 = ar - -578583186;
            ar = r1;
            r0 = an.ag(-212189667).bg(r0[r1 * 537618701], 1442955705);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1861986232;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                r0 = as;
                r1 = ar + 62384988;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r2 = ar - 1067137645;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.av(-307085230) - r0.au(-2113924132)) + 1) * 64;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * -1407316235) - 1] = ((r0.al((byte) 20) - r0.ac(-2036083422)) + 1) * 1849017600;
            return 1;
        } else if (i == -1917003763) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = an.ag(-515907389).bg(r0[r1 * 537618701], 1426568606);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                r0 = as;
                r1 = ar - 917676541;
                ar = r1;
                r0[(r1 * 1410086959) - 1] = 0;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * -2066921256) - 1] = 0;
                r0 = as;
                r1 = ar - 1483302388;
                ar = r1;
                r0[(r1 * 537618701) - 1] = 0;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * -119410698) - 1] = r0.au(-2113924132) * 64;
            r1 = as;
            r2 = ar + 1392484365;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ac(2120281563) * 64;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 114712128) - 1] = ((r0.av(2117089732) * -1302433548) + 64) - 1;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = ((r0.al((byte) -109) * 64) + 1296394525) - 1;
            return 1;
        } else if (i == 6614) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = an.ag(-1535263885).bg(r0[r1 * 443977247], -1493885154);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 849005080) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1634642843;
            ar = r2;
            r1[(r2 * -1666214882) - 1] = r0.ax((byte) -64);
            return 1;
        } else if (155290788 == i) {
            r0 = an.ag(384064732).bu(33704627);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 1680201952) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 760369068;
            ar = r2;
            r1[(r2 * -1369279395) - 1] = r0.ad * -707664818;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * -550992890) - 1] = r0.an * 1719114399;
            return 1;
        } else if (6616 == i) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * -1036350388) - 1] = an.ag(504458625).aw(2086442125);
            return 1;
        } else if (i == 872673284) {
            r1 = as;
            r2 = ar - 913007870;
            ar = r2;
            r0 = new bb(r1[r2 * 783921042]);
            r1 = an.ag(-397929525).ai(-1868192751);
            if (r1 == null) {
                r0 = as;
                r1 = ar - 2009699255;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 1328149383) - 1] = -1;
                return 1;
            }
            r0 = r1.at(1302348633 * r0.af, r0.ad * 20094867, r0.an * 759037223, (byte) 2);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 20173133;
                ar = r1;
                r0[(r1 * 1166932611) - 1] = -1;
                r0 = as;
                r1 = ar + 342673155;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 525601174;
            ar = r2;
            r1[(r2 * 1466430642) - 1] = r0[0];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 1866020789) - 1] = r0[1];
            return 1;
        } else if (i == 2140181632) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            r1 = an.ag(-2066016922).ai(2082741391);
            if (r1 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar + 985697718;
                ar = r1;
                r0[(r1 * 1948290291) - 1] = -1;
                return 1;
            }
            r0 = r1.ab(r0.ad * 1452060195, r0.an * -1689986712, (byte) -21);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 464760403;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad(16711935);
            return 1;
        } else if (i == 6619) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            bb bbVar = new bb(as[(-1632166123 * ar) + 1]);
            an.ag(-940134763).ak(an.ag(-2138883401).bg(r0, -20431029), new bb(gf.ho.ac * -424098672, ((gf.ho.bg * 1783877834) >> 7) + (1407993063 * bq.du), (gl.dp * 1289967967) + ((gf.ho.bh * 2328865) >> 7)), bbVar, false, (byte) -98);
            return 1;
        } else if (6620 == i) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            bb bbVar2 = new bb(as[(ar * 537618701) + 1]);
            an.ag(-502315265).ak(an.ag(-861752672).bg(r0, 454565455), new bb(-277606385 * gf.ho.ac, (1407993063 * bq.du) + ((gf.ho.bg * 516759209) >> 7), ((gf.ho.bh * 2328865) >> 7) + (gl.dp * 1289967967)), bbVar2, true, (byte) -30);
            return 1;
        } else if (1098906010 == i) {
            ar -= -1279509410;
            r0 = as[1187826452 * ar];
            bb bbVar3 = new bb(as[(ar * -1489078277) + 1]);
            r0 = an.ag(-1925609813).bg(r0, 1894937249);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 379216255) - 1] = 0;
                return 1;
            }
            int[] iArr = as;
            int i2 = ar - 129541142;
            ar = i2;
            i2 = (i2 * 220769254) - 1;
            if (r0.aq(bbVar3.af * 265679071, -724190965 * bbVar3.ad, bbVar3.an * 1719114399, 1649218560)) {
                z2 = true;
            }
            iArr[i2] = z2;
            return 1;
        } else if (i == 6622) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * -1577399459) - 1] = an.ag(-889311582).be(-2137944884);
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = an.ag(-721041555).bk(-1295775924);
            return 1;
        } else if (-308856509 == i) {
            r1 = as;
            r2 = ar - -1194553915;
            ar = r2;
            r0 = new bb(r1[r2 * 537618701]);
            r0 = an.ag(-1794331590).am(r0.af * 816476895, 1452060195 * r0.ad, r0.an * 2012925859, 96144404);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 1579699172) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * -1985208951) - 1] = r0.ai(807916716);
            return 1;
        } else if (i == 1736119966) {
            r0 = an.ag(-465025304);
            r1 = as;
            r2 = ar - -1641120853;
            ar = r2;
            r0.by(r1[r2 * 537618701], 1563404392);
            return 1;
        } else if (-1953171590 == i) {
            an.ag(-2047404687).bn((short) 10999);
            return 1;
        } else if (i == -312217135) {
            r0 = an.ag(-1535676824);
            r1 = as;
            r2 = ar - -531188693;
            ar = r2;
            r0.ba(r1[r2 * 537618701], -1772464943);
            return 1;
        } else if (217877982 == i) {
            an.ag(653940244).bl((byte) 107);
            return 1;
        } else if (i == 6628) {
            r0 = as;
            r1 = ar - -2032616487;
            ar = r1;
            if (r0[r1 * 537618701] == 1) {
                z2 = true;
            }
            an.ag(-888472372).bd(z2, -1775512641);
            return 1;
        } else if (6629 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            an.ag(-1278428042).bs(r0[r1 * 537618701], (byte) 30);
            return 1;
        } else if (i == 6630) {
            r0 = as;
            r1 = ar - -1102464720;
            ar = r1;
            an.ag(-1297199571).bm(r0[r1 * 1917444576], -1772085722);
            return 1;
        } else if (i == 1204862888) {
            an.ag(-1811764734).br((byte) 47);
            return 1;
        } else if (i == 6632) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            if (r0[r1 * 537618701] == 1) {
                z2 = true;
            }
            an.ag(-984618378).bj(z2, 1244081313);
            return 1;
        } else if (i == 2144396689) {
            ar -= 943996003;
            r0 = as[ar * 1140199365];
            if (1 == as[(ar * -1442825403) + 1]) {
                z2 = true;
            }
            an.ag(431098358).bi(r0, z2, -1645035989);
            return 1;
        } else if (i == -839340789) {
            ar -= 1905859466;
            r0 = as[ar * 537618701];
            if (1 == as[(ar * 537618701) + 1]) {
                z2 = true;
            }
            an.ag(530283958).bq(r0, z2, (short) 4095);
            return 1;
        } else if (i == -668275450) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r1 = (r1 * -797352807) - 1;
            if (an.ag(-1764045173).bo(-608662179)) {
                z2 = true;
            }
            r0[r1] = z2;
            return 1;
        } else if (6636 == i) {
            r0 = as;
            r1 = ar - -380857786;
            ar = r1;
            r0 = r0[r1 * 537618701];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r2 = (r2 * 537618701) - 1;
            if (an.ag(-1289602600).cv(r0, 1576592013)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (-1196484888 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = r0[r1 * 1312315362];
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r2 = (r2 * 537618701) - 1;
            if (an.ag(481293467).ci(r0, -908069963)) {
                z2 = true;
            }
            r1[r2] = z2;
            return 1;
        } else if (i == 6638) {
            ar -= 74909282;
            r0 = an.ag(-86584739).cy(as[ar * 537618701], new bb(as[(ar * -877585240) + 1]), (byte) 125);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 762363390) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 2093531658;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad(16711935);
            return 1;
        } else if (i == 6639) {
            r0 = an.ag(-1817469779).ck(1972839880);
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1194553915;
                ar = r1;
                r0[(r1 * 1307366491) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 319300644;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.af * -1992548508;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 53063439) - 1] = r0.ad.ad(16711935);
            return 1;
        } else if (i == -467469745) {
            r0 = an.ag(840590243).cl(-67488227);
            if (r0 == null) {
                r0 = as;
                r1 = ar + 468433774;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                r0 = as;
                r1 = ar - 1455851224;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 2021368604;
            ar = r2;
            r1[(r2 * 537618701) - 1] = -2015222802 * r0.af;
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ad.ad(16711935);
            return 1;
        } else if (i == -572488365) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = ay.ad[r0[r1 * 537618701]];
            if (r0.ar == null) {
                String[] strArr = aj;
                r1 = ae - 1246602361;
                ae = r1;
                strArr[(r1 * -1267697097) - 1] = "";
                return 1;
            }
            r1 = aj;
            r2 = ae - 1701934852;
            ae = r2;
            r1[(r2 * 2070609321) - 1] = r0.ar;
            return 1;
        } else if (6694 == i) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = ay.ad[r0[r1 * 537618701]];
            r1 = as;
            r2 = ar - 1576594948;
            ar = r2;
            r1[(r2 * 230344176) - 1] = r0.ae * 600070861;
            return 1;
        } else if (i == -89432083) {
            r0 = as;
            r1 = ar - -1194553915;
            ar = r1;
            r0 = ay.ad[r0[r1 * 537618701]];
            if (r0 == null) {
                r0 = as;
                r1 = ar - 1156125893;
                ar = r1;
                r0[(r1 * 537618701) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar + 632025733;
            ar = r2;
            r1[(r2 * 124549125) - 1] = r0.av * -2068206069;
            return 1;
        } else if (i == 1440750716) {
            r0 = as;
            r1 = ar - 936697003;
            ar = r1;
            r0 = ay.ad[r0[r1 * 2001555109]];
            if (r0 == null) {
                r0 = as;
                r1 = ar + 422445121;
                ar = r1;
                r0[(r1 * -1920165374) - 1] = -1;
                return 1;
            }
            r1 = as;
            r2 = ar - 1194553915;
            ar = r2;
            r1[(r2 * 537618701) - 1] = r0.ay * 1755658873;
            return 1;
        } else if (i == 6697) {
            r0 = as;
            r1 = ar - 1423993200;
            ar = r1;
            r0[(r1 * -787086037) - 1] = ec.az.af * -1099459587;
            return 1;
        } else if (i == 6698) {
            r0 = as;
            r1 = ar - 1194553915;
            ar = r1;
            r0[(r1 * 537618701) - 1] = ec.az.ad.ad(16711935);
            return 1;
        } else if (1318510819 != i) {
            return 2;
        } else {
            r0 = as;
            r1 = ar + 523668067;
            ar = r1;
            r0[(r1 * 537618701) - 1] = ec.az.an.ad(16711935);
            return 1;
        }
    }

    static void dk(int i) {
        if (-1 != i) {
            if (ao.aa(i, (byte) -19)) {
                ac[] acVarArr = en.ay[i];
                for (ac acVar : acVarArr) {
                    if (acVar.du != null) {
                        hv hvVar = new hv();
                        hvVar.an = acVar;
                        hvVar.af = acVar.du;
                        bw.ad(hvVar, -1471245495, 2142070241);
                    }
                }
            }
        }
    }

    static void m14do(int i) {
        if (-1 != i && ao.aa(i, (byte) -91)) {
            ac[] acVarArr = en.ay[i];
            for (ac acVar : acVarArr) {
                if (acVar.du != null) {
                    hv hvVar = new hv();
                    hvVar.an = acVar;
                    hvVar.af = acVar.du;
                    bw.ad(hvVar, ad, 2126727422);
                }
            }
        }
    }
}
