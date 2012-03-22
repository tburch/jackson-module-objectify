package com.lowtuna.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import com.googlecode.objectify.Key;

public class KeyJsonSerializer<T> extends JsonSerializer<Key<T>> {

	@Override
	public void serialize(Key<T> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
		jgen.writeString(value.getString());
	}

}
