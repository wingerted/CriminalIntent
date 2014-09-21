package com.wingerted.criminalintent;

import java.util.UUID;

/**
 * Created by Winger on 2014/9/20.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public  Crime() {
        // 生成唯一标识
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
