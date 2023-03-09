package com.diagorn.turingbot.util;

public enum Chapters {
    GEOMETRY_TASKS("geometry"),
    GRAPH_TASKS("graphs"),
    DYNAMIC_PROGRAM_TASKS("dynprog"),
    BEGINNER_TASKS("beginners"),
    STRING_TASKS("string"),
    STRUCTURE_TASKS("structure"),
    PALINDROME_TASKS("palindromes"),
    NUMBER_THEORY_TASKS("numbers"),
    GAME_TASKS("game"),
    UNUSUAL_TASKS("unusual"),
    HARDEST_TASKS("hardest"),
    TRICKY_TASKS("tricky");
    private String name;

    Chapters(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
