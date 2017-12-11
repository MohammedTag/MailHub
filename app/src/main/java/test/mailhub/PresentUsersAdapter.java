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

import java.util.List;

/**
 * Created by moshw on 12/10/2017.
 */

public class PresentUsersAdapter extends ArrayAdapter<String> {

    public PresentUsersAdapter(@NonNull Context context,  @NonNull List<String> objects) {
        super(context, 0, objects);

    }

    @Nullable
    @Override
    public String getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;

        if (row == null)
        {
            row = LayoutInflater.from(getContext()).inflate(R.layout.present_users_row,parent,false);
        }

        String presentuser = getItem(position);

        TextView username = (TextView) row.findViewById(R.id.prsntUsrNme);
        username.setText(presentuser);

    return row;
    }
}
