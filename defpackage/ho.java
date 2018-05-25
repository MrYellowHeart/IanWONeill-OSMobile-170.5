package p000;

public class ho extends kd {
    static kb af = new kb(32);
    public static final int aj = 4;
    static final int co = 1004;
    int[] ad;
    int[] an;

    ho() {
        try {
            this.ad = new int[]{-1};
            this.an = new int[]{0};
        } catch (Throwable e) {
            throw ba.ad(e, "ho.<init>(" + ')');
        }
    }

    static int ae(int i, int i2) {
        ho hoVar = (ho) af.af((long) i);
        if (hoVar == null) {
            return 0;
        }
        if (i2 < 0 || i2 >= hoVar.an.length) {
            return 0;
        }
        return hoVar.an[i2];
    }

    static int aj(int i, int i2) {
        ho hoVar = (ho) af.af((long) i);
        if (hoVar == null) {
            return 0;
        }
        if (i2 < 0 || i2 >= hoVar.an.length) {
            return 0;
        }
        return hoVar.an[i2];
    }

    static int ar(int i, int i2) {
        ho hoVar = (ho) af.af((long) i);
        if (hoVar == null) {
            return 0;
        }
        if (i2 < 0 || i2 >= hoVar.an.length) {
            return 0;
        }
        return hoVar.an[i2];
    }

    static int as(int i, int i2) {
        ho hoVar = (ho) af.af((long) i);
        if (hoVar == null) {
            return 0;
        }
        if (i2 < 0 || i2 >= hoVar.an.length) {
            return 0;
        }
        return hoVar.an[i2];
    }

    static int ay(int i, int i2) {
        ho hoVar = (ho) af.af((long) i);
        if (hoVar == null) {
            return 0;
        }
        if (i2 < 0 || i2 >= hoVar.an.length) {
            return 0;
        }
        return hoVar.an[i2];
    }

    static int ab(int i, int i2) {
        int i3 = 0;
        ho hoVar = (ho) af.af((long) i);
        if (hoVar == null) {
            return 0;
        }
        if (-1 == i2) {
            return 0;
        }
        int i4 = 0;
        while (i3 < hoVar.an.length) {
            if (hoVar.ad[i3] == i2) {
                i4 += hoVar.an[i3];
            }
            i3++;
        }
        return i4;
    }

    static int am(int i, int i2) {
        int i3 = 0;
        ho hoVar = (ho) af.af((long) i);
        if (hoVar == null) {
            return 0;
        }
        if (-1 == i2) {
            return 0;
        }
        int i4 = 0;
        while (i3 < hoVar.an.length) {
            if (hoVar.ad[i3] == i2) {
                i4 += hoVar.an[i3];
            }
            i3++;
        }
        return i4;
    }

    static int aq(int i, int i2) {
        int i3 = 0;
        ho hoVar = (ho) af.af((long) i);
        if (hoVar == null) {
            return 0;
        }
        if (-1 == i2) {
            return 0;
        }
        int i4 = 0;
        while (i3 < hoVar.an.length) {
            if (hoVar.ad[i3] == i2) {
                i4 += hoVar.an[i3];
            }
            i3++;
        }
        return i4;
    }

    static int at(int i, int i2) {
        int i3 = 0;
        ho hoVar = (ho) af.af((long) i);
        if (hoVar == null || -1 == i2) {
            return 0;
        }
        int i4 = 0;
        while (i3 < hoVar.an.length) {
            if (hoVar.ad[i3] == i2) {
                i4 += hoVar.an[i3];
            }
            i3++;
        }
        return i4;
    }

    static void ai(int i) {
        ho hoVar = (ho) af.af((long) i);
        if (hoVar != null) {
            for (int i2 = 0; i2 < hoVar.ad.length; i2++) {
                hoVar.ad[i2] = -1;
                hoVar.an[i2] = 0;
            }
        }
    }

    static void aw(int i) {
        ho hoVar = (ho) af.af((long) i);
        if (hoVar != null) {
            for (int i2 = 0; i2 < hoVar.ad.length; i2++) {
                hoVar.ad[i2] = -1;
                hoVar.an[i2] = 0;
            }
        }
    }

    static void az(int i) {
        ho hoVar = (ho) af.af((long) i);
        if (hoVar != null) {
            for (int i2 = 0; i2 < hoVar.ad.length; i2++) {
                hoVar.ad[i2] = -1;
                hoVar.an[i2] = 0;
            }
        }
    }

    public static String an(CharSequence charSequence, byte b) {
        try {
            int length = charSequence.length();
            long j = 0;
            for (int i = 0; i < length; i++) {
                j *= 37;
                char charAt = charSequence.charAt(i);
                if (charAt >= 'A' && charAt <= 'Z') {
                    j += (long) ((charAt + 1) - 65);
                } else if (charAt >= 'a' && charAt <= 'z') {
                    j += (long) ((charAt + 1) - 97);
                } else if (charAt >= '0' && charAt <= '9') {
                    j += (long) ((charAt + 27) - 48);
                }
                if (j >= 177917621779460413L) {
                    break;
                }
            }
            while (0 == j % 37 && j != 0) {
                j /= 37;
            }
            String ad = du.ad(j);
            if (ad == null) {
                return "";
            }
            return ad;
        } catch (Throwable e) {
            throw ba.ad(e, "ho.an(" + ')');
        }
    }

    static void ah(int i) {
        ho hoVar = (ho) af.af((long) i);
        if (hoVar != null) {
            hoVar.ki();
        }
    }
}
