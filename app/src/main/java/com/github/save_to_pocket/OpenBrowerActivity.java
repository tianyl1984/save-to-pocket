package com.github.save_to_pocket;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;

import java.util.List;
import java.util.logging.Logger;

public class OpenBrowerActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri data = getIntent().getData();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
//        List<ResolveInfo> apps = getPackageManager().queryIntentActivities(intent, 0);
//        for (ResolveInfo app : apps) {
//            String pkg = app.activityInfo.packageName;
//            Logger.getLogger("apps").info(pkg);
//        }
        intent.putExtra(Intent.EXTRA_TEXT, data.toString());
        intent.setPackage("com.ideashower.readitlater.pro");
        startActivity(intent);
        finish();
    }

}
