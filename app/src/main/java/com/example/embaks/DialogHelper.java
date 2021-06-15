package com.example.embaks;

import android.app.AlertDialog;
import android.content.Context;
import android.view.ContextThemeWrapper;

public class DialogHelper {

    public static AlertDialog.Builder alertBuilder(Context context) {
        return new AlertDialog.Builder(new ContextThemeWrapper(context,
                R.style.ShowAlertDialogTheme));
    }
}
