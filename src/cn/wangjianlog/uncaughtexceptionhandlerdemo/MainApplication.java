package cn.wangjianlog.uncaughtexceptionhandlerdemo;

import android.app.Application;

public class MainApplication extends Application{

	@Override
	public void onCreate() {
		super.onCreate();
		CrashHandler handler = CrashHandler.getInstance();
		handler.init(this);
	}

	
}
