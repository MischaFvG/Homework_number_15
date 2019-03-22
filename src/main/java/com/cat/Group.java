package com.cat;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<User> users = new ArrayList<User>();

    public Group() {
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }
}
