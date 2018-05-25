package p000;

/* compiled from: je */
class jq implements Runnable {
    static final int al = 19136776;
    final /* synthetic */ je this$0;

    public static byte af(char c, int i) {
        if ((c > '\u0000' && c < '') || (c >= ' ' && c <= 'ÿ')) {
            return (byte) c;
        }
        if (c == '€') {
            return Byte.MIN_VALUE;
        }
        if (c == '‚') {
            return (byte) -126;
        }
        if ('ƒ' == c) {
            return (byte) -125;
        }
        if (c == '„') {
            return (byte) -124;
        }
        if ('…' == c) {
            return (byte) -123;
        }
        if (c == '†') {
            return (byte) -122;
        }
        if (c == '‡') {
            return (byte) -121;
        }
        if (c == 'ˆ') {
            return (byte) -120;
        }
        if (c == '‰') {
            return (byte) -119;
        }
        if ('Š' == c) {
            return (byte) -118;
        }
        if ('‹' == c) {
            return (byte) -117;
        }
        if (c == 'Œ') {
            return (byte) -116;
        }
        if ('Ž' == c) {
            return (byte) -114;
        }
        if (c == '‘') {
            return (byte) -111;
        }
        if (c == '’') {
            return (byte) -110;
        }
        if ('“' == c) {
            return (byte) -109;
        }
        if (c == '”') {
            return (byte) -108;
        }
        if (c == '•') {
            return (byte) -107;
        }
        if (c == '–') {
            return (byte) -106;
        }
        if ('—' == c) {
            return (byte) -105;
        }
        if ('˜' == c) {
            return (byte) -104;
        }
        if ('™' == c) {
            return (byte) -103;
        }
        if ('š' == c) {
            return (byte) -102;
        }
        if (c == '›') {
            return (byte) -101;
        }
        if (c == 'œ') {
            return (byte) -100;
        }
        if (c == 'ž') {
            return (byte) -98;
        }
        if (c == 'Ÿ') {
            return (byte) -97;
        }
        return (byte) 63;
    }

    public static at ad(int i, byte b) {
        try {
            at atVar = (at) at.an.af((long) i);
            if (atVar == null) {
                byte[] an = at.af.an(16, i, -313464890);
                atVar = new at();
                if (an != null) {
                    atVar.an(new ik(an), 40000);
                }
                at.an.an(atVar, (long) i);
            }
            return atVar;
        } catch (Throwable e) {
            throw ba.ad(e, "jq.ad(" + ')');
        }
    }

    jq(je jeVar) {
        this.this$0 = jeVar;
    }

    public void bo() {
        synchronized (this.this$0.ar) {
            for (jm ag : this.this$0.ar) {
                ag.ag((byte) -24);
            }
            this.this$0.ar.clear();
        }
    }

    public void ci() {
        synchronized (this.this$0.ar) {
            for (jm ag : this.this$0.ar) {
                ag.ag((byte) -13);
            }
            this.this$0.ar.clear();
        }
    }

    public void cv() {
        synchronized (this.this$0.ar) {
            for (jm ag : this.this$0.ar) {
                ag.ag((byte) -74);
            }
            this.this$0.ar.clear();
        }
    }

    public void run() {
        try {
            synchronized (this.this$0.ar) {
                for (jm ag : this.this$0.ar) {
                    ag.ag((byte) 5);
                }
                this.this$0.ar.clear();
            }
        } catch (Throwable e) {
            throw ba.ad(e, "jq.run(" + ')');
        }
    }
}
