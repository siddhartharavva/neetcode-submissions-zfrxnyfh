interface Observer {
    void notify(String itemName);
}

class Customer implements Observer {
    private String name;
    private int notifications;

    public Customer(String name) {
        this.name = name;
        this.notifications = 0;
    }

    public void notify(String itemName) {
        this.notifications += 1;
    }

    public int countNotifications() {
        return this.notifications;
    }
}

class OnlineStoreItem {
    private String itemName;
    private int stock;
    private List<Observer> sub = new ArrayList<>();
    public OnlineStoreItem(String itemName, int stock) {
        this.itemName = itemName;
        this.stock = stock;
    }

    public void subscribe(Observer observer) {
        if(!sub.contains(observer))sub.add(observer);
    }

    public void unsubscribe(Observer observer) {
        sub.remove(observer);
    }

    public void updateStock(int newStock) {
        int old = this.stock;
        this.stock=newStock;
        if(old==0 && this.stock>0){
            for(Observer o : sub){
                o.notify(this.itemName);
            }
        }
    }
}
