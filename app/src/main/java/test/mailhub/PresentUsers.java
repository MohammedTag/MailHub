package test.mailhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PresentUsers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_users);


        final ArrayList<String> presentUsersList = new ArrayList<>();
        presentUsersList.add("Ahmed");
        presentUsersList.add("Mohamed");
        presentUsersList.add("Amr");
        presentUsersList.add("Amira El Kholy");
        presentUsersList.add("Galal khattab");
        presentUsersList.add("Mahmoud abd el aziz");
        presentUsersList.add("Shady Ahmed");
        presentUsersList.add("Hussien");
        presentUsersList.add("Kamal");

        ListView presentusers = (ListView) findViewById(R.id.list2);
        PresentUsersAdapter presentUsersAdapter = new PresentUsersAdapter(this,presentUsersList);

        presentusers.setAdapter(presentUsersAdapter);

        presentusers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String userName = presentUsersList.get(i);
                /*Intent intent = new Intent(PresentUsers.this, UserMessages.class);
                startActivity(intent);*/
                Intent intent = new Intent(getBaseContext(), UserMessages.class);
                intent.putExtra("EXTRA_SESSION_ID",userName.toString());
                //intent.putExtra("EXTRA_SESSION_ID", userName);
                startActivity(intent);
            }
        });
    }
}
