package si.fri.rso.samples.orders.lib;

public class ShortOrderDelivery {
    private Long deliveryId;

    private String link;

    public ShortOrderDelivery() {

    }

    public void setDeliveryId(Long newId) {
        this.deliveryId = newId;
    }

    public Long getDeliveryId() {
        return this.deliveryId;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
