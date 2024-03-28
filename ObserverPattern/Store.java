package ObserverPattern;

import ObserverPattern.Observables.IphoneObservablesImpl;
import ObserverPattern.Observables.ShoeObservablesImpl;
import ObserverPattern.Observables.StockObservables;
import ObserverPattern.Observers.EmailAlertObserverNotification;
import ObserverPattern.Observers.MobileAlertObserverNotification;
import ObserverPattern.Observers.NotificationAlertObserver;

public class Store {
    public static void main(String[] args){
        /** Case 1: Notifying for Iphone **/
        // observable kon hai
        StockObservables iphoneObservables = new IphoneObservablesImpl();

        // observer kon kon hai
        NotificationAlertObserver  observer1 = new EmailAlertObserverNotification(iphoneObservables,"akash@gmail.com");
        NotificationAlertObserver  observer2 = new EmailAlertObserverNotification(iphoneObservables,"abhi@gmail.com");
        NotificationAlertObserver  observer3 = new MobileAlertObserverNotification(iphoneObservables,"9977669944");

        // add karo observers ko for observables, so they can be notified
        iphoneObservables.add(observer1);
        iphoneObservables.add(observer2);
        iphoneObservables.add(observer3);

        // new stock came, now they will be notified.
        iphoneObservables.setStockCount(10);

        /** Case 2: Notifying for shoe **/
        // adding one more observa  ble shoe
        StockObservables shoeObservables = new ShoeObservablesImpl();

        // creating its observables
        NotificationAlertObserver shoeObserver1 = new MobileAlertObserverNotification(shoeObservables,"1324354u6");
        NotificationAlertObserver  shoeObserver2 = new EmailAlertObserverNotification(shoeObservables,"akash@gmail.com");

        // adding those observers to observables whom we need to send notification
        shoeObservables.add(shoeObserver1);
        shoeObservables.add(shoeObserver2);

        // stock added so they will be notified
        shoeObservables.setStockCount(10);

            /* EmailAlert and MobileAlert have same code
        & iPhone, Shoe have same code, we can have common classes for them
         as per solid principles
            */
    }
}
