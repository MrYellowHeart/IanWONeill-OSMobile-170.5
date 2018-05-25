package p000;

import java.util.Collection;

public class hp {
    static final int af = 1;
    static final int am = 512;
    public static final int aq = 13;
    boolean[] aa;
    int[] ag;
    boolean[] an;
    long ar;
    boolean as;
    String[] ay;

    hp() {
        try {
            int i;
            byte[] an;
            this.as = false;
            this.ag = new int[bi.br.aw(19, -597492850)];
            this.ay = new String[bi.br.aw(15, -1932190927)];
            this.an = new boolean[this.ag.length];
            for (i = 0; i < this.ag.length; i++) {
                aq aqVar = (aq) aq.ad.af((long) i);
                if (aqVar == null) {
                    an = aq.af.an(19, i, -633582212);
                    aqVar = new aq();
                    if (an != null) {
                        aqVar.ad(new ik(an), -1481814514);
                    }
                    aq.ad.an(aqVar, (long) i);
                }
                this.an[i] = aqVar.an;
            }
            this.aa = new boolean[this.ay.length];
            for (i = 0; i < this.ay.length; i++) {
                an anVar = (an) an.ad.af((long) i);
                if (anVar == null) {
                    an = an.af.an(15, i, -418604815);
                    anVar = new an();
                    if (an != null) {
                        anVar.af(new ik(an), -1633679588);
                    }
                    an.ad.an(anVar, (long) i);
                }
                this.aa[i] = anVar.an;
            }
            for (int i2 = 0; i2 < this.ag.length; i2++) {
                this.ag[i2] = -1;
            }
            ar(-1661064070);
        } catch (Throwable e) {
            throw ba.ad(e, "hp.<init>(" + ')');
        }
    }

    void af(int i, int i2, int i3) {
        try {
            this.ag[i] = i2;
            if (this.an[i]) {
                this.as = true;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "hp.af(" + ')');
        }
    }

    int ad(int i, int i2) {
        try {
            return this.ag[i];
        } catch (Throwable e) {
            throw ba.ad(e, "hp.ad(" + ')');
        }
    }

    int am(int i) {
        return this.ag[i];
    }

    int aq(int i) {
        return this.ag[i];
    }

    int at(int i) {
        return this.ag[i];
    }

    void ab(int i, String str) {
        this.ay[i] = str;
        if (this.aa[i]) {
            this.as = true;
        }
    }

    void ai(int i, String str) {
        this.ay[i] = str;
        if (this.aa[i]) {
            this.as = true;
        }
    }

    void an(int i, String str, int i2) {
        try {
            this.ay[i] = str;
            if (this.aa[i]) {
                this.as = true;
            }
        } catch (Throwable e) {
            throw ba.ad(e, "hp.an(" + ')');
        }
    }

    void aw(int i, String str) {
        this.ay[i] = str;
        if (this.aa[i]) {
            this.as = true;
        }
    }

    void az(int i, String str) {
        this.ay[i] = str;
        if (this.aa[i]) {
            this.as = true;
        }
    }

    String aa(int i, int i2) {
        try {
            return this.ay[i];
        } catch (Throwable e) {
            throw ba.ad(e, "hp.aa(" + ')');
        }
    }

    String ah(int i) {
        return this.ay[i];
    }

