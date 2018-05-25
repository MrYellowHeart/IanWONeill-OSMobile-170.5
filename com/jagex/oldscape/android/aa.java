package com.jagex.oldscape.android;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import p000.ba;

/* compiled from: aj */
class aa extends InputConnectionWrapper {
    final /* synthetic */ an this$1;

    aa(an anVar, InputConnection inputConnection, boolean z) {
        this.this$1 = anVar;
        super(inputConnection, z);
    }

    public boolean af(KeyEvent keyEvent) {
        boolean z = false;
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() != 1) {
                return true;
            }
            deleteSurroundingText(1, 0);
            return true;
        } else if (keyEvent.getAction() != 0) {
            return true;
        } else {
            if (this.this$1.this$0.ag.dispatchKeyEvent(keyEvent) || super.sendKeyEvent(keyEvent)) {
                z = true;
            }
            return z;
        }
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = false;
        try {
            if (keyEvent.getKeyCode() == 67) {
                if (keyEvent.getAction() != 1) {
                    return true;
                }
                deleteSurroundingText(1, 0);
                return true;
            } else if (keyEvent.getAction() != 0) {
                return true;
            } else {
                if (this.this$1.this$0.ag.dispatchKeyEvent(keyEvent) || super.sendKeyEvent(keyEvent)) {
                    z = true;
                }
                return z;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aa.sendKeyEvent(" + ')');
        }
    }
}
