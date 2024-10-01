package Bridge;

interface NotificationChannel {
    void sendNotification(String message);
}

class SMSChannel implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class EmailChannel implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

abstract class Notification {
    protected NotificationChannel channel;

    protected Notification(NotificationChannel channel) {
        this.channel = channel;
    }

    public abstract void notifyUser(String message);
}

class PromotionalNotification extends Notification {
    public PromotionalNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyUser(String message) {
        channel.sendNotification("Promotional: " + message);
    }
}

class TransactionalNotification extends Notification {
    public TransactionalNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyUser(String message) {
        channel.sendNotification("Transactional: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationChannel smsChannel = new SMSChannel();
        Notification promotionalSMS = new PromotionalNotification(smsChannel);
        promotionalSMS.notifyUser("Get 50% off on your next purchase!");

        NotificationChannel emailChannel = new EmailChannel();
        Notification transactionalEmail = new TransactionalNotification(emailChannel);
        transactionalEmail.notifyUser("Your order has been shipped!");
    }
}

