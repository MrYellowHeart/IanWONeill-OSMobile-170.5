package p000;

import java.util.Random;

public class lr extends kq {
    static int ab = -1;
    static int ah = 0;
    static int ai = -1;
    static int ak = 255;
    static int ao = 0;
    public static gd[] aq;
    static int at = -1;
    static Random au = new Random();
    static String[] av = new String[100];
    static int aw = -1;
    static int ax = 0;
    static int az = 0;
    int[] aa;
    int[] ad;
    public int ae;
    byte[][] af;
    int[] ag;
    public int aj;
    byte[] am;
    int[] an;
    public int ar;
    public int as;
    int[] ay;

    public lr(byte[] bArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, byte[][] bArr2) {
        this.af = new byte[256][];
        this.as = 0;
        this.ag = iArr;
        this.ay = iArr2;
        this.an = iArr3;
        this.aa = iArr4;
        af(bArr);
        this.af = bArr2;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (i3 < 256) {
            if (this.ay[i3] < i2 && this.aa[i3] != 0) {
                i2 = this.ay[i3];
            }
            if (this.ay[i3] + this.aa[i3] > i) {
                i = this.ay[i3] + this.aa[i3];
            }
            i3++;
        }
        this.ar = this.as - i2;
        this.aj = i - this.as;
        this.ae = this.as - this.ay[120];
    }

    public lr(byte[] bArr) {
        this.af = new byte[256][];
        this.as = 0;
        af(bArr);
    }

