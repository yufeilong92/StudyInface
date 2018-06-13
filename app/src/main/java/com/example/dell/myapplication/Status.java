package com.example.dell.myapplication;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: Status.java
 * @Package com.example.dell.myapplication
 * @Description: todo
 * @author: YFL
 * @date: 2018/6/4 22:58
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018/6/4 星期一
 * 注意：本内容仅限于学川教育有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public enum Status {
    CASUE {
        public void process() {
            Log.d("==","CASUE");
        }
    },
    DOWN {
        public void process() {
            Log.d("==","DOWN");
        }
    },
    UPDATE {
        public void process() {
            Log.d("==","UPDATE");
        }
    };

    public static void swt(Status status) {
        status.process();
    }

    public abstract void process();

}