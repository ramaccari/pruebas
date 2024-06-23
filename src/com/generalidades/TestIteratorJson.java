package com.generalidades;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestIteratorJson {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode nodeRaiz = mapper.readTree(new File("./files/datos.json"));
			Iterator<Entry<String, JsonNode>> it = nodeRaiz.fields();
			while (it.hasNext()) {
				Entry<String, JsonNode> entrada = it.next();
				System.out.println(entrada.getKey() + ": " + entrada.getValue().asText());
			}
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
