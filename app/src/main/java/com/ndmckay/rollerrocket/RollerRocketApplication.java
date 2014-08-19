package com.ndmckay.rollerrocket;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Nicholas on 19/08/2014.
 */
public class RollerRocketApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "ciabvioA5rg3JHJywgzBL1NBHcg3qJIBUxZyrWG9", "aqVRqI7BXIxVWIKrbOsXXErgJeKoqwa8vqmZLdrt");

        //ParseObject testObject = new ParseObject("TestObject");
        //testObject.put("foo", "bar");
        //testObject.saveInBackground();
    }
}
