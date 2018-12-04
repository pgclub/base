package com.techli.base.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * io操作工具类
 * 
 * @author techli
 * @date 2018年12月4日 下午10:44:05
 */
public class IOUtil {

	/**
	 * 关闭一个或多个io流
	 * 
	 * @author techli
	 * @date 2018年12月4日 下午10:44:00
	 * @param closeables
	 */
	public static void close(Closeable... closeables) {
		if (closeables != null) {
			for (Closeable closeable : closeables) {
				if (closeable != null) {
					try {
						closeable.close();
					} catch (IOException e) {
					}
				}
			}
		}
	}
}
