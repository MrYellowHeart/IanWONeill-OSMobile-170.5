package p000;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class lz {
    public static File ad = null;
    public static boolean af = false;
    static Hashtable an = new Hashtable(16);
    public static final int dj = 106;

    lz() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ba.ad(e, "lz.<init>(" + ')');
        }
    }

    public static File aa(String str) {
        RandomAccessFile randomAccessFile;
        if (af) {
            File file = (File) an.get(str);
            if (file == null) {
                file = new File(ad, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, cw.an);
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            an.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception e2) {
                                }
                            }
                            throw new RuntimeException();
                        }
                    }
                    throw new RuntimeException("");
                } catch (Exception e3) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }

    public static File ad(String str) {
        RandomAccessFile randomAccessFile;
        if (af) {
            File file = (File) an.get(str);
            if (file == null) {
                file = new File(ad, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, cw.an);
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            an.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception e2) {
                                }
                            }
                            throw new RuntimeException();
                        }
                    }
                    throw new RuntimeException("");
                } catch (Exception e3) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }

    public static File an(String str) {
        RandomAccessFile randomAccessFile;
        if (af) {
            File file = (File) an.get(str);
            if (file == null) {
                file = new File(ad, str);
                try {
                    if (new File(file.getParent()).exists()) {
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, cw.an);
                        try {
                            int read = randomAccessFile2.read();
                            randomAccessFile2.seek(0);
                            randomAccessFile2.write(read);
                            randomAccessFile2.seek(0);
                            randomAccessFile2.close();
                            an.put(str, file);
                        } catch (Exception e) {
                            randomAccessFile = randomAccessFile2;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception e2) {
                                }
                            }
                            throw new RuntimeException();
                        }
                    }
                    throw new RuntimeException("");
                } catch (Exception e3) {
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw new RuntimeException();
                }
            }
            return file;
        }
        throw new RuntimeException("");
    }
}
