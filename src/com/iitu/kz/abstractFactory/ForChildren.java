package com.iitu.kz.abstractFactory;

public class ForChildren implements AgeLimitFactory{
    @Override
    public FantasyBook fantasyWithLimitedAge(int id, String name, double cost) {
        return new FantasyBook(id, name, 6, cost);
    }

    @Override
    public HistoricalBook historyWithLimitedAge(int id, String name, double cost) {
        return new HistoricalBook(id, name, 4, cost);
    }

    @Override
    public ComedyBook comedyWithLimitedAge(int id, String name, double cost) {
        return new ComedyBook(id, name, 12, cost);
    }
}
