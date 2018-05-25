package p000;

import java.lang.reflect.Array;

public final class iw {
    final int aa;
    byte ab;
    int[] ac;
    final int ad;
    byte[] ae;
    final int af;
    final int ag;
    int ah;
    int ai;
    int aj;
    int ak;
    int am;
    final int an;
    int ao;
    int ap;
    int aq;
    int ar;
    byte[] as;
    int at;
    int[] au;
    int av;
    int aw;
    int ax;
    final int ay;
    int az;
    boolean[] bb;
    byte[] bc;
    int be;
    byte[] bf;
    int[] bg;
    byte[] bh;
    int[][] bp;
    int[][] bt;
    int[] bu;
    byte[][] bv;
    boolean[] bw;
    int[][] bx;
    byte[] bz;

    iw() {
        try {
            this.af = jf.aq;
            this.ad = 16;
            this.an = 258;
            this.aa = 6;
            this.ag = 50;
            this.ay = 18002;
            this.ar = 0;
            this.aq = 0;
            this.au = new int[256];
            this.ac = new int[257];
            this.bw = new boolean[256];
            this.bb = new boolean[16];
            this.bc = new byte[256];
            this.bz = new byte[jf.aq];
            this.bg = new int[16];
            this.bh = new byte[18002];
            this.bf = new byte[18002];
            this.bv = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{6, 258});
            this.bp = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.bx = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.bt = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 258});
            this.bu = new int[6];
        } catch (Throwable e) {
            throw ba.ad(e, "iw.<init>(" + ')');
        }
    }

    public static String af(byte[] bArr, int i, int i2, int i3) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i4 = i; i4 < i + i2; i4 += 3) {
                int i5 = bArr[i4] & 255;
                stringBuilder.append(mt.af[i5 >>> 2]);
                if (i4 < i2 - 1) {
                    int i6 = bArr[i4 + 1] & 255;
                    stringBuilder.append(mt.af[((i5 & 3) << 4) | (i6 >>> 4)]);
                    if (i4 < i2 - 2) {
                        i5 = bArr[i4 + 2] & 255;
                        stringBuilder.append(mt.af[((i6 & 15) << 2) | (i5 >>> 6)]).append(mt.af[i5 & 63]);
                    } else {
                        stringBuilder.append(mt.af[(i6 & 15) << 2]).append("=");
                    }
                } else {
                    stringBuilder.append(mt.af[(i5 & 3) << 4]).append("==");
                }
            }
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw ba.ad(e, "iw.af(" + ')');
        }
    }
}
