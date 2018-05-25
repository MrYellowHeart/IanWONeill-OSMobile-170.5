package p000;

/* compiled from: je */
class jg implements Runnable {
    public static final int ag = 32;
    static final int ah = 11;
    final /* synthetic */ je this$0;

    public static final int af(nv nvVar, int i) {
        if (nvVar == null) {
            return 12;
        }
        try {
            switch (nvVar.ae * -2079118595) {
                case 1:
                    return 20;
                default:
                    return 12;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "jg.af(" + ')');
        }
    }

    jg(je jeVar) {
        this.this$0 = jeVar;
    }

    public void bo() {
        synchronized (this.this$0.ar) {
            for (jm aa : this.this$0.ar) {
                aa.aa((byte) 1);
            }
        }
    }

    public void ci() {
        synchronized (this.this$0.ar) {
            for (jm aa : this.this$0.ar) {
                aa.aa((byte) 1);
            }
        }
    }

    public void cv() {
        synchronized (this.this$0.ar) {
            for (jm aa : this.this$0.ar) {
                aa.aa((byte) 1);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.ar) {
                for (jm aa : this.this$0.ar) {
                    aa.aa((byte) 1);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "jg.run(" + ')');
        }
    }
}
