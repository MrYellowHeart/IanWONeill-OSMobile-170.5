package p000;

import java.io.IOException;
import java.io.OutputStream;

public class mz implements Runnable {
    static final int ba = 1;
    public static final int cb = 90;
    static int fu;
    byte[] aa;
    OutputStream ad;
    Thread af;
    int ag;
    int an;
    boolean ar;
    IOException as;
    int ay;

    mz(OutputStream outputStream, int i) {
        try {
            this.ag = 0;
            this.ay = 0;
            this.ad = outputStream;
            this.an = -1888171001 * (i + 1);
            this.aa = new byte[(642834871 * this.an)];
            this.af = new Thread(this);
            this.af.setDaemon(true);
            this.af.start();
        } catch (Throwable e) {
            throw ba.ad(e, "mz.<init>(" + ')');
        }
    }

    boolean af(int i) {
        try {
            if (!this.ar) {
                return false;
            }
            try {
                this.ad.close();
                if (this.as == null) {
                    this.as = new IOException("");
                }
            } catch (Throwable e) {
                if (this.as == null) {
                    this.as = new IOException(e);
                }
            }
            return true;
        } catch (Throwable e2) {
            throw ba.ad(e2, "mz.af(" + ')');
        }
    }

    boolean ag() {
        if (!this.ar) {
            return false;
        }
        try {
            this.ad.close();
            if (this.as == null) {
                this.as = new IOException("");
            }
        } catch (Throwable e) {
            if (this.as == null) {
                this.as = new IOException(e);
            }
        }
        return true;
    }

    boolean ay() {
        if (!this.ar) {
            return false;
        }
        try {
            this.ad.close();
            if (this.as == null) {
                this.as = new IOException("");
            }
        } catch (Throwable e) {
            if (this.as == null) {
                this.as = new IOException(e);
            }
        }
        return true;
    }

    synchronized int ad(int i) {
        int i2 = -1;
        synchronized (this) {
            while (this.as == null) {
                try {
                    int i3;
                    if (this.ag * -1647101825 <= this.ay * 1082186205) {
                        i3 = (this.ay * 1082186205) - (this.ag * -1647101825);
                    } else {
                        i3 = ((this.an * 642834871) - (this.ag * -1647101825)) + (this.ay * 1082186205);
                    }
                    if (i3 > 0) {
                        i2 = i3;
                        break;
                    }
                    try {
                        this.ad.flush();
                        if (af(-1386258157)) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    } catch (IOException e2) {
                        this.as = e2;
                    }
                } catch (Throwable e3) {
                    throw ba.ad(e3, "mz.ad(" + ')');
                }
            }
        }
        return i2;
    }

    synchronized int aj() {
        int i = -1;
        synchronized (this) {
            while (this.as == null) {
                int i2;
                if (this.ag * -1647101825 <= this.ay * 1082186205) {
                    i2 = (this.ay * 1082186205) - (this.ag * -1647101825);
                } else {
                    i2 = ((this.an * 642834871) - (this.ag * -1647101825)) + (this.ay * 1082186205);
                }
                if (i2 > 0) {
                    i = i2;
                    break;
                }
                try {
                    this.ad.flush();
                    if (af(-1386258157)) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException e2) {
                    this.as = e2;
                }
            }
        }
        return i;
    }

    synchronized int ar() {
        int i = -1;
        synchronized (this) {
            while (this.as == null) {
                int i2;
                if (this.ag * -1966842036 <= 1082186205 * this.ay) {
                    i2 = (329326681 * this.ay) - (this.ag * 1574203521);
                } else {
                    i2 = ((this.an * 642834871) - (-1647101825 * this.ag)) + (this.ay * 1762249685);
                }
                if (i2 > 0) {
                    i = i2;
                    break;
                }
                try {
                    this.ad.flush();
                    if (af(-1386258157)) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException e2) {
                    this.as = e2;
                }
            }
        }
        return i;
    }

    synchronized int as() {
        int i = -1;
        synchronized (this) {
            while (this.as == null) {
                int i2;
                if (this.ag * -1108488624 <= this.ay * 1082186205) {
                    i2 = (132800164 * this.ay) - (this.ag * 1508296780);
                } else {
                    i2 = ((this.an * 867943562) - (-1084921994 * this.ag)) + (this.ay * 1082186205);
                }
                if (i2 > 0) {
                    i = i2;
                    break;
                }
                try {
                    this.ad.flush();
                    if (af(-1386258157)) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                } catch (IOException e2) {
                    this.as = e2;
                }
            }
        }
        return i;
    }

    public void bo() {
        do {
            int ad = ad(-1636181203);
            if (-1 != ad) {
                try {
                    if ((this.ag * -1647101825) + ad <= this.an * 642834871) {
                        this.ad.write(this.aa, this.ag * -1647101825, ad);
                    } else {
                        int i = (this.an * 642834871) - (this.ag * -1647101825);
                        this.ad.write(this.aa, this.ag * -1647101825, i);
                        this.ad.write(this.aa, 0, ad - i);
                    }
                    synchronized (this) {
                        this.ag = ((ad + (this.ag * -1647101825)) % (this.an * 642834871)) * 1486129023;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.as = e;
                        return;
                    }
                }
            }
            return;
        } while (!af(-1386258157));
    }

    public void ci() {
        do {
            int ad = ad(656333141);
            if (-1 != ad) {
                try {
                    if ((this.ag * -1647101825) + ad <= this.an * 642834871) {
                        this.ad.write(this.aa, this.ag * -1647101825, ad);
                    } else {
                        int i = (this.an * 642834871) - (this.ag * -1647101825);
                        this.ad.write(this.aa, this.ag * -1647101825, i);
                        this.ad.write(this.aa, 0, ad - i);
                    }
                    synchronized (this) {
                        this.ag = ((ad + (this.ag * -1647101825)) % (this.an * 642834871)) * 1486129023;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.as = e;
                        return;
                    }
                }
            }
            return;
        } while (!af(-1386258157));
    }

