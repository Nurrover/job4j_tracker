package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vanya");
        student.setSurname("Popov");
        student.setPatronymic("Pavlovich");
        student.setGroup("ИФ21");
        student.setAdmission(new Date());

        System.out.println("Студент " + student.getName() + " " + student.getSurname() + " " + student.getPatronymic()
                            + " поступил в вуз и зачислен в группу " + student.getGroup() + ". Дата и время поступления: "
                            + student.getAdmission());
    }
}
