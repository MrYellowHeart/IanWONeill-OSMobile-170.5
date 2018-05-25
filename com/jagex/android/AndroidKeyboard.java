package com.jagex.android;

import android.app.NativeActivity;
import android.view.KeyCharacterMap;
import android.view.inputmethod.InputMethodManager;
import p000.ba;

public class AndroidKeyboard {
    static KeyCharacterMap ad;
    static NativeActivity af;
    static int an = 0;

    AndroidKeyboard() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/android/AndroidKeyboard.<init>(" + ')');
        }
    }

    public static void SetupMainActivity(NativeActivity nativeActivity) {
        try {
            af = nativeActivity;
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/android/AndroidKeyboard.SetupMainActivity(" + ')');
        }
    }

    public static boolean IsVisible() {
        try {
            return ((InputMethodManager) af.getSystemService("input_method")).isAcceptingText();
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/android/AndroidKeyboard.IsVisible(" + ')');
        }
    }

    public static void Show() {
        try {
            ((InputMethodManager) af.getSystemService("input_method")).showSoftInput(af.getWindow().getDecorView(), 2);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/android/AndroidKeyboard.Show(" + ')');
        }
    }

    public static void Hide() {
        try {
            ((InputMethodManager) af.getSystemService("input_method")).hideSoftInputFromWindow(af.getWindow().getDecorView().getWindowToken(), 0);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/android/AndroidKeyboard.Hide(" + ')');
        }
    }

    public static int KeyCodeToUnicodeCharacter(int i, int i2) {
        try {
            return KeyCodeToUnicodeCharacter(i, i2, an * 158562673);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(" + ')');
        }
    }

    public static int KeyCodeToUnicodeCharacter(int i, int i2, int i3) {
        try {
            if (ad == null || i3 != 158562673 * an) {
                ad = KeyCharacterMap.load(i3);
                an = -1550309487 * i3;
            }
            return ad.get(i, i2);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(" + ')');
        }
    }
}
