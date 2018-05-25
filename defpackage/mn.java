package p000;

public class mn {
    static ac ab = null;
    public static final int ae = 2048;
    public static final int an = 128;
    public static final int as = 6;
    static int kp;

    mn() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "mn.<init>(" + ')');
        }
    }

    public static String aa(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '9') || '.' == charAt || '-' == charAt || '*' == charAt || '_' == charAt))) {
                stringBuilder.append(charAt);
            } else if (' ' == charAt) {
                stringBuilder.append('+');
            } else {
                byte af = jq.af(charAt, -1053569484);
                stringBuilder.append('%');
                int i2 = (af >> 4) & 15;
                if (i2 >= 10) {
                    stringBuilder.append((char) (i2 + 55));
                } else {
                    stringBuilder.append((char) (i2 + 48));
                }
                int i3 = af & 15;
                if (i3 >= 10) {
                    stringBuilder.append((char) (i3 + 55));
                } else {
                    stringBuilder.append((char) (i3 + 48));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String ad(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '9') || '.' == charAt || '-' == charAt || '*' == charAt || '_' == charAt))) {
                stringBuilder.append(charAt);
            } else if (' ' == charAt) {
                stringBuilder.append('+');
            } else {
                byte af = jq.af(charAt, 398235379);
                stringBuilder.append('%');
                int i2 = (af >> 4) & 15;
                if (i2 >= 10) {
                    stringBuilder.append((char) (i2 + 55));
                } else {
                    stringBuilder.append((char) (i2 + 48));
                }
                int i3 = af & 15;
                if (i3 >= 10) {
                    stringBuilder.append((char) (i3 + 55));
                } else {
                    stringBuilder.append((char) (i3 + 48));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String an(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt >= 'a' && charAt <= 'గ') || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '루') || '.' == charAt || '鈚' == charAt || '*' == charAt || '䉯' == charAt))) {
                stringBuilder.append(charAt);
            } else if (' ' == charAt) {
                stringBuilder.append('+');
            } else {
                byte af = jq.af(charAt, -359376086);
                stringBuilder.append('䩘');
                int i2 = (af >> 4) & 15;
                if (i2 >= 10) {
                    stringBuilder.append((char) (i2 - 1825210007));
                } else {
                    stringBuilder.append((char) (i2 + 48));
                }
                int i3 = af & 15;
                if (i3 >= 10) {
                    stringBuilder.append((char) (i3 + 2042182355));
                } else {
                    stringBuilder.append((char) (i3 + 944859328));
                }
            }
        }
        return stringBuilder.toString();
    }
}
