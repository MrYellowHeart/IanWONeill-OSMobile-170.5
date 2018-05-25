package p000;

public class bn {
    static int[] aa = new int[500];
    static int[] ad = new int[500];
    static int[] af = new int[500];
    static int[] an = new int[500];
    int[] ae;
    bf ag = null;
    int[] aj;
    boolean aq = false;
    int[] ar;
    int[] as;
    int ay = -1;

    bn(byte[] bArr, bf bfVar) {
        int i = -1;
        this.ag = bfVar;
        ik ikVar = new ik(bArr);
        ik ikVar2 = new ik(bArr);
        ikVar.ad = -164943418;
        int ao = ikVar.ao((byte) 0);
        ikVar2.ad = ((ikVar.ad * 1978945739) + ao) * 2065011939;
        int i2 = 0;
        for (int i3 = 0; i3 < ao; i3++) {
            int ao2 = ikVar.ao((byte) 0);
            if (ao2 > 0) {
                boolean z;
                if (this.ag.an[i3] != 0) {
                    for (int i4 = i3 - 1; i4 > i; i4--) {
                        if (this.ag.an[i4] == 0) {
                            af[i2] = i4;
                            ad[i2] = 0;
                            an[i2] = 0;
                            aa[i2] = 0;
                            i2++;
                            break;
                        }
                    }
                }
                af[i2] = i3;
                if (this.ag.an[i3] == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if ((ao2 & 1) != 0) {
                    ad[i2] = ikVar2.bh(-2147293599);
                } else {
                    ad[i2] = z;
                }
                if ((ao2 & 2) != 0) {
                    an[i2] = ikVar2.bh(-1958010631);
                } else {
                    an[i2] = z;
                }
                if ((ao2 & 4) != 0) {
                    aa[i2] = ikVar2.bh(-1926295847);
                } else {
                    aa[i2] = z;
                }
                i2++;
                if (this.ag.an[i3] == 5) {
                    this.aq = true;
                    i = i3;
                } else {
                    i = i3;
                }
            }
        }
        if (ikVar2.ad * 1978945739 != bArr.length) {
            throw new RuntimeException();
        }
        this.ay = i2;
        this.as = new int[i2];
        this.ar = new int[i2];
        this.aj = new int[i2];
        this.ae = new int[i2];
        for (i = 0; i < i2; i++) {
            this.as[i] = af[i];
            this.ar[i] = ad[i];
            this.aj[i] = an[i];
            this.ae[i] = aa[i];
        }
    }
}
