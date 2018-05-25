package p000;

import java.io.IOException;
import java.util.Comparator;

public class cr implements Comparator {
    static gd aj;
    static kh cv;
    final boolean af;

    public cr(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "cr.<init>(" + ')');
        }
    }

    public static String af(long j) {
        String str = null;
        if (j > 0 && j < 6582952005840035281L) {
            if (0 != j % 37) {
                int i = 0;
                long j2 = j;
                while (0 != j2) {
                    i++;
                    try {
                        j2 /= 37;
                    } catch (Throwable e) {
                        throw ba.ad(e, "cr.af(" + ')');
                    }
                }
                StringBuilder stringBuilder = new StringBuilder(i);
                while (j != 0) {
                    j2 = j / 37;
                    stringBuilder.append(mh.af[(int) (j - (37 * j2))]);
                    j = j2;
                }
                str = stringBuilder.reverse().toString();
            }
        }
        return str;
    }

    int ad(ez ezVar, ez ezVar2) {
        return this.af ? (ezVar.ay * 2046794799) - (ezVar2.ay * -351395839) : (84028463 * ezVar2.ay) - (ezVar.ay * 2046794799);
    }

    int af(ez ezVar, ez ezVar2, int i) {
        try {
            return this.af ? (ezVar.ay * 2046794799) - (ezVar2.ay * 2046794799) : (ezVar2.ay * 2046794799) - (ezVar.ay * 2046794799);
        } catch (Throwable e) {
            throw ba.ad(e, "cr.af(" + ')');
        }
    }

    int ay(ez ezVar, ez ezVar2) {
        return this.af ? (ezVar.ay * 2046794799) - (ezVar2.ay * 2046794799) : (ezVar2.ay * 2046794799) - (ezVar.ay * 1807028887);
    }

    public int aa(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1172505342);
    }

    public int ag(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1979102503);
    }

    public int an(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1639202246);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((ez) obj, (ez) obj2, 1322010932);
        } catch (Throwable e) {
            throw ba.ad(e, "cr.compare(" + ')');
        }
    }

    public boolean cf(Object obj) {
        return super.equals(obj);
    }

    public boolean cz(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (Throwable e) {
            throw ba.ad(e, "cr.equals(" + ')');
        }
    }

    public static void af(boolean z, int i) {
        try {
            if (jw.af != null) {
                try {
                    ik ikVar = new ik(4);
                    ikVar.an(z ? 2 : 3, (byte) 31);
                    ikVar.ag(0, 1462828146);
                    jw.af.as(ikVar.af, 0, 4, -1743832022);
                } catch (IOException e) {
                    try {
                        jw.af.af((byte) -31);
                    } catch (Exception e2) {
                    }
                    jw.ac += 2083888617;
                    jw.af = null;
                }
            }
        } catch (Throwable e3) {
            throw ba.ad(e3, "cr.af(" + ')');
        }
    }

    static int ad(int i, int i2, int i3) {
        if (i == -2) {
            return 12345678;
        }
        if (i == -1) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 127) {
                i2 = 127;
            }
            return 127 - i2;
        }
        try {
            int i4 = ((i & 127) * i2) / mn.an;
            if (i4 < 2) {
                i4 = 2;
            } else if (i4 > 126) {
                i4 = 126;
            }
            return i4 + (65408 & i);
        } catch (Throwable e) {
            throw ba.ad(e, "cr.ad(" + ')');
        }
    }

    static final void ad(ia iaVar, int i, int i2) {
        try {
            int i3 = iaVar.ad * 1978945739;
            gw.at = 0;
            am.an(iaVar, (short) 210);
            bp.as(iaVar, -1089562734);
            if ((iaVar.ad * 1978945739) - i3 != i) {
                throw new RuntimeException(((iaVar.ad * 1978945739) - i3) + " " + i);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "cr.ad(" + ')');
        }
    }
}
