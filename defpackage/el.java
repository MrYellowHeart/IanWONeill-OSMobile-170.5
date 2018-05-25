package p000;

import java.util.Comparator;

public abstract class el implements Comparator {
    public static final int ai = 1;
    static long al = 0;
    static final int aw = 15;
    static final int dt = 8;
    static byte[][] eq;
    Comparator ad;

    protected el() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "el.<init>(" + ')');
        }
    }

    final void ab(Comparator comparator) {
        if (this.ad == null) {
            this.ad = comparator;
        } else if (this.ad instanceof el) {
            ((el) this.ad).aq(comparator, (byte) 54);
        }
    }

    final void aq(Comparator comparator, byte b) {
        try {
            if (this.ad == null) {
                this.ad = comparator;
            } else if (this.ad instanceof el) {
                ((el) this.ad).aq(comparator, (byte) 89);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "el.aq(" + ')');
        }
    }

    final void at(Comparator comparator) {
        if (this.ad == null) {
            this.ad = comparator;
        } else if (this.ad instanceof el) {
            ((el) this.ad).aq(comparator, (byte) 20);
        }
    }

    final void aw(Comparator comparator) {
        if (this.ad == null) {
            this.ad = comparator;
        } else if (this.ad instanceof el) {
            ((el) this.ad).aq(comparator, (byte) 67);
        }
    }

    protected final int ah(et etVar, et etVar2) {
        return this.ad == null ? 0 : this.ad.compare(etVar, etVar2);
    }

    protected final int ai(et etVar, et etVar2) {
        return this.ad == null ? 0 : this.ad.compare(etVar, etVar2);
    }

    protected final int am(et etVar, et etVar2, int i) {
        try {
            return this.ad == null ? 0 : this.ad.compare(etVar, etVar2);
        } catch (Throwable e) {
            throw ba.ad(e, "el.am(" + ')');
        }
    }

    protected final int az(et etVar, et etVar2) {
        return this.ad == null ? 0 : this.ad.compare(etVar, etVar2);
    }

    public boolean cf(Object obj) {
        return super.equals(obj);
    }

    public boolean cz(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (Throwable e) {
            throw ba.ad(e, "el.equals(" + ')');
        }
    }

    static Class an(String str, int i) throws ClassNotFoundException {
        try {
            if (str.equals("B")) {
                return Byte.TYPE;
            }
            if (str.equals("I")) {
                return Integer.TYPE;
            }
            if (str.equals("S")) {
                return Short.TYPE;
            }
            if (str.equals("J")) {
                return Long.TYPE;
            }
            if (str.equals("Z")) {
                return Boolean.TYPE;
            }
            if (str.equals("F")) {
                return Float.TYPE;
            }
            if (str.equals("D")) {
                return Double.TYPE;
            }
            if (str.equals("C")) {
                return Character.TYPE;
            }
            if (str.equals("void")) {
                return Void.TYPE;
            }
            return Class.forName(str);
        } catch (Throwable e) {
            throw ba.ad(e, "el.an(" + ')');
        }
    }
}
