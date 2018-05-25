package p000;

import java.util.HashMap;

public class lv {
    static final int ar = 128;
    static final int mh = 512;
    kf ad;
    kf af;
    HashMap an;

    public lv(kf kfVar, kf kfVar2) {
        try {
            this.af = kfVar;
            this.ad = kfVar2;
            this.an = new HashMap();
        } catch (Throwable e) {
            throw ba.ad(e, "lv.<init>(" + ')');
        }
    }

    public HashMap ad(lq[] lqVarArr) {
        HashMap hashMap = new HashMap();
        for (lq lqVar : lqVarArr) {
            if (this.an.containsKey(lqVar)) {
                hashMap.put(lqVar, this.an.get(lqVar));
            } else {
                lr aj = bc.aj(this.af, this.ad, lqVar.ar, "", (byte) 0);
                if (aj != null) {
                    this.an.put(lqVar, aj);
                    hashMap.put(lqVar, aj);
                }
            }
        }
        return hashMap;
    }

    public HashMap af(lq[] lqVarArr, int i) {
        try {
            HashMap hashMap = new HashMap();
            for (lq lqVar : lqVarArr) {
                if (this.an.containsKey(lqVar)) {
                    hashMap.put(lqVar, this.an.get(lqVar));
                } else {
                    lr aj = bc.aj(this.af, this.ad, lqVar.ar, "", (byte) 0);
                    if (aj != null) {
                        this.an.put(lqVar, aj);
                        hashMap.put(lqVar, aj);
                    }
                }
            }
            return hashMap;
        } catch (Throwable e) {
            throw ba.ad(e, "lv.af(" + ')');
        }
    }
}
