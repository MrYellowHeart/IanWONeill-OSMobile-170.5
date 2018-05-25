package p000;

import java.util.Iterator;

public class km implements Iterator {
    kd ad;
    kj af;
    kd an = null;

    km(kj kjVar) {
        this.af = kjVar;
        this.ad = this.af.af.fi;
        this.an = null;
    }

    public Object ad() {
        kd kdVar = null;
        kd kdVar2 = this.ad;
        if (kdVar2 == this.af.af) {
            this.ad = null;
        } else {
            this.ad = kdVar2.fi;
            kdVar = kdVar2;
        }
        this.an = kdVar;
        return kdVar;
    }

    public Object af() {
        kd kdVar = null;
        kd kdVar2 = this.ad;
        if (kdVar2 == this.af.af) {
            this.ad = null;
        } else {
            this.ad = kdVar2.fi;
            kdVar = kdVar2;
        }
        this.an = kdVar;
        return kdVar;
    }

    public Object next() {
        kd kdVar = null;
        kd kdVar2 = this.ad;
        if (kdVar2 == this.af.af) {
            this.ad = null;
        } else {
            this.ad = kdVar2.fi;
            kdVar = kdVar2;
        }
        this.an = kdVar;
        return kdVar;
    }

    public boolean aa() {
        return this.ad != this.af.af;
    }

    public boolean an() {
        return this.ad != this.af.af;
    }

    public boolean hasNext() {
        return this.ad != this.af.af;
    }

    public void ag() {
        if (this.an == null) {
            throw new IllegalStateException();
        }
        this.an.ki();
        this.an = null;
    }

    public void remove() {
        if (this.an == null) {
            throw new IllegalStateException();
        }
        this.an.ki();
        this.an = null;
    }
}
