package wisemensolutions.nammavvce;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/*Created by Kartikeya Malimath on 26-01-2018.*/

public class NammaVVCE extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
            if(database!= null){
                database.setPersistenceEnabled(true);
                database.getReference().keepSynced(true);
            }
    }
}
