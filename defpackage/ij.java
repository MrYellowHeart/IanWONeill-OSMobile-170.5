package p000;

public abstract class ij {
    static boolean af = false;
    static final int ao = 2097152;
    public static int[] ar = null;
    public static final int cd = 1010;
    public static final int cp = 88;

    abstract byte[] aa(int i);

    abstract byte[] ab();

    abstract void ag(byte[] bArr, int i);

    abstract void ai(byte[] bArr);

    abstract byte[] aw();

    abstract void az(byte[] bArr);

    ij() {
        try {
        } catch (Throwable e) {
            throw ba.ad(e, "ij.<init>(" + ')');
        }
    }

    public static Object ar(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length > 952149426 && !af) {
            try {
                ij iiVar = new ii();
                iiVar.ag(bArr, -1135076845);
                return iiVar;
            } catch (Throwable th) {
                af = true;
            }
        }
        if (z) {
            return bg.an(bArr, -634706030);
        }
        return bArr;
    }

    public static Object as(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length > 1405496099 && !af) {
            try {
                ij iiVar = new ii();
                iiVar.ag(bArr, 1498706089);
                return iiVar;
            } catch (Throwable th) {
                af = true;
            }
        }
        if (z) {
            return bg.an(bArr, 505368936);
        }
        return bArr;
    }

    public static Object ay(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length > 136 && !af) {
            try {
                ij iiVar = new ii();
                iiVar.ag(bArr, 1161688935);
                return iiVar;
            } catch (Throwable th) {
                af = true;
            }
        }
        if (z) {
            return bg.an(bArr, -238831611);
        }
        return bArr;
    }

    public static byte[] ae(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z) {
                return bg.an(bArr, -1786836332);
            }
            return bArr;
        } else if (obj instanceof ij) {
            return ((ij) obj).aa(-844372969);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static byte[] aj(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z) {
                return bg.an(bArr, 47958782);
            }
            return bArr;
        } else if (obj instanceof ij) {
            return ((ij) obj).aa(-844372969);
        } else {
            throw new IllegalArgumentException();
        }
    }

    static byte[] am(byte[] bArr) {
        int length = bArr.length;
        Object obj = new byte[length];
        System.arraycopy(bArr, 0, obj, 0, length);
        return obj;
    }

    static byte[] aq(byte[] bArr) {
        int length = bArr.length;
        Object obj = new byte[length];
        System.arraycopy(bArr, 0, obj, 0, length);
        return obj;
    }

    static byte[] at(byte[] bArr) {
        int length = bArr.length;
        Object obj = new byte[length];
        System.arraycopy(bArr, 0, obj, 0, length);
        return obj;
    }
}
