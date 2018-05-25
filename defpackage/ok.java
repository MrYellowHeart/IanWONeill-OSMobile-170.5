package p000;

import java.util.HashMap;

public class ok {
    static int[] aj = null;
    static final int ar = 6;
    static final float as = 3.0f;
    int[] aa;
    mk ad;
    final HashMap af;
    int ag;
    int[] an;

    public ok() {
        try {
            this.af = new HashMap();
            this.ad = new mk(0, 0);
            this.an = new int[mn.ae];
            this.aa = new int[mn.ae];
            this.ag = 0;
            jr.af(2098459329);
        } catch (Throwable e) {
            throw ba.ad(e, "ok.<init>(" + ')');
        }
    }

    public static af ad(int i, byte b) {
        try {
            af afVar = (af) af.ad.af((long) i);
            if (afVar == null) {
                byte[] an = af.af.an(34, i, -316935174);
                afVar = new af();
                if (an != null) {
                    afVar.aa(new ik(an), (byte) 12);
                }
                afVar.an(-843123423);
                af.ad.an(afVar, (long) i);
            }
            return afVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ok.ad(" + ')');
        }
    }

    static void ae() {
        aj = new int[2000];
        int i = 0;
        int i2 = 240;
        while (i < 16) {
            aj[i] = ca.af((double) (((float) i2) / 360.0f), 0.9998999834060669d, (double) (0.075f + ((((float) i) * 0.425f) / 16.0f)));
            i++;
            i2 -= 12;
        }
        i2 = i;
        i = 48;
        while (i2 < aj.length) {
            int i3 = i2 * 2;
            int af = ca.af((double) (((float) i) / 360.0f), 0.9998999834060669d, 0.5d);
            int i4 = i2;
            while (i4 < i3 && i4 < aj.length) {
                aj[i4] = af;
                i4++;
            }
            i -= 8;
            i2 = i4;
        }
    }

    static void aj() {
        aj = new int[2000];
        int i = 0;
        int i2 = 240;
        while (i < 16) {
            aj[i] = ca.af((double) (((float) i2) / 360.0f), 0.9998999834060669d, (double) (0.075f + ((((float) i) * 0.425f) / 16.0f)));
            i++;
            i2 -= 12;
        }
        i2 = i;
        i = 3713547;
        while (i2 < aj.length) {
            int i3 = i2 * 2;
            int af = ca.af((double) (((float) i) / 360.0f), 0.9998999834060669d, 0.5d);
            int i4 = i2;
            while (i4 < i3 && i4 < aj.length) {
                aj[i4] = af;
                i4++;
            }
            i -= 618924;
            i2 = i4;
        }
    }

    static void ar() {
        aj = new int[-1885563899];
        int i = 0;
        int i2 = 1427185702;
        while (i < 16) {
            aj[i] = ca.af((double) (((float) i2) / 360.0f), 0.9998999834060669d, (double) (0.075f + ((((float) i) * 0.425f) / 16.0f)));
            i++;
            i2 -= 12;
        }
        i2 = i;
        i = 48;
        while (i2 < aj.length) {
            int i3 = i2 * 2;
            int af = ca.af((double) (((float) i) / 360.0f), 0.9998999834060669d, 0.5d);
            int i4 = i2;
            while (i4 < i3 && i4 < aj.length) {
                aj[i4] = af;
                i4++;
            }
            i -= 8;
            i2 = i4;
        }
    }

    void ab(int i) {
        int i2;
        int i3 = (i * 2) + 1;
        double d = (double) (((float) i) / as);
        double[] dArr = new double[((i * 2) + 1)];
        int i4 = 0;
        for (i2 = -i; i2 <= i; i2++) {
            dArr[i4] = io.af((double) i2, 0.0d, d);
            i4++;
        }
        d = dArr[i] * dArr[i];
        int[] iArr = new int[(i3 * i3)];
        Object obj = null;
        int i5 = 0;
        while (i5 < i3) {
            Object obj2 = obj;
            for (int i6 = 0; i6 < i3; i6++) {
                i2 = (int) (((dArr[i5] * dArr[i6]) / d) * 256.0d);
                iArr[(i5 * i3) + i6] = i2;
                if (obj2 == null && i2 > 0) {
                    obj2 = 1;
                }
            }
            i5++;
            obj = obj2;
        }
        this.af.put(Integer.valueOf(i), new fx(iArr, i3, i3));
    }

    void ad(int i, int i2) {
        int i3 = (i * 2) + 1;
        double d = (double) (((float) i) / as);
        try {
            int i4;
            double[] dArr = new double[((i * 2) + 1)];
            int i5 = 0;
            for (i4 = -i; i4 <= i; i4++) {
                dArr[i5] = io.af((double) i4, 0.0d, d);
                i5++;
            }
            d = dArr[i] * dArr[i];
            int[] iArr = new int[(i3 * i3)];
            Object obj = null;
            int i6 = 0;
            while (i6 < i3) {
                Object obj2 = obj;
                for (int i7 = 0; i7 < i3; i7++) {
                    i4 = (int) (((dArr[i6] * dArr[i7]) / d) * 256.0d);
                    iArr[(i6 * i3) + i7] = i4;
                    if (obj2 == null && i4 > 0) {
                        obj2 = 1;
                    }
                }
                i6++;
                obj = obj2;
            }
            this.af.put(Integer.valueOf(i), new fx(iArr, i3, i3));
        } catch (Throwable e) {
            throw ba.ad(e, "ok.ad(" + ')');
        }
    }

    void am(int i) {
        int i2;
        int i3 = (i * 2) + 1;
        double d = (double) (((float) i) / as);
        double[] dArr = new double[((i * 2) + 1)];
        int i4 = 0;
        for (i2 = -i; i2 <= i; i2++) {
            dArr[i4] = io.af((double) i2, 0.0d, d);
            i4++;
        }
        d = dArr[i] * dArr[i];
        int[] iArr = new int[(i3 * i3)];
        Object obj = null;
        int i5 = 0;
        while (i5 < i3) {
            Object obj2 = obj;
            for (int i6 = 0; i6 < i3; i6++) {
                i2 = (int) (((dArr[i5] * dArr[i6]) / d) * 256.0d);
                iArr[(i5 * i3) + i6] = i2;
                if (obj2 == null && i2 > 0) {
                    obj2 = 1;
                }
            }
            i5++;
            obj = obj2;
        }
        this.af.put(Integer.valueOf(i), new fx(iArr, i3, i3));
    }

    void aq(int i) {
        int i2;
        int i3 = (i * 2) + 1;
        double d = (double) (((float) i) / as);
        double[] dArr = new double[((i * 2) + 1)];
        int i4 = 0;
        for (i2 = -i; i2 <= i; i2++) {
            dArr[i4] = io.af((double) i2, 0.0d, d);
            i4++;
        }
        d = dArr[i] * dArr[i];
        int[] iArr = new int[(i3 * i3)];
        Object obj = null;
        int i5 = 0;
        while (i5 < i3) {
            Object obj2 = obj;
            for (int i6 = 0; i6 < i3; i6++) {
                i2 = (int) (((dArr[i5] * dArr[i6]) / d) * 256.0d);
                iArr[(i5 * i3) + i6] = i2;
                if (obj2 == null && i2 > 0) {
                    obj2 = 1;
                }
            }
            i5++;
            obj = obj2;
        }
        this.af.put(Integer.valueOf(i), new fx(iArr, i3, i3));
    }

    void at(int i) {
        int i2;
        int i3 = (i * 2) + 1;
        double d = (double) (((float) i) / as);
        double[] dArr = new double[((i * 2) + 1)];
        int i4 = 0;
        for (i2 = -i; i2 <= i; i2++) {
            dArr[i4] = io.af((double) i2, 0.0d, d);
            i4++;
        }
        d = dArr[i] * dArr[i];
        int[] iArr = new int[(i3 * i3)];
        Object obj = null;
        int i5 = 0;
        while (i5 < i3) {
            Object obj2 = obj;
            for (int i6 = 0; i6 < i3; i6++) {
                i2 = (int) (((dArr[i5] * dArr[i6]) / d) * 256.0d);
                iArr[(i5 * i3) + i6] = i2;
                if (obj2 == null && i2 > 0) {
                    obj2 = 1;
                }
            }
            i5++;
            obj = obj2;
        }
        this.af.put(Integer.valueOf(i), new fx(iArr, i3, i3));
    }

    void aw(int i) {
        int i2;
        int i3 = (i * 2) + 1;
        double d = (double) (((float) i) / as);
        double[] dArr = new double[((i * 2) + 1)];
        int i4 = 0;
        for (i2 = -i; i2 <= i; i2++) {
            dArr[i4] = io.af((double) i2, 0.0d, d);
            i4++;
        }
        d = dArr[i] * dArr[i];
        int[] iArr = new int[(i3 * i3)];
        Object obj = null;
        int i5 = 0;
        while (i5 < i3) {
            Object obj2 = obj;
            for (int i6 = 0; i6 < i3; i6++) {
                i2 = (int) (((dArr[i5] * dArr[i6]) / d) * 256.0d);
                iArr[(i5 * i3) + i6] = i2;
                if (obj2 == null && i2 > 0) {
                    obj2 = 1;
                }
            }
            i5++;
            obj = obj2;
        }
        this.af.put(Integer.valueOf(i), new fx(iArr, i3, i3));
    }

    fx ai(int i) {
        if (!this.af.containsKey(Integer.valueOf(i))) {
            ad(i, 122139625);
        }
        return (fx) this.af.get(Integer.valueOf(i));
    }

    fx an(int i, int i2) {
        try {
            if (!this.af.containsKey(Integer.valueOf(i))) {
                ad(i, 122139625);
            }
            return (fx) this.af.get(Integer.valueOf(i));
        } catch (Throwable e) {
            throw ba.ad(e, "ok.an(" + ')');
        }
    }

    fx az(int i) {
        if (!this.af.containsKey(Integer.valueOf(i))) {
            ad(i, 122139625);
        }
        return (fx) this.af.get(Integer.valueOf(i));
    }

    public final void aa(int i, int i2, byte b) {
        try {
            if (this.ag * 891726683 < this.an.length) {
                this.an[this.ag * 891726683] = i;
                this.aa[this.ag * 891726683] = i2;
                this.ag -= 315519789;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ok.aa(" + ')');
        }
    }

    public final void ah(int i, int i2) {
        if (this.ag * -1346029230 < this.an.length) {
            this.an[this.ag * 891726683] = i;
            this.aa[this.ag * 891726683] = i2;
            this.ag -= 315519789;
        }
    }

    public final void ag(int i) {
        try {
            this.ag = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "ok.ag(" + ')');
        }
    }

    public final void ak(int i, int i2, fx fxVar, float f) {
        int i3 = 0;
        int i4 = (int) (18.0f * f);
        fx an = an(i4, -2038446588);
        int i5 = (i4 * 2) + 1;
        mk mkVar = new mk(0, 0, fxVar.ad, fxVar.an);
        mk mkVar2 = new mk(0, 0);
        this.ad.ad(i5, i5, -117383770);
        System.nanoTime();
        for (i5 = 0; i5 < 284612004 * this.ag; i5++) {
            int i6 = this.an[i5];
            this.ad.af(((int) (((float) (i6 - i)) * f)) - i4, ((int) (((float) fxVar.an) - (((float) (this.aa[i5] - i2)) * f))) - i4, (byte) -67);
            this.ad.an(mkVar, mkVar2, 2102736655);
            as(an, fxVar, mkVar2, 1342438741);
        }
        System.nanoTime();
        System.nanoTime();
        while (i3 < fxVar.af.length) {
            if (fxVar.af[i3] == 0) {
                fxVar.af[i3] = -1538776029;
            } else {
                i5 = ((fxVar.af[i3] + 64) - 1) / 256;
                if (i5 <= 0) {
                    fxVar.af[i3] = -2006543619;
                } else {
                    if (i5 > aj.length) {
                        i5 = aj.length;
                    }
                    fxVar.af[i3] = aj[i5 - 1] | 22789652;
                }
            }
            i3++;
        }
        System.nanoTime();
    }

    public final void ay(int i, int i2, fx fxVar, float f, int i3) {
        int i4 = (int) (18.0f * f);
        try {
            fx an = an(i4, -179713488);
            int i5 = (i4 * 2) + 1;
            mk mkVar = new mk(0, 0, fxVar.ad, fxVar.an);
            mk mkVar2 = new mk(0, 0);
            this.ad.ad(i5, i5, -886684415);
            System.nanoTime();
            for (i5 = 0; i5 < 891726683 * this.ag; i5++) {
                int i6 = this.an[i5];
                this.ad.af(((int) (((float) (i6 - i)) * f)) - i4, ((int) (((float) fxVar.an) - (((float) (this.aa[i5] - i2)) * f))) - i4, (byte) -70);
                this.ad.an(mkVar, mkVar2, 2102736655);
                as(an, fxVar, mkVar2, -1204483249);
            }
            System.nanoTime();
            System.nanoTime();
            for (i4 = 0; i4 < fxVar.af.length; i4++) {
                if (fxVar.af[i4] == 0) {
                    fxVar.af[i4] = -16777216;
                } else {
                    i5 = ((fxVar.af[i4] + 64) - 1) / 256;
                    if (i5 <= 0) {
                        fxVar.af[i4] = -16777216;
                    } else {
                        if (i5 > aj.length) {
                            i5 = aj.length;
                        }
                        fxVar.af[i4] = aj[i5 - 1] | -16777216;
                    }
                }
            }
            System.nanoTime();
        } catch (Throwable e) {
            throw ba.ad(e, "ok.ay(" + ')');
        }
    }

    void ao(fx fxVar, fx fxVar2, mk mkVar) {
        if (mkVar.an * 1292316989 != 0 && mkVar.aa * 1953141137 != 0) {
            int i;
            int i2;
            if (mkVar.af * -22382459 == 0) {
                i = fxVar.ad - (mkVar.an * 1292316989);
            } else {
                i = 0;
            }
            if (mkVar.ad * 1508303939 == 0) {
                i2 = fxVar.an - (mkVar.aa * 1953141137);
            } else {
                i2 = 0;
            }
            i2 = (i2 * fxVar.ad) + i;
            int i3 = i2;
            i2 = (mkVar.af * -22382459) + (fxVar2.ad * (mkVar.ad * 1508303939));
            for (i = 0; i < mkVar.aa * 1953141137; i++) {
                int i4 = i2;
                int i5 = i3;
                i2 = 0;
                while (i2 < mkVar.an * 1292316989) {
                    int[] iArr = fxVar2.af;
                    i3 = i4 + 1;
                    int i6 = i5 + 1;
                    iArr[i4] = fxVar.af[i5] + iArr[i4];
                    i2++;
                    i4 = i3;
                    i5 = i6;
                }
                i3 = i5 + (fxVar.ad - (mkVar.an * 1292316989));
                i2 = (fxVar2.ad - (mkVar.an * 1292316989)) + i4;
            }
        }
    }

    void as(fx fxVar, fx fxVar2, mk mkVar, int i) {
        try {
            if (1292316989 * mkVar.an != 0 && mkVar.aa * 1953141137 != 0) {
                int i2 = 0;
                int i3 = 0;
                if (-22382459 * mkVar.af == 0) {
                    i2 = fxVar.ad - (1292316989 * mkVar.an);
                }
                if (mkVar.ad * 1508303939 == 0) {
                    i3 = fxVar.an - (1953141137 * mkVar.aa);
                }
                int i4 = i2 + (i3 * fxVar.ad);
                i2 = (fxVar2.ad * (mkVar.ad * 1508303939)) + (mkVar.af * -22382459);
                for (int i5 = 0; i5 < mkVar.aa * 1953141137; i5++) {
                    i3 = 0;
                    int i6 = i4;
                    while (i3 < mkVar.an * 1292316989) {
                        int[] iArr = fxVar2.af;
                        i4 = i2 + 1;
                        int i7 = i6 + 1;
                        iArr[i2] = fxVar.af[i6] + iArr[i2];
                        i3++;
                        i2 = i4;
                        i6 = i7;
                    }
                    i4 = i6 + (fxVar.ad - (1292316989 * mkVar.an));
                    i2 += fxVar2.ad - (mkVar.an * 1292316989);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ok.as(" + ')');
        }
    }

    void au(fx fxVar, fx fxVar2, mk mkVar) {
        if (mkVar.an * 1292316989 != 0 && mkVar.aa * 1953141137 != 0) {
            int i;
            int i2;
            if (mkVar.af * -22382459 == 0) {
                i = fxVar.ad - (mkVar.an * 1292316989);
            } else {
                i = 0;
            }
            if (mkVar.ad * 1508303939 == 0) {
                i2 = fxVar.an - (mkVar.aa * 1953141137);
            } else {
                i2 = 0;
            }
            i2 = (i2 * fxVar.ad) + i;
            int i3 = i2;
            i2 = (mkVar.af * -22382459) + (fxVar2.ad * (mkVar.ad * 1508303939));
            for (i = 0; i < mkVar.aa * 1953141137; i++) {
                int i4 = i2;
                int i5 = i3;
                i2 = 0;
                while (i2 < mkVar.an * 1292316989) {
                    int[] iArr = fxVar2.af;
                    i3 = i4 + 1;
                    int i6 = i5 + 1;
                    iArr[i4] = fxVar.af[i5] + iArr[i4];
                    i2++;
                    i4 = i3;
                    i5 = i6;
                }
                i3 = i5 + (fxVar.ad - (mkVar.an * 1292316989));
                i2 = (fxVar2.ad - (mkVar.an * 1292316989)) + i4;
            }
        }
    }

    void ax(fx fxVar, fx fxVar2, mk mkVar) {
        if (mkVar.an * 1292316989 != 0 && mkVar.aa * 1953141137 != 0) {
            int i;
            int i2 = mkVar.af * -22382459 == 0 ? fxVar.ad - (mkVar.an * 1292316989) : 0;
            if (mkVar.ad * 1508303939 == 0) {
                i = fxVar.an - (mkVar.aa * 1953141137);
            } else {
                i = 0;
            }
            int i3 = (i * fxVar.ad) + i2;
            i = (mkVar.af * -22382459) + (fxVar2.ad * (mkVar.ad * 1508303939));
            for (i2 = 0; i2 < mkVar.aa * 1953141137; i2++) {
                int i4 = i;
                int i5 = i3;
                i = 0;
                while (i < mkVar.an * 1292316989) {
                    int[] iArr = fxVar2.af;
                    i3 = i4 + 1;
                    int i6 = i5 + 1;
                    iArr[i4] = fxVar.af[i5] + iArr[i4];
                    i++;
                    i4 = i3;
                    i5 = i6;
                }
                i3 = i5 + (fxVar.ad - (mkVar.an * 1292316989));
                i = (fxVar2.ad - (mkVar.an * 1292316989)) + i4;
            }
        }
    }
}
