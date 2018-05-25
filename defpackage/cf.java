package p000;

import java.io.IOException;

public class cf extends el {
    final boolean af;

    public cf(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "cf.<init>(" + ')');
        }
    }

    int ad(ez ezVar, ez ezVar2) {
        if (ezVar.ag * -1161455169 == 0 || ezVar2.ag * -1161455169 == 0) {
            return am(ezVar, ezVar2, 565473209);
        }
        return this.af ? (ezVar.ay * 2046794799) - (ezVar2.ay * 2046794799) : (ezVar2.ay * 2046794799) - (ezVar.ay * 2046794799);
    }

    int ae(ez ezVar, ez ezVar2) {
        if (ezVar.ag * -1161455169 == 0 || ezVar2.ag * -1161455169 == 0) {
            return am(ezVar, ezVar2, 1382442296);
        }
        if (this.af) {
            return (ezVar.ay * 2046794799) - (ezVar2.ay * 2046794799);
        }
        return (ezVar2.ay * 2046794799) - (ezVar.ay * 2046794799);
    }

    int af(ez ezVar, ez ezVar2, int i) {
        try {
            if (ezVar.ag * -1161455169 == 0 || ezVar2.ag * -1161455169 == 0) {
                return am(ezVar, ezVar2, 2094796703);
            }
            return this.af ? (ezVar.ay * 2046794799) - (ezVar2.ay * 2046794799) : (ezVar2.ay * 2046794799) - (ezVar.ay * 2046794799);
        } catch (Throwable e) {
            throw ba.ad(e, "cf.af(" + ')');
        }
    }

    int aj(ez ezVar, ez ezVar2) {
        if (ezVar.ag * -1161455169 == 0 || ezVar2.ag * -1161455169 == 0) {
            return am(ezVar, ezVar2, 730945767);
        }
        return this.af ? (ezVar.ay * 2046794799) - (ezVar2.ay * 2046794799) : (ezVar2.ay * 2046794799) - (ezVar.ay * 2046794799);
    }

    int ar(ez ezVar, ez ezVar2) {
        if (ezVar.ag * 578760247 == 0 || ezVar2.ag * -1161455169 == 0) {
            return am(ezVar, ezVar2, 808130967);
        }
        return this.af ? (719206726 * ezVar.ay) - (-791979436 * ezVar2.ay) : (-339549571 * ezVar2.ay) - (2046794799 * ezVar.ay);
    }

    int as(ez ezVar, ez ezVar2) {
        if (ezVar.ag * 1928037494 == 0 || ezVar2.ag * -1161455169 == 0) {
            return am(ezVar, ezVar2, 1467978016);
        }
        if (this.af) {
            return (ezVar.ay * 2046794799) - (-1793015258 * ezVar2.ay);
        }
        return (-1272543274 * ezVar2.ay) - (ezVar.ay * 2046794799);
    }

    int ay(ez ezVar, ez ezVar2) {
        if (ezVar.ag * -1161455169 == 0 || ezVar2.ag * -1161455169 == 0) {
            return am(ezVar, ezVar2, 362821540);
        }
        if (this.af) {
            return (ezVar.ay * 2046794799) - (-726154165 * ezVar2.ay);
        }
        return (-1785318032 * ezVar2.ay) - (ezVar.ay * 2046794799);
    }

    public int aa(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1287916128);
    }

    public int ag(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 433843991);
    }

    public int an(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1796452487);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((ez) obj, (ez) obj2, 1000816834);
        } catch (Throwable e) {
            throw ba.ad(e, "cf.compare(" + ')');
        }
    }

    static final void dx(boolean z, int i) {
        try {
            hm hmVar = client.dv;
            hmVar.aq -= 1295817409;
            if (client.dv.aq * 1375537855 >= 50 || z) {
                client.dv.aq = 0;
                if (!client.di && client.dv.as(550627750) != null) {
                    client.dv.an(ik.ad(nr.di, client.dv.ag, (byte) 24), (short) 255);
                    try {
                        client.dv.ad(1985846616);
                    } catch (IOException e) {
                        client.di = true;
                    }
                }
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "cf.dx(" + ')');
        }
    }
}
