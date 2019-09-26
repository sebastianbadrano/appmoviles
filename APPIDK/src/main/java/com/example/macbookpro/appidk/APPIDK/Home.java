package com.example.macbookpro.appidk.APPIDK;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class Home extends AppCompatActivity implements OnClickListener{

    private Button btnins, btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Set up the login form.

        btnins = (Button) findViewById(R.id.btnins);
        btnreg = (Button) findViewById(R.id.btnreg);
        btnins.setOnClickListener(this);
        btnreg.setOnClickListener(this);}

    @Override
    public void onClick(View v) {
        if(v.getId() == btnreg.getId()){
            Intent i = new Intent(this, registro.class);
            startActivity(i);

        }

        if(v.getId() == btnins.getId()){
            Intent i = new Intent(this, Perfil.class);
            startActivity(i);
        }



    }

}

