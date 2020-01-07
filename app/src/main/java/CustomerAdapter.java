import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.week1.R;

public class CustomerAdapter extends BaseAdapter {
    Context mContext;
    String[] strName;
    public CustomerAdapter(Context context, String[] strName) {
        mContext = context;
        this.strName = strName;
    }
    @Override
    public int getCount() {
        return strName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater)mContext.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        if(view == null)
            view = mInflater.inflate(R.layout.activity_listview_row, parent, false);
        TextView textView = (TextView)view.findViewById(R.id.textView5);
        textView.setText(strName[position]);
        return view;
    }
}
