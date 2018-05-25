package p000;

public class ir {
    static final int as = -7597807;
    public static lr aw = null;
    static final int bc = 30;
    protected static String rc;

    ir() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "ir.<init>(" + ')');
        }
    }

    public static char aa(char c, int i) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if ('ý' == c || c == 'ÿ') {
                return 'y';
            }
        }
        if (c == 'Œ') {
            return 'O';
        }
        if ('œ' == c) {
            return 'o';
        }
        if ('Ÿ' == c) {
            return 'Y';
        }
        return c;
    }

    public static char ag(char c, int i) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if ('ý' == c || c == 'ÿ') {
                return 'y';
            }
        }
        if (c == 'Œ') {
            return 'O';
        }
        if ('œ' == c) {
            return 'o';
        }
        if ('Ÿ' == c) {
            return 'Y';
        }
        return c;
    }

    public static char an(char c, int i) {
        if (c >= 'À' && c <= 'ÿ') {
            if (c >= 'À' && c <= 'Æ') {
                return 'A';
            }
            if ('Ç' == c) {
                return 'C';
            }
            if (c >= 'È' && c <= 'Ë') {
                return 'E';
            }
            if (c >= 'Ì' && c <= 'Ï') {
                return 'I';
            }
            if (c >= 'Ò' && c <= 'Ö') {
                return 'O';
            }
            if (c >= 'Ù' && c <= 'Ü') {
                return 'U';
            }
            if ('Ý' == c) {
                return 'Y';
            }
            if (c == 'ß') {
                return 's';
            }
            if (c >= 'à' && c <= 'æ') {
                return 'a';
            }
            if (c == 'ç') {
                return 'c';
            }
            if (c >= 'è' && c <= 'ë') {
                return 'e';
            }
            if (c >= 'ì' && c <= 'ï') {
                return 'i';
            }
            if (c >= 'ò' && c <= 'ö') {
                return 'o';
            }
            if (c >= 'ù' && c <= 'ü') {
                return 'u';
            }
            if ('ý' == c || c == 'ÿ') {
                return 'y';
            }
        }
        if (c == 'Œ') {
            return 'O';
        }
        if ('œ' == c) {
            return 'o';
        }
        if ('Ÿ' == c) {
            return 'Y';
        }
        return c;
    }

    public static int as(char c, int i) {
        int i2 = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            return (Character.toLowerCase(c) << 4) + 1;
        }
        return i2;
    }

    public static int ay(char c, int i) {
        int i2 = c << 4;
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            return (Character.toLowerCase(c) << 4) + 1;
        }
        return i2;
    }

    static String at(char c, int i, int i2) {
        try {
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = c;
            }
            return new String(cArr);
        } catch (Throwable e) {
            throw ba.ad(e, "ir.at(" + ')');
        }
    }
}
