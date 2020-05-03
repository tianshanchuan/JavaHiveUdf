package com.company.hive.udf;

import com.aliyun.odps.udf.UDF;

import com.aliyun.odps.io.Tuple;
import java.util.ArrayList;
import java.util.Objects;
import com.aliyun.odps.io.Text;

@SuppressWarnings("unchecked")
public final class ArrayFilter extends UDF{

    public ArrayList evaluate(final ArrayList list, String s){
        if(list.isEmpty() == true) {
            return new ArrayList<>();
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i) == s){
                list.remove(i);
            }
        }

//        return new ArrayList();
        return list;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("");
        System.out.println(new ArrayFilter().evaluate(new ArrayList<>(list), ""));
    }
}
