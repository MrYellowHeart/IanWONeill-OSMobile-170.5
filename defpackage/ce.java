package p000;

import java.lang.reflect.Array;

public class ce extends el {
    static final int ae = 8;
    static gd an;
    static gd[] fk;
    final boolean af;

    public ce(boolean z) {
        try {
            this.af = z;
        } catch (Throwable e) {
            throw ba.ad(e, "ce.<init>(" + ')');
        }
    }

    int ad(ez ezVar, ez ezVar2) {
        if (client.an * -1304916389 != ezVar.ag * -1161455169 || ezVar2.ag * -1161455169 != client.an * -1304916389) {
            return am(ezVar, ezVar2, 2122215436);
        }
        if (this.af) {
            return ezVar.ar(2085686853).an(ezVar2.ar(2143407662), 1917482221);
        }
        return ezVar2.ar(1856358622).an(ezVar.ar(2110058131), 1320384654);
    }

    int af(ez ezVar, ez ezVar2, int i) {
        try {
            if (client.an * -1304916389 == ezVar.ag * -1161455169 && ezVar2.ag * -1161455169 == client.an * -1304916389) {
                return this.af ? ezVar.ar(2081676274).an(ezVar2.ar(2007048518), 1961183806) : ezVar2.ar(1774384181).an(ezVar.ar(1711309267), 1595925648);
            } else {
                return am(ezVar, ezVar2, 204280902);
            }
        } catch (Throwable e) {
            throw ba.ad(e, "ce.af(" + ')');
        }
    }

    int as(ez ezVar, ez ezVar2) {
        if (client.an * 1427807732 == -571628182 * ezVar.ag && ezVar2.ag * -1161455169 == client.an * -1304916389) {
            return this.af ? ezVar.ar(2143887534).an(ezVar2.ar(1808305312), 1499185180) : ezVar2.ar(1923157956).an(ezVar.ar(1970190864), 1742217353);
        } else {
            return am(ezVar, ezVar2, 1835594247);
        }
    }

    int ay(ez ezVar, ez ezVar2) {
        if (client.an * 728326442 == -1161455169 * ezVar.ag && ezVar2.ag * 1853756015 == client.an * -1304916389) {
            return this.af ? ezVar.ar(2008334827).an(ezVar2.ar(1786280479), 1903810597) : ezVar2.ar(1745688309).an(ezVar.ar(1747144928), 2024781385);
        } else {
            return am(ezVar, ezVar2, 1136902679);
        }
    }

