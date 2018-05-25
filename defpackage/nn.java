package p000;

import java.io.EOFException;
import java.io.IOException;

public class nn {
    int aa;
    byte[] ad;
    long ae;
    nw af;
    byte[] ag;
    long aj;
    long an;
    long aq;
    long ar;
    int as;
    long ay;

    public nn(nw nwVar, int i, int i2) throws IOException {
        try {
            this.an = 2179898814543714021L;
            this.ay = 472725623425503385L;
            this.as = 0;
            this.af = nwVar;
            long ag = nwVar.ag(2057608795) * 1114027514879369957L;
            this.aj = ag;
            this.ae = ag * -6111940843886946427L;
            this.ad = new byte[i];
            this.ag = new byte[i2];
            this.ar = 0;
        } catch (Throwable e) {
            throw ba.ad(e, "nn.<init>(" + ')');
        }
    }

    public void ae() throws IOException {
        ar(-1891125449);
        this.af.an(420907623);
    }

    public void af(byte b) throws IOException {
        try {
            ar(-1805440642);
            this.af.an(420907623);
        } catch (Throwable e) {
            throw ba.ad(e, "nn.af(" + ')');
        }
    }

    public void aj() throws IOException {
        ar(-1839044699);
        this.af.an(420907623);
    }

    public void ad(long j) throws IOException {
        if (j < 0) {
            try {
                throw new IOException("");
            } catch (Throwable e) {
                throw ba.ad(e, "nn.ad(" + ')');
            }
        }
        this.ar = 6567201253033567821L * j;
    }

    public void am(long j) throws IOException {
        if (j < 0) {
            throw new IOException("");
        }
        this.ar = 6567201253033567821L * j;
    }

    public void aq(long j) throws IOException {
        if (j < 0) {
            throw new IOException("");
        }
        this.ar = 6567201253033567821L * j;
    }

    public long ab() {
        return -5327026315961459127L * this.ae;
    }

    public long an(short s) {
        try {
            return -5327026315961459127L * this.ae;
        } catch (Throwable e) {
            throw ba.ad(e, "nn.an(" + ')');
        }
    }

    public long at() {
        return -5327026315961459127L * this.ae;
    }

    public void aa(byte[] bArr, byte b) throws IOException {
        try {
            ag(bArr, 0, bArr.length, -606087449);
        } catch (Throwable e) {
            throw ba.ad(e, "nn.aa(" + ')');
        }
    }

    public void ai(byte[] bArr) throws IOException {
        ag(bArr, 0, bArr.length, -606087449);
    }

    public void aw(byte[] bArr) throws IOException {
        ag(bArr, 0, bArr.length, -606087449);
    }

    public void az(byte[] bArr) throws IOException {
        ag(bArr, 0, bArr.length, -606087449);
    }

