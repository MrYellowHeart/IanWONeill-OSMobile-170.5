package com.jagex.oldscape.android;

import android.view.inputmethod.InputMethodManager;
import p000.ba;
import p000.je;
import p000.mw;

public class ad extends je {
    final AndroidLauncher af;

    ad(AndroidLauncher androidLauncher, int i, mw mwVar) {
        try {
            super(mwVar);
            this.af = androidLauncher;
            aw(i, 1485109906);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/ad.<init>(" + ')');
        }
    }

    public void af(int i) {
        try {
            az(new aj(this.af, this.ay, 33, 5), 1484073601);
            az(new aj(this.af, this.ay, 129, 6), 1484073601);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/ad.af(" + ')');
        }
    }

    public void ay() {
        az(new aj(this.af, this.ay, -614998781, 5), 1484073601);
        az(new aj(this.af, this.ay, 219163939, 6), 1484073601);
    }

    public void ad(byte b) {
        try {
            az(new aj(this.af, this.ay, 2, 6), 1484073601);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/ad.ad(" + ')');
        }
    }

    public void as() {
        az(new aj(this.af, this.ay, 2, 6), 1484073601);
    }

    public void aj() {
        az(new aj(this.af, this.ay, 1, 6), 1484073601);
    }

    public void an(byte b) {
        try {
            az(new aj(this.af, this.ay, 1, 6), 1484073601);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/ad.an(" + ')');
        }
    }

    public void ar() {
        az(new aj(this.af, this.ay, 1, 6), 1484073601);
    }

    public void aa(byte b) {
        try {
            az(new aj(this.af, this.ay, 33, 6), 1484073601);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/ad.aa(" + ')');
        }
    }

    public void ae() {
        az(new aj(this.af, this.ay, 33, 6), 1484073601);
    }

    public void ab() {
        super.ag(-2097726241);
        ((InputMethodManager) this.af.getSystemService("input_method")).hideSoftInputFromWindow(this.af.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void ag(int i) {
        try {
            super.ag(63448936);
            ((InputMethodManager) this.af.getSystemService("input_method")).hideSoftInputFromWindow(this.af.getWindow().getDecorView().getWindowToken(), 0);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/ad.ag(" + ')');
        }
    }

    public void am() {
        super.ag(-399630065);
        ((InputMethodManager) this.af.getSystemService("input_method")).hideSoftInputFromWindow(this.af.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void aq() {
        super.ag(-821693971);
        ((InputMethodManager) this.af.getSystemService("input_method")).hideSoftInputFromWindow(this.af.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void at() {
        super.ag(-2122495623);
        ((InputMethodManager) this.af.getSystemService("input_method")).hideSoftInputFromWindow(this.af.getWindow().getDecorView().getWindowToken(), 0);
    }
}
