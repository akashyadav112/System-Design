package ObserverPattern.Observers;

import ObserverPattern.Observables.StockObservables;

public class EmailAlertObserverNotification implements NotificationAlertObserver{
    StockObservables stockObservables;
    String emailId;
    public EmailAlertObserverNotification(StockObservables stockObservables, String emailId){
        this.stockObservables = stockObservables;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendEmails(emailId,"The product is present, you can shop again !!");
    }
    private void sendEmails(String emailId,String msg){
        System.out.println("mail sent to " + emailId);
    }
}
