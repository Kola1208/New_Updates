package com.b.tech_maretial.new_updates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    CardView about_us,management,adimission,campus,labs,jobs,exam,syllabus,associaton,notification,contact,location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about_us=findViewById(R.id.about_us);
        management=findViewById(R.id.management);
        adimission=findViewById(R.id.addmission);
        campus=findViewById(R.id.campus);
        labs=findViewById(R.id.labs);
        jobs=findViewById(R.id.placement);
        exam=findViewById(R.id.exam);
        syllabus=findViewById(R.id.syllabus);
        associaton=findViewById(R.id.assocition);
        notification=findViewById(R.id.notification);
        contact=findViewById(R.id.contact);
        location=findViewById(R.id.location);
    }
    @SuppressLint("ResourceType")
    public void next(View view){
        String url = null;
        switch (view.getId()){
            case R.id.about_us:
                 url="https://www.audisankara.ac.in/aboutus.html";
                break;

            case R.id.addmission:
                 url="https://www.audisankara.ac.in/ap.html";
                break;
            case R.id.management:
                url="https://www.audisankara.ac.in/manaa.html";
                break;
            case R.id.campus:
                 url="https://www.audisankara.ac.in/builds.html";
                break;
            case R.id.labs:
                 url="https://www.audisankara.ac.in/labsf.html";
                break;
            case R.id.placement:
                 url="https://www.audisankara.ac.in/place.html";
                break;
            case R.id.exam:
                url="https://audisankaraexams.in/SANK/";
                break;
            case R.id.syllabus:
                url="https://www.audisankara.ac.in/alms/index.html";
                break;
            case R.id.assocition:
                url="";
                break;
            case R.id.notification:
                url="http://202.53.75.140/exam/nf.html";
                break;
            case R.id.location:
                url="https://www.google.com/maps/place/Audisankara+College+of+Engineering+%26+Technology(Autonomous),+Gudur+-+Nellore./@14.167349,79.860446,17z/data=!4m6!3m5!1s0x3a4ce3ec9e912349:0x5c5d6f2fb3127ae5!8m2!3d14.1668913!4d79.8601375!16s%2Fm%2F0j45c02?hl=en";
                break;
            case R.id.contact:
                url="https://www.audisankara.ac.in/contactus.html";
                break;
        }
        Intent intent=new Intent(MainActivity.this,webView.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }

}