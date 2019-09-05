package com.example.p353;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    boolean flag = false;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("[My Service]", "OnCreate");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // 액티비티가 서비스를 호출할 때 onCreate가 호출된 뒤 호출된다.
        Log.d("[My Service]", "OnStart");
        final Intent sendintent = new Intent(getApplicationContext(),MainActivity.class);
        sendintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        Runnable run = new Runnable() {
            boolean flag = true;

            @Override
            public void run() {
                for(int i=0; i<=30; i++){
                    Log.d("[My Service]", "~~~~~while~~~~~");
                    sendintent.putExtra("cmd",i);
                    startActivity(sendintent);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(flag==false){
                        break;
                    }
                }
            }
        };

        Thread t = new Thread(run);
        t.start();


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("[My Service]", "Destroyed");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
