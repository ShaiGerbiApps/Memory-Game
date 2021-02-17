package com.shaigerbi.matches;

import android.app.Application;

import com.shaigerbi.matches.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