    public void ag(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if (i2 + i > bArr.length) {
                throw new ArrayIndexOutOfBoundsException((i2 + i) - bArr.length);
            } else if (-1 == this.ay * 3134483291187657815L || -6693291830970498427L * this.ar < 3134483291187657815L * this.ay || ((long) i2) + (this.ar * -6693291830970498427L) > ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                int i4;
                int i5;
                int ay;
                long j = -6693291830970498427L * this.ar;
                if (-6693291830970498427L * this.ar < this.an * 3483330859842504979L || -6693291830970498427L * this.ar >= (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    i4 = i2;
                    i5 = i;
                } else {
                    i4 = (int) (((long) (this.aa * 1511913821)) - ((this.ar * -6693291830970498427L) - (3483330859842504979L * this.an)));
                    if (i4 > i2) {
                        i4 = i2;
                    }
                    System.arraycopy(this.ad, (int) ((this.ar * -6693291830970498427L) - (this.an * 3483330859842504979L)), bArr, i, i4);
                    this.ar += ((long) i4) * 6567201253033567821L;
                    i5 = i + i4;
                    i4 = i2 - i4;
                }
                if (i4 > this.ad.length) {
                    this.af.af(-6693291830970498427L * this.ar);
                    this.aq = this.ar * 4947570184559919829L;
                    while (i4 > 0) {
                        ay = this.af.ay(bArr, i5, i4, (byte) -1);
                        if (-1 == ay) {
                            break;
                        }
                        this.aq += ((long) ay) * -4373627620404348911L;
                        this.ar += 6567201253033567821L * ((long) ay);
                        i5 += ay;
                        i4 -= ay;
                    }
                } else if (i4 > 0) {
                    ay(724203974);
                    if (i4 > this.aa * 1511913821) {
                        ay = 1511913821 * this.aa;
                    } else {
                        ay = i4;
                    }
                    System.arraycopy(this.ad, 0, bArr, i5, ay);
                    i5 += ay;
                    i4 -= ay;
                    this.ar += 6567201253033567821L * ((long) ay);
                }
                if (-1 != 3134483291187657815L * this.ay) {
                    if (this.ay * 3134483291187657815L > this.ar * -6693291830970498427L && i4 > 0) {
                        ay = ((int) ((this.ay * 3134483291187657815L) - (-6693291830970498427L * this.ar))) + i5;
                        if (ay > i5 + i4) {
                            ay = i4 + i5;
                        }
                        while (i5 < ay) {
                            int i6 = i5 + 1;
                            bArr[i5] = (byte) 0;
                            i4--;
                            this.ar += 6567201253033567821L;
                            i5 = i6;
                        }
                    }
                    long j2 = -1;
                    long j3 = -1;
                    if (this.ay * 3134483291187657815L >= j && 3134483291187657815L * this.ay < ((long) i2) + j) {
                        j2 = this.ay * 3134483291187657815L;
                    } else if (j >= 3134483291187657815L * this.ay && j < (3134483291187657815L * this.ay) + ((long) (this.as * -475933495))) {
                        j2 = j;
                    }
                    if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > j && ((long) (-475933495 * this.as)) + (this.ay * 3134483291187657815L) <= ((long) i2) + j) {
                        j3 = ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay);
                    } else if (((long) i2) + j > this.ay * 3134483291187657815L && ((long) i2) + j <= ((long) (this.as * -475933495)) + (3134483291187657815L * this.ay)) {
                        j3 = ((long) i2) + j;
                    }
                    if (j2 > -1 && j3 > j2) {
                        Object obj = bArr;
                        System.arraycopy(this.ag, (int) (j2 - (3134483291187657815L * this.ay)), obj, ((int) (j2 - j)) + i, (int) (j3 - j2));
                        if (j3 > this.ar * -6693291830970498427L) {
                            i4 = (int) (((long) i4) - (j3 - (this.ar * -6693291830970498427L)));
                            this.ar = j3 * 6567201253033567821L;
                        }
                    }
                }
                if (i4 > 0) {
                    throw new EOFException();
                }
            } else {
                System.arraycopy(this.ag, (int) ((-6693291830970498427L * this.ar) - (this.ay * 3134483291187657815L)), bArr, i, i2);
                this.ar += ((long) i2) * 6567201253033567821L;
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        } catch (Throwable e2) {
            throw ba.ad(e2, "nn.ag(" + ')');
        }
    }

    public void ah(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (i2 + i > bArr.length) {
                throw new ArrayIndexOutOfBoundsException((i2 + i) - bArr.length);
            } else if (-1 == this.ay * 3134483291187657815L || -6693291830970498427L * this.ar < 3134483291187657815L * this.ay || ((long) i2) + (this.ar * -6693291830970498427L) > ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                int i3;
                int i4;
                int ay;
                long j = -6693291830970498427L * this.ar;
                if (-6693291830970498427L * this.ar < this.an * 3483330859842504979L || -6693291830970498427L * this.ar >= (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    i3 = i2;
                    i4 = i;
                } else {
                    i3 = (int) (((long) (this.aa * 1511913821)) - ((this.ar * -6693291830970498427L) - (3483330859842504979L * this.an)));
                    if (i3 > i2) {
                        i3 = i2;
                    }
                    System.arraycopy(this.ad, (int) ((this.ar * -6693291830970498427L) - (this.an * 3483330859842504979L)), bArr, i, i3);
                    this.ar += ((long) i3) * 6567201253033567821L;
                    i4 = i + i3;
                    i3 = i2 - i3;
                }
                if (i3 > this.ad.length) {
                    this.af.af(-6693291830970498427L * this.ar);
                    this.aq = this.ar * 4947570184559919829L;
                    while (i3 > 0) {
                        ay = this.af.ay(bArr, i4, i3, (byte) 31);
                        if (-1 == ay) {
                            break;
                        }
                        this.aq += ((long) ay) * -4373627620404348911L;
                        this.ar += 6567201253033567821L * ((long) ay);
                        i4 += ay;
                        i3 -= ay;
                    }
                } else if (i3 > 0) {
                    ay(724203974);
                    if (i3 > this.aa * 1511913821) {
                        ay = 1511913821 * this.aa;
                    } else {
                        ay = i3;
                    }
                    System.arraycopy(this.ad, 0, bArr, i4, ay);
                    i4 += ay;
                    i3 -= ay;
                    this.ar += 6567201253033567821L * ((long) ay);
                }
                if (-1 != 3134483291187657815L * this.ay) {
                    if (this.ay * 3134483291187657815L > this.ar * -6693291830970498427L && i3 > 0) {
                        ay = ((int) ((this.ay * 3134483291187657815L) - (-6693291830970498427L * this.ar))) + i4;
                        if (ay > i4 + i3) {
                            ay = i3 + i4;
                        }
                        while (i4 < ay) {
                            int i5 = i4 + 1;
                            bArr[i4] = (byte) 0;
                            i3--;
                            this.ar += 6567201253033567821L;
                            i4 = i5;
                        }
                    }
                    long j2 = -1;
                    long j3 = -1;
                    if (this.ay * 3134483291187657815L >= j && 3134483291187657815L * this.ay < ((long) i2) + j) {
                        j2 = this.ay * 3134483291187657815L;
                    } else if (j >= 3134483291187657815L * this.ay && j < (3134483291187657815L * this.ay) + ((long) (this.as * -475933495))) {
                        j2 = j;
                    }
                    if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > j && ((long) (-475933495 * this.as)) + (this.ay * 3134483291187657815L) <= ((long) i2) + j) {
                        j3 = ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay);
                    } else if (((long) i2) + j > this.ay * 3134483291187657815L && ((long) i2) + j <= ((long) (this.as * -475933495)) + (3134483291187657815L * this.ay)) {
                        j3 = ((long) i2) + j;
                    }
                    if (j2 > -1 && j3 > j2) {
                        Object obj = bArr;
                        System.arraycopy(this.ag, (int) (j2 - (3134483291187657815L * this.ay)), obj, ((int) (j2 - j)) + i, (int) (j3 - j2));
                        if (j3 > this.ar * -6693291830970498427L) {
                            i3 = (int) (((long) i3) - (j3 - (this.ar * -6693291830970498427L)));
                            this.ar = j3 * 6567201253033567821L;
                        }
                    }
                }
                if (i3 > 0) {
                    throw new EOFException();
                }
            } else {
                System.arraycopy(this.ag, (int) ((-6693291830970498427L * this.ar) - (this.ay * 3134483291187657815L)), bArr, i, i2);
                this.ar += ((long) i2) * 6567201253033567821L;
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        }
    }

    public void ak(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (i2 + i > bArr.length) {
                throw new ArrayIndexOutOfBoundsException((i2 + i) - bArr.length);
            } else if (-1 == this.ay * 3134483291187657815L || -6693291830970498427L * this.ar < 3134483291187657815L * this.ay || ((long) i2) + (this.ar * -6693291830970498427L) > ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                int i3;
                int i4;
                int ay;
                long j = -6693291830970498427L * this.ar;
                if (-6693291830970498427L * this.ar < this.an * 3483330859842504979L || -6693291830970498427L * this.ar >= (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    i3 = i2;
                    i4 = i;
                } else {
                    i3 = (int) (((long) (this.aa * 1511913821)) - ((this.ar * -6693291830970498427L) - (3483330859842504979L * this.an)));
                    if (i3 > i2) {
                        i3 = i2;
                    }
                    System.arraycopy(this.ad, (int) ((this.ar * -6693291830970498427L) - (this.an * 3483330859842504979L)), bArr, i, i3);
                    this.ar += ((long) i3) * 6567201253033567821L;
                    i4 = i + i3;
                    i3 = i2 - i3;
                }
                if (i3 > this.ad.length) {
                    this.af.af(-6693291830970498427L * this.ar);
                    this.aq = this.ar * 4947570184559919829L;
                    while (i3 > 0) {
                        ay = this.af.ay(bArr, i4, i3, (byte) 69);
                        if (-1 == ay) {
                            break;
                        }
                        this.aq += ((long) ay) * -4373627620404348911L;
                        this.ar += 6567201253033567821L * ((long) ay);
                        i4 += ay;
                        i3 -= ay;
                    }
                } else if (i3 > 0) {
                    ay(724203974);
                    if (i3 > this.aa * 1511913821) {
                        ay = 1511913821 * this.aa;
                    } else {
                        ay = i3;
                    }
                    System.arraycopy(this.ad, 0, bArr, i4, ay);
                    i4 += ay;
                    i3 -= ay;
                    this.ar += 6567201253033567821L * ((long) ay);
                }
                if (-1 != 3134483291187657815L * this.ay) {
                    if (this.ay * 3134483291187657815L > this.ar * -6693291830970498427L && i3 > 0) {
                        ay = ((int) ((this.ay * 3134483291187657815L) - (-6693291830970498427L * this.ar))) + i4;
                        if (ay > i4 + i3) {
                            ay = i3 + i4;
                        }
                        while (i4 < ay) {
                            int i5 = i4 + 1;
                            bArr[i4] = (byte) 0;
                            i3--;
                            this.ar += 6567201253033567821L;
                            i4 = i5;
                        }
                    }
                    long j2 = -1;
                    long j3 = -1;
                    if (this.ay * 3134483291187657815L >= j && 3134483291187657815L * this.ay < ((long) i2) + j) {
                        j2 = this.ay * 3134483291187657815L;
                    } else if (j >= 3134483291187657815L * this.ay && j < (3134483291187657815L * this.ay) + ((long) (this.as * -475933495))) {
                        j2 = j;
                    }
                    if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > j && ((long) (-475933495 * this.as)) + (this.ay * 3134483291187657815L) <= ((long) i2) + j) {
                        j3 = ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay);
                    } else if (((long) i2) + j > this.ay * 3134483291187657815L && ((long) i2) + j <= ((long) (this.as * -475933495)) + (3134483291187657815L * this.ay)) {
                        j3 = ((long) i2) + j;
                    }
                    if (j2 > -1 && j3 > j2) {
                        Object obj = bArr;
                        System.arraycopy(this.ag, (int) (j2 - (3134483291187657815L * this.ay)), obj, ((int) (j2 - j)) + i, (int) (j3 - j2));
                        if (j3 > this.ar * -6693291830970498427L) {
                            i3 = (int) (((long) i3) - (j3 - (this.ar * -6693291830970498427L)));
                            this.ar = j3 * 6567201253033567821L;
                        }
                    }
                }
                if (i3 > 0) {
                    throw new EOFException();
                }
            } else {
                System.arraycopy(this.ag, (int) ((-6693291830970498427L * this.ar) - (this.ay * 3134483291187657815L)), bArr, i, i2);
                this.ar += ((long) i2) * 6567201253033567821L;
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        }
    }

    public void ao(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (i2 + i > bArr.length) {
                throw new ArrayIndexOutOfBoundsException((i2 + i) - bArr.length);
            } else if (-1 == this.ay * 3134483291187657815L || -6693291830970498427L * this.ar < 3134483291187657815L * this.ay || ((long) i2) + (this.ar * -6693291830970498427L) > ((long) (1372562421 * this.as)) + (3134483291187657815L * this.ay)) {
                int i3;
                int i4;
                int ay;
                long j = -6693291830970498427L * this.ar;
                if (-6693291830970498427L * this.ar < this.an * 3483330859842504979L || -6693291830970498427L * this.ar >= (this.an * 3483330859842504979L) + ((long) (673609040 * this.aa))) {
                    i3 = i2;
                    i4 = i;
                } else {
                    i3 = (int) (((long) (this.aa * 1511913821)) - ((this.ar * -6693291830970498427L) - (3483330859842504979L * this.an)));
                    if (i3 > i2) {
                        i3 = i2;
                    }
                    System.arraycopy(this.ad, (int) ((this.ar * -6693291830970498427L) - (this.an * 3483330859842504979L)), bArr, i, i3);
                    this.ar += ((long) i3) * 6567201253033567821L;
                    i4 = i + i3;
                    i3 = i2 - i3;
                }
                if (i3 > this.ad.length) {
                    this.af.af(-6693291830970498427L * this.ar);
                    this.aq = this.ar * 4947570184559919829L;
                    while (i3 > 0) {
                        ay = this.af.ay(bArr, i4, i3, (byte) -33);
                        if (-1 == ay) {
                            break;
                        }
                        this.aq += ((long) ay) * -4373627620404348911L;
                        this.ar += 6567201253033567821L * ((long) ay);
                        i4 += ay;
                        i3 -= ay;
                    }
                } else if (i3 > 0) {
                    ay(724203974);
                    if (i3 > this.aa * 1511913821) {
                        ay = 1511913821 * this.aa;
                    } else {
                        ay = i3;
                    }
                    System.arraycopy(this.ad, 0, bArr, i4, ay);
                    i4 += ay;
                    i3 -= ay;
                    this.ar += 6567201253033567821L * ((long) ay);
                }
                if (-1 != 3134483291187657815L * this.ay) {
                    if (this.ay * 3134483291187657815L > this.ar * -6693291830970498427L && i3 > 0) {
                        ay = ((int) ((this.ay * 3134483291187657815L) - (-6693291830970498427L * this.ar))) + i4;
                        if (ay > i4 + i3) {
                            ay = i3 + i4;
                        }
                        while (i4 < ay) {
                            int i5 = i4 + 1;
                            bArr[i4] = (byte) 0;
                            i3--;
                            this.ar += 6567201253033567821L;
                            i4 = i5;
                        }
                    }
                    long j2 = -1;
                    long j3 = -1;
                    if (this.ay * 3134483291187657815L >= j && 3134483291187657815L * this.ay < ((long) i2) + j) {
                        j2 = this.ay * 3134483291187657815L;
                    } else if (j >= 3134483291187657815L * this.ay && j < (3134483291187657815L * this.ay) + ((long) (this.as * -1824830833))) {
                        j2 = j;
                    }
                    if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > j && ((long) (-475933495 * this.as)) + (this.ay * 3134483291187657815L) <= ((long) i2) + j) {
                        j3 = ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay);
                    } else if (((long) i2) + j > this.ay * 3134483291187657815L && ((long) i2) + j <= ((long) (this.as * -1306800297)) + (3134483291187657815L * this.ay)) {
                        j3 = ((long) i2) + j;
                    }
                    if (j2 > -1 && j3 > j2) {
                        Object obj = bArr;
                        System.arraycopy(this.ag, (int) (j2 - (3134483291187657815L * this.ay)), obj, ((int) (j2 - j)) + i, (int) (j3 - j2));
                        if (j3 > this.ar * -6693291830970498427L) {
                            i3 = (int) (((long) i3) - (j3 - (this.ar * -6693291830970498427L)));
                            this.ar = j3 * 6567201253033567821L;
                        }
                    }
                }
                if (i3 > 0) {
                    throw new EOFException();
                }
            } else {
                System.arraycopy(this.ag, (int) ((-6693291830970498427L * this.ar) - (this.ay * 3134483291187657815L)), bArr, i, i2);
                this.ar += ((long) i2) * 6567201253033567821L;
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        }
    }

    public void au(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (i2 + i > bArr.length) {
                throw new ArrayIndexOutOfBoundsException((i2 + i) - bArr.length);
            } else if (-1 == this.ay * 3134483291187657815L || -6693291830970498427L * this.ar < 3134483291187657815L * this.ay || ((long) i2) + (this.ar * -6693291830970498427L) > ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                int i3;
                int i4;
                int ay;
                long j = -6693291830970498427L * this.ar;
                if (-6693291830970498427L * this.ar < this.an * 3483330859842504979L || -6693291830970498427L * this.ar >= (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    i3 = i2;
                    i4 = i;
                } else {
                    i3 = (int) (((long) (this.aa * 1511913821)) - ((this.ar * -6693291830970498427L) - (3483330859842504979L * this.an)));
                    if (i3 > i2) {
                        i3 = i2;
                    }
                    System.arraycopy(this.ad, (int) ((this.ar * -6693291830970498427L) - (this.an * 3483330859842504979L)), bArr, i, i3);
                    this.ar += ((long) i3) * 6567201253033567821L;
                    i4 = i + i3;
                    i3 = i2 - i3;
                }
                if (i3 > this.ad.length) {
                    this.af.af(-6693291830970498427L * this.ar);
                    this.aq = this.ar * 4947570184559919829L;
                    while (i3 > 0) {
                        ay = this.af.ay(bArr, i4, i3, (byte) -62);
                        if (-1 == ay) {
                            break;
                        }
                        this.aq += ((long) ay) * -4373627620404348911L;
                        this.ar += 6567201253033567821L * ((long) ay);
                        i4 += ay;
                        i3 -= ay;
                    }
                } else if (i3 > 0) {
                    ay(724203974);
                    if (i3 > this.aa * 1511913821) {
                        ay = 1511913821 * this.aa;
                    } else {
                        ay = i3;
                    }
                    System.arraycopy(this.ad, 0, bArr, i4, ay);
                    i4 += ay;
                    i3 -= ay;
                    this.ar += 6567201253033567821L * ((long) ay);
                }
                if (-1 != 3134483291187657815L * this.ay) {
                    if (this.ay * 3134483291187657815L > this.ar * -6693291830970498427L && i3 > 0) {
                        ay = ((int) ((this.ay * 3134483291187657815L) - (-6693291830970498427L * this.ar))) + i4;
                        if (ay > i4 + i3) {
                            ay = i3 + i4;
                        }
                        while (i4 < ay) {
                            int i5 = i4 + 1;
                            bArr[i4] = (byte) 0;
                            i3--;
                            this.ar += 6567201253033567821L;
                            i4 = i5;
                        }
                    }
                    long j2 = -1;
                    long j3 = -1;
                    if (this.ay * 3134483291187657815L >= j && 3134483291187657815L * this.ay < ((long) i2) + j) {
                        j2 = this.ay * 3134483291187657815L;
                    } else if (j >= 3134483291187657815L * this.ay && j < (3134483291187657815L * this.ay) + ((long) (this.as * -475933495))) {
                        j2 = j;
                    }
                    if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > j && ((long) (-475933495 * this.as)) + (this.ay * 3134483291187657815L) <= ((long) i2) + j) {
                        j3 = ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay);
                    } else if (((long) i2) + j > this.ay * 3134483291187657815L && ((long) i2) + j <= ((long) (this.as * -475933495)) + (3134483291187657815L * this.ay)) {
                        j3 = ((long) i2) + j;
                    }
                    if (j2 > -1 && j3 > j2) {
                        Object obj = bArr;
                        System.arraycopy(this.ag, (int) (j2 - (3134483291187657815L * this.ay)), obj, ((int) (j2 - j)) + i, (int) (j3 - j2));
                        if (j3 > this.ar * -6693291830970498427L) {
                            i3 = (int) (((long) i3) - (j3 - (this.ar * -6693291830970498427L)));
                            this.ar = j3 * 6567201253033567821L;
                        }
                    }
                }
                if (i3 > 0) {
                    throw new EOFException();
                }
            } else {
                System.arraycopy(this.ag, (int) ((-6693291830970498427L * this.ar) - (this.ay * 3134483291187657815L)), bArr, i, i2);
                this.ar += ((long) i2) * 6567201253033567821L;
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        }
    }

    public void ax(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (i2 + i > bArr.length) {
                throw new ArrayIndexOutOfBoundsException((i2 + i) - bArr.length);
            } else if (-1 == this.ay * 3134483291187657815L || -6693291830970498427L * this.ar < 3134483291187657815L * this.ay || ((long) i2) + (this.ar * -6693291830970498427L) > ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                int i3;
                int i4;
                int ay;
                long j = -6693291830970498427L * this.ar;
                if (-6693291830970498427L * this.ar < this.an * 3483330859842504979L || -6693291830970498427L * this.ar >= (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    i3 = i2;
                    i4 = i;
                } else {
                    i3 = (int) (((long) (this.aa * 1511913821)) - ((this.ar * -6693291830970498427L) - (3483330859842504979L * this.an)));
                    if (i3 > i2) {
                        i3 = i2;
                    }
                    System.arraycopy(this.ad, (int) ((this.ar * -6693291830970498427L) - (this.an * 3483330859842504979L)), bArr, i, i3);
                    this.ar += ((long) i3) * 6567201253033567821L;
                    i4 = i + i3;
                    i3 = i2 - i3;
                }
                if (i3 > this.ad.length) {
                    this.af.af(-6693291830970498427L * this.ar);
                    this.aq = this.ar * 4947570184559919829L;
                    while (i3 > 0) {
                        ay = this.af.ay(bArr, i4, i3, (byte) -9);
                        if (-1 == ay) {
                            break;
                        }
                        this.aq += ((long) ay) * -4373627620404348911L;
                        this.ar += 6567201253033567821L * ((long) ay);
                        i4 += ay;
                        i3 -= ay;
                    }
                } else if (i3 > 0) {
                    ay(724203974);
                    if (i3 > this.aa * 1511913821) {
                        ay = 1511913821 * this.aa;
                    } else {
                        ay = i3;
                    }
                    System.arraycopy(this.ad, 0, bArr, i4, ay);
                    i4 += ay;
                    i3 -= ay;
                    this.ar += 6567201253033567821L * ((long) ay);
                }
                if (-1 != 3134483291187657815L * this.ay) {
                    if (this.ay * 3134483291187657815L > this.ar * -6693291830970498427L && i3 > 0) {
                        ay = ((int) ((this.ay * 3134483291187657815L) - (-6693291830970498427L * this.ar))) + i4;
                        if (ay > i4 + i3) {
                            ay = i3 + i4;
                        }
                        while (i4 < ay) {
                            int i5 = i4 + 1;
                            bArr[i4] = (byte) 0;
                            i3--;
                            this.ar += 6567201253033567821L;
                            i4 = i5;
                        }
                    }
                    long j2 = -1;
                    long j3 = -1;
                    if (this.ay * 3134483291187657815L >= j && 3134483291187657815L * this.ay < ((long) i2) + j) {
                        j2 = this.ay * 3134483291187657815L;
                    } else if (j >= 3134483291187657815L * this.ay && j < (3134483291187657815L * this.ay) + ((long) (this.as * -475933495))) {
                        j2 = j;
                    }
                    if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > j && ((long) (-475933495 * this.as)) + (this.ay * 3134483291187657815L) <= ((long) i2) + j) {
                        j3 = ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay);
                    } else if (((long) i2) + j > this.ay * 3134483291187657815L && ((long) i2) + j <= ((long) (this.as * -475933495)) + (3134483291187657815L * this.ay)) {
                        j3 = ((long) i2) + j;
                    }
                    if (j2 > -1 && j3 > j2) {
                        Object obj = bArr;
                        System.arraycopy(this.ag, (int) (j2 - (3134483291187657815L * this.ay)), obj, ((int) (j2 - j)) + i, (int) (j3 - j2));
                        if (j3 > this.ar * -6693291830970498427L) {
                            i3 = (int) (((long) i3) - (j3 - (this.ar * -6693291830970498427L)));
                            this.ar = j3 * 6567201253033567821L;
                        }
                    }
                }
                if (i3 > 0) {
                    throw new EOFException();
                }
            } else {
                System.arraycopy(this.ag, (int) ((-6693291830970498427L * this.ar) - (this.ay * 3134483291187657815L)), bArr, i, i2);
                this.ar += ((long) i2) * 6567201253033567821L;
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        }
    }

    void ac() throws IOException {
        this.aa = 0;
        if (this.ar * -6693291830970498427L != this.aq * -3350398878597138191L) {
            this.af.af(this.ar * -6693291830970498427L);
            this.aq = 4947570184559919829L * this.ar;
        }
        this.an = this.ar * 3854352939879190791L;
        while (this.aa * 1511913821 < this.ad.length) {
            int ay = this.af.ay(this.ad, this.aa * 1511913821, this.ad.length - (this.aa * 1511913821), (byte) 35);
            if (ay != -1) {
                this.aq += -4373627620404348911L * ((long) ay);
                this.aa = (ay * 1373250293) + this.aa;
            } else {
                return;
            }
        }
    }

    void al() throws IOException {
        this.aa = 0;
        if (this.ar * -6693291830970498427L != this.aq * -3350398878597138191L) {
            this.af.af(this.ar * -6693291830970498427L);
            this.aq = 4947570184559919829L * this.ar;
        }
        this.an = this.ar * 3854352939879190791L;
        while (this.aa * 1511913821 < this.ad.length) {
            int ay = this.af.ay(this.ad, this.aa * -394273915, this.ad.length - (this.aa * 1511913821), (byte) 37);
            if (ay != -1) {
                this.aq += -4373627620404348911L * ((long) ay);
                this.aa = (ay * 1373250293) + this.aa;
            } else {
                return;
            }
        }
    }

    void av() throws IOException {
        this.aa = 0;
        if (this.ar * -6693291830970498427L != this.aq * -3350398878597138191L) {
            this.af.af(this.ar * -6693291830970498427L);
            this.aq = 4947570184559919829L * this.ar;
        }
        this.an = this.ar * 3854352939879190791L;
        while (-857938112 * this.aa < this.ad.length) {
            int ay = this.af.ay(this.ad, this.aa * 840740721, this.ad.length - (this.aa * -1425881636), (byte) -28);
            if (ay != -1) {
                this.aq += -4373627620404348911L * ((long) ay);
                this.aa = (ay * 1373250293) + this.aa;
            } else {
                return;
            }
        }
    }

    void ay(int i) throws IOException {
        try {
            this.aa = 0;
            if (this.ar * -6693291830970498427L != this.aq * -3350398878597138191L) {
                this.af.af(this.ar * -6693291830970498427L);
                this.aq = 4947570184559919829L * this.ar;
            }
            this.an = this.ar * 3854352939879190791L;
            while (this.aa * 1511913821 < this.ad.length) {
                int ay = this.af.ay(this.ad, this.aa * 1511913821, this.ad.length - (this.aa * 1511913821), (byte) -10);
                if (ay != -1) {
                    this.aq += -4373627620404348911L * ((long) ay);
                    this.aa = (ay * 1373250293) + this.aa;
                } else {
                    return;
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "nn.ay(" + ')');
        }
    }

    public void ap(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (((long) i2) + (-6693291830970498427L * this.ar) > this.ae * -5327026315961459127L) {
                this.ae = -6069604170517924871L * ((-6693291830970498427L * this.ar) + ((long) i2));
            }
            if (-1 != 3134483291187657815L * this.ay && (-6693291830970498427L * this.ar < 3134483291187657815L * this.ay || -6693291830970498427L * this.ar > (this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)))) {
                ar(-1982166192);
            }
            if (3134483291187657815L * this.ay != -1 && (-6693291830970498427L * this.ar) + ((long) i2) > ((long) this.ag.length) + (3134483291187657815L * this.ay)) {
                int length = (int) (((long) this.ag.length) - ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                System.arraycopy(bArr, i, this.ag, (int) ((this.ar * -6693291830970498427L) - (this.ay * 3134483291187657815L)), length);
                this.ar += ((long) length) * 6567201253033567821L;
                i += length;
                i2 -= length;
                this.as = this.ag.length * -163150471;
                ar(-2098835868);
            }
            if (i2 > this.ag.length) {
                if (this.ar * -6693291830970498427L != this.aq * -3350398878597138191L) {
                    this.af.af(this.ar * -6693291830970498427L);
                    this.aq = this.ar * 4947570184559919829L;
                }
                this.af.ad(bArr, i, i2, 1590375725);
                this.aq += ((long) i2) * -4373627620404348911L;
                if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                    this.aj = this.aq * 5831341056068923797L;
                }
                long j = -1;
                long j2 = -1;
                if (this.ar * -6693291830970498427L >= 3483330859842504979L * this.an && -6693291830970498427L * this.ar < (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    j = this.ar * -6693291830970498427L;
                } else if (this.an * 3483330859842504979L >= this.ar * -6693291830970498427L && this.an * 3483330859842504979L < (-6693291830970498427L * this.ar) + ((long) i2)) {
                    j = this.an * 3483330859842504979L;
                }
                if (((long) i2) + (-6693291830970498427L * this.ar) > this.an * 3483330859842504979L && (this.ar * -6693291830970498427L) + ((long) i2) <= ((long) (1511913821 * this.aa)) + (this.an * 3483330859842504979L)) {
                    j2 = (-6693291830970498427L * this.ar) + ((long) i2);
                } else if (((long) (this.aa * 1511913821)) + (3483330859842504979L * this.an) > this.ar * -6693291830970498427L && ((long) (this.aa * 1511913821)) + (this.an * 3483330859842504979L) <= ((long) i2) + (this.ar * -6693291830970498427L)) {
                    j2 = (3483330859842504979L * this.an) + ((long) (this.aa * 1511913821));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ar * -6693291830970498427L)), this.ad, (int) (j - (3483330859842504979L * this.an)), (int) (j2 - j));
                }
                this.ar += ((long) i2) * 6567201253033567821L;
            } else if (i2 > 0) {
                if (-1 == this.ay * 3134483291187657815L) {
                    this.ay = 3915208806857371267L * this.ar;
                }
                System.arraycopy(bArr, i, this.ag, (int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)), i2);
                this.ar += 6567201253033567821L * ((long) i2);
                if ((this.ar * -6693291830970498427L) - (3134483291187657815L * this.ay) > ((long) (this.as * -475933495))) {
                    this.as = -163150471 * ((int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                }
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        }
    }

    public void as(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if (((long) i2) + (-6693291830970498427L * this.ar) > this.ae * -5327026315961459127L) {
                this.ae = -6069604170517924871L * ((-6693291830970498427L * this.ar) + ((long) i2));
            }
            if (-1 != 3134483291187657815L * this.ay && (-6693291830970498427L * this.ar < 3134483291187657815L * this.ay || -6693291830970498427L * this.ar > (this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)))) {
                ar(-2099107562);
            }
            if (3134483291187657815L * this.ay != -1 && (-6693291830970498427L * this.ar) + ((long) i2) > ((long) this.ag.length) + (3134483291187657815L * this.ay)) {
                int length = (int) (((long) this.ag.length) - ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                System.arraycopy(bArr, i, this.ag, (int) ((this.ar * -6693291830970498427L) - (this.ay * 3134483291187657815L)), length);
                this.ar += ((long) length) * 6567201253033567821L;
                i += length;
                i2 -= length;
                this.as = this.ag.length * -163150471;
                ar(-1837044326);
            }
            if (i2 > this.ag.length) {
                if (this.ar * -6693291830970498427L != this.aq * -3350398878597138191L) {
                    this.af.af(this.ar * -6693291830970498427L);
                    this.aq = this.ar * 4947570184559919829L;
                }
                this.af.ad(bArr, i, i2, 1049323154);
                this.aq += ((long) i2) * -4373627620404348911L;
                if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                    this.aj = this.aq * 5831341056068923797L;
                }
                long j = -1;
                long j2 = -1;
                if (this.ar * -6693291830970498427L >= 3483330859842504979L * this.an && -6693291830970498427L * this.ar < (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    j = this.ar * -6693291830970498427L;
                } else if (this.an * 3483330859842504979L >= this.ar * -6693291830970498427L && this.an * 3483330859842504979L < (-6693291830970498427L * this.ar) + ((long) i2)) {
                    j = this.an * 3483330859842504979L;
                }
                if (((long) i2) + (-6693291830970498427L * this.ar) > this.an * 3483330859842504979L && (this.ar * -6693291830970498427L) + ((long) i2) <= ((long) (1511913821 * this.aa)) + (this.an * 3483330859842504979L)) {
                    j2 = (-6693291830970498427L * this.ar) + ((long) i2);
                } else if (((long) (this.aa * 1511913821)) + (3483330859842504979L * this.an) > this.ar * -6693291830970498427L && ((long) (this.aa * 1511913821)) + (this.an * 3483330859842504979L) <= ((long) i2) + (this.ar * -6693291830970498427L)) {
                    j2 = (3483330859842504979L * this.an) + ((long) (this.aa * 1511913821));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ar * -6693291830970498427L)), this.ad, (int) (j - (3483330859842504979L * this.an)), (int) (j2 - j));
                }
                this.ar += ((long) i2) * 6567201253033567821L;
            } else if (i2 > 0) {
                if (-1 == this.ay * 3134483291187657815L) {
                    this.ay = 3915208806857371267L * this.ar;
                }
                System.arraycopy(bArr, i, this.ag, (int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)), i2);
                this.ar += 6567201253033567821L * ((long) i2);
                if ((this.ar * -6693291830970498427L) - (3134483291187657815L * this.ay) > ((long) (this.as * -475933495))) {
                    this.as = -163150471 * ((int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                }
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        } catch (Throwable e2) {
            throw ba.ad(e2, "nn.as(" + ')');
        }
    }

    public void bb(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (((long) i2) + (-6693291830970498427L * this.ar) > this.ae * -5327026315961459127L) {
                this.ae = -6069604170517924871L * ((-6693291830970498427L * this.ar) + ((long) i2));
            }
            if (-1 != 3134483291187657815L * this.ay && (-6693291830970498427L * this.ar < 3134483291187657815L * this.ay || -6693291830970498427L * this.ar > (this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)))) {
                ar(-1963144896);
            }
            if (3134483291187657815L * this.ay != -1 && (-6693291830970498427L * this.ar) + ((long) i2) > ((long) this.ag.length) + (3134483291187657815L * this.ay)) {
                int length = (int) (((long) this.ag.length) - ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                System.arraycopy(bArr, i, this.ag, (int) ((this.ar * -6693291830970498427L) - (this.ay * 3134483291187657815L)), length);
                this.ar += ((long) length) * 6567201253033567821L;
                i += length;
                i2 -= length;
                this.as = this.ag.length * -163150471;
                ar(-1918187056);
            }
            if (i2 > this.ag.length) {
                if (this.ar * -6693291830970498427L != this.aq * -3350398878597138191L) {
                    this.af.af(this.ar * -6693291830970498427L);
                    this.aq = this.ar * 4947570184559919829L;
                }
                this.af.ad(bArr, i, i2, 1072687734);
                this.aq += ((long) i2) * -4373627620404348911L;
                if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                    this.aj = this.aq * 5831341056068923797L;
                }
                long j = -1;
                long j2 = -1;
                if (this.ar * -6693291830970498427L >= 3483330859842504979L * this.an && -6693291830970498427L * this.ar < (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    j = this.ar * -6693291830970498427L;
                } else if (this.an * 3483330859842504979L >= this.ar * -6693291830970498427L && this.an * 3483330859842504979L < (-6693291830970498427L * this.ar) + ((long) i2)) {
                    j = this.an * 3483330859842504979L;
                }
                if (((long) i2) + (-6693291830970498427L * this.ar) > this.an * 3483330859842504979L && (this.ar * -6693291830970498427L) + ((long) i2) <= ((long) (1511913821 * this.aa)) + (this.an * 3483330859842504979L)) {
                    j2 = (-6693291830970498427L * this.ar) + ((long) i2);
                } else if (((long) (this.aa * 1511913821)) + (3483330859842504979L * this.an) > this.ar * -6693291830970498427L && ((long) (this.aa * 1511913821)) + (this.an * 3483330859842504979L) <= ((long) i2) + (this.ar * -6693291830970498427L)) {
                    j2 = (3483330859842504979L * this.an) + ((long) (this.aa * 1511913821));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ar * -6693291830970498427L)), this.ad, (int) (j - (3483330859842504979L * this.an)), (int) (j2 - j));
                }
                this.ar += ((long) i2) * 6567201253033567821L;
            } else if (i2 > 0) {
                if (-1 == this.ay * 3134483291187657815L) {
                    this.ay = 3915208806857371267L * this.ar;
                }
                System.arraycopy(bArr, i, this.ag, (int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)), i2);
                this.ar += 6567201253033567821L * ((long) i2);
                if ((this.ar * -6693291830970498427L) - (3134483291187657815L * this.ay) > ((long) (this.as * -475933495))) {
                    this.as = -163150471 * ((int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                }
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        }
    }

    public void bc(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (((long) i2) + (-6693291830970498427L * this.ar) > this.ae * -5327026315961459127L) {
                this.ae = -6069604170517924871L * ((-6693291830970498427L * this.ar) + ((long) i2));
            }
            if (-1 != 3134483291187657815L * this.ay && (-6693291830970498427L * this.ar < 3134483291187657815L * this.ay || -6693291830970498427L * this.ar > (this.ay * 3134483291187657815L) + ((long) (this.as * -795507675)))) {
                ar(-1837341492);
            }
            if (3134483291187657815L * this.ay != -1 && (-6693291830970498427L * this.ar) + ((long) i2) > ((long) this.ag.length) + (3134483291187657815L * this.ay)) {
                int length = (int) (((long) this.ag.length) - ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                System.arraycopy(bArr, i, this.ag, (int) ((this.ar * -6693291830970498427L) - (this.ay * 3134483291187657815L)), length);
                this.ar += ((long) length) * 6567201253033567821L;
                i += length;
                i2 -= length;
                this.as = this.ag.length * -163150471;
                ar(-2124886432);
            }
            if (i2 > this.ag.length) {
                if (this.ar * -6693291830970498427L != this.aq * -3350398878597138191L) {
                    this.af.af(this.ar * -6693291830970498427L);
                    this.aq = this.ar * 4947570184559919829L;
                }
                this.af.ad(bArr, i, i2, 1172665953);
                this.aq += ((long) i2) * -4373627620404348911L;
                if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                    this.aj = this.aq * 5831341056068923797L;
                }
                long j = -1;
                long j2 = -1;
                if (this.ar * -6693291830970498427L >= 3483330859842504979L * this.an && -6693291830970498427L * this.ar < (this.an * 3483330859842504979L) + ((long) (103723355 * this.aa))) {
                    j = this.ar * -6693291830970498427L;
                } else if (this.an * 3483330859842504979L >= this.ar * -6693291830970498427L && this.an * 3483330859842504979L < (-6693291830970498427L * this.ar) + ((long) i2)) {
                    j = this.an * 3483330859842504979L;
                }
                if (((long) i2) + (-6693291830970498427L * this.ar) > this.an * 3483330859842504979L && (this.ar * -6693291830970498427L) + ((long) i2) <= ((long) (1511913821 * this.aa)) + (this.an * 3483330859842504979L)) {
                    j2 = (-6693291830970498427L * this.ar) + ((long) i2);
                } else if (((long) (this.aa * 1841033958)) + (3483330859842504979L * this.an) > this.ar * -6693291830970498427L && ((long) (this.aa * -1675449812)) + (this.an * 3483330859842504979L) <= ((long) i2) + (this.ar * -6693291830970498427L)) {
                    j2 = (3483330859842504979L * this.an) + ((long) (this.aa * -1118150238));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ar * -6693291830970498427L)), this.ad, (int) (j - (3483330859842504979L * this.an)), (int) (j2 - j));
                }
                this.ar += ((long) i2) * 6567201253033567821L;
            } else if (i2 > 0) {
                if (-1 == this.ay * 3134483291187657815L) {
                    this.ay = 3915208806857371267L * this.ar;
                }
                System.arraycopy(bArr, i, this.ag, (int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)), i2);
                this.ar += 6567201253033567821L * ((long) i2);
                if ((this.ar * -6693291830970498427L) - (3134483291187657815L * this.ay) > ((long) (this.as * -475933495))) {
                    this.as = -163150471 * ((int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                }
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        }
    }

    public void bw(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (((long) i2) + (-6693291830970498427L * this.ar) > this.ae * -5327026315961459127L) {
                this.ae = -6069604170517924871L * ((-6693291830970498427L * this.ar) + ((long) i2));
            }
            if (-1 != 3134483291187657815L * this.ay && (-6693291830970498427L * this.ar < 3134483291187657815L * this.ay || -6693291830970498427L * this.ar > (this.ay * 3134483291187657815L) + ((long) (this.as * -321720003)))) {
                ar(-1822769784);
            }
            if (3134483291187657815L * this.ay != -1 && (-6693291830970498427L * this.ar) + ((long) i2) > ((long) this.ag.length) + (3134483291187657815L * this.ay)) {
                int length = (int) (((long) this.ag.length) - ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                System.arraycopy(bArr, i, this.ag, (int) ((this.ar * -6693291830970498427L) - (this.ay * 3134483291187657815L)), length);
                this.ar += ((long) length) * 6567201253033567821L;
                i += length;
                i2 -= length;
                this.as = this.ag.length * -1535272779;
                ar(-1967321494);
            }
            if (i2 > this.ag.length) {
                if (this.ar * -6693291830970498427L != this.aq * -3350398878597138191L) {
                    this.af.af(this.ar * -6693291830970498427L);
                    this.aq = this.ar * 4947570184559919829L;
                }
                this.af.ad(bArr, i, i2, 1307486218);
                this.aq += ((long) i2) * -4373627620404348911L;
                if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                    this.aj = this.aq * 5831341056068923797L;
                }
                long j = -1;
                long j2 = -1;
                if (this.ar * -6693291830970498427L >= 3483330859842504979L * this.an && -6693291830970498427L * this.ar < (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    j = this.ar * -6693291830970498427L;
                } else if (this.an * 3483330859842504979L >= this.ar * -6693291830970498427L && this.an * 3483330859842504979L < (-6693291830970498427L * this.ar) + ((long) i2)) {
                    j = this.an * 3483330859842504979L;
                }
                if (((long) i2) + (-6693291830970498427L * this.ar) > this.an * 3483330859842504979L && (this.ar * -6693291830970498427L) + ((long) i2) <= ((long) (1229293257 * this.aa)) + (this.an * 3483330859842504979L)) {
                    j2 = (-6693291830970498427L * this.ar) + ((long) i2);
                } else if (((long) (this.aa * -1539115192)) + (3483330859842504979L * this.an) > this.ar * -6693291830970498427L && ((long) (this.aa * 138502812)) + (this.an * 3483330859842504979L) <= ((long) i2) + (this.ar * -6693291830970498427L)) {
                    j2 = (3483330859842504979L * this.an) + ((long) (this.aa * 1511913821));
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(bArr, (int) ((((long) i) + j) - (this.ar * -6693291830970498427L)), this.ad, (int) (j - (3483330859842504979L * this.an)), (int) (j2 - j));
                }
                this.ar += ((long) i2) * 6567201253033567821L;
            } else if (i2 > 0) {
                if (-1 == this.ay * 3134483291187657815L) {
                    this.ay = 3915208806857371267L * this.ar;
                }
                System.arraycopy(bArr, i, this.ag, (int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)), i2);
                this.ar += 6567201253033567821L * ((long) i2);
                if ((this.ar * -6693291830970498427L) - (3134483291187657815L * this.ay) > ((long) (this.as * -119942808))) {
                    this.as = -163150471 * ((int) ((-6693291830970498427L * this.ar) - (3134483291187657815L * this.ay)));
                }
            }
        } catch (IOException e) {
            this.aq = 4373627620404348911L;
            throw e;
        }
    }

    void ar(int i) throws IOException {
        try {
            if (3134483291187657815L * this.ay != -1) {
                if (3134483291187657815L * this.ay != -3350398878597138191L * this.aq) {
                    this.af.af(3134483291187657815L * this.ay);
                    this.aq = -6689093519855580729L * this.ay;
                }
                this.af.ad(this.ag, 0, -475933495 * this.as, 1463515503);
                this.aq += ((long) this.as) * 5890808303976520025L;
                if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                    this.aj = 5831341056068923797L * this.aq;
                }
                long j = -1;
                long j2 = -1;
                if (this.ay * 3134483291187657815L >= this.an * 3483330859842504979L && this.ay * 3134483291187657815L < (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                    j = this.ay * 3134483291187657815L;
                } else if (this.an * 3483330859842504979L >= this.ay * 3134483291187657815L && 3483330859842504979L * this.an < ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                    j = this.an * 3483330859842504979L;
                }
                if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > 3483330859842504979L * this.an && (3134483291187657815L * this.ay) + ((long) (this.as * -475933495)) <= (3483330859842504979L * this.an) + ((long) (this.aa * 1511913821))) {
                    j2 = ((long) (this.as * -475933495)) + (this.ay * 3134483291187657815L);
                } else if ((3483330859842504979L * this.an) + ((long) (1511913821 * this.aa)) > this.ay * 3134483291187657815L && (3483330859842504979L * this.an) + ((long) (1511913821 * this.aa)) <= ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                    j2 = ((long) (1511913821 * this.aa)) + (this.an * 3483330859842504979L);
                }
                if (j > -1 && j2 > j) {
                    System.arraycopy(this.ag, (int) (j - (this.ay * 3134483291187657815L)), this.ad, (int) (j - (this.an * 3483330859842504979L)), (int) (j2 - j));
                }
                this.ay = 472725623425503385L;
                this.as = 0;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "nn.ar(" + ')');
        }
    }

    void bf() throws IOException {
        if (3134483291187657815L * this.ay != -1) {
            if (3134483291187657815L * this.ay != -3350398878597138191L * this.aq) {
                this.af.af(3134483291187657815L * this.ay);
                this.aq = -6689093519855580729L * this.ay;
            }
            this.af.ad(this.ag, 0, 2045087782 * this.as, 1749696513);
            this.aq += ((long) this.as) * 5890808303976520025L;
            if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                this.aj = 5831341056068923797L * this.aq;
            }
            long j = -1;
            long j2 = -1;
            if (this.ay * 3134483291187657815L >= this.an * 3483330859842504979L && this.ay * 3134483291187657815L < (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                j = this.ay * 3134483291187657815L;
            } else if (this.an * 3483330859842504979L >= this.ay * 3134483291187657815L && 3483330859842504979L * this.an < ((long) (1521284251 * this.as)) + (3134483291187657815L * this.ay)) {
                j = this.an * 3483330859842504979L;
            }
            if ((this.ay * 3134483291187657815L) + ((long) (this.as * 433413907)) > 3483330859842504979L * this.an && (3134483291187657815L * this.ay) + ((long) (this.as * -335621318)) <= (3483330859842504979L * this.an) + ((long) (this.aa * -1313093685))) {
                j2 = ((long) (this.as * -475933495)) + (this.ay * 3134483291187657815L);
            } else if ((3483330859842504979L * this.an) + ((long) (1085327477 * this.aa)) > this.ay * 3134483291187657815L && (3483330859842504979L * this.an) + ((long) (1077546797 * this.aa)) <= ((long) (-867261601 * this.as)) + (3134483291187657815L * this.ay)) {
                j2 = ((long) (1511913821 * this.aa)) + (this.an * 3483330859842504979L);
            }
            if (j > -1 && j2 > j) {
                System.arraycopy(this.ag, (int) (j - (this.ay * 3134483291187657815L)), this.ad, (int) (j - (this.an * 3483330859842504979L)), (int) (j2 - j));
            }
            this.ay = 472725623425503385L;
            this.as = 0;
        }
    }

    void bg() throws IOException {
        if (3134483291187657815L * this.ay != -1) {
            if (3134483291187657815L * this.ay != -3350398878597138191L * this.aq) {
                this.af.af(3134483291187657815L * this.ay);
                this.aq = -6689093519855580729L * this.ay;
            }
            this.af.ad(this.ag, 0, -475933495 * this.as, 1054205489);
            this.aq += ((long) this.as) * 5890808303976520025L;
            if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                this.aj = 5831341056068923797L * this.aq;
            }
            long j = -1;
            long j2 = -1;
            if (this.ay * 3134483291187657815L >= this.an * 3483330859842504979L && this.ay * 3134483291187657815L < (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                j = this.ay * 3134483291187657815L;
            } else if (this.an * 3483330859842504979L >= this.ay * 3134483291187657815L && 3483330859842504979L * this.an < ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                j = this.an * 3483330859842504979L;
            }
            if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > 3483330859842504979L * this.an && (3134483291187657815L * this.ay) + ((long) (this.as * -475933495)) <= (3483330859842504979L * this.an) + ((long) (this.aa * 1511913821))) {
                j2 = ((long) (this.as * -475933495)) + (this.ay * 3134483291187657815L);
            } else if ((3483330859842504979L * this.an) + ((long) (1511913821 * this.aa)) > this.ay * 3134483291187657815L && (3483330859842504979L * this.an) + ((long) (1511913821 * this.aa)) <= ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                j2 = ((long) (1511913821 * this.aa)) + (this.an * 3483330859842504979L);
            }
            if (j > -1 && j2 > j) {
                System.arraycopy(this.ag, (int) (j - (this.ay * 3134483291187657815L)), this.ad, (int) (j - (this.an * 3483330859842504979L)), (int) (j2 - j));
            }
            this.ay = 472725623425503385L;
            this.as = 0;
        }
    }

    void bh() throws IOException {
        if (3134483291187657815L * this.ay != -1) {
            if (3134483291187657815L * this.ay != -3350398878597138191L * this.aq) {
                this.af.af(3134483291187657815L * this.ay);
                this.aq = -6689093519855580729L * this.ay;
            }
            this.af.ad(this.ag, 0, -475933495 * this.as, 1022510649);
            this.aq += ((long) this.as) * 5890808303976520025L;
            if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                this.aj = 5831341056068923797L * this.aq;
            }
            long j = -1;
            long j2 = -1;
            if (this.ay * 3134483291187657815L >= this.an * 3483330859842504979L && this.ay * 3134483291187657815L < (this.an * 3483330859842504979L) + ((long) (1511913821 * this.aa))) {
                j = this.ay * 3134483291187657815L;
            } else if (this.an * 3483330859842504979L >= this.ay * 3134483291187657815L && 3483330859842504979L * this.an < ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                j = this.an * 3483330859842504979L;
            }
            if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > 3483330859842504979L * this.an && (3134483291187657815L * this.ay) + ((long) (this.as * -475933495)) <= (3483330859842504979L * this.an) + ((long) (this.aa * 1511913821))) {
                j2 = ((long) (this.as * -475933495)) + (this.ay * 3134483291187657815L);
            } else if ((3483330859842504979L * this.an) + ((long) (1511913821 * this.aa)) > this.ay * 3134483291187657815L && (3483330859842504979L * this.an) + ((long) (1511913821 * this.aa)) <= ((long) (-475933495 * this.as)) + (3134483291187657815L * this.ay)) {
                j2 = ((long) (1511913821 * this.aa)) + (this.an * 3483330859842504979L);
            }
            if (j > -1 && j2 > j) {
                System.arraycopy(this.ag, (int) (j - (this.ay * 3134483291187657815L)), this.ad, (int) (j - (this.an * 3483330859842504979L)), (int) (j2 - j));
            }
            this.ay = 472725623425503385L;
            this.as = 0;
        }
    }

    void bz() throws IOException {
        if (this.ay * 3134483291187657815L != -1) {
            long j;
            if (this.ay * 3134483291187657815L != -3350398878597138191L * this.aq) {
                this.af.af(this.ay * 3134483291187657815L);
                this.aq = -6689093519855580729L * this.ay;
            }
            this.af.ad(this.ag, 0, -178697379 * this.as, 1065777529);
            this.aq += ((long) this.as) * 5890808303976520025L;
            if (this.aq * -3350398878597138191L > this.aj * -3198465228173702419L) {
                this.aj = 5831341056068923797L * this.aq;
            }
            long j2 = (this.ay * 3134483291187657815L < this.an * 3483330859842504979L || this.ay * 3134483291187657815L >= (this.an * 3483330859842504979L) + ((long) (-2123132965 * this.aa))) ? (this.an * 3483330859842504979L < this.ay * 3134483291187657815L || this.an * 3483330859842504979L >= ((long) (259219487 * this.as)) + (this.ay * 3134483291187657815L)) ? -1 : this.an * 3483330859842504979L : this.ay * 3134483291187657815L;
            if ((this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) > this.an * 3483330859842504979L && (this.ay * 3134483291187657815L) + ((long) (this.as * -475933495)) <= (this.an * 3483330859842504979L) + ((long) (this.aa * 1511913821))) {
                j = ((long) (this.as * -1064082639)) + (this.ay * 3134483291187657815L);
            } else if ((this.an * 3483330859842504979L) + ((long) (this.aa * 1511913821)) <= this.ay * 3134483291187657815L || (this.an * 3483330859842504979L) + ((long) (this.aa * 1511913821)) > ((long) (743365992 * this.as)) + (this.ay * 3134483291187657815L)) {
                j = -1;
            } else {
                j = ((long) (this.aa * 1511913821)) + (this.an * 3483330859842504979L);
            }
            if (j2 > -1 && j > j2) {
                System.arraycopy(this.ag, (int) (j2 - (this.ay * 3134483291187657815L)), this.ad, (int) (j2 - (this.an * 3483330859842504979L)), (int) (j - j2));
            }
            this.ay = 472725623425503385L;
            this.as = 0;
        }
    }
}
