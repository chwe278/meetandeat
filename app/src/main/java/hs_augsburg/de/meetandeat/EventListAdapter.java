package hs_augsburg.de.meetandeat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class EventListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Event> mEventList;

    public EventListAdapter(Context mContext, List<Event> mEventList) {
        this.mContext = mContext;
        this.mEventList = mEventList;
    }

    @Override
    public int getCount() {
        return mEventList.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
       /* View v = View.inflate(mContext, R.layout.listview_layout, null);
        TextView tvTitle = (TextView)v.findViewById(R.id.tv_title);
        TextView tvDish = (TextView)v.findViewById(R.id.tv_dish);
        TextView tvDate = (TextView)v.findViewById(R.id.tv_date);
        TextView tvPostcode = (TextView)v.findViewById(R.id.tv_postcode);
        TextView tvCity = (TextView)v.findViewById(R.id.tv_city);
        TextView tvPeople = (TextView)v.findViewById(R.id.tv_people);*/
        return null;
    }
}
