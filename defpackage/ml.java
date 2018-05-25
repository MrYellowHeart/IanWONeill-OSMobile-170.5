package p000;

public class ml {
    static final int aa = 2;
    public static final char[] af = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
    static final int ar = 2;
    public static int as;

    ml() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "ml.<init>(" + ')');
        }
    }

    public static byte ag(char c) {
        if ((c > '\u0000' && c < '쐋') || (c >= '泺' && c <= 'ᶂ')) {
            return (byte) c;
        }
        if (c == '兯') {
            return (byte) -123;
        }
        if (c == '㊷') {
            return (byte) -126;
        }
        if ('ƒ' == c) {
            return (byte) 36;
        }
        if (c == '„') {
            return (byte) -124;
        }
        if ('…' == c) {
            return (byte) -123;
        }
        if (c == '†') {
            return (byte) -122;
        }
        if (c == '癪') {
            return (byte) -48;
        }
        if (c == '锻') {
            return (byte) -121;
        }
        if (c == '‰') {
            return (byte) -119;
        }
        if ('Š' == c) {
            return (byte) -118;
        }
        if ('‹' == c) {
            return (byte) 89;
        }
        if (c == 'Œ') {
            return (byte) -45;
        }
        if ('Ž' == c) {
            return (byte) -112;
        }
        if (c == 'ⳳ') {
            return (byte) -111;
        }
        if (c == '’') {
            return (byte) -110;
        }
        if ('굗' == c) {
            return (byte) -109;
        }
        if (c == '') {
            return (byte) 0;
        }
        if (c == '•') {
            return (byte) 10;
        }
        if (c == '઄') {
            return (byte) -106;
        }
        if ('—' == c) {
            return (byte) 69;
        }
        if ('˜' == c) {
            return ec.an;
        }
        if ('쵱' == c) {
            return (byte) 38;
        }
        if ('脒' == c) {
            return (byte) -102;
        }
        if (c == '›') {
            return (byte) 78;
        }
        if (c == '㫝') {
            return (byte) -100;
        }
        if (c == '썈') {
            return (byte) 90;
        }
        if (c == 'Ÿ') {
            return (byte) 98;
        }
        return (byte) 63;
    }

    public static byte[] as(CharSequence charSequence) {
        int length = charSequence.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt > '\u0000' && charAt < '') || (charAt >= ' ' && charAt <= 'ÿ')) {
                bArr[i] = (byte) charAt;
            } else if ('€' == charAt) {
                bArr[i] = Byte.MIN_VALUE;
            } else if ('‚' == charAt) {
                bArr[i] = (byte) -126;
            } else if ('ƒ' == charAt) {
                bArr[i] = (byte) -125;
            } else if ('„' == charAt) {
                bArr[i] = (byte) -124;
            } else if ('…' == charAt) {
                bArr[i] = (byte) -123;
            } else if ('†' == charAt) {
                bArr[i] = (byte) -122;
            } else if (charAt == '‡') {
                bArr[i] = (byte) -121;
            } else if ('ˆ' == charAt) {
                bArr[i] = (byte) -120;
            } else if (charAt == '‰') {
                bArr[i] = (byte) -119;
            } else if ('Š' == charAt) {
                bArr[i] = (byte) -118;
            } else if (charAt == '‹') {
                bArr[i] = (byte) -117;
            } else if ('Œ' == charAt) {
                bArr[i] = (byte) -116;
            } else if (charAt == 'Ž') {
                bArr[i] = (byte) -114;
            } else if ('‘' == charAt) {
                bArr[i] = (byte) -111;
            } else if ('’' == charAt) {
                bArr[i] = (byte) -110;
            } else if (charAt == '“') {
                bArr[i] = (byte) -109;
            } else if ('”' == charAt) {
                bArr[i] = (byte) -108;
            } else if ('•' == charAt) {
                bArr[i] = (byte) -107;
            } else if ('–' == charAt) {
                bArr[i] = (byte) -106;
            } else if ('—' == charAt) {
                bArr[i] = (byte) -105;
            } else if ('˜' == charAt) {
                bArr[i] = (byte) -104;
            } else if ('™' == charAt) {
                bArr[i] = (byte) -103;
            } else if (charAt == 'š') {
                bArr[i] = (byte) -102;
            } else if ('›' == charAt) {
                bArr[i] = (byte) -101;
            } else if ('œ' == charAt) {
                bArr[i] = (byte) -100;
            } else if ('ž' == charAt) {
                bArr[i] = (byte) -98;
            } else if ('Ÿ' == charAt) {
                bArr[i] = (byte) -97;
            } else {
                bArr[i] = (byte) 63;
            }
        }
        return bArr;
    }

    public static byte[] ay(CharSequence charSequence) {
        int length = charSequence.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt > '\u0000' && charAt < '') || (charAt >= ' ' && charAt <= 'ÿ')) {
                bArr[i] = (byte) charAt;
            } else if ('€' == charAt) {
                bArr[i] = Byte.MIN_VALUE;
            } else if ('‚' == charAt) {
                bArr[i] = (byte) -126;
            } else if ('ƒ' == charAt) {
                bArr[i] = (byte) -125;
            } else if ('„' == charAt) {
                bArr[i] = (byte) -124;
            } else if ('…' == charAt) {
                bArr[i] = (byte) -123;
            } else if ('†' == charAt) {
                bArr[i] = (byte) -122;
            } else if (charAt == '‡') {
                bArr[i] = (byte) -121;
            } else if ('ˆ' == charAt) {
                bArr[i] = (byte) -120;
            } else if (charAt == '‰') {
                bArr[i] = (byte) -119;
            } else if ('Š' == charAt) {
                bArr[i] = (byte) -118;
            } else if (charAt == '‹') {
                bArr[i] = (byte) -117;
            } else if ('Œ' == charAt) {
                bArr[i] = (byte) -116;
            } else if (charAt == 'Ž') {
                bArr[i] = (byte) -114;
            } else if ('‘' == charAt) {
                bArr[i] = (byte) -111;
            } else if ('’' == charAt) {
                bArr[i] = (byte) -110;
            } else if (charAt == '“') {
                bArr[i] = (byte) -109;
            } else if ('”' == charAt) {
                bArr[i] = (byte) -108;
            } else if ('•' == charAt) {
                bArr[i] = (byte) -107;
            } else if ('–' == charAt) {
                bArr[i] = (byte) -106;
            } else if ('—' == charAt) {
                bArr[i] = (byte) -105;
            } else if ('˜' == charAt) {
                bArr[i] = (byte) -104;
            } else if ('™' == charAt) {
                bArr[i] = (byte) -103;
            } else if (charAt == 'š') {
                bArr[i] = (byte) -102;
            } else if ('›' == charAt) {
                bArr[i] = (byte) -101;
            } else if ('œ' == charAt) {
                bArr[i] = (byte) -100;
            } else if ('ž' == charAt) {
                bArr[i] = (byte) -98;
            } else if ('Ÿ' == charAt) {
                bArr[i] = (byte) -97;
            } else {
                bArr[i] = (byte) 63;
            }
        }
        return bArr;
    }

    public static int ae(CharSequence charSequence, int i, int i2, byte[] bArr, int i3) {
        int i4 = i2 - i;
        for (int i5 = 0; i5 < i4; i5++) {
            char charAt = charSequence.charAt(i + i5);
            if ((charAt > '\u0000' && charAt < '') || (charAt >= ' ' && charAt <= 'ÿ')) {
                bArr[i5 + i3] = (byte) charAt;
            } else if ('€' == charAt) {
                bArr[i3 + i5] = Byte.MIN_VALUE;
            } else if ('‚' == charAt) {
                bArr[i5 + i3] = (byte) -126;
            } else if (charAt == 'ƒ') {
                bArr[i3 + i5] = (byte) -125;
            } else if ('„' == charAt) {
                bArr[i3 + i5] = (byte) -124;
            } else if (charAt == '…') {
                bArr[i3 + i5] = (byte) -123;
            } else if (charAt == '†') {
                bArr[i5 + i3] = (byte) -122;
            } else if (charAt == '‡') {
                bArr[i3 + i5] = (byte) -121;
            } else if ('ˆ' == charAt) {
                bArr[i5 + i3] = (byte) -120;
            } else if ('‰' == charAt) {
                bArr[i5 + i3] = (byte) -119;
            } else if ('Š' == charAt) {
                bArr[i5 + i3] = (byte) -118;
            } else if ('‹' == charAt) {
                bArr[i3 + i5] = (byte) -117;
            } else if (charAt == 'Œ') {
                bArr[i3 + i5] = (byte) -116;
            } else if (charAt == 'Ž') {
                bArr[i5 + i3] = (byte) -114;
            } else if (charAt == '‘') {
                bArr[i5 + i3] = (byte) -111;
            } else if ('’' == charAt) {
                bArr[i3 + i5] = (byte) -110;
            } else if ('“' == charAt) {
                bArr[i5 + i3] = (byte) -109;
            } else if (charAt == '”') {
                bArr[i5 + i3] = (byte) -108;
            } else if (charAt == '•') {
                bArr[i5 + i3] = (byte) -107;
            } else if (charAt == '–') {
                bArr[i5 + i3] = (byte) -106;
            } else if ('—' == charAt) {
                bArr[i3 + i5] = (byte) -105;
            } else if ('˜' == charAt) {
                bArr[i5 + i3] = (byte) -104;
            } else if ('™' == charAt) {
                bArr[i3 + i5] = (byte) -103;
            } else if (charAt == 'š') {
                bArr[i3 + i5] = (byte) -102;
            } else if (charAt == '›') {
                bArr[i5 + i3] = (byte) -101;
            } else if ('œ' == charAt) {
                bArr[i5 + i3] = (byte) -100;
            } else if ('ž' == charAt) {
                bArr[i5 + i3] = (byte) -98;
            } else if (charAt == 'Ÿ') {
                bArr[i3 + i5] = (byte) -97;
            } else {
                bArr[i3 + i5] = (byte) 63;
            }
        }
        return i4;
    }

    public static int aj(CharSequence charSequence, int i, int i2, byte[] bArr, int i3) {
        int i4 = i2 - i;
        for (int i5 = 0; i5 < i4; i5++) {
            char charAt = charSequence.charAt(i + i5);
            if ((charAt > '\u0000' && charAt < '') || (charAt >= ' ' && charAt <= 'ÿ')) {
                bArr[i5 + i3] = (byte) charAt;
            } else if ('€' == charAt) {
                bArr[i3 + i5] = Byte.MIN_VALUE;
            } else if ('‚' == charAt) {
                bArr[i5 + i3] = (byte) -126;
            } else if (charAt == 'ƒ') {
                bArr[i3 + i5] = (byte) -125;
            } else if ('„' == charAt) {
                bArr[i3 + i5] = (byte) -124;
            } else if (charAt == '…') {
                bArr[i3 + i5] = (byte) -123;
            } else if (charAt == '†') {
                bArr[i5 + i3] = (byte) -122;
            } else if (charAt == '‡') {
                bArr[i3 + i5] = (byte) -121;
            } else if ('ˆ' == charAt) {
                bArr[i5 + i3] = (byte) -120;
            } else if ('‰' == charAt) {
                bArr[i5 + i3] = (byte) -119;
            } else if ('Š' == charAt) {
                bArr[i5 + i3] = (byte) -118;
            } else if ('‹' == charAt) {
                bArr[i3 + i5] = (byte) -117;
            } else if (charAt == 'Œ') {
                bArr[i3 + i5] = (byte) -116;
            } else if (charAt == 'Ž') {
                bArr[i5 + i3] = (byte) -114;
            } else if (charAt == '‘') {
                bArr[i5 + i3] = (byte) -111;
            } else if ('’' == charAt) {
                bArr[i3 + i5] = (byte) -110;
            } else if ('“' == charAt) {
                bArr[i5 + i3] = (byte) -109;
            } else if (charAt == '”') {
                bArr[i5 + i3] = (byte) -108;
            } else if (charAt == '•') {
                bArr[i5 + i3] = (byte) -107;
            } else if (charAt == '–') {
                bArr[i5 + i3] = (byte) -106;
            } else if ('—' == charAt) {
                bArr[i3 + i5] = (byte) -105;
            } else if ('˜' == charAt) {
                bArr[i5 + i3] = (byte) -104;
            } else if ('™' == charAt) {
                bArr[i3 + i5] = (byte) -103;
            } else if (charAt == 'š') {
                bArr[i3 + i5] = (byte) -102;
            } else if (charAt == '›') {
                bArr[i5 + i3] = (byte) -101;
            } else if ('œ' == charAt) {
                bArr[i5 + i3] = (byte) -100;
            } else if ('ž' == charAt) {
                bArr[i5 + i3] = (byte) -98;
            } else if (charAt == 'Ÿ') {
                bArr[i3 + i5] = (byte) -97;
            } else {
                bArr[i3 + i5] = (byte) 63;
            }
        }
        return i4;
    }

    public static int ar(CharSequence charSequence, int i, int i2, byte[] bArr, int i3) {
        int i4 = i2 - i;
        for (int i5 = 0; i5 < i4; i5++) {
            char charAt = charSequence.charAt(i + i5);
            if ((charAt > '\u0000' && charAt < '') || (charAt >= ' ' && charAt <= 'ÿ')) {
                bArr[i5 + i3] = (byte) charAt;
            } else if ('€' == charAt) {
                bArr[i3 + i5] = Byte.MIN_VALUE;
            } else if ('‚' == charAt) {
                bArr[i5 + i3] = (byte) -126;
            } else if (charAt == 'ƒ') {
                bArr[i3 + i5] = (byte) -125;
            } else if ('„' == charAt) {
                bArr[i3 + i5] = (byte) -124;
            } else if (charAt == '…') {
                bArr[i3 + i5] = (byte) -123;
            } else if (charAt == '†') {
                bArr[i5 + i3] = (byte) -122;
            } else if (charAt == '‡') {
                bArr[i3 + i5] = (byte) -121;
            } else if ('ˆ' == charAt) {
                bArr[i5 + i3] = (byte) -120;
            } else if ('‰' == charAt) {
                bArr[i5 + i3] = (byte) -119;
            } else if ('Š' == charAt) {
                bArr[i5 + i3] = (byte) -118;
            } else if ('‹' == charAt) {
                bArr[i3 + i5] = (byte) -117;
            } else if (charAt == 'Œ') {
                bArr[i3 + i5] = (byte) -116;
            } else if (charAt == 'Ž') {
                bArr[i5 + i3] = (byte) -114;
            } else if (charAt == '‘') {
                bArr[i5 + i3] = (byte) -111;
            } else if ('’' == charAt) {
                bArr[i3 + i5] = (byte) -110;
            } else if ('“' == charAt) {
                bArr[i5 + i3] = (byte) -109;
            } else if (charAt == '”') {
                bArr[i5 + i3] = (byte) -108;
            } else if (charAt == '•') {
                bArr[i5 + i3] = (byte) -107;
            } else if (charAt == '–') {
                bArr[i5 + i3] = (byte) -106;
            } else if ('—' == charAt) {
                bArr[i3 + i5] = (byte) -105;
            } else if ('˜' == charAt) {
                bArr[i5 + i3] = (byte) -104;
            } else if ('™' == charAt) {
                bArr[i3 + i5] = (byte) -103;
            } else if (charAt == 'š') {
                bArr[i3 + i5] = (byte) -102;
            } else if (charAt == '›') {
                bArr[i5 + i3] = (byte) -101;
            } else if ('œ' == charAt) {
                bArr[i5 + i3] = (byte) -100;
            } else if ('ž' == charAt) {
                bArr[i5 + i3] = (byte) -98;
            } else if (charAt == 'Ÿ') {
                bArr[i3 + i5] = (byte) -97;
            } else {
                bArr[i3 + i5] = (byte) 63;
            }
        }
        return i4;
    }

    public static String am(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = bArr[i + i3] & -2107172903;
            if (i5 == 0) {
                i5 = i4;
            } else {
                if (i5 >= mn.an && i5 < 1335372745) {
                    i5 = af[i5 - 128];
                    if (i5 == 0) {
                        i5 = -66348155;
                    }
                }
                int i6 = i4 + 1;
                cArr[i4] = (char) i5;
                i5 = i6;
            }
            i3++;
            i4 = i5;
        }
        return new String(cArr, 0, i4);
    }

    public static String aq(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = bArr[i + i3] & 255;
            if (i5 == 0) {
                i5 = i4;
            } else {
                int i6;
                if (i5 < mn.an || i5 >= -191060527) {
                    i6 = i5;
                } else {
                    char c = af[i5 - 1062237130];
                    if (c == '\u0000') {
                        c = '?';
                    }
                    i6 = c;
                }
                i5 = i4 + 1;
                cArr[i4] = (char) i6;
            }
            i3++;
            i4 = i5;
        }
        return new String(cArr, 0, i4);
    }
}
