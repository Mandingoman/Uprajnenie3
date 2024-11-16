package com.example.app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity {
    protected void onCreate(Bundle SavedInstance) {
        super.onCreate(SavedInstance);
        setContentView(R.layout.layout);
    }


        public void launchActivity(View view) {

            Intent activitylauncher = new Intent(Intent.ACTION_VIEW);
            activitylauncher.addCategory("android.intent.category.DEFAULT");
            startActivity(activitylauncher);
        }
    }





