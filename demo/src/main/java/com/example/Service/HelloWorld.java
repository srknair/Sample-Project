package com.example.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class HelloWorld
{

    public static void count(String value){
    Map<Character,Long> count = value.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    Optional nonVRepeatg=value.chars().mapToObj(c->(char)c).filter(c->count.get(c)==1).findFirst();
    System.out.println(nonVRepeatg.get());
}
public static void main(String args[])
{
    HelloWorld.count("throot");
}
}
