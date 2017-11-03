package com.example.baixiao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by baixiao on 2017/11/3.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
