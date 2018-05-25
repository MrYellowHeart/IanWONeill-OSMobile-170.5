package com.jagex.oldscape.android;

import android.app.NativeActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.jagex.android.AndroidKeyboard;
import p000.ba;
import p000.bc;
import p000.client;
import p000.lg;

public class AndroidLauncher extends NativeActivity {
    static client af;
    as ad;

    public static void init() {
        try {
            af.un(-729603494);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/AndroidLauncher.init(" + ')');
        }
    }

    public void onCreate(Bundle bundle) {
        try {
            System.setOut(new ar(this, System.out));
            AndroidKeyboard.SetupMainActivity(this);
            getWindow().setFormat(3);
            super.onCreate(bundle);
            Intent intent = getIntent();
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            String string = getString(C0000R.string.jav_config_url);
            if (intent != null) {
                Uri data = intent.getData();
                String action = intent.getAction();
                if (!(data == null || action == null || !action.equals("android.intent.action.VIEW"))) {
                    string = "http://" + data.toString().split("//")[1];
                }
            }
            af(string, (byte) -56);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/AndroidLauncher.onCreate(" + ')');
        }
    }

    void aa(String str) {
        af = new client();
        af.ai = true;
        af.aw = 205152668;
        af.aq("http://oldschool.runescape.com/slr.ws?order=LPWM", 1579666372);
        this.ad = new as(this);
        this.ad.aw(false, 1531237509);
        af.tz(this.ad, -799314200);
        af.vf(new lg(str), 964508427);
        af.ar(537618701);
    }

    void af(String str, byte b) {
        try {
            af = new client();
            af.ai = true;
            af.aw = 1388941014;
            af.aq("http://oldschool.runescape.com/slr.ws?order=LPWM", 2034977989);
            this.ad = new as(this);
            this.ad.aw(false, 1999367323);
            af.tz(this.ad, 827155824);
            af.vf(new lg(str), 1657302182);
            af.ar(537618701);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/AndroidLauncher.af(" + ')');
        }
    }

    void ag(String str) {
        af = new client();
        af.ai = true;
        af.aw = 1388941014;
        af.aq("http://oldschool.runescape.com/slr.ws?order=LPWM", 1733775449);
        this.ad = new as(this);
        this.ad.aw(false, 1106059539);
        af.tz(this.ad, -1568625990);
        af.vf(new lg(str), 1234581373);
        af.ar(537618701);
    }

    void an(String str) {
        af = new client();
        af.ai = true;
        af.aw = 1388941014;
        af.aq("http://oldschool.runescape.com/slr.ws?order=LPWM", 1838337916);
        this.ad = new as(this);
        this.ad.aw(false, 1808005800);
        af.tz(this.ad, 666123670);
        af.vf(new lg(str), 105779833);
        af.ar(537618701);
    }

    void ay(String str) {
        af = new client();
        af.ai = true;
        af.aw = 1388941014;
        af.aq("http://oldschool.runescape.com/slr.ws?order=LPWM", 1584036627);
        this.ad = new as(this);
        this.ad.aw(false, 1748920263);
        af.tz(this.ad, 10594692);
        af.vf(new lg(str), -1462319734);
        af.ar(537618701);
    }

    public void onResume() {
        try {
            View decorView = getWindow().getDecorView();
            decorView.setFocusableInTouchMode(true);
            ad(16776960);
            af.uj(true, -1659702226);
            this.ad.at(false, 842696807);
            decorView.setOnSystemUiVisibilityChangeListener(new ag(this));
            decorView.setOnFocusChangeListener(new ay(this));
            super.onResume();
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/AndroidLauncher.onResume(" + ')');
        }
    }

    public void onPause() {
        try {
            af.uj(false, -1201175365);
            this.ad.at(true, 842696807);
            if (bc.kq != null && bc.kq.ae(-2140033866)) {
                bc.kq.as(-1147035743);
            }
            super.onPause();
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/AndroidLauncher.onPause(" + ')');
        }
    }

    void ad(int i) {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5895);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/AndroidLauncher.ad(" + ')');
        }
    }

    void ar() {
        getWindow().getDecorView().setSystemUiVisibility(5895);
    }

    void as() {
        getWindow().getDecorView().setSystemUiVisibility(28155791);
    }
}
