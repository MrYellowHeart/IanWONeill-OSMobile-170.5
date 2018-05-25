package com.jagex.oldscape.android;

import java.io.OutputStream;
import java.io.PrintStream;
import p000.ba;

/* compiled from: AndroidLauncher */
class ar extends PrintStream {
    final /* synthetic */ AndroidLauncher this$0;

    ar(AndroidLauncher androidLauncher, OutputStream outputStream) {
        this.this$0 = androidLauncher;
        super(outputStream);
    }

    public void aa(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void ad(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void af(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void ag(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void an(String str) {
        super.println("com.jagex.oldscape: " + str);
    }

    public void println(String str) {
        try {
            super.println("com.jagex.oldscape: " + str);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/ar.println(" + ')');
        }
    }
}
