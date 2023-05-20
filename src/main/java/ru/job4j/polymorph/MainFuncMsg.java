package ru.job4j.polymorph;

public class MainFuncMsg {
    public static void main(String[] args) {
        FuncMsg funcMsg = new FuncMsg();
        funcMsg.funcMessage();
        int[] numbers = {2, 3, 4, 5};
        System.out.println(funcMsg.getAverage(numbers));
        System.out.println(funcMsg.getDoubleSum(numbers));
    }
}
