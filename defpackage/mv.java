package p000;

import java.util.Collection;

public class mv {
    public static final mv aa = new mv(7, "js5connect");
    public static final mv ad = new mv(4, "js5crc");
    public static final mv af = new mv(1, "crash");
    public static final mv ag = new mv(8, "js5connect_full");
    static final mv aj = new mv(2, "alreadyloaded");
    public static final mv an = new mv(0, "js5io");
    static final mv ar = new mv(5, "wrongjava");
    static final mv as = new mv(6, "invalidhost");
    public static final mv ay = new mv(3, "js5connect_outofdate");
    public final int ae;

    mv(int i, String str) {
        try {
            this.ae = 2008949921 * i;
        } catch (Throwable e) {
            throw ba.ad(e, "mv.<init>(" + ')');
        }
    }

    public static void aw(Collection collection, int i) {
        try {
            collection.add(ae.aa);
            collection.add(ae.ag);
            collection.add(ae.ay);
            collection.add(ae.as);
        } catch (Throwable e) {
            throw ba.ad(e, "mv.aw(" + ')');
        }
    }
}
