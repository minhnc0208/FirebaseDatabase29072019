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

import java.util.HashMap;

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

//        ArrayList<String> arrayNames = new ArrayList<>(Arrays.asList("Minh","Teo", "Ty", "Dan", "Meo"));
//        myRef.child("danhsachhocvien").setValue(arrayNames).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                } else {
//                    Log.d("BBB", task.getException().toString());
//                }
//            }
//        });

        //4: Object

//        myRef.child("trung tam").setValue(new Thongtin("38 nguyen lam, p6 q10", 01234567)).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                } else {
//                    Log.d("BBB", task.getException().toString());
//                }
//            }
//        });

//        ArrayList<String> arrayNames = new ArrayList<>(Arrays.asList("Minh", "Teo", "Ty", "Suu", "Meo"));
//        ArrayList<String> arrayNames1 = new ArrayList<>(Arrays.asList("Minh", "Teo", "Ty", "Suu", "Meo"));
//        for (String name : arrayNames) {
//            if (name.equals("Minh")) {
//                arrayNames.remove(name);
//                for (String name1 : arrayNames1) {
//                    arrayNames1.remove(name1);
//                }
//            }
//
//        }
//        Log.d("BBB", arrayNames.size() + "");


        // push hash map
//        Giangvien: Kietlpt
//
//        myRef.child("Giangvien").setValue("Le Pham Tuan Kiet").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                } else {
//                    Log.d("BBB", task.getException().toString());
//                }
//            }
//        });
//        ArrayList<String> arrayNames = new ArrayList<>(Arrays.asList("Minh", "Teo", "Ty", "Suu", "Meo"));
//        Iterator<String> stringIterator = arrayNames.iterator();
//        while (stringIterator.hasNext()){
//            while(stringIterator.hasNext()){
//                if(stringIterator.next().equals("Minh")){
//                    stringIterator.remove();
//
//                }
//            }
//        }
//        Log.d("BBB",arrayNames.size()+"");

        //5: Hash map
        // Cach nhan gia tri
//        myRef.child("Giangvien").setValue("Le Pham Tuan Kiet").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()) {
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                } else {
//                    Log.d("BBB", task.getException().toString());
//                }
//            }
//        });
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Android", "T2 t4 t6 time: 5h30 - 7h30");
        hashMap.put("IOS", "T3 t5 t7: 5h30 - 7h30");
        hashMap.put("React", "T7 CN time: 15h30 - 17h30");
        myRef.child("thoigian").setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
                } else {
                    Log.d("BBB", task.getException().toString());
                }
            }
        });
    }
}
