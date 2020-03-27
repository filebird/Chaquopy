package com.xiangxun.wane.utils;

import android.os.Environment;

import com.xiangxun.wane.widget.MsgToast;
import java.io.File;
import java.io.FileOutputStream;

public class Utils {
	public static void SaveTestdata(String data) {
		try {
			File file = new File(Environment.getExternalStorageDirectory(),	"test.txt");
			FileOutputStream fos = new FileOutputStream(file, true);
			String info = data + "\n";
			fos.write(info.getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void delTestData() {
		try {
			File file = new File(Environment.getExternalStorageDirectory(),	"test.txt");
			if (file.exists()) {
				file.delete();
				file = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
