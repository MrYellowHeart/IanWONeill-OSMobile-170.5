package com.jagex.oldscape.android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Display;
import java.io.DataInputStream;
import java.io.IOException;
import p000.ba;
import p000.client;
import p000.fx;
import p000.ie;
import p000.it;
import p000.je;
import p000.jr;
import p000.li;
import p000.lr;
import p000.mi;
import p000.mw;

public class as extends mw {
    static int[] af = new int[]{-1, -1, -1, -1, 13, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 71, 72, 86, -1, 81, -1, 80, 83, -1, -1, -1, 84, 85, -1, 26, 27, -1, -1, 74, 57, 58, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, li.cu, ie.ca, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, jr.cx, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, -1, -1, -1, 91, -1, -1, -1, -1, 90, 89, 88, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    boolean aa;
    final AndroidLauncher ad;
    final Rect an;

    as(AndroidLauncher androidLauncher) {
        try {
            this.an = new Rect();
            this.aa = false;
            this.ad = androidLauncher;
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.<init>(" + ')');
        }
    }

    public String af(int i) {
        try {
            if (VERSION.SDK_INT >= 21) {
                return this.ad.getNoBackupFilesDir().getAbsolutePath();
            }
            return this.ad.getFilesDir().getAbsolutePath();
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.af(" + ')');
        }
    }

    public String ah() {
        if (VERSION.SDK_INT >= 21) {
            return this.ad.getNoBackupFilesDir().getAbsolutePath();
        }
        return this.ad.getFilesDir().getAbsolutePath();
    }

    public String ak() {
        if (VERSION.SDK_INT >= 21) {
            return this.ad.getNoBackupFilesDir().getAbsolutePath();
        }
        return this.ad.getFilesDir().getAbsolutePath();
    }

    public String az() {
        if (VERSION.SDK_INT >= 21) {
            return this.ad.getNoBackupFilesDir().getAbsolutePath();
        }
        return this.ad.getFilesDir().getAbsolutePath();
    }

    public int ad(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < af.length) {
                    return af[i];
                }
            } catch (Throwable e) {
                throw ba.ad(e, "com/jagex/oldscape/android/as.ad(" + ')');
            }
        }
        return -1;
    }

    public int ao(int i) {
        if (i < 0 || i >= af.length) {
            return -1;
        }
        return af[i];
    }

    public float an(int i) {
        try {
            if (this.ad == null) {
                return -1.0f;
            }
            this.ad.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
            return ((float) this.an.height()) / ((float) this.ad.getWindow().getDecorView().getHeight());
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.an(" + ')');
        }
    }

    public float au() {
        if (this.ad == null) {
            return -1.0f;
        }
        this.ad.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return ((float) this.an.height()) / ((float) this.ad.getWindow().getDecorView().getHeight());
    }

    public float av() {
        if (this.ad == null) {
            return -1.0f;
        }
        this.ad.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return ((float) this.an.height()) / ((float) this.ad.getWindow().getDecorView().getHeight());
    }

    public float ax() {
        if (this.ad == null) {
            return -1.0f;
        }
        this.ad.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.an);
        return ((float) this.an.height()) / ((float) this.ad.getWindow().getDecorView().getHeight());
    }

    public je aa(int i, int i2) {
        try {
            if (this.ay == null || this.ay.ai((byte) 11) != i) {
                cs(1320920397);
                this.ay = new ad(this.ad, i, this);
                this.ay.ah(client.ad.uq(351860073), (byte) 43);
            } else {
                this.ay.ap((byte) -90);
            }
            return this.ay;
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.aa(" + ')');
        }
    }

    public je ac(int i) {
        if (this.ay == null || this.ay.ai((byte) -55) != i) {
            cs(1657900953);
            this.ay = new ad(this.ad, i, this);
            this.ay.ah(client.ad.uq(1261303830), (byte) 22);
        } else {
            this.ay.ap((byte) 32);
        }
        return this.ay;
    }

    public je al(int i) {
        if (this.ay == null || this.ay.ai((byte) -25) != i) {
            cs(1911884070);
            this.ay = new ad(this.ad, i, this);
            this.ay.ah(client.ad.uq(-428596653), (byte) -22);
        } else {
            this.ay.ap((byte) -8);
        }
        return this.ay;
    }

    public je ap(int i) {
        if (this.ay == null || this.ay.ai((byte) -42) != i) {
            cs(2084770527);
            this.ay = new ad(this.ad, i, this);
            this.ay.ah(client.ad.uq(2062999609), (byte) 11);
        } else {
            this.ay.ap((byte) 96);
        }
        return this.ay;
    }

    public fx ag(byte[] bArr, int i) {
        try {
            return ar(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 2015506512);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.ag(" + ')');
        }
    }

    public fx bb(byte[] bArr) {
        return ar(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 2015506512);
    }

    public fx bc(byte[] bArr) {
        return ar(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 2015506512);
    }

    public fx bw(byte[] bArr) {
        return ar(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), 2015506512);
    }

    public Object ay(mi miVar, int i) {
        try {
            switch (miVar.an * -51971637) {
                case 0:
                    return as((byte) 5);
                case 1:
                    return aj(-47020436);
                default:
                    return null;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.ay(" + ')');
        }
    }

    public Object bg(mi miVar) {
        switch (miVar.an * -51971637) {
            case 0:
                return as((byte) 4);
            case 1:
                return aj(-47020436);
            default:
                return null;
        }
    }

    public Object bz(mi miVar) {
        switch (miVar.an * -51971637) {
            case 0:
                return as((byte) 49);
            case 1:
                return aj(-47020436);
            default:
                return null;
        }
    }

    fx as(byte b) {
        try {
            return ar(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.ad.getResources(), C0000R.drawable.jagex_logo), 377, 377, true), 2015506512);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.as(" + ')');
        }
    }

    fx bf() {
        return ar(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.ad.getResources(), 978621168), -1882221695, -1882221695, true), 2015506512);
    }

