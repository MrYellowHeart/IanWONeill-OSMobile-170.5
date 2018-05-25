package p000;

import java.util.Hashtable;
import java.util.Iterator;

public class lj {
    public static final int aa = 5;
    public static kf aj;
    public Hashtable ad;
    public Hashtable af;
    Hashtable an;

    lj(String str) {
        try {
            this.af = new Hashtable();
            this.ad = new Hashtable();
            this.an = new Hashtable();
        } catch (Throwable e) {
            throw ba.ad(e, "lj.<init>(" + ')');
        }
    }

    static void ag(int i) {
        try {
            Iterator it = hi.ad.iterator();
            while (it.hasNext()) {
                ((hl) it.next()).ag((byte) -1);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lj.ag(" + ')');
        }
    }
}
