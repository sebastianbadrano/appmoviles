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


public class Perfil extends AppCompatActivity implements OnClickListener {

    private Button btncerrar, btniniciar, btneditperfil, btningresardir, btneditdir, btninvamigos, btnperfil, btnamigos, btngrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        AlertDialog.Builder alerta = new AlertDialog.Builder(Perfil.this);
        alerta.setMessage("Se ha iniciado sesion correctamente");
        alerta.setTitle("Sesion iniciada");

        alerta.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                closeContextMenu();
            }

        });
        AlertDialog alertdialog=alerta.create();
        alertdialog.show();

        btncerrar = (Button) findViewById(R.id.btncerrar);
        btniniciar = (Button) findViewById(R.id.btniniciar);
        btneditperfil = (Button) findViewById(R.id.btneditperfil);
        btningresardir = (Button) findViewById(R.id.btningresardir);
        btneditdir = (Button) findViewById(R.id.btneditdir);
        btninvamigos = (Button) findViewById(R.id.btninvamigos);
        btnperfil = (Button) findViewById(R.id.btnperfil);
        btnamigos = (Button) findViewById(R.id.btnamigos);
        btngrupo = (Button) findViewById(R.id.btngrupo);

        btncerrar.setOnClickListener(this);
        btniniciar.setOnClickListener(this);
        btneditperfil.setOnClickListener(this);
        btningresardir.setOnClickListener(this);
        btneditdir.setOnClickListener(this);
        btninvamigos.setOnClickListener(this);
        btnperfil.setOnClickListener(this);
        btnamigos.setOnClickListener(this);
        btngrupo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btncerrar.getId()) {
            Intent i = new Intent(this, Home.class);
            startActivity(i);
            finish();
        }
    }
    public void alertaInicio (){

    }
}
