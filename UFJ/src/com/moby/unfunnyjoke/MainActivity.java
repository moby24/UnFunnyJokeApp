package com.moby.unfunnyjoke;

import java.io.IOException;

import javax.xml.datatype.Duration;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.AssetManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {
	SoundPool mSoundPool;
	AssetManager assets;
	int sound1,sound2,sound3,sound4,sound5,sound6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
	        
	        assets = getAssets();
	        try {
				sound1 = mSoundPool.load(assets.openFd("green.mp3"), 1);
				sound2 = mSoundPool.load(assets.openFd("Smeh.mp3"), 1);
				sound3 = mSoundPool.load(assets.openFd("sverchek.mp3"), 1);
				sound4 = mSoundPool.load(assets.openFd("neudacha.mp3"), 1);
				sound5 = mSoundPool.load(assets.openFd("Fu.mp3"), 1);
				sound6 = mSoundPool.load(assets.openFd("YAstreb.mp3"), 1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
		menu.add("About");
		menu.add("asdas");
		return super.onCreateOptionsMenu(menu);
	}
	
	

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
//		Toast.makeText(this, "У лукоморья дуб зелёный;\n Златая цепь на дубе том:\nИ днём и ночью кот учёный\n", Toast.LENGTH_LONG).show();
		
		AlertDialog.Builder b =new AlertDialog.Builder(this);
		b.setTitle("О программе");
		b.setMessage("version: 1.0 \nСборник звуков для несмешных\n                   шуток \nАвтор программы -\nТовкес <<moby>> Максим \nmail: moby.89@i.ua");
		b.show();
		return true;
	}

	public void buttonListener(View v){
		
		mSoundPool.play(sound1, 1, 1, 1, 0, 1);
	}
	public void buttonListener2(View v){
		
		mSoundPool.play(sound2, 1, 1, 1, 0, 1);
	}
	public void buttonListener3(View v){
		
		mSoundPool.play(sound3, 1, 1, 1, 0, 1);
	}
	public void buttonListener4(View v){
		
		mSoundPool.play(sound4, 1, 1, 1, 0, 1);
	}
	public void buttonListener5(View v){
		
		mSoundPool.play(sound5, 1, 1, 1, 0, 1);
	}
	public void buttonListener6(View v){
		
		mSoundPool.play(sound6, 1, 1, 1, 0, 1);
	}
	
		
	public void buttonL(View v){
		
	}
}
