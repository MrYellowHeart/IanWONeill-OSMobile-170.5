package p000;

public class bw {
    static final int cl = 24;
    static final int fc = 128;

    bw() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "bw.<init>(" + ')');
        }
    }

    public static int aa(int i, int i2, int i3) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        if (i4 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    public static int ag(int i, int i2, int i3) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        if (i4 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    public static int as(int i, int i2, int i3) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        if (i4 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    public static int ay(int i, int i2, int i3) {
        int i4 = i3 & 3;
        if (i4 == 0) {
            return i;
        }
        if (i4 == 1) {
            return i2;
        }
        if (i4 == 2) {
            return 7 - i;
        }
        return 7 - i2;
    }

    public static int aj(int i, int i2, int i3, int i4, int i5, int i6) {
        if ((i6 & 1) != 1) {
            int i7 = i5;
            i5 = i4;
            i4 = i7;
        }
        int i8 = i3 & 3;
        if (i8 == 0) {
            return i;
        }
        if (i8 == 1) {
            return i2;
        }
        if (i8 == 2) {
            return (7 - i) - (i5 - 1);
        }
        return (7 - i2) - (i4 - 1);
    }

    public static int ar(int i, int i2, int i3, int i4, int i5, int i6) {
        if ((i6 & 1) != 1) {
            int i7 = i5;
            i5 = i4;
            i4 = i7;
        }
        int i8 = i3 & 3;
        if (i8 == 0) {
            return i;
        }
        if (i8 == 1) {
            return i2;
        }
        if (i8 == 2) {
            return (7 - i) - (i5 - 1);
        }
        return (7 - i2) - (i4 - 1);
    }

    public static int ae(int i, int i2, int i3, int i4, int i5, int i6) {
        if ((i6 & 1) != 1) {
            int i7 = i5;
            i5 = i4;
            i4 = i7;
        }
        int i8 = i3 & 3;
        if (i8 == 0) {
            return i2;
        }
        if (i8 == 1) {
            return (7 - i) - (i5 - 1);
        }
        if (i8 == 2) {
            return (7 - i2) - (i4 - 1);
        }
        return i;
    }

    public static int aq(int i, int i2, int i3, int i4, int i5, int i6) {
        if ((i6 & 1) != 1) {
            int i7 = i5;
            i5 = i4;
            i4 = i7;
        }
        int i8 = i3 & 3;
        if (i8 == 0) {
            return i2;
        }
        if (i8 == 1) {
            return (7 - i) - (i5 - 1);
        }
        if (i8 == 2) {
            return (7 - i2) - (i4 - 1);
        }
        return i;
    }

    public static ab ad(int i, byte b) {
        try {
            ab abVar = (ab) ab.aa.af((long) i);
            if (abVar == null) {
                byte[] an = ab.af.an(3, i, -1147498289);
                abVar = new ab();
                if (an != null) {
                    abVar.an(new ik(an), 1524776824);
                }
                ab.aa.an(abVar, (long) i);
            }
            return abVar;
        } catch (Throwable e) {
            throw ba.ad(e, "bw.ad(" + ')');
        }
    }

    static void ad(hv hvVar, int i, int i2) {
        gk gkVar;
        gk gkVar2;
        Throwable e;
        try {
            int i3;
            int i4;
            Object[] objArr = hvVar.af;
            if (gy.af(182090275 * hvVar.am, (byte) -67)) {
                ec.az = (es) objArr[0];
                ay ayVar = ay.ad[ec.az.af * -1099459587];
                i3 = hvVar.am * 182090275;
                i4 = -2068206069 * ayVar.av;
                gk ad = ej.ad(C0002if.af(1733135393 * ayVar.ag, i3, 735380873), i3, -1341749200);
                if (ad == null) {
                    ad = ej.ad(((40000 + i4) << 8) + i3, i3, -1386225938);
                    if (ad == null) {
                        ad = null;
                    }
                }
                gkVar = ad;
            } else {
                gkVar = az.af(((Integer) objArr[0]).intValue(), -59132673);
            }
            if (gkVar != null) {
                hr.ar = 0;
                hr.ae = 0;
                int[] iArr = gkVar.ad;
                int[] iArr2 = gkVar.an;
                hr.aq = 0;
                int i5;
                try {
                    int intValue;
                    int i6;
                    String str;
                    cb.an = new int[(407879525 * gkVar.ag)];
                    i5 = 0;
                    mx.aa = new String[(gkVar.ay * -1469700137)];
                    i3 = 0;
                    int i7 = 1;
                    while (i7 < objArr.length) {
                        if (objArr[i7] instanceof Integer) {
                            intValue = ((Integer) objArr[i7]).intValue();
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
                                i6 = hvVar.aj * 361884663;
                            } else {
                                i6 = intValue;
                            }
                            intValue = i5 + 1;
                            cb.an[i5] = i6;
                            int i8 = i3;
                            i3 = intValue;
                            intValue = i8;
                        } else if (objArr[i7] instanceof String) {
                            String str2;
                            str = (String) objArr[i7];
                            if (str.equals("event_opbase")) {
                                str2 = hvVar.ae;
                            } else {
                                str2 = str;
                            }
                            intValue = i3 + 1;
                            mx.aa[i3] = str2;
                            i3 = i5;
                        } else {
                            intValue = i3;
                            i3 = i5;
                        }
                        i7++;
                        i5 = i3;
                        i3 = intValue;
                    }
                    intValue = 0;
                    hr.ah = hvVar.aq * 698456767;
                    i3 = -1;
                    gkVar2 = gkVar;
                    i4 = -1;
                    int[] iArr3 = iArr;
                    iArr = iArr2;
                    while (true) {
                        int i9 = intValue + 1;
                        if (i9 <= i) {
                            i6 = i4 + 1;
                            i3 = iArr3[i6];
                            if (i3 >= 100) {
                                boolean z;
                                if (gkVar2.an[i6] == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                switch (ce.an(i3, gkVar2, z, (byte) -49)) {
                                    case 0:
                                        return;
                                    case 1:
                                        intValue = i9;
                                        i4 = i6;
                                        break;
                                    case 2:
                                        throw new IllegalStateException();
                                    default:
                                        intValue = i9;
                                        i4 = i6;
                                        break;
                                }
                            } else if (i3 == 0) {
                                r0 = hr.as;
                                i4 = hr.ar - 1194553915;
                                hr.ar = i4;
                                r0[(i4 * 537618701) - 1] = iArr[i6];
                                intValue = i9;
                                i4 = i6;
                            } else if (i3 == 1) {
                                intValue = iArr[i6];
                                r3 = hr.as;
                                r4 = hr.ar - 1194553915;
                                hr.ar = r4;
                                r3[(r4 * 537618701) - 1] = al.an[intValue];
                                intValue = i9;
                                i4 = i6;
                            } else if (i3 == 2) {
                                intValue = iArr[i6];
                                r3 = al.an;
                                r4 = hr.as;
                                i7 = hr.ar - -1194553915;
                                hr.ar = i7;
                                r3[intValue] = r4[i7 * 537618701];
                                em.fp(intValue, -261728602);
                                intValue = i9;
                                i4 = i6;
                            } else if (3 == i3) {
                                r0 = hr.aj;
                                i4 = hr.ae - 1246602361;
                                hr.ae = i4;
                                r0[(i4 * -1267697097) - 1] = gkVar2.aa[i6];
                                intValue = i9;
                                i4 = i6;
                            } else if (i3 == 6) {
                                i4 = iArr[i6] + i6;
                                intValue = i9;
                            } else {
                                if (i3 == 7) {
                                    hr.ar -= 1905859466;
                                    if (hr.as[(537618701 * hr.ar) + 1] != hr.as[537618701 * hr.ar]) {
                                        i4 = iArr[i6] + i6;
                                        intValue = i9;
                                    }
                                } else if (8 == i3) {
                                    hr.ar -= 1905859466;
                                    if (hr.as[537618701 * hr.ar] == hr.as[(hr.ar * 537618701) + 1]) {
                                        i4 = iArr[i6] + i6;
                                        intValue = i9;
                                    }
                                } else if (i3 == 9) {
                                    hr.ar -= 1905859466;
                                    if (hr.as[537618701 * hr.ar] < hr.as[(537618701 * hr.ar) + 1]) {
                                        i4 = iArr[i6] + i6;
                                        intValue = i9;
                                    }
                                } else if (i3 == 10) {
                                    hr.ar -= 1905859466;
                                    if (hr.as[537618701 * hr.ar] > hr.as[(537618701 * hr.ar) + 1]) {
                                        i4 = iArr[i6] + i6;
                                        intValue = i9;
                                    }
                                } else if (21 == i3) {
                                    if (344694797 * hr.aq != 0) {
                                        hf[] hfVarArr = hr.am;
                                        i4 = hr.aq - -1432768827;
                                        hr.aq = i4;
                                        hf hfVar = hfVarArr[i4 * 344694797];
                                        gkVar2 = hfVar.af;
                                        r3 = gkVar2.ad;
                                        r0 = gkVar2.an;
                                        r4 = hfVar.ad * -132320779;
                                        cb.an = hfVar.an;
                                        mx.aa = hfVar.aa;
                                        iArr = r0;
                                        iArr3 = r3;
                                        intValue = i9;
                                        i4 = r4;
                                    } else {
                                        return;
                                    }
                                } else if (i3 == 25) {
                                    intValue = iArr[i6];
                                    r3 = hr.as;
                                    r4 = hr.ar - 1194553915;
                                    hr.ar = r4;
                                    r3[(r4 * 537618701) - 1] = io.af(intValue, 998830794);
                                    intValue = i9;
                                    i4 = i6;
                                } else if (27 == i3) {
                                    intValue = iArr[i6];
                                    r3 = hr.as;
                                    r4 = hr.ar - -1194553915;
                                    hr.ar = r4;
                                    ee.ad(intValue, r3[r4 * 537618701], (short) -2769);
                                    intValue = i9;
                                    i4 = i6;
                                } else if (i3 == 31) {
                                    hr.ar -= 1905859466;
                                    if (hr.as[537618701 * hr.ar] <= hr.as[(537618701 * hr.ar) + 1]) {
                                        i4 = iArr[i6] + i6;
                                        intValue = i9;
                                    }
                                } else if (32 == i3) {
                                    hr.ar -= 1905859466;
                                    if (hr.as[hr.ar * 537618701] >= hr.as[(537618701 * hr.ar) + 1]) {
                                        i4 = iArr[i6] + i6;
                                        intValue = i9;
                                    }
                                } else if (i3 == 33) {
                                    r0 = hr.as;
                                    i4 = hr.ar - 1194553915;
                                    hr.ar = i4;
                                    r0[(i4 * 537618701) - 1] = cb.an[iArr[i6]];
                                    intValue = i9;
                                    i4 = i6;
                                } else if (34 == i3) {
                                    r0 = cb.an;
                                    i4 = iArr[i6];
                                    r4 = hr.as;
                                    i7 = hr.ar - -1194553915;
                                    hr.ar = i7;
                                    r0[i4] = r4[i7 * 537618701];
                                    intValue = i9;
                                    i4 = i6;
                                } else if (i3 == 35) {
                                    r0 = hr.aj;
                                    i4 = hr.ae - 1246602361;
                                    hr.ae = i4;
                                    r0[(i4 * -1267697097) - 1] = mx.aa[iArr[i6]];
                                    intValue = i9;
                                    i4 = i6;
                                } else if (i3 == 36) {
                                    r0 = mx.aa;
                                    i4 = iArr[i6];
                                    r4 = hr.aj;
                                    i7 = hr.ae - -1246602361;
                                    hr.ae = i7;
                                    r0[i4] = r4[i7 * -1267697097];
                                    intValue = i9;
                                    i4 = i6;
                                } else if (i3 == 37) {
                                    intValue = iArr[i6];
                                    hr.ae -= -1246602361 * intValue;
                                    String[] strArr = hr.aj;
                                    i4 = -1267697097 * hr.ae;
                                    if (intValue == 0) {
                                        str = "";
                                    } else if (intValue == 1) {
                                        CharSequence charSequence = strArr[i4];
                                        if (charSequence == null) {
                                            str = "null";
                                        } else {
                                            str = charSequence.toString();
                                        }
                                    } else {
                                        int i10 = intValue + i4;
                                        intValue = 0;
                                        for (r4 = i4; r4 < i10; r4++) {
                                            CharSequence charSequence2 = strArr[r4];
                                            if (charSequence2 == null) {
                                                intValue += 4;
                                            } else {
                                                intValue += charSequence2.length();
                                            }
                                        }
                                        StringBuilder stringBuilder = new StringBuilder(intValue);
                                        for (intValue = i4; intValue < i10; intValue++) {
                                            CharSequence charSequence3 = strArr[intValue];
                                            if (charSequence3 == null) {
                                                stringBuilder.append("null");
                                            } else {
                                                stringBuilder.append(charSequence3);
                                            }
                                        }
                                        try {
                                            str = stringBuilder.toString();
                                        } catch (Exception e2) {
                                            e = e2;
                                        }
                                    }
                                    r3 = hr.aj;
                                    r4 = hr.ae - 1246602361;
                                    hr.ae = r4;
                                    r3[(r4 * -1267697097) - 1] = str;
                                    intValue = i9;
                                    i4 = i6;
                                } else if (38 == i3) {
                                    hr.ar -= -1194553915;
                                    intValue = i9;
                                    i4 = i6;
                                } else if (39 == i3) {
                                    hr.ae -= -1246602361;
                                    intValue = i9;
                                    i4 = i6;
                                } else if (i3 == 40) {
                                    gk af = az.af(iArr[i6], -1244768047);
                                    iArr = new int[(407879525 * af.ag)];
                                    String[] strArr2 = new String[(af.ay * -1469700137)];
                                    for (intValue = 0; intValue < af.as * 950863471; intValue++) {
                                        iArr[intValue] = hr.as[((hr.ar * 537618701) - (af.as * 950863471)) + intValue];
                                    }
                                    for (intValue = 0; intValue < 483841497 * af.ar; intValue++) {
                                        strArr2[intValue] = hr.aj[((hr.ae * -1267697097) - (483841497 * af.ar)) + intValue];
                                    }
                                    hr.ar -= -769321365 * af.as;
                                    hr.ae -= -1322194833 * af.ar;
                                    hf hfVar2 = new hf();
                                    hfVar2.af = gkVar2;
                                    hfVar2.ad = -475434403 * i6;
                                    hfVar2.an = cb.an;
                                    hfVar2.aa = mx.aa;
                                    hf[] hfVarArr2 = hr.am;
                                    i6 = hr.aq - 1432768827;
                                    hr.aq = i6;
                                    hfVarArr2[(i6 * 344694797) - 1] = hfVar2;
                                    try {
                                        int[] iArr4 = af.ad;
                                        r0 = af.an;
                                        cb.an = iArr;
                                        mx.aa = strArr2;
                                        iArr = r0;
                                        iArr3 = iArr4;
                                        intValue = i9;
                                        gkVar2 = af;
                                        i4 = -1;
                                    } catch (Exception e3) {
                                        e = e3;
                                        gkVar2 = af;
                                    }
                                } else if (42 == i3) {
                                    r0 = hr.as;
                                    i4 = hr.ar - 1194553915;
                                    hr.ar = i4;
                                    r0[(i4 * 537618701) - 1] = bc.kq.ad(iArr[i6], 2004268156);
                                    intValue = i9;
                                    i4 = i6;
                                } else if (i3 == 43) {
                                    r0 = bc.kq;
                                    i4 = iArr[i6];
                                    r4 = hr.as;
                                    i7 = hr.ar - -1194553915;
                                    hr.ar = i7;
                                    r0.af(i4, r4[i7 * 537618701], -313855895);
                                    intValue = i9;
                                    i4 = i6;
                                } else if (44 == i3) {
                                    r4 = iArr[i6] >> 16;
                                    i4 = 65535 & iArr[i6];
                                    r0 = hr.as;
                                    i7 = hr.ar - -1194553915;
                                    hr.ar = i7;
                                    i7 = r0[i7 * 537618701];
                                    if (i7 < 0 || i7 > 5000) {
                                        throw new RuntimeException();
                                    }
                                    hr.ag[r4] = i7;
                                    intValue = -1;
                                    if (i4 == ie.ca) {
                                        intValue = 0;
                                    }
                                    for (i4 = 0; i4 < i7; i4++) {
                                        hr.ay[r4][i4] = intValue;
                                    }
                                    intValue = i9;
                                    i4 = i6;
                                } else if (45 == i3) {
                                    intValue = iArr[i6];
                                    r3 = hr.as;
                                    r4 = hr.ar - -1194553915;
                                    hr.ar = r4;
                                    i4 = r3[r4 * 537618701];
                                    if (i4 < 0 || i4 >= hr.ag[intValue]) {
                                        throw new RuntimeException();
                                    }
                                    r4 = hr.as;
                                    i7 = hr.ar - 1194553915;
                                    hr.ar = i7;
                                    r4[(i7 * 537618701) - 1] = hr.ay[intValue][i4];
                                    intValue = i9;
                                    i4 = i6;
                                } else if (i3 == 46) {
                                    intValue = iArr[i6];
                                    hr.ar -= 1905859466;
                                    i4 = hr.as[537618701 * hr.ar];
                                    if (i4 < 0 || i4 >= hr.ag[intValue]) {
                                        throw new RuntimeException();
                                    }
                                    hr.ay[intValue][i4] = hr.as[(hr.ar * 537618701) + 1];
                                    intValue = i9;
                                    i4 = i6;
                                } else if (i3 == 47) {
                                    str = bc.kq.aa(iArr[i6], 712571588);
                                    if (str == null) {
                                        str = jv.aj;
                                    }
                                    r3 = hr.aj;
                                    r4 = hr.ae - 1246602361;
                                    hr.ae = r4;
                                    r3[(r4 * -1267697097) - 1] = str;
                                    intValue = i9;
                                    i4 = i6;
                                } else if (i3 == 48) {
                                    r0 = bc.kq;
                                    i4 = iArr[i6];
                                    r4 = hr.aj;
                                    i7 = hr.ae - -1246602361;
                                    hr.ae = i7;
                                    r0.an(i4, r4[i7 * -1267697097], 689820898);
                                    intValue = i9;
                                    i4 = i6;
                                } else if (60 == i3) {
                                    kp kpVar = gkVar2.aj[iArr[i6]];
                                    r3 = hr.as;
                                    r4 = hr.ar - -1194553915;
                                    hr.ar = r4;
                                    kr krVar = (kr) kpVar.af((long) r3[r4 * 537618701]);
                                    if (krVar != null) {
                                        i4 = krVar.af + i6;
                                        intValue = i9;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                                intValue = i9;
                                i4 = i6;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    i3 = -1;
                    gkVar2 = gkVar;
                    StringBuilder stringBuilder2 = new StringBuilder(30);
                    stringBuilder2.append("").append(gkVar2.fy).append(" ");
                    for (i5 = (344694797 * hr.aq) - 1; i5 >= 0; i5--) {
                        stringBuilder2.append("").append(hr.am[i5].af.fy).append(" ");
                    }
                    stringBuilder2.append("").append(i3);
                    ah.af(stringBuilder2.toString(), e, (short) -13250);
                }
            }
        } catch (Throwable e5) {
            throw ba.ad(e5, "bw.ad(" + ')');
        }
    }
}
