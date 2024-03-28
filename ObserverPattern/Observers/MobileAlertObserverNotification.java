package ObserverPattern.Observers;

import ObserverPattern.Observables.StockObservables;

public class MobileAlertObserverNotification implements NotificationAlertObserver{

    StockObservables stockObservables;
    String mobNo;
    public MobileAlertObserverNotification(StockObservables stockObservables, String mobNo){
        this.stockObservables = stockObservables;
        this.mobNo = mobNo;
    }
    @Override
    public void update() {
        sendMsg(mobNo,"The product is present, you can shop again !!");
    }
    private void sendMsg(String mobNo,String msg){
        System.out.println("msg sent to " + mobNo);
    }
}
