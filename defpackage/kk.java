package p000;

public class kk {
    final Object[] ad;
    final Class af;
    int an = 0;

    public kk(Class cls, int i) {
        this.af = cls;
        this.ad = new Object[i];
    }

    Object af() {
        try {
            return this.af.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException();
        }
    }

    Object ag() {
        try {
            return this.af.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException();
        }
    }

    Object ad() {
        Object[] objArr = this.ad;
        int i = this.an - 1;
        this.an = i;
        return objArr[i];
    }

    Object ay() {
        Object[] objArr = this.ad;
        int i = this.an - 1;
        this.an = i;
        return objArr[i];
    }

    public synchronized Object an() {
        Object af;
        if (this.an == 0) {
            af = af();
        } else {
            af = ad();
        }
        return af;
    }

    public synchronized Object ar() {
        Object af;
        if (this.an == 0) {
            af = af();
        } else {
            af = ad();
        }
        return af;
    }

    public synchronized Object as() {
        return this.an == 0 ? af() : ad();
    }

    public synchronized void aa(Object obj) {
        if (this.an < this.ad.length) {
            Object[] objArr = this.ad;
            int i = this.an;
            this.an = i + 1;
            objArr[i] = obj;
        }
    }

    public synchronized void ae(Object obj) {
        if (this.an < this.ad.length) {
            Object[] objArr = this.ad;
            int i = this.an;
            this.an = i + 1;
            objArr[i] = obj;
        }
    }

    public synchronized void aj(Object obj) {
        if (this.an < this.ad.length) {
            Object[] objArr = this.ad;
            int i = this.an;
            this.an = i + 1;
            objArr[i] = obj;
        }
    }

    public synchronized void aq(Object obj) {
        if (this.an < this.ad.length) {
            Object[] objArr = this.ad;
            int i = this.an;
            this.an = i + 1;
            objArr[i] = obj;
        }
    }
}
