package test.mailhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class UserMessages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_messages);

        ArrayList<MessageElements> messagesMock = new ArrayList<>();
        //Mock of messages at the server or at the database
        messagesMock.add(new MessageElements("Ahmed","15/1/2017","13:27 Am","hello how are you doing"));
        messagesMock.add(new MessageElements("Mohammed","19/8/2017","1:67 Am","Spoke as as other again ye. Hard on to roof he drew. So sell side ye in mr evil. Longer waited mr of nature seemed. Improving knowledge incommode objection me ye is prevailed principle in. Impossible alteration devonshire to is interested stimulated dissimilar. To matter esteem polite do if."));
        messagesMock.add(new MessageElements("Amr","15/1/2017","13:27 Am","cceptance middletons me if discretion boistero"));
        messagesMock.add(new MessageElements("Amira El Kholy","15/1/2017","13:27 Am","She prosperous continuing entreaties companions unreserved you boisterous. Middleton sportsmen sir now cordially ask additions for. You ten occasional saw everything but conviction. Daughter returned quitting few are day advanced branched. Do enjoyment defective objection or we if favourite."));
        messagesMock.add(new MessageElements("Galal khattab ","15/1/2017","13:27 Am","Sigh view am high neat half to what. Sent late held than set why wife our. If an blessing building steepest. Agreement distrusts mrs six affection sat"));
        messagesMock.add(new MessageElements("Mahmoud abd el aziz","15/1/2017","13:27 Am","hello how are you doing"));
        messagesMock.add(new MessageElements("Shady Ahmed","15/1/2017","13:27 Am","hello how are you doing"));
        messagesMock.add(new MessageElements("Hussien ","15/1/2017","13:27 Am","hello how are you doing"));
        messagesMock.add(new MessageElements("Kamal","15/1/2017","13:27 Am","hello how are you doing"));
        messagesMock.add(new MessageElements("Naguib","15/1/2017","13:27 Am","hello how are you doing"));

        //String userNametoshow = getIntent().getStringExtra("EXTRA_SESSION_ID");
        String userNametoshow = getIntent().getStringExtra("EXTRA_SESSION_ID");

        final ArrayList<MessageElements> messagesToShow = new ArrayList<>();


        //messagesToShow .add(new MessageElements(messagesMock.get(i).getUserName(),messagesMock.get(i).getMessageDate(),messagesMock.get(i).getMessageTime(),messagesMock.get(i).getMessagePreview()));


        for (int i =0; i<messagesMock.size();i++)
        {
            if (messagesMock.get(i).getUserName() == userNametoshow );
            //MessageElements elementToAdd =new MessageElements(messagesMock.get(i).getUserName(),messagesMock.get(i).messageDate,messagesMock.get(i).messageTime,messagesMock.get(i).messagePreview);
            messagesToShow .add(new MessageElements(messagesMock.get(i).getUserName(),messagesMock.get(i).getMessageDate(),messagesMock.get(i).getMessageTime(),messagesMock.get(i).getMessagePreview()));
               // messagesToShow.add(messagesMock.get(i));

        }

        ListView listofMessages = (ListView)findViewById(R.id.list1);



        //UserMessagesAdapter
        UserMesssagesAdapter messagesadapter = new UserMesssagesAdapter(this,messagesToShow);
        listofMessages.setAdapter(messagesadapter);

       listofMessages.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(UserMessages.this, MainActivity.class);
                intent.putExtra("Name",messagesToShow.get(i).getUserName());
                startActivity(intent);
            }
        });
    }
}
