package com.example.baixiao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by baixiao on 2017/11/3.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
