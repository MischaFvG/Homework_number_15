package com.cat;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("group.xml");
        String xmlString = FileUtils.readFileToString(file, "UTF-8");
        XmlMapper xmlMapper = new XmlMapper();
        Group group = xmlMapper.readValue(xmlString, Group.class);
        Gson gson = new Gson();
        String json = gson.toJson(group);
        System.out.println(json);
        FileUtils.writeStringToFile(new File("json1.txt"), json, "UTF-8");
    }
}
