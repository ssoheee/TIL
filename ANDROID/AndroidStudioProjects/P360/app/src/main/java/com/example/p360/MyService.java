package com.example.p360;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    int a=0;
    int b=0;

    class MyBinder extends Binder{
        // 이걸 통해서 액티비티가 서비스에 접근한다.
        public MyService getService(){
            return MyService.this;
        }
     }

    IBinder ib = new MyBinder();

    @Override
    public IBinder onBind(Intent intent) {
        return ib;
    }

    public void bt1(){
        Log.d("[MS]", "~~~~~BT1~~~~~");
        final Intent sendintent = new Intent(getApplicationContext(),MainActivity.class);
        sendintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        Runnable run = new Runnable() {
            boolean flag = true;

            @Override
            public void run() {
                for(a=0; a<=10; a++){
                    Log.d("[My Service]", "~~~~~while~~~~~");
                    sendintent.putExtra("cmd",a);
                    sendintent.putExtra("cmd2",b);
                    startActivity(sendintent);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t = new Thread(run);
        t.start();
    }

    public void bt2(){
        Log.d("[MS]", "~~~~~BT2~~~~~");
        final Intent sendintent = new Intent(getApplicationContext(),MainActivity.class);
        sendintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        Runnable run = new Runnable() {
            boolean flag = true;

            @Override
            public void run() {
                for(b=0; b<=10; b++){
                    Log.d("[My Service]", "~~~~~while~~~~~");
                    sendintent.putExtra("cmd",a);
                    sendintent.putExtra("cmd2",b);
                    startActivity(sendintent);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t = new Thread(run);
        t.start();
    }
}
