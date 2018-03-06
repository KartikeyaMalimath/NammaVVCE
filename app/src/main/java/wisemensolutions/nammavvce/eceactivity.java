package wisemensolutions.nammavvce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class eceactivity extends AppCompatActivity {

    public Button ecefaculty;
    public TextView ece_recent1;
    public TextView ece_recent2;
    public TextView ece_recent3;
    public TextView ece_recent4;

    private Firebase ecerecent_ref1;
    private Firebase ecerecent_ref2;
    private Firebase ecerecent_ref3;
    private Firebase ecerecent_ref4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eceactivity);
        facultyece();
    }

    public void facultyece(){
        ecefaculty = (Button)findViewById(R.id.ecefaculty);
        ecefaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ecefaculty = new Intent(eceactivity.this, ece_faculty.class);
                startActivity(ecefaculty);
            }
        });
        
        
        
        /* Ece backend DATABASE java created by Kartikeya Malimath on 17-11-2017*/

        ece_recent1 = (TextView)findViewById(R.id.ece_recent1);
        ece_recent1.setSelected(true);
        Firebase.setAndroidContext(this);
        ecerecent_ref1 = new Firebase("https://vvce-mysuru.firebaseio.com/ece_recent1");
        ecerecent_ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent1 = dataSnapshot.getValue(String.class);

                ece_recent1.setText(recent1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        ece_recent2 = (TextView)findViewById(R.id.ece_recent2);
        ece_recent2.setSelected(true);
        Firebase.setAndroidContext(this);
        ecerecent_ref2 = new Firebase("https://vvce-mysuru.firebaseio.com/ece_recent2");
        ecerecent_ref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent2 = dataSnapshot.getValue(String.class);

                ece_recent2.setText(recent2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        ece_recent3 = (TextView)findViewById(R.id.ece_recent3);
        ece_recent3.setSelected(true);
        Firebase.setAndroidContext(this);
        ecerecent_ref3 = new Firebase("https://vvce-mysuru.firebaseio.com/ece_recent3");
        ecerecent_ref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent3 = dataSnapshot.getValue(String.class);

                ece_recent3.setText(recent3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        ece_recent4 = (TextView)findViewById(R.id.ece_recent4);
        ece_recent4.setSelected(true);
        Firebase.setAndroidContext(this);
        ecerecent_ref4 = new Firebase("https://vvce-mysuru.firebaseio.com/ece_recent4");
        ecerecent_ref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent4 = dataSnapshot.getValue(String.class);

                ece_recent4.setText(recent4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