    public int aa(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, -670091129);
    }

    public int ag(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, -2075045638);
    }

    public int an(Object obj, Object obj2) {
        return af((ez) obj, (ez) obj2, 1056838022);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return af((ez) obj, (ez) obj2, -183036185);
        } catch (Throwable e) {
            throw ba.ad(e, "ce.compare(" + ')');
        }
    }

    static void af(int i) {
        try {
            gu.an = 1071674573;
            gu.aa = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
            dm.ag = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
            jf.ay = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
            gb.as = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, li.cu, li.cu});
            nh.aw = (int[][][]) Array.newInstance(Integer.TYPE, new int[]{4, ie.ca, ie.ca});
            ch.ar = (byte[][][]) Array.newInstance(Byte.TYPE, new int[]{4, ie.ca, ie.ca});
            gu.aj = (int[][]) Array.newInstance(Integer.TYPE, new int[]{ie.ca, ie.ca});
            dm.ae = new int[li.cu];
            gu.aq = new int[li.cu];
            dy.am = new int[li.cu];
            gu.at = new int[li.cu];
            gu.ab = new int[li.cu];
        } catch (Throwable e) {
            throw ba.ad(e, "ce.af(" + ')');
        }
    }

    static int an(int i, gk gkVar, boolean z, byte b) {
        int i2 = 0;
        int i3;
        int i4;
        int i5;
        ac ad;
        ac acVar;
        int[] iArr;
        int[] iArr2;
        if (i < 1000) {
            if (100 == i) {
                try {
                    hr.ar -= 711305551;
                    i3 = hr.as[hr.ar * 537618701];
                    i4 = hr.as[(hr.ar * 537618701) + 1];
                    i5 = hr.as[(hr.ar * 537618701) + 2];
                    if (i4 == 0) {
                        throw new RuntimeException();
                    }
                    ad = hv.ad(i3, 187624186);
                    if (ad.fo == null) {
                        ad.fo = new ac[(i5 + 1)];
                    }
                    if (ad.fo.length <= i5) {
                        ac[] acVarArr = new ac[(i5 + 1)];
                        while (i2 < ad.fo.length) {
                            acVarArr[i2] = ad.fo[i2];
                            i2++;
                        }
                        ad.fo = acVarArr;
                    }
                    if (i5 <= 0 || ad.fo[i5 - 1] != null) {
                        acVar = new ac();
                        acVar.ao = i4 * 97215005;
                        i4 = ad.ah * 1;
                        acVar.ah = i4;
                        acVar.bt = i4 * 1790940165;
                        acVar.ak = -1063340613 * i5;
                        acVar.az = true;
                        ad.fo[i5] = acVar;
                        if (z) {
                            mn.ab = acVar;
                        } else {
                            hr.at = acVar;
                        }
                        client.fk(ad, (byte) 119);
                        i2 = 1;
                    } else {
                        throw new RuntimeException("" + (i5 - 1));
                    }
                } catch (Throwable e) {
                    throw ba.ad(e, "ce.an(" + ')');
                }
            } else if (i == jr.cx) {
                if (z) {
                    acVar = mn.ab;
                } else {
                    acVar = hr.at;
                }
                ad = hv.ad(acVar.ah * 1172750087, 265661025);
                ad.fo[acVar.ak * 2102445939] = null;
                client.fk(ad, (byte) 13);
                i2 = 1;
            } else if (102 == i) {
                iArr = hr.as;
                i3 = hr.ar - -1194553915;
                hr.ar = i3;
                acVar = hv.ad(iArr[i3 * 537618701], 491963008);
                acVar.fo = null;
                client.fk(acVar, (byte) 62);
                i2 = 1;
            } else if (i == 200) {
                hr.ar -= 1905859466;
                i2 = hr.as[hr.ar * 537618701];
                i3 = hr.as[(hr.ar * 537618701) + 1];
                acVar = jd.an(i2, i3, (byte) 59);
                if (acVar == null || -1 == i3) {
                    iArr = hr.as;
                    i3 = hr.ar - 1194553915;
                    hr.ar = i3;
                    iArr[(i3 * 537618701) - 1] = 0;
                } else {
                    iArr2 = hr.as;
                    i4 = hr.ar - 1194553915;
                    hr.ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = acVar;
                    } else {
                        hr.at = acVar;
                    }
                }
                i2 = 1;
            } else if (201 == i) {
                iArr = hr.as;
                i3 = hr.ar - -1194553915;
                hr.ar = i3;
                acVar = hv.ad(iArr[i3 * 537618701], 600157377);
                if (acVar != null) {
                    iArr2 = hr.as;
                    i4 = hr.ar - 1194553915;
                    hr.ar = i4;
                    iArr2[(i4 * 537618701) - 1] = 1;
                    if (z) {
                        mn.ab = acVar;
                    } else {
                        hr.at = acVar;
                    }
                } else {
                    iArr = hr.as;
                    i3 = hr.ar - 1194553915;
                    hr.ar = i3;
                    iArr[(i3 * 537618701) - 1] = 0;
                }
                i2 = 1;
            } else {
                i2 = 2;
            }
            return i2;
        } else if (i < 1100) {
            return eh.aa(i, gkVar, z, (byte) 56);
        } else {
            if (i < 1200) {
                return cx.ag(i, gkVar, z, -1778997016);
            }
            if (i < 1300) {
                return cx.ay(i, gkVar, z, (byte) 31);
            }
            if (i < ac.aa) {
                return bq.as(i, gkVar, z, -904071014);
            }
            if (i < 1500) {
                return ef.ar(i, gkVar, z, 2142624698);
            }
            if (i < 1600) {
                return gw.aj(i, gkVar, z, -104835752);
            }
            if (i < 1700) {
                return dz.ae(i, gkVar, z, 605832545);
            }
            if (i < 1800) {
                acVar = z ? mn.ab : hr.at;
                if (1700 == i) {
                    iArr2 = hr.as;
                    i4 = hr.ar - 1194553915;
                    hr.ar = i4;
                    iArr2[(i4 * 537618701) - 1] = acVar.fr * -868539721;
                    return 1;
                } else if (1701 == i) {
                    if (-868539721 * acVar.fr != -1) {
                        iArr2 = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr2[(i4 * 537618701) - 1] = acVar.fp * -1148087135;
                        return 1;
                    }
                    iArr = hr.as;
                    i3 = hr.ar - 1194553915;
                    hr.ar = i3;
                    iArr[(i3 * 537618701) - 1] = 0;
                    return 1;
                } else if (i != 1702) {
                    return 2;
                } else {
                    iArr2 = hr.as;
                    i4 = hr.ar - 1194553915;
                    hr.ar = i4;
                    iArr2[(i4 * 537618701) - 1] = acVar.ak * 2102445939;
                    return 1;
                }
            } else if (i < 1900) {
                return ed.aq(i, gkVar, z, 971693591);
            } else {
                if (i < 2000) {
                    return ed.am(i, gkVar, z, -184226430);
                }
                if (i < 2100) {
                    return eh.aa(i, gkVar, z, (byte) 8);
                }
                if (i < 2200) {
                    return cx.ag(i, gkVar, z, -1779367566);
                }
                if (i < 2300) {
                    return cx.ay(i, gkVar, z, (byte) 8);
                }
                if (i < 2400) {
                    return bq.as(i, gkVar, z, -925168768);
                }
                if (i < 2500) {
                    return ef.ar(i, gkVar, z, 2142624698);
                }
                int[] iArr3;
                if (i < 2600) {
                    iArr2 = hr.as;
                    i4 = hr.ar - -1194553915;
                    hr.ar = i4;
                    ad = hv.ad(iArr2[i4 * 537618701], 788752681);
                    if (i == 2500) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bg * 642824123;
                        return 1;
                    } else if (2501 == i) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bh * 384720325;
                        return 1;
                    } else if (2502 == i) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bf * 256177861;
                        return 1;
                    } else if (i == 2503) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bv * 57307023;
                        return 1;
                    } else if (2504 == i) {
                        iArr3 = hr.as;
                        i5 = hr.ar - 1194553915;
                        hr.ar = i5;
                        i5 = (i5 * 537618701) - 1;
                        if (ad.bu) {
                            i2 = 1;
                        }
                        iArr3[i5] = i2;
                        return 1;
                    } else if (i != 2505) {
                        return 2;
                    } else {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bt * -1008623461;
                        return 1;
                    }
                } else if (i < 2700) {
                    iArr2 = hr.as;
                    i4 = hr.ar - -1194553915;
                    hr.ar = i4;
                    ad = hv.ad(iArr2[i4 * 537618701], 1396852174);
                    if (i == 2600) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.be * -2091547827;
                        return 1;
                    } else if (2601 == i) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bk * 654937537;
                        return 1;
                    } else if (i == 2602) {
                        r0 = hr.aj;
                        i4 = hr.ae - 1246602361;
                        hr.ae = i4;
                        r0[(i4 * -1267697097) - 1] = ad.dj;
                        return 1;
                    } else if (i == 2603) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.by * 1151268625;
                        return 1;
                    } else if (i == 2604) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bn * -1243953689;
                        return 1;
                    } else if (2605 == i) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cr * 2105704033;
                        return 1;
                    } else if (i == 2606) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cb * -1375479599;
                        return 1;
                    } else if (2607 == i) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cz * -1211464689;
                        return 1;
                    } else if (i == 2608) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.cf * -2032348791;
                        return 1;
                    } else if (i == 2609) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bj * -479221341;
                        return 1;
                    } else if (2610 == i) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bi * -1726277411;
                        return 1;
                    } else if (2611 == i) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.ba * 334261811;
                        return 1;
                    } else if (2612 == i) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.bl * 1703184995;
                        return 1;
                    } else if (2613 == i) {
                        iArr = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr[(i4 * 537618701) - 1] = ad.br.af(1125351792);
                        return 1;
                    } else if (2614 != i) {
                        return 2;
                    } else {
                        iArr3 = hr.as;
                        i5 = hr.ar - 1194553915;
                        hr.ar = i5;
                        i5 = (i5 * 537618701) - 1;
                        if (ad.cx) {
                            i2 = 1;
                        }
                        iArr3[i5] = i2;
                        return 1;
                    }
                } else if (i < 2800) {
                    if (i == 2700) {
                        iArr = hr.as;
                        i3 = hr.ar - -1194553915;
                        hr.ar = i3;
                        acVar = hv.ad(iArr[i3 * 537618701], 161872534);
                        iArr2 = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr2[(i4 * 537618701) - 1] = acVar.fr * -868539721;
                        return 1;
                    } else if (i == 2701) {
                        iArr = hr.as;
                        i3 = hr.ar - -1194553915;
                        hr.ar = i3;
                        acVar = hv.ad(iArr[i3 * 537618701], 1804218437);
                        if (acVar.fr * -868539721 != -1) {
                            iArr2 = hr.as;
                            i4 = hr.ar - 1194553915;
                            hr.ar = i4;
                            iArr2[(i4 * 537618701) - 1] = acVar.fp * -1148087135;
                            return 1;
                        }
                        iArr = hr.as;
                        i3 = hr.ar - 1194553915;
                        hr.ar = i3;
                        iArr[(i3 * 537618701) - 1] = 0;
                        return 1;
                    } else if (i == 2702) {
                        iArr = hr.as;
                        i3 = hr.ar - -1194553915;
                        hr.ar = i3;
                        if (((hy) client.jk.af((long) iArr[i3 * 537618701])) != null) {
                            iArr = hr.as;
                            i3 = hr.ar - 1194553915;
                            hr.ar = i3;
                            iArr[(i3 * 537618701) - 1] = 1;
                            return 1;
                        }
                        iArr = hr.as;
                        i3 = hr.ar - 1194553915;
                        hr.ar = i3;
                        iArr[(i3 * 537618701) - 1] = 0;
                        return 1;
                    } else if (2706 != i) {
                        return 2;
                    } else {
                        iArr = hr.as;
                        i3 = hr.ar - 1194553915;
                        hr.ar = i3;
                        iArr[(i3 * 537618701) - 1] = 1704673651 * client.jy;
                        return 1;
                    }
                } else if (i < 2900) {
                    iArr = hr.as;
                    i3 = hr.ar - -1194553915;
                    hr.ar = i3;
                    acVar = hv.ad(iArr[i3 * 537618701], 738962627);
                    if (2800 == i) {
                        iArr2 = hr.as;
                        i4 = hr.ar - 1194553915;
                        hr.ar = i4;
                        iArr2[(i4 * 537618701) - 1] = (ah.fy(acVar, -1050399389) >> 11) & 63;
                        return 1;
                    } else if (2801 == i) {
                        iArr2 = hr.as;
                        i4 = hr.ar - -1194553915;
                        hr.ar = i4;
                        i3 = iArr2[i4 * 537618701] - 1;
                        if (acVar.ds == null || i3 >= acVar.ds.length || acVar.ds[i3] == null) {
                            r0 = hr.aj;
                            i3 = hr.ae - 1246602361;
                            hr.ae = i3;
                            r0[(i3 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r2 = hr.aj;
                        i5 = hr.ae - 1246602361;
                        hr.ae = i5;
                        r2[(i5 * -1267697097) - 1] = acVar.ds[i3];
                        return 1;
                    } else if (i != 2802) {
                        return 2;
                    } else {
                        if (acVar.dw == null) {
                            r0 = hr.aj;
                            i3 = hr.ae - 1246602361;
                            hr.ae = i3;
                            r0[(i3 * -1267697097) - 1] = "";
                            return 1;
                        }
                        r1 = hr.aj;
                        i4 = hr.ae - 1246602361;
                        hr.ae = i4;
                        r1[(i4 * -1267697097) - 1] = acVar.dw;
                        return 1;
                    }
                } else if (i < 3000) {
                    return ed.am(i, gkVar, z, 471493344);
                } else {
                    if (i < 3200) {
                        return hy.at(i, gkVar, z, 475635970);
                    }
                    if (i < 3300) {
                        return bh.ab(i, gkVar, z, -1401245391);
                    }
                    if (i < 3400) {
                        return dr.aw(i, gkVar, z, 16711935);
                    }
                    int i6;
                    if (i < 3500) {
                        ai ad2;
                        ai aiVar;
                        if (3400 == i) {
                            hr.ar -= 1905859466;
                            i3 = hr.as[hr.ar * 537618701];
                            i4 = hr.as[(hr.ar * 537618701) + 1];
                            ad2 = av.ad(i3, -1036470545);
                            if ('s' != ad2.aa) {
                                while (i2 >= -112083573 * ad2.as) {
                                    if (i4 != ad2.ar[i2]) {
                                        r2 = hr.aj;
                                        i5 = hr.ae - 1246602361;
                                        hr.ae = i5;
                                        r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                        aiVar = null;
                                        break;
                                    }
                                    i2++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                r1 = hr.aj;
                                i4 = hr.ae - 1246602361;
                                hr.ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            }
                            while (i2 >= -112083573 * ad2.as) {
                                if (i4 != ad2.ar[i2]) {
                                    r2 = hr.aj;
                                    i5 = hr.ae - 1246602361;
                                    hr.ae = i5;
                                    r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                    aiVar = null;
                                    break;
                                }
                                i2++;
                            }
                            aiVar = ad2;
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = hr.aj;
                            i4 = hr.ae - 1246602361;
                            hr.ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                            if (i2 >= -112083573 * ad2.as) {
                                aiVar = ad2;
                            } else if (i4 != ad2.ar[i2]) {
                                r2 = hr.aj;
                                i5 = hr.ae - 1246602361;
                                hr.ae = i5;
                                r2[(i5 * -1267697097) - 1] = ad2.ae[i2];
                                aiVar = null;
                                break;
                            } else {
                                i2++;
                            }
                            if (aiVar != null) {
                                return 1;
                            }
                            r1 = hr.aj;
                            i4 = hr.ae - 1246602361;
                            hr.ae = i4;
                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                            return 1;
                        } else if (3408 == i) {
                            hr.ar -= -483248364;
                            char c = hr.as[hr.ar * 537618701];
                            char c2 = hr.as[(hr.ar * 537618701) + 1];
                            i3 = hr.as[(hr.ar * 537618701) + 2];
                            i6 = hr.as[(hr.ar * 537618701) + 3];
                            ad2 = av.ad(i3, 2053406423);
                            if (ad2.an == c && c2 == ad2.aa) {
                                while (i2 < -112083573 * ad2.as) {
                                    if (i6 == ad2.ar[i2]) {
                                        if (c2 == 's') {
                                            r2 = hr.aj;
                                            i6 = hr.ae - 1246602361;
                                            hr.ae = i6;
                                            r2[(i6 * -1267697097) - 1] = ad2.ae[i2];
                                        } else {
                                            iArr3 = hr.as;
                                            i6 = hr.ar - 1194553915;
                                            hr.ar = i6;
                                            iArr3[(i6 * 537618701) - 1] = ad2.aj[i2];
                                        }
                                        aiVar = null;
                                        if (aiVar != null) {
                                            return 1;
                                        }
                                        if ('s' != c2) {
                                            r1 = hr.aj;
                                            i4 = hr.ae - 1246602361;
                                            hr.ae = i4;
                                            r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                            return 1;
                                        }
                                        iArr2 = hr.as;
                                        i4 = hr.ar - 1194553915;
                                        hr.ar = i4;
                                        iArr2[(i4 * 537618701) - 1] = aiVar.ay * -240948305;
                                        return 1;
                                    }
                                    i2++;
                                }
                                aiVar = ad2;
                                if (aiVar != null) {
                                    return 1;
                                }
                                if ('s' != c2) {
                                    iArr2 = hr.as;
                                    i4 = hr.ar - 1194553915;
                                    hr.ar = i4;
                                    iArr2[(i4 * 537618701) - 1] = aiVar.ay * -240948305;
                                    return 1;
                                }
                                r1 = hr.aj;
                                i4 = hr.ae - 1246602361;
                                hr.ae = i4;
                                r1[(i4 * -1267697097) - 1] = aiVar.ag;
                                return 1;
                            } else if (c2 == 's') {
                                r0 = hr.aj;
                                i3 = hr.ae - 1246602361;
                                hr.ae = i3;
                                r0[(i3 * -1267697097) - 1] = jv.aj;
                                return 1;
                            } else {
                                iArr = hr.as;
                                i3 = hr.ar - 1194553915;
                                hr.ar = i3;
                                iArr[(i3 * 537618701) - 1] = 0;
                                return 1;
                            }
                        } else if (i != 3411) {
                            return 2;
                        } else {
                            iArr = hr.as;
                            i3 = hr.ar - -1194553915;
                            hr.ar = i3;
                            aiVar = av.ad(iArr[i3 * 537618701], -1519978075);
                            iArr2 = hr.as;
                            i4 = hr.ar - 1194553915;
                            hr.ar = i4;
                            iArr2[(i4 * 537618701) - 1] = aiVar.ag((byte) 1);
                            return 1;
                        }
                    } else if (i < 3700) {
                        return cv.ai(i, gkVar, z, 2123082082);
                    } else {
                        if (i < 4000) {
                            return ga.az(i, gkVar, z, (byte) -89);
                        }
                        if (i < 4100) {
                            if (i == 4000) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 + i3;
                                return 1;
                            } else if (4001 == i) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 - i3;
                                return 1;
                            } else if (i == 4002) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 * i3;
                                return 1;
                            } else if (4003 == i) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 / i3;
                                return 1;
                            } else if (4004 == i) {
                                iArr = hr.as;
                                i3 = hr.ar - -1194553915;
                                hr.ar = i3;
                                i2 = iArr[i3 * 537618701];
                                iArr2 = hr.as;
                                i4 = hr.ar - 1194553915;
                                hr.ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) i2));
                                return 1;
                            } else if (i == 4005) {
                                iArr = hr.as;
                                i3 = hr.ar - -1194553915;
                                hr.ar = i3;
                                i2 = iArr[i3 * 537618701];
                                iArr2 = hr.as;
                                i4 = hr.ar - 1194553915;
                                hr.ar = i4;
                                iArr2[(i4 * 537618701) - 1] = (int) (Math.random() * ((double) (i2 + 1)));
                                return 1;
                            } else if (4006 == i) {
                                hr.ar -= -1677802279;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                i4 = hr.as[(hr.ar * 537618701) + 2];
                                i5 = hr.as[(hr.ar * 537618701) + 3];
                                i6 = hr.as[(hr.ar * 537618701) + 4];
                                int[] iArr4 = hr.as;
                                int i7 = hr.ar - 1194553915;
                                hr.ar = i7;
                                iArr4[(i7 * 537618701) - 1] = i2 + (((i3 - i2) * (i6 - i4)) / (i5 - i4));
                                return 1;
                            } else if (4007 == i) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 + ((i3 * i2) / 100);
                                return 1;
                            } else if (i == 4008) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 | (1 << i3);
                                return 1;
                            } else if (4009 == i) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 & (-1 - (1 << i3));
                                return 1;
                            } else if (4010 == i) {
                                hr.ar -= 1905859466;
                                i3 = hr.as[hr.ar * 537618701];
                                i4 = hr.as[(hr.ar * 537618701) + 1];
                                int[] iArr5 = hr.as;
                                i6 = hr.ar - 1194553915;
                                hr.ar = i6;
                                i6 = (i6 * 537618701) - 1;
                                if ((i3 & (1 << i4)) != 0) {
                                    i2 = 1;
                                }
                                iArr5[i6] = i2;
                                return 1;
                            } else if (i == 4011) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 % i3;
                                return 1;
                            } else if (4012 == i) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                if (i2 == 0) {
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = (int) Math.pow((double) i2, (double) i3);
                                return 1;
                            } else if (4013 == i) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                if (i2 == 0) {
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = 0;
                                    return 1;
                                }
                                switch (i3) {
                                    case 0:
                                        iArr = hr.as;
                                        i3 = hr.ar - 1194553915;
                                        hr.ar = i3;
                                        iArr[(i3 * 537618701) - 1] = Integer.MAX_VALUE;
                                        return 1;
                                    case 1:
                                        iArr2 = hr.as;
                                        i4 = hr.ar - 1194553915;
                                        hr.ar = i4;
                                        iArr2[(i4 * 537618701) - 1] = i2;
                                        return 1;
                                    case 2:
                                        iArr2 = hr.as;
                                        i4 = hr.ar - 1194553915;
                                        hr.ar = i4;
                                        iArr2[(i4 * 537618701) - 1] = (int) Math.sqrt((double) i2);
                                        return 1;
                                    case 3:
                                        iArr2 = hr.as;
                                        i4 = hr.ar - 1194553915;
                                        hr.ar = i4;
                                        iArr2[(i4 * 537618701) - 1] = (int) Math.cbrt((double) i2);
                                        return 1;
                                    case 4:
                                        iArr2 = hr.as;
                                        i4 = hr.ar - 1194553915;
                                        hr.ar = i4;
                                        iArr2[(i4 * 537618701) - 1] = (int) Math.sqrt(Math.sqrt((double) i2));
                                        return 1;
                                    default:
                                        iArr3 = hr.as;
                                        i5 = hr.ar - 1194553915;
                                        hr.ar = i5;
                                        iArr3[(i5 * 537618701) - 1] = (int) Math.pow((double) i2, 1.0d / ((double) i3));
                                        return 1;
                                }
                            } else if (4014 == i) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 & i3;
                                return 1;
                            } else if (4015 == i) {
                                hr.ar -= 1905859466;
                                i2 = hr.as[hr.ar * 537618701];
                                i3 = hr.as[(hr.ar * 537618701) + 1];
                                iArr3 = hr.as;
                                i5 = hr.ar - 1194553915;
                                hr.ar = i5;
                                iArr3[(i5 * 537618701) - 1] = i2 | i3;
                                return 1;
                            } else if (4018 != i) {
                                return 2;
                            } else {
                                hr.ar -= 711305551;
                                long j = (long) hr.as[hr.ar * 537618701];
                                long j2 = (long) hr.as[(hr.ar * 537618701) + 1];
                                long j3 = (long) hr.as[(hr.ar * 537618701) + 2];
                                int[] iArr6 = hr.as;
                                int i8 = hr.ar - 1194553915;
                                hr.ar = i8;
                                iArr6[(i8 * 537618701) - 1] = (int) ((j * j3) / j2);
                                return 1;
                            }
                        } else if (i < 4200) {
                            return ah.ah(i, gkVar, z, -465028232);
                        } else {
                            if (i < 4300) {
                                return C0001do.ak(i, gkVar, z, -376846818);
                            }
                            if (i < 5100) {
                                return dq.ao(i, gkVar, z, 1227456561);
                            }
                            if (i < 5400) {
                                if (i == 5306) {
                                    iArr2 = hr.as;
                                    i2 = hr.ar - 1194553915;
                                    hr.ar = i2;
                                    i4 = (i2 * 537618701) - 1;
                                    if (client.ld) {
                                        i2 = 2;
                                    } else {
                                        i2 = 1;
                                    }
                                    iArr2[i4] = i2;
                                    return 1;
                                } else if (5307 == i) {
                                    iArr = hr.as;
                                    i3 = hr.ar - -1194553915;
                                    hr.ar = i3;
                                    i2 = iArr[i3 * 537618701];
                                    if (i2 != 1 && 2 != i2) {
                                        return 1;
                                    }
                                    client.ad.ck(i2, -1340608345);
                                    return 1;
                                } else if (i == 5308) {
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = 1775240613 * cs.oj.ag;
                                    return 1;
                                } else if (i != 5309) {
                                    return 2;
                                } else {
                                    iArr = hr.as;
                                    i3 = hr.ar - -1194553915;
                                    hr.ar = i3;
                                    i2 = iArr[i3 * 537618701];
                                    if (1 != i2 && 2 != i2) {
                                        return 1;
                                    }
                                    cs.oj.ag = i2 * 1983339053;
                                    co.aa(-958976715);
                                    return 1;
                                }
                            } else if (i < 5600) {
                                if (i == 5504) {
                                    hr.ar -= 1905859466;
                                    i2 = hr.as[hr.ar * 537618701];
                                    i3 = hr.as[(hr.ar * 537618701) + 1];
                                    if (client.nm) {
                                        return 1;
                                    }
                                    bm.bs(i2, i3, -2083594109);
                                    return 1;
                                } else if (i == 5505) {
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fz * 1679658745;
                                    return 1;
                                } else if (5506 == i) {
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fn * -198683079;
                                    return 1;
                                } else if (5530 == i) {
                                    iArr2 = hr.as;
                                    i4 = hr.ar - -1194553915;
                                    hr.ar = i4;
                                    i3 = iArr2[i4 * 537618701];
                                    if (i3 >= 0) {
                                        i2 = i3;
                                    }
                                    client.fw = i2 * -1089737365;
                                    return 1;
                                } else if (i != 5531) {
                                    return 2;
                                } else {
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.fw * -176892093;
                                    return 1;
                                }
                            } else if (i < 5700) {
                                if (5630 != i) {
                                    return 2;
                                }
                                client.dl = -1012553922;
                                return 1;
                            } else if (i < 6300) {
                                if (i == 6200) {
                                    hr.ar -= 1905859466;
                                    client.oh = (short) hr.as[hr.ar * 537618701];
                                    if (client.oh <= (short) 0) {
                                        client.oh = (short) 256;
                                    }
                                    client.oy = (short) hr.as[(hr.ar * 537618701) + 1];
                                    if (client.oy > (short) 0) {
                                        return 1;
                                    }
                                    client.oy = (short) 205;
                                    return 1;
                                } else if (i == 6201) {
                                    hr.ar -= 1905859466;
                                    client.oa = (short) hr.as[hr.ar * 537618701];
                                    if (client.oa <= (short) 0) {
                                        client.oa = (short) 256;
                                    }
                                    client.oi = (short) hr.as[(hr.ar * 537618701) + 1];
                                    if (client.oi > (short) 0) {
                                        return 1;
                                    }
                                    client.oi = (short) 320;
                                    return 1;
                                } else if (6202 == i) {
                                    hr.ar -= -483248364;
                                    client.ox = (short) hr.as[hr.ar * 537618701];
                                    if (client.ox <= (short) 0) {
                                        client.ox = (short) 1;
                                    }
                                    client.ov = (short) hr.as[(hr.ar * 537618701) + 1];
                                    if (client.ov <= (short) 0) {
                                        client.ov = Short.MAX_VALUE;
                                    } else if (client.ov < client.ox) {
                                        client.ov = client.ox;
                                    }
                                    client.of = (short) hr.as[(hr.ar * 537618701) + 2];
                                    if (client.of <= (short) 0) {
                                        client.of = (short) 1;
                                    }
                                    client.os = (short) hr.as[(hr.ar * 537618701) + 3];
                                    if (client.os <= (short) 0) {
                                        client.os = Short.MAX_VALUE;
                                        return 1;
                                    } else if (client.os >= client.of) {
                                        return 1;
                                    } else {
                                        client.os = client.of;
                                        return 1;
                                    }
                                } else if (i == 6203) {
                                    if (client.ju != null) {
                                        mf.cp(0, 0, client.ju.bf * 256177861, client.ju.bv * 57307023, false, -1848995880);
                                        iArr = hr.as;
                                        i3 = hr.ar - 1194553915;
                                        hr.ar = i3;
                                        iArr[(i3 * 537618701) - 1] = 2140963035 * client.oc;
                                        iArr = hr.as;
                                        i3 = hr.ar - 1194553915;
                                        hr.ar = i3;
                                        iArr[(i3 * 537618701) - 1] = client.ot * -1949120505;
                                        return 1;
                                    }
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = -1;
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = -1;
                                    return 1;
                                } else if (i == 6204) {
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oa;
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oi;
                                    return 1;
                                } else if (6205 != i) {
                                    return 2;
                                } else {
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oh;
                                    iArr = hr.as;
                                    i3 = hr.ar - 1194553915;
                                    hr.ar = i3;
                                    iArr[(i3 * 537618701) - 1] = client.oy;
                                    return 1;
                                }
                            } else if (i < 6600) {
                                return gu.ax(i, gkVar, z, 1475832629);
                            } else {
                                if (i < 6700) {
                                    return no.au(i, gkVar, z, -1759784152);
                                }
                                return 2;
                            }
                        }
                    }
                }
            }
        }
    }
}
