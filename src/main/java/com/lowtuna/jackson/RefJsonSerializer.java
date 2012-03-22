package com.lowtuna.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import com.googlecode.objectify.Ref;

public class RefJsonSerializer<T> extends JsonSerializer<Ref<T>> {

	@Override
	public void serialize(Ref<T> value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
		T t = value.getValue();
		if (t != null) {
			jgen.writeObject(t);
		} else {
			jgen.writeString(value.getKey().getString());
		}
		
	}

}
