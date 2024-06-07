package com.example.musicapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicService extends Service {
    MediaPlayer myMusic;
    public MusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myMusic = MediaPlayer.create(MusicService.this, R.raw.music);
        myMusic.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        myMusic.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        myMusic.stop();
    }
}