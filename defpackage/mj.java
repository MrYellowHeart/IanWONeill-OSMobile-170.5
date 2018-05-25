package p000;

public class mj implements Runnable {
    static String ad = null;
    static String af = null;
    static final int aj = 4;
    mb aa;
    Thread ag;
    mb an;
    boolean ay;

    public mj() {
        try {
            this.an = null;
            this.aa = null;
            this.ay = false;
            af = "Unknown";
            ad = "1.6";
            try {
                af = System.getProperty("java.vendor");
                ad = System.getProperty("java.version");
            } catch (Exception e) {
            }
            this.ay = false;
            this.ag = new Thread(this);
            this.ag.setPriority(10);
            this.ag.setDaemon(true);
            this.ag.start();
        } catch (Throwable e2) {
            throw ba.ad(e2, "mj.<init>(" + ')');
        }
    }

    public static int ad(char c, int i, int i2) {
        int i3 = c << 4;
        try {
            if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
                return (Character.toLowerCase(c) << 4) + 1;
            }
            return i3;
        } catch (Throwable e) {
            throw ba.ad(e, "mj.ad(" + ')');
        }
    }

    public final void af(int i) {
        try {
            synchronized (this) {
                this.ay = true;
                notifyAll();
            }
            try {
                this.ag.join();
            } catch (InterruptedException e) {
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "mj.af(" + ')');
        }
    }

    public final void ag() {
        synchronized (this) {
            this.ay = true;
            notifyAll();
        }
        try {
            this.ag.join();
        } catch (InterruptedException e) {
        }
    }

    public final void ay() {
        synchronized (this) {
            this.ay = true;
            notifyAll();
        }
        try {
            this.ag.join();
        } catch (InterruptedException e) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bo() {
        /*
        r6 = this;
        r5 = 2;
        r4 = 1;
    L_0x0002:
        monitor-enter(r6);
    L_0x0003:
        r0 = r6.ay;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        return;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x003c;
    L_0x000d:
        r1 = r6.an;	 Catch:{ all -> 0x0042 }
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        r0 = r0.af;	 Catch:{ all -> 0x0042 }
        r6.an = r0;	 Catch:{ all -> 0x0042 }
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        if (r0 != 0) goto L_0x001c;
    L_0x0019:
        r0 = 0;
        r6.aa = r0;	 Catch:{ all -> 0x0042 }
    L_0x001c:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        r0 = r1.ay;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2 = 1130661193; // 0x43648549 float:228.52065 double:5.586208525E-315;
        r0 = r0 * r2;
        if (r0 != r4) goto L_0x0045;
    L_0x0025:
        r2 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.lang.String) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = java.net.InetAddress.getByName(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r3 = r1.as;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0, r3);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
    L_0x0036:
        r0 = 1;
        r1.ag = r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0002;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r6.wait();	 Catch:{ InterruptedException -> 0x0040 }
        goto L_0x0003;
    L_0x0040:
        r0 = move-exception;
        goto L_0x0003;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        throw r0;
    L_0x0045:
        if (r5 != r0) goto L_0x0063;
    L_0x0047:
        r2 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.lang.Runnable) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = 1;
        r2.setDaemon(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.start();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.as;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.setPriority(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0036;
    L_0x005f:
        r0 = move-exception;
        r1.ag = r5;
        goto L_0x0002;
    L_0x0063:
        r2 = 4;
        if (r0 != r2) goto L_0x0036;
    L_0x0066:
        r2 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.net.URL) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r0.openStream();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.bo():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ci() {
        /*
        r6 = this;
        r5 = 2;
        r4 = 1;
    L_0x0002:
        monitor-enter(r6);
    L_0x0003:
        r0 = r6.ay;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        return;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x003c;
    L_0x000d:
        r1 = r6.an;	 Catch:{ all -> 0x0042 }
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        r0 = r0.af;	 Catch:{ all -> 0x0042 }
        r6.an = r0;	 Catch:{ all -> 0x0042 }
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        if (r0 != 0) goto L_0x001c;
    L_0x0019:
        r0 = 0;
        r6.aa = r0;	 Catch:{ all -> 0x0042 }
    L_0x001c:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        r0 = r1.ay;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2 = 1130661193; // 0x43648549 float:228.52065 double:5.586208525E-315;
        r0 = r0 * r2;
        if (r0 != r4) goto L_0x0045;
    L_0x0025:
        r2 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.lang.String) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = java.net.InetAddress.getByName(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r3 = r1.as;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0, r3);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
    L_0x0036:
        r0 = 1;
        r1.ag = r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0002;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r6.wait();	 Catch:{ InterruptedException -> 0x0040 }
        goto L_0x0003;
    L_0x0040:
        r0 = move-exception;
        goto L_0x0003;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        throw r0;
    L_0x0045:
        if (r5 != r0) goto L_0x0063;
    L_0x0047:
        r2 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.lang.Runnable) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = 1;
        r2.setDaemon(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.start();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.as;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.setPriority(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0036;
    L_0x005f:
        r0 = move-exception;
        r1.ag = r5;
        goto L_0x0002;
    L_0x0063:
        r2 = 4;
        if (r0 != r2) goto L_0x0036;
    L_0x0066:
        r2 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.net.URL) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r0.openStream();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.ci():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void cv() {
        /*
        r6 = this;
        r5 = 2;
        r4 = 1;
    L_0x0002:
        monitor-enter(r6);
    L_0x0003:
        r0 = r6.ay;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        return;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x003c;
    L_0x000d:
        r1 = r6.an;	 Catch:{ all -> 0x0042 }
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        r0 = r0.af;	 Catch:{ all -> 0x0042 }
        r6.an = r0;	 Catch:{ all -> 0x0042 }
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        if (r0 != 0) goto L_0x001c;
    L_0x0019:
        r0 = 0;
        r6.aa = r0;	 Catch:{ all -> 0x0042 }
    L_0x001c:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        r0 = r1.ay;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2 = 1130661193; // 0x43648549 float:228.52065 double:5.586208525E-315;
        r0 = r0 * r2;
        if (r0 != r4) goto L_0x0045;
    L_0x0025:
        r2 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.lang.String) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = java.net.InetAddress.getByName(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r3 = r1.as;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0, r3);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
    L_0x0036:
        r0 = 1;
        r1.ag = r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0002;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r6.wait();	 Catch:{ InterruptedException -> 0x0040 }
        goto L_0x0003;
    L_0x0040:
        r0 = move-exception;
        goto L_0x0003;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        throw r0;
    L_0x0045:
        if (r5 != r0) goto L_0x0063;
    L_0x0047:
        r2 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.lang.Runnable) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = 1;
        r2.setDaemon(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.start();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.as;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.setPriority(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0036;
    L_0x005f:
        r0 = move-exception;
        r1.ag = r5;
        goto L_0x0002;
    L_0x0063:
        r2 = 4;
        if (r0 != r2) goto L_0x0036;
    L_0x0066:
        r2 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.net.URL) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r0.openStream();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.cv():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r6 = this;
        r5 = 2;
        r4 = 1;
    L_0x0002:
        monitor-enter(r6);	 Catch:{ RuntimeException -> 0x003c }
    L_0x0003:
        r0 = r6.ay;	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x005d }
        return;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x0057;
    L_0x000d:
        r1 = r6.an;	 Catch:{ all -> 0x005d }
        r0 = r6.an;	 Catch:{ all -> 0x005d }
        r0 = r0.af;	 Catch:{ all -> 0x005d }
        r6.an = r0;	 Catch:{ all -> 0x005d }
        r0 = r6.an;	 Catch:{ all -> 0x005d }
        if (r0 != 0) goto L_0x001c;
    L_0x0019:
        r0 = 0;
        r6.aa = r0;	 Catch:{ all -> 0x005d }
    L_0x001c:
        monitor-exit(r6);	 Catch:{ all -> 0x005d }
        r0 = r1.ay;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2 = 1130661193; // 0x43648549 float:228.52065 double:5.586208525E-315;
        r0 = r0 * r2;
        if (r0 != r4) goto L_0x0060;
    L_0x0025:
        r2 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = (java.lang.String) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = java.net.InetAddress.getByName(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r3 = r1.as;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.<init>(r0, r3);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
    L_0x0036:
        r0 = 1;
        r1.ag = r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        goto L_0x0002;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "mj.run(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
    L_0x0057:
        r6.wait();	 Catch:{ InterruptedException -> 0x005b }
        goto L_0x0003;
    L_0x005b:
        r0 = move-exception;
        goto L_0x0003;
    L_0x005d:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x005d }
        throw r0;	 Catch:{ RuntimeException -> 0x003c }
    L_0x0060:
        if (r5 != r0) goto L_0x007f;
    L_0x0062:
        r2 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = (java.lang.Runnable) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = 1;
        r2.setDaemon(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.start();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r1.as;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.setPriority(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        goto L_0x0036;
    L_0x007a:
        r0 = move-exception;
        r0 = 2;
        r1.ag = r0;	 Catch:{ RuntimeException -> 0x003c }
        goto L_0x0002;
    L_0x007f:
        r2 = 4;
        if (r0 != r2) goto L_0x0036;
    L_0x0082:
        r2 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r1.ar;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = (java.net.URL) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r0.openStream();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r1.aj = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.run():void");
    }

    final mb ad(int i, int i2, int i3, Object obj, int i4) {
        try {
            mb mbVar = new mb();
            mbVar.ay = 743668985 * i;
            mbVar.as = i2;
            mbVar.ar = obj;
            synchronized (this) {
                if (this.aa != null) {
                    this.aa.af = mbVar;
                    this.aa = mbVar;
                } else {
                    this.an = mbVar;
                    this.aa = mbVar;
                }
                notify();
            }
            return mbVar;
        } catch (Throwable e) {
            throw ba.ad(e, "mj.ad(" + ')');
        }
    }

    final mb aj(int i, int i2, int i3, Object obj) {
        mb mbVar = new mb();
        mbVar.ay = 743668985 * i;
        mbVar.as = i2;
        mbVar.ar = obj;
        synchronized (this) {
            if (this.aa != null) {
                this.aa.af = mbVar;
                this.aa = mbVar;
            } else {
                this.an = mbVar;
                this.aa = mbVar;
            }
            notify();
        }
        return mbVar;
    }

    final mb ar(int i, int i2, int i3, Object obj) {
        mb mbVar = new mb();
        mbVar.ay = 743668985 * i;
        mbVar.as = i2;
        mbVar.ar = obj;
        synchronized (this) {
            if (this.aa != null) {
                this.aa.af = mbVar;
                this.aa = mbVar;
            } else {
                this.an = mbVar;
                this.aa = mbVar;
            }
            notify();
        }
        return mbVar;
    }

    final mb as(int i, int i2, int i3, Object obj) {
        mb mbVar = new mb();
        mbVar.ay = 743668985 * i;
        mbVar.as = i2;
        mbVar.ar = obj;
        synchronized (this) {
            if (this.aa != null) {
                this.aa.af = mbVar;
                this.aa = mbVar;
            } else {
                this.an = mbVar;
                this.aa = mbVar;
            }
            notify();
        }
        return mbVar;
    }

    public final mb ae(String str, int i) {
        return ad(1, i, 0, str, 1186135388);
    }

    public final mb am(String str, int i) {
        return ad(1, i, 0, str, 1828925786);
    }

    public final mb an(String str, int i, byte b) {
        try {
            return ad(1, i, 0, str, -753262984);
        } catch (Throwable e) {
            throw ba.ad(e, "mj.an(" + ')');
        }
    }

    public final mb aq(String str, int i) {
        return ad(1, i, 0, str, -84677568);
    }

    public final mb at(String str, int i) {
        return ad(1, i, 0, str, -162195743);
    }

    public final mb aa(Runnable runnable, int i, byte b) {
        try {
            return ad(2, i, 0, runnable, 566949100);
        } catch (Throwable e) {
            throw ba.ad(e, "mj.aa(" + ')');
        }
    }

    public final mb ab(Runnable runnable, int i) {
        return ad(2, i, 0, runnable, 1018421152);
    }

    public final mb aw(Runnable runnable, int i) {
        return ad(2, i, 0, runnable, -1499945531);
    }
}
