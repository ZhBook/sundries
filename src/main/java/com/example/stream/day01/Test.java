package com.example.stream.day01;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("欧阳雪", 18, "中国", 'F'));
        personList.add(new Person("Tom", 24, "美国", 'M'));
        personList.add(new Person("Harley", 22, "英国", 'F'));
        personList.add(new Person("向天笑", 20, "中国", 'M'));
        personList.add(new Person("李康", 22, "中国", 'M'));
        personList.add(new Person("小梅", 20, "中国", 'F'));
        personList.add(new Person("何雪", 21, "中国", 'F'));
        personList.add(new Person("李康", 22, "中国", 'M'));

        personList.isEmpty();

        personList.stream().filter((p)->p.getAge()>18).forEach(System.out::println);

        System.out.println("-------------------------");

        long count = personList.stream().filter((p) -> p.getCountry().equals("中国")).count();
        System.out.println("中国人有："+count);

    }


}
