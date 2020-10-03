package com.iitu.kz.abstractFactory;

public class ForAdults implements AgeLimitFactory{

    @Override
    public FantasyBook fantasyWithLimitedAge(int id, String name, double cost) {
        return new FantasyBook(id, name, 16, cost);
    }

    @Override
    public HistoricalBook historyWithLimitedAge(int id, String name, double cost) {
        return new HistoricalBook(id, name, 18, cost);
    }

    @Override
    public ComedyBook comedyWithLimitedAge(int id, String name, double cost) {
        return new ComedyBook(id, name, 18, cost);
    }
}
