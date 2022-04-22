package com.muliulan.mll;

import android.os.Bundle;
import android.util.Base64;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.muliulan.mll.aop.TrackEvent;
import com.muliulan.mll.aop.TrackParameter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : zhaoCS
 * date    : 2022/3/44:24 下午
 * desc    :
 */
public class DADAWD extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aa(22222);
    }

    @TrackEvent(eventName = "aa执行", eventId = "100")
    void aa(@TrackParameter("uid") int uid) {
    }

    @Override
    protected void onStart() {
        super.onStart();
    }


}
