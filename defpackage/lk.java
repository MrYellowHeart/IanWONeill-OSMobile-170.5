package p000;

public class lk {
    int[] af;

    public lk(int[] iArr) {
        int i;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= iArr.length + (iArr.length >> 1)) {
            i3 <<= 1;
        }
        this.af = new int[(i3 + i3)];
        for (i = 0; i < i3 + i3; i++) {
            this.af[i] = -1;
        }
        while (i2 < iArr.length) {
            i = iArr[i2] & (i3 - 1);
            while (this.af[(i + i) + 1] != -1) {
                i = (i + 1) & (i3 - 1);
            }
            this.af[i + i] = iArr[i2];
            this.af[(i + i) + 1] = i2;
            i2++;
        }
    }

    public int aa(int i) {
        int length = (this.af.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = this.af[(i2 + i2) + 1];
            if (i3 == -1) {
                return -1;
            }
            if (this.af[i2 + i2] == i) {
                return i3;
            }
            i2 = (i2 + 1) & length;
        }
    }

    public int ad(int i) {
        int length = (this.af.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = this.af[(i2 + i2) + 1];
            if (i3 == -1) {
                return -1;
            }
            if (this.af[i2 + i2] == i) {
                return i3;
            }
            i2 = (i2 + 1) & length;
        }
    }

    public int af(int i) {
        int length = (this.af.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = this.af[(i2 + i2) + 1];
            if (i3 == -1) {
                return -1;
            }
            if (this.af[i2 + i2] == i) {
                return i3;
            }
            i2 = (i2 + 1) & length;
        }
    }

    public int ag(int i) {
        int length = (this.af.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = this.af[(i2 + i2) + 1];
            if (i3 == -1) {
                return -1;
            }
            if (this.af[i2 + i2] == i) {
                return i3;
            }
            i2 = (i2 + 1) & length;
        }
    }

    public int an(int i) {
        int length = (this.af.length >> 1) - 1;
        int i2 = i & length;
        while (true) {
            int i3 = this.af[(i2 + i2) + 1];
            if (i3 == -1) {
                return -1;
            }
            if (this.af[i2 + i2] == i) {
                return i3;
            }
            i2 = (i2 + 1) & length;
        }
    }
}
