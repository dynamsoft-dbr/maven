package com.dynamsoft.demo;

import com.dynamsoft.barcode.jni.BarcodeReader;
import com.dynamsoft.barcode.jni.TextResult;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    private static String OS = System.getProperty("os.name").toLowerCase();

    public static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isLinux() {
        return (OS.indexOf("nux") >= 0);
    }

    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        Path p = Paths.get(path, "../images", "test.jpg");
        System.out.println("image: " + p);
        System.out.println(OS);
        String license = null;
        if (isWindows()) {
            license = "t0068NQAAAGWe/zXkYmggvyFrd8PmfjplKakH67Upt9HvuRDIBAV6MZ4uODuL1ZUgSEAOygejsfwj6XRKI5iD1tLKZBRGo2c=";
        }
        else if(isLinux()) {
            license = "t0068NQAAAIY/7KegDlZn7YiPdAj0cbA11n2CwuCEWnk2KYla55ozdfmoasjRIpHhl0EUZmko/zxfxFLH3FpLw694uihoCVM=";
        }

        try {
            BarcodeReader reader = new BarcodeReader(license);
            TextResult[] results = reader.decodeFile(p.toString(), "");
            for (TextResult result : results) {
                System.out.println(result.barcodeText);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
