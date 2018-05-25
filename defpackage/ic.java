package p000;

public class ic {
    public static final int aa = 512;
    public static final int ad = 65536;
    static final int[] ae = new int[2048];
    static final int af = 2048;
    public static final int ag = 768;
    public static final int aj = 1792;
    public static final int an = 256;
    static final int[] aq = new int[2048];

    static {
        for (int i = 0; i < 2048; i++) {
            ae[i] = (int) (Math.sin(((double) i) * 0.0030679615757712823d) * 65536.0d);
            aq[i] = (int) (Math.cos(((double) i) * 0.0030679615757712823d) * 65536.0d);
        }
    }

    ic() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "ic.<init>(" + ')');
        }
    }

    public static synchronized bd af(byte b) {
        bd bdVar;
        synchronized (ic.class) {
            try {
                if (bd.af == null) {
                    bd.af = new bd();
                }
                bdVar = bd.af;
            } catch (Throwable e) {
                throw ba.ad(e, "ic.af(" + ')');
            }
        }
        return bdVar;
    }
}
