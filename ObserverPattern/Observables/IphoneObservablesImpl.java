package ObserverPattern.Observables;

import ObserverPattern.Observers.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservablesImpl implements StockObservables{

    List<NotificationAlertObserver> Observerlist = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        Observerlist.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        Observerlist.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notifyObserver : Observerlist){
            notifyObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStocks) {
        stockCount += newStocks;
        if(stockCount>0){
            notifySubscribers();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
