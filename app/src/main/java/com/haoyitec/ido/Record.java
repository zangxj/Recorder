package com.haoyitec.ido;

/**
 * Created by Administrator on 2017/10/17.
 */
public class Record {

    private String name;
    private String timeday;
    private String timeclock;

    public Record(String timed, String timec, String name) {
        this.timeday = timed;
        this.timeclock = timec;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeday() {
        return timeday;
    }

    public void setTimeday(String timeday) {
        this.timeday = timeday;
    }

    public String getTimeclock() {
        return timeclock;
    }

    public void setTimeclock(String timeclock) {
        this.timeclock = timeclock;
    }
}
