package p000;

/* compiled from: je */
class jo implements Runnable {
    public static final int aw = 10;
    public static final int ba = 55;
    static final int qi = 100;
    final /* synthetic */ je this$0;
    final /* synthetic */ int val$formFieldIndex;
    final /* synthetic */ String val$text;

    jo(je jeVar, String str, int i) {
        this.this$0 = jeVar;
        this.val$text = str;
        this.val$formFieldIndex = i;
    }

    public void bo() {
        synchronized (this.this$0.ar) {
            if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                ((jm) this.this$0.ar.get(this.val$formFieldIndex)).af(this.val$text, 329490463);
            }
        }
    }

    public void ci() {
        synchronized (this.this$0.ar) {
            if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                ((jm) this.this$0.ar.get(this.val$formFieldIndex)).af(this.val$text, 97026917);
            }
        }
    }

    public void cv() {
        synchronized (this.this$0.ar) {
            if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                ((jm) this.this$0.ar.get(this.val$formFieldIndex)).af(this.val$text, -53510990);
            }
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.ar) {
                if (this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.ar.size()) {
                    ((jm) this.this$0.ar.get(this.val$formFieldIndex)).af(this.val$text, 1190021981);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "jo.run(" + ')');
        }
    }

    static boolean ai(kf kfVar, int i, int i2, int i3) {
        try {
            byte[] an = kfVar.an(i, i2, -1774391931);
            if (an == null) {
                return false;
            }
            ec.ah(an, 1038066314);
            return true;
        } catch (Throwable e) {
            throw ba.ad(e, "jo.ai(" + ')');
        }
    }
}
