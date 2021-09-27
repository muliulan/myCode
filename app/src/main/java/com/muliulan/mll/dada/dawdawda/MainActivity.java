//package com.muliulan.mll.dada.dawdawda;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//
//import com.muliulan.mll.R;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity extends AppCompatActivity {
//
//    private static final String TAG = "MainActivity";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        InjectUtils.injectEvent(this);
//    }
//
//    @OnClick({R.id.btn1, R.id.btn2})
//    public void click(View view) {
//        switch (view.getId()) {
//            case R.id.btn1:
//                Log.i(TAG, "click: 按钮1");
//                break;
//            case R.id.btn2:
//                Log.i(TAG, "click: 按钮2");
//                break;
//        }
//    }
//
//
//    @OnLongClick({R.id.btn1, R.id.btn2})
//    public boolean longClick(View view) {
//        switch (view.getId()) {
//            case R.id.btn1:
//                Log.i(TAG, "longClick: 按钮1");
//                break;
//            case R.id.btn2:
//                Log.i(TAG, "longClick: 按钮2");
//                break;
//        }
//        return false;
//    }
//}
