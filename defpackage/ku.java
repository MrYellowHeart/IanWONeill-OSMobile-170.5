package p000;

import java.util.Iterator;

public class ku implements Iterator {
    kd aa = null;
    kd ad;
    kp af;
    int an;

    ku(kp kpVar) {
        this.af = kpVar;
        ay();
    }

    void as() {
        this.ad = this.af.ad[0].fi;
        this.an = 1;
        this.aa = null;
    }

    void ay() {
        this.ad = this.af.ad[0].fi;
        this.an = 1;
        this.aa = null;
    }

    public Object ad() {
        if (this.ad != this.af.ad[this.an - 1]) {
            kd kdVar = this.ad;
            this.ad = kdVar.fi;
            this.aa = kdVar;
            return kdVar;
        }
        while (this.an < this.af.af) {
            kd[] kdVarArr = this.af.ad;
            int i = this.an;
            this.an = i + 1;
            kdVar = kdVarArr[i].fi;
            if (kdVar != this.af.ad[this.an - 1]) {
                this.ad = kdVar.fi;
                this.aa = kdVar;
                return kdVar;
            }
        }
        return null;
    }

    public Object af() {
        if (this.ad != this.af.ad[this.an - 1]) {
            kd kdVar = this.ad;
            this.ad = kdVar.fi;
            this.aa = kdVar;
            return kdVar;
        }
        while (this.an < this.af.af) {
            kd[] kdVarArr = this.af.ad;
            int i = this.an;
            this.an = i + 1;
            kdVar = kdVarArr[i].fi;
            if (kdVar != this.af.ad[this.an - 1]) {
                this.ad = kdVar.fi;
                this.aa = kdVar;
                return kdVar;
            }
        }
        return null;
    }

    public Object next() {
        if (this.ad != this.af.ad[this.an - 1]) {
            kd kdVar = this.ad;
            this.ad = kdVar.fi;
            this.aa = kdVar;
            return kdVar;
        }
        while (this.an < this.af.af) {
            kd[] kdVarArr = this.af.ad;
            int i = this.an;
            this.an = i + 1;
            kdVar = kdVarArr[i].fi;
            if (kdVar != this.af.ad[this.an - 1]) {
                this.ad = kdVar.fi;
                this.aa = kdVar;
                return kdVar;
            }
        }
        return null;
    }

    public boolean aa() {
        if (this.ad != this.af.ad[this.an - 1]) {
            return true;
        }
        while (this.an < this.af.af) {
            kd[] kdVarArr = this.af.ad;
            int i = this.an;
            this.an = i + 1;
            if (kdVarArr[i].fi != this.af.ad[this.an - 1]) {
                this.ad = this.af.ad[this.an - 1].fi;
                return true;
            }
            this.ad = this.af.ad[this.an - 1];
        }
        return false;
    }

    public boolean an() {
        if (this.ad != this.af.ad[this.an - 1]) {
            return true;
        }
        while (this.an < this.af.af) {
            kd[] kdVarArr = this.af.ad;
            int i = this.an;
            this.an = i + 1;
            if (kdVarArr[i].fi != this.af.ad[this.an - 1]) {
                this.ad = this.af.ad[this.an - 1].fi;
                return true;
            }
            this.ad = this.af.ad[this.an - 1];
        }
        return false;
    }

    public boolean hasNext() {
        if (this.ad != this.af.ad[this.an - 1]) {
            return true;
        }
        while (this.an < this.af.af) {
            kd[] kdVarArr = this.af.ad;
            int i = this.an;
            this.an = i + 1;
            if (kdVarArr[i].fi != this.af.ad[this.an - 1]) {
                this.ad = this.af.ad[this.an - 1].fi;
                return true;
            }
            this.ad = this.af.ad[this.an - 1];
        }
        return false;
    }

    public void ag() {
        if (this.aa == null) {
            throw new IllegalStateException();
        }
        this.aa.ki();
        this.aa = null;
    }

    public void remove() {
        if (this.aa == null) {
            throw new IllegalStateException();
        }
        this.aa.ki();
        this.aa = null;
    }
}
