package p000;

public abstract class me {
    public static final int ad = 2;
    public static final int af = 1;
    public static final int an = 4;
    public static final int ay = 33554432;

    me() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "me.<init>(" + ')');
        }
    }
}
