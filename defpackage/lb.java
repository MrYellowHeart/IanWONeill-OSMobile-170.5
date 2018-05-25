package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class lb implements Runnable {
    public static final int ar = 15;
    static final int ay = 50;
    public static final int bo = 69;
    volatile boolean ad;
    final Thread af;
    Queue an;

    public lb() {
        try {
            this.an = new LinkedList();
            this.af = new Thread(this);
            this.af.setPriority(1);
            this.af.start();
        } catch (Throwable e) {
            throw ba.ad(e, "lb.<init>(" + ')');
        }
    }

    public void bo() {
        URLConnection openConnection;
        Object obj;
        Throwable th;
        while (!this.ad) {
            DataInputStream dataInputStream;
            try {
                synchronized (this) {
                    lx lxVar = (lx) this.an.poll();
                    if (lxVar == null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    } else {
                        try {
                            openConnection = lxVar.af.openConnection();
                            try {
                                openConnection.setConnectTimeout(5000);
                                openConnection.setReadTimeout(5000);
                                openConnection.setUseCaches(false);
                                openConnection.setRequestProperty("Connection", "close");
                                openConnection.setRequestProperty("Accept-Encoding", "identity");
                                int contentLength = openConnection.getContentLength();
                                if (contentLength >= 0) {
                                    byte[] bArr = new byte[contentLength];
                                    dataInputStream = new DataInputStream(openConnection.getInputStream());
                                    try {
                                        dataInputStream.readFully(bArr);
                                        lxVar.aa = bArr;
                                    } catch (IOException e2) {
                                        try {
                                            lxVar.af((byte) -15);
                                            if (dataInputStream != null) {
                                                dataInputStream.close();
                                            }
                                            ((HttpURLConnection) openConnection).disconnect();
                                        } catch (Throwable th2) {
                                            Throwable th3 = th2;
                                            obj = openConnection;
                                            th = th3;
                                        }
                                    }
                                } else {
                                    dataInputStream = null;
                                }
                                lxVar.af((byte) -108);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    ((HttpURLConnection) openConnection).disconnect();
                                }
                            } catch (IOException e3) {
                                dataInputStream = null;
                                lxVar.af((byte) -15);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    ((HttpURLConnection) openConnection).disconnect();
                                }
                            } catch (Throwable th22) {
                                dataInputStream = null;
                                URLConnection uRLConnection = openConnection;
                                th = th22;
                                obj = uRLConnection;
                            }
                        } catch (IOException e4) {
                            openConnection = null;
                            dataInputStream = null;
                            lxVar.af((byte) -15);
                            if (dataInputStream != null) {
                                dataInputStream.close();
                            }
                            ((HttpURLConnection) openConnection).disconnect();
                        } catch (Throwable th222) {
                            th = th222;
                            dataInputStream = null;
                            String str = null;
                        }
                    }
                }
            } catch (Throwable th2222) {
                ah.af(null, th2222, (short) -10886);
            }
        }
        return;
        if (dataInputStream != null) {
            dataInputStream.close();
        }
        if (str != null && (str instanceof HttpURLConnection)) {
            ((HttpURLConnection) str).disconnect();
        }
        throw th;
    }

    public void ci() {
        DataInputStream dataInputStream;
        Object obj;
        Throwable th;
        while (!this.ad) {
            try {
                synchronized (this) {
                    lx lxVar = (lx) this.an.poll();
                    if (lxVar == null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    } else {
                        URLConnection openConnection;
                        try {
                            openConnection = lxVar.af.openConnection();
                            try {
                                openConnection.setConnectTimeout(5000);
                                openConnection.setReadTimeout(5000);
                                openConnection.setUseCaches(false);
                                openConnection.setRequestProperty("Connection", "close");
                                openConnection.setRequestProperty("Accept-Encoding", "identity");
                                int contentLength = openConnection.getContentLength();
                                if (contentLength >= 0) {
                                    byte[] bArr = new byte[contentLength];
                                    dataInputStream = new DataInputStream(openConnection.getInputStream());
                                    try {
                                        dataInputStream.readFully(bArr);
                                        lxVar.aa = bArr;
                                    } catch (IOException e2) {
                                        try {
                                            lxVar.af((byte) -92);
                                            if (dataInputStream != null) {
                                                dataInputStream.close();
                                            }
                                            ((HttpURLConnection) openConnection).disconnect();
                                        } catch (Throwable th2) {
                                            Throwable th3 = th2;
                                            obj = openConnection;
                                            th = th3;
                                        }
                                    }
                                } else {
                                    dataInputStream = null;
                                }
                                lxVar.af((byte) -55);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    ((HttpURLConnection) openConnection).disconnect();
                                }
                            } catch (IOException e3) {
                                dataInputStream = null;
                                lxVar.af((byte) -92);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    ((HttpURLConnection) openConnection).disconnect();
                                }
                            } catch (Throwable th22) {
                                dataInputStream = null;
                                URLConnection uRLConnection = openConnection;
                                th = th22;
                                obj = uRLConnection;
                            }
                        } catch (IOException e4) {
                            openConnection = null;
                            dataInputStream = null;
                            lxVar.af((byte) -92);
                            if (dataInputStream != null) {
                                dataInputStream.close();
                            }
                            ((HttpURLConnection) openConnection).disconnect();
                        } catch (Throwable th222) {
                            th = th222;
                            dataInputStream = null;
                            String str = null;
                        }
                    }
                }
            } catch (Throwable th2222) {
                ah.af(null, th2222, (short) -5491);
            }
        }
        return;
        if (dataInputStream != null) {
            dataInputStream.close();
        }
        if (str != null && (str instanceof HttpURLConnection)) {
            ((HttpURLConnection) str).disconnect();
        }
        throw th;
    }

    public void cv() {
        URLConnection openConnection;
        DataInputStream dataInputStream;
        Object obj;
        Throwable th;
        while (!this.ad) {
            try {
                synchronized (this) {
                    lx lxVar = (lx) this.an.poll();
                    if (lxVar == null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    } else {
                        try {
                            openConnection = lxVar.af.openConnection();
                            try {
                                openConnection.setConnectTimeout(5000);
                                openConnection.setReadTimeout(5000);
                                openConnection.setUseCaches(false);
                                openConnection.setRequestProperty("Connection", "close");
                                openConnection.setRequestProperty("Accept-Encoding", "identity");
                                int contentLength = openConnection.getContentLength();
                                if (contentLength >= 0) {
                                    byte[] bArr = new byte[contentLength];
                                    dataInputStream = new DataInputStream(openConnection.getInputStream());
                                    try {
                                        dataInputStream.readFully(bArr);
                                        lxVar.aa = bArr;
                                    } catch (IOException e2) {
                                        try {
                                            lxVar.af((byte) -84);
                                            if (dataInputStream != null) {
                                                dataInputStream.close();
                                            }
                                            ((HttpURLConnection) openConnection).disconnect();
                                        } catch (Throwable th2) {
                                            Throwable th3 = th2;
                                            obj = openConnection;
                                            th = th3;
                                        }
                                    }
                                } else {
                                    dataInputStream = null;
                                }
                                lxVar.af((byte) -122);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    ((HttpURLConnection) openConnection).disconnect();
                                }
                            } catch (IOException e3) {
                                dataInputStream = null;
                                lxVar.af((byte) -84);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    ((HttpURLConnection) openConnection).disconnect();
                                }
                            } catch (Throwable th22) {
                                dataInputStream = null;
                                URLConnection uRLConnection = openConnection;
                                th = th22;
                                obj = uRLConnection;
                            }
                        } catch (IOException e4) {
                            openConnection = null;
                            dataInputStream = null;
                            lxVar.af((byte) -84);
                            if (dataInputStream != null) {
                                dataInputStream.close();
                            }
                            ((HttpURLConnection) openConnection).disconnect();
                        } catch (Throwable th222) {
                            th = th222;
                            dataInputStream = null;
                            String str = null;
                        }
                    }
                }
            } catch (Throwable th2222) {
                ah.af(null, th2222, (short) -5063);
            }
        }
        return;
        if (dataInputStream != null) {
            dataInputStream.close();
        }
        if (str != null && (str instanceof HttpURLConnection)) {
            ((HttpURLConnection) str).disconnect();
        }
        throw th;
    }

    public void run() {
        URLConnection openConnection;
        DataInputStream dataInputStream;
        URLConnection uRLConnection;
        Throwable th;
        while (!this.ad) {
            try {
                try {
                    synchronized (this) {
                        lx lxVar = (lx) this.an.poll();
                        if (lxVar == null) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                            }
                        } else {
                            try {
                                openConnection = lxVar.af.openConnection();
                                try {
                                    openConnection.setConnectTimeout(5000);
                                    openConnection.setReadTimeout(5000);
                                    openConnection.setUseCaches(false);
                                    openConnection.setRequestProperty("Connection", "close");
                                    openConnection.setRequestProperty("Accept-Encoding", "identity");
                                    int contentLength = openConnection.getContentLength();
                                    if (contentLength >= 0) {
                                        byte[] bArr = new byte[contentLength];
                                        dataInputStream = new DataInputStream(openConnection.getInputStream());
                                        try {
                                            dataInputStream.readFully(bArr);
                                            lxVar.aa = bArr;
                                        } catch (IOException e2) {
                                            try {
                                                lxVar.af((byte) -69);
                                                if (dataInputStream != null) {
                                                    dataInputStream.close();
                                                }
                                                ((HttpURLConnection) openConnection).disconnect();
                                            } catch (Throwable th2) {
                                                Throwable th3 = th2;
                                                uRLConnection = openConnection;
                                                th = th3;
                                            }
                                        }
                                    } else {
                                        dataInputStream = null;
                                    }
                                    lxVar.af((byte) -53);
                                    if (dataInputStream != null) {
                                        dataInputStream.close();
                                    }
                                    if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                        ((HttpURLConnection) openConnection).disconnect();
                                    }
                                } catch (IOException e3) {
                                    dataInputStream = null;
                                    lxVar.af((byte) -69);
                                    if (dataInputStream != null) {
                                        dataInputStream.close();
                                    }
                                    if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                        ((HttpURLConnection) openConnection).disconnect();
                                    }
                                } catch (Throwable th22) {
                                    dataInputStream = null;
                                    URLConnection uRLConnection2 = openConnection;
                                    th = th22;
                                    uRLConnection = uRLConnection2;
                                }
                            } catch (IOException e4) {
                                openConnection = null;
                                dataInputStream = null;
                                lxVar.af((byte) -69);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                ((HttpURLConnection) openConnection).disconnect();
                            } catch (Throwable th222) {
                                th = th222;
                                dataInputStream = null;
                                uRLConnection = null;
                            }
                        }
                    }
                } catch (Throwable th2222) {
                    ah.af(null, th2222, (short) 10100);
                }
            } catch (Throwable th22222) {
                throw ba.ad(th22222, "lb.run(" + ')');
            }
        }
        return;
        if (dataInputStream != null) {
            dataInputStream.close();
        }
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
        throw th;
    }

    public lx aa(URL url) {
        return ad(url, null, 222448443);
    }

    public lx af(URL url, int i) {
        try {
            return ad(url, null, 197017975);
        } catch (Throwable e) {
            throw ba.ad(e, "lb.af(" + ')');
        }
    }

    public lx ag(URL url) {
        return ad(url, null, 494342686);
    }

    public lx ay(URL url) {
        return ad(url, null, 1605184227);
    }

    lx ad(URL url, lp lpVar, int i) {
        try {
            lx lxVar = new lx(url, lpVar);
            synchronized (this) {
                this.an.add(lxVar);
                notify();
            }
            return lxVar;
        } catch (Throwable e) {
            throw ba.ad(e, "lb.ad(" + ')');
        }
    }

    lx ae(URL url, lp lpVar) {
        lx lxVar = new lx(url, lpVar);
        synchronized (this) {
            this.an.add(lxVar);
            notify();
        }
        return lxVar;
    }

    lx aj(URL url, lp lpVar) {
        lx lxVar = new lx(url, lpVar);
        synchronized (this) {
            this.an.add(lxVar);
            notify();
        }
        return lxVar;
    }

    lx ar(URL url, lp lpVar) {
        lx lxVar = new lx(url, lpVar);
        synchronized (this) {
            this.an.add(lxVar);
            notify();
        }
        return lxVar;
    }

    lx as(URL url, lp lpVar) {
        lx lxVar = new lx(url, lpVar);
        synchronized (this) {
            this.an.add(lxVar);
            notify();
        }
        return lxVar;
    }

    public void ab() {
        this.ad = true;
        try {
            synchronized (this) {
                notify();
            }
            this.af.join();
        } catch (InterruptedException e) {
        }
    }

    public void am() {
        this.ad = true;
        try {
            synchronized (this) {
                notify();
            }
            this.af.join();
        } catch (InterruptedException e) {
        }
    }

    public void an(byte b) {
        try {
            this.ad = true;
            try {
                synchronized (this) {
                    notify();
                }
                this.af.join();
            } catch (InterruptedException e) {
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "lb.an(" + ')');
        }
    }

    public void aq() {
        this.ad = true;
        try {
            synchronized (this) {
                notify();
            }
            this.af.join();
        } catch (InterruptedException e) {
        }
    }

    public void at() {
        this.ad = true;
        try {
            synchronized (this) {
                notify();
            }
            this.af.join();
        } catch (InterruptedException e) {
        }
    }

    public void aw() {
        this.ad = true;
        try {
            synchronized (this) {
                notify();
            }
            this.af.join();
        } catch (InterruptedException e) {
        }
    }

    static void ac(int i) {
        int i2 = 0;
        int i3 = 1;
        try {
            if (client.bk * 1555136039 == 0) {
                boolean z;
                client client = client.ad;
                if (2 != client.ay * 1902364993) {
                    z = false;
                }
                client.vu(z, 1407285566);
                gp.en = new cc(4, li.cu, li.cu, gu.af);
                while (i2 < 4) {
                    client.ea[i2] = new eq(li.cu, li.cu);
                    i2++;
                }
                dn.ma = new fx(512, 512);
                ex.mz = new gs(dn.ma.af, 512, 512);
                gr.by = jv.aw;
                gr.bk = -788719379;
                client.bk = 1000955852;
            } else if (client.bk * 1555136039 == 20) {
                int[] iArr = new int[9];
                while (i2 < 9) {
                    int i4 = ((i2 * 32) + mn.an) + 15;
                    iArr[i2] = (bi.az[i4] * ((i4 * 3) + 600)) >> 16;
                    i2++;
                }
                cc.bx(iArr, 500, 800, 512, 334);
                gr.by = jv.ai;
                gr.bk = -1577438758;
                client.bk = -646049870;
            } else if (client.bk * 1555136039 == 30) {
                gc.bs = ed.al(0, false, true, true, -746388123);
                gj.bm = ed.al(1, false, true, true, -1498716898);
                bi.br = ed.al(2, true, false, true, 1317378530);
                ai.bj = ed.al(3, false, true, true, 1224838157);
                ez.bi = ed.al(4, false, true, true, -1349467180);
                ds.bq = ed.al(5, true, true, true, -701235782);
                client.bo = ed.al(6, true, true, true, 1799970013);
                cr.cv = ed.al(7, false, true, true, 1913014228);
                hq.ci = ed.al(8, false, true, true, 1669553568);
                cz.cc = ed.al(9, false, true, true, 874887540);
                ba.co = ed.al(10, false, true, true, 31534288);
                ds.cy = ed.al(11, false, true, true, 848785579);
                dt.cn = ed.al(12, false, true, true, 561958719);
                au.ck = ed.al(13, true, false, true, 1322234131);
                eq.cl = ed.al(14, false, true, true, -857339660);
                gw.cs = ed.al(15, false, true, true, 1310593890);
                eq.cd = ed.al(16, true, true, true, -1840677068);
                gr.by = jv.az;
                gr.bk = 1140089780;
                client.bk = 2001911704;
            } else if (40 == client.bk * 1555136039) {
                i2 = ((((((((((((((((0 + ((gc.bs.eu(-1989472087) * 4) / 100)) + ((gj.bm.eu(-1989472087) * 4) / 100)) + ((bi.br.eu(-1989472087) * 2) / 100)) + ((ai.bj.eu(-1989472087) * 2) / 100)) + ((ez.bi.eu(-1989472087) * 6) / 100)) + ((ds.bq.eu(-1989472087) * 4) / 100)) + ((client.bo.eu(-1989472087) * 2) / 100)) + ((cr.cv.eu(-1989472087) * 58) / 100)) + ((hq.ci.eu(-1989472087) * 2) / 100)) + ((cz.cc.eu(-1989472087) * 2) / 100)) + ((ba.co.eu(-1989472087) * 2) / 100)) + ((ds.cy.eu(-1989472087) * 2) / 100)) + ((dt.cn.eu(-1989472087) * 2) / 100)) + ((au.ck.eu(-1989472087) * 2) / 100)) + ((eq.cl.eu(-1989472087) * 2) / 100)) + ((gw.cs.eu(-1989472087) * 2) / 100)) + ((eq.cd.eu(-1989472087) * 2) / 100);
                if (100 != i2) {
                    if (i2 != 0) {
                        gr.by = jv.ah + i2 + "%";
                    }
                    gr.bk = -437348978;
                    return;
                }
                aq.ao(gc.bs, "Animations", -1163892666);
                aq.ao(gj.bm, "Skeletons", -2129532843);
                aq.ao(ez.bi, "Sound FX", -1558034301);
                aq.ao(ds.bq, "Maps", -628410767);
                aq.ao(client.bo, "Music Tracks", -833385859);
                aq.ao(cr.cv, "Models", -1145701300);
                aq.ao(hq.ci, "Sprites", -1208800264);
                aq.ao(ds.cy, "Music Jingles", -836543843);
                aq.ao(eq.cl, "Music Samples", -931549883);
                aq.ao(gw.cs, "Music Patches", -1113415467);
                aq.ao(eq.cd, "World Map", -1629078688);
                gr.by = jv.ak;
                gr.bk = -437348978;
                client.bk = 1178408843;
            } else if (45 == client.bk * 1555136039) {
                boolean z2;
                if (!client.ae) {
                    z2 = true;
                }
                ih.af(22050, z2, 2, -32308195);
                nx nxVar = new nx();
                nxVar.ab(9, mn.an, (byte) 35);
                dk.af(gw.cs, eq.cl, ez.bi, nxVar, 1943287214);
                mj mjVar = ae.qs;
                if (fa.af * 1688035177 == 0) {
                    throw new IllegalStateException();
                }
                fa faVar;
                try {
                    fa af = av.aj.af(-1948775625);
                    if (iv.ad) {
                        i3 = 2;
                    }
                    af.aq = new int[(i3 * 256)];
                    af.aq((byte) 46);
                    af.ab = 211811328;
                    if (-126449667 * af.ab > fa.ar) {
                        af.ab = 1129660416;
                    }
                    af.am(af.ab * -126449667, 1584782711);
                    if (1091315627 * fa.ag > 0 && fa.ay == null) {
                        fa.ay = new fg();
                        fa.aa = Executors.newScheduledThreadPool(1);
                        fa.aa.scheduleAtFixedRate(fa.ay, 0, 1, TimeUnit.MILLISECONDS);
                    }
                    if (fa.ay != null) {
                        if (fa.ay.af[0] != null) {
                            throw new IllegalArgumentException();
                        }
                        fa.ay.af[0] = af;
                    }
                    faVar = af;
                } catch (Throwable th) {
                    faVar = new hw();
                }
                eh.np = faVar;
                fa.nz = new fl();
                fb flVar = new fl();
                flVar.af(nxVar);
                flVar.af(fa.nz);
                eh.np.ad(flVar, -337422631);
                je.nt = new ff(22050, 1688035177 * fa.af);
                gr.by = jv.ao;
                gr.bk = -1226068357;
                client.bk = 354905982;
                bh.ds = new lv(hq.ci, au.ck);
            } else if (50 == client.bk * 1555136039) {
                i2 = lq.af((byte) 0).length;
                client.dn = bh.ds.af(lq.af((byte) 0), 1274419350);
                if (client.dn.size() < i2) {
                    gr.by = jv.ax + ((client.dn.size() * 100) / i2) + "%";
                    gr.bk = -2014787736;
                    return;
                }
                cw.dx = (lr) client.dn.get(lq.af);
                client.dh = (lr) client.dn.get(lq.ad);
                ba.dy = (lr) client.dn.get(lq.an);
                an.oq = new av(true);
                gr.by = jv.au;
                gr.bk = -2014787736;
                client.bk = -1292099740;
            } else if (60 == client.bk * 1555136039) {
                i2 = bh.af(ba.co, hq.ci, (short) 4108);
                if (i2 < 11) {
                    gr.by = jv.av + ((i2 * 100) / 11) + "%";
                    gr.bk = 702740802;
                    return;
                }
                gr.by = jv.ac;
                gr.bk = 702740802;
                ad.ai(5, -2032411573);
                client.bk = 1355861834;
            } else if (client.bk * 1555136039 == 70) {
                if (bi.br.ar(688562590)) {
                    kf kfVar = bi.br;
                    ak.af = kfVar;
                    ak.ad = new ak[kfVar.aw(4, -1034604387)];
                    while (i2 < ak.ad.length) {
                        byte[] an = ak.af.an(4, i2, 247058452);
                        ak.ad[i2] = new ak();
                        if (an != null) {
                            ak.ad[i2].an(new ik(an), i2, (byte) 59);
                        }
                        ak.ad[i2].ad(-706592467);
                        i2++;
                    }
                    cp.af(bi.br, 1470611990);
                    cx.af(bi.br, cr.cv, (byte) -47);
                    ju.af(bi.br, cr.cv, client.ae, -1194553915);
                    bc.af(bi.br, cr.cv, (byte) 121);
                    mi.af(bi.br, 944589352);
                    kf kfVar2 = bi.br;
                    kfVar = cr.cv;
                    boolean z3 = client.aj;
                    lr lrVar = cw.dx;
                    ax.ar = kfVar2;
                    lj.aj = kfVar;
                    nz.ae = z3;
                    ax.aq = ax.ar.aw(10, 1569293104) * -718036559;
                    ir.aw = lrVar;
                    kfVar2 = bi.br;
                    kfVar = gc.bs;
                    kf kfVar3 = gj.bm;
                    ah.af = kfVar2;
                    ah.ad = kfVar;
                    ah.an = kfVar3;
                    eg.af(bi.br, cr.cv, (byte) -70);
                    gk.af(bi.br, -311489384);
                    hw.af(bi.br, -1997871410);
                    dc.af(ai.bj, cr.cv, hq.ci, au.ck, 757273539);
                    an.af(bi.br, (byte) -69);
                    ol.af(bi.br, 1336058173);
                    af.af(bi.br, -1352971718);
                    an.af = bi.br;
                    hr.af(bi.br, -1388076035);
                    bc.kq = new hp();
                    kfVar2 = bi.br;
                    kfVar = hq.ci;
                    kfVar3 = au.ck;
                    aa.af = kfVar2;
                    aa.ad = kfVar;
                    aa.an = kfVar3;
                    kfVar2 = bi.br;
                    kfVar = hq.ci;
                    aw.af = kfVar2;
                    aw.ad = kfVar;
                    cx.af(bi.br, hq.ci, 1143511752);
                    gr.by = jv.ap;
                    gr.bk = -874697956;
                    client.bk = -291143888;
                    return;
                }
                gr.by = jv.al + bi.br.ey((byte) 51) + "%";
                gr.bk = -874697956;
            } else if (80 == client.bk * 1555136039) {
                if (ge.ed == null) {
                    ge.ed = bp.ar(hq.ci, "compass", "", (byte) -63);
                } else {
                    i2 = 1;
                }
                if (ha.em == null) {
                    ha.em = bp.ar(hq.ci, "mapedge", "", (byte) -52);
                } else {
                    i2++;
                }
                if (nm.ez == null) {
                    nm.ez = gh.ag(hq.ci, "mapscene", "", (short) 338);
                } else {
                    i2++;
                }
                if (jd.ee == null) {
                    jd.ee = ea.as(hq.ci, "headicons_pk", "", 197214443);
                } else {
                    i2++;
                }
                if (bd.eb == null) {
                    bd.eb = ea.as(hq.ci, "headicons_prayer", "", -1503103390);
                } else {
                    i2++;
                }
                if (gb.ei == null) {
                    gb.ei = ea.as(hq.ci, "headicons_hint", "", 716897050);
                } else {
                    i2++;
                }
                if (ar.eh == null) {
                    ar.eh = ea.as(hq.ci, "mapmarker", "", 726058338);
                } else {
                    i2++;
                }
                if (ae.eo == null) {
                    ae.eo = ea.as(hq.ci, "cross", "", 555594794);
                } else {
                    i2++;
                }
                if (df.fd == null) {
                    df.fd = ea.as(hq.ci, "mapdots", "", -709245288);
                } else {
                    i2++;
                }
                if (fg.fv == null) {
                    fg.fv = gh.ag(hq.ci, "scrollbar", "", (short) 338);
                } else {
                    i2++;
                }
                if (ce.fk == null) {
                    ce.fk = gh.ag(hq.ci, "mod_icons", "", (short) 338);
                } else {
                    i2++;
                }
                if (i2 < 11) {
                    gr.by = jv.bw + ((i2 * 100) / 12) + "%";
                    gr.bk = 1842830582;
                    return;
                }
                lr.aq = ce.fk;
                ha.em.an();
                int random = ((int) (Math.random() * 41.0d)) - 20;
                nm.ez[0].ad((((int) (Math.random() * 21.0d)) - 10) + random, (((int) (Math.random() * 21.0d)) - 10) + random, (((int) (Math.random() * 21.0d)) - 10) + random);
                nq.ii = new il(ba.dy, ae.eo, true, hq.ci);
                gr.by = jv.bb;
                gr.bk = 1842830582;
                client.bk = -1938149610;
            } else if (90 == client.bk * 1555136039) {
                if (cz.cc.ar(1854915057)) {
                    mx.hu = new cd(cz.cc, hq.ci, 20, 0.8d, client.ae ? 64 : mn.an);
                    lh.bc(mx.hu, 511231161);
                    bs.bw(0.8d);
                    client.bk = 709811964;
                    return;
                }
                gr.by = jv.bc + "0%";
                gr.bk = -1312046934;
            } else if (client.bk * 1555136039 == 100) {
                i2 = mx.hu.ac(-1657590613);
                if (i2 < 100) {
                    gr.by = jv.bc + i2 + "%";
                    gr.bk = -1312046934;
                    return;
                }
                gr.by = jv.bz;
                gr.bk = -1312046934;
                client.bk = 1710767816;
            } else if (120 == client.bk * 1555136039) {
                if (ba.co.al("huffman", "", (byte) 9)) {
                    bz.af(new ig(ba.co.ac("huffman", "", 286016249)), -1480847011);
                    gr.by = jv.bh;
                    gr.bk = -1084028978;
                    client.bk = 63762094;
                    return;
                }
                gr.by = jv.bg + 0 + "%";
                gr.bk = -1084028978;
            } else if (130 == client.bk * 1555136039) {
                if (!ai.bj.ar(25956537)) {
                    gr.by = jv.bf + ((ai.bj.ey((byte) -67) * 4) / 5) + "%";
                    gr.bk = 1177463648;
                } else if (!dt.cn.ar(1804090966)) {
                    gr.by = jv.bf + ((dt.cn.ey((byte) -15) / 6) + 80) + "%";
                    gr.bk = 1177463648;
                } else if (au.ck.ar(2069490623)) {
                    gr.by = jv.bv;
                    gr.bk = -856011022;
                    client.bk = -1583243628;
                } else {
                    gr.by = jv.bf + ((au.ck.ey((byte) 78) / 50) + 96) + "%";
                    gr.bk = 1177463648;
                }
            } else if (client.bk * 1555136039 == 140) {
                gr.bk = 1405481604;
                if (eq.cd.ap(du.af.ay, -1963936473)) {
                    if (et.pz == null) {
                        et.pz = new oh();
                        et.pz.af(eq.cd, ba.dy, client.dn, nm.ez, (byte) -37);
                    }
                    i2 = et.pz.ad((byte) 40);
                    if (i2 < 100) {
                        gr.by = jv.bp + (((i2 * 9) / 10) + 10) + "%";
                        return;
                    }
                    gr.by = jv.bx;
                    client.bk = 1064717946;
                    return;
                }
                gr.by = jv.bp + (eq.cd.bb(du.af.ay, -498168017) / 10) + "%";
            } else if (150 == client.bk * 1555136039) {
                av.bb((byte) -47);
                ad.ai(10, -2061721364);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lb.ac(" + ')');
        }
    }
}
