package com.haoyitec.ido;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/17.
 */
public class RecordDB {
    public List<Record> getRecords() {
        List<Record> records = new ArrayList<>();
        records.add(new Record("001", "2017-10-10", "25:55:41"));
        records.add(new Record("002", "2017-10-11", "25:55:41"));
        records.add(new Record("003", "2017-10-12", "25:55:41"));
        return records;
    }
}
