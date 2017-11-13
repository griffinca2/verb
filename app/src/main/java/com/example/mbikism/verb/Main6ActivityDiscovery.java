package com.example.mbikism.verb;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main6ActivityDiscovery extends AppCompatActivity {
    private FirebaseAuth mAuth;
    FirebaseUser firebaseUser;


    //view objects
    private Button userProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        //addListenerOnLogOut();

        //initializing firebase authentication object
        mAuth = FirebaseAuth.getInstance();


        //initializing views
        userProfile = (Button) findViewById(R.id.buttonProfile);

        //if the user is not logged in
        //that means current user will return null
        if(mAuth.getCurrentUser() == null){
            //closing this activity
            finish();
            //starting login activity
            startActivity(new Intent(this, Main2ActivityLogin.class));

            // Showing toast message.
            Toast.makeText(Main6ActivityDiscovery.this, "Please Log in to continue", Toast.LENGTH_LONG).show();
        }

        //getting current user
        FirebaseUser user = mAuth.getCurrentUser();

        //adding listener to button
        // Adding click listener on logout button.
        userProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Finishing current User Profile activity.
                finish();

                // Redirect to Login Activity after click on logout button.
                Intent intent = new Intent(Main6ActivityDiscovery.this, Main3ActivityUserProf.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view) {
        //if logout is pressed
        if(view == userProfile){
            //closing activity
            finish();
            //starting login activity
            startActivity(new Intent(this, Main3ActivityUserProf.class));
        }

    }
}
