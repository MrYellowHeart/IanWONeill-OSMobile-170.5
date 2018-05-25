package com.jagex.oldscape.android;

import android.app.Activity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import p000.ba;
import p000.jm;
import p000.jt;

public class aj implements jm, TextWatcher, OnEditorActionListener {
    static final String af = "ManualEdit";
    final jt aa;
    final LayoutParams ad;
    final EditText ag;
    final Activity an;
    String ay;

    aj(Activity activity, jt jtVar, int i, int i2) {
        try {
            this.ad = new LayoutParams(-2, -2);
            this.an = activity;
            this.aa = jtVar;
            this.ag = as((byte) 39);
            activity.addContentView(this.ag, this.ad);
            this.ag.addTextChangedListener(this);
            this.ag.setInputType(i);
            this.ag.setImeOptions(268435456 | i2);
            this.ag.setOnEditorActionListener(this);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.<init>(" + ')');
        }
    }

    public void af(String str, int i) {
        try {
            this.ag.setTag(af);
            this.ag.setText(str);
            this.ag.setSelection(this.ag.getText().length());
            this.ag.setTag(null);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.af(" + ')');
        }
    }

    public void bp(String str) {
        this.ag.setTag(af);
        this.ag.setText(str);
        this.ag.setSelection(this.ag.getText().length());
        this.ag.setTag(null);
    }

    public boolean ad(int i) {
        try {
            return this.ag.hasFocus();
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.ad(" + ')');
        }
    }

    public boolean ae() {
        return this.ag.hasFocus();
    }

    public boolean aj() {
        return this.ag.hasFocus();
    }

    public boolean ar() {
        return this.ag.hasFocus();
    }

    public void an(int i) {
        try {
            this.ag.bringToFront();
            this.ag.requestFocus();
            ((InputMethodManager) this.an.getSystemService("input_method")).showSoftInput(this.ag, 1);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.an(" + ')');
        }
    }

    public void aq() {
        this.ag.bringToFront();
        this.ag.requestFocus();
        ((InputMethodManager) this.an.getSystemService("input_method")).showSoftInput(this.ag, 1);
    }

    public void aa(byte b) {
        try {
            this.ag.setTag(af);
            this.ag.setFilters(new InputFilter[0]);
            this.ag.setText("");
            this.ag.setTag(null);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.aa(" + ')');
        }
    }

    public void am() {
        this.ag.setTag(af);
        this.ag.setFilters(new InputFilter[0]);
        this.ag.setText("");
        this.ag.setTag(null);
    }

    public void at() {
        this.ag.setTag(af);
        this.ag.setFilters(new InputFilter[0]);
        this.ag.setText("");
        this.ag.setTag(null);
    }

    public void ab() {
        this.ag.clearFocus();
        ((ViewGroup) this.ag.getParent()).removeView(this.ag);
    }

    public void ag(byte b) {
        try {
            this.ag.clearFocus();
            ((ViewGroup) this.ag.getParent()).removeView(this.ag);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.ag(" + ')');
        }
    }

    public void aw() {
        this.ag.clearFocus();
        ((ViewGroup) this.ag.getParent()).removeView(this.ag);
    }

    public void ai(int i) {
        this.ag.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void ay(int i, int i2) {
        try {
            this.ag.setFilters(new InputFilter[]{new LengthFilter(i)});
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.ay(" + ')');
        }
    }

    public void az(int i) {
        this.ag.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    public void ah(CharSequence charSequence, int i, int i2, int i3) {
        this.ay = charSequence.toString();
    }

    public void ak(CharSequence charSequence, int i, int i2, int i3) {
        this.ay = charSequence.toString();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            this.ay = charSequence.toString();
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.beforeTextChanged(" + ')');
        }
    }

    public void ao(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void au(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void av(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void ax(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void ac(Editable editable) {
        if (!af.equals(this.ag.getTag())) {
            this.aa.ar(this.ay, editable.toString(), -781682064);
        }
    }

    public void afterTextChanged(Editable editable) {
        try {
            if (!af.equals(this.ag.getTag())) {
                this.aa.ar(this.ay, editable.toString(), -781682064);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.afterTextChanged(" + ')');
        }
    }

    public void al(Editable editable) {
        if (!af.equals(this.ag.getTag())) {
            this.aa.ar(this.ay, editable.toString(), -781682064);
        }
    }

    public void ap(Editable editable) {
        if (!af.equals(this.ag.getTag())) {
            this.aa.ar(this.ay, editable.toString(), -781682064);
        }
    }

    public void bw(Editable editable) {
        if (!af.equals(this.ag.getTag())) {
            this.aa.ar(this.ay, editable.toString(), -781682064);
        }
    }

    public boolean bb(TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            this.aa.aj(1207319805);
        }
        return false;
    }

    public boolean bc(TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            this.aa.aj(725585399);
        }
        return false;
    }

    public boolean bg(TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            this.aa.aj(1736211574);
        }
        return false;
    }

    public boolean bz(TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            this.aa.aj(1637776851);
        }
        return false;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            try {
                this.aa.aj(1014393586);
            } catch (Throwable e) {
                throw ba.ad(e, "com/jagex/oldscape/android/aj.onEditorAction(" + ')');
            }
        }
        return false;
    }

    EditText as(byte b) {
        try {
            return new an(this, this.an);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/aj.as(" + ')');
        }
    }

    EditText bf() {
        return new an(this, this.an);
    }

    EditText bh() {
        return new an(this, this.an);
    }

    EditText bv() {
        return new an(this, this.an);
    }
}
