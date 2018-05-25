package p000;

/* compiled from: je */
class jh implements Runnable {
    final /* synthetic */ je this$0;
    final /* synthetic */ int val$formFieldIndex;

    jh(je jeVar, int i) {
        this.this$0 = jeVar;
        this.val$formFieldIndex = i;
    }

    public void bo() {
        synchronized (this.this$0.ar) {
            if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                ((jm) this.this$0.ar.get(this.val$formFieldIndex)).an(-1482574128);
            }
        }
    }

    public void ci() {
        synchronized (this.this$0.ar) {
            if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                ((jm) this.this$0.ar.get(this.val$formFieldIndex)).an(-1456932881);
            }
        }
    }

    public void cv() {
        synchronized (this.this$0.ar) {
            if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                ((jm) this.this$0.ar.get(this.val$formFieldIndex)).an(-1181631518);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.ar) {
                if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                    ((jm) this.this$0.ar.get(this.val$formFieldIndex)).an(-890052585);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "jh.run(" + ')');
        }
    }
}
