package p000;

import java.util.Iterator;

public class ka implements Iterator {
    kq ad;
    ko af;
    kq an = null;

    ka(ko koVar) {
        this.af = koVar;
        this.ad = this.af.af.dx;
        this.an = null;
    }

    public Object ad() {
        kq kqVar = this.ad;
        if (kqVar == this.af.af) {
            this.ad = null;
            kqVar = null;
        } else {
            this.ad = kqVar.dx;
        }
        this.an = kqVar;
        return kqVar;
    }

    public Object af() {
        kq kqVar = null;
        kq kqVar2 = this.ad;
        if (kqVar2 == this.af.af) {
            this.ad = null;
        } else {
            this.ad = kqVar2.dx;
            kqVar = kqVar2;
        }
        this.an = kqVar;
        return kqVar;
    }

    public Object next() {
        kq kqVar = this.ad;
        if (kqVar == this.af.af) {
            this.ad = null;
            kqVar = null;
        } else {
            this.ad = kqVar.dx;
        }
        this.an = kqVar;
        return kqVar;
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
        this.an.dm();
        this.an = null;
    }

    public void remove() {
        if (this.an == null) {
            throw new IllegalStateException();
        }
        this.an.dm();
        this.an = null;
    }
}
