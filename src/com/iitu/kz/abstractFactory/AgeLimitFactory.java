package com.iitu.kz.abstractFactory;

public interface AgeLimitFactory {
    FantasyBook fantasyWithLimitedAge(int id, String name, double cost);
    HistoricalBook historyWithLimitedAge(int id, String name, double cost);
    ComedyBook comedyWithLimitedAge(int id, String name, double cost);
}
