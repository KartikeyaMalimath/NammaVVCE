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

public class mbaactivity extends AppCompatActivity {

    public TextView mba_recent1;
    public TextView mba_recent2;
    public TextView mba_recent3;
    public TextView mba_recent4;
    public Button mbafaculty;

    private Firebase mbarecent_ref1;
    private Firebase mbarecent_ref2;
    private Firebase mbarecent_ref3;
    private Firebase mbarecent_ref4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbaactivity);
        facultymba();
    }
    
    public void facultymba(){

        mbafaculty = (Button)findViewById(R.id.mbafaculty);
        mbafaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mbafaculty = new Intent(mbaactivity.this, mba_faculty.class);
                startActivity(mbafaculty);
            }
        });
        
        
        
        /* MBA backend DATABASE java created by Kartikeya Malimath on 19-11-2017*/

        mba_recent1 = (TextView)findViewById(R.id.mba_recent1);
        mba_recent1.setSelected(true);
        Firebase.setAndroidContext(this);
        mbarecent_ref1 = new Firebase("https://vvce-mysuru.firebaseio.com/mba_recent1");
        mbarecent_ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent1 = dataSnapshot.getValue(String.class);

                mba_recent1.setText(recent1);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mba_recent2 = (TextView)findViewById(R.id.mba_recent2);
        mba_recent2.setSelected(true);
        Firebase.setAndroidContext(this);
        mbarecent_ref2 = new Firebase("https://vvce-mysuru.firebaseio.com/mba_recent2");
        mbarecent_ref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent2 = dataSnapshot.getValue(String.class);

                mba_recent2.setText(recent2);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mba_recent3 = (TextView)findViewById(R.id.mba_recent3);
        mba_recent3.setSelected(true);
        Firebase.setAndroidContext(this);
        mbarecent_ref3 = new Firebase("https://vvce-mysuru.firebaseio.com/mba_recent3");
        mbarecent_ref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent3 = dataSnapshot.getValue(String.class);

                mba_recent3.setText(recent3);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mba_recent4 = (TextView)findViewById(R.id.mba_recent4);
        mba_recent4.setSelected(true);
        Firebase.setAndroidContext(this);
        mbarecent_ref4 = new Firebase("https://vvce-mysuru.firebaseio.com/mba_recent4");
        mbarecent_ref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String recent4 = dataSnapshot.getValue(String.class);

                mba_recent4.setText(recent4);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
