package com.example.dell.myapplication;

import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: Main3Activityxc.java
 * @Package com.example.dell.myapplication
 * @Description: todo
 * @author: YFL
 * @date: 2018/6/12 22:06
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018/6/12 星期二
 * 注意：本内容仅限于学川教育有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
interface Main3Activityxc extends ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator, add {
    void onCreate(Bundle savedInstanceState);

    void  addup();
}