    fx bh() {
        return ar(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.ad.getResources(), C0000R.drawable.jagex_logo), 377, 377, true), 2015506512);
    }

    fx bv() {
        return ar(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.ad.getResources(), C0000R.drawable.jagex_logo), 377, 377, true), 2015506512);
    }

    fx ar(Bitmap bitmap, int i) {
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            return new fx(iArr, width, height);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.ar(" + ')');
        }
    }

    fx bp(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return new fx(iArr, width, height);
    }

    fx bt(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return new fx(iArr, width, height);
    }

    fx bx(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return new fx(iArr, width, height);
    }

    lr aj(int i) {
        try {
            byte[] bArr = new byte[((int) this.ad.getAssets().openFd("font.font").getLength())];
            byte[] bArr2 = new byte[((int) this.ad.getAssets().openFd("fontmetrics.font").getLength())];
            DataInputStream dataInputStream = new DataInputStream(this.ad.getAssets().open("font.font"));
            DataInputStream dataInputStream2 = new DataInputStream(this.ad.getAssets().open("fontmetrics.font"));
            dataInputStream.readFully(bArr);
            dataInputStream2.readFully(bArr2);
            try {
                return it.aq(bArr, bArr2, (byte) -10);
            } catch (Throwable e) {
                throw ba.ad(e, "com/jagex/oldscape/android/as.aj(" + ')');
            }
        } catch (IOException e2) {
            return null;
        }
    }

    lr be() {
        try {
            byte[] bArr = new byte[((int) this.ad.getAssets().openFd("font.font").getLength())];
            byte[] bArr2 = new byte[((int) this.ad.getAssets().openFd("fontmetrics.font").getLength())];
            DataInputStream dataInputStream = new DataInputStream(this.ad.getAssets().open("font.font"));
            DataInputStream dataInputStream2 = new DataInputStream(this.ad.getAssets().open("fontmetrics.font"));
            dataInputStream.readFully(bArr);
            dataInputStream2.readFully(bArr2);
            return it.aq(bArr, bArr2, (byte) -10);
        } catch (IOException e) {
            return null;
        }
    }

    lr bu() {
        try {
            byte[] bArr = new byte[((int) this.ad.getAssets().openFd("font.font").getLength())];
            byte[] bArr2 = new byte[((int) this.ad.getAssets().openFd("fontmetrics.font").getLength())];
            DataInputStream dataInputStream = new DataInputStream(this.ad.getAssets().open("font.font"));
            DataInputStream dataInputStream2 = new DataInputStream(this.ad.getAssets().open("fontmetrics.font"));
            dataInputStream.readFully(bArr);
            dataInputStream2.readFully(bArr2);
            return it.aq(bArr, bArr2, (byte) -10);
        } catch (IOException e) {
            return null;
        }
    }

    public float ae(int i) {
        try {
            Display defaultDisplay = this.ad.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return ((float) point.x) / ((float) point.y);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.ae(" + ')');
        }
    }

    public float bk() {
        Display defaultDisplay = this.ad.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return ((float) point.x) / ((float) point.y);
    }

    public float by() {
        Display defaultDisplay = this.ad.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return ((float) point.x) / ((float) point.y);
    }

    public void aq(int i) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
            this.ad.startActivity(intent);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.aq(" + ')');
        }
    }

    public void ba() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.ad.startActivity(intent);
    }

    public void bl() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.ad.startActivity(intent);
    }

    public void bn() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.jagex.oldscape.android"));
        this.ad.startActivity(intent);
    }

    public boolean am(byte b) {
        try {
            return this.aa;
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.am(" + ')');
        }
    }

    public boolean bd() {
        return this.aa;
    }

    public boolean bs() {
        return this.aa;
    }

    void at(boolean z, int i) {
        try {
            this.aa = z;
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.at(" + ')');
        }
    }

    void bm(boolean z) {
        this.aa = z;
    }

    void br(boolean z) {
        this.aa = z;
    }

    public void ab(int i) {
        try {
            this.ad.moveTaskToBack(true);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.ab(" + ')');
        }
    }

    public void bi() {
        this.ad.moveTaskToBack(true);
    }

    public void bj() {
        this.ad.moveTaskToBack(true);
    }

    public void bq() {
        this.ad.moveTaskToBack(true);
    }

    public void aw(boolean z, int i) {
        try {
            this.ad.runOnUiThread(new af(this, z));
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.aw(" + ')');
        }
    }

    public void bo(boolean z) {
        this.ad.runOnUiThread(new af(this, z));
    }

    public void cv(boolean z) {
        this.ad.runOnUiThread(new af(this, z));
    }

    public void ai(Runnable runnable, int i) {
        try {
            this.ad.runOnUiThread(runnable);
        } catch (Throwable e) {
            throw ba.ad(e, "com/jagex/oldscape/android/as.ai(" + ')');
        }
    }

    public void cc(Runnable runnable) {
        this.ad.runOnUiThread(runnable);
    }

    public void ci(Runnable runnable) {
        this.ad.runOnUiThread(runnable);
    }

    public void co(Runnable runnable) {
        this.ad.runOnUiThread(runnable);
    }

    public void cy(Runnable runnable) {
        this.ad.runOnUiThread(runnable);
    }
}
