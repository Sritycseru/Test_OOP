package OnlineRetailStore;

public class RetailStoreDemo {
    public static void main(String[] args) {
        OnlineRetailStore onlineRetailStore = new ProxyOnlineRetailStore();
        onlineRetailStore.purchase("ProductA",10);
    }
}
