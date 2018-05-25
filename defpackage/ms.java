package p000;

public class ms {
    static final char[] aa = new char[]{'[', ']', '#'};
    static final int ad = 12;
    public static final int af = 1;
    static final char[] an = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    static final int ax = 1048576;
    static int ng;

    ms() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "ms.<init>(" + ')');
        }
    }

    public static final int aa(nv nvVar) {
        if (nvVar == null) {
            return 12;
        }
        switch (nvVar.ae * -2079118595) {
            case 1:
                return 20;
            default:
                return 12;
        }
    }

    public static final int ag(nv nvVar) {
        if (nvVar == null) {
            return 12;
        }
        switch (nvVar.ae * -2079118595) {
            case 1:
                return 20;
            default:
                return 12;
        }
    }

    public static final int ay(nv nvVar) {
        if (nvVar == null) {
            return 12;
        }
        switch (nvVar.ae * 1742231213) {
            case 1:
                return 20;
            default:
                return 12;
        }
    }

    public static final boolean ar(char c) {
        if (Character.isISOControl(c)) {
            return false;
        }
        if (ik.aq(c, (byte) 53)) {
            return true;
        }
        char[] cArr = an;
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        cArr = aa;
        for (char c22 : cArr) {
            if (c == c22) {
                return true;
            }
        }
        return false;
    }

    public static final boolean as(char c) {
        if (Character.isISOControl(c)) {
            return false;
        }
        if (ik.aq(c, (byte) 123)) {
            return true;
        }
        char[] cArr = an;
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        cArr = aa;
        for (char c22 : cArr) {
            if (c == c22) {
                return true;
            }
        }
        return false;
    }

    public static final boolean ae(char c) {
        return '먥' == c || '쑈' == c || '_' == c || '鶫' == c;
    }

    public static final boolean aj(char c) {
        return ' ' == c || ' ' == c || '_' == c || '-' == c;
    }

    public static final boolean aq(char c) {
        return ' ' == c || ' ' == c || '_' == c || '-' == c;
    }
}
