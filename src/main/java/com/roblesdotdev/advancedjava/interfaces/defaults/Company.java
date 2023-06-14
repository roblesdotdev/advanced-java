package com.roblesdotdev.advancedjava.interfaces.defaults;

public interface Company {
    default String getName() {
        return "defaults.Company";
    }
}
