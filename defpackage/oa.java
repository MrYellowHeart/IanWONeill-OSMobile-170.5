package p000;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class oa {
    public static File aa = null;
    public static final int ad = 1048576;
    public static kj af = new kj();
    public static final int an = 12;

    oa() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "oa.<init>(" + ')');
        }
    }

    public static void aa(ia iaVar) {
        oy oyVar = (oy) af.ag();
        if (oyVar != null) {
            int i = iaVar.ad * 1978945739;
            iaVar.ay(-1972136341 * oyVar.af, (short) 128);
            for (int i2 = 0; i2 < 1263472394 * oyVar.ad; i2++) {
                if (oyVar.aa[i2] != 0) {
                    iaVar.an(oyVar.aa[i2], (byte) 31);
                } else {
                    try {
                        int i3 = oyVar.an[i2];
                        int i4;
                        if (i3 == 0) {
                            i4 = oyVar.ag[i2].getInt(null);
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i4, (short) 128);
                        } else if (1 == i3) {
                            oyVar.ag[i2].setInt(null, oyVar.ay[i2]);
                            iaVar.an(0, (byte) 31);
                        } else if (i3 == 2) {
                            i4 = oyVar.ag[i2].getModifiers();
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i4, (short) 128);
                        }
                        if (i3 == 3) {
                            Method method = oyVar.as[i2];
                            byte[][] bArr = oyVar.ar[i2];
                            Object[] objArr = new Object[bArr.length];
                            for (i3 = 0; i3 < bArr.length; i3++) {
                                objArr[i3] = new ObjectInputStream(new ByteArrayInputStream(bArr[i3])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                iaVar.an(0, (byte) 31);
                            } else if (invoke instanceof Number) {
                                iaVar.an(1, (byte) 31);
                                iaVar.ar(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                iaVar.an(2, (byte) 31);
                                iaVar.aq((String) invoke, (byte) -94);
                            } else {
                                iaVar.an(4, (byte) 31);
                            }
                        } else if (4 == i3) {
                            i3 = oyVar.as[i2].getModifiers();
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i3, (short) 128);
                        }
                    } catch (ClassNotFoundException e) {
                        iaVar.an(1859546234, (byte) 31);
                    } catch (InvalidClassException e2) {
                        iaVar.an(-11, (byte) 31);
                    } catch (StreamCorruptedException e3) {
                        iaVar.an(-12, (byte) 31);
                    } catch (OptionalDataException e4) {
                        iaVar.an(-13, (byte) 31);
                    } catch (IllegalAccessException e5) {
                        iaVar.an(-818049973, (byte) 31);
                    } catch (IllegalArgumentException e6) {
                        iaVar.an(1112675739, (byte) 31);
                    } catch (InvocationTargetException e7) {
                        iaVar.an(1372264350, (byte) 31);
                    } catch (SecurityException e8) {
                        iaVar.an(-17, (byte) 31);
                    } catch (IOException e9) {
                        iaVar.an(-18, (byte) 31);
                    } catch (NullPointerException e10) {
                        iaVar.an(-19, (byte) 31);
                    } catch (Exception e11) {
                        iaVar.an(-20, (byte) 31);
                    } catch (Throwable th) {
                        iaVar.an(-21, (byte) 31);
                    }
                }
            }
            iaVar.ba(i, 1664578769);
            oyVar.ki();
        }
    }

    public static void ag(ia iaVar) {
        oy oyVar = (oy) af.ag();
        if (oyVar != null) {
            int i = iaVar.ad * 1978945739;
            iaVar.ay(1680917494 * oyVar.af, (short) 128);
            for (int i2 = 0; i2 < -2015133847 * oyVar.ad; i2++) {
                if (oyVar.aa[i2] != 0) {
                    iaVar.an(oyVar.aa[i2], (byte) 31);
                } else {
                    try {
                        int i3 = oyVar.an[i2];
                        int i4;
                        if (i3 == 0) {
                            i4 = oyVar.ag[i2].getInt(null);
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i4, (short) 128);
                        } else if (1 == i3) {
                            oyVar.ag[i2].setInt(null, oyVar.ay[i2]);
                            iaVar.an(0, (byte) 31);
                        } else if (i3 == 2) {
                            i4 = oyVar.ag[i2].getModifiers();
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i4, (short) 128);
                        }
                        if (i3 == 3) {
                            Method method = oyVar.as[i2];
                            byte[][] bArr = oyVar.ar[i2];
                            Object[] objArr = new Object[bArr.length];
                            for (i3 = 0; i3 < bArr.length; i3++) {
                                objArr[i3] = new ObjectInputStream(new ByteArrayInputStream(bArr[i3])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                iaVar.an(0, (byte) 31);
                            } else if (invoke instanceof Number) {
                                iaVar.an(1, (byte) 31);
                                iaVar.ar(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                iaVar.an(2, (byte) 31);
                                iaVar.aq((String) invoke, (byte) -121);
                            } else {
                                iaVar.an(4, (byte) 31);
                            }
                        } else if (4 == i3) {
                            i3 = oyVar.as[i2].getModifiers();
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i3, (short) 128);
                        }
                    } catch (ClassNotFoundException e) {
                        iaVar.an(1506994921, (byte) 31);
                    } catch (InvalidClassException e2) {
                        iaVar.an(1974445110, (byte) 31);
                    } catch (StreamCorruptedException e3) {
                        iaVar.an(-12, (byte) 31);
                    } catch (OptionalDataException e4) {
                        iaVar.an(-128102345, (byte) 31);
                    } catch (IllegalAccessException e5) {
                        iaVar.an(-14, (byte) 31);
                    } catch (IllegalArgumentException e6) {
                        iaVar.an(384789438, (byte) 31);
                    } catch (InvocationTargetException e7) {
                        iaVar.an(1152467491, (byte) 31);
                    } catch (SecurityException e8) {
                        iaVar.an(-17, (byte) 31);
                    } catch (IOException e9) {
                        iaVar.an(-1442078509, (byte) 31);
                    } catch (NullPointerException e10) {
                        iaVar.an(-19, (byte) 31);
                    } catch (Exception e11) {
                        iaVar.an(-1479651709, (byte) 31);
                    } catch (Throwable th) {
                        iaVar.an(-1452717049, (byte) 31);
                    }
                }
            }
            iaVar.ba(i, 1664578769);
            oyVar.ki();
        }
    }

    public static void ay(ia iaVar) {
        oy oyVar = (oy) af.ag();
        if (oyVar != null) {
            int i = iaVar.ad * 1978945739;
            iaVar.ay(1387380254 * oyVar.af, (short) 128);
            for (int i2 = 0; i2 < -2015133847 * oyVar.ad; i2++) {
                if (oyVar.aa[i2] != 0) {
                    iaVar.an(oyVar.aa[i2], (byte) 31);
                } else {
                    try {
                        int i3 = oyVar.an[i2];
                        int i4;
                        if (i3 == 0) {
                            i4 = oyVar.ag[i2].getInt(null);
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i4, (short) 128);
                        } else if (1 == i3) {
                            oyVar.ag[i2].setInt(null, oyVar.ay[i2]);
                            iaVar.an(0, (byte) 31);
                        } else if (i3 == 2) {
                            i4 = oyVar.ag[i2].getModifiers();
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i4, (short) 128);
                        }
                        if (i3 == 3) {
                            Method method = oyVar.as[i2];
                            byte[][] bArr = oyVar.ar[i2];
                            Object[] objArr = new Object[bArr.length];
                            for (i3 = 0; i3 < bArr.length; i3++) {
                                objArr[i3] = new ObjectInputStream(new ByteArrayInputStream(bArr[i3])).readObject();
                            }
                            Object invoke = method.invoke(null, objArr);
                            if (invoke == null) {
                                iaVar.an(0, (byte) 31);
                            } else if (invoke instanceof Number) {
                                iaVar.an(1, (byte) 31);
                                iaVar.ar(((Number) invoke).longValue());
                            } else if (invoke instanceof String) {
                                iaVar.an(2, (byte) 31);
                                iaVar.aq((String) invoke, (byte) -47);
                            } else {
                                iaVar.an(4, (byte) 31);
                            }
                        } else if (4 == i3) {
                            i3 = oyVar.as[i2].getModifiers();
                            iaVar.an(0, (byte) 31);
                            iaVar.ay(i3, (short) 128);
                        }
                    } catch (ClassNotFoundException e) {
                        iaVar.an(777103415, (byte) 31);
                    } catch (InvalidClassException e2) {
                        iaVar.an(1538030041, (byte) 31);
                    } catch (StreamCorruptedException e3) {
                        iaVar.an(-12, (byte) 31);
                    } catch (OptionalDataException e4) {
                        iaVar.an(1239347387, (byte) 31);
                    } catch (IllegalAccessException e5) {
                        iaVar.an(1211029316, (byte) 31);
                    } catch (IllegalArgumentException e6) {
                        iaVar.an(-15, (byte) 31);
                    } catch (InvocationTargetException e7) {
                        iaVar.an(-16, (byte) 31);
                    } catch (SecurityException e8) {
                        iaVar.an(623575608, (byte) 31);
                    } catch (IOException e9) {
                        iaVar.an(-18, (byte) 31);
                    } catch (NullPointerException e10) {
                        iaVar.an(1124833560, (byte) 31);
                    } catch (Exception e11) {
                        iaVar.an(556778998, (byte) 31);
                    } catch (Throwable th) {
                        iaVar.an(-1855081790, (byte) 31);
                    }
                }
            }
            iaVar.ba(i, 1664578769);
            oyVar.ki();
        }
    }

    public static void ar(ik ikVar, int i) {
        kd oyVar = new oy();
        oyVar.ad = ikVar.ao((byte) 0) * 1925251289;
        oyVar.af = ikVar.al(1903263718) * -608999869;
        oyVar.an = new int[(oyVar.ad * -2015133847)];
        oyVar.aa = new int[(-2015133847 * oyVar.ad)];
        oyVar.ag = new Field[(oyVar.ad * -2015133847)];
        oyVar.ay = new int[(oyVar.ad * -2015133847)];
        oyVar.as = new Method[(oyVar.ad * -2015133847)];
        oyVar.ar = new byte[(-2015133847 * oyVar.ad)][][];
        int i2 = 0;
        while (i2 < oyVar.ad * -2015133847) {
            try {
                int ao = ikVar.ao((byte) 0);
                String bc;
                String bc2;
                int i3;
                if (ao == 0 || 1 == ao || ao == 2) {
                    bc = ikVar.bc(2036861044);
                    bc2 = ikVar.bc(311816720);
                    i3 = 0;
                    if (ao == 1) {
                        i3 = ikVar.al(1452059900);
                    }
                    oyVar.an[i2] = ao;
                    oyVar.ay[i2] = i3;
                    if (el.an(bc, -2003950482).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    oyVar.ag[i2] = el.an(bc, -2030477842).getDeclaredField(bc2);
                    i2++;
                } else if (ao == 3 || ao == 4) {
                    bc = ikVar.bc(1613904050);
                    bc2 = ikVar.bc(839948548);
                    int ao2 = ikVar.ao((byte) 0);
                    String[] strArr = new String[ao2];
                    for (i3 = 0; i3 < ao2; i3++) {
                        strArr[i3] = ikVar.bc(1117037126);
                    }
                    String bc3 = ikVar.bc(1409907989);
                    byte[][] bArr = new byte[ao2][];
                    if (ao == 3) {
                        for (i3 = 0; i3 < ao2; i3++) {
                            int al = ikVar.al(-1034885014);
                            bArr[i3] = new byte[al];
                            ikVar.bg(bArr[i3], 0, al, 2123214925);
                        }
                    }
                    oyVar.an[i2] = ao;
                    Class[] clsArr = new Class[ao2];
                    for (i3 = 0; i3 < ao2; i3++) {
                        clsArr[i3] = el.an(strArr[i3], -1483709627);
                    }
                    Class an = el.an(bc3, -408170488);
                    if (el.an(bc, -874453413).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] declaredMethods = el.an(bc, -1481816192).getDeclaredMethods();
                    for (Method method : declaredMethods) {
                        if (method.getName().equals(bc2)) {
                            Class[] parameterTypes = method.getParameterTypes();
                            if (clsArr.length == parameterTypes.length) {
                                Object obj = 1;
                                for (ao = 0; ao < clsArr.length; ao++) {
                                    if (parameterTypes[ao] != clsArr[ao]) {
                                        obj = null;
                                        break;
                                    }
                                }
                                if (obj != null && an == method.getReturnType()) {
                                    oyVar.as[i2] = method;
                                }
                            }
                        }
                    }
                    oyVar.ar[i2] = bArr;
                    i2++;
                } else {
                    i2++;
                }
            } catch (ClassNotFoundException e) {
                oyVar.aa[i2] = -1;
            } catch (SecurityException e2) {
                oyVar.aa[i2] = -2;
            } catch (NullPointerException e3) {
                oyVar.aa[i2] = -3;
            } catch (Exception e4) {
                oyVar.aa[i2] = -4;
            } catch (Throwable th) {
                oyVar.aa[i2] = -5;
            }
        }
        af.ad(oyVar);
    }

    public static void as(ik ikVar, int i) {
        kd oyVar = new oy();
        oyVar.ad = ikVar.ao((byte) 0) * 1925251289;
        oyVar.af = ikVar.al(968459052) * -608999869;
        oyVar.an = new int[(oyVar.ad * -2015133847)];
        oyVar.aa = new int[(-2015133847 * oyVar.ad)];
        oyVar.ag = new Field[(oyVar.ad * 1822165925)];
        oyVar.ay = new int[(oyVar.ad * -2015133847)];
        oyVar.as = new Method[(oyVar.ad * -2015133847)];
        oyVar.ar = new byte[(-2015133847 * oyVar.ad)][][];
        int i2 = 0;
        while (i2 < oyVar.ad * -2015133847) {
            try {
                int ao = ikVar.ao((byte) 0);
                String bc;
                String bc2;
                int i3;
                if (ao == 0 || 1 == ao || ao == 2) {
                    bc = ikVar.bc(1216482703);
                    bc2 = ikVar.bc(1378898547);
                    i3 = 0;
                    if (ao == 1) {
                        i3 = ikVar.al(1427831453);
                    }
                    oyVar.an[i2] = ao;
                    oyVar.ay[i2] = i3;
                    if (el.an(bc, -827228975).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    oyVar.ag[i2] = el.an(bc, -1669082429).getDeclaredField(bc2);
                    i2++;
                } else if (ao == 3 || ao == 4) {
                    bc = ikVar.bc(1684602997);
                    bc2 = ikVar.bc(701430783);
                    int ao2 = ikVar.ao((byte) 0);
                    String[] strArr = new String[ao2];
                    for (i3 = 0; i3 < ao2; i3++) {
                        strArr[i3] = ikVar.bc(1458366320);
                    }
                    String bc3 = ikVar.bc(1503063587);
                    byte[][] bArr = new byte[ao2][];
                    if (ao == 3) {
                        for (i3 = 0; i3 < ao2; i3++) {
                            int al = ikVar.al(-416057610);
                            bArr[i3] = new byte[al];
                            ikVar.bg(bArr[i3], 0, al, -568680442);
                        }
                    }
                    oyVar.an[i2] = ao;
                    Class[] clsArr = new Class[ao2];
                    for (i3 = 0; i3 < ao2; i3++) {
                        clsArr[i3] = el.an(strArr[i3], -1185142638);
                    }
                    Class an = el.an(bc3, -2093639562);
                    if (el.an(bc, -1844382210).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] declaredMethods = el.an(bc, -1441801215).getDeclaredMethods();
                    for (Method method : declaredMethods) {
                        if (method.getName().equals(bc2)) {
                            Class[] parameterTypes = method.getParameterTypes();
                            if (clsArr.length == parameterTypes.length) {
                                Object obj = 1;
                                for (ao = 0; ao < clsArr.length; ao++) {
                                    if (parameterTypes[ao] != clsArr[ao]) {
                                        obj = null;
                                        break;
                                    }
                                }
                                if (obj != null && an == method.getReturnType()) {
                                    oyVar.as[i2] = method;
                                }
                            }
                        }
                    }
                    oyVar.ar[i2] = bArr;
                    i2++;
                } else {
                    i2++;
                }
            } catch (ClassNotFoundException e) {
                oyVar.aa[i2] = -1;
            } catch (SecurityException e2) {
                oyVar.aa[i2] = 1860812179;
            } catch (NullPointerException e3) {
                oyVar.aa[i2] = -1337780452;
            } catch (Exception e4) {
                oyVar.aa[i2] = -4;
            } catch (Throwable th) {
                oyVar.aa[i2] = 1348175431;
            }
        }
        af.ad(oyVar);
    }

    static Class ae(String str) throws ClassNotFoundException {
        if (str.equals("B")) {
            return Byte.TYPE;
        }
        if (str.equals("I")) {
            return Integer.TYPE;
        }
        if (str.equals("S")) {
            return Short.TYPE;
        }
        if (str.equals("J")) {
            return Long.TYPE;
        }
        if (str.equals("Z")) {
            return Boolean.TYPE;
        }
        if (str.equals("F")) {
            return Float.TYPE;
        }
        if (str.equals("D")) {
            return Double.TYPE;
        }
        if (str.equals("C")) {
            return Character.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return Class.forName(str);
    }

    static Class aj(String str) throws ClassNotFoundException {
        if (str.equals("B")) {
            return Byte.TYPE;
        }
        if (str.equals("I")) {
            return Integer.TYPE;
        }
        if (str.equals("S")) {
            return Short.TYPE;
        }
        if (str.equals("J")) {
            return Long.TYPE;
        }
        if (str.equals("Z")) {
            return Boolean.TYPE;
        }
        if (str.equals("F")) {
            return Float.TYPE;
        }
        if (str.equals("D")) {
            return Double.TYPE;
        }
        if (str.equals("C")) {
            return Character.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return Class.forName(str);
    }

    static Class aq(String str) throws ClassNotFoundException {
        if (str.equals("B")) {
            return Byte.TYPE;
        }
        if (str.equals("I")) {
            return Integer.TYPE;
        }
        if (str.equals("S")) {
            return Short.TYPE;
        }
        if (str.equals("J")) {
            return Long.TYPE;
        }
        if (str.equals("Z")) {
            return Boolean.TYPE;
        }
        if (str.equals("F")) {
            return Float.TYPE;
        }
        if (str.equals("D")) {
            return Double.TYPE;
        }
        if (str.equals("C")) {
            return Character.TYPE;
        }
        return str.equals("void") ? Void.TYPE : Class.forName(str);
    }
}
