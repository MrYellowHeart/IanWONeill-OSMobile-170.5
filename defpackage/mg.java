package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class mg extends md implements Runnable {
    static gd ab;
    boolean aa;
    OutputStream ad;
    boolean ae;
    InputStream af;
    mj ag;
    int aj;
    final int am;
    Socket an;
    final int aq;
    int ar;
    byte[] as;
    mb ay;

    public mg(Socket socket, mj mjVar, int i) throws IOException {
        try {
            this.aa = false;
            this.ar = 0;
            this.aj = 0;
            this.ae = false;
            this.ag = mjVar;
            this.an = socket;
            this.aq = -1438608277 * i;
            this.am = 1314080141 * (i - 100);
            this.an.setSoTimeout(30000);
            this.an.setTcpNoDelay(true);
            this.an.setReceiveBufferSize(ic.ad);
            this.an.setSendBufferSize(ic.ad);
            this.af = this.an.getInputStream();
            this.ad = this.an.getOutputStream();
        } catch (Throwable e) {
            throw ba.ad(e, "mg.<init>(" + ')');
        }
    }

    public void ae() {
        if (!this.aa) {
            synchronized (this) {
                this.aa = true;
                notifyAll();
            }
            if (this.ay != null) {
                while (this.ay.ag == 0) {
                    cu.af(1);
                }
                if (this.ay.ag == 1) {
                    try {
                        ((Thread) this.ay.aj).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.ay = null;
        }
    }

    public void af(byte b) {
        try {
            if (!this.aa) {
                synchronized (this) {
                    this.aa = true;
                    notifyAll();
                }
                if (this.ay != null) {
                    while (this.ay.ag == 0) {
                        cu.af(1);
                    }
                    if (this.ay.ag == 1) {
                        try {
                            ((Thread) this.ay.aj).join();
                        } catch (InterruptedException e) {
                        }
                    }
                }
                this.ay = null;
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "mg.af(" + ')');
        }
    }

    public void aj() {
        if (!this.aa) {
            synchronized (this) {
                this.aa = true;
                notifyAll();
            }
            if (this.ay != null) {
                while (this.ay.ag == 0) {
                    cu.af(1);
                }
                if (this.ay.ag == 1) {
                    try {
                        ((Thread) this.ay.aj).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.ay = null;
        }
    }

    public void aq() {
        if (!this.aa) {
            synchronized (this) {
                this.aa = true;
                notifyAll();
            }
            if (this.ay != null) {
                while (this.ay.ag == 0) {
                    cu.af(1);
                }
                if (this.ay.ag == 1) {
                    try {
                        ((Thread) this.ay.aj).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.ay = null;
        }
    }

    public void ar() {
        if (!this.aa) {
            synchronized (this) {
                this.aa = true;
                notifyAll();
            }
            if (this.ay != null) {
                while (this.ay.ag == 0) {
                    cu.af(1);
                }
                if (this.ay.ag == 1) {
                    try {
                        ((Thread) this.ay.aj).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.ay = null;
        }
    }

    protected void aac() {
        af((byte) -73);
    }

    protected void finalize() {
        try {
            af((byte) -4);
        } catch (Throwable e) {
            throw ba.ad(e, "mg.finalize(" + ')');
        }
    }

    public int ab() throws IOException {
        if (this.aa) {
            return 0;
        }
        return this.af.read();
    }

    public int ad(int i) throws IOException {
        try {
            return this.aa ? 0 : this.af.read();
        } catch (Throwable e) {
            throw ba.ad(e, "mg.ad(" + ')');
        }
    }

    public int am() throws IOException {
        if (this.aa) {
            return 0;
        }
        return this.af.read();
    }

    public int at() throws IOException {
        return this.aa ? 0 : this.af.read();
    }

    public int ac() throws IOException {
        if (this.aa) {
            return 0;
        }
        return this.af.available();
    }

    public int al() throws IOException {
        return this.aa ? 0 : this.af.available();
    }

    public int an(int i) throws IOException {
        try {
            if (this.aa) {
                return 0;
            }
            return this.af.available();
        } catch (Throwable e) {
            throw ba.ad(e, "mg.an(" + ')');
        }
    }

    public int ap() throws IOException {
        if (this.aa) {
            return 0;
        }
        return this.af.available();
    }

    public boolean aa(int i, byte b) throws IOException {
        try {
            return !this.aa && this.af.available() >= i;
        } catch (Throwable e) {
            throw ba.ad(e, "mg.aa(" + ')');
        }
    }

    public boolean aw(int i) throws IOException {
        if (!this.aa && this.af.available() >= i) {
            return true;
        }
        return false;
    }

    public int ag(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if (this.aa) {
                return 0;
            }
            int i4 = i2;
            while (i4 > 0) {
                int read = this.af.read(bArr, i, i4);
                if (read <= 0) {
                    throw new EOFException();
                }
                i += read;
                i4 -= read;
            }
            return i2;
        } catch (Throwable e) {
            throw ba.ad(e, "mg.ag(" + ')');
        }
    }

    public int ah(byte[] bArr, int i, int i2) throws IOException {
        if (this.aa) {
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = this.af.read(bArr, i, i3);
            if (read <= 0) {
                throw new EOFException();
            }
            i += read;
            i3 -= read;
        }
        return i2;
    }

    public int ai(byte[] bArr, int i, int i2) throws IOException {
        if (this.aa) {
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = this.af.read(bArr, i, i3);
            if (read <= 0) {
                throw new EOFException();
            }
            i += read;
            i3 -= read;
        }
        return i2;
    }

    public int az(byte[] bArr, int i, int i2) throws IOException {
        if (this.aa) {
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = this.af.read(bArr, i, i3);
            if (read <= 0) {
                throw new EOFException();
            }
            i += read;
            i3 -= read;
        }
        return i2;
    }

    void ak(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (!this.aa) {
            if (this.ae) {
                this.ae = false;
                throw new IOException();
            }
            if (this.as == null) {
                this.as = new byte[(this.aq * 1187537687)];
            }
            synchronized (this) {
                while (i3 < i2) {
                    this.as[1646802371 * this.aj] = bArr[i + i3];
                    this.aj = -1151966485 * (((this.aj * -136188197) + 1) % (this.aq * -1403684797));
                    if (((165546411 * this.ar) + (this.am * 39741517)) % (this.aq * -1403684797) == -1861322357 * this.aj) {
                        throw new IOException();
                    }
                    i3++;
                }
                if (this.ay == null) {
                    this.ay = this.ag.aa(this, 3, (byte) 27);
                }
                notifyAll();
            }
        }
    }

    void ao(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (!this.aa) {
            if (this.ae) {
                this.ae = false;
                throw new IOException();
            }
            if (this.as == null) {
                this.as = new byte[(this.aq * -1403684797)];
            }
            synchronized (this) {
                while (i3 < i2) {
                    this.as[this.aj * 1646802371] = bArr[i + i3];
                    this.aj = -1151966485 * (((this.aj * 1646802371) + 1) % (this.aq * -1403684797));
                    if (((165546411 * this.ar) + (this.am * 1495041349)) % (this.aq * -1403684797) == this.aj * 1646802371) {
                        throw new IOException();
                    }
                    i3++;
                }
                if (this.ay == null) {
                    this.ay = this.ag.aa(this, 3, (byte) -117);
                }
                notifyAll();
            }
        }
    }

    void ay(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if (!this.aa) {
                if (this.ae) {
                    this.ae = false;
                    throw new IOException();
                }
                if (this.as == null) {
                    this.as = new byte[(this.aq * -1403684797)];
                }
                synchronized (this) {
                    for (int i4 = 0; i4 < i2; i4++) {
                        this.as[this.aj * 1646802371] = bArr[i + i4];
                        this.aj = -1151966485 * (((this.aj * 1646802371) + 1) % (this.aq * -1403684797));
                        if (((165546411 * this.ar) + (this.am * 1495041349)) % (this.aq * -1403684797) == this.aj * 1646802371) {
                            throw new IOException();
                        }
                    }
                    if (this.ay == null) {
                        this.ay = this.ag.aa(this, 3, (byte) -5);
                    }
                    notifyAll();
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "mg.ay(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bo() {
        /*
        r8 = this;
        r7 = 0;
        r6 = -1403684797; // 0xffffffffac557843 float:-3.033588E-12 double:NaN;
        r5 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r4 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
    L_0x000a:
        monitor-enter(r8);	 Catch:{ Exception -> 0x0078 }
        r0 = r8.ar;	 Catch:{ all -> 0x0087 }
        r0 = r0 * r4;
        r1 = r8.aj;	 Catch:{ all -> 0x0087 }
        r1 = r1 * r5;
        if (r0 != r1) goto L_0x003a;
    L_0x0013:
        r0 = r8.aa;	 Catch:{ all -> 0x0087 }
        if (r0 == 0) goto L_0x0037;
    L_0x0017:
        monitor-exit(r8);	 Catch:{ all -> 0x0087 }
        r0 = r8.af;	 Catch:{ IOException -> 0x0091 }
        if (r0 == 0) goto L_0x0021;
    L_0x001c:
        r0 = r8.af;	 Catch:{ IOException -> 0x0091 }
        r0.close();	 Catch:{ IOException -> 0x0091 }
    L_0x0021:
        r0 = r8.ad;	 Catch:{ IOException -> 0x0091 }
        if (r0 == 0) goto L_0x002a;
    L_0x0025:
        r0 = r8.ad;	 Catch:{ IOException -> 0x0091 }
        r0.close();	 Catch:{ IOException -> 0x0091 }
    L_0x002a:
        r0 = r8.an;	 Catch:{ IOException -> 0x0091 }
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r8.an;	 Catch:{ IOException -> 0x0091 }
        r0.close();	 Catch:{ IOException -> 0x0091 }
    L_0x0033:
        r0 = 0;
        r8.as = r0;	 Catch:{ Exception -> 0x0078 }
    L_0x0036:
        return;
    L_0x0037:
        r8.wait();	 Catch:{ InterruptedException -> 0x008f }
    L_0x003a:
        r0 = r8.ar;	 Catch:{ all -> 0x0087 }
        r1 = r4 * r0;
        r0 = r8.aj;	 Catch:{ all -> 0x0087 }
        r0 = r0 * r5;
        r2 = r8.ar;	 Catch:{ all -> 0x0087 }
        r2 = r2 * r4;
        if (r0 < r2) goto L_0x007f;
    L_0x0046:
        r0 = r8.aj;	 Catch:{ all -> 0x0087 }
        r0 = r0 * r5;
        r2 = r8.ar;	 Catch:{ all -> 0x0087 }
        r2 = r2 * r4;
        r0 = r0 - r2;
    L_0x004d:
        monitor-exit(r8);	 Catch:{ all -> 0x0087 }
        if (r0 <= 0) goto L_0x000a;
    L_0x0050:
        r2 = r8.ad;	 Catch:{ IOException -> 0x008a }
        r3 = r8.as;	 Catch:{ IOException -> 0x008a }
        r2.write(r3, r1, r0);	 Catch:{ IOException -> 0x008a }
    L_0x0057:
        r1 = -1911772925; // 0xffffffff8e0ca903 float:-1.7337708E-30 double:NaN;
        r2 = r8.ar;	 Catch:{ Exception -> 0x0078 }
        r2 = r2 * r4;
        r0 = r0 + r2;
        r2 = r8.aq;	 Catch:{ Exception -> 0x0078 }
        r2 = r2 * r6;
        r0 = r0 % r2;
        r0 = r0 * r1;
        r8.ar = r0;	 Catch:{ Exception -> 0x0078 }
        r0 = r8.aj;	 Catch:{ IOException -> 0x0073 }
        r0 = r0 * r5;
        r1 = r8.ar;	 Catch:{ IOException -> 0x0073 }
        r1 = r1 * r4;
        if (r0 != r1) goto L_0x000a;
    L_0x006d:
        r0 = r8.ad;	 Catch:{ IOException -> 0x0073 }
        r0.flush();	 Catch:{ IOException -> 0x0073 }
        goto L_0x000a;
    L_0x0073:
        r0 = move-exception;
        r0 = 1;
        r8.ae = r0;	 Catch:{ Exception -> 0x0078 }
        goto L_0x000a;
    L_0x0078:
        r0 = move-exception;
        r1 = 17626; // 0x44da float:2.4699E-41 double:8.7084E-320;
        p000.ah.af(r7, r0, r1);
        goto L_0x0036;
    L_0x007f:
        r0 = r8.aq;	 Catch:{ all -> 0x0087 }
        r0 = r0 * r6;
        r2 = r8.ar;	 Catch:{ all -> 0x0087 }
        r2 = r2 * r4;
        r0 = r0 - r2;
        goto L_0x004d;
    L_0x0087:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0087 }
        throw r0;	 Catch:{ Exception -> 0x0078 }
    L_0x008a:
        r1 = move-exception;
        r1 = 1;
        r8.ae = r1;	 Catch:{ Exception -> 0x0078 }
        goto L_0x0057;
    L_0x008f:
        r0 = move-exception;
        goto L_0x003a;
    L_0x0091:
        r0 = move-exception;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.bo():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ci() {
        /*
        r6 = this;
        r5 = 0;
        r4 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
    L_0x0004:
        monitor-enter(r6);	 Catch:{ Exception -> 0x008e }
        r0 = r6.ar;	 Catch:{ all -> 0x00a3 }
        r0 = r0 * r4;
        r1 = r6.aj;	 Catch:{ all -> 0x00a3 }
        r2 = 1750693651; // 0x68597713 float:4.1078002E24 double:8.649575894E-315;
        r1 = r1 * r2;
        if (r0 != r1) goto L_0x0037;
    L_0x0010:
        r0 = r6.aa;	 Catch:{ all -> 0x00a3 }
        if (r0 == 0) goto L_0x0034;
    L_0x0014:
        monitor-exit(r6);	 Catch:{ all -> 0x00a3 }
        r0 = r6.af;	 Catch:{ IOException -> 0x00ad }
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r6.af;	 Catch:{ IOException -> 0x00ad }
        r0.close();	 Catch:{ IOException -> 0x00ad }
    L_0x001e:
        r0 = r6.ad;	 Catch:{ IOException -> 0x00ad }
        if (r0 == 0) goto L_0x0027;
    L_0x0022:
        r0 = r6.ad;	 Catch:{ IOException -> 0x00ad }
        r0.close();	 Catch:{ IOException -> 0x00ad }
    L_0x0027:
        r0 = r6.an;	 Catch:{ IOException -> 0x00ad }
        if (r0 == 0) goto L_0x0030;
    L_0x002b:
        r0 = r6.an;	 Catch:{ IOException -> 0x00ad }
        r0.close();	 Catch:{ IOException -> 0x00ad }
    L_0x0030:
        r0 = 0;
        r6.as = r0;	 Catch:{ Exception -> 0x008e }
    L_0x0033:
        return;
    L_0x0034:
        r6.wait();	 Catch:{ InterruptedException -> 0x00ab }
    L_0x0037:
        r0 = -634990943; // 0xffffffffda26cea1 float:-1.17380093E16 double:NaN;
        r1 = r6.ar;	 Catch:{ all -> 0x00a3 }
        r1 = r1 * r0;
        r0 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r2 = r6.aj;	 Catch:{ all -> 0x00a3 }
        r0 = r0 * r2;
        r2 = r6.ar;	 Catch:{ all -> 0x00a3 }
        r3 = 1437226958; // 0x55aa57ce float:2.34117619E13 double:7.10084465E-315;
        r2 = r2 * r3;
        if (r0 < r2) goto L_0x0095;
    L_0x004b:
        r0 = r6.aj;	 Catch:{ all -> 0x00a3 }
        r2 = 1308634416; // 0x4e002d30 float:5.3761126E8 double:6.46551308E-315;
        r0 = r0 * r2;
        r2 = r6.ar;	 Catch:{ all -> 0x00a3 }
        r2 = r2 * r4;
        r0 = r0 - r2;
    L_0x0055:
        monitor-exit(r6);	 Catch:{ all -> 0x00a3 }
        if (r0 <= 0) goto L_0x0004;
    L_0x0058:
        r2 = r6.ad;	 Catch:{ IOException -> 0x00a6 }
        r3 = r6.as;	 Catch:{ IOException -> 0x00a6 }
        r2.write(r3, r1, r0);	 Catch:{ IOException -> 0x00a6 }
    L_0x005f:
        r1 = -1911772925; // 0xffffffff8e0ca903 float:-1.7337708E-30 double:NaN;
        r2 = -86243845; // 0xfffffffffadc05fb float:-5.712133E35 double:NaN;
        r3 = r6.ar;	 Catch:{ Exception -> 0x008e }
        r2 = r2 * r3;
        r0 = r0 + r2;
        r2 = -448879146; // 0xffffffffe53ea5d6 float:-5.62693E22 double:NaN;
        r3 = r6.aq;	 Catch:{ Exception -> 0x008e }
        r2 = r2 * r3;
        r0 = r0 % r2;
        r0 = r0 * r1;
        r6.ar = r0;	 Catch:{ Exception -> 0x008e }
        r0 = 1379275962; // 0x523614ba float:1.95507945E11 double:6.81452869E-315;
        r1 = r6.aj;	 Catch:{ IOException -> 0x0088 }
        r0 = r0 * r1;
        r1 = -444506712; // 0xffffffffe5815da8 float:-7.636412E22 double:NaN;
        r2 = r6.ar;	 Catch:{ IOException -> 0x0088 }
        r1 = r1 * r2;
        if (r0 != r1) goto L_0x0004;
    L_0x0081:
        r0 = r6.ad;	 Catch:{ IOException -> 0x0088 }
        r0.flush();	 Catch:{ IOException -> 0x0088 }
        goto L_0x0004;
    L_0x0088:
        r0 = move-exception;
        r0 = 1;
        r6.ae = r0;	 Catch:{ Exception -> 0x008e }
        goto L_0x0004;
    L_0x008e:
        r0 = move-exception;
        r1 = -15990; // 0xffffffffffffc18a float:NaN double:NaN;
        p000.ah.af(r5, r0, r1);
        goto L_0x0033;
    L_0x0095:
        r0 = r6.aq;	 Catch:{ all -> 0x00a3 }
        r2 = -1621331135; // 0xffffffff9f5c7341 float:-4.6682148E-20 double:NaN;
        r0 = r0 * r2;
        r2 = r6.ar;	 Catch:{ all -> 0x00a3 }
        r3 = -693711326; // 0xffffffffd6a6ce22 float:-9.1702132E13 double:NaN;
        r2 = r2 * r3;
        r0 = r0 - r2;
        goto L_0x0055;
    L_0x00a3:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00a3 }
        throw r0;	 Catch:{ Exception -> 0x008e }
    L_0x00a6:
        r1 = move-exception;
        r1 = 1;
        r6.ae = r1;	 Catch:{ Exception -> 0x008e }
        goto L_0x005f;
    L_0x00ab:
        r0 = move-exception;
        goto L_0x0037;
    L_0x00ad:
        r0 = move-exception;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.ci():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cv() {
        /*
        r8 = this;
        r7 = 0;
        r6 = -1403684797; // 0xffffffffac557843 float:-3.033588E-12 double:NaN;
        r5 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r4 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
    L_0x000a:
        monitor-enter(r8);	 Catch:{ Exception -> 0x007e }
        r0 = r8.ar;	 Catch:{ all -> 0x008d }
        r0 = r0 * r4;
        r1 = r8.aj;	 Catch:{ all -> 0x008d }
        r1 = r1 * r5;
        if (r0 != r1) goto L_0x003a;
    L_0x0013:
        r0 = r8.aa;	 Catch:{ all -> 0x008d }
        if (r0 == 0) goto L_0x0037;
    L_0x0017:
        monitor-exit(r8);	 Catch:{ all -> 0x008d }
        r0 = r8.af;	 Catch:{ IOException -> 0x0097 }
        if (r0 == 0) goto L_0x0021;
    L_0x001c:
        r0 = r8.af;	 Catch:{ IOException -> 0x0097 }
        r0.close();	 Catch:{ IOException -> 0x0097 }
    L_0x0021:
        r0 = r8.ad;	 Catch:{ IOException -> 0x0097 }
        if (r0 == 0) goto L_0x002a;
    L_0x0025:
        r0 = r8.ad;	 Catch:{ IOException -> 0x0097 }
        r0.close();	 Catch:{ IOException -> 0x0097 }
    L_0x002a:
        r0 = r8.an;	 Catch:{ IOException -> 0x0097 }
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r8.an;	 Catch:{ IOException -> 0x0097 }
        r0.close();	 Catch:{ IOException -> 0x0097 }
    L_0x0033:
        r0 = 0;
        r8.as = r0;	 Catch:{ Exception -> 0x007e }
    L_0x0036:
        return;
    L_0x0037:
        r8.wait();	 Catch:{ InterruptedException -> 0x0095 }
    L_0x003a:
        r0 = r8.ar;	 Catch:{ all -> 0x008d }
        r1 = r4 * r0;
        r0 = r8.aj;	 Catch:{ all -> 0x008d }
        r0 = r0 * r5;
        r2 = r8.ar;	 Catch:{ all -> 0x008d }
        r2 = r2 * r4;
        if (r0 < r2) goto L_0x0085;
    L_0x0046:
        r0 = r8.aj;	 Catch:{ all -> 0x008d }
        r2 = -292290202; // 0xffffffffee940166 float:-2.2902736E28 double:NaN;
        r0 = r0 * r2;
        r2 = r8.ar;	 Catch:{ all -> 0x008d }
        r2 = r2 * r4;
        r0 = r0 - r2;
    L_0x0050:
        monitor-exit(r8);	 Catch:{ all -> 0x008d }
        if (r0 <= 0) goto L_0x000a;
    L_0x0053:
        r2 = r8.ad;	 Catch:{ IOException -> 0x0090 }
        r3 = r8.as;	 Catch:{ IOException -> 0x0090 }
        r2.write(r3, r1, r0);	 Catch:{ IOException -> 0x0090 }
    L_0x005a:
        r1 = -1911772925; // 0xffffffff8e0ca903 float:-1.7337708E-30 double:NaN;
        r2 = r8.ar;	 Catch:{ Exception -> 0x007e }
        r2 = r2 * r4;
        r0 = r0 + r2;
        r2 = r8.aq;	 Catch:{ Exception -> 0x007e }
        r2 = r2 * r6;
        r0 = r0 % r2;
        r0 = r0 * r1;
        r8.ar = r0;	 Catch:{ Exception -> 0x007e }
        r0 = r8.aj;	 Catch:{ IOException -> 0x0079 }
        r0 = r0 * r5;
        r1 = -1976698435; // 0xffffffff8a2df9bd float:-8.3766176E-33 double:NaN;
        r2 = r8.ar;	 Catch:{ IOException -> 0x0079 }
        r1 = r1 * r2;
        if (r0 != r1) goto L_0x000a;
    L_0x0073:
        r0 = r8.ad;	 Catch:{ IOException -> 0x0079 }
        r0.flush();	 Catch:{ IOException -> 0x0079 }
        goto L_0x000a;
    L_0x0079:
        r0 = move-exception;
        r0 = 1;
        r8.ae = r0;	 Catch:{ Exception -> 0x007e }
        goto L_0x000a;
    L_0x007e:
        r0 = move-exception;
        r1 = 9777; // 0x2631 float:1.37E-41 double:4.8305E-320;
        p000.ah.af(r7, r0, r1);
        goto L_0x0036;
    L_0x0085:
        r0 = r8.aq;	 Catch:{ all -> 0x008d }
        r0 = r0 * r6;
        r2 = r8.ar;	 Catch:{ all -> 0x008d }
        r2 = r2 * r4;
        r0 = r0 - r2;
        goto L_0x0050;
    L_0x008d:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x008d }
        throw r0;	 Catch:{ Exception -> 0x007e }
    L_0x0090:
        r1 = move-exception;
        r1 = 1;
        r8.ae = r1;	 Catch:{ Exception -> 0x007e }
        goto L_0x005a;
    L_0x0095:
        r0 = move-exception;
        goto L_0x003a;
    L_0x0097:
        r0 = move-exception;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.cv():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7 = this;
        r6 = -1403684797; // 0xffffffffac557843 float:-3.033588E-12 double:NaN;
        r5 = 1646802371; // 0x622835c3 float:7.7573174E20 double:8.13628477E-315;
        r4 = 165546411; // 0x9de09ab float:5.3453648E-33 double:8.17907945E-316;
    L_0x0009:
        monitor-enter(r7);	 Catch:{ Exception -> 0x0077 }
        r0 = r7.ar;	 Catch:{ all -> 0x00a2 }
        r0 = r0 * r4;
        r1 = r7.aj;	 Catch:{ all -> 0x00a2 }
        r1 = r1 * r5;
        if (r0 != r1) goto L_0x0039;
    L_0x0012:
        r0 = r7.aa;	 Catch:{ all -> 0x00a2 }
        if (r0 == 0) goto L_0x0036;
    L_0x0016:
        monitor-exit(r7);	 Catch:{ all -> 0x00a2 }
        r0 = r7.af;	 Catch:{ IOException -> 0x00ac }
        if (r0 == 0) goto L_0x0020;
    L_0x001b:
        r0 = r7.af;	 Catch:{ IOException -> 0x00ac }
        r0.close();	 Catch:{ IOException -> 0x00ac }
    L_0x0020:
        r0 = r7.ad;	 Catch:{ IOException -> 0x00ac }
        if (r0 == 0) goto L_0x0029;
    L_0x0024:
        r0 = r7.ad;	 Catch:{ IOException -> 0x00ac }
        r0.close();	 Catch:{ IOException -> 0x00ac }
    L_0x0029:
        r0 = r7.an;	 Catch:{ IOException -> 0x00ac }
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r7.an;	 Catch:{ IOException -> 0x00ac }
        r0.close();	 Catch:{ IOException -> 0x00ac }
    L_0x0032:
        r0 = 0;
        r7.as = r0;	 Catch:{ Exception -> 0x0077 }
    L_0x0035:
        return;
    L_0x0036:
        r7.wait();	 Catch:{ InterruptedException -> 0x00aa }
    L_0x0039:
        r0 = r7.ar;	 Catch:{ all -> 0x00a2 }
        r1 = r4 * r0;
        r0 = r7.aj;	 Catch:{ all -> 0x00a2 }
        r0 = r0 * r5;
        r2 = r7.ar;	 Catch:{ all -> 0x00a2 }
        r2 = r2 * r4;
        if (r0 < r2) goto L_0x009a;
    L_0x0045:
        r0 = r7.aj;	 Catch:{ all -> 0x00a2 }
        r0 = r0 * r5;
        r2 = r7.ar;	 Catch:{ all -> 0x00a2 }
        r2 = r2 * r4;
        r0 = r0 - r2;
    L_0x004c:
        monitor-exit(r7);	 Catch:{ all -> 0x00a2 }
        if (r0 <= 0) goto L_0x0009;
    L_0x004f:
        r2 = r7.ad;	 Catch:{ IOException -> 0x00a5 }
        r3 = r7.as;	 Catch:{ IOException -> 0x00a5 }
        r2.write(r3, r1, r0);	 Catch:{ IOException -> 0x00a5 }
    L_0x0056:
        r1 = -1911772925; // 0xffffffff8e0ca903 float:-1.7337708E-30 double:NaN;
        r2 = r7.ar;	 Catch:{ Exception -> 0x0077 }
        r2 = r2 * r4;
        r0 = r0 + r2;
        r2 = r7.aq;	 Catch:{ Exception -> 0x0077 }
        r2 = r2 * r6;
        r0 = r0 % r2;
        r0 = r0 * r1;
        r7.ar = r0;	 Catch:{ Exception -> 0x0077 }
        r0 = r7.aj;	 Catch:{ IOException -> 0x0072 }
        r0 = r0 * r5;
        r1 = r7.ar;	 Catch:{ IOException -> 0x0072 }
        r1 = r1 * r4;
        if (r0 != r1) goto L_0x0009;
    L_0x006c:
        r0 = r7.ad;	 Catch:{ IOException -> 0x0072 }
        r0.flush();	 Catch:{ IOException -> 0x0072 }
        goto L_0x0009;
    L_0x0072:
        r0 = move-exception;
        r0 = 1;
        r7.ae = r0;	 Catch:{ Exception -> 0x0077 }
        goto L_0x0009;
    L_0x0077:
        r0 = move-exception;
        r1 = 0;
        r2 = -2610; // 0xfffffffffffff5ce float:NaN double:NaN;
        p000.ah.af(r1, r0, r2);	 Catch:{ RuntimeException -> 0x007f }
        goto L_0x0035;
    L_0x007f:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "mg.run(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
    L_0x009a:
        r0 = r7.aq;	 Catch:{ all -> 0x00a2 }
        r0 = r0 * r6;
        r2 = r7.ar;	 Catch:{ all -> 0x00a2 }
        r2 = r2 * r4;
        r0 = r0 - r2;
        goto L_0x004c;
    L_0x00a2:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x00a2 }
        throw r0;	 Catch:{ Exception -> 0x0077 }
    L_0x00a5:
        r1 = move-exception;
        r1 = 1;
        r7.ae = r1;	 Catch:{ Exception -> 0x0077 }
        goto L_0x0056;
    L_0x00aa:
        r0 = move-exception;
        goto L_0x0039;
    L_0x00ac:
        r0 = move-exception;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.run():void");
    }

    public void as(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            ay(bArr, i, i2, -1114665132);
        } catch (Throwable e) {
            throw ba.ad(e, "mg.as(" + ')');
        }
    }

    public void au(byte[] bArr, int i, int i2) throws IOException {
        ay(bArr, i, i2, 90875125);
    }

    public void av(byte[] bArr, int i, int i2) throws IOException {
        ay(bArr, i, i2, -1269368843);
    }

    public void ax(byte[] bArr, int i, int i2) throws IOException {
        ay(bArr, i, i2, 1710854908);
    }

    static void at(lr lrVar, lr lrVar2, lr lrVar3, boolean z, gf gfVar, int i) {
        try {
            gfVar.ad(-1329100297);
            gr.ad = (((ds.rg * -1946576867) - 765) / 2) * -17113271;
            gr.au = 447559442 + (-332095827 * gr.ad);
            cs.av = (-256483487 * gr.au) + 1370065220;
            if (gr.cg) {
                db.ak(lrVar, lrVar2, gfVar, -298251787);
                return;
            }
            long af = hu.af(930474923);
            if (-1151304247104757783L * gr.db == -1) {
                gr.dm = (300 + af) * 8481783696352952085L;
                gr.db = (gr.dm * 3508923411882210613L) - 1066117795797102440L;
            }
            if (af >= 2411161275658803261L * gr.dm) {
                int af2;
                int i2;
                int i3;
                String ab;
                int i4;
                if (af < -1151304247104757783L * gr.db) {
                    af2 = (int) (gr.dn.af(1.0f - (((float) ((gr.db * -1151304247104757783L) - af)) / 600.0f), -1864489520) * 383.0f);
                    gfVar.fj((-2051486435 * cs.av) - af2, 0, (-2051486435 * cs.av) + af2, ca.lq, -1879486423);
                }
                ej.au(gfVar, (byte) -84);
                if (-1088302269 * client.az == 0 || client.az * -1088302269 == 5) {
                    lrVar.am(jv.ij, (gr.au * 1103198973) + 180, (((-1519423211 * gr.ak) + 100) - 26) - 20, 16777215, -1, gfVar);
                    i2 = (((-1519423211 * gr.ak) + 100) - 18) - 20;
                    gfVar.fi(((1103198973 * gr.au) + 180) - 152, i2, 304, 34, 9179409, 859926249);
                    gfVar.fi(((1103198973 * gr.au) + 180) - 151, i2 + 1, 302, 32, 0, 1150668420);
                    gfVar.aa(((1103198973 * gr.au) + 180) - 150, i2 + 2, gr.bk * -1507374741, 30, 9179409, (byte) -2);
                    gfVar.aa((((gr.au * 1103198973) + 180) - 150) + (gr.bk * -1507374741), i2 + 2, 300 - (gr.bk * -1507374741), 30, 0, (byte) -68);
                    lrVar.am(gr.by, (gr.au * 1103198973) + 180, (((-1519423211 * gr.ak) + 100) + 5) - 20, 16777215, -1, gfVar);
                }
                if (20 == -1088302269 * client.az) {
                    gfVar.ao(ce.an, ((1103198973 * gr.au) + 180) - (ce.an.an / 2), ((gr.ak * -1519423211) + 100) - (ce.an.aa / 2), (short) -21298);
                    i3 = ((gr.ak * -1519423211) + 100) - 70;
                    lrVar.am(gr.cv, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                    i3 += 15;
                    lrVar.am(gr.ci, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                    i3 += 15;
                    lrVar.am(gr.cc, (1103198973 * gr.au) + 180, i3, 16776960, 0, gfVar);
                    i3 = (i3 + 15) + 7;
                    if (1773673955 * gr.bq != 4) {
                        lrVar.aj(jv.il, ((gr.au * 1103198973) + 180) - 110, i3, 16777215, 0, gfVar);
                        if (cs.oj.as) {
                            ab = lh.ab(gr.co, -306674912);
                        } else {
                            ab = gr.co;
                        }
                        while (lrVar.aa(ab) > 200) {
                            ab = ab.substring(0, ab.length() - 1);
                        }
                        lrVar.aj(lr.ar(ab), ((gr.au * 1103198973) + 180) - 70, i3, 16777215, 0, gfVar);
                        i3 += 15;
                        lrVar.aj(jv.js + lh.ab(gr.cy, -306674912), ((1103198973 * gr.au) + 180) - 108, i3, 16777215, 0, gfVar);
                        af2 = i3 + 15;
                    }
                }
                if (10 == -1088302269 * client.az || 11 == -1088302269 * client.az) {
                    gfVar.ao(ce.an, gr.au * 1103198973, -1519423211 * gr.ak, (short) 3683);
                    int af3;
                    if (1773673955 * gr.bq == 0) {
                        i3 = ((gr.ak * -1519423211) + 100) - 20;
                        lrVar.am(jv.jb, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                        af2 = i3 + 30;
                        af2 = ((1103198973 * gr.au) + 180) - 80;
                        int i5 = ((gr.ak * -1519423211) + 100) + 20;
                        gfVar.ao(gr.aa, af2 - 73, i5 - 20, (short) -10136);
                        lrVar.at(jv.ja, af2 - 73, i5 - 20, 144, 40, 16777215, 0, 1, 1, 0, gfVar);
                        af2 = ((1103198973 * gr.au) + 180) + 80;
                        gfVar.ao(gr.aa, af2 - 73, i5 - 20, (short) -20727);
                        lrVar.at(jv.jy, af2 - 73, i5 - 20, 144, 40, 16777215, 0, 1, 1, 0, gfVar);
                        int i6 = i5 + 50;
                        if (-1 != 5805024227786355085L * gr.dx && af >= gr.dx * 5805024227786355085L && (-1 == gr.dh * -1555930555276393901L || af < (-1555930555276393901L * gr.dh) + 5000)) {
                            int aa;
                            String str;
                            hs av = it.av(-391066351);
                            String str2 = "All game assets pre-cached";
                            i2 = lrVar2.aa(str2);
                            int i7 = 9226041;
                            float f = 1.0f;
                            int i8 = ((1103198973 * gr.au) + 180) - 150;
                            if (av != null) {
                                i3 = gt.au((byte) 0);
                                i7 = 3261415;
                                String str3 = "Pre-caching game assets - ";
                                i5 = (i3 * 300) / lm.ar;
                                aa = lrVar2.aa(str3 + "99.11%");
                                str = str3 + gr.dz.format((double) (((float) i3) / 100.0f)) + "%";
                            } else {
                                i5 = 300;
                                aa = i2;
                                str = str2;
                            }
                            if (gr.dh * -1555930555276393901L != -1 && af > 4700 + (gr.dh * -1555930555276393901L)) {
                                f = 1.0f - (((float) ((af - (gr.dh * -1555930555276393901L)) - 4700)) / 300.0f);
                            } else if (af < 300 + (5805024227786355085L * gr.dx)) {
                                f = ((float) (af - (5805024227786355085L * gr.dx))) / 300.0f;
                            }
                            gfVar.ft(gr.du, -792333433);
                            if (1.0f != f) {
                                af3 = (int) (gr.dv.af(f, -628718042) * 304.0f);
                                i4 = ((1103198973 * gr.au) + 180) - (af3 / 2);
                                gfVar.fj(i4, i6 - 14, af3 + i4, (i6 - 14) + 20, -1879486423);
                            }
                            int i9 = (int) (128.0f * f);
                            int i10 = (int) (f * 255.0f);
                            gfVar.fw(i8 - 2, i6 - 14, 304, 20, i7, i9, -1858071021);
                            gfVar.an(i8, i6 - 12, i5, 16, i7, i9, (byte) 8);
                            lrVar2.ae(str, ((gr.au * 1103198973) + 180) - (aa / 2), i6, 16777215, 0, i10, gfVar);
                            gfVar.fy(gr.du, 1095873449);
                        }
                    } else if (1773673955 * gr.bq == 1) {
                        lrVar.am(gr.bo, (gr.au * 1103198973) + 180, ((-1519423211 * gr.ak) + 100) - 70, 16776960, 0, gfVar);
                        i3 = ((-1519423211 * gr.ak) + 100) - 35;
                        lrVar.am(gr.cv, (1103198973 * gr.au) + 180, i3, 16777215, 0, gfVar);
                        i3 += 15;
                        lrVar.am(gr.ci, (1103198973 * gr.au) + 180, i3, 16777215, 0, gfVar);
                        i3 += 15;
                        lrVar.am(gr.cc, (1103198973 * gr.au) + 180, i3, 16777215, 0, gfVar);
                        af2 = i3 + 15;
                        i2 = ((1103198973 * gr.au) + 180) - 80;
                        i4 = ((-1519423211 * gr.ak) + 100) + 50;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) 12077);
                        lrVar.am(jv.as, i2, i4 + 5, 16777215, 0, gfVar);
                        i2 = ((1103198973 * gr.au) + 180) + 80;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) 19806);
                        lrVar.am(jv.jd, i2, i4 + 5, 16777215, 0, gfVar);
                    } else if (2 == gr.bq * 1773673955) {
                        i3 = ((gr.ak * -1519423211) + 100) - 70;
                        lrVar.am(gr.cv, cs.av * -2051486435, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar.am(gr.ci, cs.av * -2051486435, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar.am(gr.cc, cs.av * -2051486435, i3, 16776960, 0, gfVar);
                        i3 = (i3 + 15) + 7;
                        lrVar.aj(jv.il, (-2051486435 * cs.av) - 110, i3, 16777215, 0, gfVar);
                        ab = cs.oj.as ? lh.ab(gr.co, -306674912) : gr.co;
                        while (lrVar.aa(ab) > 200) {
                            ab = ab.substring(1);
                        }
                        StringBuilder append = new StringBuilder().append(lr.ar(ab));
                        if (-2099968095 * gr.cf == 0) {
                            af3 = 1;
                        } else {
                            af3 = 0;
                        }
                        if ((1581849891 * client.ak) % 40 < 20) {
                            af2 = 1;
                        } else {
                            af2 = 0;
                        }
                        if ((af2 & af3) != 0) {
                            ab = gg.ad(16776960, (short) 300) + ha.an;
                        } else {
                            ab = "";
                        }
                        lrVar.aj(append.append(ab).toString(), (cs.av * -2051486435) - 70, i3, 16777215, 0, gfVar);
                        i3 += 15;
                        append = new StringBuilder().append(jv.js).append(lh.ab(gr.cy, -306674912));
                        if (-2099968095 * gr.cf == 1) {
                            af3 = 1;
                        } else {
                            af3 = 0;
                        }
                        if ((1581849891 * client.ak) % 40 < 20) {
                            af2 = 1;
                        } else {
                            af2 = 0;
                        }
                        if ((af2 & af3) != 0) {
                            ab = gg.ad(16776960, (short) 300) + ha.an;
                        } else {
                            ab = "";
                        }
                        lrVar.aj(append.append(ab).toString(), (cs.av * -2051486435) - 108, i3, 16777215, 0, gfVar);
                        af2 = i3 + 15;
                        i4 = (gr.ak * -1519423211) + lz.dj;
                        af2 = (-2051486435 * cs.av) - 117;
                        gd an = ao.an(gr.cn, gr.cq, (short) 18767);
                        gfVar.ao(an, af2, i4, (short) -25591);
                        lrVar2.aj(jv.jr, af2 + (an.an + 5), i4 + 13, 16776960, 0, gfVar);
                        af2 = (-2051486435 * cs.av) + 24;
                        an = ao.an(cs.oj.as, gr.cj, (short) 1036);
                        gfVar.ao(an, af2, i4, (short) -5035);
                        lrVar2.aj(jv.jv, af2 + (an.an + 5), i4 + 13, 16776960, 0, gfVar);
                        af2 = i4 + 15;
                        i2 = (cs.av * -2051486435) - 80;
                        i4 = ((-1519423211 * gr.ak) + 100) + 50;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) 937);
                        lrVar.am(jv.jk, i2, i4 + 5, 16777215, 0, gfVar);
                        i2 = (cs.av * -2051486435) + 80;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) -1170);
                        lrVar.am(jv.jd, i2, i4 + 5, 16777215, 0, gfVar);
                        lrVar2.am(jv.ju, -2051486435 * cs.av, ((gr.ak * -1519423211) + 100) + 86, 16776960, 0, gfVar);
                    } else if (gr.bq * 1773673955 == 3) {
                        i3 = ((-1519423211 * gr.ak) + 100) - 70;
                        lrVar.am(jv.jx, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                        i3 += 20;
                        lrVar2.am(jv.ji, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar2.am(jv.jc, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                        af2 = i3 + 15;
                        i2 = (1103198973 * gr.au) + 180;
                        af2 = ((gr.ak * -1519423211) + 100) + 5;
                        gfVar.ao(gr.aa, i2 - 73, af2 - 20, (short) 8333);
                        lrVar3.am(jv.jz, i2, af2 + 5, 16777215, 0, gfVar);
                        i2 = (1103198973 * gr.au) + 180;
                        af2 = ((-1519423211 * gr.ak) + 100) + 55;
                        gfVar.ao(gr.aa, i2 - 73, af2 - 20, (short) 12566);
                        lrVar3.am(jv.jl, i2, af2 + 5, 16777215, 0, gfVar);
                    } else if (1773673955 * gr.bq == 4) {
                        gd gdVar;
                        lrVar.am(jv.ip, (gr.au * 1103198973) + 180, ((-1519423211 * gr.ak) + 100) - 70, 16776960, 0, gfVar);
                        i3 = ((-1519423211 * gr.ak) + 100) - 35;
                        lrVar.am(gr.cv, (1103198973 * gr.au) + 180, i3, 16777215, 0, gfVar);
                        i3 += 15;
                        lrVar.am(gr.ci, (1103198973 * gr.au) + 180, i3, 16777215, 0, gfVar);
                        i3 += 15;
                        lrVar.am(gr.cc, (gr.au * 1103198973) + 180, i3, 16777215, 0, gfVar);
                        i3 += 15;
                        r5 = new StringBuilder().append(jv.jp).append(lh.ab(eq.ct, -306674912));
                        if ((client.ak * 1581849891) % 40 < 20) {
                            ab = gg.ad(16776960, (short) 300) + ha.an;
                        } else {
                            ab = "";
                        }
                        lrVar.aj(r5.append(ab).toString(), ((1103198973 * gr.au) + 180) - 108, i3, 16777215, 0, gfVar);
                        i3 -= 8;
                        lrVar.aj(jv.ae, ((gr.au * 1103198973) + 180) - 9, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar.aj(jv.aq, ((gr.au * 1103198973) + 180) - 9, i3, 16776960, 0, gfVar);
                        af3 = ((((gr.au * 1103198973) + 180) - 9) + lrVar.aa(jv.aq)) + 15;
                        i2 = i3 - lrVar.as;
                        if (gr.cb) {
                            gdVar = gr.at;
                        } else {
                            gdVar = bq.aq;
                        }
                        gfVar.ao(gdVar, af3, i2, (short) 18316);
                        af2 = i3 + 15;
                        i2 = ((1103198973 * gr.au) + 180) - 80;
                        i4 = ((gr.ak * -1519423211) + 100) + 50;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) 2285);
                        lrVar.am(jv.as, i2, i4 + 5, 16777215, 0, gfVar);
                        i2 = ((1103198973 * gr.au) + 180) + 80;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) -9451);
                        lrVar.am(jv.jd, i2, i4 + 5, 16777215, 0, gfVar);
                        lrVar2.am(jv.iw, (gr.au * 1103198973) + 180, i4 + 36, 255, 0, gfVar);
                    } else if (1773673955 * gr.bq == 5) {
                        lrVar.am(jv.jt, (1103198973 * gr.au) + 180, ((-1519423211 * gr.ak) + 100) - 70, 16776960, 0, gfVar);
                        i3 = ((gr.ak * -1519423211) + 100) - 50;
                        lrVar3.am(gr.cv, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar3.am(gr.ci, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar3.am(gr.cc, (1103198973 * gr.au) + 180, i3, 16776960, 0, gfVar);
                        i3 = (i3 + 15) + 14;
                        lrVar.aj(jv.jm, ((1103198973 * gr.au) + 180) - 145, i3, 16777215, 0, gfVar);
                        ab = cs.oj.as ? lh.ab(gr.co, -306674912) : gr.co;
                        while (lrVar.aa(ab) > 174) {
                            ab = ab.substring(1);
                        }
                        r5 = new StringBuilder().append(lr.ar(ab));
                        if ((client.ak * 1581849891) % 40 < 20) {
                            ab = gg.ad(16776960, (short) 300) + ha.an;
                        } else {
                            ab = "";
                        }
                        lrVar.aj(r5.append(ab).toString(), ((1103198973 * gr.au) + 180) - 34, i3, 16777215, 0, gfVar);
                        af2 = i3 + 15;
                        i2 = ((1103198973 * gr.au) + 180) - 80;
                        i4 = ((gr.ak * -1519423211) + 100) + 50;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) -7419);
                        lrVar.am(jv.jh, i2, i4 + 5, 16777215, 0, gfVar);
                        i2 = ((1103198973 * gr.au) + 180) + 80;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) -9567);
                        lrVar.am(jv.je, i2, i4 + 5, 16777215, 0, gfVar);
                    } else if (6 == 1773673955 * gr.bq) {
                        i3 = ((-1519423211 * gr.ak) + 100) - 70;
                        lrVar.am(gr.cv, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar.am(gr.ci, (1103198973 * gr.au) + 180, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar.am(gr.cc, (1103198973 * gr.au) + 180, i3, 16776960, 0, gfVar);
                        af2 = i3 + 15;
                        i2 = (1103198973 * gr.au) + 180;
                        af2 = ((-1519423211 * gr.ak) + 100) + 50;
                        gfVar.ao(gr.aa, i2 - 73, af2 - 20, (short) 8779);
                        lrVar.am(jv.je, i2, af2 + 5, 16777215, 0, gfVar);
                    } else if (7 == gr.bq * 1773673955) {
                        i3 = ((gr.ak * -1519423211) + 100) - 55;
                        lrVar.am(jv.ka, (1103198973 * gr.au) + 180, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar3.am(jv.ko, (1103198973 * gr.au) + 180, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar3.am(jv.ku, (gr.au * 1103198973) + 180, i3, 16776960, 0, gfVar);
                        af2 = i3 + 15;
                        i2 = ((gr.au * 1103198973) + 180) - 80;
                        i4 = ((gr.ak * -1519423211) + 100) + 50;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) -8065);
                        lrVar.am(jv.kq, i2, i4 + 5, 16777215, 0, gfVar);
                        i2 = ((1103198973 * gr.au) + 180) + 80;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) 7001);
                        lrVar.am(jv.je, i2, i4 + 5, 16777215, 0, gfVar);
                    } else if (8 == gr.bq * 1773673955) {
                        i3 = ((gr.ak * -1519423211) + 100) - 55;
                        lrVar.am(jv.fl, (1103198973 * gr.au) + 180, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar3.am(jv.fh, (1103198973 * gr.au) + 180, i3, 16776960, 0, gfVar);
                        i3 += 15;
                        lrVar3.am(jv.fb, (1103198973 * gr.au) + 180, i3, 16776960, 0, gfVar);
                        af2 = i3 + 15;
                        i2 = ((gr.au * 1103198973) + 180) - 80;
                        i4 = ((gr.ak * -1519423211) + 100) + 50;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) -468);
                        lrVar.am(jv.fr, i2, i4 + 5, 16777215, 0, gfVar);
                        i2 = ((1103198973 * gr.au) + 180) + 80;
                        gfVar.ao(gr.aa, i2 - 73, i4 - 20, (short) -4771);
                        lrVar.am(jv.je, i2, i4 + 5, 16777215, 0, gfVar);
                    }
                }
                if (gr.bu * 1774873797 > 0) {
                    be.ai(gr.bu * 1774873797, -262879787);
                    gr.bu = 0;
                }
                if (af >= -1151304247104757783L * gr.db) {
                    dy.ah(gfVar, (byte) 46);
                }
                gd[] gdVarArr = gr.ae;
                if (cs.oj.aa) {
                    af2 = 1;
                } else {
                    af2 = 0;
                }
                gfVar.ao(gdVarArr[af2], ((gr.ad * 286016249) + 765) - 40, 463, (short) 3280);
                if (client.az * -1088302269 > 5 && -1387037251 * client.aq == 0) {
                    if (dr.dj != null) {
                        i4 = (gr.ad * 286016249) + 5;
                        gfVar.ao(dr.dj, i4, 463, (short) 5086);
                        lrVar.am(jv.gb + " " + (client.an * -1304916389), i4 + 50, 478, 16777215, 0, gfVar);
                        if (gu.ae != null) {
                            lrVar2.am(jv.lx, i4 + 50, 492, 16777215, 0, gfVar);
                            return;
                        } else {
                            lrVar2.am(jv.lp, i4 + 50, 492, 16777215, 0, gfVar);
                            return;
                        }
                    }
                    dr.dj = dp.ay(hq.ci, "sl_button", "", -2037679469);
                }
            }
        } catch (Throwable e) {
            throw ba.ad(e, "mg.at(" + ')');
        }
    }
}
