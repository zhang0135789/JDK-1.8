package vip.zhang123.lambda;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: zz
 * @Description:
 * @Date: 上午 9:17 2018/9/4 0004
 * @Modified By
 */
public class Demo1 {


    /**
     * for 循环
     */
    @Test
    public void 表达式() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }

        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));


        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);

    }


    /**
     *
     */




}