    public void cv() {
        do {
            int ad = ad(1293387003);
            if (-1 != ad) {
                if ((-125946511 * this.ag) + ad <= this.an * 642834871) {
                    this.ad.write(this.aa, 120504768 * this.ag, ad);
                } else {
                    try {
                        int i = (this.an * -1025264921) - (347328427 * this.ag);
                        this.ad.write(this.aa, this.ag * -1647101825, i);
                        this.ad.write(this.aa, 0, ad - i);
                    } catch (IOException e) {
                        synchronized (this) {
                            this.as = e;
                            return;
                        }
                    }
                }
                synchronized (this) {
                    this.ag = ((ad + (this.ag * -1647101825)) % (this.an * 642834871)) * 1486129023;
                }
            } else {
                return;
            }
        } while (!af(-1386258157));
    }

    public void run() {
        do {
            int ad = ad(-292952592);
            if (-1 != ad) {
                try {
                    if ((this.ag * -1647101825) + ad <= this.an * 642834871) {
                        this.ad.write(this.aa, this.ag * -1647101825, ad);
                    } else {
                        int i = (this.an * 642834871) - (this.ag * -1647101825);
                        this.ad.write(this.aa, this.ag * -1647101825, i);
                        this.ad.write(this.aa, 0, ad - i);
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.as = e;
                        return;
                    }
                }
                try {
                    synchronized (this) {
                        this.ag = ((ad + (this.ag * -1647101825)) % (this.an * 642834871)) * 1486129023;
                    }
                } catch (Throwable e2) {
                    throw ba.ad(e2, "mz.run(" + ')');
                }
            }
            return;
        } while (!af(-1386258157));
    }

    void ae(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.as != null) {
                throw new IOException(this.as.toString());
            }
            int i3;
            if (this.ag * -1647101825 <= this.ay * 1082186205) {
                i3 = (((this.an * 642834871) - (this.ay * 1082186205)) + (this.ag * -1647101825)) - 1;
            } else {
                i3 = ((this.ag * -1647101825) - (this.ay * 1082186205)) - 1;
            }
            if (i3 < i2) {
                throw new IOException("");
            }
            if ((this.ay * 1082186205) + i2 <= this.an * 642834871) {
                System.arraycopy(bArr, i, this.aa, this.ay * 1082186205, i2);
            } else {
                i3 = (this.an * 642834871) - (this.ay * 1082186205);
                System.arraycopy(bArr, i, this.aa, this.ay * 1082186205, i3);
                System.arraycopy(bArr, i3 + i, this.aa, 0, i2 - i3);
            }
            this.ay = (((this.ay * 1082186205) + i2) % (this.an * 642834871)) * 1477592693;
            notifyAll();
        }
    }

    void an(byte[] bArr, int i, int i2, byte b) throws IOException {
        if (i2 >= 0 && i >= 0) {
            try {
                if (i + i2 <= bArr.length) {
                    synchronized (this) {
                        if (this.as != null) {
                            throw new IOException(this.as.toString());
                        }
                        int i3;
                        if (this.ag * -1647101825 <= this.ay * 1082186205) {
                            i3 = (((this.an * 642834871) - (this.ay * 1082186205)) + (this.ag * -1647101825)) - 1;
                        } else {
                            i3 = ((this.ag * -1647101825) - (this.ay * 1082186205)) - 1;
                        }
                        if (i3 < i2) {
                            throw new IOException("");
                        }
                        if ((this.ay * 1082186205) + i2 <= this.an * 642834871) {
                            System.arraycopy(bArr, i, this.aa, this.ay * 1082186205, i2);
                        } else {
                            i3 = (this.an * 642834871) - (this.ay * 1082186205);
                            System.arraycopy(bArr, i, this.aa, this.ay * 1082186205, i3);
                            System.arraycopy(bArr, i3 + i, this.aa, 0, i2 - i3);
                        }
                        this.ay = (((this.ay * 1082186205) + i2) % (this.an * 642834871)) * 1477592693;
                        notifyAll();
                    }
                    return;
                }
            } catch (Throwable e) {
                throw ba.ad(e, "mz.an(" + ')');
            }
        }
        throw new IOException();
    }

    void aq(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.as != null) {
                throw new IOException(this.as.toString());
            }
            int i3;
            if (this.ag * -1647101825 <= this.ay * 1082186205) {
                i3 = (((this.an * 642834871) - (this.ay * 1082186205)) + (this.ag * -1647101825)) - 1;
            } else {
                i3 = ((this.ag * -1436428161) - (this.ay * 1082186205)) - 1;
            }
            if (i3 < i2) {
                throw new IOException("");
            }
            if ((this.ay * 1082186205) + i2 <= this.an * 642834871) {
                System.arraycopy(bArr, i, this.aa, this.ay * 1082186205, i2);
            } else {
                i3 = (2008898649 * this.an) - (this.ay * 1082186205);
                System.arraycopy(bArr, i, this.aa, 1520093942 * this.ay, i3);
                System.arraycopy(bArr, i3 + i, this.aa, 0, i2 - i3);
            }
            this.ay = (((2000016524 * this.ay) + i2) % (this.an * 596177183)) * 1477592693;
            notifyAll();
        }
    }

    void aa(int i) {
        try {
            synchronized (this) {
                this.ar = true;
                notifyAll();
            }
            try {
                this.af.join();
            } catch (InterruptedException e) {
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "mz.aa(" + ')');
        }
    }
}
