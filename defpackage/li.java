package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class li implements Runnable {
    static final int bb = 8;
    public static final int cu = 104;
    byte[] aa;
    InputStream ad;
    Thread af;
    int ag;
    int an;
    IOException as;
    int ay;

    li(InputStream inputStream, int i) {
        try {
            this.ag = 0;
            this.ay = 0;
            this.ad = inputStream;
            this.an = (i + 1) * 473647267;
            this.aa = new byte[(this.an * -1270502645)];
            this.af = new Thread(this);
            this.af.setDaemon(true);
            this.af.start();
        } catch (Throwable e) {
            throw ba.ad(e, "li.<init>(" + ')');
        }
    }

    synchronized int af(byte b) {
        int i;
        while (this.as == null) {
            try {
                if (this.ag * -902297075 == 0) {
                    i = ((this.an * -1270502645) - (this.ay * -254470961)) - 1;
                } else if (this.ag * -902297075 <= this.ay * -254470961) {
                    i = (this.an * -1270502645) - (this.ay * -254470961);
                } else {
                    i = ((this.ag * -902297075) - (this.ay * -254470961)) - 1;
                }
                if (i > 0) {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            } catch (Throwable e2) {
                throw ba.ad(e2, "li.af(" + ')');
            }
        }
        i = -1;
        return i;
    }

    synchronized int as() {
        int i;
        while (this.as == null) {
            if (this.ag * -902297075 == 0) {
                i = ((-954516442 * this.an) - (-531167105 * this.ay)) - 1;
            } else if (this.ag * -902297075 <= this.ay * -254470961) {
                i = (this.an * -1270502645) - (this.ay * -254470961);
            } else {
                i = ((this.ag * -902297075) - (this.ay * -1272595412)) - 1;
            }
            if (i > 0) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        i = -1;
        return i;
    }

    public void bo() {
        while (true) {
            int af = af((byte) -17);
            if (-1 != af) {
                try {
                    af = this.ad.read(this.aa, this.ay * -254470961, af);
                    if (af == -1) {
                        throw new EOFException();
                    }
                    synchronized (this) {
                        this.ay = ((af + (this.ay * -254470961)) % (-1270502645 * this.an)) * 299069999;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.as = e;
                        return;
                    }
                }
            }
            return;
        }
    }

    public void ci() {
        while (true) {
            int af = af((byte) -46);
            if (-1 != af) {
                try {
                    af = this.ad.read(this.aa, this.ay * -254470961, af);
                    if (af == -1) {
                        throw new EOFException();
                    }
                    synchronized (this) {
                        this.ay = ((af + (this.ay * -254470961)) % (-1270502645 * this.an)) * 299069999;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.as = e;
                        return;
                    }
                }
            }
            return;
        }
    }

    public void cv() {
        while (true) {
            int af = af((byte) -9);
            if (-1 != af) {
                try {
                    af = this.ad.read(this.aa, this.ay * -254470961, af);
                    if (af == -1) {
                        throw new EOFException();
                    }
                    synchronized (this) {
                        this.ay = ((af + (1010141882 * this.ay)) % (-839194065 * this.an)) * 299069999;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.as = e;
                        return;
                    }
                }
            }
            return;
        }
    }

    public void run() {
        while (true) {
            int af = af((byte) -59);
            if (-1 != af) {
                try {
                    af = this.ad.read(this.aa, this.ay * -254470961, af);
                    if (af == -1) {
                        throw new EOFException();
                    }
                    try {
                        synchronized (this) {
                            this.ay = ((af + (this.ay * -254470961)) % (-1270502645 * this.an)) * 299069999;
                        }
                    } catch (Throwable e) {
                        throw ba.ad(e, "li.run(" + ')');
                    }
                } catch (IOException e2) {
                    synchronized (this) {
                        this.as = e2;
                        return;
                    }
                }
            }
            return;
        }
    }

    boolean ad(int i, int i2) throws IOException {
        boolean z = true;
        if (i != 0) {
            if (i > 0) {
                try {
                    if (i < this.an * -1270502645) {
                        synchronized (this) {
                            int i3;
                            if (this.ag * -902297075 <= this.ay * -254470961) {
                                i3 = (this.ay * -254470961) - (this.ag * -902297075);
                            } else {
                                i3 = (this.ay * -254470961) + ((this.an * -1270502645) - (this.ag * -902297075));
                            }
                            if (i3 >= i) {
                            } else if (this.as != null) {
                                throw new IOException(this.as.toString());
                            } else {
                                notifyAll();
                                z = false;
                            }
                        }
                    }
                } catch (Throwable e) {
                    throw ba.ad(e, "li.ad(" + ')');
                }
            }
            throw new IOException();
        }
        return z;
    }

    boolean ar(int i) throws IOException {
        boolean z = true;
        if (i != 0) {
            if (i <= 0 || i >= -1270502645 * this.an) {
                throw new IOException();
            }
            synchronized (this) {
                int i2;
                if (615261989 * this.ag <= this.ay * -254470961) {
                    i2 = (-10384363 * this.ay) - (this.ag * -600713230);
                } else {
                    i2 = (this.ay * 119444367) + ((this.an * -578602224) - (-902297075 * this.ag));
                }
                if (i2 >= i) {
                } else if (this.as != null) {
                    throw new IOException(this.as.toString());
                } else {
                    notifyAll();
                    z = false;
                }
            }
        }
        return z;
    }

    int ae() throws IOException {
        int i;
        synchronized (this) {
            if (this.ag * -902297075 <= this.ay * -254470961) {
                i = (this.ay * -254470961) - (this.ag * -902297075);
            } else {
                i = (this.ay * -254470961) + ((this.an * -1270502645) - (this.ag * -902297075));
            }
            if (i > 0 || this.as == null) {
                notifyAll();
            } else {
                throw new IOException(this.as.toString());
            }
        }
        return i;
    }

    int aj() throws IOException {
        int i;
        synchronized (this) {
            if (this.ag * -902297075 <= this.ay * -254470961) {
                i = (this.ay * -254470961) - (this.ag * -902297075);
            } else {
                i = (this.ay * -254470961) + ((this.an * -1270502645) - (this.ag * -902297075));
            }
            if (i > 0 || this.as == null) {
                notifyAll();
            } else {
                throw new IOException(this.as.toString());
            }
        }
        return i;
    }

    int an(int i) throws IOException {
        try {
            int i2;
            synchronized (this) {
                if (this.ag * -902297075 <= this.ay * -254470961) {
                    i2 = (this.ay * -254470961) - (this.ag * -902297075);
                } else {
                    i2 = (this.ay * -254470961) + ((this.an * -1270502645) - (this.ag * -902297075));
                }
                if (i2 > 0 || this.as == null) {
                    notifyAll();
                } else {
                    throw new IOException(this.as.toString());
                }
            }
            return i2;
        } catch (Throwable e) {
            throw ba.ad(e, "li.an(" + ')');
        }
    }

    int aq() throws IOException {
        int i;
        synchronized (this) {
            if (this.ag * -902297075 <= this.ay * -254470961) {
                i = (this.ay * -254470961) - (this.ag * -902297075);
            } else {
                i = (this.ay * -254470961) + ((this.an * -1270502645) - (this.ag * -902297075));
            }
            if (i > 0 || this.as == null) {
                notifyAll();
            } else {
                throw new IOException(this.as.toString());
            }
        }
        return i;
    }

    int aa(int i) throws IOException {
        try {
            int i2;
            synchronized (this) {
                if (this.ag * -902297075 != -254470961 * this.ay) {
                    i2 = this.aa[this.ag * -902297075] & 255;
                    this.ag = 1021596869 * (((this.ag * -902297075) + 1) % (this.an * -1270502645));
                    notifyAll();
                } else if (this.as != null) {
                    throw new IOException(this.as.toString());
                } else {
                    i2 = -1;
                }
            }
            return i2;
        } catch (Throwable e) {
            throw ba.ad(e, "li.aa(" + ')');
        }
    }

    int ab() throws IOException {
        int i;
        synchronized (this) {
            if (this.ag * -902297075 != -254470961 * this.ay) {
                i = this.aa[this.ag * -902297075] & 255;
                this.ag = 1021596869 * (((this.ag * -902297075) + 1) % (this.an * -1270502645));
                notifyAll();
            } else if (this.as != null) {
                throw new IOException(this.as.toString());
            } else {
                i = -1;
            }
        }
        return i;
    }

    int ai() throws IOException {
        int i;
        synchronized (this) {
            if (-902297075 * this.ag != -254470961 * this.ay) {
                i = this.aa[2053283350 * this.ag] & 255;
                this.ag = 507351689 * (((1165749450 * this.ag) + 1) % (this.an * -1270502645));
                notifyAll();
            } else if (this.as != null) {
                throw new IOException(this.as.toString());
            } else {
                i = -1;
            }
        }
        return i;
    }

    int am() throws IOException {
        int i;
        synchronized (this) {
            if (1122399864 * this.ag != 1549044187 * this.ay) {
                i = this.aa[this.ag * -902297075] & 255;
                this.ag = 1514351685 * (((this.ag * -902297075) + 1) % (this.an * -1382614174));
                notifyAll();
            } else if (this.as != null) {
                throw new IOException(this.as.toString());
            } else {
                i = -1;
            }
        }
        return i;
    }

    int at() throws IOException {
        int i;
        synchronized (this) {
            if (this.ag * -902297075 != -254470961 * this.ay) {
                i = this.aa[this.ag * -902297075] & 255;
                this.ag = 1021596869 * (((this.ag * -902297075) + 1) % (this.an * -1270502645));
                notifyAll();
            } else if (this.as != null) {
                throw new IOException(this.as.toString());
            } else {
                i = -1;
            }
        }
        return i;
    }

    int aw() throws IOException {
        int i;
        synchronized (this) {
            if (421147739 * this.ag != -52843220 * this.ay) {
                i = this.aa[this.ag * -902297075] & -126020231;
                this.ag = 1021596869 * (((this.ag * -902297075) + 1) % (this.an * -1957387064));
                notifyAll();
            } else if (this.as != null) {
                throw new IOException(this.as.toString());
            } else {
                i = -1;
            }
        }
        return i;
    }

    int ag(byte[] bArr, int i, int i2, int i3) throws IOException {
        if (i2 >= 0 && i >= 0) {
            try {
                if (i + i2 <= bArr.length) {
                    synchronized (this) {
                        int i4;
                        if (this.ag * -902297075 <= this.ay * -254470961) {
                            i4 = (this.ay * -254470961) - (this.ag * -902297075);
                        } else {
                            i4 = (this.ay * -254470961) + ((this.an * -1270502645) - (this.ag * -902297075));
                        }
                        if (i2 > i4) {
                            i2 = i4;
                        }
                        if (i2 != 0 || this.as == null) {
                            if ((this.ag * -902297075) + i2 <= this.an * -1270502645) {
                                System.arraycopy(this.aa, this.ag * -902297075, bArr, i, i2);
                            } else {
                                i4 = (this.an * -1270502645) - (this.ag * -902297075);
                                System.arraycopy(this.aa, this.ag * -902297075, bArr, i, i4);
                                System.arraycopy(this.aa, 0, bArr, i4 + i, i2 - i4);
                            }
                            this.ag = 1021596869 * (((this.ag * -902297075) + i2) % (this.an * -1270502645));
                            notifyAll();
                        } else {
                            throw new IOException(this.as.toString());
                        }
                    }
                    return i2;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "li.ag(" + ')');
            }
        }
        throw new IOException();
    }

    int ah(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int i3;
            if (this.ag * -902297075 <= this.ay * -254470961) {
                i3 = (this.ay * -254470961) - (this.ag * -902297075);
            } else {
                i3 = (this.ay * -254470961) + ((this.an * -1270502645) - (this.ag * -902297075));
            }
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 != 0 || this.as == null) {
                if ((this.ag * -902297075) + i2 <= this.an * -1270502645) {
                    System.arraycopy(this.aa, this.ag * -902297075, bArr, i, i2);
                } else {
                    i3 = (this.an * -1270502645) - (this.ag * -902297075);
                    System.arraycopy(this.aa, this.ag * -902297075, bArr, i, i3);
                    System.arraycopy(this.aa, 0, bArr, i3 + i, i2 - i3);
                }
                this.ag = 1021596869 * (((this.ag * -902297075) + i2) % (this.an * -1270502645));
                notifyAll();
            } else {
                throw new IOException(this.as.toString());
            }
        }
        return i2;
    }

    int ak(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int i3;
            if (this.ag * -902297075 <= this.ay * -254470961) {
                i3 = (this.ay * -254470961) - (this.ag * -902297075);
            } else {
                i3 = (this.ay * -254470961) + ((this.an * -1270502645) - (this.ag * -902297075));
            }
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 != 0 || this.as == null) {
                if ((this.ag * -902297075) + i2 <= this.an * -1270502645) {
                    System.arraycopy(this.aa, this.ag * -902297075, bArr, i, i2);
                } else {
                    i3 = (this.an * -1270502645) - (this.ag * -902297075);
                    System.arraycopy(this.aa, this.ag * -902297075, bArr, i, i3);
                    System.arraycopy(this.aa, 0, bArr, i3 + i, i2 - i3);
                }
                this.ag = 1021596869 * (((this.ag * -902297075) + i2) % (this.an * -1270502645));
                notifyAll();
            } else {
                throw new IOException(this.as.toString());
            }
        }
        return i2;
    }

    int az(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int i3;
            if (this.ag * -902297075 <= this.ay * -254470961) {
                i3 = (this.ay * -254470961) - (this.ag * -902297075);
            } else {
                i3 = (this.ay * -254470961) + ((this.an * -1270502645) - (this.ag * -902297075));
            }
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 != 0 || this.as == null) {
                if ((this.ag * -902297075) + i2 <= this.an * -1270502645) {
                    System.arraycopy(this.aa, this.ag * -902297075, bArr, i, i2);
                } else {
                    i3 = (this.an * -1270502645) - (this.ag * -902297075);
                    System.arraycopy(this.aa, this.ag * -902297075, bArr, i, i3);
                    System.arraycopy(this.aa, 0, bArr, i3 + i, i2 - i3);
                }
                this.ag = 1021596869 * (((this.ag * -902297075) + i2) % (this.an * -1270502645));
                notifyAll();
            } else {
                throw new IOException(this.as.toString());
            }
        }
        return i2;
    }

    void ao() {
        synchronized (this) {
            if (this.as == null) {
                this.as = new IOException("");
            }
            notifyAll();
        }
        try {
            this.af.join();
        } catch (InterruptedException e) {
        }
    }

    void ax() {
        synchronized (this) {
            if (this.as == null) {
                this.as = new IOException("");
            }
            notifyAll();
        }
        try {
            this.af.join();
        } catch (InterruptedException e) {
        }
    }

    void ay(int i) {
        try {
            synchronized (this) {
                if (this.as == null) {
                    this.as = new IOException("");
                }
                notifyAll();
            }
            try {
                this.af.join();
            } catch (InterruptedException e) {
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "li.ay(" + ')');
        }
    }
}
