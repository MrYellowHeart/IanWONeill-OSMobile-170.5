package p000;

import java.net.URL;

public class lx {
    volatile byte[] aa;
    final lp ad;
    final URL af;
    volatile boolean an;

    lx(URL url, lp lpVar) {
        try {
            this.af = url;
            this.ad = lpVar;
        } catch (Throwable e) {
            throw ba.ad(e, "lx.<init>(" + ')');
        }
    }

    void aa() {
        this.an = true;
        if (this.ad != null) {
            this.ad.af(this, 1756591818);
        }
    }

    void af(byte b) {
        try {
            this.an = true;
            if (this.ad != null) {
                this.ad.af(this, 774902876);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lx.af(" + ')');
        }
    }

    void ag() {
        this.an = true;
        if (this.ad != null) {
            this.ad.af(this, 1014035604);
        }
    }

    void ay() {
        this.an = true;
        if (this.ad != null) {
            this.ad.af(this, -1318826948);
        }
    }

    public boolean ad(int i) {
        try {
            return this.an;
        } catch (Throwable e) {
            throw ba.ad(e, "lx.ad(" + ')');
        }
    }

    public boolean ar() {
        return this.an;
    }

    public boolean as() {
        return this.an;
    }

    public byte[] ae() {
        return this.aa;
    }

    public byte[] aj() {
        return this.aa;
    }

    public byte[] an(int i) {
        try {
            return this.aa;
        } catch (Throwable e) {
            throw ba.ad(e, "lx.an(" + ')');
        }
    }

    public byte[] aq() {
        return this.aa;
    }

    public static String am(String str, int i) {
        try {
            int length = str.length();
            char[] cArr = new char[length];
            int i2 = 0;
            Object obj = 2;
            while (i2 < length) {
                char toLowerCase;
                Object obj2;
                char charAt = str.charAt(i2);
                if (obj == null) {
                    toLowerCase = Character.toLowerCase(charAt);
                } else if (2 == obj || Character.isUpperCase(charAt)) {
                    if (!('µ' == charAt || '' == charAt)) {
                        charAt = Character.toTitleCase(charAt);
                    }
                    toLowerCase = charAt;
                } else {
                    toLowerCase = charAt;
                }
                if (Character.isLetter(toLowerCase)) {
                    obj2 = null;
                } else if (toLowerCase == '.' || toLowerCase == '?' || '!' == toLowerCase) {
                    r0 = 2;
                } else if (!Character.isSpaceChar(toLowerCase)) {
                    r0 = 1;
                } else if (2 != obj) {
                    r0 = 1;
                } else {
                    obj2 = obj;
                }
                cArr[i2] = toLowerCase;
                i2++;
                obj = obj2;
            }
            return new String(cArr);
        } catch (Throwable e) {
            throw ba.ad(e, "lx.am(" + ')');
        }
    }
}
