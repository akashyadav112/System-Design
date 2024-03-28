package ObserverPattern.Observables;

import ObserverPattern.Observers.NotificationAlertObserver;

public interface StockObservables {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int stockCount);
    public int getStockCount();
}
