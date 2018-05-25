package p000;

import java.util.Calendar;
import java.util.TimeZone;

public class ie {
    public static final String[] ad = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static final String[][] af;
    public static Calendar an = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    public static final int ca = 105;

    static {
        r0 = new String[2][];
        r0[0] = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        r0[1] = new String[]{"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"};
        af = r0;
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
    }

    ie() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "ie.<init>(" + ')');
        }
    }

    public static au ad(int i, byte b) {
        try {
            au auVar = (au) au.an.af((long) i);
            if (auVar == null) {
                byte[] an = au.af.an(9, i, -1248680877);
                auVar = new au();
                auVar.ag = 1213021879 * i;
                if (an != null) {
                    auVar.aa(new ik(an), 1188651807);
                }
                auVar.an((byte) -118);
                au.an.an(auVar, (long) i);
            }
            return auVar;
        } catch (Throwable e) {
            throw ba.ad(e, "ie.ad(" + ')');
        }
    }
}
