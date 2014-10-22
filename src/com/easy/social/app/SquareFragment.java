package com.easy.social.app;


import java.util.ArrayList;

import com.easy.social.util.MyPagerAdapter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * 广场界面
 * @author Luo
 *
 */
public class SquareFragment extends Fragment {
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		initData();
		ViewPager vpager = (ViewPager)getActivity().findViewById(R.id.vPager);
		vpager.setAdapter(new MyPagerAdapter(getActivity(), data));
		vpager.setPageMargin(50);
		super.onActivityCreated(savedInstanceState);
	}

	ArrayList<ImageInfo> data;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_square, container);
	}
	
	private void initData() {
		data = new ArrayList<ImageInfo>();
		data.add(new ImageInfo("抢火车票", R.drawable.tool_box_ticket));
		data.add(new ImageInfo("系统体检", R.drawable.tool_box_system_exam));
		data.add(new ImageInfo("快速拨号", R.drawable.tool_box_quickdial));
		data.add(new ImageInfo("网络设置", R.drawable.tool_box_network));
		data.add(new ImageInfo("流量监控", R.drawable.tool_box_feescan));
		data.add(new ImageInfo("宝盒", R.drawable.tool_box_baohe));
		data.add(new ImageInfo("短信监控", R.drawable.smsunread));
		data.add(new ImageInfo("设置监控",
				R.drawable.tabicon_black_white_list_normal));
		data.add(new ImageInfo("通话监控", R.drawable.tabicon_call_record_normal));
		data.add(new ImageInfo("信息设置", R.drawable.tabicon_sms_record_normal));
		data.add(new ImageInfo("恶意广告拦截", R.drawable.title_bar_set_logout));
		data.add(new ImageInfo("交通趋势", R.drawable.traffic_list_unchecked));
		data.add(new ImageInfo("内存监控", R.drawable.traffic_main_unchecked));
		data.add(new ImageInfo("防火墙", R.drawable.traffic_main_unchecked));
		data.add(new ImageInfo("交通趋势", R.drawable.traffic_list_unchecked));
		data.add(new ImageInfo("内存监控", R.drawable.traffic_main_unchecked));
		data.add(new ImageInfo("防火墙", R.drawable.traffic_main_unchecked));
	}
	
	public class ImageInfo {
		public String imageMsg;
		public int imageId;

		public ImageInfo(String msg, int id) {
			imageId = id;
			imageMsg = msg;
		}
	}
}
