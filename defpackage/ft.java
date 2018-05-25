package p000;

public abstract class ft {
    public abstract void aa(int i, int i2, int i3);

    public abstract void ab(int i, int i2);

    public abstract void ac();

    public abstract bi ad(byte b);

    public abstract bi ae();

    public abstract gf af(int i);

    public abstract void ai(int i, int i2);

    public abstract bi aj();

    public abstract void ak(int i, int i2, int i3, int i4);

    public abstract gf al();

    public abstract ch am();

    public abstract ch an(int i);

    public abstract void ao(int i, int i2);

    public abstract gf ap();

    public abstract ch aq();

    public abstract void ar(int i);

    public abstract void as(int i, int i2, int i3);

    public abstract ch at();

    public abstract void au();

    public abstract void av();

    public abstract void aw(int i, int i2);

    public abstract void ax(int i, int i2);

    public abstract void ay(int i, int i2, int i3, int i4, byte b);

    ft() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "ft.<init>(" + ')');
        }
    }

    public void ag(byte b) {
        try {
            ad((byte) -122).af(-756299969);
            af(-1199560407).af(530135724);
        } catch (Throwable e) {
            throw ba.ad(e, "ft.ag(" + ')');
        }
    }

    public void ah() {
        ad((byte) -54).af(1199110531);
        af(938113793).af(530135724);
    }

    public void az() {
        ad((byte) -106).af(-2045891699);
        af(-281726618).af(530135724);
    }

    static boolean ad(CharSequence charSequence, int i, boolean z, int i2) {
        if (i < 2 || i > 36) {
            try {
                throw new IllegalArgumentException("");
            } catch (Throwable e) {
                throw ba.ad(e, "ft.ad(" + ')');
            }
        }
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        Object obj = null;
        while (i3 < length) {
            int i5;
            boolean z3;
            int i6;
            char charAt = charSequence.charAt(i3);
            if (i3 == 0) {
                if ('-' == charAt) {
                    int i7 = 1;
                    boolean z4 = z2;
                    i5 = i4;
                    z3 = z4;
                } else if ('+' == charAt && z) {
                    i6 = i4;
                    z3 = z2;
                    i5 = i6;
                }
                i3++;
                i6 = i5;
                z2 = z3;
                i4 = i6;
            }
            if (charAt >= '0' && charAt <= '9') {
                i5 = charAt - 48;
            } else if (charAt >= 'A' && charAt <= 'Z') {
                i5 = charAt - 55;
            } else if (charAt < 'a' || charAt > 'z') {
                return false;
            } else {
                i5 = charAt - 87;
            }
            if (i5 >= i) {
                return false;
            }
            if (obj != null) {
                i5 = -i5;
            }
            i5 += i4 * i;
            if (i5 / i != i4) {
                return false;
            }
            z3 = true;
            i3++;
            i6 = i5;
            z2 = z3;
            i4 = i6;
        }
        return z2;
    }

    public static int an(int i, int i2, int i3) {
        int i4 = i >>> 31;
        try {
            return ((i4 + i) / i2) - i4;
        } catch (Throwable e) {
            throw ba.ad(e, "ft.an(" + ')');
        }
    }

    static void az(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -i4;
        int i9 = i;
        int i10 = i2;
        while (i8 < 0) {
            int i11;
            int i12 = (i10 + i3) - 3;
            while (i10 < i12) {
                int i13 = i10 + 1;
                i11 = i9 + 1;
                try {
                    iArr[i10] = iArr2[i9];
                    i10 = i13 + 1;
                    i9 = i11 + 1;
                    iArr[i13] = iArr2[i11];
                    i13 = i10 + 1;
                    i11 = i9 + 1;
                    iArr[i10] = iArr2[i9];
                    i10 = i13 + 1;
                    i9 = i11 + 1;
                    iArr[i13] = iArr2[i11];
                } catch (Throwable e) {
                    throw ba.ad(e, "ft.az(" + ')');
                }
            }
            i11 = i12 + 3;
            i12 = i9;
            while (i10 < i11) {
                i9 = i10 + 1;
                i13 = i12 + 1;
                iArr[i10] = iArr2[i12];
                i10 = i9;
                i12 = i13;
            }
            i9 = i12 + i6;
            i8++;
            i10 += i5;
        }
    }

    static final void bh(boolean z, int i) {
        if (z) {
            try {
                client.ct = gr.cb ? lw.ad : lw.aa;
                return;
            } catch (Throwable e) {
                throw ba.ad(e, "ft.bh(" + ')');
            }
        }
        client.ct = cs.oj.ar.containsKey(Integer.valueOf(js.ar(gr.co, (byte) 7))) ? lw.af : lw.an;
    }
}
