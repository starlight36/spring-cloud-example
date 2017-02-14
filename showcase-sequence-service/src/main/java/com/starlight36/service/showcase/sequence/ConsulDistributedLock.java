package com.starlight36.service.showcase.sequence;

import com.ecwid.consul.v1.ConsulClient;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConsulDistributedLock implements Lock {

	private final ConsulClient client;
	private final String name;

	public ConsulDistributedLock(ConsulClient client, String name) {
		this.client = client;
		this.name = name;
	}

	@Override
	public void lock() {

	}

	@Override
	public void lockInterruptibly() throws InterruptedException {

	}

	@Override
	public boolean tryLock() {
		return false;
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		return false;
	}

	@Override
	public void unlock() {

	}

	@Override
	public Condition newCondition() {
		throw new UnsupportedOperationException("Consul lock does not support this operation.");
	}
}
