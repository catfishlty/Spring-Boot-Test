package top.catfish.test2_shiro;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        double[] doubles = {3,4,6,21,1,23,2};
        System.out.println(maximumOfLastN(doubles,2));
    }
    public static double maximumOfLastN(final double[] doubles,final int n){
        Arrays.sort(doubles);
        return doubles[doubles.length-n];
    }
}
