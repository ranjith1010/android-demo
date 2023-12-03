package com.example.myapplication;

import static android.content.ContentValues.TAG;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    Button b,submit;
    private FirebaseAuth mAuth;
    private String verificationId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1 = new User("Ranjith","18693","Bengaluru","9080093100","B+");
        User user2 = new User("Sriprasath","18693","Bengaluru","9080093100","B+");
        User user3 = new User("Sriprasath","18693","Bengaluru","9080093100","B+");
        final ListView list = findViewById(R.id.list);
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user3);
        users.add(user3);
        users.add(user3);
        users.add(user3);

        RequestListViewAdapter customAdapter = new RequestListViewAdapter(this, users);
        list.setAdapter(customAdapter);


//        b = findViewById(R.id.filledButton);
//        b.setOnClickListener(v -> {
//            User user = new User("Ranjith","18693","Bengaluru","9080093100","B+");
//            FirebaseDatabase db = FirebaseDatabase.getInstance();
//            DatabaseReference userdb = db.getReference("users");
//            String uid = userdb.push().getKey();
//
//            userdb.child(uid).setValue(user).addOnCompleteListener(task -> {
//                if(task.isSuccessful()){
//                    Toast.makeText(MainActivity.this,"DETAILS ADDED",Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(MainActivity.this,"NOT ADDED",Toast.LENGTH_LONG).show();
//                }
//            });
//        });
//
//        LinearLayout requestBlood = findViewById(R.id.request);
//        LinearLayout viewRequests = findViewById(R.id.viewRequests);
//
//        requestBlood.setOnClickListener(v -> {
//            Animation anim = AnimationUtils.loadAnimation(this, R.anim.fadein);
//            requestBlood.startAnimation(anim);
//            Handler handler = new Handler();
//            handler.postDelayed(() -> Toast.makeText(MainActivity.this,"Request Blood",Toast.LENGTH_LONG).show(), 200);
//        });
//
//        viewRequests.setOnClickListener(v -> {
//            Animation anim = AnimationUtils.loadAnimation(this, R.anim.fadein);
//            viewRequests.startAnimation(anim);
//            Handler handler = new Handler();
//            handler.postDelayed(() -> Toast.makeText(MainActivity.this,"View Requests",Toast.LENGTH_LONG).show(), 200);
//        });

    }

}