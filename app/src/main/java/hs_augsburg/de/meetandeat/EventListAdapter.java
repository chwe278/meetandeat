package hs_augsburg.de.meetandeat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class EventListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Cook> mCookList;

    public EventListAdapter(Context mContext, List<Cook> mEventList) {
        this.mContext = mContext;
        this.mCookList = mCookList;
    }

    @Override
    public int getCount() {
        return mCookList.size();
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
        View v = View.inflate(mContext, R.layout.listview_layout, null);
        TextView tvTitle = (TextView)v.findViewById(R.id.tv_title);
        TextView tvDish = (TextView)v.findViewById(R.id.tv_dish);
        TextView tvDate = (TextView)v.findViewById(R.id.tv_date);
        TextView tvPostcode = (TextView)v.findViewById(R.id.tv_postcode);
        TextView tvCity = (TextView)v.findViewById(R.id.tv_city);
        TextView tvPeople = (TextView)v.findViewById(R.id.tv_people);

        tvTitle.setText(mCookList.get(position).getTitle());
        tvDish.setText(mCookList.get(position).getDish());
        tvDate.setText(mCookList.get(position).getDate());
        tvPostcode.setText(mCookList.get(position).getPostcode());
        tvCity.setText(mCookList.get(position).getCity());
        tvPeople.setText(mCookList.get(position).getPpl_amount());

        v.setTag(mCookList.get(position).getDish());

        return v;
    }
}
