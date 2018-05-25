package p000;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class nw {
    public static final int bl = 56;
    long ad;
    RandomAccessFile af;
    long an;

    public nw(File file, String str, long j) throws IOException {
        try {
            if (-1 == j) {
                j = Long.MAX_VALUE;
            }
            if (file.length() >= j) {
                file.delete();
            }
            this.af = new RandomAccessFile(file, str);
            this.ad = -8763823536527446971L * j;
            this.an = 0;
            int read = this.af.read();
            if (!(-1 == read || str.equals("r"))) {
                this.af.seek(0);
                this.af.write(read);
            }
            this.af.seek(0);
        } catch (Throwable e) {
            throw ba.ad(e, "nw.<init>(" + ')');
        }
    }

    final void af(long j) throws IOException {
        try {
            this.af.seek(j);
            this.an = -3331935310193291691L * j;
        } catch (Throwable e) {
            throw ba.ad(e, "nw.af(" + ')');
        }
    }

    final void ar(long j) throws IOException {
        this.af.seek(j);
        this.an = -3331935310193291691L * j;
    }

    final void as(long j) throws IOException {
        this.af.seek(j);
        this.an = -3331935310193291691L * j;
    }

    public final void ad(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if ((this.an * 4174325246980226813L) + ((long) i2) > this.ad * -1723792540313500019L) {
                this.af.seek(1 + (this.ad * -1723792540313500019L));
                this.af.write(1);
                throw new EOFException();
            }
            this.af.write(bArr, i, i2);
            this.an += -3331935310193291691L * ((long) i2);
        } catch (Throwable e) {
            throw ba.ad(e, "nw.ad(" + ')');
        }
    }

    public final void ae(byte[] bArr, int i, int i2) throws IOException {
        if ((this.an * 4174325246980226813L) + ((long) i2) > this.ad * -1723792540313500019L) {
            this.af.seek(1 + (this.ad * -1723792540313500019L));
            this.af.write(1);
            throw new EOFException();
        }
        this.af.write(bArr, i, i2);
        this.an += -3331935310193291691L * ((long) i2);
    }

    public final void aj(byte[] bArr, int i, int i2) throws IOException {
        if ((this.an * 4174325246980226813L) + ((long) i2) > this.ad * -1723792540313500019L) {
            this.af.seek(1 + (this.ad * -1723792540313500019L));
            this.af.write(1);
            throw new EOFException();
        }
        this.af.write(bArr, i, i2);
        this.an += -3331935310193291691L * ((long) i2);
    }

    public final void aq(byte[] bArr, int i, int i2) throws IOException {
        if ((this.an * 4174325246980226813L) + ((long) i2) > this.ad * -1723792540313500019L) {
            this.af.seek(1 + (this.ad * -1723792540313500019L));
            this.af.write(1);
            throw new EOFException();
        }
        this.af.write(bArr, i, i2);
        this.an += -3331935310193291691L * ((long) i2);
    }

    public final void am() throws IOException {
        aa(false, 2074797577);
    }

    public final void an(int i) throws IOException {
        try {
            aa(false, 2074797577);
        } catch (Throwable e) {
            throw ba.ad(e, "nw.an(" + ')');
        }
    }

    public final void aa(boolean z, int i) throws IOException {
        try {
            if (this.af != null) {
                if (z) {
                    try {
                        this.af.getFD().sync();
                    } catch (SyncFailedException e) {
                    }
                }
                this.af.close();
                this.af = null;
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "nw.aa(" + ')');
        }
    }

    public final void at(boolean z) throws IOException {
        if (this.af != null) {
            if (z) {
                try {
                    this.af.getFD().sync();
                } catch (SyncFailedException e) {
                }
            }
            this.af.close();
            this.af = null;
        }
    }

    public final long ab() throws IOException {
        return this.af.length();
    }

    public final long ag(int i) throws IOException {
        try {
            return this.af.length();
        } catch (Throwable e) {
            throw ba.ad(e, "nw.ag(" + ')');
        }
    }

    public final long ai() throws IOException {
        return this.af.length();
    }

    public final long aw() throws IOException {
        return this.af.length();
    }

    public final long az() throws IOException {
        return this.af.length();
    }

    public final int ay(byte[] bArr, int i, int i2, byte b) throws IOException {
        try {
            int read = this.af.read(bArr, i, i2);
            if (read > 0) {
                this.an += ((long) read) * -3331935310193291691L;
            }
            return read;
        } catch (Throwable e) {
            throw ba.ad(e, "nw.ay(" + ')');
        }
    }

    protected void aac() throws Throwable {
        if (this.af != null) {
            System.out.println("");
            an(420907623);
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (this.af != null) {
                System.out.println("");
                an(420907623);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "nw.finalize(" + ')');
        }
    }
}
