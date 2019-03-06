package com.app.nickcore;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Nick on 2019/3/6.
 */
public class NickToastUtil {


    static void showToast(Context context,String content){
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }
}
