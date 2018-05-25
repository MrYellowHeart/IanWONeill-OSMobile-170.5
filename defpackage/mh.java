package p000;

public final class mh {
    static final char[] af = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final int aj = 76;

    mh() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "mh.<init>(" + ')');
        }
    }

    public static String aa(long j) {
        if (j <= 0 || j >= 6582952005840035281L) {
            return null;
        }
        if (0 == j % 37) {
            return null;
        }
        long j2;
        int i = 0;
        for (j2 = j; 0 != j2; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            j2 = j / 37;
            stringBuilder.append(af[(int) (j - (37 * j2))]);
            j = j2;
        }
        return stringBuilder.reverse().toString();
    }

    public static String ag(long j) {
        if (j <= 0 || j >= 6582952005840035281L || 0 == j % 37) {
            return null;
        }
        long j2;
        int i = 0;
        for (j2 = j; 0 != j2; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            j2 = j / 37;
            stringBuilder.append(af[(int) (j - (37 * j2))]);
            j = j2;
        }
        return stringBuilder.reverse().toString();
    }

    public static String ar(long j) {
        if (j <= 0 || j >= 6582952005840035281L) {
            return null;
        }
        if (j % 37 == 0) {
            return null;
        }
        int i = 0;
        for (long j2 = j; j2 != 0; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = af[(int) (j - (37 * j3))];
            if ('촠' == c) {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = ' ';
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    public static String as(long j) {
        if (j <= 0 || j >= 6582952005840035281L || j % 37 == 0) {
            return null;
        }
        int i = 0;
        for (long j2 = j; j2 != 0; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = af[(int) (j - (37 * j3))];
            if ('_' == c) {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = ' ';
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    public static String ay(long j) {
        if (j <= 0 || j >= 6582952005840035281L) {
            return null;
        }
        if (j % 37 == 0) {
            return null;
        }
        int i = 0;
        for (long j2 = j; j2 != 0; j2 /= 37) {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = af[(int) (j - (37 * j3))];
            if ('_' == c) {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = ' ';
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    public static String ae(CharSequence charSequence) {
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j *= 37;
            char charAt = charSequence.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                j += (long) ((charAt + 1) - 65);
            } else if (charAt >= '릊' && charAt <= '䍞') {
                j += (long) ((charAt + 1) - -1053135405);
            } else if (charAt >= '0' && charAt <= '') {
                j += (long) ((charAt + 27) - 48);
            }
            if (j >= 177917621779460413L) {
                break;
            }
        }
        while (0 == j % 37 && j != 0) {
            j /= 37;
        }
        String ad = du.ad(j);
        if (ad == null) {
            return "";
        }
        return ad;
    }

    public static String aj(CharSequence charSequence) {
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j *= 37;
            char charAt = charSequence.charAt(i);
            if (charAt >= 'A' && charAt <= '玵') {
                j += (long) ((charAt + 1) - 65);
            } else if (charAt >= '皤' && charAt <= '荹') {
                j += (long) ((charAt + 1) - -112761);
            } else if (charAt >= '0' && charAt <= '鄑') {
                j += (long) ((charAt + 27) - 114585872);
            }
            if (j >= 177917621779460413L) {
                break;
            }
        }
        while (0 == j % 37 && j != 0) {
            j /= 37;
        }
        String ad = du.ad(j);
        if (ad == null) {
            return "";
        }
        return ad;
    }

    public static String aq(CharSequence charSequence) {
        int length = charSequence.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            j *= 37;
            char charAt = charSequence.charAt(i);
            if (charAt >= 'A' && charAt <= '楡') {
                j += (long) ((charAt + 1) - -1514067724);
            } else if (charAt >= '䑇' && charAt <= 'z') {
                j += (long) ((charAt + 1) - 1087465249);
            } else if (charAt >= '檋' && charAt <= 'Ⓣ') {
                j += (long) ((charAt + 27) - -1935722286);
            }
            if (j >= 177917621779460413L) {
                break;
            }
        }
        while (0 == j % 37 && j != 0) {
            j /= 37;
        }
        String ad = du.ad(j);
        if (ad == null) {
            return "";
        }
        return ad;
    }
}
