package p000;

import java.lang.ref.SoftReference;

public class kv extends kn {
    SoftReference af;

    kv(Object obj, int i) {
        super(i);
        this.af = new SoftReference(obj);
    }

    Object aa() {
        return this.af.get();
    }

    Object af() {
        return this.af.get();
    }

    Object an() {
        return this.af.get();
    }

    boolean ad() {
        return true;
    }

    boolean ag() {
        return true;
    }

    boolean as() {
        return true;
    }

    boolean ay() {
        return true;
    }
}
