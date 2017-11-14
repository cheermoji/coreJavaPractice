package coreJavaPractice.equalsAndHash;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Moji on 20-Oct-17.
 * mojtaba.nasehzadeh@gmail.com
 */
public class MojiEqualsNoHash {

    public static void main(String[] args) {
        Set<Order> orderSet = new HashSet<>();
        orderSet.add(new Order(1));
        //without overriding hashCode(), this returns false
        System.out.println(orderSet.contains(new Order(1)));

    }
}

class Order {
    private long num;

    public Order(long num) {
        this.num = num;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof Order) {
            if (this.num == ((Order) obj).getNum()) {
                if (this.hashCode() == obj.hashCode()) {
                    return true;
                }
            }
        }
        return false;
    }

/*
    @Override
    public int hashCode() {
        return (int) (num * 99 + Objects.hashCode(this.num));
    }
*/

}
