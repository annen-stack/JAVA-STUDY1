package day08String类;

import java.util.Arrays;

/*
 * java.util.Arrays 此类包含用来操作数组的各种方法，比如排序和搜索等。其所有方法均为静态方法，调用起来
非常简单。

 */
public class demo09 {
	public static void main(String[] args) {
		// 定义int 数组
		int[] arr = {2,34,35,4,657,8,69,9};
		// 打印数组,输出地址值
		System.out.println(arr); // [I@2ac1fdc4
		// 数组内容转为字符串
		String s = Arrays.toString(arr);
		// 打印字符串,输出内容
		System.out.println(s); // [2, 34, 35, 4, 657, 8, 69, 9]
		}

}
