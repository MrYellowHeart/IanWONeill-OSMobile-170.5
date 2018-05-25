package p000;

import java.io.IOException;
import java.net.Socket;

public abstract class md {
    public abstract boolean aa(int i, byte b) throws IOException;

    public abstract int ab() throws IOException;

    public abstract int ac() throws IOException;

    public abstract int ad(int i) throws IOException;

    public abstract void ae();

    public abstract void af(byte b);

    public abstract int ag(byte[] bArr, int i, int i2, int i3) throws IOException;

    public abstract int ah(byte[] bArr, int i, int i2) throws IOException;

    public abstract int ai(byte[] bArr, int i, int i2) throws IOException;

    public abstract void aj();

    public abstract int al() throws IOException;

    public abstract int am() throws IOException;

    public abstract int an(int i) throws IOException;

    public abstract int ap() throws IOException;

    public abstract void aq();

    public abstract void ar();

    public abstract void as(byte[] bArr, int i, int i2, int i3) throws IOException;

    public abstract int at() throws IOException;

    public abstract void au(byte[] bArr, int i, int i2) throws IOException;

    public abstract void av(byte[] bArr, int i, int i2) throws IOException;

    public abstract boolean aw(int i) throws IOException;

    public abstract void ax(byte[] bArr, int i, int i2) throws IOException;

    public abstract int az(byte[] bArr, int i, int i2) throws IOException;

    md() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "md.<init>(" + ')');
        }
    }

    public static md bb(Socket socket, int i, int i2) throws IOException {
        return new my(socket, i, i2);
    }

    public static md bc(Socket socket, int i, int i2) throws IOException {
        return new my(socket, i, i2);
    }
}
