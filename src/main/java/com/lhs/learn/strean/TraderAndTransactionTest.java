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

        //找出2011年的所有交易并按交易额排序
        List<Transaction> collect = transactions.stream().filter(d -> d.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
System.out.println(collect);
    }
}
