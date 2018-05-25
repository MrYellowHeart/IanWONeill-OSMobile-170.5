package p000;

import java.nio.ByteBuffer;

public class ii extends ij {
    ByteBuffer ad;

    ii() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "ii.<init>(" + ')');
        }
    }

    byte[] aa(int i) {
        try {
            byte[] bArr = new byte[this.ad.capacity()];
            this.ad.position(0);
            this.ad.get(bArr);
            return bArr;
        } catch (Throwable e) {
            throw ba.ad(e, "ii.aa(" + ')');
        }
    }

    byte[] ab() {
        byte[] bArr = new byte[this.ad.capacity()];
        this.ad.position(0);
        this.ad.get(bArr);
        return bArr;
    }

    byte[] aw() {
        byte[] bArr = new byte[this.ad.capacity()];
        this.ad.position(0);
        this.ad.get(bArr);
        return bArr;
    }

    void ag(byte[] bArr, int i) {
        try {
            this.ad = ByteBuffer.allocateDirect(bArr.length);
            this.ad.position(0);
            this.ad.put(bArr);
        } catch (Throwable e) {
            throw ba.ad(e, "ii.ag(" + ')');
        }
    }

    void ai(byte[] bArr) {
        this.ad = ByteBuffer.allocateDirect(bArr.length);
        this.ad.position(0);
        this.ad.put(bArr);
    }

    void az(byte[] bArr) {
        this.ad = ByteBuffer.allocateDirect(bArr.length);
        this.ad.position(0);
        this.ad.put(bArr);
    }
}
