package p000;

import java.io.IOException;
import java.net.Socket;

public class my extends md {
    public static final int ah = 20;
    static int[] ay;
    li ad;
    Socket af;
    mz an;

    my(Socket socket, int i, int i2) throws IOException {
        try {
            this.af = socket;
            this.af.setSoTimeout(30000);
            this.af.setTcpNoDelay(true);
            this.af.setReceiveBufferSize(ic.ad);
            this.af.setSendBufferSize(ic.ad);
            this.ad = new li(this.af.getInputStream(), i);
            this.an = new mz(this.af.getOutputStream(), i2);
        } catch (Throwable e) {
            throw ba.ad(e, "my.<init>(" + ')');
        }
    }

    public boolean aa(int i, byte b) throws IOException {
        try {
            return this.ad.ad(i, -968522914);
        } catch (Throwable e) {
            throw ba.ad(e, "my.aa(" + ')');
        }
    }

    public boolean aw(int i) throws IOException {
        return this.ad.ad(i, -1136663345);
    }

    public int ac() throws IOException {
        return this.ad.an(965635108);
    }

    public int al() throws IOException {
        return this.ad.an(2144726747);
    }

    public int an(int i) throws IOException {
        try {
            return this.ad.an(-1450659274);
        } catch (Throwable e) {
            throw ba.ad(e, "my.an(" + ')');
        }
    }

    public int ap() throws IOException {
        return this.ad.an(-1137400062);
    }

    public int ab() throws IOException {
        return this.ad.aa(901229119);
    }

    public int ad(int i) throws IOException {
        try {
            return this.ad.aa(901229119);
        } catch (Throwable e) {
            throw ba.ad(e, "my.ad(" + ')');
        }
    }

    public int am() throws IOException {
        return this.ad.aa(901229119);
    }

    public int at() throws IOException {
        return this.ad.aa(901229119);
    }

    public int ag(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            return this.ad.ag(bArr, i, i2, 463161166);
        } catch (Throwable e) {
            throw ba.ad(e, "my.ag(" + ')');
        }
    }

    public int ah(byte[] bArr, int i, int i2) throws IOException {
        return this.ad.ag(bArr, i, i2, -73290051);
    }

    public int ai(byte[] bArr, int i, int i2) throws IOException {
        return this.ad.ag(bArr, i, i2, 1707098619);
    }

    public int az(byte[] bArr, int i, int i2) throws IOException {
        return this.ad.ag(bArr, i, i2, 1840679807);
    }

    public void as(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            this.an.an(bArr, i, i2, (byte) 9);
        } catch (Throwable e) {
            throw ba.ad(e, "my.as(" + ')');
        }
    }

    public void au(byte[] bArr, int i, int i2) throws IOException {
        this.an.an(bArr, i, i2, (byte) 2);
    }

    public void av(byte[] bArr, int i, int i2) throws IOException {
        this.an.an(bArr, i, i2, (byte) 120);
    }

    public void ax(byte[] bArr, int i, int i2) throws IOException {
        this.an.an(bArr, i, i2, (byte) 14);
    }

    public void ae() {
        this.an.aa(-951479974);
        try {
            this.af.close();
        } catch (IOException e) {
        }
        this.ad.ay(2027372292);
    }

    public void af(byte b) {
        try {
            this.an.aa(-951479974);
            try {
                this.af.close();
            } catch (IOException e) {
            }
            this.ad.ay(274982988);
        } catch (Throwable e2) {
            throw ba.ad(e2, "my.af(" + ')');
        }
    }

    public void aj() {
        this.an.aa(-951479974);
        try {
            this.af.close();
        } catch (IOException e) {
        }
        this.ad.ay(51226660);
    }

    public void aq() {
        this.an.aa(-951479974);
        try {
            this.af.close();
        } catch (IOException e) {
        }
        this.ad.ay(-255972606);
    }

    public void ar() {
        this.an.aa(-951479974);
        try {
            this.af.close();
        } catch (IOException e) {
        }
        this.ad.ay(-1551809741);
    }

    protected void aac() {
        af((byte) -20);
    }

    protected void finalize() {
        try {
            af((byte) -86);
        } catch (Throwable e) {
            throw ba.ad(e, "my.finalize(" + ')');
        }
    }
}
