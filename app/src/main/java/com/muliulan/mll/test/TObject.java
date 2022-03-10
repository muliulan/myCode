package com.muliulan.mll.test;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: Xiasem
 * Date: 17-2-13
 * Email: xiasem@163.com <br/>
 * Github: https://github.com/Xiasm
 *
 * <p>
 *      TObject,话题对象,可通过继承此对象,做一些逻辑上的处理
 * </p>
 */
public class TObject {

    private String objectRule = "#";// 匹配规则
    private String objectText;// 高亮文本

    public String getObjectRule() {
        return objectRule;
    }

    public void setObjectRule(String objectRule) {
        this.objectRule = objectRule;
    }

    public String getObjectText() {
        return objectText;
    }

    public void setObjectText(String objectText) {
        this.objectText = objectText;
    }


    public static void setEditTextInhibitInputSpeChat(EditText editText){

        InputFilter filter=new InputFilter() {

            @Override

            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

                String speChat="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";

                Pattern pattern = Pattern.compile(speChat);

                Matcher matcher = pattern.matcher(source.toString());

                if(matcher.find())return "";

                else return null;

            }

        };

        editText.setFilters(new InputFilter[]{filter});

    }

}
