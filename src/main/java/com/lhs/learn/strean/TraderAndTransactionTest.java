package com.lhs.learn.strean;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by longhuasshen on 17/3/6.
 */
public class TraderAndTransactionTest {


    public static void main(String[] args) {
            Trader raoul = new Trader("Raoul", "Cambridge");
            Trader mario = new Trader("mario", "Milan");
            Trader alan = new Trader("Alan", "Cambridge");
            Trader brian = new Trader("Brain", "Cambridge");

        List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        //1.找出2011年的所有交易并按交易额排序
        List<Transaction> collect = transactions.stream().filter(d -> d.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
System.out.println(collect);

        //2.交易员都在哪些不同的城市待过
        List<String> cities = transactions.stream().map(d -> d.getTrader().getCity()).distinct().collect(Collectors.toList());
System.out.println(cities);

        //3.查找出所有来自剑桥的交易员，并按姓名排序
        List<Trader> traderList = transactions.stream().map(d -> d.getTrader()).distinct().filter(d -> d.getCity() == "Cambridge").sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
System.out.println(traderList);

        //4.返回所有交易员的姓名字符串，按字母排序
        String nameReduce = transactions.stream().map(d -> d.getTrader().getName()).distinct().sorted().reduce("", (n1, n2) -> n1 + n2);
System.out.println(nameReduce);

        //5.有没有交易员是在米兰工作的
        boolean milan = transactions.stream().anyMatch(d -> d.getTrader().getCity().equals("Milan"));
System.out.println(milan);
    }
}
