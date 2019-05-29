package com.example.asus.siformadiksi_rev;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;


public class ListAnggotaActivity extends AppCompatActivity {
    ArrayList<String> myArrayList = new ArrayList<>();
    ListView myListView;
    Firebase myFirebase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_anggota);
        Firebase.setAndroidContext(this);
        myFirebase = new Firebase("https://formadiksi3.firebaseio.com/");
        final ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myArrayList);
        myListView= (ListView) findViewById(R.id.ListView);

        myListView.setAdapter(myArrayAdapter);

        myFirebase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                String myChildValues = dataSnapshot.getValue(String.class);
                myArrayList.add(myChildValues);
                myArrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                myArrayAdapter.notifyDataSetChanged();


            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }
}
