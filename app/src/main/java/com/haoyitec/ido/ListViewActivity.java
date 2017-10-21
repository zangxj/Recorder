package com.haoyitec.ido;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/10/17.
 */
public class ListViewActivity extends Activity {

    private ListView listView;
    private RecordDB recordDB = new RecordDB();
    private RecordListAdapter recordListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_soundfiles);
        listView = (ListView) findViewById(R.id.listview);
        show();
    }

    public void show() {

        List<Record> records = recordDB.getRecords();


        List<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();
        for (Record record : records) {
            HashMap<String, Object> item = new HashMap<String, Object>();
            item.put("name", record.getName());

            item.put("timeday", record.getTimeday());
            item.put("timeclock", record.getTimeclock());
            data.add(item);
        }

       /* SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.item_listview,
                new String[]{"name", "timeday", "timeclock"}, new int[]{R.id.name, R.id.time_day, R.id.time_clock});
        listView.setAdapter(adapter);*/

        recordListAdapter = new RecordListAdapter(this, records);
        listView.setAdapter(recordListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this, "Click item" + i, Toast.LENGTH_SHORT).show();
            }
        });

    }


}
