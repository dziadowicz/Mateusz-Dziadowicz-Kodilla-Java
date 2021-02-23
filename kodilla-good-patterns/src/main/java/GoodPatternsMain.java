import com.kodilla.good.patterns.challenges.*;

public class GoodPatternsMain {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ProductOrderService productOrderService = new ProductOrderService(new MailInformation(), new BuyNowOrderService(), new BuyNowRepository());
        productOrderService.process(new OrderRequest(orderRequestRetriever.getUser(), orderRequestRetriever.getProduct(), orderRequestRetriever.getQuantity(), orderRequestRetriever.getPayment(), orderRequestRetriever.getDelivery()));
    }
}
