package com.xiangxun.wane.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.xiangxun.wane.R;
import com.xiangxun.wane.application.XiangXunApplication;

/**
 * @package: com.xiangxun.widget
 * @ClassName: MsgToast.java
 * @Description:自定义全局toast
 * @author: HanGJ
 * @date: 2015-7-16 下午2:35:20
 */
public class MsgToast extends Toast {
	private static MsgToast mMsgToast;
	private TextView mTvMsg;

	public static MsgToast geToast() {
		if (mMsgToast == null) {
			mMsgToast = new MsgToast(XiangXunApplication.getInstance());
		}
		return mMsgToast;
	}

	public MsgToast(Context context) {
		super(context);
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(R.layout.msg_toast, null);
		mTvMsg = (TextView) view.findViewById(R.id.toast_tv_msg);
		setDuration(Toast.LENGTH_SHORT);
		setView(view);
	}

	public void setMsg(String msg) {
		mTvMsg.setText(msg);
		show();
	}

	public void setMsg(int msg) {
		mTvMsg.setText(msg);
		show();
	}

	public void setLongMsg(String msg) {
		setDuration(Toast.LENGTH_LONG);
		mTvMsg.setText(msg);
		show();
	}

	public void setLongMsg(int msg) {
		setDuration(Toast.LENGTH_LONG);
		mTvMsg.setText(msg);
		show();
	}
}
