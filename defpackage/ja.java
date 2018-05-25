package p000;

public class ja {
    public static final int af = 8;
    public static final int an = 16;
    static final int ar = 8;

    ja() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "ja.<init>(" + ')');
        }
    }

    public static int ad(int i, int i2) {
        return (i << 8) + i2;
    }
}
