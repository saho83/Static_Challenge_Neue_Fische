package org.example;

public class UebungStatic {

    static int totalCount = 0;
    int instanceCount = 0;


    //Getter / Setter
    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        UebungStatic.totalCount = totalCount;
    }


    //method
    public static void incrementTotalCount() {
        totalCount++;
    }

    //toString
    @Override
    public String toString() {
        return "UebungStatic{" +
                "instanceCount=" + instanceCount +
                " totalCount=" + totalCount +
                '}';
    }







}
