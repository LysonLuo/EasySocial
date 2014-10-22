package com.easy.social.app;


import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabHost;

/**
 * 主界面
 * 
 * @author Luo
 *
 */
public class MainActivity extends Activity implements OnCheckedChangeListener {
	// 声明控件
	private RadioGroup rgSocial;
	private TabHost mtabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rgSocial = (RadioGroup) findViewById(R.id.rg_Social);
		mtabHost = (TabHost) findViewById(android.R.id.tabhost);
		
		rgSocial.setOnCheckedChangeListener(this);
		mtabHost.setup();
		
		setNavigationBar();
	}

	private void setNavigationBar() {
		//创建Tab对象
		TabSpec tab_square = mtabHost.newTabSpec("SQUARE");
		TabSpec tab_forum = mtabHost.newTabSpec("FORUM");
		TabSpec tab_chat = mtabHost.newTabSpec("CHAT");
        //给Tab对象指定标记以及绑定内容
		tab_square.setIndicator("SQUARE").setContent(R.id.fragment_square);
		tab_forum.setIndicator("FORUM").setContent(R.id.fragment_forum);
		tab_chat.setIndicator("CHAT").setContent(R.id.fragment_chat);
        //把Tab对象添加到mtabHost中
		mtabHost.addTab(tab_square);
		mtabHost.addTab(tab_forum);
		mtabHost.addTab(tab_chat);
		
	}
	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.rb_square:
			mtabHost.setCurrentTabByTag("SQUARE");
			break;
		case R.id.rb_forum:
			mtabHost.setCurrentTabByTag("FORUM");
			break;
		case R.id.rb_chat:
			mtabHost.setCurrentTabByTag("CHAT");
			break;
		}
	}

}