    void ag(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.ag.length) {
            try {
                if (!this.an[i3]) {
                    this.ag[i3] = -1;
                }
                i3++;
            } catch (Throwable e) {
                throw ba.ad(e, "hp.ag(" + ')');
            }
        }
        while (i2 < this.ay.length) {
            if (!this.aa[i2]) {
                this.ay[i2] = null;
            }
            i2++;
        }
    }

    void ak() {
        int i = 0;
        for (int i2 = 0; i2 < this.ag.length; i2++) {
            if (!this.an[i2]) {
                this.ag[i2] = -1;
            }
        }
        while (i < this.ay.length) {
            if (!this.aa[i]) {
                this.ay[i] = null;
            }
            i++;
        }
    }

    void ao() {
        int i = 0;
        for (int i2 = 0; i2 < this.ag.length; i2++) {
            if (!this.an[i2]) {
                this.ag[i2] = -1;
            }
        }
        while (i < this.ay.length) {
            if (!this.aa[i]) {
                this.ay[i] = null;
            }
            i++;
        }
    }

    nw ac(boolean z) {
        return kh.af("2", client.as.as, z, 1043695366);
    }

    nw au(boolean z) {
        return kh.af("2", client.as.as, z, -1139972109);
    }

    nw av(boolean z) {
        return kh.af("2", client.as.as, z, 1570509436);
    }

    nw ax(boolean z) {
        return kh.af("2", client.as.as, z, -1359603514);
    }

    nw ay(boolean z, byte b) {
        try {
            return kh.af("2", client.as.as, z, -1913712972);
        } catch (Throwable e) {
            throw ba.ad(e, "hp.ay(" + ')');
        }
    }

    public void al() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r0 = 1;
        r8 = -1;
        r3 = 0;
        r5 = r9.ay(r0, r3);
        r1 = 3;
        r2 = r3;
        r0 = r3;
    L_0x000a:
        r4 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = r4.length;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r2 >= r4) goto L_0x0022;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x000f:
        r4 = r9.an;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r4 == 0) goto L_0x001f;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0015:
        r4 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r4 == r8) goto L_0x001f;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x001b:
        r1 = r1 + 6;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x001f:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        goto L_0x000a;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0022:
        r2 = r1 + 2;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = r3;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r3;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0026:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6.length;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r4 >= r6) goto L_0x004a;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x002b:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r6 == 0) goto L_0x0047;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0031:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r6 == 0) goto L_0x0047;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0037:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r7 = 1165594063; // 0x45798dcf float:3992.863 double:5.758799835E-315;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = p000.hz.ae(r6, r7);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6 + 2;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2 + r6;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0047:
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        goto L_0x0026;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x004a:
        r4 = new ik;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.<init>(r2);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = 31;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.an(r2, r6);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aa(r0, r2);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r0 = r3;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x005c:
        r2 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2.length;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r0 >= r2) goto L_0x007f;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0061:
        r2 = r9.an;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r2 == 0) goto L_0x007c;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0067:
        r2 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r8 == r2) goto L_0x007c;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x006d:
        r2 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aa(r0, r2);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.ay(r2, r6);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x007c:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        goto L_0x005c;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x007f:
        r0 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aa(r1, r0);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r0 = r3;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0086:
        r1 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1.length;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r0 >= r1) goto L_0x00a9;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x008b:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r1 == 0) goto L_0x00a6;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0091:
        r1 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r1 == 0) goto L_0x00a6;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0097:
        r1 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aa(r0, r1);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = 65;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aq(r1, r2);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x00a6:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        goto L_0x0086;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x00a9:
        r0 = r4.af;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = 0;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r4.ad;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2 * r4;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = 1275949019; // 0x4c0d6fdb float:3.7076844E7 double:6.30402576E-315;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r5.ad(r0, r1, r2, r4);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r0);	 Catch:{ Exception -> 0x00e2 }
    L_0x00be:
        r9.as = r3;
        r0 = 384930041; // 0x16f190f9 float:3.902714E-25 double:1.901807093E-315;
        r0 = p000.hu.af(r0);
        r2 = -8130565532169912155; // 0x8f2a6db9dffa40a5 float:-3.6065189E19 double:-1.2987568430953848E-235;
        r0 = r0 * r2;
        r9.ar = r0;
        return;
    L_0x00d0:
        r0 = move-exception;
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r0);	 Catch:{ Exception -> 0x00d8 }
        goto L_0x00be;
    L_0x00d8:
        r0 = move-exception;
        goto L_0x00be;
    L_0x00da:
        r0 = move-exception;
        r1 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r1);	 Catch:{ Exception -> 0x00e4 }
    L_0x00e1:
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        goto L_0x00be;
    L_0x00e4:
        r1 = move-exception;
        goto L_0x00e1;
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.al():void");
    }

    public void ap() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r0 = 1;
        r8 = -1;
        r3 = 0;
        r5 = r9.ay(r0, r3);
        r1 = 3;
        r2 = r3;
        r0 = r3;
    L_0x000a:
        r4 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = r4.length;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r2 >= r4) goto L_0x0022;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x000f:
        r4 = r9.an;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r4 == 0) goto L_0x001f;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0015:
        r4 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r4 == r8) goto L_0x001f;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x001b:
        r1 = r1 + 6;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x001f:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        goto L_0x000a;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0022:
        r2 = r1 + 2;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = r3;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r3;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0026:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6.length;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r4 >= r6) goto L_0x004a;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x002b:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r6 == 0) goto L_0x0047;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0031:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r6 == 0) goto L_0x0047;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0037:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r7 = 1199849895; // 0x478441a7 float:67715.305 double:5.928046133E-315;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = p000.hz.ae(r6, r7);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = r6 + 2;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2 + r6;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0047:
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        goto L_0x0026;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x004a:
        r4 = new ik;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.<init>(r2);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = 31;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.an(r2, r6);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aa(r0, r2);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r0 = r3;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x005c:
        r2 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2.length;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r0 >= r2) goto L_0x007f;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0061:
        r2 = r9.an;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r2 == 0) goto L_0x007c;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0067:
        r2 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r8 == r2) goto L_0x007c;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x006d:
        r2 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aa(r0, r2);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r9.ag;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.ay(r2, r6);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x007c:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        goto L_0x005c;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x007f:
        r0 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aa(r1, r0);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r0 = r3;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0086:
        r1 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1.length;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r0 >= r1) goto L_0x00a9;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x008b:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r1 == 0) goto L_0x00a6;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0091:
        r1 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        if (r1 == 0) goto L_0x00a6;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x0097:
        r1 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aa(r0, r1);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r9.ay;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = -90;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4.aq(r1, r2);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x00a6:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        goto L_0x0086;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
    L_0x00a9:
        r0 = r4.af;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r1 = 0;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r4.ad;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r2 = r2 * r4;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r4 = 1821995967; // 0x6c9973bf float:1.484098E27 double:9.00185614E-315;	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r5.ad(r0, r1, r2, r4);	 Catch:{ Exception -> 0x00d0, all -> 0x00da }
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r0);	 Catch:{ Exception -> 0x00e2 }
    L_0x00be:
        r9.as = r3;
        r0 = 2092896835; // 0x7cbf1243 float:7.936793E36 double:1.0340284265E-314;
        r0 = p000.hu.af(r0);
        r2 = -8130565532169912155; // 0x8f2a6db9dffa40a5 float:-3.6065189E19 double:-1.2987568430953848E-235;
        r0 = r0 * r2;
        r9.ar = r0;
        return;
    L_0x00d0:
        r0 = move-exception;
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r0);	 Catch:{ Exception -> 0x00d8 }
        goto L_0x00be;
    L_0x00d8:
        r0 = move-exception;
        goto L_0x00be;
    L_0x00da:
        r0 = move-exception;
        r1 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r1);	 Catch:{ Exception -> 0x00e4 }
    L_0x00e1:
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        goto L_0x00be;
    L_0x00e4:
        r1 = move-exception;
        goto L_0x00e1;
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.ap():void");
    }

    public void as(int r10) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r8 = -1;
        r3 = 0;
        r0 = 1;
        r1 = 0;
        r5 = r9.ay(r0, r1);	 Catch:{ RuntimeException -> 0x00e4 }
        r1 = 3;
        r2 = r3;
        r0 = r3;
    L_0x000b:
        r4 = r9.ag;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = r4.length;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r2 >= r4) goto L_0x0023;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0010:
        r4 = r9.an;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r4 == 0) goto L_0x0020;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0016:
        r4 = r9.ag;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r4 == r8) goto L_0x0020;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x001c:
        r1 = r1 + 6;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0020:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        goto L_0x000b;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0023:
        r2 = r1 + 2;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = r3;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r3;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0027:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6.length;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r4 >= r6) goto L_0x004b;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x002c:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r6 == 0) goto L_0x0048;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0032:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r6 == 0) goto L_0x0048;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0038:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r7 = 1538873972; // 0x5bb95a74 float:1.0434465E17 double:7.60304763E-315;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = p000.hz.ae(r6, r7);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6 + 2;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2 + r6;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0048:
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        goto L_0x0027;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x004b:
        r4 = new ik;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.<init>(r2);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = 31;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.an(r2, r6);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aa(r0, r2);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r0 = r3;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x005d:
        r2 = r9.ag;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2.length;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r0 >= r2) goto L_0x0080;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0062:
        r2 = r9.an;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r2 == 0) goto L_0x007d;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0068:
        r2 = r9.ag;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r8 == r2) goto L_0x007d;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x006e:
        r2 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aa(r0, r2);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r9.ag;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.ay(r2, r6);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x007d:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        goto L_0x005d;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0080:
        r0 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aa(r1, r0);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r0 = r3;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0087:
        r1 = r9.ay;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1.length;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r0 >= r1) goto L_0x00aa;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x008c:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r1 == 0) goto L_0x00a7;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0092:
        r1 = r9.ay;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r1 == 0) goto L_0x00a7;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0098:
        r1 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aa(r0, r1);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r9.ay;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = -101; // 0xffffffffffffff9b float:NaN double:NaN;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aq(r1, r2);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x00a7:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        goto L_0x0087;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x00aa:
        r0 = r4.af;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = 0;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r4.ad;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r3 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2 * r3;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r3 = 1556837661; // 0x5ccb751d float:4.58145501E17 double:7.691800045E-315;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r5.ad(r0, r1, r2, r3);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r0);	 Catch:{ Exception -> 0x00ff }
    L_0x00bf:
        r0 = 0;
        r9.as = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        r0 = 1176505928; // 0x46200e48 float:10243.57 double:5.81271161E-315;	 Catch:{ RuntimeException -> 0x00e4 }
        r0 = p000.hu.af(r0);	 Catch:{ RuntimeException -> 0x00e4 }
        r2 = -8130565532169912155; // 0x8f2a6db9dffa40a5 float:-3.6065189E19 double:-1.2987568430953848E-235;	 Catch:{ RuntimeException -> 0x00e4 }
        r0 = r0 * r2;	 Catch:{ RuntimeException -> 0x00e4 }
        r9.ar = r0;	 Catch:{ RuntimeException -> 0x00e4 }
        return;
    L_0x00d2:
        r0 = move-exception;
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r0);	 Catch:{ Exception -> 0x00da }
        goto L_0x00bf;
    L_0x00da:
        r0 = move-exception;
        goto L_0x00bf;
    L_0x00dc:
        r0 = move-exception;
        r1 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r1);	 Catch:{ Exception -> 0x0101 }
    L_0x00e3:
        throw r0;	 Catch:{ RuntimeException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "hp.as(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
    L_0x00ff:
        r0 = move-exception;
        goto L_0x00bf;
    L_0x0101:
        r1 = move-exception;
        goto L_0x00e3;
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.as(int):void");
    }

    public void bw() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r0 = 1;
        r8 = -1;
        r3 = 0;
        r5 = r9.ay(r0, r3);
        r1 = 3;
        r2 = r3;
        r0 = r3;
    L_0x000a:
        r4 = r9.ag;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4 = r4.length;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r2 >= r4) goto L_0x0022;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x000f:
        r4 = r9.an;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r4 == 0) goto L_0x001f;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0015:
        r4 = r9.ag;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r4 == r8) goto L_0x001f;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x001b:
        r1 = r1 + 6;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x001f:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        goto L_0x000a;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0022:
        r2 = r1 + 2;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4 = r3;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r1 = r3;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0026:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r6 = r6.length;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r4 >= r6) goto L_0x004a;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x002b:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r6 == 0) goto L_0x0047;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0031:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r6 == 0) goto L_0x0047;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0037:
        r6 = r9.ay;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r7 = 1734053386; // 0x675b8e0a float:1.0368184E24 double:8.56736206E-315;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r6 = p000.hz.ae(r6, r7);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r6 = r6 + 2;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = r2 + r6;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0047:
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        goto L_0x0026;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x004a:
        r4 = new ik;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4.<init>(r2);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = 1;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r6 = 31;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4.an(r2, r6);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4.aa(r0, r2);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r0 = r3;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x005c:
        r2 = r9.ag;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = r2.length;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r0 >= r2) goto L_0x007f;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0061:
        r2 = r9.an;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r2 == 0) goto L_0x007c;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0067:
        r2 = r9.ag;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r8 == r2) goto L_0x007c;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x006d:
        r2 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4.aa(r0, r2);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = r9.ag;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4.ay(r2, r6);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x007c:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        goto L_0x005c;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x007f:
        r0 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4.aa(r1, r0);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r0 = r3;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0086:
        r1 = r9.ay;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r1 = r1.length;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r0 >= r1) goto L_0x00a8;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x008b:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r1 == 0) goto L_0x00a5;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0091:
        r1 = r9.ay;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        if (r1 == 0) goto L_0x00a5;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x0097:
        r1 = -1752508204; // 0xffffffff978ad8d4 float:-8.972776E-25 double:NaN;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4.aa(r0, r1);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r1 = r9.ay;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = 0;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4.aq(r1, r2);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x00a5:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        goto L_0x0086;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
    L_0x00a8:
        r0 = r4.af;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r1 = 0;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = r4.ad;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4 = -1002734109; // 0xffffffffc43b7de3 float:-749.967 double:NaN;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r2 = r2 * r4;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r4 = 1032986136; // 0x3d921e18 float:0.07134646 double:5.103629624E-315;	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r5.ad(r0, r1, r2, r4);	 Catch:{ Exception -> 0x00cf, all -> 0x00d9 }
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r0);	 Catch:{ Exception -> 0x00e1 }
    L_0x00bd:
        r9.as = r3;
        r0 = 1027359943; // 0x3d3c44c7 float:0.04596403 double:5.075832537E-315;
        r0 = p000.hu.af(r0);
        r2 = -8130565532169912155; // 0x8f2a6db9dffa40a5 float:-3.6065189E19 double:-1.2987568430953848E-235;
        r0 = r0 * r2;
        r9.ar = r0;
        return;
    L_0x00cf:
        r0 = move-exception;
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r0);	 Catch:{ Exception -> 0x00d7 }
        goto L_0x00bd;
    L_0x00d7:
        r0 = move-exception;
        goto L_0x00bd;
    L_0x00d9:
        r0 = move-exception;
        r1 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r5.an(r1);	 Catch:{ Exception -> 0x00e3 }
    L_0x00e0:
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        goto L_0x00bd;
    L_0x00e3:
        r1 = move-exception;
        goto L_0x00e0;
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.bw():void");
    }

    public static void aj(Collection collection, byte b) {
        try {
            collection.add(ab.aa);
        } catch (Throwable e) {
            throw ba.ad(e, "hp.aj(" + ')');
        }
    }

    void ar(int r9) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r8 = this;
        r6 = 1;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r2 = r8.ay(r1, r2);	 Catch:{ RuntimeException -> 0x00bc }
        r1 = 2057608795; // 0x7aa49e5b float:4.2737426E35 double:1.016593818E-314;
        r4 = r2.ag(r1);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r1 = (int) r4;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r3 = new byte[r1];	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r1 = r0;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x0013:
        r4 = r3.length;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        if (r1 >= r4) goto L_0x0034;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x0016:
        r4 = r3.length;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r4 = r4 - r1;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r5 = -100;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r4 = r2.ay(r3, r1, r4, r5);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r5 = -1;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        if (r4 != r5) goto L_0x0032;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x0021:
        r0 = new java.io.EOFException;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r0.<init>();	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        throw r0;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x0027:
        r0 = move-exception;
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x00d7 }
    L_0x002e:
        r0 = 0;
        r8.as = r0;	 Catch:{ RuntimeException -> 0x00bc }
    L_0x0031:
        return;
    L_0x0032:
        r1 = r1 + r4;
        goto L_0x0013;
    L_0x0034:
        r4 = new ik;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r1 = r4.af;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r1 = r1.length;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r3 = 1978945739; // 0x75f450cb float:6.1941363E32 double:9.777291046E-315;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r5 = r4.ad;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r3 = r3 * r5;
        r1 = r1 - r3;
        if (r1 >= r6) goto L_0x004e;
    L_0x0045:
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x004c }
        goto L_0x0031;
    L_0x004c:
        r0 = move-exception;
        goto L_0x0031;
    L_0x004e:
        r1 = 0;
        r1 = r4.ao(r1);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        if (r1 < 0) goto L_0x0057;
    L_0x0055:
        if (r1 <= r6) goto L_0x0060;
    L_0x0057:
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x005e }
        goto L_0x0031;
    L_0x005e:
        r0 = move-exception;
        goto L_0x0031;
    L_0x0060:
        r1 = -1740536666; // 0xffffffff984184a6 float:-2.5011636E-24 double:NaN;
        r3 = r4.au(r1);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r1 = r0;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x0068:
        if (r1 >= r3) goto L_0x0085;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x006a:
        r5 = 592125772; // 0x234b1f4c float:1.10112794E-17 double:2.92549002E-315;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r5 = r4.au(r5);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r6 = 1534550275; // 0x5b776103 float:6.9630985E16 double:7.581685727E-315;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r6 = r4.al(r6);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r7 = r8.an;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r7 = r7[r5];	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        if (r7 == 0) goto L_0x0082;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x007e:
        r7 = r8.ag;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r7[r5] = r6;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x0082:
        r1 = r1 + 1;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        goto L_0x0068;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x0085:
        r1 = 319125173; // 0x130576b5 float:1.6845487E-27 double:1.576687847E-315;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r1 = r4.au(r1);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x008c:
        if (r0 >= r1) goto L_0x00a9;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x008e:
        r3 = -563831472; // 0xffffffffde649d50 float:-4.11835274E18 double:NaN;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r3 = r4.au(r3);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r5 = 1483185445; // 0x58679d25 float:1.01864847E15 double:7.32790975E-315;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r5 = r4.bc(r5);	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r6 = r8.aa;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r6 = r6[r3];	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        if (r6 == 0) goto L_0x00a6;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x00a2:
        r6 = r8.ay;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
        r6[r3] = r5;	 Catch:{ Exception -> 0x0027, all -> 0x00b4 }
    L_0x00a6:
        r0 = r0 + 1;
        goto L_0x008c;
    L_0x00a9:
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x00b1 }
        goto L_0x002e;
    L_0x00b1:
        r0 = move-exception;
        goto L_0x002e;
    L_0x00b4:
        r0 = move-exception;
        r1 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r1);	 Catch:{ Exception -> 0x00da }
    L_0x00bb:
        throw r0;	 Catch:{ RuntimeException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "hp.ar(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = p000.ba.ad(r0, r1);
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        goto L_0x002e;
    L_0x00da:
        r1 = move-exception;
        goto L_0x00bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.ar(int):void");
    }

    void bb() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r8 = this;
        r6 = 1;
        r1 = 0;
        r2 = r8.ay(r1, r1);
        r0 = 2057608795; // 0x7aa49e5b float:4.2737426E35 double:1.016593818E-314;
        r4 = r2.ag(r0);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = (int) r4;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r3 = new byte[r0];	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0011:
        r4 = r3.length;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r0 >= r4) goto L_0x0031;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0014:
        r4 = r3.length;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r4 = r4 - r0;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = 49;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r4 = r2.ay(r3, r0, r4, r5);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = -1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r4 != r5) goto L_0x002f;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x001f:
        r0 = new java.io.EOFException;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0.<init>();	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        throw r0;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0025:
        r0 = move-exception;
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x00ba }
    L_0x002c:
        r8.as = r1;
    L_0x002e:
        return;
    L_0x002f:
        r0 = r0 + r4;
        goto L_0x0011;
    L_0x0031:
        r4 = new ik;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r4.af;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r0.length;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r3 = -1079144757; // 0xffffffffbfad8ecb float:-1.3559202 double:NaN;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = r4.ad;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r3 = r3 * r5;
        r0 = r0 - r3;
        if (r0 >= r6) goto L_0x004b;
    L_0x0042:
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x0049 }
        goto L_0x002e;
    L_0x0049:
        r0 = move-exception;
        goto L_0x002e;
    L_0x004b:
        r0 = 0;
        r0 = r4.ao(r0);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r0 < 0) goto L_0x0054;
    L_0x0052:
        if (r0 <= r6) goto L_0x005d;
    L_0x0054:
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x005b }
        goto L_0x002e;
    L_0x005b:
        r0 = move-exception;
        goto L_0x002e;
    L_0x005d:
        r0 = -807640730; // 0xffffffffcfdc6166 float:-7.3947412E9 double:NaN;
        r3 = r4.au(r0);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0065:
        if (r0 >= r3) goto L_0x0082;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0067:
        r5 = -989800082; // 0xffffffffc500d96e float:-2061.5894 double:NaN;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = r4.au(r5);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r6 = 1297385647; // 0x4d5488af float:2.22857968E8 double:6.409936776E-315;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r6 = r4.al(r6);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7 = r8.an;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7 = r7[r5];	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r7 == 0) goto L_0x007f;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x007b:
        r7 = r8.ag;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7[r5] = r6;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x007f:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0082:
        r0 = 575383507; // 0x224ba7d3 float:2.7600476E-18 double:2.84277224E-315;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r3 = r4.au(r0);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x008a:
        if (r0 >= r3) goto L_0x00a7;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x008c:
        r5 = -1365614917; // 0xffffffffae9a5ebb float:-7.019937E-11 double:NaN;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = r4.au(r5);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r6 = 1164934957; // 0x456f7f2d float:3831.9485 double:5.75554342E-315;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r6 = r4.bc(r6);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7 = r8.aa;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7 = r7[r5];	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r7 == 0) goto L_0x00a4;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x00a0:
        r7 = r8.ay;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7[r5] = r6;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x00a4:
        r0 = r0 + 1;
        goto L_0x008a;
    L_0x00a7:
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x00af }
        goto L_0x002c;
    L_0x00af:
        r0 = move-exception;
        goto L_0x002c;
    L_0x00b2:
        r0 = move-exception;
        r1 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r1);	 Catch:{ Exception -> 0x00bd }
    L_0x00b9:
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        goto L_0x002c;
    L_0x00bd:
        r1 = move-exception;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.bb():void");
    }

    void bc() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r8 = this;
        r6 = 1;
        r1 = 0;
        r2 = r8.ay(r1, r1);
        r0 = 2057608795; // 0x7aa49e5b float:4.2737426E35 double:1.016593818E-314;
        r4 = r2.ag(r0);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = (int) r4;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r3 = new byte[r0];	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0011:
        r4 = r3.length;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r0 >= r4) goto L_0x0031;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0014:
        r4 = r3.length;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r4 = r4 - r0;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = 11;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r4 = r2.ay(r3, r0, r4, r5);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = -1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r4 != r5) goto L_0x002f;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x001f:
        r0 = new java.io.EOFException;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0.<init>();	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        throw r0;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0025:
        r0 = move-exception;
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x00ba }
    L_0x002c:
        r8.as = r1;
    L_0x002e:
        return;
    L_0x002f:
        r0 = r0 + r4;
        goto L_0x0011;
    L_0x0031:
        r4 = new ik;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r4.af;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r0.length;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r3 = -1277313927; // 0xffffffffb3ddbc79 float:-1.03253974E-7 double:NaN;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = r4.ad;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r3 = r3 * r5;
        r0 = r0 - r3;
        if (r0 >= r6) goto L_0x004b;
    L_0x0042:
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x0049 }
        goto L_0x002e;
    L_0x0049:
        r0 = move-exception;
        goto L_0x002e;
    L_0x004b:
        r0 = 0;
        r0 = r4.ao(r0);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r0 < 0) goto L_0x0054;
    L_0x0052:
        if (r0 <= r6) goto L_0x005d;
    L_0x0054:
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x005b }
        goto L_0x002e;
    L_0x005b:
        r0 = move-exception;
        goto L_0x002e;
    L_0x005d:
        r0 = -2040844942; // 0xffffffff865b2d72 float:-4.122271E-35 double:NaN;
        r3 = r4.au(r0);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0065:
        if (r0 >= r3) goto L_0x0082;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0067:
        r5 = -2120865258; // 0xffffffff81962a16 float:-5.516169E-38 double:NaN;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = r4.au(r5);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r6 = 917348640; // 0x36ada120 float:5.174559E-6 double:4.532304483E-315;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r6 = r4.al(r6);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7 = r8.an;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7 = r7[r5];	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r7 == 0) goto L_0x007f;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x007b:
        r7 = r8.ag;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7[r5] = r6;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x007f:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        goto L_0x0065;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x0082:
        r0 = -1106420948; // 0xffffffffbe0d5b2c float:-0.1380431 double:NaN;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r3 = r4.au(r0);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r0 = r1;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x008a:
        if (r0 >= r3) goto L_0x00a7;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x008c:
        r5 = 531652023; // 0x1fb05db7 float:7.469394E-20 double:2.62671E-315;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r5 = r4.au(r5);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r6 = 702046374; // 0x29d860a6 float:9.609093E-14 double:3.46856995E-315;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r6 = r4.bc(r6);	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7 = r8.aa;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7 = r7[r5];	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        if (r7 == 0) goto L_0x00a4;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x00a0:
        r7 = r8.ay;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
        r7[r5] = r6;	 Catch:{ Exception -> 0x0025, all -> 0x00b2 }
    L_0x00a4:
        r0 = r0 + 1;
        goto L_0x008a;
    L_0x00a7:
        r0 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x00af }
        goto L_0x002c;
    L_0x00af:
        r0 = move-exception;
        goto L_0x002c;
    L_0x00b2:
        r0 = move-exception;
        r1 = 420907623; // 0x19168a67 float:7.782768E-24 double:2.079559966E-315;
        r2.an(r1);	 Catch:{ Exception -> 0x00bd }
    L_0x00b9:
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        goto L_0x002c;
    L_0x00bd:
        r1 = move-exception;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.bc():void");
    }

    void aj(int i) {
        try {
            if (this.as && this.ar * 8214934491698538285L < hu.af(179694291) - 60000) {
                as(-289480493);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "hp.aj(" + ')');
        }
    }

    void bg() {
        if (this.as && this.ar * 8214934491698538285L < hu.af(1883653683) - 60000) {
            as(973708161);
        }
    }

    void bz() {
        if (this.as && this.ar * 8214934491698538285L < hu.af(73464201) - 60000) {
            as(817388681);
        }
    }

    public boolean ae(int i) {
        try {
            return this.as;
        } catch (Throwable e) {
            throw ba.ad(e, "hp.ae(" + ')');
        }
    }

    public boolean bf() {
        return this.as;
    }

    public boolean bh() {
        return this.as;
    }

    public boolean bp() {
        return this.as;
    }

    public boolean bv() {
        return this.as;
    }
}
