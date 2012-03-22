package com.lowtuna.jackson;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
import com.googlecode.objectify.impl.ref.StdRef;

public class ObjectifyModule extends SimpleModule {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ObjectifyModule() {
		super("ObjectifyModule", new Version(1, 0, 0, null));
		addSerializer(StdRef.class, new RefJsonSerializer());
		addSerializer(Ref.class, new RefJsonSerializer());
		addSerializer(Key.class, new KeyJsonSerializer());
	}

}