    void af(byte[] bArr) {
        this.ad = new int[256];
        int i;
        if (bArr.length == 257) {
            for (i = 0; i < this.ad.length; i++) {
                this.ad[i] = bArr[i] & 255;
            }
            this.as = bArr[256] & 255;
            return;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < 256) {
            int i4 = i3 + 1;
            this.ad[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        i = 0;
        while (i < 256) {
            i4 = i3 + 1;
            iArr[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        i = 0;
        while (i < 256) {
            i4 = i3 + 1;
            iArr2[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        byte[][] bArr2 = new byte[256][];
        int i5 = 0;
        while (i5 < 256) {
            bArr2[i5] = new byte[iArr[i5]];
            i4 = 0;
            i2 = i3;
            i3 = 0;
            while (i4 < bArr2[i5].length) {
                int i6 = i2 + 1;
                i3 = (byte) (i3 + bArr[i2]);
                bArr2[i5][i4] = i3;
                i4++;
                i2 = i6;
            }
            i5++;
            i3 = i2;
        }
        byte[][] bArr3 = new byte[256][];
        int i7 = 0;
        while (i7 < 256) {
            bArr3[i7] = new byte[iArr[i7]];
            i2 = 0;
            i6 = i3;
            i3 = 0;
            while (i3 < bArr3[i7].length) {
                i5 = i6 + 1;
                i2 = (byte) (i2 + bArr[i6]);
                bArr3[i7][i3] = i2;
                i3++;
                i6 = i5;
            }
            i7++;
            i3 = i6;
        }
        this.am = new byte[ic.ad];
        i2 = 0;
        while (i2 < 256) {
            if (!(i2 == 32 || i2 == 160)) {
                for (i6 = 0; i6 < 256; i6++) {
                    if (i6 != 32) {
                        if (i6 != 160) {
                            this.am[(i2 << 8) + i6] = (byte) lr.ad(bArr2, bArr3, iArr2, this.ad, iArr, i2, i6);
                        }
                    }
                }
            }
            i2++;
        }
        this.as = iArr2[32] + iArr[32];
    }

    void bb(byte[] bArr) {
        int i = 0;
        this.ad = new int[256];
        if (bArr.length == 1792073006) {
            while (i < this.ad.length) {
                this.ad[i] = bArr[i] & 255;
                i++;
            }
            this.as = bArr[256] & -2063837329;
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 256) {
            int i4 = i3 + 1;
            this.ad[i2] = bArr[i3] & 255;
            i2++;
            i3 = i4;
        }
        int[] iArr = new int[-994914688];
        int[] iArr2 = new int[256];
        i2 = 0;
        while (i2 < 256) {
            i4 = i3 + 1;
            iArr[i2] = bArr[i3] & -562321198;
            i2++;
            i3 = i4;
        }
        byte[][] bArr2 = new byte[256][];
        int i5 = 0;
        while (i5 < 1337990529) {
            bArr2[i5] = new byte[iArr[i5]];
            i2 = 0;
            i4 = i3;
            i3 = 0;
            while (i3 < bArr2[i5].length) {
                int i6 = i4 + 1;
                i2 = (byte) (i2 + bArr[i4]);
                bArr2[i5][i3] = i2;
                i3++;
                i4 = i6;
            }
            i5++;
            i3 = i4;
        }
        bArr2 = new byte[-1820144458][];
        i5 = 0;
        while (i5 < 256) {
            bArr2[i5] = new byte[iArr[i5]];
            i2 = 0;
            i4 = i3;
            i3 = 0;
            while (i3 < bArr2[i5].length) {
                i6 = i4 + 1;
                i2 = (byte) (i2 + bArr[i4]);
                bArr2[i5][i3] = i2;
                i3++;
                i4 = i6;
            }
            i5++;
            i3 = i4;
        }
        this.am = new byte[-1722905794];
        this.as = iArr2[-1782560533] + iArr[32];
    }

    void bw(byte[] bArr) {
        int i = 0;
        this.ad = new int[256];
        if (bArr.length == 697229728) {
            while (i < this.ad.length) {
                this.ad[i] = bArr[i] & -1595223332;
                i++;
            }
            this.as = bArr[256] & 255;
            return;
        }
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < 256) {
            int i5 = i4 + 1;
            this.ad[i3] = bArr[i4] & -1457187436;
            i3++;
            i4 = i5;
        }
        int[] iArr = new int[1944467360];
        int[] iArr2 = new int[313118434];
        i3 = 0;
        while (i3 < 1907375378) {
            i5 = i4 + 1;
            iArr[i3] = bArr[i4] & 255;
            i3++;
            i4 = i5;
        }
        i3 = 0;
        while (i3 < 1028437850) {
            i5 = i4 + 1;
            iArr2[i3] = bArr[i4] & 255;
            i3++;
            i4 = i5;
        }
        byte[][] bArr2 = new byte[934853374][];
        int i6 = 0;
        while (i6 < 256) {
            bArr2[i6] = new byte[iArr[i6]];
            i5 = 0;
            i2 = i4;
            i4 = 0;
            while (i5 < bArr2[i6].length) {
                int i7 = i2 + 1;
                i4 = (byte) (i4 + bArr[i2]);
                bArr2[i6][i5] = i4;
                i5++;
                i2 = i7;
            }
            i6++;
            i4 = i2;
        }
        byte[][] bArr3 = new byte[256][];
        int i8 = 0;
        while (i8 < 256) {
            bArr3[i8] = new byte[iArr[i8]];
            i2 = 0;
            i7 = i4;
            i4 = 0;
            while (i4 < bArr3[i8].length) {
                i6 = i7 + 1;
                i2 = (byte) (i2 + bArr[i7]);
                bArr3[i8][i4] = i2;
                i4++;
                i7 = i6;
            }
            i8++;
            i4 = i7;
        }
        this.am = new byte[-1072489696];
        i2 = 0;
        while (i2 < 256) {
            if (!(i2 == -96834691 || i2 == 601785190)) {
                i7 = 0;
                while (i7 < 256) {
                    if (!(i7 == -976231835 || i7 == 160)) {
                        this.am[(i2 << 8) + i7] = (byte) lr.ad(bArr2, bArr3, iArr2, this.ad, iArr, i2, i7);
                    }
                    i7++;
                }
            }
            i2++;
        }
        this.as = iArr2[32] + iArr[365251482];
    }

    static int ad(byte[][] bArr, byte[][] bArr2, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3;
        int i4 = iArr[i];
        int i5 = i4 + iArr3[i];
        int i6 = iArr[i2];
        int i7 = iArr3[i2] + i6;
        if (i6 > i4) {
            i3 = i6;
        } else {
            i3 = i4;
        }
        if (i7 >= i5) {
            i7 = i5;
        }
        i5 = iArr2[i];
        if (iArr2[i2] < i5) {
            i5 = iArr2[i2];
        }
        byte[] bArr3 = bArr2[i];
        byte[] bArr4 = bArr[i2];
        i4 = i3 - i4;
        i6 = i3 - i6;
        int i8 = i3;
        i3 = i5;
        i5 = i6;
        i6 = i8;
        while (i6 < i7) {
            int i9 = i4 + 1;
            byte b = bArr3[i4];
            i4 = i5 + 1;
            i5 = bArr4[i5] + b;
            if (i5 >= i3) {
                i5 = i3;
            }
            i6++;
            i3 = i5;
            i5 = i4;
            i4 = i9;
        }
        return -i3;
    }

    static int bc(byte[][] bArr, byte[][] bArr2, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3;
        int i4 = iArr[i];
        int i5 = i4 + iArr3[i];
        int i6 = iArr[i2];
        int i7 = i6 + iArr3[i2];
        if (i6 > i4) {
            i3 = i6;
        } else {
            i3 = i4;
        }
        if (i7 >= i5) {
            i7 = i5;
        }
        i5 = iArr2[i];
        if (iArr2[i2] < i5) {
            i5 = iArr2[i2];
        }
        byte[] bArr3 = bArr2[i];
        byte[] bArr4 = bArr[i2];
        i4 = i3 - i4;
        int i8 = i3;
        i3 -= i6;
        i6 = i5;
        i5 = i4;
        i4 = i8;
        while (i4 < i7) {
            int i9 = i5 + 1;
            byte b = bArr3[i5];
            i5 = i3 + 1;
            i3 = bArr4[i3] + b;
            if (i3 >= i6) {
                i3 = i6;
            }
            i4++;
            i6 = i3;
            i3 = i5;
            i5 = i9;
        }
        return -i6;
    }

    int an(char c) {
        if (c == ' ') {
            c = ' ';
        }
        return this.ad[jq.af(c, -813641001) & 255];
    }

    int bf(char c) {
        if (c == ' ') {
            c = '䝟';
        }
        return this.ad[jq.af(c, 707676692) & 255];
    }

    int bg(char c) {
        if (c == '䵟') {
            c = '[';
        }
        return this.ad[jq.af(c, -1660282346) & 419314456];
    }

    int bh(char c) {
        if (c == ' ') {
            c = ' ';
        }
        return this.ad[jq.af(c, 556400799) & 1722928849];
    }

    int bz(char c) {
        if (c == ' ') {
            c = ' ';
        }
        return this.ad[jq.af(c, 372303235) & 255];
    }

    public int aa(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        int i2 = 0;
        char c = '￿';
        int i3 = -1;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '<') {
                i3 = i;
            } else {
                int i4;
                char c2;
                if (charAt != '>' || i3 == -1) {
                    char c3 = charAt;
                    i4 = i3;
                    c2 = c3;
                } else {
                    String substring = str.substring(i3 + 1, i);
                    if (substring.equals("lt")) {
                        c2 = '<';
                        i4 = -1;
                    } else if (substring.equals("gt")) {
                        c2 = '>';
                        i4 = -1;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i2 += aq[ll.aa(substring.substring(4), 10, true, (byte) 18)].as;
                            c = '￿';
                            i3 = -1;
                        } catch (Exception e) {
                            i3 = -1;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                if (c2 == ' ') {
                    c2 = ' ';
                }
                if (i4 == -1) {
                    i2 += this.ad[(char) (jq.af(c2, -425605178) & 255)];
                    if (!(this.am == null || c == '￿')) {
                        i2 += this.am[(c << 8) + c2];
                    }
                    c = c2;
                    i3 = i4;
                } else {
                    i3 = i4;
                }
            }
            i++;
        }
        return i2;
    }

    public int ag(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        StringBuilder stringBuilder = new StringBuilder(100);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10;
            int i11;
            char charAt = str.charAt(i9);
            if (charAt == '<') {
                i6 = i;
                i = i9;
                i10 = i4;
                i4 = i2;
                i2 = i10;
                i11 = i3;
                i3 = i5;
                i5 = i11;
            } else {
                if (charAt != '>' || i6 == -1) {
                    i10 = i6;
                    i6 = i2;
                    i2 = i3;
                    i3 = i10;
                } else {
                    String substring = str.substring(i6 + 1, i9);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i8] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i = i8 + 1;
                        i3 = stringBuilder.length();
                        i2 = 0;
                        i7 = -1;
                        i8 = 0;
                    } else if (substring.equals("lt")) {
                        i += an('<');
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + 60];
                        }
                        i10 = i8;
                        i8 = 60;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.equals("gt")) {
                        i += an('>');
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + 62];
                        }
                        i10 = i8;
                        i8 = 62;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i7 = aq[ll.aa(substring.substring(4), 10, true, (byte) 21)].as + i;
                            i10 = i8;
                            i8 = 0;
                            i = i10;
                            i11 = i3;
                            i3 = i2;
                            i2 = i7;
                            i7 = i11;
                        } catch (Exception e) {
                            i10 = i8;
                            i8 = i7;
                            i7 = i3;
                            i3 = i2;
                            i2 = i;
                            i = i10;
                        }
                    } else {
                        i10 = i8;
                        i8 = i7;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    }
                    charAt = '\u0000';
                    i10 = i;
                    i = i2;
                    i2 = i7;
                    i7 = i8;
                    i8 = i10;
                    i11 = i3;
                    i3 = -1;
                    i6 = i11;
                }
                if (i3 == -1) {
                    int i12;
                    if (charAt != '\u0000') {
                        stringBuilder.append(charAt);
                        i += an(charAt);
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + charAt];
                        }
                        i7 = charAt;
                        i12 = i;
                    } else {
                        i12 = i;
                    }
                    if (charAt == ' ') {
                        i5 = stringBuilder.length();
                        i2 = 1;
                        i4 = i12;
                    } else {
                        i10 = i5;
                        i5 = i2;
                        i2 = i10;
                    }
                    if (iArr != null) {
                        if (i8 < iArr.length) {
                            i = i8;
                        } else {
                            i = iArr.length - 1;
                        }
                        if (i12 > iArr[i] && i5 >= 0) {
                            strArr[i8] = stringBuilder.toString().substring(i6, i5 - i2);
                            i8++;
                            i = -1;
                            i7 = 0;
                            i10 = i5;
                            i5 = i12 - i4;
                            i6 = i10;
                            if (charAt != '-') {
                                i4 = i6;
                                i6 = i5;
                                i10 = i5;
                                i5 = stringBuilder.length();
                                i2 = i10;
                                i11 = i3;
                                i3 = 0;
                                i = i11;
                            } else {
                                i10 = i3;
                                i3 = i2;
                                i2 = i4;
                                i4 = i6;
                                i6 = i5;
                                i5 = i;
                                i = i10;
                            }
                        }
                    }
                    i = i5;
                    i5 = i12;
                    if (charAt != '-') {
                        i10 = i3;
                        i3 = i2;
                        i2 = i4;
                        i4 = i6;
                        i6 = i5;
                        i5 = i;
                        i = i10;
                    } else {
                        i4 = i6;
                        i6 = i5;
                        i10 = i5;
                        i5 = stringBuilder.length();
                        i2 = i10;
                        i11 = i3;
                        i3 = 0;
                        i = i11;
                    }
                } else {
                    i10 = i3;
                    i3 = i5;
                    i5 = i2;
                    i2 = i4;
                    i4 = i6;
                    i6 = i;
                    i = i10;
                }
            }
            i9++;
            i10 = i;
            i = i6;
            i6 = i10;
            i11 = i2;
            i2 = i4;
            i4 = i11;
            int i13 = i5;
            i5 = i3;
            i3 = i13;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i8;
        }
        i = i8 + 1;
        strArr[i8] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i;
    }

    public int bp(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        StringBuilder stringBuilder = new StringBuilder(100);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10;
            int i11;
            char charAt = str.charAt(i9);
            if (charAt == '<') {
                i6 = i;
                i = i9;
                i10 = i4;
                i4 = i2;
                i2 = i10;
                i11 = i3;
                i3 = i5;
                i5 = i11;
            } else {
                if (charAt != '>' || i6 == -1) {
                    i10 = i6;
                    i6 = i2;
                    i2 = i3;
                    i3 = i10;
                } else {
                    String substring = str.substring(i6 + 1, i9);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i8] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i = i8 + 1;
                        i3 = stringBuilder.length();
                        i2 = 0;
                        i7 = -1;
                        i8 = 0;
                    } else if (substring.equals("lt")) {
                        i += an('<');
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + 60];
                        }
                        i10 = i8;
                        i8 = 60;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.equals("gt")) {
                        i += an('>');
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + 62];
                        }
                        i10 = i8;
                        i8 = 62;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i7 = aq[ll.aa(substring.substring(4), 10, true, (byte) -19)].as + i;
                            i10 = i8;
                            i8 = 0;
                            i = i10;
                            i11 = i3;
                            i3 = i2;
                            i2 = i7;
                            i7 = i11;
                        } catch (Exception e) {
                            i10 = i8;
                            i8 = i7;
                            i7 = i3;
                            i3 = i2;
                            i2 = i;
                            i = i10;
                        }
                    } else {
                        i10 = i8;
                        i8 = i7;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    }
                    charAt = '\u0000';
                    i10 = i;
                    i = i2;
                    i2 = i7;
                    i7 = i8;
                    i8 = i10;
                    i11 = i3;
                    i3 = -1;
                    i6 = i11;
                }
                if (i3 == -1) {
                    int i12;
                    if (charAt != '\u0000') {
                        stringBuilder.append(charAt);
                        i += an(charAt);
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + charAt];
                        }
                        i7 = charAt;
                        i12 = i;
                    } else {
                        i12 = i;
                    }
                    if (charAt == ' ') {
                        i5 = stringBuilder.length();
                        i2 = 1;
                        i4 = i12;
                    } else {
                        i10 = i5;
                        i5 = i2;
                        i2 = i10;
                    }
                    if (iArr != null) {
                        if (i8 < iArr.length) {
                            i = i8;
                        } else {
                            i = iArr.length - 1;
                        }
                        if (i12 > iArr[i] && i5 >= 0) {
                            strArr[i8] = stringBuilder.toString().substring(i6, i5 - i2);
                            i8++;
                            i = -1;
                            i7 = 0;
                            i10 = i5;
                            i5 = i12 - i4;
                            i6 = i10;
                            if (charAt != '-') {
                                i4 = i6;
                                i6 = i5;
                                i10 = i5;
                                i5 = stringBuilder.length();
                                i2 = i10;
                                i11 = i3;
                                i3 = 0;
                                i = i11;
                            } else {
                                i10 = i3;
                                i3 = i2;
                                i2 = i4;
                                i4 = i6;
                                i6 = i5;
                                i5 = i;
                                i = i10;
                            }
                        }
                    }
                    i = i5;
                    i5 = i12;
                    if (charAt != '-') {
                        i10 = i3;
                        i3 = i2;
                        i2 = i4;
                        i4 = i6;
                        i6 = i5;
                        i5 = i;
                        i = i10;
                    } else {
                        i4 = i6;
                        i6 = i5;
                        i10 = i5;
                        i5 = stringBuilder.length();
                        i2 = i10;
                        i11 = i3;
                        i3 = 0;
                        i = i11;
                    }
                } else {
                    i10 = i3;
                    i3 = i5;
                    i5 = i2;
                    i2 = i4;
                    i4 = i6;
                    i6 = i;
                    i = i10;
                }
            }
            i9++;
            i10 = i;
            i = i6;
            i6 = i10;
            i11 = i2;
            i2 = i4;
            i4 = i11;
            int i13 = i5;
            i5 = i3;
            i3 = i13;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i8;
        }
        i = i8 + 1;
        strArr[i8] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i;
    }

    public int bv(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        StringBuilder stringBuilder = new StringBuilder(100);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10;
            int i11;
            char charAt = str.charAt(i9);
            if (charAt == '<') {
                i6 = i;
                i = i9;
                i10 = i4;
                i4 = i2;
                i2 = i10;
                i11 = i3;
                i3 = i5;
                i5 = i11;
            } else {
                if (charAt != '>' || i6 == -1) {
                    i10 = i6;
                    i6 = i2;
                    i2 = i3;
                    i3 = i10;
                } else {
                    String substring = str.substring(i6 + 1, i9);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i8] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i = i8 + 1;
                        i3 = stringBuilder.length();
                        i2 = 0;
                        i7 = -1;
                        i8 = 0;
                    } else if (substring.equals("lt")) {
                        i += an('<');
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + 60];
                        }
                        i10 = i8;
                        i8 = 60;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.equals("gt")) {
                        i += an('>');
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + 62];
                        }
                        i10 = i8;
                        i8 = 62;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i7 = aq[ll.aa(substring.substring(4), 10, true, (byte) -2)].as + i;
                            i10 = i8;
                            i8 = 0;
                            i = i10;
                            i11 = i3;
                            i3 = i2;
                            i2 = i7;
                            i7 = i11;
                        } catch (Exception e) {
                            i10 = i8;
                            i8 = i7;
                            i7 = i3;
                            i3 = i2;
                            i2 = i;
                            i = i10;
                        }
                    } else {
                        i10 = i8;
                        i8 = i7;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    }
                    charAt = '\u0000';
                    i10 = i;
                    i = i2;
                    i2 = i7;
                    i7 = i8;
                    i8 = i10;
                    i11 = i3;
                    i3 = -1;
                    i6 = i11;
                }
                if (i3 == -1) {
                    int i12;
                    if (charAt != '\u0000') {
                        stringBuilder.append(charAt);
                        i += an(charAt);
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + charAt];
                        }
                        i7 = charAt;
                        i12 = i;
                    } else {
                        i12 = i;
                    }
                    if (charAt == ' ') {
                        i5 = stringBuilder.length();
                        i2 = 1;
                        i4 = i12;
                    } else {
                        i10 = i5;
                        i5 = i2;
                        i2 = i10;
                    }
                    if (iArr != null) {
                        if (i8 < iArr.length) {
                            i = i8;
                        } else {
                            i = iArr.length - 1;
                        }
                        if (i12 > iArr[i] && i5 >= 0) {
                            strArr[i8] = stringBuilder.toString().substring(i6, i5 - i2);
                            i8++;
                            i = -1;
                            i7 = 0;
                            i10 = i5;
                            i5 = i12 - i4;
                            i6 = i10;
                            if (charAt != '-') {
                                i4 = i6;
                                i6 = i5;
                                i10 = i5;
                                i5 = stringBuilder.length();
                                i2 = i10;
                                i11 = i3;
                                i3 = 0;
                                i = i11;
                            } else {
                                i10 = i3;
                                i3 = i2;
                                i2 = i4;
                                i4 = i6;
                                i6 = i5;
                                i5 = i;
                                i = i10;
                            }
                        }
                    }
                    i = i5;
                    i5 = i12;
                    if (charAt != '-') {
                        i10 = i3;
                        i3 = i2;
                        i2 = i4;
                        i4 = i6;
                        i6 = i5;
                        i5 = i;
                        i = i10;
                    } else {
                        i4 = i6;
                        i6 = i5;
                        i10 = i5;
                        i5 = stringBuilder.length();
                        i2 = i10;
                        i11 = i3;
                        i3 = 0;
                        i = i11;
                    }
                } else {
                    i10 = i3;
                    i3 = i5;
                    i5 = i2;
                    i2 = i4;
                    i4 = i6;
                    i6 = i;
                    i = i10;
                }
            }
            i9++;
            i10 = i;
            i = i6;
            i6 = i10;
            i11 = i2;
            i2 = i4;
            i4 = i11;
            int i13 = i5;
            i5 = i3;
            i3 = i13;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i8;
        }
        i = i8 + 1;
        strArr[i8] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i;
    }

    public int bx(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        StringBuilder stringBuilder = new StringBuilder(-1013622911);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10;
            int i11;
            char charAt = str.charAt(i9);
            if (charAt == '炝') {
                i6 = i;
                i = i9;
                i10 = i4;
                i4 = i2;
                i2 = i10;
                i11 = i3;
                i3 = i5;
                i5 = i11;
            } else {
                if (charAt != '>' || i6 == -1) {
                    i10 = i6;
                    i6 = i2;
                    i2 = i3;
                    i3 = i10;
                } else {
                    String substring = str.substring(i6 + 1, i9);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('섽');
                    if (substring.equals("br")) {
                        strArr[i8] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i = i8 + 1;
                        i3 = stringBuilder.length();
                        i2 = 0;
                        i7 = -1;
                        i8 = 0;
                    } else if (substring.equals("lt")) {
                        i += an('<');
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) - 473827146];
                        }
                        i10 = i8;
                        i8 = 60;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.equals("gt")) {
                        i += an('渻');
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + 62];
                        }
                        i10 = i8;
                        i8 = 1781100396;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i7 = aq[ll.aa(substring.substring(4), 10, true, (byte) -20)].as + i;
                            i10 = i8;
                            i8 = 0;
                            i = i10;
                            i11 = i3;
                            i3 = i2;
                            i2 = i7;
                            i7 = i11;
                        } catch (Exception e) {
                            i10 = i8;
                            i8 = i7;
                            i7 = i3;
                            i3 = i2;
                            i2 = i;
                            i = i10;
                        }
                    } else {
                        i10 = i8;
                        i8 = i7;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    }
                    charAt = '\u0000';
                    i10 = i;
                    i = i2;
                    i2 = i7;
                    i7 = i8;
                    i8 = i10;
                    i11 = i3;
                    i3 = -1;
                    i6 = i11;
                }
                if (i3 == -1) {
                    int i12;
                    if (charAt != '\u0000') {
                        stringBuilder.append(charAt);
                        i += an(charAt);
                        if (!(this.am == null || i7 == -1)) {
                            i += this.am[(i7 << 8) + charAt];
                        }
                        i7 = charAt;
                        i12 = i;
                    } else {
                        i12 = i;
                    }
                    if (charAt == '') {
                        i5 = stringBuilder.length();
                        i2 = 1;
                        i4 = i12;
                    } else {
                        i10 = i5;
                        i5 = i2;
                        i2 = i10;
                    }
                    if (iArr != null) {
                        if (i8 < iArr.length) {
                            i = i8;
                        } else {
                            i = iArr.length - 1;
                        }
                        if (i12 > iArr[i] && i5 >= 0) {
                            strArr[i8] = stringBuilder.toString().substring(i6, i5 - i2);
                            i8++;
                            i = -1;
                            i7 = 0;
                            i10 = i5;
                            i5 = i12 - i4;
                            i6 = i10;
                            if (charAt != '-') {
                                i4 = i6;
                                i6 = i5;
                                i10 = i5;
                                i5 = stringBuilder.length();
                                i2 = i10;
                                i11 = i3;
                                i3 = 0;
                                i = i11;
                            } else {
                                i10 = i3;
                                i3 = i2;
                                i2 = i4;
                                i4 = i6;
                                i6 = i5;
                                i5 = i;
                                i = i10;
                            }
                        }
                    }
                    i = i5;
                    i5 = i12;
                    if (charAt != '-') {
                        i10 = i3;
                        i3 = i2;
                        i2 = i4;
                        i4 = i6;
                        i6 = i5;
                        i5 = i;
                        i = i10;
                    } else {
                        i4 = i6;
                        i6 = i5;
                        i10 = i5;
                        i5 = stringBuilder.length();
                        i2 = i10;
                        i11 = i3;
                        i3 = 0;
                        i = i11;
                    }
                } else {
                    i10 = i3;
                    i3 = i5;
                    i5 = i2;
                    i2 = i4;
                    i4 = i6;
                    i6 = i;
                    i = i10;
                }
            }
            i9++;
            i10 = i;
            i = i6;
            i6 = i10;
            i11 = i2;
            i2 = i4;
            i4 = i11;
            int i13 = i5;
            i5 = i3;
            i3 = i13;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i8;
        }
        i = i8 + 1;
        strArr[i8] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i;
    }

    public int ay(String str, int i) {
        int ag = ag(str, new int[]{i}, av);
        int i2 = 0;
        int i3 = 0;
        while (i2 < ag) {
            int aa = aa(av[i2]);
            if (aa <= i3) {
                aa = i3;
            }
            i2++;
            i3 = aa;
        }
        return i3;
    }

    public int bt(String str, int i) {
        int ag = ag(str, new int[]{i}, av);
        int i2 = 0;
        int i3 = 0;
        while (i2 < ag) {
            int aa = aa(av[i2]);
            if (aa <= i3) {
                aa = i3;
            }
            i2++;
            i3 = aa;
        }
        return i3;
    }

    public int as(String str, int i) {
        return ag(str, new int[]{i}, av);
    }

    public int bu(String str, int i) {
        return ag(str, new int[]{i}, av);
    }

    public static String ar(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public static String be(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public static String bk(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public static String by(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public void aj(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i, i2, gfVar);
        }
    }

    public void ba(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i, i2, gfVar);
        }
    }

    public void bn(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i, i2, gfVar);
        }
    }

    public void ae(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ak = i5;
            ax(str, i, i2, gfVar);
        }
    }

    public void bl(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ak = i5;
            ax(str, i, i2, gfVar);
        }
    }

    public void aq(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i - aa(str), i2, gfVar);
        }
    }

    public void bd(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i - aa(str), i2, gfVar);
        }
    }

    public void bs(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i - aa(str), i2, gfVar);
        }
    }

    public void am(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i - (aa(str) / 2), i2, gfVar);
        }
    }

    public void bi(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i - (aa(str) / 2), i2, gfVar);
        }
    }

    public void bj(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i - (aa(str) / 2), i2, gfVar);
        }
    }

    public void bm(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i - (aa(str) / 2), i2, gfVar);
        }
    }

    public void br(String str, int i, int i2, int i3, int i4, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            ax(str, i - (aa(str) / 2), i2, gfVar);
        }
    }

    public int at(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, gf gfVar) {
        if (str == null) {
            return 0;
        }
        int i10;
        int i11;
        ah(i5, i6);
        if (i9 == 0) {
            i9 = this.as;
        }
        int[] iArr = new int[]{i3};
        if (i4 < (this.ar + this.aj) + i9 && i4 < i9 + i9) {
            iArr = null;
        }
        int ag = ag(str, iArr, av);
        if (i8 == 3 && ag == 1) {
            i8 = 1;
        }
        if (i8 == 0) {
            i10 = this.ar + i2;
        } else if (i8 == 1) {
            i10 = (this.ar + i2) + ((((i4 - this.ar) - this.aj) - ((ag - 1) * i9)) / 2);
        } else if (i8 == 2) {
            i10 = ((i2 + i4) - this.aj) - ((ag - 1) * i9);
        } else {
            i10 = (((i4 - this.ar) - this.aj) - ((ag - 1) * i9)) / (ag + 1);
            if (i10 < 0) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            i10 = (this.ar + i2) + i11;
            i9 += i11;
        }
        i11 = i10;
        for (i10 = 0; i10 < ag; i10++) {
            if (i7 == 0) {
                ax(av[i10], i, i11, gfVar);
            } else if (i7 == 1) {
                ax(av[i10], ((i3 - aa(av[i10])) / 2) + i, i11, gfVar);
            } else if (i7 == 2) {
                ax(av[i10], (i + i3) - aa(av[i10]), i11, gfVar);
            } else if (i10 == ag - 1) {
                ax(av[i10], i, i11, gfVar);
            } else {
                ao(av[i10], i3);
                ax(av[i10], i, i11, gfVar);
                ao = 0;
            }
            i11 += i9;
        }
        return ag;
    }

    public int bq(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, gf gfVar) {
        if (str == null) {
            return 0;
        }
        int i10;
        ah(i5, i6);
        if (i9 == 0) {
            i9 = this.as;
        }
        int[] iArr = new int[]{i3};
        if (i4 < (this.ar + this.aj) + i9 && i4 < i9 + i9) {
            iArr = null;
        }
        int ag = ag(str, iArr, av);
        if (i8 == 3 && ag == 1) {
            i8 = 1;
        }
        if (i8 == 0) {
            i10 = this.ar + i2;
        } else if (i8 == 1) {
            i10 = (this.ar + i2) + ((((i4 - this.ar) - this.aj) - ((ag - 1) * i9)) / 2);
        } else if (i8 == 2) {
            i10 = ((i2 + i4) - this.aj) - ((ag - 1) * i9);
        } else {
            i10 = (((i4 - this.ar) - this.aj) - ((ag - 1) * i9)) / (ag + 1);
            if (i10 < 0) {
                i10 = 0;
            }
            i9 += i10;
            i10 = (this.ar + i2) + i10;
        }
        int i11 = i10;
        for (i10 = 0; i10 < ag; i10++) {
            if (i7 == 0) {
                ax(av[i10], i, i11, gfVar);
            } else if (i7 == 1) {
                ax(av[i10], ((i3 - aa(av[i10])) / 2) + i, i11, gfVar);
            } else if (i7 == 2) {
                ax(av[i10], (i + i3) - aa(av[i10]), i11, gfVar);
            } else if (i10 == ag - 1) {
                ax(av[i10], i, i11, gfVar);
            } else {
                ao(av[i10], i3);
                ax(av[i10], i, i11, gfVar);
                ao = 0;
            }
            i11 += i9;
        }
        return ag;
    }

    public void ab(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            au(str, i - (aa(str) / 2), i2, null, iArr, gfVar);
        }
    }

    public void bo(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            au(str, i - (aa(str) / 2), i2, null, iArr, gfVar);
        }
    }

    public void ci(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            au(str, i - (aa(str) / 2), i2, null, iArr, gfVar);
        }
    }

    public void cv(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            au(str, i - (aa(str) / 2), i2, null, iArr, gfVar);
        }
    }

    public void aw(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            int[] iArr = new int[str.length()];
            int[] iArr2 = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 5.0d) + (((double) i5) / 5.0d)) * 5.0d);
                iArr2[i6] = (int) (Math.sin((((double) i6) / 3.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            au(str, i - (aa(str) / 2), i2, iArr, iArr2, gfVar);
        }
    }

    public void ai(String str, int i, int i2, int i3, int i4, int i5, int i6, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            au(str, i - (aa(str) / 2), i2, null, iArr, gfVar);
        }
    }

    public void cc(String str, int i, int i2, int i3, int i4, int i5, int i6, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            au(str, i - (aa(str) / 2), i2, null, iArr, gfVar);
        }
    }

    public void cn(String str, int i, int i2, int i3, int i4, int i5, int i6, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            au(str, i - (aa(str) / 2), i2, null, iArr, gfVar);
        }
    }

    public void co(String str, int i, int i2, int i3, int i4, int i5, int i6, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            au(str, i - (aa(str) / 2), i2, null, iArr, gfVar);
        }
    }

    public void cy(String str, int i, int i2, int i3, int i4, int i5, int i6, gf gfVar) {
        if (str != null) {
            ah(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            au(str, i - (aa(str) / 2), i2, null, iArr, gfVar);
        }
    }

    public void az(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        int i6 = 0;
        if (str != null) {
            ah(i3, i4);
            au.setSeed((long) i5);
            ak = (au.nextInt() & 31) + 192;
            int[] iArr = new int[str.length()];
            int i7 = 0;
            while (i6 < str.length()) {
                iArr[i6] = i7;
                if ((au.nextInt() & 3) == 0) {
                    i7++;
                }
                i6++;
            }
            au(str, i, i2, iArr, null, gfVar);
        }
    }

    public void ck(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        int i6 = 0;
        if (str != null) {
            ah(i3, i4);
            au.setSeed((long) i5);
            ak = (au.nextInt() & 31) + 192;
            int[] iArr = new int[str.length()];
            int i7 = 0;
            while (i6 < str.length()) {
                iArr[i6] = i7;
                if ((au.nextInt() & 3) == 0) {
                    i7++;
                }
                i6++;
            }
            au(str, i, i2, iArr, null, gfVar);
        }
    }

    public void cl(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        int i6 = 0;
        if (str != null) {
            ah(i3, i4);
            au.setSeed((long) i5);
            ak = (au.nextInt() & 31) + 192;
            int[] iArr = new int[str.length()];
            int i7 = 0;
            while (i6 < str.length()) {
                iArr[i6] = i7;
                if ((au.nextInt() & 3) == 0) {
                    i7++;
                }
                i6++;
            }
            au(str, i, i2, iArr, null, gfVar);
        }
    }

    public void cs(String str, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        int i6 = 0;
        if (str != null) {
            ah(i3, i4);
            au.setSeed((long) i5);
            ak = (au.nextInt() & 31) + 192;
            int[] iArr = new int[str.length()];
            int i7 = 0;
            while (i6 < str.length()) {
                iArr[i6] = i7;
                if ((au.nextInt() & 3) == 0) {
                    i7++;
                }
                i6++;
            }
            au(str, i, i2, iArr, null, gfVar);
        }
    }

    void ah(int i, int i2) {
        at = -1;
        ab = -1;
        aw = i2;
        ai = i2;
        az = i;
        ah = i;
        ak = 255;
        ao = 0;
        ax = 0;
    }

    void cd(int i, int i2) {
        at = -1;
        ab = -1;
        aw = i2;
        ai = i2;
        az = i;
        ah = i;
        ak = 255;
        ao = 0;
        ax = 0;
    }

    void ch(int i, int i2) {
        at = -1;
        ab = -1;
        aw = i2;
        ai = i2;
        az = i;
        ah = i;
        ak = 255;
        ao = 0;
        ax = 0;
    }

    void cm(int i, int i2) {
        at = -1;
        ab = -1;
        aw = i2;
        ai = i2;
        az = i;
        ah = i;
        ak = 255;
        ao = 0;
        ax = 0;
    }

    void cq(int i, int i2) {
        at = -1;
        ab = -1;
        aw = i2;
        ai = i2;
        az = i;
        ah = i;
        ak = 255;
        ao = 0;
        ax = 0;
    }

    void ak(String str) {
        try {
            if (str.startsWith("col=")) {
                ah = ao.an(str.substring(4), 16, -1896731005);
            } else if (str.equals("/col")) {
                ah = az;
            } else if (str.startsWith("str=")) {
                at = ao.an(str.substring(4), 16, -1447895490);
            } else if (str.equals("str")) {
                at = 8388608;
            } else if (str.equals("/str")) {
                at = -1;
            } else if (str.startsWith("u=")) {
                ab = ao.an(str.substring(2), 16, -1885815365);
            } else if (str.equals("u")) {
                ab = 0;
            } else if (str.equals("/u")) {
                ab = -1;
            } else if (str.startsWith("shad=")) {
                ai = ao.an(str.substring(5), 16, -1807737376);
            } else if (str.equals("shad")) {
                ai = 0;
            } else if (str.equals("/shad")) {
                ai = aw;
            } else if (str.equals("br")) {
                ah(az, aw);
            }
        } catch (Exception e) {
        }
    }

    void cj(String str) {
        try {
            if (str.startsWith("col=")) {
                ah = ao.an(str.substring(4), 16, -1740598330);
            } else if (str.equals("/col")) {
                ah = az;
            } else if (str.startsWith("str=")) {
                at = ao.an(str.substring(4), 16, -1474124569);
            } else if (str.equals("str")) {
                at = -1618156792;
            } else if (str.equals("/str")) {
                at = -1;
            } else if (str.startsWith("u=")) {
                ab = ao.an(str.substring(2), 16, -2021662882);
            } else if (str.equals("u")) {
                ab = 0;
            } else if (str.equals("/u")) {
                ab = -1;
            } else if (str.startsWith("shad=")) {
                ai = ao.an(str.substring(5), 16, -1646004094);
            } else if (str.equals("shad")) {
                ai = 0;
            } else if (str.equals("/shad")) {
                ai = aw;
            } else if (str.equals("br")) {
                ah(az, aw);
            }
        } catch (Exception e) {
        }
    }

    void ao(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                obj = 1;
            } else if (charAt == '>') {
                obj = null;
            } else if (obj == null && charAt == ' ') {
                i2++;
            }
        }
        if (i2 > 0) {
            ao = ((i - aa(str)) << 8) / i2;
        }
    }

    void cp(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                obj = 1;
            } else if (charAt == '>') {
                obj = null;
            } else if (obj == null && charAt == ' ') {
                i2++;
            }
        }
        if (i2 > 0) {
            ao = ((i - aa(str)) << 8) / i2;
        }
    }

    void ax(String str, int i, int i2, gf gfVar) {
        int i3 = i2 - this.as;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (i4 < str.length()) {
            int i7;
            if (str.charAt(i4) == '\u0000') {
                i7 = i6;
                i6 = i5;
            } else {
                int af = (char) (jq.af(str.charAt(i4), -1259596156) & 255);
                if (af == '<') {
                    i6 = i5;
                    i7 = i4;
                } else {
                    int i8;
                    if (af != '>' || i6 == -1) {
                        i8 = i6;
                    } else {
                        String substring = str.substring(i6 + 1, i4);
                        i7 = -1;
                        if (substring.equals("lt")) {
                            af = '<';
                            i8 = -1;
                        } else if (substring.equals("gt")) {
                            af = '>';
                            i8 = -1;
                        } else if (substring.startsWith("img=")) {
                            try {
                                gd gdVar = aq[ll.aa(substring.substring(4), 10, true, (byte) -24)];
                                gfVar.ao(gdVar, i, (this.as + i3) - gdVar.ar, (short) 1417);
                                i += gdVar.as;
                                i6 = -1;
                            } catch (Exception e) {
                                i6 = i5;
                            }
                        } else {
                            ak(substring);
                            i6 = i5;
                        }
                    }
                    if (af == 160) {
                        af = 32;
                    }
                    if (i8 == -1) {
                        if (!(this.am == null || i5 == -1)) {
                            i += this.am[(i5 << 8) + af];
                        }
                        int i9 = this.an[af];
                        int i10 = this.aa[af];
                        if (af == 32) {
                            if (ao > 0) {
                                ax += ao;
                                i += ax >> 8;
                                ax &= 255;
                            }
                            i6 = i;
                        } else if (ak >= 255) {
                            if (ai != -1) {
                                av(this.af[af], (this.ag[af] + i) + 1, (this.ay[af] + i3) + 1, i9, i10, ai, gfVar);
                            }
                            av(this.af[af], i + this.ag[af], i3 + this.ay[af], i9, i10, ah, gfVar);
                            i6 = i;
                        } else {
                            if (ai != -1) {
                                al(this.af[af], (this.ag[af] + i) + 1, (this.ay[af] + i3) + 1, i9, i10, ai, ak, gfVar);
                            }
                            al(this.af[af], i + this.ag[af], i3 + this.ay[af], i9, i10, ah, ak, gfVar);
                            i6 = i;
                        }
                        int i11 = this.ad[af];
                        if (at != -1) {
                            gfVar.aq(i6, i3 + ((int) (((double) this.as) * 0.7d)), i11, at, 68634231);
                        }
                        if (ab != -1) {
                            gfVar.aq(i6, (this.as + i3) + 1, i11, ab, -1750017139);
                        }
                        i = i6 + i11;
                        i6 = af;
                        i7 = i8;
                    } else {
                        i6 = i5;
                        i7 = i8;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
        }
    }

    void ct(String str, int i, int i2, gf gfVar) {
        int i3 = i2 - this.as;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (i4 < str.length()) {
            int i7;
            if (str.charAt(i4) == '\u0000') {
                i7 = i6;
                i6 = i5;
            } else {
                int af = (char) (jq.af(str.charAt(i4), 489363101) & 1458753283);
                if (af == '<') {
                    i6 = i5;
                    i7 = i4;
                } else {
                    int i8;
                    if (af != '>' || i6 == -1) {
                        i8 = i6;
                    } else {
                        String substring = str.substring(i6 + 1, i4);
                        i7 = -1;
                        if (substring.equals("lt")) {
                            af = '<';
                            i8 = -1;
                        } else if (substring.equals("gt")) {
                            af = 'ﲷ';
                            i8 = -1;
                        } else if (substring.startsWith("img=")) {
                            try {
                                gd gdVar = aq[ll.aa(substring.substring(4), 10, true, (byte) 40)];
                                gfVar.ao(gdVar, i, (this.as + i3) - gdVar.ar, (short) 16785);
                                i += gdVar.as;
                                i6 = -1;
                            } catch (Exception e) {
                                i6 = i5;
                            }
                        } else {
                            ak(substring);
                            i6 = i5;
                        }
                    }
                    if (af == 1800087200) {
                        af = 1427144058;
                    }
                    if (i8 == -1) {
                        if (!(this.am == null || i5 == -1)) {
                            i += this.am[(i5 << 8) + af];
                        }
                        int i9 = this.an[af];
                        int i10 = this.aa[af];
                        if (af == 721206626) {
                            if (ao > 0) {
                                ax += ao;
                                i += ax >> 8;
                                ax &= 1441869259;
                            }
                            i6 = i;
                        } else if (ak >= -2006813717) {
                            if (ai != -1) {
                                av(this.af[af], (this.ag[af] + i) + 1, (this.ay[af] + i3) + 1, i9, i10, ai, gfVar);
                            }
                            av(this.af[af], i + this.ag[af], i3 + this.ay[af], i9, i10, ah, gfVar);
                            i6 = i;
                        } else {
                            if (ai != -1) {
                                al(this.af[af], (this.ag[af] + i) + 1, (this.ay[af] + i3) + 1, i9, i10, ai, ak, gfVar);
                            }
                            al(this.af[af], i + this.ag[af], i3 + this.ay[af], i9, i10, ah, ak, gfVar);
                            i6 = i;
                        }
                        int i11 = this.ad[af];
                        if (at != -1) {
                            gfVar.aq(i6, i3 + ((int) (((double) this.as) * 0.7d)), i11, at, -1556709840);
                        }
                        if (ab != -1) {
                            gfVar.aq(i6, (this.as + i3) + 1, i11, ab, -1108544221);
                        }
                        i = i6 + i11;
                        i6 = af;
                        i7 = i8;
                    } else {
                        i6 = i5;
                        i7 = i8;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
        }
    }

    void au(String str, int i, int i2, int[] iArr, int[] iArr2, gf gfVar) {
        int i3 = i2 - this.as;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i4 < str.length()) {
            int i8;
            if (str.charAt(i4) == '\u0000') {
                i8 = i7;
                i7 = i6;
                i6 = i5;
            } else {
                int af = (char) (jq.af(str.charAt(i4), -933025094) & 255);
                if (af == '<') {
                    i7 = i6;
                    i8 = i4;
                    i6 = i5;
                } else {
                    int i9;
                    int i10;
                    if (af != '>' || i7 == -1) {
                        i9 = i7;
                    } else {
                        String substring = str.substring(i7 + 1, i4);
                        i8 = -1;
                        if (substring.equals("lt")) {
                            af = '<';
                            i9 = -1;
                        } else if (substring.equals("gt")) {
                            af = '>';
                            i9 = -1;
                        } else if (substring.startsWith("img=")) {
                            if (iArr != null) {
                                try {
                                    i10 = iArr[i5];
                                } catch (Exception e) {
                                    i7 = i6;
                                    i6 = i5;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (iArr2 != null) {
                                i7 = iArr2[i5];
                            } else {
                                i7 = 0;
                            }
                            i5++;
                            gd gdVar = aq[ll.aa(substring.substring(4), 10, true, (byte) 92)];
                            gfVar.ao(gdVar, i10 + i, i7 + ((this.as + i3) - gdVar.ar), (short) 18496);
                            i += gdVar.as;
                            i7 = -1;
                            i6 = i5;
                        } else {
                            ak(substring);
                            i7 = i6;
                            i6 = i5;
                        }
                    }
                    if (af == 160) {
                        af = 32;
                    }
                    if (i9 == -1) {
                        int i11;
                        int i12;
                        if (!(this.am == null || i6 == -1)) {
                            i += this.am[(i6 << 8) + af];
                        }
                        i10 = this.an[af];
                        int i13 = this.aa[af];
                        if (iArr != null) {
                            i11 = iArr[i5];
                        } else {
                            i11 = 0;
                        }
                        if (iArr2 != null) {
                            i12 = iArr2[i5];
                        } else {
                            i12 = 0;
                        }
                        int i14 = i5 + 1;
                        if (af == 32) {
                            if (ao > 0) {
                                ax += ao;
                                i += ax >> 8;
                                ax &= 255;
                            }
                            i6 = i;
                        } else if (ak >= 255) {
                            if (ai != -1) {
                                av(this.af[af], ((this.ag[af] + i) + 1) + i11, ((this.ay[af] + i3) + 1) + i12, i10, i13, ai, gfVar);
                            }
                            av(this.af[af], (this.ag[af] + i) + i11, (this.ay[af] + i3) + i12, i10, i13, ah, gfVar);
                            i6 = i;
                        } else {
                            if (ai != -1) {
                                al(this.af[af], ((this.ag[af] + i) + 1) + i11, ((this.ay[af] + i3) + 1) + i12, i10, i13, ai, ak, gfVar);
                            }
                            al(this.af[af], (this.ag[af] + i) + i11, (this.ay[af] + i3) + i12, i10, i13, ah, ak, gfVar);
                            i6 = i;
                        }
                        i8 = this.ad[af];
                        if (at != -1) {
                            gfVar.aq(i6, i3 + ((int) (((double) this.as) * 0.7d)), i8, at, -1190610657);
                        }
                        if (ab != -1) {
                            gfVar.aq(i6, i3 + this.as, i8, ab, -1724053978);
                        }
                        i = i6 + i8;
                        i6 = i14;
                        i7 = af;
                        i8 = i9;
                    } else {
                        i7 = i6;
                        i8 = i9;
                        i6 = i5;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
            i7 = i8;
        }
    }

    void cb(String str, int i, int i2, int[] iArr, int[] iArr2, gf gfVar) {
        int i3 = i2 - this.as;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i4 < str.length()) {
            int i8;
            if (str.charAt(i4) == '\u0000') {
                i8 = i7;
                i7 = i6;
                i6 = i5;
            } else {
                int af = (char) (jq.af(str.charAt(i4), -903469494) & 255);
                if (af == '諏') {
                    i7 = i6;
                    i8 = i4;
                    i6 = i5;
                } else {
                    int i9;
                    int i10;
                    if (af != '┖' || i7 == -1) {
                        i9 = i7;
                    } else {
                        String substring = str.substring(i7 + 1, i4);
                        i8 = -1;
                        if (substring.equals("lt")) {
                            af = 'െ';
                            i9 = -1;
                        } else if (substring.equals("gt")) {
                            af = '韝';
                            i9 = -1;
                        } else if (substring.startsWith("img=")) {
                            if (iArr != null) {
                                try {
                                    i10 = iArr[i5];
                                } catch (Exception e) {
                                    i7 = i6;
                                    i6 = i5;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (iArr2 != null) {
                                i7 = iArr2[i5];
                            } else {
                                i7 = 0;
                            }
                            i5++;
                            gd gdVar = aq[ll.aa(substring.substring(4), 10, true, (byte) 41)];
                            gfVar.ao(gdVar, i10 + i, i7 + ((this.as + i3) - gdVar.ar), (short) 26644);
                            i += gdVar.as;
                            i7 = -1;
                            i6 = i5;
                        } else {
                            ak(substring);
                            i7 = i6;
                            i6 = i5;
                        }
                    }
                    if (af == 13682171) {
                        af = 504774807;
                    }
                    if (i9 == -1) {
                        int i11;
                        int i12;
                        if (!(this.am == null || i6 == -1)) {
                            i += this.am[(i6 << 8) + af];
                        }
                        i10 = this.an[af];
                        int i13 = this.aa[af];
                        if (iArr != null) {
                            i11 = iArr[i5];
                        } else {
                            i11 = 0;
                        }
                        if (iArr2 != null) {
                            i12 = iArr2[i5];
                        } else {
                            i12 = 0;
                        }
                        int i14 = i5 + 1;
                        if (af == -1296734297) {
                            if (ao > 0) {
                                ax += ao;
                                i += ax >> 8;
                                ax &= -1121329223;
                            }
                            i6 = i;
                        } else if (ak >= 255) {
                            if (ai != -1) {
                                av(this.af[af], ((this.ag[af] + i) + 1) + i11, ((this.ay[af] + i3) + 1) + i12, i10, i13, ai, gfVar);
                            }
                            av(this.af[af], (this.ag[af] + i) + i11, (this.ay[af] + i3) + i12, i10, i13, ah, gfVar);
                            i6 = i;
                        } else {
                            if (ai != -1) {
                                al(this.af[af], ((this.ag[af] + i) + 1) + i11, ((this.ay[af] + i3) + 1) + i12, i10, i13, ai, ak, gfVar);
                            }
                            al(this.af[af], (this.ag[af] + i) + i11, (this.ay[af] + i3) + i12, i10, i13, ah, ak, gfVar);
                            i6 = i;
                        }
                        i8 = this.ad[af];
                        if (at != -1) {
                            gfVar.aq(i6, i3 + ((int) (((double) this.as) * 0.7d)), i8, at, -1996850895);
                        }
                        if (ab != -1) {
                            gfVar.aq(i6, i3 + this.as, i8, ab, -26569331);
                        }
                        i = i6 + i8;
                        i6 = i14;
                        i7 = af;
                        i8 = i9;
                    } else {
                        i7 = i6;
                        i8 = i9;
                        i6 = i5;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
            i7 = i8;
        }
    }

    void cu(String str, int i, int i2, int[] iArr, int[] iArr2, gf gfVar) {
        int i3 = i2 - this.as;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i4 < str.length()) {
            int i8;
            if (str.charAt(i4) == '\u0000') {
                i8 = i7;
                i7 = i6;
                i6 = i5;
            } else {
                int af = (char) (jq.af(str.charAt(i4), -2098215372) & 255);
                if (af == '<') {
                    i7 = i6;
                    i8 = i4;
                    i6 = i5;
                } else {
                    int i9;
                    int i10;
                    if (af != '>' || i7 == -1) {
                        i9 = i7;
                    } else {
                        String substring = str.substring(i7 + 1, i4);
                        i8 = -1;
                        if (substring.equals("lt")) {
                            af = '<';
                            i9 = -1;
                        } else if (substring.equals("gt")) {
                            af = '>';
                            i9 = -1;
                        } else if (substring.startsWith("img=")) {
                            if (iArr != null) {
                                try {
                                    i10 = iArr[i5];
                                } catch (Exception e) {
                                    i7 = i6;
                                    i6 = i5;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (iArr2 != null) {
                                i7 = iArr2[i5];
                            } else {
                                i7 = 0;
                            }
                            i5++;
                            gd gdVar = aq[ll.aa(substring.substring(4), 10, true, (byte) -13)];
                            gfVar.ao(gdVar, i10 + i, i7 + ((this.as + i3) - gdVar.ar), (short) 2669);
                            i += gdVar.as;
                            i7 = -1;
                            i6 = i5;
                        } else {
                            ak(substring);
                            i7 = i6;
                            i6 = i5;
                        }
                    }
                    if (af == 160) {
                        af = 32;
                    }
                    if (i9 == -1) {
                        int i11;
                        int i12;
                        if (!(this.am == null || i6 == -1)) {
                            i += this.am[(i6 << 8) + af];
                        }
                        i10 = this.an[af];
                        int i13 = this.aa[af];
                        if (iArr != null) {
                            i11 = iArr[i5];
                        } else {
                            i11 = 0;
                        }
                        if (iArr2 != null) {
                            i12 = iArr2[i5];
                        } else {
                            i12 = 0;
                        }
                        int i14 = i5 + 1;
                        if (af == 32) {
                            if (ao > 0) {
                                ax += ao;
                                i += ax >> 8;
                                ax &= 255;
                            }
                            i6 = i;
                        } else if (ak >= 255) {
                            if (ai != -1) {
                                av(this.af[af], ((this.ag[af] + i) + 1) + i11, ((this.ay[af] + i3) + 1) + i12, i10, i13, ai, gfVar);
                            }
                            av(this.af[af], (this.ag[af] + i) + i11, (this.ay[af] + i3) + i12, i10, i13, ah, gfVar);
                            i6 = i;
                        } else {
                            if (ai != -1) {
                                al(this.af[af], ((this.ag[af] + i) + 1) + i11, ((this.ay[af] + i3) + 1) + i12, i10, i13, ai, ak, gfVar);
                            }
                            al(this.af[af], (this.ag[af] + i) + i11, (this.ay[af] + i3) + i12, i10, i13, ah, ak, gfVar);
                            i6 = i;
                        }
                        i8 = this.ad[af];
                        if (at != -1) {
                            gfVar.aq(i6, i3 + ((int) (((double) this.as) * 0.7d)), i8, at, -330562565);
                        }
                        if (ab != -1) {
                            gfVar.aq(i6, i3 + this.as, i8, ab, -171989675);
                        }
                        i = i6 + i8;
                        i6 = i14;
                        i7 = af;
                        i8 = i9;
                    } else {
                        i7 = i6;
                        i8 = i9;
                        i6 = i5;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
            i7 = i8;
        }
    }

    void dj(String str, int i, int i2, int[] iArr, int[] iArr2, gf gfVar) {
        int i3 = i2 - this.as;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i4 < str.length()) {
            int i8;
            if (str.charAt(i4) == '\u0000') {
                i8 = i7;
                i7 = i6;
                i6 = i5;
            } else {
                int af = (char) (jq.af(str.charAt(i4), -1011244889) & 1752381413);
                if (af == '<') {
                    i7 = i6;
                    i8 = i4;
                    i6 = i5;
                } else {
                    int i9;
                    int i10;
                    if (af != '໮' || i7 == -1) {
                        i9 = i7;
                    } else {
                        String substring = str.substring(i7 + 1, i4);
                        i8 = -1;
                        if (substring.equals("lt")) {
                            af = '芀';
                            i9 = -1;
                        } else if (substring.equals("gt")) {
                            af = '>';
                            i9 = -1;
                        } else if (substring.startsWith("img=")) {
                            if (iArr != null) {
                                try {
                                    i10 = iArr[i5];
                                } catch (Exception e) {
                                    i7 = i6;
                                    i6 = i5;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (iArr2 != null) {
                                i7 = iArr2[i5];
                            } else {
                                i7 = 0;
                            }
                            i5++;
                            gd gdVar = aq[ll.aa(substring.substring(4), 10, true, (byte) 40)];
                            gfVar.ao(gdVar, i10 + i, i7 + ((this.as + i3) - gdVar.ar), (short) 27941);
                            i += gdVar.as;
                            i7 = -1;
                            i6 = i5;
                        } else {
                            ak(substring);
                            i7 = i6;
                            i6 = i5;
                        }
                    }
                    if (af == 443604646) {
                        af = 237089839;
                    }
                    if (i9 == -1) {
                        int i11;
                        int i12;
                        if (!(this.am == null || i6 == -1)) {
                            i += this.am[(i6 << 8) + af];
                        }
                        i10 = this.an[af];
                        int i13 = this.aa[af];
                        if (iArr != null) {
                            i11 = iArr[i5];
                        } else {
                            i11 = 0;
                        }
                        if (iArr2 != null) {
                            i12 = iArr2[i5];
                        } else {
                            i12 = 0;
                        }
                        int i14 = i5 + 1;
                        if (af == -1789329452) {
                            if (ao > 0) {
                                ax += ao;
                                i += ax >> 8;
                                ax &= 255;
                            }
                            i6 = i;
                        } else if (ak >= 255) {
                            if (ai != -1) {
                                av(this.af[af], ((this.ag[af] + i) + 1) + i11, ((this.ay[af] + i3) + 1) + i12, i10, i13, ai, gfVar);
                            }
                            av(this.af[af], (this.ag[af] + i) + i11, (this.ay[af] + i3) + i12, i10, i13, ah, gfVar);
                            i6 = i;
                        } else {
                            if (ai != -1) {
                                al(this.af[af], ((this.ag[af] + i) + 1) + i11, ((this.ay[af] + i3) + 1) + i12, i10, i13, ai, ak, gfVar);
                            }
                            al(this.af[af], (this.ag[af] + i) + i11, (this.ay[af] + i3) + i12, i10, i13, ah, ak, gfVar);
                            i6 = i;
                        }
                        i8 = this.ad[af];
                        if (at != -1) {
                            gfVar.aq(i6, i3 + ((int) (((double) this.as) * 0.7d)), i8, at, -1503195961);
                        }
                        if (ab != -1) {
                            gfVar.aq(i6, i3 + this.as, i8, ab, 212794194);
                        }
                        i = i6 + i8;
                        i6 = i14;
                        i7 = af;
                        i8 = i9;
                    } else {
                        i7 = i6;
                        i8 = i9;
                        i6 = i5;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
            i7 = i8;
        }
    }

    void av(byte[] bArr, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i + ((gfVar.ad * -481290979) * i2);
        int i11 = (gfVar.ad * -481290979) - i3;
        int i12 = 0;
        if (i2 < gfVar.aa * -12571459) {
            int i13 = (gfVar.aa * -12571459) - i2;
            i4 -= i13;
            i2 = gfVar.aa * -12571459;
            i12 = 0 + (i13 * i3);
            i10 += i13 * (gfVar.ad * -481290979);
        }
        if (i2 + i4 > gfVar.ag * -467581477) {
            i6 = i4 - ((i2 + i4) - (gfVar.ag * -467581477));
        } else {
            i6 = i4;
        }
        if (i < gfVar.ay * 1829547545) {
            int i14 = (gfVar.ay * 1829547545) - i;
            i3 -= i14;
            i = gfVar.ay * 1829547545;
            i13 = i12 + i14;
            i7 = i10 + i14;
            i12 = 0 + i14;
            i10 = i11 + i14;
        } else {
            i13 = i12;
            i7 = i10;
            i10 = i11;
            i12 = 0;
        }
        if (i + i3 > gfVar.as * 2074797577) {
            int i15 = (i + i3) - (gfVar.as * 2074797577);
            i14 = i3 - i15;
            i8 = i12 + i15;
            i9 = i10 + i15;
        } else {
            i8 = i12;
            i9 = i10;
            i14 = i3;
        }
        if (i14 > 0 && i6 > 0) {
            ac(gfVar.af, bArr, i5, i13, i7, i14, i6, i9, i8);
        }
    }

    void dc(byte[] bArr, int i, int i2, int i3, int i4, int i5, gf gfVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i + ((gfVar.ad * -481290979) * i2);
        int i11 = (gfVar.ad * -481290979) - i3;
        int i12 = 0;
        if (i2 < gfVar.aa * -12571459) {
            int i13 = (gfVar.aa * -12571459) - i2;
            i4 -= i13;
            i2 = gfVar.aa * -12571459;
            i12 = 0 + (i13 * i3);
            i10 += i13 * (gfVar.ad * -481290979);
        }
        if (i2 + i4 > gfVar.ag * -467581477) {
            i6 = i4 - ((i2 + i4) - (gfVar.ag * -467581477));
        } else {
            i6 = i4;
        }
        if (i < gfVar.ay * 1829547545) {
            int i14 = (gfVar.ay * 1829547545) - i;
            i3 -= i14;
            i = gfVar.ay * 1829547545;
            i13 = i12 + i14;
            i7 = i10 + i14;
            i12 = 0 + i14;
            i10 = i11 + i14;
        } else {
            i13 = i12;
            i7 = i10;
            i10 = i11;
            i12 = 0;
        }
        if (i + i3 > gfVar.as * 2074797577) {
            int i15 = (i + i3) - (gfVar.as * 2074797577);
            i14 = i3 - i15;
            i8 = i12 + i15;
            i9 = i10 + i15;
        } else {
            i8 = i12;
            i9 = i10;
            i14 = i3;
        }
        if (i14 > 0 && i6 > 0) {
            ac(gfVar.af, bArr, i5, i13, i7, i14, i6, i9, i8);
        }
    }

    void ac(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i | -16777216;
        int i11 = -i5;
        int i12 = i3;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i8;
            while (i14 < 0) {
                int i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i12 + 1;
                    iArr[i12] = i10;
                } else {
                    i13 = i12 + 1;
                }
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                int i17 = i16 + 1;
                if (bArr[i16] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i15 = i17 + 1;
                if (bArr[i17] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i14++;
                i12 = i13;
                i13 = i15;
            }
            i14 = i12;
            i12 = i9;
            while (i12 < 0) {
                i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i10;
                } else {
                    i13 = i14 + 1;
                }
                i12++;
                i14 = i13;
                i13 = i15;
            }
            i12 = i14 + i6;
            i11++;
            i13 += i7;
        }
    }

    void dk(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i | -16777216;
        int i11 = -i5;
        int i12 = i3;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i8;
            while (i14 < 0) {
                int i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i12 + 1;
                    iArr[i12] = i10;
                } else {
                    i13 = i12 + 1;
                }
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                int i17 = i16 + 1;
                if (bArr[i16] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i15 = i17 + 1;
                if (bArr[i17] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i14++;
                i12 = i13;
                i13 = i15;
            }
            i14 = i12;
            i12 = i9;
            while (i12 < 0) {
                i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i10;
                } else {
                    i13 = i14 + 1;
                }
                i12++;
                i14 = i13;
                i13 = i15;
            }
            i12 = i14 + i6;
            i11++;
            i13 += i7;
        }
    }

    void m21do(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i | -16777216;
        int i11 = -i5;
        int i12 = i3;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i8;
            while (i14 < 0) {
                int i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i12 + 1;
                    iArr[i12] = i10;
                } else {
                    i13 = i12 + 1;
                }
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                int i17 = i16 + 1;
                if (bArr[i16] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i15 = i17 + 1;
                if (bArr[i17] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i14++;
                i12 = i13;
                i13 = i15;
            }
            i14 = i12;
            i12 = i9;
            while (i12 < 0) {
                i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i10;
                } else {
                    i13 = i14 + 1;
                }
                i12++;
                i14 = i13;
                i13 = i15;
            }
            i12 = i14 + i6;
            i11++;
            i13 += i7;
        }
    }

    void al(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, gf gfVar) {
        if (i6 >= 255) {
            av(bArr, i, i2, i3, i4, i5, gfVar);
            return;
        }
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i + ((gfVar.ad * -481290979) * i2);
        int i12 = (gfVar.ad * -481290979) - i3;
        int i13 = 0;
        if (i2 < gfVar.aa * -12571459) {
            int i14 = (gfVar.aa * -12571459) - i2;
            i4 -= i14;
            i2 = gfVar.aa * -12571459;
            i13 = 0 + (i14 * i3);
            i11 += i14 * (gfVar.ad * -481290979);
        }
        if (i2 + i4 > gfVar.ag * -467581477) {
            i7 = i4 - ((i2 + i4) - (gfVar.ag * -467581477));
        } else {
            i7 = i4;
        }
        if (i < gfVar.ay * 1829547545) {
            int i15 = (gfVar.ay * 1829547545) - i;
            i3 -= i15;
            i = gfVar.ay * 1829547545;
            i14 = i13 + i15;
            i8 = i11 + i15;
            i13 = 0 + i15;
            i11 = i12 + i15;
        } else {
            i14 = i13;
            i8 = i11;
            i11 = i12;
            i13 = 0;
        }
        if (i + i3 > gfVar.as * 2074797577) {
            int i16 = (i + i3) - (gfVar.as * 2074797577);
            i15 = i3 - i16;
            i9 = i13 + i16;
            i10 = i11 + i16;
        } else {
            i9 = i13;
            i10 = i11;
            i15 = i3;
        }
        if (i15 > 0 && i7 > 0) {
            ap(gfVar.af, bArr, i5, i14, i8, i15, i7, i10, i9, i6);
        }
    }

    void dt(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, gf gfVar) {
        if (i6 >= 1115387356) {
            av(bArr, i, i2, i3, i4, i5, gfVar);
            return;
        }
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i + ((gfVar.ad * 1938699096) * i2);
        int i12 = (gfVar.ad * -481290979) - i3;
        int i13 = 0;
        if (i2 < gfVar.aa * -1603039142) {
            int i14 = (gfVar.aa * -12571459) - i2;
            i4 -= i14;
            i2 = gfVar.aa * -1611410524;
            i13 = 0 + (i14 * i3);
            i11 += i14 * (gfVar.ad * -481290979);
        }
        if (i2 + i4 > gfVar.ag * -467581477) {
            i7 = i4 - ((i2 + i4) - (gfVar.ag * -1784429590));
        } else {
            i7 = i4;
        }
        if (i < gfVar.ay * 1829547545) {
            int i15 = (gfVar.ay * 1829547545) - i;
            i3 -= i15;
            i = gfVar.ay * 1829547545;
            i14 = i13 + i15;
            i8 = i11 + i15;
            i13 = 0 + i15;
            i11 = i12 + i15;
        } else {
            i14 = i13;
            i8 = i11;
            i11 = i12;
            i13 = 0;
        }
        if (i + i3 > gfVar.as * 73943668) {
            int i16 = (i + i3) - (gfVar.as * 768018127);
            i15 = i3 - i16;
            i9 = i13 + i16;
            i10 = i11 + i16;
        } else {
            i9 = i13;
            i10 = i11;
            i15 = i3;
        }
        if (i15 > 0 && i7 > 0) {
            ap(gfVar.af, bArr, i5, i14, i8, i15, i7, i10, i9, i6);
        }
    }

    void ap(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i8 << 24) | i;
        int i10 = ((((16711935 & i) * i8) & -16711936) + (((65280 & i) * i8) & 16711680)) >> 8;
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    int i17 = iArr[i13];
                    if (i17 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = i9;
                    } else {
                        int max = Math.max(i17 >>> 24, i8);
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 65280) * i11) & 16711680) + (((16711935 & i17) * i11) & -16711936)) >> 8) + i10) | (max << 24);
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }

    void dd(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i8 << 24) | i;
        int i10 = ((((-639102860 & i) * i8) & -1364405993) + (((1108431110 & i) * i8) & 16711680)) >> 8;
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    int i17 = iArr[i13];
                    if (i17 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = i9;
                    } else {
                        int max = Math.max(i17 >>> 24, i8);
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 407928741) * i11) & 1226805679) + (((-1284098142 & i17) * i11) & -1222593977)) >> 8) + i10) | (max << 24);
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }

    void di(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i8 << 24) | i;
        int i10 = ((((967618857 & i) * i8) & -1444918555) + (((-402018097 & i) * i8) & 130767799)) >> 8;
        int i11 = -2108804468 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    int i17 = iArr[i13];
                    if (i17 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = i9;
                    } else {
                        int max = Math.max(i17 >>> 24, i8);
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 72660330) * i11) & -291916663) + (((16711935 & i17) * i11) & -16711936)) >> 8) + i10) | (max << 24);
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }

    void dl(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i8 << 24) | i;
        int i10 = ((((-801218790 & i) * i8) & -16711936) + (((65280 & i) * i8) & 16711680)) >> 8;
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    int i17 = iArr[i13];
                    if (i17 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = i9;
                    } else {
                        int max = Math.max(i17 >>> 24, i8);
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 65280) * i11) & 867117794) + (((1023673989 & i17) * i11) & -16711936)) >> 8) + i10) | (max << 24);
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }

    void dv(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i8 << 24) | i;
        int i10 = ((((16711935 & i) * i8) & -16711936) + (((65280 & i) * i8) & 16711680)) >> 8;
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    int i17 = iArr[i13];
                    if (i17 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = i9;
                    } else {
                        int max = Math.max(i17 >>> 24, i8);
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 65280) * i11) & 16711680) + (((16711935 & i17) * i11) & -16711936)) >> 8) + i10) | (max << 24);
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }

    void dz(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i8 << 24) | i;
        int i10 = ((((16711935 & i) * i8) & -16711936) + (((65280 & i) * i8) & 16711680)) >> 8;
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    int i17 = iArr[i13];
                    if (i17 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = i9;
                    } else {
                        int max = Math.max(i17 >>> 24, i8);
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 65280) * i11) & 16711680) + (((16711935 & i17) * i11) & -16711936)) >> 8) + i10) | (max << 24);
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }
}
