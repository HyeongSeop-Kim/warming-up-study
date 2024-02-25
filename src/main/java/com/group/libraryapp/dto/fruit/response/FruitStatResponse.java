package com.group.libraryapp.dto.fruit.response;

import com.group.libraryapp.dto.fruit.model.FruitStat;

public class FruitStatResponse {
    private long salesAmount;
    private long notSalesAmount;

    public void setStat(FruitStat stat) {
        if (stat.getSoldYn().equals("Y")) {
            this.salesAmount = stat.getAmount();
        } else {
            this.notSalesAmount = stat.getAmount();
        }
    }

    public long getSalesAmount() {
        return salesAmount;
    }

    public long getNotSalesAmount() {
        return notSalesAmount;
    }
}
