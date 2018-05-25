package com.jagex.oldscape.android;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import p000.ba;

/* compiled from: AndroidLauncher */
class ay implements OnFocusChangeListener {
    final /* synthetic */ AndroidLauncher this$0;

    ay(AndroidLauncher androidLauncher) {
        this.this$0 = androidLauncher;
    }

    public void ad(View view, boolean z) {
        if (z) {
            this.this$0.ad(16776960);
        }
    }

    public void af(View view, boolean z) {
        if (z) {
            this.this$0.ad(16776960);
        }
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            try {
                this.this$0.ad(16776960);
            } catch (Throwable e) {
                throw ba.ad(e, "com/jagex/oldscape/android/ay.onFocusChange(" + ')');
            }
        }
    }
}
