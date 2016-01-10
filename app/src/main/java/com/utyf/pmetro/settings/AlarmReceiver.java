package com.utyf.pmetro.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.utyf.pmetro.MapActivity;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Utyf on 07.01.2016.
 *
 */


public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context arg0, Intent arg1) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH mm ss");
        Toast.makeText(arg0, "I'm running "+sdf.format(new Date()), Toast.LENGTH_SHORT).show();
    }

    boolean checkLastUpdate(long chk) {
        File fl = new File (MapActivity.catalogDir + "/Files.xml");
        return fl.lastModified() < chk;
    }
}