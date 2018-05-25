package p000;

/* compiled from: je */
class jf implements Runnable {
    public static final int aq = 4096;
    static byte[][][] ay = null;
    protected static final int qb = 32;
    final /* synthetic */ je this$0;
    final /* synthetic */ int val$formFieldIndex;
    final /* synthetic */ int val$limit;

    jf(je jeVar, int i, int i2) {
        this.this$0 = jeVar;
        this.val$limit = i;
        this.val$formFieldIndex = i2;
    }

    public void bo() {
        synchronized (this.this$0.ar) {
            if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                ((jm) this.this$0.ar.get(this.val$formFieldIndex)).ay(this.val$limit, 537618701);
            }
        }
    }

    public void ci() {
        synchronized (this.this$0.ar) {
            if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                ((jm) this.this$0.ar.get(this.val$formFieldIndex)).ay(this.val$limit, 537618701);
            }
        }
    }

    public void cv() {
        synchronized (this.this$0.ar) {
            if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                ((jm) this.this$0.ar.get(this.val$formFieldIndex)).ay(this.val$limit, 537618701);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.ar) {
                if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                    ((jm) this.this$0.ar.get(this.val$formFieldIndex)).ay(this.val$limit, 537618701);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "jf.run(" + ')');
        }
    }
}
