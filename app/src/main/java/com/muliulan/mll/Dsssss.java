package com.muliulan.mll;

import android.app.Activity;

import com.muliulan.mll.offer.ListNode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 描述:
 * 0 1 2 3 4 5 6 7 8 9
 * 1 1 2 2 3 3 4 4
 * 0 1 1 2 2 1 2 2
 * <p>
 * 2021/3/29
 */

public class Dsssss extends Activity {


	static void dd(){
		HashMap<String, String> stringStringHashMap = new HashMap<>();
		stringStringHashMap.put(null,null);
	}

	int hammingWeight(int n) {

		int a = 0;
		for (int sum = 1; sum <= 22; sum <<= 1) {
			a = (a + a) % a;
		}


		int i = 111 & (1 << 222);
//        val i = 111 and (1 shl 222)
		return 1;
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


		ArrayList<Integer> integers1 = new ArrayList<>();
		ArrayList<Integer> integers2 = new ArrayList<>();

		ListNode hA = headA;
		while (hA.getNext() != null) {
			int val = hA.getVal();
			integers1.add(val);
			hA = hA.getNext();
		}

		ListNode hB = headB;
		while (hB.getNext() != null) {
			int val = hB.getVal();
			integers2.add(val);
			hB = hB.getNext();
		}


		int i = integers1.size() > integers2.size() ? integers2.size() : integers1.size();

		int num=-999;
		for (int a = 0; a < i; a++) {
			int aa = integers1.get(integers1.size() - 1 - a);
			int bb = integers2.get(integers2.size() - 1 - a);
			if(aa!=bb){
				num=integers1.get(integers1.size() - 2 - a);
			}

		}
		hA = headA;
		while (hA.getNext() != null) {
			int val = hA.getVal();
 			if(val==num){
 				return hA;
			}
 			hA=hA.getNext();
		}
		return null;
	}
}
