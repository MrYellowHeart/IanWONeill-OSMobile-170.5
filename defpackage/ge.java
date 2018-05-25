package p000;

import java.util.Collection;

public abstract class ge {
    static final int bu = 39;
    public static final int ch = 1011;
    static fx ed;
    protected go af;

    protected ge() {
        try {
            this.af = new gv();
        } catch (Throwable e) {
            throw ba.ad(e, "ge.<init>(" + ')');
        }
    }

    public void aa(go goVar) {
        if (goVar == null) {
            throw new NullPointerException();
        }
        this.af = goVar;
    }

    public void af(go goVar, byte b) {
        if (goVar == null) {
            try {
                throw new NullPointerException();
            } catch (Throwable e) {
                throw ba.ad(e, "ge.af(" + ')');
            }
        }
        this.af = goVar;
    }

    public void ag(go goVar) {
        if (goVar == null) {
            throw new NullPointerException();
        }
        this.af = goVar;
    }

    public void an(go goVar) {
        if (goVar == null) {
            throw new NullPointerException();
        }
        this.af = goVar;
    }

    protected final long ad(byte b) {
        try {
            return hu.af(334761458);
        } catch (Throwable e) {
            throw ba.ad(e, "ge.ad(" + ')');
        }
    }

    protected final long as() {
        return hu.af(90039301);
    }

    protected final long ay() {
        return hu.af(1279843253);
    }

    public static void aa(Collection collection, int i) {
        try {
            collection.add(ag.ad);
        } catch (Throwable e) {
            throw ba.ad(e, "ge.aa(" + ')');
        }
    }

    public static void ae(Collection collection, int i) {
        try {
            collection.add(bc.am);
        } catch (Throwable e) {
            throw ba.ad(e, "ge.ae(" + ')');
        }
    }

    static final void dm(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        try {
            gi giVar = (gi) client.ig.as();
            while (giVar != null) {
                if (i == giVar.af * -1783248061 && giVar.an * -1294114749 == i2 && -401817923 * giVar.aa == i3 && giVar.ad * -1833730097 == i4) {
                    break;
                }
                giVar = (gi) client.ig.aj();
            }
            giVar = null;
            if (giVar == null) {
                giVar = new gi();
                giVar.af = -599549589 * i;
                giVar.ad = 1207772975 * i4;
                giVar.an = 1781132395 * i2;
                giVar.aa = 134655125 * i3;
                dc.db(giVar, -1273164221);
                client.ig.ad(giVar);
            }
            giVar.ar = 1516219155 * i5;
            giVar.ae = 287659945 * i6;
            giVar.aj = -1187658655 * i7;
            giVar.aq = 645588417 * i8;
            giVar.am = 1558812355 * i9;
        } catch (Throwable e) {
            throw ba.ad(e, "ge.dm(" + ')');
        }
    }
}
