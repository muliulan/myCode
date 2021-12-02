package com.muliulan.mll;

import android.content.Intent;

import org.jetbrains.annotations.NotNull;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;

/**
 * 描述:
 * 0 1 2 3 4 5 6 7 8 9
 * 1 1 2 2 3 3 4 4
 * 0 1 1 2 2 1 2 2
 * <p>
 * 2021/3/29
 */

public class Dsssss extends JobIntentService {

	int hammingWeight(int n) {
       int a= 1 | 1 ;		//or
		int i1 = 1 ^ 2;		// xor

		int i = 111 & (1 << 222);
//        val i = 111 and (1 shl 222)
		return 1;
	}


	@Override
	protected void onHandleWork(@NonNull @NotNull Intent intent) {

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {

			}
		});

	}

//	public void testFeature() {
//		//创建Executor- Service，通 过它你可以 向线程池提 交任务
//		ExecutorService executor = Executors.newCachedThreadPool();
//		//向Executor- Service提交一个 Callable对象
//		final Future<Double> futureRate = executor.submit(new Callable<Double>() {
//			@Override
//			public Double call() {
//				//以异步方式在新的线程中执行耗时的操作
//				return 0.0;
//			}
//		});
//		//异步操作进行的同时你可以做其他的事情
//		doSomethingElse();
//
//		try {
//			//获取异步操作的结果，如果最终被阻塞，无法得到结果，那么在最多等待1秒钟之后退出
//			Double result = futureRate.get(1, TimeUnit.SECONDS);
//		} catch (ExecutionException e) {
//			// 计算抛出一个异常
//			e.printStackTrace();
//		} catch (InterruptedException ie) { // 当前线程在等待过程中被中断
//		} catch (TimeoutException te) { // 在Future对象完成之前超过已过期
//		}
//	}




}
