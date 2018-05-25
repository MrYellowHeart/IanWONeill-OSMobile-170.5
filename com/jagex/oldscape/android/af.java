package com.jagex.oldscape.android;

import p000.ba;
import p000.mn;

/* compiled from: as */
class af implements Runnable {
    final /* synthetic */ as this$0;
    final /* synthetic */ boolean val$keepScreenOn;

    af(as asVar, boolean z) {
        this.this$0 = asVar;
        this.val$keepScreenOn = z;
    }

    public void bo() {
        if (this.val$keepScreenOn) {
            this.this$0.ad.getWindow().addFlags(mn.an);
        } else {
            this.this$0.ad.getWindow().clearFlags(-1733507279);
        }
    }

    public void ci() {
        if (this.val$keepScreenOn) {
            this.this$0.ad.getWindow().addFlags(-308454283);
        } else {
            this.this$0.ad.getWindow().clearFlags(mn.an);
        }
    }

    public void cv() {
        if (this.val$keepScreenOn) {
            this.this$0.ad.getWindow().addFlags(-120664434);
        } else {
            this.this$0.ad.getWindow().clearFlags(mn.an);
        }
    }

    public void run() {
        try {
            if (this.val$keepScreenOn) {
                this.this$0.ad.getWindow().addFlags(mn.an);
            } else {
                this.this$0.ad.getWindow().clearFlags(mn.an);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/af.run(" + ')');
        }
    }
}
