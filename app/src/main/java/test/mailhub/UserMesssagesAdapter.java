package test.mailhub;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by moshw on 12/7/2017.
 */

public class UserMesssagesAdapter extends ArrayAdapter<MessageElements> {

    public UserMesssagesAdapter(@NonNull Context context , @NonNull List<MessageElements> objects) {
        super(context, 0, objects);
    }

    @Nullable
    @Override
    public MessageElements getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null)
        {
            row = LayoutInflater.from(getContext()).inflate(R.layout.user_message_row,parent,false);
        }

        MessageElements currrentMessage = getItem(position);

        TextView userName = (TextView) row.findViewById(R.id.usrname);
        userName.setText(currrentMessage.getUserName());

        TextView date = (TextView) row.findViewById(R.id.date);
        date.setText(currrentMessage.getMessageDate());

        TextView time = (TextView) row.findViewById(R.id.time);
        time.setText(currrentMessage.getMessageTime());

        TextView messagePreview = (TextView) row.findViewById(R.id.msgPreview);
        String currentMessagePreview=messagePreviewer(currrentMessage.getMessagePreview());
        messagePreview.setText(currentMessagePreview);
        return row;
    }

    private String messagePreviewer (String message)
    {   String retMessage;
        if (message.length()>45) {
            retMessage = message.substring(0, 45) + "...";
        }
        else
            {
                retMessage= message;
            }

        return retMessage;
    }
}
