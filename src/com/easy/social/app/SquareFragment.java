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
 * �㳡����
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
		data.add(new ImageInfo("����Ʊ", R.drawable.tool_box_ticket));
		data.add(new ImageInfo("ϵͳ���", R.drawable.tool_box_system_exam));
		data.add(new ImageInfo("���ٲ���", R.drawable.tool_box_quickdial));
		data.add(new ImageInfo("��������", R.drawable.tool_box_network));
		data.add(new ImageInfo("�������", R.drawable.tool_box_feescan));
		data.add(new ImageInfo("����", R.drawable.tool_box_baohe));
		data.add(new ImageInfo("���ż��", R.drawable.smsunread));
		data.add(new ImageInfo("���ü��",
				R.drawable.tabicon_black_white_list_normal));
		data.add(new ImageInfo("ͨ�����", R.drawable.tabicon_call_record_normal));
		data.add(new ImageInfo("��Ϣ����", R.drawable.tabicon_sms_record_normal));
		data.add(new ImageInfo("����������", R.drawable.title_bar_set_logout));
		data.add(new ImageInfo("��ͨ����", R.drawable.traffic_list_unchecked));
		data.add(new ImageInfo("�ڴ���", R.drawable.traffic_main_unchecked));
		data.add(new ImageInfo("����ǽ", R.drawable.traffic_main_unchecked));
		data.add(new ImageInfo("��ͨ����", R.drawable.traffic_list_unchecked));
		data.add(new ImageInfo("�ڴ���", R.drawable.traffic_main_unchecked));
		data.add(new ImageInfo("����ǽ", R.drawable.traffic_main_unchecked));
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
