package com.liu.Factory;

public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> clazz);
}
