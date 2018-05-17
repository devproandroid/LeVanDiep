package Bai1;

import java.util.Arrays;

public class Array {
	public static int[] removeElement(int[] array,int removeIndex) {
		int[] newArray=new int[array.length-1];
		for(int i=removeIndex;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		for(int i=0;i<newArray.length;i++) {
			newArray[i]=array[i];
		}
		return newArray;
	}
	public static void main(String[] args) {
		int[] arrayList=new int[]{1,2,3,4,5,6};
		for(int i=0;i<arrayList.length;i++) {
		System.out.println("arrayList["+"i"+"] :"+arrayList[i]);
		}
//for-each
		for(int li:arrayList) {
			System.out.println(li);
			
		}
		//System.out.println(Arrays.toString(removeElement(arrayList, 4)));
		
//làm việc với mảng
//tìm giá trị lớn nhất nhỏ nhất
//sao chép 1 mảng
//chuyển một mảng thành string
//sắp xếp mảng
//điền giá trị cho mảng
//so sánh 2 mảng
	}

}
