
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getIonVersion(){
        String buildDate = SystemProperties.get("ro.ion.build_date","");
        String buildIon = SystemProperties.get("ro.ionizer","");
        String buildType = SystemProperties.get("ro.ion.build_type","unofficial")/*.toUpperCase()*/;
        return buildDate.equals("") ? "" : "ion-" + buildIon + "-" + buildDate + "-" + buildType;
    }
}
