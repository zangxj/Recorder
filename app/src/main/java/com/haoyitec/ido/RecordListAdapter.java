package com.haoyitec.ido;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/10/19.
 */

public class RecordListAdapter extends BaseAdapter {
    private Context context = null;
    private List<Record> list = null;

    public RecordListAdapter(Context context, List<Record> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder item = null;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_listview, null);
            item = new ViewHolder();
            item.name = (TextView) convertView.findViewById(R.id.name);
            item.timeday = (TextView) convertView.findViewById(R.id.time_day);
            item.timeclock = (TextView) convertView.findViewById(R.id.time_clock);
            convertView.setTag(item);
        } else {
            item = (ViewHolder) convertView.getTag();

        }
        item.name.setText(list.get(position).getName());
        item.timeday.setText(list.get(position).getTimeday());
        item.timeclock.setText(list.get(position).getTimeclock());
        item.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("---->", "你点击了按钮：" + getItemId(position));
            }
        });
        return convertView;
    }

    public class ViewHolder {

        public TextView name;
        public TextView timeday;
        public TextView timeclock;

    }
}
