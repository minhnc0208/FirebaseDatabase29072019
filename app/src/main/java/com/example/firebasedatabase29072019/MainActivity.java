package com.example.firebasedatabase29072019;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    // Write a message to the database
    FirebaseDatabase mdatabase = FirebaseDatabase.getInstance();
    DatabaseReference myRef = mdatabase.getReference("message");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // node: cha => phai co 1 dua con

        // child: con => phai co key va value

        // gui du lieu kieu:

        //1: String

//        Giangvien : Pham Tan Phat.
//
//        myRef.child("Giangvien").setValue("Pham tan phat").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                } else {
//                    Log.d("BBB", task.getException().toString());
//                }
//            }
//        });
        //2: Int
//        myRef.child("khaigiang").setValue(Calendar.getInstance().getTimeInMillis()).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                } else {
//                    Log.d("BBB", task.getException().toString());
//                }
//            }
//        });

//        long currentTime = Calendar.getInstance().getTimeInMillis();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY");
//        Log.d("BBB",simpleDateFormat.format(currentTime));

        //3: ArrayList

//        danhsachhocvien:
//            + Teo
//            + Ty
//            + Dan
//            + Meo
    }
}
