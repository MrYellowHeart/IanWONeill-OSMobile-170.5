package com.jagex.oldscape.android;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p000.ba;

/* compiled from: aj */
class an extends EditText {
    final /* synthetic */ aj this$0;

    an(aj ajVar, Context context) {
        this.this$0 = ajVar;
        super(context);
    }

    public InputConnection ad(EditorInfo editorInfo) {
        return new aa(this, super.onCreateInputConnection(editorInfo), true);
    }

    public InputConnection af(EditorInfo editorInfo) {
        return new aa(this, super.onCreateInputConnection(editorInfo), true);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        try {
            return new aa(this, super.onCreateInputConnection(editorInfo), true);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/an.onCreateInputConnection(" + ')');
        }
    }

    public boolean aa() {
        return true;
    }

    public boolean ag() {
        return true;
    }

    public boolean an() {
        return true;
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }
}
