package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class nj {
    public static Comparator aa = new ng();
    public static Comparator ad = new nu();
    public static Comparator ag = new nf();
    public static Comparator an = new nk();
    public static final int cg = 99;
    public final List af;

    static {
        ne neVar = new ne();
    }

    public nj(ik ikVar, boolean z) {
        byte b = (byte) 1;
        int i = 0;
        try {
            int au = ikVar.au(1739373058);
            if ((ikVar.ao((byte) 0) == 1 ? (byte) 1 : (byte) 0) == (byte) 0) {
                b = (byte) 0;
            }
            int au2 = ikVar.au(-840206376);
            this.af = new ArrayList(au2);
            while (i < au2) {
                this.af.add(new nh(ikVar, b, au));
                i++;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "nj.<init>(" + ')');
        }
    }

    public void ad(Comparator comparator, boolean z) {
        if (z) {
            Collections.sort(this.af, comparator);
        } else {
            Collections.sort(this.af, Collections.reverseOrder(comparator));
        }
    }

    public void af(Comparator comparator, boolean z, int i) {
        if (z) {
            try {
                Collections.sort(this.af, comparator);
                return;
            } catch (Throwable e) {
                throw ba.ad(e, "nj.af(" + ')');
            }
        }
        Collections.sort(this.af, Collections.reverseOrder(comparator));
    }
}
