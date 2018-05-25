package p000;

import java.net.URL;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class lg {
    final lj aa;
    lb ad;
    String af;
    final List ag;
    lx an;
    List ay;

    public lg(String str) {
        try {
            this.aa = new lj("universal");
            this.ag = new LinkedList();
            this.ay = new LinkedList();
            this.af = str;
        } catch (Throwable e) {
            throw ba.ad(e, "lg.<init>(" + ')');
        }
    }

    public boolean af(int i, int i2) {
        try {
            if (this.ad == null) {
                this.ad = new lb();
                Hashtable hashtable = this.aa.an;
                switch (i) {
                    case 0:
                        hashtable.put("err_missing_config", "Missing com.jagex.config setting");
                        hashtable.put("err_invalid_config", "Invalid com.jagex.config setting");
                        hashtable.put("loading_config", "Loading configuration");
                        hashtable.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
                        hashtable.put("err_decode_config", "Error decoding configuration");
                        hashtable.put("loaderbox_initial", "Loading...");
                        hashtable.put("error", "Error");
                        hashtable.put("quit", "Quit");
                        hashtable.put("alreadyopen", "Please close your existing game before loading another one");
                        break;
                }
            }
            try {
                if (this.af == null) {
                    throw new Exception("Url to fetch JavConfig is null");
                }
                if (this.an == null) {
                    this.an = this.ad.af(new URL(this.af), -615329840);
                } else if (this.an.ad(1616762096)) {
                    ip ipVar = new ip(new String(this.an.an(-987031568), "CP1252").split("[\\r\\n]+"));
                    lj ljVar = this.aa;
                    while (true) {
                        String[] ad = ipVar.ad(895042212);
                        if (ad == null) {
                            String af = ipVar.af((byte) -33);
                            if (af != null) {
                                ljVar = new lj(af);
                                this.ag.add(ljVar);
                            } else {
                                this.ad.an((byte) 49);
                                this.ad = null;
                                return true;
                            }
                        } else if (ad[0].equals("param")) {
                            ad(ad[1], ljVar, -2099968095);
                        } else if (ad[0].equals("msg")) {
                            an(ad[1], ljVar, 1090706355);
                        } else {
                            aa(ad, ljVar, 1939443222);
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                if (this.ad == null) {
                    return true;
                }
                this.ad.an((byte) 45);
                this.ad = null;
                return true;
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "lg.af(" + ')');
        }
    }

    public boolean as(int i) {
        if (this.ad == null) {
            this.ad = new lb();
            Hashtable hashtable = this.aa.an;
            switch (i) {
                case 0:
                    hashtable.put("err_missing_config", "Missing com.jagex.config setting");
                    hashtable.put("err_invalid_config", "Invalid com.jagex.config setting");
                    hashtable.put("loading_config", "Loading configuration");
                    hashtable.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
                    hashtable.put("err_decode_config", "Error decoding configuration");
                    hashtable.put("loaderbox_initial", "Loading...");
                    hashtable.put("error", "Error");
                    hashtable.put("quit", "Quit");
                    hashtable.put("alreadyopen", "Please close your existing game before loading another one");
                    break;
            }
        }
        try {
            if (this.af == null) {
                throw new Exception("Url to fetch JavConfig is null");
            }
            if (this.an == null) {
                this.an = this.ad.af(new URL(this.af), -615329840);
            } else if (this.an.ad(-1680273742)) {
                ip ipVar = new ip(new String(this.an.an(-183806617), "CP1252").split("[\\r\\n]+"));
                lj ljVar = this.aa;
                while (true) {
                    String[] ad = ipVar.ad(895042212);
                    if (ad == null) {
                        String af = ipVar.af((byte) 51);
                        if (af != null) {
                            ljVar = new lj(af);
                            this.ag.add(ljVar);
                        } else {
                            this.ad.an((byte) 66);
                            this.ad = null;
                            return true;
                        }
                    } else if (ad[0].equals("param")) {
                        ad(ad[1], ljVar, -2099968095);
                    } else if (ad[0].equals("msg")) {
                        an(ad[1], ljVar, 1090706355);
                    } else {
                        aa(ad, ljVar, 1448817520);
                    }
                }
            }
            return false;
        } catch (Exception e) {
            if (this.ad == null) {
                return true;
            }
            this.ad.an((byte) 92);
            this.ad = null;
            return true;
        }
    }

    void ad(String str, lj ljVar, int i) {
        try {
            int indexOf = str.indexOf(61);
            if (-1 != indexOf) {
                ljVar.ad.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        } catch (Throwable e) {
            throw ba.ad(e, "lg.ad(" + ')');
        }
    }

    void ae(String str, lj ljVar) {
        int indexOf = str.indexOf(-1344544971);
        if (-1 != indexOf) {
            ljVar.ad.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    void aj(String str, lj ljVar) {
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            ljVar.ad.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    void am(String str, lj ljVar) {
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            ljVar.ad.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    void aq(String str, lj ljVar) {
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            ljVar.ad.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    void ar(String str, lj ljVar) {
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            ljVar.ad.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    void at(String str, lj ljVar) {
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            ljVar.ad.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
        }
    }

    void ab(String str, lj ljVar) {
        int i = 0;
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            String toLowerCase = str.substring(0, indexOf).trim().toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(str.substring(indexOf + 1).trim());
            while (true) {
                indexOf = stringBuilder.indexOf("\\\\", i);
                i = stringBuilder.indexOf("\\n", i);
                if (indexOf < 0 && i < 0) {
                    break;
                } else if (indexOf < 0 || (i >= 0 && i < indexOf)) {
                    stringBuilder.replace(i, i + 2, "\n");
                    i++;
                } else {
                    stringBuilder.replace(indexOf, indexOf + 2, "\\");
                    i = indexOf + 1;
                }
            }
            if (toLowerCase.startsWith("lang")) {
                try {
                    this.ay.add(new ly(Integer.parseInt(toLowerCase.substring(4)), stringBuilder.toString()));
                } catch (NumberFormatException e) {
                }
            }
            ljVar.an.put(toLowerCase, stringBuilder.toString());
        }
    }

    void ai(String str, lj ljVar) {
        int i = 0;
        int indexOf = str.indexOf(61);
        if (-1 != indexOf) {
            String toLowerCase = str.substring(0, indexOf).trim().toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(str.substring(indexOf + 1).trim());
            while (true) {
                indexOf = stringBuilder.indexOf("\\\\", i);
                i = stringBuilder.indexOf("\\n", i);
                if (indexOf < 0 && i < 0) {
                    break;
                } else if (indexOf < 0 || (i >= 0 && i < indexOf)) {
                    stringBuilder.replace(i, i + 2, "\n");
                    i++;
                } else {
                    stringBuilder.replace(indexOf, indexOf + 2, "\\");
                    i = indexOf + 1;
                }
            }
            if (toLowerCase.startsWith("lang")) {
                try {
                    this.ay.add(new ly(Integer.parseInt(toLowerCase.substring(4)), stringBuilder.toString()));
                } catch (NumberFormatException e) {
                }
            }
            ljVar.an.put(toLowerCase, stringBuilder.toString());
        }
    }

    void an(String str, lj ljVar, int i) {
        int i2 = 0;
        try {
            int indexOf = str.indexOf(61);
            if (-1 != indexOf) {
                String toLowerCase = str.substring(0, indexOf).trim().toLowerCase();
                StringBuilder stringBuilder = new StringBuilder(str.substring(indexOf + 1).trim());
                while (true) {
                    indexOf = stringBuilder.indexOf("\\\\", i2);
                    i2 = stringBuilder.indexOf("\\n", i2);
                    if (indexOf < 0 && i2 < 0) {
                        break;
                    } else if (indexOf < 0 || (i2 >= 0 && i2 < indexOf)) {
                        stringBuilder.replace(i2, i2 + 2, "\n");
                        i2++;
                    } else {
                        stringBuilder.replace(indexOf, indexOf + 2, "\\");
                        i2 = indexOf + 1;
                    }
                }
                if (toLowerCase.startsWith("lang")) {
                    try {
                        this.ay.add(new ly(Integer.parseInt(toLowerCase.substring(4)), stringBuilder.toString()));
                    } catch (NumberFormatException e) {
                    }
                }
                ljVar.an.put(toLowerCase, stringBuilder.toString());
            }
        } catch (Throwable e2) {
            throw ba.ad(e2, "lg.an(" + ')');
        }
    }

    void aw(String str, lj ljVar) {
        int i = 0;
        int indexOf = str.indexOf(-1064123328);
        if (-1 != indexOf) {
            String toLowerCase = str.substring(0, indexOf).trim().toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(str.substring(indexOf + 1).trim());
            while (true) {
                indexOf = stringBuilder.indexOf("\\\\", i);
                i = stringBuilder.indexOf("\\n", i);
                if (indexOf < 0 && i < 0) {
                    break;
                } else if (indexOf < 0 || (i >= 0 && i < indexOf)) {
                    stringBuilder.replace(i, i + 2, "\n");
                    i++;
                } else {
                    stringBuilder.replace(indexOf, indexOf + 2, "\\");
                    i = indexOf + 1;
                }
            }
            if (toLowerCase.startsWith("lang")) {
                try {
                    this.ay.add(new ly(Integer.parseInt(toLowerCase.substring(4)), stringBuilder.toString()));
                } catch (NumberFormatException e) {
                }
            }
            ljVar.an.put(toLowerCase, stringBuilder.toString());
        }
    }

    void aa(String[] strArr, lj ljVar, int i) {
        try {
            ljVar.af.put(strArr[0], strArr[1]);
        } catch (Throwable e) {
            throw ba.ad(e, "lg.aa(" + ')');
        }
    }

    public lj ag(byte b) {
        try {
            return this.aa;
        } catch (Throwable e) {
            throw ba.ad(e, "lg.ag(" + ')');
        }
    }

    public lj ah() {
        return this.aa;
    }

    public lj az() {
        return this.aa;
    }

    public String ak() {
        return this.af;
    }

    public String ay(int i) {
        try {
            return this.af;
        } catch (Throwable e) {
            throw ba.ad(e, "lg.ay(" + ')');
        }
    }

    static void gf(int i, int i2) {
        try {
            client.fi = -186674431 * i;
        } catch (Throwable e) {
            throw ba.ad(e, "lg.gf(" + ')');
        }
    }
}
